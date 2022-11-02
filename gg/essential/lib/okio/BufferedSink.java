package gg.essential.lib.okio;

import java.io.*;

public interface BufferedSink extends Sink
{
    Buffer buffer();
    
    BufferedSink write(final ByteString p0) throws IOException;
    
    BufferedSink write(final byte[] p0) throws IOException;
    
    BufferedSink write(final byte[] p0, final int p1, final int p2) throws IOException;
    
    long writeAll(final Source p0) throws IOException;
    
    BufferedSink writeUtf8(final String p0) throws IOException;
    
    BufferedSink writeByte(final int p0) throws IOException;
    
    BufferedSink writeShort(final int p0) throws IOException;
    
    BufferedSink writeInt(final int p0) throws IOException;
    
    BufferedSink writeDecimalLong(final long p0) throws IOException;
    
    BufferedSink writeHexadecimalUnsignedLong(final long p0) throws IOException;
    
    void flush() throws IOException;
    
    BufferedSink emitCompleteSegments() throws IOException;
}
