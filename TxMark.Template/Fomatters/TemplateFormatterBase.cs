using System.Collections.Generic;
using System.IO;

namespace TxMark.Template.Formatters
{
    public abstract class TemplateFormatterBase : ITemplateFormatter
    {
        public virtual void Write(TextWriter writer, string value)
        {
            writer.Write(value);
        }

        public virtual void Write(TextWriter writer, int value)
        {
            writer.Write(value);
        }

        public virtual void Write(TextWriter writer, bool value)
        {
            writer.Write(value);
        }

        public virtual void Write(TextWriter writer, double value)
        {
            writer.Write(value);
        }

        public virtual void Write(TextWriter writer, char value)
        {
            writer.Write(value);
        }

        public virtual void Write(TextWriter writer, object value)
        {
            writer.Write(value);
        }

        public virtual void Write(TextWriter writer, IValue value)
        {
            writer.Write(value);
        }

        public abstract void WriteCloseTag(TextWriter writer, string tagName);

        public abstract bool WriteOpenTag(TextWriter writer, string tagName, bool hasContent, IDictionary<string, string> attributes);
    }
}
