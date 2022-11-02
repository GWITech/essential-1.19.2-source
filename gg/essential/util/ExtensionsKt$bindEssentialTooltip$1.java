package gg.essential.util;

import kotlin.jvm.functions.*;
import gg.essential.elementa.components.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "T", "Lgg/essential/elementa/UIComponent;", "Lgg/essential/elementa/components/UIText;", "invoke" })
static final class ExtensionsKt$bindEssentialTooltip$1 extends Lambda implements Function1<UIText, Unit> {
    public static final ExtensionsKt$bindEssentialTooltip$1 INSTANCE;
    
    ExtensionsKt$bindEssentialTooltip$1() {
        super(1);
    }
    
    public final void invoke(@NotNull final UIText $this$null) {
        Intrinsics.checkNotNullParameter((Object)$this$null, "$this$null");
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((UIText)p1);
        return Unit.INSTANCE;
    }
    
    static {
        ExtensionsKt$bindEssentialTooltip$1.INSTANCE = new ExtensionsKt$bindEssentialTooltip$1();
    }
}