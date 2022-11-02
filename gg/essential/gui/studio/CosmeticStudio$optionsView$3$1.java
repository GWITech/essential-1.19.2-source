package gg.essential.gui.studio;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "", "invoke", "(Z)Ljava/lang/Float;" })
static final class CosmeticStudio$optionsView$3$1 extends Lambda implements Function1<Boolean, Float> {
    public static final CosmeticStudio$optionsView$3$1 INSTANCE;
    
    CosmeticStudio$optionsView$3$1() {
        super(1);
    }
    
    @NotNull
    public final Float invoke(final boolean it) {
        return it ? 25.0f : 0.0f;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((boolean)p1);
    }
    
    static {
        CosmeticStudio$optionsView$3$1.INSTANCE = new CosmeticStudio$optionsView$3$1();
    }
}