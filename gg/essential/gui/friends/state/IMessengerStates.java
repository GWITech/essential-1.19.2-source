package gg.essential.gui.friends.state;

import gg.essential.gui.common.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.utils.*;
import com.sparkuniverse.toolbox.chat.model.*;
import java.util.*;
import java.util.concurrent.*;
import kotlin.*;
import kotlin.jvm.functions.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000d
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010	
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b	\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J$\u0010	\u001a\b\u0012\u0004\u0012\u00020\u000b0
                                                   2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\f\u001a\u00020\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0018\u0010\u0011\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00122\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\u00122\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0019H&J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\b0\u00192\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u00192\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u00122\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010 \u001a\u00020\u00032\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030"H&J\u0016\u0010#\u001a\u00020\u00032\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030$H&J\u0018\u0010%\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\bH&J)\u0010'\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00172
                                                   \b\u0002\u0010)\u001a\u0004\u0018\u00010\u0005H&¢\u0006\u0002\u0010*J\u0018\u0010+\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010,\u001a\u00020\rH&\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006-\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/gui/friends/state/IMessengerStates;", "", "addMembers", "", "channelId", "", "members", "", "Ljava/util/UUID;", "createGroup", "Ljava/util/concurrent/CompletableFuture;", "Lcom/sparkuniverse/toolbox/chat/model/Channel;", "groupName", "", "deleteMessage", "message", "Lcom/sparkuniverse/toolbox/chat/model/Message;", "getLatestMessage", "Lgg/essential/gui/common/ReadOnlyState;", "getMuted", "Lgg/essential/elementa/state/State;", "", "getNumUnread", "", "getObservableChannelList", "Lgg/essential/elementa/utils/ObservableList;", "getObservableMemberList", "getObservableMessageList", "getTitle", "getUnreadChannelState", "getUnreadMessageState", "leaveGroup", "onMessageReadChange", "callback", "Lkotlin/Function1;", "registerResetListener", "Lkotlin/Function0;", "removeUser", "user", "requestMoreMessages", "messageLimit", "beforeId", "(JILjava/lang/Long;)Z", "setTitle", "title", "essential" })
public interface IMessengerStates
{
    @NotNull
    ReadOnlyState<Integer> getNumUnread(final long p0);
    
    @NotNull
    ReadOnlyState<Boolean> getUnreadChannelState(final long p0);
    
    @NotNull
    State<Boolean> getUnreadMessageState(@NotNull final Message p0);
    
    @NotNull
    ReadOnlyState<String> getTitle(final long p0);
    
    @NotNull
    State<Boolean> getMuted(final long p0);
    
    @NotNull
    ReadOnlyState<Message> getLatestMessage(final long p0);
    
    @NotNull
    ObservableList<Message> getObservableMessageList(final long p0);
    
    @NotNull
    ObservableList<UUID> getObservableMemberList(final long p0);
    
    @NotNull
    ObservableList<Channel> getObservableChannelList();
    
    void setTitle(final long p0, @NotNull final String p1);
    
    void deleteMessage(@NotNull final Message p0);
    
    void leaveGroup(final long p0);
    
    void removeUser(final long p0, @NotNull final UUID p1);
    
    @NotNull
    CompletableFuture<Channel> createGroup(@NotNull final Set<UUID> p0, @NotNull final String p1);
    
    void addMembers(final long p0, @NotNull final Set<UUID> p1);
    
    void onMessageReadChange(@NotNull final Function1<? super Message, Unit> p0);
    
    void registerResetListener(@NotNull final Function0<Unit> p0);
}
