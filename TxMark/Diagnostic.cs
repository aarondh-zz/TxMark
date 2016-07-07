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
            StringBuilder result = new StringBuilder();
            result.Append($"{Severity}: {Source} {Category} {Message}");
            if ( Line>=0 || Column >= 0)
            {
                result.Append(" at or near ");
                if ( Line >= 0 )
                {
                    result.Append($"line {Line}");
                    if (Column >= 0)
                    {
                        result.Append($", column {Column}");
                    }
                }
            }
            return result.ToString();
        }

    }
}
