package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.parser.block.*;

public static class Factory extends AbstractBlockParserFactory
{
    public Factory() {
        super();
    }
    
    @Override
    public BlockStart tryStart(final ParserState state, final MatchedBlockParser matchedBlockParser) {
        if (state.getIndent() >= 4) {
            return BlockStart.none();
        }
        final int nextNonSpace = state.getNextNonSpaceIndex();
        final CharSequence line = state.getLine().getContent();
        if (ThematicBreakParser.access$000(line, nextNonSpace)) {
            return BlockStart.of(new ThematicBreakParser()).atIndex(line.length());
        }
        return BlockStart.none();
    }
}
