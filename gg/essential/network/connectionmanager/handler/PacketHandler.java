package gg.essential.network.connectionmanager.handler;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.network.connectionmanager.*;
import org.jetbrains.annotations.*;
import com.sparkuniverse.toolbox.util.*;

public abstract class PacketHandler<IP extends Packet>
{
    protected boolean requiresAuthentication;
    
    public PacketHandler() {
        this(true);
    }
    
    public PacketHandler(final boolean requiresAuthentication) {
        super();
        this.requiresAuthentication = requiresAuthentication;
    }
    
    public void handle(@NotNull final ConnectionManager connectionManager, @NotNull final IP packet) {
        Validate.isTrue(connectionManager.isOpen(), () -> "Attempted to handle a Packet when the Connection Manager Connection was closed ('" + packet + "').", new Object[0]);
        if (this.requiresAuthentication && !connectionManager.isAuthenticated()) {
            return;
        }
        this.onHandle(connectionManager, packet);
    }
    
    protected abstract void onHandle(@NotNull final ConnectionManager p0, @NotNull final IP p1);
    
    private static /* synthetic */ String lambda$handle$0(final Packet packet) {
        return "Attempted to handle a Packet when the Connection Manager Connection was closed ('" + packet + "').";
    }
}
