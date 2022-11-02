package gg.essential.vigilance.gui.settings;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.vigilance.impl.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "", "it", "invoke" })
static final class ButtonComponent$textState$2 extends Lambda implements Function1<String, String> {
    public static final ButtonComponent$textState$2 INSTANCE;
    
    ButtonComponent$textState$2() {
        super(1);
    }
    
    @NotNull
    public final String invoke(@NotNull final String it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return I18n.INSTANCE.format(it);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((String)p1);
    }
    
    static {
        ButtonComponent$textState$2.INSTANCE = new ButtonComponent$textState$2();
    }
}