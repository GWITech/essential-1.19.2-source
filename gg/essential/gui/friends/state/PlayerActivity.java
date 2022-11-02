package gg.essential.gui.friends.state;

import kotlin.*;
import java.util.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000*
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0005\u0006\u0007\b	B\u0007\b\u0004¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u0082\u0001\u0005
                                                   \u000b\f\u000e¨\u0006\u000f""" }, d2 = { "Lgg/essential/gui/friends/state/PlayerActivity;", "", "()V", "isJoinable", "", "Multiplayer", "Offline", "Online", "OnlineWithDescription", "SPSSession", "Lgg/essential/gui/friends/state/PlayerActivity$Offline;", "Lgg/essential/gui/friends/state/PlayerActivity$Online;", "Lgg/essential/gui/friends/state/PlayerActivity$OnlineWithDescription;", "Lgg/essential/gui/friends/state/PlayerActivity$SPSSession;", "Lgg/essential/gui/friends/state/PlayerActivity$Multiplayer;", "essential" })
public abstract class PlayerActivity
{
    private PlayerActivity() {
        super();
    }
    
    public final boolean isJoinable() {
        return this instanceof Multiplayer || (this instanceof SPSSession && ((SPSSession)this).getInvited());
    }
    
    public PlayerActivity(final byte b) {
        this();
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\f
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003""" }, d2 = { "Lgg/essential/gui/friends/state/PlayerActivity$Offline;", "Lgg/essential/gui/friends/state/PlayerActivity;", "()V", "essential" })
    public static final class Offline extends PlayerActivity
    {
        @NotNull
        public static final Offline INSTANCE;
        
        private Offline() {
            super((byte)0);
        }
        
        static {
            INSTANCE = new Offline();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\f
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003""" }, d2 = { "Lgg/essential/gui/friends/state/PlayerActivity$Online;", "Lgg/essential/gui/friends/state/PlayerActivity;", "()V", "essential" })
    public static final class Online extends PlayerActivity
    {
        @NotNull
        public static final Online INSTANCE;
        
        private Online() {
            super((byte)0);
        }
        
        static {
            INSTANCE = new Online();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000*
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0010\u000b
                                                       \u0002\b
                                                       
                                                       \u0002\u0010\u0000
                                                       \u0000
                                                       \u0002\u0010\b
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J	\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J	\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0003J	\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J	\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                       \u0000\u001a\u0004\b	\u0010
                                                       ¨\u0006\u0015""" }, d2 = { "Lgg/essential/gui/friends/state/PlayerActivity$SPSSession;", "Lgg/essential/gui/friends/state/PlayerActivity;", "host", "Ljava/util/UUID;", "invited", "", "(Ljava/util/UUID;Z)V", "getHost", "()Ljava/util/UUID;", "getInvited", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "essential" })
    public static final class SPSSession extends PlayerActivity
    {
        @NotNull
        private final UUID host;
        private final boolean invited;
        
        public SPSSession(@NotNull final UUID host, final boolean invited) {
            Intrinsics.checkNotNullParameter((Object)host, "host");
            super((byte)0);
            this.host = host;
            this.invited = invited;
        }
        
        @NotNull
        public final UUID getHost() {
            return this.host;
        }
        
        public final boolean getInvited() {
            return this.invited;
        }
        
        @NotNull
        @Override
        public String toString() {
            return "SPSSession(host=" + this.host + ", invited=" + this.invited;
        }
        
        @Override
        public int hashCode() {
            int result = this.host.hashCode();
            final int n = result * 31;
            int invited;
            if ((invited = (this.invited ? 1 : 0)) != 0) {
                invited = 1;
            }
            result = n + invited;
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SPSSession)) {
                return false;
            }
            final SPSSession spsSession = (SPSSession)other;
            return Intrinsics.areEqual((Object)this.host, (Object)spsSession.host) && this.invited == spsSession.invited;
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
                                                       \u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010""" }, d2 = { "Lgg/essential/gui/friends/state/PlayerActivity$Multiplayer;", "Lgg/essential/gui/friends/state/PlayerActivity;", "serverAddress", "", "(Ljava/lang/String;)V", "getServerAddress", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "essential" })
    public static final class Multiplayer extends PlayerActivity
    {
        @NotNull
        private final String serverAddress;
        
        public Multiplayer(@NotNull final String serverAddress) {
            Intrinsics.checkNotNullParameter((Object)serverAddress, "serverAddress");
            super((byte)0);
            this.serverAddress = serverAddress;
        }
        
        @NotNull
        public final String getServerAddress() {
            return this.serverAddress;
        }
        
        @NotNull
        @Override
        public String toString() {
            return "Multiplayer(serverAddress=" + this.serverAddress;
        }
        
        @Override
        public int hashCode() {
            return this.serverAddress.hashCode();
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            return this == other || (other instanceof Multiplayer && Intrinsics.areEqual((Object)this.serverAddress, (Object)((Multiplayer)other).serverAddress));
        }
    }
}
