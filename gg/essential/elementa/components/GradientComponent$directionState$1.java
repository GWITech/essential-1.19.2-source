package gg.essential.elementa.components;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "Lgg/essential/elementa/components/GradientComponent$GradientDirection;", "it", "invoke" })
static final class GradientComponent$directionState$1 extends Lambda implements Function1<GradientDirection, GradientDirection> {
    public static final GradientComponent$directionState$1 INSTANCE;
    
    GradientComponent$directionState$1() {
        super(1);
    }
    
    @NotNull
    public final GradientDirection invoke(@NotNull final GradientDirection it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return it;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((GradientDirection)p1);
    }
    
    static {
        GradientComponent$directionState$1.INSTANCE = new GradientComponent$directionState$1();
    }
}