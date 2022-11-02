package gg.essential.elementa.impl.commonmark.node;

public class Code extends Node
{
    private String literal;
    
    public Code() {
        super();
    }
    
    public Code(final String literal) {
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
}
