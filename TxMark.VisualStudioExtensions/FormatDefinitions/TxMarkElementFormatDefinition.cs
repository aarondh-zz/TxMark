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
    [Name("MarkerFormatDefinition/TxMarkElementFormatDefinition")]
    [UserVisible(true)]
    public class TxMarkElementFormatDefinition : MarkerFormatDefinition
    {

        public TxMarkElementFormatDefinition()
        {
            this.ForegroundCustomizable = true;
            this.BackgroundCustomizable = true;
            this.BackgroundBrush = Brushes.White;
            this.BackgroundColor = Colors.White;
            this.ForegroundBrush = Brushes.White;
            this.ForegroundColor = Colors.Yellow;
            this.DisplayName = "TxMark Element";
            this.ZOrder = 6;
        }
    }
}
