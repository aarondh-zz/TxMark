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
using Newtonsoft.Json.Linq;
using System;
using System.Dynamic;
using System.IO;
using TxMark.Template;
using TxMark.Template.Formatters;
using TxMark.Utilities;

namespace TxMark.CLI
{
    public class Program
    {
        private static dynamic LoadModel(string modelPath)
        {
            if ( string.IsNullOrWhiteSpace(modelPath))
            {
                return new ExpandoObject();
            }
            else
            {
                using (var reader = File.OpenText(modelPath))
                {
                    return JObject.Parse(reader.ReadToEnd());
                }
            }
        }
        static int Main(string[] args)
        {
            bool successful = false;
            var options = new Options();
            if (CommandLine.Parser.Default.ParseArguments(args, options))
            {
                var txMarkOptions = new TxMark.Options();
                txMarkOptions.ForceCompile = options.Compile;
                txMarkOptions.DiagnosticLevel = TxMark.DiagnosticLevel.Diagnostics;
                txMarkOptions.MarkdownPreprocessor = !options.MarkdownPreprocessor;
                txMarkOptions.OutputPreprocessor = options.OutputPreprocessor;
                txMarkOptions.OutputParser = options.List||options.SourcePath!=null;
                switch ( options.OutputStyle)
                {
                    case OutputFormats.Html:
                        txMarkOptions.Formatter = new HtmlFormatter();
                        break;
                    case OutputFormats.Text:
                        txMarkOptions.Formatter = new TextFormatter();
                        break;
                }
                var startTime = DateTime.Now;
                TxMark.Result result;
                if (string.IsNullOrEmpty(options.ModelPath))
                {
                    result = TxMark.Engine.Execute<TestModel>(options.TemplatePath, new TestModel(), txMarkOptions);
                    txMarkOptions.TemplateBaseClass = typeof(CHCompiledTemplateBase<TestModel>);
               }
                else
                {
                    txMarkOptions.TemplateBaseClass = typeof(CHCompiledTemplateBase<dynamic>);
                    var model = LoadModel(options.ModelPath);
                    result = TxMark.Engine.Execute<dynamic>(options.TemplatePath, model, txMarkOptions);
                }
                var endTime = DateTime.Now;
                if (options.OutputPreprocessor)
                {
                    if (options.Verbose)
                    {
                        Console.Out.WriteLine("Preprocessor output:\n=================");
                    }
                    if (result.PreprocessorStream == null)
                    {
                        Console.Out.Write("***** no output produced *****");
                    }
                    else
                    {
                        Console.Out.Write(new StreamReader(result.PreprocessorStream).ReadToEnd());
                    }
                    if (options.Verbose)
                    {
                        Console.Out.WriteLine("\n=================");
                    }
                }
                if (options.List)
                {
                    if (options.Verbose)
                    {
                        Console.Out.WriteLine("Parser output:\n=================");
                    }
                    if (result.ParserStream == null)
                    {
                        Console.Out.Write("***** no output produced *****");
                    }
                    else
                    {
                        Console.Out.Write(new StreamReader(result.ParserStream).ReadToEnd());
                    }
                    if (options.Verbose)
                    {
                        Console.Out.WriteLine("\n=================");
                    }
                }
                if (options.Print)
                {
                    if (options.Verbose)
                    {
                        Console.Out.WriteLine("Template output:\n=================");
                    }
                    if ( result.OutputStream == null)
                    {
                        Console.Out.Write("***** no output produced *****");
                    }
                    else
                    {
                        Console.Out.Write(new StreamReader(result.OutputStream).ReadToEnd());
                    }
                    if (options.Verbose)
                    {
                        Console.Out.WriteLine("\n=================");
                    }
                }
                if (options.SourcePath != null)
                {
                    try
                    {
                        using (var sourcePathWriter = File.CreateText(options.SourcePath))
                        {
                            result.ParserStream.Seek(0, SeekOrigin.Begin);
                            sourcePathWriter.Write(new StreamReader(result.ParserStream).ReadToEnd());
                            if (options.Verbose)
                            {
                                Console.Out.WriteLine($"Source written to: {options.SourcePath}");
                            }
                            sourcePathWriter.Flush();
                        }
                    }
                    catch (Exception e)
                    {
                        Console.Error.WriteLine(e.Message);
                    }
                }
                if (options.OutputPath != null)
                {
                    try
                    {
                        using (var outputPathWriter = File.CreateText(options.OutputPath))
                        {
                            result.OutputStream.Seek(0, SeekOrigin.Begin);
                            outputPathWriter.Write(new StreamReader(result.OutputStream).ReadToEnd());
                            if (options.Verbose)
                            {
                                Console.Out.WriteLine($"Output written to: {options.OutputPath}");
                            }
                            outputPathWriter.Flush();
                        }
                    }
                    catch (Exception e)
                    {
                        Console.Error.WriteLine(e.Message);
                    }
                }
                int warnings = 0;
                int errors = 0;
                int informations = 0;
                foreach (var diagnostic in result.Diagnostics)
                {
                    Console.Out.WriteLine(diagnostic.ToString());
                    switch( diagnostic.Severity)
                    {
                        case TxMark.DiagnosticSeverity.Info:
                            informations++;
                            break;
                        case TxMark.DiagnosticSeverity.Warning:
                            warnings++;
                            break;
                        case TxMark.DiagnosticSeverity.Error:
                            errors++;
                            break;
                    }
                }

                if (options.Verbose)
                {
                    Console.Out.WriteLine();
                    Console.Out.WriteLine($"infomation:        {informations}");
                    Console.Out.WriteLine($"warnings:          {warnings}");
                    Console.Out.WriteLine($"errors:            {errors}");
                    Console.Out.WriteLine($"preprocessor time: {result.PreprocessorTime}");
                    Console.Out.WriteLine($"parser time:       {result.ParserTime}");
                    Console.Out.WriteLine($"format time:       {result.FormatTime}");
                    Console.Out.WriteLine($"compile time:      {result.CompileTime}");
                    if (result.Success)
                    {
                        Console.Out.WriteLine($"load time:         {result.LoadTime}");
                        Console.Out.WriteLine($"execution time:    {result.ExecutionTime}");
                    }
                    Console.Out.WriteLine($"total time:        {endTime - startTime}");
                }

                if (options.Wait)
                {
                    Console.WriteLine();
                    Console.Write("press any key>");
                    Console.ReadKey();
                }
                return successful ? 0 : 2;
            }
            else
            {
                Console.Error.WriteLine(options.GetUsage());
                return 1;
            }

        }
    }
}
