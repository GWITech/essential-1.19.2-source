package gg.essential.compatibility.vanilla.difficulty;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005""" }, d2 = { "Lgg/essential/compatibility/vanilla/difficulty/Net;", "", "()V", "init", "", "essential" })
public final class Net
{
    @NotNull
    public static final Net INSTANCE;
    
    private Net() {
        super();
    }
    
    static {
        INSTANCE = new Net();
    }
}
