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
    public class NameTagManager
    {
        private Dictionary<string, List<object>> _hookReferencesByTagName = new Dictionary<string, List<object>>();
        private Dictionary<object, string> _hookMethodNameByReference = new Dictionary<object, string>();
        public void AddNameTag(object reference, string nameTag)
        {
            List<object> hookReferences;
            if (!_hookReferencesByTagName.TryGetValue(nameTag, out hookReferences))
            {
                _hookReferencesByTagName[nameTag] = hookReferences = new List<object>();
            }
            hookReferences.Add(reference);
        }
        public string ResolveHookName(object reference)
        {
            string hookName;
            if ( !_hookMethodNameByReference.TryGetValue(reference, out hookName))
            {
                hookName = "Hook_" + Guid.NewGuid().ToString().Replace('-', '_');
                _hookMethodNameByReference.Add(reference, hookName);
            }
            return hookName;
        }
        public string[] ResolveNameTag(string nameTag)
        {
            List<object> hookReferences;
            if (_hookReferencesByTagName.TryGetValue(nameTag, out hookReferences))
            {
                return hookReferences.Select(r => ResolveHookName(r)).ToArray();
            }
            return null;
        }
    }
}
