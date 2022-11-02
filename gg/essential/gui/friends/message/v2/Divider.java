package gg.essential.gui.friends.message.v2;

import kotlin.*;
import java.time.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001c
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\b6\u0018\u00002\u00020\u0001B\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\u0007\b¨\u0006	""" }, d2 = { "Lgg/essential/gui/friends/message/v2/Divider;", "Lgg/essential/gui/friends/message/v2/MessengerElement;", "timeStamp", "Ljava/time/Instant;", "(Ljava/time/Instant;)V", "getTimeStamp", "()Ljava/time/Instant;", "Lgg/essential/gui/friends/message/v2/UnreadDivider;", "Lgg/essential/gui/friends/message/v2/DateDivider;", "essential" })
public abstract class Divider extends MessengerElement
{
    @NotNull
    private final Instant timeStamp;
    
    private Divider(final Instant timeStamp) {
        super((byte)0);
        this.timeStamp = timeStamp;
    }
    
    @NotNull
    public final Instant getTimeStamp() {
        return this.timeStamp;
    }
    
    public Divider(final Instant timeStamp, final byte b) {
        this(timeStamp);
    }
}
