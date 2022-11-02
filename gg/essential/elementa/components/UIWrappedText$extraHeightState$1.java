package gg.essential.elementa.components;

import kotlin.jvm.functions.*;
import gg.essential.elementa.font.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0018\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\u00050\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007" }, d2 = { "<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "Lgg/essential/elementa/font/FontProvider;", "", "invoke", "(Lkotlin/Pair;)Ljava/lang/Float;" })
static final class UIWrappedText$extraHeightState$1 extends Lambda implements Function1<Pair<? extends Pair<? extends FontProvider, ? extends Boolean>, ? extends Boolean>, Float> {
    public static final UIWrappedText$extraHeightState$1 INSTANCE;
    
    UIWrappedText$extraHeightState$1() {
        super(1);
    }
    
    @NotNull
    public final Float invoke(@NotNull final Pair<? extends Pair<? extends FontProvider, Boolean>, Boolean> $dstr$opts$shadow) {
        Intrinsics.checkNotNullParameter((Object)$dstr$opts$shadow, "$dstr$opts$shadow");
        final Pair opts = (Pair)$dstr$opts$shadow.component1();
        final boolean shadow = (boolean)$dstr$opts$shadow.component2();
        final FontProvider fontProvider = (FontProvider)opts.component1();
        final boolean verticallyCentered = (boolean)opts.component2();
        return (verticallyCentered ? fontProvider.getBelowLineHeight() : 0.0f) + (shadow ? 0.0f : (-fontProvider.getShadowHeight()));
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Pair)p1);
    }
    
    static {
        UIWrappedText$extraHeightState$1.INSTANCE = new UIWrappedText$extraHeightState$1();
    }
}