package gg.essential.elementa.impl.commonmark.node;

public abstract class CustomBlock extends Block
{
    public CustomBlock() {
        super();
    }
    
    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
