package gg.essential.vigilance.impl.nightconfig.core.io;

import java.util.*;
import java.io.*;

public final class CharsWrapper implements CharSequence, Cloneable, Iterable<Character>
{
    final char[] chars;
    final int offset;
    final int limit;
    
    public CharsWrapper(final char... chars) {
        this(chars, 0, chars.length);
    }
    
    public CharsWrapper(final char[] chars, final int offset, final int limit) {
        super();
        if (limit < offset) {
            throw new IllegalArgumentException("limit must be bigger than offset");
        }
        this.chars = Objects.requireNonNull(chars, "chars must not be null");
        this.offset = offset;
        this.limit = limit;
    }
    
    public CharsWrapper(final String str) {
        this(str, 0, str.length());
    }
    
    public CharsWrapper(final String str, final int begin, final int end) {
        super();
        this.offset = 0;
        this.limit = end - begin;
        str.getChars(begin, end, this.chars = new char[this.limit], 0);
    }
    
    public CharsWrapper(final CharSequence csq) {
        this(csq, 0, csq.length());
    }
    
    public CharsWrapper(final CharSequence csq, final int begin, final int end) {
        super();
        this.offset = 0;
        this.limit = end - begin;
        this.chars = new char[this.limit];
        for (int i = begin; i < end; ++i) {
            this.chars[i - begin] = csq.charAt(i);
        }
    }
    
    @Override
    public boolean isEmpty() {
        return this.limit == this.offset;
    }
    
    @Override
    public int length() {
        return this.limit - this.offset;
    }
    
    @Override
    public char charAt(final int index) {
        return this.chars[this.offset + index];
    }
    
    public char get(final int index) {
        return this.chars[this.offset + index];
    }
    
    public void set(final int index, final char ch) {
        this.chars[this.offset + index] = ch;
    }
    
    public void replaceAll(final char ch, final char replacement) {
        for (int i = this.offset; i < this.limit; ++i) {
            if (this.chars[i] == ch) {
                this.chars[i] = replacement;
            }
        }
    }
    
    public boolean contains(final char c) {
        return this.indexOf(c) != -1;
    }
    
    public int indexOf(final char c) {
        for (int i = this.offset; i < this.limit; ++i) {
            if (this.chars[i] == c) {
                return i - this.offset;
            }
        }
        return -1;
    }
    
    public int indexOfFirst(final char... ch) {
        for (int i = this.offset; i < this.limit; ++i) {
            if (Utils.arrayContains(ch, this.chars[i])) {
                return i - this.offset;
            }
        }
        return -1;
    }
    
    @Override
    public boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CharsWrapper)) {
            return false;
        }
        final CharsWrapper other = (CharsWrapper)obj;
        final int l = other.length();
        if (this.length() != l) {
            return false;
        }
        for (int i = 0; i < l; ++i) {
            final char c = this.chars[this.offset + i];
            final char co = other.chars[other.offset + i];
            if (c != co) {
                return false;
            }
        }
        return true;
    }
    
    public boolean equalsIgnoreCase(final CharSequence cs) {
        if (cs == this) {
            return true;
        }
        if (cs == null || cs.length() != this.length()) {
            return false;
        }
        for (int i = 0; i < this.limit; ++i) {
            final char u1 = Character.toUpperCase(this.chars[this.offset + i]);
            final char u2 = Character.toUpperCase(cs.charAt(i));
            if (u1 != u2) {
                return false;
            }
        }
        return true;
    }
    
    public boolean contentEquals(final CharSequence cs) {
        final int l = this.length();
        if (cs == null || cs.length() != l) {
            return false;
        }
        for (int i = 0; i < l; ++i) {
            if (this.chars[this.offset + i] != cs.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean contentEquals(final char[] array) {
        final int l = this.length();
        if (array == null || array.length != l) {
            return false;
        }
        for (int i = 0; i < l; ++i) {
            if (this.chars[this.offset + i] != array[i]) {
                return false;
            }
        }
        return true;
    }
    
    public boolean startsWith(final CharSequence cs) {
        if (cs == null) {
            return false;
        }
        final int l = cs.length();
        if (l > this.length()) {
            return false;
        }
        for (int i = 0; i < l; ++i) {
            if (this.chars[this.offset + i] != cs.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public CharsWrapper subSequence(final int start, final int end) {
        return new CharsWrapper(Arrays.copyOfRange(this.chars, start + this.offset, end + this.offset));
    }
    
    public CharsWrapper subView(final int start, final int end) {
        return new CharsWrapper(this.chars, start + this.offset, end + this.offset);
    }
    
    public CharsWrapper subView(final int start) {
        return new CharsWrapper(this.chars, start + this.offset, this.limit);
    }
    
    public CharsWrapper trimmedView() {
        int offset;
        int limit;
        for (offset = this.offset, limit = this.limit; offset < limit && this.chars[offset] <= ' '; ++offset) {}
        while (limit > offset && this.chars[limit - 1] <= ' ') {
            --limit;
        }
        return new CharsWrapper(this.chars, offset, limit);
    }
    
    @Override
    public String toString() {
        return new String(this.chars, this.offset, this.length());
    }
    
    @Override
    public int hashCode() {
        int h = 0;
        for (int i = this.offset; i < this.limit; ++i) {
            h = 31 * h + this.chars[i];
        }
        return h;
    }
    
    public CharsWrapper clone() {
        return new CharsWrapper(Arrays.copyOf(this.chars, this.chars.length));
    }
    
    @Override
    public Iterator<Character> iterator() {
        return (Iterator<Character>)new CharsWrapper.CharsWrapper$1(this);
    }
    
    public /* bridge */ Object clone() throws CloneNotSupportedException {
        return this.clone();
    }
    
    @Override
    public /* bridge */ CharSequence subSequence(final int start, final int end) {
        return this.subSequence(start, end);
    }
    
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
}
