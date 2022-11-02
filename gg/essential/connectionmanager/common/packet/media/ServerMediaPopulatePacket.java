package gg.essential.connectionmanager.common.packet.media;

import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.media.model.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;

public class ServerMediaPopulatePacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final List<Media> medias;
    
    public ServerMediaPopulatePacket(@NotNull final List<Media> medias) {
        super();
        this.medias = medias;
    }
    
    @NotNull
    public List<Media> getMedias() {
        return this.medias;
    }
}
