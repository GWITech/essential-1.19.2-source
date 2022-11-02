package gg.essential.cosmetics;

import gg.essential.network.connectionmanager.*;
import gg.essential.network.connectionmanager.cosmetics.*;
import gg.essential.api.utils.*;
import java.util.concurrent.*;
import net.minecraft.util.*;
import gg.essential.event.entity.*;
import gg.essential.lib.kbrewster.eventbus.*;
import gg.essential.mixins.impl.client.entity.*;
import gg.essential.cosmetics.source.*;
import com.google.common.collect.*;
import gg.essential.mod.cosmetics.*;
import gg.essential.config.*;
import net.minecraft.entity.*;
import gg.essential.api.cosmetics.*;
import net.minecraft.entity.player.*;
import net.minecraft.item.*;
import gg.essential.model.*;
import gg.essential.gui.common.*;
import gg.essential.cosmetics.events.*;
import java.util.*;
import net.minecraft.client.network.*;
import gg.essential.util.*;
import gg.essential.model.molang.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.network.cosmetics.*;
import gg.essential.connectionmanager.common.packet.cosmetic.*;
import gg.essential.connectionmanager.common.packet.*;

public class PlayerWearableManager
{
    private final ConnectionManager connectionManager;
    private final CosmeticsManager cosmeticsManager;
    private final Map<String, ModelInformation> modelCache;
    private final Map<String, CapeInformation> capeCache;
    
    public PlayerWearableManager(final ConnectionManager connectionManager, final CosmeticsManager cosmeticsManager) {
        super();
        this.modelCache = new HashMap<String, ModelInformation>();
        this.capeCache = new HashMap<String, CapeInformation>();
        this.connectionManager = connectionManager;
        this.cosmeticsManager = cosmeticsManager;
    }
    
    public CompletableFuture<BedrockModel> getModel(final Cosmetic cosmetic, final String skinType) {
        return this.modelCache.compute(cosmetic.getId() + "-" + skinType, (__, modelInformation) -> {
            if (modelInformation == null || modelInformation.cosmetic != cosmetic) {
                return new ModelInformation(cosmetic, CompletableFuture.supplyAsync(() -> BedrockModelKt.createBlocking(cosmetic, skinType), Multithreading.getScheduledPool()));
            }
            else {
                return modelInformation;
            }
        }).future;
    }
    
    public CompletableFuture<List<Identifier>> getCapeTextures(final Cosmetic cosmetic) {
        return this.capeCache.compute(cosmetic.getId(), (__, capeInformation) -> {
            if (capeInformation == null || capeInformation.cosmetic != cosmetic) {
                return new CapeInformation(cosmetic, ExtensionsKt.logExceptions(AnimatedCape.createFrames(cosmetic)));
            }
            else {
                return capeInformation;
            }
        }).future;
    }
    
    @Subscribe
    public void tick(final PlayerTickEvent tickEvent) {
        if (!tickEvent.isPre()) {
            return;
        }
        final PlayerEntity playerEntity = tickEvent.getPlayer();
        if (!(playerEntity instanceof AbstractClientPlayerEntity)) {
            return;
        }
        final AbstractClientPlayerEntity player = (AbstractClientPlayerEntity)playerEntity;
        this.updateCosmetics(player);
    }
    
    private void updateCosmetics(final AbstractClientPlayerEntity player) {
        final AbstractClientPlayerExt playerExt = (AbstractClientPlayerExt)player;
        final CosmeticsSource cosmeticsSource = playerExt.getCosmeticsSource();
        final CosmeticsState oldState = playerExt.getCosmeticsState();
        final String newSkinType = player.getModel();
        final String oldSkinType = oldState.getSkinType();
        final ImmutableMap<CosmeticSlot, String> newCosmetics = cosmeticsSource.getCosmetics();
        final Map<CosmeticSlot, String> oldCosmetics = oldState.getCosmetics();
        final ImmutableMap<String, ImmutableList<CosmeticSetting>> newSettings = cosmeticsSource.getCosmeticSettings();
        final Map<String, List<CosmeticSetting>> oldSettings = oldState.getSettings();
        final Set<EnumPart> newArmour = this.getArmourFromPlayer(player);
        final Set<EnumPart> oldArmour = oldState.getArmor();
        if (Objects.equals(newCosmetics, oldCosmetics) && Objects.equals(newSkinType, oldSkinType) && Objects.equals(newSettings, oldSettings) && Objects.equals(oldArmour, newArmour)) {
            return;
        }
        final Set<String> newCosmeticIds = new HashSet<String>(newCosmetics.values());
        final Map<Cosmetic, WearableBedrockModel> models = new HashMap<Cosmetic, WearableBedrockModel>(oldState.getModels());
        String cape = null;
        List<Identifier> capeTextures = null;
        if (!Objects.equals(newSkinType, oldSkinType)) {
            models.clear();
        }
        models.keySet().removeIf(it -> !newCosmeticIds.contains(it.getId()) || this.cosmeticsManager.getCosmetic(it.getId()) != it);
        boolean allUpdated = true;
        for (final String cosmeticId : newCosmeticIds) {
            final Cosmetic cosmetic = this.cosmeticsManager.getCosmetic(cosmeticId);
            if (cosmetic == null) {
                allUpdated = false;
            }
            else {
                final CosmeticType cosmeticType = this.cosmeticsManager.getCosmeticType(cosmetic);
                if (cosmeticType != null && cosmeticType.getSlot() == CosmeticSlot.CAPE) {
                    cape = cosmetic.getId();
                    if (cape.length() == 64 || "CAPE_DISABLED".equals(cape)) {
                        continue;
                    }
                    final CompletableFuture<List<Identifier>> capeFuture = this.getCapeTextures(cosmetic);
                    if (!capeFuture.isDone()) {
                        allUpdated = false;
                    }
                    else {
                        if (capeFuture.isCompletedExceptionally()) {
                            continue;
                        }
                        capeTextures = capeFuture.join();
                    }
                }
                else {
                    if (models.containsKey(cosmetic)) {
                        continue;
                    }
                    final CompletableFuture<Boolean> cosmeticReadyStatus = this.cosmeticsManager.getCosmeticReadyStatus(cosmetic.getId(), cosmetic.getAssets());
                    if (!cosmeticReadyStatus.isDone()) {
                        allUpdated = false;
                    }
                    else {
                        if (!cosmeticReadyStatus.join()) {
                            continue;
                        }
                        final CompletableFuture<BedrockModel> modelFuture = this.getModel(cosmetic, newSkinType);
                        if (!modelFuture.isDone()) {
                            allUpdated = false;
                        }
                        else {
                            final WearableBedrockModel model = this.createWearable(modelFuture.join(), player);
                            model.processEvent(AnimationEventType.EQUIP);
                            models.put(cosmetic, model);
                        }
                    }
                }
            }
        }
        if (!allUpdated) {
            return;
        }
        playerExt.setCosmeticsState(new CosmeticsState(newSkinType, newCosmetics, newSettings, this.cosmeticsManager.getCosmeticTypes(), (Map<Cosmetic, WearableBedrockModel>)ImmutableMap.copyOf((Map<?, ?>)models), newArmour));
        playerExt.setEssentialCosmeticsCape(cape, capeTextures);
    }
    
    private Set<EnumPart> getArmourFromPlayer(final AbstractClientPlayerEntity player) {
        final Set<EnumPart> equippedSlots = new HashSet<EnumPart>();
        final int armorSetting = EssentialConfig.INSTANCE.getCosmeticArmorSetting((Entity)player);
        if (armorSetting > 0) {
            return equippedSlots;
        }
        if (!this.canRenderCosmetic(player, 0) && !this.canRenderCosmetic(player, 1)) {
            equippedSlots.add(EnumPart.LEFT_LEG);
            equippedSlots.add(EnumPart.RIGHT_LEG);
        }
        if (!this.canRenderCosmetic(player, 2)) {
            equippedSlots.add(EnumPart.LEFT_ARM);
            equippedSlots.add(EnumPart.RIGHT_ARM);
            equippedSlots.add(EnumPart.BODY);
        }
        if (!this.canRenderCosmetic(player, 3)) {
            equippedSlots.add(EnumPart.HEAD);
        }
        return equippedSlots;
    }
    
    private boolean canRenderCosmetic(final AbstractClientPlayerEntity player, final int slot) {
        final PlayerInventory inventory = player.method_31548();
        final ItemStack stack = inventory.getArmorStack(slot);
        final boolean[] armorRenderingSuppressed = ((AbstractClientPlayerExt)player).wasArmorRenderingSuppressed();
        return this.isEmpty(stack) || stack.getItem() instanceof RenderCosmetic || armorRenderingSuppressed[slot];
    }
    
    private boolean isEmpty(final ItemStack stack) {
        return stack.isEmpty();
    }
    
    private WearableBedrockModel createWearable(final BedrockModel model, final AbstractClientPlayerEntity player) {
        final PlayerMolangQuery molangEntity = new PlayerMolangQuery((PlayerEntity)player);
        Set<AnimationTarget> animationTargets;
        if (player instanceof EmulatedUI3DPlayer.EmulatedPlayer) {
            animationTargets = EnumSet.of(AnimationTarget.SELF, AnimationTarget.OTHERS);
        }
        else if (player instanceof ClientPlayerEntity) {
            animationTargets = EnumSet.of(AnimationTarget.SELF);
        }
        else {
            animationTargets = EnumSet.of(AnimationTarget.OTHERS);
        }
        final boolean sendsAnimationPackets = player.method_5667().equals(UUIDUtil.getClientUUID()) && !(player instanceof EmulatedUI3DPlayer.EmulatedPlayer);
        return new WearableBedrockModel(model, molangEntity, animationTargets, (Function1<? super String, Unit>)(event -> {
            if (sendsAnimationPackets) {
                final CosmeticSlot slot = model.getCosmetic().getType().getSlot();
                this.connectionManager.send(new ClientCosmeticAnimationTriggerPacket(ConversionsKt.toInfra(slot), event));
            }
            return Unit.INSTANCE;
        }));
    }
    
    private /* synthetic */ Unit lambda$createWearable$4(final boolean sendsAnimationPackets, final BedrockModel model, final String event) {
        if (sendsAnimationPackets) {
            final CosmeticSlot slot = model.getCosmetic().getType().getSlot();
            this.connectionManager.send(new ClientCosmeticAnimationTriggerPacket(ConversionsKt.toInfra(slot), event));
        }
        return Unit.INSTANCE;
    }
    
    private /* synthetic */ boolean lambda$updateCosmetics$3(final Set newCosmeticIds, final Cosmetic it) {
        return !newCosmeticIds.contains(it.getId()) || this.cosmeticsManager.getCosmetic(it.getId()) != it;
    }
    
    private static /* synthetic */ CapeInformation lambda$getCapeTextures$2(final Cosmetic cosmetic, final String __, final CapeInformation capeInformation) {
        if (capeInformation == null || capeInformation.cosmetic != cosmetic) {
            return new CapeInformation(cosmetic, ExtensionsKt.logExceptions(AnimatedCape.createFrames(cosmetic)));
        }
        return capeInformation;
    }
    
    private static /* synthetic */ ModelInformation lambda$getModel$1(final Cosmetic cosmetic, final String skinType, final String __, final ModelInformation modelInformation) {
        if (modelInformation == null || modelInformation.cosmetic != cosmetic) {
            return new ModelInformation(cosmetic, CompletableFuture.supplyAsync(() -> BedrockModelKt.createBlocking(cosmetic, skinType), Multithreading.getScheduledPool()));
        }
        return modelInformation;
    }
    
    private static /* synthetic */ BedrockModel lambda$getModel$0(final Cosmetic cosmetic, final String skinType) {
        return BedrockModelKt.createBlocking(cosmetic, skinType);
    }
    
    private static class ModelInformation
    {
        private final CompletableFuture<BedrockModel> future;
        private final Cosmetic cosmetic;
        
        public ModelInformation(final Cosmetic cosmetic, final CompletableFuture<BedrockModel> future) {
            super();
            this.future = future;
            this.cosmetic = cosmetic;
        }
    }
    
    private static class CapeInformation
    {
        private final CompletableFuture<List<Identifier>> future;
        private final Cosmetic cosmetic;
        
        public CapeInformation(final Cosmetic cosmetic, final CompletableFuture<List<Identifier>> future) {
            super();
            this.future = future;
            this.cosmetic = cosmetic;
        }
    }
}
