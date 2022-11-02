package gg.essential.elementa.components;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import gg.essential.elementa.font.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "Lgg/essential/elementa/font/FontProvider;", "Lgg/essential/elementa/UIConstraints;", "invoke" })
static final class UIText$fontProviderState$1 extends Lambda implements Function1<UIConstraints, FontProvider> {
    public static final UIText$fontProviderState$1 INSTANCE;
    
    UIText$fontProviderState$1() {
        super(1);
    }
    
    @NotNull
    public final FontProvider invoke(@NotNull final UIConstraints $this$asState) {
        Intrinsics.checkNotNullParameter((Object)$this$asState, "$this$asState");
        return $this$asState.getFontProvider();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((UIConstraints)p1);
    }
    
    static {
        UIText$fontProviderState$1.INSTANCE = new UIText$fontProviderState$1();
    }
}