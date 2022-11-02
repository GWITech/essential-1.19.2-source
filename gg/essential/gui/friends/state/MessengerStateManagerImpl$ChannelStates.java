package gg.essential.gui.friends.state;

import kotlin.*;
import gg.essential.elementa.state.*;
import com.sparkuniverse.toolbox.chat.model.*;
import gg.essential.elementa.utils.*;
import java.util.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0018\b\u0082\b\u0018\u00002\u00020\u0001BM\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\u000e\u0010	\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010
                                                   0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0003J\u0011\u0010\u001e\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010
                                                   0\u0003H\u00c6\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u00c6\u0003J[\u0010 \u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u0010\b\u0002\u0010	\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010
                                                   0\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u00c6\u0001J\u0013\u0010!\u001a\u00020\u00062\b\u0010"\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010#\u001a\u00020\u0004H\u00d6\u0001J	\u0010$\u001a\u00020\bH\u00d6\u0001R\u0019\u0010	\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010
                                                   0\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0013\u0010\u0010R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0014\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0016\u0010\u0017"\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001a\u0010\u0010¨\u0006%""" }, d2 = { "Lgg/essential/gui/friends/state/MessengerStateManagerImpl$ChannelStates;", "", "numUnreadMessages", "Lgg/essential/elementa/state/State;", "", "mutedState", "", "title", "", "latestMessage", "Lcom/sparkuniverse/toolbox/chat/model/Message;", "members", "Lgg/essential/elementa/utils/ObservableList;", "Ljava/util/UUID;", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/utils/ObservableList;)V", "getLatestMessage", "()Lgg/essential/elementa/state/State;", "getMembers", "()Lgg/essential/elementa/utils/ObservableList;", "getMutedState", "getNumUnreadMessages", "propagateUpdatesToInfra", "getPropagateUpdatesToInfra", "()Z", "setPropagateUpdatesToInfra", "(Z)V", "getTitle", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "essential" })
private static final class ChannelStates
{
    @NotNull
    private final State<Integer> numUnreadMessages;
    @NotNull
    private final State<Boolean> mutedState;
    @NotNull
    private final State<String> title;
    @NotNull
    private final State<Message> latestMessage;
    @NotNull
    private final ObservableList<UUID> members;
    private boolean propagateUpdatesToInfra;
    
    public ChannelStates(@NotNull final State<Integer> numUnreadMessages, @NotNull final State<Boolean> mutedState, @NotNull final State<String> title, @NotNull final State<Message> latestMessage, @NotNull final ObservableList<UUID> members) {
        Intrinsics.checkNotNullParameter((Object)numUnreadMessages, "numUnreadMessages");
        Intrinsics.checkNotNullParameter((Object)mutedState, "mutedState");
        Intrinsics.checkNotNullParameter((Object)title, "title");
        Intrinsics.checkNotNullParameter((Object)latestMessage, "latestMessage");
        Intrinsics.checkNotNullParameter((Object)members, "members");
        super();
        this.numUnreadMessages = numUnreadMessages;
        this.mutedState = mutedState;
        this.title = title;
        this.latestMessage = latestMessage;
        this.members = members;
        this.propagateUpdatesToInfra = true;
    }
    
    @NotNull
    public final State<Integer> getNumUnreadMessages() {
        return this.numUnreadMessages;
    }
    
    @NotNull
    public final State<Boolean> getMutedState() {
        return this.mutedState;
    }
    
    @NotNull
    public final State<String> getTitle() {
        return this.title;
    }
    
    @NotNull
    public final State<Message> getLatestMessage() {
        return this.latestMessage;
    }
    
    @NotNull
    public final ObservableList<UUID> getMembers() {
        return this.members;
    }
    
    public final boolean getPropagateUpdatesToInfra() {
        return this.propagateUpdatesToInfra;
    }
    
    public final void setPropagateUpdatesToInfra(final boolean <set-?>) {
        this.propagateUpdatesToInfra = <set-?>;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "ChannelStates(numUnreadMessages=" + this.numUnreadMessages + ", mutedState=" + this.mutedState + ", title=" + this.title + ", latestMessage=" + this.latestMessage + ", members=" + this.members;
    }
    
    @Override
    public int hashCode() {
        int result = this.numUnreadMessages.hashCode();
        result = result * 31 + this.mutedState.hashCode();
        result = result * 31 + this.title.hashCode();
        result = result * 31 + this.latestMessage.hashCode();
        result = result * 31 + this.members.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChannelStates)) {
            return false;
        }
        final ChannelStates channelStates = (ChannelStates)other;
        return Intrinsics.areEqual((Object)this.numUnreadMessages, (Object)channelStates.numUnreadMessages) && Intrinsics.areEqual((Object)this.mutedState, (Object)channelStates.mutedState) && Intrinsics.areEqual((Object)this.title, (Object)channelStates.title) && Intrinsics.areEqual((Object)this.latestMessage, (Object)channelStates.latestMessage) && Intrinsics.areEqual((Object)this.members, (Object)channelStates.members);
    }
}
