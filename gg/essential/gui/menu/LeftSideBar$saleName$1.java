package gg.essential.gui.menu;

import kotlin.jvm.functions.*;
import gg.essential.gui.state.*;
import kotlin.*;
import java.util.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/gui/state/Sale;", "invoke" })
static final class LeftSideBar$saleName$1 extends Lambda implements Function1<Sale, String> {
    public static final LeftSideBar$saleName$1 INSTANCE;
    
    LeftSideBar$saleName$1() {
        super(1);
    }
    
    @NotNull
    public final String invoke(@Nullable final Sale it) {
        if (it != null) {
            final String name = it.getName();
            if (name != null) {
                final String upperCase;
                final String s = upperCase = name.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue((Object)s, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                if (s != null) {
                    return upperCase + ((it != null && it.getDiscountPercent() == 0) ? "" : " SALE");
                }
            }
        }
        String upperCase = "";
        return upperCase + ((it != null && it.getDiscountPercent() == 0) ? "" : " SALE");
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((Sale)p1);
    }
    
    static {
        LeftSideBar$saleName$1.INSTANCE = new LeftSideBar$saleName$1();
    }
}