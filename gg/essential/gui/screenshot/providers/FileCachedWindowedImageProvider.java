package gg.essential.gui.screenshot.providers;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.screenshot.concurrent.*;
import gg.essential.util.lwjgl3.api.*;
import gg.essential.util.*;
import java.nio.file.*;
import kotlin.collections.*;
import java.util.concurrent.*;
import java.util.*;
import kotlin.ranges.*;
import kotlin.jvm.internal.*;
import java.util.function.*;
import io.netty.buffer.*;
import gg.essential.gui.screenshot.downsampling.*;
import gg.essential.*;
import java.io.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000`
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0010 
                                                   \u0002\b\b
                                                   \u0002\u0010$
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0003\u0018\u0000 &2\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003:\u0001&BP\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003\u0012\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\b\u0012\u0006\u0010	\u001a\u00020
                                                   \u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J0\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00132\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070 H\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u00022\u0006\u0010"\u001a\u00020\u0007H\u0002J\u0018\u0010#\u001a\u00020$2\u0006\u0010"\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u0002H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001f\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0018\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R7\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u00132\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00138V@VX\u0096\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0017\u0010\u0018"\u0004\b\u0019\u0010\u001a*\u0004\b\u0015\u0010\u0016R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010	\u001a\u00020
                                                   X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006'""" }, d2 = { "Lgg/essential/gui/screenshot/providers/FileCachedWindowedImageProvider;", "Lgg/essential/gui/screenshot/providers/WindowedProvider;", "Lgg/essential/gui/screenshot/downsampling/PixelBuffer;", "Lgg/essential/gui/screenshot/providers/WindowedImageProvider;", "innerProvider", "cacheFunction", "Lkotlin/Function1;", "Ljava/nio/file/Path;", "Lkotlin/ExtensionFunctionType;", "writeExecutorPool", "Lgg/essential/gui/screenshot/concurrent/PriorityThreadPoolExecutor;", "nativeImageReader", "Lgg/essential/util/lwjgl3/api/NativeImageReader;", "alloc", "Lio/netty/buffer/ByteBufAllocator;", "precomputeOnly", "", "(Lgg/essential/gui/screenshot/providers/WindowedProvider;Lkotlin/jvm/functions/Function1;Lgg/essential/gui/screenshot/concurrent/PriorityThreadPoolExecutor;Lgg/essential/util/lwjgl3/api/NativeImageReader;Lio/netty/buffer/ByteBufAllocator;Z)V", "<set-?>", "", "items", "getItems$delegate", "(Lgg/essential/gui/screenshot/providers/FileCachedWindowedImageProvider;)Ljava/lang/Object;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "provide", "", "windows", "Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;", "optional", "", "read", "path", "save", "", "image", "Companion", "essential" })
public final class FileCachedWindowedImageProvider implements WindowedProvider<PixelBuffer>
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final WindowedProvider<PixelBuffer> innerProvider;
    @NotNull
    private final Function1<Path, Path> cacheFunction;
    @NotNull
    private final PriorityThreadPoolExecutor writeExecutorPool;
    @NotNull
    private final NativeImageReader nativeImageReader;
    @NotNull
    private final ByteBufAllocator alloc;
    private final boolean precomputeOnly;
    @NotNull
    private static final ConcurrentHashMap locks;
    
    public FileCachedWindowedImageProvider(@NotNull final WindowedProvider<? extends PixelBuffer> innerProvider, @NotNull final Function1<? super Path, ? extends Path> cacheFunction, @NotNull final PriorityThreadPoolExecutor writeExecutorPool, @NotNull final NativeImageReader nativeImageReader, @NotNull final ByteBufAllocator alloc, final boolean precomputeOnly) {
        Intrinsics.checkNotNullParameter((Object)innerProvider, "innerProvider");
        Intrinsics.checkNotNullParameter((Object)cacheFunction, "cacheFunction");
        Intrinsics.checkNotNullParameter((Object)writeExecutorPool, "writeExecutorPool");
        Intrinsics.checkNotNullParameter((Object)nativeImageReader, "nativeImageReader");
        Intrinsics.checkNotNullParameter((Object)alloc, "alloc");
        super();
        this.innerProvider = (WindowedProvider<PixelBuffer>)innerProvider;
        this.cacheFunction = (Function1<Path, Path>)cacheFunction;
        this.writeExecutorPool = writeExecutorPool;
        this.nativeImageReader = nativeImageReader;
        this.alloc = alloc;
        this.precomputeOnly = precomputeOnly;
    }
    
    @NotNull
    @Override
    public List<Path> getItems() {
        return this.innerProvider.getItems();
    }
    
    @Override
    public void setItems(@NotNull final List<? extends Path> <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.innerProvider.setItems(<set-?>);
    }
    
    @NotNull
    @Override
    public Map<Path, PixelBuffer> provide(@NotNull final List<WindowedProvider$Window> windows, @NotNull final Set<? extends Path> optional) {
        Intrinsics.checkNotNullParameter((Object)windows, "windows");
        Intrinsics.checkNotNullParameter((Object)optional, "optional");
        final Map providedImages = new LinkedHashMap();
        for (final WindowedProvider$Window window : windows) {
            final IntProgression reversed = ExtensionsKt.reversed(window.getRange(), window.getBackwards());
            int i = reversed.getFirst();
            final int last = reversed.getLast();
            final int step = reversed.getStep();
            if ((step > 0 && i <= last) || (step < 0 && last <= i)) {
                while (true) {
                    final Path sourcePath = this.getItems().get(i);
                    Label_0329: {
                        if (!optional.contains(sourcePath)) {
                            final Path cachePath = (Path)this.cacheFunction.invoke((Object)sourcePath);
                            if (Files.exists(cachePath, (LinkOption[])Arrays.copyOf(new LinkOption[0], 0))) {
                                if (this.precomputeOnly) {
                                    break Label_0329;
                                }
                                final PixelBuffer read = this.read(cachePath);
                                if (read != null) {
                                    providedImages.put(sourcePath, read);
                                    break Label_0329;
                                }
                            }
                            final Map.Entry entry = (Map.Entry)CollectionsKt.firstOrNull((Iterable)this.innerProvider.provide(WindowProviderKt.toSingleWindowRequest(i), SetsKt.emptySet()).entrySet());
                            if (entry != null) {
                                final Map.Entry provide = entry;
                                providedImages.put(provide.getKey(), provide.getValue());
                                if (!(provide.getValue() instanceof ErrorImage)) {
                                    provide.getValue().retain();
                                    this.writeExecutorPool.submit((Callable<Object>)new FileCachedWindowedImageProvider$provide.FileCachedWindowedImageProvider$provide$1(this, cachePath, provide));
                                }
                            }
                        }
                    }
                    if (i == last) {
                        break;
                    }
                    i += step;
                }
            }
        }
        return providedImages;
    }
    
    private final PixelBuffer read(final Path path) {
        final Ref$ObjectRef bytes = new Ref$ObjectRef();
        FileCachedWindowedImageProvider.locks.compute(path.toAbsolutePath().toString(), (BiFunction<? super String, ? super Object, ?>)new FileCachedWindowedImageProvider$read.FileCachedWindowedImageProvider$read$1(path, bytes));
        PixelBuffer pixelBuffer;
        try {
            final NativeImageReader nativeImageReader = this.nativeImageReader;
            final ByteBuf byteBuf = (ByteBuf)bytes.element;
            if (byteBuf == null) {
                return null;
            }
            pixelBuffer = (PixelBuffer)new BufferBackedImage(nativeImageReader.getImageData(byteBuf, this.alloc));
        }
        catch (final IOException e) {
            Essential.logger.warn("Failed to parse cached image from " + path, (Throwable)e);
            pixelBuffer = null;
        }
        finally {
            final ByteBuf byteBuf2 = (ByteBuf)bytes.element;
            if (byteBuf2 != null) {
                byteBuf2.release();
            }
        }
        return pixelBuffer;
    }
    
    private final void save(final Path path, final PixelBuffer image) {
        FileCachedWindowedImageProvider.locks.compute(path.toAbsolutePath().toString(), (BiFunction<? super String, ? super Object, ?>)new FileCachedWindowedImageProvider$save.FileCachedWindowedImageProvider$save$1(this, path, image));
    }
    
    public static final /* synthetic */ void access$save(final FileCachedWindowedImageProvider $this, final Path path, final PixelBuffer image) {
        $this.save(path, image);
    }
    
    public static final /* synthetic */ NativeImageReader access$getNativeImageReader$p(final FileCachedWindowedImageProvider $this) {
        return $this.nativeImageReader;
    }
    
    static {
        Companion = new Companion((byte)0);
        locks = new ConcurrentHashMap();
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000*
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u000e
                                                       \u0002\u0010\u0001
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001f\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020	\u0012\u0004\u0012\u00020	0\b¢\u0006\u0002\b
                                                       2\u0006\u0010\u000b\u001a\u00020	R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002
                                                       \u0000¨\u0006\f""" }, d2 = { "Lgg/essential/gui/screenshot/providers/FileCachedWindowedImageProvider$Companion;", "", "()V", "locks", "Ljava/util/concurrent/ConcurrentHashMap;", "", "", "inDirectory", "Lkotlin/Function1;", "Ljava/nio/file/Path;", "Lkotlin/ExtensionFunctionType;", "path", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final Function1<Path, Path> inDirectory(@NotNull final Path path) {
            Intrinsics.checkNotNullParameter((Object)path, "path");
            return (Function1<Path, Path>)new FileCachedWindowedImageProvider$Companion$inDirectory.FileCachedWindowedImageProvider$Companion$inDirectory$1(path);
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
