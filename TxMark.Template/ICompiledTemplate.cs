#define USE_DYNAMIC
namespace TxMark.Template
{
    public interface ICompiledTemplate<TModel> : ICompiledTemplate
    {
#if USE_DYNAMIC
        IValue View(dynamic state);
#else
        IValue View(IState<TModel> state);
#endif
        string View(IViewOptions options, TModel model);
    }

    public interface ICompiledTemplate
    {
        string View(IViewOptions options, object model);
    }
}
