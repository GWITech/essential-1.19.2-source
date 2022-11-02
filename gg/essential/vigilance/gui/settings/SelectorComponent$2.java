package gg.essential.vigilance.gui.settings;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "newValue", "", "invoke" })
static final class SelectorComponent$2 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ SelectorComponent this$0;
    
    SelectorComponent$2(final SelectorComponent $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(final int newValue) {
        SettingComponent.changeValue$default(this.this$0, newValue, false, 2, null);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke(((Number)p1).intValue());
        return Unit.INSTANCE;
    }
}