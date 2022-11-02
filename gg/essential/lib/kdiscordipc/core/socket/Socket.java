package gg.essential.lib.kdiscordipc.core.socket;

import kotlin.*;
import java.io.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0010" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/socket/Socket;", "", "connected", "", "getConnected", "()Z", "close", "", "connect", "file", "Ljava/io/File;", "read", "Lgg/essential/lib/kdiscordipc/core/socket/RawPacket;", "write", "bytes", "", "KDiscordIPC" })
public interface Socket
{
    boolean getConnected();
    
    void connect(@NotNull final File p0);
    
    @NotNull
    RawPacket read();
    
    void write(@NotNull final byte[] p0);
    
    void close();
}
