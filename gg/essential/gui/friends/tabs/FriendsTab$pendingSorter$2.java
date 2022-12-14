package gg.essential.gui.friends.tabs;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.friends.previews.*;
import java.time.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u000f
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ?\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/elementa/UIComponent;", "invoke" })
static final class FriendsTab$pendingSorter$2 extends Lambda implements Function1<UIComponent, Comparable<?>> {
    final /* synthetic */ FriendsTab this$0;
    
    FriendsTab$pendingSorter$2(final FriendsTab $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @Nullable
    public final Comparable<?> invoke(@NotNull final UIComponent it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        final Instant pendingRequestTime = FriendsTab.access$getSocialStateManager$p(this.this$0).getRelationshipStates().getPendingRequestTime(((PendingUserEntry)it).getUser());
        return -((pendingRequestTime != null) ? pendingRequestTime.toEpochMilli() : 0L);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((UIComponent)p1);
    }
}