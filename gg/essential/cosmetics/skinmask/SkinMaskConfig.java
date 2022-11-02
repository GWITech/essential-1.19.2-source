package gg.essential.cosmetics.skinmask;

import kotlin.*;
import gg.essential.network.cosmetics.*;
import java.util.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0006¢\u0006\u0002\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u001b\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0006H\u00c6\u0003J5\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u001a\b\u0002\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0006H\u00c6\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR#\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0002" }, d2 = { "Lgg/essential/cosmetics/skinmask/SkinMaskConfig;", "", "cosmetics", "", "Lgg/essential/network/cosmetics/Cosmetic;", "settings", "", "Lgg/essential/cosmetics/skinmask/SkinPartSetting;", "(Ljava/util/List;Ljava/util/Map;)V", "getCosmetics", "()Ljava/util/List;", "getSettings", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "" })
public final class SkinMaskConfig
{
    @NotNull
    private final List<Cosmetic> cosmetics;
    @NotNull
    private final Map<Cosmetic, List<SkinPartSetting>> settings;
    
    public SkinMaskConfig(@NotNull final List<Cosmetic> cosmetics, @NotNull final Map<Cosmetic, ? extends List<SkinPartSetting>> settings) {
        Intrinsics.checkNotNullParameter((Object)cosmetics, "cosmetics");
        Intrinsics.checkNotNullParameter((Object)settings, "settings");
        super();
        this.cosmetics = cosmetics;
        this.settings = (Map<Cosmetic, List<SkinPartSetting>>)settings;
    }
    
    @NotNull
    public final List<Cosmetic> getCosmetics() {
        return this.cosmetics;
    }
    
    @NotNull
    public final Map<Cosmetic, List<SkinPartSetting>> getSettings() {
        return this.settings;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "SkinMaskConfig(cosmetics=" + this.cosmetics + ", settings=" + this.settings + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.cosmetics.hashCode();
        result = result * 31 + this.settings.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SkinMaskConfig)) {
            return false;
        }
        final SkinMaskConfig skinMaskConfig = (SkinMaskConfig)other;
        return Intrinsics.areEqual((Object)this.cosmetics, (Object)skinMaskConfig.cosmetics) && Intrinsics.areEqual((Object)this.settings, (Object)skinMaskConfig.settings);
    }
}
