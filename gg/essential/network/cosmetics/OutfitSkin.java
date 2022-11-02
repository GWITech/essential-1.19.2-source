package gg.essential.network.cosmetics;

import kotlin.*;
import gg.essential.util.*;
import kotlin.jvm.internal.*;
import gg.essential.api.utils.mojang.*;
import org.jetbrains.annotations.*;
import gg.essential.mod.cosmetics.*;
import kotlin.jvm.*;
import java.util.*;
import kotlin.text.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000.
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u000b
                                                   \u0002\u0010\b
                                                   \u0002\b\u0006\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u0015\u0012\u0006\u0010	\u001a\u00020
                                                   \u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u000bJ	\u0010\u0010\u001a\u00020
                                                   H\u00c6\u0003J	\u0010\u0011\u001a\u00020\u0007H\u00c6\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010	\u001a\u00020
                                                   2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\u0006\u0010\u0017\u001a\u00020\u0003J\u000e\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0000J	\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\u000e\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b
                                                   \u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010	\u001a\u00020
                                                   ¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c""" }, d2 = { "Lgg/essential/network/cosmetics/OutfitSkin;", "", "hash", "", "model", "Lgg/essential/api/utils/mojang/Model;", "locked", "", "(Ljava/lang/String;Lgg/essential/api/utils/mojang/Model;Z)V", "skin", "Lgg/essential/util/Skin;", "(Lgg/essential/util/Skin;Z)V", "getLocked", "()Z", "getSkin", "()Lgg/essential/util/Skin;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "serialize", "skinEquals", "toString", "withLocked", "Companion", "essential" })
public final class OutfitSkin
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final Skin skin;
    private final boolean locked;
    
    public OutfitSkin(@NotNull final Skin skin, final boolean locked) {
        Intrinsics.checkNotNullParameter((Object)skin, "skin");
        super();
        this.skin = skin;
        this.locked = locked;
    }
    
    @NotNull
    public final Skin getSkin() {
        return this.skin;
    }
    
    public final boolean getLocked() {
        return this.locked;
    }
    
    public OutfitSkin(@NotNull final String hash, @NotNull final Model model, final boolean locked) {
        Intrinsics.checkNotNullParameter((Object)hash, "hash");
        Intrinsics.checkNotNullParameter((Object)model, "model");
        this(new Skin(hash, model), locked);
    }
    
    @NotNull
    public final String serialize() {
        final Skin skin = this.skin;
        final String hash = skin.component1();
        final Model model = skin.component2();
        final int modelStr = model.ordinal();
        final String lockedStr = this.locked ? "1" : "0";
        return modelStr + ";" + hash + ";" + lockedStr;
    }
    
    public final boolean skinEquals(@NotNull final OutfitSkin other) {
        Intrinsics.checkNotNullParameter((Object)other, "other");
        return Intrinsics.areEqual((Object)this.skin, (Object)other.skin);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "OutfitSkin(skin=" + this.skin + ", locked=" + this.locked;
    }
    
    @Override
    public int hashCode() {
        int result = this.skin.hashCode();
        final int n = result * 31;
        int locked;
        if ((locked = (this.locked ? 1 : 0)) != 0) {
            locked = 1;
        }
        result = n + locked;
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutfitSkin)) {
            return false;
        }
        final OutfitSkin outfitSkin = (OutfitSkin)other;
        return Intrinsics.areEqual((Object)this.skin, (Object)outfitSkin.skin) && this.locked == outfitSkin.locked;
    }
    
    @Nullable
    public static final OutfitSkin getOutfitSkin(@NotNull final CosmeticOutfit $this$getOutfitSkin) {
        return OutfitSkin.Companion.getOutfitSkin($this$getOutfitSkin);
    }
    
    @JvmStatic
    public static final boolean skinEquals(@Nullable final CosmeticOutfit $this$skinEquals, @Nullable final CosmeticOutfit other) {
        return OutfitSkin.Companion.skinEquals($this$skinEquals, other);
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000&
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0006
                                                       \u0002\u0010\u000e
                                                       \u0000
                                                       \u0002\u0010\u000b
                                                       \u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010
                                                       \u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007J\u001c\u0010\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\fH\u0007J\u0018\u0010\u001a\u00020\u000e*\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0007R \u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u00020\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010	¨\u0006\u0012""" }, d2 = { "Lgg/essential/network/cosmetics/OutfitSkin$Companion;", "", "()V", "outfitSkin", "Lgg/essential/network/cosmetics/OutfitSkin;", "Lgg/essential/mod/cosmetics/CosmeticOutfit;", "getOutfitSkin$annotations", "(Lgg/essential/mod/cosmetics/CosmeticOutfit;)V", "getOutfitSkin", "(Lgg/essential/mod/cosmetics/CosmeticOutfit;)Lgg/essential/network/cosmetics/OutfitSkin;", "deserialize", "string", "", "skinEquals", "", "a", "b", "other", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @JvmStatic
        @Nullable
        public final OutfitSkin deserialize(@Nullable final String string) {
            if (string == null) {
                return null;
            }
            final Collection thisCollection$iv;
            final Collection $this$toTypedArray$iv = thisCollection$iv = StringsKt.split$default((CharSequence)string, new String[] { ";" }, false, 0, 6, (Object)null);
            final String[] array = thisCollection$iv.toArray(new String[0]);
            Intrinsics.checkNotNull((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            final String[] parts = array;
            if (parts.length < 2) {
                return null;
            }
            return new OutfitSkin(parts[1], Intrinsics.areEqual((Object)parts[0], (Object)"1") ? Model.ALEX : Model.STEVE, parts.length >= 3 && Intrinsics.areEqual((Object)parts[2], (Object)"1"));
        }
        
        @Nullable
        public final OutfitSkin getOutfitSkin(@NotNull final CosmeticOutfit $this$outfitSkin) {
            Intrinsics.checkNotNullParameter((Object)$this$outfitSkin, "<this>");
            return this.deserialize($this$outfitSkin.getSkinTexture());
        }
        
        @JvmStatic
        public final boolean skinEquals(@Nullable final CosmeticOutfit $this$skinEquals, @Nullable final CosmeticOutfit other) {
            return this.skinEquals(($this$skinEquals != null) ? $this$skinEquals.getSkinTexture() : null, (other != null) ? other.getSkinTexture() : null);
        }
        
        @JvmStatic
        public final boolean skinEquals(@Nullable final String a, @Nullable final String b) {
            final OutfitSkin deserialize = this.deserialize(a);
            if (deserialize == null) {
                return false;
            }
            final OutfitSkin aSkin = deserialize;
            final OutfitSkin deserialize2 = this.deserialize(b);
            if (deserialize2 == null) {
                return false;
            }
            final OutfitSkin bSkin = deserialize2;
            return aSkin.skinEquals(bSkin);
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
