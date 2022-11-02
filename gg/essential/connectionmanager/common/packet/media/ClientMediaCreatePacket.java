package gg.essential.connectionmanager.common.packet.media;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import gg.essential.media.model.*;

public class ClientMediaCreatePacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final String mediaId;
    @SerializedName("b")
    @Nullable
    private final String title;
    @SerializedName("c")
    @Nullable
    private final String description;
    @SerializedName("d")
    @NotNull
    private final MediaMetadata metadata;
    
    public ClientMediaCreatePacket(@NotNull final String mediaId, @Nullable final String title, @Nullable final String description, @NotNull final MediaMetadata metadata) {
        super();
        this.mediaId = mediaId;
        this.title = title;
        this.description = description;
        this.metadata = metadata;
    }
}
