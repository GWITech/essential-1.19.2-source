package gg.essential.elementa.components;

import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import java.util.concurrent.*;
import kotlin.collections.*;
import gg.essential.elementa.impl.*;
import gg.essential.elementa.effects.*;
import org.lwjgl.opengl.*;
import gg.essential.elementa.utils.*;
import gg.essential.elementa.constraints.resolution.*;
import java.util.*;
import kotlin.*;
import gg.essential.universal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010\f\n\u0002\b\t\u0018\u0000 P2\u00020\u0001:\u0001PB\u0011\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0001J\b\u0010+\u001a\u00020)H\u0016J\b\u0010,\u001a\u00020)H\u0016J\b\u0010-\u001a\u00020)H\u0002J\u0010\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u000200H\u0002J \u00101\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0003H\u0002J\u0010\u00102\u001a\u00020)2\u0006\u0010/\u001a\u000200H\u0016J\u0015\u00103\u001a\u00020)2\u0006\u0010/\u001a\u000200H\u0000¢\u0006\u0002\b4J\b\u00105\u001a\u00020)H\u0007J\u000e\u00105\u001a\u00020)2\u0006\u0010/\u001a\u000200J\u000e\u00106\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0001J\b\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u000208H\u0016J\b\u0010:\u001a\u000208H\u0016J\b\u0010;\u001a\u000208H\u0016J\b\u0010<\u001a\u000208H\u0016J\b\u0010=\u001a\u000208H\u0016J\u0018\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u0002082\u0006\u0010@\u001a\u000208H\u0016J&\u0010A\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u000e2\u0006\u0010D\u001a\u00020\u000e2\u0006\u0010E\u001a\u00020\u000eJ\u0018\u0010F\u001a\u00020)2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\u0003H\u0016J \u0010J\u001a\u00020)2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010K\u001a\u00020)H\u0016J\u0010\u0010L\u001a\u00020)2\u0006\u0010M\u001a\u00020\u000eH\u0016J\u000e\u0010N\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0001J\u0006\u0010O\u001a\u00020)R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000Ra\u0010\f\u001aI\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u000b\u0018\u00010\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00010\u001bX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u001d\u001a\u0004\u0018\u00010\u00012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010 \u001a\u0004\u0018\u00010\u0001X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001f\"\u0004\b\"\u0010#R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006Q" }, d2 = { "Lgg/essential/elementa/components/Window;", "Lgg/essential/elementa/UIComponent;", "animationFPS", "", "(I)V", "version", "Lgg/essential/elementa/ElementaVersion;", "(Lgg/essential/elementa/ElementaVersion;I)V", "getAnimationFPS", "()I", "cancelDrawing", "", "clickInterceptor", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "mouseX", "mouseY", "button", "getClickInterceptor$Elementa", "()Lkotlin/jvm/functions/Function3;", "setClickInterceptor$Elementa", "(Lkotlin/jvm/functions/Function3;)V", "componentRequestingFocus", "currentMouseButton", "floatingComponents", "", "<set-?>", "focusedComponent", "getFocusedComponent", "()Lgg/essential/elementa/UIComponent;", "hoveredFloatingComponent", "getHoveredFloatingComponent", "setHoveredFloatingComponent", "(Lgg/essential/elementa/UIComponent;)V", "systemTime", "", "getVersion$Elementa", "()Lgg/essential/elementa/ElementaVersion;", "addFloatingComponent", "", "component", "afterInitialization", "animationFrame", "dealWithFocusRequests", "doDraw", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "doMouseClick", "draw", "drawEmbedded", "drawEmbedded$Elementa", "drawFloatingComponents", "focus", "getBottom", "", "getHeight", "getLeft", "getRight", "getTop", "getWidth", "hitTest", "x", "y", "isAreaVisible", "left", "top", "right", "bottom", "keyType", "typedChar", "", "keyCode", "mouseClick", "mouseRelease", "mouseScroll", "delta", "removeFloatingComponent", "unfocus", "Companion", "Elementa" })
public final class Window extends UIComponent
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final ElementaVersion version;
    private final int animationFPS;
    private long systemTime;
    private int currentMouseButton;
    @NotNull
    private List<UIComponent> floatingComponents;
    @Nullable
    private UIComponent hoveredFloatingComponent;
    @Nullable
    private UIComponent focusedComponent;
    @Nullable
    private UIComponent componentRequestingFocus;
    private boolean cancelDrawing;
    @Nullable
    private Function3<? super Double, ? super Double, ? super Integer, Boolean> clickInterceptor;
    @NotNull
    private static final ConcurrentLinkedQueue<Function0<Unit>> renderOperations;
    
    @JvmOverloads
    public Window(@NotNull final ElementaVersion version, final int animationFPS) {
        Intrinsics.checkNotNullParameter((Object)version, "version");
        super();
        this.version = version;
        this.animationFPS = animationFPS;
        this.systemTime = -1L;
        this.currentMouseButton = -1;
        this.floatingComponents = new ArrayList<UIComponent>();
        super.setParent(this);
    }
    
    public Window(final ElementaVersion version, int animationFPS, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            animationFPS = 244;
        }
        this(version, animationFPS);
    }
    
    @NotNull
    public final ElementaVersion getVersion$Elementa() {
        return this.version;
    }
    
    public final int getAnimationFPS() {
        return this.animationFPS;
    }
    
    @Nullable
    public final UIComponent getHoveredFloatingComponent() {
        return this.hoveredFloatingComponent;
    }
    
    public final void setHoveredFloatingComponent(@Nullable final UIComponent <set-?>) {
        this.hoveredFloatingComponent = <set-?>;
    }
    
    @Nullable
    public final UIComponent getFocusedComponent() {
        return this.focusedComponent;
    }
    
    @Nullable
    public final Function3<Double, Double, Integer, Boolean> getClickInterceptor$Elementa() {
        return (Function3<Double, Double, Integer, Boolean>)this.clickInterceptor;
    }
    
    public final void setClickInterceptor$Elementa(@Nullable final Function3<? super Double, ? super Double, ? super Integer, Boolean> <set-?>) {
        this.clickInterceptor = <set-?>;
    }
    
    @Deprecated(message = "Add ElementaVersion as the first argument to opt-in to improved behavior.")
    @JvmOverloads
    @java.lang.Deprecated
    public Window(final int animationFPS) {
        this(ElementaVersion.Companion.getV0$Elementa(), animationFPS);
    }
    
    @java.lang.Deprecated
    public Window(int animationFPS, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            animationFPS = 244;
        }
        this(animationFPS);
    }
    
    @Override
    public void afterInitialization() {
        Window.Companion.enqueueRenderOperation((Function0<Unit>)Window$afterInitialization.Window$afterInitialization$1.INSTANCE);
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        final ElementaVersion this_$iv = this.version;
        final int $i$f$enableFor = 0;
        final ElementaVersion prevVersion$iv = ElementaVersion.Companion.getActive();
        ElementaVersion.Companion.setActive(this_$iv);
        try {
            final int n = 0;
            this.doDraw(matrixStack);
            final Unit instance = Unit.INSTANCE;
        }
        finally {
            ElementaVersion.Companion.setActive(prevVersion$iv);
        }
    }
    
    private final void doDraw(final UMatrixStack matrixStack) {
        if (this.cancelDrawing) {
            return;
        }
        InvalidUsageKt.requireMainThread$default(null, 1, null);
        final long startTime = System.nanoTime();
        final Iterator<Function0<Unit>> iterator = Window.renderOperations.iterator();
        Intrinsics.checkNotNullExpressionValue((Object)iterator, "renderOperations.iterator()");
        final Iterator it = iterator;
        while (it.hasNext() && System.nanoTime() - startTime < TimeUnit.MILLISECONDS.toNanos(5L)) {
            it.next().invoke();
            it.remove();
        }
        if (this.systemTime == -1L) {
            this.systemTime = System.currentTimeMillis();
        }
        try {
            if (System.currentTimeMillis() - this.systemTime > TimeUnit.SECONDS.toMillis(5L)) {
                this.systemTime = System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(5L);
            }
            while (this.systemTime < System.currentTimeMillis() + 1000 / this.animationFPS) {
                this.animationFrame();
                this.systemTime += 1000 / this.animationFPS;
            }
            this.hoveredFloatingComponent = null;
            final Pair<Float, Float> mousePosition = this.getMousePosition();
            final float mouseX = ((Number)mousePosition.component1()).floatValue();
            final float mouseY = ((Number)mousePosition.component2()).floatValue();
            for (final UIComponent component : CollectionsKt.reversed((Iterable)this.floatingComponents)) {
                if (component.isPointInside(mouseX, mouseY)) {
                    this.hoveredFloatingComponent = component;
                    break;
                }
            }
            this.mouseMove(this);
            this.beforeDraw(matrixStack);
            super.draw(matrixStack);
        }
        catch (final Throwable e) {
            this.cancelDrawing = true;
            final Object currentScreen = Platform.Companion.getPlatform$Elementa().getCurrentScreen();
            String simpleName;
            if (currentScreen == null) {
                simpleName = "<unknown>";
            }
            else {
                final Class<?> class1 = currentScreen.getClass();
                if (class1 == null) {
                    simpleName = "<unknown>";
                }
                else if ((simpleName = class1.getSimpleName()) == null) {
                    simpleName = "<unknown>";
                }
            }
            final String guiName = simpleName;
            if (e instanceof StackOverflowError) {
                System.out.println((Object)"Elementa: Cyclic constraint structure detected!");
                System.out.println((Object)"If you are a developer, set the environment variable \"elementa.dev=true\" to assist in debugging the issue.");
            }
            else {
                System.out.println((Object)"Elementa: encountered an error while drawing a GUI");
            }
            System.out.println((Object)Intrinsics.stringPlus("Gui name: ", (Object)guiName));
            e.printStackTrace();
            ScissorEffect.Companion.setCurrentScissorState(null);
            GL11.glDisable(3089);
            final Platform platform$Elementa = Platform.Companion.getPlatform$Elementa();
            ConstraintResolutionGui currentScreen2;
            if (e instanceof StackOverflowError && OptionsKt.getElementaDev()) {
                final String property = System.getProperty("elementa.dev.cycle_resolver", "2");
                List list;
                if (Intrinsics.areEqual((Object)property, (Object)"2")) {
                    list = new ConstraintResolverV2(this).getCyclicNodes();
                }
                else if (Intrinsics.areEqual((Object)property, (Object)"1")) {
                    list = new ConstraintResolver(this).getCyclicNodes();
                }
                else {
                    System.out.println((Object)"Invalid value for \"elementa.dev.cycle_resolver\", falling back to V2 solver.");
                    list = new ConstraintResolverV2(this).getCyclicNodes();
                }
                final List cyclicNodes = list;
                currentScreen2 = new ConstraintResolutionGui(guiName, (UIComponent)this, cyclicNodes);
            }
            else {
                UChat.chat((Object)"§cElementa encountered an error while drawing a GUI. Check your logs for more information.");
                currentScreen2 = null;
            }
            platform$Elementa.setCurrentScreen(currentScreen2);
        }
    }
    
    public final void drawEmbedded$Elementa(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        super.draw(matrixStack);
    }
    
    @Deprecated(message = "For 1.17 this method requires you pass a UMatrixStack as the first argument.\n\nIf you are currently extending this method, you should instead extend the method with the added argument.\nNote however for this to be non-breaking, your parent class needs to transition before you do.\n\nIf you are calling this method and you cannot guarantee that your target class has been fully updated (such as when\ncalling an open method on an open class), you should instead call the method with the \"Compat\" suffix, which will\ncall both methods, the new and the deprecated one.\nIf you are sure that your target class has been updated (such as when calling the super method), you should\n(for super calls you must!) instead just call the method with the original name and added argument.", replaceWith = @ReplaceWith(expression = "drawFloatingComponents(matrixStack)", imports = {}))
    @java.lang.Deprecated
    public final void drawFloatingComponents() {
        this.drawFloatingComponents(new UMatrixStack());
    }
    
    public final void drawFloatingComponents(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        InvalidUsageKt.requireMainThread$default(null, 1, null);
        final Iterator it = this.floatingComponents.iterator();
        while (it.hasNext()) {
            final UIComponent component = it.next();
            if (Window.Companion.ofOrNull(component) == null) {
                it.remove();
            }
            else {
                component.drawCompat(matrixStack);
            }
        }
    }
    
    @Override
    public void mouseScroll(final double delta) {
        InvalidUsageKt.requireMainThread$default(null, 1, null);
        final Pair<Float, Float> mousePosition = this.getMousePosition();
        final float mouseX = ((Number)mousePosition.component1()).floatValue();
        final float mouseY = ((Number)mousePosition.component2()).floatValue();
        for (final UIComponent floatingComponent : CollectionsKt.reversed((Iterable)this.floatingComponents)) {
            if (floatingComponent.isPointInside(mouseX, mouseY)) {
                floatingComponent.mouseScroll(delta);
                return;
            }
        }
        super.mouseScroll(delta);
    }
    
    @Override
    public void mouseClick(final double mouseX, final double mouseY, final int button) {
        InvalidUsageKt.requireMainThread$default(null, 1, null);
        final Pair<Double, Double> pixelCoordinatesToPixelCenter$Elementa = this.pixelCoordinatesToPixelCenter$Elementa(mouseX, mouseY);
        final double adjustedX = ((Number)pixelCoordinatesToPixelCenter$Elementa.component1()).doubleValue();
        final double adjustedY = ((Number)pixelCoordinatesToPixelCenter$Elementa.component2()).doubleValue();
        this.doMouseClick(adjustedX, adjustedY, button);
    }
    
    private final void doMouseClick(final double mouseX, final double mouseY, final int button) {
        this.currentMouseButton = button;
        final Function3<? super Double, ? super Double, ? super Integer, Boolean> clickInterceptor = this.clickInterceptor;
        if (clickInterceptor != null) {
            final Function3 it = clickInterceptor;
            final int n = 0;
            if (it.invoke((Object)mouseX, (Object)mouseY, (Object)button)) {
                return;
            }
        }
        for (final UIComponent floatingComponent : CollectionsKt.reversed((Iterable)this.floatingComponents)) {
            if (floatingComponent.isPointInside((float)mouseX, (float)mouseY)) {
                floatingComponent.mouseClick(mouseX, mouseY, button);
                this.dealWithFocusRequests();
                return;
            }
        }
        super.mouseClick(mouseX, mouseY, button);
        this.dealWithFocusRequests();
    }
    
    private final void dealWithFocusRequests() {
        if (this.componentRequestingFocus == null) {
            this.unfocus();
        }
        else if (!Intrinsics.areEqual((Object)this.componentRequestingFocus, (Object)this.focusedComponent)) {
            if (this.focusedComponent != null) {
                final UIComponent focusedComponent = this.focusedComponent;
                if (focusedComponent != null) {
                    focusedComponent.loseFocus();
                }
            }
            this.focusedComponent = this.componentRequestingFocus;
            final UIComponent focusedComponent2 = this.focusedComponent;
            if (focusedComponent2 != null) {
                focusedComponent2.focus();
            }
        }
        this.componentRequestingFocus = null;
    }
    
    @Override
    public void mouseRelease() {
        InvalidUsageKt.requireMainThread$default(null, 1, null);
        super.mouseRelease();
        this.currentMouseButton = -1;
    }
    
    @Override
    public void keyType(final char typedChar, final int keyCode) {
        InvalidUsageKt.requireMainThread$default(null, 1, null);
        if (this.focusedComponent != null) {
            final UIComponent focusedComponent = this.focusedComponent;
            if (focusedComponent != null) {
                focusedComponent.keyType(typedChar, keyCode);
            }
        }
        else {
            super.keyType(typedChar, keyCode);
        }
    }
    
    @Override
    public void animationFrame() {
        if (this.currentMouseButton != -1) {
            final Pair<Float, Float> mousePosition = this.getMousePosition();
            final float mouseX = ((Number)mousePosition.component1()).floatValue();
            final float mouseY = ((Number)mousePosition.component2()).floatValue();
            if (this.version.compareTo((ElementaVersion)ElementaVersion.Companion.getV2$Elementa()) >= 0) {
                this.dragMouse(mouseX, mouseY, this.currentMouseButton);
            }
            else {
                this.dragMouse((int)mouseX, (int)mouseY, this.currentMouseButton);
            }
        }
        if (this.componentRequestingFocus != null && !Intrinsics.areEqual((Object)this.componentRequestingFocus, (Object)this.focusedComponent)) {
            if (this.focusedComponent != null) {
                final UIComponent focusedComponent = this.focusedComponent;
                if (focusedComponent != null) {
                    focusedComponent.loseFocus();
                }
            }
            this.focusedComponent = this.componentRequestingFocus;
            final UIComponent focusedComponent2 = this.focusedComponent;
            if (focusedComponent2 != null) {
                focusedComponent2.focus();
            }
        }
        this.componentRequestingFocus = null;
        super.animationFrame();
    }
    
    @Override
    public float getLeft() {
        return 0.0f;
    }
    
    @Override
    public float getTop() {
        return 0.0f;
    }
    
    @Override
    public float getWidth() {
        return (float)UResolution.getScaledWidth();
    }
    
    @Override
    public float getHeight() {
        return (float)UResolution.getScaledHeight();
    }
    
    @Override
    public float getRight() {
        return this.getWidth();
    }
    
    @Override
    public float getBottom() {
        return this.getHeight();
    }
    
    public final boolean isAreaVisible(final double left, final double top, final double right, final double bottom) {
        if (right < this.getLeft() || left > this.getRight() || bottom < this.getTop() || top > this.getBottom()) {
            return false;
        }
        final ScissorEffect.ScissorState currentScissorState = ScissorEffect.Companion.getCurrentScissorState();
        if (currentScissorState == null) {
            return true;
        }
        final ScissorEffect.ScissorState currentScissor = currentScissorState;
        final double sf = UResolution.getScaleFactor();
        final double realX = currentScissor.getX() / sf;
        final double realWidth = currentScissor.getWidth() / sf;
        final double bottomY = (UResolution.getScaledHeight() * sf - currentScissor.getY()) / sf;
        final double realHeight = currentScissor.getHeight() / sf;
        return right > realX && left < realX + realWidth && bottom >= bottomY - realHeight && top <= bottomY;
    }
    
    public final void addFloatingComponent(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        if (this.isInitialized()) {
            InvalidUsageKt.requireMainThread$default(null, 1, null);
        }
        if (this.floatingComponents.contains(component)) {
            return;
        }
        this.floatingComponents.add(component);
    }
    
    public final void removeFloatingComponent(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        if (this.isInitialized()) {
            InvalidUsageKt.requireMainThread$default(null, 1, null);
        }
        this.floatingComponents.remove(component);
    }
    
    @NotNull
    @Override
    public UIComponent hitTest(final float x, final float y) {
        for (final UIComponent component : CollectionsKt.reversed((Iterable)this.floatingComponents)) {
            if (component.isPointInside(x, y)) {
                return component.hitTest(x, y);
            }
        }
        return super.hitTest(x, y);
    }
    
    public final void focus(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        if (this.isInitialized()) {
            InvalidUsageKt.requireMainThread$default(null, 1, null);
        }
        this.componentRequestingFocus = component;
    }
    
    public final void unfocus() {
        if (this.isInitialized()) {
            InvalidUsageKt.requireMainThread$default(null, 1, null);
        }
        final UIComponent focusedComponent = this.focusedComponent;
        if (focusedComponent != null) {
            focusedComponent.loseFocus();
        }
        this.focusedComponent = null;
    }
    
    @JvmOverloads
    public Window(@NotNull final ElementaVersion version) {
        Intrinsics.checkNotNullParameter((Object)version, "version");
        this(version, 0, 2, null);
    }
    
    @Deprecated(message = "Add ElementaVersion as the first argument to opt-in to improved behavior.")
    @JvmOverloads
    @java.lang.Deprecated
    public Window() {
        this(0, 1, null);
    }
    
    public static final /* synthetic */ ConcurrentLinkedQueue access$getRenderOperations$cp() {
        return Window.renderOperations;
    }
    
    static {
        Companion = new Companion(null);
        renderOperations = new ConcurrentLinkedQueue<Function0<Unit>>();
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rR\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f" }, d2 = { "Lgg/essential/elementa/components/Window$Companion;", "", "()V", "renderOperations", "Ljava/util/concurrent/ConcurrentLinkedQueue;", "Lkotlin/Function0;", "", "enqueueRenderOperation", "operation", "Ljava/lang/Runnable;", "of", "Lgg/essential/elementa/components/Window;", "component", "Lgg/essential/elementa/UIComponent;", "ofOrNull", "Elementa" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public final void enqueueRenderOperation(@NotNull final Runnable operation) {
            Intrinsics.checkNotNullParameter((Object)operation, "operation");
            Window.access$getRenderOperations$cp().add(new Window$Companion$enqueueRenderOperation.Window$Companion$enqueueRenderOperation$1(operation));
        }
        
        public final void enqueueRenderOperation(@NotNull final Function0<Unit> operation) {
            Intrinsics.checkNotNullParameter((Object)operation, "operation");
            Window.access$getRenderOperations$cp().add(operation);
        }
        
        @NotNull
        public final Window of(@NotNull final UIComponent component) {
            Intrinsics.checkNotNullParameter((Object)component, "component");
            final Window ofOrNull = this.ofOrNull(component);
            if (ofOrNull == null) {
                throw new IllegalStateException("No window parent? It's possible you haven't called Window.addChild() at this point in time.");
            }
            return ofOrNull;
        }
        
        @Nullable
        public final Window ofOrNull(@NotNull final UIComponent component) {
            Intrinsics.checkNotNullParameter((Object)component, "component");
            final Window cachedWindow$Elementa = component.getCachedWindow$Elementa();
            Window window;
            if (cachedWindow$Elementa == null) {
                final Companion $this$ofOrNull_u24lambda_u2d0 = this;
                final int n = 0;
                UIComponent current;
                for (current = component; !(current instanceof Window) && current.getHasParent() && !Intrinsics.areEqual((Object)current.getParent(), (Object)current); current = current.getParent()) {}
                final UIComponent uiComponent = current;
                window = ((uiComponent instanceof Window) ? ((Window)uiComponent) : null);
            }
            else {
                window = cachedWindow$Elementa;
            }
            return window;
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
