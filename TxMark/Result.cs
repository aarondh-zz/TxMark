using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark
{
    public class Result
    {
        private List<Diagnostic> _diagnostics;

        internal static class Sources
        {
            public const string Antlr = "Antlr";
            public const string Builder = "Builder";
            public const string Compiler = "Compiler";
            public const string Executor = "Executor";
            public const string Parser = "Parser";
            public const string Preprocessor = "Preprocessor";
            public const string Roslyn = "Roslyn";
            public const string Template = "Template";
        }

        public Result()
        {
            _diagnostics = new List<Diagnostic>();
        }
        public TimeSpan PreprocessorTime { get; set; }
        public TimeSpan ParserTime { get; set; }
        public TimeSpan FormatTime { get; set; }
        public TimeSpan CompileTime { get; set; }
        public TimeSpan LoadTime { get; set; }
        public TimeSpan ExecutionTime { get; set; }

        public Stream PreprocessorStream { get; set; }
        public Stream ParserStream { get; set; }
        public Stream OutputStream { get; set; }
        public IEnumerable<Diagnostic> Diagnostics
        {
            get
            {
                return _diagnostics;
            }
        }
        internal void AddDiagnostic( Diagnostic diagnostic )
        {
            _diagnostics.Add(diagnostic);
        }
        public bool Success { get; set; }
    }
}
