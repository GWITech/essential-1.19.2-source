package gg.essential.elementa.components;

import kotlin.jvm.functions.*;
import gg.essential.elementa.font.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0018\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001e\u0010\u0002\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007" }, d2 = { "<anonymous>", "", "<name for destructuring parameter 0>", "Lkotlin/Pair;", "", "Lgg/essential/elementa/font/FontProvider;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Float;" })
static final class UIText$1 extends Lambda implements Function1<Pair<? extends Boolean, ? extends Pair<? extends Boolean, ? extends FontProvider>>, Float> {
    public static final UIText$1 INSTANCE;
    
    UIText$1() {
        super(1);
    }
    
    @NotNull
    public final Float invoke(@NotNull final Pair<Boolean, ? extends Pair<Boolean, ? extends FontProvider>> $dstr$shadow$opts) {
        Intrinsics.checkNotNullParameter((Object)$dstr$shadow$opts, "$dstr$shadow$opts");
        final boolean shadow = (boolean)$dstr$shadow$opts.component1();
        final Pair opts = (Pair)$dstr$shadow$opts.component2();
        final boolean verticallyCentered = (boolean)opts.component1();
        final FontProvider fontProvider = (FontProvider)opts.component2();
        final float above = verticallyCentered ? fontProvider.getBelowLineHeight() : 0.0f;
        final float center = fontProvider.getBaseLineHeight();
        final float below = fontProvider.getBelowLineHeight() + (shadow ? fontProvider.getShadowHeight() : 0.0f);
        return above + center + below;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Pair<Boolean, ? extends Pair<Boolean, ? extends FontProvider>>)p1);
    }
    
    static {
        INSTANCE = new Function1<Pair<? extends Boolean, ? extends Pair<? extends Boolean, ? extends FontProvider>>, Float>() {
            public static final UIText$1 INSTANCE;
            
            UIText$1() {
                super(1);
            }
            
            @NotNull
            public final Float invoke(@NotNull final Pair<Boolean, ? extends Pair<Boolean, ? extends FontProvider>> $dstr$shadow$opts) {
                Intrinsics.checkNotNullParameter((Object)$dstr$shadow$opts, "$dstr$shadow$opts");
                final boolean shadow = (boolean)$dstr$shadow$opts.component1();
                final Pair opts = (Pair)$dstr$shadow$opts.component2();
                final boolean verticallyCentered = (boolean)opts.component1();
                final FontProvider fontProvider = (FontProvider)opts.component2();
                final float above = verticallyCentered ? fontProvider.getBelowLineHeight() : 0.0f;
                final float center = fontProvider.getBaseLineHeight();
                final float below = fontProvider.getBelowLineHeight() + (shadow ? fontProvider.getShadowHeight() : 0.0f);
                return above + center + below;
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                return this.invoke((Pair<Boolean, ? extends Pair<Boolean, ? extends FontProvider>>)p1);
            }
        };
    }
}