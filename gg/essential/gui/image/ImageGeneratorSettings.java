package gg.essential.gui.image;

import kotlin.*;
import java.awt.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000*
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0011
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010	J	\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J	\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J	\u0010\u0013\u001a\u00020\u0007H\u00c6\u0003J	\u0010\u0014\u001a\u00020\u0007H\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J	\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b
                                                   \u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001c""" }, d2 = { "Lgg/essential/gui/image/ImageGeneratorSettings;", "", "autoSize", "", "color", "Ljava/awt/Color;", "minFilter", "Lgg/essential/elementa/components/UIImage$TextureScalingMode;", "magFilter", "(ZLjava/awt/Color;Lgg/essential/elementa/components/UIImage$TextureScalingMode;Lgg/essential/elementa/components/UIImage$TextureScalingMode;)V", "getAutoSize", "()Z", "getColor", "()Ljava/awt/Color;", "getMagFilter", "()Lgg/essential/elementa/components/UIImage$TextureScalingMode;", "getMinFilter", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "essential" })
public final class ImageGeneratorSettings
{
    private final boolean autoSize;
    @NotNull
    private final Color color;
    @NotNull
    private final UIImage.TextureScalingMode minFilter;
    @NotNull
    private final UIImage.TextureScalingMode magFilter;
    
    public ImageGeneratorSettings(final boolean autoSize, @NotNull final Color color, @NotNull final UIImage.TextureScalingMode minFilter, @NotNull final UIImage.TextureScalingMode magFilter) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        Intrinsics.checkNotNullParameter((Object)minFilter, "minFilter");
        Intrinsics.checkNotNullParameter((Object)magFilter, "magFilter");
        super();
        this.autoSize = autoSize;
        this.color = color;
        this.minFilter = minFilter;
        this.magFilter = magFilter;
    }
    
    public ImageGeneratorSettings(boolean autoSize, Color color, UIImage.TextureScalingMode nearest, UIImage.TextureScalingMode nearest2, final int n) {
        if ((n & 0x1) != 0x0) {
            autoSize = true;
        }
        if ((n & 0x2) != 0x0) {
            final Color white = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue((Object)white, "WHITE");
            color = white;
        }
        if ((n & 0x4) != 0x0) {
            nearest = UIImage.TextureScalingMode.NEAREST;
        }
        if ((n & 0x8) != 0x0) {
            nearest2 = UIImage.TextureScalingMode.NEAREST;
        }
        this(autoSize, color, nearest, nearest2);
    }
    
    public final boolean getAutoSize() {
        return this.autoSize;
    }
    
    @NotNull
    public final Color getColor() {
        return this.color;
    }
    
    @NotNull
    public final UIImage.TextureScalingMode getMinFilter() {
        return this.minFilter;
    }
    
    @NotNull
    public final UIImage.TextureScalingMode getMagFilter() {
        return this.magFilter;
    }
    
    @NotNull
    public final ImageGeneratorSettings copy(final boolean autoSize, @NotNull final Color color, @NotNull final UIImage.TextureScalingMode minFilter, @NotNull final UIImage.TextureScalingMode magFilter) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        Intrinsics.checkNotNullParameter((Object)minFilter, "minFilter");
        Intrinsics.checkNotNullParameter((Object)magFilter, "magFilter");
        return new ImageGeneratorSettings(autoSize, color, minFilter, magFilter);
    }
    
    public static /* synthetic */ ImageGeneratorSettings copy$default$5855f0c8$4e015424(final ImageGeneratorSettings imageGeneratorSettings, final Color color) {
        return imageGeneratorSettings.copy(imageGeneratorSettings.autoSize, color, imageGeneratorSettings.minFilter, imageGeneratorSettings.magFilter);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "ImageGeneratorSettings(autoSize=" + this.autoSize + ", color=" + this.color + ", minFilter=" + this.minFilter + ", magFilter=" + this.magFilter;
    }
    
    @Override
    public int hashCode() {
        int autoSize;
        if ((autoSize = (this.autoSize ? 1 : 0)) != 0) {
            autoSize = 1;
        }
        int result = autoSize;
        result = result * 31 + this.color.hashCode();
        result = result * 31 + this.minFilter.hashCode();
        result = result * 31 + this.magFilter.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageGeneratorSettings)) {
            return false;
        }
        final ImageGeneratorSettings imageGeneratorSettings = (ImageGeneratorSettings)other;
        return this.autoSize == imageGeneratorSettings.autoSize && Intrinsics.areEqual((Object)this.color, (Object)imageGeneratorSettings.color) && this.minFilter == imageGeneratorSettings.minFilter && this.magFilter == imageGeneratorSettings.magFilter;
    }
    
    public ImageGeneratorSettings() {
        this(false, null, null, null, 15);
    }
}
