using Microsoft.CodeAnalysis;
using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Compiler
{
    public class MetadataReferenceManager
    {
        private List<MetadataReference> _references;
        private HashSet<string> _referencedLocations;
        private HashSet<Type> _referencedTypes;
        public MetadataReferenceManager()
        {
            _references = new List<MetadataReference>();
            _referencedLocations = new HashSet<string>();
            _referencedTypes = new HashSet<Type>();
        }
        public void Clear()
        {
            _references.Clear();
            _referencedLocations.Clear();
            _referencedTypes.Clear();
        }
        public IEnumerable<MetadataReference> References
        {
            get
            {
                return _references;
            }
        }
        public bool Add(Assembly assembly)
        {
            if ( AddAssemblyFile(assembly.Location) )
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        public void Add(Type type)
        {

            if (_referencedTypes.Add(type))
            {
                Add(type.Assembly);
                if (type.IsGenericType)
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
                foreach (var property in type.GetProperties())
                {
                    Add(property.PropertyType);
                }
                foreach (var method in type.GetMethods())
                {
                    Add(method.ReturnType);
                    foreach( var parameter in method.GetParameters())
                    {
                        Add(parameter.ParameterType);
                    }
                }
            }
        }
        public bool AddAssemblyFile(string assemblyFile)
        {
            if (_referencedLocations.Add(assemblyFile))
            {
                Debug.WriteLine("Asssembly referenced: " + assemblyFile);
                _references.Add(MetadataReference.CreateFromFile(assemblyFile));
                return true;
            }
            else {
                return false;
            }
        }
    }
}
