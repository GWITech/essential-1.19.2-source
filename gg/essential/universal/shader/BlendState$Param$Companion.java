package gg.essential.universal.shader;

import kotlin.*;
import kotlin.jvm.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001c
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010$
                                                   \u0002\u0010\b
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006	""" }, d2 = { "Lgg/essential/universal/shader/BlendState$Param$Companion;", "", "()V", "byGlId", "", "", "Lgg/essential/universal/shader/BlendState$Param;", "fromGl", "glId", "universalcraft" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @JvmStatic
    @Nullable
    public final Param fromGl(final int glId) {
        return Param.access$getByGlId$cp().get(glId);
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
