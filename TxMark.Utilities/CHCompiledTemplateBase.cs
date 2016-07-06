/*
 *  TxMark 1.0.0.alpha-0-g0639c8a
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
