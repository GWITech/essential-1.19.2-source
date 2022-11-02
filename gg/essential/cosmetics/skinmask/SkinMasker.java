package gg.essential.cosmetics.skinmask;

import kotlin.*;
import gg.essential.model.*;
import gg.essential.universal.*;
import gg.essential.*;
import gg.essential.network.cosmetics.*;
import gg.essential.util.*;
import java.util.concurrent.*;
import gg.essential.network.connectionmanager.cosmetics.*;
import gg.essential.mod.cosmetics.*;
import gg.essential.mod.*;
import javax.imageio.*;
import java.io.*;
import java.awt.image.*;
import java.util.*;

public class SkinMasker
{
    private static final Map<EnumPart, Pair<Vector3, Vector3>> skinArea;
    private static final Map<EnumPart, List<SkinRegion>> skinRegions;
    private static final Pair<Integer, Integer> cachedOutOfBounds;
    
    public static CompletableFuture<UImage> generateMaskedSkin(final UImage skin, final String skinType, final SkinMaskConfig config) {
        final CosmeticsManager cosmeticsManager = Essential.getInstance().getConnectionManager().getCosmeticsManager();
        final List<CompletableFuture<ModelMaskInstance>> maskFutures = new ArrayList<CompletableFuture<ModelMaskInstance>>();
        for (final Cosmetic cosmetic : config.getCosmetics()) {
            final CosmeticAssets.SkinMask skinMasks = cosmetic.getAssets().getSkinMask();
            if (skinMasks != null) {
                final EssentialAsset steveSkinMask = skinMasks.getSteve();
                final EssentialAsset alexSkinMask = skinMasks.getAlex();
                List<SkinPartSetting> cosmeticSettings = config.getSettings().get(cosmetic);
                if (cosmeticSettings == null) {
                    cosmeticSettings = Collections.emptyList();
                }
                final SkinPartSetting[] settings = cosmeticSettings.toArray(new SkinPartSetting[0]);
                CompletableFuture<byte[]> assetBytes = null;
                if (steveSkinMask != null && ("default".equals(skinType) || alexSkinMask == null)) {
                    assetBytes = cosmeticsManager.getAssetBytes(steveSkinMask);
                }
                if (alexSkinMask != null && "slim".equalsIgnoreCase(skinType)) {
                    assetBytes = cosmeticsManager.getAssetBytes(alexSkinMask);
                }
                if (assetBytes == null) {
                    continue;
                }
                maskFutures.add(assetBytes.thenApply(it -> new ModelMaskInstance(it, settings)));
            }
        }
        return ExtensionsKt.merge((List<? extends CompletableFuture<Object>>)maskFutures).thenApplyAsync(masks -> applyMasks(skin, masks), (Executor)Multithreading.POOL);
    }
    
    private static UImage applyMasks(final UImage image, final List<ModelMaskInstance> masks) {
        final UImage newImage = UImage.ofSize(64, 64, false);
        newImage.copyFrom(image);
        for (final ModelMaskInstance maskInfo : masks) {
            BufferedImage mask;
            try {
                mask = ImageIO.read(new ByteArrayInputStream(maskInfo.data));
            }
            catch (final IOException e) {
                e.printStackTrace();
                continue;
            }
            for (int x = 0; x < mask.getWidth(); ++x) {
            Label_0282:
                for (int y = 0; y < mask.getHeight(); ++y) {
                    final int rgb = mask.getRGB(x, y);
                    if ((rgb >> 16 & 0xFF) == 0x0 && (rgb >> 8 & 0xFF) == 0x0 && (rgb & 0xFF) == 0x0) {
                        final SkinPartSetting[] settings = maskInfo.settings;
                        final int length = settings.length;
                        int i = 0;
                        while (i < length) {
                            final SkinPartSetting skinPartSetting = settings[i];
                            if (isPointInside(skinPartSetting.getPart(), x, y)) {
                                if (!skinPartSetting.isHidden()) {
                                    final Pair<Integer, Integer> integerIntegerPair = applyPixelShift(skinPartSetting.getPart(), x, y, skinPartSetting.getShiftX(), skinPartSetting.getShiftY(), skinPartSetting.getShiftZ());
                                    if ((int)integerIntegerPair.getFirst() != -1) {
                                        newImage.setPixelRGBA((int)integerIntegerPair.component1(), (int)integerIntegerPair.component2(), 0);
                                    }
                                }
                                continue Label_0282;
                            }
                            else {
                                ++i;
                            }
                        }
                        newImage.setPixelRGBA(x, y, 0);
                    }
                }
            }
        }
        return newImage;
    }
    
    private static Pair<Integer, Integer> applyPixelShift(final EnumPart part, final int x, final int y, final int shiftX, final int shiftY, final int shiftZ) {
        final List<SkinRegion> skinRegions = SkinMasker.skinRegions.get(part);
        if (skinRegions == null || skinRegions.isEmpty()) {
            return (Pair<Integer, Integer>)new Pair((Object)x, (Object)y);
        }
        for (final SkinRegion skinRegion : skinRegions) {
            final int adjustX = x - skinRegion.getX();
            final int adjustY = y - 0;
            final Region region = getRegion(skinRegion, adjustX, adjustY);
            switch (region) {
                case NONE: {
                    continue;
                }
                case FRONT: {
                    if (shiftZ == 0 && region == getRegion(skinRegion, adjustX + shiftX, adjustY - shiftY)) {
                        return (Pair<Integer, Integer>)new Pair((Object)(x + shiftX), (Object)(y - shiftY));
                    }
                    return SkinMasker.cachedOutOfBounds;
                }
                case BACK: {
                    if (shiftZ == 0 && region == getRegion(skinRegion, adjustX - shiftX, adjustY - shiftY)) {
                        return (Pair<Integer, Integer>)new Pair((Object)(x - shiftX), (Object)(y - shiftY));
                    }
                    return SkinMasker.cachedOutOfBounds;
                }
                case RIGHT: {
                    if (shiftX == 0 && region == getRegion(skinRegion, adjustX - shiftZ, adjustY - shiftY)) {
                        return (Pair<Integer, Integer>)new Pair((Object)(x - shiftZ), (Object)(y - shiftY));
                    }
                    return SkinMasker.cachedOutOfBounds;
                }
                case LEFT: {
                    if (shiftX == 0 && region == getRegion(skinRegion, adjustX + shiftZ, adjustY - shiftY)) {
                        return (Pair<Integer, Integer>)new Pair((Object)(x + shiftZ), (Object)(y - shiftY));
                    }
                    return SkinMasker.cachedOutOfBounds;
                }
                case TOP: {
                    if (shiftY == 0 && region == getRegion(skinRegion, adjustX + shiftX, adjustY + shiftZ)) {
                        return (Pair<Integer, Integer>)new Pair((Object)(x + shiftX), (Object)(y + shiftZ));
                    }
                    return SkinMasker.cachedOutOfBounds;
                }
                case BOTTOM: {
                    if (shiftY == 0 && region == getRegion(skinRegion, adjustX - shiftZ, adjustY + shiftZ)) {
                        return (Pair<Integer, Integer>)new Pair((Object)(x - shiftX), (Object)(y + shiftZ));
                    }
                    return SkinMasker.cachedOutOfBounds;
                }
                default: {
                    continue;
                }
            }
        }
        return (Pair<Integer, Integer>)new Pair((Object)x, (Object)y);
    }
    
    private static Region getRegion(final SkinRegion region, final int adjustX, final int adjustY) {
        if (adjustX < 0 || adjustY < 0 || adjustX > 32 || adjustY > 16) {
            return Region.NONE;
        }
        final boolean thirdColumn = adjustX >= 16 && adjustX <= 24;
        final boolean secondColumn = adjustX >= 8 && adjustX <= 16;
        if (adjustY >= 8) {
            if (adjustX < 8) {
                return Region.RIGHT;
            }
            if (secondColumn) {
                return Region.FRONT;
            }
            if (thirdColumn) {
                return Region.LEFT;
            }
            if (adjustX > 24) {
                return Region.BACK;
            }
        }
        else {
            if (secondColumn) {
                return Region.TOP;
            }
            if (thirdColumn) {
                return Region.BOTTOM;
            }
        }
        return Region.NONE;
    }
    
    private static boolean isPointInside(final EnumPart part, final int x, final int y) {
        final Pair<Vector3, Vector3> box = SkinMasker.skinArea.get(part);
        if (box == null) {
            return false;
        }
        final Vector3 min = (Vector3)box.component1();
        final Vector3 max = (Vector3)box.component2();
        return x >= min.x && x <= max.x && y >= min.y && y <= max.y;
    }
    
    private static /* synthetic */ UImage lambda$generateMaskedSkin$1(final UImage skin, final List masks) {
        return applyMasks(skin, masks);
    }
    
    private static /* synthetic */ ModelMaskInstance lambda$generateMaskedSkin$0(final SkinPartSetting[] settings, final byte[] it) {
        return new ModelMaskInstance(it, settings);
    }
    
    static {
        skinArea = new EnumMap<EnumPart, Pair<Vector3, Vector3>>(EnumPart.class);
        skinRegions = new EnumMap<EnumPart, List<SkinRegion>>(EnumPart.class);
        cachedOutOfBounds = new Pair((Object)(-1), (Object)(-1));
        SkinMasker.skinArea.put(EnumPart.HEAD, (Pair<Vector3, Vector3>)new Pair((Object)new Vector3(0.0f, 0.0f, 0.0f), (Object)new Vector3(64.0f, 16.0f, 0.0f)));
        SkinMasker.skinArea.put(EnumPart.BODY, (Pair<Vector3, Vector3>)new Pair((Object)new Vector3(17.0f, 17.0f, 0.0f), (Object)new Vector3(41.0f, 49.0f, 0.0f)));
        SkinMasker.skinArea.put(EnumPart.LEFT_ARM, (Pair<Vector3, Vector3>)new Pair((Object)new Vector3(33.0f, 50.0f, 0.0f), (Object)new Vector3(57.0f, 65.0f, 0.0f)));
        SkinMasker.skinArea.put(EnumPart.RIGHT_ARM, (Pair<Vector3, Vector3>)new Pair((Object)new Vector3(41.0f, 17.0f, 0.0f), (Object)new Vector3(57.0f, 49.0f, 0.0f)));
        SkinMasker.skinArea.put(EnumPart.LEFT_LEG, (Pair<Vector3, Vector3>)new Pair((Object)new Vector3(0.0f, 49.0f, 0.0f), (Object)new Vector3(32.0f, 64.0f, 0.0f)));
        SkinMasker.skinArea.put(EnumPart.RIGHT_LEG, (Pair<Vector3, Vector3>)new Pair((Object)new Vector3(0.0f, 17.0f, 0.0f), (Object)new Vector3(16.0f, 48.0f, 0.0f)));
        SkinMasker.skinRegions.put(EnumPart.HEAD, Arrays.asList(new SkinRegion(0), new SkinRegion(32)));
    }
    
    enum Region
    {
        TOP, 
        BOTTOM, 
        RIGHT, 
        FRONT, 
        LEFT, 
        BACK, 
        NONE;
        
        private static final /* synthetic */ Region[] $VALUES;
        
        public static Region[] values() {
            return Region.$VALUES.clone();
        }
        
        public static Region valueOf(final String name) {
            return Enum.valueOf(Region.class, name);
        }
        
        private static /* synthetic */ Region[] $values() {
            return new Region[] { Region.TOP, Region.BOTTOM, Region.RIGHT, Region.FRONT, Region.LEFT, Region.BACK, Region.NONE };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
