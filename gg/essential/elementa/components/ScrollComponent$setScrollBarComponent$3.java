package gg.essential.elementa.components;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "mouseX", "", "mouseY", "<anonymous parameter 2>", "", "invoke" })
static final class ScrollComponent$setScrollBarComponent$3 extends Lambda implements Function4<UIComponent, Float, Float, Integer, Unit> {
    final /* synthetic */ boolean $isHorizontal;
    final /* synthetic */ ScrollComponent this$0;
    final /* synthetic */ UIComponent $component;
    
    ScrollComponent$setScrollBarComponent$3(final boolean $isHorizontal, final ScrollComponent $receiver, final UIComponent $component) {
        this.$isHorizontal = $isHorizontal;
        this.this$0 = $receiver;
        this.$component = $component;
        super(4);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseDrag, final float mouseX, final float mouseY, final int $noName_2) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseDrag, "$this$onMouseDrag");
        if (this.$isHorizontal) {
            if (ScrollComponent.access$getHorizontalDragBeginPos$p(this.this$0) == -1.0f) {
                return;
            }
            ScrollComponent.access$updateGrip(this.this$0, this.$component, mouseX, true);
        }
        else {
            if (ScrollComponent.access$getVerticalDragBeginPos$p(this.this$0) == -1.0f) {
                return;
            }
            ScrollComponent.access$updateGrip(this.this$0, this.$component, mouseY, false);
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3, final Object p4) {
        this.invoke((UIComponent)p1, ((Number)p2).floatValue(), ((Number)p3).floatValue(), ((Number)p4).intValue());
        return Unit.INSTANCE;
    }
}