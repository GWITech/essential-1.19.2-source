package gg.essential.elementa.impl.commonmark.parser;

import gg.essential.elementa.impl.commonmark.node.*;
import java.util.*;

public class SourceLines
{
    private final List<SourceLine> lines;
    
    public SourceLines() {
        super();
        this.lines = new ArrayList<SourceLine>();
    }
    
    public static SourceLines empty() {
        return new SourceLines();
    }
    
    public static SourceLines of(final SourceLine sourceLine) {
        final SourceLines sourceLines = new SourceLines();
        sourceLines.addLine(sourceLine);
        return sourceLines;
    }
    
    public static SourceLines of(final List<SourceLine> sourceLines) {
        final SourceLines result = new SourceLines();
        result.lines.addAll(sourceLines);
        return result;
    }
    
    public void addLine(final SourceLine sourceLine) {
        this.lines.add(sourceLine);
    }
    
    public List<SourceLine> getLines() {
        return this.lines;
    }
    
    public boolean isEmpty() {
        return this.lines.isEmpty();
    }
    
    public String getContent() {
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.lines.size(); ++i) {
            if (i != 0) {
                sb.append('\n');
            }
            sb.append(this.lines.get(i).getContent());
        }
        return sb.toString();
    }
    
    public List<SourceSpan> getSourceSpans() {
        final List<SourceSpan> sourceSpans = new ArrayList<SourceSpan>();
        for (final SourceLine line : this.lines) {
            final SourceSpan sourceSpan = line.getSourceSpan();
            if (sourceSpan != null) {
                sourceSpans.add(sourceSpan);
            }
        }
        return sourceSpans;
    }
}
