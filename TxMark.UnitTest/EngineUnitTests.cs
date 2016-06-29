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
    public class EngineUnitTests
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
        private void TestWith<TModel>(TModel model,string templatePath)
        {
            var options = new TxMark.Options()
            {
                ForceCompile = true,
                DiagnosticLevel = DiagnosticLevel.Information,
            };
            TxMark.Result result = TxMark.Engine.Execute<TModel>(templatePath, model, options);
            AssertSuccess(result);
            var expectedOutputPath = Path.Combine(Path.GetDirectoryName(templatePath), Path.GetFileNameWithoutExtension(templatePath) + ".expected");
            CheckOutput(expectedOutputPath, result.OutputStream);
        }
        private void TestWith<TModel>(string templatePath)
        {
            var model = Activator.CreateInstance<TModel>();
            TestWith<TModel>(model, templatePath);
        }
        private void TestWithDynamic(string modelPath, string templatePath)
        {
            var model = LoadModel(modelPath);
            TestWith<dynamic>(model, templatePath);
        }
        [TestMethod]
        public void Text0()
        {
            TestWith<TestModel>("test0.txm");
        }
        [TestMethod]
        public void Text1()
        {
            TestWith<TestModel>("test1.txm");
        }
        [TestMethod]
        public void Text2()
        {
            TestWith<TestModel>("test2.txm");
        }
        [TestMethod]
        public void Text3()
        {
            TestWith<TestModel>("test3.txm");
        }
        [TestMethod]
        public void Text4()
        {
            TestWith<TestModel>("test4.txm");
        }
        [TestMethod]
        public void Text5()
        {
            TestWith<TestModel>("test5.txm");
        }
        [TestMethod]
        public void Text6()
        {
            TestWith<TestModel>("test6.txm");
        }
        [TestMethod]
        public void Text7()
        {
            TestWithDynamic("test7.json", "test7.txm");
        }
        [TestMethod]
        public void Text8()
        {
            TestWithDynamic("test7.json", "test8.txm");
        }
        [TestMethod]
        public void Text9()
        {
            TestWithDynamic("test7.json", "test9.txm");
        }
        [TestMethod]
        public void Text10()
        {
            TestWithDynamic("test7.json", "test10.txm");
        }
        [TestMethod]
        public void Text11()
        {
            TestWithDynamic("test7.json", "test11.txm");
        }
    }
}
