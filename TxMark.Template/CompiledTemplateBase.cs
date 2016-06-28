using System;
using System.Collections;
using System.Reflection;

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
        private static MemberInfo GetPropertyOrField(Type type, string name)
        {
            var property = type.GetProperty(name, BindingFlags.Instance | BindingFlags.Public | BindingFlags.IgnoreCase);
            if (property == null)
            {
                return type.GetField(name, BindingFlags.Instance | BindingFlags.Public | BindingFlags.IgnoreCase);
            }
            else
            {
                return property;
            }
        }
        public bool Contains(object value, object key)
        {
            throw new NotImplementedException("\"contains\" is not implemented");
        }
        public bool IsIn(object value, object key)
        {
            throw new NotImplementedException("\"is in\" is not implemented");
        }
        private int LengthOf(object value)
        {
            if ( value == null)
            {
                return 0;
            }
            else if (value.GetType().IsArray)
            {
                var array = value as Array;
                return array.Length;
            }
            else if (value is IList)
            {
                var list = value as IList;
                return list.Count;
            }
            else if (value is IEnumerable)
            {
                int length = 0;
                var enumerable = value as IEnumerable;
                foreach (var item in enumerable)
                {
                    length++;
                }
                return length;
            }
            else
            {
                var lengthProperty = value.GetType().GetProperty("Length");
                if (lengthProperty != null)
                {
                    return (int)lengthProperty.GetValue(value);
                }
                var countProperty = value.GetType().GetProperty("Count");
                if (countProperty != null)
                {
                    return (int)countProperty.GetValue(value);
                }
            }
            return 0;
        }
        private object IndexOf(object value, int index)
        {
            if (value != null && index > 0)
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
            return null;
        }
        public object Index(object value, object key)
        {
            try
            {
                if (key == null)
                {
                    return null;
                }
                else if (value == null)
                {
                    if (key.ToString().Equals("length", StringComparison.InvariantCultureIgnoreCase))
                    {
                        return 0;
                    }
                    else
                    {
                        return null;
                    }
                }
                else if (value is IDictionary)
                {
                    var dictionary = value as IDictionary;
                    return dictionary[key];
                }
                else if (key is int || key is float || key is double)
                {
                    return IndexOf(value, (int)key);
                }
                else
                {
                    var type = value.GetType();
                    var name = key.ToString();
                    var member = GetPropertyOrField(type, name);
                    if ( member == null )
                    {
                        if (name.Equals("length", StringComparison.InvariantCultureIgnoreCase))
                        {
                            member = GetPropertyOrField(type, "Count");
                        }
                        else if (name.Equals("first", StringComparison.InvariantCultureIgnoreCase))
                        {
                            return IndexOf(value, 1);
                        }
                        else if (name.Equals("last", StringComparison.InvariantCultureIgnoreCase))
                        {
                            return IndexOf(value, LengthOf(value));
                        }
                    }
                    if (member is PropertyInfo)
                    {
                        return ((PropertyInfo)member).GetValue(value);
                    }
                    else if (member is FieldInfo)
                    {
                        return ((FieldInfo)member).GetValue(value);
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
        [Macro]
        public static string Text(object value)
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
                x = (float)value;
            }
            else if (value is int)
            {
                x = (int)value;
            }
            else if (value is long)
            {
                x = (long)value;
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
                y = (float)power;
            }
            else if (power is int)
            {
                y = (int)power;
            }
            else if (power is long)
            {
                y = (long)power;
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
