using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Template
{
    public abstract class CompiledTemplateBase<TModel> : ICompiledTemplate<TModel>
    {
        public delegate IValue HookDelegate(IState<TModel> state);
        public delegate IValue BranchDelegate(IState<TModel> state);
        public CompiledTemplateBase( TModel model )
        {
            this.Model = model;
        }
        public TModel Model
        {
            get;
            private set;
        }
        public abstract IValue View(IState<TModel> state);

        public string View(IViewOptions viewOptions)
        {
            var state = new TemplateState<TModel>(viewOptions);
            var result = View(state);
            return result.ToString();
        }

    }
}
