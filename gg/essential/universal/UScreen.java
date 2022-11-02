package gg.essential.universal;

import net.minecraft.client.gui.screen.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.text.*;
import net.minecraft.client.util.math.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000j
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0003
                                                   \u0002\u0010	
                                                   \u0000
                                                   \u0002\u0010\u0006
                                                   \u0002\b\u0010
                                                   \u0002\u0010\f
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0015
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\f
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007\b&\u0018\u0000 Y2\u00020\u0001:\u0001YB\u001b\b\u0017\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0007¢\u0006\u0002\u0010\bB%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012
                                                   \b\u0002\u0010	\u001a\u0004\u0018\u00010
                                                   ¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!2\u0006\u0010"\u001a\u00020\u0005J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020&H\u0004J\u0018\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u0005H\u0016J\u001e\u0010*\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00052\u0006\u0010"\u001a\u00020\u0005J\u001e\u0010-\u001a\u00020\u00032\u0006\u0010+\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\u00052\u0006\u0010"\u001a\u00020\u0005J\u001e\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0005J.\u00102\u001a\u00020\u00032\u0006\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u0010J\u001e\u00107\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0005J\u001e\u00108\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u00102\u0006\u00109\u001a\u00020\u0010J\u0018\u0010:\u001a\u00020&2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0005H\u0016J\u0010\u0010:\u001a\u00020&2\u0006\u0010=\u001a\u00020\u0005H\u0017J\u0016\u0010>\u001a\u00020&2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u0005J(\u0010?\u001a\u00020&2\u0006\u0010;\u001a\u00020<2\u0006\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00052\u0006\u0010@\u001a\u00020AH\u0016J \u0010?\u001a\u00020&2\u0006\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00052\u0006\u0010@\u001a\u00020AH\u0017J(\u0010B\u001a\u00020&2\u0006\u0010;\u001a\u00020<2\u0006\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00052\u0006\u0010@\u001a\u00020AH\u0002J"\u0010C\u001a\u00020&2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010D\u001a\u00020!2\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J"\u0010G\u001a\u00020&2\u0006\u0010+\u001a\u00020\u00052\u0006\u0010D\u001a\u00020!2\b\u0010E\u001a\u0004\u0018\u00010FH\u0016J \u0010H\u001a\u00020&2\u0006\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0005H\u0016J(\u0010I\u001a\u00020&2\u0006\u00103\u001a\u00020\u00102\u0006\u00104\u001a\u00020\u00102\u0006\u0010J\u001a\u00020\u00052\u0006\u0010K\u001a\u00020\u000eH\u0016J \u0010L\u001a\u00020&2\u0006\u0010/\u001a\u00020\u00102\u0006\u00100\u001a\u00020\u00102\u0006\u0010M\u001a\u00020\u0005H\u0016J\u0010\u0010N\u001a\u00020&2\u0006\u00109\u001a\u00020\u0010H\u0016J\b\u0010O\u001a\u00020&H\u0016J\b\u0010P\u001a\u00020&H\u0016J\u0006\u0010Q\u001a\u00020&J&\u0010R\u001a\u00020&2\u0006\u0010;\u001a\u00020S2\u0006\u0010/\u001a\u00020\u00052\u0006\u00100\u001a\u00020\u00052\u0006\u0010@\u001a\u00020AJ\u0016\u0010T\u001a\u00020&2\u0006\u0010;\u001a\u00020S2\u0006\u0010U\u001a\u00020\u0005J\u0006\u0010V\u001a\u00020&J\u0006\u0010W\u001a\u00020&J\b\u0010X\u001a\u00020&H\u0016R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0014\u0010\u0015"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0001X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001c\u0010	\u001a\u0004\u0018\u00010
                                                   X\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u001b\u0010\u001c"\u0004\b\u001d\u0010\u001e¨\u0006Z""" }, d2 = { "Lgg/essential/universal/UScreen;", "Lnet/minecraft/client/gui/screen/Screen;", "restoreCurrentGuiOnClose", "", "newGuiScale", "", "(ZI)V", "Lgg/essential/universal/GuiScale;", "(ZLgg/essential/universal/GuiScale;)V", "unlocalizedName", "", "(ZILjava/lang/String;)V", "guiScaleToRestore", "lastClick", "", "lastDraggedDx", "", "lastDraggedDy", "lastScrolledX", "lastScrolledY", "getNewGuiScale", "()I", "setNewGuiScale", "(I)V", "getRestoreCurrentGuiOnClose", "()Z", "screenToRestore", "getUnlocalizedName", "()Ljava/lang/String;", "setUnlocalizedName", "(Ljava/lang/String;)V", "charTyped", "char", "", "modifierCode", "getTitle", "Lnet/minecraft/text/Text;", "init", "", "initScreen", "width", "height", "keyPressed", "keyCode", "scanCode", "keyReleased", "mouseClicked", "mouseX", "mouseY", "mouseButton", "mouseDragged", "x", "y", "dx", "dy", "mouseReleased", "mouseScrolled", "delta", "onDrawBackground", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "tint", "onDrawBackgroundCompat", "onDrawScreen", "partialTicks", "", "onDrawScreenCompat", "onKeyPressed", "typedChar", "modifiers", "Lgg/essential/universal/UKeyboard$Modifiers;", "onKeyReleased", "onMouseClicked", "onMouseDragged", "clickedButton", "timeSinceLastClick", "onMouseReleased", "state", "onMouseScrolled", "onScreenClose", "onTick", "removed", "render", "Lnet/minecraft/client/util/math/MatrixStack;", "renderBackground", "vOffset", "restorePreviousScreen", "tick", "updateGuiScale", "Companion", "universalcraft" })
public abstract class UScreen extends Screen
{
    @NotNull
    public static final Companion Companion;
    private final boolean restoreCurrentGuiOnClose;
    private int newGuiScale;
    @Nullable
    private String unlocalizedName;
    private int guiScaleToRestore;
    @Nullable
    private final Screen screenToRestore;
    private long lastClick;
    private double lastDraggedDx;
    private double lastDraggedDy;
    private double lastScrolledX;
    private double lastScrolledY;
    
    public UScreen(final boolean restoreCurrentGuiOnClose, final int newGuiScale, @Nullable final String unlocalizedName) {
        String s = unlocalizedName;
        if (unlocalizedName == null) {
            s = "";
        }
        super((Text)Text.translatable(s));
        this.restoreCurrentGuiOnClose = restoreCurrentGuiOnClose;
        this.newGuiScale = newGuiScale;
        this.unlocalizedName = unlocalizedName;
        this.guiScaleToRestore = -1;
        this.screenToRestore = (this.restoreCurrentGuiOnClose ? UScreen.Companion.getCurrentScreen() : null);
        this.lastDraggedDx = -1.0;
        this.lastDraggedDy = -1.0;
        this.lastScrolledX = -1.0;
        this.lastScrolledY = -1.0;
    }
    
    public UScreen(boolean restoreCurrentGuiOnClose, int newGuiScale, String unlocalizedName, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            restoreCurrentGuiOnClose = false;
        }
        if ((n & 0x2) != 0x0) {
            newGuiScale = -1;
        }
        if ((n & 0x4) != 0x0) {
            unlocalizedName = null;
        }
        this(restoreCurrentGuiOnClose, newGuiScale, unlocalizedName);
    }
    
    public final boolean getRestoreCurrentGuiOnClose() {
        return this.restoreCurrentGuiOnClose;
    }
    
    public int getNewGuiScale() {
        return this.newGuiScale;
    }
    
    public void setNewGuiScale(final int <set-?>) {
        this.newGuiScale = <set-?>;
    }
    
    @Nullable
    public String getUnlocalizedName() {
        return this.unlocalizedName;
    }
    
    public void setUnlocalizedName(@Nullable final String <set-?>) {
        this.unlocalizedName = <set-?>;
    }
    
    @JvmOverloads
    public UScreen(final boolean restoreCurrentGuiOnClose, final int newGuiScale) {
        this(restoreCurrentGuiOnClose, newGuiScale, null);
    }
    
    public UScreen(boolean restoreCurrentGuiOnClose, int newGuiScale, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            restoreCurrentGuiOnClose = false;
        }
        if ((n & 0x2) != 0x0) {
            newGuiScale = -1;
        }
        this(restoreCurrentGuiOnClose, newGuiScale);
    }
    
    protected final void init() {
        this.updateGuiScale();
        this.initScreen(this.width, this.height);
    }
    
    @NotNull
    public Text getTitle() {
        String unlocalizedName;
        if ((unlocalizedName = this.getUnlocalizedName()) == null) {
            unlocalizedName = "";
        }
        final MutableText translatable = Text.translatable(unlocalizedName);
        Intrinsics.checkNotNullExpressionValue((Object)translatable, "translatable(unlocalizedName ?: \"\")");
        return (Text)translatable;
    }
    
    public final void method_25394(@NotNull final MatrixStack matrixStack, final int mouseX, final int mouseY, final float partialTicks) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        this.onDrawScreenCompat(new UMatrixStack(matrixStack), mouseX, mouseY, partialTicks);
    }
    
    public final boolean method_25404(final int keyCode, final int scanCode, final int modifierCode) {
        this.onKeyPressed(keyCode, '\0', UKeyboard.INSTANCE.toModifiers$universalcraft(modifierCode));
        return false;
    }
    
    public final boolean method_16803(final int keyCode, final int scanCode, final int modifierCode) {
        this.onKeyReleased(keyCode, '\0', UKeyboard.INSTANCE.toModifiers$universalcraft(modifierCode));
        return false;
    }
    
    public final boolean method_25400(final char char, final int modifierCode) {
        this.onKeyPressed(0, char, UKeyboard.INSTANCE.toModifiers$universalcraft(modifierCode));
        return false;
    }
    
    public final boolean method_25402(final double mouseX, final double mouseY, final int mouseButton) {
        if (mouseButton == 1) {
            this.lastClick = UMinecraft.getTime();
        }
        this.onMouseClicked(mouseX, mouseY, mouseButton);
        return false;
    }
    
    public final boolean method_25406(final double mouseX, final double mouseY, final int mouseButton) {
        this.onMouseReleased(mouseX, mouseY, mouseButton);
        return false;
    }
    
    public final boolean method_25403(final double x, final double y, final int mouseButton, final double dx, final double dy) {
        this.lastDraggedDx = dx;
        this.lastDraggedDy = dy;
        this.onMouseDragged(x, y, mouseButton, UMinecraft.getTime() - this.lastClick);
        return false;
    }
    
    public final boolean method_25401(final double mouseX, final double mouseY, final double delta) {
        this.lastScrolledX = mouseX;
        this.lastScrolledY = mouseY;
        this.onMouseScrolled(delta);
        return false;
    }
    
    public final void tick() {
        this.onTick();
    }
    
    public final void removed() {
        this.onScreenClose();
        if (this.guiScaleToRestore != -1) {
            UMinecraft.setGuiScale(this.guiScaleToRestore);
        }
    }
    
    public final void renderBackground(@NotNull final MatrixStack matrixStack, final int vOffset) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        this.onDrawBackgroundCompat(new UMatrixStack(matrixStack), vOffset);
    }
    
    public UScreen(final boolean restoreCurrentGuiOnClose, @NotNull final GuiScale newGuiScale) {
        Intrinsics.checkNotNullParameter((Object)newGuiScale, "newGuiScale");
        this(restoreCurrentGuiOnClose, newGuiScale.ordinal());
    }
    
    public final void restorePreviousScreen() {
        UScreen.Companion.displayScreen(this.screenToRestore);
    }
    
    public void updateGuiScale() {
        if (this.getNewGuiScale() != -1) {
            if (this.guiScaleToRestore == -1) {
                this.guiScaleToRestore = UMinecraft.getGuiScale();
            }
            UMinecraft.setGuiScale(this.getNewGuiScale());
            this.width = UResolution.getScaledWidth();
            this.height = UResolution.getScaledHeight();
        }
    }
    
    public void initScreen(final int width, final int height) {
        super.init();
    }
    
    public void onDrawScreen(@NotNull final UMatrixStack matrixStack, final int mouseX, final int mouseY, final float partialTicks) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        super.method_25394(matrixStack.toMC(), mouseX, mouseY, partialTicks);
    }
    
    @Deprecated(message = """
                          For 1.17 this method requires you pass a UMatrixStack as the first argument.
                          
                          If you are currently extending this method, you should instead extend the method with the added argument.
                          Note however for this to be non-breaking, your parent class needs to transition before you do.
                          
                          If you are calling this method and you cannot guarantee that your target class has been fully updated (such as when
                          calling an open method on an open class), you should instead call the method with the "Compat" suffix, which will
                          call both methods, the new and the deprecated one.
                          If you are sure that your target class has been updated (such as when calling the super method), you should
                          (for super calls you must!) instead just call the method with the original name and added argument.""", replaceWith = @ReplaceWith(expression = "onDrawScreen(matrixStack, mouseX, mouseY, partialTicks)", imports = {}))
    @java.lang.Deprecated
    public void onDrawScreen(final int mouseX, final int mouseY, final float partialTicks) {
        this.onDrawScreen(UMatrixStack.Compat.INSTANCE.get(), mouseX, mouseY, partialTicks);
    }
    
    private final void onDrawScreenCompat(final UMatrixStack matrixStack, final int mouseX, final int mouseY, final float partialTicks) {
        UMatrixStack.Compat.INSTANCE.runLegacyMethod(matrixStack, (kotlin.jvm.functions.Function0<?>)new UScreen$onDrawScreenCompat.UScreen$onDrawScreenCompat$1(this, mouseX, mouseY, partialTicks));
    }
    
    public void onKeyPressed(final int keyCode, final char typedChar, @Nullable final UKeyboard$Modifiers modifiers) {
        if (keyCode != 0) {
            super.method_25404(keyCode, 0, UKeyboard.INSTANCE.toInt$universalcraft(modifiers));
        }
        if (typedChar != '\0') {
            super.method_25400(typedChar, UKeyboard.INSTANCE.toInt$universalcraft(modifiers));
        }
    }
    
    public void onKeyReleased(final int keyCode, final char typedChar, @Nullable final UKeyboard$Modifiers modifiers) {
        if (keyCode != 0) {
            super.method_16803(keyCode, 0, UKeyboard.INSTANCE.toInt$universalcraft(modifiers));
        }
    }
    
    public void onMouseClicked(final double mouseX, final double mouseY, final int mouseButton) {
        if (mouseButton == 1) {
            this.lastClick = UMinecraft.getTime();
        }
        super.method_25402(mouseX, mouseY, mouseButton);
    }
    
    public void onMouseReleased(final double mouseX, final double mouseY, final int state) {
        super.method_25406(mouseX, mouseY, state);
    }
    
    public void onMouseDragged(final double x, final double y, final int clickedButton, final long timeSinceLastClick) {
        super.method_25403(x, y, clickedButton, this.lastDraggedDx, this.lastDraggedDy);
    }
    
    public void onMouseScrolled(final double delta) {
        super.method_25401(this.lastScrolledX, this.lastScrolledY, delta);
    }
    
    public void onTick() {
        super.tick();
    }
    
    public void onScreenClose() {
        super.removed();
    }
    
    public void onDrawBackground(@NotNull final UMatrixStack matrixStack, final int tint) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        super.renderBackground(matrixStack.toMC(), tint);
    }
    
    @Deprecated(message = """
                          For 1.17 this method requires you pass a UMatrixStack as the first argument.
                          
                          If you are currently extending this method, you should instead extend the method with the added argument.
                          Note however for this to be non-breaking, your parent class needs to transition before you do.
                          
                          If you are calling this method and you cannot guarantee that your target class has been fully updated (such as when
                          calling an open method on an open class), you should instead call the method with the "Compat" suffix, which will
                          call both methods, the new and the deprecated one.
                          If you are sure that your target class has been updated (such as when calling the super method), you should
                          (for super calls you must!) instead just call the method with the original name and added argument.""", replaceWith = @ReplaceWith(expression = "onDrawBackground(matrixStack, tint)", imports = {}))
    @java.lang.Deprecated
    public void onDrawBackground(final int tint) {
        this.onDrawBackground(UMatrixStack.Compat.INSTANCE.get(), tint);
    }
    
    public final void onDrawBackgroundCompat(@NotNull final UMatrixStack matrixStack, final int tint) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        UMatrixStack.Compat.INSTANCE.runLegacyMethod(matrixStack, (kotlin.jvm.functions.Function0<?>)new UScreen$onDrawBackgroundCompat.UScreen$onDrawBackgroundCompat$1(this, tint));
    }
    
    @JvmOverloads
    public UScreen(final boolean restoreCurrentGuiOnClose) {
        this(restoreCurrentGuiOnClose, 0, 2, null);
    }
    
    @JvmOverloads
    public UScreen() {
        this(false, 0, 3, null);
    }
    
    @Nullable
    public static final Screen getCurrentScreen() {
        return UScreen.Companion.getCurrentScreen();
    }
    
    @JvmStatic
    public static final void displayScreen(@Nullable final Screen screen) {
        UScreen.Companion.displayScreen(screen);
    }
    
    static {
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u001c
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0004
                                                       \u0002\u0010\u0002
                                                       \u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\b\u001a\u00020	2\b\u0010
                                                       \u001a\u0004\u0018\u00010\u0004H\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b""" }, d2 = { "Lgg/essential/universal/UScreen$Companion;", "", "()V", "currentScreen", "Lnet/minecraft/client/gui/screen/Screen;", "getCurrentScreen$annotations", "getCurrentScreen", "()Lnet/minecraft/client/gui/screen/Screen;", "displayScreen", "", "screen", "universalcraft" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @Nullable
        public final Screen getCurrentScreen() {
            return UMinecraft.getMinecraft().currentScreen;
        }
        
        @JvmStatic
        @java.lang.Deprecated
        public static /* synthetic */ void getCurrentScreen$annotations() {
        }
        
        @JvmStatic
        public final void displayScreen(@Nullable final Screen screen) {
            UMinecraft.getMinecraft().setScreen(screen);
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
