package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.node.*;
import gg.essential.elementa.impl.commonmark.internal.inline.*;

public class Bracket
{
    public final Text node;
    public final Position markerPosition;
    public final Position contentPosition;
    public final boolean image;
    public final Bracket previous;
    public final Delimiter previousDelimiter;
    public boolean allowed;
    public boolean bracketAfter;
    
    public static Bracket link(final Text node, final Position markerPosition, final Position contentPosition, final Bracket previous, final Delimiter previousDelimiter) {
        return new Bracket(node, markerPosition, contentPosition, previous, previousDelimiter, false);
    }
    
    public static Bracket image(final Text node, final Position markerPosition, final Position contentPosition, final Bracket previous, final Delimiter previousDelimiter) {
        return new Bracket(node, markerPosition, contentPosition, previous, previousDelimiter, true);
    }
    
    private Bracket(final Text node, final Position markerPosition, final Position contentPosition, final Bracket previous, final Delimiter previousDelimiter, final boolean image) {
        super();
        this.allowed = true;
        this.bracketAfter = false;
        this.node = node;
        this.markerPosition = markerPosition;
        this.contentPosition = contentPosition;
        this.image = image;
        this.previous = previous;
        this.previousDelimiter = previousDelimiter;
    }
}
