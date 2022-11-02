package gg.essential.lib.websocket;

import java.nio.*;
import java.nio.channels.*;
import gg.essential.lib.websocket.drafts.*;
import org.slf4j.*;
import java.util.concurrent.*;
import gg.essential.lib.websocket.util.*;
import gg.essential.lib.websocket.enums.*;
import java.io.*;
import gg.essential.lib.websocket.exceptions.*;
import java.util.*;
import gg.essential.lib.websocket.framing.*;
import gg.essential.lib.websocket.handshake.*;

public class WebSocketImpl implements WebSocket
{
    private final Logger log;
    public final BlockingQueue<ByteBuffer> outQueue;
    private final WebSocketListener wsl;
    private SelectionKey key;
    private ByteChannel channel;
    private boolean flushandclosestate;
    private volatile ReadyState readyState;
    private List<Draft> knownDrafts;
    private Draft draft;
    private Role role;
    private ByteBuffer tmpHandshakeBytes;
    private ClientHandshake handshakerequest;
    private String closemessage;
    private Integer closecode;
    private Boolean closedremotely;
    private String resourceDescriptor;
    private long lastPong;
    private final Object synchronizeWriteObject;
    static final /* synthetic */ boolean $assertionsDisabled;
    
    public WebSocketImpl(final WebSocketListener listener, final Draft draft) {
        super();
        this.log = LoggerFactory.getLogger(WebSocketImpl.class);
        this.flushandclosestate = false;
        this.readyState = ReadyState.NOT_YET_CONNECTED;
        this.draft = null;
        this.tmpHandshakeBytes = ByteBuffer.allocate(0);
        this.handshakerequest = null;
        this.closemessage = null;
        this.closecode = null;
        this.closedremotely = null;
        this.resourceDescriptor = null;
        this.lastPong = System.nanoTime();
        this.synchronizeWriteObject = new Object();
        if (draft == null && this.role == Role.SERVER) {
            throw new IllegalArgumentException("parameters must not be null");
        }
        this.outQueue = new LinkedBlockingQueue<ByteBuffer>();
        new LinkedBlockingQueue();
        this.wsl = listener;
        this.role = Role.CLIENT;
        if (draft != null) {
            this.draft = draft.copyInstance();
        }
    }
    
    public void decode(final ByteBuffer socketBuffer) {
        assert socketBuffer.hasRemaining();
        this.log.trace("process({}): ({})", (Object)socketBuffer.remaining(), (socketBuffer.remaining() > 1000) ? "too big to display" : new String(socketBuffer.array(), socketBuffer.position(), socketBuffer.remaining()));
        if (this.readyState != ReadyState.NOT_YET_CONNECTED) {
            if (this.readyState == ReadyState.OPEN) {
                this.decodeFrames(socketBuffer);
            }
        }
        else if (this.decodeHandshake(socketBuffer) && !this.isClosing() && !this.isClosed()) {
            assert !socketBuffer.hasRemaining();
            if (socketBuffer.hasRemaining()) {
                this.decodeFrames(socketBuffer);
            }
            else if (this.tmpHandshakeBytes.hasRemaining()) {
                this.decodeFrames(this.tmpHandshakeBytes);
            }
        }
    }
    
    private boolean decodeHandshake(final ByteBuffer socketBufferNew) {
        ByteBuffer socketBuffer;
        if (this.tmpHandshakeBytes.capacity() == 0) {
            socketBuffer = socketBufferNew;
        }
        else {
            if (this.tmpHandshakeBytes.remaining() < socketBufferNew.remaining()) {
                final ByteBuffer buf = ByteBuffer.allocate(this.tmpHandshakeBytes.capacity() + socketBufferNew.remaining());
                this.tmpHandshakeBytes.flip();
                buf.put(this.tmpHandshakeBytes);
                this.tmpHandshakeBytes = buf;
            }
            this.tmpHandshakeBytes.put(socketBufferNew);
            this.tmpHandshakeBytes.flip();
            socketBuffer = this.tmpHandshakeBytes;
        }
        socketBuffer.mark();
        try {
            try {
                if (this.role == Role.SERVER) {
                    if (this.draft == null) {
                        for (Draft d : this.knownDrafts) {
                            d = d.copyInstance();
                            try {
                                d.setParseMode(this.role);
                                socketBuffer.reset();
                                final Handshakedata tmphandshake = d.translateHandshake(socketBuffer);
                                if (!(tmphandshake instanceof ClientHandshake)) {
                                    this.log.trace("Closing due to wrong handshake");
                                    this.closeConnectionDueToWrongHandshake(new InvalidDataException(1002, "wrong http function"));
                                    return false;
                                }
                                final ClientHandshake handshake = (ClientHandshake)tmphandshake;
                                final HandshakeState handshakestate = d.acceptHandshakeAsServer(handshake);
                                if (handshakestate == HandshakeState.MATCHED) {
                                    this.resourceDescriptor = handshake.getResourceDescriptor();
                                    ServerHandshakeBuilder response;
                                    try {
                                        response = this.wsl.onWebsocketHandshakeReceivedAsServer$3e88c659();
                                    }
                                    catch (final InvalidDataException e) {
                                        this.log.trace("Closing due to wrong handshake. Possible handshake rejection", e);
                                        this.closeConnectionDueToWrongHandshake(e);
                                        return false;
                                    }
                                    catch (final RuntimeException e2) {
                                        this.log.error("Closing due to internal server error", e2);
                                        this.wsl.onWebsocketError$6d401871(e2);
                                        this.closeConnectionDueToInternalServerError(e2);
                                        return false;
                                    }
                                    this.write(d.createHandshake(d.postProcessHandshakeResponseAsServer(handshake, response)));
                                    this.draft = d;
                                    this.open(handshake);
                                    return true;
                                }
                                continue;
                            }
                            catch (final InvalidHandshakeException ex) {}
                        }
                        if (this.draft == null) {
                            this.log.trace("Closing due to protocol error: no draft matches");
                            this.closeConnectionDueToWrongHandshake(new InvalidDataException(1002, "no draft matches"));
                        }
                        return false;
                    }
                    final Handshakedata tmphandshake2 = this.draft.translateHandshake(socketBuffer);
                    if (!(tmphandshake2 instanceof ClientHandshake)) {
                        this.log.trace("Closing due to protocol error: wrong http function");
                        this.flushAndClose(1002, "wrong http function", false);
                        return false;
                    }
                    final ClientHandshake handshake2 = (ClientHandshake)tmphandshake2;
                    final HandshakeState handshakestate = this.draft.acceptHandshakeAsServer(handshake2);
                    if (handshakestate == HandshakeState.MATCHED) {
                        this.open(handshake2);
                        return true;
                    }
                    this.log.trace("Closing due to protocol error: the handshake did finally not match");
                    this.close(1002, "the handshake did finally not match");
                    return false;
                }
                else if (this.role == Role.CLIENT) {
                    this.draft.setParseMode(this.role);
                    final Handshakedata tmphandshake2 = this.draft.translateHandshake(socketBuffer);
                    if (!(tmphandshake2 instanceof ServerHandshake)) {
                        this.log.trace("Closing due to protocol error: wrong http function");
                        this.flushAndClose(1002, "wrong http function", false);
                        return false;
                    }
                    final ServerHandshake handshake3 = (ServerHandshake)tmphandshake2;
                    final HandshakeState handshakestate = this.draft.acceptHandshakeAsClient(this.handshakerequest, handshake3);
                    if (handshakestate == HandshakeState.MATCHED) {
                        this.open(handshake3);
                        return true;
                    }
                    this.log.trace("Closing due to protocol error: draft {} refuses handshake", this.draft);
                    this.close(1002, "draft " + this.draft + " refuses handshake");
                }
            }
            catch (final InvalidHandshakeException e3) {
                this.log.trace("Closing due to invalid handshake", e3);
                this.close(e3);
            }
        }
        catch (final IncompleteHandshakeException e4) {
            if (this.tmpHandshakeBytes.capacity() == 0) {
                socketBuffer.reset();
                int newsize = e4.getPreferredSize();
                if (newsize == 0) {
                    newsize = socketBuffer.capacity() + 16;
                }
                else {
                    assert e4.getPreferredSize() >= socketBuffer.remaining();
                }
                (this.tmpHandshakeBytes = ByteBuffer.allocate(newsize)).put(socketBufferNew);
            }
            else {
                this.tmpHandshakeBytes.position(this.tmpHandshakeBytes.limit());
                this.tmpHandshakeBytes.limit(this.tmpHandshakeBytes.capacity());
            }
        }
        return false;
    }
    
    private void decodeFrames(final ByteBuffer socketBuffer) {
        try {
            final List<Framedata> frames = this.draft.translateFrame(socketBuffer);
            for (final Framedata f : frames) {
                this.log.trace("matched frame: {}", f);
                this.draft.processFrame(this, f);
            }
        }
        catch (final LimitExceededException e) {
            if (e.getLimit() == Integer.MAX_VALUE) {
                this.log.error("Closing due to invalid size of frame", e);
                this.wsl.onWebsocketError$6d401871(e);
            }
            this.close(e);
        }
        catch (final InvalidDataException e2) {
            this.log.error("Closing due to invalid data in frame", e2);
            this.wsl.onWebsocketError$6d401871(e2);
            this.close(e2);
        }
    }
    
    private void closeConnectionDueToWrongHandshake(final InvalidDataException exception) {
        this.write(this.generateHttpResponseDueToError(404));
        this.flushAndClose(exception.getCloseCode(), exception.getMessage(), false);
    }
    
    private void closeConnectionDueToInternalServerError(final RuntimeException exception) {
        this.write(this.generateHttpResponseDueToError(500));
        this.flushAndClose(-1, exception.getMessage(), false);
    }
    
    private ByteBuffer generateHttpResponseDueToError(final int errorCode) {
        String errorCodeDescription = null;
        switch (errorCode) {
            case 404: {
                errorCodeDescription = "404 WebSocket Upgrade Failure";
                break;
            }
            default: {
                errorCodeDescription = "500 Internal Server Error";
                break;
            }
        }
        return ByteBuffer.wrap(Charsetfunctions.asciiBytes("HTTP/1.1 " + errorCodeDescription + "\r\nContent-Type: text/html\r\nServer: TooTallNate Java-WebSocket\r\nContent-Length: " + (48 + errorCodeDescription.length()) + "\r\n\r\n<html><head></head><body><h1>" + errorCodeDescription + "</h1></body></html>"));
    }
    
    public synchronized void close(final int code, final String message, final boolean remote) {
        if (this.readyState != ReadyState.CLOSING && this.readyState != ReadyState.CLOSED) {
            if (this.readyState == ReadyState.OPEN) {
                if (code == 1006) {
                    assert !remote;
                    this.readyState = ReadyState.CLOSING;
                    this.flushAndClose(code, message, false);
                    return;
                }
                else {
                    if (this.draft.getCloseHandshakeType() != CloseHandshakeType.NONE) {
                        try {
                            if (this.isOpen()) {
                                final CloseFrame closeFrame = new CloseFrame();
                                closeFrame.setReason(message);
                                closeFrame.setCode(code);
                                closeFrame.isValid();
                                this.sendFrame(closeFrame);
                            }
                        }
                        catch (final InvalidDataException e) {
                            this.log.error("generated frame is invalid", e);
                            this.wsl.onWebsocketError$6d401871(e);
                            this.flushAndClose(1006, "generated frame is invalid", false);
                        }
                    }
                    this.flushAndClose(code, message, remote);
                }
            }
            else if (code == -3) {
                assert remote;
                this.flushAndClose(-3, message, true);
            }
            else if (code == 1002) {
                this.flushAndClose(code, message, remote);
            }
            else {
                this.flushAndClose(-1, message, false);
            }
            this.readyState = ReadyState.CLOSING;
            this.tmpHandshakeBytes = null;
        }
    }
    
    public void close(final int code, final String message) {
        this.close(code, message, false);
    }
    
    public synchronized void closeConnection(final int code, final String message, final boolean remote) {
        if (this.readyState == ReadyState.CLOSED) {
            return;
        }
        if (this.readyState == ReadyState.OPEN && code == 1006) {
            this.readyState = ReadyState.CLOSING;
        }
        if (this.key != null) {
            this.key.cancel();
        }
        if (this.channel != null) {
            try {
                this.channel.close();
            }
            catch (final IOException e) {
                if (e.getMessage() != null && e.getMessage().equals("Broken pipe")) {
                    this.log.trace("Caught IOException: Broken pipe during closeConnection()", e);
                }
                else {
                    this.log.error("Exception during channel.close()", e);
                    this.wsl.onWebsocketError$6d401871(e);
                }
            }
        }
        try {
            this.wsl.onWebsocketClose$76aa343e(code, message, remote);
        }
        catch (final RuntimeException e2) {
            this.wsl.onWebsocketError$6d401871(e2);
        }
        if (this.draft != null) {
            this.draft.reset();
        }
        this.handshakerequest = null;
        this.readyState = ReadyState.CLOSED;
    }
    
    protected void closeConnection$2563266(final int code) {
        this.closeConnection(code, "", true);
    }
    
    public void closeConnection(final int code, final String message) {
        this.closeConnection(code, message, false);
    }
    
    public synchronized void flushAndClose(final int code, final String message, final boolean remote) {
        if (this.flushandclosestate) {
            return;
        }
        this.closecode = code;
        this.closemessage = message;
        this.closedremotely = remote;
        this.flushandclosestate = true;
        if (this.draft != null) {
            this.draft.reset();
        }
        this.handshakerequest = null;
    }
    
    public void eot() {
        if (this.readyState == ReadyState.NOT_YET_CONNECTED) {
            this.closeConnection$2563266(-1);
        }
        else if (this.flushandclosestate) {
            this.closeConnection(this.closecode, this.closemessage, this.closedremotely);
        }
        else if (this.draft.getCloseHandshakeType() == CloseHandshakeType.NONE) {
            this.closeConnection$2563266(1000);
        }
        else if (this.draft.getCloseHandshakeType() == CloseHandshakeType.ONEWAY) {
            if (this.role == Role.SERVER) {
                this.closeConnection$2563266(1006);
            }
            else {
                this.closeConnection$2563266(1000);
            }
        }
        else {
            this.closeConnection$2563266(1006);
        }
    }
    
    public void close$13462e() {
        this.close(1000, "", false);
    }
    
    public void close(final InvalidDataException e) {
        this.close(e.getCloseCode(), e.getMessage(), false);
    }
    
    public void send(final ByteBuffer bytes) {
        if (bytes == null) {
            throw new IllegalArgumentException("Cannot send 'null' data to a WebSocketImpl.");
        }
        this.send(this.draft.createFrames(bytes, this.role == Role.CLIENT));
    }
    
    public void send(final byte[] bytes) {
        this.send(ByteBuffer.wrap(bytes));
    }
    
    private void send(final Collection<Framedata> frames) {
        if (!this.isOpen()) {
            throw new WebsocketNotConnectedException();
        }
        if (frames == null) {
            throw new IllegalArgumentException();
        }
        final ArrayList<ByteBuffer> outgoingFrames = new ArrayList<ByteBuffer>();
        for (final Framedata f : frames) {
            this.log.trace("send frame: {}", f);
            outgoingFrames.add(this.draft.createBinaryFrame(f));
        }
        this.write(outgoingFrames);
    }
    
    @Override
    public void sendFrame(final Framedata framedata) {
        this.send(Collections.singletonList(framedata));
    }
    
    public void sendPing() throws NullPointerException {
        final PingFrame pingFrame = this.wsl.onPreparePing$52d00a6e();
        if (pingFrame == null) {
            throw new NullPointerException("onPreparePing(WebSocket) returned null. PingFrame to sent can't be null.");
        }
        this.sendFrame(pingFrame);
    }
    
    public void startHandshake(final ClientHandshakeBuilder handshakedata) throws InvalidHandshakeException {
        this.handshakerequest = this.draft.postProcessHandshakeRequestAsClient(handshakedata);
        this.resourceDescriptor = handshakedata.getResourceDescriptor();
        assert this.resourceDescriptor != null;
        this.write(this.draft.createHandshake(this.handshakerequest));
    }
    
    private void write(final ByteBuffer buf) {
        this.log.trace("write({}): {}", (Object)buf.remaining(), (buf.remaining() > 1000) ? "too big to display" : new String(buf.array()));
        this.outQueue.add(buf);
    }
    
    private void write(final List<ByteBuffer> bufs) {
        synchronized (this.synchronizeWriteObject) {
            for (final ByteBuffer b : bufs) {
                this.write(b);
            }
        }
    }
    
    private void open(final Handshakedata d) {
        this.log.trace("open using draft: {}", this.draft);
        this.readyState = ReadyState.OPEN;
        try {
            this.wsl.onWebsocketOpen$56665a9(d);
        }
        catch (final RuntimeException e) {
            this.wsl.onWebsocketError$6d401871(e);
        }
    }
    
    public boolean isOpen() {
        return this.readyState == ReadyState.OPEN;
    }
    
    public boolean isClosing() {
        return this.readyState == ReadyState.CLOSING;
    }
    
    public boolean isClosed() {
        return this.readyState == ReadyState.CLOSED;
    }
    
    public ReadyState getReadyState() {
        return this.readyState;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    long getLastPong() {
        return this.lastPong;
    }
    
    public void updateLastPong() {
        this.lastPong = System.nanoTime();
    }
    
    public WebSocketListener getWebSocketListener() {
        return this.wsl;
    }
    
    static {
        $assertionsDisabled = !WebSocketImpl.class.desiredAssertionStatus();
    }
}
