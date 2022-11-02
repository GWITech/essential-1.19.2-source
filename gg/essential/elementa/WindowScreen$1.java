package gg.essential.elementa;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "typedChar", "", "keyCode", "", "invoke" })
static final class WindowScreen$1 extends Lambda implements Function3<UIComponent, Character, Integer, Unit> {
    final /* synthetic */ WindowScreen this$0;
    
    WindowScreen$1(final WindowScreen $receiver) {
        this.this$0 = $receiver;
        super(3);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onKeyType, final char typedChar, final int keyCode) {
        Intrinsics.checkNotNullParameter((Object)$this$onKeyType, "$this$onKeyType");
        this.this$0.defaultKeyBehavior(typedChar, keyCode);
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3) {
        this.invoke((UIComponent)p1, (char)p2, ((Number)p3).intValue());
        return Unit.INSTANCE;
    }
}