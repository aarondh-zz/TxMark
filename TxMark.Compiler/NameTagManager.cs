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
