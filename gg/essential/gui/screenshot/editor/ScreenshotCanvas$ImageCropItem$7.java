package gg.essential.gui.screenshot.editor;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "it", "Lgg/essential/elementa/events/UIClickEvent;", "invoke" })
static final class ScreenshotCanvas$ImageCropItem$7 extends Lambda implements Function2<UIComponent, UIClickEvent, Unit> {
    final /* synthetic */ ImageCropItem this$0;
    final /* synthetic */ ScreenshotCanvas this$1;
    final /* synthetic */ Ref$ObjectRef<Crop> $oldCrop;
    
    ScreenshotCanvas$ImageCropItem$7(final ImageCropItem $receiver, final ScreenshotCanvas $receiver, final Ref$ObjectRef<Crop> $oldCrop) {
        this.this$0 = $receiver;
        this.this$1 = $receiver;
        this.$oldCrop = $oldCrop;
        super(2);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        this.this$0.setDragging(true);
        final ImageCropItem this$0 = this.this$0;
        final float relativeX = it.getRelativeX();
        int access$getPadding$p$2da702bc;
        if (this.this$0.getAlignment().getAlignOpX()) {
            access$getPadding$p$2da702bc = ScreenshotCanvas.access$getPadding$p$2da702bc();
        }
        else {
            ScreenshotCanvas.access$getPadding$p$2da702bc();
            access$getPadding$p$2da702bc = -2;
        }
        this$0.setXDragOffset(relativeX + access$getPadding$p$2da702bc);
        final ImageCropItem this$2 = this.this$0;
        final float relativeY = it.getRelativeY();
        int access$getPadding$p$2da702bc2;
        if (this.this$0.getAlignment().getAlignOpY()) {
            access$getPadding$p$2da702bc2 = ScreenshotCanvas.access$getPadding$p$2da702bc();
        }
        else {
            ScreenshotCanvas.access$getPadding$p$2da702bc();
            access$getPadding$p$2da702bc2 = -2;
        }
        this$2.setYDragOffset(relativeY + access$getPadding$p$2da702bc2);
        this.$oldCrop.element = this.this$1.getCropSettings().clone();
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        this.invoke((UIComponent)p1, (UIClickEvent)p2);
        return Unit.INSTANCE;
    }
}