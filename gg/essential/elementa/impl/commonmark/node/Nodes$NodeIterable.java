package gg.essential.elementa.impl.commonmark.node;

import java.util.*;

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
