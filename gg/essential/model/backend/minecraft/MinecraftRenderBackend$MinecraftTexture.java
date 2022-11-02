package gg.essential.model.backend.minecraft;

import gg.essential.model.backend.*;
import kotlin.*;
import net.minecraft.util.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006\u0006\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/model/backend/minecraft/MinecraftRenderBackend$MinecraftTexture;", "Lgg/essential/model/backend/RenderBackend$Texture;", "identifier", "Lnet/minecraft/util/Identifier;", "getIdentifier", "()Lnet/minecraft/util/Identifier;", "essential" })
public interface MinecraftTexture extends Texture
{
    @NotNull
    Identifier getIdentifier();
}
