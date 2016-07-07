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
using System.Text;
using TxMark.Template;
using TxMark.Template.Formatters;

namespace TxMark
{
    public class Options : IViewOptions
    {
        public Options()
        {
            Formatter = new HtmlFormatter();
            DiagnosticLevel = DiagnosticLevel.Warnings;
            MarkdownPreprocessor = true;
            Encoding = Encoding.UTF8;
        }
        /// <summary>
        /// The template name (if not specified the filename of the template path will be used
        /// </summary>
        public string TemplateName { get; set; }
        /// <summary>
        /// The output path
        /// </summary>
        public string OutputPath { get; set; }
        /// <summary>
        /// The path into which the compiled template assembly will be placed.
        /// </summary>
        public string CompilePath { get; set; }
        /// <summary>
        /// Enable the markdown pre-processor.
        /// </summary>
        public bool MarkdownPreprocessor { get; set; }
        /// <summary>
        /// Output the preprocessor result
        /// </summary>
        public bool OutputPreprocessor { get; set; }
        /// <summary>
        /// Output the parser result
        /// </summary>
        public bool OutputParser { get; set; }
        public bool IsModelReadOnly { get; set; }
        public Encoding Encoding { get; set; }

        public IFormatter Formatter { get; set; }
        /// <summary>
        /// Force compile even if compiled template already exists in the specified compile path
        /// </summary>
        public bool ForceCompile { get; set; }

        public Type TemplateBaseClass { get; set; }

        public DiagnosticLevel DiagnosticLevel { get; set; }
    }
}
