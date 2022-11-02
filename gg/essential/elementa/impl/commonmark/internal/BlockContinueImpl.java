package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.parser.block.*;

public class BlockContinueImpl extends BlockContinue
{
    private final int newIndex;
    private final int newColumn;
    private final boolean finalize;
    
    public BlockContinueImpl(final int newIndex, final int newColumn, final boolean finalize) {
        super();
        this.newIndex = newIndex;
        this.newColumn = newColumn;
        this.finalize = finalize;
    }
    
    public int getNewIndex() {
        return this.newIndex;
    }
    
    public int getNewColumn() {
        return this.newColumn;
    }
    
    public boolean isFinalize() {
        return this.finalize;
    }
}
