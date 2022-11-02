package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.parser.block.*;

private static class OpenBlockParser
{
    private final BlockParser blockParser;
    private int sourceIndex;
    
    OpenBlockParser(final BlockParser blockParser, final int sourceIndex) {
        super();
        this.blockParser = blockParser;
        this.sourceIndex = sourceIndex;
    }
    
    static /* synthetic */ BlockParser access$000(final OpenBlockParser x0) {
        return x0.blockParser;
    }
    
    static /* synthetic */ int access$102(final OpenBlockParser x0, final int x1) {
        return x0.sourceIndex = x1;
    }
    
    static /* synthetic */ int access$100(final OpenBlockParser x0) {
        return x0.sourceIndex;
    }
}
