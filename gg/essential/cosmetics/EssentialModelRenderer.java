package gg.essential.cosmetics;

import net.minecraft.client.network.*;
import net.minecraft.client.render.entity.model.*;
import net.minecraft.client.render.entity.*;
import net.minecraft.client.render.entity.feature.*;
import net.minecraft.entity.player.*;
import gg.essential.mixins.impl.client.entity.*;
import gg.essential.config.*;
import net.minecraft.entity.*;
import gg.essential.universal.*;
import gg.essential.model.*;
import org.jetbrains.annotations.*;
import gg.essential.data.*;
import gg.essential.model.backend.minecraft.*;
import gg.essential.util.*;
import java.util.*;
import gg.essential.network.cosmetics.*;
import gg.essential.model.backend.*;
import net.minecraft.client.util.math.*;
import net.minecraft.client.render.*;

public class EssentialModelRenderer extends FeatureRenderer<AbstractClientPlayerEntity, PlayerEntityModel<AbstractClientPlayerEntity>>
{
    public static boolean suppressCosmeticRendering;
    private final PlayerEntityRenderer playerRenderer;
    
    public EssentialModelRenderer(final PlayerEntityRenderer playerRenderer) {
        super((FeatureRendererContext)playerRenderer);
        this.playerRenderer = playerRenderer;
    }
    
    public static boolean cosmeticsShouldRender(final PlayerEntity player) {
        if (EssentialConfig.INSTANCE.getHideCosmeticsWhenServerOverridesSkin() && player instanceof AbstractClientPlayerEntity && ((AbstractClientPlayerExt)player).isSkinOverrodeByServer()) {
            return false;
        }
        if (FeatureFlags.COSMETIC_TOGGLE_ENABLED && EssentialConfig.INSTANCE.getDisableCosmetics()) {
            return false;
        }
        if (FeatureFlags.UPDATED_COSMETIC_ARMOR_HIDING_ENABLED && EssentialModelRenderer.suppressCosmeticRendering) {
            return false;
        }
        final double distance = player.method_5739((Entity)UMinecraft.getMinecraft().player);
        return !player.method_5767() && !player.method_7325() && distance < 4096.0;
    }
    
    public void render$ad45216(final UMatrixStack matrixStack, final RenderBackend.VertexConsumerProvider vertexConsumerProvider, @Nullable Set<EnumPart> parts, @NotNull final AbstractClientPlayerEntity player) {
        if (!OnboardingData.hasAcceptedTos() || !EssentialConfig.INSTANCE.getEssentialEnabled()) {
            return;
        }
        if (!cosmeticsShouldRender((PlayerEntity)player)) {
            return;
        }
        final AbstractClientPlayerExt abstractClientPlayerExt = (AbstractClientPlayerExt)player;
        final CosmeticsState cosmeticsState = abstractClientPlayerExt.getCosmeticsState();
        final Map<Cosmetic, WearableBedrockModel> models = cosmeticsState.getModels();
        if (models.isEmpty()) {
            return;
        }
        final PlayerPose pose = PlayerPoseKt.toPose(this.playerRenderer);
        final RenderBackend.Texture skin = (RenderBackend.Texture)new MinecraftRenderBackend.SkinTexture(player.getSkinTexture());
        matrixStack.push();
        if (parts == null) {
            parts = new HashSet<EnumPart>(Arrays.asList(EnumPart.values()));
        }
        matrixStack.translate(0.0f, 1.501f, 0.0f);
        cosmeticsState.render(ExtensionsKt.toCommon(matrixStack), vertexConsumerProvider, pose, skin, parts);
        matrixStack.pop();
    }
    
    public void render$195d0902(@NotNull final MatrixStack vMatrixStack, @NotNull final VertexConsumerProvider buffer, final int light, @NotNull final AbstractClientPlayerEntity player) {
        final UMatrixStack matrixStack = new UMatrixStack(vMatrixStack);
        final RenderBackend.VertexConsumerProvider vertexConsumerProvider = (RenderBackend.VertexConsumerProvider)new MinecraftRenderBackend.VertexConsumerProvider(buffer, light);
        this.render$ad45216(matrixStack, vertexConsumerProvider, null, player);
    }
    
    public /* bridge */ void render(@NotNull final MatrixStack vMatrixStack, @NotNull final VertexConsumerProvider buffer, final int light, @NotNull final Entity entity, final float n, final float n2, final float n3, final float n4, final float n5, final float n6) {
        this.render$195d0902(vMatrixStack, buffer, light, (AbstractClientPlayerEntity)entity);
    }
    
    static {
        EssentialModelRenderer.suppressCosmeticRendering = false;
    }
}
