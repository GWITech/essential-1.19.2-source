package gg.essential.gui.screenshot.editor;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.screenshot.editor.change.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H
                                                   ¢\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "invoke" })
static final class ScreenshotCanvas$ImageCropItem$8 extends Lambda implements Function1<UIComponent, Unit> {
    final /* synthetic */ ImageCropItem this$0;
    final /* synthetic */ Ref$ObjectRef<Crop> $oldCrop;
    final /* synthetic */ ScreenshotCanvas this$1;
    
    ScreenshotCanvas$ImageCropItem$8(final ImageCropItem $receiver, final Ref$ObjectRef<Crop> $oldCrop, final ScreenshotCanvas $receiver) {
        this.this$0 = $receiver;
        this.$oldCrop = $oldCrop;
        this.this$1 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseRelease) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseRelease, "$this$onMouseRelease");
        final boolean wasDragging = this.this$0.getDragging();
        this.this$0.setDragging(false);
        if (Intrinsics.areEqual(this.$oldCrop.element, (Object)this.this$1.getCropSettings()) || !wasDragging) {
            return;
        }
        final VectorEditingOverlay vectorEditingOverlay = this.this$1.getVectorEditingOverlay();
        final Crop crop = (Crop)this.$oldCrop.element;
        if (crop == null) {
            return;
        }
        vectorEditingOverlay.pushChange((Change)new CropChange(crop, this.this$1.getCropSettings().clone()));
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((UIComponent)p1);
        return Unit.INSTANCE;
    }
}