package gg.essential.lib.websocket.util;

import java.io.*;

public class Base64
{
    private static final byte[] _STANDARD_ALPHABET;
    private static final byte[] _URL_SAFE_ALPHABET;
    private static final byte[] _ORDERED_ALPHABET;
    static final /* synthetic */ boolean $assertionsDisabled;
    
    private static final byte[] getAlphabet(final int options) {
        if ((options & 0x10) == 0x10) {
            return Base64._URL_SAFE_ALPHABET;
        }
        if ((options & 0x20) == 0x20) {
            return Base64._ORDERED_ALPHABET;
        }
        return Base64._STANDARD_ALPHABET;
    }
    
    private Base64() {
        super();
    }
    
    private static byte[] encode3to4(final byte[] source, final int srcOffset, final int numSigBytes, final byte[] destination, final int destOffset, final int options) {
        final byte[] ALPHABET = getAlphabet(0);
        final int inBuff = ((numSigBytes > 0) ? (source[srcOffset] << 24 >>> 8) : 0) | ((numSigBytes > 1) ? (source[srcOffset + 1] << 24 >>> 16) : 0) | ((numSigBytes > 2) ? (source[srcOffset + 2] << 24 >>> 24) : 0);
        switch (numSigBytes) {
            case 3: {
                destination[destOffset] = ALPHABET[inBuff >>> 18];
                destination[destOffset + 1] = ALPHABET[inBuff >>> 12 & 0x3F];
                destination[destOffset + 2] = ALPHABET[inBuff >>> 6 & 0x3F];
                destination[destOffset + 3] = ALPHABET[inBuff & 0x3F];
                return destination;
            }
            case 2: {
                destination[destOffset] = ALPHABET[inBuff >>> 18];
                destination[destOffset + 1] = ALPHABET[inBuff >>> 12 & 0x3F];
                destination[destOffset + 2] = ALPHABET[inBuff >>> 6 & 0x3F];
                destination[destOffset + 3] = 61;
                return destination;
            }
            case 1: {
                destination[destOffset] = ALPHABET[inBuff >>> 18];
                destination[destOffset + 1] = ALPHABET[inBuff >>> 12 & 0x3F];
                destination[destOffset + 3] = (destination[destOffset + 2] = 61);
                return destination;
            }
            default: {
                return destination;
            }
        }
    }
    
    public static String encodeBytes(final byte[] source) {
        String encoded = null;
        try {
            encoded = encodeBytes$5fb0bea7(source, source.length);
        }
        catch (final IOException ex) {
            assert false : ex.getMessage();
        }
        assert encoded != null;
        return encoded;
    }
    
    public static String encodeBytes$5fb0bea7(final byte[] source, final int len) throws IOException {
        final byte[] encoded = encodeBytesToBytes$3bcfdf96(source, len);
        try {
            return new String(encoded, "US-ASCII");
        }
        catch (final UnsupportedEncodingException ex) {
            return new String(encoded);
        }
    }
    
    public static byte[] encodeBytesToBytes$3bcfdf96(final byte[] source, final int len) throws IOException {
        if (source == null) {
            throw new IllegalArgumentException("Cannot serialize a null array.");
        }
        if (len < 0) {
            throw new IllegalArgumentException("Cannot have length offset: " + len);
        }
        if (0 + len > source.length) {
            throw new IllegalArgumentException(String.format("Cannot have offset of %d and length of %d with array of length %d", 0, len, source.length));
        }
        final int encLen = len / 3 * 4 + ((len % 3 > 0) ? 4 : 0);
        final byte[] outBuff = new byte[encLen];
        int d = 0;
        int e = 0;
        for (int len2 = len - 2; d < len2; d += 3, e += 4) {
            encode3to4(source, d + 0, 3, outBuff, e, 0);
        }
        if (d < len) {
            encode3to4(source, d + 0, len - d, outBuff, e, 0);
            e += 4;
        }
        if (e <= outBuff.length - 1) {
            final byte[] finalOut = new byte[e];
            System.arraycopy(outBuff, 0, finalOut, 0, e);
            return finalOut;
        }
        return outBuff;
    }
    
    static {
        $assertionsDisabled = !Base64.class.desiredAssertionStatus();
        _STANDARD_ALPHABET = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
        _URL_SAFE_ALPHABET = new byte[] { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95 };
        _ORDERED_ALPHABET = new byte[] { 45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122 };
    }
}
