package gg.essential.gui.friends.message.v2;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.state.*;
import java.util.*;
import java.time.*;
import com.sparkuniverse.toolbox.chat.enums.*;
import kotlin.jvm.internal.*;
import gg.essential.util.*;
import java.util.concurrent.*;
import gg.essential.elementa.*;
import gg.essential.elementa.utils.*;
import gg.essential.elementa.events.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000P
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H&J\b\u0010"\u001a\u00020\u001fH&J\b\u0010#\u001a\u00020\u001fH&J\u0018\u0010$\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020!H&J\u0006\u0010(\u001a\u00020\fJ\b\u0010)\u001a\u00020\u001fH&R\u0016\u0010\u0005\u001a\u00070\u0006¢\u0006\u0002\b\u0007¢\u0006\b
                                                   \u0000\u001a\u0004\b\b\u0010	R\u0017\u0010
                                                   \u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b
                                                   \u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\f¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001d\u0010\u000e¨\u0006*""" }, d2 = { "Lgg/essential/gui/friends/message/v2/MessageWrapper;", "Lgg/essential/gui/friends/message/v2/MessengerElement;", "message", "Lgg/essential/gui/friends/message/v2/ClientMessage;", "(Lgg/essential/gui/friends/message/v2/ClientMessage;)V", "channelType", "Lcom/sparkuniverse/toolbox/chat/enums/ChannelType;", "Lorg/jetbrains/annotations/NotNull;", "getChannelType", "()Lcom/sparkuniverse/toolbox/chat/enums/ChannelType;", "dropdownOpen", "Lgg/essential/elementa/state/BasicState;", "", "getDropdownOpen", "()Lgg/essential/elementa/state/BasicState;", "getMessage", "()Lgg/essential/gui/friends/message/v2/ClientMessage;", "sendTime", "Ljava/time/Instant;", "getSendTime", "()Ljava/time/Instant;", "sender", "Ljava/util/UUID;", "getSender", "()Ljava/util/UUID;", "sentByClient", "getSentByClient", "()Z", "showTimestamp", "getShowTimestamp", "addComponent", "", "line", "Lgg/essential/gui/friends/message/v2/MessageLine;", "delete", "flashHighlight", "openOptionMenu", "event", "Lgg/essential/elementa/events/UIClickEvent;", "component", "previousSiblingIsSameSenderWithinAMinute", "retrySend", "essential" })
public abstract class MessageWrapper extends MessengerElement
{
    @NotNull
    private final ClientMessage message;
    @NotNull
    private final BasicState<Boolean> showTimestamp;
    @NotNull
    private final BasicState<Boolean> dropdownOpen;
    @NotNull
    private final UUID sender;
    private final boolean sentByClient;
    @NotNull
    private final Instant sendTime;
    @NotNull
    private final ChannelType channelType;
    
    public MessageWrapper(@NotNull final ClientMessage message) {
        Intrinsics.checkNotNullParameter((Object)message, "message");
        super((byte)0);
        this.message = message;
        this.showTimestamp = new BasicState<Boolean>(true);
        this.dropdownOpen = new BasicState<Boolean>(false);
        this.sender = this.message.getSender();
        this.sentByClient = Intrinsics.areEqual((Object)this.sender, (Object)UUIDUtil.getClientUUID());
        this.sendTime = this.message.getSendTime();
        final ChannelType type = this.message.getChannel().getType();
        Intrinsics.checkNotNullExpressionValue((Object)type, "message.channel.type");
        this.channelType = type;
    }
    
    @NotNull
    public final ClientMessage getMessage() {
        return this.message;
    }
    
    @NotNull
    public final BasicState<Boolean> getShowTimestamp() {
        return this.showTimestamp;
    }
    
    @NotNull
    public final BasicState<Boolean> getDropdownOpen() {
        return this.dropdownOpen;
    }
    
    @NotNull
    public final UUID getSender() {
        return this.sender;
    }
    
    public final boolean getSentByClient() {
        return this.sentByClient;
    }
    
    @NotNull
    public final Instant getSendTime() {
        return this.sendTime;
    }
    
    @NotNull
    public final ChannelType getChannelType() {
        return this.channelType;
    }
    
    public final boolean previousSiblingIsSameSenderWithinAMinute() {
        final ObservableList siblings = this.getParent().getChildren();
        final long minute = TimeUnit.MINUTES.toMillis(1L);
        final int indexInParent = siblings.indexOf(this) - 1;
        if (0 <= indexInParent && indexInParent < siblings.size()) {
            final UIComponent comp = siblings.get(indexInParent);
            return comp instanceof MessageWrapper && Intrinsics.areEqual((Object)((MessageWrapper)comp).message.getSender(), (Object)this.message.getSender()) && this.message.getSendTime().toEpochMilli() - ((MessageWrapper)comp).message.getSendTime().toEpochMilli() <= minute;
        }
        return false;
    }
    
    public abstract void openOptionMenu(@NotNull final UIClickEvent p0, @NotNull final MessageLine p1);
    
    public abstract void flashHighlight();
    
    public abstract void retrySend();
}
