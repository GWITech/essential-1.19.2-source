package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.node.*;

private static class ListData
{
    final ListBlock listBlock;
    final int contentColumn;
    
    ListData(final ListBlock listBlock, final int contentColumn) {
        super();
        this.listBlock = listBlock;
        this.contentColumn = contentColumn;
    }
}
