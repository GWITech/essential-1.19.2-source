package gg.essential.lib.okio;

import java.nio.charset.*;

final class Util
{
    public static final Charset UTF_8;
    
    public static void checkOffsetAndCount(final long size, final long offset, final long byteCount) {
        if ((offset | byteCount) < 0L || offset > size || size - offset < byteCount) {
            throw new ArrayIndexOutOfBoundsException(String.format("size=%s offset=%s byteCount=%s", size, offset, byteCount));
        }
    }
    
    public static short reverseBytesShort(final short s) {
        final int i = s & 0xFFFF;
        final int reversed = (i & 0xFF00) >>> 8 | (i & 0xFF) << 8;
        return (short)reversed;
    }
    
    public static int reverseBytesInt(final int i) {
        return (i & 0xFF000000) >>> 24 | (i & 0xFF0000) >>> 8 | (i & 0xFF00) << 8 | (i & 0xFF) << 24;
    }
    
    public static void sneakyRethrow(final Throwable t) {
        sneakyThrow2(t);
    }
    
    private static <T extends Throwable> void sneakyThrow2(final Throwable t) throws T, Throwable {
        throw t;
    }
    
    public static boolean arrayRangeEquals(final byte[] a, final int aOffset, final byte[] b, final int bOffset, final int byteCount) {
        for (int i = 0; i < byteCount; ++i) {
            if (a[i + aOffset] != b[i + bOffset]) {
                return false;
            }
        }
        return true;
    }
    
    static {
        UTF_8 = Charset.forName("UTF-8");
    }
}
