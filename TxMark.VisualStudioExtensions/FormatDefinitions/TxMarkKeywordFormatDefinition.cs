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
    [Name("MarkerFormatDefinition/TxMarkKeywordFormatDefinition")]
    [UserVisible(true)]
    public class TxMarkKeywordFormatDefinition : MarkerFormatDefinition
    {

        public TxMarkKeywordFormatDefinition()
        {
            this.ForegroundCustomizable = true;
            this.BackgroundCustomizable = true;
            this.ForegroundBrush = Brushes.DarkMagenta;
            this.DisplayName = "TxMark Keyword";
            this.ZOrder = 5;
        }
    }
}
