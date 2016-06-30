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
            if ( user == null)
            {
                return "";
            }
            else if (string.IsNullOrWhiteSpace(user.FirstName)) {
                return user.LastName;
            }
            else {
                return user.FirstName + ", " + user.LastName;
            }
        }
        [Macro]
        public string CasualDisplayName(dynamic user)
        {
            if (user == null)
            {
                return "";
            }
            else
            {
                return user.FirstName ?? user.LastName;
            }
        }
        [Macro]
        public string DurationInMinutes(dynamic durationInMinutes)
        {
            var hours = durationInMinutes / 60;
            if (hours > 0)
            {
                durationInMinutes -= hours * 60;
                var hourUnits = "hour" + (hours == 1 ? "" : "s");
                var minuteUnits = "minute" + (durationInMinutes == 1 ? "" : "s");
                if ( durationInMinutes >  0)
                {
                    return $"{hours} {hourUnits} {durationInMinutes} minute";
                }
                else
                {
                    return $"{hours} {hourUnits}";
                }
            }
            else
            {
                return $"{durationInMinutes} minute";
            }
        }
        [Macro]
        public string AddUnicodeToDatetime(dynamic time)
        {
            return time.ToString();
        }
    }
}
