package gg.essential.lib.okio;

import java.io.*;
import java.security.*;
import java.util.*;

public class ByteString implements Serializable, Comparable<ByteString>
{
    static final char[] HEX_DIGITS;
    public static final ByteString EMPTY;
    final byte[] data;
    transient int hashCode;
    transient String utf8;
    
    ByteString(final byte[] data) {
        super();
        this.data = data;
    }
    
    public static ByteString of(final byte... data) {
        if (data == null) {
            throw new IllegalArgumentException("data == null");
        }
        return new ByteString(data.clone());
    }
    
    public static ByteString encodeUtf8(final String s) {
        if (s == null) {
            throw new IllegalArgumentException("s == null");
        }
        final ByteString byteString = new ByteString(s.getBytes(Util.UTF_8));
        byteString.utf8 = s;
        return byteString;
    }
    
    public String utf8() {
        final String result = this.utf8;
        return (result != null) ? result : (this.utf8 = new String(this.data, Util.UTF_8));
    }
    
    public String base64() {
        return Base64.encode(this.data);
    }
    
    public ByteString sha1() {
        return this.digest("SHA-1");
    }
    
    public ByteString sha256() {
        return this.digest("SHA-256");
    }
    
    private ByteString digest(final String algorithm) {
        try {
            return of(MessageDigest.getInstance(algorithm).digest(this.data));
        }
        catch (final NoSuchAlgorithmException e) {
            throw new AssertionError((Object)e);
        }
    }
    
    public String hex() {
        final char[] result = new char[this.data.length * 2];
        int c = 0;
        for (final byte b : this.data) {
            result[c++] = ByteString.HEX_DIGITS[b >> 4 & 0xF];
            result[c++] = ByteString.HEX_DIGITS[b & 0xF];
        }
        return new String(result);
    }
    
    public static ByteString decodeHex(final String hex) {
        if (hex.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: " + hex);
        }
        final byte[] result = new byte[hex.length() / 2];
        for (int i = 0; i < result.length; ++i) {
            final int d1 = decodeHexDigit(hex.charAt(i * 2)) << 4;
            final int d2 = decodeHexDigit(hex.charAt(i * 2 + 1));
            result[i] = (byte)(d1 + d2);
        }
        return of(result);
    }
    
    private static int decodeHexDigit(final char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'a' + 10;
        }
        if (c >= 'A' && c <= 'F') {
            return c - 'A' + 10;
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }
    
    public ByteString toAsciiLowercase() {
        for (int i = 0; i < this.data.length; ++i) {
            byte c = this.data[i];
            if (c >= 65 && c <= 90) {
                final byte[] lowercase = this.data.clone();
                lowercase[i++] = (byte)(c + 32);
                while (i < lowercase.length) {
                    c = lowercase[i];
                    if (c >= 65) {
                        if (c <= 90) {
                            lowercase[i] = (byte)(c + 32);
                        }
                    }
                    ++i;
                }
                return new ByteString(lowercase);
            }
        }
        return this;
    }
    
    public ByteString substring(final int beginIndex, final int endIndex) {
        if (beginIndex < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if (endIndex > this.data.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.data.length + ")");
        }
        final int subLen = endIndex - beginIndex;
        if (subLen < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (beginIndex == 0 && endIndex == this.data.length) {
            return this;
        }
        final byte[] copy = new byte[subLen];
        System.arraycopy(this.data, beginIndex, copy, 0, subLen);
        return new ByteString(copy);
    }
    
    public byte getByte(final int pos) {
        return this.data[pos];
    }
    
    public int size() {
        return this.data.length;
    }
    
    public byte[] toByteArray() {
        return this.data.clone();
    }
    
    void write(final Buffer buffer) {
        buffer.write(this.data, 0, this.data.length);
    }
    
    public boolean rangeEquals(final int offset, final ByteString other, final int otherOffset, final int byteCount) {
        return other.rangeEquals(0, this.data, 0, byteCount);
    }
    
    public boolean rangeEquals(final int offset, final byte[] other, final int otherOffset, final int byteCount) {
        return offset >= 0 && offset <= this.data.length - byteCount && otherOffset >= 0 && otherOffset <= other.length - byteCount && Util.arrayRangeEquals(this.data, offset, other, otherOffset, byteCount);
    }
    
    public final boolean startsWith(final ByteString prefix) {
        return this.rangeEquals(0, prefix, 0, prefix.size());
    }
    
    @Override
    public boolean equals(final Object o) {
        return o == this || (o instanceof ByteString && ((ByteString)o).size() == this.data.length && ((ByteString)o).rangeEquals(0, this.data, 0, this.data.length));
    }
    
    @Override
    public int hashCode() {
        final int result = this.hashCode;
        return (result != 0) ? result : (this.hashCode = Arrays.hashCode(this.data));
    }
    
    @Override
    public int compareTo(final ByteString byteString) {
        final int sizeA = this.size();
        final int sizeB = byteString.size();
        for (int i = 0, size = Math.min(sizeA, sizeB); i < size; ++i) {
            final int byteA = this.getByte(i) & 0xFF;
            final int byteB = byteString.getByte(i) & 0xFF;
            if (byteA != byteB) {
                return (byteA < byteB) ? -1 : 1;
            }
        }
        if (sizeA == sizeB) {
            return 0;
        }
        return (sizeA < sizeB) ? -1 : 1;
    }
    
    @Override
    public String toString() {
        if (this.data.length == 0) {
            return "[size=0]";
        }
        final String text = this.utf8();
        final int i = codePointIndexToCharIndex$505cff29(text);
        if (i == -1) {
            return (this.data.length <= 64) ? ("[hex=" + this.hex() + "]") : ("[size=" + this.data.length + " hex=" + this.substring(0, 64).hex() + "\u2026]");
        }
        final String safeText = text.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        return (i < text.length()) ? ("[size=" + this.data.length + " text=" + safeText + "\u2026]") : ("[text=" + safeText + "]");
    }
    
    static int codePointIndexToCharIndex$505cff29(final String s) {
        int i = 0;
        int j = 0;
        int c;
        for (int length = s.length(); i < length; i += Character.charCount(c)) {
            if (j == 64) {
                return i;
            }
            c = s.codePointAt(i);
            if ((Character.isISOControl(c) && c != 10 && c != 13) || c == 65533) {
                return -1;
            }
            ++j;
        }
        return s.length();
    }
    
    @Override
    public /* bridge */ int compareTo(final Object o) {
        return this.compareTo((ByteString)o);
    }
    
    static {
        HEX_DIGITS = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };
        EMPTY = of(new byte[0]);
    }
}
