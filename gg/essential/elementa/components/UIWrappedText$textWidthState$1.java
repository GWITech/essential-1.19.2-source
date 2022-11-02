package gg.essential.elementa.components;

import kotlin.jvm.functions.*;
import gg.essential.elementa.font.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.dsl.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0018\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007" }, d2 = { "<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lgg/essential/elementa/font/FontProvider;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Float;" })
static final class UIWrappedText$textWidthState$1 extends Lambda implements Function1<Pair<? extends String, ? extends Pair<? extends Float, ? extends FontProvider>>, Float> {
    public static final UIWrappedText$textWidthState$1 INSTANCE;
    
    UIWrappedText$textWidthState$1() {
        super(1);
    }
    
    @NotNull
    public final Float invoke(@NotNull final Pair<String, ? extends Pair<Float, ? extends FontProvider>> $dstr$text$opts) {
        Intrinsics.checkNotNullParameter((Object)$dstr$text$opts, "$dstr$text$opts");
        final String text = (String)$dstr$text$opts.component1();
        final Pair opts = (Pair)$dstr$text$opts.component2();
        final float textScale = ((Number)opts.component1()).floatValue();
        final FontProvider fontProvider = (FontProvider)opts.component2();
        return UtilitiesKt.width(text, textScale, fontProvider) / textScale;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Pair)p1);
    }
    
    static {
        UIWrappedText$textWidthState$1.INSTANCE = new UIWrappedText$textWidthState$1();
    }
}