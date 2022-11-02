package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.node.*;
import gg.essential.elementa.impl.commonmark.parser.block.*;
import gg.essential.elementa.impl.commonmark.parser.*;

public class DocumentBlockParser extends AbstractBlockParser
{
    private final Document document;
    
    public DocumentBlockParser() {
        super();
        this.document = new Document();
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
    public Document getBlock() {
        return this.document;
    }
    
    @Override
    public BlockContinue tryContinue(final ParserState state) {
        return BlockContinue.atIndex(state.getIndex());
    }
    
    @Override
    public void addLine(final SourceLine line) {
    }
    
    @Override
    public /* bridge */ Block getBlock() {
        return this.getBlock();
    }
}
