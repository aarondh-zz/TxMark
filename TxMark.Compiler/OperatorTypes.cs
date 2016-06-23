using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Compiler
{
    public enum OperatorTypes
    {
        Noop,
        UnaryMinus,
        Parenthesis,
        Add,
        And,
        Subtract,
        Multiply,
        Divide,
        Modulo,
        Or,
        GreaterThan,
        LessThan,
        LessOrEqual,
        GreaterOrEqual,
        Is,
        IsNot,
        Index,
        Power,
    }
}
