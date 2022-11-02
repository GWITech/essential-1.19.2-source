package gg.essential.elementa.impl.commonmark.node;

public class LinkReferenceDefinition extends Node
{
    private String label;
    private String destination;
    private String title;
    
    public LinkReferenceDefinition() {
        super();
    }
    
    public LinkReferenceDefinition(final String label, final String destination, final String title) {
        super();
        this.label = label;
        this.destination = destination;
        this.title = title;
    }
    
    public String getLabel() {
        return this.label;
    }
    
    public void setLabel(final String label) {
        this.label = label;
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
    public void accept(final Visitor visitor) {
        visitor.visit(this);
    }
}
