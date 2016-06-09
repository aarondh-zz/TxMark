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
    public class TagCloseContext : CodeContextBase, IHtmlTagContext
    {
        private string _tagName;
        private ContentContextExitHandler<StatementSyntax> _exitHandler;

        public HtmlTagTypes TagType
        {
            get
            {
                return HtmlTagTypes.Close;
            }
        }

        public string TagName
        {
            get
            {
                return _tagName;
            }
        }

        public TagCloseContext(string tagName, Bag<string> attributes, ContentContextExitHandler<StatementSyntax> exitHandler)
        {
            _tagName = tagName;
            _exitHandler = exitHandler;
        }
        public override void Exit()
        {
        }
    }
}
