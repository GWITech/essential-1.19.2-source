package gg.essential.handlers.discord.state;

import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;
import gg.essential.upnp.model.*;
import gg.essential.universal.*;
import gg.essential.*;
import net.minecraft.client.*;
import gg.essential.network.connectionmanager.sps.*;
import net.minecraft.client.network.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001e
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\b6\u0018\u0000 \u00032\u00020\u0001:\u0005\u0003\u0004\u0005\u0006\u0007B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\b	
                                                   \u000b¨\u0006\f""" }, d2 = { "Lgg/essential/handlers/discord/state/GameState;", "", "()V", "Companion", "Multiplayer", "Realms", "SPS", "Singleplayer", "Lgg/essential/handlers/discord/state/GameState$Singleplayer;", "Lgg/essential/handlers/discord/state/GameState$Realms;", "Lgg/essential/handlers/discord/state/GameState$Multiplayer;", "Lgg/essential/handlers/discord/state/GameState$SPS;", "essential" })
public abstract class GameState
{
    @NotNull
    public static final Companion Companion;
    
    private GameState() {
        super();
    }
    
    public GameState(final byte b) {
        this();
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\f
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003""" }, d2 = { "Lgg/essential/handlers/discord/state/GameState$Singleplayer;", "Lgg/essential/handlers/discord/state/GameState;", "()V", "essential" })
    public static final class Singleplayer extends GameState
    {
        @NotNull
        public static final Singleplayer INSTANCE;
        
        private Singleplayer() {
            super((byte)0);
        }
        
        static {
            INSTANCE = new Singleplayer();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000&
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0002\b\u0006
                                                       \u0002\u0010\u000b
                                                       \u0000
                                                       \u0002\u0010\u0000
                                                       \u0000
                                                       \u0002\u0010\b
                                                       \u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J	\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010	\u001a\u00020
                                                       2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J	\u0010\r\u001a\u00020\u000eH\u00d6\u0001J	\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010""" }, d2 = { "Lgg/essential/handlers/discord/state/GameState$Multiplayer;", "Lgg/essential/handlers/discord/state/GameState;", "ip", "", "(Ljava/lang/String;)V", "getIp", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "essential" })
    public static final class Multiplayer extends GameState
    {
        @NotNull
        private final String ip;
        
        public Multiplayer(@NotNull final String ip) {
            Intrinsics.checkNotNullParameter((Object)ip, "ip");
            super((byte)0);
            this.ip = ip;
        }
        
        @NotNull
        public final String getIp() {
            return this.ip;
        }
        
        @NotNull
        @Override
        public String toString() {
            return "Multiplayer(ip=" + this.ip;
        }
        
        @Override
        public int hashCode() {
            return this.ip.hashCode();
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            return this == other || (other instanceof Multiplayer && Intrinsics.areEqual((Object)this.ip, (Object)((Multiplayer)other).ip));
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u001c
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0005
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002	
                                                       ¨\u0006\u000b""" }, d2 = { "Lgg/essential/handlers/discord/state/GameState$SPS;", "Lgg/essential/handlers/discord/state/GameState;", "session", "Lgg/essential/upnp/model/UPnPSession;", "(Lgg/essential/upnp/model/UPnPSession;)V", "getSession", "()Lgg/essential/upnp/model/UPnPSession;", "Guest", "Host", "Lgg/essential/handlers/discord/state/GameState$SPS$Host;", "Lgg/essential/handlers/discord/state/GameState$SPS$Guest;", "essential" })
    public abstract static class SPS extends GameState
    {
        @NotNull
        private final UPnPSession session;
        
        private SPS(final UPnPSession session) {
            super((byte)0);
            this.session = session;
        }
        
        @NotNull
        public UPnPSession getSession() {
            return this.session;
        }
        
        public SPS(final UPnPSession session, final byte b) {
            this(session);
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                           \u0000*
                                                           \u0002\u0018\u0002
                                                           \u0002\u0018\u0002
                                                           \u0000
                                                           \u0002\u0018\u0002
                                                           \u0002\b\u0006
                                                           \u0002\u0010\u000b
                                                           \u0000
                                                           \u0002\u0010\u0000
                                                           \u0000
                                                           \u0002\u0010\b
                                                           \u0000
                                                           \u0002\u0010\u000e
                                                           \u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J	\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010	\u001a\u00020
                                                           2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J	\u0010\r\u001a\u00020\u000eH\u00d6\u0001J	\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b
                                                           \u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011""" }, d2 = { "Lgg/essential/handlers/discord/state/GameState$SPS$Host;", "Lgg/essential/handlers/discord/state/GameState$SPS;", "session", "Lgg/essential/upnp/model/UPnPSession;", "(Lgg/essential/upnp/model/UPnPSession;)V", "getSession", "()Lgg/essential/upnp/model/UPnPSession;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "essential" })
        public static final class Host extends SPS
        {
            @NotNull
            private final UPnPSession session;
            
            public Host(@NotNull final UPnPSession session) {
                Intrinsics.checkNotNullParameter((Object)session, "session");
                super(session, (byte)0);
                this.session = session;
            }
            
            @NotNull
            @Override
            public UPnPSession getSession() {
                return this.session;
            }
            
            @NotNull
            @Override
            public String toString() {
                return "Host(session=" + this.getSession();
            }
            
            @Override
            public int hashCode() {
                return this.getSession().hashCode();
            }
            
            @Override
            public boolean equals(@Nullable final Object other) {
                return this == other || (other instanceof Host && Intrinsics.areEqual((Object)this.getSession(), (Object)((Host)other).getSession()));
            }
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                           \u0000*
                                                           \u0002\u0018\u0002
                                                           \u0002\u0018\u0002
                                                           \u0000
                                                           \u0002\u0018\u0002
                                                           \u0002\b\u0006
                                                           \u0002\u0010\u000b
                                                           \u0000
                                                           \u0002\u0010\u0000
                                                           \u0000
                                                           \u0002\u0010\b
                                                           \u0000
                                                           \u0002\u0010\u000e
                                                           \u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J	\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010	\u001a\u00020
                                                           2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J	\u0010\r\u001a\u00020\u000eH\u00d6\u0001J	\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b
                                                           \u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011""" }, d2 = { "Lgg/essential/handlers/discord/state/GameState$SPS$Guest;", "Lgg/essential/handlers/discord/state/GameState$SPS;", "session", "Lgg/essential/upnp/model/UPnPSession;", "(Lgg/essential/upnp/model/UPnPSession;)V", "getSession", "()Lgg/essential/upnp/model/UPnPSession;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "essential" })
        public static final class Guest extends SPS
        {
            @NotNull
            private final UPnPSession session;
            
            public Guest(@NotNull final UPnPSession session) {
                Intrinsics.checkNotNullParameter((Object)session, "session");
                super(session, (byte)0);
                this.session = session;
            }
            
            @NotNull
            @Override
            public UPnPSession getSession() {
                return this.session;
            }
            
            @NotNull
            @Override
            public String toString() {
                return "Guest(session=" + this.getSession();
            }
            
            @Override
            public int hashCode() {
                return this.getSession().hashCode();
            }
            
            @Override
            public boolean equals(@Nullable final Object other) {
                return this == other || (other instanceof Guest && Intrinsics.areEqual((Object)this.getSession(), (Object)((Guest)other).getSession()));
            }
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0012
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¨\u0006\u0005""" }, d2 = { "Lgg/essential/handlers/discord/state/GameState$Companion;", "", "()V", "current", "Lgg/essential/handlers/discord/state/GameState;", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @Nullable
        public final GameState current() {
            final MinecraftClient minecraft = UMinecraft.getMinecraft();
            final SPSManager spsManager2 = Essential.getInstance().getConnectionManager().getSpsManager();
            Intrinsics.checkNotNullExpressionValue((Object)spsManager2, "getInstance().connectionManager.spsManager");
            final SPSManager spsManager = spsManager2;
            final UPnPSession localSession = spsManager.getLocalSession();
            if (minecraft.isConnectedToRealms()) {
                return (GameState)GameState$Realms.INSTANCE;
            }
            if (minecraft.isIntegratedServerRunning()) {
                if (localSession != null) {
                    return new SPS.Host(localSession);
                }
                return Singleplayer.INSTANCE;
            }
            else {
                final ServerInfo serverData = minecraft.getCurrentServerEntry();
                if (serverData == null) {
                    return null;
                }
                final UPnPSession sessionFromSpsAddress = spsManager.getSessionFromSpsAddress(serverData.address);
                if (sessionFromSpsAddress != null) {
                    final UPnPSession it = sessionFromSpsAddress;
                    return new SPS.Guest(it);
                }
                final String address = serverData.address;
                Intrinsics.checkNotNullExpressionValue((Object)address, "serverData.address");
                return new Multiplayer(address);
            }
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
