package gg.essential.elementa.impl.commonmark.node;

public class Paragraph extends Block
{
    public Paragraph() {
        super();
    }
    
    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
