using Antlr4.Runtime;
using Antlr4.Runtime.Tree;
using Microsoft.CodeAnalysis;
using Microsoft.CodeAnalysis.CSharp;
using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Diagnostics;
using System.Dynamic;
using System.IO;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;
using TxMark.Compiler;
using TxMark.Template;

namespace TxMark
{
    public static class Engine
    {
        private static TextReader Preprocessor(TextReader reader, Options options, ref Result result)
        {
            MarkdownPreprocessorParser.DocumentContext preprocessorParseTree;
            var startTime = DateTime.Now;

            var inputStream = new AntlrInputStream(reader);
            var markdownLexer = new MarkdownPreprocessorLexer(inputStream);
            var tokens = new CommonTokenStream(markdownLexer);
            var markdownParser = new MarkdownPreprocessorParser(tokens);
            markdownParser.BuildParseTree = true;
            preprocessorParseTree = markdownParser.document();
            var markdownListener = new MarkdownPreprocessorParseTreeListener();
            ParseTreeWalker.Default.Walk(markdownListener, preprocessorParseTree);

            var endTime = DateTime.Now;
            result.PreprocessorTime = endTime - startTime;
            if ( options.OutputPreprocessor)
            {
                result.PreprocessorStream = markdownListener.ToStream(options.Encoding);
            }
            return markdownListener.ToTextReader();
        }
        private static CompileContext Parse<TModel>(TextReader reader, string templatePath, Options options, ref Result result)
        {
            DateTime startTime = DateTime.Now;

            TxMarkParser.DocumentContext parseTree;

            var inputStream = new AntlrInputStream(reader);

            var harloweLexer = new TxMarkLexer(inputStream);

            var tokens = new CommonTokenStream(harloweLexer);

            var txMarkParser = new TxMarkParser(tokens);

            txMarkParser.BuildParseTree = true;

            parseTree = txMarkParser.document();

            DateTime parseTime = DateTime.Now;

            result.ParserTime = parseTime - startTime;
            List<Diagnostic> diagnostics = new List<Diagnostic>();
            var compileContext = new CompileContext(
                typeof(CompiledTemplateBase<TModel>),
                typeof(TModel),
                templateName: MakeTemplateName(options,templatePath),
                templatePath: templatePath,
                logHandler: (level, message, line, column) =>
                {
                    Debug.WriteLine($"{level}: {message} at or near line {line}, column {column}");
                    switch (level)
                    {
                        case LogLevel.Warning:
                            diagnostics.Add(
                                new Diagnostic(DiagnosticSeverity.Warning, Result.Sources.Preprocessor, null, message, line, column)
                                );
                            break;
                        case LogLevel.Error:
                            diagnostics.Add(
                                new Diagnostic(DiagnosticSeverity.Error, Result.Sources.Preprocessor, null, message, line, column)
                                );
                            break;
                    }

                });
            var txMarkListener = new TxMarkParseTreeListener(compileContext);
            ParseTreeWalker.Default.Walk(txMarkListener, parseTree);
            result.Success = true;
            foreach( var diagnostic in diagnostics)
            {
                if ( diagnostic.Severity == DiagnosticSeverity.Error)
                {
                    result.Success = false;
                }
                result.AddDiagnostic(diagnostic);
            }
            if ( options.OutputParser )
            {
                var formatStartTime = DateTime.Now;
                result.ParserStream = compileContext.ToStream(options.Encoding);
                var formatEndTime = DateTime.Now;
                result.FormatTime = formatEndTime - formatStartTime;
            }
            return compileContext;
        }
        private static string MakeTemplateQualifiedTypeName( Options options, string templateName)
        {
            return CompileContext.DEFAULT_NAMESPACE + "." + templateName;
        }
        private static string MakeAssemblyPath(Options options, string templateName)
        {
            var compilePath = options.CompilePath;
            if ( compilePath == null)
            {
                compilePath = Environment.CurrentDirectory;
            }
            return Path.Combine(compilePath, templateName + ".dll");
        }
        private static string MakeTemplateName(Options options, string templatePath)
        {
            string templateName = options.TemplateName;
            if (templateName == null)
            {
                templateName = System.IO.Path.GetFileNameWithoutExtension(templatePath);
                if ( char.IsLetter(templateName[0]) ) {
                    templateName = char.ToUpper(templateName[0]) + templateName.Substring(1);
                }
                StringBuilder csharpIdentifier = new StringBuilder();
                foreach( var c in templateName )
                {
                    if ( char.IsLetterOrDigit(c))
                    {
                        csharpIdentifier.Append(c);
                    }
                    else
                    {
                        if (csharpIdentifier.Length == 0 || csharpIdentifier[csharpIdentifier.Length - 1] != '_')
                        {
                            csharpIdentifier.Append('_');
                        }
                    }
                }
                return csharpIdentifier.ToString();
            }
            return templateName;
        }
        private static bool Compile<TModel>(CompileContext compileContext, string templatePath, Options options, ref Result result)
        {
            DateTime startTime = DateTime.Now;
            if (options.DiagnosticLevel == DiagnosticLevel.Diagnostics)
            {
                foreach (var reference in compileContext.MetadataReferenceManager.References)
                {
                    result.AddDiagnostic(new Diagnostic( DiagnosticSeverity.Info, Result.Sources.Compiler, "Diagnostic", $"Referencing assembly: {reference.Display}", -1,-1));
                }
            }
            string templateName = MakeTemplateName(options, templatePath);

            string assemblyPath = MakeAssemblyPath(options, templateName);
            var referenceManager = compileContext.MetadataReferenceManager;
            CSharpCompilationOptions compilationOptions = new CSharpCompilationOptions(OutputKind.DynamicallyLinkedLibrary);
            CSharpCompilation compilation = CSharpCompilation.Create(templateName)
                .AddReferences(referenceManager.References)
                .AddSyntaxTrees(compileContext.CompilationUnit.SyntaxTree)
                .WithOptions(compilationOptions);

            var emitResult = compilation.Emit(assemblyPath);

            DateTime compileTime = DateTime.Now;

            result.CompileTime = compileTime - startTime;

            foreach (var diagnostic in emitResult.Diagnostics)
            {
                var location = diagnostic.Location.GetMappedLineSpan();
                switch (diagnostic.Severity)
                {
                    case Microsoft.CodeAnalysis.DiagnosticSeverity.Error:
                        result.AddDiagnostic(new Diagnostic(DiagnosticSeverity.Error, Result.Sources.Roslyn, "error", diagnostic.GetMessage(), location.StartLinePosition.Line + 1, -1));
                        break;
                    case Microsoft.CodeAnalysis.DiagnosticSeverity.Warning:
                        result.AddDiagnostic(new Diagnostic(DiagnosticSeverity.Warning, Result.Sources.Roslyn, "warning", diagnostic.GetMessage(), location.StartLinePosition.Line + 1, -1));
                        break;
                    case Microsoft.CodeAnalysis.DiagnosticSeverity.Info:
                        result.AddDiagnostic(new Diagnostic(DiagnosticSeverity.Info, Result.Sources.Roslyn, "info", diagnostic.GetMessage(), location.StartLinePosition.Line + 1, -1));
                        break;
                }
            }

            return emitResult.Success;
        }
        public static Result Build<TModel>(string templatePath, Options options)
        {
            var result = new Result();
            if (options.DiagnosticLevel >= DiagnosticLevel.Information)
            {
                result.AddDiagnostic(new Diagnostic(DiagnosticSeverity.Info,Result.Sources.Builder,"Information",$"Template read from: {templatePath}"));
            }
            TextReader templateReader = File.OpenText(templatePath);
            if (options.MarkdownPreprocessor)
            {
                try
                {
                    var preprocessorResultReader = Preprocessor(templateReader, options, ref result);
                    templateReader.Close();
                    templateReader = preprocessorResultReader;
                }
                catch (Exception e)
                {
                    result.AddDiagnostic(new Diagnostic(DiagnosticSeverity.Error, Result.Sources.Builder, "Fatal", e.Message));
                    result.Success = false;
                    templateReader.Close();
                }
            }
            DateTime startTime = DateTime.Now;
            var compileContext = Parse<TModel>(templateReader, templatePath, options, ref result);
            result.Success = Compile<TModel>(compileContext, templatePath, options, ref result);
            return result;
        }

        public static Result Execute<TModel>( string templatePath, TModel model, Options options)
        {
            Result result;
            var templateName = MakeTemplateName(options, templatePath);
            var templateQualifiedTypeName = MakeTemplateQualifiedTypeName(options, templateName);
            string assemblyPath = MakeAssemblyPath(options, templateName);
            if ( options.ForceCompile || !File.Exists(assemblyPath))
            {
                result = Build<TModel>(templatePath, options);
                if ( !result.Success )
                {
                    return result;
                }
            }
            else
            {
                result = new Result();
            }

            if (options.DiagnosticLevel >= DiagnosticLevel.Information)
            {
                result.AddDiagnostic(new Diagnostic(DiagnosticSeverity.Info, Result.Sources.Executor, "Information", $"Compiled template loaded from: {assemblyPath}", -1, -1));
            }
            var loadStartTime = DateTime.Now;
            var templateAssembly = Assembly.LoadFile(assemblyPath);
            Type templateType = templateAssembly.GetType(templateQualifiedTypeName);
            var template = Activator.CreateInstance(templateType, model) as ICompiledTemplate;
            var loadEndTime = DateTime.Now;
            result.LoadTime = loadEndTime - loadStartTime;
            var executionStartTime = DateTime.Now;
            string output = template.View(options);
            result.OutputStream = new MemoryStream(options.Encoding.GetBytes(output));
            var executionEndTime = DateTime.Now;
            result.ExecutionTime = executionEndTime - executionStartTime;
            return result;
        }
    }
}
