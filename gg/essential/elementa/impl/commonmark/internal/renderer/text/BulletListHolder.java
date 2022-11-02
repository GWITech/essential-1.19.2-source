package gg.essential.elementa.impl.commonmark.internal.renderer.text;

import gg.essential.elementa.impl.commonmark.node.*;

public class BulletListHolder extends ListHolder
{
    private final char marker;
    
    public BulletListHolder(final ListHolder parent, final BulletList list) {
        super(parent);
        this.marker = list.getBulletMarker();
    }
    
    public char getMarker() {
        return this.marker;
    }
}
