package gg.essential.gui.friends.previews;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H
                                                   ?\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "", "it", "invoke" })
static final class ChannelPreview$titleState$1 extends Lambda implements Function1<String, String> {
    public static final ChannelPreview$titleState$1 INSTANCE;
    
    ChannelPreview$titleState$1() {
        super(1);
    }
    
    @NotNull
    public final String invoke(@NotNull final String it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return it;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((String)p1);
    }
    
    static {
        ChannelPreview$titleState$1.INSTANCE = new ChannelPreview$titleState$1();
    }
}