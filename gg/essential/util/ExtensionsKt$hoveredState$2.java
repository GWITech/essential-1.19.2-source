package gg.essential.util;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import gg.essential.elementa.state.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H
                                                   ¢\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "invoke" })
static final class ExtensionsKt$hoveredState$2 extends Lambda implements Function1<UIComponent, Unit> {
    final /* synthetic */ boolean $hitTest;
    final /* synthetic */ BasicState<Boolean> $unsafeHovered;
    final /* synthetic */ UIComponent $this_hoveredState;
    
    ExtensionsKt$hoveredState$2(final boolean $hitTest, final BasicState<Boolean> $unsafeHovered, final UIComponent $receiver) {
        this.$hitTest = $hitTest;
        this.$unsafeHovered = $unsafeHovered;
        this.$this_hoveredState = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseEnter) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseEnter, "$this$onMouseEnter");
        if (this.$hitTest) {
            this.$unsafeHovered.set(ExtensionsKt.access$hoveredState$hitTestHovered(this.$this_hoveredState));
        }
        else {
            this.$unsafeHovered.set(true);
        }
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((UIComponent)p1);
        return Unit.INSTANCE;
    }
}