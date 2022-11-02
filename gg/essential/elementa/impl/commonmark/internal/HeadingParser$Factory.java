package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.internal.util.*;
import gg.essential.elementa.impl.commonmark.parser.block.*;
import gg.essential.elementa.impl.commonmark.parser.*;

public static class Factory extends AbstractBlockParserFactory
{
    public Factory() {
        super();
    }
    
    @Override
    public BlockStart tryStart(final ParserState state, final MatchedBlockParser matchedBlockParser) {
        if (state.getIndent() >= Parsing.CODE_BLOCK_INDENT) {
            return BlockStart.none();
        }
        final SourceLine line = state.getLine();
        final int nextNonSpace = state.getNextNonSpaceIndex();
        if (line.getContent().charAt(nextNonSpace) == '#') {
            final HeadingParser atxHeading = HeadingParser.access$000(line.substring(nextNonSpace, line.getContent().length()));
            if (atxHeading != null) {
                return BlockStart.of(atxHeading).atIndex(line.getContent().length());
            }
        }
        final int setextHeadingLevel = HeadingParser.access$100(line.getContent(), nextNonSpace);
        if (setextHeadingLevel > 0) {
            final SourceLines paragraph = matchedBlockParser.getParagraphLines();
            if (!paragraph.isEmpty()) {
                return BlockStart.of(new HeadingParser(setextHeadingLevel, paragraph)).atIndex(line.getContent().length()).replaceActiveBlockParser();
            }
        }
        return BlockStart.none();
    }
}
