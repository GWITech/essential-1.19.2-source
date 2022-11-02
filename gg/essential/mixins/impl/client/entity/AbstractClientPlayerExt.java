package gg.essential.mixins.impl.client.entity;

import gg.essential.cosmetics.source.*;
import gg.essential.cosmetics.*;
import org.jetbrains.annotations.*;
import java.util.*;
import net.minecraft.util.*;

public interface AbstractClientPlayerExt
{
    CosmeticsSource getCosmeticsSource();
    
    void setCosmeticsSource(final CosmeticsSource p0);
    
    @NotNull
    CosmeticsState getCosmeticsState();
    
    void setCosmeticsState(@NotNull final CosmeticsState p0);
    
    void setEssentialCosmeticsCape(@Nullable final String p0, @Nullable final List<Identifier> p1);
    
    Identifier applyEssentialCosmeticsMask(final Identifier p0);
    
    boolean isSkinOverrodeByServer();
    
    void assumeArmorRenderingSuppressed();
    
    void armorRenderingNotSuppressed(final int p0);
    
    boolean[] wasArmorRenderingSuppressed();
}
