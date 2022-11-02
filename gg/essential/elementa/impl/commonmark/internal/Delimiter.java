package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.parser.delimiter.*;
import java.util.*;
import gg.essential.elementa.impl.commonmark.node.*;

public class Delimiter implements DelimiterRun
{
    public final List<Text> characters;
    public final char delimiterChar;
    private final int originalLength;
    private final boolean canOpen;
    private final boolean canClose;
    public Delimiter previous;
    public Delimiter next;
    
    public Delimiter(final List<Text> characters, final char delimiterChar, final boolean canOpen, final boolean canClose, final Delimiter previous) {
        super();
        this.characters = characters;
        this.delimiterChar = delimiterChar;
        this.canOpen = canOpen;
        this.canClose = canClose;
        this.previous = previous;
        this.originalLength = characters.size();
    }
    
    @Override
    public boolean canOpen() {
        return this.canOpen;
    }
    
    @Override
    public boolean canClose() {
        return this.canClose;
    }
    
    @Override
    public int length() {
        return this.characters.size();
    }
    
    @Override
    public int originalLength() {
        return this.originalLength;
    }
    
    @Override
    public Text getOpener() {
        return this.characters.get(this.characters.size() - 1);
    }
    
    @Override
    public Text getCloser() {
        return this.characters.get(0);
    }
    
    @Override
    public Iterable<Text> getOpeners(final int length) {
        if (length < 1 || length > this.length()) {
            throw new IllegalArgumentException("length must be between 1 and " + this.length() + ", was " + length);
        }
        return this.characters.subList(this.characters.size() - length, this.characters.size());
    }
    
    @Override
    public Iterable<Text> getClosers(final int length) {
        if (length < 1 || length > this.length()) {
            throw new IllegalArgumentException("length must be between 1 and " + this.length() + ", was " + length);
        }
        return this.characters.subList(0, length);
    }
}
