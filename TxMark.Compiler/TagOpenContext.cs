using Microsoft.CodeAnalysis.CSharp;
using Microsoft.CodeAnalysis.CSharp.Syntax;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using SF = Microsoft.CodeAnalysis.CSharp.SyntaxFactory;

namespace TxMark.Compiler
{
    public class TagOpenContext : BlockContext, IHtmlTagContext
    {
        private string _tagName;
        private bool _isClosing;
        private ContentContextExitHandler<StatementSyntax> _exitHandler;
        private class Attribute
        {
            public string Name;
            public ExpressionSyntax Expression;
        }
        private List<Attribute> _attributes = new List<Attribute>();

        public HtmlTagTypes TagType
        {
            get
            {
                return _isClosing ? HtmlTagTypes.SelfClosing : HtmlTagTypes.Open;
            }
        }

        public string TagName
        {
            get
            {
                return _tagName;
            }
        }

        public TagOpenContext(string tagName, Bag<string> attributes, ContentContextExitHandler<StatementSyntax> exitHandler, bool isClosing)
            :base(null)
        {
            _tagName = tagName;
            _exitHandler = exitHandler;
            _isClosing = isClosing;
            if (attributes != null)
            {
                foreach (var attribute in attributes)
                {
                    var context = new ExpressionContext((expression) =>
                    {
                        _attributes.Add(new Attribute() { Name = attribute.Key, Expression = expression });
                    });
                    if ( attribute.Value!=null)
                    {
                        context.Text(attribute.Value.ToString());
                    }
                    context.Exit();
                }
            }
        }
        private ExpressionSyntax MakeAttributesExpression()
        {
            if ( _attributes.Count > 0 )
            {
                this.Context.AddNamespaceFor(typeof(Dictionary<string, object>));
                List<ExpressionSyntax> attributes = new List<ExpressionSyntax>();
                foreach (var attribute in _attributes)
                {
                    attributes.Add(SF.LiteralExpression(SyntaxKind.StringLiteralExpression, SF.Literal(attribute.Name)));
                   
                    attributes.Add(attribute.Expression);
                }
                return SF.ImplicitArrayCreationExpression(SF.InitializerExpression(SyntaxKind.ComplexElementInitializerExpression,
                        SF.SeparatedList<ExpressionSyntax>(attributes)
                    ));
                    
            }
            else
            {
                return SF.LiteralExpression(SyntaxKind.NullLiteralExpression);
            }
        }
        public override void Exit()
        {
            FlushTextBuffer();
            bool hasContent = this.Block.ChildNodes().Any();
            var tagNameExpression = SF.LiteralExpression(SyntaxKind.StringLiteralExpression, SF.Literal(_tagName));
            var isClosingExpression = SF.LiteralExpression(_isClosing? SyntaxKind.FalseLiteralExpression : SyntaxKind.TrueLiteralExpression);
            var attributesExpression = MakeAttributesExpression();
            StatementSyntax tagStatement;
            if ( _isClosing )
            {
                tagStatement = BlockContext.MakeStateMethodCallStatement("WriteOpenTag", tagNameExpression, isClosingExpression, attributesExpression);
            }
            else if (hasContent)
            {
                Add(BlockContext.MakeStateMethodCallStatement("WriteCloseTag", tagNameExpression));
                tagStatement = SF.IfStatement(
                    BlockContext.MakeStateMethodCallExpression("WriteOpenTag", tagNameExpression, isClosingExpression, attributesExpression),
                    base.Block);
            }
            else
            {
                tagStatement = SF.IfStatement(
                    BlockContext.MakeStateMethodCallExpression("WriteOpenTag", tagNameExpression, isClosingExpression, attributesExpression),
                    BlockContext.MakeStateMethodCallStatement("WriteCloseTag", tagNameExpression)
                );
            }
            _exitHandler(tagStatement);
        }
        public override ICodeContext CreateContext(CodeContextTypes contextType, string name, Bag<string> attributes = null)
        {
            switch( contextType )
            {
                case CodeContextTypes.Attribute:
                    return new AttributeContext(name,(expression) =>
                    {
                        _attributes.Add(new Attribute() { Name = name, Expression = expression });
                    });
            }
            return base.CreateContext(contextType, name, attributes);
        }
    }
}
