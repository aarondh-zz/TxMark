using Microsoft.VisualStudio.Text.Classification;
using Microsoft.VisualStudio.Utilities;
using System;
using System.Collections.Generic;
using System.ComponentModel.Composition;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Media;

namespace TxMark.VisualStudioExtensions.FormatDefinitions
{
    [Export(typeof(EditorFormatDefinition))]
    [Name("MarkerFormatDefinition/TxMarkPunctuationFormatDefinition")]
    [UserVisible(true)]
    public class TxMarkPunctuationFormatDefinition : MarkerFormatDefinition
    {

        public TxMarkPunctuationFormatDefinition()
        {
            this.ForegroundBrush = Brushes.Blue;
            this.DisplayName = "TxMark Punctuation";
            this.ZOrder = 5;
        }
    }
}
