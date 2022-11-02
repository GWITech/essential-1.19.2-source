package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.node.*;
import gg.essential.elementa.impl.commonmark.parser.*;
import gg.essential.elementa.impl.commonmark.internal.inline.*;
import gg.essential.elementa.impl.commonmark.internal.util.*;
import gg.essential.elementa.impl.commonmark.parser.block.*;

public class HeadingParser extends AbstractBlockParser
{
    private final Heading block;
    private final SourceLines content;
    
    public HeadingParser(final int level, final SourceLines content) {
        super();
        (this.block = new Heading()).setLevel(level);
        this.content = content;
    }
    
    @Override
    public Block getBlock() {
        return this.block;
    }
    
    @Override
    public BlockContinue tryContinue(final ParserState parserState) {
        return BlockContinue.none();
    }
    
    @Override
    public void parseInlines(final InlineParser inlineParser) {
        inlineParser.parse(this.content, this.block);
    }
    
    private static HeadingParser getAtxHeading(final SourceLine line) {
        final Scanner scanner = Scanner.of(SourceLines.of(line));
        final int level = scanner.matchMultiple('#');
        if (level == 0 || level > 6) {
            return null;
        }
        if (!scanner.hasNext()) {
            return new HeadingParser(level, SourceLines.empty());
        }
        final char next = scanner.peek();
        if (next != ' ' && next != '\t') {
            return null;
        }
        scanner.whitespace();
        Position end;
        final Position start = end = scanner.position();
        boolean hashCanEnd = true;
        while (scanner.hasNext()) {
            final char c = scanner.peek();
            switch (c) {
                case '#': {
                    if (hashCanEnd) {
                        scanner.matchMultiple('#');
                        final int whitespace = scanner.whitespace();
                        if (scanner.hasNext()) {
                            end = scanner.position();
                        }
                        hashCanEnd = (whitespace > 0);
                        continue;
                    }
                    scanner.next();
                    end = scanner.position();
                    continue;
                }
                case '\t':
                case ' ': {
                    hashCanEnd = true;
                    scanner.next();
                    continue;
                }
                default: {
                    hashCanEnd = false;
                    scanner.next();
                    end = scanner.position();
                    continue;
                }
            }
        }
        final SourceLines source = scanner.getSource(start, end);
        final String content = source.getContent();
        if (content.isEmpty()) {
            return new HeadingParser(level, SourceLines.empty());
        }
        return new HeadingParser(level, source);
    }
    
    private static int getSetextHeadingLevel(final CharSequence line, final int index) {
        switch (line.charAt(index)) {
            case '=': {
                if (isSetextHeadingRest(line, index + 1, '=')) {
                    return 1;
                }
            }
            case '-': {
                if (isSetextHeadingRest(line, index + 1, '-')) {
                    return 2;
                }
                break;
            }
        }
        return 0;
    }
    
    private static boolean isSetextHeadingRest(final CharSequence line, final int index, final char marker) {
        final int afterMarker = Parsing.skip(marker, line, index, line.length());
        final int afterSpace = Parsing.skipSpaceTab(line, afterMarker, line.length());
        return afterSpace >= line.length();
    }
    
    static /* synthetic */ HeadingParser access$000(final SourceLine x0) {
        return getAtxHeading(x0);
    }
    
    static /* synthetic */ int access$100(final CharSequence x0, final int x1) {
        return getSetextHeadingLevel(x0, x1);
    }
    
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
                final HeadingParser atxHeading = getAtxHeading(line.substring(nextNonSpace, line.getContent().length()));
                if (atxHeading != null) {
                    return BlockStart.of(atxHeading).atIndex(line.getContent().length());
                }
            }
            final int setextHeadingLevel = getSetextHeadingLevel(line.getContent(), nextNonSpace);
            if (setextHeadingLevel > 0) {
                final SourceLines paragraph = matchedBlockParser.getParagraphLines();
                if (!paragraph.isEmpty()) {
                    return BlockStart.of(new HeadingParser(setextHeadingLevel, paragraph)).atIndex(line.getContent().length()).replaceActiveBlockParser();
                }
            }
            return BlockStart.none();
        }
    }
}
