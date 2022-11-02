package gg.essential.elementa.impl.commonmark.parser;

import java.util.*;
import gg.essential.elementa.impl.commonmark.parser.delimiter.*;
import gg.essential.elementa.impl.commonmark.node.*;

public interface InlineParserContext
{
    List<DelimiterProcessor> getCustomDelimiterProcessors();
    
    LinkReferenceDefinition getLinkReferenceDefinition(final String p0);
}
