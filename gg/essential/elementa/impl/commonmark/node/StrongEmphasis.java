package gg.essential.elementa.impl.commonmark.node;

public class StrongEmphasis extends Node implements Delimited
{
    private String delimiter;
    
    public StrongEmphasis() {
        super();
    }
    
    public StrongEmphasis(final String delimiter) {
        super();
        this.delimiter = delimiter;
    }
    
    public void setDelimiter(final String delimiter) {
        this.delimiter = delimiter;
    }
    
    @Override
    public String getOpeningDelimiter() {
        return this.delimiter;
    }
    
    @Override
    public String getClosingDelimiter() {
        return this.delimiter;
    }
    
    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
