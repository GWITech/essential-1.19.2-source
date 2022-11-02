package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.internal.util.*;
import gg.essential.elementa.impl.commonmark.node.*;
import gg.essential.elementa.impl.commonmark.parser.block.*;

public static class Factory extends AbstractBlockParserFactory
{
    public Factory() {
        super();
    }
    
    @Override
    public BlockStart tryStart(final ParserState state, final MatchedBlockParser matchedBlockParser) {
        if (state.getIndent() >= Parsing.CODE_BLOCK_INDENT && !state.isBlank() && !(state.getActiveBlockParser().getBlock() instanceof Paragraph)) {
            return BlockStart.of((BlockParser)new IndentedCodeBlockParser()).atColumn(state.getColumn() + Parsing.CODE_BLOCK_INDENT);
        }
        return BlockStart.none();
    }
}
