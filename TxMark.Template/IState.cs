using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Dynamic;

namespace TxMark.Template
{
    public interface IState<TModel> : IDictionary<string, object>, ICollection<KeyValuePair<string, object>>, IEnumerable<KeyValuePair<string, object>>, IEnumerable, INotifyPropertyChanged, IDynamicMetaObjectProvider
    {
        void Push();
        IValue Pop();
        void Write(object value);
        void Write(char value);
        void Write(int value);
        void Write(double value);
        void Write(bool value);
        bool WriteOpenTag(string tagName, bool isClosing, params object[] attributeNameValues);
        void WriteCloseTag(string tagName);
    }
}
