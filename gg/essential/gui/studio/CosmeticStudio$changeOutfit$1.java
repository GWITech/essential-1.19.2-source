package gg.essential.gui.studio;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H
                                                   ¢\u0006\u0004\b\u0003\u0010\u0004""" }, d2 = { "<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;" })
static final class CosmeticStudio$changeOutfit$1 extends Lambda implements Function1<Integer, Integer> {
    final /* synthetic */ int $offset;
    
    CosmeticStudio$changeOutfit$1(final int $offset) {
        this.$offset = $offset;
        super(1);
    }
    
    @NotNull
    public final Integer invoke(final int it) {
        return (it + this.$offset + 5) % 5;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke(((Number)p1).intValue());
    }
}