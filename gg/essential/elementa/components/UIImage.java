package gg.essential.elementa.components;

import gg.essential.elementa.*;
import java.awt.image.*;
import gg.essential.universal.utils.*;
import org.jetbrains.annotations.*;
import java.util.concurrent.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import java.awt.*;
import gg.essential.elementa.utils.*;
import gg.essential.universal.*;
import kotlin.*;
import java.io.*;
import kotlin.jvm.*;
import gg.essential.elementa.components.image.*;
import javax.imageio.*;
import java.net.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u0003:\u00029:B\u0015\b\u0017\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007B)\b\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0002\u0010\fJ\u0012\u0010*\u001a\u00020+2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0010\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020.H\u0016J8\u0010/\u001a\u00020+2\u0006\u0010-\u001a\u00020.2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u00103\u001a\u0002012\u0006\u00104\u001a\u0002012\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020+2\u0006\u00108\u001a\u00020\u0003H\u0016R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u000b\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u000e\u0010\n\u001a\u00020\u0002X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\"\"\u0004\b'\u0010$R\u0014\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00030)X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006;" }, d2 = { "Lgg/essential/elementa/components/UIImage;", "Lgg/essential/elementa/UIComponent;", "Lgg/essential/elementa/components/image/ImageProvider;", "Lgg/essential/elementa/components/image/CacheableImage;", "imageFunction", "Lkotlin/Function0;", "Ljava/awt/image/BufferedImage;", "(Lkotlin/jvm/functions/Function0;)V", "imageFuture", "Ljava/util/concurrent/CompletableFuture;", "loadingImage", "failureImage", "(Ljava/util/concurrent/CompletableFuture;Lgg/essential/elementa/components/image/ImageProvider;Lgg/essential/elementa/components/image/ImageProvider;)V", "destroy", "", "getDestroy", "()Z", "setDestroy", "(Z)V", "imageHeight", "", "getImageHeight", "()F", "setImageHeight", "(F)V", "imageWidth", "getImageWidth", "setImageWidth", "isLoaded", "texture", "Lgg/essential/universal/utils/ReleasedDynamicTexture;", "textureMagFilter", "Lgg/essential/elementa/components/UIImage$TextureScalingMode;", "getTextureMagFilter", "()Lgg/essential/elementa/components/UIImage$TextureScalingMode;", "setTextureMagFilter", "(Lgg/essential/elementa/components/UIImage$TextureScalingMode;)V", "textureMinFilter", "getTextureMinFilter", "setTextureMinFilter", "waiting", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "applyTexture", "", "draw", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "drawImage", "x", "", "y", "width", "height", "color", "Ljava/awt/Color;", "supply", "image", "Companion", "TextureScalingMode", "Elementa" })
public class UIImage extends UIComponent implements ImageProvider, CacheableImage
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final CompletableFuture<BufferedImage> imageFuture;
    @NotNull
    private final ImageProvider loadingImage;
    @NotNull
    private final ImageProvider failureImage;
    @Nullable
    private ReleasedDynamicTexture texture;
    @NotNull
    private final ConcurrentLinkedQueue<CacheableImage> waiting;
    private float imageWidth;
    private float imageHeight;
    private boolean destroy;
    @NotNull
    private TextureScalingMode textureMinFilter;
    @NotNull
    private TextureScalingMode textureMagFilter;
    @NotNull
    private static final ResourceCache defaultResourceCache;
    
    @JvmOverloads
    public UIImage(@NotNull final CompletableFuture<BufferedImage> imageFuture, @NotNull final ImageProvider loadingImage, @NotNull final ImageProvider failureImage) {
        Intrinsics.checkNotNullParameter((Object)imageFuture, "imageFuture");
        Intrinsics.checkNotNullParameter((Object)loadingImage, "loadingImage");
        Intrinsics.checkNotNullParameter((Object)failureImage, "failureImage");
        super();
        this.imageFuture = imageFuture;
        this.loadingImage = loadingImage;
        this.failureImage = failureImage;
        this.waiting = new ConcurrentLinkedQueue<CacheableImage>();
        this.imageWidth = 1.0f;
        this.imageHeight = 1.0f;
        this.destroy = true;
        this.textureMinFilter = TextureScalingMode.NEAREST;
        this.textureMagFilter = TextureScalingMode.NEAREST;
        this.imageFuture.thenAcceptAsync(UIImage::_init_$lambda-0);
    }
    
    public UIImage(final CompletableFuture imageFuture, ImageProvider loadingImage, ImageProvider failureImage, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            loadingImage = DefaultLoadingImage.INSTANCE;
        }
        if ((n & 0x4) != 0x0) {
            failureImage = DefaultFailureImage.INSTANCE;
        }
        this(imageFuture, loadingImage, failureImage);
    }
    
    public final float getImageWidth() {
        return this.imageWidth;
    }
    
    public final void setImageWidth(final float <set-?>) {
        this.imageWidth = <set-?>;
    }
    
    public final float getImageHeight() {
        return this.imageHeight;
    }
    
    public final void setImageHeight(final float <set-?>) {
        this.imageHeight = <set-?>;
    }
    
    public final boolean getDestroy() {
        return this.destroy;
    }
    
    public final void setDestroy(final boolean <set-?>) {
        this.destroy = <set-?>;
    }
    
    public final boolean isLoaded() {
        return this.texture != null;
    }
    
    @NotNull
    public final TextureScalingMode getTextureMinFilter() {
        return this.textureMinFilter;
    }
    
    public final void setTextureMinFilter(@NotNull final TextureScalingMode <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.textureMinFilter = <set-?>;
    }
    
    @NotNull
    public final TextureScalingMode getTextureMagFilter() {
        return this.textureMagFilter;
    }
    
    public final void setTextureMagFilter(@NotNull final TextureScalingMode <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.textureMagFilter = <set-?>;
    }
    
    @Deprecated(message = "Please provide a completable future instead", replaceWith = @ReplaceWith(expression = "CompletableFuture.supplyAsync(imageFunction)", imports = { "java.util.concurrent.CompletableFuture" }), level = DeprecationLevel.ERROR)
    @java.lang.Deprecated
    public UIImage(@NotNull final Function0<? extends BufferedImage> imageFunction) {
        Intrinsics.checkNotNullParameter((Object)imageFunction, "imageFunction");
        final CompletableFuture<BufferedImage> supplyAsync = CompletableFuture.supplyAsync(UIImage::_init_$lambda-1);
        Intrinsics.checkNotNullExpressionValue((Object)supplyAsync, "supplyAsync(imageFunction)");
        this(supplyAsync, null, null, 6, null);
    }
    
    @Override
    public void drawImage(@NotNull final UMatrixStack matrixStack, final double x, final double y, final double width, final double height, @NotNull final Color color) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)color, "color");
        if (this.texture != null) {
            final ReleasedDynamicTexture texture = this.texture;
            Intrinsics.checkNotNull((Object)texture);
            ImageKt.drawTexture(matrixStack, texture, color, x, y, width, height, this.textureMinFilter.getGlMode$Elementa(), this.textureMagFilter.getGlMode$Elementa());
        }
        else if (this.imageFuture.isCompletedExceptionally()) {
            this.failureImage.drawImageCompat(matrixStack, x, y, width, height, color);
        }
        else {
            this.loadingImage.drawImageCompat(matrixStack, x, y, width, height, color);
        }
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
        this.drawImage(matrixStack, x, y, width, height, color);
        super.draw(matrixStack);
    }
    
    @Override
    public void supply(@NotNull final CacheableImage image) {
        Intrinsics.checkNotNullParameter((Object)image, "image");
        if (this.texture != null) {
            image.applyTexture(this.texture);
            return;
        }
        this.waiting.add(image);
    }
    
    @Override
    public void applyTexture(@Nullable final ReleasedDynamicTexture texture) {
        this.texture = texture;
        while (!this.waiting.isEmpty()) {
            this.waiting.poll().applyTexture(texture);
        }
    }
    
    @JvmOverloads
    public UIImage(@NotNull final CompletableFuture<BufferedImage> imageFuture, @NotNull final ImageProvider loadingImage) {
        Intrinsics.checkNotNullParameter((Object)imageFuture, "imageFuture");
        Intrinsics.checkNotNullParameter((Object)loadingImage, "loadingImage");
        this(imageFuture, loadingImage, null, 4, null);
    }
    
    @JvmOverloads
    public UIImage(@NotNull final CompletableFuture<BufferedImage> imageFuture) {
        Intrinsics.checkNotNullParameter((Object)imageFuture, "imageFuture");
        this(imageFuture, null, null, 6, null);
    }
    
    private static final void _init_$lambda-0(final UIImage this$0, final BufferedImage it) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        if (it == null) {
            this$0.destroy = false;
            return;
        }
        this$0.imageWidth = (float)it.getWidth();
        this$0.imageHeight = (float)it.getHeight();
        this$0.imageFuture.obtrudeValue(null);
        final ReleasedDynamicTexture texture = UGraphics.getTexture(it);
        Window.Companion.enqueueRenderOperation((Function0<Unit>)new UIImage$1.UIImage$1$1(texture, this$0));
    }
    
    private static final BufferedImage _init_$lambda-1(final Function0 $tmp0) {
        Intrinsics.checkNotNullParameter((Object)$tmp0, "$tmp0");
        return (BufferedImage)$tmp0.invoke();
    }
    
    @JvmStatic
    @NotNull
    public static final UIImage ofFile(@NotNull final File file) {
        return UIImage.Companion.ofFile(file);
    }
    
    @JvmStatic
    @NotNull
    public static final UIImage ofURL(@NotNull final URL url) {
        return UIImage.Companion.ofURL(url);
    }
    
    @JvmStatic
    @NotNull
    public static final UIImage ofURL(@NotNull final URL url, @NotNull final ImageCache cache) {
        return UIImage.Companion.ofURL(url, cache);
    }
    
    @JvmStatic
    @NotNull
    public static final UIImage ofResource(@NotNull final String path) {
        return UIImage.Companion.ofResource(path);
    }
    
    @JvmStatic
    @NotNull
    public static final UIImage ofResourceCached(@NotNull final String path) {
        return UIImage.Companion.ofResourceCached(path);
    }
    
    @JvmStatic
    @NotNull
    public static final UIImage ofResourceCached(@NotNull final String path, @NotNull final ResourceCache resourceCache) {
        return UIImage.Companion.ofResourceCached(path, resourceCache);
    }
    
    @JvmStatic
    @NotNull
    public static final BufferedImage get(@NotNull final URL url) {
        return UIImage.Companion.get(url);
    }
    
    public static final /* synthetic */ ResourceCache access$getDefaultResourceCache$cp() {
        return UIImage.defaultResourceCache;
    }
    
    public static final /* synthetic */ void access$setTexture$p(final UIImage $this, final ReleasedDynamicTexture <set-?>) {
        $this.texture = <set-?>;
    }
    
    public static final /* synthetic */ ConcurrentLinkedQueue access$getWaiting$p(final UIImage $this) {
        return $this.waiting;
    }
    
    static {
        Companion = new Companion(null);
        defaultResourceCache = new ResourceCache(50);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r" }, d2 = { "Lgg/essential/elementa/components/UIImage$TextureScalingMode;", "", "glMode", "", "(Ljava/lang/String;II)V", "getGlMode$Elementa", "()I", "NEAREST", "LINEAR", "NEAREST_MIPMAP_NEAREST", "LINEAR_MIPMAP_NEAREST", "NEAREST_MIPMAP_LINEAR", "LINEAR_MIPMAP_LINEAR", "Elementa" })
    public enum TextureScalingMode
    {
        private final int glMode;
        
        NEAREST("NEAREST", 0, 9728), 
        LINEAR("LINEAR", 1, 9729), 
        NEAREST_MIPMAP_NEAREST("NEAREST_MIPMAP_NEAREST", 2, 9984), 
        LINEAR_MIPMAP_NEAREST("LINEAR_MIPMAP_NEAREST", 3, 9985), 
        NEAREST_MIPMAP_LINEAR("NEAREST_MIPMAP_LINEAR", 4, 9986), 
        LINEAR_MIPMAP_LINEAR("LINEAR_MIPMAP_LINEAR", 5, 9987);
        
        private static final /* synthetic */ TextureScalingMode[] $VALUES;
        
        private TextureScalingMode(final String $enum$name, final int $enum$ordinal, final int glMode) {
            this.glMode = glMode;
        }
        
        public final int getGlMode$Elementa() {
            return this.glMode;
        }
        
        public static TextureScalingMode[] values() {
            return TextureScalingMode.$VALUES.clone();
        }
        
        public static TextureScalingMode valueOf(final String value) {
            return Enum.valueOf(TextureScalingMode.class, value);
        }
        
        private static final /* synthetic */ TextureScalingMode[] $values() {
            return new TextureScalingMode[] { TextureScalingMode.NEAREST, TextureScalingMode.LINEAR, TextureScalingMode.NEAREST_MIPMAP_NEAREST, TextureScalingMode.LINEAR_MIPMAP_NEAREST, TextureScalingMode.NEAREST_MIPMAP_LINEAR, TextureScalingMode.LINEAR_MIPMAP_LINEAR };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0007J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u0014\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0016H\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017" }, d2 = { "Lgg/essential/elementa/components/UIImage$Companion;", "", "()V", "defaultResourceCache", "Lgg/essential/elementa/utils/ResourceCache;", "getDefaultResourceCache", "()Lgg/essential/elementa/utils/ResourceCache;", "get", "Ljava/awt/image/BufferedImage;", "url", "Ljava/net/URL;", "ofFile", "Lgg/essential/elementa/components/UIImage;", "file", "Ljava/io/File;", "ofResource", "path", "", "ofResourceCached", "resourceCache", "ofURL", "cache", "Lgg/essential/elementa/components/image/ImageCache;", "Elementa" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final ResourceCache getDefaultResourceCache() {
            return UIImage.access$getDefaultResourceCache$cp();
        }
        
        @JvmStatic
        @NotNull
        public final UIImage ofFile(@NotNull final File file) {
            Intrinsics.checkNotNullParameter((Object)file, "file");
            final CompletableFuture<BufferedImage> supplyAsync = CompletableFuture.supplyAsync(Companion::ofFile$lambda-0);
            Intrinsics.checkNotNullExpressionValue((Object)supplyAsync, "supplyAsync { ImageIO.read(file) }");
            return new UIImage(supplyAsync, null, null, 6, null);
        }
        
        @JvmStatic
        @NotNull
        public final UIImage ofURL(@NotNull final URL url) {
            Intrinsics.checkNotNullParameter((Object)url, "url");
            final CompletableFuture<BufferedImage> supplyAsync = CompletableFuture.supplyAsync(Companion::ofURL$lambda-1);
            Intrinsics.checkNotNullExpressionValue((Object)supplyAsync, "supplyAsync { get(url) }");
            return new UIImage(supplyAsync, null, null, 6, null);
        }
        
        @JvmStatic
        @NotNull
        public final UIImage ofURL(@NotNull final URL url, @NotNull final ImageCache cache) {
            Intrinsics.checkNotNullParameter((Object)url, "url");
            Intrinsics.checkNotNullParameter((Object)cache, "cache");
            final CompletableFuture<BufferedImage> supplyAsync = CompletableFuture.supplyAsync(Companion::ofURL$lambda-3);
            Intrinsics.checkNotNullExpressionValue((Object)supplyAsync, "supplyAsync {\n          \u2026          }\n            }");
            return new UIImage(supplyAsync, null, null, 6, null);
        }
        
        @JvmStatic
        @NotNull
        public final UIImage ofResource(@NotNull final String path) {
            Intrinsics.checkNotNullParameter((Object)path, "path");
            final CompletableFuture<BufferedImage> supplyAsync = CompletableFuture.supplyAsync(Companion::ofResource$lambda-4);
            Intrinsics.checkNotNullExpressionValue((Object)supplyAsync, "supplyAsync {\n          \u2026ream(path))\n            }");
            return new UIImage(supplyAsync, null, null, 6, null);
        }
        
        @JvmStatic
        @NotNull
        public final UIImage ofResourceCached(@NotNull final String path) {
            Intrinsics.checkNotNullParameter((Object)path, "path");
            return this.ofResourceCached(path, this.getDefaultResourceCache());
        }
        
        @JvmStatic
        @NotNull
        public final UIImage ofResourceCached(@NotNull final String path, @NotNull final ResourceCache resourceCache) {
            Intrinsics.checkNotNullParameter((Object)path, "path");
            Intrinsics.checkNotNullParameter((Object)resourceCache, "resourceCache");
            return (UIImage)resourceCache.getUIImage(path);
        }
        
        @JvmStatic
        @NotNull
        public final BufferedImage get(@NotNull final URL url) {
            Intrinsics.checkNotNullParameter((Object)url, "url");
            final URLConnection openConnection = url.openConnection();
            if (openConnection == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
            }
            final HttpURLConnection connection = (HttpURLConnection)openConnection;
            connection.setRequestMethod("GET");
            connection.setUseCaches(true);
            connection.addRequestProperty("User-Agent", "Mozilla/4.76 (Elementa)");
            connection.setDoOutput(true);
            final BufferedImage read = ImageIO.read(connection.getInputStream());
            Intrinsics.checkNotNullExpressionValue((Object)read, "read(connection.inputStream)");
            return read;
        }
        
        private static final BufferedImage ofFile$lambda-0(final File $file) {
            Intrinsics.checkNotNullParameter((Object)$file, "$file");
            return ImageIO.read($file);
        }
        
        private static final BufferedImage ofURL$lambda-1(final URL $url) {
            Intrinsics.checkNotNullParameter((Object)$url, "$url");
            return UIImage.Companion.get($url);
        }
        
        private static final BufferedImage ofURL$lambda-3(final ImageCache $cache, final URL $url) {
            Intrinsics.checkNotNullParameter((Object)$cache, "$cache");
            Intrinsics.checkNotNullParameter((Object)$url, "$url");
            final BufferedImage value = $cache.get($url);
            BufferedImage bufferedImage;
            if (value == null) {
                final BufferedImage it = UIImage.Companion.get($url);
                final int n = 0;
                $cache.set($url, it);
                bufferedImage = it;
            }
            else {
                bufferedImage = value;
            }
            return bufferedImage;
        }
        
        private static final BufferedImage ofResource$lambda-4(final Companion this$0, final String $path) {
            Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
            Intrinsics.checkNotNullParameter((Object)$path, "$path");
            return ImageIO.read(this$0.getClass().getResourceAsStream($path));
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
