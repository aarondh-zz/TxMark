using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Compiler
{
    public interface IContent
    {
        void Boolean(bool boolean);
        void Punctuation(char punctuation);
        void NameTag(string nameTag);
        void Null();
        void Number(string numberText);
        void Text(string text);
        void Variable(string variableName);
        void Word(string word);
        void Quote(string quote);
        void Whitespace();
        void NewLine();
    }
}
