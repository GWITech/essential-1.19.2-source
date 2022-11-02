package gg.essential.elementa.components;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
final synthetic class ScrollComponent$updateScrollBar$1 extends AdaptedFunctionReference implements Function0<Unit> {
    ScrollComponent$updateScrollBar$1(final Object receiver) {
        super(0, receiver, (Class)UIComponent.class, "hide", "hide(Z)V", 0);
    }
    
    public final void invoke() {
        ScrollComponent.access$updateScrollBar$hide((UIComponent)access$getReceiver$p(this));
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
    
    public static final /* synthetic */ Object access$getReceiver$p(final ScrollComponent$updateScrollBar$1 $this) {
        return $this.receiver;
    }
}