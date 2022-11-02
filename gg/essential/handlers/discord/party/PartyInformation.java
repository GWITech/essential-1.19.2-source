package gg.essential.handlers.discord.party;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000(
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b	
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0019\u0012
                                                   \b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J	\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001f\u0010\r\u001a\u00020\u00002
                                                   \b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J	\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010
                                                   ¨\u0006\u0015""" }, d2 = { "Lgg/essential/handlers/discord/party/PartyInformation;", "", "joinSecret", "", "data", "Lgg/essential/handlers/discord/party/PartyInformation$Data;", "(Ljava/lang/String;Lgg/essential/handlers/discord/party/PartyInformation$Data;)V", "getData", "()Lgg/essential/handlers/discord/party/PartyInformation$Data;", "getJoinSecret", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Data", "essential" })
public final class PartyInformation
{
    @Nullable
    private final String joinSecret;
    @NotNull
    private final PartyInformation.Data data;
    
    public PartyInformation(@Nullable final String joinSecret, @NotNull final PartyInformation.Data data) {
        Intrinsics.checkNotNullParameter((Object)data, "data");
        super();
        this.joinSecret = joinSecret;
        this.data = data;
    }
    
    @Nullable
    public final String getJoinSecret() {
        return this.joinSecret;
    }
    
    @NotNull
    public final PartyInformation.Data getData() {
        return this.data;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "PartyInformation(joinSecret=" + this.joinSecret + ", data=" + this.data;
    }
    
    @Override
    public int hashCode() {
        int result = (this.joinSecret == null) ? 0 : this.joinSecret.hashCode();
        result = result * 31 + this.data.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PartyInformation)) {
            return false;
        }
        final PartyInformation partyInformation = (PartyInformation)other;
        return Intrinsics.areEqual((Object)this.joinSecret, (Object)partyInformation.joinSecret) && Intrinsics.areEqual((Object)this.data, (Object)partyInformation.data);
    }
}
