using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Compiler
{
    public class MacroDefinition
    {
        private List<string> _aliases;
        public string Name { get; set; }
        public string[] Aliases
        {
            get
            {
                if (_aliases == null)
                {
                    return new string[] { };
                }
                else
                {
                    return _aliases.ToArray();
                }
            }
        }
        public void AddAlias(string alias)
        {
            if (alias != null)
            {
                if (_aliases == null)
                {
                    _aliases = new List<string>();
                }
                _aliases.Add(alias);
            }
        }
        public int MinArguments { get; set; }
        public int MaxArguments { get; set; }
        public string BranchOf { get; set; }
        public bool RequiresHook { get; set; }
        public bool RequiresState { get; set; }
        public bool Defined { get; set; }
    }
}
