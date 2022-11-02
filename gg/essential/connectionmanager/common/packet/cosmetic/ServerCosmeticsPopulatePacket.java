package gg.essential.connectionmanager.common.packet.cosmetic;

import gg.essential.connectionmanager.common.packet.*;
import gg.essential.cosmetics.model.*;
import gg.essential.lib.gson.annotations.*;
import org.jetbrains.annotations.*;
import java.util.*;
import java.util.stream.*;

public class ServerCosmeticsPopulatePacket extends Packet
{
    @SerializedName("a")
    @NotNull
    private final List<Cosmetic> cosmetics;
    
    public ServerCosmeticsPopulatePacket(@NotNull final Cosmetic cosmetic) {
        this(Collections.singletonList(cosmetic));
    }
    
    @Deprecated
    public ServerCosmeticsPopulatePacket(@NotNull final Cosmetic... cosmetics) {
        this((List<Cosmetic>)Arrays.stream(cosmetics).collect((Collector<? super Cosmetic, ?, List<? super Cosmetic>>)Collectors.toList()));
    }
    
    public ServerCosmeticsPopulatePacket(@NotNull final List<Cosmetic> cosmetics) {
        super();
        this.cosmetics = cosmetics;
    }
    
    @NotNull
    public List<Cosmetic> getCosmetics() {
        return this.cosmetics;
    }
}
