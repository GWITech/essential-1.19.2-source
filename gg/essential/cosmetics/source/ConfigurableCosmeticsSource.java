package gg.essential.cosmetics.source;

import com.google.common.collect.*;
import gg.essential.mod.cosmetics.*;
import org.jetbrains.annotations.*;

public class ConfigurableCosmeticsSource implements CosmeticsSource
{
    private ImmutableMap<CosmeticSlot, String> cosmetics;
    private ImmutableMap<String, ImmutableList<CosmeticSetting>> cosmeticSettings;
    
    public ConfigurableCosmeticsSource() {
        super();
        this.cosmetics = ImmutableMap.of();
        this.cosmeticSettings = ImmutableMap.of();
    }
    
    public void setCosmetics(final ImmutableMap<CosmeticSlot, String> cosmetics) {
        this.cosmetics = cosmetics;
    }
    
    @NotNull
    @Override
    public ImmutableMap<CosmeticSlot, String> getCosmetics() {
        return this.cosmetics;
    }
    
    @NotNull
    @Override
    public ImmutableMap<String, ImmutableList<CosmeticSetting>> getCosmeticSettings() {
        return this.cosmeticSettings;
    }
}
