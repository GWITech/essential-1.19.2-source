package gg.essential.gui.sps;

import kotlin.jvm.functions.*;
import kotlin.*;
import net.minecraft.world.level.storage.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   �\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "", "invoke", "(Ljava/lang/String;)Ljava/lang/Boolean;" })
static final class WorldSelectionModal$populate$2 extends Lambda implements Function1<String, Boolean> {
    final /* synthetic */ LevelSummary $worldSummary;
    
    WorldSelectionModal$populate$2(final LevelSummary $worldSummary) {
        this.$worldSummary = $worldSummary;
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final String it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        final String displayName = this.$worldSummary.getDisplayName();
        Intrinsics.checkNotNullExpressionValue((Object)displayName, "worldSummary.displayName");
        return StringsKt.contains((CharSequence)displayName, (CharSequence)it, true);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((String)p1);
    }
}