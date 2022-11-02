package gg.essential.elementa.impl.commonmark.node;

import java.util.*;

public abstract class Node
{
    private Node parent;
    private Node firstChild;
    private Node lastChild;
    private Node prev;
    private Node next;
    private List<SourceSpan> sourceSpans;
    
    public Node() {
        super();
        this.parent = null;
        this.firstChild = null;
        this.lastChild = null;
        this.prev = null;
        this.next = null;
        this.sourceSpans = null;
    }
    
    public abstract void accept(final Visitor p0);
    
    public Node getNext() {
        return this.next;
    }
    
    public Node getPrevious() {
        return this.prev;
    }
    
    public Node getFirstChild() {
        return this.firstChild;
    }
    
    public Node getLastChild() {
        return this.lastChild;
    }
    
    public Node getParent() {
        return this.parent;
    }
    
    protected void setParent(final Node parent) {
        this.parent = parent;
    }
    
    public void appendChild(final Node child) {
        child.unlink();
        child.setParent(this);
        if (this.lastChild != null) {
            this.lastChild.next = child;
            child.prev = this.lastChild;
            this.lastChild = child;
        }
        else {
            this.firstChild = child;
            this.lastChild = child;
        }
    }
    
    public void prependChild(final Node child) {
        child.unlink();
        child.setParent(this);
        if (this.firstChild != null) {
            this.firstChild.prev = child;
            child.next = this.firstChild;
            this.firstChild = child;
        }
        else {
            this.firstChild = child;
            this.lastChild = child;
        }
    }
    
    public void unlink() {
        if (this.prev != null) {
            this.prev.next = this.next;
        }
        else if (this.parent != null) {
            this.parent.firstChild = this.next;
        }
        if (this.next != null) {
            this.next.prev = this.prev;
        }
        else if (this.parent != null) {
            this.parent.lastChild = this.prev;
        }
        this.parent = null;
        this.next = null;
        this.prev = null;
    }
    
    public void insertAfter(final Node sibling) {
        sibling.unlink();
        sibling.next = this.next;
        if (sibling.next != null) {
            sibling.next.prev = sibling;
        }
        sibling.prev = this;
        this.next = sibling;
        sibling.parent = this.parent;
        if (sibling.next == null) {
            sibling.parent.lastChild = sibling;
        }
    }
    
    public void insertBefore(final Node sibling) {
        sibling.unlink();
        sibling.prev = this.prev;
        if (sibling.prev != null) {
            sibling.prev.next = sibling;
        }
        sibling.next = this;
        this.prev = sibling;
        sibling.parent = this.parent;
        if (sibling.prev == null) {
            sibling.parent.firstChild = sibling;
        }
    }
    
    public List<SourceSpan> getSourceSpans() {
        return (this.sourceSpans != null) ? Collections.unmodifiableList((List<? extends SourceSpan>)this.sourceSpans) : Collections.emptyList();
    }
    
    public void setSourceSpans(final List<SourceSpan> sourceSpans) {
        if (sourceSpans.isEmpty()) {
            this.sourceSpans = null;
        }
        else {
            this.sourceSpans = new ArrayList<SourceSpan>(sourceSpans);
        }
    }
    
    public void addSourceSpan(final SourceSpan sourceSpan) {
        if (this.sourceSpans == null) {
            this.sourceSpans = new ArrayList<SourceSpan>();
        }
        this.sourceSpans.add(sourceSpan);
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" + this.toStringAttributes() + "}";
    }
    
    protected String toStringAttributes() {
        return "";
    }
}
