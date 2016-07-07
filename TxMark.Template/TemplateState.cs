/*
 *  TxMark 1.0.0.alpha-5-g61bda79
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
using System.ComponentModel;
using System.Dynamic;
using System.IO;
using System.Linq;
using System.Linq.Expressions;
using System.Reflection;
using System.Text;
using TxMark.Template.Formatters;

namespace TxMark.Template
{
    public class TemplateState<TModel> : DynamicObject, IState<TModel>
    {
        private class Frame : IRawValue
        {
            public Frame Parent { get; private set; }
            private StringBuilder _text;
            private TextWriter _writer;
            public Frame(Frame parent = null)
            {
                this.Parent = parent;
            }
            public TextWriter Writer
            {
                get
                {
                    if (_writer == null)
                    {
                        _text = new StringBuilder();
                        _writer = new StringWriter(_text);
                    }
                    return _writer;
                }
            }
            public bool IsEmpty
            {
                get
                {
                    return _text == null || _text.Length == 0;
                }
            }
            public char LastChar
            {
                get
                {
                    if (_text == null)
                    {
                        return '\0';
                    }
                    else if (_text.Length == 0)
                    {
                        return '\0';
                    }
                    else
                    {
                        return _text[_text.Length - 1];
                    }
                }
            }

            public int Length
            {
                get
                {
                    return _text.Length;
                }
            }

            public override string ToString()
            {
                if (_text == null)
                {
                    return "";
                }
                else
                {
                    return _text.ToString();
                }
            }
        }
        private Frame _currentFrame;
        private Stack<Frame> _frameStack;
        private Dictionary<string, object> _values;
        private IViewOptions _viewOptions;
        private IFormatter _formatter;
        private TModel _model;
        public TemplateState(IViewOptions viewOptions, TModel model)
        {
            _model = model;
            _viewOptions = viewOptions;
            _formatter = viewOptions.Formatter;
            _currentFrame = new Frame();
            _frameStack = new Stack<Frame>();
        }

        public TModel Model
        {
            get
            {
                return _model;
            }
        }
        public void Set(string key, object value)
        {
            object oldValue = null;
            if (_values == null)
            {
                _values = new Dictionary<string, object>();
            }
            else if (_values.TryGetValue(key, out oldValue))
            {
                if (oldValue.Equals(value))
                {
                    return;
                }
            }
            _values[key] = value;
        }

        public object Get(string key)
        {
            if (_values == null)
            {
                return null;
            }
            else
            {
                return _values[key];
            }
        }
        public IValue Pop()
        {
            var current = _currentFrame;
            _currentFrame = _frameStack.Pop();
            return current;
        }

        public void Push()
        {
            _frameStack.Push(_currentFrame);
            _currentFrame = new Frame(_currentFrame);
        }

        public void Write(double value)
        {
            _formatter.Write(_currentFrame.Writer, value);
        }

        public void Write(bool value)
        {
            _formatter.Write(_currentFrame.Writer, value);
        }

        public void Write(int value)
        {
            _formatter.Write(_currentFrame.Writer, value);
        }

        public void Write(char value)
        {
            _formatter.Write(_currentFrame.Writer, value);
        }

        public void Write(object value)
        {
            _formatter.Write(_currentFrame.Writer, value);
        }

        public bool WriteOpenTag(string tagName, bool isClosing, params object[] attributeNameValues)
        {
            Dictionary<string, string> attributes = new Dictionary<string, string>();
            if (attributeNameValues != null)
            {
                for (int i = 0; i < attributeNameValues.Length; i += 2)
                {
                    attributes[attributeNameValues[i].ToString()] = attributeNameValues[i + 1].ToString();
                }
            }
            return _formatter.WriteOpenTag(_currentFrame.Writer, tagName, isClosing, attributes);
        }

        public void WriteCloseTag(string tagName)
        {
            _formatter.WriteCloseTag(_currentFrame.Writer, tagName);
        }

        public string GetClue()
        {
            while ( _frameStack.Count>0)
            {
                var result = Pop();
                _formatter.Write(_currentFrame.Writer, result);
            }
            return _currentFrame.ToString();
        }

        #region Dynamic support
        public override bool TryGetMember(GetMemberBinder binder,
                                          out object result)
        {
            try
            {
                if (_values != null && _values.TryGetValue(binder.Name, out result))
                {
                    return true;
                }
                else
                {
                    Type modelType = _model.GetType();
                    var property = modelType.GetProperty(binder.Name);
                    if (property != null)
                    {
                        result = property.GetValue(_model);
                        return true;
                    }
                    else
                    {
                        var field = modelType.GetField(binder.Name);
                        if (field != null)
                        {
                            result = field.GetValue(_model);
                            return true;
                        }
                        else
                        {
                            var indexMethod = modelType.GetMethod("get_Item", new Type[] { typeof(string) });
                            if (indexMethod != null)
                            {
                                result = indexMethod.Invoke(_model, new object[] { binder.Name });
                                return true;
                            }
                            else
                            {
                                result = null;
                                return false;
                            }
                        }
                    }
                }
            }
            catch
            {
                result = null;
                return false;
            }
        }

        public override bool TrySetMember(SetMemberBinder binder, object value)
        {
            try
            {
                if (_values != null && _values.ContainsKey(binder.Name))
                {
                    Set(binder.Name, value);
                    return true;
                }
                else if ( _viewOptions.IsModelReadOnly )
                {
                    Set(binder.Name, value);
                    return true;

                }
                else
                {
                    Type modelType = _model.GetType();
                    var property = modelType.GetProperty(binder.Name);
                    if (property != null)
                    {
                        property.SetValue(_model, value);
                        return true;
                    }
                    else
                    {
                        var field = modelType.GetField(binder.Name);
                        if (field != null)
                        {
                            field.SetValue(_model, value);
                            return true;
                        }
                        else
                        {
                            var indexMethod = modelType.GetMethod("set_Item", new Type[] { typeof(string) });
                            if (indexMethod != null)
                            {
                                indexMethod.Invoke(_model, new object[] { binder.Name, value });
                                return true;
                            }
                            else
                            {
                                Set(binder.Name, value);
                                return true;
                            }
                        }
                    }
                }
            }
            catch
            {
                Set(binder.Name, value);
                return true;
            }
        }

        public override bool TryInvokeMember(InvokeMemberBinder binder, object[] args, out object result)
        {
            var member = GetType().GetMethod(binder.Name);
            if (member != null)
            {
                result = member.Invoke(this, args);
                return true;
            }
            else
            {
                member = _model.GetType().GetMethod(binder.Name);
                if (member != null)
                {
                    result = member.Invoke(this, args);
                    return true;
                }
                else
                {
                    result = null;
                    return false;
                }
            }
        }
        #endregion
    }
}
