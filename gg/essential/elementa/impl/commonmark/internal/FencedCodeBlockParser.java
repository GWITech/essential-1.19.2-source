package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.node.*;
import gg.essential.elementa.impl.commonmark.parser.*;
import gg.essential.elementa.impl.commonmark.internal.util.*;
import gg.essential.elementa.impl.commonmark.parser.block.*;

public class FencedCodeBlockParser extends AbstractBlockParser
{
    private final FencedCodeBlock block;
    private String firstLine;
    private StringBuilder otherLines;
    
    public FencedCodeBlockParser(final char fenceChar, final int fenceLength, final int fenceIndent) {
        super();
        this.block = new FencedCodeBlock();
        this.otherLines = new StringBuilder();
        this.block.setFenceChar(fenceChar);
        this.block.setFenceLength(fenceLength);
        this.block.setFenceIndent(fenceIndent);
    }
    
    @Override
    public Block getBlock() {
        return this.block;
    }
    
    @Override
    public BlockContinue tryContinue(final ParserState state) {
        final int nextNonSpace = state.getNextNonSpaceIndex();
        int newIndex = state.getIndex();
        final CharSequence line = state.getLine().getContent();
        if (state.getIndent() < Parsing.CODE_BLOCK_INDENT && nextNonSpace < line.length() && line.charAt(nextNonSpace) == this.block.getFenceChar() && this.isClosing(line, nextNonSpace)) {
            return BlockContinue.finished();
        }
        for (int i = this.block.getFenceIndent(), length = line.length(); i > 0 && newIndex < length && line.charAt(newIndex) == ' '; ++newIndex, --i) {}
        return BlockContinue.atIndex(newIndex);
    }
    
    @Override
    public void addLine(final SourceLine line) {
        if (this.firstLine == null) {
            this.firstLine = line.getContent().toString();
        }
        else {
            this.otherLines.append(line.getContent());
            this.otherLines.append('\n');
        }
    }
    
    @Override
    public void closeBlock() {
        this.block.setInfo(Escaping.unescapeString(this.firstLine.trim()));
        this.block.setLiteral(this.otherLines.toString());
    }
    
    private static FencedCodeBlockParser checkOpener(final CharSequence line, final int index, final int indent) {
        int backticks = 0;
        int tildes = 0;
    Label_0077:
        for (int length = line.length(), i = index; i < length; ++i) {
            switch (line.charAt(i)) {
                case '`': {
                    ++backticks;
                    break;
                }
                case '~': {
                    ++tildes;
                    break;
                }
                default: {
                    break Label_0077;
                }
            }
        }
        if (backticks >= 3 && tildes == 0) {
            if (Parsing.find('`', line, index + backticks) != -1) {
                return null;
            }
            return new FencedCodeBlockParser('`', backticks, indent);
        }
        else {
            if (tildes >= 3 && backticks == 0) {
                return new FencedCodeBlockParser('~', tildes, indent);
            }
            return null;
        }
    }
    
    private boolean isClosing(final CharSequence line, final int index) {
        final char fenceChar = this.block.getFenceChar();
        final int fenceLength = this.block.getFenceLength();
        final int fences = Parsing.skip(fenceChar, line, index, line.length()) - index;
        if (fences < fenceLength) {
            return false;
        }
        final int after = Parsing.skipSpaceTab(line, index + fences, line.length());
        return after == line.length();
    }
    
    static /* synthetic */ FencedCodeBlockParser access$000(final CharSequence x0, final int x1, final int x2) {
        return checkOpener(x0, x1, x2);
    }
    
    static /* synthetic */ FencedCodeBlock access$100(final FencedCodeBlockParser x0) {
        return x0.block;
    }
    
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
            final FencedCodeBlockParser blockParser = checkOpener(state.getLine().getContent(), nextNonSpace, indent);
            if (blockParser != null) {
                return BlockStart.of(blockParser).atIndex(nextNonSpace + blockParser.block.getFenceLength());
            }
            return BlockStart.none();
        }
    }
}
