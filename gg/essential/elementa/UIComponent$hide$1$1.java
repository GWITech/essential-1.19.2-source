package gg.essential.elementa;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n�\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "invoke" })
static final class UIComponent$hide$1$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function0<Unit> $comp;
    final /* synthetic */ UIComponent this$0;
    
    UIComponent$hide$1$1(final Function0<Unit> $comp, final UIComponent $receiver) {
        this.$comp = $comp;
        this.this$0 = $receiver;
        super(0);
    }
    
    public final void invoke() {
        this.$comp.invoke();
        UIComponent.access$setIndexInParent$p(this.this$0, this.this$0.getParent().getChildren().indexOf(this.this$0));
        this.this$0.getParent().removeChild(this.this$0);
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}