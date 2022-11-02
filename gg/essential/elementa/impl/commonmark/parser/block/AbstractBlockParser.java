package gg.essential.elementa.impl.commonmark.parser.block;

import gg.essential.elementa.impl.commonmark.node.*;
import gg.essential.elementa.impl.commonmark.parser.*;

public abstract class AbstractBlockParser implements BlockParser
{
    public AbstractBlockParser() {
        super();
    }
    
    @Override
    public boolean isContainer() {
        return false;
    }
    
    @Override
    public boolean canHaveLazyContinuationLines() {
        return false;
    }
    
    @Override
    public boolean canContain(final Block childBlock) {
        return false;
    }
    
    @Override
    public void addLine(final SourceLine line) {
    }
    
    @Override
    public void addSourceSpan(final SourceSpan sourceSpan) {
        this.getBlock().addSourceSpan(sourceSpan);
    }
    
    @Override
    public void closeBlock() {
    }
    
    @Override
    public void parseInlines(final InlineParser inlineParser) {
    }
}
