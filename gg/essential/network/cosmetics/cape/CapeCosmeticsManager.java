package gg.essential.network.cosmetics.cape;

import gg.essential.network.connectionmanager.*;
import gg.essential.network.connectionmanager.cosmetics.*;
import java.util.concurrent.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.*;
import org.apache.logging.log4j.*;
import gg.essential.api.utils.*;
import net.minecraft.client.*;
import net.minecraft.client.render.entity.*;
import gg.essential.connectionmanager.common.packet.*;
import java.util.*;
import gg.essential.connectionmanager.common.packet.cosmetic.*;
import gg.essential.connectionmanager.common.packet.response.*;
import gg.essential.mod.cosmetics.*;
import kotlin.collections.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000D
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0
                                                   2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\bJ\b\u0010\u0017\u001a\u00020\u0014H\u0002J\u0006\u0010\u0018\u001a\u00020\u0014R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0016\u0010	\u001a
                                                   \u0012\u0004\u0012\u00020\u000b\u0018\u00010
                                                   X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002
                                                   \u0000¨\u0006\u001b""" }, d2 = { "Lgg/essential/network/cosmetics/cape/CapeCosmeticsManager;", "", "connectionManager", "Lgg/essential/network/connectionmanager/ConnectionManager;", "cosmeticsManager", "Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;", "(Lgg/essential/network/connectionmanager/ConnectionManager;Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;)V", "activeCape", "", "cachedCapes", "", "Lgg/essential/network/cosmetics/cape/MojangCapeApi$Cape;", "mojangLock", "Ljava/util/concurrent/Semaphore;", "queued", "Lgg/essential/network/cosmetics/cape/CapeCosmeticsManager$Upload;", "fetchCapes", "allowCache", "", "flushCapeUpdates", "", "queueCape", "hash", "unlockMissingCapes", "unlockMissingCapesAsync", "Companion", "Upload", "essential" })
public final class CapeCosmeticsManager
{
    @NotNull
    private final ConnectionManager connectionManager;
    @NotNull
    private final CosmeticsManager cosmeticsManager;
    @NotNull
    private final Semaphore mojangLock;
    @Nullable
    private List<MojangCapeApi.Cape> cachedCapes;
    @Nullable
    private String activeCape;
    @Nullable
    private CapeCosmeticsManager.Upload queued;
    
    public CapeCosmeticsManager(@NotNull final ConnectionManager connectionManager, @NotNull final CosmeticsManager cosmeticsManager) {
        Intrinsics.checkNotNullParameter((Object)connectionManager, "connectionManager");
        Intrinsics.checkNotNullParameter((Object)cosmeticsManager, "cosmeticsManager");
        super();
        this.connectionManager = connectionManager;
        this.cosmeticsManager = cosmeticsManager;
        this.mojangLock = new Semaphore(1);
    }
    
    private final List<MojangCapeApi.Cape> fetchCapes(final boolean allowCache) {
        List<MojangCapeApi.Cape> list = allowCache ? this.cachedCapes : null;
        if (list == null) {
            final List capes;
            final List list2 = capes = MojangCapeApi.INSTANCE.fetchCapes();
            Label_0138: {
                synchronized (this) {
                    this.cachedCapes = capes;
                    while (true) {
                        for (final Object next : capes) {
                            final MojangCapeApi.Cape it = (MojangCapeApi.Cape)next;
                            if (it.getActive()) {
                                final MojangCapeApi.Cape cape = (MojangCapeApi.Cape)next;
                                final MojangCapeApi.Cape cape2 = cape;
                                this.activeCape = ((cape2 != null) ? cape2.getHash() : null);
                                final Unit instance = Unit.INSTANCE;
                                break Label_0138;
                            }
                        }
                        final MojangCapeApi.Cape cape = null;
                        continue;
                    }
                }
            }
            list = list2;
        }
        return list;
    }
    
    public final void queueCape(@Nullable final String hash) {
        synchronized (this) {
            this.queued = new CapeCosmeticsManager.Upload(hash);
            final Unit instance = Unit.INSTANCE;
        }
    }
    
    public final void flushCapeUpdates() {
        final Ref$ObjectRef cape = new Ref$ObjectRef();
        this.mojangLock.acquire();
        try {
            final List capes = this.fetchCapes(true);
            Label_0195: {
                synchronized (this) {
                    final CapeCosmeticsManager.Upload queued = this.queued;
                    this.queued = null;
                    final CapeCosmeticsManager.Upload upload2 = queued;
                    if (upload2 == null) {
                        return;
                    }
                    final CapeCosmeticsManager.Upload upload = upload2;
                    if (Intrinsics.areEqual((Object)upload.getHash(), (Object)this.activeCape)) {
                        return;
                    }
                    final Ref$ObjectRef ref$ObjectRef = cape;
                    final Iterable iterable = capes;
                    final Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                    while (true) {
                        for (final Object next : iterable) {
                            final MojangCapeApi.Cape it = (MojangCapeApi.Cape)next;
                            if (Intrinsics.areEqual((Object)it.getHash(), (Object)upload.getHash())) {
                                final Object element = next;
                                ref$ObjectRef2.element = element;
                                final MojangCapeApi.Cape cape2 = (MojangCapeApi.Cape)cape.element;
                                this.activeCape = ((cape2 != null) ? cape2.getHash() : null);
                                final Unit instance = Unit.INSTANCE;
                                break Label_0195;
                            }
                        }
                        final Object element = null;
                        continue;
                    }
                }
            }
            final MojangCapeApi instance2 = MojangCapeApi.INSTANCE;
            final MojangCapeApi.Cape cape3 = (MojangCapeApi.Cape)cape.element;
            instance2.putCape((cape3 != null) ? cape3.getId() : null);
            final Logger logger = Essential.logger;
            final MojangCapeApi.Cape cape4 = (MojangCapeApi.Cape)cape.element;
            String name;
            if (cape4 == null || (name = cape4.getName()) == null) {
                name = "<none>";
            }
            logger.info("Updated Mojang cape to \"" + name);
        }
        catch (final Throwable e) {
            Essential.logger.error("Error enabling cape " + cape.element + " at Mojang:", e);
        }
        finally {
            this.mojangLock.release();
        }
    }
    
    public final void unlockMissingCapesAsync() {
        Multithreading.getScheduledPool().execute(CapeCosmeticsManager::unlockMissingCapesAsync$lambda-7);
        if (!this.cosmeticsManager.getUnlockedCosmetics().contains("CAPE_DISABLED")) {
            final boolean capesVisible = MinecraftClient.getInstance().options.isPlayerModelPartEnabled(PlayerModelPart.CAPE);
            this.connectionManager.send(new ClientCosmeticCheckoutPacket(SetsKt.setOf((Object)"CAPE_DISABLED")), CapeCosmeticsManager::unlockMissingCapesAsync$lambda-9);
        }
    }
    
    private final void unlockMissingCapes() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: iconst_0       
        //     2: invokespecial   gg/essential/network/cosmetics/cape/CapeCosmeticsManager.fetchCapes:(Z)Ljava/util/List;
        //     5: astore_1        /* capes */
        //     6: aload_1         /* capes */
        //     7: checkcast       Ljava/lang/Iterable;
        //    10: astore_3        /* $this$filter$iv */
        //    11: aload_3         /* $this$filter$iv */
        //    12: astore          5
        //    14: new             Ljava/util/ArrayList;
        //    17: dup            
        //    18: invokespecial   java/util/ArrayList.<init>:()V
        //    21: checkcast       Ljava/util/Collection;
        //    24: astore          destination$iv$iv
        //    26: aload           $this$filterTo$iv$iv
        //    28: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    33: astore          8
        //    35: aload           8
        //    37: invokeinterface java/util/Iterator.hasNext:()Z
        //    42: ifeq            102
        //    45: aload           8
        //    47: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    52: astore          element$iv$iv
        //    54: aload           element$iv$iv
        //    56: checkcast       Lgg/essential/network/cosmetics/cape/MojangCapeApi$Cape;
        //    59: astore          it
        //    61: aload_0         /* this */
        //    62: getfield        gg/essential/network/cosmetics/cape/CapeCosmeticsManager.cosmeticsManager:Lgg/essential/network/connectionmanager/cosmetics/CosmeticsManager;
        //    65: invokevirtual   gg/essential/network/connectionmanager/cosmetics/CosmeticsManager.getUnlockedCosmetics:()Ljava/util/Set;
        //    68: aload           it
        //    70: invokevirtual   gg/essential/network/cosmetics/cape/MojangCapeApi$Cape.getHash:()Ljava/lang/String;
        //    73: invokeinterface java/util/Set.contains:(Ljava/lang/Object;)Z
        //    78: ifne            85
        //    81: iconst_1       
        //    82: goto            86
        //    85: iconst_0       
        //    86: ifeq            35
        //    89: aload           destination$iv$iv
        //    91: aload           element$iv$iv
        //    93: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    98: pop            
        //    99: goto            35
        //   102: aload           destination$iv$iv
        //   104: checkcast       Ljava/util/List;
        //   107: astore_2        /* missing */
        //   108: aload_2         /* missing */
        //   109: invokeinterface java/util/List.isEmpty:()Z
        //   114: ifeq            118
        //   117: return         
        //   118: aload_1         /* capes */
        //   119: checkcast       Ljava/lang/Iterable;
        //   122: astore          5
        //   124: aload           5
        //   126: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   131: astore          6
        //   133: aload           6
        //   135: invokeinterface java/util/Iterator.hasNext:()Z
        //   140: ifeq            172
        //   143: aload           6
        //   145: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   150: astore          7
        //   152: aload           7
        //   154: checkcast       Lgg/essential/network/cosmetics/cape/MojangCapeApi$Cape;
        //   157: astore          it
        //   159: aload           it
        //   161: invokevirtual   gg/essential/network/cosmetics/cape/MojangCapeApi$Cape.getActive:()Z
        //   164: ifeq            133
        //   167: aload           7
        //   169: goto            173
        //   172: aconst_null    
        //   173: checkcast       Lgg/essential/network/cosmetics/cape/MojangCapeApi$Cape;
        //   176: astore_3        /* originallyActive */
        //   177: aload_3         /* originallyActive */
        //   178: astore          active
        //   180: new             Ljava/util/ArrayList;
        //   183: dup            
        //   184: invokespecial   java/util/ArrayList.<init>:()V
        //   187: checkcast       Ljava/util/List;
        //   190: astore          signatures
        //   192: aload_2         /* missing */
        //   193: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   198: astore          6
        //   200: aload           6
        //   202: invokeinterface java/util/Iterator.hasNext:()Z
        //   207: ifeq            285
        //   210: aload           6
        //   212: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   217: checkcast       Lgg/essential/network/cosmetics/cape/MojangCapeApi$Cape;
        //   220: astore          cape
        //   222: aload           cape
        //   224: aload           active
        //   226: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   229: ifne            253
        //   232: getstatic       gg/essential/network/cosmetics/cape/MojangCapeApi.INSTANCE:Lgg/essential/network/cosmetics/cape/MojangCapeApi;
        //   235: aload           cape
        //   237: invokevirtual   gg/essential/network/cosmetics/cape/MojangCapeApi$Cape.getId:()Ljava/lang/String;
        //   240: invokevirtual   gg/essential/network/cosmetics/cape/MojangCapeApi.putCape:(Ljava/lang/String;)V
        //   243: ldc2_w          1000
        //   246: invokestatic    java/lang/Thread.sleep:(J)V
        //   249: aload           cape
        //   251: astore          active
        //   253: getstatic       gg/essential/network/cosmetics/cape/MojangCapeApi.INSTANCE:Lgg/essential/network/cosmetics/cape/MojangCapeApi;
        //   256: invokevirtual   gg/essential/network/cosmetics/cape/MojangCapeApi.fetchCurrentTextures:()Lcom/mojang/authlib/properties/Property;
        //   259: astore          property
        //   261: aload           signatures
        //   263: aload           property
        //   265: invokevirtual   com/mojang/authlib/properties/Property.getValue:()Ljava/lang/String;
        //   268: aload           property
        //   270: invokevirtual   com/mojang/authlib/properties/Property.getSignature:()Ljava/lang/String;
        //   273: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   276: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   281: pop            
        //   282: goto            200
        //   285: aload_3         /* originallyActive */
        //   286: aload           active
        //   288: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   291: ifne            313
        //   294: getstatic       gg/essential/network/cosmetics/cape/MojangCapeApi.INSTANCE:Lgg/essential/network/cosmetics/cape/MojangCapeApi;
        //   297: aload_3         /* originallyActive */
        //   298: dup            
        //   299: ifnull          308
        //   302: invokevirtual   gg/essential/network/cosmetics/cape/MojangCapeApi$Cape.getId:()Ljava/lang/String;
        //   305: goto            310
        //   308: pop            
        //   309: aconst_null    
        //   310: invokevirtual   gg/essential/network/cosmetics/cape/MojangCapeApi.putCape:(Ljava/lang/String;)V
        //   313: aload_0         /* this */
        //   314: getfield        gg/essential/network/cosmetics/cape/CapeCosmeticsManager.connectionManager:Lgg/essential/network/connectionmanager/ConnectionManager;
        //   317: new             Lgg/essential/connectionmanager/common/packet/cosmetic/capes/ClientCosmeticCapesUnlockedPacket;
        //   320: dup            
        //   321: aload           signatures
        //   323: checkcast       Ljava/lang/Iterable;
        //   326: invokestatic    kotlin/collections/MapsKt.toMap:(Ljava/lang/Iterable;)Ljava/util/Map;
        //   329: invokespecial   gg/essential/connectionmanager/common/packet/cosmetic/capes/ClientCosmeticCapesUnlockedPacket.<init>:(Ljava/util/Map;)V
        //   332: checkcast       Lgg/essential/connectionmanager/common/packet/Packet;
        //   335: aload_2         /* missing */
        //   336: aload           signatures
        //   338: invokedynamic   BootstrapMethod #4, accept:(Ljava/util/List;Ljava/util/List;)Ljava/util/function/Consumer;
        //   343: invokevirtual   gg/essential/network/connectionmanager/ConnectionManager.send:(Lgg/essential/connectionmanager/common/packet/Packet;Ljava/util/function/Consumer;)V
        //   346: return         
        //    StackMapTable: 00 0E FF 00 23 00 09 07 00 02 07 00 4F 00 07 00 5A 00 07 00 5A 07 01 34 00 07 00 60 00 00 FD 00 31 07 00 04 07 00 6A 40 01 F9 00 0F FF 00 0F 00 09 07 00 02 07 00 4F 07 00 4F 07 00 5A 00 07 00 5A 07 01 34 00 07 00 60 00 00 FF 00 0E 00 09 07 00 02 07 00 4F 07 00 4F 07 00 5A 00 07 00 5A 07 00 60 00 07 00 04 00 00 26 40 07 00 04 FF 00 1A 00 09 07 00 02 07 00 4F 07 00 4F 07 00 6A 07 00 6A 07 00 4F 07 00 60 00 07 00 04 00 00 FF 00 34 00 09 07 00 02 07 00 4F 07 00 4F 07 00 6A 07 00 6A 07 00 4F 07 00 60 07 00 6A 07 00 04 00 00 FF 00 1F 00 09 07 00 02 07 00 4F 07 00 4F 07 00 6A 07 00 6A 07 00 4F 07 00 60 00 07 00 04 00 00 FF 00 16 00 09 07 00 02 07 00 4F 07 00 4F 07 00 6A 07 00 6A 07 00 4F 07 00 60 00 07 00 04 00 02 07 00 51 07 00 6A FF 00 01 00 09 07 00 02 07 00 4F 07 00 4F 07 00 6A 07 00 6A 07 00 4F 07 00 60 00 07 00 04 00 02 07 00 51 07 00 73 02
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static final void unlockMissingCapesAsync$lambda-7(final CapeCosmeticsManager this$0) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        this$0.mojangLock.acquire();
        try {
            this$0.unlockMissingCapes();
        }
        catch (final Throwable e) {
            Essential.logger.error("Error loading capes from Mojang:", e);
        }
        finally {
            this$0.mojangLock.release();
        }
    }
    
    private static final void unlockMissingCapesAsync$lambda-9(final boolean $capesVisible, final CapeCosmeticsManager this$0, final Optional maybeReply) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        final Packet reply = maybeReply.orElse(null);
        if (!(reply instanceof ServerCosmeticsUserUnlockedPacket) && (!(reply instanceof ResponseActionPacket) || !((ResponseActionPacket)reply).isSuccessful())) {
            Essential.logger.error("Failed to unlock CAPE_DISABLED (" + maybeReply + ").");
            return;
        }
        if (Essential.getInstance().isNewInstallation) {
            if (!$capesVisible) {
                final List<CosmeticOutfit> orderedOutfits = this$0.cosmeticsManager.getOrderedOutfits();
                Intrinsics.checkNotNullExpressionValue((Object)orderedOutfits, "cosmeticsManager.orderedOutfits");
                final List $this$indexOfFirst$iv = orderedOutfits;
                int index$iv = 0;
                while (true) {
                    for (final Object item$iv : $this$indexOfFirst$iv) {
                        final CosmeticOutfit it = (CosmeticOutfit)item$iv;
                        if (it.isSelected()) {
                            final int n = index$iv;
                            final int selectedOutfit = n;
                            if (selectedOutfit != -1) {
                                this$0.cosmeticsManager.updateEquippedCosmetic(selectedOutfit, CosmeticSlot.CAPE, "CAPE_DISABLED");
                            }
                            return;
                        }
                        else {
                            ++index$iv;
                        }
                    }
                    final int n = -1;
                    continue;
                }
            }
        }
        else {
            for (int index = 0; index < this$0.cosmeticsManager.getOrderedOutfits().size(); ++index) {
                this$0.cosmeticsManager.updateEquippedCosmetic(index, CosmeticSlot.CAPE, null);
            }
        }
    }
    
    private static final void unlockMissingCapes$lambda-12(final List $missing, final List $signatures, final Optional reply) {
        Intrinsics.checkNotNullParameter((Object)$missing, "$missing");
        Intrinsics.checkNotNullParameter((Object)$signatures, "$signatures");
        final ResponseActionPacket responseActionPacket = reply.orElse(null);
        if (responseActionPacket == null || !responseActionPacket.isSuccessful()) {
            Essential.logger.warn("Backend failed to unlock capes (" + reply + "):");
            for (Pair pair : CollectionsKt.zip((Iterable)$missing, (Iterable)$signatures)) {
                final MojangCapeApi.Cape cape = (MojangCapeApi.Cape)pair.component1();
                final Pair proof = (Pair)pair.component2();
                Essential.logger.warn("  - " + cape.getName());
                Essential.logger.warn("      Id: " + cape.getId());
                Essential.logger.warn("      Url: " + cape.getUrl());
                Essential.logger.warn("      Proof of ownership: " + proof.getFirst());
                Essential.logger.warn("      Signature: " + proof.getSecond());
            }
        }
    }
    
    static {
        new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0012
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0010\u000e
                                                       \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002
                                                       \u0000¨\u0006\u0005""" }, d2 = { "Lgg/essential/network/cosmetics/cape/CapeCosmeticsManager$Companion;", "", "()V", "CAPE_DISABLED_COSMETIC_ID", "", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
