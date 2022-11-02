package gg.essential.elementa.impl.commonmark.node;

public class Text extends Node
{
    private String literal;
    
    public Text() {
        super();
    }
    
    public Text(final String literal) {
        super();
        this.literal = literal;
    }
    
    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
    
    public String getLiteral() {
        return this.literal;
    }
    
    public void setLiteral(final String literal) {
        this.literal = literal;
    }
    
    @Override
    protected String toStringAttributes() {
        return "literal=" + this.literal;
    }
}
