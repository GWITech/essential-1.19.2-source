package gg.essential.elementa.components.image;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.io.*;
import gg.essential.elementa.components.*;
import java.util.concurrent.*;
import kotlin.jvm.internal.*;
import java.awt.image.*;
import kotlin.jvm.*;
import java.net.*;
import javax.imageio.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0007J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0013" }, d2 = { "Lgg/essential/elementa/components/image/BlurHashImage$Companion;", "", "()V", "BASE_HEIGHT", "", "BASE_WIDTH", "SIZE_THRESHOLD", "", "ofFile", "Lgg/essential/elementa/components/UIImage;", "hash", "", "file", "Ljava/io/File;", "ofResource", "path", "ofURL", "url", "Ljava/net/URL;", "Elementa" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @JvmStatic
    @NotNull
    public final UIImage ofFile(@NotNull final String hash, @NotNull final File file) {
        Intrinsics.checkNotNullParameter((Object)hash, "hash");
        Intrinsics.checkNotNullParameter((Object)file, "file");
        final CompletableFuture<BufferedImage> supplyAsync = CompletableFuture.supplyAsync(Companion::ofFile$lambda-0);
        Intrinsics.checkNotNullExpressionValue((Object)supplyAsync, "supplyAsync { ImageIO.read(file) }");
        return new UIImage(supplyAsync, new BlurHashImage(hash), null, 4, null);
    }
    
    @JvmStatic
    @NotNull
    public final UIImage ofURL(@NotNull final String hash, @NotNull final URL url) {
        Intrinsics.checkNotNullParameter((Object)hash, "hash");
        Intrinsics.checkNotNullParameter((Object)url, "url");
        final CompletableFuture<BufferedImage> supplyAsync = CompletableFuture.supplyAsync(Companion::ofURL$lambda-1);
        Intrinsics.checkNotNullExpressionValue((Object)supplyAsync, "supplyAsync { UIImage.get(url) }");
        return new UIImage(supplyAsync, new BlurHashImage(hash), null, 4, null);
    }
    
    @JvmStatic
    @NotNull
    public final UIImage ofResource(@NotNull final String hash, @NotNull final String path) {
        Intrinsics.checkNotNullParameter((Object)hash, "hash");
        Intrinsics.checkNotNullParameter((Object)path, "path");
        final CompletableFuture<BufferedImage> supplyAsync = CompletableFuture.supplyAsync(Companion::ofResource$lambda-2);
        Intrinsics.checkNotNullExpressionValue((Object)supplyAsync, "supplyAsync {\n          \u2026ream(path))\n            }");
        return new UIImage(supplyAsync, new BlurHashImage(hash), null, 4, null);
    }
    
    private static final BufferedImage ofFile$lambda-0(final File $file) {
        Intrinsics.checkNotNullParameter((Object)$file, "$file");
        return ImageIO.read($file);
    }
    
    private static final BufferedImage ofURL$lambda-1(final URL $url) {
        Intrinsics.checkNotNullParameter((Object)$url, "$url");
        return UIImage.Companion.get($url);
    }
    
    private static final BufferedImage ofResource$lambda-2(final Companion this$0, final String $path) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)$path, "$path");
        return ImageIO.read(this$0.getClass().getResourceAsStream($path));
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
