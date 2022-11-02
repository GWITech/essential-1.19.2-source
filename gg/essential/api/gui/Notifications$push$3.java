package gg.essential.api.gui;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H
                                                   ¢\u0006\u0002\b\u0003""" }, d2 = { "<anonymous>", "", "Lgg/essential/api/gui/NotificationBuilder;", "invoke" })
static final class Notifications$push$3 extends Lambda implements Function1<NotificationBuilder, Unit> {
    public static final Notifications$push$3 INSTANCE;
    
    Notifications$push$3() {
        super(1);
    }
    
    public final void invoke(@NotNull final NotificationBuilder $this$null) {
        Intrinsics.checkNotNullParameter((Object)$this$null, "$this$null");
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((NotificationBuilder)p1);
        return Unit.INSTANCE;
    }
    
    static {
        Notifications$push$3.INSTANCE = new Notifications$push$3();
    }
}