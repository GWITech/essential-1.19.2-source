package gg.essential.gui.studio;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003""" }, d2 = { "Lgg/essential/gui/studio/CosmeticStudio$Category$Cart;", "Lgg/essential/gui/studio/CosmeticStudio$Category;", "()V", "essential" })
public static final class Cart extends Category
{
    @NotNull
    public static final Cart INSTANCE;
    
    private Cart() {
        super("cart");
    }
    
    static {
        INSTANCE = new Cart();
    }
}
