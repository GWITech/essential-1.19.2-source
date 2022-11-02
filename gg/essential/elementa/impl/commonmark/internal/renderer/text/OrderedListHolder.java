package gg.essential.elementa.impl.commonmark.internal.renderer.text;

import gg.essential.elementa.impl.commonmark.node.*;

public class OrderedListHolder extends ListHolder
{
    private final char delimiter;
    private int counter;
    
    public OrderedListHolder(final ListHolder parent, final OrderedList list) {
        super(parent);
        this.delimiter = list.getDelimiter();
        this.counter = list.getStartNumber();
    }
    
    public char getDelimiter() {
        return this.delimiter;
    }
    
    public int getCounter() {
        return this.counter;
    }
    
    public void increaseCounter() {
        ++this.counter;
    }
}
