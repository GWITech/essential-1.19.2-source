package gg.essential.gui.screenshot.editor;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0003H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "Lkotlin/Pair;", "invoke", "(Lkotlin/Pair;)Ljava/lang/Float;" })
static final class ScreenshotCanvas$retainedImage$2$2 extends Lambda implements Function1<Pair<? extends Float, ? extends Float>, Float> {
    public static final ScreenshotCanvas$retainedImage$2$2 INSTANCE;
    
    ScreenshotCanvas$retainedImage$2$2() {
        super(1);
    }
    
    @NotNull
    public final Float invoke(@NotNull final Pair<Float, Float> it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return ((Number)it.getFirst()).floatValue() - ((Number)it.getSecond()).floatValue();
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Pair)p1);
    }
    
    static {
        ScreenshotCanvas$retainedImage$2$2.INSTANCE = new ScreenshotCanvas$retainedImage$2$2();
    }
}