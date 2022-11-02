package gg.essential.event.network.server;

import net.minecraft.client.network.*;
import org.jetbrains.annotations.*;

public class ServerJoinEvent
{
    @NotNull
    private final ServerInfo serverData;
    
    public ServerJoinEvent(@NotNull final ServerInfo serverData) {
        super();
        this.serverData = serverData;
    }
    
    @NotNull
    public ServerInfo getServerData() {
        return this.serverData;
    }
}
