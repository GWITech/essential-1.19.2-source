package gg.essential.lib.okio;

import javax.annotation.*;
import java.net.*;
import java.io.*;
import java.util.logging.*;

public final class Okio
{
    static final Logger logger;
    
    private Okio() {
        super();
    }
    
    public static BufferedSource buffer(final Source source) {
        return new RealBufferedSource(source);
    }
    
    public static BufferedSink buffer(final Sink sink) {
        return new RealBufferedSink(sink);
    }
    
    private static Sink sink(final OutputStream out, final Timeout timeout) {
        if (out == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (timeout == null) {
            throw new IllegalArgumentException("timeout == null");
        }
        return new Sink() {
            final /* synthetic */ Timeout val$timeout;
            final /* synthetic */ OutputStream val$out;
            
            Okio$1() {
                super();
            }
            
            @Override
            public void write(final Buffer source, long byteCount) throws IOException {
                Util.checkOffsetAndCount(source.size, 0L, byteCount);
                while (byteCount > 0L) {
                    timeout.throwIfReached();
                    final Segment head = source.head;
                    final int toCopy = (int)Math.min(byteCount, head.limit - head.pos);
                    out.write(head.data, head.pos, toCopy);
                    final Segment segment = head;
                    segment.pos += toCopy;
                    byteCount -= toCopy;
                    source.size -= toCopy;
                    if (head.pos == head.limit) {
                        source.head = head.pop();
                        SegmentPool.recycle(head);
                    }
                }
            }
            
            @Override
            public void flush() throws IOException {
                out.flush();
            }
            
            @Override
            public void close() throws IOException {
                out.close();
            }
            
            @Override
            public Timeout timeout() {
                return timeout;
            }
            
            @Override
            public String toString() {
                return "sink(" + out + ")";
            }
        };
    }
    
    public static Sink sink(final Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        final AsyncTimeout timeout = timeout(socket);
        final Sink sink = sink(socket.getOutputStream(), timeout);
        return timeout.sink(sink);
    }
    
    public static Source source(final InputStream in) {
        return source(in, new Timeout());
    }
    
    private static Source source(final InputStream in, final Timeout timeout) {
        if (in == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (timeout == null) {
            throw new IllegalArgumentException("timeout == null");
        }
        return new Source() {
            final /* synthetic */ Timeout val$timeout;
            final /* synthetic */ InputStream val$in;
            
            Okio$2() {
                super();
            }
            
            @Override
            public long read(final Buffer sink, final long byteCount) throws IOException {
                if (byteCount < 0L) {
                    throw new IllegalArgumentException("byteCount < 0: " + byteCount);
                }
                if (byteCount == 0L) {
                    return 0L;
                }
                try {
                    timeout.throwIfReached();
                    final Segment tail = sink.writableSegment(1);
                    final int maxToCopy = (int)Math.min(byteCount, 8192 - tail.limit);
                    final int bytesRead = in.read(tail.data, tail.limit, maxToCopy);
                    if (bytesRead == -1) {
                        return -1L;
                    }
                    final Segment segment = tail;
                    segment.limit += bytesRead;
                    sink.size += bytesRead;
                    return bytesRead;
                }
                catch (final AssertionError e) {
                    if (Okio.isAndroidGetsocknameError(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                }
            }
            
            @Override
            public void close() throws IOException {
                in.close();
            }
            
            @Override
            public Timeout timeout() {
                return timeout;
            }
            
            @Override
            public String toString() {
                return "source(" + in + ")";
            }
        };
    }
    
    public static Source source(final File file) throws FileNotFoundException {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return source(new FileInputStream(file));
    }
    
    public static Source source(final Socket socket) throws IOException {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        final AsyncTimeout timeout = timeout(socket);
        final Source source = source(socket.getInputStream(), timeout);
        return timeout.source(source);
    }
    
    private static AsyncTimeout timeout(final Socket socket) {
        return new AsyncTimeout() {
            final /* synthetic */ Socket val$socket;
            
            Okio$4() {
                super();
            }
            
            @Override
            protected IOException newTimeoutException(@Nullable final IOException cause) {
                final InterruptedIOException ioe = new SocketTimeoutException("timeout");
                if (cause != null) {
                    ioe.initCause(cause);
                }
                return ioe;
            }
            
            @Override
            protected void timedOut() {
                try {
                    socket.close();
                }
                catch (final Exception e) {
                    Okio.logger.log(Level.WARNING, "Failed to close timed out socket " + socket, e);
                }
                catch (final AssertionError e2) {
                    if (!Okio.isAndroidGetsocknameError(e2)) {
                        throw e2;
                    }
                    Okio.logger.log(Level.WARNING, "Failed to close timed out socket " + socket, e2);
                }
            }
        };
    }
    
    static boolean isAndroidGetsocknameError(final AssertionError e) {
        return e.getCause() != null && e.getMessage() != null && e.getMessage().contains("getsockname failed");
    }
    
    static {
        logger = Logger.getLogger(Okio.class.getName());
    }
}
