package gg.essential.lib.kdiscordipc.core.error;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/error/ConnectionError$NoIPCFile;", "Lgg/essential/lib/kdiscordipc/core/error/ConnectionError;", "()V", "KDiscordIPC" })
public static final class NoIPCFile extends ConnectionError
{
    @NotNull
    public static final NoIPCFile INSTANCE;
    
    private NoIPCFile() {
        super("Failed to find an IPC file. Is Discord open? Is this application allowed to access temporary files?", (byte)0);
    }
    
    static {
        INSTANCE = new NoIPCFile();
    }
}
