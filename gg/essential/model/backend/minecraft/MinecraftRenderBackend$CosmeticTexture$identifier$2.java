package gg.essential.model.backend.minecraft;

import kotlin.jvm.functions.*;
import net.minecraft.util.*;
import kotlin.*;
import java.util.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;
import gg.essential.universal.utils.*;
import net.minecraft.client.texture.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "Lnet/minecraft/util/Identifier;", "invoke" })
static final class MinecraftRenderBackend$CosmeticTexture$identifier$2 extends Lambda implements Function0<Identifier> {
    final /* synthetic */ MinecraftRenderBackend.CosmeticTexture this$0;
    
    MinecraftRenderBackend$CosmeticTexture$identifier$2(final MinecraftRenderBackend.CosmeticTexture $receiver) {
        this.this$0 = $receiver;
        super(0);
    }
    
    @NotNull
    public final Identifier invoke() {
        final String s = "essential";
        final String lowerCase = this.this$0.getName().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue((Object)lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        final Identifier identifier = new Identifier(s, "textures/cosmetics/" + lowerCase);
        final TextureManager textureManager = UMinecraft.getMinecraft().getTextureManager();
        final AbstractTexture orDefault = textureManager.getOrDefault(identifier, (AbstractTexture)null);
        final ReleasedDynamicTexture releasedDynamicTexture = (orDefault instanceof ReleasedDynamicTexture) ? ((ReleasedDynamicTexture)orDefault) : null;
        if (releasedDynamicTexture != null) {
            releasedDynamicTexture.clearGlId();
        }
        textureManager.registerTexture(identifier, (AbstractTexture)this.this$0.getTexture());
        return identifier;
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
}