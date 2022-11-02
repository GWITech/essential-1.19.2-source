package gg.essential.lib.websocket.client;

import javax.net.*;
import gg.essential.lib.websocket.drafts.*;
import gg.essential.lib.websocket.*;
import java.util.concurrent.*;
import java.net.*;
import java.lang.reflect.*;
import java.nio.*;
import java.io.*;
import java.security.*;
import java.util.*;
import gg.essential.lib.websocket.exceptions.*;
import gg.essential.lib.websocket.handshake.*;
import gg.essential.lib.websocket.framing.*;
import javax.net.ssl.*;

public abstract class WebSocketClient extends AbstractWebSocket implements Runnable, WebSocket
{
    protected URI uri;
    private WebSocketImpl engine;
    private Socket socket;
    private SocketFactory socketFactory;
    private OutputStream ostream;
    private Proxy proxy;
    private Thread writeThread;
    private Thread connectReadThread;
    private Draft draft;
    private Map<String, String> headers;
    private CountDownLatch connectLatch;
    private CountDownLatch closeLatch;
    private DnsResolver dnsResolver;
    
    public WebSocketClient(final URI serverUri) {
        this(serverUri, new Draft_6455());
    }
    
    public WebSocketClient(final URI serverUri, final Draft protocolDraft) {
        this(serverUri, protocolDraft, null);
    }
    
    public WebSocketClient(final URI serverUri, final Draft protocolDraft, final Map<String, String> httpHeaders) {
        super();
        this.uri = null;
        this.engine = null;
        this.socket = null;
        this.socketFactory = null;
        this.proxy = Proxy.NO_PROXY;
        this.connectLatch = new CountDownLatch(1);
        this.closeLatch = new CountDownLatch(1);
        this.dnsResolver = null;
        if (serverUri == null) {
            throw new IllegalArgumentException();
        }
        if (protocolDraft == null) {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        }
        this.uri = serverUri;
        this.draft = protocolDraft;
        this.dnsResolver = new DnsResolver() {
            WebSocketClient$1() {
                super();
            }
            
            @Override
            public InetAddress resolve(final URI uri) throws UnknownHostException {
                return InetAddress.getByName(uri.getHost());
            }
        };
        if (httpHeaders != null) {
            (this.headers = new TreeMap<String, String>(String.CASE_INSENSITIVE_ORDER)).putAll(httpHeaders);
        }
        this.setTcpNoDelay(false);
        this.setReuseAddr(false);
        this.engine = new WebSocketImpl(this, protocolDraft);
    }
    
    public URI getURI() {
        return this.uri;
    }
    
    public void setDnsResolver(final DnsResolver dnsResolver) {
        this.dnsResolver = dnsResolver;
    }
    
    public boolean reconnectBlocking() throws InterruptedException {
        this.reset();
        return this.connectBlocking();
    }
    
    private void reset() {
        final Thread current = Thread.currentThread();
        if (current == this.writeThread || current == this.connectReadThread) {
            throw new IllegalStateException("You cannot initialize a reconnect out of the websocket thread. Use reconnect in another thread to ensure a successful cleanup.");
        }
        try {
            this.closeBlocking();
            if (this.writeThread != null) {
                this.writeThread.interrupt();
                this.writeThread = null;
            }
            if (this.connectReadThread != null) {
                this.connectReadThread.interrupt();
                this.connectReadThread = null;
            }
            this.draft.reset();
            if (this.socket != null) {
                this.socket.close();
                this.socket = null;
            }
        }
        catch (final Exception e) {
            this.onError(e);
            this.engine.closeConnection(1006, e.getMessage());
            return;
        }
        this.connectLatch = new CountDownLatch(1);
        this.closeLatch = new CountDownLatch(1);
        this.engine = new WebSocketImpl(this, this.draft);
    }
    
    public void connect() {
        if (this.connectReadThread != null) {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        }
        (this.connectReadThread = new Thread(this)).setName("WebSocketConnectReadThread-" + this.connectReadThread.getId());
        this.connectReadThread.start();
    }
    
    public boolean connectBlocking() throws InterruptedException {
        this.connect();
        this.connectLatch.await();
        return this.engine.isOpen();
    }
    
    public boolean connectBlocking$27c946d(final TimeUnit timeUnit) throws InterruptedException {
        this.connect();
        return this.connectLatch.await(5L, timeUnit) && this.engine.isOpen();
    }
    
    public void close() {
        if (this.writeThread != null) {
            this.engine.close$13462e();
        }
    }
    
    public void closeBlocking() throws InterruptedException {
        this.close();
        this.closeLatch.await();
    }
    
    public void send(final byte[] data) {
        this.engine.send(data);
    }
    
    @Override
    protected Collection<WebSocket> getConnections() {
        return (Collection<WebSocket>)Collections.singletonList(this.engine);
    }
    
    @Override
    public void run() {
        InputStream istream;
        try {
            final boolean upgradeSocketToSSLSocket = this.prepareSocket();
            this.socket.setTcpNoDelay(this.isTcpNoDelay());
            this.socket.setReuseAddress(this.isReuseAddr());
            if (!this.socket.isConnected()) {
                final InetSocketAddress addr = new InetSocketAddress(this.dnsResolver.resolve(this.uri), this.getPort());
                this.socket.connect(addr, 0);
            }
            if (upgradeSocketToSSLSocket && "wss".equals(this.uri.getScheme())) {
                this.upgradeSocketToSSL();
            }
            if (this.socket instanceof SSLSocket) {
                final SSLSocket sslSocket = (SSLSocket)this.socket;
                final SSLParameters sslParameters = sslSocket.getSSLParameters();
                this.onSetSSLParameters(sslParameters);
                sslSocket.setSSLParameters(sslParameters);
            }
            istream = this.socket.getInputStream();
            this.ostream = this.socket.getOutputStream();
            this.sendHandshake();
        }
        catch (final Exception e) {
            this.onWebsocketError$6d401871(e);
            this.engine.closeConnection(-1, e.getMessage());
            return;
        }
        catch (final InternalError e2) {
            if (e2.getCause() instanceof InvocationTargetException && e2.getCause().getCause() instanceof IOException) {
                final IOException cause = (IOException)e2.getCause().getCause();
                this.onWebsocketError$6d401871(cause);
                this.engine.closeConnection(-1, cause.getMessage());
                return;
            }
            throw e2;
        }
        (this.writeThread = new Thread(new WebsocketWriteThread())).start();
        final byte[] rawbuffer = new byte[16384];
        try {
            int readBytes;
            while (!this.isClosing() && !this.isClosed() && (readBytes = istream.read(rawbuffer)) != -1) {
                this.engine.decode(ByteBuffer.wrap(rawbuffer, 0, readBytes));
            }
            this.engine.eot();
        }
        catch (final IOException e3) {
            this.handleIOException(e3);
        }
        catch (final RuntimeException e4) {
            this.onError(e4);
            this.engine.closeConnection(1006, e4.getMessage());
        }
        this.connectReadThread = null;
    }
    
    private void upgradeSocketToSSL() throws NoSuchAlgorithmException, KeyManagementException, IOException {
        SSLSocketFactory factory;
        if (this.socketFactory instanceof SSLSocketFactory) {
            factory = (SSLSocketFactory)this.socketFactory;
        }
        else {
            final SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
            sslContext.init(null, null, null);
            factory = sslContext.getSocketFactory();
        }
        this.socket = factory.createSocket(this.socket, this.uri.getHost(), this.getPort(), true);
    }
    
    private boolean prepareSocket() throws IOException {
        boolean upgradeSocketToSSLSocket = false;
        if (this.proxy != Proxy.NO_PROXY) {
            this.socket = new Socket(this.proxy);
            upgradeSocketToSSLSocket = true;
        }
        else if (this.socketFactory != null) {
            this.socket = this.socketFactory.createSocket();
        }
        else if (this.socket == null) {
            this.socket = new Socket(this.proxy);
            upgradeSocketToSSLSocket = true;
        }
        else if (this.socket.isClosed()) {
            throw new IOException();
        }
        return upgradeSocketToSSLSocket;
    }
    
    protected void onSetSSLParameters(final SSLParameters sslParameters) {
        sslParameters.setEndpointIdentificationAlgorithm("HTTPS");
    }
    
    private int getPort() {
        final int port = this.uri.getPort();
        final String scheme = this.uri.getScheme();
        if ("wss".equals(scheme)) {
            return (port == -1) ? 443 : port;
        }
        if ("ws".equals(scheme)) {
            return (port == -1) ? 80 : port;
        }
        throw new IllegalArgumentException("unknown scheme: " + scheme);
    }
    
    private void sendHandshake() throws InvalidHandshakeException {
        final String part1 = this.uri.getRawPath();
        final String part2 = this.uri.getRawQuery();
        String path;
        if (part1 == null || part1.length() == 0) {
            path = "/";
        }
        else {
            path = part1;
        }
        if (part2 != null) {
            path = path + '?' + part2;
        }
        final int port = this.getPort();
        final String host = this.uri.getHost() + ((port != 80 && port != 443) ? (":" + port) : "");
        final HandshakeImpl1Client handshake = new HandshakeImpl1Client();
        handshake.setResourceDescriptor(path);
        handshake.put("Host", host);
        if (this.headers != null) {
            for (final Map.Entry<String, String> kv : this.headers.entrySet()) {
                handshake.put(kv.getKey(), kv.getValue());
            }
        }
        this.engine.startHandshake(handshake);
    }
    
    @Override
    public final void onWebsocketMessage$1d6d21a6(final ByteBuffer blob) {
        this.onMessage(blob);
    }
    
    @Override
    public final void onWebsocketOpen$56665a9(final Handshakedata handshake) {
        this.startConnectionLostTimer();
        this.onOpen((ServerHandshake)handshake);
        this.connectLatch.countDown();
    }
    
    @Override
    public final void onWebsocketClose$76aa343e(final int code, final String reason, final boolean remote) {
        this.stopConnectionLostTimer();
        if (this.writeThread != null) {
            this.writeThread.interrupt();
        }
        this.onClose(code, reason, remote);
        this.connectLatch.countDown();
        this.closeLatch.countDown();
    }
    
    @Override
    public final void onWebsocketError$6d401871(final Exception ex) {
        this.onError(ex);
    }
    
    public abstract void onOpen(final ServerHandshake p0);
    
    public abstract void onClose(final int p0, final String p1, final boolean p2);
    
    public abstract void onError(final Exception p0);
    
    public void onMessage(final ByteBuffer bytes) {
    }
    
    public void setSocketFactory(final SocketFactory socketFactory) {
        this.socketFactory = socketFactory;
    }
    
    public boolean isOpen() {
        return this.engine.isOpen();
    }
    
    public boolean isClosed() {
        return this.engine.isClosed();
    }
    
    public boolean isClosing() {
        return this.engine.isClosing();
    }
    
    public void close(final int code, final String message) {
        this.engine.close(code, message);
    }
    
    @Override
    public void sendFrame(final Framedata framedata) {
        this.engine.sendFrame(framedata);
    }
    
    private void handleIOException(final IOException e) {
        if (e instanceof SSLException) {
            this.onError(e);
        }
        this.engine.eot();
    }
    
    static /* synthetic */ void access$000(final WebSocketClient x0, final IOException x1) {
        x0.handleIOException(x1);
    }
    
    static /* synthetic */ Thread access$102(final WebSocketClient x0, final Thread x1) {
        return x0.writeThread = x1;
    }
    
    static /* synthetic */ WebSocketImpl access$200(final WebSocketClient x0) {
        return x0.engine;
    }
    
    static /* synthetic */ OutputStream access$300(final WebSocketClient x0) {
        return x0.ostream;
    }
    
    static /* synthetic */ Socket access$400(final WebSocketClient x0) {
        return x0.socket;
    }
    
    private class WebsocketWriteThread implements Runnable
    {
        final /* synthetic */ WebSocketClient this$0;
        
        WebsocketWriteThread(final WebSocketClient this$0) {
            this.this$0 = this$0;
            super();
        }
        
        @Override
        public void run() {
            Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());
            try {
                this.runWriteData();
            }
            catch (final IOException e) {
                WebSocketClient.this.handleIOException(e);
            }
            finally {
                this.closeSocket();
                this.this$0.writeThread = null;
            }
        }
        
        private void runWriteData() throws IOException {
            try {
                while (!Thread.interrupted()) {
                    final ByteBuffer buffer = this.this$0.engine.outQueue.take();
                    this.this$0.ostream.write(buffer.array(), 0, buffer.limit());
                    this.this$0.ostream.flush();
                }
            }
            catch (final InterruptedException ex) {
                for (final ByteBuffer buffer2 : this.this$0.engine.outQueue) {
                    this.this$0.ostream.write(buffer2.array(), 0, buffer2.limit());
                    this.this$0.ostream.flush();
                }
                Thread.currentThread().interrupt();
            }
        }
        
        private void closeSocket() {
            try {
                if (this.this$0.socket != null) {
                    this.this$0.socket.close();
                }
            }
            catch (final IOException ex) {
                this.this$0.onWebsocketError$6d401871(ex);
            }
        }
    }
}
