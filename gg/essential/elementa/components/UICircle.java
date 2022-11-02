package gg.essential.elementa.components;

import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import java.awt.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;
import gg.essential.universal.shader.*;
import gg.essential.elementa.utils.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B%\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0018" }, d2 = { "Lgg/essential/elementa/components/UICircle;", "Lgg/essential/elementa/UIComponent;", "radius", "", "color", "Ljava/awt/Color;", "steps", "", "(FLjava/awt/Color;I)V", "getSteps", "()I", "setSteps", "(I)V", "draw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "getHeight", "getLeft", "getTop", "getWidth", "isPositionCenter", "", "Companion", "Elementa" })
public final class UICircle extends UIComponent
{
    @NotNull
    public static final Companion Companion;
    private int steps;
    private static UShader shader;
    private static FloatUniform shaderRadiusUniform;
    private static Float2Uniform shaderCenterPositionUniform;
    
    @JvmOverloads
    public UICircle(final float radius, @NotNull final Color color, final int steps) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        super();
        this.steps = steps;
        this.setColor(UtilitiesKt.toConstraint(color));
        this.setRadius(UtilitiesKt.pixels$default(radius, false, false, 3, null));
    }
    
    public UICircle(float radius, Color color, int steps, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            radius = 0.0f;
        }
        if ((n & 0x2) != 0x0) {
            final Color white = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue((Object)white, "WHITE");
            color = white;
        }
        if ((n & 0x4) != 0x0) {
            steps = 0;
        }
        this(radius, color, steps);
    }
    
    public final int getSteps() {
        return this.steps;
    }
    
    public final void setSteps(final int <set-?>) {
        this.steps = <set-?>;
    }
    
    @Override
    public float getLeft() {
        return this.getConstraints().getX() - this.getRadius();
    }
    
    @Override
    public float getTop() {
        return this.getConstraints().getY() - this.getRadius();
    }
    
    @Override
    public float getWidth() {
        return this.getRadius() * 2;
    }
    
    @Override
    public float getHeight() {
        return this.getRadius() * 2;
    }
    
    @Override
    public boolean isPositionCenter() {
        return true;
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        this.beforeDraw(matrixStack);
        final float x = this.getConstraints().getX();
        final float y = this.getConstraints().getY();
        final float r = this.getRadius();
        final Color color = this.getColor();
        if (color.getAlpha() == 0) {
            super.draw(matrixStack);
            return;
        }
        UICircle.Companion.drawCircle(matrixStack, x, y, r, color);
        super.draw(matrixStack);
    }
    
    @JvmOverloads
    public UICircle(final float radius, @NotNull final Color color) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        this(radius, color, 0, 4, null);
    }
    
    @JvmOverloads
    public UICircle(final float radius) {
        this(radius, null, 0, 6, null);
    }
    
    @JvmOverloads
    public UICircle() {
        this(0.0f, null, 0, 7, null);
    }
    
    public static final /* synthetic */ UShader access$getShader$cp() {
        return UICircle.shader;
    }
    
    public static final /* synthetic */ void access$setShader$cp(final UShader <set-?>) {
        UICircle.shader = <set-?>;
    }
    
    public static final /* synthetic */ void access$setShaderRadiusUniform$cp(final FloatUniform <set-?>) {
        UICircle.shaderRadiusUniform = <set-?>;
    }
    
    public static final /* synthetic */ void access$setShaderCenterPositionUniform$cp(final Float2Uniform <set-?>) {
        UICircle.shaderCenterPositionUniform = <set-?>;
    }
    
    public static final /* synthetic */ FloatUniform access$getShaderRadiusUniform$cp() {
        return UICircle.shaderRadiusUniform;
    }
    
    public static final /* synthetic */ Float2Uniform access$getShaderCenterPositionUniform$cp() {
        return UICircle.shaderCenterPositionUniform;
    }
    
    static {
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J.\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J(\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0006\u0010\u0013\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000¨\u0006\u0014" }, d2 = { "Lgg/essential/elementa/components/UICircle$Companion;", "", "()V", "shader", "Lgg/essential/universal/shader/UShader;", "shaderCenterPositionUniform", "Lgg/essential/universal/shader/Float2Uniform;", "shaderRadiusUniform", "Lgg/essential/universal/shader/FloatUniform;", "drawCircle", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "centerX", "", "centerY", "radius", "color", "Ljava/awt/Color;", "initShaders", "Elementa" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public final void initShaders() {
            if (UICircle.access$getShader$cp() != null) {
                return;
            }
            UICircle.access$setShader$cp(ExtensionsKt.readFromLegacyShader(UShader.Companion, "rect", "circle", BlendState.NORMAL));
            UShader access$getShader$cp;
            if ((access$getShader$cp = UICircle.access$getShader$cp()) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shader");
                access$getShader$cp = null;
            }
            if (!access$getShader$cp.getUsable()) {
                System.out.println((Object)"Failed to load Elementa UICircle shader");
                return;
            }
            UShader access$getShader$cp2;
            if ((access$getShader$cp2 = UICircle.access$getShader$cp()) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shader");
                access$getShader$cp2 = null;
            }
            UICircle.access$setShaderRadiusUniform$cp(access$getShader$cp2.getFloatUniform("u_Radius"));
            UShader access$getShader$cp3;
            if ((access$getShader$cp3 = UICircle.access$getShader$cp()) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("shader");
                access$getShader$cp3 = null;
            }
            UICircle.access$setShaderCenterPositionUniform$cp(access$getShader$cp3.getFloat2Uniform("u_CenterPos"));
        }
        
        @Deprecated(message = "For 1.17 this method requires you pass a UMatrixStack as the first argument.\n\nIf you are currently extending this method, you should instead extend the method with the added argument.\nNote however for this to be non-breaking, your parent class needs to transition before you do.\n\nIf you are calling this method and you cannot guarantee that your target class has been fully updated (such as when\ncalling an open method on an open class), you should instead call the method with the \"Compat\" suffix, which will\ncall both methods, the new and the deprecated one.\nIf you are sure that your target class has been updated (such as when calling the super method), you should\n(for super calls you must!) instead just call the method with the original name and added argument.", replaceWith = @ReplaceWith(expression = "drawCircle(matrixStack, centerX, centerY, radius, color)", imports = {}))
        @java.lang.Deprecated
        public final void drawCircle(final float centerX, final float centerY, final float radius, @NotNull final Color color) {
            Intrinsics.checkNotNullParameter((Object)color, "color");
            this.drawCircle(new UMatrixStack(), centerX, centerY, radius, color);
        }
        
        public final void drawCircle(@NotNull final UMatrixStack matrixStack, final float centerX, final float centerY, final float radius, @NotNull final Color color) {
            Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
            Intrinsics.checkNotNullParameter((Object)color, "color");
            if (UICircle.access$getShader$cp() != null) {
                UShader access$getShader$cp;
                if ((access$getShader$cp = UICircle.access$getShader$cp()) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("shader");
                    access$getShader$cp = null;
                }
                if (access$getShader$cp.getUsable()) {
                    UShader access$getShader$cp2;
                    if ((access$getShader$cp2 = UICircle.access$getShader$cp()) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shader");
                        access$getShader$cp2 = null;
                    }
                    access$getShader$cp2.bind();
                    FloatUniform access$getShaderRadiusUniform$cp;
                    if ((access$getShaderRadiusUniform$cp = UICircle.access$getShaderRadiusUniform$cp()) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shaderRadiusUniform");
                        access$getShaderRadiusUniform$cp = null;
                    }
                    access$getShaderRadiusUniform$cp.setValue(radius);
                    Float2Uniform access$getShaderCenterPositionUniform$cp;
                    if ((access$getShaderCenterPositionUniform$cp = UICircle.access$getShaderCenterPositionUniform$cp()) == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("shaderCenterPositionUniform");
                        access$getShaderCenterPositionUniform$cp = null;
                    }
                    access$getShaderCenterPositionUniform$cp.setValue(centerX, centerY);
                    UIBlock.Companion.drawBlockWithActiveShader(matrixStack, color, centerX - radius, centerY - radius, centerX + radius, centerY + radius);
                    UShader access$getShader$cp3;
                    if ((access$getShader$cp3 = UICircle.access$getShader$cp()) == null) {
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
