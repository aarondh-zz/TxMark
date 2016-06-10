using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TxMark.Template
{
    public class MappingHtmlTemplateFormatter : HtmlTemplateFormatter
    {
        public enum MergeOptions
        {
            Replace,
            Intersect,
            Union
        }

        public class TagMap
        {
            public string SourceTag { get; private set; }
            public string TargetTag { get; private set; }
            public MergeOptions Merge { get; private set; }
            private Dictionary<string, string> _attributes;
            public IDictionary<string, string> Attributes
            {
                get
                {
                    if (_attributes != null)
                    {
                        _attributes = new Dictionary<string, string>();
                    }
                    return _attributes;
                }
            }

            public bool HasAttributes
            {
                get
                {
                    return _attributes != null && _attributes.Count > 0;
                }
            }

            public TagMap(string sourceTag, string targetTag, IDictionary<string,string> attributes, MergeOptions mergeOptions)
            {
                this.SourceTag = sourceTag;
                this.TargetTag = targetTag;
                if (attributes != null)
                {
                    _attributes = new Dictionary<string, string>(attributes);
                }
                this.Merge = mergeOptions;
            }
        }
        public enum NoMapOptions
        {
            Default,
            Output,
            Ignore,
            Wildcard
        }
        public NoMapOptions NoMap { get; set; }
        private Dictionary<string, TagMap> _tagMaps = new Dictionary<string, TagMap>( StringComparer.InvariantCultureIgnoreCase );
        public void Map( string sourceTag, string targetTag, IDictionary<string,string> attributes, MergeOptions merge = MergeOptions.Union)
        {
            _tagMaps.Add(sourceTag, new TagMap(sourceTag, targetTag, attributes, merge));
            if ( sourceTag == "*" && this.NoMap == NoMapOptions.Default)
            {
                this.NoMap = NoMapOptions.Wildcard;
            }
        }
        private TagMap GetMap( string sourceTag, IDictionary<string, string> attributes)
        {
            TagMap tagMap;
            if (!_tagMaps.TryGetValue(sourceTag, out tagMap))
            {
                switch (this.NoMap)
                {
                    case NoMapOptions.Ignore:
                        return null;
                    case NoMapOptions.Default:
                    case NoMapOptions.Output:
                        return new TagMap(sourceTag, sourceTag, attributes, MergeOptions.Replace);
                    case NoMapOptions.Wildcard:
                        if (!_tagMaps.TryGetValue(sourceTag, out tagMap))
                        {
                            throw new Exception("NoMapOption.WildCard specified but no wildcard mapping found.");
                        }
                        break;
                }
            }
            return tagMap;
        }
        public override bool WriteOpenTag(TextWriter writer, string tagName, bool isClosing, IDictionary<string, string> attributes)
        {
            var tagMap = GetMap(tagName, attributes);
            Dictionary<string, string> targetAttributes;
            switch(tagMap.Merge)
            {
                case MergeOptions.Replace:
                    targetAttributes = new Dictionary<string, string>(tagMap.Attributes);
                    break;
                case MergeOptions.Intersect:
                    targetAttributes = new Dictionary<string, string>();
                    if ( tagMap.HasAttributes )
                    {
                        foreach( var entry in attributes)
                        {
                            if ( tagMap.Attributes.ContainsKey(entry.Key))
                            {
                                string targetValue = tagMap.Attributes[entry.Key];
                                if (string.IsNullOrEmpty(targetValue))
                                {
                                    targetAttributes[entry.Key] = entry.Value;
                                }
                                else
                                {
                                    targetAttributes[entry.Key] = targetValue;
                                }
                            }
                        }
                    }
                    break;
                case MergeOptions.Union:
                    targetAttributes = new Dictionary<string, string>(attributes);
                    foreach (var entry in tagMap.Attributes)
                    {
                        string targetValue = tagMap.Attributes[entry.Key];
                        if (string.IsNullOrEmpty(targetValue))
                        {
                            if ( !targetAttributes.ContainsKey(entry.Key) )
                            {
                                targetAttributes.Add(entry.Key, entry.Value);
                            }
                        }
                        else
                        {
                            targetAttributes[entry.Key] = targetValue;
                        }
                    }
                    break;
                default:
                    throw new NotSupportedException();
            }
            return base.WriteOpenTag(writer, tagMap.TargetTag, isClosing, targetAttributes);
        }

        public override void WriteCloseTag(TextWriter writer, string tagName)
        {
            TagMap tagMap = GetMap(tagName, null);
           
            base.WriteCloseTag(writer, tagMap.TargetTag);
        }
    }
}
