using TxMark.Template.Formatters;

namespace TxMark.Template
{
    public interface IViewOptions
    {
        IFormatter Formatter { get; }
    }
}
