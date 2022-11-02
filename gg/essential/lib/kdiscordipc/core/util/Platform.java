package gg.essential.lib.kdiscordipc.core.util;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/util/Platform;", "", "(Ljava/lang/String;I)V", "WINDOWS", "MACOS", "LINUX", "UNKNOWN", "KDiscordIPC" })
public enum Platform
{
    WINDOWS("WINDOWS", 0), 
    MACOS("MACOS", 1), 
    LINUX("LINUX", 2), 
    UNKNOWN("UNKNOWN", 3);
    
    private static final /* synthetic */ Platform[] $VALUES;
    
    private Platform(final String $enum$name, final int $enum$ordinal) {
    }
    
    public static Platform[] values() {
        return Platform.$VALUES.clone();
    }
    
    public static Platform valueOf(final String value) {
        return Enum.valueOf(Platform.class, value);
    }
    
    private static final /* synthetic */ Platform[] $values() {
        return new Platform[] { Platform.WINDOWS, Platform.MACOS, Platform.LINUX, Platform.UNKNOWN };
    }
    
    static {
        $VALUES = $values();
    }
}
