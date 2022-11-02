package gg.essential.gui.screenshot.providers;

import kotlin.*;
import org.jetbrains.annotations.*;
import io.netty.buffer.*;
import java.nio.file.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import gg.essential.util.*;
import java.util.*;
import kotlin.ranges.*;
import gg.essential.gui.screenshot.downsampling.*;
import java.io.*;
import gg.essential.util.lwjgl3.api.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000>
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0010$
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0000\u0018\u00002\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003B\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J0\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150
                                                   2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0017H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002
                                                   \u0000R \u0010	\u001a\b\u0012\u0004\u0012\u00020\u000b0
                                                   X\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\f\u0010\r"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0018""" }, d2 = { "Lgg/essential/gui/screenshot/providers/DiskWindowedImageProvider;", "Lgg/essential/gui/screenshot/providers/WindowedProvider;", "Lgg/essential/gui/screenshot/downsampling/PixelBuffer;", "Lgg/essential/gui/screenshot/providers/WindowedImageProvider;", "nativeImageReader", "Lgg/essential/util/lwjgl3/api/NativeImageReader;", "allocator", "Lio/netty/buffer/ByteBufAllocator;", "(Lgg/essential/util/lwjgl3/api/NativeImageReader;Lio/netty/buffer/ByteBufAllocator;)V", "items", "", "Ljava/nio/file/Path;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "loadImage", "path", "provide", "", "windows", "Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;", "optional", "", "essential" })
public final class DiskWindowedImageProvider implements WindowedProvider<PixelBuffer>
{
    @NotNull
    private final NativeImageReader nativeImageReader;
    @NotNull
    private final ByteBufAllocator allocator;
    @NotNull
    private List<? extends Path> items;
    
    public DiskWindowedImageProvider(@NotNull final NativeImageReader nativeImageReader, @NotNull final ByteBufAllocator allocator) {
        Intrinsics.checkNotNullParameter((Object)nativeImageReader, "nativeImageReader");
        Intrinsics.checkNotNullParameter((Object)allocator, "allocator");
        super();
        this.nativeImageReader = nativeImageReader;
        this.allocator = allocator;
        this.items = CollectionsKt.emptyList();
    }
    
    @NotNull
    @Override
    public List<Path> getItems() {
        return (List<Path>)this.items;
    }
    
    @Override
    public void setItems(@NotNull final List<? extends Path> <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.items = <set-?>;
    }
    
    @NotNull
    @Override
    public Map<Path, PixelBuffer> provide(@NotNull final List<WindowedProvider$Window> windows, @NotNull final Set<? extends Path> optional) {
        Intrinsics.checkNotNullParameter((Object)windows, "windows");
        Intrinsics.checkNotNullParameter((Object)optional, "optional");
        final Map map = new LinkedHashMap();
        for (final WindowedProvider$Window window : windows) {
            final IntProgression reversed = ExtensionsKt.reversed(window.getRange(), window.getBackwards());
            int i = reversed.getFirst();
            final int last = reversed.getLast();
            final int step = reversed.getStep();
            if ((step > 0 && i <= last) || (step < 0 && last <= i)) {
                while (true) {
                    final Path path = this.getItems().get(i);
                    if (!optional.contains(path)) {
                        map.put(path, this.loadImage(path));
                    }
                    if (i == last) {
                        break;
                    }
                    i += step;
                }
            }
        }
        return map;
    }
    
    private final PixelBuffer loadImage(final Path path) {
        try {
            final ImageData imageData = this.nativeImageReader.getImageData(path, this.allocator);
            return (PixelBuffer)new BufferBackedImage(imageData);
        }
        catch (final IOException e) {
            e.printStackTrace();
            return (PixelBuffer)new ErrorImage();
        }
    }
}
