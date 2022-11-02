package gg.essential.elementa.font;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.universal.shader.*;
import gg.essential.elementa.utils.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010+\u001a\u00020,J\u0006\u0010-\u001a\u00020.R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\bX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\n\"\u0004\b\u0015\u0010\fR\u001a\u0010\u0016\u001a\u00020\u0017X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\bX\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\n\"\u0004\b*\u0010\f¨\u0006/" }, d2 = { "Lgg/essential/elementa/font/FontRenderer$Companion;", "", "()V", "colors", "", "", "Ljava/awt/Color;", "doffsetUniform", "Lgg/essential/universal/shader/FloatUniform;", "getDoffsetUniform$Elementa", "()Lgg/essential/universal/shader/FloatUniform;", "setDoffsetUniform$Elementa", "(Lgg/essential/universal/shader/FloatUniform;)V", "fgColorUniform", "Lgg/essential/universal/shader/Float4Uniform;", "getFgColorUniform$Elementa", "()Lgg/essential/universal/shader/Float4Uniform;", "setFgColorUniform$Elementa", "(Lgg/essential/universal/shader/Float4Uniform;)V", "hintAmountUniform", "getHintAmountUniform$Elementa", "setHintAmountUniform$Elementa", "samplerUniform", "Lgg/essential/universal/shader/SamplerUniform;", "getSamplerUniform$Elementa", "()Lgg/essential/universal/shader/SamplerUniform;", "setSamplerUniform$Elementa", "(Lgg/essential/universal/shader/SamplerUniform;)V", "sdfTexel", "Lgg/essential/universal/shader/Float2Uniform;", "getSdfTexel$Elementa", "()Lgg/essential/universal/shader/Float2Uniform;", "setSdfTexel$Elementa", "(Lgg/essential/universal/shader/Float2Uniform;)V", "shader", "Lgg/essential/universal/shader/UShader;", "getShader$Elementa", "()Lgg/essential/universal/shader/UShader;", "setShader$Elementa", "(Lgg/essential/universal/shader/UShader;)V", "subpixelAmountUniform", "getSubpixelAmountUniform$Elementa", "setSubpixelAmountUniform$Elementa", "areShadersInitialized", "", "initShaders", "", "Elementa" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @NotNull
    public final UShader getShader$Elementa() {
        final UShader shader = FontRenderer.shader;
        if (shader != null) {
            return shader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("shader");
        return null;
    }
    
    public final void setShader$Elementa(@NotNull final UShader <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        FontRenderer.shader = <set-?>;
    }
    
    @NotNull
    public final SamplerUniform getSamplerUniform$Elementa() {
        final SamplerUniform samplerUniform = FontRenderer.samplerUniform;
        if (samplerUniform != null) {
            return samplerUniform;
        }
        Intrinsics.throwUninitializedPropertyAccessException("samplerUniform");
        return null;
    }
    
    public final void setSamplerUniform$Elementa(@NotNull final SamplerUniform <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        FontRenderer.samplerUniform = <set-?>;
    }
    
    @NotNull
    public final FloatUniform getDoffsetUniform$Elementa() {
        final FloatUniform doffsetUniform = FontRenderer.doffsetUniform;
        if (doffsetUniform != null) {
            return doffsetUniform;
        }
        Intrinsics.throwUninitializedPropertyAccessException("doffsetUniform");
        return null;
    }
    
    public final void setDoffsetUniform$Elementa(@NotNull final FloatUniform <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        FontRenderer.doffsetUniform = <set-?>;
    }
    
    @NotNull
    public final FloatUniform getHintAmountUniform$Elementa() {
        final FloatUniform hintAmountUniform = FontRenderer.hintAmountUniform;
        if (hintAmountUniform != null) {
            return hintAmountUniform;
        }
        Intrinsics.throwUninitializedPropertyAccessException("hintAmountUniform");
        return null;
    }
    
    public final void setHintAmountUniform$Elementa(@NotNull final FloatUniform <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        FontRenderer.hintAmountUniform = <set-?>;
    }
    
    @NotNull
    public final FloatUniform getSubpixelAmountUniform$Elementa() {
        final FloatUniform subpixelAmountUniform = FontRenderer.subpixelAmountUniform;
        if (subpixelAmountUniform != null) {
            return subpixelAmountUniform;
        }
        Intrinsics.throwUninitializedPropertyAccessException("subpixelAmountUniform");
        return null;
    }
    
    public final void setSubpixelAmountUniform$Elementa(@NotNull final FloatUniform <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        FontRenderer.subpixelAmountUniform = <set-?>;
    }
    
    @NotNull
    public final Float2Uniform getSdfTexel$Elementa() {
        final Float2Uniform sdfTexel = FontRenderer.sdfTexel;
        if (sdfTexel != null) {
            return sdfTexel;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sdfTexel");
        return null;
    }
    
    public final void setSdfTexel$Elementa(@NotNull final Float2Uniform <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        FontRenderer.sdfTexel = <set-?>;
    }
    
    @NotNull
    public final Float4Uniform getFgColorUniform$Elementa() {
        final Float4Uniform fgColorUniform = FontRenderer.fgColorUniform;
        if (fgColorUniform != null) {
            return fgColorUniform;
        }
        Intrinsics.throwUninitializedPropertyAccessException("fgColorUniform");
        return null;
    }
    
    public final void setFgColorUniform$Elementa(@NotNull final Float4Uniform <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        FontRenderer.fgColorUniform = <set-?>;
    }
    
    public final boolean areShadersInitialized() {
        return FontRenderer.shader != null;
    }
    
    public final void initShaders() {
        if (this.areShadersInitialized()) {
            return;
        }
        this.setShader$Elementa(ExtensionsKt.readFromLegacyShader(UShader.Companion, "font", "font", BlendState.NORMAL));
        if (!this.getShader$Elementa().getUsable()) {
            System.out.println((Object)"Failed to load Elementa font shader");
            return;
        }
        this.setSamplerUniform$Elementa(this.getShader$Elementa().getSamplerUniform("msdf"));
        this.setDoffsetUniform$Elementa(this.getShader$Elementa().getFloatUniform("doffset"));
        this.setHintAmountUniform$Elementa(this.getShader$Elementa().getFloatUniform("hint_amount"));
        this.setSdfTexel$Elementa(this.getShader$Elementa().getFloat2Uniform("sdf_texel"));
        this.setFgColorUniform$Elementa(this.getShader$Elementa().getFloat4Uniform("fgColor"));
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
