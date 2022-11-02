package gg.essential.gui.friends.message.v2;

import kotlin.*;
import java.time.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005""" }, d2 = { "Lgg/essential/gui/friends/message/v2/DateDivider;", "Lgg/essential/gui/friends/message/v2/Divider;", "timeStamp", "Ljava/time/Instant;", "(Ljava/time/Instant;)V", "essential" })
public abstract class DateDivider extends Divider
{
    public DateDivider(@NotNull final Instant timeStamp) {
        Intrinsics.checkNotNullParameter((Object)timeStamp, "timeStamp");
        super(timeStamp, (byte)0);
    }
}
