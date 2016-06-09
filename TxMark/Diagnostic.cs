using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark
{
    public class Diagnostic
    {
        public Diagnostic(DiagnosticSeverity severity, string source, string category, string message, int line = -1, int column = -1)
        {
            Severity = severity;
            Source = source;
            Category = category;
            Message = message;
            Line = line;
            Column = column;
        }
        public DiagnosticSeverity Severity { get; private set; }
        public string Source { get; private set; }
        public string Category { get; private set; }
        public string Message { get; private set; }

        public string SourcePath { get; private set; }
        public int Line { get; private set; }
        public int Column { get; private set; }

        public override string ToString()
        {
            return $"{Severity}: {Source} reported {Category} {Message} at or near line {Line}, column {Column}";
        }

    }
}
