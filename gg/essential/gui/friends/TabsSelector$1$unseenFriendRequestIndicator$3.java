package gg.essential.gui.friends;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ?\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "", "invoke", "(I)Ljava/lang/Boolean;" })
static final class TabsSelector$1$unseenFriendRequestIndicator$3 extends Lambda implements Function1<Integer, Boolean> {
    public static final TabsSelector$1$unseenFriendRequestIndicator$3 INSTANCE;
    
    TabsSelector$1$unseenFriendRequestIndicator$3() {
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(final int it) {
        return it > 0;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke(((Number)p1).intValue());
    }
    
    static {
        TabsSelector$1$unseenFriendRequestIndicator$3.INSTANCE = new TabsSelector$1$unseenFriendRequestIndicator$3();
    }
}