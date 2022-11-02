package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.parser.block.*;
import gg.essential.elementa.impl.commonmark.parser.*;
import java.util.*;
import gg.essential.elementa.impl.commonmark.node.*;

public class ParagraphParser extends AbstractBlockParser
{
    private final Paragraph block;
    private final LinkReferenceDefinitionParser linkReferenceDefinitionParser;
    
    public ParagraphParser() {
        super();
        this.block = new Paragraph();
        this.linkReferenceDefinitionParser = new LinkReferenceDefinitionParser();
    }
    
    @Override
    public boolean canHaveLazyContinuationLines() {
        return true;
    }
    
    @Override
    public Block getBlock() {
        return this.block;
    }
    
    @Override
    public BlockContinue tryContinue(final ParserState state) {
        if (!state.isBlank()) {
            return BlockContinue.atIndex(state.getIndex());
        }
        return BlockContinue.none();
    }
    
    @Override
    public void addLine(final SourceLine line) {
        this.linkReferenceDefinitionParser.parse(line);
    }
    
    @Override
    public void addSourceSpan(final SourceSpan sourceSpan) {
        this.linkReferenceDefinitionParser.addSourceSpan(sourceSpan);
    }
    
    @Override
    public void closeBlock() {
        if (this.linkReferenceDefinitionParser.getParagraphLines().isEmpty()) {
            this.block.unlink();
        }
        else {
            this.block.setSourceSpans(this.linkReferenceDefinitionParser.getParagraphSourceSpans());
        }
    }
    
    @Override
    public void parseInlines(final InlineParser inlineParser) {
        final SourceLines lines = this.linkReferenceDefinitionParser.getParagraphLines();
        if (!lines.isEmpty()) {
            inlineParser.parse(lines, this.block);
        }
    }
    
    public SourceLines getParagraphLines() {
        return this.linkReferenceDefinitionParser.getParagraphLines();
    }
    
    public List<LinkReferenceDefinition> getDefinitions() {
        return this.linkReferenceDefinitionParser.getDefinitions();
    }
}
