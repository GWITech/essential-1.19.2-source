package gg.essential.lib.kdiscordipc.core.socket;

import org.jetbrains.annotations.*;
import gg.essential.lib.kdiscordipc.core.util.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import gg.essential.lib.kdiscordipc.core.socket.impl.*;
import kotlin.jvm.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/socket/SocketProvider;", "", "()V", "systemDefault", "Lgg/essential/lib/kdiscordipc/core/socket/Socket;", "KDiscordIPC" })
public final class SocketProvider
{
    @NotNull
    public static final SocketProvider INSTANCE;
    
    private SocketProvider() {
        super();
    }
    
    @JvmStatic
    @NotNull
    public static final Socket systemDefault() {
        if (PlatformKt.getPlatform() == Platform.UNKNOWN) {
            throw new NotImplementedError((String)null, 1, (DefaultConstructorMarker)null);
        }
        if (PlatformKt.getPlatform() == Platform.WINDOWS) {
            return new WindowsSocket();
        }
        return (Socket)new UnixSocket();
    }
    
    static {
        INSTANCE = new SocketProvider();
    }
}
