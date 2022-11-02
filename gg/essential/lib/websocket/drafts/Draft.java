package gg.essential.lib.websocket.drafts;

import java.nio.*;
import gg.essential.lib.websocket.util.*;
import gg.essential.lib.websocket.handshake.*;
import gg.essential.lib.websocket.framing.*;
import gg.essential.lib.websocket.*;
import gg.essential.lib.websocket.exceptions.*;
import java.util.*;
import gg.essential.lib.websocket.enums.*;

public abstract class Draft
{
    protected Role role;
    
    public Draft() {
        super();
        this.role = null;
    }
    
    public static ByteBuffer readLine(final ByteBuffer buf) {
        final ByteBuffer sbuf = ByteBuffer.allocate(buf.remaining());
        byte cur = 48;
        while (buf.hasRemaining()) {
            final byte prev = cur;
            cur = buf.get();
            sbuf.put(cur);
            if (prev == 13 && cur == 10) {
                sbuf.limit(sbuf.position() - 2);
                sbuf.position(0);
                return sbuf;
            }
        }
        buf.position(buf.position() - sbuf.position());
        return null;
    }
    
    public static String readStringLine(final ByteBuffer buf) {
        final ByteBuffer b = readLine(buf);
        return (b == null) ? null : Charsetfunctions.stringAscii$55a39fc4(b.array(), b.limit());
    }
    
    public static HandshakeBuilder translateHandshakeHttp(final ByteBuffer buf, final Role role) throws InvalidHandshakeException {
        String line = readStringLine(buf);
        if (line == null) {
            throw new IncompleteHandshakeException(buf.capacity() + 128);
        }
        final String[] firstLineTokens = line.split(" ", 3);
        if (firstLineTokens.length != 3) {
            throw new InvalidHandshakeException();
        }
        HandshakeBuilder handshake;
        if (role == Role.CLIENT) {
            handshake = translateHandshakeHttpClient(firstLineTokens, line);
        }
        else {
            handshake = translateHandshakeHttpServer(firstLineTokens, line);
        }
        for (line = readStringLine(buf); line != null && line.length() > 0; line = readStringLine(buf)) {
            final String[] pair = line.split(":", 2);
            if (pair.length != 2) {
                throw new InvalidHandshakeException("not an http header");
            }
            if (handshake.hasFieldValue(pair[0])) {
                handshake.put(pair[0], handshake.getFieldValue(pair[0]) + "; " + pair[1].replaceFirst("^ +", ""));
            }
            else {
                handshake.put(pair[0], pair[1].replaceFirst("^ +", ""));
            }
        }
        if (line == null) {
            throw new IncompleteHandshakeException();
        }
        return handshake;
    }
    
    private static HandshakeBuilder translateHandshakeHttpServer(final String[] firstLineTokens, final String line) throws InvalidHandshakeException {
        if (!"GET".equalsIgnoreCase(firstLineTokens[0])) {
            throw new InvalidHandshakeException(String.format("Invalid request method received: %s Status line: %s", firstLineTokens[0], line));
        }
        if (!"HTTP/1.1".equalsIgnoreCase(firstLineTokens[2])) {
            throw new InvalidHandshakeException(String.format("Invalid status line received: %s Status line: %s", firstLineTokens[2], line));
        }
        final ClientHandshakeBuilder clienthandshake = new HandshakeImpl1Client();
        clienthandshake.setResourceDescriptor(firstLineTokens[1]);
        return clienthandshake;
    }
    
    private static HandshakeBuilder translateHandshakeHttpClient(final String[] firstLineTokens, final String line) throws InvalidHandshakeException {
        if (!"101".equals(firstLineTokens[1])) {
            throw new InvalidHandshakeException(String.format("Invalid status code received: %s Status line: %s", firstLineTokens[1], line));
        }
        if (!"HTTP/1.1".equalsIgnoreCase(firstLineTokens[0])) {
            throw new InvalidHandshakeException(String.format("Invalid status line received: %s Status line: %s", firstLineTokens[0], line));
        }
        final HandshakeBuilder handshake = new HandshakeImpl1Server();
        final ServerHandshakeBuilder serverhandshake = (ServerHandshakeBuilder)handshake;
        serverhandshake.setHttpStatus(Short.parseShort(firstLineTokens[1]));
        serverhandshake.setHttpStatusMessage(firstLineTokens[2]);
        return handshake;
    }
    
    public abstract HandshakeState acceptHandshakeAsClient(final ClientHandshake p0, final ServerHandshake p1) throws InvalidHandshakeException;
    
    public abstract HandshakeState acceptHandshakeAsServer(final ClientHandshake p0) throws InvalidHandshakeException;
    
    protected boolean basicAccept(final Handshakedata handshakedata) {
        return handshakedata.getFieldValue("Upgrade").equalsIgnoreCase("websocket") && handshakedata.getFieldValue("Connection").toLowerCase(Locale.ENGLISH).contains("upgrade");
    }
    
    public abstract ByteBuffer createBinaryFrame(final Framedata p0);
    
    public abstract List<Framedata> createFrames(final ByteBuffer p0, final boolean p1);
    
    public abstract void processFrame(final WebSocketImpl p0, final Framedata p1) throws InvalidDataException;
    
    public abstract void reset();
    
    public List<ByteBuffer> createHandshake(final Handshakedata handshakedata) {
        return this.createHandshake$2d9f3f98(handshakedata);
    }
    
    public List<ByteBuffer> createHandshake$2d9f3f98(final Handshakedata handshakedata) {
        final StringBuilder bui = new StringBuilder(100);
        if (handshakedata instanceof ClientHandshake) {
            bui.append("GET ").append(((ClientHandshake)handshakedata).getResourceDescriptor()).append(" HTTP/1.1");
        }
        else {
            if (!(handshakedata instanceof ServerHandshake)) {
                throw new IllegalArgumentException("unknown role");
            }
            bui.append("HTTP/1.1 101 ").append(((ServerHandshake)handshakedata).getHttpStatusMessage());
        }
        bui.append("\r\n");
        final Iterator<String> it = handshakedata.iterateHttpFields();
        while (it.hasNext()) {
            final String fieldname = it.next();
            final String fieldvalue = handshakedata.getFieldValue(fieldname);
            bui.append(fieldname);
            bui.append(": ");
            bui.append(fieldvalue);
            bui.append("\r\n");
        }
        bui.append("\r\n");
        final byte[] httpheader = Charsetfunctions.asciiBytes(bui.toString());
        final byte[] content = handshakedata.getContent();
        final ByteBuffer bytebuffer = ByteBuffer.allocate(((content == null) ? 0 : content.length) + httpheader.length);
        bytebuffer.put(httpheader);
        if (content != null) {
            bytebuffer.put(content);
        }
        bytebuffer.flip();
        return Collections.singletonList(bytebuffer);
    }
    
    public abstract ClientHandshakeBuilder postProcessHandshakeRequestAsClient(final ClientHandshakeBuilder p0) throws InvalidHandshakeException;
    
    public abstract HandshakeBuilder postProcessHandshakeResponseAsServer(final ClientHandshake p0, final ServerHandshakeBuilder p1) throws InvalidHandshakeException;
    
    public abstract List<Framedata> translateFrame(final ByteBuffer p0) throws InvalidDataException;
    
    public abstract CloseHandshakeType getCloseHandshakeType();
    
    public abstract Draft copyInstance();
    
    public Handshakedata translateHandshake(final ByteBuffer buf) throws InvalidHandshakeException {
        return translateHandshakeHttp(buf, this.role);
    }
    
    public int checkAlloc(final int bytecount) throws InvalidDataException {
        if (bytecount < 0) {
            throw new InvalidDataException(1002, "Negative count");
        }
        return bytecount;
    }
    
    int readVersion(final Handshakedata handshakedata) {
        final String vers = handshakedata.getFieldValue("Sec-WebSocket-Version");
        if (vers.length() > 0) {
            try {
                final int v = new Integer(vers.trim());
                return v;
            }
            catch (final NumberFormatException ex) {
                return -1;
            }
        }
        return -1;
    }
    
    public void setParseMode(final Role role) {
        this.role = role;
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}
