package gg.essential.network.cosmetics;

import kotlin.*;
import java.util.*;
import kotlin.text.*;
import kotlin.jvm.internal.*;
import gg.essential.api.utils.mojang.*;
import kotlin.jvm.*;
import gg.essential.mod.cosmetics.*;
import org.jetbrains.annotations.*;

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
