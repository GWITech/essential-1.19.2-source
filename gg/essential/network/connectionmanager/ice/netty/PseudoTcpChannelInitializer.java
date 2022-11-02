package gg.essential.network.connectionmanager.ice.netty;

import io.netty.channel.local.*;
import gg.essential.lib.ice4j.pseudotcp.*;
import java.util.*;
import java.util.concurrent.*;
import java.io.*;
import io.netty.channel.*;
import org.apache.logging.log4j.*;
import io.netty.buffer.*;
import java.nio.charset.*;

public class PseudoTcpChannelInitializer extends ChannelInitializer<LocalChannel>
{
    private static final Logger LOGGER;
    private static final ByteBuf CLOSE_MARKER;
    private static final ByteBuf CLOSE_PACKET;
    private final PseudoTcpSocket socket;
    private final UUID user;
    
    public PseudoTcpChannelInitializer(final PseudoTcpSocket socket, final UUID user) {
        super();
        this.socket = socket;
        this.user = user;
    }
    
    protected void initChannel(final LocalChannel channel) {
        final LinkedBlockingDeque<ByteBuf> outbound = new LinkedBlockingDeque<ByteBuf>();
        final Thread writer = new Thread(() -> {
            try {
                final OutputStream outputStream = this.socket.getOutputStream();
                while (true) {
                    final ByteBuf buf = outbound.take();
                    if (buf == PseudoTcpChannelInitializer.CLOSE_MARKER) {
                        break;
                    }
                    else {
                        try {
                            buf.readBytes(outputStream, buf.readableBytes());
                        }
                        finally {
                            buf.release();
                        }
                    }
                }
                PseudoTcpChannelInitializer.LOGGER.info("Closing.");
                outputStream.flush();
                PseudoTcpChannelInitializer.CLOSE_PACKET.getBytes(0, outputStream, PseudoTcpChannelInitializer.CLOSE_PACKET.readableBytes());
                outputStream.flush();
                return;
            }
            catch (final IOException | InterruptedException e) {
                if (channel.isOpen()) {
                    e.printStackTrace();
                }
                return;
            }
        });
        writer.setName("netty->pseudotcp (" + this.user);
        writer.setDaemon(true);
        final Thread reader = new Thread(() -> {
            try {
                final InputStream inputStream = this.socket.getInputStream();
                while (channel.isOpen()) {
                    final ByteBuf buf2 = channel.alloc().buffer();
                    try {
                        buf2.writeBytes(inputStream, buf2.writableBytes());
                        if (ByteBufUtil.equals(buf2, PseudoTcpChannelInitializer.CLOSE_PACKET)) {
                            PseudoTcpChannelInitializer.LOGGER.info("Closing.");
                            channel.close();
                        }
                        else {
                            channel.writeAndFlush((Object)buf2.retain());
                        }
                    }
                    finally {
                        buf2.release();
                    }
                }
            }
            catch (final IOException e2) {
                if (channel.isOpen()) {
                    e2.printStackTrace();
                }
            }
            return;
        });
        reader.setName("netty<-pseudotcp (" + this.user);
        reader.setDaemon(true);
        channel.pipeline().addLast(new ChannelHandler[] { (ChannelHandler)new PseudoTcpChannelInitializer.PseudoTcpChannelInitializer$1(this, reader, writer, (LinkedBlockingDeque)outbound) });
    }
    
    protected /* bridge */ void initChannel(final Channel channel) throws Exception {
        this.initChannel((LocalChannel)channel);
    }
    
    private /* synthetic */ void lambda$initChannel$1(final LocalChannel channel) {
        try {
            final InputStream inputStream = this.socket.getInputStream();
            while (channel.isOpen()) {
                final ByteBuf buf = channel.alloc().buffer();
                try {
                    buf.writeBytes(inputStream, buf.writableBytes());
                    if (ByteBufUtil.equals(buf, PseudoTcpChannelInitializer.CLOSE_PACKET)) {
                        PseudoTcpChannelInitializer.LOGGER.info("Closing.");
                        channel.close();
                        return;
                    }
                    channel.writeAndFlush((Object)buf.retain());
                }
                finally {
                    buf.release();
                }
            }
        }
        catch (final IOException e) {
            if (channel.isOpen()) {
                e.printStackTrace();
            }
        }
    }
    
    private /* synthetic */ void lambda$initChannel$0(final LinkedBlockingDeque outbound, final LocalChannel channel) {
        try {
            final OutputStream outputStream = this.socket.getOutputStream();
            while (true) {
                final ByteBuf buf = outbound.take();
                if (buf == PseudoTcpChannelInitializer.CLOSE_MARKER) {
                    break;
                }
                try {
                    buf.readBytes(outputStream, buf.readableBytes());
                }
                finally {
                    buf.release();
                }
            }
            PseudoTcpChannelInitializer.LOGGER.info("Closing.");
            outputStream.flush();
            PseudoTcpChannelInitializer.CLOSE_PACKET.getBytes(0, outputStream, PseudoTcpChannelInitializer.CLOSE_PACKET.readableBytes());
            outputStream.flush();
        }
        catch (final IOException | InterruptedException e) {
            if (channel.isOpen()) {
                e.printStackTrace();
            }
        }
    }
    
    static {
        LOGGER = LogManager.getLogger();
        CLOSE_MARKER = Unpooled.buffer(0, 0);
        CLOSE_PACKET = Unpooled.buffer(16);
        final UUID uuid = UUID.nameUUIDFromBytes("Essential Close Packet".getBytes(StandardCharsets.UTF_8));
        PseudoTcpChannelInitializer.CLOSE_PACKET.writeLong(uuid.getLeastSignificantBits());
        PseudoTcpChannelInitializer.CLOSE_PACKET.writeLong(uuid.getMostSignificantBits());
    }
}
