package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.node.*;
import gg.essential.elementa.impl.commonmark.internal.util.*;
import gg.essential.elementa.impl.commonmark.parser.block.*;

public class BlockQuoteParser extends AbstractBlockParser
{
    private final BlockQuote block;
    
    public BlockQuoteParser() {
        super();
        this.block = new BlockQuote();
    }
    
    @Override
    public boolean isContainer() {
        return true;
    }
    
    @Override
    public boolean canContain(final Block block) {
        return true;
    }
    
    @Override
    public BlockQuote getBlock() {
        return this.block;
    }
    
    @Override
    public BlockContinue tryContinue(final ParserState state) {
        final int nextNonSpace = state.getNextNonSpaceIndex();
        if (isMarker(state, nextNonSpace)) {
            int newColumn = state.getColumn() + state.getIndent() + 1;
            if (Parsing.isSpaceOrTab(state.getLine().getContent(), nextNonSpace + 1)) {
                ++newColumn;
            }
            return BlockContinue.atColumn(newColumn);
        }
        return BlockContinue.none();
    }
    
    private static boolean isMarker(final ParserState state, final int index) {
        final CharSequence line = state.getLine().getContent();
        return state.getIndent() < Parsing.CODE_BLOCK_INDENT && index < line.length() && line.charAt(index) == '>';
    }
    
    @Override
    public /* bridge */ Block getBlock() {
        return this.getBlock();
    }
    
    static /* synthetic */ boolean access$000(final ParserState x0, final int x1) {
        return isMarker(x0, x1);
    }
    
    public static class Factory extends AbstractBlockParserFactory
    {
        public Factory() {
            super();
        }
        
        @Override
        public BlockStart tryStart(final ParserState state, final MatchedBlockParser matchedBlockParser) {
            final int nextNonSpace = state.getNextNonSpaceIndex();
            if (isMarker(state, nextNonSpace)) {
                int newColumn = state.getColumn() + state.getIndent() + 1;
                if (Parsing.isSpaceOrTab(state.getLine().getContent(), nextNonSpace + 1)) {
                    ++newColumn;
                }
                return BlockStart.of(new BlockQuoteParser()).atColumn(newColumn);
            }
            return BlockStart.none();
        }
    }
}
