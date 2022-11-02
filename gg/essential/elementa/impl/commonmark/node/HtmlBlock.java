package gg.essential.elementa.impl.commonmark.node;

public class HtmlBlock extends Block
{
    private String literal;
    
    public HtmlBlock() {
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
