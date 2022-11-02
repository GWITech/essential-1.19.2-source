package gg.essential.vigilance.gui.settings;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.vigilance.data.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002" }, d2 = { "<anonymous>", "", "invoke" })
static final class ButtonComponent$Companion$callbackFromPropertyData$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ PropertyValue $value;
    final /* synthetic */ PropertyData $data;
    
    ButtonComponent$Companion$callbackFromPropertyData$1(final PropertyValue $value, final PropertyData $data) {
        this.$value = $value;
        this.$data = $data;
        super(0);
    }
    
    public final void invoke() {
        ((CallablePropertyValue)this.$value).invoke(this.$data.getInstance());
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}