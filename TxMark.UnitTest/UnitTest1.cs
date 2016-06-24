using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using VoidNish.Diff;
using System.IO;
using System.Text;
using TxMark.Utilities;
using Newtonsoft.Json.Linq;
using System.Dynamic;

namespace TxMark.UnitTest
{
    [TestClass]
    public class UnitTest1
    {
        private dynamic LoadModel( string modelPath)
        {
            using (var reader = File.OpenText(modelPath))
            {
                return JObject.Parse(reader.ReadToEnd());
            }
        }
        private void AssertSuccess(TxMark.Result result)
        {
            StringBuilder message = new StringBuilder();
            foreach( var diagnostic in result.Diagnostics)
            {
                message.AppendLine(diagnostic.ToString());
            }
            Assert.IsTrue(result.Success, message.ToString());
        }
        private void CheckOutput(string expectedResultPath, Stream outputStream)
        {
            Assert.IsNotNull(outputStream);
            using (var reader = new StreamReader(outputStream))
            {
                var result = reader.ReadToEnd();
                if ( File.Exists(expectedResultPath))
                {
                    using (var expectedResultReader = File.OpenText(expectedResultPath))
                    {
                        var expectedResult = expectedResultReader.ReadToEnd();
                        string[] expectedResultLines = expectedResult.Split('\n');
                        string[] resultLines = result.Split('\n');
                        var simpleDiff = new SimpleDiff<string>(expectedResultLines, resultLines);
                        StringBuilder message = new StringBuilder();
                        int differences = 0;
                        simpleDiff.LineUpdate += (s, e) => {
                            string indicator = "";
                            switch (e.DiffType)
                            {
                                case DiffType.Add:
                                    indicator = "++";
                                    differences++;
                                    break;
                                case DiffType.Subtract:
                                    indicator = "--";
                                    differences++;
                                    break;
                                case DiffType.None:
                                    indicator = "==";
                                    break;
                            }
                            message.AppendLine($"{indicator}{e.LineValue.Replace("\r", "")}");
                        };
                        simpleDiff.RunDiff();
                        if (message.Length > 0)
                        {
                            Assert.AreEqual(0, differences, "\n" + message.ToString());
                        }
                    }
                }
                else
                {
                    using (var expectedResultWriter = File.OpenWrite(expectedResultPath))
                    {
                        using (var writer = new StreamWriter(expectedResultWriter))
                        {
                            writer.Write(result);
                        }
                    }
                    Assert.Inconclusive($"\"{expectedResultPath}\" was not found... creating file based on current result.");
                }
            }
        }
        [TestInitialize]
        public void InitializeTest()
        {
            Environment.CurrentDirectory = @"C:\Users\v-adai\Documents\Visual Studio 2015\Projects\TxMark\TxMark.UnitTest";
        }
        [TestMethod]
        public void Text0()
        {
            var model = new TestModel();
            var options = new TxMark.Options()
            {
                ForceCompile = true,
                DiagnosticLevel = DiagnosticLevel.Information,
            };
            TxMark.Result result = TxMark.Engine.Execute<TestModel>("test0.txm", model, options);
            AssertSuccess(result);
            CheckOutput("test0.expected", result.OutputStream);
        }
        [TestMethod]
        public void Text1()
        {
            var model = new TestModel();
            var options = new TxMark.Options()
            {
                ForceCompile = true,
                DiagnosticLevel = DiagnosticLevel.Information,
            };
            TxMark.Result result = TxMark.Engine.Execute<TestModel>("test1.txm", model, options);
            AssertSuccess(result);
            CheckOutput("test1.expected", result.OutputStream);
        }
        [TestMethod]
        public void Text2()
        {
            var model = new TestModel();
            var options = new TxMark.Options()
            {
                ForceCompile = true,
                DiagnosticLevel = DiagnosticLevel.Information,
            };
            TxMark.Result result = TxMark.Engine.Execute<TestModel>("test2.txm", model, options);
            AssertSuccess(result);
            CheckOutput("test2.expected", result.OutputStream);
        }
        [TestMethod]
        public void Text3()
        {
            var model = new TestModel();
            var options = new TxMark.Options()
            {
                ForceCompile = true,
                DiagnosticLevel = DiagnosticLevel.Information,
            };
            TxMark.Result result = TxMark.Engine.Execute<TestModel>("test3.txm", model, options);
            AssertSuccess(result);
            CheckOutput("test3.expected", result.OutputStream);
        }
        [TestMethod]
        public void Text4()
        {
            var model = new TestModel();
            var options = new TxMark.Options()
            {
                ForceCompile = true,
                DiagnosticLevel = DiagnosticLevel.Information,
            };
            TxMark.Result result = TxMark.Engine.Execute<TestModel>("test4.txm", model, options);
            AssertSuccess(result);
            CheckOutput("test4.expected", result.OutputStream);
        }
        [TestMethod]
        public void Text5()
        {
            var model = new TestModel();
            var options = new TxMark.Options()
            {
                ForceCompile = true,
                DiagnosticLevel = DiagnosticLevel.Information,
            };
            TxMark.Result result = TxMark.Engine.Execute<TestModel>("test5.txm", model, options);
            AssertSuccess(result);
            CheckOutput("test5.expected", result.OutputStream);
        }
        [TestMethod]
        public void Text6()
        {
            var model = new TestModel();
            var options = new TxMark.Options()
            {
                ForceCompile = true,
                DiagnosticLevel = DiagnosticLevel.Information,
            };
            TxMark.Result result = TxMark.Engine.Execute<TestModel>("test6.txm", model, options);
            AssertSuccess(result);
            CheckOutput("test6.expected", result.OutputStream);
        }
        [TestMethod]
        public void Text7()
        {
            var model = LoadModel("test7.json");
            var options = new TxMark.Options()
            {
                ForceCompile = true,
                DiagnosticLevel = DiagnosticLevel.Information,
            };
            TxMark.Result result = TxMark.Engine.Execute<dynamic>("test7.txm", model, options);
            AssertSuccess(result);
            CheckOutput("test7.expected", result.OutputStream);
        }
        [TestMethod]
        public void Text8()
        {
            var model = LoadModel("test7.json");
            var options = new TxMark.Options()
            {
                ForceCompile = true,
                DiagnosticLevel = DiagnosticLevel.Information,
            };
            TxMark.Result result = TxMark.Engine.Execute<dynamic>("test8.txm", model, options);
            AssertSuccess(result);
            CheckOutput("test8.expected", result.OutputStream);
        }
        [TestMethod]
        public void Text9()
        {
            var model = LoadModel("test7.json");
            var options = new TxMark.Options()
            {
                ForceCompile = true,
                DiagnosticLevel = DiagnosticLevel.Information,
            };
            TxMark.Result result = TxMark.Engine.Execute<dynamic>("test9.txm", model, options);
            AssertSuccess(result);
            CheckOutput("test9.expected", result.OutputStream);
        }
    }
}
