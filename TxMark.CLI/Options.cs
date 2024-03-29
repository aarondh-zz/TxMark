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
using CommandLine;
using CommandLine.Text;

namespace TxMark.CLI
{
    public class Options
    {
        [Option('t', "template", Required = true, HelpText = "Template file to be processed.")]
        public string TemplatePath { get; set; }
        [Option('o', "output", Required = false, HelpText = "Template execution Output path.")]
        public string OutputPath { get; set; }
        [Option('m', "markdown", DefaultValue = false, HelpText = "Disable the markdown pre-processor.")]
        public bool MarkdownPreprocessor { get; set; }
        [Option('d', "model", Required = false, HelpText = "The path for the dynamic json model source.")]
        public string ModelPath { get; set; }
        [Option('x', "preproccessor", DefaultValue = false, HelpText = "Print the pre-processor to standard output.")]
        public bool OutputPreprocessor { get; set; }

        [Option('e', "execute", DefaultValue = false, HelpText = "Execute the template against the test model.")]
        public bool Execute { get; set; }

        [Option('p', "print", DefaultValue = false, HelpText = "Print the executed result to the standard output.")]
        public bool Print { get; set; }

        [Option('f', "format", DefaultValue = OutputFormats.Html, HelpText = "Set the view options output style.")]
        public OutputFormats OutputStyle { get; set; }

        [Option('v', "verbose", DefaultValue = false, HelpText = "Prints all messages to standard output.")]
        public bool Verbose { get; set; }
        [Option('s', "source", Required = false, HelpText = "Compiled template source output path.")]
        public string SourcePath { get; set; }
        [Option('l', "list", DefaultValue = false, HelpText = "Lists compiled template to standard output.")]
        public bool List { get; set; }
        [Option('c', "compile", DefaultValue = false, HelpText = "Force compile even if compiled template already exists.")]
        public bool Compile { get; set; }
        [Option('w', "wait", DefaultValue = false, HelpText = "Wait for a key press before exiting.")]
        public bool Wait { get; set; }
        [ParserState]
        public IParserState LastParserState { get; set; }
        [HelpOption]
        public string GetUsage()
        {
            return HelpText.AutoBuild(this, (HelpText current) => HelpText.DefaultParsingErrorsHandler(this, current));
        }
    }
}
