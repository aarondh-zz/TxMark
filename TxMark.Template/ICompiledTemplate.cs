using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Template
{
    public interface ICompiledTemplate<TModel> : ICompiledTemplate
    {
        TModel Model { get; }
        IValue View(IState<TModel> state);

    }

    public interface ICompiledTemplate
    {
        string View(IViewOptions options);
    }
}
