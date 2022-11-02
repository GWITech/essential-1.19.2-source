package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.node.*;
import gg.essential.elementa.impl.commonmark.parser.block.*;
import java.util.regex.*;

public static class Factory extends AbstractBlockParserFactory
{
    public Factory() {
        super();
    }
    
    @Override
    public BlockStart tryStart(final ParserState state, final MatchedBlockParser matchedBlockParser) {
        final int nextNonSpace = state.getNextNonSpaceIndex();
        final CharSequence line = state.getLine().getContent();
        if (state.getIndent() < 4 && line.charAt(nextNonSpace) == '<') {
            for (int blockType = 1; blockType <= 7; ++blockType) {
                if (blockType != 7 || !(matchedBlockParser.getMatchedBlockParser().getBlock() instanceof Paragraph)) {
                    final Pattern opener = HtmlBlockParser.access$000()[blockType][0];
                    final Pattern closer = HtmlBlockParser.access$000()[blockType][1];
                    final boolean matches = opener.matcher(line.subSequence(nextNonSpace, line.length())).find();
                    if (matches) {
                        return BlockStart.of((BlockParser)new HtmlBlockParser(closer, (HtmlBlockParser.HtmlBlockParser$1)null)).atIndex(state.getIndex());
                    }
                }
            }
        }
        return BlockStart.none();
    }
}
