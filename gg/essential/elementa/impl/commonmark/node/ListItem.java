package gg.essential.elementa.impl.commonmark.node;

public class ListItem extends Block
{
    public ListItem() {
        super();
    }
    
    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
