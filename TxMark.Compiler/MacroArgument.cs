using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Compiler
{
    [AttributeUsage(AttributeTargets.Method)]
    public class MacroAttribute : Attribute
    {
        public string Alias
        {
            get; set;
        }
        public string BranchOf
        {
            get; set;
        }
        public bool RequiresHook
        {
            get; set;
        }
        public bool RequiresState
        {
            get; set;
        }
        public MacroAttribute(string alias = null)
        {
            this.Alias = alias;
        }
    }
}
