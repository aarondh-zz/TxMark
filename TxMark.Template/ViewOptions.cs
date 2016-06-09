namespace TxMark.Template
{
    public class ViewOptions : IViewOptions
    {
        public static readonly IViewOptions Default = new ViewOptions()
        {
            Formatter = new HtmlTemplateFormatter()
        };
        public ViewOptions()
        {

        }
        public ITemplateFormatter Formatter { get; set; }
    }
}
