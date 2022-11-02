package gg.essential.elementa.impl.commonmark.internal.inline;

import gg.essential.elementa.impl.commonmark.parser.delimiter.*;
import gg.essential.elementa.impl.commonmark.node.*;
import java.util.*;

public abstract class EmphasisDelimiterProcessor implements DelimiterProcessor
{
    private final char delimiterChar;
    
    protected EmphasisDelimiterProcessor(final char delimiterChar) {
        super();
        this.delimiterChar = delimiterChar;
    }
    
    @Override
    public char getOpeningCharacter() {
        return this.delimiterChar;
    }
    
    @Override
    public char getClosingCharacter() {
        return this.delimiterChar;
    }
    
    @Override
    public int getMinLength() {
        return 1;
    }
    
    @Override
    public int process(final DelimiterRun openingRun, final DelimiterRun closingRun) {
        if ((openingRun.canClose() || closingRun.canOpen()) && closingRun.originalLength() % 3 != 0 && (openingRun.originalLength() + closingRun.originalLength()) % 3 == 0) {
            return 0;
        }
        int usedDelimiters;
        Node emphasis;
        if (openingRun.length() >= 2 && closingRun.length() >= 2) {
            usedDelimiters = 2;
            emphasis = new StrongEmphasis(String.valueOf(this.delimiterChar) + this.delimiterChar);
        }
        else {
            usedDelimiters = 1;
            emphasis = new Emphasis(String.valueOf(this.delimiterChar));
        }
        final SourceSpans sourceSpans = SourceSpans.empty();
        sourceSpans.addAllFrom(openingRun.getOpeners(usedDelimiters));
        final Text opener = openingRun.getOpener();
        for (final Node node : Nodes.between(opener, closingRun.getCloser())) {
            emphasis.appendChild(node);
            sourceSpans.addAll(node.getSourceSpans());
        }
        sourceSpans.addAllFrom(closingRun.getClosers(usedDelimiters));
        emphasis.setSourceSpans(sourceSpans.getSourceSpans());
        opener.insertAfter(emphasis);
        return usedDelimiters;
    }
}
