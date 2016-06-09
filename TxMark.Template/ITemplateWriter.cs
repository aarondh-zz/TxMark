using System.Collections.Generic;
using System.IO;

namespace TxMark.Template
{
    public interface ITemplateWriter
    {
        void Write(TextWriter writer, IValue value);
        void Write(TextWriter writer, object value);
        void Write(TextWriter writer, string value);
        void Write(TextWriter writer, char value);
        void Write(TextWriter writer, int value);
        void Write(TextWriter writer, double value);
        void Write(TextWriter writer, bool value);
        bool WriteOpenTag(TextWriter writer, string tagName, bool isClosing, IDictionary<string, string> attributes);
        void WriteCloseTag(TextWriter writer, string tagName);
    }
}
