package gg.essential.model.backend.minecraft;

import kotlin.*;
import net.minecraft.util.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000.
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b	
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J	\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u00d6\u0003J	\u0010\u0013\u001a\u00020\u0006H\u00d6\u0001J	\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010
                                                   R\u0014\u0010\u000b\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\b¨\u0006\u0016""" }, d2 = { "Lgg/essential/model/backend/minecraft/MinecraftRenderBackend$SkinTexture;", "Lgg/essential/model/backend/minecraft/MinecraftRenderBackend$MinecraftTexture;", "identifier", "Lnet/minecraft/util/Identifier;", "(Lnet/minecraft/util/Identifier;)V", "height", "", "getHeight", "()I", "getIdentifier", "()Lnet/minecraft/util/Identifier;", "width", "getWidth", "component1", "copy", "equals", "", "other", "", "hashCode", "toString", "", "essential" })
public static final class SkinTexture implements MinecraftTexture
{
    @NotNull
    private final Identifier identifier;
    
    public SkinTexture(@NotNull final Identifier identifier) {
        Intrinsics.checkNotNullParameter((Object)identifier, "identifier");
        super();
        this.identifier = identifier;
    }
    
    @NotNull
    @Override
    public Identifier getIdentifier() {
        return this.identifier;
    }
    
    @Override
    public int getWidth() {
        return 64;
    }
    
    @Override
    public int getHeight() {
        return 64;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "SkinTexture(identifier=" + this.getIdentifier();
    }
    
    @Override
    public int hashCode() {
        return this.getIdentifier().hashCode();
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return this == other || (other instanceof SkinTexture && Intrinsics.areEqual((Object)this.getIdentifier(), (Object)((SkinTexture)other).getIdentifier()));
    }
}
