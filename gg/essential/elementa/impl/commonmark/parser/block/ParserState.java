package gg.essential.elementa.impl.commonmark.parser.block;

import gg.essential.elementa.impl.commonmark.parser.*;

public interface ParserState
{
    SourceLine getLine();
    
    int getIndex();
    
    int getNextNonSpaceIndex();
    
    int getColumn();
    
    int getIndent();
    
    boolean isBlank();
    
    BlockParser getActiveBlockParser();
}
