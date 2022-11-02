package gg.essential.network.connectionmanager.serverdiscovery;

import gg.essential.serverdiscovery.model.*;
import gg.essential.network.connectionmanager.*;
import com.google.common.collect.*;
import gg.essential.network.connectionmanager.serverdiscovery.handler.*;
import gg.essential.network.connectionmanager.handler.*;
import java.util.*;
import org.jetbrains.annotations.*;
import gg.essential.util.*;
import gg.essential.connectionmanager.common.packet.serverdiscovery.*;
import gg.essential.connectionmanager.common.packet.*;

public class ServerDiscoveryManager implements NetworkedManager, Iterable<ServerDiscovery>
{
    @NotNull
    private final Map<String, ServerDiscovery> servers;
    private Map<String, ServerDiscovery> serversByAddress;
    private final ConnectionManager connectionManager;
    
    public ServerDiscoveryManager(@NotNull final ConnectionManager connectionManager) {
        super();
        this.servers = (Map<String, ServerDiscovery>)Maps.newConcurrentMap();
        (this.connectionManager = connectionManager).registerPacketHandler(ServerServerDiscoveryPopulatePacket.class, new ServerServerDiscoveryPopulatePacketHandler(this));
    }
    
    @NotNull
    public Map<String, ServerDiscovery> getServers() {
        return this.servers;
    }
    
    public void addServers(@NotNull final Collection<ServerDiscovery> servers) {
        for (final ServerDiscovery serverDiscovery : servers) {
            this.addServer(serverDiscovery);
        }
    }
    
    public void addServer(@NotNull final ServerDiscovery serverDiscovery) {
        this.servers.put(serverDiscovery.getId(), serverDiscovery);
        this.serversByAddress = null;
    }
    
    @NotNull
    @Override
    public Iterator<ServerDiscovery> iterator() {
        return this.servers.values().iterator();
    }
    
    @Nullable
    public ServerDiscovery findServerByAddress(final String address) {
        if (this.serversByAddress == null) {
            this.serversByAddress = (Map<String, ServerDiscovery>)Maps.newHashMap();
            for (final ServerDiscovery server : this.servers.values()) {
                for (final String serverAddress : server.getAddresses()) {
                    this.serversByAddress.put(serverAddress, server);
                }
            }
        }
        final ServerDiscovery exactMatch = this.serversByAddress.get(address);
        if (exactMatch != null) {
            return exactMatch;
        }
        String trimmedAddress = address;
        int subdomainLength;
        while ((subdomainLength = trimmedAddress.indexOf(46)) != -1) {
            trimmedAddress = trimmedAddress.substring(subdomainLength + 1);
            final ServerDiscovery wildcardMatch = this.serversByAddress.get("*." + trimmedAddress);
            if (wildcardMatch != null) {
                this.serversByAddress.put(address, wildcardMatch);
                return wildcardMatch;
            }
        }
        return null;
    }
    
    @NotNull
    public String normalizeAddress(@NotNull final String address) {
        final ServerDiscovery serverDiscovery = this.findServerByAddress(address);
        return (serverDiscovery != null) ? serverDiscovery.getAddresses().get(0) : address;
    }
    
    @Override
    public void onConnected() {
        this.resetState();
        this.connectionManager.send(new ClientServerDiscoveryRequestPopulatePacket(MinecraftUtils.getCurrentProtocolVersion()));
    }
    
    @Override
    public void resetState() {
        this.servers.clear();
        this.serversByAddress = null;
    }
}
