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
static final class ExtensionsKt$hoveredState$3 extends Lambda implements Function1<UIComponent, Unit> {
    final /* synthetic */ BasicState<Boolean> $unsafeHovered;
    
    ExtensionsKt$hoveredState$3(final BasicState<Boolean> $unsafeHovered) {
        this.$unsafeHovered = $unsafeHovered;
        super(1);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseLeave) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseLeave, "$this$onMouseLeave");
        this.$unsafeHovered.set(false);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((UIComponent)p1);
        return Unit.INSTANCE;
    }
}