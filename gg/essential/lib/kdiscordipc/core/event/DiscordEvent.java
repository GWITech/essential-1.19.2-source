package gg.essential.lib.kdiscordipc.core.event;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlinx.serialization.*;

@kotlinx.serialization.Serializable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\b\u0087\u0001\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0016\u0017B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0018" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/event/DiscordEvent;", "", "eventName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "CurrentUserUpdate", "ActivityJoin", "ActivitySpectate", "ActivityJoinRequest", "ActivityInvite", "LobbyUpdate", "LobbyDelete", "LobbyMemberConnect", "LobbyMemberUpdate", "LobbyMemberDisconnect", "LobbyMessage", "SpeakingStart", "SpeakingStop", "RelationshipUpdate", "VoiceSettingsUpdate", "$serializer", "Companion", "KDiscordIPC" })
public enum DiscordEvent
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final String eventName;
    
    CurrentUserUpdate("CurrentUserUpdate", 0, "CURRENT_USER_UPDATE"), 
    ActivityJoin("ActivityJoin", 1, "ACTIVITY_JOIN"), 
    ActivitySpectate("ActivitySpectate", 2, "ACTIVITY_SPECTATE"), 
    ActivityJoinRequest("ActivityJoinRequest", 3, "ACTIVITY_JOIN_REQUEST"), 
    ActivityInvite("ActivityInvite", 4, "ACTIVITY_INVITE"), 
    LobbyUpdate("LobbyUpdate", 5, "LOBBY_UPDATE"), 
    LobbyDelete("LobbyDelete", 6, "LOBBY_DELETE"), 
    LobbyMemberConnect("LobbyMemberConnect", 7, "LOBBY_MEMBER_CONNECT"), 
    LobbyMemberUpdate("LobbyMemberUpdate", 8, "LOBBY_MEMBER_UPDATE"), 
    LobbyMemberDisconnect("LobbyMemberDisconnect", 9, "LOBBY_MEMBER_DISCONNECT"), 
    LobbyMessage("LobbyMessage", 10, "LOBBY_MESSAGE"), 
    SpeakingStart("SpeakingStart", 11, "SPEAKING_START"), 
    SpeakingStop("SpeakingStop", 12, "SPEAKING_STOP"), 
    RelationshipUpdate("RelationshipUpdate", 13, "RELATIONSHIP_UPDATE"), 
    VoiceSettingsUpdate("VoiceSettingsUpdate", 14, "VOICE_SETTINGS_UPDATE");
    
    private static final /* synthetic */ DiscordEvent[] $VALUES;
    
    private DiscordEvent(final String $enum$name, final int $enum$ordinal, final String eventName) {
        this.eventName = eventName;
    }
    
    @NotNull
    public final String getEventName() {
        return this.eventName;
    }
    
    public static DiscordEvent[] values() {
        return DiscordEvent.$VALUES.clone();
    }
    
    public static DiscordEvent valueOf(final String value) {
        return Enum.valueOf(DiscordEvent.class, value);
    }
    
    private static final /* synthetic */ DiscordEvent[] $values() {
        return new DiscordEvent[] { DiscordEvent.CurrentUserUpdate, DiscordEvent.ActivityJoin, DiscordEvent.ActivitySpectate, DiscordEvent.ActivityJoinRequest, DiscordEvent.ActivityInvite, DiscordEvent.LobbyUpdate, DiscordEvent.LobbyDelete, DiscordEvent.LobbyMemberConnect, DiscordEvent.LobbyMemberUpdate, DiscordEvent.LobbyMemberDisconnect, DiscordEvent.LobbyMessage, DiscordEvent.SpeakingStart, DiscordEvent.SpeakingStop, DiscordEvent.RelationshipUpdate, DiscordEvent.VoiceSettingsUpdate };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/event/DiscordEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/lib/kdiscordipc/core/event/DiscordEvent;", "KDiscordIPC" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final KSerializer<DiscordEvent> serializer() {
            return (KSerializer<DiscordEvent>)DiscordEvent$$serializer.INSTANCE;
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
