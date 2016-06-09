using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Dynamic;

namespace TxMark.Template
{
    public interface IState<TModel> : IDynamicMetaObjectProvider, IDictionary<string, object>, ICollection<KeyValuePair<string, object>>, IEnumerable<KeyValuePair<string, object>>, IEnumerable, INotifyPropertyChanged
    {
        IViewOptions ViewOptions { get; }
        void Push();
        IValue Pop();
        void Write(IValue value);
        void Write(object value);
        void Write(string value);
        void Write(char value);
        void Write(int value);
        void Write(double value);
        void Write(bool value);
        bool WriteOpenTag(string tagName, IDictionary<string, object> attributes);
        void WriteCloseTag(string tagName);
    }
}
