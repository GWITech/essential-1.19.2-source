package gg.essential.gui.studio;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "", "invoke" })
static final class PlayerSection$outfitText$2 extends Lambda implements Function1<Integer, String> {
    public static final PlayerSection$outfitText$2 INSTANCE;
    
    PlayerSection$outfitText$2() {
        super(1);
    }
    
    @NotNull
    public final String invoke(final int it) {
        return "Outfit #" + (it + 1);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke(((Number)p1).intValue());
    }
    
    static {
        PlayerSection$outfitText$2.INSTANCE = new PlayerSection$outfitText$2();
    }
}