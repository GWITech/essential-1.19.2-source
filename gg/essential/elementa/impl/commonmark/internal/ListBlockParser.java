package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.internal.util.*;
import gg.essential.elementa.impl.commonmark.node.*;
import gg.essential.elementa.impl.commonmark.parser.block.*;

public class ListBlockParser extends AbstractBlockParser
{
    private final ListBlock block;
    private boolean hadBlankLine;
    private int linesAfterBlank;
    
    public ListBlockParser(final ListBlock block) {
        super();
        this.block = block;
    }
    
    @Override
    public boolean isContainer() {
        return true;
    }
    
    @Override
    public boolean canContain(final Block childBlock) {
        if (childBlock instanceof ListItem) {
            if (this.hadBlankLine && this.linesAfterBlank == 1) {
                this.block.setTight(false);
                this.hadBlankLine = false;
            }
            return true;
        }
        return false;
    }
    
    @Override
    public Block getBlock() {
        return this.block;
    }
    
    @Override
    public BlockContinue tryContinue(final ParserState state) {
        if (state.isBlank()) {
            this.hadBlankLine = true;
            this.linesAfterBlank = 0;
        }
        else if (this.hadBlankLine) {
            ++this.linesAfterBlank;
        }
        return BlockContinue.atIndex(state.getIndex());
    }
    
    private static ListData parseList(final CharSequence line, final int markerIndex, final int markerColumn, final boolean inParagraph) {
        final ListMarkerData listMarker = parseListMarker(line, markerIndex);
        if (listMarker == null) {
            return null;
        }
        final ListBlock listBlock = listMarker.listBlock;
        final int indexAfterMarker = listMarker.indexAfterMarker;
        final int markerLength = indexAfterMarker - markerIndex;
        int contentColumn;
        final int columnAfterMarker = contentColumn = markerColumn + markerLength;
        boolean hasContent = false;
        for (int length = line.length(), i = indexAfterMarker; i < length; ++i) {
            final char c = line.charAt(i);
            if (c == '\t') {
                contentColumn += Parsing.columnsToNextTabStop(contentColumn);
            }
            else {
                if (c != ' ') {
                    hasContent = true;
                    break;
                }
                ++contentColumn;
            }
        }
        if (inParagraph) {
            if (listBlock instanceof OrderedList && ((OrderedList)listBlock).getStartNumber() != 1) {
                return null;
            }
            if (!hasContent) {
                return null;
            }
        }
        if (!hasContent || contentColumn - columnAfterMarker > Parsing.CODE_BLOCK_INDENT) {
            contentColumn = columnAfterMarker + 1;
        }
        return new ListData(listBlock, contentColumn);
    }
    
    private static ListMarkerData parseListMarker(final CharSequence line, final int index) {
        final char c = line.charAt(index);
        switch (c) {
            case '*':
            case '+':
            case '-': {
                if (isSpaceTabOrEnd(line, index + 1)) {
                    final BulletList bulletList = new BulletList();
                    bulletList.setBulletMarker(c);
                    return new ListMarkerData(bulletList, index + 1);
                }
                return null;
            }
            default: {
                return parseOrderedList(line, index);
            }
        }
    }
    
    private static ListMarkerData parseOrderedList(final CharSequence line, final int index) {
        int digits = 0;
        final int length = line.length();
        int i = index;
        while (i < length) {
            final char c = line.charAt(i);
            switch (c) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9': {
                    if (++digits > 9) {
                        return null;
                    }
                    ++i;
                    continue;
                }
                case ')':
                case '.': {
                    if (digits >= 1 && isSpaceTabOrEnd(line, i + 1)) {
                        final String number = line.subSequence(index, i).toString();
                        final OrderedList orderedList = new OrderedList();
                        orderedList.setStartNumber(Integer.parseInt(number));
                        orderedList.setDelimiter(c);
                        return new ListMarkerData(orderedList, i + 1);
                    }
                    return null;
                }
                default: {
                    return null;
                }
            }
        }
        return null;
    }
    
    private static boolean isSpaceTabOrEnd(final CharSequence line, final int index) {
        if (index >= line.length()) {
            return true;
        }
        switch (line.charAt(index)) {
            case '\t':
            case ' ': {
                return true;
            }
            default: {
                return false;
            }
        }
    }
    
    private static boolean listsMatch(final ListBlock a, final ListBlock b) {
        if (a instanceof BulletList && b instanceof BulletList) {
            return equals(((BulletList)a).getBulletMarker(), ((BulletList)b).getBulletMarker());
        }
        return a instanceof OrderedList && b instanceof OrderedList && equals(((OrderedList)a).getDelimiter(), ((OrderedList)b).getDelimiter());
    }
    
    private static boolean equals(final Object a, final Object b) {
        return (a == null) ? (b == null) : a.equals(b);
    }
    
    static /* synthetic */ ListData access$000(final CharSequence x0, final int x1, final int x2, final boolean x3) {
        return parseList(x0, x1, x2, x3);
    }
    
    static /* synthetic */ boolean access$100(final ListBlock x0, final ListBlock x1) {
        return listsMatch(x0, x1);
    }
    
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
            final ListData listData = parseList(state.getLine().getContent(), markerIndex, markerColumn, inParagraph);
            if (listData == null) {
                return BlockStart.none();
            }
            final int newColumn = listData.contentColumn;
            final ListItemParser listItemParser = new ListItemParser(newColumn - state.getColumn());
            if (!(matched instanceof ListBlockParser) || !listsMatch((ListBlock)matched.getBlock(), listData.listBlock)) {
                final ListBlockParser listBlockParser = new ListBlockParser(listData.listBlock);
                listData.listBlock.setTight(true);
                return BlockStart.of(listBlockParser, listItemParser).atColumn(newColumn);
            }
            return BlockStart.of(listItemParser).atColumn(newColumn);
        }
    }
    
    private static class ListData
    {
        final ListBlock listBlock;
        final int contentColumn;
        
        ListData(final ListBlock listBlock, final int contentColumn) {
            super();
            this.listBlock = listBlock;
            this.contentColumn = contentColumn;
        }
    }
    
    private static class ListMarkerData
    {
        final ListBlock listBlock;
        final int indexAfterMarker;
        
        ListMarkerData(final ListBlock listBlock, final int indexAfterMarker) {
            super();
            this.listBlock = listBlock;
            this.indexAfterMarker = indexAfterMarker;
        }
    }
}
