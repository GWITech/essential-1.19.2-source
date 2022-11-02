package gg.essential.handlers.discord;

import kotlin.jvm.functions.*;
import gg.essential.lib.kdiscordipc.core.event.impl.*;
import kotlin.coroutines.*;
import kotlin.coroutines.jvm.internal.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@DebugMetadata(f = "DiscordIntegration.kt", l = { 161 }, i = { 0 }, s = { "L$0" }, n = { "$this$on" }, m = "invokeSuspend", c = "gg.essential.handlers.discord.DiscordIntegration$initialize$2$2")
@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@""" }, d2 = { "<anonymous>", "", "Lgg/essential/lib/kdiscordipc/core/event/impl/ActivityInviteEvent;" })
static final class DiscordIntegration$initialize$2$2 extends SuspendLambda implements Function2<ActivityInviteEvent, Continuation<? super Unit>, Object> {
    int label;
    private /* synthetic */ Object L$0;
    
    DiscordIntegration$initialize$2$2(final Continuation<? super DiscordIntegration$initialize$2$2> $completion) {
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
        //     6: getfield        gg/essential/handlers/discord/DiscordIntegration$initialize$2$2.label:I
        //     9: tableswitch {
        //                0: 32
        //                1: 76
        //          default: 254
        //        }
        //    32: aload_1        
        //    33: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        //    36: aload_0         /* this */
        //    37: getfield        gg/essential/handlers/discord/DiscordIntegration$initialize$2$2.L$0:Ljava/lang/Object;
        //    40: checkcast       Lgg/essential/lib/kdiscordipc/core/event/impl/ActivityInviteEvent;
        //    43: astore_2        /* $this$on */
        //    44: invokestatic    gg/essential/handlers/discord/DiscordIntegration.access$getIpc$p:()Lgg/essential/lib/kdiscordipc/KDiscordIPC;
        //    47: invokevirtual   gg/essential/lib/kdiscordipc/KDiscordIPC.getRelationshipManager:()Lgg/essential/lib/kdiscordipc/manager/impl/RelationshipManager;
        //    50: aload_0         /* this */
        //    51: checkcast       Lkotlin/coroutines/Continuation;
        //    54: aload_0         /* this */
        //    55: aload_2         /* $this$on */
        //    56: putfield        gg/essential/handlers/discord/DiscordIntegration$initialize$2$2.L$0:Ljava/lang/Object;
        //    59: aload_0         /* this */
        //    60: iconst_1       
        //    61: putfield        gg/essential/handlers/discord/DiscordIntegration$initialize$2$2.label:I
        //    64: invokevirtual   gg/essential/lib/kdiscordipc/manager/impl/RelationshipManager.getRelationships:(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        //    67: dup            
        //    68: aload           8
        //    70: if_acmpne       89
        //    73: aload           8
        //    75: areturn        
        //    76: aload_0         /* this */
        //    77: getfield        gg/essential/handlers/discord/DiscordIntegration$initialize$2$2.L$0:Ljava/lang/Object;
        //    80: checkcast       Lgg/essential/lib/kdiscordipc/core/event/impl/ActivityInviteEvent;
        //    83: astore_2       
        //    84: aload_1         /* $result */
        //    85: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        //    88: aload_1         /* $result */
        //    89: checkcast       Ljava/util/List;
        //    92: astore_3        /* relationships */
        //    93: aload_3         /* relationships */
        //    94: checkcast       Ljava/lang/Iterable;
        //    97: astore          4
        //    99: aload           4
        //   101: instanceof      Ljava/util/Collection;
        //   104: ifeq            124
        //   107: aload           4
        //   109: checkcast       Ljava/util/Collection;
        //   112: invokeinterface java/util/Collection.isEmpty:()Z
        //   117: ifeq            124
        //   120: iconst_0       
        //   121: goto            188
        //   124: aload           $this$any$iv
        //   126: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   131: astore          5
        //   133: aload           5
        //   135: invokeinterface java/util/Iterator.hasNext:()Z
        //   140: ifeq            187
        //   143: aload           5
        //   145: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   150: astore          element$iv
        //   152: aload           element$iv
        //   154: checkcast       Lgg/essential/lib/kdiscordipc/data/relationship/Relationship;
        //   157: astore          it
        //   159: aload           it
        //   161: invokevirtual   gg/essential/lib/kdiscordipc/data/relationship/Relationship.getUser:()Lgg/essential/lib/kdiscordipc/data/user/User;
        //   164: invokevirtual   gg/essential/lib/kdiscordipc/data/user/User.getId:()Ljava/lang/String;
        //   167: aload_2        
        //   168: invokevirtual   gg/essential/lib/kdiscordipc/core/event/impl/ActivityInviteEvent.getData:()Lgg/essential/lib/kdiscordipc/core/event/data/ActivityInviteEventData;
        //   171: invokevirtual   gg/essential/lib/kdiscordipc/core/event/data/ActivityInviteEventData.getUser:()Lgg/essential/lib/kdiscordipc/data/user/User;
        //   174: invokevirtual   gg/essential/lib/kdiscordipc/data/user/User.getId:()Ljava/lang/String;
        //   177: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   180: ifeq            133
        //   183: iconst_1       
        //   184: goto            188
        //   187: iconst_0       
        //   188: ifeq            250
        //   191: invokestatic    gg/essential/Essential.getInstance:()Lgg/essential/Essential;
        //   194: invokevirtual   gg/essential/Essential.notifications:()Lgg/essential/api/gui/Notifications;
        //   197: dup            
        //   198: ldc             "getInstance().notifications()"
        //   200: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   203: aload_2         /* $this$on */
        //   204: invokevirtual   gg/essential/lib/kdiscordipc/core/event/impl/ActivityInviteEvent.getData:()Lgg/essential/lib/kdiscordipc/core/event/data/ActivityInviteEventData;
        //   207: invokevirtual   gg/essential/lib/kdiscordipc/core/event/data/ActivityInviteEventData.getUser:()Lgg/essential/lib/kdiscordipc/data/user/User;
        //   210: invokevirtual   gg/essential/lib/kdiscordipc/data/user/User.getUsername:()Ljava/lang/String;
        //   213: aload_2         /* $this$on */
        //   214: invokevirtual   gg/essential/lib/kdiscordipc/core/event/impl/ActivityInviteEvent.getData:()Lgg/essential/lib/kdiscordipc/core/event/data/ActivityInviteEventData;
        //   217: invokevirtual   gg/essential/lib/kdiscordipc/core/event/data/ActivityInviteEventData.getUser:()Lgg/essential/lib/kdiscordipc/data/user/User;
        //   220: invokevirtual   gg/essential/lib/kdiscordipc/data/user/User.getDiscriminator:()Ljava/lang/String;
        //   223: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   228: ldc             "Click here to join their world."
        //   230: fconst_0       
        //   231: new             Lgg/essential/handlers/discord/DiscordIntegration$initialize$2$2$2;
        //   234: dup            
        //   235: aload_2         /* $this$on */
        //   236: invokespecial   gg/essential/handlers/discord/DiscordIntegration$initialize$2$2$2.<init>:(Lgg/essential/lib/kdiscordipc/core/event/impl/ActivityInviteEvent;)V
        //   239: checkcast       Lkotlin/jvm/functions/Function0;
        //   242: aconst_null    
        //   243: aconst_null    
        //   244: bipush          52
        //   246: aconst_null    
        //   247: invokestatic    gg/essential/api/gui/Notifications.push$default:(Lgg/essential/api/gui/Notifications;Ljava/lang/String;Ljava/lang/String;FLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
        //   250: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   253: areturn        
        //   254: new             Ljava/lang/IllegalStateException;
        //   257: dup            
        //   258: ldc             "call to 'resume' before 'invoke' with coroutine"
        //   260: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   263: athrow         
        //    MethodParameters:
        //  Name     Flags  
        //  -------  -----
        //  $result  
        //    StackMapTable: 00 09 FF 00 20 00 09 07 00 02 07 00 44 00 00 00 00 00 00 07 00 44 00 00 FF 00 2B 00 02 07 00 02 07 00 44 00 00 FF 00 0C 00 03 00 00 07 00 4E 00 01 07 00 44 FD 00 22 00 07 00 66 FF 00 08 00 06 00 00 07 00 4E 00 00 07 00 72 00 00 F8 00 35 40 01 F8 00 3D 03
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final Continuation<Unit> create(@Nullable final Object value, @NotNull final Continuation<?> $completion) {
        final DiscordIntegration$initialize$2$2 discordIntegration$initialize$2$2 = new DiscordIntegration$initialize$2$2((Continuation)$completion);
        discordIntegration$initialize$2$2.L$0 = value;
        return (Continuation<Unit>)discordIntegration$initialize$2$2;
    }
    
    @Nullable
    public final Object invoke(@NotNull final ActivityInviteEvent p1, @Nullable final Continuation<? super Unit> p2) {
        return ((DiscordIntegration$initialize$2$2)this.create((Object)p1, (Continuation)p2)).invokeSuspend((Object)Unit.INSTANCE);
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        return this.invoke((ActivityInviteEvent)p1, (Continuation)p2);
    }
}