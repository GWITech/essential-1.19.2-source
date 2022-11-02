package gg.essential.gui.common;

import com.mojang.authlib.*;
import net.minecraft.client.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.entity.player.*;
import gg.essential.event.client.*;
import gg.essential.elementa.state.*;
import gg.essential.universal.*;
import gg.essential.handlers.*;
import kotlin.ranges.*;
import net.minecraft.client.world.*;
import net.minecraft.client.gui.screen.*;
import gg.essential.util.*;
import java.util.*;
import net.minecraft.client.network.*;
import net.minecraft.network.*;
import io.netty.channel.*;
import io.netty.channel.embedded.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import com.google.common.collect.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000Z
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b	
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006\u0018\u0000 -2\u00020\u0001:\u0004-./0BG\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010	J\b\u0010\u001e\u001a\u00020\rH\u0016J)\u0010
                                                   \u001a\u00020\u00002!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110\f¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b("\u0012\u0004\u0012\u00020\r0\u000bJ\u0010\u0010#\u001a\u00020\r2\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\rH\u0002J\b\u0010'\u001a\u00020\rH\u0002J\u0006\u0010(\u001a\u00020\rJ\u0006\u0010)\u001a\u00020\rJ+\u0010*\u001a\u00020\r2!\u0010\u001f\u001a\u001d\u0012\u0013\u0012\u00110+¢\u0006\f\b \u0012\b\b!\u0012\u0004\b\b("\u0012\u0004\u0012\u00020\r0\u000bH\u0002J\f\u0010,\u001a\u00020\r*\u00020+H\u0002R\u001f\u0010
                                                   \u001a\u0013\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eX\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0010\u0010\u0011"\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0019\u0010\u0006\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001b\u0010\u001aR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002
                                                   \u0000¨\u00061""" }, d2 = { "Lgg/essential/gui/common/EmulatedUI3DPlayer;", "Lgg/essential/gui/common/UI3DPlayer;", "showCape", "Lgg/essential/elementa/state/State;", "", "draggable", "profile", "Lcom/mojang/authlib/GameProfile;", "renderNameTag", "(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)V", "configurePlayer", "Lkotlin/Function1;", "Lnet/minecraft/client/network/OtherClientPlayerEntity;", "", "Lkotlin/ExtensionFunctionType;", "cosmeticAnimationsPaused", "getCosmeticAnimationsPaused", "()Z", "setCosmeticAnimationsPaused", "(Z)V", "currentProfile", "failedPlayerInit", "initializedPlayer", "mcClient", "Lnet/minecraft/client/MinecraftClient;", "getProfile", "()Lgg/essential/elementa/state/State;", "getShowCape", "tickCounter", "", "animationFrame", "block", "Lkotlin/ParameterName;", "name", "player", "draw", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "initPlayer", "onGameTick", "pauseCosmeticAnimations", "resumeCosmeticAnimations", "withFakeClientFields", "Lnet/minecraft/entity/player/PlayerEntity;", "updateVisibleModelParts", "Companion", "EmulatedPlayer", "FakeNetHandlerPlayClient", "FakeWorld", "essential" })
public final class EmulatedUI3DPlayer extends UI3DPlayer
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final State<Boolean> showCape;
    @NotNull
    private final State<GameProfile> profile;
    @NotNull
    private final MinecraftClient mcClient;
    private int tickCounter;
    @Nullable
    private GameProfile currentProfile;
    private boolean initializedPlayer;
    private boolean failedPlayerInit;
    @NotNull
    private Function1<? super OtherClientPlayerEntity, Unit> configurePlayer;
    
    public EmulatedUI3DPlayer(@NotNull final State<Boolean> showCape, @NotNull final State<Boolean> draggable, @NotNull final State<GameProfile> profile, @NotNull final State<Boolean> renderNameTag) {
        Intrinsics.checkNotNullParameter((Object)showCape, "showCape");
        Intrinsics.checkNotNullParameter((Object)draggable, "draggable");
        Intrinsics.checkNotNullParameter((Object)profile, "profile");
        Intrinsics.checkNotNullParameter((Object)renderNameTag, "renderNameTag");
        super((State<Boolean>)renderNameTag.map((kotlin.jvm.functions.Function1<? super Boolean, ?>)EmulatedUI3DPlayer$1.INSTANCE), draggable, null, profile);
        this.showCape = showCape;
        this.profile = profile;
        this.mcClient = UMinecraft.getMinecraft();
        this.tickCounter = ClientTickEvent.counter;
        this.currentProfile = this.profile.get();
        this.configurePlayer = (Function1<? super OtherClientPlayerEntity, Unit>)EmulatedUI3DPlayer$configurePlayer.EmulatedUI3DPlayer$configurePlayer$1.INSTANCE;
    }
    
    public EmulatedUI3DPlayer(State showCape, State draggable, State profile, State renderNameTag, final int n) {
        if ((n & 0x1) != 0x0) {
            showCape = new BasicState(true);
        }
        if ((n & 0x2) != 0x0) {
            draggable = new BasicState(true);
        }
        if ((n & 0x4) != 0x0) {
            profile = new BasicState(null);
        }
        if ((n & 0x8) != 0x0) {
            renderNameTag = new BasicState(false);
        }
        this(showCape, draggable, profile, renderNameTag);
    }
    
    @NotNull
    public final State<Boolean> getShowCape() {
        return this.showCape;
    }
    
    private final void initPlayer() {
        ExtensionsKt.getExecutor(UMinecraft.getMinecraft()).execute(EmulatedUI3DPlayer::initPlayer$lambda-1);
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        if (this.getErrored()) {
            super.draw(matrixStack);
            return;
        }
        RenderPlayerBypass.bypass = true;
        this.withFakeClientFields((Function1<? super PlayerEntity, Unit>)new EmulatedUI3DPlayer$draw.EmulatedUI3DPlayer$draw$1(this, matrixStack));
        RenderPlayerBypass.bypass = false;
    }
    
    @Override
    public void animationFrame() {
        super.animationFrame();
        final int ticks = ClientTickEvent.counter - this.tickCounter;
        for (int coerceAtMost = RangesKt.coerceAtMost(ticks, 20), i = 0; i < coerceAtMost; ++i) {
            this.onGameTick();
        }
        this.tickCounter += ticks;
    }
    
    private final void onGameTick() {
        this.withFakeClientFields((Function1<? super PlayerEntity, Unit>)new EmulatedUI3DPlayer$onGameTick.EmulatedUI3DPlayer$onGameTick$1(this));
    }
    
    private final void withFakeClientFields(final Function1<? super PlayerEntity, Unit> block) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/gui/common/EmulatedUI3DPlayer.initializedPlayer:Z
        //     4: ifne            19
        //     7: aload_0         /* this */
        //     8: invokespecial   gg/essential/gui/common/EmulatedUI3DPlayer.initPlayer:()V
        //    11: aload_0         /* this */
        //    12: iconst_1       
        //    13: putfield        gg/essential/gui/common/EmulatedUI3DPlayer.initializedPlayer:Z
        //    16: goto            132
        //    19: aload_0         /* this */
        //    20: getfield        gg/essential/gui/common/EmulatedUI3DPlayer.profile:Lgg/essential/elementa/state/State;
        //    23: invokevirtual   gg/essential/elementa/state/State.get:()Ljava/lang/Object;
        //    26: ifnonnull       95
        //    29: aload_0         /* this */
        //    30: invokevirtual   gg/essential/gui/common/EmulatedUI3DPlayer.getPlayer:()Lnet/minecraft/entity/player/PlayerEntity;
        //    33: astore_3       
        //    34: aload_3        
        //    35: instanceof      Lgg/essential/gui/common/EmulatedUI3DPlayer$EmulatedPlayer;
        //    38: ifeq            48
        //    41: aload_3        
        //    42: checkcast       Lgg/essential/gui/common/EmulatedUI3DPlayer$EmulatedPlayer;
        //    45: goto            49
        //    48: aconst_null    
        //    49: dup            
        //    50: ifnull          83
        //    53: invokeinterface gg/essential/gui/common/EmulatedUI3DPlayer$EmulatedPlayer.getOriginalProfile:()Lcom/mojang/authlib/GameProfile;
        //    58: dup            
        //    59: ifnull          83
        //    62: getstatic       gg/essential/gui/common/EmulatedUI3DPlayer.Companion:Lgg/essential/gui/common/EmulatedUI3DPlayer$Companion;
        //    65: invokevirtual   gg/essential/gui/common/EmulatedUI3DPlayer$Companion.getLocalGameProfile:()Lcom/mojang/authlib/GameProfile;
        //    68: invokestatic    gg/essential/util/ExtensionsKt.fullyEquals:(Lcom/mojang/authlib/GameProfile;Lcom/mojang/authlib/GameProfile;)Z
        //    71: iconst_1       
        //    72: if_icmpne       79
        //    75: iconst_1       
        //    76: goto            85
        //    79: iconst_0       
        //    80: goto            85
        //    83: pop            
        //    84: iconst_0       
        //    85: ifne            95
        //    88: aload_0         /* this */
        //    89: invokespecial   gg/essential/gui/common/EmulatedUI3DPlayer.initPlayer:()V
        //    92: goto            132
        //    95: aload_0         /* this */
        //    96: getfield        gg/essential/gui/common/EmulatedUI3DPlayer.currentProfile:Lcom/mojang/authlib/GameProfile;
        //    99: aload_0         /* this */
        //   100: getfield        gg/essential/gui/common/EmulatedUI3DPlayer.profile:Lgg/essential/elementa/state/State;
        //   103: invokevirtual   gg/essential/elementa/state/State.get:()Ljava/lang/Object;
        //   106: astore_2       
        //   107: aload_2        
        //   108: checkcast       Lcom/mojang/authlib/GameProfile;
        //   111: astore_3       
        //   112: astore          7
        //   114: aload_0         /* this */
        //   115: aload_3         /* it */
        //   116: putfield        gg/essential/gui/common/EmulatedUI3DPlayer.currentProfile:Lcom/mojang/authlib/GameProfile;
        //   119: aload           7
        //   121: aload_2        
        //   122: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   125: ifne            132
        //   128: aload_0         /* this */
        //   129: invokespecial   gg/essential/gui/common/EmulatedUI3DPlayer.initPlayer:()V
        //   132: aload_0         /* this */
        //   133: invokevirtual   gg/essential/gui/common/EmulatedUI3DPlayer.getPlayer:()Lnet/minecraft/entity/player/PlayerEntity;
        //   136: dup            
        //   137: ifnonnull       142
        //   140: pop            
        //   141: return         
        //   142: astore_2        /* player */
        //   143: aload_0         /* this */
        //   144: getfield        gg/essential/gui/common/EmulatedUI3DPlayer.mcClient:Lnet/minecraft/client/MinecraftClient;
        //   147: getfield        net/minecraft/client/MinecraftClient.player:Lnet/minecraft/client/network/ClientPlayerEntity;
        //   150: astore_3        /* oldPlayer */
        //   151: aload_0         /* this */
        //   152: getfield        gg/essential/gui/common/EmulatedUI3DPlayer.mcClient:Lnet/minecraft/client/MinecraftClient;
        //   155: getfield        net/minecraft/client/MinecraftClient.world:Lnet/minecraft/client/world/ClientWorld;
        //   158: astore          oldWorld
        //   160: getstatic       gg/essential/gui/common/EmulatedUI3DPlayer$FakeWorld.INSTANCE:Lgg/essential/gui/common/EmulatedUI3DPlayer$FakeWorld;
        //   163: invokevirtual   gg/essential/gui/common/EmulatedUI3DPlayer$FakeWorld.getFakeNetHandler:()Lgg/essential/gui/common/EmulatedUI3DPlayer$FakeNetHandlerPlayClient;
        //   166: invokevirtual   gg/essential/gui/common/EmulatedUI3DPlayer$FakeNetHandlerPlayClient.getPlayerInfo:()Lnet/minecraft/client/network/PlayerListEntry;
        //   169: astore          oldPlayerInfo
        //   171: aload_0         /* this */
        //   172: getfield        gg/essential/gui/common/EmulatedUI3DPlayer.mcClient:Lnet/minecraft/client/MinecraftClient;
        //   175: getstatic       gg/essential/gui/common/EmulatedUI3DPlayer$FakeWorld.INSTANCE:Lgg/essential/gui/common/EmulatedUI3DPlayer$FakeWorld;
        //   178: invokevirtual   gg/essential/gui/common/EmulatedUI3DPlayer$FakeWorld.getFakePlayer:()Lnet/minecraft/client/network/ClientPlayerEntity;
        //   181: dup            
        //   182: ifnonnull       215
        //   185: pop            
        //   186: aload_0         /* this */
        //   187: getfield        gg/essential/gui/common/EmulatedUI3DPlayer.mcClient:Lnet/minecraft/client/MinecraftClient;
        //   190: aload_3         /* oldPlayer */
        //   191: putfield        net/minecraft/client/MinecraftClient.player:Lnet/minecraft/client/network/ClientPlayerEntity;
        //   194: aload_0         /* this */
        //   195: getfield        gg/essential/gui/common/EmulatedUI3DPlayer.mcClient:Lnet/minecraft/client/MinecraftClient;
        //   198: aload           oldWorld
        //   200: putfield        net/minecraft/client/MinecraftClient.world:Lnet/minecraft/client/world/ClientWorld;
        //   203: getstatic       gg/essential/gui/common/EmulatedUI3DPlayer$FakeWorld.INSTANCE:Lgg/essential/gui/common/EmulatedUI3DPlayer$FakeWorld;
        //   206: invokevirtual   gg/essential/gui/common/EmulatedUI3DPlayer$FakeWorld.getFakeNetHandler:()Lgg/essential/gui/common/EmulatedUI3DPlayer$FakeNetHandlerPlayClient;
        //   209: aload           oldPlayerInfo
        //   211: invokevirtual   gg/essential/gui/common/EmulatedUI3DPlayer$FakeNetHandlerPlayClient.setPlayerInfo:(Lnet/minecraft/client/network/PlayerListEntry;)V
        //   214: return         
        //   215: putfield        net/minecraft/client/MinecraftClient.player:Lnet/minecraft/client/network/ClientPlayerEntity;
        //   218: aload_0         /* this */
        //   219: getfield        gg/essential/gui/common/EmulatedUI3DPlayer.mcClient:Lnet/minecraft/client/MinecraftClient;
        //   222: getstatic       gg/essential/gui/common/EmulatedUI3DPlayer$FakeWorld.INSTANCE:Lgg/essential/gui/common/EmulatedUI3DPlayer$FakeWorld;
        //   225: invokevirtual   gg/essential/gui/common/EmulatedUI3DPlayer$FakeWorld.getFakeWorld:()Lnet/minecraft/client/world/ClientWorld;
        //   228: putfield        net/minecraft/client/MinecraftClient.world:Lnet/minecraft/client/world/ClientWorld;
        //   231: getstatic       gg/essential/gui/common/EmulatedUI3DPlayer$FakeWorld.INSTANCE:Lgg/essential/gui/common/EmulatedUI3DPlayer$FakeWorld;
        //   234: invokevirtual   gg/essential/gui/common/EmulatedUI3DPlayer$FakeWorld.getFakeNetHandler:()Lgg/essential/gui/common/EmulatedUI3DPlayer$FakeNetHandlerPlayClient;
        //   237: aload_2         /* player */
        //   238: instanceof      Lgg/essential/gui/common/EmulatedUI3DPlayer$EmulatedPlayer;
        //   241: ifeq            251
        //   244: aload_2         /* player */
        //   245: checkcast       Lgg/essential/gui/common/EmulatedUI3DPlayer$EmulatedPlayer;
        //   248: goto            252
        //   251: aconst_null    
        //   252: dup            
        //   253: ifnull          264
        //   256: invokeinterface gg/essential/gui/common/EmulatedUI3DPlayer$EmulatedPlayer.getNetworkInfo:()Lnet/minecraft/client/network/PlayerListEntry;
        //   261: goto            266
        //   264: pop            
        //   265: aconst_null    
        //   266: invokevirtual   gg/essential/gui/common/EmulatedUI3DPlayer$FakeNetHandlerPlayClient.setPlayerInfo:(Lnet/minecraft/client/network/PlayerListEntry;)V
        //   269: aload_1         /* block */
        //   270: aload_2         /* player */
        //   271: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   276: pop            
        //   277: aload_0         /* this */
        //   278: getfield        gg/essential/gui/common/EmulatedUI3DPlayer.mcClient:Lnet/minecraft/client/MinecraftClient;
        //   281: aload_3         /* oldPlayer */
        //   282: putfield        net/minecraft/client/MinecraftClient.player:Lnet/minecraft/client/network/ClientPlayerEntity;
        //   285: aload_0         /* this */
        //   286: getfield        gg/essential/gui/common/EmulatedUI3DPlayer.mcClient:Lnet/minecraft/client/MinecraftClient;
        //   289: aload           oldWorld
        //   291: putfield        net/minecraft/client/MinecraftClient.world:Lnet/minecraft/client/world/ClientWorld;
        //   294: getstatic       gg/essential/gui/common/EmulatedUI3DPlayer$FakeWorld.INSTANCE:Lgg/essential/gui/common/EmulatedUI3DPlayer$FakeWorld;
        //   297: invokevirtual   gg/essential/gui/common/EmulatedUI3DPlayer$FakeWorld.getFakeNetHandler:()Lgg/essential/gui/common/EmulatedUI3DPlayer$FakeNetHandlerPlayClient;
        //   300: aload           oldPlayerInfo
        //   302: invokevirtual   gg/essential/gui/common/EmulatedUI3DPlayer$FakeNetHandlerPlayClient.setPlayerInfo:(Lnet/minecraft/client/network/PlayerListEntry;)V
        //   305: goto            341
        //   308: astore          6
        //   310: aload_0         /* this */
        //   311: getfield        gg/essential/gui/common/EmulatedUI3DPlayer.mcClient:Lnet/minecraft/client/MinecraftClient;
        //   314: aload_3         /* oldPlayer */
        //   315: putfield        net/minecraft/client/MinecraftClient.player:Lnet/minecraft/client/network/ClientPlayerEntity;
        //   318: aload_0         /* this */
        //   319: getfield        gg/essential/gui/common/EmulatedUI3DPlayer.mcClient:Lnet/minecraft/client/MinecraftClient;
        //   322: aload           oldWorld
        //   324: putfield        net/minecraft/client/MinecraftClient.world:Lnet/minecraft/client/world/ClientWorld;
        //   327: getstatic       gg/essential/gui/common/EmulatedUI3DPlayer$FakeWorld.INSTANCE:Lgg/essential/gui/common/EmulatedUI3DPlayer$FakeWorld;
        //   330: invokevirtual   gg/essential/gui/common/EmulatedUI3DPlayer$FakeWorld.getFakeNetHandler:()Lgg/essential/gui/common/EmulatedUI3DPlayer$FakeNetHandlerPlayClient;
        //   333: aload           oldPlayerInfo
        //   335: invokevirtual   gg/essential/gui/common/EmulatedUI3DPlayer$FakeNetHandlerPlayClient.setPlayerInfo:(Lnet/minecraft/client/network/PlayerListEntry;)V
        //   338: aload           6
        //   340: athrow         
        //   341: return         
        //    Signature:
        //  (Lkotlin/jvm/functions/Function1<-Lnet/minecraft/entity/player/PlayerEntity;Lkotlin/Unit;>;)V
        //    MethodParameters:
        //  Name   Flags  
        //  -----  -----
        //  block  
        //    StackMapTable: 00 10 13 FD 00 1C 00 07 00 EE 40 07 00 4A 1D 43 07 00 FD 41 01 F9 00 09 24 49 07 00 EE FF 00 48 00 06 07 00 02 07 00 6D 07 00 EE 07 01 1F 07 01 21 07 01 23 00 02 07 01 03 07 01 1F 63 07 00 4C FF 00 00 00 06 07 00 02 07 00 6D 07 00 EE 07 01 1F 07 01 21 07 01 23 00 02 07 00 4C 07 00 4A FF 00 0B 00 06 07 00 02 07 00 6D 07 00 EE 07 01 1F 07 01 21 07 01 23 00 02 07 00 4C 07 00 4A FF 00 01 00 06 07 00 02 07 00 6D 07 00 EE 07 01 1F 07 01 21 07 01 23 00 02 07 00 4C 07 01 23 69 07 01 30 20
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  171    186    308    341    Any
        //  215    277    308    341    Any
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final void updateVisibleModelParts(final PlayerEntity $this$updateVisibleModelParts) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_3        /* $this$filter$iv */
        //     4: aload_3         /* $this$filter$iv */
        //     5: astore          5
        //     7: new             Ljava/util/ArrayList;
        //    10: dup            
        //    11: invokespecial   java/util/ArrayList.<init>:()V
        //    14: checkcast       Ljava/util/Collection;
        //    17: astore          destination$iv$iv
        //    19: iconst_0       
        //    20: istore          8
        //    22: aload           $this$filterTo$iv$iv
        //    24: arraylength    
        //    25: istore          9
        //    27: iload           8
        //    29: iload           9
        //    31: if_icmpge       91
        //    34: aload           $this$filterTo$iv$iv
        //    36: iload           8
        //    38: aaload         
        //    39: astore          element$iv$iv
        //    41: aload           element$iv$iv
        //    43: astore          it
        //    45: aload_0         /* this */
        //    46: getfield        gg/essential/gui/common/EmulatedUI3DPlayer.currentProfile:Lcom/mojang/authlib/GameProfile;
        //    49: ifnonnull       67
        //    52: aload_0         /* this */
        //    53: getfield        gg/essential/gui/common/EmulatedUI3DPlayer.mcClient:Lnet/minecraft/client/MinecraftClient;
        //    56: getfield        net/minecraft/client/MinecraftClient.options:Lnet/minecraft/client/option/GameOptions;
        //    59: aload           it
        //    61: invokevirtual   net/minecraft/client/option/GameOptions.isPlayerModelPartEnabled:(Lnet/minecraft/client/render/entity/PlayerModelPart;)Z
        //    64: ifeq            71
        //    67: iconst_1       
        //    68: goto            72
        //    71: iconst_0       
        //    72: ifeq            85
        //    75: aload           destination$iv$iv
        //    77: aload           element$iv$iv
        //    79: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    84: pop            
        //    85: iinc            8, 1
        //    88: goto            27
        //    91: aload           destination$iv$iv
        //    93: checkcast       Ljava/util/List;
        //    96: astore_2        /* visibleParts */
        //    97: invokestatic    gg/essential/mixins/transformers/entity/player/EntityPlayerAccessor.getPlayerModelFlag:()Lnet/minecraft/entity/data/TrackedData;
        //   100: astore_3        /* key */
        //   101: aload_1         /* $this$updateVisibleModelParts */
        //   102: invokevirtual   net/minecraft/entity/player/PlayerEntity.method_5841:()Lnet/minecraft/entity/data/DataTracker;
        //   105: aload_3         /* key */
        //   106: aload_2         /* visibleParts */
        //   107: checkcast       Ljava/lang/Iterable;
        //   110: astore          4
        //   112: astore          13
        //   114: astore          12
        //   116: iconst_0       
        //   117: istore          5
        //   119: aload           4
        //   121: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   126: astore          6
        //   128: aload           6
        //   130: invokeinterface java/util/Iterator.hasNext:()Z
        //   135: ifeq            175
        //   138: aload           6
        //   140: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   145: astore          7
        //   147: iload           5
        //   149: aload           7
        //   151: checkcast       Lnet/minecraft/client/render/entity/PlayerModelPart;
        //   154: astore          8
        //   156: istore          14
        //   158: aload           it
        //   160: invokevirtual   net/minecraft/client/render/entity/PlayerModelPart.getBitFlag:()I
        //   163: istore          15
        //   165: iload           14
        //   167: iload           15
        //   169: iadd           
        //   170: istore          5
        //   172: goto            128
        //   175: iload           5
        //   177: istore          14
        //   179: aload           12
        //   181: aload           13
        //   183: iload           14
        //   185: i2b            
        //   186: invokestatic    java/lang/Byte.valueOf:(B)Ljava/lang/Byte;
        //   189: invokevirtual   net/minecraft/entity/data/DataTracker.set:(Lnet/minecraft/entity/data/TrackedData;Ljava/lang/Object;)V
        //   192: return         
        //    MethodParameters:
        //  Name                           Flags  
        //  -----------------------------  -----
        //  $this$updateVisibleModelParts  
        //    StackMapTable: 00 08 FF 00 1B 00 0A 07 00 02 07 00 EE 00 07 01 46 00 07 01 46 07 01 44 00 01 01 00 00 FD 00 27 07 01 3A 07 01 3A 03 40 01 0C F9 00 05 FF 00 24 00 0E 07 00 02 07 00 EE 07 01 56 07 01 68 07 01 62 01 07 01 6A 00 00 01 00 00 07 01 6C 07 01 68 00 00 2E
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static final void initPlayer$lambda-1(final EmulatedUI3DPlayer this$0) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        if (this$0.failedPlayerInit) {
            return;
        }
        try {
            GameProfile gameProfile;
            if ((gameProfile = this$0.currentProfile) == null) {
                gameProfile = EmulatedUI3DPlayer.Companion.getLocalGameProfile();
            }
            final GameProfile profile = gameProfile;
            final ClientWorld world = FakeWorld.INSTANCE.getFakeWorld();
            final EmulatedUI3DPlayer$initPlayer$1$player.EmulatedUI3DPlayer$initPlayer$1$player$1 player = new EmulatedUI3DPlayer$initPlayer$1$player.EmulatedUI3DPlayer$initPlayer$1$player$1(profile, this$0, world);
            this$0.updateVisibleModelParts((PlayerEntity)player);
            player.field_7500 = player.method_23317();
            player.field_7521 = player.method_23318();
            player.field_7499 = player.method_23321();
            player.field_7524 = player.method_23317();
            player.field_7502 = player.method_23318();
            player.field_7522 = player.method_23321();
            this$0.configurePlayer.invoke((Object)player);
            this$0.setPlayer((PlayerEntity)player);
        }
        catch (final Throwable e) {
            e.printStackTrace();
            this$0.failedPlayerInit = true;
            this$0.setErrored$1385ff();
        }
    }
    
    public EmulatedUI3DPlayer() {
        this(null, null, null, null, 15);
    }
    
    public static final /* synthetic */ void access$updateVisibleModelParts(final EmulatedUI3DPlayer $this, final PlayerEntity $receiver) {
        $this.updateVisibleModelParts($receiver);
    }
    
    public static final /* synthetic */ MinecraftClient access$getMcClient$p(final EmulatedUI3DPlayer $this) {
        return $this.mcClient;
    }
    
    public static final /* synthetic */ void access$draw$s-1316132026(final EmulatedUI3DPlayer $this, final UMatrixStack matrixStack) {
        $this.draw(matrixStack);
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000,
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0006
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0000\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0012\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e
                                                       \u0000\u001a\u0004\b	\u0010
                                                       "\u0004\b\u000b\u0010\f¨\u0006\u0012""" }, d2 = { "Lgg/essential/gui/common/EmulatedUI3DPlayer$FakeNetHandlerPlayClient;", "Lnet/minecraft/client/network/ClientPlayNetworkHandler;", "mcIn", "Lnet/minecraft/client/MinecraftClient;", "netManager", "Lnet/minecraft/network/ClientConnection;", "(Lnet/minecraft/client/MinecraftClient;Lnet/minecraft/network/ClientConnection;)V", "playerInfo", "Lnet/minecraft/client/network/PlayerListEntry;", "getPlayerInfo", "()Lnet/minecraft/client/network/PlayerListEntry;", "setPlayerInfo", "(Lnet/minecraft/client/network/PlayerListEntry;)V", "getPlayerListEntry", "uniqueId", "Ljava/util/UUID;", "name", "", "essential" })
    private static final class FakeNetHandlerPlayClient extends ClientPlayNetworkHandler
    {
        @Nullable
        private PlayerListEntry playerInfo;
        
        public FakeNetHandlerPlayClient(@NotNull final MinecraftClient mcIn, @NotNull final ClientConnection netManager) {
            Intrinsics.checkNotNullParameter((Object)mcIn, "mcIn");
            Intrinsics.checkNotNullParameter((Object)netManager, "netManager");
            Screen currentScreen;
            if ((currentScreen = mcIn.currentScreen) == null) {
                currentScreen = (Screen)new FakeNetHandlerPlayClient.EmulatedUI3DPlayer$FakeNetHandlerPlayClient$1(HelpersKt.textLiteral(""));
            }
            super(mcIn, currentScreen, netManager, new GameProfile(UUID.randomUUID(), "EmulatedClient"), mcIn.createTelemetrySender());
        }
        
        @Nullable
        public final PlayerListEntry getPlayerInfo() {
            return this.playerInfo;
        }
        
        public final void setPlayerInfo(@Nullable final PlayerListEntry <set-?>) {
            this.playerInfo = <set-?>;
        }
        
        @Nullable
        public PlayerListEntry getPlayerListEntry(@NotNull final UUID uniqueId) {
            Intrinsics.checkNotNullParameter((Object)uniqueId, "uniqueId");
            return this.playerInfo;
        }
        
        @Nullable
        public PlayerListEntry getPlayerListEntry(@NotNull final String name) {
            Intrinsics.checkNotNullParameter((Object)name, "name");
            return this.playerInfo;
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000*
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0005
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0004
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0004\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f
                                                       \u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010	\u001a\u00020
                                                       X\u0082\u0004¢\u0006\u0002
                                                       \u0000R\u001d\u0010\u000b\u001a\u0004\u0018\u00010\f8FX\u0086\u0084\u0002¢\u0006\f
                                                       \u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118FX\u0086\u0084\u0002¢\u0006\f
                                                       \u0004\b\u0014\u0010\b\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015""" }, d2 = { "Lgg/essential/gui/common/EmulatedUI3DPlayer$FakeWorld;", "", "()V", "fakeNetHandler", "Lgg/essential/gui/common/EmulatedUI3DPlayer$FakeNetHandlerPlayClient;", "getFakeNetHandler", "()Lgg/essential/gui/common/EmulatedUI3DPlayer$FakeNetHandlerPlayClient;", "fakeNetHandler$delegate", "Lkotlin/Lazy;", "fakeNetworkManager", "Lnet/minecraft/network/ClientConnection;", "fakePlayer", "Lnet/minecraft/client/network/ClientPlayerEntity;", "getFakePlayer", "()Lnet/minecraft/client/network/ClientPlayerEntity;", "fakePlayer$delegate", "fakeWorld", "Lnet/minecraft/client/world/ClientWorld;", "getFakeWorld", "()Lnet/minecraft/client/world/ClientWorld;", "fakeWorld$delegate", "essential" })
    private static final class FakeWorld
    {
        @NotNull
        public static final FakeWorld INSTANCE;
        @NotNull
        private static final ClientConnection fakeNetworkManager;
        @NotNull
        private static final Lazy fakeNetHandler$delegate;
        @NotNull
        private static final Lazy fakeWorld$delegate;
        @NotNull
        private static final Lazy fakePlayer$delegate;
        
        private FakeWorld() {
            super();
        }
        
        @NotNull
        public final FakeNetHandlerPlayClient getFakeNetHandler() {
            return (FakeNetHandlerPlayClient)FakeWorld.fakeNetHandler$delegate.getValue();
        }
        
        @NotNull
        public final ClientWorld getFakeWorld() {
            return (ClientWorld)FakeWorld.fakeWorld$delegate.getValue();
        }
        
        @Nullable
        public final ClientPlayerEntity getFakePlayer() {
            return (ClientPlayerEntity)FakeWorld.fakePlayer$delegate.getValue();
        }
        
        public static final /* synthetic */ ClientConnection access$getFakeNetworkManager$p() {
            return FakeWorld.fakeNetworkManager;
        }
        
        static {
            INSTANCE = new FakeWorld();
            final ClientConnection it = new ClientConnection(NetworkSide.CLIENTBOUND);
            new EmbeddedChannel(new ChannelHandler[] { (ChannelHandler)it }).pipeline().fireChannelActive();
            fakeNetworkManager = it;
            fakeNetHandler$delegate = LazyKt.lazy((Function0)EmulatedUI3DPlayer$FakeWorld$fakeNetHandler.EmulatedUI3DPlayer$FakeWorld$fakeNetHandler$2.INSTANCE);
            fakeWorld$delegate = LazyKt.lazy((Function0)EmulatedUI3DPlayer$FakeWorld$fakeWorld.EmulatedUI3DPlayer$FakeWorld$fakeWorld$2.INSTANCE);
            fakePlayer$delegate = LazyKt.lazy((Function0)EmulatedUI3DPlayer$FakeWorld$fakePlayer.EmulatedUI3DPlayer$FakeWorld$fakePlayer$2.INSTANCE);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0012
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005""" }, d2 = { "Lgg/essential/gui/common/EmulatedUI3DPlayer$Companion;", "", "()V", "getLocalGameProfile", "Lcom/mojang/authlib/GameProfile;", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final GameProfile getLocalGameProfile() {
            final MinecraftClient mc = UMinecraft.getMinecraft();
            final GameProfile $this$getLocalGameProfile_u24lambda_u2d0 = mc.getSession().getProfile();
            $this$getLocalGameProfile_u24lambda_u2d0.getProperties().putAll((Multimap)mc.getSessionProperties());
            final GameProfile profile = $this$getLocalGameProfile_u24lambda_u2d0;
            Intrinsics.checkNotNullExpressionValue((Object)profile, "profile");
            return profile;
        }
        
        public Companion(final byte b) {
            this();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000"
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0003
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0003
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010	R\u0012\u0010
                                                       \u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r\u00f8\u0001\u0000\u0082\u0002\u0006
                                                       \u0004\b!0\u0001¨\u0006\u000e\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/gui/common/EmulatedUI3DPlayer$EmulatedPlayer;", "", "emulatedUI3DPlayer", "Lgg/essential/gui/common/EmulatedUI3DPlayer;", "getEmulatedUI3DPlayer", "()Lgg/essential/gui/common/EmulatedUI3DPlayer;", "networkInfo", "Lnet/minecraft/client/network/PlayerListEntry;", "getNetworkInfo", "()Lnet/minecraft/client/network/PlayerListEntry;", "originalProfile", "Lcom/mojang/authlib/GameProfile;", "getOriginalProfile", "()Lcom/mojang/authlib/GameProfile;", "essential" })
    public interface EmulatedPlayer
    {
        @NotNull
        GameProfile getOriginalProfile();
        
        @NotNull
        PlayerListEntry getNetworkInfo();
        
        @NotNull
        EmulatedUI3DPlayer getEmulatedUI3DPlayer();
    }
}
