package gg.essential.elementa.impl.commonmark.parser.delimiter;

import gg.essential.elementa.impl.commonmark.node.*;

public interface DelimiterRun
{
    boolean canOpen();
    
    boolean canClose();
    
    int length();
    
    int originalLength();
    
    Text getOpener();
    
    Text getCloser();
    
    Iterable<Text> getOpeners(final int p0);
    
    Iterable<Text> getClosers(final int p0);
}
