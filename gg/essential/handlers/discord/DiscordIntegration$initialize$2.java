package gg.essential.handlers.discord;

import kotlin.jvm.functions.*;
import gg.essential.lib.kdiscordipc.core.event.impl.*;
import kotlin.coroutines.*;
import kotlin.coroutines.jvm.internal.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@DebugMetadata(f = "DiscordIntegration.kt", l = { 145, 146, 147, 148, 173 }, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "gg.essential.handlers.discord.DiscordIntegration$initialize$2")
@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@""" }, d2 = { "<anonymous>", "", "Lgg/essential/lib/kdiscordipc/core/event/impl/ReadyEvent;" })
static final class DiscordIntegration$initialize$2 extends SuspendLambda implements Function2<ReadyEvent, Continuation<? super Unit>, Object> {
    int label;
    private /* synthetic */ Object L$0;
    
    DiscordIntegration$initialize$2(final Continuation<? super DiscordIntegration$initialize$2> $completion) {
        super(2, (Continuation)$completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull final Object $result) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: astore          8
        //     5: aload_0        
        //     6: getfield        gg/essential/handlers/discord/DiscordIntegration$initialize$2.label:I
        //     9: tableswitch {
        //                0: 48
        //                1: 119
        //                2: 149
        //                3: 179
        //                4: 209
        //                5: 378
        //          default: 386
        //        }
        //    48: aload_1        
        //    49: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        //    52: aload_0         /* this */
        //    53: getfield        gg/essential/handlers/discord/DiscordIntegration$initialize$2.L$0:Ljava/lang/Object;
        //    56: checkcast       Lgg/essential/lib/kdiscordipc/core/event/impl/ReadyEvent;
        //    59: astore_2        /* $this$on */
        //    60: getstatic       gg/essential/Essential.logger:Lorg/apache/logging/log4j/Logger;
        //    63: aload_2         /* $this$on */
        //    64: invokevirtual   gg/essential/lib/kdiscordipc/core/event/impl/ReadyEvent.getData:()Lgg/essential/lib/kdiscordipc/core/event/data/ReadyEventData;
        //    67: invokevirtual   gg/essential/lib/kdiscordipc/core/event/data/ReadyEventData.getUser:()Lgg/essential/lib/kdiscordipc/data/user/User;
        //    70: invokevirtual   gg/essential/lib/kdiscordipc/data/user/User.getUsername:()Ljava/lang/String;
        //    73: aload_2         /* $this$on */
        //    74: invokevirtual   gg/essential/lib/kdiscordipc/core/event/impl/ReadyEvent.getData:()Lgg/essential/lib/kdiscordipc/core/event/data/ReadyEventData;
        //    77: invokevirtual   gg/essential/lib/kdiscordipc/core/event/data/ReadyEventData.getUser:()Lgg/essential/lib/kdiscordipc/data/user/User;
        //    80: invokevirtual   gg/essential/lib/kdiscordipc/data/user/User.getDiscriminator:()Ljava/lang/String;
        //    83: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //    88: invokeinterface org/apache/logging/log4j/Logger.info:(Ljava/lang/String;)V
        //    93: invokestatic    gg/essential/handlers/discord/DiscordIntegration.access$getIpc$p:()Lgg/essential/lib/kdiscordipc/KDiscordIPC;
        //    96: getstatic       gg/essential/lib/kdiscordipc/core/event/DiscordEvent.ActivityJoinRequest:Lgg/essential/lib/kdiscordipc/core/event/DiscordEvent;
        //    99: aload_0         /* this */
        //   100: checkcast       Lkotlin/coroutines/Continuation;
        //   103: aload_0         /* this */
        //   104: iconst_1       
        //   105: putfield        gg/essential/handlers/discord/DiscordIntegration$initialize$2.label:I
        //   108: invokevirtual   gg/essential/lib/kdiscordipc/KDiscordIPC.subscribe:(Lgg/essential/lib/kdiscordipc/core/event/DiscordEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        //   111: aload           8
        //   113: if_acmpne       123
        //   116: aload           8
        //   118: areturn        
        //   119: aload_1         /* $result */
        //   120: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        //   123: invokestatic    gg/essential/handlers/discord/DiscordIntegration.access$getIpc$p:()Lgg/essential/lib/kdiscordipc/KDiscordIPC;
        //   126: getstatic       gg/essential/lib/kdiscordipc/core/event/DiscordEvent.ActivityJoin:Lgg/essential/lib/kdiscordipc/core/event/DiscordEvent;
        //   129: aload_0         /* this */
        //   130: checkcast       Lkotlin/coroutines/Continuation;
        //   133: aload_0         /* this */
        //   134: iconst_2       
        //   135: putfield        gg/essential/handlers/discord/DiscordIntegration$initialize$2.label:I
        //   138: invokevirtual   gg/essential/lib/kdiscordipc/KDiscordIPC.subscribe:(Lgg/essential/lib/kdiscordipc/core/event/DiscordEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        //   141: aload           8
        //   143: if_acmpne       153
        //   146: aload           8
        //   148: areturn        
        //   149: aload_1         /* $result */
        //   150: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        //   153: invokestatic    gg/essential/handlers/discord/DiscordIntegration.access$getIpc$p:()Lgg/essential/lib/kdiscordipc/KDiscordIPC;
        //   156: getstatic       gg/essential/lib/kdiscordipc/core/event/DiscordEvent.ActivityInvite:Lgg/essential/lib/kdiscordipc/core/event/DiscordEvent;
        //   159: aload_0         /* this */
        //   160: checkcast       Lkotlin/coroutines/Continuation;
        //   163: aload_0         /* this */
        //   164: iconst_3       
        //   165: putfield        gg/essential/handlers/discord/DiscordIntegration$initialize$2.label:I
        //   168: invokevirtual   gg/essential/lib/kdiscordipc/KDiscordIPC.subscribe:(Lgg/essential/lib/kdiscordipc/core/event/DiscordEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        //   171: aload           8
        //   173: if_acmpne       183
        //   176: aload           8
        //   178: areturn        
        //   179: aload_1         /* $result */
        //   180: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        //   183: invokestatic    gg/essential/handlers/discord/DiscordIntegration.access$getIpc$p:()Lgg/essential/lib/kdiscordipc/KDiscordIPC;
        //   186: getstatic       gg/essential/lib/kdiscordipc/core/event/DiscordEvent.ActivitySpectate:Lgg/essential/lib/kdiscordipc/core/event/DiscordEvent;
        //   189: aload_0         /* this */
        //   190: checkcast       Lkotlin/coroutines/Continuation;
        //   193: aload_0         /* this */
        //   194: iconst_4       
        //   195: putfield        gg/essential/handlers/discord/DiscordIntegration$initialize$2.label:I
        //   198: invokevirtual   gg/essential/lib/kdiscordipc/KDiscordIPC.subscribe:(Lgg/essential/lib/kdiscordipc/core/event/DiscordEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        //   201: aload           8
        //   203: if_acmpne       213
        //   206: aload           8
        //   208: areturn        
        //   209: aload_1         /* $result */
        //   210: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        //   213: invokestatic    gg/essential/handlers/discord/DiscordIntegration.access$getIpc$p:()Lgg/essential/lib/kdiscordipc/KDiscordIPC;
        //   216: astore_3       
        //   217: new             Lgg/essential/handlers/discord/DiscordIntegration$initialize$2$1;
        //   220: dup            
        //   221: aconst_null    
        //   222: invokespecial   gg/essential/handlers/discord/DiscordIntegration$initialize$2$1.<init>:(Lkotlin/coroutines/Continuation;)V
        //   225: checkcast       Lkotlin/jvm/functions/Function2;
        //   228: astore          consumer$iv
        //   230: aload_3         /* this_$iv */
        //   231: invokevirtual   gg/essential/lib/kdiscordipc/KDiscordIPC.getEvents:()Lkotlinx/coroutines/flow/SharedFlow;
        //   234: checkcast       Lkotlinx/coroutines/flow/Flow;
        //   237: astore          $this$filterIsInstance$iv$iv
        //   239: aload           $this$filterIsInstance$iv$iv
        //   241: astore          $this$filter$iv$iv$iv
        //   243: aload           $this$filter$iv$iv$iv
        //   245: astore          $this$unsafeTransform$iv$iv$iv$iv
        //   247: new             Lgg/essential/handlers/discord/DiscordIntegration$initialize$2$invokeSuspend$$inlined$onEvent$1;
        //   250: dup            
        //   251: aload           $this$unsafeTransform$iv$iv$iv$iv
        //   253: invokespecial   gg/essential/handlers/discord/DiscordIntegration$initialize$2$invokeSuspend$$inlined$onEvent$1.<init>:(Lkotlinx/coroutines/flow/Flow;)V
        //   256: checkcast       Lkotlinx/coroutines/flow/Flow;
        //   259: new             Lgg/essential/handlers/discord/DiscordIntegration$initialize$2$invokeSuspend$$inlined$onEvent$2;
        //   262: dup            
        //   263: aload_3         /* this_$iv */
        //   264: aload           consumer$iv
        //   266: aconst_null    
        //   267: invokespecial   gg/essential/handlers/discord/DiscordIntegration$initialize$2$invokeSuspend$$inlined$onEvent$2.<init>:(Lgg/essential/lib/kdiscordipc/KDiscordIPC;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
        //   270: checkcast       Lkotlin/jvm/functions/Function2;
        //   273: invokestatic    kotlinx/coroutines/flow/FlowKt.onEach:(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;
        //   276: aload_3         /* this_$iv */
        //   277: invokevirtual   gg/essential/lib/kdiscordipc/KDiscordIPC.getScope:()Lkotlinx/coroutines/CoroutineScope;
        //   280: invokestatic    kotlinx/coroutines/flow/FlowKt.launchIn:(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/Job;
        //   283: pop            
        //   284: invokestatic    gg/essential/handlers/discord/DiscordIntegration.access$getIpc$p:()Lgg/essential/lib/kdiscordipc/KDiscordIPC;
        //   287: astore_3       
        //   288: new             Lgg/essential/handlers/discord/DiscordIntegration$initialize$2$2;
        //   291: dup            
        //   292: aconst_null    
        //   293: invokespecial   gg/essential/handlers/discord/DiscordIntegration$initialize$2$2.<init>:(Lkotlin/coroutines/Continuation;)V
        //   296: checkcast       Lkotlin/jvm/functions/Function2;
        //   299: astore          consumer$iv
        //   301: aload_3         /* this_$iv */
        //   302: invokevirtual   gg/essential/lib/kdiscordipc/KDiscordIPC.getEvents:()Lkotlinx/coroutines/flow/SharedFlow;
        //   305: checkcast       Lkotlinx/coroutines/flow/Flow;
        //   308: astore          $this$filterIsInstance$iv$iv
        //   310: aload           $this$filterIsInstance$iv$iv
        //   312: astore          $this$filter$iv$iv$iv
        //   314: aload           $this$filter$iv$iv$iv
        //   316: astore          $this$unsafeTransform$iv$iv$iv$iv
        //   318: new             Lgg/essential/handlers/discord/DiscordIntegration$initialize$2$invokeSuspend$$inlined$onEvent$3;
        //   321: dup            
        //   322: aload           $this$unsafeTransform$iv$iv$iv$iv
        //   324: invokespecial   gg/essential/handlers/discord/DiscordIntegration$initialize$2$invokeSuspend$$inlined$onEvent$3.<init>:(Lkotlinx/coroutines/flow/Flow;)V
        //   327: checkcast       Lkotlinx/coroutines/flow/Flow;
        //   330: new             Lgg/essential/handlers/discord/DiscordIntegration$initialize$2$invokeSuspend$$inlined$onEvent$4;
        //   333: dup            
        //   334: aload_3         /* this_$iv */
        //   335: aload           consumer$iv
        //   337: aconst_null    
        //   338: invokespecial   gg/essential/handlers/discord/DiscordIntegration$initialize$2$invokeSuspend$$inlined$onEvent$4.<init>:(Lgg/essential/lib/kdiscordipc/KDiscordIPC;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
        //   341: checkcast       Lkotlin/jvm/functions/Function2;
        //   344: invokestatic    kotlinx/coroutines/flow/FlowKt.onEach:(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;
        //   347: aload_3         /* this_$iv */
        //   348: invokevirtual   gg/essential/lib/kdiscordipc/KDiscordIPC.getScope:()Lkotlinx/coroutines/CoroutineScope;
        //   351: invokestatic    kotlinx/coroutines/flow/FlowKt.launchIn:(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/Job;
        //   354: pop            
        //   355: getstatic       gg/essential/handlers/discord/DiscordIntegration.INSTANCE:Lgg/essential/handlers/discord/DiscordIntegration;
        //   358: aload_0         /* this */
        //   359: checkcast       Lkotlin/coroutines/Continuation;
        //   362: aload_0         /* this */
        //   363: iconst_5       
        //   364: putfield        gg/essential/handlers/discord/DiscordIntegration$initialize$2.label:I
        //   367: invokestatic    gg/essential/handlers/discord/DiscordIntegration.access$publishActivityUpdate:(Lgg/essential/handlers/discord/DiscordIntegration;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        //   370: aload           8
        //   372: if_acmpne       382
        //   375: aload           8
        //   377: areturn        
        //   378: aload_1         /* $result */
        //   379: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        //   382: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   385: areturn        
        //   386: new             Ljava/lang/IllegalStateException;
        //   389: dup            
        //   390: ldc             "call to 'resume' before 'invoke' with coroutine"
        //   392: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   395: athrow         
        //    MethodParameters:
        //  Name     Flags  
        //  -------  -----
        //  $result  
        //    StackMapTable: 00 0C FF 00 30 00 09 07 00 02 07 00 4B 00 00 00 00 00 00 07 00 4B 00 00 FB 00 46 FF 00 03 00 09 07 00 02 00 00 00 00 00 00 00 07 00 4B 00 00 FF 00 19 00 09 07 00 02 07 00 4B 00 00 00 00 00 00 07 00 4B 00 00 FF 00 03 00 09 07 00 02 00 00 00 00 00 00 00 07 00 4B 00 00 FF 00 19 00 09 07 00 02 07 00 4B 00 00 00 00 00 00 07 00 4B 00 00 FF 00 03 00 09 07 00 02 00 00 00 00 00 00 00 07 00 4B 00 00 FF 00 19 00 09 07 00 02 07 00 4B 00 00 00 00 00 00 07 00 4B 00 00 FF 00 03 00 09 07 00 02 00 00 00 00 00 00 00 07 00 4B 00 00 FF 00 A4 00 02 00 07 00 4B 00 00 F9 00 03 03
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final Continuation<Unit> create(@Nullable final Object value, @NotNull final Continuation<?> $completion) {
        final DiscordIntegration$initialize$2 discordIntegration$initialize$2 = new DiscordIntegration$initialize$2((Continuation)$completion);
        discordIntegration$initialize$2.L$0 = value;
        return (Continuation<Unit>)discordIntegration$initialize$2;
    }
    
    @Nullable
    public final Object invoke(@NotNull final ReadyEvent p1, @Nullable final Continuation<? super Unit> p2) {
        return ((DiscordIntegration$initialize$2)this.create((Object)p1, (Continuation)p2)).invokeSuspend((Object)Unit.INSTANCE);
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        return this.invoke((ReadyEvent)p1, (Continuation)p2);
    }
}