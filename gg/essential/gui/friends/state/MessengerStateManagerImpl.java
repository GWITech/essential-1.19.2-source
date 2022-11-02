package gg.essential.gui.friends.state;

import gg.essential.network.connectionmanager.chat.*;
import gg.essential.elementa.utils.*;
import com.sparkuniverse.toolbox.chat.model.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import gg.essential.gui.common.*;
import java.util.function.*;
import gg.essential.elementa.state.*;
import com.sparkuniverse.toolbox.chat.enums.*;
import java.util.concurrent.*;
import gg.essential.util.*;
import java.util.*;
import org.jetbrains.annotations.*;
import gg.essential.network.connectionmanager.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0088\u0001
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010%
                                                   \u0002\u0010	
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010!
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010#
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010"
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u001e
                                                   \u0002\b!\u0018\u00002\u00020\u00012\u00020\u0002:\u0001PB\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001e\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010"\u001a\u00020\bH\u0002J\u0010\u0010#\u001a\u00020\u000e2\u0006\u0010"\u001a\u00020\u0016H\u0016J\u0010\u0010$\u001a\u00020\u000e2\u0006\u0010"\u001a\u00020\u0016H\u0016J\u0010\u0010%\u001a\u00020	2\u0006\u0010\u001c\u001a\u00020\bH\u0002J$\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00160'2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\rH\u0016J\u0010\u0010,\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\bH\u0002J\u0018\u0010-\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\r0.2\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0018\u0010/\u001a
                                                   \u0012\u0004\u0012\u00020\r\u0018\u0001002\u0006\u0010\u001c\u001a\u00020\bH\u0002J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020!0.2\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u000e\u00103\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0016J\u0016\u00104\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00152\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0016\u00105\u001a\b\u0012\u0004\u0012\u00020\r0\u00152\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0010\u00106\u001a\u00020	2\u0006\u0010\u001c\u001a\u00020\bH\u0002J\u0016\u00107\u001a\b\u0012\u0004\u0012\u00020)0.2\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0016\u00108\u001a\b\u0012\u0004\u0012\u00020\u00130.2\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010+\u001a\u00020\rH\u0016J\u0010\u0010:\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\bH\u0016J\u0010\u0010;\u001a\u00020\b2\u0006\u0010<\u001a\u00020\bH\u0002J\u0010\u0010=\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\rH\u0016J\u0018\u0010>\u001a\u00020\u000e2\u0006\u0010"\u001a\u00020\u00162\u0006\u0010+\u001a\u00020\rH\u0016J\u0010\u0010?\u001a\u00020\u000e2\u0006\u0010"\u001a\u00020\u0016H\u0016J\u001c\u0010@\u001a\u00020\u000e2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\fH\u0016J\u0016\u0010B\u001a\u00020\u000e2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001aH\u0016J\u0018\u0010C\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010D\u001a\u00020\u001fH\u0016J'\u0010E\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010F\u001a\u00020!2\b\u0010G\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0002\u0010HJ\b\u0010I\u001a\u00020\u000eH\u0016J\u0018\u0010J\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\b2\u0006\u0010K\u001a\u00020)H\u0016J\u0018\u0010L\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\r2\u0006\u0010M\u001a\u00020\u0013H\u0002J\u0018\u0010N\u001a\u00020\u000e2\u0006\u0010"\u001a\u00020\u00162\u0006\u0010O\u001a\u00020	H\u0002R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020	0\u0007X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000R \u0010
                                                   \u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f0\u000bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0010X\u0082\u0004¢\u0006\u0002
                                                   \u0000R \u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0007X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001c\u0010\u0014\u001a\u0010\u0012\f\u0012
                                                    \u0017*\u0004\u0018\u00010\u00160\u00160\u0015X\u0082\u0004¢\u0006\u0002
                                                   \u0000R \u0010\u0018\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\r0\u00150\u0007X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u0019\u001a\u000e\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\u000e0\u001a0\u000bX\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006Q""" }, d2 = { "Lgg/essential/gui/friends/state/MessengerStateManagerImpl;", "Lgg/essential/gui/friends/state/IMessengerManager;", "Lgg/essential/gui/friends/state/IMessengerStates;", "chatManager", "Lgg/essential/network/connectionmanager/chat/ChatManager;", "(Lgg/essential/network/connectionmanager/chat/ChatManager;)V", "channelStates", "", "", "Lgg/essential/gui/friends/state/MessengerStateManagerImpl$ChannelStates;", "messageReadCallbacks", "", "Lkotlin/Function1;", "Lcom/sparkuniverse/toolbox/chat/model/Message;", "", "messageRequests", "", "messageUnreadMap", "Lgg/essential/elementa/state/State;", "", "observableChannelList", "Lgg/essential/elementa/utils/ObservableList;", "Lcom/sparkuniverse/toolbox/chat/model/Channel;", "kotlin.jvm.PlatformType", "observableMessageList", "resetCallbacks", "Lkotlin/Function0;", "addMembers", "channelId", "members", "", "Ljava/util/UUID;", "calculateNumUnread", "", "channel", "channelDeleted", "channelUpdated", "createChannelStates", "createGroup", "Ljava/util/concurrent/CompletableFuture;", "groupName", "", "deleteMessage", "message", "getChannel", "getLatestMessage", "Lgg/essential/gui/common/ReadOnlyState;", "getMessages", "", "getMuted", "getNumUnread", "getObservableChannelList", "getObservableMemberList", "getObservableMessageList", "getOrCreateChannelStates", "getTitle", "getUnreadChannelState", "getUnreadMessageState", "leaveGroup", "mergeAnnouncementChannel", "id", "messageDeleted", "messageReceived", "newChannel", "onMessageReadChange", "callback", "registerResetListener", "removeUser", "user", "requestMoreMessages", "messageLimit", "beforeId", "(JILjava/lang/Long;)Z", "reset", "setTitle", "title", "setUnreadState", "unread", "updateChannelStates", "states", "ChannelStates", "essential" })
public final class MessengerStateManagerImpl implements IMessengerManager, IMessengerStates
{
    @NotNull
    private final ChatManager chatManager;
    @NotNull
    private final Map<Long, ChannelStates> channelStates;
    @NotNull
    private final Map<Message, State<Boolean>> messageUnreadMap;
    @NotNull
    private final Map<Long, ObservableList<Message>> observableMessageList;
    @NotNull
    private final Set<Long> messageRequests;
    @NotNull
    private final ObservableList<Channel> observableChannelList;
    @NotNull
    private final List<Function1<Message, Unit>> messageReadCallbacks;
    @NotNull
    private final List<Function0<Unit>> resetCallbacks;
    
    public MessengerStateManagerImpl(@NotNull final ChatManager chatManager) {
        Intrinsics.checkNotNullParameter((Object)chatManager, "chatManager");
        super();
        this.chatManager = chatManager;
        this.channelStates = new LinkedHashMap<Long, ChannelStates>();
        this.messageUnreadMap = new LinkedHashMap<Message, State<Boolean>>();
        this.observableMessageList = new LinkedHashMap<Long, ObservableList<Message>>();
        this.messageRequests = new LinkedHashSet<Long>();
        this.observableChannelList = new ObservableList<Channel>(CollectionsKt.toMutableList((Collection)this.chatManager.getChannels().values()));
        this.messageReadCallbacks = new ArrayList<Function1<Message, Unit>>();
        this.resetCallbacks = new ArrayList<Function0<Unit>>();
        this.observableChannelList.removeIf(MessengerStateManagerImpl::_init_$lambda-0);
        ((StateCallbackManager<MessengerStateManagerImpl>)this.chatManager).registerStateManager(this);
    }
    
    @NotNull
    @Override
    public ReadOnlyState<Integer> getNumUnread(final long channelId) {
        return new ReadOnlyState<Integer>(this.getOrCreateChannelStates(channelId).getNumUnreadMessages());
    }
    
    @NotNull
    @Override
    public ReadOnlyState<Boolean> getUnreadChannelState(final long channelId) {
        return new ReadOnlyState<Boolean>((State<Boolean>)this.getNumUnread(channelId).map((kotlin.jvm.functions.Function1<? super Object, ?>)MessengerStateManagerImpl$getUnreadChannelState.MessengerStateManagerImpl$getUnreadChannelState$1.INSTANCE));
    }
    
    @NotNull
    @Override
    public State<Boolean> getMuted(final long channelId) {
        return this.getOrCreateChannelStates(channelId).getMutedState();
    }
    
    @NotNull
    @Override
    public ReadOnlyState<Message> getLatestMessage(final long channelId) {
        return new ReadOnlyState<Message>(this.getOrCreateChannelStates(channelId).getLatestMessage());
    }
    
    @NotNull
    @Override
    public ObservableList<Message> getObservableMessageList(final long channelId) {
        final ObservableList<Message> computeIfAbsent = this.observableMessageList.computeIfAbsent(channelId, MessengerStateManagerImpl::getObservableMessageList$lambda-1);
        Intrinsics.checkNotNullExpressionValue((Object)computeIfAbsent, "observableMessageList.co\u2026utableListOf())\n        }");
        return computeIfAbsent;
    }
    
    @NotNull
    @Override
    public ObservableList<UUID> getObservableMemberList(final long channelId) {
        return this.getOrCreateChannelStates(channelId).getMembers();
    }
    
    @NotNull
    @Override
    public ObservableList<Channel> getObservableChannelList() {
        return this.observableChannelList;
    }
    
    @NotNull
    @Override
    public State<Boolean> getUnreadMessageState(@NotNull final Message message) {
        Intrinsics.checkNotNullParameter((Object)message, "message");
        final State<Boolean> computeIfAbsent = this.messageUnreadMap.computeIfAbsent(message, MessengerStateManagerImpl::getUnreadMessageState$lambda-3);
        Intrinsics.checkNotNullExpressionValue((Object)computeIfAbsent, """
                                                                        messageUnreadMap.compute\u2026}
                                                                                    }
                                                                                }""");
        return computeIfAbsent;
    }
    
    @NotNull
    @Override
    public ReadOnlyState<String> getTitle(final long channelId) {
        return new ReadOnlyState<String>(this.getOrCreateChannelStates(channelId).getTitle());
    }
    
    private final ChannelStates getOrCreateChannelStates(final long channelId) {
        final ChannelStates computeIfAbsent = this.channelStates.computeIfAbsent(channelId, MessengerStateManagerImpl::getOrCreateChannelStates$lambda-4);
        Intrinsics.checkNotNullExpressionValue((Object)computeIfAbsent, "channelStates.computeIfA\u2026annelStates(it)\n        }");
        return computeIfAbsent;
    }
    
    private final Channel getChannel(final long channelId) {
        final Channel orElseThrow = this.chatManager.getChannel(channelId).orElseThrow((Supplier<? extends Throwable>)MessengerStateManagerImpl::getChannel$lambda-5);
        Intrinsics.checkNotNullExpressionValue((Object)orElseThrow, "chatManager.getChannel(c\u2026lId not found\")\n        }");
        return orElseThrow;
    }
    
    private final ChannelStates createChannelStates(final long channelId) {
        final Channel channel = this.getChannel(channelId);
        final State numUnreadMessages = new BasicState(0);
        final State mutedState = new BasicState(channel.isMuted());
        final State title = new BasicState("Loading...");
        final State latestMessage = new BasicState(null);
        final Set members = channel.getMembers();
        Intrinsics.checkNotNullExpressionValue((Object)members, "channel.members");
        final ChannelStates $this$createChannelStates_u24lambda_u2d6;
        final ChannelStates channelStates = $this$createChannelStates_u24lambda_u2d6 = new ChannelStates(numUnreadMessages, mutedState, title, latestMessage, new ObservableList<UUID>(CollectionsKt.toMutableList((Collection)members)));
        this.updateChannelStates(channel, $this$createChannelStates_u24lambda_u2d6);
        $this$createChannelStates_u24lambda_u2d6.getMutedState().onSetValue((kotlin.jvm.functions.Function1<? super Boolean, Unit>)new MessengerStateManagerImpl$createChannelStates$1.MessengerStateManagerImpl$createChannelStates$1$1($this$createChannelStates_u24lambda_u2d6, this, channel));
        return channelStates;
    }
    
    private final void updateChannelStates(final Channel channel, final ChannelStates states) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: astore_3       
        //     2: aload_3        
        //     3: astore          $this$updateChannelStates_u24lambda_u2d9
        //     5: aload           $this$updateChannelStates_u24lambda_u2d9
        //     7: invokevirtual   gg/essential/gui/friends/state/MessengerStateManagerImpl$ChannelStates.getNumUnreadMessages:()Lgg/essential/elementa/state/State;
        //    10: aload_0         /* this */
        //    11: aload_1         /* channel */
        //    12: invokevirtual   com/sparkuniverse/toolbox/chat/model/Channel.getId:()J
        //    15: invokespecial   gg/essential/gui/friends/state/MessengerStateManagerImpl.calculateNumUnread:(J)I
        //    18: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    21: invokevirtual   gg/essential/elementa/state/State.set:(Ljava/lang/Object;)V
        //    24: aload           $this$updateChannelStates_u24lambda_u2d9
        //    26: iconst_0       
        //    27: invokevirtual   gg/essential/gui/friends/state/MessengerStateManagerImpl$ChannelStates.setPropagateUpdatesToInfra:(Z)V
        //    30: aload           $this$updateChannelStates_u24lambda_u2d9
        //    32: invokevirtual   gg/essential/gui/friends/state/MessengerStateManagerImpl$ChannelStates.getMutedState:()Lgg/essential/elementa/state/State;
        //    35: aload_1         /* channel */
        //    36: invokevirtual   com/sparkuniverse/toolbox/chat/model/Channel.isMuted:()Z
        //    39: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    42: invokevirtual   gg/essential/elementa/state/State.set:(Ljava/lang/Object;)V
        //    45: aload           $this$updateChannelStates_u24lambda_u2d9
        //    47: iconst_1       
        //    48: invokevirtual   gg/essential/gui/friends/state/MessengerStateManagerImpl$ChannelStates.setPropagateUpdatesToInfra:(Z)V
        //    51: aload_1         /* channel */
        //    52: invokestatic    gg/essential/util/ExtensionsKt.isAnnouncement:(Lcom/sparkuniverse/toolbox/chat/model/Channel;)Z
        //    55: ifeq            71
        //    58: aload_2         /* states */
        //    59: invokevirtual   gg/essential/gui/friends/state/MessengerStateManagerImpl$ChannelStates.getTitle:()Lgg/essential/elementa/state/State;
        //    62: ldc_w           "Announcements"
        //    65: invokevirtual   gg/essential/elementa/state/State.set:(Ljava/lang/Object;)V
        //    68: goto            125
        //    71: aload_1         /* channel */
        //    72: invokevirtual   com/sparkuniverse/toolbox/chat/model/Channel.getType:()Lcom/sparkuniverse/toolbox/chat/enums/ChannelType;
        //    75: getstatic       com/sparkuniverse/toolbox/chat/enums/ChannelType.GROUP_DIRECT_MESSAGE:Lcom/sparkuniverse/toolbox/chat/enums/ChannelType;
        //    78: if_acmpne       102
        //    81: aload_2         /* states */
        //    82: invokevirtual   gg/essential/gui/friends/state/MessengerStateManagerImpl$ChannelStates.getTitle:()Lgg/essential/elementa/state/State;
        //    85: aload_1         /* channel */
        //    86: invokevirtual   com/sparkuniverse/toolbox/chat/model/Channel.getName:()Ljava/lang/String;
        //    89: dup            
        //    90: ldc_w           "channel.name"
        //    93: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    96: invokevirtual   gg/essential/elementa/state/State.set:(Ljava/lang/Object;)V
        //    99: goto            125
        //   102: aload_1         /* channel */
        //   103: invokestatic    gg/essential/util/ExtensionsKt.getOtherUser:(Lcom/sparkuniverse/toolbox/chat/model/Channel;)Ljava/util/UUID;
        //   106: invokestatic    gg/essential/util/UUIDUtil.getName:(Ljava/util/UUID;)Ljava/util/concurrent/CompletableFuture;
        //   109: aload_2         /* states */
        //   110: invokedynamic   BootstrapMethod #5, accept:(Lgg/essential/gui/friends/state/MessengerStateManagerImpl$ChannelStates;)Ljava/util/function/Consumer;
        //   115: invokestatic    gg/essential/universal/UMinecraft.getMinecraft:()Lnet/minecraft/client/MinecraftClient;
        //   118: invokestatic    gg/essential/util/ExtensionsKt.getExecutor:(Lnet/minecraft/client/MinecraftClient;)Ljava/util/concurrent/Executor;
        //   121: invokevirtual   java/util/concurrent/CompletableFuture.thenAcceptAsync:(Ljava/util/function/Consumer;Ljava/util/concurrent/Executor;)Ljava/util/concurrent/CompletableFuture;
        //   124: pop            
        //   125: aload_2         /* states */
        //   126: invokevirtual   gg/essential/gui/friends/state/MessengerStateManagerImpl$ChannelStates.getLatestMessage:()Lgg/essential/elementa/state/State;
        //   129: aload_0         /* this */
        //   130: aload_1         /* channel */
        //   131: invokevirtual   com/sparkuniverse/toolbox/chat/model/Channel.getId:()J
        //   134: invokespecial   gg/essential/gui/friends/state/MessengerStateManagerImpl.getMessages:(J)Ljava/util/Collection;
        //   137: dup            
        //   138: ifnull          269
        //   141: checkcast       Ljava/lang/Iterable;
        //   144: astore          5
        //   146: astore          6
        //   148: aload           $this$maxByOrNull$iv
        //   150: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   155: astore          iterator$iv
        //   157: aload           iterator$iv
        //   159: invokeinterface java/util/Iterator.hasNext:()Z
        //   164: ifne            171
        //   167: aconst_null    
        //   168: goto            260
        //   171: aload           iterator$iv
        //   173: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   178: astore          maxElem$iv
        //   180: aload           iterator$iv
        //   182: invokeinterface java/util/Iterator.hasNext:()Z
        //   187: ifne            195
        //   190: aload           maxElem$iv
        //   192: goto            260
        //   195: aload           maxElem$iv
        //   197: checkcast       Lcom/sparkuniverse/toolbox/chat/model/Message;
        //   200: astore          it
        //   202: aload           it
        //   204: invokevirtual   com/sparkuniverse/toolbox/chat/model/Message.getId:()J
        //   207: lstore          maxValue$iv
        //   209: aload           iterator$iv
        //   211: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   216: astore          e$iv
        //   218: aload           e$iv
        //   220: checkcast       Lcom/sparkuniverse/toolbox/chat/model/Message;
        //   223: astore          it
        //   225: aload           it
        //   227: invokevirtual   com/sparkuniverse/toolbox/chat/model/Message.getId:()J
        //   230: lstore          v$iv
        //   232: lload           maxValue$iv
        //   234: lload           v$iv
        //   236: lcmp           
        //   237: ifge            248
        //   240: aload           e$iv
        //   242: astore          maxElem$iv
        //   244: lload           v$iv
        //   246: lstore          maxValue$iv
        //   248: aload           iterator$iv
        //   250: invokeinterface java/util/Iterator.hasNext:()Z
        //   255: ifne            209
        //   258: aload           maxElem$iv
        //   260: aload           6
        //   262: swap           
        //   263: checkcast       Lcom/sparkuniverse/toolbox/chat/model/Message;
        //   266: goto            271
        //   269: pop            
        //   270: aconst_null    
        //   271: invokevirtual   gg/essential/elementa/state/State.set:(Ljava/lang/Object;)V
        //   274: aload_2         /* states */
        //   275: invokevirtual   gg/essential/gui/friends/state/MessengerStateManagerImpl$ChannelStates.getMembers:()Lgg/essential/elementa/utils/ObservableList;
        //   278: aload_2         /* states */
        //   279: invokevirtual   gg/essential/gui/friends/state/MessengerStateManagerImpl$ChannelStates.getMembers:()Lgg/essential/elementa/utils/ObservableList;
        //   282: checkcast       Ljava/lang/Iterable;
        //   285: aload_1         /* channel */
        //   286: invokevirtual   com/sparkuniverse/toolbox/chat/model/Channel.getMembers:()Ljava/util/Set;
        //   289: dup            
        //   290: ldc_w           "channel.members"
        //   293: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   296: checkcast       Ljava/lang/Iterable;
        //   299: invokestatic    kotlin/collections/CollectionsKt.minus:(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;
        //   302: checkcast       Ljava/util/Collection;
        //   305: invokevirtual   gg/essential/elementa/utils/ObservableList.removeAll:(Ljava/util/Collection;)Z
        //   308: pop            
        //   309: aload_2         /* states */
        //   310: invokevirtual   gg/essential/gui/friends/state/MessengerStateManagerImpl$ChannelStates.getMembers:()Lgg/essential/elementa/utils/ObservableList;
        //   313: aload_1         /* channel */
        //   314: invokevirtual   com/sparkuniverse/toolbox/chat/model/Channel.getMembers:()Ljava/util/Set;
        //   317: dup            
        //   318: ldc_w           "channel.members"
        //   321: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   324: aload_2         /* states */
        //   325: invokevirtual   gg/essential/gui/friends/state/MessengerStateManagerImpl$ChannelStates.getMembers:()Lgg/essential/elementa/utils/ObservableList;
        //   328: checkcast       Ljava/lang/Iterable;
        //   331: invokestatic    kotlin/collections/SetsKt.minus:(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;
        //   334: checkcast       Ljava/util/Collection;
        //   337: invokevirtual   gg/essential/elementa/utils/ObservableList.addAll:(Ljava/util/Collection;)Z
        //   340: pop            
        //   341: return         
        //    MethodParameters:
        //  Name     Flags  
        //  -------  -----
        //  channel  
        //  states   
        //    StackMapTable: 00 0A FD 00 47 07 00 65 07 00 65 1E 16 FE 00 2D 07 01 C8 07 00 EA 07 01 CE FC 00 17 07 00 04 FC 00 0D 04 FD 00 26 07 00 04 04 FF 00 0B 00 08 07 00 02 07 01 4E 07 00 65 07 00 65 07 00 65 07 01 C8 07 00 EA 07 01 CE 00 01 07 00 04 FF 00 08 00 05 07 00 02 07 01 4E 07 00 65 07 00 65 07 00 65 00 02 07 00 EA 07 01 6B FF 00 01 00 05 07 00 02 07 01 4E 07 00 65 07 00 65 07 00 65 00 02 07 00 EA 07 01 D6
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final Collection<Message> getMessages(final long channelId) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/gui/friends/state/MessengerStateManagerImpl.chatManager:Lgg/essential/network/connectionmanager/chat/ChatManager;
        //     4: invokevirtual   gg/essential/network/connectionmanager/chat/ChatManager.getAnnouncementChannelIds:()Ljava/util/Set;
        //     7: lload_1         /* channelId */
        //     8: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    11: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //    16: ifeq            208
        //    19: aload_0         /* this */
        //    20: getfield        gg/essential/gui/friends/state/MessengerStateManagerImpl.chatManager:Lgg/essential/network/connectionmanager/chat/ChatManager;
        //    23: invokevirtual   gg/essential/network/connectionmanager/chat/ChatManager.getAnnouncementChannelIds:()Ljava/util/Set;
        //    26: dup            
        //    27: ldc_w           "chatManager.announcementChannelIds"
        //    30: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    33: checkcast       Ljava/lang/Iterable;
        //    36: astore_3        /* $this$mapNotNull$iv */
        //    37: aload_3         /* $this$mapNotNull$iv */
        //    38: astore          5
        //    40: new             Ljava/util/ArrayList;
        //    43: dup            
        //    44: invokespecial   java/util/ArrayList.<init>:()V
        //    47: checkcast       Ljava/util/Collection;
        //    50: astore          destination$iv$iv
        //    52: aload           $this$mapNotNullTo$iv$iv
        //    54: astore          $this$forEach$iv$iv$iv
        //    56: aload           $this$forEach$iv$iv$iv
        //    58: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    63: astore          8
        //    65: aload           8
        //    67: invokeinterface java/util/Iterator.hasNext:()Z
        //    72: ifeq            152
        //    75: aload           8
        //    77: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    82: astore          element$iv$iv$iv
        //    84: aload           element$iv$iv$iv
        //    86: astore          element$iv$iv
        //    88: aload           element$iv$iv
        //    90: checkcast       Ljava/lang/Long;
        //    93: astore          it
        //    95: aload_0         /* this */
        //    96: getfield        gg/essential/gui/friends/state/MessengerStateManagerImpl.chatManager:Lgg/essential/network/connectionmanager/chat/ChatManager;
        //    99: aload           it
        //   101: ldc_w           "it"
        //   104: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   107: aload           it
        //   109: invokevirtual   java/lang/Long.longValue:()J
        //   112: invokevirtual   gg/essential/network/connectionmanager/chat/ChatManager.getMessages:(J)Ljava/util/Map;
        //   115: dup            
        //   116: ifnull          127
        //   119: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //   124: goto            129
        //   127: pop            
        //   128: aconst_null    
        //   129: dup            
        //   130: ifnull          148
        //   133: astore          it$iv$iv
        //   135: aload           destination$iv$iv
        //   137: aload           it$iv$iv
        //   139: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   144: pop            
        //   145: goto            65
        //   148: pop            
        //   149: goto            65
        //   152: aload           destination$iv$iv
        //   154: checkcast       Ljava/util/List;
        //   157: astore_3        /* $this$mapNotNull$iv */
        //   158: aload_3        
        //   159: astore          it
        //   161: aload           it
        //   163: checkcast       Ljava/util/Collection;
        //   166: invokeinterface java/util/Collection.isEmpty:()Z
        //   171: ifne            178
        //   174: iconst_1       
        //   175: goto            179
        //   178: iconst_0       
        //   179: ifeq            186
        //   182: aload_3        
        //   183: goto            187
        //   186: aconst_null    
        //   187: dup            
        //   188: ifnull          200
        //   191: checkcast       Ljava/lang/Iterable;
        //   194: invokestatic    kotlin/collections/CollectionsKt.flatten:(Ljava/lang/Iterable;)Ljava/util/List;
        //   197: goto            202
        //   200: pop            
        //   201: aconst_null    
        //   202: checkcast       Ljava/util/Collection;
        //   205: goto            230
        //   208: aload_0         /* this */
        //   209: getfield        gg/essential/gui/friends/state/MessengerStateManagerImpl.chatManager:Lgg/essential/network/connectionmanager/chat/ChatManager;
        //   212: lload_1         /* channelId */
        //   213: invokevirtual   gg/essential/network/connectionmanager/chat/ChatManager.getMessages:(J)Ljava/util/Map;
        //   216: dup            
        //   217: ifnull          228
        //   220: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //   225: goto            230
        //   228: pop            
        //   229: aconst_null    
        //   230: areturn        
        //    Signature:
        //  (J)Ljava/util/Collection<Lcom/sparkuniverse/toolbox/chat/model/Message;>;
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  channelId  
        //    StackMapTable: 00 0E FF 00 41 00 08 07 00 02 04 07 01 C8 00 07 01 C8 07 01 6B 07 01 C8 07 01 CE 00 00 FF 00 3D 00 0B 07 00 02 04 07 01 C8 00 07 01 C8 07 01 6B 07 01 C8 07 01 CE 07 00 04 07 00 04 07 00 F6 00 01 07 00 82 41 07 01 6B 52 07 01 6B F8 00 03 FF 00 19 00 08 07 00 02 04 07 00 AB 07 00 AB 07 01 C8 07 01 6B 07 01 C8 07 01 CE 00 00 40 01 06 40 07 00 AB 4C 07 00 AB 41 07 00 AB FF 00 05 00 02 07 00 02 04 00 00 53 07 00 82 41 07 01 6B
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final int calculateNumUnread(final long channel) {
        final Collection<Message> messages = this.getMessages(channel);
        int n;
        if (messages != null) {
            final Iterable $this$count$iv = messages;
            if (((Collection)$this$count$iv).isEmpty()) {
                n = 0;
            }
            else {
                int count$iv = 0;
                for (final Object element$iv : $this$count$iv) {
                    final Message it = (Message)element$iv;
                    if (!it.isRead() && ++count$iv < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
                n = count$iv;
            }
        }
        else {
            n = 0;
        }
        return n;
    }
    
    private final void setUnreadState(final Message message, final boolean unread) {
        final State state = this.messageUnreadMap.get(message);
        if (state != null) {
            state.set(unread);
        }
        this.chatManager.updateReadState(message, !unread);
        this.chatManager.getChannel(this.mergeAnnouncementChannel(message.getChannelId())).ifPresent(MessengerStateManagerImpl::setUnreadState$lambda-13);
        final Iterable $this$forEach$iv = this.messageReadCallbacks;
        for (final Object element$iv : $this$forEach$iv) {
            final Function1 it = (Function1)element$iv;
            it.invoke((Object)message);
        }
    }
    
    @Override
    public void setTitle(final long channelId, @NotNull final String title) {
        Intrinsics.checkNotNullParameter((Object)title, "title");
        final Channel channel = this.getChannel(channelId);
        if (Intrinsics.areEqual((Object)channel.getName(), (Object)title)) {
            return;
        }
        if (channel.getType() != ChannelType.GROUP_DIRECT_MESSAGE) {
            throw new IllegalStateException("Cannot set the title of a channel that is not a group direct message");
        }
        this.chatManager.updateChannelInformation(channelId, title, null);
    }
    
    @Override
    public void deleteMessage(@NotNull final Message message) {
        Intrinsics.checkNotNullParameter((Object)message, "message");
        this.chatManager.deleteMessage(message.getChannelId(), message.getId());
    }
    
    @Override
    public void leaveGroup(final long channelId) {
        this.chatManager.removePlayerFromChannel(channelId, UUIDUtil.getClientUUID());
    }
    
    @Override
    public void removeUser(final long channelId, @NotNull final UUID user) {
        Intrinsics.checkNotNullParameter((Object)user, "user");
        this.chatManager.removePlayerFromChannel(channelId, user);
    }
    
    @NotNull
    @Override
    public CompletableFuture<Channel> createGroup(@NotNull final Set<UUID> members, @NotNull final String groupName) {
        Intrinsics.checkNotNullParameter((Object)members, "members");
        Intrinsics.checkNotNullParameter((Object)groupName, "groupName");
        final CompletableFuture future = new CompletableFuture();
        final ChatManager chatManager = this.chatManager;
        final Collection thisCollection$iv;
        final Collection $this$toTypedArray$iv = thisCollection$iv = members;
        final UUID[] array = thisCollection$iv.toArray(new UUID[0]);
        Intrinsics.checkNotNull((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        chatManager.createGroupDM(array, groupName, MessengerStateManagerImpl::createGroup$lambda-15);
        return future;
    }
    
    @Override
    public void addMembers(final long channelId, @NotNull final Set<UUID> members) {
        Intrinsics.checkNotNullParameter((Object)members, "members");
        final ChatManager chatManager = this.chatManager;
        final Collection thisCollection$iv;
        final Collection $this$toTypedArray$iv = thisCollection$iv = members;
        final UUID[] array = thisCollection$iv.toArray(new UUID[0]);
        Intrinsics.checkNotNull((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        chatManager.addPlayersToChannel(channelId, array);
    }
    
    @Override
    public void onMessageReadChange(@NotNull final Function1<? super Message, Unit> callback) {
        Intrinsics.checkNotNullParameter((Object)callback, "callback");
        this.messageReadCallbacks.add((Function1<Message, Unit>)callback);
    }
    
    @Override
    public void messageDeleted(@NotNull final Message message) {
        Intrinsics.checkNotNullParameter((Object)message, "message");
        final long channelId = this.mergeAnnouncementChannel(message.getChannelId());
        final ObservableList list = this.observableMessageList.get(channelId);
        if (list != null) {
            list.remove(message);
        }
        this.messageUnreadMap.remove(message);
        final ChannelStates channelStates = this.channelStates.get(channelId);
        if (channelStates == null) {
            return;
        }
        final ChannelStates channelState = channelStates;
        this.updateChannelStates(this.getChannel(channelId), channelState);
    }
    
    private final long mergeAnnouncementChannel(final long id) {
        final Channel primaryAnnouncementChannel = this.chatManager.getPrimaryAnnouncementChannel();
        if (this.chatManager.getAnnouncementChannelIds().contains(id) && primaryAnnouncementChannel != null) {
            return primaryAnnouncementChannel.getId();
        }
        return id;
    }
    
    @Override
    public void messageReceived(@NotNull final Channel channel, @NotNull final Message message) {
        Intrinsics.checkNotNullParameter((Object)channel, "channel");
        Intrinsics.checkNotNullParameter((Object)message, "message");
        final Channel channel2 = this.getChannel(this.mergeAnnouncementChannel(channel.getId()));
        this.messageRequests.remove(channel2.getId());
        final ObservableList list = this.observableMessageList.get(channel2.getId());
        Label_0217: {
            if (list != null) {
                final ObservableList messageList = list;
                final List $this$indexOfFirst$iv = messageList;
                int index$iv = 0;
                while (true) {
                    for (final Object item$iv : $this$indexOfFirst$iv) {
                        final Message it = (Message)item$iv;
                        if (it.getId() == message.getId()) {
                            final int i = index$iv;
                            final Integer value = i;
                            int it2 = value.intValue();
                            final Integer n = (it2 != -1) ? value : null;
                            if (n != null) {
                                it2 = n.intValue();
                                messageList.remove(it2);
                            }
                            messageList.add(message);
                            break Label_0217;
                        }
                        ++index$iv;
                    }
                    final int i = -1;
                    continue;
                }
            }
        }
        final ChannelStates channelStates = this.channelStates.get(channel2.getId());
        if (channelStates == null) {
            return;
        }
        final ChannelStates states = channelStates;
        if (Intrinsics.areEqual((Object)message.getSender(), (Object)UUIDUtil.getClientUUID()) && !message.isRead()) {
            this.setUnreadState(message, false);
        }
        else {
            this.updateChannelStates(channel2, states);
        }
    }
    
    @Override
    public void channelUpdated(@NotNull final Channel channel) {
        Intrinsics.checkNotNullParameter((Object)channel, "channel");
        final Channel channel2 = this.getChannel(this.mergeAnnouncementChannel(channel.getId()));
        final ChannelStates channelStates = this.channelStates.get(channel2.getId());
        if (channelStates == null) {
            return;
        }
        final ChannelStates states = channelStates;
        this.updateChannelStates(channel2, states);
    }
    
    @Override
    public void newChannel(@NotNull final Channel channel) {
        Intrinsics.checkNotNullParameter((Object)channel, "channel");
        if (ExtensionsKt.isAnnouncement(channel) && channel.getId() != this.chatManager.getPrimaryAnnouncementChannelId()) {
            return;
        }
        final Iterable $this$none$iv = this.observableChannelList;
        boolean b = false;
        Label_0118: {
            if ($this$none$iv instanceof Collection && ((Collection)$this$none$iv).isEmpty()) {
                b = true;
            }
            else {
                for (final Object element$iv : $this$none$iv) {
                    final Channel it = (Channel)element$iv;
                    if (it.getId() == channel.getId()) {
                        b = false;
                        break Label_0118;
                    }
                }
                b = true;
            }
        }
        if (b) {
            this.observableChannelList.add(channel);
        }
    }
    
    @Override
    public void channelDeleted(@NotNull final Channel channel) {
        Intrinsics.checkNotNullParameter((Object)channel, "channel");
        this.observableChannelList.remove(channel);
    }
    
    @Override
    public void registerResetListener(@NotNull final Function0<Unit> callback) {
        Intrinsics.checkNotNullParameter((Object)callback, "callback");
        this.resetCallbacks.add(callback);
    }
    
    @Override
    public void reset() {
        Iterable $this$forEach$iv = this.resetCallbacks;
        for (final Object element$iv : $this$forEach$iv) {
            final Function0 it = (Function0)element$iv;
            it.invoke();
        }
        $this$forEach$iv = this.observableMessageList.values();
        for (final Object element$iv : $this$forEach$iv) {
            final ObservableList it2 = (ObservableList)element$iv;
            it2.clear();
        }
        this.observableMessageList.clear();
        this.messageUnreadMap.clear();
        this.messageRequests.clear();
        this.observableChannelList.clear();
        this.channelStates.clear();
    }
    
    private static final boolean _init_$lambda-0(final MessengerStateManagerImpl this$0, final Channel it) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue((Object)it, "it");
        return ExtensionsKt.isAnnouncement(it) && it.getId() != this$0.chatManager.getPrimaryAnnouncementChannelId();
    }
    
    private static final ObservableList getObservableMessageList$lambda-1(final MessengerStateManagerImpl this$0, final long $channelId, final Long it) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        final Collection<Message> messages = this$0.getMessages($channelId);
        List mutableList;
        if (messages == null || (mutableList = CollectionsKt.toMutableList((Collection)messages)) == null) {
            mutableList = new ArrayList();
        }
        return new ObservableList(mutableList);
    }
    
    private static final State getUnreadMessageState$lambda-3(final Message $message, final MessengerStateManagerImpl this$0, final Message it) {
        Intrinsics.checkNotNullParameter((Object)$message, "$message");
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        final BasicState $this$getUnreadMessageState_u24lambda_u2d3_u24lambda_u2d2 = new BasicState((T)!$message.isRead());
        $this$getUnreadMessageState_u24lambda_u2d3_u24lambda_u2d2.onSetValue((Function1)new MessengerStateManagerImpl$getUnreadMessageState$1$1.MessengerStateManagerImpl$getUnreadMessageState$1$1$1(this$0, $message));
        return $this$getUnreadMessageState_u24lambda_u2d3_u24lambda_u2d2;
    }
    
    private static final ChannelStates getOrCreateChannelStates$lambda-4(final MessengerStateManagerImpl this$0, final Long it) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return this$0.createChannelStates(it);
    }
    
    private static final IllegalStateException getChannel$lambda-5(final long $channelId) {
        return new IllegalStateException("Channel " + $channelId + " not found");
    }
    
    private static final void updateChannelStates$lambda-9$lambda-7(final ChannelStates $states, final String username) {
        Intrinsics.checkNotNullParameter((Object)$states, "$states");
        final State<String> title = $states.getTitle();
        Intrinsics.checkNotNullExpressionValue((Object)username, "username");
        title.set(username);
    }
    
    private static final void setUnreadState$lambda-13(final MessengerStateManagerImpl this$0, final Channel it) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        this$0.channelUpdated(it);
    }
    
    private static final void createGroup$lambda-15(final CompletableFuture $future, final Optional it) {
        Intrinsics.checkNotNullParameter((Object)$future, "$future");
        if (it.isPresent()) {
            $future.complete(it.get());
        }
        else {
            $future.completeExceptionally(new RuntimeException("Failed to create group"));
        }
    }
    
    public static final /* synthetic */ void access$setUnreadState(final MessengerStateManagerImpl $this, final Message message, final boolean unread) {
        $this.setUnreadState(message, unread);
    }
    
    public static final /* synthetic */ ChatManager access$getChatManager$p(final MessengerStateManagerImpl $this) {
        return $this.chatManager;
    }
    
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
}
