package gg.essential.elementa.markdown.drawables;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.markdown.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "invoke" })
static final class Drawable$drawCompat$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Drawable this$0;
    final /* synthetic */ DrawState $state;
    
    Drawable$drawCompat$1(final Drawable $receiver, final DrawState $state) {
        this.this$0 = $receiver;
        this.$state = $state;
        super(0);
    }
    
    public final void invoke() {
        this.this$0.draw(this.$state);
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}