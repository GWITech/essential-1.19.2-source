package gg.essential.vigilance.gui;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "it", "", "invoke" })
static final class DataBackedSetting$3 extends Lambda implements Function1<Object, Unit> {
    final /* synthetic */ DataBackedSetting this$0;
    
    DataBackedSetting$3(final DataBackedSetting $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@Nullable final Object it) {
        this.this$0.getData$Vigilance().setValue(it);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke(p1);
        return Unit.INSTANCE;
    }
}