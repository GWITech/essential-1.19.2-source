package gg.essential.elementa.impl.commonmark.node;

public class HardLineBreak extends Node
{
    public HardLineBreak() {
        super();
    }
    
    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
