package gg.essential.elementa.components.image;

import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import gg.essential.universal.utils.*;
import kotlin.*;
import gg.essential.elementa.utils.*;
import java.awt.image.*;
import gg.essential.universal.*;
import java.awt.*;
import java.io.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.*;
import java.net.*;
import kotlin.jvm.internal.*;
import java.util.concurrent.*;
import javax.imageio.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J8\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\nH\u0002R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0018" }, d2 = { "Lgg/essential/elementa/components/image/BlurHashImage;", "Lgg/essential/elementa/UIComponent;", "Lgg/essential/elementa/components/image/ImageProvider;", "hash", "", "(Ljava/lang/String;)V", "dimensions", "Lkotlin/Pair;", "", "texture", "Lgg/essential/universal/utils/ReleasedDynamicTexture;", "draw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "drawImage", "x", "y", "width", "height", "color", "Ljava/awt/Color;", "generateTexture", "Companion", "Elementa" })
public class BlurHashImage extends UIComponent implements ImageProvider
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final String hash;
    private ReleasedDynamicTexture texture;
    @NotNull
    private Pair<Double, Double> dimensions;
    public static final double BASE_WIDTH = 50.0;
    public static final double BASE_HEIGHT = 50.0;
    public static final int SIZE_THRESHOLD = 2000;
    
    public BlurHashImage(@NotNull final String hash) {
        Intrinsics.checkNotNullParameter((Object)hash, "hash");
        super();
        this.hash = hash;
        this.dimensions = (Pair<Double, Double>)TuplesKt.to((Object)50.0, (Object)50.0);
    }
    
    private final ReleasedDynamicTexture generateTexture() {
        final BufferedImage decodeBlurHash$default = ImageKt.decodeBlurHash$default(this.hash, (int)((Number)this.dimensions.getFirst()).doubleValue(), (int)((Number)this.dimensions.getSecond()).doubleValue(), 0.0f, 8, null);
        ReleasedDynamicTexture texture;
        if (decodeBlurHash$default == null) {
            texture = null;
        }
        else {
            final BufferedImage it = decodeBlurHash$default;
            final int n = 0;
            texture = UGraphics.getTexture(it);
        }
        final ReleasedDynamicTexture releasedDynamicTexture = texture;
        ReleasedDynamicTexture releasedDynamicTexture2;
        if (releasedDynamicTexture == null) {
            final BlurHashImage $this$generateTexture_u24lambda_u2d1 = this;
            final int n2 = 0;
            final ReleasedDynamicTexture emptyTexture = UGraphics.getEmptyTexture();
            Intrinsics.checkNotNullExpressionValue((Object)emptyTexture, "run {\n            // We \u2026tEmptyTexture()\n        }");
            releasedDynamicTexture2 = emptyTexture;
        }
        else {
            releasedDynamicTexture2 = releasedDynamicTexture;
        }
        return releasedDynamicTexture2;
    }
    
    @Override
    public void drawImage(@NotNull final UMatrixStack matrixStack, final double x, final double y, final double width, final double height, @NotNull final Color color) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)color, "color");
        if (this.texture != null) {
            if (width > 0.0 && height > 0.0) {
                final double sizeDifference = Math.abs(((Number)this.dimensions.getFirst()).doubleValue() * ((Number)this.dimensions.getSecond()).doubleValue() - width * height);
                if (sizeDifference > 2000.0) {
                    this.dimensions = (Pair<Double, Double>)TuplesKt.to((Object)width, (Object)height);
                    this.texture = this.generateTexture();
                }
            }
        }
        else {
            this.texture = this.generateTexture();
        }
        ReleasedDynamicTexture texture;
        if ((texture = this.texture) == null) {
            Intrinsics.throwUninitializedPropertyAccessException("texture");
            texture = null;
        }
        ImageKt.drawTexture$default(matrixStack, texture, color, x, y, width, height, 0, 0, 384, null);
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        this.beforeDrawCompat(matrixStack);
        final double x = this.getLeft();
        final double y = this.getTop();
        final double width = this.getWidth();
        final double height = this.getHeight();
        final Color color = this.getColor();
        if (color.getAlpha() == 0) {
            super.draw(matrixStack);
            return;
        }
        this.drawImageCompat(matrixStack, x, y, width, height, color);
        super.draw(matrixStack);
    }
    
    @JvmStatic
    @NotNull
    public static final UIImage ofFile(@NotNull final String hash, @NotNull final File file) {
        return BlurHashImage.Companion.ofFile(hash, file);
    }
    
    @JvmStatic
    @NotNull
    public static final UIImage ofURL(@NotNull final String hash, @NotNull final URL url) {
        return BlurHashImage.Companion.ofURL(hash, url);
    }
    
    @JvmStatic
    @NotNull
    public static final UIImage ofResource(@NotNull final String hash, @NotNull final String path) {
        return BlurHashImage.Companion.ofResource(hash, path);
    }
    
    static {
        Companion = new Companion(null);
    }
    
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
}
