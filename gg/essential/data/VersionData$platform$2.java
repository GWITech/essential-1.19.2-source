package gg.essential.data;

import kotlin.jvm.functions.*;
import kotlin.*;
import java.util.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class VersionData$platform$2 extends Lambda implements Function0<String> {
    public static final VersionData$platform$2 INSTANCE;
    
    VersionData$platform$2() {
        super(0);
    }
    
    @NotNull
    public final String invoke() {
        final String lowerCase = VersionData.INSTANCE.getMinecraftPlatform$essential().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue((Object)lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase + "_" + StringsKt.replace$default(VersionData.INSTANCE.getMinecraftVersion$essential(), ".", "-", false, 4, (Object)null);
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    static {
        VersionData$platform$2.INSTANCE = new VersionData$platform$2();
    }
}