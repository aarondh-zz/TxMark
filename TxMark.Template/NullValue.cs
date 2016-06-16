using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Template
{
    public class NullValue : IRawValue
    {
        public static readonly NullValue Instance = new NullValue();
        public override string ToString()
        {
            return "";
        }
    }
}
