package gg.essential.gui.modals;

import kotlin.jvm.internal.*;
import kotlin.*;
import gg.essential.elementa.state.*;
import kotlin.jvm.functions.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class TOSModal$3$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ TOSModal this$0;
    
    TOSModal$3$1(final TOSModal $receiver) {
        this.this$0 = $receiver;
        super(0);
    }
    
    public final void invoke() {
        TOSModal.access$getAgeCheckboxOutlineColor$p(this.this$0).rebind(TOSModal.access$getAgeCheckbox(this.this$0).isChecked().map((kotlin.jvm.functions.Function1<? super Object, ?>)TOSModal$3$1.TOSModal$3$1$1.INSTANCE));
        TOSModal.access$getTosCheckboxOutlineColor$p(this.this$0).rebind(TOSModal.access$getTosCheckbox(this.this$0).isChecked().map((kotlin.jvm.functions.Function1<? super Object, ?>)TOSModal$3$1.TOSModal$3$1$2.INSTANCE));
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}