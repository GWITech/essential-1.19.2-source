package gg.essential.util;

import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import java.util.*;
import kotlin.text.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "Lgg/essential/util/OperatingSystem;", "invoke" })
static final class ExtensionsKt$os$2 extends Lambda implements Function0<OperatingSystem> {
    public static final ExtensionsKt$os$2 INSTANCE;
    
    ExtensionsKt$os$2() {
        super(0);
    }
    
    @NotNull
    public final OperatingSystem invoke() {
        final String property = System.getProperty("os.name");
        Intrinsics.checkNotNullExpressionValue((Object)property, "getProperty(\"os.name\")");
        final String lowerCase = property.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue((Object)lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        final String os = lowerCase;
        return StringsKt.contains$default((CharSequence)os, (CharSequence)"windows", false, 2, (Object)null) ? OperatingSystem.WINDOWS : ((StringsKt.contains$default((CharSequence)os, (CharSequence)"mac", false, 2, (Object)null) || StringsKt.contains$default((CharSequence)os, (CharSequence)"darwin", false, 2, (Object)null)) ? OperatingSystem.MACOS : (StringsKt.contains$default((CharSequence)os, (CharSequence)"linux", false, 2, (Object)null) ? OperatingSystem.LINUX : OperatingSystem.OTHERS));
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    static {
        ExtensionsKt$os$2.INSTANCE = new ExtensionsKt$os$2();
    }
}