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
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "", "invoke" })
static final class CosmeticOption$CartGridButton$8 extends Lambda implements Function1<Boolean, String> {
    public static final CosmeticOption$CartGridButton$8 INSTANCE;
    
    CosmeticOption$CartGridButton$8() {
        super(1);
    }
    
    @NotNull
    public final String invoke(final boolean it) {
        return it ? "Remove from Cart" : "Add to Cart";
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((boolean)p1);
    }
    
    static {
        INSTANCE = new Function1<Boolean, String>() {
            public static final CosmeticOption$CartGridButton$8 INSTANCE;
            
            CosmeticOption$CartGridButton$8() {
                super(1);
            }
            
            @NotNull
            public final String invoke(final boolean it) {
                return it ? "Remove from Cart" : "Add to Cart";
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                return this.invoke((boolean)p1);
            }
        };
    }
}