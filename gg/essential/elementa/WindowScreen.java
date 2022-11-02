package gg.essential.elementa;

import gg.essential.elementa.components.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.*;
import kotlin.*;
import kotlin.ranges.*;
import org.jetbrains.annotations.*;
import gg.essential.universal.*;
import kotlin.reflect.*;
import gg.essential.elementa.constraints.animation.*;
import java.awt.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B/\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB7\b\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0016\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0016J(\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020 H\u0016J\"\u0010!\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J \u0010$\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020%2\u0006\u0010&\u001a\u00020\u0007H\u0016J \u0010'\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020%2\u0006\u0010\u001e\u001a\u00020%2\u0006\u0010(\u001a\u00020\u0007H\u0016J\u0010\u0010)\u001a\u00020\u00122\u0006\u0010*\u001a\u00020%H\u0016J\b\u0010+\u001a\u00020\u0012H\u0016J2\u0010,\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020.0-2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020.2\b\b\u0002\u00103\u001a\u00020 J2\u0010,\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020%0-2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020%2\b\b\u0002\u00103\u001a\u00020 J2\u0010,\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020 0-2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020 2\b\b\u0002\u00103\u001a\u00020 J2\u0010,\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\u00070-2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020 2\u0006\u00102\u001a\u00020\u00072\b\b\u0002\u00103\u001a\u00020 J2\u0010,\u001a\u00020\u0012*\b\u0012\u0004\u0012\u0002040-2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020 2\u0006\u00102\u001a\u0002042\b\b\u0002\u00103\u001a\u00020 J\u000e\u00105\u001a\u00020\u0012*\u0006\u0012\u0002\b\u00030-R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u00066" }, d2 = { "Lgg/essential/elementa/WindowScreen;", "Lgg/essential/universal/UScreen;", "enableRepeatKeys", "", "drawDefaultBackground", "restoreCurrentGuiOnClose", "newGuiScale", "", "(ZZZI)V", "version", "Lgg/essential/elementa/ElementaVersion;", "(Lgg/essential/elementa/ElementaVersion;ZZZI)V", "isInitialized", "window", "Lgg/essential/elementa/components/Window;", "getWindow", "()Lgg/essential/elementa/components/Window;", "afterInitialization", "", "defaultKeyBehavior", "typedChar", "", "keyCode", "initScreen", "width", "height", "onDrawScreen", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "mouseX", "mouseY", "partialTicks", "", "onKeyPressed", "modifiers", "Lgg/essential/universal/UKeyboard$Modifiers;", "onMouseClicked", "", "mouseButton", "onMouseReleased", "state", "onMouseScrolled", "delta", "onScreenClose", "animate", "Lkotlin/reflect/KMutableProperty0;", "Ljava/awt/Color;", "strategy", "Lgg/essential/elementa/constraints/animation/AnimationStrategy;", "time", "newValue", "delay", "", "stopAnimating", "Elementa" })
public abstract class WindowScreen extends UScreen
{
    @NotNull
    private final ElementaVersion version;
    private final boolean enableRepeatKeys;
    private final boolean drawDefaultBackground;
    @NotNull
    private final Window window;
    private boolean isInitialized;
    
    @JvmOverloads
    public WindowScreen(@NotNull final ElementaVersion version, final boolean enableRepeatKeys, final boolean drawDefaultBackground, final boolean restoreCurrentGuiOnClose, final int newGuiScale) {
        Intrinsics.checkNotNullParameter((Object)version, "version");
        super(restoreCurrentGuiOnClose, newGuiScale);
        this.version = version;
        this.enableRepeatKeys = enableRepeatKeys;
        this.drawDefaultBackground = drawDefaultBackground;
        (this.window = new Window(this.version, 0, 2, null)).onKeyType((Function3<? super UIComponent, ? super Character, ? super Integer, Unit>)new Function3<UIComponent, Character, Integer, Unit>() {
            final /* synthetic */ WindowScreen this$0;
            
            WindowScreen$1() {
                this.this$0 = $receiver;
                super(3);
            }
            
            public final void invoke(@NotNull final UIComponent $this$onKeyType, final char typedChar, final int keyCode) {
                Intrinsics.checkNotNullParameter((Object)$this$onKeyType, "$this$onKeyType");
                this.this$0.defaultKeyBehavior(typedChar, keyCode);
            }
            
            public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3) {
                this.invoke((UIComponent)p1, (char)p2, ((Number)p3).intValue());
                return Unit.INSTANCE;
            }
        });
    }
    
    public WindowScreen(final ElementaVersion version, boolean enableRepeatKeys, boolean drawDefaultBackground, boolean restoreCurrentGuiOnClose, int newGuiScale, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            enableRepeatKeys = true;
        }
        if ((n & 0x4) != 0x0) {
            drawDefaultBackground = true;
        }
        if ((n & 0x8) != 0x0) {
            restoreCurrentGuiOnClose = false;
        }
        if ((n & 0x10) != 0x0) {
            newGuiScale = -1;
        }
        this(version, enableRepeatKeys, drawDefaultBackground, restoreCurrentGuiOnClose, newGuiScale);
    }
    
    @NotNull
    public final Window getWindow() {
        return this.window;
    }
    
    @Deprecated(message = "Add ElementaVersion as the first argument to opt-in to improved behavior.")
    @JvmOverloads
    @java.lang.Deprecated
    public WindowScreen(final boolean enableRepeatKeys, final boolean drawDefaultBackground, final boolean restoreCurrentGuiOnClose, final int newGuiScale) {
        this(ElementaVersion.Companion.getV0$Elementa(), enableRepeatKeys, drawDefaultBackground, restoreCurrentGuiOnClose, newGuiScale);
    }
    
    @java.lang.Deprecated
    public WindowScreen(boolean enableRepeatKeys, boolean drawDefaultBackground, boolean restoreCurrentGuiOnClose, int newGuiScale, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            enableRepeatKeys = true;
        }
        if ((n & 0x2) != 0x0) {
            drawDefaultBackground = true;
        }
        if ((n & 0x4) != 0x0) {
            restoreCurrentGuiOnClose = false;
        }
        if ((n & 0x8) != 0x0) {
            newGuiScale = -1;
        }
        this(enableRepeatKeys, drawDefaultBackground, restoreCurrentGuiOnClose, newGuiScale);
    }
    
    public void afterInitialization() {
    }
    
    @Override
    public void onDrawScreen(@NotNull final UMatrixStack matrixStack, final int mouseX, final int mouseY, final float partialTicks) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        if (!this.isInitialized) {
            this.isInitialized = true;
            this.afterInitialization();
        }
        super.onDrawScreen(matrixStack, mouseX, mouseY, partialTicks);
        if (this.drawDefaultBackground) {
            super.onDrawBackground(matrixStack, 0);
        }
        this.window.draw(matrixStack);
    }
    
    @Override
    public void onMouseClicked(final double mouseX, final double mouseY, final int mouseButton) {
        super.onMouseClicked(mouseX, mouseY, mouseButton);
        Pair pair;
        if (this.version.compareTo((ElementaVersion)ElementaVersion.Companion.getV2$Elementa()) >= 0 && mouseX == Math.floor(mouseX) && mouseY == Math.floor(mouseY)) {
            final double x = UMouse.Scaled.getX();
            final double y = UMouse.Scaled.getY();
            pair = TuplesKt.to((Object)(mouseX + (x - Math.floor(x))), (Object)(mouseY + (y - Math.floor(y))));
        }
        else {
            pair = TuplesKt.to((Object)mouseX, (Object)mouseY);
        }
        final Pair pair2 = pair;
        final double adjustedMouseX = ((Number)pair2.component1()).doubleValue();
        final double adjustedMouseY = ((Number)pair2.component2()).doubleValue();
        this.window.mouseClick(adjustedMouseX, adjustedMouseY, mouseButton);
    }
    
    @Override
    public void onMouseReleased(final double mouseX, final double mouseY, final int state) {
        super.onMouseReleased(mouseX, mouseY, state);
        this.window.mouseRelease();
    }
    
    @Override
    public void onMouseScrolled(final double delta) {
        super.onMouseScrolled(delta);
        this.window.mouseScroll(RangesKt.coerceIn(delta, -1.0, 1.0));
    }
    
    @Override
    public void onKeyPressed(final int keyCode, final char typedChar, @Nullable final UKeyboard$Modifiers modifiers) {
        this.window.keyType(typedChar, keyCode);
    }
    
    @Override
    public void initScreen(final int width, final int height) {
        this.window.onWindowResize();
        super.initScreen(width, height);
        if (this.enableRepeatKeys) {
            UKeyboard.allowRepeatEvents(true);
        }
    }
    
    @Override
    public void onScreenClose() {
        super.onScreenClose();
        if (this.enableRepeatKeys) {
            UKeyboard.allowRepeatEvents(false);
        }
    }
    
    public final void defaultKeyBehavior(final char typedChar, final int keyCode) {
        super.onKeyPressed(keyCode, typedChar, UKeyboard.getModifiers());
    }
    
    public final void animate(@NotNull final KMutableProperty0<Integer> $this$animate, @NotNull final AnimationStrategy strategy, final float time, final int newValue, final float delay) {
        Intrinsics.checkNotNullParameter((Object)$this$animate, "<this>");
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        final Window $this$animate_u24lambda_u2d0 = this.window;
        final int n = 0;
        $this$animate_u24lambda_u2d0.animate($this$animate, strategy, time, newValue, delay);
    }
    
    public static /* synthetic */ void animate$default(final WindowScreen windowScreen, final KMutableProperty0 $this$animate, final AnimationStrategy strategy, final float time, final int newValue, float delay, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
        }
        if ((n & 0x8) != 0x0) {
            delay = 0.0f;
        }
        windowScreen.animate((KMutableProperty0<Integer>)$this$animate, strategy, time, newValue, delay);
    }
    
    public final void animate(@NotNull final KMutableProperty0<Float> $this$animate, @NotNull final AnimationStrategy strategy, final float time, final float newValue, final float delay) {
        Intrinsics.checkNotNullParameter((Object)$this$animate, "<this>");
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        final Window $this$animate_u24lambda_u2d1 = this.window;
        final int n = 0;
        $this$animate_u24lambda_u2d1.animate($this$animate, strategy, time, newValue, delay);
    }
    
    public static /* synthetic */ void animate$default(final WindowScreen windowScreen, final KMutableProperty0 $this$animate, final AnimationStrategy strategy, final float time, final float newValue, float delay, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
        }
        if ((n & 0x8) != 0x0) {
            delay = 0.0f;
        }
        windowScreen.animate((KMutableProperty0<Float>)$this$animate, strategy, time, newValue, delay);
    }
    
    public final void animate(@NotNull final KMutableProperty0<Long> $this$animate, @NotNull final AnimationStrategy strategy, final float time, final long newValue, final float delay) {
        Intrinsics.checkNotNullParameter((Object)$this$animate, "<this>");
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        final Window $this$animate_u24lambda_u2d2 = this.window;
        final int n = 0;
        $this$animate_u24lambda_u2d2.animate($this$animate, strategy, time, newValue, delay);
    }
    
    public static /* synthetic */ void animate$default(final WindowScreen windowScreen, final KMutableProperty0 $this$animate, final AnimationStrategy strategy, final float time, final long newValue, float delay, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
        }
        if ((n & 0x8) != 0x0) {
            delay = 0.0f;
        }
        windowScreen.animate((KMutableProperty0<Long>)$this$animate, strategy, time, newValue, delay);
    }
    
    public final void animate(@NotNull final KMutableProperty0<Double> $this$animate, @NotNull final AnimationStrategy strategy, final float time, final double newValue, final float delay) {
        Intrinsics.checkNotNullParameter((Object)$this$animate, "<this>");
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        final Window $this$animate_u24lambda_u2d3 = this.window;
        final int n = 0;
        $this$animate_u24lambda_u2d3.animate($this$animate, strategy, time, newValue, delay);
    }
    
    public static /* synthetic */ void animate$default(final WindowScreen windowScreen, final KMutableProperty0 $this$animate, final AnimationStrategy strategy, final float time, final double newValue, float delay, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
        }
        if ((n & 0x8) != 0x0) {
            delay = 0.0f;
        }
        windowScreen.animate((KMutableProperty0<Double>)$this$animate, strategy, time, newValue, delay);
    }
    
    public final void animate(@NotNull final KMutableProperty0<Color> $this$animate, @NotNull final AnimationStrategy strategy, final float time, @NotNull final Color newValue, final float delay) {
        Intrinsics.checkNotNullParameter((Object)$this$animate, "<this>");
        Intrinsics.checkNotNullParameter((Object)strategy, "strategy");
        Intrinsics.checkNotNullParameter((Object)newValue, "newValue");
        final Window $this$animate_u24lambda_u2d4 = this.window;
        final int n = 0;
        $this$animate_u24lambda_u2d4.animate($this$animate, strategy, time, newValue, delay);
    }
    
    public static /* synthetic */ void animate$default(final WindowScreen windowScreen, final KMutableProperty0 $this$animate, final AnimationStrategy strategy, final float time, final Color newValue, float delay, final int n, final Object o) {
        if (o != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animate");
        }
        if ((n & 0x8) != 0x0) {
            delay = 0.0f;
        }
        windowScreen.animate((KMutableProperty0<Color>)$this$animate, strategy, time, newValue, delay);
    }
    
    public final void stopAnimating(@NotNull final KMutableProperty0<?> $this$stopAnimating) {
        Intrinsics.checkNotNullParameter((Object)$this$stopAnimating, "<this>");
        final Window $this$stopAnimating_u24lambda_u2d5 = this.window;
        final int n = 0;
        $this$stopAnimating_u24lambda_u2d5.stopAnimating($this$stopAnimating);
    }
    
    @JvmOverloads
    public WindowScreen(@NotNull final ElementaVersion version, final boolean enableRepeatKeys, final boolean drawDefaultBackground, final boolean restoreCurrentGuiOnClose) {
        Intrinsics.checkNotNullParameter((Object)version, "version");
        this(version, enableRepeatKeys, drawDefaultBackground, restoreCurrentGuiOnClose, 0, 16, null);
    }
    
    @JvmOverloads
    public WindowScreen(@NotNull final ElementaVersion version, final boolean enableRepeatKeys, final boolean drawDefaultBackground) {
        Intrinsics.checkNotNullParameter((Object)version, "version");
        this(version, enableRepeatKeys, drawDefaultBackground, false, 0, 24, null);
    }
    
    @JvmOverloads
    public WindowScreen(@NotNull final ElementaVersion version, final boolean enableRepeatKeys) {
        Intrinsics.checkNotNullParameter((Object)version, "version");
        this(version, enableRepeatKeys, false, false, 0, 28, null);
    }
    
    @JvmOverloads
    public WindowScreen(@NotNull final ElementaVersion version) {
        Intrinsics.checkNotNullParameter((Object)version, "version");
        this(version, false, false, false, 0, 30, null);
    }
    
    @Deprecated(message = "Add ElementaVersion as the first argument to opt-in to improved behavior.")
    @JvmOverloads
    @java.lang.Deprecated
    public WindowScreen(final boolean enableRepeatKeys, final boolean drawDefaultBackground, final boolean restoreCurrentGuiOnClose) {
        this(enableRepeatKeys, drawDefaultBackground, restoreCurrentGuiOnClose, 0, 8, null);
    }
    
    @Deprecated(message = "Add ElementaVersion as the first argument to opt-in to improved behavior.")
    @JvmOverloads
    @java.lang.Deprecated
    public WindowScreen(final boolean enableRepeatKeys, final boolean drawDefaultBackground) {
        this(enableRepeatKeys, drawDefaultBackground, false, 0, 12, null);
    }
    
    @Deprecated(message = "Add ElementaVersion as the first argument to opt-in to improved behavior.")
    @JvmOverloads
    @java.lang.Deprecated
    public WindowScreen(final boolean enableRepeatKeys) {
        this(enableRepeatKeys, false, false, 0, 14, null);
    }
    
    @Deprecated(message = "Add ElementaVersion as the first argument to opt-in to improved behavior.")
    @JvmOverloads
    @java.lang.Deprecated
    public WindowScreen() {
        this(false, false, false, 0, 15, null);
    }
}
