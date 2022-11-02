package gg.essential.elementa.impl.commonmark.renderer.text;

import java.io.*;

public class TextContentWriter
{
    private final Appendable buffer;
    private char lastChar;
    
    public TextContentWriter(final Appendable out) {
        super();
        this.buffer = out;
    }
    
    public void whitespace() {
        if (this.lastChar != '\0' && this.lastChar != ' ') {
            this.append(' ');
        }
    }
    
    public void colon() {
        if (this.lastChar != '\0' && this.lastChar != ':') {
            this.append(':');
        }
    }
    
    public void line() {
        if (this.lastChar != '\0' && this.lastChar != '\n') {
            this.append('\n');
        }
    }
    
    public void writeStripped(final String s) {
        this.append(s.replaceAll("[\\r\\n\\s]+", " "));
    }
    
    public void write(final String s) {
        this.append(s);
    }
    
    public void write(final char c) {
        this.append(c);
    }
    
    private void append(final String s) {
        try {
            this.buffer.append(s);
        }
        catch (final IOException e) {
            throw new RuntimeException(e);
        }
        final int length = s.length();
        if (length != 0) {
            this.lastChar = s.charAt(length - 1);
        }
    }
    
    private void append(final char c) {
        try {
            this.buffer.append(c);
        }
        catch (final IOException e) {
            throw new RuntimeException(e);
        }
        this.lastChar = c;
    }
}
