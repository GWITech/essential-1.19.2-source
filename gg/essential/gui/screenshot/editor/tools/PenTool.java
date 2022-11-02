package gg.essential.gui.screenshot.editor.tools;

import java.awt.*;
import org.jetbrains.annotations.*;
import gg.essential.gui.screenshot.editor.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.components.*;
import kotlin.*;
import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.jvm.functions.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u000b
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0007\u0010\b"\u0004\b	\u0010
                                                   R \u0010\u000b\u001a\b\u0018\u00010\fR\u00020\u0000X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\r\u0010\u000e"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0013\u0010\u0014"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0018\u0010\u0014"\u0004\b\u0019\u0010\u0016R\u001a\u0010\u001a\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u001b\u0010\u0014"\u0004\b\u001c\u0010\u0016¨\u0006 """ }, d2 = { "Lgg/essential/gui/screenshot/editor/tools/PenTool;", "Lgg/essential/gui/screenshot/editor/tools/Tool;", "editableScreenshot", "Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;", "(Lgg/essential/gui/screenshot/editor/ScreenshotCanvas;)V", "color", "Ljava/awt/Color;", "getColor", "()Ljava/awt/Color;", "setColor", "(Ljava/awt/Color;)V", "currentVectorStroke", "Lgg/essential/gui/screenshot/editor/tools/PenTool$PenVectorStroke;", "getCurrentVectorStroke", "()Lgg/essential/gui/screenshot/editor/tools/PenTool$PenVectorStroke;", "setCurrentVectorStroke", "(Lgg/essential/gui/screenshot/editor/tools/PenTool$PenVectorStroke;)V", "previousMouseX", "", "getPreviousMouseX", "()F", "setPreviousMouseX", "(F)V", "previousMouseY", "getPreviousMouseY", "setPreviousMouseY", "width", "getWidth", "setWidth", "enable", "", "PenVectorStroke", "essential" })
public final class PenTool extends Tool
{
    @NotNull
    private Color color;
    private float width;
    private float previousMouseX;
    private float previousMouseY;
    @Nullable
    private PenTool.PenVectorStroke currentVectorStroke;
    
    public PenTool(@NotNull final ScreenshotCanvas editableScreenshot) {
        Intrinsics.checkNotNullParameter((Object)editableScreenshot, "editableScreenshot");
        super(editableScreenshot);
        final Color white = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue((Object)white, "WHITE");
        this.color = white;
        this.width = 1.0f;
        this.previousMouseX = -1.0f;
        this.previousMouseY = -1.0f;
    }
    
    @NotNull
    public final Color getColor() {
        return this.color;
    }
    
    public final void setColor(@NotNull final Color <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.color = <set-?>;
    }
    
    public final float getWidth() {
        return this.width;
    }
    
    public final void setWidth(final float <set-?>) {
        this.width = <set-?>;
    }
    
    public final float getPreviousMouseX() {
        return this.previousMouseX;
    }
    
    public final void setPreviousMouseX(final float <set-?>) {
        this.previousMouseX = <set-?>;
    }
    
    public final float getPreviousMouseY() {
        return this.previousMouseY;
    }
    
    public final void setPreviousMouseY(final float <set-?>) {
        this.previousMouseY = <set-?>;
    }
    
    @Nullable
    public final PenTool.PenVectorStroke getCurrentVectorStroke() {
        return this.currentVectorStroke;
    }
    
    public final void setCurrentVectorStroke(@Nullable final PenTool.PenVectorStroke <set-?>) {
        this.currentVectorStroke = <set-?>;
    }
    
    public void enable() {
        this.getEditableScreenshot().setOnDraw((Function4<? super UIContainer, ? super Float, ? super Float, ? super Integer, Unit>)new PenTool$enable.PenTool$enable$1(this));
        this.getEditableScreenshot().getScreenshotDisplay().onMouseClick((Function2<? super UIComponent, ? super UIClickEvent, Unit>)new PenTool$enable.PenTool$enable$2(this));
        this.getEditableScreenshot().getScreenshotDisplay().onMouseRelease((Function1<? super UIComponent, Unit>)new PenTool$enable.PenTool$enable$3(this));
    }
}
