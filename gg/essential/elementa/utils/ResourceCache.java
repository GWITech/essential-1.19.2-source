package gg.essential.elementa.utils;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.function.*;
import java.util.concurrent.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.components.image.*;
import java.awt.image.*;
import javax.imageio.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0007J\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0007J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u0007J\u0006\u0010\u0011\u001a\u00020\u0012R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013" }, d2 = { "Lgg/essential/elementa/utils/ResourceCache;", "", "size", "", "(I)V", "cacheMap", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lgg/essential/elementa/components/image/CacheableImage;", "getSize", "()I", "getMSDFComponent", "Lgg/essential/elementa/components/image/MSDFComponent;", "path", "getUIImage", "invalidate", "", "invalidateAll", "", "Elementa" })
public final class ResourceCache
{
    private final int size;
    @NotNull
    private final ConcurrentHashMap<String, CacheableImage> cacheMap;
    
    public ResourceCache(final int size) {
        super();
        this.size = size;
        this.cacheMap = new ConcurrentHashMap<String, CacheableImage>();
    }
    
    public ResourceCache(int size, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            size = 50;
        }
        this(size);
    }
    
    public final int getSize() {
        return this.size;
    }
    
    @NotNull
    public final CacheableImage getUIImage(@NotNull final String path) {
        Intrinsics.checkNotNullParameter((Object)path, "path");
        if (this.cacheMap.size() > this.size) {
            this.cacheMap.clear();
        }
        final CacheableImage computeIfAbsent = this.cacheMap.computeIfAbsent(path, ResourceCache::getUIImage$lambda-1);
        Intrinsics.checkNotNullExpressionValue((Object)computeIfAbsent, "cacheMap.computeIfAbsent\u2026\n            })\n        }");
        final CacheableImage cachedImage = computeIfAbsent;
        final CompletableFuture<Object> completedFuture = CompletableFuture.completedFuture((Object)null);
        Intrinsics.checkNotNullExpressionValue((Object)completedFuture, "completedFuture<BufferedImage>(null)");
        final UIImage it = new UIImage(completedFuture, null, null, 6, null);
        final int n = 0;
        cachedImage.supply(it);
        return it;
    }
    
    public final void invalidateAll() {
        this.cacheMap.clear();
    }
    
    public final boolean invalidate(@NotNull final String path) {
        Intrinsics.checkNotNullParameter((Object)path, "path");
        return this.cacheMap.remove(path) != null;
    }
    
    @NotNull
    public final MSDFComponent getMSDFComponent(@NotNull final String path) {
        Intrinsics.checkNotNullParameter((Object)path, "path");
        if (this.cacheMap.size() > this.size) {
            this.cacheMap.clear();
        }
        final CacheableImage computeIfAbsent = this.cacheMap.computeIfAbsent(path, ResourceCache::getMSDFComponent$lambda-4);
        Intrinsics.checkNotNullExpressionValue((Object)computeIfAbsent, "cacheMap.computeIfAbsent\u2026\n            })\n        }");
        final CacheableImage cachedImage = computeIfAbsent;
        final CompletableFuture<Object> completedFuture = CompletableFuture.completedFuture((Object)null);
        Intrinsics.checkNotNullExpressionValue((Object)completedFuture, "completedFuture<BufferedImage>(null)");
        final MSDFComponent it = new MSDFComponent((CompletableFuture)completedFuture);
        final int n = 0;
        cachedImage.supply((CacheableImage)it);
        return it;
    }
    
    private static final BufferedImage getUIImage$lambda-1$lambda-0(final ResourceCache this$0, final String $pth) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)$pth, "$pth");
        return ImageIO.read(this$0.getClass().getResourceAsStream($pth));
    }
    
    private static final CacheableImage getUIImage$lambda-1(final ResourceCache this$0, final String pth) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)pth, "pth");
        final CompletableFuture<BufferedImage> supplyAsync = CompletableFuture.supplyAsync(ResourceCache::getUIImage$lambda-1$lambda-0);
        Intrinsics.checkNotNullExpressionValue((Object)supplyAsync, "supplyAsync {\n          \u2026tream(pth))\n            }");
        return new UIImage(supplyAsync, null, null, 6, null);
    }
    
    private static final BufferedImage getMSDFComponent$lambda-4$lambda-3(final ResourceCache this$0, final String $pth) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)$pth, "$pth");
        return ImageIO.read(this$0.getClass().getResourceAsStream($pth));
    }
    
    private static final CacheableImage getMSDFComponent$lambda-4(final ResourceCache this$0, final String pth) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)pth, "pth");
        final CompletableFuture<BufferedImage> supplyAsync = CompletableFuture.supplyAsync(ResourceCache::getMSDFComponent$lambda-4$lambda-3);
        Intrinsics.checkNotNullExpressionValue((Object)supplyAsync, "supplyAsync {\n          \u2026tream(pth))\n            }");
        return (CacheableImage)new MSDFComponent((CompletableFuture)supplyAsync);
    }
    
    public ResourceCache() {
        this(0, 1, null);
    }
}
