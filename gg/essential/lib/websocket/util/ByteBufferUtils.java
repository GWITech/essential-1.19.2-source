package gg.essential.lib.websocket.util;

import java.nio.*;

public class ByteBufferUtils
{
    public static ByteBuffer getEmptyByteBuffer() {
        return ByteBuffer.allocate(0);
    }
}
