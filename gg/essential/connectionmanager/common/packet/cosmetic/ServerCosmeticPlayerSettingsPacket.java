package gg.essential.connectionmanager.common.packet.cosmetic;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import java.util.*;
import gg.essential.cosmetics.model.*;

public class ServerCosmeticPlayerSettingsPacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final UUID uuid;
    @SerializedName("b")
    @NotNull
    private final Map<String, List<CosmeticSetting>> settings;
    
    public ServerCosmeticPlayerSettingsPacket(@NotNull final UUID uuid, @NotNull final Map<String, List<CosmeticSetting>> settings) {
        super();
        this.settings = settings;
        this.uuid = uuid;
    }
    
    @NotNull
    public UUID getUUID() {
        return this.uuid;
    }
    
    @NotNull
    public Map<String, List<CosmeticSetting>> getSettings() {
        return this.settings;
    }
}
