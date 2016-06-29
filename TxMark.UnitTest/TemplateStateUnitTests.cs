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
