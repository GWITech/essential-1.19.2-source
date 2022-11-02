package gg.essential.vigilance.utils;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.state.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "invoke" })
static final class ExtensionsKt$hoveredState$4$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ BasicState<Boolean> $safeHovered;
    final /* synthetic */ boolean $it;
    
    ExtensionsKt$hoveredState$4$1(final BasicState<Boolean> $safeHovered, final boolean $it) {
        this.$safeHovered = $safeHovered;
        this.$it = $it;
        super(0);
    }
    
    public final void invoke() {
        this.$safeHovered.set(this.$it);
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}