package gg.essential.elementa.impl.commonmark.internal.inline;

import gg.essential.elementa.impl.commonmark.node.*;

public class ParsedInlineImpl extends ParsedInline
{
    private final Node node;
    private final Position position;
    
    ParsedInlineImpl(final Node node, final Position position) {
        super();
        this.node = node;
        this.position = position;
    }
    
    public Node getNode() {
        return this.node;
    }
    
    public Position getPosition() {
        return this.position;
    }
}
