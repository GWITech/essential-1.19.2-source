package gg.essential.elementa.components;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.font.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n�\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "invoke" })
static final class Window$afterInitialization$1 extends Lambda implements Function0<Unit> {
    public static final Window$afterInitialization$1 INSTANCE;
    
    Window$afterInitialization$1() {
        super(0);
    }
    
    public final void invoke() {
        FontRenderer.Companion.initShaders();
        UICircle.Companion.initShaders();
        UIRoundedRectangle.Companion.initShaders();
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
    
    static {
        Window$afterInitialization$1.INSTANCE = new Window$afterInitialization$1();
    }
}