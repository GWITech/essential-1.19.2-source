package gg.essential.gui.common.modal;

import kotlin.*;
import java.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0010"
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0002\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020	¢\u0006\u0002\u0010
                                                   ¨\u0006\u000b""" }, d2 = { "Lgg/essential/gui/common/modal/FriendSelectionModal;", "Lgg/essential/gui/common/modal/UserSelectionModal;", "requiresButtonPress", "", "requiresSelection", "preselected", "", "Ljava/util/UUID;", "fadeTime", "", "(ZZLjava/util/Set;F)V", "essential" })
public final class FriendSelectionModal extends UserSelectionModal
{
    public FriendSelectionModal(@NotNull final Set<UUID> preselected) {
        Intrinsics.checkNotNullParameter((Object)preselected, "preselected");
        super(false, true, CollectionsKt.toSet((Iterable)Essential.getInstance().getConnectionManager().getRelationshipManager().getFriends().keySet()), preselected, 0.5f);
    }
    
    public FriendSelectionModal() {
        this(SetsKt.emptySet());
    }
}
