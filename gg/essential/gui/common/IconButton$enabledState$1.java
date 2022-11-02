package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H
                                                   ¢\u0006\u0004\b\u0003\u0010\u0004""" }, d2 = { "<anonymous>", "", "it", "invoke", "(Z)Ljava/lang/Boolean;" })
static final class IconButton$enabledState$1 extends Lambda implements Function1<Boolean, Boolean> {
    public static final IconButton$enabledState$1 INSTANCE;
    
    IconButton$enabledState$1() {
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(final boolean it) {
        return it;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((boolean)p1);
    }
    
    static {
        IconButton$enabledState$1.INSTANCE = new IconButton$enabledState$1();
    }
}