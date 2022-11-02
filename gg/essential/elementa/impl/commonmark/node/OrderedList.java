package gg.essential.elementa.impl.commonmark.node;

public class OrderedList extends ListBlock
{
    private int startNumber;
    private char delimiter;
    
    public OrderedList() {
        super();
    }
    
    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
    
    public int getStartNumber() {
        return this.startNumber;
    }
    
    public void setStartNumber(final int startNumber) {
        this.startNumber = startNumber;
    }
    
    public char getDelimiter() {
        return this.delimiter;
    }
    
    public void setDelimiter(final char delimiter) {
        this.delimiter = delimiter;
    }
}
