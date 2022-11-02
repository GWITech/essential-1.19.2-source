package gg.essential.gui.friends.message.v2;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.time.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a
                                                    \u0002*\u0004\u0018\u00010\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "Ljava/time/ZonedDateTime;", "kotlin.jvm.PlatformType", "it", "Lgg/essential/gui/friends/message/v2/ClientMessage;", "invoke" })
static final class ReplyableMessageScreen$messageDates$1 extends Lambda implements Function1<ClientMessage, ZonedDateTime> {
    public static final ReplyableMessageScreen$messageDates$1 INSTANCE;
    
    ReplyableMessageScreen$messageDates$1() {
        super(1);
    }
    
    public final ZonedDateTime invoke(@NotNull final ClientMessage it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        final ZoneId systemDefault = ZoneId.systemDefault();
        return it.getSendTime().atZone(systemDefault).toLocalDate().atStartOfDay(systemDefault);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((ClientMessage)p1);
    }
    
    static {
        ReplyableMessageScreen$messageDates$1.INSTANCE = new ReplyableMessageScreen$messageDates$1();
    }
}