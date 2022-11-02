package gg.essential.vigilance.impl.nightconfig.core.io;

import java.util.*;
import java.io.*;

public static final class Builder extends Writer implements CharacterOutput
{
    private static final char[] NULL;
    private char[] data;
    private int cursor;
    
    public Builder(final int initialCapacity) {
        super();
        this.cursor = 0;
        this.data = new char[Math.min(2, initialCapacity)];
    }
    
    private void ensureCapacity(final int capacity) {
        if (this.data.length < capacity) {
            final int newCapacity = Math.max(capacity, this.data.length * 2);
            this.data = Arrays.copyOf(this.data, newCapacity);
        }
    }
    
    @Override
    public Builder append(final char c) {
        this.write(c);
        return this;
    }
    
    @Override
    public Builder append(final CharSequence csq) {
        if (csq == null) {
            return this.append(Builder.NULL);
        }
        if (csq instanceof String) {
            return this.append((String)csq);
        }
        return this.append(csq, 0, csq.length());
    }
    
    @Override
    public Builder append(final CharSequence csq, final int start, final int end) {
        if (csq == null) {
            return this.append(Builder.NULL, start, end);
        }
        if (csq instanceof String) {
            return this.append((String)csq, start, end);
        }
        final int length = end - start;
        final int newCursor = this.cursor + length;
        this.ensureCapacity(newCursor);
        for (int i = start; i < end; ++i) {
            this.data[this.cursor + i] = csq.charAt(i);
        }
        this.cursor = newCursor;
        return this;
    }
    
    public Builder append(final char... chars) {
        this.write(chars);
        return this;
    }
    
    public Builder append(final char[] chars, final int begin, final int end) {
        final int length = end - begin;
        this.write(chars, begin, length);
        return this;
    }
    
    public Builder append(final String str) {
        this.write(str);
        return this;
    }
    
    public Builder append(final String str, final int begin, final int end) {
        final int length = end - begin;
        this.write(str, begin, length);
        return this;
    }
    
    public Builder append(final CharsWrapper cw) {
        this.write(cw);
        return this;
    }
    
    public Builder append(final Object o) {
        if (o == null) {
            return this.append(Builder.NULL);
        }
        return this.append(o.toString());
    }
    
    public Builder append(final Object... objects) {
        for (final Object o : objects) {
            this.append(o);
        }
        return this;
    }
    
    @Override
    public void flush() {
    }
    
    @Override
    public void close() {
    }
    
    @Override
    public void write(final int c) {
        this.write((char)c);
    }
    
    @Override
    public void write(final char c) {
        final int newCursor = this.cursor + 1;
        this.ensureCapacity(newCursor);
        this.data[this.cursor] = c;
        this.cursor = newCursor;
    }
    
    @Override
    public void write(final char... cbuf) {
        super.write(cbuf);
    }
    
    @Override
    public void write(final char[] chars, final int offset, final int length) {
        final int newCursor = this.cursor + length;
        this.ensureCapacity(newCursor);
        System.arraycopy(chars, offset, this.data, this.cursor, length);
        this.cursor = newCursor;
    }
    
    @Override
    public void write(final String str) {
        super.write(str);
    }
    
    @Override
    public void write(final String s, final int offset, final int length) {
        final int end = offset + length;
        final int newCursor = this.cursor + length;
        this.ensureCapacity(newCursor);
        s.getChars(offset, end, this.data, this.cursor);
        this.cursor = newCursor;
    }
    
    @Override
    public void write(final CharsWrapper cw) {
        super.write(cw);
    }
    
    public int length() {
        return this.cursor;
    }
    
    public char[] getChars() {
        return this.data;
    }
    
    public char get(final int index) {
        return this.data[index];
    }
    
    public void set(final int index, final char ch) {
        if (index >= this.cursor) {
            throw new IndexOutOfBoundsException("Index must not be larger than the builder's length");
        }
        this.data[index] = ch;
    }
    
    public void compact() {
        if (this.cursor != this.data.length) {
            this.data = Arrays.copyOf(this.data, this.cursor);
        }
    }
    
    public CharsWrapper build() {
        return this.build(0);
    }
    
    public CharsWrapper build(final int start) {
        return new CharsWrapper(this.data, start, this.cursor);
    }
    
    public CharsWrapper build(final int start, final int end) {
        if (end > this.cursor) {
            throw new IndexOutOfBoundsException("Specified end index is larger than the builder's length!");
        }
        return new CharsWrapper(this.data, start, end);
    }
    
    public CharsWrapper copyAndBuild() {
        return this.build(0);
    }
    
    public CharsWrapper copyAndBuild(final int start) {
        return new CharsWrapper(Arrays.copyOfRange(this.data, start, this.cursor));
    }
    
    public CharsWrapper copyAndBuild(final int start, final int end) {
        if (end > this.cursor) {
            throw new IndexOutOfBoundsException("Specified end index is larger than the builder's length!");
        }
        return new CharsWrapper(Arrays.copyOfRange(this.data, start, end));
    }
    
    @Override
    public String toString() {
        return this.toString(0);
    }
    
    public String toString(final int start) {
        return new String(this.data, start, this.cursor - start);
    }
    
    public String toString(final int start, final int end) {
        if (end > this.cursor) {
            throw new IndexOutOfBoundsException("Specified end index is larger than the builder's length!");
        }
        return new String(this.data, start, end - start);
    }
    
    @Override
    public /* bridge */ Writer append(final char c) throws IOException {
        return this.append(c);
    }
    
    @Override
    public /* bridge */ Writer append(final CharSequence csq, final int start, final int end) throws IOException {
        return this.append(csq, start, end);
    }
    
    @Override
    public /* bridge */ Writer append(final CharSequence csq) throws IOException {
        return this.append(csq);
    }
    
    @Override
    public /* bridge */ Appendable append(final char c) throws IOException {
        return this.append(c);
    }
    
    @Override
    public /* bridge */ Appendable append(final CharSequence csq, final int start, final int end) throws IOException {
        return this.append(csq, start, end);
    }
    
    @Override
    public /* bridge */ Appendable append(final CharSequence csq) throws IOException {
        return this.append(csq);
    }
    
    static {
        NULL = new char[] { 'n', 'u', 'l', 'l' };
    }
}
