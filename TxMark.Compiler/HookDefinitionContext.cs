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
using Microsoft.CodeAnalysis.CSharp.Syntax;

namespace TxMark.Compiler
{
    public class HookDefinitionContext : SetContext
    {
        public HookDefinitionContext(string hookName, ContentContextExitHandler<StatementSyntax> exitHandler) : base(hookName, exitHandler)
        {
        }

        public override void Exit()
        {
            if ( HasVariableName )
            {
                base.Exit();
            }
        }

        public override void NameTag(string nameTag)
        {
        }
    }
}