package gg.essential.gui.studio;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.state.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/gui/state/Sale;", "invoke", "(Lgg/essential/gui/state/Sale;)Ljava/lang/Boolean;" })
static final class CosmeticOption$isOnSale$1 extends Lambda implements Function1<Sale, Boolean> {
    public static final CosmeticOption$isOnSale$1 INSTANCE;
    
    CosmeticOption$isOnSale$1() {
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@Nullable final Sale it) {
        return it != null;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Sale)p1);
    }
    
    static {
        CosmeticOption$isOnSale$1.INSTANCE = new CosmeticOption$isOnSale$1();
    }
}