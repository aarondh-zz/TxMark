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
    public class ListValue<TItem> : IListValue, IList<TItem>
    {
        private List<TItem> _items;
        public ListValue()
        {
            _items = new List<TItem>();
        }

        public ListValue(int capacity)
        {
            _items = new List<TItem>(capacity);
        }

        public ListValue(IEnumerable<TItem> items)
        {
            _items = new List<TItem>(items);
        }

        public TItem this[int index]
        {
            get
            {
                return _items[index];
            }

            set
            {
                _items[index] = value;
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

        public bool IsReadOnly
        {
            get
            {
                return false;
            }
        }

        public void Add(TItem item)
        {
            _items.Add(item);
        }

        public void Clear()
        {
            _items.Clear();
        }

        public bool Contains(TItem item)
        {
            return _items.Contains(item);
        }

        public void CopyTo(TItem[] array, int arrayIndex)
        {
            _items.CopyTo(array, arrayIndex);
        }

        public IEnumerator<TItem> GetEnumerator()
        {
            return _items.GetEnumerator();
        }

        public int IndexOf(TItem item)
        {
            return _items.IndexOf(item);
        }

        public void Insert(int index, TItem item)
        {
            _items.Insert(index, item);
        }

        public bool Remove(TItem item)
        {
            return _items.Remove(item);
        }

        public void RemoveAt(int index)
        {
            _items.RemoveAt(index);
        }

        IEnumerator IEnumerable.GetEnumerator()
        {
            return _items.GetEnumerator();
        }
        public override string ToString()
        {
            switch (_items.Count)
            {
                case 0:
                    return "";
                case 1:
                    return _items[0]?.ToString();
                case 2:
                    return $"{_items[0]} and {_items[1]}";
            }
            var result = new StringBuilder();
            for( int i = 0; i < _items.Count - 1; i++)
            {
                if ( result.Length > 0)
                {
                    result.Append(", ");
                }
                result.Append(_items[i]);
            }

            result.Append(" and ");

            result.Append(_items[_items.Count-1]);

            return result.ToString();
        }
    }
}
