package gg.essential.lib.okhttp3.internal.http2;

import java.io.*;
import gg.essential.lib.okio.*;

final class FramingSink implements Sink
{
    private final Buffer sendBuffer;
    boolean closed;
    boolean finished;
    static final /* synthetic */ boolean $assertionsDisabled;
    final /* synthetic */ Http2Stream this$0;
    
    FramingSink(final Http2Stream this$0) {
        this.this$0 = this$0;
        super();
        this.sendBuffer = new Buffer();
    }
    
    @Override
    public void write(final Buffer source, final long byteCount) throws IOException {
        assert !Thread.holdsLock(this.this$0);
        this.sendBuffer.write(source, byteCount);
        while (this.sendBuffer.size() >= 16384L) {
            this.emitFrame(false);
        }
    }
    
    private void emitFrame(final boolean outFinished) throws IOException {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
        //     4: dup            
        //     5: astore          4
        //     7: monitorenter   
        //     8: aload_0         /* this */
        //     9: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
        //    12: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.writeTimeout:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream$StreamTimeout;
        //    15: invokevirtual   gg/essential/lib/okhttp3/internal/http2/Http2Stream$StreamTimeout.enter:()V
        //    18: aload_0         /* this */
        //    19: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
        //    22: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.bytesLeftInWriteWindow:J
        //    25: lconst_0       
        //    26: lcmp           
        //    27: ifgt            64
        //    30: aload_0         /* this */
        //    31: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.finished:Z
        //    34: ifne            64
        //    37: aload_0         /* this */
        //    38: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.closed:Z
        //    41: ifne            64
        //    44: aload_0         /* this */
        //    45: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
        //    48: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.errorCode:Lgg/essential/lib/okhttp3/internal/http2/ErrorCode;
        //    51: ifnonnull       64
        //    54: aload_0         /* this */
        //    55: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
        //    58: invokevirtual   gg/essential/lib/okhttp3/internal/http2/Http2Stream.waitForIo:()V
        //    61: goto            18
        //    64: aload_0         /* this */
        //    65: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
        //    68: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.writeTimeout:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream$StreamTimeout;
        //    71: invokevirtual   gg/essential/lib/okhttp3/internal/http2/Http2Stream$StreamTimeout.exitAndThrowIfTimedOut:()V
        //    74: goto            92
        //    77: astore          5
        //    79: aload_0         /* this */
        //    80: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
        //    83: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.writeTimeout:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream$StreamTimeout;
        //    86: invokevirtual   gg/essential/lib/okhttp3/internal/http2/Http2Stream$StreamTimeout.exitAndThrowIfTimedOut:()V
        //    89: aload           5
        //    91: athrow         
        //    92: aload_0         /* this */
        //    93: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
        //    96: invokevirtual   gg/essential/lib/okhttp3/internal/http2/Http2Stream.checkOutNotClosed:()V
        //    99: aload_0         /* this */
        //   100: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
        //   103: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.bytesLeftInWriteWindow:J
        //   106: aload_0         /* this */
        //   107: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.sendBuffer:Lgg/essential/lib/okio/Buffer;
        //   110: invokevirtual   gg/essential/lib/okio/Buffer.size:()J
        //   113: invokestatic    java/lang/Math.min:(JJ)J
        //   116: lstore_2        /* toWrite */
        //   117: aload_0         /* this */
        //   118: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
        //   121: dup            
        //   122: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.bytesLeftInWriteWindow:J
        //   125: lload_2         /* toWrite */
        //   126: lsub           
        //   127: putfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.bytesLeftInWriteWindow:J
        //   130: aload           4
        //   132: monitorexit    
        //   133: goto            144
        //   136: astore          6
        //   138: aload           4
        //   140: monitorexit    
        //   141: aload           6
        //   143: athrow         
        //   144: aload_0         /* this */
        //   145: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
        //   148: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.writeTimeout:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream$StreamTimeout;
        //   151: invokevirtual   gg/essential/lib/okhttp3/internal/http2/Http2Stream$StreamTimeout.enter:()V
        //   154: aload_0         /* this */
        //   155: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
        //   158: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.connection:Lgg/essential/lib/okhttp3/internal/http2/Http2Connection;
        //   161: aload_0         /* this */
        //   162: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
        //   165: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.id:I
        //   168: iload_1         /* outFinished */
        //   169: ifeq            188
        //   172: lload_2         /* toWrite */
        //   173: aload_0         /* this */
        //   174: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.sendBuffer:Lgg/essential/lib/okio/Buffer;
        //   177: invokevirtual   gg/essential/lib/okio/Buffer.size:()J
        //   180: lcmp           
        //   181: ifne            188
        //   184: iconst_1       
        //   185: goto            189
        //   188: iconst_0       
        //   189: aload_0         /* this */
        //   190: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.sendBuffer:Lgg/essential/lib/okio/Buffer;
        //   193: lload_2         /* toWrite */
        //   194: invokevirtual   gg/essential/lib/okhttp3/internal/http2/Http2Connection.writeData:(IZLgg/essential/lib/okio/Buffer;J)V
        //   197: aload_0         /* this */
        //   198: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
        //   201: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.writeTimeout:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream$StreamTimeout;
        //   204: invokevirtual   gg/essential/lib/okhttp3/internal/http2/Http2Stream$StreamTimeout.exitAndThrowIfTimedOut:()V
        //   207: goto            225
        //   210: astore          7
        //   212: aload_0         /* this */
        //   213: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream$FramingSink.this$0:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream;
        //   216: getfield        gg/essential/lib/okhttp3/internal/http2/Http2Stream.writeTimeout:Lgg/essential/lib/okhttp3/internal/http2/Http2Stream$StreamTimeout;
        //   219: invokevirtual   gg/essential/lib/okhttp3/internal/http2/Http2Stream$StreamTimeout.exitAndThrowIfTimedOut:()V
        //   222: aload           7
        //   224: athrow         
        //   225: return         
        //    Exceptions:
        //  throws java.io.IOException
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  outFinished  
        //    StackMapTable: 00 0A FE 00 12 00 00 07 00 09 2D FF 00 0C 00 05 07 00 02 00 00 00 07 00 09 00 01 07 00 5C FF 00 0E 00 05 07 00 02 01 00 00 07 00 09 00 00 FF 00 2B 00 05 00 00 00 00 07 00 09 00 01 07 00 5C FF 00 07 00 03 07 00 02 01 04 00 00 FF 00 2B 00 03 07 00 02 00 04 00 02 07 00 6F 01 FF 00 00 00 03 07 00 02 00 04 00 03 07 00 6F 01 01 FF 00 14 00 01 07 00 02 00 01 07 00 5C FA 00 0E
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  18     64     77     92     Any
        //  8      133    136    144    Any
        //  154    197    210    225    Any
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public void flush() throws IOException {
        assert !Thread.holdsLock(this.this$0);
        synchronized (this.this$0) {
            this.this$0.checkOutNotClosed();
        }
        while (this.sendBuffer.size() > 0L) {
            this.emitFrame(false);
            this.this$0.connection.flush();
        }
    }
    
    @Override
    public Timeout timeout() {
        return this.this$0.writeTimeout;
    }
    
    @Override
    public void close() throws IOException {
        assert !Thread.holdsLock(this.this$0);
        synchronized (this.this$0) {
            if (this.closed) {
                return;
            }
        }
        if (!this.this$0.sink.finished) {
            if (this.sendBuffer.size() > 0L) {
                while (this.sendBuffer.size() > 0L) {
                    this.emitFrame(true);
                }
            }
            else {
                this.this$0.connection.writeData(this.this$0.id, true, null, 0L);
            }
        }
        synchronized (this.this$0) {
            this.closed = true;
        }
        this.this$0.connection.flush();
        this.this$0.cancelStreamIfNecessary();
    }
    
    static {
        $assertionsDisabled = !Http2Stream.class.desiredAssertionStatus();
    }
}
