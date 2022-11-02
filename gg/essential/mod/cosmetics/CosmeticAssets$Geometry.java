package gg.essential.mod.cosmetics;

import kotlin.*;
import gg.essential.mod.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u001f\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013" }, d2 = { "Lgg/essential/mod/cosmetics/CosmeticAssets$Geometry;", "", "steve", "Lgg/essential/mod/EssentialAsset;", "alex", "(Lgg/essential/mod/EssentialAsset;Lgg/essential/mod/EssentialAsset;)V", "getAlex", "()Lgg/essential/mod/EssentialAsset;", "getSteve", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cosmetics" })
public static final class Geometry
{
    @NotNull
    private final EssentialAsset steve;
    @Nullable
    private final EssentialAsset alex;
    
    public Geometry(@NotNull final EssentialAsset steve, @Nullable final EssentialAsset alex) {
        Intrinsics.checkNotNullParameter((Object)steve, "steve");
        super();
        this.steve = steve;
        this.alex = alex;
    }
    
    @NotNull
    public final EssentialAsset getSteve() {
        return this.steve;
    }
    
    @Nullable
    public final EssentialAsset getAlex() {
        return this.alex;
    }
    
    @NotNull
    public final EssentialAsset component1() {
        return this.steve;
    }
    
    @Nullable
    public final EssentialAsset component2() {
        return this.alex;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Geometry(steve=" + this.steve + ", alex=" + this.alex + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.steve.hashCode();
        result = result * 31 + ((this.alex == null) ? 0 : this.alex.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Geometry)) {
            return false;
        }
        final Geometry geometry = (Geometry)other;
        return Intrinsics.areEqual((Object)this.steve, (Object)geometry.steve) && Intrinsics.areEqual((Object)this.alex, (Object)geometry.alex);
    }
}
