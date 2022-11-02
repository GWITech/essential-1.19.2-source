package gg.essential.elementa.impl.commonmark.parser.block;

import gg.essential.elementa.impl.commonmark.node.*;
import gg.essential.elementa.impl.commonmark.parser.*;

public interface BlockParser
{
    boolean isContainer();
    
    boolean canHaveLazyContinuationLines();
    
    boolean canContain(final Block p0);
    
    Block getBlock();
    
    BlockContinue tryContinue(final ParserState p0);
    
    void addLine(final SourceLine p0);
    
    void addSourceSpan(final SourceSpan p0);
    
    void closeBlock();
    
    void parseInlines(final InlineParser p0);
}
