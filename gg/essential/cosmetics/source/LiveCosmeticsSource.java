package gg.essential.cosmetics.source;

import gg.essential.network.connectionmanager.cosmetics.*;
import java.util.*;
import org.jetbrains.annotations.*;
import com.google.common.collect.*;
import gg.essential.mod.cosmetics.*;

public class LiveCosmeticsSource implements CosmeticsSource
{
    private final CosmeticsManager cosmeticsManager;
    private final UUID uuid;
    
    public LiveCosmeticsSource(final CosmeticsManager cosmeticsManager, final UUID uuid) {
        super();
        this.cosmeticsManager = cosmeticsManager;
        this.uuid = uuid;
    }
    
    @NotNull
    public UUID getUuid() {
        return this.uuid;
    }
    
    @NotNull
    @Override
    public ImmutableMap<CosmeticSlot, String> getCosmetics() {
        return this.cosmeticsManager.getVisibleCosmetics(this.uuid);
    }
    
    @NotNull
    @Override
    public ImmutableMap<String, ImmutableList<CosmeticSetting>> getCosmeticSettings() {
        ImmutableMap<String, ImmutableList<CosmeticSetting>> result = this.cosmeticsManager.getCosmeticSettings(this.uuid);
        if (result == null) {
            result = ImmutableMap.of();
        }
        return result;
    }
}
