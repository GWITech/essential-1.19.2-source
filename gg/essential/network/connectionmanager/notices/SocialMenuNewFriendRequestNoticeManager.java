package gg.essential.network.connectionmanager.notices;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.notices.model.*;
import kotlin.jvm.internal.*;
import gg.essential.notices.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.common.*;
import gg.essential.elementa.state.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000@
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0010%
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020
                                                   J\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00122\u0006\u0010\u0010\u001a\u00020
                                                   J\u0010\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\rH\u0016J\b\u0010\u0016\u001a\u00020\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u000fH\u0016J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R \u0010\b\u001a\u0014\u0012\u0004\u0012\u00020
                                                   \u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\u000b0\u00060	X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020
                                                   \u0012\u0004\u0012\u00020\r0	X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0018""" }, d2 = { "Lgg/essential/network/connectionmanager/notices/SocialMenuNewFriendRequestNoticeManager;", "Lgg/essential/network/connectionmanager/notices/NoticesManager$NoticeListener;", "noticesManager", "Lgg/essential/network/connectionmanager/notices/NoticesManager;", "(Lgg/essential/network/connectionmanager/notices/NoticesManager;)V", "unseenFriendRequestCount", "Lgg/essential/elementa/state/BasicState;", "", "unseenFriendRequestStates", "", "Ljava/util/UUID;", "", "unseenFriendRequests", "Lgg/essential/notices/model/Notice;", "clearUnseenFriendRequests", "", "uuid", "hasUnseenFriendRequests", "Lgg/essential/gui/common/WeakState;", "noticeAdded", "notice", "noticeRemoved", "onConnect", "resetState", "essential" })
public final class SocialMenuNewFriendRequestNoticeManager implements NoticeListener
{
    @NotNull
    private final NoticesManager noticesManager;
    @NotNull
    private final Map<UUID, Notice> unseenFriendRequests;
    @NotNull
    private final Map<UUID, BasicState<Boolean>> unseenFriendRequestStates;
    @NotNull
    private final BasicState<Integer> unseenFriendRequestCount;
    
    public SocialMenuNewFriendRequestNoticeManager(@NotNull final NoticesManager noticesManager) {
        Intrinsics.checkNotNullParameter((Object)noticesManager, "noticesManager");
        super();
        this.noticesManager = noticesManager;
        this.unseenFriendRequests = new LinkedHashMap<UUID, Notice>();
        this.unseenFriendRequestStates = new LinkedHashMap<UUID, BasicState<Boolean>>();
        this.unseenFriendRequestCount = new BasicState<Integer>(0);
    }
    
    @Override
    public void noticeAdded(@NotNull final Notice notice) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "notice"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_1         /* notice */
        //     7: invokevirtual   gg/essential/notices/model/Notice.getType:()Lgg/essential/notices/NoticeType;
        //    10: getstatic       gg/essential/notices/NoticeType.FRIEND_REQUEST_NEW_INDICATOR:Lgg/essential/notices/NoticeType;
        //    13: if_acmpeq       17
        //    16: return         
        //    17: aload_1         /* notice */
        //    18: invokevirtual   gg/essential/notices/model/Notice.getMetadata:()Ljava/util/Map;
        //    21: ldc             "uuid"
        //    23: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    28: astore          4
        //    30: aload           4
        //    32: instanceof      Ljava/lang/String;
        //    35: ifeq            46
        //    38: aload           4
        //    40: checkcast       Ljava/lang/String;
        //    43: goto            47
        //    46: aconst_null    
        //    47: dup            
        //    48: ifnonnull       53
        //    51: pop            
        //    52: return         
        //    53: invokestatic    java/util/UUID.fromString:(Ljava/lang/String;)Ljava/util/UUID;
        //    56: astore_2        /* uuid */
        //    57: aload_0         /* this */
        //    58: getfield        gg/essential/network/connectionmanager/notices/SocialMenuNewFriendRequestNoticeManager.unseenFriendRequests:Ljava/util/Map;
        //    61: aload_2         /* uuid */
        //    62: ldc             "uuid"
        //    64: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    67: aload_2         /* uuid */
        //    68: aload_1         /* notice */
        //    69: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //    74: pop            
        //    75: aload_0         /* this */
        //    76: getfield        gg/essential/network/connectionmanager/notices/SocialMenuNewFriendRequestNoticeManager.unseenFriendRequestStates:Ljava/util/Map;
        //    79: astore_3       
        //    80: aload_2         /* uuid */
        //    81: astore          key$iv
        //    83: aload_3         /* $this$getOrPut$iv */
        //    84: aload           key$iv
        //    86: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    91: astore          value$iv
        //    93: aload           value$iv
        //    95: ifnonnull       127
        //    98: new             Lgg/essential/elementa/state/BasicState;
        //   101: dup            
        //   102: iconst_0       
        //   103: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   106: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   109: astore          answer$iv
        //   111: aload_3         /* $this$getOrPut$iv */
        //   112: aload           key$iv
        //   114: aload           answer$iv
        //   116: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   121: pop            
        //   122: aload           answer$iv
        //   124: goto            129
        //   127: aload           value$iv
        //   129: checkcast       Lgg/essential/elementa/state/BasicState;
        //   132: getstatic       gg/essential/network/connectionmanager/notices/SocialMenuNewFriendRequestNoticeManager$noticeAdded$2.INSTANCE:Lgg/essential/network/connectionmanager/notices/SocialMenuNewFriendRequestNoticeManager$noticeAdded$2;
        //   135: checkcast       Lkotlin/jvm/functions/Function1;
        //   138: invokevirtual   gg/essential/elementa/state/BasicState.set:(Lkotlin/jvm/functions/Function1;)V
        //   141: aload_0         /* this */
        //   142: getfield        gg/essential/network/connectionmanager/notices/SocialMenuNewFriendRequestNoticeManager.unseenFriendRequestCount:Lgg/essential/elementa/state/BasicState;
        //   145: aload_0         /* this */
        //   146: getfield        gg/essential/network/connectionmanager/notices/SocialMenuNewFriendRequestNoticeManager.unseenFriendRequests:Ljava/util/Map;
        //   149: invokeinterface java/util/Map.size:()I
        //   154: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   157: invokevirtual   gg/essential/elementa/state/BasicState.set:(Ljava/lang/Object;)V
        //   160: return         
        //    MethodParameters:
        //  Name    Flags  
        //  ------  -----
        //  notice  
        //    StackMapTable: 00 06 11 1C 40 07 00 70 45 07 00 70 FF 00 49 00 06 07 00 02 00 00 00 00 07 00 04 00 00 FF 00 01 00 01 07 00 02 00 01 07 00 04
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public void noticeRemoved(@NotNull final Notice notice) {
        Intrinsics.checkNotNullParameter((Object)notice, "notice");
        if (notice.getType() != NoticeType.FRIEND_REQUEST_NEW_INDICATOR) {
            return;
        }
        final String value = notice.getMetadata().get("uuid");
        final String name = (value instanceof String) ? value : null;
        if (name == null) {
            return;
        }
        final UUID uuid = UUID.fromString(name);
        this.unseenFriendRequests.remove(uuid);
        final BasicState basicState = this.unseenFriendRequestStates.get(uuid);
        if (basicState != null) {
            basicState.set((Function1)SocialMenuNewFriendRequestNoticeManager$noticeRemoved.SocialMenuNewFriendRequestNoticeManager$noticeRemoved$1.INSTANCE);
        }
        this.unseenFriendRequestCount.set(this.unseenFriendRequests.size());
    }
    
    @NotNull
    public final WeakState<Boolean> hasUnseenFriendRequests(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        final Map $this$getOrPut$iv = this.unseenFriendRequestStates;
        final Object value$iv = $this$getOrPut$iv.get(uuid);
        Object o;
        if (value$iv == null) {
            final Object answer$iv = new BasicState(false);
            $this$getOrPut$iv.put(uuid, answer$iv);
            o = answer$iv;
        }
        else {
            o = value$iv;
        }
        return new WeakState<Boolean>((State<Object>)o);
    }
    
    public final void clearUnseenFriendRequests(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        final Notice notice2 = this.unseenFriendRequests.remove(uuid);
        if (notice2 == null) {
            return;
        }
        final Notice notice = notice2;
        this.noticesManager.dismissNotice(notice.getId());
        this.unseenFriendRequestCount.set(this.unseenFriendRequests.size());
        final BasicState basicState = this.unseenFriendRequestStates.get(uuid);
        if (basicState != null) {
            basicState.set((Function1)SocialMenuNewFriendRequestNoticeManager$clearUnseenFriendRequests.SocialMenuNewFriendRequestNoticeManager$clearUnseenFriendRequests$1.INSTANCE);
        }
    }
    
    @NotNull
    public final WeakState<Integer> unseenFriendRequestCount() {
        return new WeakState<Integer>(this.unseenFriendRequestCount);
    }
    
    @Override
    public void onConnect() {
    }
    
    @Override
    public void resetState() {
        this.unseenFriendRequests.clear();
        final Iterable $this$forEach$iv = this.unseenFriendRequestStates.values();
        for (final Object element$iv : $this$forEach$iv) {
            final BasicState it = (BasicState)element$iv;
            it.set(false);
        }
        this.unseenFriendRequestCount.set(0);
    }
}
