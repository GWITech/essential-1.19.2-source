package gg.essential.elementa.utils;

import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u0010\u0002\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0004\"$\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u0004\"\u0004\b\b\u0010\t\"$\u0010\n\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0004\"\u0004\b\f\u0010\t¨\u0006\r" }, d2 = { "debugPropSet", "", "devPropSet", "getDevPropSet", "()Z", "value", "elementaDebug", "getElementaDebug", "setElementaDebug", "(Z)V", "elementaDev", "getElementaDev", "setElementaDev", "Elementa" })
public final class OptionsKt
{
    private static final boolean devPropSet;
    private static final boolean debugPropSet;
    private static boolean elementaDev;
    private static boolean elementaDebug;
    
    public static final boolean getDevPropSet() {
        return OptionsKt.devPropSet;
    }
    
    public static final boolean getElementaDev() {
        return OptionsKt.elementaDev;
    }
    
    public static final void setElementaDev(final boolean value) {
        if (OptionsKt.devPropSet) {
            OptionsKt.elementaDev = value;
        }
    }
    
    public static final boolean getElementaDebug() {
        return OptionsKt.elementaDebug;
    }
    
    public static final void setElementaDebug(final boolean value) {
        if (OptionsKt.debugPropSet) {
            OptionsKt.elementaDebug = value;
        }
    }
    
    static {
        final String property = System.getProperty("elementa.dev");
        devPropSet = (property != null && Boolean.parseBoolean(property));
        final String property2 = System.getProperty("elementa.debug");
        debugPropSet = (property2 != null && Boolean.parseBoolean(property2));
        OptionsKt.elementaDev = OptionsKt.devPropSet;
        OptionsKt.elementaDebug = OptionsKt.debugPropSet;
    }
}
