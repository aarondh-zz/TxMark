using Microsoft.CodeAnalysis;
using Microsoft.CodeAnalysis.CSharp.Syntax;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using SF = Microsoft.CodeAnalysis.CSharp.SyntaxFactory;

namespace TxMark.Compiler
{
    public static class ICompileContextExtentions
    {
        public static SyntaxTriviaList MakeLinePragma(this ICompileContext context)
        {
            return SF.TriviaList(SF.Trivia(SF.LineDirectiveTrivia(SF.Literal(context.Location.Line), SF.Literal(context.Location.File??"in-memory"), true)), SF.LineFeed);
        }
    }
}
