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
using System.Reflection;
using System.Text;
using System.Threading.Tasks;
using TxMark.Template;

namespace TxMark.Compiler
{
    public class MacroManager
    {
        private Dictionary<string, MacroDefinition> _macros = new Dictionary<string, MacroDefinition>(StringComparer.InvariantCultureIgnoreCase);
        private Type _templateType;
        public MacroManager(Type templateType)
        {
            _templateType = templateType;
            foreach ( var method in templateType.GetMethods(BindingFlags.Public|BindingFlags.Instance|BindingFlags.Static|BindingFlags.NonPublic|BindingFlags.FlattenHierarchy|BindingFlags.InvokeMethod) )
            {
                var macroAttributes = method.GetCustomAttributes(typeof(MacroAttribute)).Cast<MacroAttribute>().ToArray();
                if (macroAttributes.Length > 0)
                {
                    ProcessMacroMethod(macroAttributes, method);
                }
            }
        }
        private void ProcessMacroMethod(MacroAttribute[] macroAttributes, MethodInfo method)
        {
            var parameters = method.GetParameters();

            bool requiresHook = macroAttributes.FirstOrDefault(m => m.RequiresHook)?.RequiresHook ?? false;

            bool requiresState = macroAttributes.FirstOrDefault(m => m.RequiresState)?.RequiresState ?? false;

            int maxAttributes = parameters.Length;

            int minAttributes = 0;
            int parameterNumber = 1;
           foreach ( var parameter in parameters )
            {
                if (!parameter.IsOptional)
                {
                    if (parameter.DefaultValue == null)
                    {
                        minAttributes++;
                    }
                }
                if ( parameter.ParameterType.Name == "IState`1")
                {
                    requiresState = true;
                    if ( parameterNumber != 1)
                    {
                        throw new InvalidOperationException($"Only the first parameter of macro method {method.Name} can be used to pass template state IState<>");
                    }
                }
                if ( parameter.ParameterType.Name == "HookDelegate")
                {
                    requiresHook = true;
                    if (parameterNumber != maxAttributes)
                    {
                        throw new InvalidOperationException($"Only the last parameter of macro method {method.Name} can be used to pass the hook");
                    }
                }
                parameterNumber++;
            }

            MacroDefinition definition = new MacroDefinition()
            {
                Name = method.Name,
                MinArguments = minAttributes,
                MaxArguments = maxAttributes,
                BranchOf = macroAttributes.FirstOrDefault(m => m.BranchOf != null)?.BranchOf,
                RequiresHook = requiresHook,
                RequiresState = requiresState,
                Defined = true
            };
            _macros.Add(definition.Name, definition);
            foreach ( var macroAttribute in macroAttributes)
            {
                if( macroAttribute.Alias != null)
                {
                    MacroDefinition aliasedDefinition;
                    if (_macros.TryGetValue(macroAttribute.Alias, out aliasedDefinition))
                    {
                        if ( definition == aliasedDefinition)
                        {
                            throw new InvalidOperationException($"Template base {_templateType.FullName} macro {method.Name} is attempting to redefine the macro alias \"{macroAttribute.Alias}\" which is already used by the macro {aliasedDefinition.Name}");
                        }
                        else
                        {
                            throw new InvalidOperationException($"Template base {_templateType.FullName} macro {method.Name} has a duplicate macro alias \"{macroAttribute.Alias}\"");
                        }
                    }
                    else
                    {
                        _macros.Add(macroAttribute.Alias, definition);
                    }
                }
            }
            if (requiresState)
            {
                definition.MinArguments--;
                definition.MaxArguments--;
            }
            if (requiresHook)
            {
                definition.MinArguments--;
                definition.MaxArguments--;
            }

        }
        public MacroDefinition Resolve(string macroName)
        {
            MacroDefinition macroDefinition;

            var key = macroName.Replace("-", "").Replace("_", "_");

            if ( !_macros.TryGetValue(key, out macroDefinition) )
            {
                var name = key.Substring(0, 1).ToUpper() + key.Substring(1).ToLower();
                macroDefinition = new MacroDefinition() { Name = name };
                _macros.Add(macroDefinition.Name, macroDefinition);
            }

            return macroDefinition;
        }
    }
}
