package gg.essential.gui.studio;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
final synthetic class CosmeticStudio$afterInitialization$1 extends FunctionReferenceImpl implements Function0<Unit> {
    CosmeticStudio$afterInitialization$1(final Object receiver) {
        super(0, receiver, (Class)CosmeticStudio.class, "handleResize", "handleResize()V", 0);
    }
    
    public final void invoke() {
        CosmeticStudio.access$handleResize((CosmeticStudio)this.receiver);
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}