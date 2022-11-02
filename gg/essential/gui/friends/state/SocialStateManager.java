package gg.essential.gui.friends.state;

import org.jetbrains.annotations.*;
import gg.essential.network.connectionmanager.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.utils.*;
import java.util.*;
import kotlin.jvm.functions.*;
import gg.essential.util.*;
import java.util.concurrent.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000<
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010
                                                   R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017""" }, d2 = { "Lgg/essential/gui/friends/state/SocialStateManager;", "", "connectionManager", "Lgg/essential/network/connectionmanager/ConnectionManager;", "(Lgg/essential/network/connectionmanager/ConnectionManager;)V", "messageStateImpl", "Lgg/essential/gui/friends/state/MessengerStateManagerImpl;", "messengerStates", "Lgg/essential/gui/friends/state/IMessengerStates;", "getMessengerStates", "()Lgg/essential/gui/friends/state/IMessengerStates;", "relationshipStateImpl", "Lgg/essential/gui/friends/state/RelationshipStateManagerImpl;", "relationshipStates", "Lgg/essential/gui/friends/state/IRelationshipStates;", "getRelationshipStates", "()Lgg/essential/gui/friends/state/IRelationshipStates;", "statusStateManagerImpl", "Lgg/essential/gui/friends/state/StatusStateManagerImpl;", "statusStates", "Lgg/essential/gui/friends/state/IStatusStates;", "getStatusStates", "()Lgg/essential/gui/friends/state/IStatusStates;", "essential" })
public final class SocialStateManager
{
    @NotNull
    private final MessengerStateManagerImpl messageStateImpl;
    @NotNull
    private final RelationshipStateManagerImpl relationshipStateImpl;
    @NotNull
    private final StatusStateManagerImpl statusStateManagerImpl;
    @NotNull
    private final IMessengerStates messengerStates;
    @NotNull
    private final IRelationshipStates relationshipStates;
    @NotNull
    private final IStatusStates statusStates;
    
    public SocialStateManager(@NotNull final ConnectionManager connectionManager) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "connectionManager"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: invokespecial   java/lang/Object.<init>:()V
        //    10: aload_0         /* this */
        //    11: new             Lgg/essential/gui/friends/state/MessengerStateManagerImpl;
        //    14: dup            
        //    15: aload_1         /* connectionManager */
        //    16: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getChatManager:()Lgg/essential/network/connectionmanager/chat/ChatManager;
        //    19: dup            
        //    20: ldc             "connectionManager.chatManager"
        //    22: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    25: invokespecial   gg/essential/gui/friends/state/MessengerStateManagerImpl.<init>:(Lgg/essential/network/connectionmanager/chat/ChatManager;)V
        //    28: putfield        gg/essential/gui/friends/state/SocialStateManager.messageStateImpl:Lgg/essential/gui/friends/state/MessengerStateManagerImpl;
        //    31: aload_0         /* this */
        //    32: new             Lgg/essential/gui/friends/state/RelationshipStateManagerImpl;
        //    35: dup            
        //    36: aload_1         /* connectionManager */
        //    37: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getRelationshipManager:()Lgg/essential/network/connectionmanager/relationship/RelationshipManager;
        //    40: dup            
        //    41: ldc             "connectionManager.relationshipManager"
        //    43: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    46: invokespecial   gg/essential/gui/friends/state/RelationshipStateManagerImpl.<init>:(Lgg/essential/network/connectionmanager/relationship/RelationshipManager;)V
        //    49: putfield        gg/essential/gui/friends/state/SocialStateManager.relationshipStateImpl:Lgg/essential/gui/friends/state/RelationshipStateManagerImpl;
        //    52: aload_0         /* this */
        //    53: new             Lgg/essential/gui/friends/state/StatusStateManagerImpl;
        //    56: dup            
        //    57: aload_1         /* connectionManager */
        //    58: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getProfileManager:()Lgg/essential/network/connectionmanager/profile/ProfileManager;
        //    61: dup            
        //    62: ldc             "connectionManager.profileManager"
        //    64: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    67: aload_1         /* connectionManager */
        //    68: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.getSpsManager:()Lgg/essential/network/connectionmanager/sps/SPSManager;
        //    71: dup            
        //    72: ldc             "connectionManager.spsManager"
        //    74: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    77: invokespecial   gg/essential/gui/friends/state/StatusStateManagerImpl.<init>:(Lgg/essential/network/connectionmanager/profile/ProfileManager;Lgg/essential/network/connectionmanager/sps/SPSManager;)V
        //    80: putfield        gg/essential/gui/friends/state/SocialStateManager.statusStateManagerImpl:Lgg/essential/gui/friends/state/StatusStateManagerImpl;
        //    83: aload_0         /* this */
        //    84: aload_0         /* this */
        //    85: getfield        gg/essential/gui/friends/state/SocialStateManager.messageStateImpl:Lgg/essential/gui/friends/state/MessengerStateManagerImpl;
        //    88: checkcast       Lgg/essential/gui/friends/state/IMessengerStates;
        //    91: putfield        gg/essential/gui/friends/state/SocialStateManager.messengerStates:Lgg/essential/gui/friends/state/IMessengerStates;
        //    94: aload_0         /* this */
        //    95: aload_0         /* this */
        //    96: getfield        gg/essential/gui/friends/state/SocialStateManager.relationshipStateImpl:Lgg/essential/gui/friends/state/RelationshipStateManagerImpl;
        //    99: checkcast       Lgg/essential/gui/friends/state/IRelationshipStates;
        //   102: putfield        gg/essential/gui/friends/state/SocialStateManager.relationshipStates:Lgg/essential/gui/friends/state/IRelationshipStates;
        //   105: aload_0         /* this */
        //   106: aload_0         /* this */
        //   107: getfield        gg/essential/gui/friends/state/SocialStateManager.statusStateManagerImpl:Lgg/essential/gui/friends/state/StatusStateManagerImpl;
        //   110: checkcast       Lgg/essential/gui/friends/state/IStatusStates;
        //   113: putfield        gg/essential/gui/friends/state/SocialStateManager.statusStates:Lgg/essential/gui/friends/state/IStatusStates;
        //   116: aload_0         /* this */
        //   117: getfield        gg/essential/gui/friends/state/SocialStateManager.relationshipStates:Lgg/essential/gui/friends/state/IRelationshipStates;
        //   120: invokeinterface gg/essential/gui/friends/state/IRelationshipStates.getObservableFriendList:()Lgg/essential/elementa/utils/ObservableList;
        //   125: astore_2        /* observableFriendList */
        //   126: aload_0         /* this */
        //   127: getfield        gg/essential/gui/friends/state/SocialStateManager.messengerStates:Lgg/essential/gui/friends/state/IMessengerStates;
        //   130: invokeinterface gg/essential/gui/friends/state/IMessengerStates.getObservableChannelList:()Lgg/essential/elementa/utils/ObservableList;
        //   135: astore_3        /* observableChannelList */
        //   136: aload_3         /* observableChannelList */
        //   137: checkcast       Ljava/lang/Iterable;
        //   140: astore          $this$mapNotNull$iv
        //   142: aload           $this$mapNotNull$iv
        //   144: astore          6
        //   146: new             Ljava/util/ArrayList;
        //   149: dup            
        //   150: invokespecial   java/util/ArrayList.<init>:()V
        //   153: checkcast       Ljava/util/Collection;
        //   156: astore          destination$iv$iv
        //   158: aload           $this$mapNotNullTo$iv$iv
        //   160: astore          $this$forEach$iv$iv$iv
        //   162: aload           $this$forEach$iv$iv$iv
        //   164: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   169: astore          11
        //   171: aload           11
        //   173: invokeinterface java/util/Iterator.hasNext:()Z
        //   178: ifeq            229
        //   181: aload           11
        //   183: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   188: astore          element$iv$iv$iv
        //   190: aload           element$iv$iv$iv
        //   192: astore          element$iv$iv
        //   194: aload           element$iv$iv
        //   196: checkcast       Lcom/sparkuniverse/toolbox/chat/model/Channel;
        //   199: astore          it
        //   201: aload           it
        //   203: invokestatic    gg/essential/util/ExtensionsKt.getOtherUser:(Lcom/sparkuniverse/toolbox/chat/model/Channel;)Ljava/util/UUID;
        //   206: dup            
        //   207: ifnull          225
        //   210: astore          it$iv$iv
        //   212: aload           destination$iv$iv
        //   214: aload           it$iv$iv
        //   216: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   221: pop            
        //   222: goto            171
        //   225: pop            
        //   226: goto            171
        //   229: aload           destination$iv$iv
        //   231: checkcast       Ljava/util/List;
        //   234: astore          directMessages
        //   236: aload_2         /* observableFriendList */
        //   237: checkcast       Ljava/lang/Iterable;
        //   240: astore          $this$filter$iv
        //   242: aload           $this$filter$iv
        //   244: astore          6
        //   246: new             Ljava/util/ArrayList;
        //   249: dup            
        //   250: invokespecial   java/util/ArrayList.<init>:()V
        //   253: checkcast       Ljava/util/Collection;
        //   256: astore          destination$iv$iv
        //   258: aload           $this$filterTo$iv$iv
        //   260: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   265: astore          9
        //   267: aload           9
        //   269: invokeinterface java/util/Iterator.hasNext:()Z
        //   274: ifeq            326
        //   277: aload           9
        //   279: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   284: astore          element$iv$iv
        //   286: aload           element$iv$iv
        //   288: checkcast       Ljava/util/UUID;
        //   291: astore          it
        //   293: aload           directMessages
        //   295: aload           it
        //   297: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   302: ifne            309
        //   305: iconst_1       
        //   306: goto            310
        //   309: iconst_0       
        //   310: ifeq            267
        //   313: aload           destination$iv$iv
        //   315: aload           element$iv$iv
        //   317: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   322: pop            
        //   323: goto            267
        //   326: aload           destination$iv$iv
        //   328: checkcast       Ljava/util/List;
        //   331: checkcast       Ljava/lang/Iterable;
        //   334: astore          $this$forEach$iv
        //   336: aload           $this$forEach$iv
        //   338: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   343: astore          6
        //   345: aload           6
        //   347: invokeinterface java/util/Iterator.hasNext:()Z
        //   352: ifeq            402
        //   355: aload           6
        //   357: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   362: astore          element$iv
        //   364: aload           element$iv
        //   366: checkcast       Ljava/util/UUID;
        //   369: astore          it
        //   371: aload           it
        //   373: invokestatic    gg/essential/util/UUIDUtil.getName:(Ljava/util/UUID;)Ljava/util/concurrent/CompletableFuture;
        //   376: dup            
        //   377: ldc             "getName(it)"
        //   379: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   382: new             Lgg/essential/gui/friends/state/SocialStateManager$2$1;
        //   385: dup            
        //   386: aload_1         /* connectionManager */
        //   387: aload           it
        //   389: invokespecial   gg/essential/gui/friends/state/SocialStateManager$2$1.<init>:(Lgg/essential/network/connectionmanager/ConnectionManager;Ljava/util/UUID;)V
        //   392: checkcast       Lkotlin/jvm/functions/Function1;
        //   395: invokestatic    gg/essential/util/ExtensionsKt.thenAcceptOnMainThread:(Ljava/util/concurrent/CompletableFuture;Lkotlin/jvm/functions/Function1;)Ljava/util/concurrent/CompletableFuture;
        //   398: pop            
        //   399: goto            345
        //   402: aload_2         /* observableFriendList */
        //   403: aload_1         /* connectionManager */
        //   404: invokedynamic   BootstrapMethod #0, update:(Lgg/essential/network/connectionmanager/ConnectionManager;)Ljava/util/Observer;
        //   409: invokevirtual   gg/essential/elementa/utils/ObservableList.addObserver:(Ljava/util/Observer;)V
        //   412: return         
        //    MethodParameters:
        //  Name               Flags  
        //  -----------------  -----
        //  connectionManager  
        //    StackMapTable: 00 09 FF 00 AB 00 0C 00 07 00 3C 07 00 8A 00 00 00 00 07 00 84 00 00 00 07 00 8C 00 00 75 07 00 A2 FF 00 03 00 08 00 07 00 3C 07 00 8A 00 00 00 00 07 00 84 00 00 FF 00 25 00 0A 00 07 00 3C 07 00 8A 00 07 00 A4 00 00 07 00 84 00 07 00 8C 00 00 FC 00 29 07 00 04 40 01 FF 00 0F 00 08 00 07 00 3C 07 00 8A 00 00 00 00 07 00 84 00 00 FF 00 12 00 07 00 07 00 3C 07 00 8A 00 00 00 07 00 8C 00 00 FF 00 38 00 03 00 07 00 3C 07 00 8A 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final IMessengerStates getMessengerStates() {
        return this.messengerStates;
    }
    
    @NotNull
    public final IRelationshipStates getRelationshipStates() {
        return this.relationshipStates;
    }
    
    @NotNull
    public final IStatusStates getStatusStates() {
        return this.statusStates;
    }
    
    private static final void _init_$lambda-3(final ConnectionManager $connectionManager, final Observable observable, final Object event) {
        Intrinsics.checkNotNullParameter((Object)$connectionManager, "$connectionManager");
        if (event instanceof final ObservableAddEvent observableAddEvent) {
            final Object value = observableAddEvent.getElement().getValue();
            if (value == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.util.UUID");
            }
            final UUID newFriend = (UUID)value;
            final CompletableFuture<String> name = UUIDUtil.getName(newFriend);
            Intrinsics.checkNotNullExpressionValue((Object)name, "getName(newFriend)");
            ExtensionsKt.thenAcceptOnMainThread((CompletableFuture<Object>)name, (kotlin.jvm.functions.Function1<? super Object, Unit>)new SocialStateManager$3.SocialStateManager$3$1($connectionManager, newFriend));
        }
    }
}
