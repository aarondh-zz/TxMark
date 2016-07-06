/*
 *  TxMark 1.0.0.alpha-0-g0639c8a
 *
 *  Copyright (c) 2016 Aaron G. Daisley-Harrison
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Diagnostics;
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
        public abstract IValue View(dynamic state);
        public string View(IViewOptions viewOptions, TModel model)
        {
            var state = new TemplateState<TModel>(viewOptions, model);
            try
            {
                var result = View(state);
                return result?.ToString();
            }
            catch(Exception e)
            {
                throw new Exception($"Error during template processing:{e.Message}.  After producing:{state.GetClue()}",e);
            }
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
                var type = value.GetType();
                var lengthProperty = type.GetProperty("Length");
                if (lengthProperty != null)
                {
                    return (int)lengthProperty.GetValue(value);
                }
                var countProperty = type.GetProperty("Count");
                if (countProperty != null)
                {
                    return (int)countProperty.GetValue(value);
                }
                else
                {
                    return 1;
                }
            }
        }
        private dynamic IndexOf(object value, int index)
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
            return NullValue.Instance;
        }
        public dynamic Index(dynamic value, object key)
        {
            try
            {
                if (key == null)
                {
                    return NullValue.Instance;
                }
                else if (value == null)
                {
                    if (key.ToString().Equals("length", StringComparison.InvariantCultureIgnoreCase))
                    {
                        return 0;
                    }
                    else
                    {
                        return NullValue.Instance;
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
                    if (member == null)
                    {
                        if (name.Equals("length", StringComparison.InvariantCultureIgnoreCase))
                        {
                            return LengthOf(value);
                        }
                        else if (name.Equals("first", StringComparison.InvariantCultureIgnoreCase))
                        {
                            return IndexOf(value, 1);
                        }
                        else if (name.Equals("last", StringComparison.InvariantCultureIgnoreCase))
                        {
                            return IndexOf(value, LengthOf(value));
                        }
                        else
                        {
                            var indexMethod = type.GetMethod("get_Item", new Type[] { key.GetType() });
                            if (indexMethod == null)
                            {
                                indexMethod = type.GetMethod("get_Item", new Type[] { typeof(string) });
                                if (indexMethod != null)
                                {
                                    return indexMethod.Invoke(value, new object[] { key.ToString() });
                                }
                            }
                            else
                            {
                                return indexMethod.Invoke(value, new object[] { key });
                            }
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
            catch (Exception e)
            {
                //throw new IndexOutOfRangeException($"index \"{key}\" not found in {value.GetType().FullName}",e);
            }
            //throw new IndexOutOfRangeException($"index \"{key}\" not found in {value.GetType().FullName}");
            return NullValue.Instance;
        }
        public object IndexFromLast(object value, int key)
        {
            var last = LengthOf(value);
            return IndexOf(value, last - key + 1);
        }

        [Macro(alias: "a")]
        public IListValue Array(params Object[] values)
        {
            return new ListValue<object>(values);
        }
        [Macro]
        public IDatamapValue DataMap(params Object[] values)
        {
            var datamap = new DatamapValue<object>();
            if ( values != null)
            {
                for (int i = 0; i < values.Length; i += 2)
                {
                    string key = values[i].ToString();
                    object value = "";
                    if ( i+1 < values.Length)
                    {
                        value = values[i + 1];
                    }
                    datamap[key] = values;
                }
            }
            return datamap;
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
