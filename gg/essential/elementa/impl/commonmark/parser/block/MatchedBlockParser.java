package gg.essential.elementa.impl.commonmark.parser.block;

import gg.essential.elementa.impl.commonmark.parser.*;

public interface MatchedBlockParser
{
    BlockParser getMatchedBlockParser();
    
    SourceLines getParagraphLines();
}
