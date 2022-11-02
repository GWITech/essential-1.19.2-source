package gg.essential.elementa.impl.commonmark.ext.ins.internal;

import gg.essential.elementa.impl.commonmark.parser.delimiter.*;
import gg.essential.elementa.impl.commonmark.ext.ins.*;
import gg.essential.elementa.impl.commonmark.node.*;
import java.util.*;

public class InsDelimiterProcessor implements DelimiterProcessor
{
    public InsDelimiterProcessor() {
        super();
    }
    
    @Override
    public char getOpeningCharacter() {
        return '+';
    }
    
    @Override
    public char getClosingCharacter() {
        return '+';
    }
    
    @Override
    public int getMinLength() {
        return 2;
    }
    
    @Override
    public int process(final DelimiterRun openingRun, final DelimiterRun closingRun) {
        if (openingRun.length() >= 2 && closingRun.length() >= 2) {
            final Text opener = openingRun.getOpener();
            final Node ins = new Ins();
            final SourceSpans sourceSpans = new SourceSpans();
            sourceSpans.addAllFrom(openingRun.getOpeners(2));
            for (final Node node : Nodes.between(opener, closingRun.getCloser())) {
                ins.appendChild(node);
                sourceSpans.addAll(node.getSourceSpans());
            }
            sourceSpans.addAllFrom(closingRun.getClosers(2));
            ins.setSourceSpans(sourceSpans.getSourceSpans());
            opener.insertAfter(ins);
            return 2;
        }
        return 0;
    }
}
