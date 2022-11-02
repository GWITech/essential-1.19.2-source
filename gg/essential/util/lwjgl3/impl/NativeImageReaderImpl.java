package gg.essential.util.lwjgl3.impl;

import kotlin.*;
import java.util.*;
import java.nio.file.*;
import org.jetbrains.annotations.*;
import gg.essential.util.lwjgl3.api.*;
import kotlin.jvm.internal.*;
import io.netty.buffer.*;
import org.lwjgl.stb.*;
import kotlin.jdk7.*;
import java.io.*;
import org.lwjgl.system.*;
import java.nio.*;
import java.nio.channels.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\bH\u0016R2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018" }, d2 = { "Lgg/essential/util/lwjgl3/impl/NativeImageReaderImpl;", "Lgg/essential/util/lwjgl3/api/NativeImageReader;", "()V", "fileOptions", "Ljava/util/EnumSet;", "Ljava/nio/file/StandardOpenOption;", "kotlin.jvm.PlatformType", "getImageData", "Lgg/essential/util/lwjgl3/api/ImageData;", "buf", "Lio/netty/buffer/ByteBuf;", "allocator", "Lio/netty/buffer/ByteBufAllocator;", "inputBuffer", "Ljava/nio/ByteBuffer;", "path", "Ljava/nio/file/Path;", "readResource", "inputStream", "Ljava/io/InputStream;", "saveImage", "", "imageData", "WriteCallback", "impl" })
public final class NativeImageReaderImpl implements NativeImageReader
{
    private final EnumSet<StandardOpenOption> fileOptions;
    
    public NativeImageReaderImpl() {
        super();
        this.fileOptions = EnumSet.of(StandardOpenOption.WRITE, StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
    }
    
    @NotNull
    @Override
    public ImageData getImageData(@NotNull final Path path, @NotNull final ByteBufAllocator allocator) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "path"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* allocator */
        //     7: ldc             "allocator"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_1         /* path */
        //    13: iconst_0       
        //    14: anewarray       Ljava/nio/file/OpenOption;
        //    17: invokestatic    java/nio/file/Files.newInputStream:(Ljava/nio/file/Path;[Ljava/nio/file/OpenOption;)Ljava/io/InputStream;
        //    20: checkcast       Ljava/io/Closeable;
        //    23: astore          4
        //    25: aconst_null    
        //    26: astore          5
        //    28: nop            
        //    29: aload           4
        //    31: checkcast       Ljava/io/InputStream;
        //    34: astore          it
        //    36: iconst_0       
        //    37: istore          $i$a$-use-NativeImageReaderImpl$getImageData$fileData$1
        //    39: aload_0         /* this */
        //    40: aload           it
        //    42: ldc             "it"
        //    44: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    47: aload           it
        //    49: invokevirtual   gg/essential/util/lwjgl3/impl/NativeImageReaderImpl.readResource:(Ljava/io/InputStream;)Ljava/nio/ByteBuffer;
        //    52: astore          null
        //    54: aload           4
        //    56: aload           5
        //    58: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //    61: aload           6
        //    63: goto            87
        //    66: astore          6
        //    68: aload           6
        //    70: astore          5
        //    72: aload           6
        //    74: athrow         
        //    75: astore          6
        //    77: aload           4
        //    79: aload           5
        //    81: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //    84: aload           6
        //    86: athrow         
        //    87: astore_3        /* fileData */
        //    88: aload_3         /* fileData */
        //    89: invokevirtual   java/nio/ByteBuffer.rewind:()Ljava/nio/Buffer;
        //    92: pop            
        //    93: nop            
        //    94: aload_0         /* this */
        //    95: aload_3         /* fileData */
        //    96: aload_2         /* allocator */
        //    97: invokespecial   gg/essential/util/lwjgl3/impl/NativeImageReaderImpl.getImageData:(Ljava/nio/ByteBuffer;Lio/netty/buffer/ByteBufAllocator;)Lgg/essential/util/lwjgl3/api/ImageData;
        //   100: astore          4
        //   102: aload_3         /* fileData */
        //   103: checkcast       Ljava/nio/Buffer;
        //   106: invokestatic    org/lwjgl/system/MemoryUtil.memFree:(Ljava/nio/Buffer;)V
        //   109: aload           4
        //   111: areturn        
        //   112: astore          4
        //   114: aload_3         /* fileData */
        //   115: checkcast       Ljava/nio/Buffer;
        //   118: invokestatic    org/lwjgl/system/MemoryUtil.memFree:(Ljava/nio/Buffer;)V
        //   121: aload           4
        //   123: athrow         
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  path       
        //  allocator  
        //    StackMapTable: 00 04 FF 00 42 00 06 00 00 00 00 07 00 5D 05 00 01 07 00 4B FF 00 08 00 06 00 00 00 00 07 00 5D 07 00 4B 00 01 07 00 4B FF 00 0B 00 03 07 00 02 00 07 00 6F 00 01 07 00 71 FF 00 18 00 04 00 00 00 07 00 71 00 01 07 00 4B
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  28     54     66     75     Ljava/lang/Throwable;
        //  28     54     75     87     Any
        //  66     75     75     87     Any
        //  75     77     75     87     Any
        //  93     102    112    124    Any
        //  112    114    112    124    Any
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    @Override
    public ImageData getImageData(@NotNull final ByteBuf buf, @NotNull final ByteBufAllocator allocator) {
        Intrinsics.checkNotNullParameter((Object)buf, "buf");
        Intrinsics.checkNotNullParameter((Object)allocator, "allocator");
        ImageData imageData;
        if (buf.isDirect()) {
            final ByteBuffer nioBuffer = buf.nioBuffer();
            Intrinsics.checkNotNullExpressionValue((Object)nioBuffer, "buf.nioBuffer()");
            imageData = this.getImageData(nioBuffer, allocator);
        }
        else {
            final ByteBuf directBuf = Unpooled.directBuffer(buf.readableBytes());
            try {
                directBuf.writeBytes(buf, buf.readerIndex(), buf.readableBytes());
                final ByteBuffer nioBuffer2 = directBuf.nioBuffer();
                Intrinsics.checkNotNullExpressionValue((Object)nioBuffer2, "directBuf.nioBuffer()");
                return this.getImageData(nioBuffer2, allocator);
            }
            finally {
                directBuf.release();
            }
        }
        return imageData;
    }
    
    private final ImageData getImageData(final ByteBuffer inputBuffer, final ByteBufAllocator allocator) {
        final AutoCloseable autoCloseable = (AutoCloseable)MemoryStack.stackPush();
        Throwable t = null;
        try {
            final MemoryStack memoryStack = (MemoryStack)autoCloseable;
            final int n = 0;
            final IntBuffer widthBuffer = memoryStack.mallocInt(1);
            final IntBuffer heightBuffer = memoryStack.mallocInt(1);
            final IntBuffer fileChannels = memoryStack.mallocInt(1);
            final ByteBuffer stbi_load_from_memory = STBImage.stbi_load_from_memory(inputBuffer, widthBuffer, heightBuffer, fileChannels, 0);
            if (stbi_load_from_memory == null) {
                throw new IOException("Could not load image: " + STBImage.stbi_failure_reason());
            }
            Intrinsics.checkNotNullExpressionValue((Object)stbi_load_from_memory, "STBImage.stbi_load_from_\u2026ge.stbi_failure_reason())");
            final ByteBuffer nativeBuffer = stbi_load_from_memory;
            try {
                final ByteBuf buffer = allocator.directBuffer(nativeBuffer.remaining());
                buffer.writeBytes(nativeBuffer);
                Intrinsics.checkNotNullExpressionValue((Object)buffer, "buffer");
                final ImageData imageData = new ImageData(buffer, widthBuffer.get(0), heightBuffer.get(0), fileChannels.get(0));
                nativeBuffer.rewind();
                STBImage.stbi_image_free(nativeBuffer);
                return imageData;
            }
            finally {
                nativeBuffer.rewind();
                STBImage.stbi_image_free(nativeBuffer);
            }
        }
        catch (final Throwable t2) {
            t = t2;
            throw t2;
        }
        finally {
            AutoCloseableKt.closeFinally(autoCloseable, t);
        }
    }
    
    @Override
    public void saveImage(@NotNull final Path path, @NotNull final ImageData imageData) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "path"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* imageData */
        //     7: ldc             "imageData"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_1         /* path */
        //    13: aload_0         /* this */
        //    14: getfield        gg/essential/util/lwjgl3/impl/NativeImageReaderImpl.fileOptions:Ljava/util/EnumSet;
        //    17: checkcast       Ljava/util/Set;
        //    20: iconst_0       
        //    21: anewarray       Ljava/nio/file/attribute/FileAttribute;
        //    24: invokestatic    java/nio/file/Files.newByteChannel:(Ljava/nio/file/Path;Ljava/util/Set;[Ljava/nio/file/attribute/FileAttribute;)Ljava/nio/channels/SeekableByteChannel;
        //    27: checkcast       Ljava/io/Closeable;
        //    30: astore_3       
        //    31: aconst_null    
        //    32: astore          4
        //    34: nop            
        //    35: aload_3        
        //    36: checkcast       Ljava/nio/channels/SeekableByteChannel;
        //    39: astore          it
        //    41: iconst_0       
        //    42: istore          $i$a$-use-NativeImageReaderImpl$saveImage$1
        //    44: new             Lgg/essential/util/lwjgl3/impl/NativeImageReaderImpl$WriteCallback;
        //    47: dup            
        //    48: aload           it
        //    50: ldc             "it"
        //    52: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    55: aload           it
        //    57: checkcast       Ljava/nio/channels/WritableByteChannel;
        //    60: invokespecial   gg/essential/util/lwjgl3/impl/NativeImageReaderImpl$WriteCallback.<init>:(Ljava/nio/channels/WritableByteChannel;)V
        //    63: checkcast       Ljava/io/Closeable;
        //    66: astore          7
        //    68: aconst_null    
        //    69: astore          8
        //    71: nop            
        //    72: aload           7
        //    74: checkcast       Lgg/essential/util/lwjgl3/impl/NativeImageReaderImpl$WriteCallback;
        //    77: astore          writeCallback
        //    79: iconst_0       
        //    80: istore          $i$a$-use-NativeImageReaderImpl$saveImage$1$1
        //    82: aload           writeCallback
        //    84: invokevirtual   gg/essential/util/lwjgl3/impl/NativeImageReaderImpl$WriteCallback.address:()J
        //    87: lconst_0       
        //    88: aload_2         /* imageData */
        //    89: invokevirtual   gg/essential/util/lwjgl3/api/ImageData.getWidth:()I
        //    92: aload_2         /* imageData */
        //    93: invokevirtual   gg/essential/util/lwjgl3/api/ImageData.getHeight:()I
        //    96: aload_2         /* imageData */
        //    97: invokevirtual   gg/essential/util/lwjgl3/api/ImageData.getFileChannels:()I
        //   100: aload_2         /* imageData */
        //   101: invokevirtual   gg/essential/util/lwjgl3/api/ImageData.getData:()Lio/netty/buffer/ByteBuf;
        //   104: invokevirtual   io/netty/buffer/ByteBuf.nioBuffer:()Ljava/nio/ByteBuffer;
        //   107: invokestatic    org/lwjgl/system/MemoryUtil.memAddress:(Ljava/nio/ByteBuffer;)J
        //   110: iconst_0       
        //   111: invokestatic    org/lwjgl/stb/STBImageWrite.nstbi_write_png_to_func:(JJIIIJI)I
        //   114: ifeq            121
        //   117: iconst_1       
        //   118: goto            122
        //   121: iconst_0       
        //   122: istore          null
        //   124: aload           7
        //   126: aload           8
        //   128: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   131: iload           9
        //   133: goto            157
        //   136: astore          9
        //   138: aload           9
        //   140: astore          8
        //   142: aload           9
        //   144: athrow         
        //   145: astore          9
        //   147: aload           7
        //   149: aload           8
        //   151: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   154: aload           9
        //   156: athrow         
        //   157: nop            
        //   158: istore          null
        //   160: aload_3        
        //   161: aload           4
        //   163: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   166: goto            189
        //   169: astore          5
        //   171: aload           5
        //   173: astore          4
        //   175: aload           5
        //   177: athrow         
        //   178: astore          5
        //   180: aload_3        
        //   181: aload           4
        //   183: invokestatic    kotlin/io/CloseableKt.closeFinally:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   186: aload           5
        //   188: athrow         
        //   189: return         
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  path       
        //  imageData  
        //    StackMapTable: 00 08 FF 00 79 00 09 00 00 00 07 00 5D 05 00 00 07 00 5D 05 00 00 40 01 4D 07 00 4B FF 00 08 00 09 00 00 00 07 00 5D 05 00 00 07 00 5D 07 00 4B 00 01 07 00 4B FF 00 0B 00 05 00 00 00 07 00 5D 05 00 01 01 4B 07 00 4B FF 00 08 00 05 00 00 00 07 00 5D 07 00 4B 00 01 07 00 4B FF 00 0A 00 00 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                 
        //  -----  -----  -----  -----  ---------------------
        //  71     124    136    145    Ljava/lang/Throwable;
        //  71     124    145    157    Any
        //  136    145    145    157    Any
        //  145    147    145    157    Any
        //  34     160    169    178    Ljava/lang/Throwable;
        //  34     160    178    189    Any
        //  169    178    178    189    Any
        //  178    180    178    189    Any
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final ByteBuffer readResource(@NotNull final InputStream inputStream) throws IOException {
        Intrinsics.checkNotNullParameter((Object)inputStream, "inputStream");
        Object byteBuffer = null;
        try {
            if (inputStream instanceof FileInputStream) {
                final FileChannel fileChannel = ((FileInputStream)inputStream).getChannel();
                byteBuffer = MemoryUtil.memAlloc((int)fileChannel.size() + 1);
                while (fileChannel.read((ByteBuffer)byteBuffer) != -1) {}
            }
            else {
                byteBuffer = MemoryUtil.memAlloc(8192);
                for (ReadableByteChannel fileInputStream = Channels.newChannel(inputStream); fileInputStream.read((ByteBuffer)byteBuffer) != -1; byteBuffer = MemoryUtil.memRealloc((ByteBuffer)byteBuffer, ((Buffer)byteBuffer).capacity() * 2)) {
                    final Object o = byteBuffer;
                    if (o != null && ((Buffer)o).remaining() == 0) {}
                }
            }
            final Object o2 = byteBuffer;
            Intrinsics.checkNotNull(o2);
            final ByteBuffer it;
            final ByteBuffer byteBuffer2 = it = (ByteBuffer)o2;
            final int n = 0;
            byteBuffer = null;
            return byteBuffer2;
        }
        finally {
            if (byteBuffer != null) {
                MemoryUtil.memFree((Buffer)byteBuffer);
            }
        }
    }
}
