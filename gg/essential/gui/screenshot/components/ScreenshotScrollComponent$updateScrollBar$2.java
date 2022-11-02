package gg.essential.gui.screenshot.components;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
final synthetic class ScreenshotScrollComponent$updateScrollBar$2 extends AdaptedFunctionReference implements Function0<Unit> {
    ScreenshotScrollComponent$updateScrollBar$2(final Object receiver) {
        super(0, receiver, (Class)UIComponent.class, "unhide", "unhide(Z)V", 0);
    }
    
    public final void invoke() {
        UIComponent.unhide$default((UIComponent)access$getReceiver$p(this), false, 1, null);
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
    
    public static final /* synthetic */ Object access$getReceiver$p(final ScreenshotScrollComponent$updateScrollBar$2 $this) {
        return $this.receiver;
    }
}