package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/gui/studio/CosmeticStudio$Category;", "invoke", "(Lgg/essential/gui/studio/CosmeticStudio$Category;)Ljava/lang/Boolean;" })
static final class CosmeticStudio$inCart$1 extends Lambda implements Function1<Category, Boolean> {
    public static final CosmeticStudio$inCart$1 INSTANCE;
    
    CosmeticStudio$inCart$1() {
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final Category it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return Intrinsics.areEqual((Object)it, (Object)Category.Cart.INSTANCE);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Category)p1);
    }
    
    static {
        CosmeticStudio$inCart$1.INSTANCE = new CosmeticStudio$inCart$1();
    }
}