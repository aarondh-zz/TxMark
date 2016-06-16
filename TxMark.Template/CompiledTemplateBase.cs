﻿using System;
using System.Collections;

namespace TxMark.Template
{
    public abstract class CompiledTemplateBase<TModel> : ICompiledTemplate<TModel>
    {
        public delegate IValue HookDelegate(IState<TModel> state);
        public delegate IValue BranchDelegate(IState<TModel> state);
        public CompiledTemplateBase(  )
        {
        }
        public abstract IValue View(IState<TModel> state);

        public string View(IViewOptions viewOptions, TModel model)
        {
            var state = new TemplateState<TModel>(viewOptions, model);
            var result = View(state);
            return result?.ToString();
        }
        public string View(IViewOptions viewOptions, object model)
        {
            return View(viewOptions, (TModel)model);
        }
        public object Index(object value, object key)
        {
            try
            {
                if (value == null || key == null)
                {
                    return null;
                }
                else if (value is IDictionary)
                {
                    var dictionary = value as IDictionary;
                    return dictionary[key];
                }
                else if (key is int || key is float || key is double)
                {
                    var index = (int)key;
                    if (index > 0)
                    {
                        if (value.GetType().IsArray)
                        {
                            var array = value as Array;
                            return array.GetValue(index - 1);
                        }
                        else if (value is IList)
                        {
                            var list = value as IList;
                            return list[index - 1];
                        }
                        else if (value is IEnumerable)
                        {
                            var enumerable = value as IEnumerable;
                            foreach (var item in enumerable)
                            {
                                if (index-- == 0)
                                {
                                    return item;
                                }
                            }
                        }
                    }
                }
                else
                {
                    var type = value.GetType();
                    var name = key.ToString();
                    var property = type.GetProperty(name);
                    if ( property == null)
                    {
                        var field = type.GetField(name);
                        if (field != null)
                        {
                            return field.GetValue(value);
                        }
                    }
                    else
                    {
                        return property.GetValue(value);
                    }
                }
            }
            catch
            {
            }
            return NullValue.Instance;
        }
        [Macro]
        public int Count(IEnumerable value)
        {
            int count = 0;
            if ( value != null )
            {
                foreach (var item in value) count++;
            }
            return count;
        }
        [Macro]
        public static string Print(object value)
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
