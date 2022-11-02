package gg.essential.lib.ice4j.socket;

import java.nio.channels.*;
import gg.essential.lib.ice4j.stack.*;
import java.io.*;
import java.net.*;

public class DelegatingDatagramSocket extends DatagramSocket
{
    private static DatagramSocketFactory delegateFactory;
    private static int defaultReceiveBufferSize;
    protected final DatagramSocket delegate;
    private long nbReceivedPackets;
    private long nbSentPackets;
    private boolean closed;
    
    static boolean logNonStun(final long numOfPacket) {
        return numOfPacket == 1L || numOfPacket == 300L || numOfPacket == 500L || numOfPacket == 1000L || numOfPacket % 5000L == 0L;
    }
    
    public DelegatingDatagramSocket() throws SocketException {
        this(null, new InetSocketAddress(0));
    }
    
    public DelegatingDatagramSocket(final DatagramSocket delegate) throws SocketException {
        this(delegate, null);
    }
    
    public DelegatingDatagramSocket(final int port, final InetAddress laddr) throws SocketException {
        this(null, new InetSocketAddress(laddr, port));
    }
    
    public DelegatingDatagramSocket(final DatagramSocket delegate, final SocketAddress address) throws SocketException {
        super((SocketAddress)null);
        this.nbReceivedPackets = 0L;
        this.nbSentPackets = 0L;
        this.closed = false;
        if (delegate != null) {
            this.delegate = delegate;
        }
        else {
            if (DelegatingDatagramSocket.delegateFactory != null) {
                this.delegate = DelegatingDatagramSocket.delegateFactory.createUnboundDatagramSocket();
            }
            else {
                this.delegate = null;
                this.initReceiveBufferSize();
            }
            this.bind(address);
        }
    }
    
    @Override
    public void bind(final SocketAddress addr) throws SocketException {
        if (this.delegate == null) {
            super.bind(addr);
        }
        else {
            this.delegate.bind(addr);
        }
    }
    
    @Override
    public void close() {
        if (this.delegate != null) {
            this.delegate.close();
        }
        super.close();
        this.closed = true;
    }
    
    @Override
    public void connect(final InetAddress address, final int port) {
        if (this.delegate == null) {
            super.connect(address, port);
        }
        else {
            this.delegate.connect(address, port);
        }
    }
    
    @Override
    public void connect(final SocketAddress addr) throws SocketException {
        if (this.delegate == null) {
            super.connect(addr);
        }
        else {
            this.delegate.connect(addr);
        }
    }
    
    @Override
    public void disconnect() {
        if (this.delegate == null) {
            super.disconnect();
        }
        else {
            this.delegate.disconnect();
        }
    }
    
    @Override
    public boolean getBroadcast() throws SocketException {
        return (this.delegate == null) ? super.getBroadcast() : this.delegate.getBroadcast();
    }
    
    @Override
    public DatagramChannel getChannel() {
        return (this.delegate == null) ? super.getChannel() : this.delegate.getChannel();
    }
    
    @Override
    public InetAddress getInetAddress() {
        return (this.delegate == null) ? super.getInetAddress() : this.delegate.getInetAddress();
    }
    
    @Override
    public InetAddress getLocalAddress() {
        return (this.delegate == null) ? super.getLocalAddress() : this.delegate.getLocalAddress();
    }
    
    @Override
    public int getLocalPort() {
        return (this.delegate == null) ? super.getLocalPort() : this.delegate.getLocalPort();
    }
    
    @Override
    public SocketAddress getLocalSocketAddress() {
        return (this.delegate == null) ? super.getLocalSocketAddress() : this.delegate.getLocalSocketAddress();
    }
    
    @Override
    public int getPort() {
        return (this.delegate == null) ? super.getPort() : this.delegate.getPort();
    }
    
    @Override
    public int getReceiveBufferSize() throws SocketException {
        return (this.delegate == null) ? super.getReceiveBufferSize() : this.delegate.getReceiveBufferSize();
    }
    
    @Override
    public SocketAddress getRemoteSocketAddress() {
        return (this.delegate == null) ? super.getRemoteSocketAddress() : this.delegate.getRemoteSocketAddress();
    }
    
    @Override
    public boolean getReuseAddress() throws SocketException {
        return (this.delegate == null) ? super.getReuseAddress() : this.delegate.getReuseAddress();
    }
    
    @Override
    public int getSendBufferSize() throws SocketException {
        return (this.delegate == null) ? super.getSendBufferSize() : this.delegate.getSendBufferSize();
    }
    
    @Override
    public int getSoTimeout() throws SocketException {
        return (this.delegate == null) ? super.getSoTimeout() : this.delegate.getSoTimeout();
    }
    
    @Override
    public int getTrafficClass() throws SocketException {
        return (this.delegate == null) ? super.getTrafficClass() : this.delegate.getTrafficClass();
    }
    
    @Override
    public boolean isBound() {
        return (this.delegate == null) ? super.isBound() : this.delegate.isBound();
    }
    
    @Override
    public boolean isClosed() {
        return this.closed;
    }
    
    @Override
    public boolean isConnected() {
        return (this.delegate == null) ? super.isConnected() : this.delegate.isConnected();
    }
    
    @Override
    public void receive(final DatagramPacket p) throws IOException {
        if (this.delegate == null) {
            final byte[] data = p.getData();
            p.setLength((data == null) ? 0 : (data.length - p.getOffset()));
            super.receive(p);
            if (!StunDatagramPacketFilter.isStunPacket(p)) {
                final long n = this.nbReceivedPackets + 1L;
                this.nbReceivedPackets = n;
                if (!logNonStun(n)) {
                    return;
                }
            }
            StunStack.logPacketToPcap(p, false, this.getLocalAddress(), this.getLocalPort());
        }
        else {
            this.delegate.receive(p);
        }
    }
    
    @Override
    public void send(final DatagramPacket p) throws IOException {
        if (this.delegate == null) {
            try {
                super.send(p);
            }
            catch (final Exception ex) {
                final InetAddress tmpAddr = p.getAddress();
                if ((ex instanceof NoRouteToHostException || (ex.getMessage() != null && ex.getMessage().equals("No route to host"))) && tmpAddr instanceof Inet6Address && tmpAddr.isLinkLocalAddress()) {
                    final Inet6Address newAddr = Inet6Address.getByAddress("", tmpAddr.getAddress(), ((Inet6Address)super.getLocalAddress()).getScopeId());
                    p.setAddress(newAddr);
                    super.send(p);
                }
                else if (ex instanceof IOException) {
                    throw (IOException)ex;
                }
            }
            final long n = this.nbSentPackets + 1L;
            this.nbSentPackets = n;
            if (logNonStun(n)) {
                StunStack.logPacketToPcap(p, true, this.getLocalAddress(), this.getLocalPort());
            }
        }
        else {
            this.delegate.send(p);
        }
    }
    
    @Override
    public void setBroadcast(final boolean on) throws SocketException {
        if (this.delegate == null) {
            super.setBroadcast(on);
        }
        else {
            this.delegate.setBroadcast(on);
        }
    }
    
    @Override
    public void setReceiveBufferSize(final int size) throws SocketException {
        if (this.delegate == null) {
            super.setReceiveBufferSize(size);
        }
        else {
            this.delegate.setReceiveBufferSize(size);
        }
    }
    
    @Override
    public void setReuseAddress(final boolean on) throws SocketException {
        if (this.delegate == null) {
            super.setReuseAddress(on);
        }
        else {
            this.delegate.setReuseAddress(on);
        }
    }
    
    @Override
    public void setSendBufferSize(final int size) throws SocketException {
        if (this.delegate == null) {
            super.setSendBufferSize(size);
        }
        else {
            this.delegate.setSendBufferSize(size);
        }
    }
    
    @Override
    public void setSoTimeout(final int timeout) throws SocketException {
        if (this.delegate == null) {
            super.setSoTimeout(timeout);
        }
        else {
            this.delegate.setSoTimeout(timeout);
        }
    }
    
    @Override
    public void setTrafficClass(final int tc) throws SocketException {
        if (this.delegate == null) {
            super.setTrafficClass(tc);
        }
        else {
            this.delegate.setTrafficClass(tc);
        }
    }
    
    private void initReceiveBufferSize() throws SocketException {
        if (this.delegate == null && DelegatingDatagramSocket.defaultReceiveBufferSize > 0) {
            super.setReceiveBufferSize(DelegatingDatagramSocket.defaultReceiveBufferSize);
        }
    }
    
    static {
        DelegatingDatagramSocket.delegateFactory = null;
        DelegatingDatagramSocket.defaultReceiveBufferSize = -1;
    }
}
