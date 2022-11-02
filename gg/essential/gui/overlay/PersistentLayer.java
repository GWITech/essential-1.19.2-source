package gg.essential.gui.overlay;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0018\u00002\u00020\u0001B
public final class PersistentLayer extends Layer
{
    public PersistentLayer(@NotNull final LayerPriority priority) {
        Intrinsics.checkNotNullParameter((Object)priority, "priority");
        super(priority);
    }
}