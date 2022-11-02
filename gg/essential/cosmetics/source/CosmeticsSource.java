package gg.essential.cosmetics.source;

import org.jetbrains.annotations.*;
import com.google.common.collect.*;
import gg.essential.mod.cosmetics.*;

public interface CosmeticsSource
{
    public static final CosmeticsSource EMPTY = new ConfigurableCosmeticsSource();
    
    @NotNull
    ImmutableMap<CosmeticSlot, String> getCosmetics();
    
    @NotNull
    ImmutableMap<String, ImmutableList<CosmeticSetting>> getCosmeticSettings();
}
