package gg.essential.vigilance.impl.nightconfig.core.utils;

import java.io.*;
import java.util.*;

public final class FastStringReader extends Reader
{
    private final String str;
    private final int lim;
    private int cursor;
    private int mark;
    
    public FastStringReader(final String str, final int lim) {
        super();
        this.cursor = 0;
        if (lim > str.length() || lim < 0) {
            throw new IllegalArgumentException("Invalid limit " + lim + ": must be >= 0 and < str.length()");
        }
        this.str = Objects.requireNonNull(str, "The string must not be null.");
        this.lim = lim;
    }
    
    public FastStringReader(final String str) {
        super();
        this.cursor = 0;
        this.str = Objects.requireNonNull(str, "The string must not be null.");
        this.lim = str.length();
    }
    
    @Override
    public int read() {
        return (this.cursor < this.lim) ? this.str.charAt(this.cursor++) : -1;
    }
    
    @Override
    public int read(final char[] cbuf, final int off, int len) {
        if (this.cursor == this.lim) {
            return -1;
        }
        len = Math.min(len, this.lim - this.cursor);
        final int srcEnd = this.cursor + len;
        this.str.getChars(this.cursor, srcEnd, cbuf, off);
        this.cursor = srcEnd;
        return len;
    }
    
    @Override
    public long skip(final long n) {
        final int skip = (int)n;
        this.cursor += skip;
        return skip;
    }
    
    @Override
    public boolean markSupported() {
        return true;
    }
    
    @Override
    public void mark(final int readAheadLimit) {
        this.mark = this.cursor;
    }
    
    @Override
    public void reset() {
        this.cursor = this.mark;
    }
    
    @Override
    public boolean ready() {
        return true;
    }
    
    @Override
    public void close() {
    }
}
