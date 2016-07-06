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
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Template
{
    public class DatamapValue<TItem> : IDatamapValue, IDictionary<string, TItem>
    {
        private Dictionary<string, TItem> _items;
        private object _syncroot = new Object();

        public DatamapValue()
        {
            _items = new Dictionary<string, TItem>();
        }
        public DatamapValue(int capacity)
        {
            _items = new Dictionary<string, TItem>(capacity);
        }
        public DatamapValue(IDictionary<string, TItem> dictionary)
        {
            _items = new Dictionary<string, TItem>(dictionary);
        }
        public object this[object key]
        {
            get
            {
                return _items[key.ToString()];
            }

            set
            {
                _items[key.ToString()] = (TItem)value;
            }
        }

        public TItem this[string key]
        {
            get
            {
                return _items[key];
            }

            set
            {
                _items[key] = value;
            }
        }

        public int Count
        {
            get
            {
                return _items.Count;
            }
        }
        public int Length
        {
            get
            {
                return _items.Count;
            }
        }

        public bool IsFixedSize
        {
            get
            {
                return false;
            }
        }

        public bool IsReadOnly
        {
            get
            {
                return false;
            }
        }

        public bool IsSynchronized
        {
            get
            {
                return true;
            }
        }

        public ICollection<string> Keys
        {
            get
            {
                return _items.Keys;
            }
        }

        public object SyncRoot
        {
            get
            {
                return _syncroot;
            }
        }

        public ICollection<TItem> Values
        {
            get
            {
                return _items.Values;
            }
        }

        ICollection IDictionary.Keys
        {
            get
            {
                return _items.Keys;
            }
        }

        ICollection IDictionary.Values
        {
            get
            {
                return _items.Values;
            }
        }

        public void Add(KeyValuePair<string, TItem> item)
        {
            _items.Add(item.Key,item.Value);
        }

        public void Add(object key, object value)
        {
            _items.Add(key.ToString(), (TItem)value);
        }

        public void Add(string key, TItem value)
        {
            _items.Add(key, value);
        }

        public void Clear()
        {
            _items.Clear();
        }

        public bool Contains(object key)
        {
            return _items.ContainsKey(key.ToString());
        }

        public bool Contains(KeyValuePair<string, TItem> item)
        {
            return _items.Contains(item);
        }

        public bool ContainsKey(string key)
        {
            return _items.ContainsKey(key);
        }

        public void CopyTo(Array array, int index)
        {
            int i = 0;
            foreach (var entry in _items)
            {
                array.SetValue(entry,index + i++);
            }
        }

        public void CopyTo(KeyValuePair<string, TItem>[] array, int arrayIndex)
        {
            int i = 0;
            foreach( var entry in _items)
            {
                array[arrayIndex + i++] = entry;
            }
        }

        public IEnumerator<KeyValuePair<string, TItem>> GetEnumerator()
        {
            return _items.GetEnumerator();
        }

        public void Remove(object key)
        {
            _items.Remove(key.ToString());
        }

        public bool Remove(KeyValuePair<string, TItem> item)
        {
            return _items.Remove(item.Key);
        }

        public bool Remove(string key)
        {
            return _items.Remove(key);
        }

        public bool TryGetValue(string key, out TItem value)
        {
            return _items.TryGetValue(key, out value);
        }

        IDictionaryEnumerator IDictionary.GetEnumerator()
        {
            return _items.GetEnumerator();
        }

        IEnumerator IEnumerable.GetEnumerator()
        {
            return _items.GetEnumerator();
        }
    }
}
