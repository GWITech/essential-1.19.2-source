package gg.essential.gui.menu.compact;

import kotlin.jvm.functions.*;
import gg.essential.elementa.components.*;
import kotlin.*;
import net.minecraft.client.util.*;
import kotlin.jvm.internal.*;
import gg.essential.util.*;
import java.util.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "Lgg/essential/elementa/components/UIImage;", "invoke" })
static final class CompactAccountSwitcher$mainAccount$4$1 extends Lambda implements Function0<UIImage> {
    final /* synthetic */ Session $it;
    
    CompactAccountSwitcher$mainAccount$4$1(final Session $it) {
        this.$it = $it;
        super(0);
    }
    
    @NotNull
    public final UIImage invoke() {
        final UUID id = this.$it.getProfile().getId();
        Intrinsics.checkNotNullExpressionValue((Object)id, "it.profile.id");
        return CachedAvatarImage.ofUUID(id);
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
}