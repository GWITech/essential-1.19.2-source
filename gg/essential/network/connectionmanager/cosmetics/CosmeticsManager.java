package gg.essential.network.connectionmanager.cosmetics;

import gg.essential.network.connectionmanager.subscription.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.network.cosmetics.cape.*;
import gg.essential.cosmetics.model.*;
import org.jetbrains.annotations.*;
import java.util.concurrent.*;
import gg.essential.handlers.assets.*;
import gg.essential.lib.gson.*;
import gg.essential.network.connectionmanager.queue.*;
import gg.essential.network.connectionmanager.handler.*;
import gg.essential.network.connectionmanager.handler.cosmetics.*;
import gg.essential.*;
import gg.essential.connectionmanager.common.packet.*;
import java.util.stream.*;
import net.minecraft.client.*;
import net.minecraft.client.render.entity.*;
import gg.essential.network.cosmetics.dev.*;
import java.io.*;
import java.nio.file.*;
import gg.essential.lib.gson.reflect.*;
import java.nio.charset.*;
import gg.essential.mod.cosmetics.*;
import java.lang.reflect.*;
import gg.essential.connectionmanager.common.packet.cosmetic.categories.*;
import gg.essential.mod.*;
import java.util.regex.*;
import net.minecraft.client.resource.language.*;
import gg.essential.network.cosmetics.*;
import gg.essential.connectionmanager.common.packet.cosmetic.outfit.*;
import gg.essential.universal.*;
import gg.essential.handlers.*;
import gg.essential.api.utils.mojang.*;
import com.google.common.collect.*;
import gg.essential.event.network.server.*;
import gg.essential.util.*;
import gg.essential.lib.kbrewster.eventbus.*;
import gg.essential.gui.notification.*;
import gg.essential.connectionmanager.common.packet.cosmetic.*;
import java.util.function.*;
import java.util.*;

public class CosmeticsManager implements NetworkedManager, SubscriptionManager.Listener
{
    @NotNull
    private final ConnectionManager connectionManager;
    @NotNull
    private final SubscriptionManager subscriptionManager;
    @NotNull
    private final PacketQueue updateQueue;
    @NotNull
    private final CapeCosmeticsManager capeManager;
    @NotNull
    private final Map<String, Cosmetic> cosmetics;
    @NotNull
    private final Map<String, CosmeticType> cosmeticTypes;
    @NotNull
    private final Map<String, CosmeticOutfit> outfits;
    @NotNull
    private final Map<UUID, ImmutableMap<CosmeticSlot, String>> equippedCosmetics;
    @NotNull
    private final Map<UUID, ImmutableMap<String, ImmutableList<CosmeticSetting>>> cosmeticSettings;
    @NotNull
    private final Set<String> unlockedCosmetics;
    @NotNull
    private final Pattern PARTNER_TAG_REGEX;
    @NotNull
    private final Pattern EVENT_TAG_REGEX;
    @NotNull
    private final Map<String, CompletableFuture<Boolean>> cosmeticReadyStatus;
    @NotNull
    private final AssetProvider assetCache;
    @NotNull
    private final Map<String, String> cosmeticNames;
    @NotNull
    private final Set<CosmeticCategory> infraCategories;
    @NotNull
    private final Set<String> requestedInfraCategories;
    @NotNull
    private final Set<String> knownCosmetics;
    @Nullable
    private DevCosmetics devCosmetics;
    private boolean ownCosmeticsVisible;
    @NotNull
    private final Gson gson;
    private String selectedOutfit;
    private boolean initialMojangSkinSync;
    
    public CosmeticsManager(@NotNull final ConnectionManager connectionManager) {
        super();
        this.cosmetics = (Map<String, Cosmetic>)Maps.newConcurrentMap();
        this.cosmeticTypes = (Map<String, CosmeticType>)Maps.newConcurrentMap();
        this.outfits = (Map<String, CosmeticOutfit>)Maps.newConcurrentMap();
        this.equippedCosmetics = (Map<UUID, ImmutableMap<CosmeticSlot, String>>)Maps.newConcurrentMap();
        this.cosmeticSettings = (Map<UUID, ImmutableMap<String, ImmutableList<CosmeticSetting>>>)Maps.newConcurrentMap();
        this.unlockedCosmetics = Sets.newConcurrentHashSet();
        this.PARTNER_TAG_REGEX = Pattern.compile("mod:(?<modID>.+)");
        this.EVENT_TAG_REGEX = Pattern.compile("event:(?<event>.+)");
        this.cosmeticReadyStatus = new ConcurrentHashMap<String, CompletableFuture<Boolean>>();
        this.assetCache = new FileAssetCache(URLAssetDownloader.INSTANCE);
        this.cosmeticNames = new ConcurrentHashMap<String, String>();
        this.infraCategories = Sets.newConcurrentHashSet();
        this.requestedInfraCategories = Sets.newConcurrentHashSet();
        this.knownCosmetics = Sets.newConcurrentHashSet();
        this.ownCosmeticsVisible = true;
        this.gson = new GsonBuilder().create();
        this.selectedOutfit = null;
        this.initialMojangSkinSync = false;
        this.connectionManager = connectionManager;
        (this.subscriptionManager = connectionManager.getSubscriptionManager()).addListener(this);
        this.updateQueue = new SequentialPacketQueue.Builder(connectionManager).onTimeoutRetransmit().create();
        this.capeManager = new CapeCosmeticsManager(connectionManager, this);
        connectionManager.registerPacketHandler(ServerCosmeticsPopulatePacket.class, new ServerCosmeticsPopulatePacketHandler());
        connectionManager.registerPacketHandler(ServerCosmeticTypesPopulatePacket.class, new ServerCosmeticTypesPopulatePacketHandler());
        connectionManager.registerPacketHandler(ServerCosmeticsUserUnlockedPacket.class, new ServerCosmeticsUserUnlockedPacketHandler());
        connectionManager.registerPacketHandler(ServerCosmeticOutfitPopulatePacket.class, new ServerCosmeticOutfitPopulatePacketHandler());
        connectionManager.registerPacketHandler(ServerCosmeticAnimationTriggerPacket.class, new ServerCosmeticAnimationTriggerPacketHandler());
        connectionManager.registerPacketHandler(ServerCosmeticsUserEquippedPacket.class, new ServerCosmeticsUserEquippedPacketHandler());
        connectionManager.registerPacketHandler(ServerCosmeticsUserEquippedVisibilityPacket.class, new ServerCosmeticsUserEquippedVisibilityPacketHandler());
        connectionManager.registerPacketHandler(ServerCosmeticPlayerSettingsPacket.class, new ServerCosmeticPlayerSettingsPacketHandler());
        connectionManager.registerPacketHandler(ServerCosmeticOutfitSelectedResponsePacket.class, new ServerCosmeticOutfitSelectedResponsePacketHandler());
        connectionManager.registerPacketHandler(ServerCosmeticsSkinTexturePacket.class, new ServerCosmeticSkinTexturePacketHandler());
        connectionManager.registerPacketHandler(ServerCosmeticCategoriesPopulatePacket.class, new ServerCosmeticCategoriesPopulatePacketHandler(this));
        Essential.EVENT_BUS.register(this);
    }
    
    @NotNull
    public AssetProvider getAssetProvider() {
        return this.assetCache;
    }
    
    @NotNull
    public CapeCosmeticsManager getCapeManager() {
        return this.capeManager;
    }
    
    @NotNull
    public Map<String, Cosmetic> getCosmetics() {
        if (this.devCosmetics == null) {
            this.loadDevCosmetics();
        }
        return Collections.unmodifiableMap((Map<? extends String, ? extends Cosmetic>)this.cosmetics);
    }
    
    @NotNull
    public Map<String, CosmeticType> getCosmeticTypes() {
        return Collections.unmodifiableMap((Map<? extends String, ? extends CosmeticType>)this.cosmeticTypes);
    }
    
    @NotNull
    public Map<String, CosmeticOutfit> getOutfits() {
        return this.outfits;
    }
    
    @NotNull
    public ImmutableMap<String, ImmutableList<CosmeticSetting>> getCosmeticSettings() {
        final ImmutableMap<String, ImmutableList<CosmeticSetting>> result = this.getCosmeticSettings(UUIDUtil.getClientUUID());
        return (result != null) ? result : ImmutableMap.of();
    }
    
    @Nullable
    public ImmutableMap<String, ImmutableList<CosmeticSetting>> getCosmeticSettings(final UUID playerId) {
        return this.cosmeticSettings.get(playerId);
    }
    
    public boolean getOwnCosmeticsVisible() {
        return this.ownCosmeticsVisible;
    }
    
    public void setOwnCosmeticsVisible(final boolean state) {
        this.ownCosmeticsVisible = state;
    }
    
    public void setCosmeticSettings(@NotNull final UUID playerId, @NotNull final Map<String, List<CosmeticSetting>> settings) {
        if (this.subscriptionManager.isSubscribedOrSelf(playerId)) {
            final ImmutableMap.Builder<String, ImmutableList<CosmeticSetting>> builder = ImmutableMap.builder();
            settings.forEach((key, value) -> builder.put(key, ImmutableList.copyOf((Collection<?>)value)));
            this.cosmeticSettings.put(playerId, builder.build());
        }
    }
    
    public void removeCosmeticSettings(@NotNull final UUID playerId) {
        this.cosmeticSettings.remove(playerId);
    }
    
    public void removeEquippedCosmetics(@NotNull final UUID playerId) {
        this.equippedCosmetics.remove(playerId);
    }
    
    public void updateCosmeticSettings(@NotNull final String cosmeticId, @NotNull final List<CosmeticSetting> settings) {
        final Map<String, List<CosmeticSetting>> cosmeticSettings = new HashMap<String, List<CosmeticSetting>>(this.getCosmeticSettings());
        if (!settings.isEmpty()) {
            cosmeticSettings.put(cosmeticId, settings);
        }
        else {
            cosmeticSettings.remove(cosmeticId);
        }
        this.setCosmeticSettings(UUIDUtil.getClientUUID(), cosmeticSettings);
        if (this.selectedOutfit != null) {
            final CosmeticOutfit cosmeticOutfit = this.outfits.get(this.selectedOutfit);
            cosmeticOutfit.getCosmeticSettings().put(cosmeticId, settings);
            this.connectionManager.send(new ClientCosmeticOutfitCosmeticSettingsUpdatePacket(this.selectedOutfit, cosmeticId, ConversionsKt.settingsToInfra(settings)));
        }
        else {
            Essential.logger.error("Unable to update cosmetic settings on connection manager. selectedEquipmentID is null");
        }
    }
    
    @NotNull
    public Set<String> getUnlockedCosmetics() {
        return this.unlockedCosmetics;
    }
    
    public void addUnlockedCosmetics(@NotNull final Collection<String> unlockedCosmetics) {
        this.requestIfMissing(unlockedCosmetics);
        this.unlockedCosmetics.addAll(unlockedCosmetics);
    }
    
    private void requestIfMissing(final Collection<String> cosmeticIds) {
        final Stream<String> stream = cosmeticIds.stream();
        final Set<String> knownCosmetics = this.knownCosmetics;
        Objects.requireNonNull(knownCosmetics);
        final Set<String> unknownIds = stream.filter(knownCosmetics::add).collect((Collector<? super String, ?, Set<String>>)Collectors.toSet());
        if (!unknownIds.isEmpty()) {
            this.connectionManager.send(new ClientCosmeticRequestPacket(unknownIds, null));
        }
    }
    
    @NotNull
    public ImmutableMap<CosmeticSlot, String> getEquippedCosmetics() {
        final ImmutableMap<CosmeticSlot, String> result = this.getEquippedCosmetics(UUIDUtil.getClientUUID());
        return (result != null) ? result : ImmutableMap.of();
    }
    
    @Nullable
    public ImmutableMap<CosmeticSlot, String> getEquippedCosmetics(final UUID playerId) {
        return this.equippedCosmetics.get(playerId);
    }
    
    public void setEquippedCosmetics(@NotNull final UUID playerId, @NotNull final Map<CosmeticSlot, String> equippedCosmetics) {
        if (this.subscriptionManager.isSubscribedOrSelf(playerId)) {
            this.requestIfMissing(equippedCosmetics.values());
            this.equippedCosmetics.put(playerId, ImmutableMap.copyOf((Map<? extends CosmeticSlot, ? extends String>)equippedCosmetics));
            if (playerId.equals(UUIDUtil.getClientUUID())) {
                final String capeHash = equippedCosmetics.get(CosmeticSlot.CAPE);
                final boolean capeDisabled = "CAPE_DISABLED".equals(capeHash);
                MinecraftClient.getInstance().options.togglePlayerModelPart(PlayerModelPart.CAPE, !capeDisabled);
                if (!capeDisabled && capeHash != null) {
                    this.capeManager.queueCape(capeHash);
                }
            }
        }
    }
    
    public void updateEquippedCosmetic(@NotNull final CosmeticSlot slot, @Nullable final String cosmeticId) {
        if (this.selectedOutfit != null) {
            final CosmeticOutfit cosmeticOutfit = this.outfits.get(this.selectedOutfit);
            this.updateEquippedCosmetic(cosmeticOutfit, slot, cosmeticId);
        }
    }
    
    public void updateEquippedCosmetic(final int outfitIndex, @NotNull final CosmeticSlot slot, @Nullable final String cosmeticId) {
        final List<CosmeticOutfit> orderedOutfits = this.getOrderedOutfits();
        if (outfitIndex < 0 || outfitIndex > orderedOutfits.size() - 1) {
            return;
        }
        final CosmeticOutfit outfit = orderedOutfits.get(outfitIndex);
        this.updateEquippedCosmetic(outfit, slot, cosmeticId);
    }
    
    private void updateEquippedCosmetic(@NotNull final CosmeticOutfit outfit, @NotNull final CosmeticSlot slot, @Nullable final String cosmeticId) {
        if (cosmeticId != null) {
            outfit.getEquippedCosmetics().put(slot, cosmeticId);
        }
        else {
            outfit.getEquippedCosmetics().remove(slot);
        }
        this.connectionManager.send(new ClientCosmeticOutfitEquippedCosmeticsUpdatePacket(outfit.getId(), ConversionsKt.toInfra(slot), cosmeticId));
        if (outfit.getId().equals(this.selectedOutfit)) {
            final Map<CosmeticSlot, String> equippedCosmetics = new HashMap<CosmeticSlot, String>(this.getEquippedCosmetics());
            if (cosmeticId != null) {
                equippedCosmetics.put(slot, cosmeticId);
            }
            else {
                equippedCosmetics.remove(slot);
            }
            this.setEquippedCosmetics(UUIDUtil.getClientUUID(), equippedCosmetics);
        }
    }
    
    @NotNull
    public ImmutableMap<CosmeticSlot, String> getVisibleCosmetics(final UUID playerId) {
        ImmutableMap<CosmeticSlot, String> result = this.getEquippedCosmetics(playerId);
        if (!this.ownCosmeticsVisible && playerId.equals(UUIDUtil.getClientUUID())) {
            result = null;
        }
        return (result != null) ? result : ImmutableMap.of();
    }
    
    @Nullable
    public Cosmetic getCosmetic(@NotNull final String cosmeticId) {
        return this.cosmetics.get(cosmeticId);
    }
    
    public boolean hasEquipped(final String cosmeticId) {
        return this.hasEquipped(UUIDUtil.getClientUUID(), cosmeticId);
    }
    
    public boolean hasEquipped(final UUID uuid, final String cosmeticId) {
        final Map<CosmeticSlot, String> equippedCosmetics = this.getEquippedCosmetics(uuid);
        return equippedCosmetics != null && equippedCosmetics.containsValue(cosmeticId);
    }
    
    @Nullable
    public CosmeticType getCosmeticType(@NotNull final String cosmeticType) {
        return this.cosmeticTypes.get(cosmeticType);
    }
    
    @Nullable
    public CosmeticType getCosmeticType(@NotNull final Cosmetic cosmetic) {
        return cosmetic.getType();
    }
    
    private DevCosmetics getDevCosmetics() {
        if (this.devCosmetics == null) {
            Path path = Essential.getInstance().getBaseDir().toPath().resolve("cosmetics");
            if (Files.exists(path, new LinkOption[0])) {
                final Path inner = path.resolve("cosmetics");
                if (Files.exists(inner, new LinkOption[0])) {
                    path = inner;
                }
                try {
                    this.devCosmetics = (DevCosmetics)new DevCosmeticsImpl(this, path);
                }
                catch (final IOException e) {
                    e.printStackTrace();
                }
            }
            if (this.devCosmetics == null) {
                this.devCosmetics = DevCosmetics.None.INSTANCE;
            }
        }
        return this.devCosmetics;
    }
    
    public void addCosmetic(@NotNull final gg.essential.cosmetics.model.Cosmetic networkCosmetic) {
        this.knownCosmetics.add(networkCosmetic.getId());
        if (networkCosmetic.getAssets() == null) {
            return;
        }
        final CosmeticAssets assets = ConversionsKt.toMod(networkCosmetic.getAssets());
        final gg.essential.cosmetics.model.Cosmetic finalCosmetic = networkCosmetic;
        if (assets.getSettings() != null) {
            this.getAssetBytes(assets.getSettings()).thenAcceptAsync(bytes -> {
                final Type settingsType = new TypeToken<ArrayList<CosmeticSetting>>() {
                    CosmeticsManager$1() {
                        super();
                    }
                }.getType();
                final Cosmetic cosmetic2 = this.createCosmeticFromNetwork(finalCosmetic, this.gson.fromJson(new String(bytes, StandardCharsets.UTF_8), settingsType));
                this.addCosmetic(cosmetic2);
            }, ExtensionsKt.getExecutor(MinecraftClient.getInstance()));
        }
        else {
            final Cosmetic cosmetic = this.createCosmeticFromNetwork(finalCosmetic, new ArrayList<CosmeticSetting>());
            this.addCosmetic(cosmetic);
        }
    }
    
    public void addCosmetic(Cosmetic cosmetic) {
        cosmetic = this.getDevCosmetics().substitute(cosmetic);
        this.cosmetics.put(cosmetic.getId(), cosmetic);
        for (final CosmeticSetting setting : cosmetic.getSettings()) {
            if ("localization".equalsIgnoreCase(setting.getType())) {
                this.cosmeticNames.put(setting.getId(), setting.getData("en_US"));
            }
        }
        this.cosmeticReadyStatus.remove(cosmetic.getId());
        this.getCosmeticReadyStatus(cosmetic.getId(), cosmetic.getAssets());
        final Map<String, Integer> categories = cosmetic.getCategories();
        final Set<String> newCategories = new HashSet<String>();
        for (final String category : categories.keySet()) {
            if (this.infraCategories.stream().noneMatch(cosmeticCategory -> cosmeticCategory.getId().equals(category)) && this.requestedInfraCategories.add(category)) {
                newCategories.add(category);
            }
        }
        if (!newCategories.isEmpty()) {
            this.connectionManager.send(new ClientCosmeticCategoriesRequestPacket(newCategories, null, null));
        }
        this.connectionManager.getNoticesManager().getCosmeticNotices().cosmeticAdded(cosmetic.getId());
    }
    
    private Cosmetic createCosmeticFromNetwork(final gg.essential.cosmetics.model.Cosmetic cosmetic, final List<CosmeticSetting> settings) {
        CosmeticType cosmeticType = this.cosmeticTypes.get(cosmetic.getType());
        if (cosmeticType == null) {
            cosmeticType = new CosmeticType(cosmetic.getType(), CosmeticSlot.FULL_BODY, Collections.emptyMap(), Collections.emptyMap());
        }
        return new Cosmetic(cosmetic.getId(), cosmetic.getType(), cosmeticType, cosmetic.getDisplayNames(), (cosmetic.getAssets() != null) ? ConversionsKt.toMod(cosmetic.getAssets()) : null, settings, cosmetic.getStorePackageId(), cosmetic.getPrices(), cosmetic.getTags(), cosmetic.getCreatedAt().toInstant(), (cosmetic.getAvailableAfter() != null) ? cosmetic.getAvailableAfter().toInstant() : null, (cosmetic.getAvailableUntil() != null) ? cosmetic.getAvailableUntil().toInstant() : null, ConversionsKt.skinLayersToMod(cosmetic.getSkinLayers()), cosmetic.getCategories());
    }
    
    @NotNull
    public CompletableFuture<Boolean> getCosmeticReadyStatus(@NotNull final String cosmeticId, final CosmeticAssets assets) {
        return this.cosmeticReadyStatus.computeIfAbsent(cosmeticId, key -> CompletableFuture.allOf((CompletableFuture<?>[])Arrays.stream(new EssentialAsset[] { assets.getAnimations(), assets.getGeometry().getSteve(), assets.getGeometry().getAlex(), (assets.getSkinMask() == null) ? null : assets.getSkinMask().getSteve(), (assets.getSkinMask() == null) ? null : assets.getSkinMask().getAlex(), assets.getTexture() }).filter(Objects::nonNull).map((Function<? super EssentialAsset, ?>)this::getAssetBytes).toArray(CompletableFuture[]::new)).handle((done, throwable) -> throwable == null));
    }
    
    @NotNull
    public CompletableFuture<byte[]> getAssetBytes(@NotNull final gg.essential.model.EssentialAsset asset) {
        return this.getAssetBytes(ConversionsKt.toMod(asset));
    }
    
    @NotNull
    public CompletableFuture<byte[]> getAssetBytes(@NotNull final EssentialAsset asset) {
        return this.assetCache.getAssetBytes(asset);
    }
    
    public void addCosmeticType(@NotNull final gg.essential.cosmetics.model.CosmeticType cosmeticType) {
        this.addCosmeticType(ConversionsKt.toMod(cosmeticType));
    }
    
    public void addCosmeticType(@NotNull final CosmeticType newType) {
        final String typeId = newType.getId();
        final CosmeticType oldType = this.cosmeticTypes.put(newType.getId(), newType);
        if (!newType.equals(oldType)) {
            this.cosmetics.replaceAll((cosmeticId, cosmetic) -> {
                if (typeId.equals(cosmetic.getType().getId()) && !newType.equals(cosmetic.getType())) {
                    return cosmetic.copyWithType(newType);
                }
                else {
                    return cosmetic;
                }
            });
        }
    }
    
    public void clearCosmetics() {
        this.cosmetics.clear();
        this.cosmeticNames.clear();
        this.knownCosmetics.clear();
    }
    
    public void clearCosmeticTypes() {
        this.cosmeticTypes.clear();
    }
    
    public void clearCosmeticSettings() {
        this.cosmeticSettings.clear();
    }
    
    public void clearUnlockedCosmetics() {
        this.unlockedCosmetics.clear();
    }
    
    public void clearEquippedCosmetics() {
        this.equippedCosmetics.clear();
    }
    
    @Override
    public void resetState() {
        this.updateQueue.reset();
        this.setSelectedOutfit(null);
        this.outfits.clear();
        this.clearEquippedCosmetics();
        this.clearUnlockedCosmetics();
        this.clearCosmeticSettings();
        this.clearCosmeticTypes();
        this.clearCosmetics();
        this.infraCategories.clear();
        this.requestedInfraCategories.clear();
    }
    
    @Override
    public void onConnected() {
        this.resetState();
    }
    
    @Override
    public void onSubscriptionAdded(@NotNull final Set<UUID> uuids) {
        for (final UUID uuid : uuids) {
            this.connectionManager.send(new ClientCosmeticOutfitSelectedRequestPacket(uuid));
        }
    }
    
    @Override
    public void onSubscriptionRemoved(@NotNull final Set<UUID> uuids) {
        for (final UUID uuid : uuids) {
            this.equippedCosmetics.remove(uuid);
            this.cosmeticSettings.remove(uuid);
        }
    }
    
    public void loadDevCosmetics() {
        for (final Map.Entry<String, Cosmetic> entry : this.getDevCosmetics().getAll().entrySet()) {
            if (!this.cosmetics.containsKey(entry.getKey())) {
                this.addCosmetic(entry.getValue());
            }
        }
        for (final Map.Entry<String, CosmeticType> entry2 : this.getDevCosmetics().getTypes().entrySet()) {
            if (!this.cosmeticTypes.containsKey(entry2.getKey())) {
                this.addCosmeticType(entry2.getValue());
            }
        }
    }
    
    public boolean isCreatorPartnerCosmetic(final String cosmeticId) {
        final Cosmetic cosmetic = this.cosmetics.get(cosmeticId);
        return cosmetic != null && cosmetic.getTags().contains("PARTNER");
    }
    
    public boolean isPartnerCosmetic(final String cosmeticID) {
        final Cosmetic cosmetic = this.getCosmetic(cosmeticID);
        return cosmetic != null && (this.isCreatorPartnerCosmetic(cosmeticID) || this.isModPartnerCosmetic(cosmeticID) || this.isEventPartnerCosmetic(cosmeticID)) && !cosmetic.getTags().contains("NON_PARTNER");
    }
    
    public boolean isModPartnerCosmetic(final String cosmeticId) {
        final Cosmetic cosmetic = this.cosmetics.get(cosmeticId);
        if (cosmetic == null) {
            return false;
        }
        for (final String tag : cosmetic.getTags()) {
            if (this.PARTNER_TAG_REGEX.matcher(tag).find()) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isEventPartnerCosmetic(final String cosmeticId) {
        final Cosmetic cosmetic = this.cosmetics.get(cosmeticId);
        if (cosmetic == null) {
            return false;
        }
        for (final String tag : cosmetic.getTags()) {
            if (this.EVENT_TAG_REGEX.matcher(tag).find()) {
                return true;
            }
        }
        return false;
    }
    
    @Nullable
    public String getEventIDOfCosmetic(final String cosmeticId) {
        if (!this.isEventPartnerCosmetic(cosmeticId)) {
            return null;
        }
        final Cosmetic cosmetic = this.cosmetics.get(cosmeticId);
        for (final String tag : cosmetic.getTags()) {
            final Matcher matcher = this.EVENT_TAG_REGEX.matcher(tag);
            if (matcher.find()) {
                return matcher.group("event");
            }
        }
        return null;
    }
    
    @Nullable
    public String getModIdOfCosmetic(final String cosmeticId) {
        if (!this.isModPartnerCosmetic(cosmeticId)) {
            return null;
        }
        final Cosmetic cosmetic = this.cosmetics.get(cosmeticId);
        for (final String tag : cosmetic.getTags()) {
            final Matcher matcher = this.PARTNER_TAG_REGEX.matcher(tag);
            if (matcher.find()) {
                return matcher.group("modID");
            }
        }
        return null;
    }
    
    @Nullable
    public String getPartnerName(@NotNull final String id) {
        if (this.cosmeticNames.containsKey(id)) {
            return this.cosmeticNames.get(id);
        }
        if (this.isModPartnerCosmetic(id)) {
            return this.getModIdOfCosmetic(id);
        }
        if (this.isCreatorPartnerCosmetic(id)) {
            return I18n.translate("cosmetic." + id + ".partnername", new Object[0]);
        }
        if (this.isEventPartnerCosmetic(id)) {
            return I18n.translate("studio." + this.getEventIDOfCosmetic(id), new Object[0]);
        }
        return null;
    }
    
    public void updateOutfitSkin(final OutfitSkin skin, final boolean allProfiles) {
        if (this.selectedOutfit == null && !allProfiles) {
            return;
        }
        final String formatted = skin.serialize();
        for (final CosmeticOutfit value : this.outfits.values()) {
            if (!formatted.equals(value.getSkinTexture()) && (allProfiles || value.getId().equals(this.selectedOutfit))) {
                value.setSkinTexture(formatted);
                this.connectionManager.send(new ClientCosmeticOutfitSkinUpdatePacket(value.getId(), formatted));
            }
        }
    }
    
    public void selectOutfit(final int index) {
        final List<CosmeticOutfit> orderedOutfits = this.getOrderedOutfits();
        if (index > orderedOutfits.size() - 1) {
            return;
        }
        final CosmeticOutfit cosmeticOutfit = orderedOutfits.get(index);
        final CosmeticOutfit oldOutfit = this.setSelectedOutfit(cosmeticOutfit);
        this.connectionManager.send(new ClientCosmeticOutfitSelectPacket(cosmeticOutfit.getId()));
        if (cosmeticOutfit.getSkinTexture() != null && !OutfitSkin.skinEquals(cosmeticOutfit, oldOutfit)) {
            this.applyOutfitSkin(cosmeticOutfit, false);
        }
    }
    
    private void applyOutfitSkin(final CosmeticOutfit cosmeticOutfit, final boolean updateWithMojang) {
        if (cosmeticOutfit.getSkinTexture() == null) {
            return;
        }
        final GameProfileManager gameProfileManager = Essential.getInstance().getGameProfileManager();
        final EssentialSkinManager skinManager = Essential.getInstance().getSkinManager();
        final OutfitSkin outfitSkin = OutfitSkin.getOutfitSkin(cosmeticOutfit);
        final Skin skin = (outfitSkin != null) ? outfitSkin.getSkin() : null;
        if (skin != null) {
            final Model model = skin.getModel();
            final String hash = skin.getHash();
            gameProfileManager.updatePlayerSkin(UUIDUtil.getClientUUID(), hash, model.getType());
            if (updateWithMojang) {
                skinManager.changeSkin(UMinecraft.getMinecraft().getSession().getAccessToken(), model, String.format(Locale.ROOT, "https://textures.minecraft.net/texture/%s", hash));
            }
        }
    }
    
    public List<CosmeticOutfit> getOrderedOutfits() {
        final List<CosmeticOutfit> outfits = new ArrayList<CosmeticOutfit>(this.outfits.values());
        outfits.sort(Comparator.comparingLong(value -> value.getCreatedAt().toEpochMilli()));
        return outfits;
    }
    
    @Nullable
    public CosmeticOutfit setSelectedOutfit(@Nullable final CosmeticOutfit outfit) {
        final CosmeticOutfit oldOutfit = (this.selectedOutfit != null) ? this.outfits.get(this.selectedOutfit) : null;
        if (oldOutfit != null) {
            oldOutfit.setSelected(false);
            this.selectedOutfit = null;
        }
        if (outfit == null) {
            return oldOutfit;
        }
        outfit.setSelected(true);
        this.selectedOutfit = outfit.getId();
        this.setEquippedCosmetics(UUIDUtil.getClientUUID(), outfit.getEquippedCosmetics());
        this.setCosmeticSettings(UUIDUtil.getClientUUID(), outfit.getCosmeticSettings());
        if (!OutfitSkin.skinEquals(outfit, oldOutfit)) {
            this.applyOutfitSkin(outfit, oldOutfit != null);
        }
        if (!this.initialMojangSkinSync) {
            this.initialMojangSkinSync = true;
            this.initialSyncSkinFromMojang();
        }
        return oldOutfit;
    }
    
    private void initialSyncSkinFromMojang() {
        this.syncSkinFromMojang(Essential.getInstance().getSkinManager().getActiveSkin());
    }
    
    private void syncSkinFromMojang() {
        final Skin skin = Essential.getInstance().getSkinManager().fetchActiveSkin();
        if (skin != null) {
            this.syncSkinFromMojang(skin);
        }
    }
    
    private void syncSkinFromMojang(final Skin mojangSkin) {
        final CosmeticOutfit selectedOutfit = (this.selectedOutfit != null) ? this.outfits.get(this.selectedOutfit) : null;
        if (selectedOutfit == null) {
            return;
        }
        final OutfitSkin selectedOutfitSkin = OutfitSkin.getOutfitSkin(selectedOutfit);
        final boolean selectedOutfitLocked = selectedOutfitSkin != null && selectedOutfitSkin.getLocked();
        if (selectedOutfitLocked && selectedOutfitSkin.getSkin().equals(mojangSkin)) {
            return;
        }
        final String formatted = new OutfitSkin(mojangSkin, false).serialize();
        for (final CosmeticOutfit orderedOutfit : this.getOrderedOutfits()) {
            final OutfitSkin outfitSkin = OutfitSkin.getOutfitSkin(orderedOutfit);
            if ((outfitSkin == null || !outfitSkin.getLocked()) && !formatted.equals(orderedOutfit.getSkinTexture())) {
                orderedOutfit.setSkinTexture(formatted);
                this.connectionManager.send(new ClientCosmeticOutfitSkinUpdatePacket(orderedOutfit.getId(), formatted));
            }
        }
        this.applyOutfitSkin(selectedOutfit, selectedOutfitLocked);
    }
    
    public void registerCategory(final CosmeticCategory category) {
        this.infraCategories.add(category);
        this.requestedInfraCategories.remove(category.getId());
    }
    
    public Set<CosmeticCategory> getCategories() {
        return (Set<CosmeticCategory>)ImmutableSet.copyOf((Collection<?>)this.infraCategories);
    }
    
    @Subscribe
    public void onWorldJoin(final ServerJoinEvent event) {
        Multithreading.runAsync(() -> this.syncSkinFromMojang());
    }
    
    public void toggleOwnCosmeticVisibility(final boolean notification) {
        if (!this.connectionManager.isAuthenticated()) {
            Notifications.INSTANCE.push("Cosmetics", "Please connect to the Essential Network to toggle your cosmetic visibility.");
            return;
        }
        final boolean currentState = this.ownCosmeticsVisible;
        final boolean nextState = !currentState;
        this.connectionManager.send(new ClientCosmeticsUserEquippedVisibilityTogglePacket(nextState), new CosmeticEquipVisibilityResponse(nextState, notification));
    }
    
    private /* synthetic */ void lambda$onWorldJoin$8() {
        this.syncSkinFromMojang();
    }
    
    private static /* synthetic */ long lambda$getOrderedOutfits$7(final CosmeticOutfit value) {
        return value.getCreatedAt().toEpochMilli();
    }
    
    private static /* synthetic */ Cosmetic lambda$addCosmeticType$6(final String typeId, final CosmeticType newType, final String cosmeticId, final Cosmetic cosmetic) {
        if (typeId.equals(cosmetic.getType().getId()) && !newType.equals(cosmetic.getType())) {
            return cosmetic.copyWithType(newType);
        }
        return cosmetic;
    }
    
    private /* synthetic */ CompletableFuture lambda$getCosmeticReadyStatus$5(final CosmeticAssets assets, final String key) {
        return CompletableFuture.allOf((CompletableFuture<?>[])Arrays.stream(new EssentialAsset[] { assets.getAnimations(), assets.getGeometry().getSteve(), assets.getGeometry().getAlex(), (assets.getSkinMask() == null) ? null : assets.getSkinMask().getSteve(), (assets.getSkinMask() == null) ? null : assets.getSkinMask().getAlex(), assets.getTexture() }).filter(Objects::nonNull).map((Function<? super EssentialAsset, ?>)this::getAssetBytes).toArray(CompletableFuture[]::new)).handle((done, throwable) -> throwable == null);
    }
    
    private static /* synthetic */ Boolean lambda$getCosmeticReadyStatus$4(final Void done, final Throwable throwable) {
        return throwable == null;
    }
    
    private static /* synthetic */ CompletableFuture[] lambda$getCosmeticReadyStatus$3(final int x$0) {
        return new CompletableFuture[x$0];
    }
    
    private static /* synthetic */ boolean lambda$addCosmetic$2(final String category, final CosmeticCategory cosmeticCategory) {
        return cosmeticCategory.getId().equals(category);
    }
    
    private /* synthetic */ void lambda$addCosmetic$1(final gg.essential.cosmetics.model.Cosmetic finalCosmetic, final byte[] bytes) {
        final Type settingsType = new TypeToken<ArrayList<CosmeticSetting>>() {
            CosmeticsManager$1() {
                super();
            }
        }.getType();
        final Cosmetic cosmetic = this.createCosmeticFromNetwork(finalCosmetic, this.gson.fromJson(new String(bytes, StandardCharsets.UTF_8), settingsType));
        this.addCosmetic(cosmetic);
    }
    
    private static /* synthetic */ void lambda$setCosmeticSettings$0(final ImmutableMap.Builder builder, final String key, final List value) {
        builder.put(key, ImmutableList.copyOf((Collection<?>)value));
    }
}
