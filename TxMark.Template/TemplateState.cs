using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.IO;
using System.Linq;
using System.Text;

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
            this.ViewOptions.Formatter.Write(_currentFrame.Writer, value);
        }
        public void Write(IValue value)
        {
            this.ViewOptions.Formatter.Write(_currentFrame.Writer, value);
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

        public bool WriteOpenTag(string tagName, bool isClosing, params object[] attributeNameValues)
        {
            Dictionary<string, string> attributes = new Dictionary<string, string>();
            if ( attributeNameValues != null )
            {
                for (int i = 0; i < attributeNameValues.Length; i += 2)
                {
                    attributes[attributeNameValues[i].ToString()] = attributeNameValues[i + 1].ToString();
                }
            }
            return this.ViewOptions.Formatter.WriteOpenTag(_currentFrame.Writer, tagName, isClosing, attributes);
        }

        public void WriteCloseTag(string tagName)
        {
            this.ViewOptions.Formatter.WriteCloseTag(_currentFrame.Writer, tagName);
        }
    }
}
