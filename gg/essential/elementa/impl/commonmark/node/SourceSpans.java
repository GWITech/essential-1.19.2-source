package gg.essential.elementa.impl.commonmark.node;

import java.util.*;

public class SourceSpans
{
    private List<SourceSpan> sourceSpans;
    
    public SourceSpans() {
        super();
    }
    
    public static SourceSpans empty() {
        return new SourceSpans();
    }
    
    public List<SourceSpan> getSourceSpans() {
        return (this.sourceSpans != null) ? this.sourceSpans : Collections.emptyList();
    }
    
    public void addAllFrom(final Iterable<? extends Node> nodes) {
        for (final Node node : nodes) {
            this.addAll(node.getSourceSpans());
        }
    }
    
    public void addAll(final List<SourceSpan> other) {
        if (other.isEmpty()) {
            return;
        }
        if (this.sourceSpans == null) {
            this.sourceSpans = new ArrayList<SourceSpan>();
        }
        if (this.sourceSpans.isEmpty()) {
            this.sourceSpans.addAll(other);
        }
        else {
            final int lastIndex = this.sourceSpans.size() - 1;
            final SourceSpan a = this.sourceSpans.get(lastIndex);
            final SourceSpan b = other.get(0);
            if (a.getLineIndex() == b.getLineIndex() && a.getColumnIndex() + a.getLength() == b.getColumnIndex()) {
                this.sourceSpans.set(lastIndex, SourceSpan.of(a.getLineIndex(), a.getColumnIndex(), a.getLength() + b.getLength()));
                this.sourceSpans.addAll(other.subList(1, other.size()));
            }
            else {
                this.sourceSpans.addAll(other);
            }
        }
    }
}
