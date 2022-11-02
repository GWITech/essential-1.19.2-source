package gg.essential.handlers.discord;

import org.jetbrains.annotations.*;
import gg.essential.handlers.discord.activity.provider.*;
import gg.essential.util.kdiscordipc.*;
import gg.essential.lib.kdiscordipc.*;
import gg.essential.handlers.discord.activity.*;
import kotlin.jvm.internal.*;
import kotlin.concurrent.*;
import gg.essential.*;
import gg.essential.lib.kbrewster.eventbus.*;
import gg.essential.event.client.*;
import kotlin.coroutines.intrinsics.*;
import kotlin.*;
import gg.essential.lib.kdiscordipc.core.error.*;
import gg.essential.config.*;
import gg.essential.data.*;
import gg.essential.lib.kdiscordipc.data.activity.*;
import gg.essential.handlers.discord.state.*;
import gg.essential.universal.*;
import gg.essential.handlers.discord.party.*;
import net.minecraft.client.network.*;
import net.minecraft.server.integrated.*;
import kotlin.text.*;
import gg.essential.network.connectionmanager.sps.*;
import gg.essential.upnp.model.*;
import java.util.*;
import kotlin.coroutines.*;
import kotlinx.coroutines.*;
import gg.essential.handlers.discord.activity.provider.impl.*;
import kotlin.collections.*;
import kotlin.jvm.functions.*;
import gg.essential.lib.kdiscordipc.core.socket.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000l
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010)\u001a\u00020*H\u0082@\u00f8\u0001\u0000¢\u0006\u0002\u0010+J\b\u0010,\u001a\u00020*H\u0002J\u0006\u0010-\u001a\u00020*J\u0010\u0010.\u001a\u0004\u0018\u00010\u00042\u0006\u0010/\u001a\u00020\u0004J\u0011\u00100\u001a\u00020*H\u0082@\u00f8\u0001\u0000¢\u0006\u0002\u0010+J\u0010\u00101\u001a\u00020*2\u0006\u00102\u001a\u000203H\u0003J\u0010\u00104\u001a\u00020*2\u0006\u00102\u001a\u000205H\u0003J
                                                   \u00106\u001a\u0004\u0018\u00010\u0013H\u0002J\u0011\u00107\u001a\u00020*H\u0082@\u00f8\u0001\u0000¢\u0006\u0002\u0010+J\u0006\u00108\u001a\u00020*R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\b\u0010	"\u0004\b
                                                   \u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002
                                                   \u0000R"\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013@BX\u0082\u000e¢\u0006\b
                                                   \u0000"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0018¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u0004@BX\u0086\u000e¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001f\u0010	R$\u0010!\u001a\u00020 2\u0006\u0010\u0012\u001a\u00020 @FX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b"\u0010#"\u0004\b$\u0010%R\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'X\u0082\u0004¢\u0006\u0002
                                                   \u0000\u0082\u0002\u0004
                                                   \u0002\b\u0019¨\u00069""" }, d2 = { "Lgg/essential/handlers/discord/DiscordIntegration;", "", "()V", "CLIENT_ID", "", "exceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "hostJoinSecret", "getHostJoinSecret", "()Ljava/lang/String;", "setHostJoinSecret", "(Ljava/lang/String;)V", "ipc", "Lgg/essential/lib/kdiscordipc/KDiscordIPC;", "ipcPort", "", "kdiscordipcLoader", "Lgg/essential/util/kdiscordipc/KDiscordIPCLoader;", "value", "Lgg/essential/handlers/discord/party/PartyInformation;", "partyInformation", "setPartyInformation", "(Lgg/essential/handlers/discord/party/PartyInformation;)V", "partyManager", "Lgg/essential/handlers/discord/party/PartyManager;", "getPartyManager", "()Lgg/essential/handlers/discord/party/PartyManager;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "<set-?>", "spsJoinKey", "getSpsJoinKey", "Lgg/essential/handlers/discord/activity/ActivityState;", "state", "getState", "()Lgg/essential/handlers/discord/activity/ActivityState;", "setState", "(Lgg/essential/handlers/discord/activity/ActivityState;)V", "stateProviders", "", "Lgg/essential/handlers/discord/activity/provider/ActivityStateProvider;", "connect", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disconnect", "discordSettingsToggled", "getAddress", "joinSecret", "initialize", "onPostInit", "event", "Lgg/essential/event/client/PostInitializationEvent;", "onReAuthentication", "Lgg/essential/event/client/ReAuthEvent$Post;", "providePartyInformation", "publishActivityUpdate", "regenerateSpsJoinKey", "essential" })
public final class DiscordIntegration
{
    @NotNull
    public static final DiscordIntegration INSTANCE;
    @NotNull
    private static final CoroutineExceptionHandler exceptionHandler;
    @NotNull
    private static String spsJoinKey;
    @Nullable
    private static String hostJoinSecret;
    @NotNull
    private static final CoroutineScope scope;
    private static final int ipcPort;
    @NotNull
    private static final List<ActivityStateProvider> stateProviders;
    @NotNull
    private static final KDiscordIPCLoader kdiscordipcLoader;
    @NotNull
    private static final KDiscordIPC ipc;
    @NotNull
    private static final PartyManager partyManager;
    @NotNull
    private static ActivityState state;
    @Nullable
    private static PartyInformation partyInformation;
    
    private DiscordIntegration() {
        super();
    }
    
    public final void setHostJoinSecret(@Nullable final String <set-?>) {
        DiscordIntegration.hostJoinSecret = <set-?>;
    }
    
    @NotNull
    public final PartyManager getPartyManager() {
        return DiscordIntegration.partyManager;
    }
    
    public final void setState(@NotNull final ActivityState value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        if (Intrinsics.areEqual((Object)DiscordIntegration.state, (Object)value)) {
            return;
        }
        DiscordIntegration.state = value;
        BuildersKt.launch$default(DiscordIntegration.scope, (CoroutineContext)null, (CoroutineStart)null, (Function2)new DiscordIntegration$state.DiscordIntegration$state$1((Continuation)null), 3, (Object)null);
    }
    
    private final void setPartyInformation(final PartyInformation value) {
        if (Intrinsics.areEqual((Object)DiscordIntegration.partyInformation, (Object)value)) {
            return;
        }
        DiscordIntegration.partyInformation = value;
        BuildersKt.launch$default(DiscordIntegration.scope, (CoroutineContext)null, (CoroutineStart)null, (Function2)new DiscordIntegration$partyInformation.DiscordIntegration$partyInformation$1((Continuation)null), 3, (Object)null);
    }
    
    @Subscribe
    private final void onPostInit(final PostInitializationEvent event) {
        BuildersKt.launch$default(DiscordIntegration.scope, (CoroutineContext)null, (CoroutineStart)null, (Function2)new DiscordIntegration$onPostInit.DiscordIntegration$onPostInit$1((Continuation)null), 3, (Object)null);
        final Iterable $this$forEach$iv = DiscordIntegration.stateProviders;
        for (final Object element$iv : $this$forEach$iv) {
            final ActivityStateProvider p0 = (ActivityStateProvider)element$iv;
            p0.init();
        }
        TimersKt.timer("Essential Discord IPC Polling", true).scheduleAtFixedRate(new TimerTask() {
            public DiscordIntegration$onPostInit$$inlined$fixedRateTimer$default$1() {
                super();
            }
            
            @Override
            public void run() {
                while (true) {
                    for (final ActivityStateProvider it : DiscordIntegration.access$getStateProviders$p()) {
                        final ActivityState provide = it.provide();
                        if (provide != null) {
                            final ActivityState activityState = provide;
                            final ActivityState activityState2 = activityState;
                            if (activityState2 != null) {
                                final ActivityState it2 = activityState2;
                                DiscordIntegration.INSTANCE.setState(it2);
                            }
                            DiscordIntegration.INSTANCE.setPartyInformation(DiscordIntegration.INSTANCE.providePartyInformation());
                            return;
                        }
                    }
                    final ActivityState activityState = null;
                    continue;
                }
            }
        }, 0L, 500L);
        Essential.getInstance().shutdownHookUtil().register(this::disconnect);
    }
    
    @Subscribe
    private final void onReAuthentication(final ReAuthEvent.Post event) {
        BuildersKt.launch$default(DiscordIntegration.scope, (CoroutineContext)null, (CoroutineStart)null, (Function2)new DiscordIntegration$onReAuthentication.DiscordIntegration$onReAuthentication$1((Continuation)null), 3, (Object)null);
    }
    
    private final Object initialize(final Continuation<? super Unit> $completion) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore_2       
        //     4: new             Lgg/essential/handlers/discord/DiscordIntegration$initialize$2;
        //     7: dup            
        //     8: aconst_null    
        //     9: invokespecial   gg/essential/handlers/discord/DiscordIntegration$initialize$2.<init>:(Lkotlin/coroutines/Continuation;)V
        //    12: checkcast       Lkotlin/jvm/functions/Function2;
        //    15: astore_3        /* consumer$iv */
        //    16: aload_2         /* this_$iv */
        //    17: invokevirtual   gg/essential/lib/kdiscordipc/KDiscordIPC.getEvents:()Lkotlinx/coroutines/flow/SharedFlow;
        //    20: checkcast       Lkotlinx/coroutines/flow/Flow;
        //    23: astore          $this$filterIsInstance$iv$iv
        //    25: aload           $this$filterIsInstance$iv$iv
        //    27: astore          $this$filter$iv$iv$iv
        //    29: aload           $this$filter$iv$iv$iv
        //    31: astore          $this$unsafeTransform$iv$iv$iv$iv
        //    33: new             Lgg/essential/handlers/discord/DiscordIntegration$initialize$$inlined$onEvent$1;
        //    36: dup            
        //    37: aload           $this$unsafeTransform$iv$iv$iv$iv
        //    39: invokespecial   gg/essential/handlers/discord/DiscordIntegration$initialize$$inlined$onEvent$1.<init>:(Lkotlinx/coroutines/flow/Flow;)V
        //    42: checkcast       Lkotlinx/coroutines/flow/Flow;
        //    45: new             Lgg/essential/handlers/discord/DiscordIntegration$initialize$$inlined$onEvent$2;
        //    48: dup            
        //    49: aload_2         /* this_$iv */
        //    50: aload_3         /* consumer$iv */
        //    51: aconst_null    
        //    52: invokespecial   gg/essential/handlers/discord/DiscordIntegration$initialize$$inlined$onEvent$2.<init>:(Lgg/essential/lib/kdiscordipc/KDiscordIPC;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
        //    55: checkcast       Lkotlin/jvm/functions/Function2;
        //    58: invokestatic    kotlinx/coroutines/flow/FlowKt.onEach:(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;
        //    61: aload_2         /* this_$iv */
        //    62: invokevirtual   gg/essential/lib/kdiscordipc/KDiscordIPC.getScope:()Lkotlinx/coroutines/CoroutineScope;
        //    65: invokestatic    kotlinx/coroutines/flow/FlowKt.launchIn:(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/Job;
        //    68: pop            
        //    69: getstatic       gg/essential/handlers/discord/DiscordIntegration.ipc:Lgg/essential/lib/kdiscordipc/KDiscordIPC;
        //    72: astore_2       
        //    73: new             Lgg/essential/handlers/discord/DiscordIntegration$initialize$3;
        //    76: dup            
        //    77: aconst_null    
        //    78: invokespecial   gg/essential/handlers/discord/DiscordIntegration$initialize$3.<init>:(Lkotlin/coroutines/Continuation;)V
        //    81: checkcast       Lkotlin/jvm/functions/Function2;
        //    84: astore_3        /* consumer$iv */
        //    85: aload_2         /* this_$iv */
        //    86: invokevirtual   gg/essential/lib/kdiscordipc/KDiscordIPC.getEvents:()Lkotlinx/coroutines/flow/SharedFlow;
        //    89: checkcast       Lkotlinx/coroutines/flow/Flow;
        //    92: astore          $this$filterIsInstance$iv$iv
        //    94: aload           $this$filterIsInstance$iv$iv
        //    96: astore          $this$filter$iv$iv$iv
        //    98: aload           $this$filter$iv$iv$iv
        //   100: astore          $this$unsafeTransform$iv$iv$iv$iv
        //   102: new             Lgg/essential/handlers/discord/DiscordIntegration$initialize$$inlined$onEvent$3;
        //   105: dup            
        //   106: aload           $this$unsafeTransform$iv$iv$iv$iv
        //   108: invokespecial   gg/essential/handlers/discord/DiscordIntegration$initialize$$inlined$onEvent$3.<init>:(Lkotlinx/coroutines/flow/Flow;)V
        //   111: checkcast       Lkotlinx/coroutines/flow/Flow;
        //   114: new             Lgg/essential/handlers/discord/DiscordIntegration$initialize$$inlined$onEvent$4;
        //   117: dup            
        //   118: aload_2         /* this_$iv */
        //   119: aload_3         /* consumer$iv */
        //   120: aconst_null    
        //   121: invokespecial   gg/essential/handlers/discord/DiscordIntegration$initialize$$inlined$onEvent$4.<init>:(Lgg/essential/lib/kdiscordipc/KDiscordIPC;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
        //   124: checkcast       Lkotlin/jvm/functions/Function2;
        //   127: invokestatic    kotlinx/coroutines/flow/FlowKt.onEach:(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;
        //   130: aload_2         /* this_$iv */
        //   131: invokevirtual   gg/essential/lib/kdiscordipc/KDiscordIPC.getScope:()Lkotlinx/coroutines/CoroutineScope;
        //   134: invokestatic    kotlinx/coroutines/flow/FlowKt.launchIn:(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/Job;
        //   137: pop            
        //   138: aload_0         /* this */
        //   139: aload_1         /* $completion */
        //   140: invokespecial   gg/essential/handlers/discord/DiscordIntegration.connect:(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        //   143: dup            
        //   144: invokestatic    kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
        //   147: if_acmpne       151
        //   150: areturn        
        //   151: pop            
        //   152: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   155: areturn        
        //    Signature:
        //  (Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object;
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  $completion  
        //    StackMapTable: 00 01 FF 00 97 00 07 07 00 02 07 01 12 07 00 E4 07 00 7F 07 00 EA 07 00 EA 07 00 EA 00 01 07 00 04
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final Object connect(final Continuation<? super Unit> continuation) {
        final Continuation $continuation;
        Label_0052: {
            if (continuation instanceof final DiscordIntegration$connect.DiscordIntegration$connect$1 discordIntegration$connect$1) {
                if ((discordIntegration$connect$1.label & Integer.MIN_VALUE) != 0x0) {
                    final DiscordIntegration$connect.DiscordIntegration$connect$1 discordIntegration$connect$2 = discordIntegration$connect$1;
                    discordIntegration$connect$2.label -= Integer.MIN_VALUE;
                    break Label_0052;
                }
            }
            $continuation = (Continuation)new DiscordIntegration$connect.DiscordIntegration$connect$1(this, (Continuation)continuation);
        }
        final Object $result = ((DiscordIntegration$connect.DiscordIntegration$connect$1)$continuation).result;
        final Object coroutine_SUSPENDED = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        while (true) {
            switch (((DiscordIntegration$connect.DiscordIntegration$connect$1)$continuation).label) {
                case 0: {
                    ResultKt.throwOnFailure($result);
                    try {
                        final KDiscordIPC ipc = DiscordIntegration.ipc;
                        final int ipcPort = DiscordIntegration.ipcPort;
                        final Continuation continuation2 = $continuation;
                        ((DiscordIntegration$connect.DiscordIntegration$connect$1)$continuation).label = 1;
                        if (ipc.connect(ipcPort, (Continuation<? super Unit>)continuation2) == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                        return Unit.INSTANCE;
                        ResultKt.throwOnFailure($result);
                        return Unit.INSTANCE;
                    }
                    catch (final ConnectionError e) {
                        Essential.logger.debug("Failed to connect to Discord: ", (Throwable)e);
                    }
                    return Unit.INSTANCE;
                }
                case 1: {
                    continue;
                }
                default: {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            break;
        }
    }
    
    private final void disconnect() {
        try {
            DiscordIntegration.ipc.disconnect();
        }
        catch (final Exception ex) {}
    }
    
    public final void discordSettingsToggled() {
        BuildersKt.launch$default(DiscordIntegration.scope, (CoroutineContext)null, (CoroutineStart)null, (Function2)new DiscordIntegration$discordSettingsToggled.DiscordIntegration$discordSettingsToggled$1((Continuation)null), 3, (Object)null);
    }
    
    private final Object publishActivityUpdate(final Continuation<? super Unit> $completion) {
        if (!DiscordIntegration.ipc.getConnected()) {
            return Unit.INSTANCE;
        }
        if (!EssentialConfig.INSTANCE.getDiscordRichPresence()) {
            final Object clearActivity = DiscordIntegration.ipc.getActivityManager().clearActivity($completion);
            if (clearActivity == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return clearActivity;
            }
            return Unit.INSTANCE;
        }
        else {
            final ActivityState activityState = DiscordIntegration.state;
            final String version = VersionData.INSTANCE.getMinecraftVersion$essential();
            final Activity activity = ActivityKt.activity("Playing Minecraft " + version, activityState.getText(), (Function1<? super Activity, Unit>)DiscordIntegration$publishActivityUpdate$activity.DiscordIntegration$publishActivityUpdate$activity$1.INSTANCE);
            final Object setActivity = DiscordIntegration.ipc.getActivityManager().setActivity(activity, $completion);
            if (setActivity == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                return setActivity;
            }
            return Unit.INSTANCE;
        }
    }
    
    private final PartyInformation providePartyInformation() {
        final GameState state = GameState.Companion.current();
        PartyInformation partyInformation;
        if (state instanceof final GameState.Multiplayer multiplayer) {
            partyInformation = (EssentialConfig.INSTANCE.getDiscordAllowAskToJoin() ? new PartyInformation("multiplayer|" + multiplayer.getIp(), new PartyInformation$Data(multiplayer.getIp() + UMinecraft.getMinecraft().getSession().getUuid(), 1, 8)) : null);
        }
        else if (state instanceof GameState.SPS.Guest) {
            final String value;
            final String uuid = value = String.valueOf(((GameState.SPS.Guest)state).getSession().getHostUUID());
            final ClientPlayNetworkHandler networkHandler = UMinecraft.getMinecraft().getNetworkHandler();
            int size = 0;
            Label_0136: {
                if (networkHandler != null) {
                    final Collection playerList = networkHandler.getPlayerList();
                    if (playerList != null) {
                        size = playerList.size();
                        break Label_0136;
                    }
                }
                size = 1;
            }
            final PartyInformation$Data partyInfo = new PartyInformation$Data(value, Integer.max(size, 1), 8);
            partyInformation = new PartyInformation(DiscordIntegration.hostJoinSecret, partyInfo);
        }
        else if (state instanceof GameState.SPS.Host) {
            final IntegratedServer integratedServer = UMinecraft.getMinecraft().getServer();
            final String value2;
            final String uuid2 = value2 = String.valueOf(((GameState.SPS.Host)state).getSession().getHostUUID());
            final IntegratedServer integratedServer2 = integratedServer;
            final int max = Integer.max((integratedServer2 != null) ? integratedServer2.method_3788() : 1, 1);
            final IntegratedServer integratedServer3 = integratedServer;
            final PartyInformation$Data partyInfo2 = new PartyInformation$Data(value2, max, Integer.max((integratedServer3 != null) ? integratedServer3.method_3802() : 8, 1));
            partyInformation = new PartyInformation("sps|" + uuid2 + "|" + DiscordIntegration.spsJoinKey, partyInfo2);
        }
        else {
            partyInformation = null;
        }
        return partyInformation;
    }
    
    @Nullable
    public final String getAddress(@NotNull final String joinSecret) {
        Intrinsics.checkNotNullParameter((Object)joinSecret, "joinSecret");
        final List hostInformation = StringsKt.split$default((CharSequence)joinSecret, new String[] { "|" }, false, 0, 6, (Object)null);
        if (hostInformation.size() != 3) {
            Essential.logger.error("Invalid SPS joinSecret: " + joinSecret);
            return null;
        }
        final String key = hostInformation.get(2);
        if (!Intrinsics.areEqual((Object)key, (Object)DiscordIntegration.spsJoinKey)) {
            Essential.logger.error("Invalid SPS key: " + key + " (" + joinSecret);
            return null;
        }
        final SPSManager spsManager2 = Essential.getInstance().getConnectionManager().getSpsManager();
        Intrinsics.checkNotNullExpressionValue((Object)spsManager2, "getInstance().connectionManager.spsManager");
        final SPSManager spsManager = spsManager2;
        final UPnPSession localSession = spsManager.getLocalSession();
        return (localSession != null) ? localSession.getIp() : null;
    }
    
    public final void regenerateSpsJoinKey() {
        final String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue((Object)string, "randomUUID().toString()");
        DiscordIntegration.spsJoinKey = string;
        BuildersKt.launch$default(DiscordIntegration.scope, (CoroutineContext)null, (CoroutineStart)null, (Function2)new DiscordIntegration$regenerateSpsJoinKey.DiscordIntegration$regenerateSpsJoinKey$1((Continuation)null), 3, (Object)null);
    }
    
    public static final /* synthetic */ Object access$publishActivityUpdate(final DiscordIntegration $this, final Continuation $completion) {
        return $this.publishActivityUpdate((Continuation<? super Unit>)$completion);
    }
    
    public static final /* synthetic */ Object access$initialize(final DiscordIntegration $this, final Continuation $completion) {
        return $this.initialize((Continuation<? super Unit>)$completion);
    }
    
    public static final /* synthetic */ KDiscordIPC access$getIpc$p() {
        return DiscordIntegration.ipc;
    }
    
    public static final /* synthetic */ CoroutineScope access$getScope$p() {
        return DiscordIntegration.scope;
    }
    
    public static final /* synthetic */ Object access$connect(final DiscordIntegration $this, final Continuation $completion) {
        return $this.connect((Continuation<? super Unit>)$completion);
    }
    
    public static final /* synthetic */ PartyInformation access$getPartyInformation$p() {
        return DiscordIntegration.partyInformation;
    }
    
    public static final /* synthetic */ List access$getStateProviders$p() {
        return DiscordIntegration.stateProviders;
    }
    
    public static final /* synthetic */ void access$setPartyInformation(final DiscordIntegration $this, final PartyInformation value) {
        $this.setPartyInformation(value);
    }
    
    public static final /* synthetic */ PartyInformation access$providePartyInformation(final DiscordIntegration $this) {
        return $this.providePartyInformation();
    }
    
    static {
        INSTANCE = new DiscordIntegration();
        exceptionHandler = (CoroutineExceptionHandler)new CoroutineExceptionHandler(CoroutineExceptionHandler.Key) {
            public DiscordIntegration$special$$inlined$CoroutineExceptionHandler$1(final CoroutineExceptionHandler$Key $super_call_param$1) {
                super((CoroutineContext$Key)$super_call_param$1);
            }
            
            public void handleException(@NotNull final CoroutineContext context, @NotNull final Throwable exception) {
                final Throwable throwable = exception;
                if (!(throwable instanceof ConnectionError.Disconnected)) {
                    Essential.logger.error("Exception caught in Discord IPC: ", throwable);
                }
            }
        };
        final String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue((Object)string, "randomUUID().toString()");
        DiscordIntegration.spsJoinKey = string;
        scope = CoroutineScopeKt.CoroutineScope(JobKt.Job$default((Job)null, 1, (Object)null).plus((CoroutineContext)Dispatchers.getIO()).plus((CoroutineContext)DiscordIntegration.exceptionHandler));
        final String property = System.getProperty("essential.discord.ipc.port");
        int intValue = 0;
        Label_0103: {
            if (property != null) {
                final Integer intOrNull = StringsKt.toIntOrNull(property);
                if (intOrNull != null) {
                    intValue = intOrNull;
                    break Label_0103;
                }
            }
            intValue = 0;
        }
        ipcPort = intValue;
        stateProviders = CollectionsKt.listOf((Object[])new ActivityStateProvider[] { new GuiActivityStateProvider(), new GameActivityStateProvider() });
        kdiscordipcLoader = new KDiscordIPCLoader();
        ipc = new KDiscordIPC("894984875755597825", (Function0<? extends Socket>)new DiscordIntegration$ipc.DiscordIntegration$ipc$1((Object)DiscordIntegration.kdiscordipcLoader));
        partyManager = new PartyManager(DiscordIntegration.scope);
        DiscordIntegration.state = (ActivityState)ActivityState.GUI.MainMenu.INSTANCE;
    }
}
