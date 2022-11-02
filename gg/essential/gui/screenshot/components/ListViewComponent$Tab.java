package gg.essential.gui.screenshot.components;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0010
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\b\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b	j\u0002\b
                                                   ¨\u0006\u000b""" }, d2 = { "Lgg/essential/gui/screenshot/components/ListViewComponent$Tab;", "", "niceName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getNiceName", "()Ljava/lang/String;", "ALL", "WORLDS", "SERVERS", "LIKED", "essential" })
private enum Tab
{
    @NotNull
    private final String niceName;
    
    ALL("ALL", 0, "All"), 
    WORLDS("WORLDS", 1, "Singleplayer"), 
    SERVERS("SERVERS", 2, "Multiplayer"), 
    LIKED("LIKED", 3, "Favorites");
    
    private static final /* synthetic */ Tab[] $VALUES;
    
    private Tab(final String $enum$name, final int $enum$ordinal, final String niceName) {
        this.niceName = niceName;
    }
    
    @NotNull
    public final String getNiceName() {
        return this.niceName;
    }
    
    public static Tab[] values() {
        return Tab.$VALUES.clone();
    }
    
    public static Tab valueOf(final String value) {
        return Enum.valueOf(Tab.class, value);
    }
    
    private static final /* synthetic */ Tab[] $values() {
        return new Tab[] { Tab.ALL, Tab.WORLDS, Tab.SERVERS, Tab.LIKED };
    }
    
    static {
        $VALUES = $values();
    }
}
