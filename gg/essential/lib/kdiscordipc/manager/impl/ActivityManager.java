package gg.essential.lib.kdiscordipc.manager.impl;

import gg.essential.lib.kdiscordipc.manager.*;
import gg.essential.lib.kdiscordipc.*;
import kotlin.jvm.internal.*;
import gg.essential.lib.kdiscordipc.data.activity.*;
import org.jetbrains.annotations.*;
import kotlin.coroutines.*;
import gg.essential.lib.kdiscordipc.core.event.data.*;
import kotlin.coroutines.intrinsics.*;
import kotlin.*;
import gg.essential.lib.kdiscordipc.core.packet.outbound.*;
import gg.essential.lib.kdiscordipc.core.packet.outbound.impl.*;
import java.util.*;
import kotlin.jvm.functions.*;
import kotlinx.coroutines.flow.*;
import kotlin.coroutines.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0010J\u0011\u0010\u0011\u001a\u00020\u0012H\u0086@\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00122\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086@\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0015J:\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00120\u001a¢\u0006\u0002\b\u001bH\u0086@\u00f8\u0001\u0000¢\u0006\u0002\u0010\u001cR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d" }, d2 = { "Lgg/essential/lib/kdiscordipc/manager/impl/ActivityManager;", "Lgg/essential/lib/kdiscordipc/manager/Manager;", "ipc", "Lgg/essential/lib/kdiscordipc/KDiscordIPC;", "(Ldev/cbyrne/kdiscordipc/KDiscordIPC;)V", "<set-?>", "Lgg/essential/lib/kdiscordipc/data/activity/Activity;", "activity", "getActivity", "()Ldev/cbyrne/kdiscordipc/data/activity/Activity;", "getIpc", "()Ldev/cbyrne/kdiscordipc/KDiscordIPC;", "acceptInvite", "", "data", "Lgg/essential/lib/kdiscordipc/core/event/data/ActivityInviteEventData;", "(Ldev/cbyrne/kdiscordipc/core/event/data/ActivityInviteEventData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearActivity", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setActivity", "(Ldev/cbyrne/kdiscordipc/data/activity/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "details", "", "state", "init", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "KDiscordIPC" })
public final class ActivityManager extends Manager
{
    @NotNull
    private final KDiscordIPC ipc;
    
    public ActivityManager(@NotNull final KDiscordIPC ipc) {
        Intrinsics.checkNotNullParameter((Object)ipc, "ipc");
        super();
        this.ipc = ipc;
    }
    
    @NotNull
    public KDiscordIPC getIpc() {
        return this.ipc;
    }
    
    @Nullable
    public final Object setActivity(@Nullable final Activity activity, @NotNull final Continuation<? super Unit> p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      Lgg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$1;
        //     4: ifeq            39
        //     7: aload_2        
        //     8: checkcast       Lgg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$1;
        //    11: astore          10
        //    13: aload           10
        //    15: getfield        gg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$1.label:I
        //    18: ldc             -2147483648
        //    20: iand           
        //    21: ifeq            39
        //    24: aload           10
        //    26: dup            
        //    27: getfield        gg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$1.label:I
        //    30: ldc             -2147483648
        //    32: isub           
        //    33: putfield        gg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$1.label:I
        //    36: goto            50
        //    39: new             Lgg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$1;
        //    42: dup            
        //    43: aload_0        
        //    44: aload_2        
        //    45: invokespecial   gg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$1.<init>:(Lgg/essential/lib/kdiscordipc/manager/impl/ActivityManager;Lkotlin/coroutines/Continuation;)V
        //    48: astore          $continuation
        //    50: aload           $continuation
        //    52: getfield        gg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$1.result:Ljava/lang/Object;
        //    55: astore          $result
        //    57: invokestatic    kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
        //    60: astore          11
        //    62: aload           $continuation
        //    64: getfield        gg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$1.label:I
        //    67: tableswitch {
        //                0: 92
        //                1: 186
        //                2: 313
        //          default: 322
        //        }
        //    92: aload           $result
        //    94: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        //    97: aload_0         /* this */
        //    98: invokevirtual   gg/essential/lib/kdiscordipc/manager/impl/ActivityManager.getIpc:()Lgg/essential/lib/kdiscordipc/KDiscordIPC;
        //   101: astore_3       
        //   102: new             Lgg/essential/lib/kdiscordipc/core/packet/outbound/impl/SetActivityPacket;
        //   105: dup            
        //   106: invokestatic    gg/essential/lib/kdiscordipc/core/util/ConstantsKt.getCurrentPid:()J
        //   109: aload_1         /* activity */
        //   110: invokespecial   gg/essential/lib/kdiscordipc/core/packet/outbound/impl/SetActivityPacket.<init>:(JLgg/essential/lib/kdiscordipc/data/activity/Activity;)V
        //   113: checkcast       Lgg/essential/lib/kdiscordipc/core/packet/outbound/OutboundPacket;
        //   116: astore          packet$iv
        //   118: invokestatic    java/util/UUID.randomUUID:()Ljava/util/UUID;
        //   121: invokevirtual   java/util/UUID.toString:()Ljava/lang/String;
        //   124: astore          5
        //   126: aload           5
        //   128: ldc             "randomUUID().toString()"
        //   130: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   133: aload           5
        //   135: astore          nonce$iv
        //   137: aload_3         /* this_$iv */
        //   138: aload           packet$iv
        //   140: aload           nonce$iv
        //   142: aload           $continuation
        //   144: aload           $continuation
        //   146: aload_0         /* this */
        //   147: putfield        gg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$1.L$0:Ljava/lang/Object;
        //   150: aload           $continuation
        //   152: aload_1         /* activity */
        //   153: putfield        gg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$1.L$1:Ljava/lang/Object;
        //   156: aload           $continuation
        //   158: aload_3         /* this_$iv */
        //   159: putfield        gg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$1.L$2:Ljava/lang/Object;
        //   162: aload           $continuation
        //   164: aload           nonce$iv
        //   166: putfield        gg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$1.L$3:Ljava/lang/Object;
        //   169: aload           $continuation
        //   171: iconst_1       
        //   172: putfield        gg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$1.label:I
        //   175: invokestatic    gg/essential/lib/kdiscordipc/KDiscordIPC.access$writePacket:(Lgg/essential/lib/kdiscordipc/KDiscordIPC;Lgg/essential/lib/kdiscordipc/core/packet/outbound/OutboundPacket;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        //   178: aload           11
        //   180: if_acmpne       228
        //   183: aload           11
        //   185: areturn        
        //   186: aload           $continuation
        //   188: getfield        gg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$1.L$3:Ljava/lang/Object;
        //   191: checkcast       Ljava/lang/String;
        //   194: astore          nonce$iv
        //   196: aload           $continuation
        //   198: getfield        gg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$1.L$2:Ljava/lang/Object;
        //   201: checkcast       Lgg/essential/lib/kdiscordipc/KDiscordIPC;
        //   204: astore_3        /* this_$iv */
        //   205: aload           $continuation
        //   207: getfield        gg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$1.L$1:Ljava/lang/Object;
        //   210: checkcast       Lgg/essential/lib/kdiscordipc/data/activity/Activity;
        //   213: astore_1       
        //   214: aload           $continuation
        //   216: getfield        gg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$1.L$0:Ljava/lang/Object;
        //   219: checkcast       Lgg/essential/lib/kdiscordipc/manager/impl/ActivityManager;
        //   222: astore_0       
        //   223: aload           $result
        //   225: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        //   228: aload_3         /* this_$iv */
        //   229: invokevirtual   gg/essential/lib/kdiscordipc/KDiscordIPC.getPackets:()Lkotlinx/coroutines/flow/SharedFlow;
        //   232: checkcast       Lkotlinx/coroutines/flow/Flow;
        //   235: astore          $this$filterIsInstance$iv$iv
        //   237: aload           $this$filterIsInstance$iv$iv
        //   239: astore          $this$filter$iv$iv$iv
        //   241: aload           $this$filter$iv$iv$iv
        //   243: astore          $this$unsafeTransform$iv$iv$iv$iv
        //   245: new             Lgg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$$inlined$sendPacket$KDiscordIPC$1;
        //   248: dup            
        //   249: aload           $this$unsafeTransform$iv$iv$iv$iv
        //   251: invokespecial   gg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$$inlined$sendPacket$KDiscordIPC$1.<init>:(Lkotlinx/coroutines/flow/Flow;)V
        //   254: checkcast       Lkotlinx/coroutines/flow/Flow;
        //   257: new             Lgg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$$inlined$sendPacket$KDiscordIPC$2;
        //   260: dup            
        //   261: aload           nonce$iv
        //   263: aconst_null    
        //   264: invokespecial   gg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$$inlined$sendPacket$KDiscordIPC$2.<init>:(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
        //   267: checkcast       Lkotlin/jvm/functions/Function2;
        //   270: aload           $continuation
        //   272: aload           $continuation
        //   274: aload_0        
        //   275: putfield        gg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$1.L$0:Ljava/lang/Object;
        //   278: aload           $continuation
        //   280: aload_1        
        //   281: putfield        gg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$1.L$1:Ljava/lang/Object;
        //   284: aload           $continuation
        //   286: aconst_null    
        //   287: putfield        gg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$1.L$2:Ljava/lang/Object;
        //   290: aload           $continuation
        //   292: aconst_null    
        //   293: putfield        gg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$1.L$3:Ljava/lang/Object;
        //   296: aload           $continuation
        //   298: iconst_2       
        //   299: putfield        gg/essential/lib/kdiscordipc/manager/impl/ActivityManager$setActivity$1.label:I
        //   302: invokestatic    kotlinx/coroutines/flow/FlowKt.first:(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        //   305: aload           11
        //   307: if_acmpne       318
        //   310: aload           11
        //   312: areturn        
        //   313: aload           $result
        //   315: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        //   318: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   321: areturn        
        //   322: new             Ljava/lang/IllegalStateException;
        //   325: dup            
        //   326: ldc             "call to 'resume' before 'invoke' with coroutine"
        //   328: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   331: athrow         
        //    Signature:
        //  (Lgg/essential/lib/kdiscordipc/data/activity/Activity;Lkotlin/coroutines/Continuation<-Lkotlin/Unit;>;)Ljava/lang/Object;
        //    StackMapTable: 00 08 27 FF 00 0A 00 0B 07 00 02 07 00 4E 00 00 00 00 00 00 00 00 07 00 2E 00 00 FF 00 29 00 0C 07 00 02 07 00 4E 00 00 00 00 00 00 00 07 00 5A 07 00 2E 07 00 5A 00 00 FF 00 5D 00 0C 00 00 00 00 00 00 00 00 00 07 00 5A 07 00 2E 07 00 5A 00 00 FF 00 29 00 0C 07 00 02 07 00 4E 00 07 00 8C 00 00 07 00 92 00 00 00 07 00 2E 07 00 5A 00 00 FF 00 54 00 0A 00 00 00 00 00 00 00 00 00 07 00 5A 00 00 FF 00 04 00 00 00 00 03
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Nullable
    public final Object acceptInvite(@NotNull final ActivityInviteEventData data, @NotNull final Continuation<? super Boolean> continuation) {
        final Continuation $continuation;
        Label_0050: {
            if (continuation instanceof ActivityManager$acceptInvite.ActivityManager$acceptInvite$1) {
                final ActivityManager$acceptInvite.ActivityManager$acceptInvite$1 activityManager$acceptInvite$1 = (ActivityManager$acceptInvite.ActivityManager$acceptInvite$1)continuation;
                if ((activityManager$acceptInvite$1.label & Integer.MIN_VALUE) != 0x0) {
                    final ActivityManager$acceptInvite.ActivityManager$acceptInvite$1 activityManager$acceptInvite$2 = activityManager$acceptInvite$1;
                    activityManager$acceptInvite$2.label -= Integer.MIN_VALUE;
                    break Label_0050;
                }
            }
            $continuation = (Continuation)new ActivityManager$acceptInvite.ActivityManager$acceptInvite$1(this, (Continuation)continuation);
        }
        final Object $result = ((ActivityManager$acceptInvite.ActivityManager$acceptInvite$1)$continuation).result;
        final Object coroutine_SUSPENDED = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Object first = null;
        Label_0306: {
            KDiscordIPC this_$iv = null;
            String nonce$iv = null;
            switch (((ActivityManager$acceptInvite.ActivityManager$acceptInvite$1)$continuation).label) {
                case 0: {
                    ResultKt.throwOnFailure($result);
                    this_$iv = this.getIpc();
                    final OutboundPacket packet$iv = (OutboundPacket)new AcceptActivityInvitePacket(data.getChannelId(), data.getMessageId(), data.getActivity().getSessionId(), data.getUser().getId(), data.getType());
                    final String string = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue((Object)string, "randomUUID().toString()");
                    nonce$iv = string;
                    final KDiscordIPC $this = this_$iv;
                    final OutboundPacket packet = packet$iv;
                    final String nonce = nonce$iv;
                    final Continuation $completion = $continuation;
                    ((ActivityManager$acceptInvite.ActivityManager$acceptInvite$1)$continuation).L$0 = this_$iv;
                    ((ActivityManager$acceptInvite.ActivityManager$acceptInvite$1)$continuation).L$1 = nonce$iv;
                    ((ActivityManager$acceptInvite.ActivityManager$acceptInvite$1)$continuation).label = 1;
                    if (KDiscordIPC.access$writePacket($this, packet, nonce, $completion) == coroutine_SUSPENDED) {
                        return coroutine_SUSPENDED;
                    }
                    break;
                }
                case 1: {
                    nonce$iv = (String)((ActivityManager$acceptInvite.ActivityManager$acceptInvite$1)$continuation).L$1;
                    this_$iv = (KDiscordIPC)((ActivityManager$acceptInvite.ActivityManager$acceptInvite$1)$continuation).L$0;
                    ResultKt.throwOnFailure($result);
                    break;
                }
                case 2: {
                    ResultKt.throwOnFailure($result);
                    first = $result;
                    break Label_0306;
                }
                default: {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
            final Flow $this$filterIsInstance$iv$iv = (Flow)this_$iv.getPackets();
            final Flow $this$unsafeTransform$iv$iv$iv$iv;
            final Flow $this$filter$iv$iv$iv = $this$unsafeTransform$iv$iv$iv$iv = $this$filterIsInstance$iv$iv;
            final Flow flow = (Flow)new ActivityManager$acceptInvite$$inlined$sendPacket$KDiscordIPC$1($this$unsafeTransform$iv$iv$iv$iv);
            final Function2 function2 = (Function2)new ActivityManager$acceptInvite$$inlined$sendPacket$KDiscordIPC$2(nonce$iv, (Continuation)null);
            final Continuation continuation2 = $continuation;
            ((ActivityManager$acceptInvite.ActivityManager$acceptInvite$1)$continuation).L$0 = null;
            ((ActivityManager$acceptInvite.ActivityManager$acceptInvite$1)$continuation).L$1 = null;
            ((ActivityManager$acceptInvite.ActivityManager$acceptInvite$1)$continuation).label = 2;
            if ((first = FlowKt.first(flow, function2, continuation2)) == coroutine_SUSPENDED) {
                return coroutine_SUSPENDED;
            }
        }
        final gg.essential.lib.kdiscordipc.core.packet.inbound.impl.AcceptActivityInvitePacket result = (gg.essential.lib.kdiscordipc.core.packet.inbound.impl.AcceptActivityInvitePacket)first;
        return Boxing.boxBoolean(result.getData() != null);
    }
    
    @Nullable
    public final Object clearActivity(@NotNull final Continuation<? super Unit> $completion) {
        final Object setActivity = this.setActivity(null, $completion);
        if (setActivity == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return setActivity;
        }
        return Unit.INSTANCE;
    }
}
