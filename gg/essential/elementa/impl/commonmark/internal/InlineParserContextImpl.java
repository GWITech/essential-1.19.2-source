package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.parser.*;
import gg.essential.elementa.impl.commonmark.parser.delimiter.*;
import java.util.*;
import gg.essential.elementa.impl.commonmark.node.*;

public class InlineParserContextImpl implements InlineParserContext
{
    private final List<DelimiterProcessor> delimiterProcessors;
    private final Map<String, LinkReferenceDefinition> linkReferenceDefinitions;
    
    public InlineParserContextImpl(final List<DelimiterProcessor> delimiterProcessors, final Map<String, LinkReferenceDefinition> linkReferenceDefinitions) {
        super();
        this.delimiterProcessors = delimiterProcessors;
        this.linkReferenceDefinitions = linkReferenceDefinitions;
    }
    
    @Override
    public List<DelimiterProcessor> getCustomDelimiterProcessors() {
        return this.delimiterProcessors;
    }
    
    @Override
    public LinkReferenceDefinition getLinkReferenceDefinition(final String label) {
        return this.linkReferenceDefinitions.get(label);
    }
}
