package gg.essential.elementa.utils;

import kotlin.*;
import gg.essential.elementa.*;
import gg.essential.universal.*;
import java.awt.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.shader.*;
import gg.essential.elementa.components.*;
import kotlin.io.*;
import kotlin.text.*;
import java.net.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\r\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0086\u0002\u001a\r\u0010\u0007\u001a\u00020\u0005*\u00020\u0006H\u0086\u0002\u001a\r\u0010\b\u001a\u00020\u0005*\u00020\u0006H\u0086\u0002\u001a\r\u0010\t\u001a\u00020\u0005*\u00020\u0006H\u0086\u0002\u001a\u0012\u0010\n\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r\u001a\u0012\u0010\n\u001a\u00020\u000e*\u00020\u000e2\u0006\u0010\f\u001a\u00020\r\u001a\n\u0010\u000f\u001a\u00020\u0006*\u00020\u0006\u001a$\u0010\u0010\u001a\u00020\u0011*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0016H\u0000\u001a\n\u0010\u0017\u001a\u00020\u000b*\u00020\u000b\u001a\n\u0010\u0017\u001a\u00020\u000e*\u00020\u000e\u001a\u0012\u0010\u0018\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u000e\u001a\u0012\u0010\u0018\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0005¨\u0006\u001a" }, d2 = { "readShader", "", "name", "ext", "component1", "", "Ljava/awt/Color;", "component2", "component3", "component4", "guiHint", "", "roundDown", "", "", "invisible", "readFromLegacyShader", "Lgg/essential/universal/shader/UShader;", "Lgg/essential/universal/shader/UShader$Companion;", "vertName", "fragName", "blendState", "Lgg/essential/universal/shader/BlendState;", "roundToRealPixels", "withAlpha", "alpha", "Elementa" })
public final class ExtensionsKt
{
    public static final float guiHint(final float $this$guiHint, final boolean roundDown) {
        return UIComponent.Companion.guiHint($this$guiHint, roundDown);
    }
    
    public static final double guiHint(final double $this$guiHint, final boolean roundDown) {
        return UIComponent.Companion.guiHint($this$guiHint, roundDown);
    }
    
    public static final float roundToRealPixels(final float $this$roundToRealPixels) {
        final float factor = (float)UResolution.getScaleFactor();
        final float it = (float)Math.rint($this$roundToRealPixels * factor);
        final int n = 0;
        return ((it == 0.0f && $this$roundToRealPixels != 0.0f) ? Math.signum($this$roundToRealPixels) : it) / factor;
    }
    
    public static final double roundToRealPixels(final double $this$roundToRealPixels) {
        final double factor = UResolution.getScaleFactor();
        final double it = Math.rint($this$roundToRealPixels * factor);
        final int n = 0;
        return ((it == 0.0 && $this$roundToRealPixels != 0.0) ? Math.signum($this$roundToRealPixels) : it) / factor;
    }
    
    @NotNull
    public static final Color withAlpha(@NotNull final Color $this$withAlpha, final int alpha) {
        Intrinsics.checkNotNullParameter((Object)$this$withAlpha, "<this>");
        return new Color($this$withAlpha.getRed(), $this$withAlpha.getGreen(), $this$withAlpha.getBlue(), alpha);
    }
    
    @NotNull
    public static final Color withAlpha(@NotNull final Color $this$withAlpha, final float alpha) {
        Intrinsics.checkNotNullParameter((Object)$this$withAlpha, "<this>");
        return new Color($this$withAlpha.getRed(), $this$withAlpha.getGreen(), $this$withAlpha.getBlue(), (int)(alpha * 255));
    }
    
    @NotNull
    public static final Color invisible(@NotNull final Color $this$invisible) {
        Intrinsics.checkNotNullParameter((Object)$this$invisible, "<this>");
        return withAlpha($this$invisible, 0);
    }
    
    public static final int component1(@NotNull final Color $this$component1) {
        Intrinsics.checkNotNullParameter((Object)$this$component1, "<this>");
        return $this$component1.getRed();
    }
    
    public static final int component2(@NotNull final Color $this$component2) {
        Intrinsics.checkNotNullParameter((Object)$this$component2, "<this>");
        return $this$component2.getGreen();
    }
    
    public static final int component3(@NotNull final Color $this$component3) {
        Intrinsics.checkNotNullParameter((Object)$this$component3, "<this>");
        return $this$component3.getBlue();
    }
    
    public static final int component4(@NotNull final Color $this$component4) {
        Intrinsics.checkNotNullParameter((Object)$this$component4, "<this>");
        return $this$component4.getAlpha();
    }
    
    @NotNull
    public static final UShader readFromLegacyShader(@NotNull final UShader.Companion $this$readFromLegacyShader, @NotNull final String vertName, @NotNull final String fragName, @NotNull final BlendState blendState) {
        Intrinsics.checkNotNullParameter((Object)$this$readFromLegacyShader, "<this>");
        Intrinsics.checkNotNullParameter((Object)vertName, "vertName");
        Intrinsics.checkNotNullParameter((Object)fragName, "fragName");
        Intrinsics.checkNotNullParameter((Object)blendState, "blendState");
        return $this$readFromLegacyShader.fromLegacyShader(readShader(vertName, "vsh"), readShader(fragName, "fsh"), blendState);
    }
    
    private static final String readShader(final String name, final String ext) {
        final URL resource = Window.class.getResource("/shaders/" + name + '.' + ext);
        Intrinsics.checkNotNullExpressionValue((Object)resource, "Window::class.java.getRe\u2026ce(\"/shaders/$name.$ext\")");
        return new String(TextStreamsKt.readBytes(resource), Charsets.UTF_8);
    }
}
