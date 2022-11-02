package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.internal.util.*;
import gg.essential.elementa.impl.commonmark.parser.block.*;

public static class Factory extends AbstractBlockParserFactory
{
    public Factory() {
        super();
    }
    
    @Override
    public BlockStart tryStart(final ParserState state, final MatchedBlockParser matchedBlockParser) {
        final int nextNonSpace = state.getNextNonSpaceIndex();
        if (BlockQuoteParser.access$000(state, nextNonSpace)) {
            int newColumn = state.getColumn() + state.getIndent() + 1;
            if (Parsing.isSpaceOrTab(state.getLine().getContent(), nextNonSpace + 1)) {
                ++newColumn;
            }
            return BlockStart.of(new BlockQuoteParser()).atColumn(newColumn);
        }
        return BlockStart.none();
    }
}
