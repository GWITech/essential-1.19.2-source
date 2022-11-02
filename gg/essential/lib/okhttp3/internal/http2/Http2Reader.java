package gg.essential.lib.okhttp3.internal.http2;

import java.util.logging.*;
import gg.essential.lib.okhttp3.internal.*;
import java.io.*;
import java.util.*;
import gg.essential.lib.okio.*;

final class Http2Reader implements Closeable
{
    static final Logger logger;
    private final BufferedSource source;
    private final ContinuationSource continuation;
    private final boolean client;
    final Hpack.Reader hpackReader;
    
    Http2Reader(final BufferedSource source, final boolean client) {
        super();
        this.source = source;
        this.client = client;
        this.continuation = new ContinuationSource(this.source);
        this.hpackReader = new Hpack.Reader(this.continuation, (byte)0);
    }
    
    public void readConnectionPreface(final Handler handler) throws IOException {
        if (this.client) {
            if (!this.nextFrame(true, handler)) {
                throw Http2.ioException("Required SETTINGS preface not received", new Object[0]);
            }
        }
        else {
            final ByteString connectionPreface = this.source.readByteString(Http2.CONNECTION_PREFACE.size());
            if (Http2Reader.logger.isLoggable(Level.FINE)) {
                Http2Reader.logger.fine(Util.format("<< CONNECTION %s", connectionPreface.hex()));
            }
            if (!Http2.CONNECTION_PREFACE.equals(connectionPreface)) {
                throw Http2.ioException("Expected a connection header but was %s", connectionPreface.utf8());
            }
        }
    }
    
    public boolean nextFrame(final boolean requireSettings, final Handler handler) throws IOException {
        try {
            this.source.require(9L);
        }
        catch (final IOException ex) {
            return false;
        }
        final int length = readMedium(this.source);
        if (length < 0 || length > 16384) {
            throw Http2.ioException("FRAME_SIZE_ERROR: %s", length);
        }
        final byte type = (byte)(this.source.readByte() & 0xFF);
        if (requireSettings && type != 4) {
            throw Http2.ioException("Expected a SETTINGS frame but was %s", type);
        }
        final byte flags = (byte)(this.source.readByte() & 0xFF);
        final int streamId = this.source.readInt() & Integer.MAX_VALUE;
        if (Http2Reader.logger.isLoggable(Level.FINE)) {
            Http2Reader.logger.fine(Http2.frameLog(true, streamId, length, type, flags));
        }
        switch (type) {
            case 0: {
                this.readData(handler, length, flags, streamId);
                break;
            }
            case 1: {
                this.readHeaders(handler, length, flags, streamId);
                break;
            }
            case 2: {
                this.readPriority$3cfb01e$7bfe5a78(length, streamId);
                break;
            }
            case 3: {
                this.readRstStream$3cfb01e(handler, length, streamId);
                break;
            }
            case 4: {
                this.readSettings(handler, length, flags, streamId);
                break;
            }
            case 5: {
                this.readPushPromise(handler, length, flags, streamId);
                break;
            }
            case 6: {
                this.readPing(handler, length, flags, streamId);
                break;
            }
            case 7: {
                this.readGoAway$3cfb01e(handler, length, streamId);
                break;
            }
            case 8: {
                this.readWindowUpdate$3cfb01e(handler, length, streamId);
                break;
            }
            default: {
                this.source.skip(length);
                break;
            }
        }
        return true;
    }
    
    private void readHeaders(final Handler handler, int length, final byte flags, final int streamId) throws IOException {
        if (streamId == 0) {
            throw Http2.ioException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0", new Object[0]);
        }
        final boolean endStream = (flags & 0x1) != 0x0;
        final short padding = (short)(((flags & 0x8) != 0x0) ? ((short)(this.source.readByte() & 0xFF)) : 0);
        if ((flags & 0x20) != 0x0) {
            this.readPriority$14841725();
            length -= 5;
        }
        length = lengthWithoutPadding(length, flags, padding);
        final List<Header> headerBlock = this.readHeaderBlock(length, padding, flags, streamId);
        handler.headers$64c3d190(endStream, streamId, headerBlock);
    }
    
    private List<Header> readHeaderBlock(final int length, final short padding, final byte flags, final int streamId) throws IOException {
        final ContinuationSource continuation = this.continuation;
        this.continuation.left = length;
        continuation.length = length;
        this.continuation.padding = padding;
        this.continuation.flags = flags;
        this.continuation.streamId = streamId;
        this.hpackReader.readHeaders();
        return this.hpackReader.getAndResetHeaderList();
    }
    
    private void readData(final Handler handler, int length, final byte flags, final int streamId) throws IOException {
        if (streamId == 0) {
            throw Http2.ioException("PROTOCOL_ERROR: TYPE_DATA streamId == 0", new Object[0]);
        }
        final boolean inFinished = (flags & 0x1) != 0x0;
        final boolean gzipped = (flags & 0x20) != 0x0;
        if (gzipped) {
            throw Http2.ioException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA", new Object[0]);
        }
        final short padding = (short)(((flags & 0x8) != 0x0) ? ((short)(this.source.readByte() & 0xFF)) : 0);
        length = lengthWithoutPadding(length, flags, padding);
        handler.data(inFinished, streamId, this.source, length);
        this.source.skip(padding);
    }
    
    private void readPriority$3cfb01e$7bfe5a78(final int length, final int streamId) throws IOException {
        if (length != 5) {
            throw Http2.ioException("TYPE_PRIORITY length: %d != 5", length);
        }
        if (streamId == 0) {
            throw Http2.ioException("TYPE_PRIORITY streamId == 0", new Object[0]);
        }
        this.readPriority$14841725();
    }
    
    private void readPriority$14841725() throws IOException {
        this.source.readInt();
        this.source.readByte();
    }
    
    private void readRstStream$3cfb01e(final Handler handler, final int length, final int streamId) throws IOException {
        if (length != 4) {
            throw Http2.ioException("TYPE_RST_STREAM length: %d != 4", length);
        }
        if (streamId == 0) {
            throw Http2.ioException("TYPE_RST_STREAM streamId == 0", new Object[0]);
        }
        final int errorCodeInt = this.source.readInt();
        final ErrorCode errorCode = ErrorCode.fromHttp2(errorCodeInt);
        if (errorCode == null) {
            throw Http2.ioException("TYPE_RST_STREAM unexpected error code: %d", errorCodeInt);
        }
        handler.rstStream(streamId, errorCode);
    }
    
    private void readSettings(final Handler handler, final int length, final byte flags, final int streamId) throws IOException {
        if (streamId != 0) {
            throw Http2.ioException("TYPE_SETTINGS streamId != 0", new Object[0]);
        }
        if ((flags & 0x1) != 0x0) {
            if (length != 0) {
                throw Http2.ioException("FRAME_SIZE_ERROR ack frame should be empty!", new Object[0]);
            }
        }
        else {
            if (length % 6 != 0) {
                throw Http2.ioException("TYPE_SETTINGS length %% 6 != 0: %s", length);
            }
            final Settings settings = new Settings();
            for (int i = 0; i < length; i += 6) {
                short id = this.source.readShort();
                final int value = this.source.readInt();
                switch (id) {
                    case 2: {
                        if (value != 0 && value != 1) {
                            throw Http2.ioException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1", new Object[0]);
                        }
                        break;
                    }
                    case 3: {
                        id = 4;
                        break;
                    }
                    case 4: {
                        id = 7;
                        if (value < 0) {
                            throw Http2.ioException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1", new Object[0]);
                        }
                        break;
                    }
                    case 5: {
                        if (value < 16384 || value > 16777215) {
                            throw Http2.ioException("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: %s", value);
                        }
                        break;
                    }
                }
                settings.set(id, value);
            }
            handler.settings$14e94388(settings);
        }
    }
    
    private void readPushPromise(final Handler handler, int length, final byte flags, final int streamId) throws IOException {
        if (streamId == 0) {
            throw Http2.ioException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0", new Object[0]);
        }
        final short padding = (short)(((flags & 0x8) != 0x0) ? ((short)(this.source.readByte() & 0xFF)) : 0);
        final int promisedStreamId = this.source.readInt() & Integer.MAX_VALUE;
        length -= 4;
        length = lengthWithoutPadding(length, flags, padding);
        final List<Header> headerBlock = this.readHeaderBlock(length, padding, flags, streamId);
        handler.pushPromise$16014a7a(promisedStreamId, headerBlock);
    }
    
    private void readPing(final Handler handler, final int length, final byte flags, final int streamId) throws IOException {
        if (length != 8) {
            throw Http2.ioException("TYPE_PING length != 8: %s", length);
        }
        if (streamId != 0) {
            throw Http2.ioException("TYPE_PING streamId != 0", new Object[0]);
        }
        final int payload1 = this.source.readInt();
        final int payload2 = this.source.readInt();
        final boolean ack = (flags & 0x1) != 0x0;
        handler.ping(ack, payload1, payload2);
    }
    
    private void readGoAway$3cfb01e(final Handler handler, final int length, final int streamId) throws IOException {
        if (length < 8) {
            throw Http2.ioException("TYPE_GOAWAY length < 8: %s", length);
        }
        if (streamId != 0) {
            throw Http2.ioException("TYPE_GOAWAY streamId != 0", new Object[0]);
        }
        final int lastStreamId = this.source.readInt();
        final int errorCodeInt = this.source.readInt();
        final int opaqueDataLength = length - 8;
        final ErrorCode errorCode = ErrorCode.fromHttp2(errorCodeInt);
        if (errorCode == null) {
            throw Http2.ioException("TYPE_GOAWAY unexpected error code: %d", errorCodeInt);
        }
        ByteString debugData = ByteString.EMPTY;
        if (opaqueDataLength > 0) {
            debugData = this.source.readByteString(opaqueDataLength);
        }
        handler.goAway$4b802bc(lastStreamId, debugData);
    }
    
    private void readWindowUpdate$3cfb01e(final Handler handler, final int length, final int streamId) throws IOException {
        if (length != 4) {
            throw Http2.ioException("TYPE_WINDOW_UPDATE length !=4: %s", length);
        }
        final long increment = (long)this.source.readInt() & 0x7FFFFFFFL;
        if (increment == 0L) {
            throw Http2.ioException("windowSizeIncrement was 0", increment);
        }
        handler.windowUpdate(streamId, increment);
    }
    
    @Override
    public void close() throws IOException {
        this.source.close();
    }
    
    static int readMedium(final BufferedSource source) throws IOException {
        return (source.readByte() & 0xFF) << 16 | (source.readByte() & 0xFF) << 8 | (source.readByte() & 0xFF);
    }
    
    static int lengthWithoutPadding(int length, final byte flags, final short padding) throws IOException {
        if ((flags & 0x8) != 0x0) {
            --length;
        }
        if (padding > length) {
            throw Http2.ioException("PROTOCOL_ERROR padding %s > remaining length %s", padding, length);
        }
        return (short)(length - padding);
    }
    
    static {
        logger = Logger.getLogger(Http2.class.getName());
    }
    
    static final class ContinuationSource implements Source
    {
        private final BufferedSource source;
        int length;
        byte flags;
        int streamId;
        int left;
        short padding;
        
        ContinuationSource(final BufferedSource source) {
            super();
            this.source = source;
        }
        
        @Override
        public long read(final Buffer sink, final long byteCount) throws IOException {
            while (this.left == 0) {
                this.source.skip(this.padding);
                this.padding = 0;
                if ((this.flags & 0x4) != 0x0) {
                    return -1L;
                }
                this.readContinuationHeader();
            }
            final long read = this.source.read(sink, Math.min(byteCount, this.left));
            if (read == -1L) {
                return -1L;
            }
            this.left -= (int)read;
            return read;
        }
        
        @Override
        public Timeout timeout() {
            return this.source.timeout();
        }
        
        @Override
        public void close() throws IOException {
        }
        
        private void readContinuationHeader() throws IOException {
            final int previousStreamId = this.streamId;
            final int medium = Http2Reader.readMedium(this.source);
            this.left = medium;
            this.length = medium;
            final byte type = (byte)(this.source.readByte() & 0xFF);
            this.flags = (byte)(this.source.readByte() & 0xFF);
            if (Http2Reader.logger.isLoggable(Level.FINE)) {
                Http2Reader.logger.fine(Http2.frameLog(true, this.streamId, this.length, type, this.flags));
            }
            this.streamId = (this.source.readInt() & Integer.MAX_VALUE);
            if (type != 9) {
                throw Http2.ioException("%s != TYPE_CONTINUATION", type);
            }
            if (this.streamId != previousStreamId) {
                throw Http2.ioException("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }
    }
    
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
}
