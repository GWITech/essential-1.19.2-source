package gg.essential.lib.kdiscordipc;

import gg.essential.lib.kdiscordipc.core.socket.handler.*;
import gg.essential.lib.kdiscordipc.manager.impl.*;
import gg.essential.lib.kdiscordipc.core.packet.inbound.*;
import kotlin.jvm.functions.*;
import gg.essential.lib.kdiscordipc.core.socket.*;
import kotlinx.coroutines.*;
import kotlinx.coroutines.channels.*;
import kotlin.coroutines.*;
import kotlin.coroutines.intrinsics.*;
import kotlin.*;
import gg.essential.lib.kdiscordipc.core.packet.outbound.*;
import gg.essential.lib.kdiscordipc.core.packet.outbound.impl.*;
import kotlinx.coroutines.flow.*;
import org.jetbrains.annotations.*;
import gg.essential.lib.kdiscordipc.core.event.*;
import gg.essential.lib.kdiscordipc.core.packet.pipeline.*;
import kotlin.jvm.internal.*;
import kotlin.text.*;
import java.nio.*;
import gg.essential.lib.kdiscordipc.core.util.*;
import kotlinx.serialization.modules.*;
import kotlinx.serialization.*;
import org.slf4j.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 M2\u00020\u0001:\u0001MB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u001b\u00101\u001a\u0002022\b\b\u0002\u00103\u001a\u000204H\u0086@\u00f8\u0001\u0000¢\u0006\u0002\u00105J\u0006\u00106\u001a\u000202JJ\u00107\u001a\u000208\"\n\b\u0000\u00109\u0018\u0001*\u00020\n2)\b\b\u0010:\u001a#\b\u0001\u0012\u0004\u0012\u0002H9\u0012\n\u0012\b\u0012\u0004\u0012\u0002020<\u0012\u0006\u0012\u0004\u0018\u00010\u00010;¢\u0006\u0002\b=H\u0087H\u00f8\u0001\u0000¢\u0006\u0004\b>\u0010?JJ\u00107\u001a\u000208\"\n\b\u0000\u00109\u0018\u0001*\u00020\f2)\b\b\u0010:\u001a#\b\u0001\u0012\u0004\u0012\u0002H9\u0012\n\u0012\b\u0012\u0004\u0012\u0002020<\u0012\u0006\u0012\u0004\u0018\u00010\u00010;¢\u0006\u0002\b=H\u0087H\u00f8\u0001\u0000¢\u0006\u0004\b@\u0010?J'\u0010A\u001a\u0002H9\"\n\b\u0000\u00109\u0018\u0001*\u00020\f2\u0006\u0010B\u001a\u00020CH\u0080H\u00f8\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u0002022\u0006\u0010G\u001a\u00020HH\u0086@\u00f8\u0001\u0000¢\u0006\u0002\u0010IJ%\u0010J\u001a\u0002022\u0006\u0010B\u001a\u00020C2\n\b\u0002\u0010K\u001a\u0004\u0018\u00010\u0003H\u0082@\u00f8\u0001\u0000¢\u0006\u0002\u0010LR\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001a¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0011\u0010\u001f\u001a\u00020 ¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010)\u001a\u00020*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010-\u001a\u00020.¢\u0006\b\n\u0000\u001a\u0004\b/\u00100\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006N" }, d2 = { "Lgg/essential/lib/kdiscordipc/KDiscordIPC;", "", "clientID", "", "socketSupplier", "Lkotlin/Function0;", "Lgg/essential/lib/kdiscordipc/core/socket/Socket;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "_events", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lgg/essential/lib/kdiscordipc/core/event/Event;", "_packets", "Lgg/essential/lib/kdiscordipc/core/packet/inbound/InboundPacket;", "activityManager", "Lgg/essential/lib/kdiscordipc/manager/impl/ActivityManager;", "getActivityManager", "()Ldev/cbyrne/kdiscordipc/manager/impl/ActivityManager;", "applicationManager", "Lgg/essential/lib/kdiscordipc/manager/impl/ApplicationManager;", "getApplicationManager", "()Ldev/cbyrne/kdiscordipc/manager/impl/ApplicationManager;", "connected", "", "getConnected", "()Z", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "packets", "getPackets", "relationshipManager", "Lgg/essential/lib/kdiscordipc/manager/impl/RelationshipManager;", "getRelationshipManager", "()Ldev/cbyrne/kdiscordipc/manager/impl/RelationshipManager;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "socketHandler", "Lgg/essential/lib/kdiscordipc/core/socket/handler/SocketHandler;", "userManager", "Lgg/essential/lib/kdiscordipc/manager/impl/UserManager;", "getUserManager", "()Ldev/cbyrne/kdiscordipc/manager/impl/UserManager;", "voiceSettingsManager", "Lgg/essential/lib/kdiscordipc/manager/impl/VoiceSettingsManager;", "getVoiceSettingsManager", "()Ldev/cbyrne/kdiscordipc/manager/impl/VoiceSettingsManager;", "connect", "", "index", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "disconnect", "on", "Lkotlinx/coroutines/Job;", "T", "consumer", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "Lkotlin/ExtensionFunctionType;", "onEvent", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPacket", "sendPacket", "packet", "Lgg/essential/lib/kdiscordipc/core/packet/outbound/OutboundPacket;", "sendPacket$KDiscordIPC", "(Ldev/cbyrne/kdiscordipc/core/packet/outbound/OutboundPacket;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscribe", "event", "Lgg/essential/lib/kdiscordipc/core/event/DiscordEvent;", "(Ldev/cbyrne/kdiscordipc/core/event/DiscordEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writePacket", "nonce", "(Ldev/cbyrne/kdiscordipc/core/packet/outbound/OutboundPacket;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "KDiscordIPC" })
public final class KDiscordIPC
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final String clientID;
    @NotNull
    private final CoroutineScope scope;
    @NotNull
    private final SocketHandler socketHandler;
    @NotNull
    private final ActivityManager activityManager;
    @NotNull
    private final ApplicationManager applicationManager;
    @NotNull
    private final RelationshipManager relationshipManager;
    @NotNull
    private final UserManager userManager;
    @NotNull
    private final VoiceSettingsManager voiceSettingsManager;
    @NotNull
    private final MutableSharedFlow<Event> _events;
    @NotNull
    private final SharedFlow<Event> events;
    @NotNull
    private final MutableSharedFlow<InboundPacket> _packets;
    @NotNull
    private final SharedFlow<InboundPacket> packets;
    private static final Logger logger;
    
    public KDiscordIPC(@NotNull final String clientID, @NotNull final Function0<? extends Socket> socketSupplier) {
        Intrinsics.checkNotNullParameter((Object)clientID, "clientID");
        Intrinsics.checkNotNullParameter((Object)socketSupplier, "socketSupplier");
        super();
        this.clientID = clientID;
        this.scope = CoroutineScopeKt.CoroutineScope(JobKt.Job$default((Job)null, 1, (Object)null).plus((CoroutineContext)Dispatchers.getIO()));
        this.socketHandler = new SocketHandler(this.scope, socketSupplier);
        this.activityManager = new ActivityManager(this);
        this.applicationManager = new ApplicationManager(this);
        this.relationshipManager = new RelationshipManager(this);
        this.userManager = new UserManager(this);
        this.voiceSettingsManager = new VoiceSettingsManager(this);
        this._events = (MutableSharedFlow<Event>)SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow)null, 7, (Object)null);
        this.events = (SharedFlow<Event>)FlowKt.asSharedFlow((MutableSharedFlow)this._events);
        this._packets = (MutableSharedFlow<InboundPacket>)SharedFlowKt.MutableSharedFlow$default(0, 0, (BufferOverflow)null, 7, (Object)null);
        this.packets = (SharedFlow<InboundPacket>)FlowKt.asSharedFlow((MutableSharedFlow)this._packets);
    }
    
    @NotNull
    public final CoroutineScope getScope() {
        return this.scope;
    }
    
    public final boolean getConnected() {
        return this.socketHandler.getConnected();
    }
    
    @NotNull
    public final ActivityManager getActivityManager() {
        return this.activityManager;
    }
    
    @NotNull
    public final ApplicationManager getApplicationManager() {
        return this.applicationManager;
    }
    
    @NotNull
    public final RelationshipManager getRelationshipManager() {
        return this.relationshipManager;
    }
    
    @NotNull
    public final UserManager getUserManager() {
        return this.userManager;
    }
    
    @NotNull
    public final VoiceSettingsManager getVoiceSettingsManager() {
        return this.voiceSettingsManager;
    }
    
    @NotNull
    public final SharedFlow<Event> getEvents() {
        return this.events;
    }
    
    @NotNull
    public final SharedFlow<InboundPacket> getPackets() {
        return this.packets;
    }
    
    @Nullable
    public final Object connect(int index, @NotNull final Continuation<? super Unit> continuation) {
        final Continuation $continuation;
        Label_0050: {
            if (continuation instanceof KDiscordIPC$connect.KDiscordIPC$connect$1) {
                final KDiscordIPC$connect.KDiscordIPC$connect$1 kDiscordIPC$connect$1 = (KDiscordIPC$connect.KDiscordIPC$connect$1)continuation;
                if ((kDiscordIPC$connect$1.label & Integer.MIN_VALUE) != 0x0) {
                    final KDiscordIPC$connect.KDiscordIPC$connect$1 kDiscordIPC$connect$2 = kDiscordIPC$connect$1;
                    kDiscordIPC$connect$2.label -= Integer.MIN_VALUE;
                    break Label_0050;
                }
            }
            $continuation = (Continuation)new KDiscordIPC$connect.KDiscordIPC$connect$1(this, (Continuation)continuation);
        }
        final Object $result = ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).result;
        final Object coroutine_SUSPENDED = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Label_0438: {
            Label_0376: {
                Label_0324: {
                    Label_0272: {
                        Label_0220: {
                            switch (((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).label) {
                                case 0: {
                                    ResultKt.throwOnFailure($result);
                                    final ActivityManager activityManager = this.getActivityManager();
                                    ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).L$0 = this;
                                    ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).I$0 = index;
                                    ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).label = 1;
                                    if (activityManager.init$KDiscordIPC$72b156b5() == coroutine_SUSPENDED) {
                                        return coroutine_SUSPENDED;
                                    }
                                    break;
                                }
                                case 1: {
                                    index = ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).I$0;
                                    this = (KDiscordIPC)((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).L$0;
                                    ResultKt.throwOnFailure($result);
                                    break;
                                }
                                case 2: {
                                    index = ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).I$0;
                                    this = (KDiscordIPC)((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).L$0;
                                    ResultKt.throwOnFailure($result);
                                    break Label_0220;
                                }
                                case 3: {
                                    index = ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).I$0;
                                    this = (KDiscordIPC)((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).L$0;
                                    ResultKt.throwOnFailure($result);
                                    break Label_0272;
                                }
                                case 4: {
                                    index = ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).I$0;
                                    this = (KDiscordIPC)((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).L$0;
                                    ResultKt.throwOnFailure($result);
                                    break Label_0324;
                                }
                                case 5: {
                                    index = ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).I$0;
                                    this = (KDiscordIPC)((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).L$0;
                                    ResultKt.throwOnFailure($result);
                                    break Label_0376;
                                }
                                case 6: {
                                    this = (KDiscordIPC)((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).L$0;
                                    ResultKt.throwOnFailure($result);
                                    break Label_0438;
                                }
                                case 7: {
                                    ResultKt.throwOnFailure($result);
                                    return Unit.INSTANCE;
                                }
                                default: {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                            }
                            final ApplicationManager applicationManager = this.getApplicationManager();
                            ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).L$0 = this;
                            ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).I$0 = index;
                            ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).label = 2;
                            if (applicationManager.init$KDiscordIPC$72b156b5() == coroutine_SUSPENDED) {
                                return coroutine_SUSPENDED;
                            }
                        }
                        final RelationshipManager relationshipManager = this.getRelationshipManager();
                        ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).L$0 = this;
                        ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).I$0 = index;
                        ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).label = 3;
                        if (relationshipManager.init$KDiscordIPC$72b156b5() == coroutine_SUSPENDED) {
                            return coroutine_SUSPENDED;
                        }
                    }
                    final UserManager userManager = this.getUserManager();
                    ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).L$0 = this;
                    ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).I$0 = index;
                    ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).label = 4;
                    if (userManager.init$KDiscordIPC$72b156b5() == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                }
                final VoiceSettingsManager voiceSettingsManager = this.getVoiceSettingsManager();
                ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).L$0 = this;
                ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).I$0 = index;
                ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).label = 5;
                if (voiceSettingsManager.init$KDiscordIPC$72b156b5() == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
            }
            this.socketHandler.connect(index);
            final KDiscordIPC kDiscordIPC = this;
            final OutboundPacket outboundPacket = new HandshakePacket(this.clientID);
            final Continuation continuation2 = $continuation;
            ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).L$0 = this;
            ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).label = 6;
            if (writePacket$default$2b775a65$3e12f937(kDiscordIPC, outboundPacket, continuation2) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final Flow<InboundPacket> events = this.socketHandler.getEvents();
        final FlowCollector flowCollector = (FlowCollector)new KDiscordIPC$connect.KDiscordIPC$connect$2(this);
        final Continuation continuation3 = $continuation;
        ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).L$0 = null;
        ((KDiscordIPC$connect.KDiscordIPC$connect$1)$continuation).label = 7;
        if (events.collect(flowCollector, continuation3) == coroutine_SUSPENDED) {
            return coroutine_SUSPENDED;
        }
        return Unit.INSTANCE;
    }
    
    public final void disconnect() {
        this.socketHandler.disconnect();
    }
    
    @Nullable
    public final Object subscribe(@NotNull final DiscordEvent event, @NotNull final Continuation<? super Unit> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      Lgg/essential/lib/kdiscordipc/KDiscordIPC$subscribe$1;
        //     4: ifeq            39
        //     7: aload_2        
        //     8: checkcast       Lgg/essential/lib/kdiscordipc/KDiscordIPC$subscribe$1;
        //    11: astore          10
        //    13: aload           10
        //    15: getfield        gg/essential/lib/kdiscordipc/KDiscordIPC$subscribe$1.label:I
        //    18: ldc             -2147483648
        //    20: iand           
        //    21: ifeq            39
        //    24: aload           10
        //    26: dup            
        //    27: getfield        gg/essential/lib/kdiscordipc/KDiscordIPC$subscribe$1.label:I
        //    30: ldc             -2147483648
        //    32: isub           
        //    33: putfield        gg/essential/lib/kdiscordipc/KDiscordIPC$subscribe$1.label:I
        //    36: goto            50
        //    39: new             Lgg/essential/lib/kdiscordipc/KDiscordIPC$subscribe$1;
        //    42: dup            
        //    43: aload_0        
        //    44: aload_2        
        //    45: invokespecial   gg/essential/lib/kdiscordipc/KDiscordIPC$subscribe$1.<init>:(Lgg/essential/lib/kdiscordipc/KDiscordIPC;Lkotlin/coroutines/Continuation;)V
        //    48: astore          $continuation
        //    50: aload           $continuation
        //    52: getfield        gg/essential/lib/kdiscordipc/KDiscordIPC$subscribe$1.result:Ljava/lang/Object;
        //    55: astore          $result
        //    57: invokestatic    kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
        //    60: astore          11
        //    62: aload           $continuation
        //    64: getfield        gg/essential/lib/kdiscordipc/KDiscordIPC$subscribe$1.label:I
        //    67: tableswitch {
        //                0: 92
        //                1: 169
        //                2: 266
        //          default: 275
        //        }
        //    92: aload           $result
        //    94: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        //    97: aload_0         /* this */
        //    98: astore_3       
        //    99: new             Lgg/essential/lib/kdiscordipc/core/packet/outbound/impl/SubscribePacket;
        //   102: dup            
        //   103: aload_1         /* event */
        //   104: invokespecial   gg/essential/lib/kdiscordipc/core/packet/outbound/impl/SubscribePacket.<init>:(Lgg/essential/lib/kdiscordipc/core/event/DiscordEvent;)V
        //   107: checkcast       Lgg/essential/lib/kdiscordipc/core/packet/outbound/OutboundPacket;
        //   110: astore          packet$iv
        //   112: invokestatic    java/util/UUID.randomUUID:()Ljava/util/UUID;
        //   115: invokevirtual   java/util/UUID.toString:()Ljava/lang/String;
        //   118: astore          5
        //   120: aload           5
        //   122: ldc_w           "randomUUID().toString()"
        //   125: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   128: aload           5
        //   130: astore          nonce$iv
        //   132: aload_3         /* this_$iv */
        //   133: aload           packet$iv
        //   135: aload           nonce$iv
        //   137: aload           $continuation
        //   139: aload           $continuation
        //   141: aload_3         /* this_$iv */
        //   142: putfield        gg/essential/lib/kdiscordipc/KDiscordIPC$subscribe$1.L$0:Ljava/lang/Object;
        //   145: aload           $continuation
        //   147: aload           nonce$iv
        //   149: putfield        gg/essential/lib/kdiscordipc/KDiscordIPC$subscribe$1.L$1:Ljava/lang/Object;
        //   152: aload           $continuation
        //   154: iconst_1       
        //   155: putfield        gg/essential/lib/kdiscordipc/KDiscordIPC$subscribe$1.label:I
        //   158: invokestatic    gg/essential/lib/kdiscordipc/KDiscordIPC.access$writePacket:(Lgg/essential/lib/kdiscordipc/KDiscordIPC;Lgg/essential/lib/kdiscordipc/core/packet/outbound/OutboundPacket;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        //   161: aload           11
        //   163: if_acmpne       193
        //   166: aload           11
        //   168: areturn        
        //   169: aload           $continuation
        //   171: getfield        gg/essential/lib/kdiscordipc/KDiscordIPC$subscribe$1.L$1:Ljava/lang/Object;
        //   174: checkcast       Ljava/lang/String;
        //   177: astore          nonce$iv
        //   179: aload           $continuation
        //   181: getfield        gg/essential/lib/kdiscordipc/KDiscordIPC$subscribe$1.L$0:Ljava/lang/Object;
        //   184: checkcast       Lgg/essential/lib/kdiscordipc/KDiscordIPC;
        //   187: astore_3        /* this_$iv */
        //   188: aload           $result
        //   190: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        //   193: aload_3         /* this_$iv */
        //   194: invokevirtual   gg/essential/lib/kdiscordipc/KDiscordIPC.getPackets:()Lkotlinx/coroutines/flow/SharedFlow;
        //   197: checkcast       Lkotlinx/coroutines/flow/Flow;
        //   200: astore          $this$filterIsInstance$iv$iv
        //   202: aload           $this$filterIsInstance$iv$iv
        //   204: astore          $this$filter$iv$iv$iv
        //   206: aload           $this$filter$iv$iv$iv
        //   208: astore          $this$unsafeTransform$iv$iv$iv$iv
        //   210: new             Lgg/essential/lib/kdiscordipc/KDiscordIPC$subscribe$$inlined$sendPacket$KDiscordIPC$1;
        //   213: dup            
        //   214: aload           $this$unsafeTransform$iv$iv$iv$iv
        //   216: invokespecial   gg/essential/lib/kdiscordipc/KDiscordIPC$subscribe$$inlined$sendPacket$KDiscordIPC$1.<init>:(Lkotlinx/coroutines/flow/Flow;)V
        //   219: checkcast       Lkotlinx/coroutines/flow/Flow;
        //   222: new             Lgg/essential/lib/kdiscordipc/KDiscordIPC$subscribe$$inlined$sendPacket$KDiscordIPC$2;
        //   225: dup            
        //   226: aload           nonce$iv
        //   228: aconst_null    
        //   229: invokespecial   gg/essential/lib/kdiscordipc/KDiscordIPC$subscribe$$inlined$sendPacket$KDiscordIPC$2.<init>:(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
        //   232: checkcast       Lkotlin/jvm/functions/Function2;
        //   235: aload           $continuation
        //   237: aload           $continuation
        //   239: aconst_null    
        //   240: putfield        gg/essential/lib/kdiscordipc/KDiscordIPC$subscribe$1.L$0:Ljava/lang/Object;
        //   243: aload           $continuation
        //   245: aconst_null    
        //   246: putfield        gg/essential/lib/kdiscordipc/KDiscordIPC$subscribe$1.L$1:Ljava/lang/Object;
        //   249: aload           $continuation
        //   251: iconst_2       
        //   252: putfield        gg/essential/lib/kdiscordipc/KDiscordIPC$subscribe$1.label:I
        //   255: invokestatic    kotlinx/coroutines/flow/FlowKt.first:(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        //   258: aload           11
        //   260: if_acmpne       271
        //   263: aload           11
        //   265: areturn        
        //   266: aload           $result
        //   268: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        //   271: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   274: areturn        
        //   275: new             Ljava/lang/IllegalStateException;
        //   278: dup            
        //   279: ldc_w           "call to 'resume' before 'invoke' with coroutine"
        //   282: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   285: athrow         
        //    Signature:
        //  (Lgg/essential/lib/kdiscordipc/core/event/DiscordEvent;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object;
        //    StackMapTable: 00 08 27 FF 00 0A 00 0B 07 00 02 07 01 38 00 00 00 00 00 00 00 00 07 00 61 00 00 FF 00 29 00 0C 07 00 02 07 01 38 00 00 00 00 00 00 00 07 00 04 07 00 61 07 00 04 00 00 FF 00 4C 00 0C 00 00 00 00 00 00 00 00 00 07 00 04 07 00 61 07 00 04 00 00 FF 00 17 00 0C 00 00 00 07 00 02 00 00 07 01 57 00 00 00 07 00 61 07 00 04 00 00 FF 00 48 00 0A 00 00 00 00 00 00 00 00 00 07 00 04 00 00 FF 00 04 00 00 00 00 03
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final Object writePacket(final OutboundPacket packet, final String nonce, final Continuation<? super Unit> $completion) {
        final MessageToByteEncoder instance = MessageToByteEncoder.INSTANCE;
        if (nonce != null) {
            final String it$iv = nonce;
            packet.setNonce(it$iv);
        }
        final StringFormat stringFormat;
        final StringFormat $this$encodeToString$iv$iv = stringFormat = (StringFormat)ConstantsKt.getJson();
        final SerializersModule $this$serializer$iv$iv$iv = $this$encodeToString$iv$iv.getSerializersModule();
        final KSerializer $this$cast$iv$iv$iv$iv = SerializersKt.serializer($this$serializer$iv$iv$iv, Reflection.typeOf((Class)OutboundPacket.class));
        final String data$iv = stringFormat.encodeToString((SerializationStrategy)$this$cast$iv$iv$iv$iv, (Object)packet);
        KDiscordIPC.Companion.getLogger$KDiscordIPC().debug(Intrinsics.stringPlus("Encoding: ", (Object)data$iv));
        final byte[] bytes$iv = StringsKt.encodeToByteArray(data$iv);
        final ByteBuffer buffer$iv = ByteBuffer.allocate(8 + bytes$iv.length);
        buffer$iv.putInt(IntegerKt.reverse(packet.getOpcode()));
        buffer$iv.putInt(IntegerKt.reverse(bytes$iv.length));
        buffer$iv.put(bytes$iv);
        final byte[] array = buffer$iv.array();
        Intrinsics.checkNotNullExpressionValue((Object)array, "buffer.array()");
        final byte[] bytes = array;
        final Object write = this.socketHandler.write(bytes, $completion);
        if (write == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return write;
        }
        return Unit.INSTANCE;
    }
    
    static /* synthetic */ Object writePacket$default$2b775a65$3e12f937(final KDiscordIPC kDiscordIPC, final OutboundPacket packet, final Continuation $completion) {
        return kDiscordIPC.writePacket(packet, null, (Continuation<? super Unit>)$completion);
    }
    
    public static final /* synthetic */ Logger access$getLogger$cp() {
        return KDiscordIPC.logger;
    }
    
    public static final /* synthetic */ MutableSharedFlow access$get_events$p(final KDiscordIPC $this) {
        return $this._events;
    }
    
    public static final /* synthetic */ MutableSharedFlow access$get_packets$p(final KDiscordIPC $this) {
        return $this._packets;
    }
    
    public static final /* synthetic */ Object access$writePacket(final KDiscordIPC $this, final OutboundPacket packet, final String nonce, final Continuation $completion) {
        return $this.writePacket(packet, nonce, (Continuation<? super Unit>)$completion);
    }
    
    static {
        Companion = new Companion((byte)0);
        logger = LoggerFactory.getLogger("KDiscordIPC");
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lgg/essential/lib/kdiscordipc/KDiscordIPC$Companion;", "", "()V", "logger", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "getLogger$KDiscordIPC", "()Lorg/slf4j/Logger;", "KDiscordIPC" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public final Logger getLogger$KDiscordIPC() {
            return KDiscordIPC.access$getLogger$cp();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
