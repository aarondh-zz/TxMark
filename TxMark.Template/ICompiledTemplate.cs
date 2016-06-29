namespace TxMark.Template
{
    public interface ICompiledTemplate<TModel> : ICompiledTemplate
    {
        string View(IViewOptions options, TModel model);
    }

    public interface ICompiledTemplate
    {
        string View(IViewOptions options, object model);
    }
}
