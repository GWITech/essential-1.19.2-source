package gg.essential.vigilance.gui.common;

import kotlin.jvm.functions.*;
import gg.essential.vigilance.utils.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "Lgg/essential/vigilance/utils/ImageFactory;", "it", "invoke" })
static final class IconButton$iconState$1 extends Lambda implements Function1<ImageFactory, ImageFactory> {
    public static final IconButton$iconState$1 INSTANCE;
    
    IconButton$iconState$1() {
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
        IconButton$iconState$1.INSTANCE = new IconButton$iconState$1();
    }
}