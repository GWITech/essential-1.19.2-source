package gg.essential.lib.ice4j.socket;

import java.util.concurrent.*;
import java.net.*;
import java.io.*;

public class MultiplexingDatagramSocket extends SafeCloseDatagramSocket
{
    private final MultiplexingXXXSocketSupport<MultiplexedDatagramSocket> multiplexingXXXSocketSupport;
    private final SocketReceiveBuffer received;
    private int soTimeout;
    private final boolean persistent;
    
    public MultiplexingDatagramSocket() throws SocketException {
        this(false);
    }
    
    public MultiplexingDatagramSocket(final boolean persistent) throws SocketException {
        super();
        this.multiplexingXXXSocketSupport = (MultiplexingXXXSocketSupport<MultiplexedDatagramSocket>)new MultiplexingDatagramSocket.MultiplexingDatagramSocket$1(this);
        this.received = new SocketReceiveBuffer((Callable)this::getReceiveBufferSize);
        this.soTimeout = 0;
        this.persistent = persistent;
    }
    
    public MultiplexingDatagramSocket(final DatagramSocket delegate) throws SocketException {
        this(delegate, false);
    }
    
    public MultiplexingDatagramSocket(final DatagramSocket delegate, final boolean persistent) throws SocketException {
        super(delegate);
        this.multiplexingXXXSocketSupport = (MultiplexingXXXSocketSupport<MultiplexedDatagramSocket>)new MultiplexingDatagramSocket.MultiplexingDatagramSocket$1(this);
        this.received = new SocketReceiveBuffer((Callable)this::getReceiveBufferSize);
        this.soTimeout = 0;
        this.persistent = persistent;
    }
    
    public MultiplexingDatagramSocket(final int port, final InetAddress laddr) throws SocketException {
        this(port, laddr, false);
    }
    
    public MultiplexingDatagramSocket(final int port, final InetAddress laddr, final boolean persistent) throws SocketException {
        super(port, laddr);
        this.multiplexingXXXSocketSupport = (MultiplexingXXXSocketSupport<MultiplexedDatagramSocket>)new MultiplexingDatagramSocket.MultiplexingDatagramSocket$1(this);
        this.received = new SocketReceiveBuffer((Callable)this::getReceiveBufferSize);
        this.soTimeout = 0;
        this.persistent = persistent;
    }
    
    void close(final MultiplexedDatagramSocket multiplexed) {
        if (!this.multiplexingXXXSocketSupport.close((MultiplexedXXXSocket)multiplexed) && !this.persistent) {
            this.close();
        }
    }
    
    public MultiplexedDatagramSocket getSocket(final DatagramPacketFilter filter) throws SocketException {
        return this.getSocket(filter, true);
    }
    
    public MultiplexedDatagramSocket getSocket(final DatagramPacketFilter filter, final boolean create) throws SocketException {
        return (MultiplexedDatagramSocket)this.multiplexingXXXSocketSupport.getSocket(filter, create);
    }
    
    @Override
    public int getSoTimeout() {
        return this.soTimeout;
    }
    
    private void multiplexingXXXSocketSupportDoReceive(final DatagramPacket p) throws IOException {
        super.receive(p);
    }
    
    private void multiplexingXXXSocketSupportDoSetReceiveBufferSize(final int receiveBufferSize) throws SocketException {
        super.setReceiveBufferSize(receiveBufferSize);
    }
    
    @Override
    public void receive(final DatagramPacket p) throws IOException {
        this.multiplexingXXXSocketSupport.receive(this.received, p, this.soTimeout);
    }
    
    void receive(final MultiplexedDatagramSocket multiplexed, final DatagramPacket p) throws IOException {
        this.multiplexingXXXSocketSupport.receive(multiplexed.received, p, multiplexed.getSoTimeout());
    }
    
    @Override
    public void setReceiveBufferSize(final int receiveBufferSize) throws SocketException {
        this.multiplexingXXXSocketSupport.setReceiveBufferSize(receiveBufferSize);
    }
    
    @Override
    public void setSoTimeout(final int timeout) throws SocketException {
        super.setSoTimeout(timeout);
        this.soTimeout = timeout;
    }
    
    static /* synthetic */ void access$000(final MultiplexingDatagramSocket x0, final DatagramPacket x1) throws IOException {
        x0.multiplexingXXXSocketSupportDoReceive(x1);
    }
    
    static /* synthetic */ void access$100(final MultiplexingDatagramSocket x0, final int x1) throws SocketException {
        x0.multiplexingXXXSocketSupportDoSetReceiveBufferSize(x1);
    }
    
    static /* synthetic */ SocketReceiveBuffer access$200(final MultiplexingDatagramSocket x0) {
        return x0.received;
    }
}
