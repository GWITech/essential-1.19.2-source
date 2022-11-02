package gg.essential.elementa.impl.commonmark.node;

public class Image extends Node
{
    private String destination;
    private String title;
    
    public Image() {
        super();
    }
    
    public Image(final String destination, final String title) {
        super();
        this.destination = destination;
        this.title = title;
    }
    
    @Override
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
    
    public String getDestination() {
        return this.destination;
    }
    
    public void setDestination(final String destination) {
        this.destination = destination;
    }
    
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(final String title) {
        this.title = title;
    }
    
    @Override
    protected String toStringAttributes() {
        return "destination=" + this.destination + ", title=" + this.title;
    }
}
