package gg.essential.elementa.impl.commonmark.node;

import java.util.*;

public class Nodes
{
    private Nodes() {
        super();
    }
    
    public static Iterable<Node> between(final Node start, final Node end) {
        return new NodeIterable(start.getNext(), end, null);
    }
    
    private static class NodeIterable implements Iterable<Node>
    {
        private final Node first;
        private final Node end;
        
        private NodeIterable(final Node first, final Node end) {
            super();
            this.first = first;
            this.end = end;
        }
        
        @Override
        public Iterator<Node> iterator() {
            return new NodeIterator(this.first, this.end, null);
        }
        
        NodeIterable(final Node x0, final Node x1, final Nodes.Nodes$1 x2) {
            this(x0, x1);
        }
    }
    
    private static class NodeIterator implements Iterator<Node>
    {
        private Node node;
        private final Node end;
        
        private NodeIterator(final Node first, final Node end) {
            super();
            this.node = first;
            this.end = end;
        }
        
        @Override
        public boolean hasNext() {
            return this.node != null && this.node != this.end;
        }
        
        @Override
        public Node next() {
            final Node result = this.node;
            this.node = this.node.getNext();
            return result;
        }
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException("remove");
        }
        
        @Override
        public /* bridge */ Object next() {
            return this.next();
        }
        
        NodeIterator(final Node x0, final Node x1, final Nodes.Nodes$1 x2) {
            this(x0, x1);
        }
    }
}
