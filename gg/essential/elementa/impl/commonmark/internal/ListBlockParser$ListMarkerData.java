package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.node.*;

private static class ListMarkerData
{
    final ListBlock listBlock;
    final int indexAfterMarker;
    
    ListMarkerData(final ListBlock listBlock, final int indexAfterMarker) {
        super();
        this.listBlock = listBlock;
        this.indexAfterMarker = indexAfterMarker;
    }
}
