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
using Microsoft.VisualStudio.TestTools.UnitTesting;
using TxMark.Template;
using TxMark.Utilities;
using System.Diagnostics;

namespace TxMark.UnitTest
{
    [TestClass]
    public class TemplateStateUnitTests
    {
        private IValue Hook( dynamic state )
        {
            state.Push();
            state.test = "This is a test.  This is only a test";
            var x = state.array;
            foreach( var item in state.array)
            {
                state.Write(item);
                state.Write(" ");
            }
            state.Write("Test output");
            state.Write(state.test);
            return state.Pop();
        }
        [TestMethod]
        public void TestMethod1()
        {
            var result = Hook(new TemplateState<TestModel>(ViewOptions.Default, new TestModel()));
            Trace.WriteLine(result);
            Assert.IsNotNull(result);
        }
    }
}
