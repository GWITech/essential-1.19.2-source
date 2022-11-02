package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.parser.block.*;

public class BlockStartImpl extends BlockStart
{
    private final BlockParser[] blockParsers;
    private int newIndex;
    private int newColumn;
    private boolean replaceActiveBlockParser;
    
    public BlockStartImpl(final BlockParser... blockParsers) {
        super();
        this.newIndex = -1;
        this.newColumn = -1;
        this.replaceActiveBlockParser = false;
        this.blockParsers = blockParsers;
    }
    
    public BlockParser[] getBlockParsers() {
        return this.blockParsers;
    }
    
    public int getNewIndex() {
        return this.newIndex;
    }
    
    public int getNewColumn() {
        return this.newColumn;
    }
    
    public boolean isReplaceActiveBlockParser() {
        return this.replaceActiveBlockParser;
    }
    
    @Override
    public BlockStart atIndex(final int newIndex) {
        this.newIndex = newIndex;
        return this;
    }
    
    @Override
    public BlockStart atColumn(final int newColumn) {
        this.newColumn = newColumn;
        return this;
    }
    
    @Override
    public BlockStart replaceActiveBlockParser() {
        this.replaceActiveBlockParser = true;
        return this;
    }
}
