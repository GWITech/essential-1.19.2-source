package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import kotlin.*;
import java.util.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\u0006
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "", "invoke" })
static final class CosmeticStudio$formattedPrice$1 extends Lambda implements Function1<Double, String> {
    public static final CosmeticStudio$formattedPrice$1 INSTANCE;
    
    CosmeticStudio$formattedPrice$1() {
        super(1);
    }
    
    @NotNull
    public final String invoke(final double it) {
        final String format = String.format("$%.2f", Arrays.copyOf(new Object[] { it }, 1));
        Intrinsics.checkNotNullExpressionValue((Object)format, "format(this, *args)");
        return format;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke(((Number)p1).doubleValue());
    }
    
    static {
        CosmeticStudio$formattedPrice$1.INSTANCE = new CosmeticStudio$formattedPrice$1();
    }
}