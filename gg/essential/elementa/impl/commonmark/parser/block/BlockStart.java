package gg.essential.elementa.impl.commonmark.parser.block;

import gg.essential.elementa.impl.commonmark.internal.*;

public abstract class BlockStart
{
    protected BlockStart() {
        super();
    }
    
    public static BlockStart none() {
        return null;
    }
    
    public static BlockStart of(final BlockParser... blockParsers) {
        return new BlockStartImpl(blockParsers);
    }
    
    public abstract BlockStart atIndex(final int p0);
    
    public abstract BlockStart atColumn(final int p0);
    
    public abstract BlockStart replaceActiveBlockParser();
}
