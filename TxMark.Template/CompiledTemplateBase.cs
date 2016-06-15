
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
        [Macro]
        public string Print(object value)
        {
            return value?.ToString();
        }
        private class RawValue : IRawValue
        {
            private string _value;
            public RawValue( string value )
            {
                _value = value;
            }

            public override string ToString()
            {
                return _value;
            }
        }
        [Macro]
        public IRawValue Raw(object value)
        {
            return new RawValue(value?.ToString());
        }

        [Macro]
        public double Pow(object value, object power)
        {
            double x;
            double y;
            if (value is double)
            {
                x = (double)value;
            }
            else if (value is float)
            {
                x = (double)value;
            }
            else if (value is int)
            {
                x = (double)value;
            }
            else if (value is long)
            {
                x = (double)value;
            }
            else
            {
                x = double.NaN;
            }

            if (power is double)
            {
                y = (double)power;
            }
            else if (power is float)
            {
                y = (double)power;
            }
            else if (power is int)
            {
                y = (double)power;
            }
            else if (power is long)
            {
                y = (double)power;
            }
            else
            {
                y = double.NaN;
            }

            try
            {
                return System.Math.Pow(x, y);
            }
            catch
            {
                return double.NaN;
            }
        }

    }
}
