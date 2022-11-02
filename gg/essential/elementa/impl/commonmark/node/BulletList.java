package gg.essential.elementa.impl.commonmark.node;

public class BulletList extends ListBlock
{
    private char bulletMarker;
    
    public BulletList() {
        super();
    }
    
    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
    
    public char getBulletMarker() {
        return this.bulletMarker;
    }
    
    public void setBulletMarker(final char bulletMarker) {
        this.bulletMarker = bulletMarker;
    }
}
