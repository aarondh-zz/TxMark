using System;
using System.IO;

namespace CLI
{
    public class TestModel
    {
        public bool IsFirstBranch
        {
            get
            {
                return true;
            }
        }
        public bool IsSecondBranch
        {
            get
            {
                return true;
            }
        }
        public bool IsThirdBranch
        {
            get
            {
                return true;
            }
        }
        public string[] array
        {
            get
            {
                return new string[] { "one", "two", "three", "four", "five", "six" };
            }
        }

        public string CalendarService
        {
            get
            {
                return "MyOwnBloodyCalendarService";
            }
        }
        public string Link
        {
            get
            {
                return "http://daisley-harrison.com/nowhere";
            }
        }
    }
    class Program
    {
        static int Main(string[] args)
        {
            bool successful = false;
            var options = new Options();
            if (CommandLine.Parser.Default.ParseArguments(args, options))
            {
                var txMarkOptions = new TxMark.Options();
                txMarkOptions.ForceCompile = options.Compile;
                txMarkOptions.DiagnosticLevel = TxMark.DiagnosticLevel.Diagnostics;
                txMarkOptions.OutputPreprocessor = options.OutputPreprocessor;
                txMarkOptions.OutputParser = options.List;
                var startTime = DateTime.Now;
                var result = TxMark.Engine.Execute<TestModel>(options.TemplatePath, new TestModel(), txMarkOptions);
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
