package gg.essential.gui.friends.state;

import gg.essential.network.connectionmanager.profile.*;
import org.jetbrains.annotations.*;
import gg.essential.network.connectionmanager.sps.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.common.*;
import kotlin.jvm.functions.*;
import gg.essential.util.*;
import java.util.concurrent.*;
import kotlin.*;
import java.util.function.*;
import java.util.*;
import gg.essential.elementa.state.*;
import gg.essential.connectionmanager.common.enums.*;
import gg.essential.network.connectionmanager.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000D
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010%
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020
                                                   H\u0016J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\u000e\u001a\u00020
                                                   H\u0016J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020
                                                   H\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020
                                                   H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020
                                                   H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020
                                                   \u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\f0\u000b0	X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0016""" }, d2 = { "Lgg/essential/gui/friends/state/StatusStateManagerImpl;", "Lgg/essential/gui/friends/state/IStatusStates;", "Lgg/essential/gui/friends/state/IStatusManager;", "profileManager", "Lgg/essential/network/connectionmanager/profile/ProfileManager;", "spsManager", "Lgg/essential/network/connectionmanager/sps/SPSManager;", "(Lgg/essential/network/connectionmanager/profile/ProfileManager;Lgg/essential/network/connectionmanager/sps/SPSManager;)V", "statesMap", "", "Ljava/util/UUID;", "Lgg/essential/elementa/state/State;", "Lgg/essential/gui/friends/state/PlayerActivity;", "getActivity", "uuid", "getActivityState", "Lgg/essential/gui/common/ReadOnlyState;", "getWritableState", "joinSession", "", "refreshActivity", "", "essential" })
public final class StatusStateManagerImpl implements IStatusManager, IStatusStates
{
    @NotNull
    private final ProfileManager profileManager;
    @NotNull
    private final SPSManager spsManager;
    @NotNull
    private final Map<UUID, State<PlayerActivity>> statesMap;
    
    public StatusStateManagerImpl(@NotNull final ProfileManager profileManager, @NotNull final SPSManager spsManager) {
        Intrinsics.checkNotNullParameter((Object)profileManager, "profileManager");
        Intrinsics.checkNotNullParameter((Object)spsManager, "spsManager");
        super();
        this.profileManager = profileManager;
        this.spsManager = spsManager;
        this.statesMap = new LinkedHashMap<UUID, State<PlayerActivity>>();
        ((StateCallbackManager<StatusStateManagerImpl>)this.profileManager).registerStateManager(this);
        ((StateCallbackManager<StatusStateManagerImpl>)this.spsManager).registerStateManager(this);
    }
    
    @NotNull
    @Override
    public ReadOnlyState<PlayerActivity> getActivityState(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        return new ReadOnlyState<PlayerActivity>(this.getWritableState(uuid));
    }
    
    @NotNull
    @Override
    public PlayerActivity getActivity(@NotNull final UUID uuid) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "uuid"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: getfield        gg/essential/gui/friends/state/StatusStateManagerImpl.profileManager:Lgg/essential/network/connectionmanager/profile/ProfileManager;
        //    10: aload_1         /* uuid */
        //    11: invokevirtual   gg/essential/network/connectionmanager/profile/ProfileManager.getStatus:(Ljava/util/UUID;)Lgg/essential/connectionmanager/common/enums/ProfileStatus;
        //    14: dup            
        //    15: ldc             "profileManager.getStatus(uuid)"
        //    17: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    20: astore_2        /* status */
        //    21: aload_0         /* this */
        //    22: getfield        gg/essential/gui/friends/state/StatusStateManagerImpl.profileManager:Lgg/essential/network/connectionmanager/profile/ProfileManager;
        //    25: aload_1         /* uuid */
        //    26: invokevirtual   gg/essential/network/connectionmanager/profile/ProfileManager.getActivity:(Ljava/util/UUID;)Ljava/util/Optional;
        //    29: aconst_null    
        //    30: invokevirtual   java/util/Optional.orElse:(Ljava/lang/Object;)Ljava/lang/Object;
        //    33: checkcast       Lkotlin/Pair;
        //    36: astore_3        /* activity */
        //    37: aload_2         /* status */
        //    38: getstatic       gg/essential/gui/friends/state/StatusStateManagerImpl$WhenMappings.$EnumSwitchMapping$0:[I
        //    41: swap           
        //    42: invokevirtual   gg/essential/connectionmanager/common/enums/ProfileStatus.ordinal:()I
        //    45: iaload         
        //    46: tableswitch {
        //                2: 68
        //                3: 77
        //          default: 395
        //        }
        //    68: getstatic       gg/essential/gui/friends/state/PlayerActivity$Offline.INSTANCE:Lgg/essential/gui/friends/state/PlayerActivity$Offline;
        //    71: checkcast       Lgg/essential/gui/friends/state/PlayerActivity;
        //    74: goto            403
        //    77: aload_3         /* activity */
        //    78: ifnonnull       195
        //    81: aload_0         /* this */
        //    82: getfield        gg/essential/gui/friends/state/StatusStateManagerImpl.spsManager:Lgg/essential/network/connectionmanager/sps/SPSManager;
        //    85: invokevirtual   gg/essential/network/connectionmanager/sps/SPSManager.getRemoteSessions:()Ljava/util/Collection;
        //    88: dup            
        //    89: ldc             "spsManager.remoteSessions"
        //    91: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    94: checkcast       Ljava/lang/Iterable;
        //    97: astore          $this$any$iv
        //    99: aload           $this$any$iv
        //   101: checkcast       Ljava/util/Collection;
        //   104: invokeinterface java/util/Collection.isEmpty:()Z
        //   109: ifeq            116
        //   112: iconst_0       
        //   113: goto            168
        //   116: aload           $this$any$iv
        //   118: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   123: astore          6
        //   125: aload           6
        //   127: invokeinterface java/util/Iterator.hasNext:()Z
        //   132: ifeq            167
        //   135: aload           6
        //   137: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   142: astore          element$iv
        //   144: aload           element$iv
        //   146: checkcast       Lgg/essential/upnp/model/UPnPSession;
        //   149: astore          it
        //   151: aload           it
        //   153: invokevirtual   gg/essential/upnp/model/UPnPSession.getHostUUID:()Ljava/util/UUID;
        //   156: aload_1         /* uuid */
        //   157: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   160: ifeq            125
        //   163: iconst_1       
        //   164: goto            168
        //   167: iconst_0       
        //   168: ifeq            186
        //   171: new             Lgg/essential/gui/friends/state/PlayerActivity$SPSSession;
        //   174: dup            
        //   175: aload_1         /* uuid */
        //   176: iconst_1       
        //   177: invokespecial   gg/essential/gui/friends/state/PlayerActivity$SPSSession.<init>:(Ljava/util/UUID;Z)V
        //   180: checkcast       Lgg/essential/gui/friends/state/PlayerActivity;
        //   183: goto            403
        //   186: getstatic       gg/essential/gui/friends/state/PlayerActivity$Online.INSTANCE:Lgg/essential/gui/friends/state/PlayerActivity$Online;
        //   189: checkcast       Lgg/essential/gui/friends/state/PlayerActivity;
        //   192: goto            403
        //   195: aload_3         /* activity */
        //   196: invokevirtual   kotlin/Pair.getSecond:()Ljava/lang/Object;
        //   199: checkcast       Ljava/lang/String;
        //   202: astore          address
        //   204: aload           address
        //   206: ldc             "singleplayer"
        //   208: iconst_1       
        //   209: invokestatic    kotlin/text/StringsKt.equals:(Ljava/lang/String;Ljava/lang/String;Z)Z
        //   212: ifeq            228
        //   215: new             Lgg/essential/gui/friends/state/PlayerActivity$OnlineWithDescription;
        //   218: dup            
        //   219: ldc             "Singleplayer"
        //   221: invokespecial   gg/essential/gui/friends/state/PlayerActivity$OnlineWithDescription.<init>:(Ljava/lang/String;)V
        //   224: checkcast       Lgg/essential/gui/friends/state/PlayerActivity;
        //   227: areturn        
        //   228: aload_0         /* this */
        //   229: getfield        gg/essential/gui/friends/state/StatusStateManagerImpl.spsManager:Lgg/essential/network/connectionmanager/sps/SPSManager;
        //   232: aload           address
        //   234: invokevirtual   gg/essential/network/connectionmanager/sps/SPSManager.getHostFromSpsAddress:(Ljava/lang/String;)Ljava/util/UUID;
        //   237: astore          5
        //   239: aload           5
        //   241: ifnull          373
        //   244: aload           5
        //   246: astore          host
        //   248: aload           host
        //   250: aload_0         /* this */
        //   251: getfield        gg/essential/gui/friends/state/StatusStateManagerImpl.spsManager:Lgg/essential/network/connectionmanager/sps/SPSManager;
        //   254: invokevirtual   gg/essential/network/connectionmanager/sps/SPSManager.getRemoteSessions:()Ljava/util/Collection;
        //   257: dup            
        //   258: ldc             "spsManager.remoteSessions"
        //   260: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   263: checkcast       Ljava/lang/Iterable;
        //   266: astore          9
        //   268: astore          10
        //   270: aload           $this$any$iv
        //   272: instanceof      Ljava/util/Collection;
        //   275: ifeq            295
        //   278: aload           $this$any$iv
        //   280: checkcast       Ljava/util/Collection;
        //   283: invokeinterface java/util/Collection.isEmpty:()Z
        //   288: ifeq            295
        //   291: iconst_0       
        //   292: goto            348
        //   295: aload           $this$any$iv
        //   297: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   302: astore          11
        //   304: aload           11
        //   306: invokeinterface java/util/Iterator.hasNext:()Z
        //   311: ifeq            347
        //   314: aload           11
        //   316: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   321: astore          element$iv
        //   323: aload           element$iv
        //   325: checkcast       Lgg/essential/upnp/model/UPnPSession;
        //   328: astore          it
        //   330: aload           it
        //   332: invokevirtual   gg/essential/upnp/model/UPnPSession.getHostUUID:()Ljava/util/UUID;
        //   335: aload           host
        //   337: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   340: ifeq            304
        //   343: iconst_1       
        //   344: goto            348
        //   347: iconst_0       
        //   348: istore          14
        //   350: aload           10
        //   352: iload           14
        //   354: istore          15
        //   356: astore          16
        //   358: new             Lgg/essential/gui/friends/state/PlayerActivity$SPSSession;
        //   361: dup            
        //   362: aload           16
        //   364: iload           15
        //   366: invokespecial   gg/essential/gui/friends/state/PlayerActivity$SPSSession.<init>:(Ljava/util/UUID;Z)V
        //   369: checkcast       Lgg/essential/gui/friends/state/PlayerActivity;
        //   372: areturn        
        //   373: new             Lgg/essential/gui/friends/state/PlayerActivity$Multiplayer;
        //   376: dup            
        //   377: aload           address
        //   379: ldc             "address"
        //   381: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   384: aload           address
        //   386: invokespecial   gg/essential/gui/friends/state/PlayerActivity$Multiplayer.<init>:(Ljava/lang/String;)V
        //   389: checkcast       Lgg/essential/gui/friends/state/PlayerActivity;
        //   392: goto            403
        //   395: new             Lkotlin/NoWhenBranchMatchedException;
        //   398: dup            
        //   399: invokespecial   kotlin/NoWhenBranchMatchedException.<init>:()V
        //   402: athrow         
        //   403: areturn        
        //    MethodParameters:
        //  Name  Flags  
        //  ----  -----
        //  uuid  
        //    StackMapTable: 00 10 F9 00 44 FF 00 08 00 04 07 00 02 07 00 86 00 07 00 72 00 00 FF 00 26 00 05 00 07 00 86 00 00 07 00 8E 00 00 FF 00 08 00 07 00 07 00 86 00 00 00 00 07 00 9A 00 00 FF 00 29 00 02 00 07 00 86 00 00 40 01 F9 00 11 FF 00 08 00 04 07 00 02 00 00 07 00 72 00 00 FF 00 20 00 05 07 00 02 00 00 00 07 00 BA 00 00 FF 00 42 00 0B 00 00 00 00 00 00 00 07 00 86 00 07 00 8E 07 00 86 00 00 FF 00 08 00 0C 00 00 00 00 00 00 00 07 00 86 00 00 07 00 86 07 00 9A 00 00 FF 00 2A 00 0B 00 00 00 00 00 00 00 00 00 00 07 00 86 00 00 40 01 FF 00 18 00 05 00 00 00 00 07 00 BA 00 00 FF 00 15 00 00 00 00 47 07 00 84
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public boolean joinSession(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        final PlayerActivity activity = this.getActivity(uuid);
        String s;
        if (activity instanceof final PlayerActivity.Multiplayer multiplayer) {
            s = multiplayer.getServerAddress();
        }
        else {
            if (!(activity instanceof PlayerActivity.SPSSession) || !((PlayerActivity.SPSSession)activity).getInvited()) {
                return false;
            }
            Intrinsics.checkNotNullExpressionValue((Object)(s = this.spsManager.getSpsAddress(uuid)), "spsManager.getSpsAddress(uuid)");
        }
        final String address = s;
        final CompletableFuture<String> name = UUIDUtil.getName(uuid);
        Intrinsics.checkNotNullExpressionValue((Object)name, "getName(uuid)");
        ExtensionsKt.thenAcceptOnMainThread((CompletableFuture<Object>)name, (kotlin.jvm.functions.Function1<? super Object, Unit>)new StatusStateManagerImpl$joinSession.StatusStateManagerImpl$joinSession$1(address));
        return true;
    }
    
    private final State<PlayerActivity> getWritableState(final UUID uuid) {
        final State<PlayerActivity> computeIfAbsent = this.statesMap.computeIfAbsent(uuid, StatusStateManagerImpl::getWritableState$lambda-3);
        Intrinsics.checkNotNullExpressionValue((Object)computeIfAbsent, "statesMap.computeIfAbsen\u2026Activity(uuid))\n        }");
        return computeIfAbsent;
    }
    
    @Override
    public void refreshActivity(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        this.getWritableState(uuid).set(this.getActivity(uuid));
        final Iterable $this$forEach$iv = this.statesMap.entrySet();
        for (final Object element$iv : $this$forEach$iv) {
            final Map.Entry it = (Map.Entry)element$iv;
            if (Intrinsics.areEqual(it.getKey(), (Object)uuid)) {
                return;
            }
            final PlayerActivity activity = it.getValue().get();
            if (!(activity instanceof PlayerActivity.SPSSession) || !Intrinsics.areEqual((Object)((PlayerActivity.SPSSession)activity).getHost(), (Object)uuid)) {
                continue;
            }
            this.refreshActivity(it.getKey());
        }
    }
    
    private static final State getWritableState$lambda-3(final StatusStateManagerImpl this$0, final UUID $uuid, final UUID it) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)$uuid, "$uuid");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return new BasicState(this$0.getActivity($uuid));
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public final synthetic class WhenMappings
    {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        
        static {
            final int[] $EnumSwitchMapping$ = new int[ProfileStatus.values().length];
            $EnumSwitchMapping$[ProfileStatus.OFFLINE.ordinal()] = 1;
            $EnumSwitchMapping$[ProfileStatus.ONLINE.ordinal()] = 2;
            $EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}
