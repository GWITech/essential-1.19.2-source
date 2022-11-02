package gg.essential.universal.utils;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.*;
import java.lang.ref.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000*
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010#
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0002
                                                   \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020
                                                   0	¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f""" }, d2 = { "Lgg/essential/universal/utils/ReleasedDynamicTexture$Resources$Companion;", "", "()V", "referenceQueue", "Ljava/lang/ref/ReferenceQueue;", "Lgg/essential/universal/utils/ReleasedDynamicTexture;", "getReferenceQueue", "()Ljava/lang/ref/ReferenceQueue;", "toBeCleanedUp", "", "Lgg/essential/universal/utils/ReleasedDynamicTexture$Resources;", "getToBeCleanedUp", "()Ljava/util/Set;", "drainCleanupQueue", "", "universalcraft" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @NotNull
    public final ReferenceQueue<ReleasedDynamicTexture> getReferenceQueue() {
        return Resources.access$getReferenceQueue$cp();
    }
    
    @NotNull
    public final Set<Resources> getToBeCleanedUp() {
        return Resources.access$getToBeCleanedUp$cp();
    }
    
    public final void drainCleanupQueue() {
        while (true) {
            final Reference<? extends ReleasedDynamicTexture> poll = this.getReferenceQueue().poll();
            if (poll == null) {
                break;
            }
            ((Resources)poll).close();
        }
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
