package gg.essential.gui.menu;

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
static final class RightSideBar$messageCount$2 extends Lambda implements Function1<Integer, String> {
    public static final RightSideBar$messageCount$2 INSTANCE;
    
    RightSideBar$messageCount$2() {
        super(1);
    }
    
    @NotNull
    public final String invoke(final int it) {
        return (it > 98) ? "99+" : String.valueOf(it);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke(((Number)p1).intValue());
    }
    
    static {
        RightSideBar$messageCount$2.INSTANCE = new RightSideBar$messageCount$2();
    }
}