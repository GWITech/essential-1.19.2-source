package gg.essential.gui.common.input;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.ranges.*;

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
                                                   ¢\u0006\u0002\b\b""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "mouseX", "", "mouseY", "mouseButton", "", "invoke" })
static final class AbstractTextInput$5 extends Lambda implements Function4<UIComponent, Float, Float, Integer, Unit> {
    final /* synthetic */ AbstractTextInput this$0;
    
    AbstractTextInput$5(final AbstractTextInput $receiver) {
        this.this$0 = $receiver;
        super(4);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseDrag, final float mouseX, final float mouseY, final int mouseButton) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseDrag, "$this$onMouseDrag");
        if (mouseButton != 0 || this.this$0.getSelectionMode() == SelectionMode.None) {
            return;
        }
        final LinePosition draggedVisualPos = this.this$0.screenPosToVisualPos(mouseX, mouseY);
        switch (AbstractTextInput$5.WhenMappings.$EnumSwitchMapping$0[this.this$0.getSelectionMode().ordinal()]) {
            case 1: {
                this.this$0.setOtherSelectionEnd(draggedVisualPos);
                break;
            }
            case 2: {
                if (this.this$0.getInitiallySelectedLine() < draggedVisualPos.getLine()) {
                    this.this$0.setCursor(this.this$0.new LinePosition(this.this$0.getInitiallySelectedLine(), 0, true));
                    this.this$0.setOtherSelectionEnd(draggedVisualPos.withColumn(((Line)this.this$0.getVisualLines().get(draggedVisualPos.getLine())).getLength()));
                    break;
                }
                this.this$0.setCursor(draggedVisualPos.withColumn(0));
                this.this$0.setOtherSelectionEnd(this.this$0.new LinePosition(this.this$0.getInitiallySelectedLine(), ((Line)this.this$0.getVisualLines().get(this.this$0.getInitiallySelectedLine())).getLength(), true));
                break;
            }
            case 3: {
                if (draggedVisualPos.compareTo((LinePosition)this.this$0.getInitiallySelectedWord().getFirst()) < 0) {
                    this.this$0.setCursor(this.this$0.getNearestWordBoundary(draggedVisualPos, AbstractTextInput$Direction.Left));
                    this.this$0.setOtherSelectionEnd((LinePosition)this.this$0.getInitiallySelectedWord().getSecond());
                    break;
                }
                if (draggedVisualPos.compareTo((LinePosition)this.this$0.getInitiallySelectedWord().getSecond()) > 0) {
                    this.this$0.setCursor((LinePosition)this.this$0.getInitiallySelectedWord().getFirst());
                    this.this$0.setOtherSelectionEnd(this.this$0.getNearestWordBoundary(draggedVisualPos, AbstractTextInput$Direction.Right));
                    break;
                }
                this.this$0.setCursor((LinePosition)this.this$0.getInitiallySelectedWord().getFirst());
                this.this$0.setOtherSelectionEnd((LinePosition)this.this$0.getInitiallySelectedWord().getSecond());
                break;
            }
        }
        final long currentTime = System.currentTimeMillis();
        if (currentTime - this.this$0.getLastSelectionMoveTimestamp() > 50L) {
            if (mouseY <= 0.0f) {
                this.this$0.setTargetVerticalScrollingOffset(RangesKt.coerceAtMost(this.this$0.getTargetVerticalScrollingOffset() + this.this$0.getLineHeight() * $this$onMouseDrag.getTextScale(), 0.0f));
                this.this$0.setLastSelectionMoveTimestamp(currentTime);
            }
            else if (mouseY >= $this$onMouseDrag.getHeight()) {
                final float heightDifference = $this$onMouseDrag.getHeight() - this.this$0.getVisualLines().size() * this.this$0.getLineHeight() * $this$onMouseDrag.getTextScale();
                this.this$0.setTargetVerticalScrollingOffset(RangesKt.coerceIn(this.this$0.getTargetVerticalScrollingOffset() - this.this$0.getLineHeight() * $this$onMouseDrag.getTextScale(), 0.0f, heightDifference));
                this.this$0.setLastSelectionMoveTimestamp(currentTime);
            }
            else if (mouseX <= 0.0f) {
                this.this$0.scrollIntoView(draggedVisualPos.offsetColumn(-1));
                this.this$0.setLastSelectionMoveTimestamp(currentTime);
            }
            else if (mouseX >= $this$onMouseDrag.getWidth()) {
                this.this$0.scrollIntoView(draggedVisualPos.offsetColumn(1));
                this.this$0.setLastSelectionMoveTimestamp(currentTime);
            }
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3, final Object p4) {
        this.invoke((UIComponent)p1, ((Number)p2).floatValue(), ((Number)p3).floatValue(), ((Number)p4).intValue());
        return Unit.INSTANCE;
    }
}