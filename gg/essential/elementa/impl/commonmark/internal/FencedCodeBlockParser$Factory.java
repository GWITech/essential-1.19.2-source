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
        final int indent = state.getIndent();
        if (indent >= Parsing.CODE_BLOCK_INDENT) {
            return BlockStart.none();
        }
        final int nextNonSpace = state.getNextNonSpaceIndex();
        final FencedCodeBlockParser blockParser = FencedCodeBlockParser.access$000(state.getLine().getContent(), nextNonSpace, indent);
        if (blockParser != null) {
            return BlockStart.of(blockParser).atIndex(nextNonSpace + FencedCodeBlockParser.access$100(blockParser).getFenceLength());
        }
        return BlockStart.none();
    }
}
