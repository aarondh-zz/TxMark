using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Template
{
    public class RawValue : IRawValue
    {
        private string _value;
        public RawValue(string value)
        {
            _value = value;
        }

        public int Length
        {
            get
            {
                if (_value == null)
                {
                    return 0;
                }
                else
                {
                    return _value.Length;
                }
            }
        }

        public override string ToString()
        {
            return _value;
        }
    }
}
