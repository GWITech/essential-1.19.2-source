package gg.essential.lib.okio;

import java.io.*;
import java.nio.charset.*;

public interface BufferedSource extends Source
{
    Buffer buffer();
    
    boolean exhausted() throws IOException;
    
    void require(final long p0) throws IOException;
    
    byte readByte() throws IOException;
    
    short readShort() throws IOException;
    
    short readShortLe() throws IOException;
    
    int readInt() throws IOException;
    
    int readIntLe() throws IOException;
    
    long readHexadecimalUnsignedLong() throws IOException;
    
    void skip(final long p0) throws IOException;
    
    ByteString readByteString(final long p0) throws IOException;
    
    byte[] readByteArray(final long p0) throws IOException;
    
    void readFully(final byte[] p0) throws IOException;
    
    String readUtf8LineStrict() throws IOException;
    
    String readString(final Charset p0) throws IOException;
    
    long indexOf$132bdb() throws IOException;
    
    boolean rangeEquals$45b61a70(final ByteString p0) throws IOException;
}
