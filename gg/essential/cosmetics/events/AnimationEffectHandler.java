package gg.essential.cosmetics.events;

import gg.essential.mod.cosmetics.*;
import net.minecraft.client.*;
import gg.essential.cosmetics.*;
import net.minecraft.client.world.*;
import gg.essential.mixins.impl.client.entity.*;
import gg.essential.network.cosmetics.*;
import java.util.*;
import net.minecraft.entity.player.*;
import gg.essential.cosmetics.source.*;
import net.minecraft.client.network.*;
import gg.essential.event.entity.*;
import gg.essential.lib.kbrewster.eventbus.*;

public class AnimationEffectHandler
{
    public AnimationEffectHandler() {
        super();
    }
    
    public void triggerEvent(final UUID playerUuid, final CosmeticSlot slot, final String event) {
        final ClientWorld world = MinecraftClient.getInstance().world;
        if (world == null) {
            return;
        }
        final AbstractClientPlayerExt player = this.findPlayerByCosmeticsSourceUuid(world, playerUuid);
        if (player == null) {
            return;
        }
        final Map<Cosmetic, WearableBedrockModel> essentialCosmeticModels = player.getCosmeticsState().getModels();
        for (final WearableBedrockModel value : essentialCosmeticModels.values()) {
            if (slot == value.getCosmetic().getType().getSlot()) {
                value.fireTriggerFromAnimation(event);
            }
        }
    }
    
    private AbstractClientPlayerExt findPlayerByCosmeticsSourceUuid(final ClientWorld world, final UUID uuid) {
        for (final PlayerEntity player : world.method_18456()) {
            if (player instanceof final AbstractClientPlayerExt playerExt) {
                final CosmeticsSource cosmeticsSource = playerExt.getCosmeticsSource();
                if (cosmeticsSource instanceof LiveCosmeticsSource && ((LiveCosmeticsSource)cosmeticsSource).getUuid().equals(uuid)) {
                    return playerExt;
                }
                continue;
            }
        }
        return null;
    }
    
    public void fireEvent(final AbstractClientPlayerEntity player, final AnimationEventType type) {
        final Map<Cosmetic, WearableBedrockModel> essentialCosmeticModels = ((AbstractClientPlayerExt)player).getCosmeticsState().getModels();
        for (final WearableBedrockModel value : essentialCosmeticModels.values()) {
            value.processEvent(type);
        }
    }
    
    @Subscribe
    public void tick(final PlayerTickEvent tickEvent) {
        if (tickEvent.isPre()) {
            return;
        }
        final PlayerEntity playerEntity = tickEvent.getPlayer();
        if (!(playerEntity instanceof AbstractClientPlayerEntity)) {
            return;
        }
        this.fireEvent((AbstractClientPlayerEntity)playerEntity, AnimationEventType.TICK);
    }
}
