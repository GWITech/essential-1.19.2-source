package gg.essential.lib.okhttp3.internal.http2;

import gg.essential.lib.okio.*;
import gg.essential.lib.okhttp3.internal.*;
import java.io.*;

public final class Http2
{
    static final ByteString CONNECTION_PREFACE;
    private static final String[] FRAME_NAMES;
    static final String[] FLAGS;
    static final String[] BINARY;
    
    private Http2() {
        super();
    }
    
    static IllegalArgumentException illegalArgument(final String message, final Object... args) {
        throw new IllegalArgumentException(Util.format(message, args));
    }
    
    static IOException ioException(final String message, final Object... args) throws IOException {
        throw new IOException(Util.format(message, args));
    }
    
    static String frameLog(final boolean inbound, final int streamId, final int length, final byte type, final byte flags) {
        final String formattedType = (type < Http2.FRAME_NAMES.length) ? Http2.FRAME_NAMES[type] : Util.format("0x%02x", type);
        final String formattedFlags = formatFlags(type, flags);
        return Util.format("%s 0x%08x %5d %-13s %s", inbound ? "<<" : ">>", streamId, length, formattedType, formattedFlags);
    }
    
    static String formatFlags(final byte type, final byte flags) {
        if (flags == 0) {
            return "";
        }
        switch (type) {
            case 4:
            case 6: {
                return (flags == 1) ? "ACK" : Http2.BINARY[flags];
            }
            case 2:
            case 3:
            case 7:
            case 8: {
                return Http2.BINARY[flags];
            }
            default: {
                final String result = (flags < Http2.FLAGS.length) ? Http2.FLAGS[flags] : Http2.BINARY[flags];
                if (type == 5 && (flags & 0x4) != 0x0) {
                    return result.replace("HEADERS", "PUSH_PROMISE");
                }
                if (type == 0 && (flags & 0x20) != 0x0) {
                    return result.replace("PRIORITY", "COMPRESSED");
                }
                return result;
            }
        }
    }
    
    static {
        CONNECTION_PREFACE = ByteString.encodeUtf8("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        FRAME_NAMES = new String[] { "DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION" };
        FLAGS = new String[64];
        BINARY = new String[256];
        for (int i = 0; i < Http2.BINARY.length; ++i) {
            Http2.BINARY[i] = Util.format("%8s", Integer.toBinaryString(i)).replace(' ', '0');
        }
        Http2.FLAGS[0] = "";
        Http2.FLAGS[1] = "END_STREAM";
        final int[] prefixFlags = { 1 };
        Http2.FLAGS[8] = "PADDED";
        final int[] array = prefixFlags;
        for (int k = 0; k < 1; ++k) {
            final int prefixFlag = array[k];
            Http2.FLAGS[prefixFlag | 0x8] = Http2.FLAGS[prefixFlag] + "|PADDED";
        }
        Http2.FLAGS[4] = "END_HEADERS";
        Http2.FLAGS[32] = "PRIORITY";
        Http2.FLAGS[36] = "END_HEADERS|PRIORITY";
        final int[] array2;
        final int[] frameFlags = array2 = new int[] { 4, 32, 36 };
        for (int l = 0; l < 3; ++l) {
            final int frameFlag = array2[l];
            final int[] array3 = prefixFlags;
            for (int n = 0; n < 1; ++n) {
                final int prefixFlag2 = array3[n];
                Http2.FLAGS[prefixFlag2 | frameFlag] = Http2.FLAGS[prefixFlag2] + '|' + Http2.FLAGS[frameFlag];
                Http2.FLAGS[prefixFlag2 | frameFlag | 0x8] = Http2.FLAGS[prefixFlag2] + '|' + Http2.FLAGS[frameFlag] + "|PADDED";
            }
        }
        for (int j = 0; j < Http2.FLAGS.length; ++j) {
            if (Http2.FLAGS[j] == null) {
                Http2.FLAGS[j] = Http2.BINARY[j];
            }
        }
    }
}
