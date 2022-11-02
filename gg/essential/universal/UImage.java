package gg.essential.universal;

import kotlin.*;
import org.jetbrains.annotations.*;
import net.minecraft.client.texture.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000"
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0007\u001a\u00020\u0000J\u000e\u0010\b\u001a\u00020	2\u0006\u0010
                                                   \u001a\u00020\u0000J\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fJ\u0006\u0010\u0010\u001a\u00020\fJ\u001e\u0010\u0011\u001a\u00020	2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0014""" }, d2 = { "Lgg/essential/universal/UImage;", "", "nativeImage", "Lnet/minecraft/client/texture/NativeImage;", "(Lnet/minecraft/client/texture/NativeImage;)V", "getNativeImage", "()Lnet/minecraft/client/texture/NativeImage;", "copy", "copyFrom", "", "other", "getHeight", "", "getPixelRGBA", "x", "y", "getWidth", "setPixelRGBA", "color", "Companion", "universalcraft" })
public final class UImage
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final NativeImage nativeImage;
    
    public UImage(@NotNull final NativeImage nativeImage) {
        Intrinsics.checkNotNullParameter((Object)nativeImage, "nativeImage");
        super();
        this.nativeImage = nativeImage;
    }
    
    @NotNull
    public final NativeImage getNativeImage() {
        return this.nativeImage;
    }
    
    public final void copyFrom(@NotNull final UImage other) {
        Intrinsics.checkNotNullParameter((Object)other, "other");
        final NativeImage otherNative = other.nativeImage;
        this.nativeImage.copyFrom(otherNative);
    }
    
    @NotNull
    public final UImage copy() {
        return new UImage(new NativeImage(this.getWidth(), this.getHeight(), this.nativeImage.getFormat().hasAlpha()));
    }
    
    public final int getPixelRGBA(final int x, final int y) {
        return this.nativeImage.getColor(x, y);
    }
    
    public final void setPixelRGBA(final int x, final int y, final int color) {
        this.nativeImage.setColor(x, y, color);
    }
    
    public final int getWidth() {
        return this.nativeImage.getWidth();
    }
    
    public final int getHeight() {
        return this.nativeImage.getHeight();
    }
    
    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final UImage ofSize(final int width, final int height, final boolean clear) {
        return UImage.Companion.ofSize(width, height, clear);
    }
    
    @JvmStatic
    @JvmOverloads
    @NotNull
    public static final UImage ofSize(final int width, final int height) {
        return UImage.Companion.ofSize(width, height);
    }
    
    static {
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000 
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0010\b
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u000b
                                                       \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020	H\u0007¨\u0006
                                                       """ }, d2 = { "Lgg/essential/universal/UImage$Companion;", "", "()V", "ofSize", "Lgg/essential/universal/UImage;", "width", "", "height", "clear", "", "universalcraft" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @JvmStatic
        @JvmOverloads
        @NotNull
        public final UImage ofSize(final int width, final int height, final boolean clear) {
            return new UImage(new NativeImage(width, height, clear));
        }
        
        public static /* synthetic */ UImage ofSize$default(final Companion companion, final int width, final int height, boolean clear, final int n, final Object o) {
            if ((n & 0x4) != 0x0) {
                clear = true;
            }
            return companion.ofSize(width, height, clear);
        }
        
        @JvmStatic
        @JvmOverloads
        @NotNull
        public final UImage ofSize(final int width, final int height) {
            return ofSize$default(this, width, height, false, 4, null);
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
