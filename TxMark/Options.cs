using System.Text;
using TxMark.Template;
namespace TxMark
{
    public class Options : IViewOptions
    {
        public Options()
        {
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
        public Encoding Encoding { get; set; }

        public ITemplateFormatter Formatter { get; set; }
        /// <summary>
        /// Force compile even if compiled template already exists in the specified compile path
        /// </summary>
        public bool ForceCompile { get; set; }

        public DiagnosticLevel DiagnosticLevel { get; set; }
    }
}
