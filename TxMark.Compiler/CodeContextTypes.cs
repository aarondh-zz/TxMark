using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Compiler
{
    public enum CodeContextTypes
    {
        Argument,
        Attribute,
        BinaryExpression,
        Block,
        Document,
        Each,
        Else,
        ElseIf,
        Expression,
        Hook,
        If,
        Method,
        MethodCall,
        ParenthesizedExpression,
        Set,
        TagOpen,
        TagClose
    }
}
