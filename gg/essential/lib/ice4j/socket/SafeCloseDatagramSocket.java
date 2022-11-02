package gg.essential.lib.ice4j.socket;

import java.util.concurrent.locks.*;
import java.net.*;
import java.io.*;

public class SafeCloseDatagramSocket extends DelegatingDatagramSocket
{
    private final ReadWriteLock receiveCloseLock;
    
    public SafeCloseDatagramSocket() throws SocketException {
        super();
        this.receiveCloseLock = new ReentrantReadWriteLock();
    }
    
    public SafeCloseDatagramSocket(final DatagramSocket delegate) throws SocketException {
        super(delegate);
        this.receiveCloseLock = new ReentrantReadWriteLock();
    }
    
    public SafeCloseDatagramSocket(final int port, final InetAddress laddr) throws SocketException {
        super(port, laddr);
        this.receiveCloseLock = new ReentrantReadWriteLock();
    }
    
    @Override
    public void close() {
        super.close();
        final Lock closeLock = this.receiveCloseLock.writeLock();
        closeLock.lock();
        closeLock.unlock();
    }
    
    @Override
    public void receive(final DatagramPacket p) throws IOException {
        final Lock receiveLock = this.receiveCloseLock.readLock();
        receiveLock.lock();
        try {
            super.receive(p);
        }
        finally {
            receiveLock.unlock();
        }
    }
}
