package gg.essential.handlers.screenshot;

import kotlin.*;
import java.util.*;
import gg.essential.lib.gson.annotations.*;
import com.sparkuniverse.toolbox.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b!
                                                   \u0002\u0010\b
                                                   \u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u00010BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010	\u001a\u00020
                                                   \u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012
                                                   \b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000fJ	\u0010"\u001a\u00020\u0003H\u00c6\u0003J	\u0010#\u001a\u00020\u0005H\u00c6\u0003J	\u0010$\u001a\u00020\u0007H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J	\u0010&\u001a\u00020
                                                   H\u00c6\u0003J	\u0010'\u001a\u00020\fH\u00c6\u0003J	\u0010(\u001a\u00020\fH\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J]\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072
                                                   \b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010	\u001a\u00020
                                                   2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2
                                                   \b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010+\u001a\u00020\f2\b\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010-\u001a\u00020.H\u00d6\u0001J	\u0010/\u001a\u00020\u0007H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0012\u0010\u0013R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0016\u0010\u0017"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u001a\u0010\u0017"\u0004\b\u001b\u0010\u0019R\u0016\u0010	\u001a\u00020
                                                   8\u0006X\u0087\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u001e\u0010\u0013"\u0004\b\u001f\u0010 R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b!\u0010\u0015¨\u00061""" }, d2 = { "Lgg/essential/handlers/screenshot/ClientScreenshotMetadata;", "", "authorId", "Ljava/util/UUID;", "time", "Lcom/sparkuniverse/toolbox/util/DateTime;", "checksum", "", "editTime", "locationMetadata", "Lgg/essential/handlers/screenshot/ClientScreenshotMetadata$Location;", "favorite", "", "edited", "mediaId", "(Ljava/util/UUID;Lcom/sparkuniverse/toolbox/util/DateTime;Ljava/lang/String;Lcom/sparkuniverse/toolbox/util/DateTime;Lgg/essential/handlers/screenshot/ClientScreenshotMetadata$Location;ZZLjava/lang/String;)V", "getAuthorId", "()Ljava/util/UUID;", "getChecksum", "()Ljava/lang/String;", "getEditTime", "()Lcom/sparkuniverse/toolbox/util/DateTime;", "getEdited", "()Z", "setEdited", "(Z)V", "getFavorite", "setFavorite", "getLocationMetadata", "()Lgg/essential/handlers/screenshot/ClientScreenshotMetadata$Location;", "getMediaId", "setMediaId", "(Ljava/lang/String;)V", "getTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "Location", "essential" })
public final class ClientScreenshotMetadata
{
    @SerializedName(value = "authorId", alternate = { "a" })
    @NotNull
    private final UUID authorId;
    @SerializedName(value = "time", alternate = { "b" })
    @NotNull
    private final DateTime time;
    @SerializedName(value = "checksum", alternate = { "c" })
    @NotNull
    private final String checksum;
    @SerializedName("editTime")
    @Nullable
    private final DateTime editTime;
    @SerializedName(value = "locationMetadata", alternate = { "d" })
    @NotNull
    private final ClientScreenshotMetadata.Location locationMetadata;
    @SerializedName(value = "favorite", alternate = { "e" })
    private boolean favorite;
    @SerializedName(value = "edited", alternate = { "f" })
    private boolean edited;
    @Nullable
    private String mediaId;
    
    public ClientScreenshotMetadata(@NotNull final UUID authorId, @NotNull final DateTime time, @NotNull final String checksum, @Nullable final DateTime editTime, @NotNull final ClientScreenshotMetadata.Location locationMetadata, final boolean favorite, final boolean edited, @Nullable final String mediaId) {
        Intrinsics.checkNotNullParameter((Object)authorId, "authorId");
        Intrinsics.checkNotNullParameter((Object)time, "time");
        Intrinsics.checkNotNullParameter((Object)checksum, "checksum");
        Intrinsics.checkNotNullParameter((Object)locationMetadata, "locationMetadata");
        super();
        this.authorId = authorId;
        this.time = time;
        this.checksum = checksum;
        this.editTime = editTime;
        this.locationMetadata = locationMetadata;
        this.favorite = favorite;
        this.edited = edited;
        this.mediaId = mediaId;
    }
    
    public ClientScreenshotMetadata(final UUID authorId, final DateTime time, final String checksum, final DateTime editTime, final ClientScreenshotMetadata.Location locationMetadata) {
        this(authorId, time, checksum, editTime, locationMetadata, false, false, null);
    }
    
    @NotNull
    public final UUID getAuthorId() {
        return this.authorId;
    }
    
    @NotNull
    public final DateTime getTime() {
        return this.time;
    }
    
    @NotNull
    public final String getChecksum() {
        return this.checksum;
    }
    
    @Nullable
    public final DateTime getEditTime() {
        return this.editTime;
    }
    
    @NotNull
    public final ClientScreenshotMetadata.Location getLocationMetadata() {
        return this.locationMetadata;
    }
    
    public final boolean getFavorite() {
        return this.favorite;
    }
    
    public final void setFavorite(final boolean <set-?>) {
        this.favorite = <set-?>;
    }
    
    public final boolean getEdited() {
        return this.edited;
    }
    
    @Nullable
    public final String getMediaId() {
        return this.mediaId;
    }
    
    public final void setMediaId(@Nullable final String <set-?>) {
        this.mediaId = <set-?>;
    }
    
    @NotNull
    public final ClientScreenshotMetadata copy(@NotNull final UUID authorId, @NotNull final DateTime time, @NotNull final String checksum, @Nullable final DateTime editTime, @NotNull final ClientScreenshotMetadata.Location locationMetadata, final boolean favorite, final boolean edited, @Nullable final String mediaId) {
        Intrinsics.checkNotNullParameter((Object)authorId, "authorId");
        Intrinsics.checkNotNullParameter((Object)time, "time");
        Intrinsics.checkNotNullParameter((Object)checksum, "checksum");
        Intrinsics.checkNotNullParameter((Object)locationMetadata, "locationMetadata");
        return new ClientScreenshotMetadata(authorId, time, checksum, editTime, locationMetadata, favorite, edited, mediaId);
    }
    
    public static /* synthetic */ ClientScreenshotMetadata copy$default$577d367$5d875835(final ClientScreenshotMetadata clientScreenshotMetadata, final String checksum) {
        return clientScreenshotMetadata.copy(clientScreenshotMetadata.authorId, clientScreenshotMetadata.time, checksum, clientScreenshotMetadata.editTime, clientScreenshotMetadata.locationMetadata, clientScreenshotMetadata.favorite, clientScreenshotMetadata.edited, clientScreenshotMetadata.mediaId);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "ClientScreenshotMetadata(authorId=" + this.authorId + ", time=" + this.time + ", checksum=" + this.checksum + ", editTime=" + this.editTime + ", locationMetadata=" + this.locationMetadata + ", favorite=" + this.favorite + ", edited=" + this.edited + ", mediaId=" + this.mediaId;
    }
    
    @Override
    public int hashCode() {
        int result = this.authorId.hashCode();
        result = result * 31 + this.time.hashCode();
        result = result * 31 + this.checksum.hashCode();
        result = result * 31 + ((this.editTime == null) ? 0 : this.editTime.hashCode());
        result = result * 31 + this.locationMetadata.hashCode();
        final int n = result * 31;
        int favorite;
        if ((favorite = (this.favorite ? 1 : 0)) != 0) {
            favorite = 1;
        }
        result = n + favorite;
        final int n2 = result * 31;
        int edited;
        if ((edited = (this.edited ? 1 : 0)) != 0) {
            edited = 1;
        }
        result = n2 + edited;
        result = result * 31 + ((this.mediaId == null) ? 0 : this.mediaId.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ClientScreenshotMetadata)) {
            return false;
        }
        final ClientScreenshotMetadata clientScreenshotMetadata = (ClientScreenshotMetadata)other;
        return Intrinsics.areEqual((Object)this.authorId, (Object)clientScreenshotMetadata.authorId) && Intrinsics.areEqual((Object)this.time, (Object)clientScreenshotMetadata.time) && Intrinsics.areEqual((Object)this.checksum, (Object)clientScreenshotMetadata.checksum) && Intrinsics.areEqual((Object)this.editTime, (Object)clientScreenshotMetadata.editTime) && Intrinsics.areEqual((Object)this.locationMetadata, (Object)clientScreenshotMetadata.locationMetadata) && this.favorite == clientScreenshotMetadata.favorite && this.edited == clientScreenshotMetadata.edited && Intrinsics.areEqual((Object)this.mediaId, (Object)clientScreenshotMetadata.mediaId);
    }
}
