using Microsoft.VisualStudio.Text.Tagging;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.EditorClassifier
{
    public class TxMarkPunctuationTag : TextMarkerTag
    {
        public TxMarkPunctuationTag()
            : base("MarkerFormatDefinition/TxMarkPunctuationFormatDefinition")
        {

        }
    }
}
