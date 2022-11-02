package gg.essential.elementa.impl.commonmark.ext.gfm.strikethrough.internal;

import gg.essential.elementa.impl.commonmark.parser.delimiter.*;
import gg.essential.elementa.impl.commonmark.ext.gfm.strikethrough.*;
import gg.essential.elementa.impl.commonmark.node.*;
import java.util.*;

public class StrikethroughDelimiterProcessor implements DelimiterProcessor
{
    public StrikethroughDelimiterProcessor() {
        super();
    }
    
    @Override
    public char getOpeningCharacter() {
        return '~';
    }
    
    @Override
    public char getClosingCharacter() {
        return '~';
    }
    
    @Override
    public int getMinLength() {
        return 2;
    }
    
    @Override
    public int process(final DelimiterRun openingRun, final DelimiterRun closingRun) {
        if (openingRun.length() >= 2 && closingRun.length() >= 2) {
            final Text opener = openingRun.getOpener();
            final Node strikethrough = new Strikethrough();
            final SourceSpans sourceSpans = new SourceSpans();
            sourceSpans.addAllFrom(openingRun.getOpeners(2));
            for (final Node node : Nodes.between(opener, closingRun.getCloser())) {
                strikethrough.appendChild(node);
                sourceSpans.addAll(node.getSourceSpans());
            }
            sourceSpans.addAllFrom(closingRun.getClosers(2));
            strikethrough.setSourceSpans(sourceSpans.getSourceSpans());
            opener.insertAfter(strikethrough);
            return 2;
        }
        return 0;
    }
}
