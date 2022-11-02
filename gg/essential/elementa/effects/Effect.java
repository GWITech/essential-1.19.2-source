package gg.essential.elementa.effects;

import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;
import kotlin.*;
import kotlin.jvm.functions.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0017J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0017J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\u0011\u001a\u00020\nH\u0017J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0004J\b\u0010\u0015\u001a\u00020\nH\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0084.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0016" }, d2 = { "Lgg/essential/elementa/effects/Effect;", "", "()V", "boundComponent", "Lgg/essential/elementa/UIComponent;", "getBoundComponent", "()Lgg/essential/elementa/UIComponent;", "setBoundComponent", "(Lgg/essential/elementa/UIComponent;)V", "afterDraw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "afterDrawCompat", "animationFrame", "beforeChildrenDraw", "beforeChildrenDrawCompat", "beforeDraw", "beforeDrawCompat", "bindComponent", "component", "setup", "Elementa" })
public abstract class Effect
{
    protected UIComponent boundComponent;
    
    public Effect() {
        super();
    }
    
    @NotNull
    protected final UIComponent getBoundComponent() {
        final UIComponent boundComponent = this.boundComponent;
        if (boundComponent != null) {
            return boundComponent;
        }
        Intrinsics.throwUninitializedPropertyAccessException("boundComponent");
        return null;
    }
    
    protected final void setBoundComponent(@NotNull final UIComponent <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.boundComponent = <set-?>;
    }
    
    public final void bindComponent(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        if (this.boundComponent != null && !Intrinsics.areEqual((Object)this.getBoundComponent(), (Object)component)) {
            throw new IllegalStateException("Attempt to bind component of a " + (Object)Reflection.getOrCreateKotlinClass((Class)this.getClass()).getSimpleName() + " which already has a bound component");
        }
        this.setBoundComponent(component);
    }
    
    public void setup() {
    }
    
    public void animationFrame() {
    }
    
    public void beforeDraw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
    }
    
    public void beforeChildrenDraw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
    }
    
    public void afterDraw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
    }
    
    @Deprecated(message = "For 1.17 this method requires you pass a UMatrixStack as the first argument.\n\nIf you are currently extending this method, you should instead extend the method with the added argument.\nNote however for this to be non-breaking, your parent class needs to transition before you do.\n\nIf you are calling this method and you cannot guarantee that your target class has been fully updated (such as when\ncalling an open method on an open class), you should instead call the method with the \"Compat\" suffix, which will\ncall both methods, the new and the deprecated one.\nIf you are sure that your target class has been updated (such as when calling the super method), you should\n(for super calls you must!) instead just call the method with the original name and added argument.", replaceWith = @ReplaceWith(expression = "beforeDraw(matrixStack)", imports = {}))
    @java.lang.Deprecated
    public void beforeDraw() {
        this.beforeDraw(UMatrixStack.Compat.INSTANCE.get());
    }
    
    @Deprecated(message = "For 1.17 this method requires you pass a UMatrixStack as the first argument.\n\nIf you are currently extending this method, you should instead extend the method with the added argument.\nNote however for this to be non-breaking, your parent class needs to transition before you do.\n\nIf you are calling this method and you cannot guarantee that your target class has been fully updated (such as when\ncalling an open method on an open class), you should instead call the method with the \"Compat\" suffix, which will\ncall both methods, the new and the deprecated one.\nIf you are sure that your target class has been updated (such as when calling the super method), you should\n(for super calls you must!) instead just call the method with the original name and added argument.", replaceWith = @ReplaceWith(expression = "beforeChildrenDraw(matrixStack)", imports = {}))
    @java.lang.Deprecated
    public void beforeChildrenDraw() {
        this.beforeChildrenDraw(UMatrixStack.Compat.INSTANCE.get());
    }
    
    @Deprecated(message = "For 1.17 this method requires you pass a UMatrixStack as the first argument.\n\nIf you are currently extending this method, you should instead extend the method with the added argument.\nNote however for this to be non-breaking, your parent class needs to transition before you do.\n\nIf you are calling this method and you cannot guarantee that your target class has been fully updated (such as when\ncalling an open method on an open class), you should instead call the method with the \"Compat\" suffix, which will\ncall both methods, the new and the deprecated one.\nIf you are sure that your target class has been updated (such as when calling the super method), you should\n(for super calls you must!) instead just call the method with the original name and added argument.", replaceWith = @ReplaceWith(expression = "afterDraw(matrixStack)", imports = {}))
    @java.lang.Deprecated
    public void afterDraw() {
        this.afterDraw(UMatrixStack.Compat.INSTANCE.get());
    }
    
    public final void beforeDrawCompat(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        UMatrixStack.Compat.INSTANCE.runLegacyMethod(matrixStack, (kotlin.jvm.functions.Function0<?>)new Effect$beforeDrawCompat.Effect$beforeDrawCompat$1(this));
    }
    
    public final void beforeChildrenDrawCompat(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        UMatrixStack.Compat.INSTANCE.runLegacyMethod(matrixStack, (kotlin.jvm.functions.Function0<?>)new Effect$beforeChildrenDrawCompat.Effect$beforeChildrenDrawCompat$1(this));
    }
    
    public final void afterDrawCompat(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        UMatrixStack.Compat.INSTANCE.runLegacyMethod(matrixStack, (kotlin.jvm.functions.Function0<?>)new Effect$afterDrawCompat.Effect$afterDrawCompat$1(this));
    }
}
