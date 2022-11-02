package gg.essential.vigilance.gui;

import kotlin.jvm.functions.*;
import java.awt.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005" }, d2 = { "<anonymous>", "Ljava/awt/Color;", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "invoke" })
static final class VigilancePalette$getTextColor$1 extends Lambda implements Function1<Pair<? extends Boolean, ? extends Boolean>, Color> {
    public static final VigilancePalette$getTextColor$1 INSTANCE;
    
    VigilancePalette$getTextColor$1() {
        super(1);
    }
    
    @NotNull
    public final Color invoke(@NotNull final Pair<Boolean, Boolean> $dstr$hovered$enabled) {
        Intrinsics.checkNotNullParameter((Object)$dstr$hovered$enabled, "$dstr$hovered$enabled");
        final boolean hovered = (boolean)$dstr$hovered$enabled.component1();
        final boolean enabled = (boolean)$dstr$hovered$enabled.component2();
        return enabled ? (hovered ? VigilancePalette.INSTANCE.getTextHighlight() : VigilancePalette.INSTANCE.getText()) : VigilancePalette.INSTANCE.getTextDisabled();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Pair)p1);
    }
    
    static {
        VigilancePalette$getTextColor$1.INSTANCE = new VigilancePalette$getTextColor$1();
    }
}