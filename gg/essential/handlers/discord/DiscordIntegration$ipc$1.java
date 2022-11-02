package gg.essential.handlers.discord;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.lib.kdiscordipc.core.socket.*;
import kotlin.*;
import gg.essential.util.kdiscordipc.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
final synthetic class DiscordIntegration$ipc$1 extends FunctionReferenceImpl implements Function0<Socket> {
    DiscordIntegration$ipc$1(final Object receiver) {
        super(0, receiver, (Class)KDiscordIPCLoader.class, "getPlatformSocket", "getPlatformSocket()Ldev/cbyrne/kdiscordipc/core/socket/Socket;", 0);
    }
    
    @NotNull
    public final Socket invoke() {
        return ((KDiscordIPCLoader)this.receiver).getPlatformSocket();
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
}