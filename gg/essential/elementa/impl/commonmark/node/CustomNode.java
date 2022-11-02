package gg.essential.elementa.impl.commonmark.node;

public abstract class CustomNode extends Node
{
    public CustomNode() {
        super();
    }
    
    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
