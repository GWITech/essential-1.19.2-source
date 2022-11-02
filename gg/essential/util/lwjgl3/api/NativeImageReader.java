package gg.essential.util.lwjgl3.api;

import kotlin.*;
import java.nio.file.*;
import org.jetbrains.annotations.*;
import io.netty.buffer.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0003H&¨\u0006\r" }, d2 = { "Lgg/essential/util/lwjgl3/api/NativeImageReader;", "", "getImageData", "Lgg/essential/util/lwjgl3/api/ImageData;", "buf", "Lio/netty/buffer/ByteBuf;", "allocator", "Lio/netty/buffer/ByteBufAllocator;", "path", "Ljava/nio/file/Path;", "saveImage", "", "imageData", "lwjgl3" })
public interface NativeImageReader
{
    @NotNull
    ImageData getImageData(@NotNull final Path p0, @NotNull final ByteBufAllocator p1);
    
    @NotNull
    ImageData getImageData(@NotNull final ByteBuf p0, @NotNull final ByteBufAllocator p1);
    
    void saveImage(@NotNull final Path p0, @NotNull final ImageData p1);
}
