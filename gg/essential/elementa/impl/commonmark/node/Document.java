package gg.essential.elementa.impl.commonmark.node;

public class Document extends Block
{
    public Document() {
        super();
    }
    
    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
