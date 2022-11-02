package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.parser.block.*;
import gg.essential.elementa.impl.commonmark.parser.*;

private static class MatchedBlockParserImpl implements MatchedBlockParser
{
    private final BlockParser matchedBlockParser;
    
    public MatchedBlockParserImpl(final BlockParser matchedBlockParser) {
        super();
        this.matchedBlockParser = matchedBlockParser;
    }
    
    @Override
    public BlockParser getMatchedBlockParser() {
        return this.matchedBlockParser;
    }
    
    @Override
    public SourceLines getParagraphLines() {
        if (this.matchedBlockParser instanceof ParagraphParser) {
            final ParagraphParser paragraphParser = (ParagraphParser)this.matchedBlockParser;
            return paragraphParser.getParagraphLines();
        }
        return SourceLines.empty();
    }
}
