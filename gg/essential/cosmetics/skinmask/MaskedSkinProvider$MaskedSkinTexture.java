package gg.essential.cosmetics.skinmask;

import net.minecraft.client.texture.*;
import gg.essential.universal.*;
import net.minecraft.client.util.*;
import java.io.*;
import gg.essential.mixins.ext.client.renderer.*;
import net.minecraft.resource.*;
import org.jetbrains.annotations.*;

private static class MaskedSkinTexture extends PlayerSkinTexture
{
    public MaskedSkinTexture(final UImage image) {
        super((File)null, "essential-masked-image", DefaultSkinHelper.getTexture(), false, (Runnable)null);
        ((PlayerSkinTextureExt)this).essential$setImage(image);
    }
    
    public void method_4625(@NotNull final ResourceManager resourceManager) {
    }
}
