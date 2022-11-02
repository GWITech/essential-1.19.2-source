package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.node.*;
import gg.essential.elementa.impl.commonmark.parser.block.*;

public class ThematicBreakParser extends AbstractBlockParser
{
    private final ThematicBreak block;
    
    public ThematicBreakParser() {
        super();
        this.block = new ThematicBreak();
    }
    
    @Override
    public Block getBlock() {
        return this.block;
    }
    
    @Override
    public BlockContinue tryContinue(final ParserState state) {
        return BlockContinue.none();
    }
    
    private static boolean isThematicBreak(final CharSequence line, final int index) {
        int dashes = 0;
        int underscores = 0;
        int asterisks = 0;
        for (int length = line.length(), i = index; i < length; ++i) {
            switch (line.charAt(i)) {
                case '-': {
                    ++dashes;
                    break;
                }
                case '_': {
                    ++underscores;
                    break;
                }
                case '*': {
                    ++asterisks;
                    break;
                }
                case '\t':
                case ' ': {
                    break;
                }
                default: {
                    return false;
                }
            }
        }
        return (dashes >= 3 && underscores == 0 && asterisks == 0) || (underscores >= 3 && dashes == 0 && asterisks == 0) || (asterisks >= 3 && dashes == 0 && underscores == 0);
    }
    
    static /* synthetic */ boolean access$000(final CharSequence x0, final int x1) {
        return isThematicBreak(x0, x1);
    }
    
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
            if (isThematicBreak(line, nextNonSpace)) {
                return BlockStart.of(new ThematicBreakParser()).atIndex(line.length());
            }
            return BlockStart.none();
        }
    }
}
