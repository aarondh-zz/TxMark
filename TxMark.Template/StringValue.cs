﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Template
{
    public class StringValue : IStringValue
    {
        public string Value { get; private set; }

        public int Length
        {
            get
            {
                if ( Value == null)
                {
                    return 0;
                }
                else
                {
                    return Value.Length;
                }
            }
        }

        public StringValue(string value)
        {
            this.Value = value;
        }


        public override string ToString()
        {
            return this.Value;
        }
    }
}
