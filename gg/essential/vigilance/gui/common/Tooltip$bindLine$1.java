package gg.essential.vigilance.gui.common;

import kotlin.jvm.functions.*;
import gg.essential.elementa.components.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/components/UIText;", "invoke" })
static final class Tooltip$bindLine$1 extends Lambda implements Function1<UIText, Unit> {
    public static final Tooltip$bindLine$1 INSTANCE;
    
    Tooltip$bindLine$1() {
        super(1);
    }
    
    public final void invoke(@NotNull final UIText $this$null) {
        Intrinsics.checkNotNullParameter((Object)$this$null, "$this$null");
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((UIText)p1);
        return Unit.INSTANCE;
    }
    
    static {
        Tooltip$bindLine$1.INSTANCE = new Tooltip$bindLine$1();
    }
}