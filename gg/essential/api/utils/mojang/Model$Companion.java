package gg.essential.api.utils.mojang;

import kotlin.*;
import kotlin.jvm.*;
import org.jetbrains.annotations.*;
import kotlin.text.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010	\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006
                                                   """ }, d2 = { "Lgg/essential/api/utils/mojang/Model$Companion;", "", "()V", "byType", "Lgg/essential/api/utils/mojang/Model;", "str", "", "byTypeOrDefault", "byVariant", "byVariantOrDefault", "essential-api" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @JvmStatic
    @Nullable
    public final Model byType(@NotNull final String str) {
        Intrinsics.checkNotNullParameter((Object)str, "str");
        final Model[] values = Model.values();
        for (int i = 0; i < values.length; ++i) {
            final Model it = values[i];
            if (Intrinsics.areEqual((Object)it.getType(), (Object)str)) {
                return it;
            }
        }
        return null;
    }
    
    @JvmStatic
    @NotNull
    public final Model byTypeOrDefault(@NotNull final String str) {
        Intrinsics.checkNotNullParameter((Object)str, "str");
        Model model;
        if ((model = this.byType(str)) == null) {
            model = Model.STEVE;
        }
        return model;
    }
    
    @JvmStatic
    @Nullable
    public final Model byVariant(@NotNull final String str) {
        Intrinsics.checkNotNullParameter((Object)str, "str");
        final Model[] values = Model.values();
        for (int i = 0; i < values.length; ++i) {
            final Model it = values[i];
            if (StringsKt.equals(it.getVariant(), str, true)) {
                return it;
            }
        }
        return null;
    }
    
    @JvmStatic
    @NotNull
    public final Model byVariantOrDefault(@NotNull final String str) {
        Intrinsics.checkNotNullParameter((Object)str, "str");
        Model model;
        if ((model = this.byVariant(str)) == null) {
            model = Model.STEVE;
        }
        return model;
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
