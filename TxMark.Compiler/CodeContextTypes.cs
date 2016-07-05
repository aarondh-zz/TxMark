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
        Choose,
        Document,
        Each,
        Else,
        ElseIf,
        Expression,
        Hook,
        HookDefinition,
        If,
        IndexExpression,
        Method,
        MethodCall,
        OfExpression,
        Otherwise,
        ParenthesizedExpression,
        Set,
        SignedExpression,
        TagOpen,
        TagClose,
        When
    }
}
