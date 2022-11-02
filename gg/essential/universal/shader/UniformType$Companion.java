package gg.essential.universal.shader;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0018
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007""" }, d2 = { "Lgg/essential/universal/shader/UniformType$Companion;", "", "()V", "fromGlsl", "Lgg/essential/universal/shader/UniformType;", "glslName", "", "universalcraft" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @NotNull
    public final UniformType fromGlsl(@NotNull final String glslName) {
        Intrinsics.checkNotNullParameter((Object)glslName, "glslName");
        final UniformType[] values = UniformType.values();
        final int length = values.length;
        int i = 0;
        while (true) {
            while (i < length) {
                final UniformType it = values[i];
                final int n = 0;
                if (Intrinsics.areEqual((Object)it.getGlslName(), (Object)glslName)) {
                    final UniformType uniformType2;
                    final UniformType uniformType = uniformType2 = it;
                    if (uniformType2 == null) {
                        throw new NoSuchElementException(glslName);
                    }
                    return uniformType;
                }
                else {
                    ++i;
                }
            }
            UniformType uniformType2;
            final UniformType uniformType = uniformType2 = null;
            continue;
        }
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
