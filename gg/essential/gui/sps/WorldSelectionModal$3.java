package gg.essential.gui.sps;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class WorldSelectionModal$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ WorldSelectionModal this$0;
    
    WorldSelectionModal$3(final WorldSelectionModal $receiver) {
        this.this$0 = $receiver;
        super(0);
    }
    
    public final void invoke() {
        final WorldEntry worldEntry = WorldSelectionModal.access$getSelectedWorld$p(this.this$0).get();
        if (worldEntry != null) {
            final WorldEntry it = worldEntry;
            InviteFriendsModal.show$default$7781189c(InviteFriendsModal.INSTANCE, it.getWorldSummary(), null, false, false, null, 30);
        }
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}