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
    [Name("MarkerFormatDefinition/TxMarkAttributeFormatDefinition")]
    [UserVisible(true)]
    public class TxMarkAttributeFormatDefinition : MarkerFormatDefinition
    {

        public TxMarkAttributeFormatDefinition()
        {
            this.ForegroundBrush = Brushes.DarkMagenta;
            this.DisplayName = "HTML Attribute";
            this.ZOrder = 5;
        }
    }
}
