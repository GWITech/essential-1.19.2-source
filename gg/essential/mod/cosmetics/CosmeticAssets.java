package gg.essential.mod.cosmetics;

import kotlin.*;
import gg.essential.mod.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002#$B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003JM\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\"H\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006%" }, d2 = { "Lgg/essential/mod/cosmetics/CosmeticAssets;", "", "thumbnail", "Lgg/essential/mod/EssentialAsset;", "texture", "geometry", "Lgg/essential/mod/cosmetics/CosmeticAssets$Geometry;", "animations", "skinMask", "Lgg/essential/mod/cosmetics/CosmeticAssets$SkinMask;", "settings", "(Lgg/essential/mod/EssentialAsset;Lgg/essential/mod/EssentialAsset;Lgg/essential/mod/cosmetics/CosmeticAssets$Geometry;Lgg/essential/mod/EssentialAsset;Lgg/essential/mod/cosmetics/CosmeticAssets$SkinMask;Lgg/essential/mod/EssentialAsset;)V", "getAnimations", "()Lgg/essential/mod/EssentialAsset;", "getGeometry", "()Lgg/essential/mod/cosmetics/CosmeticAssets$Geometry;", "getSettings", "getSkinMask", "()Lgg/essential/mod/cosmetics/CosmeticAssets$SkinMask;", "getTexture", "getThumbnail", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Geometry", "SkinMask", "cosmetics" })
public final class CosmeticAssets
{
    @NotNull
    private final EssentialAsset thumbnail;
    @Nullable
    private final EssentialAsset texture;
    @NotNull
    private final Geometry geometry;
    @Nullable
    private final EssentialAsset animations;
    @Nullable
    private final SkinMask skinMask;
    @Nullable
    private final EssentialAsset settings;
    
    public CosmeticAssets(@NotNull final EssentialAsset thumbnail, @Nullable final EssentialAsset texture, @NotNull final Geometry geometry, @Nullable final EssentialAsset animations, @Nullable final SkinMask skinMask, @Nullable final EssentialAsset settings) {
        Intrinsics.checkNotNullParameter((Object)thumbnail, "thumbnail");
        Intrinsics.checkNotNullParameter((Object)geometry, "geometry");
        super();
        this.thumbnail = thumbnail;
        this.texture = texture;
        this.geometry = geometry;
        this.animations = animations;
        this.skinMask = skinMask;
        this.settings = settings;
    }
    
    @NotNull
    public final EssentialAsset getThumbnail() {
        return this.thumbnail;
    }
    
    @Nullable
    public final EssentialAsset getTexture() {
        return this.texture;
    }
    
    @NotNull
    public final Geometry getGeometry() {
        return this.geometry;
    }
    
    @Nullable
    public final EssentialAsset getAnimations() {
        return this.animations;
    }
    
    @Nullable
    public final SkinMask getSkinMask() {
        return this.skinMask;
    }
    
    @Nullable
    public final EssentialAsset getSettings() {
        return this.settings;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "CosmeticAssets(thumbnail=" + this.thumbnail + ", texture=" + this.texture + ", geometry=" + this.geometry + ", animations=" + this.animations + ", skinMask=" + this.skinMask + ", settings=" + this.settings + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.thumbnail.hashCode();
        result = result * 31 + ((this.texture == null) ? 0 : this.texture.hashCode());
        result = result * 31 + this.geometry.hashCode();
        result = result * 31 + ((this.animations == null) ? 0 : this.animations.hashCode());
        result = result * 31 + ((this.skinMask == null) ? 0 : this.skinMask.hashCode());
        result = result * 31 + ((this.settings == null) ? 0 : this.settings.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CosmeticAssets)) {
            return false;
        }
        final CosmeticAssets cosmeticAssets = (CosmeticAssets)other;
        return Intrinsics.areEqual((Object)this.thumbnail, (Object)cosmeticAssets.thumbnail) && Intrinsics.areEqual((Object)this.texture, (Object)cosmeticAssets.texture) && Intrinsics.areEqual((Object)this.geometry, (Object)cosmeticAssets.geometry) && Intrinsics.areEqual((Object)this.animations, (Object)cosmeticAssets.animations) && Intrinsics.areEqual((Object)this.skinMask, (Object)cosmeticAssets.skinMask) && Intrinsics.areEqual((Object)this.settings, (Object)cosmeticAssets.settings);
    }
    
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
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013" }, d2 = { "Lgg/essential/mod/cosmetics/CosmeticAssets$SkinMask;", "", "steve", "Lgg/essential/mod/EssentialAsset;", "alex", "(Lgg/essential/mod/EssentialAsset;Lgg/essential/mod/EssentialAsset;)V", "getAlex", "()Lgg/essential/mod/EssentialAsset;", "getSteve", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cosmetics" })
    public static final class SkinMask
    {
        @Nullable
        private final EssentialAsset steve;
        @Nullable
        private final EssentialAsset alex;
        
        public SkinMask(@Nullable final EssentialAsset steve, @Nullable final EssentialAsset alex) {
            super();
            this.steve = steve;
            this.alex = alex;
        }
        
        @Nullable
        public final EssentialAsset getSteve() {
            return this.steve;
        }
        
        @Nullable
        public final EssentialAsset getAlex() {
            return this.alex;
        }
        
        @NotNull
        @Override
        public String toString() {
            return "SkinMask(steve=" + this.steve + ", alex=" + this.alex + ')';
        }
        
        @Override
        public int hashCode() {
            int result = (this.steve == null) ? 0 : this.steve.hashCode();
            result = result * 31 + ((this.alex == null) ? 0 : this.alex.hashCode());
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SkinMask)) {
                return false;
            }
            final SkinMask skinMask = (SkinMask)other;
            return Intrinsics.areEqual((Object)this.steve, (Object)skinMask.steve) && Intrinsics.areEqual((Object)this.alex, (Object)skinMask.alex);
        }
    }
}
