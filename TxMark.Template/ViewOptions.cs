using TxMark.Template.Formatters;

namespace TxMark.Template
{
    public class ViewOptions : IViewOptions
    {
        public static readonly IViewOptions Default = new ViewOptions()
        {
            Formatter = new HtmlFormatter()
        };
        public ViewOptions()
        {
            IsModelReadOnly = true;
        }

        public bool IsModelReadOnly { get; set; }
        public IFormatter Formatter { get; set; }
    }
}
