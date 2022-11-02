package gg.essential.elementa.impl.commonmark.node;

public class BlockQuote extends Block
{
    public BlockQuote() {
        super();
    }
    
    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
