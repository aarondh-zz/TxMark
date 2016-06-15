
namespace TxMark.Template
{
    public interface ICompiledTemplate<TModel> : ICompiledTemplate
    {
        IValue View(IState<TModel> state);
        string View(IViewOptions options, TModel model);
    }

    public interface ICompiledTemplate
    {
        string View(IViewOptions options, object model);
    }
}
