using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Dynamic;
using System.IO;
using System.Linq;
using System.Linq.Expressions;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Template
{
    public class TemplateState<TModel> : IState<TModel>
    {
        private class Frame : IValue
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
                    if ( _text == null )
                    {
                        return '\0';
                    }
                    else if ( _text.Length == 0 )
                    {
                        return '\0';
                    }
                    else
                    {
                        return _text[_text.Length - 1];
                    }
                }
            }
        public override string ToString()
            {
                if (_text == null)
                {
                    return null;
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
        public TemplateState(IViewOptions viewOptions)
        {
            this.ViewOptions = viewOptions;
            _currentFrame = new Frame();
            _frameStack = new Stack<Frame>();
        }
        public object this[string key]
        {
            get
            {
                return Get(key);
            }

            set
            {
                Set(key, value);
            }
        }

        public void Set(string key, object value)
        {
            object oldValue = null;
            if (_values == null)
            {
                _values = new Dictionary<string, object>();
            }
            else if ( _values.TryGetValue(key, out oldValue))
            {
                if ( !oldValue.Equals(value))
                {
                    return;
                }
            }
            _values[key] = value;
            PropertyChanged(this, new PropertyChangedEventArgs(key));
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

        public int Count
        {
            get
            {
                if (_values == null)
                {
                    return 0;
                }
                else
                {
                    return _values.Count;
                }
            }
        }

        public bool IsReadOnly
        {
            get
            {
                return false;
            }
        }

        public ICollection<string> Keys
        {
            get
            {
                if (_values == null)
                {
                    return new string[] { };
                }
                else
                {
                    return _values.Keys;
                }
            }
        }
        public IViewOptions ViewOptions { get; private set; }
        public ICollection<object> Values
        {
            get
            {
                if (_values == null)
                {
                    return new object[] { };
                }
                else
                {
                    return _values.Values;
                }
            }
        }

        public event PropertyChangedEventHandler PropertyChanged;

        public void Add(KeyValuePair<string, object> item)
        {
            Add(item.Key, item.Value);
        }

        public void Add(string key, object value)
        {
            if (_values == null)
            {
                _values = new Dictionary<string, object>();
            }
            _values.Add(key, value);
            PropertyChanged(this, new PropertyChangedEventArgs(key));
        }

        public void Clear()
        {
            if (_values != null)
            {
                _values.Clear();
            }
        }

        public bool Contains(KeyValuePair<string, object> item)
        {
            if (_values == null)
            {
                return false;
            }
            else
            {
                return _values.Contains(item);
            }
        }

        public bool ContainsKey(string key)
        {
            if (_values == null)
            {
                return false;
            }
            else
            {
                return _values.ContainsKey(key);
            }
        }

        public void CopyTo(KeyValuePair<string, object>[] array, int arrayIndex)
        {
            if (_values != null)
            {
                _values.ToArray().CopyTo(array, arrayIndex);
            }
        }

        public IEnumerator<KeyValuePair<string, object>> GetEnumerator()
        {
            if (_values == null)
            {
                return new KeyValuePair<string, object>[] { }.GetEnumerator() as IEnumerator<KeyValuePair<string, object>>;
            }
            else
            {
                return _values.GetEnumerator();
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

        public bool Remove(KeyValuePair<string, object> item)
        {
            if ( _values != null && _values.Remove(item.Key) )
            {
                PropertyChanged(this, new PropertyChangedEventArgs(item.Key));
                return true;
            }
            else
            {
                return false;
            }
        }

        public bool Remove(string key)
        {
            if (_values != null && _values.Remove(key))
            {
                PropertyChanged(this, new PropertyChangedEventArgs(key));
                return true;
            }
            else
            {
                return false;
            }
        }

        public bool TryGetValue(string key, out object value)
        {
            if (_values == null)
            {
                value = null;
                return false;
            }
            else
            {
                return _values.TryGetValue(key, out value);
            }
        }

        public void Write(double value)
        {
            this.ViewOptions.Formatter.Write(_currentFrame.Writer, value);
        }

        public void Write(bool value)
        {
            this.ViewOptions.Formatter.Write(_currentFrame.Writer, value);
        }

        public void Write(int value)
        {
            this.ViewOptions.Formatter.Write(_currentFrame.Writer, value);
        }

        public void Write(char value)
        {
            this.ViewOptions.Formatter.Write(_currentFrame.Writer, value);
        }

        public void Write(string value)
        {
            if (!string.IsNullOrWhiteSpace(value))
            {
                var writer = _currentFrame.Writer;
                if (!_currentFrame.IsEmpty)
                {
                    char first = value[0];
                    char last = _currentFrame.LastChar;
                    if ( char.IsLetterOrDigit(last) && char.IsLetterOrDigit(first) )
                    {
                        this.ViewOptions.Formatter.Write(_currentFrame.Writer, ' ');
                    }
                }
                this.ViewOptions.Formatter.Write(_currentFrame.Writer, value);
            }
        }
        public void Write(IValue value)
        {
            this.ViewOptions.Formatter.Write(_currentFrame.Writer, value.ToString());
        }

        public void Write(object value)
        {
            this.ViewOptions.Formatter.Write(_currentFrame.Writer, value);
        }

        IEnumerator IEnumerable.GetEnumerator()
        {
            if (_values == null)
            {
                return new KeyValuePair<string, object>[] { }.GetEnumerator();
            }
            else
            {
                return _values.GetEnumerator();
            }
        }
        private class DynamicStateMetaObject : DynamicMetaObject
        {
            internal DynamicStateMetaObject(System.Linq.Expressions.Expression parameter, TemplateState<TModel> value) : base(parameter, BindingRestrictions.Empty, value)
            {
            }

            public override DynamicMetaObject BindSetMember(SetMemberBinder binder, DynamicMetaObject value)
            {
                // Method to call in the containing class:  
                string methodName = "Set";
                // setup the binding restrictions
                BindingRestrictions restrictions =
                    BindingRestrictions.GetTypeRestriction(Expression, LimitType);
                // setup the parameters:
                Expression[] args = new Expression[2];
                // First parameter is the name of the property to Set 
                args[0] = Expression.Constant(binder.Name);
                // Second parameter is the value
                args[1] = Expression.Convert(value.Expression, typeof(object));
                // Setup the 'this' reference 
                Expression self = Expression.Convert(Expression, LimitType);
                // Setup the method call expression 
                Expression methodCall = Expression.Call(self,
                    typeof(TemplateState<TModel>).GetMethod(methodName),
                    args);
                // Create a meta object to invoke Set later:
                DynamicMetaObject setMethod = new DynamicMetaObject(
                    methodCall,
                    restrictions);
                // return that dynamic object 
                return setMethod;
            }

            public override DynamicMetaObject BindGetMember(GetMemberBinder binder)
            {
                // Method call in the containing class:
                string methodName = "Get";
                // One parameter
                Expression[] parameters = new Expression[]
                {
                    Expression.Constant(binder.Name)
                };
                DynamicMetaObject getMethod = new DynamicMetaObject(
                    Expression.Call(
                        Expression.Convert(Expression, LimitType),
                        typeof(TemplateState<TModel>).GetMethod(methodName),
                        parameters),
                    BindingRestrictions.GetTypeRestriction(Expression, LimitType));
                return getMethod;
            }
        }

        public DynamicMetaObject GetMetaObject(Expression parameter)
        {
            return new DynamicStateMetaObject(parameter, this);
        }

        public bool WriteOpenTag(string tagName, IDictionary<string, object> attributes)
        {
            return this.ViewOptions.Formatter.WriteOpenTag(_currentFrame.Writer, tagName, attributes);
        }

        public void WriteCloseTag(string tagName)
        {
            this.ViewOptions.Formatter.WriteCloseTag(_currentFrame.Writer, tagName);
        }
    }
}
