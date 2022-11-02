package gg.essential.elementa.impl.commonmark.node;

public class ThematicBreak extends Block
{
    public ThematicBreak() {
        super();
    }
    
    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
