using TxMark.Template.Formatters;

namespace TxMark.Template
{
    public interface IViewOptions
    {
        ITemplateFormatter Formatter { get; }
    }
}
