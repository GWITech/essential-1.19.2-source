package gg.essential.network.connectionmanager.ice.netty;

import io.netty.channel.local.*;
import gg.essential.quic.*;
import gg.essential.sps.quic.*;
import java.util.*;
import java.util.concurrent.*;
import java.io.*;
import io.netty.channel.*;
import org.apache.logging.log4j.*;
import io.netty.buffer.*;

public class QuicStreamChannelInitializer extends ChannelInitializer<LocalChannel>
{
    private static final Logger LOGGER;
    private static final ByteBuf CLOSE_MARKER;
    private final LogOnce debugOnce;
    private final QuicStream quicStream;
    private final UUID user;
    
    public QuicStreamChannelInitializer(final QuicStream quicStream, final UUID user) {
        super();
        this.quicStream = quicStream;
        this.user = user;
        this.debugOnce = LogOnce.to(s -> QuicStreamChannelInitializer.LOGGER.debug("[{}] {}", (Object)user, (Object)s));
    }
    
    protected void initChannel(final LocalChannel channel) {
        this.debugOnce.log("initChannel", (Object)channel);
        final LinkedBlockingDeque<ByteBuf> outbound = new LinkedBlockingDeque<ByteBuf>();
        final Thread writer = new Thread(() -> {
            try {
                final OutputStream outputStream = this.quicStream.getOutputStream();
                while (true) {
                    final ByteBuf buf = outbound.take();
                    this.debugOnce.log("writer", (Object)buf);
                    if (buf == QuicStreamChannelInitializer.CLOSE_MARKER) {
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
                QuicStreamChannelInitializer.LOGGER.info("Closing.");
                outputStream.close();
                return;
            }
            catch (final IOException | InterruptedException e) {
                this.debugOnce.log("writerException", (Object)e);
                if (channel.isOpen()) {
                    e.printStackTrace();
                }
                return;
            }
        });
        writer.setName("netty->quic (" + this.user);
        writer.setDaemon(true);
        final Thread reader = new Thread(() -> {
            try {
                final InputStream inputStream = this.quicStream.getInputStream();
                while (channel.isOpen()) {
                    final ByteBuf buf2 = channel.alloc().buffer();
                    try {
                        if (buf2.writeBytes(inputStream, buf2.writableBytes()) <= 0) {
                            QuicStreamChannelInitializer.LOGGER.info("Closing.");
                            channel.close();
                        }
                        else {
                            this.debugOnce.log("reader", (Object)buf2);
                            channel.writeAndFlush((Object)buf2.retain());
                        }
                    }
                    finally {
                        buf2.release();
                    }
                }
            }
            catch (final IOException e2) {
                this.debugOnce.log("readerException", (Object)e2);
                if (channel.isOpen()) {
                    e2.printStackTrace();
                }
            }
            return;
        });
        reader.setName("netty<-quic (" + this.user);
        reader.setDaemon(true);
        channel.pipeline().addLast(new ChannelHandler[] { (ChannelHandler)new QuicStreamChannelInitializer.QuicStreamChannelInitializer$1(this, reader, writer, (LinkedBlockingDeque)outbound) });
    }
    
    protected /* bridge */ void initChannel(final Channel channel) throws Exception {
        this.initChannel((LocalChannel)channel);
    }
    
    private /* synthetic */ void lambda$initChannel$2(final LocalChannel channel) {
        try {
            final InputStream inputStream = this.quicStream.getInputStream();
            while (channel.isOpen()) {
                final ByteBuf buf = channel.alloc().buffer();
                try {
                    if (buf.writeBytes(inputStream, buf.writableBytes()) <= 0) {
                        QuicStreamChannelInitializer.LOGGER.info("Closing.");
                        channel.close();
                        return;
                    }
                    this.debugOnce.log("reader", (Object)buf);
                    channel.writeAndFlush((Object)buf.retain());
                }
                finally {
                    buf.release();
                }
            }
        }
        catch (final IOException e) {
            this.debugOnce.log("readerException", (Object)e);
            if (channel.isOpen()) {
                e.printStackTrace();
            }
        }
    }
    
    private /* synthetic */ void lambda$initChannel$1(final LinkedBlockingDeque outbound, final LocalChannel channel) {
        try {
            final OutputStream outputStream = this.quicStream.getOutputStream();
            while (true) {
                final ByteBuf buf = outbound.take();
                this.debugOnce.log("writer", (Object)buf);
                if (buf == QuicStreamChannelInitializer.CLOSE_MARKER) {
                    break;
                }
                try {
                    buf.readBytes(outputStream, buf.readableBytes());
                }
                finally {
                    buf.release();
                }
            }
            QuicStreamChannelInitializer.LOGGER.info("Closing.");
            outputStream.close();
        }
        catch (final IOException | InterruptedException e) {
            this.debugOnce.log("writerException", (Object)e);
            if (channel.isOpen()) {
                e.printStackTrace();
            }
        }
    }
    
    private static /* synthetic */ void lambda$new$0(final UUID user, final String s) {
        QuicStreamChannelInitializer.LOGGER.debug("[{}] {}", (Object)user, (Object)s);
    }
    
    static {
        LOGGER = LogManager.getLogger();
        CLOSE_MARKER = Unpooled.buffer(0, 0);
    }
}
