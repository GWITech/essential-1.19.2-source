package gg.essential.lib.okhttp3.internal.http2;

import java.io.*;
import java.util.*;
import gg.essential.lib.okio.*;

interface Handler
{
    void data(final boolean p0, final int p1, final BufferedSource p2, final int p3) throws IOException;
    
    void headers$64c3d190(final boolean p0, final int p1, final List<Header> p2);
    
    void rstStream(final int p0, final ErrorCode p1);
    
    void settings$14e94388(final Settings p0);
    
    void ping(final boolean p0, final int p1, final int p2);
    
    void goAway$4b802bc(final int p0, final ByteString p1);
    
    void windowUpdate(final int p0, final long p1);
    
    void pushPromise$16014a7a(final int p0, final List<Header> p1) throws IOException;
}
