package gg.essential.model.backend.minecraft;

import gg.essential.universal.utils.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import net.minecraft.util.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00006
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u000e
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J	\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J	\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003J	\u0010\u001e\u001a\u00020\bH\u00d6\u0001J	\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010
                                                   R\u001b\u0010\u000b\u001a\u00020\f8VX\u0096\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\bX\u0096\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0016\u0010
                                                   ¨\u0006 """ }, d2 = { "Lgg/essential/model/backend/minecraft/MinecraftRenderBackend$CosmeticTexture;", "Lgg/essential/model/backend/minecraft/MinecraftRenderBackend$MinecraftTexture;", "name", "", "texture", "Lgg/essential/universal/utils/ReleasedDynamicTexture;", "(Ljava/lang/String;Lgg/essential/universal/utils/ReleasedDynamicTexture;)V", "height", "", "getHeight", "()I", "identifier", "Lnet/minecraft/util/Identifier;", "getIdentifier", "()Lnet/minecraft/util/Identifier;", "identifier$delegate", "Lkotlin/Lazy;", "getName", "()Ljava/lang/String;", "getTexture", "()Lgg/essential/universal/utils/ReleasedDynamicTexture;", "width", "getWidth", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "essential" })
public static final class CosmeticTexture implements MinecraftTexture
{
    @NotNull
    private final String name;
    @NotNull
    private final ReleasedDynamicTexture texture;
    private final int width;
    private final int height;
    @NotNull
    private final Lazy identifier$delegate;
    
    public CosmeticTexture(@NotNull final String name, @NotNull final ReleasedDynamicTexture texture) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        Intrinsics.checkNotNullParameter((Object)texture, "texture");
        super();
        this.name = name;
        this.texture = texture;
        this.width = this.texture.getWidth();
        this.height = this.texture.getHeight();
        this.identifier$delegate = LazyKt.lazy((Function0)new MinecraftRenderBackend$CosmeticTexture$identifier.MinecraftRenderBackend$CosmeticTexture$identifier$2(this));
    }
    
    @NotNull
    public final String getName() {
        return this.name;
    }
    
    @NotNull
    public final ReleasedDynamicTexture getTexture() {
        return this.texture;
    }
    
    @Override
    public int getWidth() {
        return this.width;
    }
    
    @Override
    public int getHeight() {
        return this.height;
    }
    
    @NotNull
    @Override
    public Identifier getIdentifier() {
        return (Identifier)this.identifier$delegate.getValue();
    }
    
    @NotNull
    @Override
    public String toString() {
        return "CosmeticTexture(name=" + this.name + ", texture=" + this.texture;
    }
    
    @Override
    public int hashCode() {
        int result = this.name.hashCode();
        result = result * 31 + this.texture.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CosmeticTexture)) {
            return false;
        }
        final CosmeticTexture cosmeticTexture = (CosmeticTexture)other;
        return Intrinsics.areEqual((Object)this.name, (Object)cosmeticTexture.name) && Intrinsics.areEqual((Object)this.texture, (Object)cosmeticTexture.texture);
    }
}
