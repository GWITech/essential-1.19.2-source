package gg.essential.gui.modals;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H
                                                   ¢\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "invoke" })
static final class TOSModal$tosText4$3 extends Lambda implements Function1<UIComponent, Unit> {
    public static final TOSModal$tosText4$3 INSTANCE;
    
    TOSModal$tosText4$3() {
        super(1);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseEnter) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseEnter, "$this$onMouseEnter");
        $this$onMouseEnter.setColor(EssentialPalette.TEXT_HIGHLIGHT);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((UIComponent)p1);
        return Unit.INSTANCE;
    }
    
    static {
        TOSModal$tosText4$3.INSTANCE = new TOSModal$tosText4$3();
    }
}