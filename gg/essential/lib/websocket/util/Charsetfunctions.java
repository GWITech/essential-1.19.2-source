package gg.essential.lib.websocket.util;

import java.nio.*;
import gg.essential.lib.websocket.exceptions.*;
import java.nio.charset.*;

public class Charsetfunctions
{
    private static final CodingErrorAction codingErrorAction;
    private static final int[] utf8d;
    
    public static byte[] utf8Bytes(final String s) {
        return s.getBytes(StandardCharsets.UTF_8);
    }
    
    public static byte[] asciiBytes(final String s) {
        return s.getBytes(StandardCharsets.US_ASCII);
    }
    
    public static String stringAscii$55a39fc4(final byte[] bytes, final int length) {
        return new String(bytes, 0, length, StandardCharsets.US_ASCII);
    }
    
    public static String stringUtf8(final ByteBuffer bytes) throws InvalidDataException {
        final CharsetDecoder decode = StandardCharsets.UTF_8.newDecoder();
        decode.onMalformedInput(Charsetfunctions.codingErrorAction);
        decode.onUnmappableCharacter(Charsetfunctions.codingErrorAction);
        String s;
        try {
            bytes.mark();
            s = decode.decode(bytes).toString();
            bytes.reset();
        }
        catch (final CharacterCodingException e) {
            throw new InvalidDataException(e);
        }
        return s;
    }
    
    public static boolean isValidUTF8$72709d8b(final ByteBuffer data) {
        final int len = data.remaining();
        if (len < 0) {
            return false;
        }
        int state = 0;
        for (int i = 0; i < len; ++i) {
            state = Charsetfunctions.utf8d[256 + (state << 4) + Charsetfunctions.utf8d[0xFF & data.get(i)]];
            if (state == 1) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean isValidUTF8(final ByteBuffer data) {
        return isValidUTF8$72709d8b(data);
    }
    
    static {
        codingErrorAction = CodingErrorAction.REPORT;
        utf8d = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 10, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 3, 11, 6, 6, 6, 5, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 0, 1, 2, 3, 5, 8, 7, 1, 1, 1, 4, 6, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 3, 1, 3, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
    }
}
