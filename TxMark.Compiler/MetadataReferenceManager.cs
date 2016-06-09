using Microsoft.CodeAnalysis;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Compiler
{
    public class MetadataReferenceManager
    {
        private List<MetadataReference> _references = new List<MetadataReference>();
        private HashSet<string> _referencedLocations = new HashSet<string>();
        private HashSet<Type> _referencedTypes = new HashSet<Type>();
        public MetadataReferenceManager()
        {

        }
        public IEnumerable<MetadataReference> References
        {
            get
            {
                return _references;
            }
        }
        public void Add( Assembly assembly)
        {
            AddAssemblyFile(assembly.Location);
        }
        public void Add(Type type)
        {

            if (_referencedTypes.Add(type))
            {
                Add(type.Assembly);
                if (type.IsConstructedGenericType)
                {
                    foreach (var genericArg in type.GetGenericArguments())
                    {
                        Add(genericArg);
                    }
                }
                if (type.BaseType != null)
                {
                    Add(type.BaseType);
                }
                foreach (var interfaceType in type.GetInterfaces())
                {
                    Add(interfaceType);
                }
            }
        }
        public void AddAssemblyFile(string assemblyFile)
        {
            if (_referencedLocations.Add(assemblyFile))
            {
                _references.Add(MetadataReference.CreateFromFile(assemblyFile));
            }
        }
    }
}
