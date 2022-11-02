package gg.essential.elementa;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.effects.*;
import org.lwjgl.opengl.*;
import gg.essential.elementa.components.*;
import java.awt.*;
import kotlin.ranges.*;
import gg.essential.universal.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J=\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0000¢\u0006\u0002\b\u0013J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\r\u0010\u0019\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001bJ\r\u0010\u001c\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001dJ\u0016\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!J\u0016\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\"" }, d2 = { "Lgg/essential/elementa/UIComponent$Companion;", "", "()V", "DEBUG_OUTLINE_WIDTH", "", "getDEBUG_OUTLINE_WIDTH", "()D", "defaultComponentName", "", "drawDebugOutline", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "left", "top", "right", "bottom", "component", "Lgg/essential/elementa/UIComponent;", "drawDebugOutline$Elementa", "getDebugColor", "Ljava/awt/Color;", "depth", "", "offset", "getMouseX", "", "getMouseX$Elementa", "getMouseY", "getMouseY$Elementa", "guiHint", "number", "roundDown", "", "Elementa" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    public final double getDEBUG_OUTLINE_WIDTH() {
        return UIComponent.access$getDEBUG_OUTLINE_WIDTH$cp();
    }
    
    public final void drawDebugOutline$Elementa(@NotNull final UMatrixStack matrixStack, final double left, final double top, final double right, final double bottom, @NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)component, "component");
        if (ScissorEffect.Companion.getCurrentScissorState() != null) {
            GL11.glDisable(3089);
        }
        final Color color = this.getDebugColor(component.depth(), component.getParent().hashCode() / 3.141592653589793 % 3.141592653589793);
        UIBlock.Companion.drawBlock(matrixStack, color, left - this.getDEBUG_OUTLINE_WIDTH(), top - this.getDEBUG_OUTLINE_WIDTH(), right + this.getDEBUG_OUTLINE_WIDTH(), top);
        UIBlock.Companion.drawBlock(matrixStack, color, right, top, right + this.getDEBUG_OUTLINE_WIDTH(), bottom);
        UIBlock.Companion.drawBlock(matrixStack, color, left - this.getDEBUG_OUTLINE_WIDTH(), bottom, right + this.getDEBUG_OUTLINE_WIDTH(), bottom + this.getDEBUG_OUTLINE_WIDTH());
        UIBlock.Companion.drawBlock(matrixStack, color, left - this.getDEBUG_OUTLINE_WIDTH(), top, left, bottom);
        if (ScissorEffect.Companion.getCurrentScissorState() != null) {
            GL11.glEnable(3089);
        }
    }
    
    private final Color getDebugColor(final int depth, final double offset) {
        final double step = depth / 3.141592653589793 + offset;
        final int red = RangesKt.coerceIn((int)((Math.sin(step) + 0.75) * 170), (ClosedRange)new IntRange(0, 255));
        final int green = RangesKt.coerceIn((int)((Math.sin(step + 2.0943951023931953) + 0.75) * 170), (ClosedRange)new IntRange(0, 255));
        final int blue = RangesKt.coerceIn((int)((Math.sin(step + 4.1887902047863905) + 0.75) * 170), (ClosedRange)new IntRange(0, 255));
        return new Color(red, green, blue, 255);
    }
    
    public final float guiHint(final float number, final boolean roundDown) {
        final float factor = (float)UResolution.getScaleFactor();
        final float it = number * factor;
        final int n = 0;
        return (roundDown ? ((float)Math.floor(it)) : ((float)Math.ceil(it))) / factor;
    }
    
    public final double guiHint(final double number, final boolean roundDown) {
        final double factor = UResolution.getScaleFactor();
        final double it = number * factor;
        final int n = 0;
        return (roundDown ? Math.floor(it) : Math.ceil(it)) / factor;
    }
    
    public final float getMouseX$Elementa() {
        return (float)UMouse.Scaled.getX();
    }
    
    public final float getMouseY$Elementa() {
        return (float)UMouse.Scaled.getY();
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
