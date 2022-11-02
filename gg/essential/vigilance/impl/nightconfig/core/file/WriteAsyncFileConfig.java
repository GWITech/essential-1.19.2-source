package gg.essential.vigilance.impl.nightconfig.core.file;

import gg.essential.vigilance.impl.nightconfig.core.utils.*;
import java.nio.charset.*;
import java.util.concurrent.atomic.*;
import java.nio.file.*;
import gg.essential.vigilance.impl.nightconfig.core.*;
import java.nio.channels.*;
import java.io.*;
import java.nio.*;
import gg.essential.vigilance.impl.nightconfig.core.io.*;

final class WriteAsyncFileConfig<C extends Config> extends ConfigWrapper<C> implements FileConfig
{
    private final Path nioPath;
    private final Charset charset;
    private final AtomicBoolean closed;
    private AsynchronousFileChannel channel;
    private final Object channelGuard;
    private final AtomicBoolean currentlyWriting;
    private final AtomicBoolean mustWriteAgain;
    private final ConfigWriter writer;
    private final WriteCompletedHandler writeCompletedHandler;
    private final OpenOption[] openOptions;
    private final ConfigParser<?> parser;
    private final FileNotFoundAction nefAction;
    private final ParsingMode parsingMode;
    
    WriteAsyncFileConfig(final C config, final Path nioPath, final Charset charset, final ConfigWriter writer, final WritingMode writingMode, final ConfigParser<?> parser, final ParsingMode parsingMode, final FileNotFoundAction nefAction) {
        super(config);
        this.closed = new AtomicBoolean();
        this.channelGuard = new Object();
        this.currentlyWriting = new AtomicBoolean();
        this.mustWriteAgain = new AtomicBoolean();
        this.nioPath = nioPath;
        this.charset = charset;
        this.writer = writer;
        this.parser = parser;
        this.parsingMode = parsingMode;
        this.nefAction = nefAction;
        if (writingMode == WritingMode.APPEND) {
            this.openOptions = new OpenOption[] { StandardOpenOption.WRITE, StandardOpenOption.CREATE };
        }
        else {
            this.openOptions = new OpenOption[] { StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING };
        }
        this.writeCompletedHandler = new WriteCompletedHandler(null);
    }
    
    @Override
    public File getFile() {
        return this.nioPath.toFile();
    }
    
    @Override
    public Path getNioPath() {
        return this.nioPath;
    }
    
    @Override
    public void save() {
        if (this.closed.get()) {
            throw new IllegalStateException("Cannot save a closed FileConfig");
        }
        this.save(true);
    }
    
    @Override
    public void close() {
        if (this.closed.compareAndSet(false, true)) {
            synchronized (this.channelGuard) {
                while (this.currentlyWriting.get()) {
                    try {
                        this.channelGuard.wait();
                        continue;
                    }
                    catch (final InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    break;
                }
            }
        }
    }
    
    private void save(final boolean saveLaterIfWriting) {
        final boolean canSaveNow = this.currentlyWriting.compareAndSet(false, true);
        if (canSaveNow) {
            final CharsWrapper.Builder builder = new CharsWrapper.Builder(512);
            this.writer.write(this.config, builder);
            final CharBuffer chars = CharBuffer.wrap(builder.build());
            final ByteBuffer buffer = this.charset.encode(chars);
            synchronized (this.channelGuard) {
                try {
                    (this.channel = AsynchronousFileChannel.open(this.nioPath, this.openOptions)).write(buffer, this.channel.size(), (Object)null, this.writeCompletedHandler);
                }
                catch (final IOException e) {
                    this.writeCompletedHandler.failed(e, null);
                }
            }
        }
        else if (saveLaterIfWriting) {
            this.mustWriteAgain.set(true);
        }
    }
    
    @Override
    public void load() {
        if (this.closed.get()) {
            throw new IllegalStateException("Cannot (re)load a closed FileConfig");
        }
        if (!this.currentlyWriting.get()) {
            this.parser.parse(this.nioPath, this.config, this.parsingMode, this.nefAction);
        }
    }
    
    static /* synthetic */ AtomicBoolean access$100(final WriteAsyncFileConfig x0) {
        return x0.currentlyWriting;
    }
    
    static /* synthetic */ AtomicBoolean access$200(final WriteAsyncFileConfig x0) {
        return x0.mustWriteAgain;
    }
    
    static /* synthetic */ void access$300(final WriteAsyncFileConfig x0, final boolean x1) {
        x0.save(x1);
    }
    
    static /* synthetic */ Object access$400(final WriteAsyncFileConfig x0) {
        return x0.channelGuard;
    }
    
    static /* synthetic */ AsynchronousFileChannel access$500(final WriteAsyncFileConfig x0) {
        return x0.channel;
    }
    
    static /* synthetic */ AsynchronousFileChannel access$502(final WriteAsyncFileConfig x0, final AsynchronousFileChannel x1) {
        return x0.channel = x1;
    }
    
    static /* synthetic */ Path access$600(final WriteAsyncFileConfig x0) {
        return x0.nioPath;
    }
    
    private final class WriteCompletedHandler implements CompletionHandler<Integer, Object>
    {
        final /* synthetic */ WriteAsyncFileConfig this$0;
        
        private WriteCompletedHandler(final WriteAsyncFileConfig this$0) {
            this.this$0 = this$0;
            super();
        }
        
        @Override
        public void completed(final Integer result, final Object attachment) {
            this.this$0.currentlyWriting.set(false);
            if (this.this$0.mustWriteAgain.getAndSet(false)) {
                WriteAsyncFileConfig.this.save(false);
            }
            else {
                synchronized (this.this$0.channelGuard) {
                    try {
                        this.this$0.channel.close();
                        this.this$0.channel = null;
                    }
                    catch (final IOException e) {
                        this.failed(e, null);
                    }
                    finally {
                        this.this$0.channelGuard.notify();
                    }
                }
            }
        }
        
        @Override
        public void failed(final Throwable exc, final Object attachment) {
            throw new WritingException("Error while saving the FileConfig to " + this.this$0.nioPath, exc);
        }
        
        @Override
        public /* bridge */ void completed(final Object o, final Object attachment) {
            this.completed((Integer)o, attachment);
        }
        
        WriteCompletedHandler(final WriteAsyncFileConfig x0, final WriteAsyncFileConfig.WriteAsyncFileConfig$1 x1) {
            this(x0);
        }
    }
}
