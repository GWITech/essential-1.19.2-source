package gg.essential.gui.screenshot.components;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.universal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class FocusEditComponent$saveButton$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ FocusEditComponent this$0;
    
    FocusEditComponent$saveButton$2(final FocusEditComponent $receiver) {
        this.this$0 = $receiver;
        super(0);
    }
    
    public final void invoke() {
        USound.playButtonPress$default(USound.INSTANCE, 0.0f, 1, null);
        FocusEditComponent.access$saveCurrentChanges(this.this$0);
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}