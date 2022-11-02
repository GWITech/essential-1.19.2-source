package gg.essential.elementa.components;

import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.dsl.*;
import gg.essential.universal.*;
import java.awt.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.shader.*;
import gg.essential.elementa.utils.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n" }, d2 = { "Lgg/essential/elementa/components/UIRoundedRectangle;", "Lgg/essential/elementa/UIComponent;", "radius", "", "(F)V", "draw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "Companion", "Elementa" })
public class UIRoundedRectangle extends UIComponent
{
    @NotNull
    public static final Companion Companion;
    private static UShader shader;
    private static FloatUniform shaderRadiusUniform;
    private static Float4Uniform shaderInnerRectUniform;
    
    public UIRoundedRectangle(final float radius) {
        super();
        this.setRadius(UtilitiesKt.pixels$default(radius, false, false, 3, null));
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        this.beforeDrawCompat(matrixStack);
        final float radius = this.getRadius();
        final Color color = this.getColor();
        if (color.getAlpha() != 0) {
            UIRoundedRectangle.Companion.drawRoundedRectangle(matrixStack, this.getLeft(), this.getTop(), this.getRight(), this.getBottom(), radius, color);
        }
        super.draw(matrixStack);
    }
    
    public static final /* synthetic */ UShader access$getShader$cp() {
        return UIRoundedRectangle.shader;
    }
    
    public static final /* synthetic */ void access$setShader$cp(final UShader <set-?>) {
        UIRoundedRectangle.shader = <set-?>;
    }
    
    public static final /* synthetic */ void access$setShaderRadiusUniform$cp(final FloatUniform <set-?>) {
        UIRoundedRectangle.shaderRadiusUniform = <set-?>;
    }
    
    public static final /* synthetic */ void access$setShaderInnerRectUniform$cp(final Float4Uniform <set-?>) {
        UIRoundedRectangle.shaderInnerRectUniform = <set-?>;
    }
    
    public static final /* synthetic */ FloatUniform access$getShaderRadiusUniform$cp() {
        return UIRoundedRectangle.shaderRadiusUniform;
    }
    
    public static final /* synthetic */ Float4Uniform access$getShaderInnerRectUniform$cp() {
        return UIRoundedRectangle.shaderInnerRectUniform;
    }
    
    static {
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J>\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014J8\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0006\u0010\u0015\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0016" }, d2 = { "Lgg/essential/elementa/components/UIRoundedRectangle$Companion;", "", "()V", "shader", "Lgg/essential/universal/shader/UShader;", "shaderInnerRectUniform", "Lgg/essential/universal/shader/Float4Uniform;", "shaderRadiusUniform", "Lgg/essential/universal/shader/FloatUniform;", "drawRoundedRectangle", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "left", "", "top", "right", "bottom", "radius", "color", "Ljava/awt/Color;", "initShaders", "Elementa" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public final void initShaders() {
            if (UIRoundedRectangle.access$getShader$cp() != null) {
                return;
            }
            UIRoundedRectangle.access$setShader$cp(ExtensionsKt.readFromLegacyShader(UShader.Companion, "rect", "rounded_rect", BlendState.NORMAL));
            UShader access$getShader$cp;
            if ((access$getShader$cp = UIRoundedRectangle.access$getShader$cp()) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shader");
                access$getShader$cp = null;
            }
            if (!access$getShader$cp.getUsable()) {
                System.out.println((Object)"Failed to load Elementa UIRoundedRectangle shader");
                return;
            }
            UShader access$getShader$cp2;
            if ((access$getShader$cp2 = UIRoundedRectangle.access$getShader$cp()) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shader");
                access$getShader$cp2 = null;
            }
            UIRoundedRectangle.access$setShaderRadiusUniform$cp(access$getShader$cp2.getFloatUniform("u_Radius"));
            UShader access$getShader$cp3;
            if ((access$getShader$cp3 = UIRoundedRectangle.access$getShader$cp()) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shader");
                access$getShader$cp3 = null;
            }
            UIRoundedRectangle.access$setShaderInnerRectUniform$cp(access$getShader$cp3.getFloat4Uniform("u_InnerRect"));
        }
        
        @Deprecated(message = "For 1.17 this method requires you pass a UMatrixStack as the first argument.\n\nIf you are currently extending this method, you should instead extend the method with the added argument.\nNote however for this to be non-breaking, your parent class needs to transition before you do.\n\nIf you are calling this method and you cannot guarantee that your target class has been fully updated (such as when\ncalling an open method on an open class), you should instead call the method with the \"Compat\" suffix, which will\ncall both methods, the new and the deprecated one.\nIf you are sure that your target class has been updated (such as when calling the super method), you should\n(for super calls you must!) instead just call the method with the original name and added argument.", replaceWith = @ReplaceWith(expression = "drawRoundedRectangle(matrixStack, left, top, right, bottom, radius, color)", imports = {}))
        @java.lang.Deprecated
        public final void drawRoundedRectangle(final float left, final float top, final float right, final float bottom, final float radius, @NotNull final Color color) {
            Intrinsics.checkNotNullParameter((Object)color, "color");
            this.drawRoundedRectangle(new UMatrixStack(), left, top, right, bottom, radius, color);
        }
        
        public final void drawRoundedRectangle(@NotNull final UMatrixStack matrixStack, final float left, final float top, final float right, final float bottom, final float radius, @NotNull final Color color) {
            Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
            Intrinsics.checkNotNullParameter((Object)color, "color");
            if (UIRoundedRectangle.access$getShader$cp() != null) {
                UShader access$getShader$cp;
                if ((access$getShader$cp = UIRoundedRectangle.access$getShader$cp()) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shader");
                    access$getShader$cp = null;
                }
                if (access$getShader$cp.getUsable()) {
                    UShader access$getShader$cp2;
                    if ((access$getShader$cp2 = UIRoundedRectangle.access$getShader$cp()) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shader");
                        access$getShader$cp2 = null;
                    }
                    access$getShader$cp2.bind();
                    FloatUniform access$getShaderRadiusUniform$cp;
                    if ((access$getShaderRadiusUniform$cp = UIRoundedRectangle.access$getShaderRadiusUniform$cp()) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shaderRadiusUniform");
                        access$getShaderRadiusUniform$cp = null;
                    }
                    access$getShaderRadiusUniform$cp.setValue(radius);
                    Float4Uniform access$getShaderInnerRectUniform$cp;
                    if ((access$getShaderInnerRectUniform$cp = UIRoundedRectangle.access$getShaderInnerRectUniform$cp()) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shaderInnerRectUniform");
                        access$getShaderInnerRectUniform$cp = null;
                    }
                    access$getShaderInnerRectUniform$cp.setValue(left + radius, top + radius, right - radius, bottom - radius);
                    UIBlock.Companion.drawBlockWithActiveShader(matrixStack, color, left, top, right, bottom);
                    UShader access$getShader$cp3;
                    if ((access$getShader$cp3 = UIRoundedRectangle.access$getShader$cp()) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shader");
                        access$getShader$cp3 = null;
                    }
                    access$getShader$cp3.unbind();
                }
            }
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
