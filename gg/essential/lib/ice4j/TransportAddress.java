package gg.essential.lib.ice4j;

import java.net.*;
import gg.essential.lib.ice4j.ice.*;

public class TransportAddress extends InetSocketAddress
{
    private final Transport transport;
    
    public TransportAddress(final String hostname, final int port, final Transport transport) {
        super(hostname, port);
        this.transport = transport;
    }
    
    public TransportAddress(final byte[] ipAddress, final int port, final Transport transport) throws UnknownHostException {
        this(InetAddress.getByAddress(ipAddress), port, transport);
    }
    
    public TransportAddress(final InetSocketAddress address, final Transport transport) {
        this(address.getAddress(), address.getPort(), transport);
    }
    
    public TransportAddress(final InetAddress address, final int port, final Transport transport) {
        super(address, port);
        this.transport = transport;
    }
    
    public byte[] getAddressBytes() {
        return this.getAddress().getAddress();
    }
    
    @Override
    public String toString() {
        String hostAddress = this.getHostAddress();
        if (hostAddress == null) {
            hostAddress = this.getHostName();
        }
        final StringBuilder bldr = new StringBuilder(hostAddress);
        if (this.isIPv6()) {
            bldr.insert(0, "[").append("]");
        }
        bldr.append(":").append(this.getPort());
        bldr.append("/").append(this.getTransport());
        return bldr.toString();
    }
    
    public String getHostAddress() {
        final InetAddress addr = this.getAddress();
        String addressStr = (addr != null) ? addr.getHostAddress() : null;
        if (addr instanceof Inet6Address) {
            addressStr = NetworkUtils.stripScopeID(addressStr);
        }
        return addressStr;
    }
    
    public Transport getTransport() {
        return this.transport;
    }
    
    public boolean equals(final TransportAddress transportAddress) {
        return this.equalsTransportAddress(transportAddress);
    }
    
    public boolean equalsTransportAddress(final Object obj) {
        return super.equals(obj) && ((TransportAddress)obj).getTransport() == this.getTransport();
    }
    
    public boolean isIPv6() {
        return this.getAddress() instanceof Inet6Address;
    }
    
    public boolean canReach(final TransportAddress dst) {
        if (this.getTransport() != dst.getTransport()) {
            return false;
        }
        if (this.isIPv6() != dst.isIPv6()) {
            return false;
        }
        if (this.isIPv6()) {
            final Inet6Address srcAddr = (Inet6Address)this.getAddress();
            final Inet6Address dstAddr = (Inet6Address)dst.getAddress();
            if (srcAddr.isLinkLocalAddress() != dstAddr.isLinkLocalAddress()) {
                return Boolean.getBoolean("gg.essential.lib.ice4j.ALLOW_LINK_TO_GLOBAL_REACHABILITY");
            }
        }
        return true;
    }
}
