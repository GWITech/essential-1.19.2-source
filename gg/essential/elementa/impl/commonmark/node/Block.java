package gg.essential.elementa.impl.commonmark.node;

public abstract class Block extends Node
{
    public Block() {
        super();
    }
    
    @Override
    public Block getParent() {
        return (Block)super.getParent();
    }
    
    @Override
    protected void setParent(final Node parent) {
        if (!(parent instanceof Block)) {
            throw new IllegalArgumentException("Parent of block must also be block (can not be inline)");
        }
        super.setParent(parent);
    }
    
    @Override
    public /* bridge */ Node getParent() {
        return this.getParent();
    }
}
