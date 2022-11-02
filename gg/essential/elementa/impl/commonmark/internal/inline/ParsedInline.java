package gg.essential.elementa.impl.commonmark.internal.inline;

import gg.essential.elementa.impl.commonmark.node.*;

public abstract class ParsedInline
{
    protected ParsedInline() {
        super();
    }
    
    public static ParsedInline none() {
        return null;
    }
    
    public static ParsedInline of(final Node node, final Position position) {
        if (node == null) {
            throw new NullPointerException("node must not be null");
        }
        if (position == null) {
            throw new NullPointerException("position must not be null");
        }
        return new ParsedInlineImpl(node, position);
    }
}
