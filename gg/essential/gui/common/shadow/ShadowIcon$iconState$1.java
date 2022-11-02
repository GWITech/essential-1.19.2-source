package gg.essential.gui.common.shadow;

import kotlin.jvm.functions.*;
import gg.essential.gui.image.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "Lgg/essential/gui/image/ImageFactory;", "it", "invoke" })
static final class ShadowIcon$iconState$1 extends Lambda implements Function1<ImageFactory, ImageFactory> {
    public static final ShadowIcon$iconState$1 INSTANCE;
    
    ShadowIcon$iconState$1() {
        super(1);
    }
    
    @NotNull
    public final ImageFactory invoke(@NotNull final ImageFactory it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return it;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((ImageFactory)p1);
    }
    
    static {
        ShadowIcon$iconState$1.INSTANCE = new ShadowIcon$iconState$1();
    }
}