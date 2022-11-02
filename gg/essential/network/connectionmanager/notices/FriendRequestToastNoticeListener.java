package gg.essential.network.connectionmanager.notices;

import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.notices.model.*;
import gg.essential.notices.*;
import java.util.*;
import kotlin.jvm.functions.*;
import gg.essential.util.*;
import java.util.concurrent.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000&
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010	\u001a\u00020
                                                   H\u0016J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010	\u001a\u00020
                                                   H\u0016J\b\u0010\f\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006""" }, d2 = { "Lgg/essential/network/connectionmanager/notices/FriendRequestToastNoticeListener;", "Lgg/essential/network/connectionmanager/notices/NoticesManager$NoticeListener;", "connectionManager", "Lgg/essential/network/connectionmanager/ConnectionManager;", "noticeManager", "Lgg/essential/network/connectionmanager/notices/NoticesManager;", "(Lgg/essential/network/connectionmanager/ConnectionManager;Lgg/essential/network/connectionmanager/notices/NoticesManager;)V", "noticeAdded", "", "notice", "Lgg/essential/notices/model/Notice;", "noticeRemoved", "onConnect", "essential" })
public final class FriendRequestToastNoticeListener implements NoticeListener
{
    @NotNull
    private final ConnectionManager connectionManager;
    @NotNull
    private final NoticesManager noticeManager;
    
    public FriendRequestToastNoticeListener(@NotNull final ConnectionManager connectionManager, @NotNull final NoticesManager noticeManager) {
        Intrinsics.checkNotNullParameter((Object)connectionManager, "connectionManager");
        Intrinsics.checkNotNullParameter((Object)noticeManager, "noticeManager");
        super();
        this.connectionManager = connectionManager;
        this.noticeManager = noticeManager;
    }
    
    @Override
    public void noticeAdded(@NotNull final Notice notice) {
        Intrinsics.checkNotNullParameter((Object)notice, "notice");
        if (notice.getType() != NoticeType.FRIEND_REQUEST_TOAST) {
            return;
        }
        final String value = notice.getMetadata().get("uuid");
        final String name = (value instanceof String) ? value : null;
        if (name == null) {
            return;
        }
        final UUID uuid = UUID.fromString(name);
        final CompletableFuture<String> name2 = UUIDUtil.getName(uuid);
        Intrinsics.checkNotNullExpressionValue((Object)name2, "getName(uuid)");
        ExtensionsKt.thenAcceptOnMainThread((CompletableFuture<Object>)name2, (kotlin.jvm.functions.Function1<? super Object, Unit>)new FriendRequestToastNoticeListener$noticeAdded.FriendRequestToastNoticeListener$noticeAdded$1(this, notice, uuid));
    }
    
    @Override
    public void noticeRemoved(@NotNull final Notice notice) {
        Intrinsics.checkNotNullParameter((Object)notice, "notice");
    }
    
    @Override
    public void onConnect() {
    }
    
    public static final /* synthetic */ ConnectionManager access$getConnectionManager$p(final FriendRequestToastNoticeListener $this) {
        return $this.connectionManager;
    }
    
    public static final /* synthetic */ NoticesManager access$getNoticeManager$p(final FriendRequestToastNoticeListener $this) {
        return $this.noticeManager;
    }
}
