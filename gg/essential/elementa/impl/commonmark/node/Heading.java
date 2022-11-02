package gg.essential.elementa.impl.commonmark.node;

public class Heading extends Block
{
    private int level;
    
    public Heading() {
        super();
    }
    
    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
    
    public int getLevel() {
        return this.level;
    }
    
    public void setLevel(final int level) {
        this.level = level;
    }
}
