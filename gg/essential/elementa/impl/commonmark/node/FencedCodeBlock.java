package gg.essential.elementa.impl.commonmark.node;

public class FencedCodeBlock extends Block
{
    private char fenceChar;
    private int fenceLength;
    private int fenceIndent;
    private String info;
    private String literal;
    
    public FencedCodeBlock() {
        super();
    }
    
    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
    
    public char getFenceChar() {
        return this.fenceChar;
    }
    
    public void setFenceChar(final char fenceChar) {
        this.fenceChar = fenceChar;
    }
    
    public int getFenceLength() {
        return this.fenceLength;
    }
    
    public void setFenceLength(final int fenceLength) {
        this.fenceLength = fenceLength;
    }
    
    public int getFenceIndent() {
        return this.fenceIndent;
    }
    
    public void setFenceIndent(final int fenceIndent) {
        this.fenceIndent = fenceIndent;
    }
    
    public String getInfo() {
        return this.info;
    }
    
    public void setInfo(final String info) {
        this.info = info;
    }
    
    public String getLiteral() {
        return this.literal;
    }
    
    public void setLiteral(final String literal) {
        this.literal = literal;
    }
}
