package gg.essential.gui.screenshot.editor;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.ranges.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H
                                                   ¢\u0006\u0002\b\b""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "<anonymous parameter 2>", "", "invoke" })
static final class ScreenshotCanvas$ImageCropItem$9 extends Lambda implements Function4<UIComponent, Float, Float, Integer, Unit> {
    final /* synthetic */ ImageCropItem this$0;
    final /* synthetic */ ScreenshotCanvas this$1;
    
    ScreenshotCanvas$ImageCropItem$9(final ImageCropItem $receiver, final ScreenshotCanvas $receiver) {
        this.this$0 = $receiver;
        this.this$1 = $receiver;
        super(4);
    }
    
    public final void invoke$2bfbe426(@NotNull final UIComponent $this$onMouseDrag) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseDrag, "$this$onMouseDrag");
        if (this.this$0.getDragging()) {
            final Pair access$getMousePosition = ImageCropItem.access$getMousePosition(this.this$0);
            final float mouseX = ((Number)access$getMousePosition.component1()).floatValue();
            final float mouseY = ((Number)access$getMousePosition.component2()).floatValue();
            final float relativeX = mouseX - this.this$1.getScreenshotDisplay().getLeft();
            final float relativeY = mouseY - this.this$1.getScreenshotDisplay().getTop();
            final float adjustedMouseX = this.this$0.getAlignment().getAlignOpX() ? (relativeX + ($this$onMouseDrag.getWidth() - this.this$0.getXDragOffset())) : (relativeX - this.this$0.getXDragOffset());
            final float adjustedMouseY = this.this$0.getAlignment().getAlignOpY() ? (relativeY + ($this$onMouseDrag.getHeight() - this.this$0.getYDragOffset())) : (relativeY - this.this$0.getYDragOffset());
            final Pair<Float, Float> relativeMousePosition = this.this$1.getRelativeMousePosition(adjustedMouseX, adjustedMouseY);
            final float x = ((Number)relativeMousePosition.component1()).floatValue();
            final float y = ((Number)relativeMousePosition.component2()).floatValue();
            switch (ScreenshotCanvas$ImageCropItem$9.WhenMappings.$EnumSwitchMapping$0[this.this$0.getAlignment().ordinal()]) {
                case 1: {
                    this.this$1.getCropSettings().getTop().set(RangesKt.coerceAtMost(y, this.this$1.getCropSettings().getBottom().get().floatValue() - 0.1f));
                    this.this$1.getCropSettings().getLeft().set(RangesKt.coerceAtMost(x, this.this$1.getCropSettings().getRight().get().floatValue() - 0.1f));
                    break;
                }
                case 2: {
                    this.this$1.getCropSettings().getTop().set(RangesKt.coerceAtMost(y, this.this$1.getCropSettings().getBottom().get().floatValue() - 0.1f));
                    break;
                }
                case 3: {
                    this.this$1.getCropSettings().getTop().set(RangesKt.coerceAtMost(y, this.this$1.getCropSettings().getBottom().get().floatValue() - 0.1f));
                    this.this$1.getCropSettings().getRight().set(RangesKt.coerceAtLeast(x, this.this$1.getCropSettings().getLeft().get().floatValue() + 0.1f));
                    break;
                }
                case 4: {
                    this.this$1.getCropSettings().getRight().set(RangesKt.coerceAtLeast(x, this.this$1.getCropSettings().getLeft().get().floatValue() + 0.1f));
                    break;
                }
                case 5: {
                    this.this$1.getCropSettings().getBottom().set(RangesKt.coerceAtLeast(y, this.this$1.getCropSettings().getTop().get().floatValue() + 0.1f));
                    this.this$1.getCropSettings().getRight().set(RangesKt.coerceAtLeast(x, this.this$1.getCropSettings().getLeft().get().floatValue() + 0.1f));
                    break;
                }
                case 6: {
                    this.this$1.getCropSettings().getBottom().set(RangesKt.coerceAtLeast(y, this.this$1.getCropSettings().getTop().get().floatValue() + 0.1f));
                    break;
                }
                case 7: {
                    this.this$1.getCropSettings().getBottom().set(RangesKt.coerceAtLeast(y, this.this$1.getCropSettings().getTop().get().floatValue() + 0.1f));
                    this.this$1.getCropSettings().getLeft().set(RangesKt.coerceAtMost(x, this.this$1.getCropSettings().getRight().get().floatValue() - 0.1f));
                    break;
                }
                case 8: {
                    this.this$1.getCropSettings().getLeft().set(RangesKt.coerceAtMost(x, this.this$1.getCropSettings().getRight().get().floatValue() - 0.1f));
                    break;
                }
            }
            $this$onMouseDrag.animationFrame();
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3, final Object p4) {
        final UIComponent $this$onMouseDrag = (UIComponent)p1;
        ((Number)p2).floatValue();
        ((Number)p3).floatValue();
        ((Number)p4).intValue();
        this.invoke$2bfbe426($this$onMouseDrag);
        return Unit.INSTANCE;
    }
}