package gg.essential.vigilance.impl;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u0006" }, d2 = { "Lgg/essential/vigilance/impl/I18n;", "", "()V", "format", "", "key", "Vigilance" })
@ApiStatus.Internal
public final class I18n
{
    @NotNull
    public static final I18n INSTANCE;
    
    private I18n() {
        super();
    }
    
    @NotNull
    public final String format(@NotNull final String key) {
        Intrinsics.checkNotNullParameter((Object)key, "key");
        return Platform.Companion.getPlatform$Vigilance().i18n(key);
    }
    
    static {
        INSTANCE = new I18n();
    }
}
