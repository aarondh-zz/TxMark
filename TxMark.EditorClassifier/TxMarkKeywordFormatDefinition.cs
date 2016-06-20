using Microsoft.VisualStudio.Text.Classification;
using Microsoft.VisualStudio.Utilities;
using System;
using System.Collections.Generic;
using System.ComponentModel.Composition;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Media;

namespace TxMark.EditorClassifier
{
    [Export(typeof(EditorFormatDefinition))]
    [Name("MarkerFormatDefinition/TxMarkKeywordFormatDefinition")]
    [UserVisible(true)]
    public class TxMarkKeywordFormatDefinition : MarkerFormatDefinition
    {

        public TxMarkKeywordFormatDefinition()
        {
            this.ForegroundBrush = Brushes.DarkMagenta;
            this.DisplayName = "Keyword";
            this.ZOrder = 5;
        }
    }
}
