package gg.essential.handlers.discord.state;

import kotlin.*;
import gg.essential.universal.*;
import gg.essential.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.*;
import gg.essential.network.connectionmanager.sps.*;
import gg.essential.upnp.model.*;
import net.minecraft.client.network.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005""" }, d2 = { "Lgg/essential/handlers/discord/state/GameState$Companion;", "", "()V", "current", "Lgg/essential/handlers/discord/state/GameState;", "essential" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @Nullable
    public final GameState current() {
        final MinecraftClient minecraft = UMinecraft.getMinecraft();
        final SPSManager spsManager2 = Essential.getInstance().getConnectionManager().getSpsManager();
        Intrinsics.checkNotNullExpressionValue((Object)spsManager2, "getInstance().connectionManager.spsManager");
        final SPSManager spsManager = spsManager2;
        final UPnPSession localSession = spsManager.getLocalSession();
        if (minecraft.isConnectedToRealms()) {
            return (GameState)GameState$Realms.INSTANCE;
        }
        if (minecraft.isIntegratedServerRunning()) {
            if (localSession != null) {
                return new SPS.Host(localSession);
            }
            return Singleplayer.INSTANCE;
        }
        else {
            final ServerInfo serverData = minecraft.getCurrentServerEntry();
            if (serverData == null) {
                return null;
            }
            final UPnPSession sessionFromSpsAddress = spsManager.getSessionFromSpsAddress(serverData.address);
            if (sessionFromSpsAddress != null) {
                final UPnPSession it = sessionFromSpsAddress;
                return new SPS.Guest(it);
            }
            final String address = serverData.address;
            Intrinsics.checkNotNullExpressionValue((Object)address, "serverData.address");
            return new Multiplayer(address);
        }
    }
    
    public Companion(final byte b) {
        this();
    }
}
