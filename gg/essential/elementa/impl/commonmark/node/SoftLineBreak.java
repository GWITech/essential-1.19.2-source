package gg.essential.elementa.impl.commonmark.node;

public class SoftLineBreak extends Node
{
    public SoftLineBreak() {
        super();
    }
    
    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
