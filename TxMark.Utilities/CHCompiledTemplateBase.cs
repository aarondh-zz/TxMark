using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using TxMark.Template;

namespace TxMark.Utilities
{
    public abstract class CHCompiledTemplateBase<TModel> : CompiledTemplateBase<TModel>
    {
        [Macro]
        public string DisplayName(dynamic user)
        {
            if (string.IsNullOrWhiteSpace(user.FirstName)) {
                return user.LastName;
            }
            else {
                return user.FirstName + ", " + user.LastName;
            }
        }
        [Macro]
        public string CasualDisplayName(dynamic user)
        {
            return user.FirstName ?? user.LastName;
        }
    }
}
