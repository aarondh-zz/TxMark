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
            throw new NotImplementedException();
        }

    }
}
