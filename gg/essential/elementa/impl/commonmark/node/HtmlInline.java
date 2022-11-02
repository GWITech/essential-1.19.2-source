package gg.essential.elementa.impl.commonmark.node;

public class HtmlInline extends Node
{
    private String literal;
    
    public HtmlInline() {
        super();
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
