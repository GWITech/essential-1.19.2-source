package gg.essential.connectionmanager.common.packet.cosmetic;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.cosmetics.model.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import java.util.*;
import java.util.stream.*;

public class ServerCosmeticTypesPopulatePacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final List<CosmeticType> cosmeticTypes;
    
    public ServerCosmeticTypesPopulatePacket(@NotNull final CosmeticType cosmeticType) {
        this(Collections.singletonList(cosmeticType));
    }
    
    @Deprecated
    public ServerCosmeticTypesPopulatePacket(@NotNull final CosmeticType... cosmeticTypes) {
        this((List<CosmeticType>)Arrays.stream(cosmeticTypes).collect((Collector<? super CosmeticType, ?, List<? super CosmeticType>>)Collectors.toList()));
    }
    
    public ServerCosmeticTypesPopulatePacket(@NotNull final List<CosmeticType> cosmeticTypes) {
        super();
        this.cosmeticTypes = cosmeticTypes;
    }
    
    @NotNull
    public List<CosmeticType> getCosmeticTypes() {
        return this.cosmeticTypes;
    }
}
