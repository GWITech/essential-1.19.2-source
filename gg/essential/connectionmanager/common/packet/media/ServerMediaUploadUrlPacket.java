package gg.essential.connectionmanager.common.packet.media;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ServerMediaUploadUrlPacket extends Packet
{
    @SerializedName("media_id")
    @NotNull
    private final String mediaId;
    @SerializedName("upload_url")
    @NotNull
    private final String uploadUrl;
    
    public ServerMediaUploadUrlPacket(@NotNull final String mediaId, @NotNull final String uploadUrl) {
        super();
        this.mediaId = mediaId;
        this.uploadUrl = uploadUrl;
    }
    
    @NotNull
    public String getMediaId() {
        return this.mediaId;
    }
    
    @NotNull
    public String getUploadUrl() {
        return this.uploadUrl;
    }
}
