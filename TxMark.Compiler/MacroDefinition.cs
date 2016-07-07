/*
 *  TxMark 1.0.0.alpha-5-g61bda79
 *
 *  Copyright (c) 2016 Aaron G. Daisley-Harrison
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
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
