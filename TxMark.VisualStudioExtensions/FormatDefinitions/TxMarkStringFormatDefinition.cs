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
    [Name("MarkerFormatDefinition/TxMarkStringFormatDefinition")]
    [UserVisible(true)]
    public class TxMarkStringFormatDefinition : MarkerFormatDefinition
    {

        public TxMarkStringFormatDefinition()
        {
            this.ForegroundBrush = Brushes.DarkMagenta;
            this.DisplayName = "TxMark String";
            this.ZOrder = 5;
        }
    }
}
