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
        final BlockParser matched = matchedBlockParser.getMatchedBlockParser();
        if (state.getIndent() >= Parsing.CODE_BLOCK_INDENT) {
            return BlockStart.none();
        }
        final int markerIndex = state.getNextNonSpaceIndex();
        final int markerColumn = state.getColumn() + state.getIndent();
        final boolean inParagraph = !matchedBlockParser.getParagraphLines().isEmpty();
        final ListData listData = ListBlockParser.access$000(state.getLine().getContent(), markerIndex, markerColumn, inParagraph);
        if (listData == null) {
            return BlockStart.none();
        }
        final int newColumn = listData.contentColumn;
        final ListItemParser listItemParser = new ListItemParser(newColumn - state.getColumn());
        if (!(matched instanceof ListBlockParser) || !ListBlockParser.access$100((ListBlock)matched.getBlock(), listData.listBlock)) {
            final ListBlockParser listBlockParser = new ListBlockParser(listData.listBlock);
            listData.listBlock.setTight(true);
            return BlockStart.of(listBlockParser, listItemParser).atColumn(newColumn);
        }
        return BlockStart.of(listItemParser).atColumn(newColumn);
    }
}
