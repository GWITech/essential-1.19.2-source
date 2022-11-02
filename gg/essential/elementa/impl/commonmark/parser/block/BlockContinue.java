package gg.essential.elementa.impl.commonmark.parser.block;

import gg.essential.elementa.impl.commonmark.internal.*;

public class BlockContinue
{
    protected BlockContinue() {
        super();
    }
    
    public static BlockContinue none() {
        return null;
    }
    
    public static BlockContinue atIndex(final int newIndex) {
        return new BlockContinueImpl(newIndex, -1, false);
    }
    
    public static BlockContinue atColumn(final int newColumn) {
        return new BlockContinueImpl(-1, newColumn, false);
    }
    
    public static BlockContinue finished() {
        return new BlockContinueImpl(-1, -1, true);
    }
}
