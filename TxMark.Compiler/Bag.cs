using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Compiler
{
    public class Bag<TKey> : IEnumerable<KeyValuePair<TKey,object>>
    {
        private Dictionary<TKey, object> _valuesByKey;
        private List<KeyValuePair<TKey,object>> _values;
        public Bag()
        {
            _valuesByKey = new Dictionary<TKey, object>();
            _values = new List<KeyValuePair<TKey, object>>();
        }
        public Bag(object source)
            :this()
        {
            foreach(var property in source.GetType().GetProperties())
            {
                _valuesByKey[(TKey)(object)property.Name] = property.GetValue(source);
            }
        }
        public T Get<T>(TKey key, T defaultValue = default(T))
        {
            object value;
            if( _valuesByKey.TryGetValue(key, out value))
            {
                return (T)value;
            }
            else
            {
                return defaultValue;
            }
        }
        public bool Contains(TKey key)
        {
            return _valuesByKey.ContainsKey(key);
        }
        public Bag<TKey> Set<T>(TKey key, T value)
        {
            _valuesByKey[key] = value;
            return this;
        }

        public IEnumerator<TKey> Keys()
        {
            return _values.Select(v => v.Key).GetEnumerator();
        }
        public IEnumerator<object> Values()
        {
            return _values.Select(v => v.Value).GetEnumerator();
        }

        IEnumerator IEnumerable.GetEnumerator()
        {
            return _values.GetEnumerator();
        }

        public IEnumerator<KeyValuePair<TKey, object>> GetEnumerator()
        {
            return _values.GetEnumerator();
        }
        public Bag<TKey> Add<T>(TKey key, T value)
        {
            _valuesByKey.Add(key, value);
            _values.Add(new KeyValuePair<TKey, object>(key, value));
            return this;
        }

        bool Remove(TKey key)
        {
            if ( _valuesByKey.Remove(key))
            {
                int i = 0;
                foreach( var entry in _values )
                {
                    if ( entry.Key.Equals(key)  )
                    {
                        _values.RemoveAt(i);
                        return true;
                    }
                    i++;
                }
            }
            return false;
        }
    }
}
