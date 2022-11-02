package gg.essential.util;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0010
                                                   \u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007""" }, d2 = { "Lgg/essential/util/OperatingSystem;", "", "(Ljava/lang/String;I)V", "WINDOWS", "MACOS", "LINUX", "OTHERS", "essential" })
public enum OperatingSystem
{
    WINDOWS("WINDOWS", 0), 
    MACOS("MACOS", 1), 
    LINUX("LINUX", 2), 
    OTHERS("OTHERS", 3);
    
    private static final /* synthetic */ OperatingSystem[] $VALUES;
    
    private OperatingSystem(final String $enum$name, final int $enum$ordinal) {
    }
    
    public static OperatingSystem[] values() {
        return OperatingSystem.$VALUES.clone();
    }
    
    public static OperatingSystem valueOf(final String value) {
        return Enum.valueOf(OperatingSystem.class, value);
    }
    
    private static final /* synthetic */ OperatingSystem[] $values() {
        return new OperatingSystem[] { OperatingSystem.WINDOWS, OperatingSystem.MACOS, OperatingSystem.LINUX, OperatingSystem.OTHERS };
    }
    
    static {
        $VALUES = $values();
    }
}
