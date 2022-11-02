package gg.essential.lib.kdiscordipc.manager.impl;

import gg.essential.lib.kdiscordipc.manager.*;
import kotlin.*;
import gg.essential.lib.kdiscordipc.*;
import kotlin.jvm.internal.*;
import kotlin.coroutines.*;
import java.util.*;
import gg.essential.lib.kdiscordipc.data.relationship.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@\u00f8\u0001\u0000¢\u0006\u0002\u0010\nR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b" }, d2 = { "Lgg/essential/lib/kdiscordipc/manager/impl/RelationshipManager;", "Lgg/essential/lib/kdiscordipc/manager/Manager;", "ipc", "Lgg/essential/lib/kdiscordipc/KDiscordIPC;", "(Ldev/cbyrne/kdiscordipc/KDiscordIPC;)V", "getIpc", "()Ldev/cbyrne/kdiscordipc/KDiscordIPC;", "getRelationships", "", "Lgg/essential/lib/kdiscordipc/data/relationship/Relationship;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "KDiscordIPC" })
public final class RelationshipManager extends Manager
{
    @NotNull
    private final KDiscordIPC ipc;
    
    public RelationshipManager(@NotNull final KDiscordIPC ipc) {
        Intrinsics.checkNotNullParameter((Object)ipc, "ipc");
        super();
        this.ipc = ipc;
    }
    
    @NotNull
    public KDiscordIPC getIpc() {
        return this.ipc;
    }
    
    @Nullable
    public final Object getRelationships(@NotNull final Continuation<? super List<Relationship>> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: instanceof      Lgg/essential/lib/kdiscordipc/manager/impl/RelationshipManager$getRelationships$1;
        //     4: ifeq            39
        //     7: aload_1        
        //     8: checkcast       Lgg/essential/lib/kdiscordipc/manager/impl/RelationshipManager$getRelationships$1;
        //    11: astore          10
        //    13: aload           10
        //    15: getfield        gg/essential/lib/kdiscordipc/manager/impl/RelationshipManager$getRelationships$1.label:I
        //    18: ldc             -2147483648
        //    20: iand           
        //    21: ifeq            39
        //    24: aload           10
        //    26: dup            
        //    27: getfield        gg/essential/lib/kdiscordipc/manager/impl/RelationshipManager$getRelationships$1.label:I
        //    30: ldc             -2147483648
        //    32: isub           
        //    33: putfield        gg/essential/lib/kdiscordipc/manager/impl/RelationshipManager$getRelationships$1.label:I
        //    36: goto            50
        //    39: new             Lgg/essential/lib/kdiscordipc/manager/impl/RelationshipManager$getRelationships$1;
        //    42: dup            
        //    43: aload_0        
        //    44: aload_1        
        //    45: invokespecial   gg/essential/lib/kdiscordipc/manager/impl/RelationshipManager$getRelationships$1.<init>:(Lgg/essential/lib/kdiscordipc/manager/impl/RelationshipManager;Lkotlin/coroutines/Continuation;)V
        //    48: astore          $continuation
        //    50: aload           $continuation
        //    52: getfield        gg/essential/lib/kdiscordipc/manager/impl/RelationshipManager$getRelationships$1.result:Ljava/lang/Object;
        //    55: astore          $result
        //    57: invokestatic    kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
        //    60: astore          11
        //    62: aload           $continuation
        //    64: getfield        gg/essential/lib/kdiscordipc/manager/impl/RelationshipManager$getRelationships$1.label:I
        //    67: tableswitch {
        //                0: 92
        //                1: 171
        //                2: 269
        //          default: 288
        //        }
        //    92: aload           $result
        //    94: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        //    97: aload_0         /* this */
        //    98: invokevirtual   gg/essential/lib/kdiscordipc/manager/impl/RelationshipManager.getIpc:()Lgg/essential/lib/kdiscordipc/KDiscordIPC;
        //   101: astore_3       
        //   102: new             Lgg/essential/lib/kdiscordipc/core/packet/outbound/impl/GetRelationshipsPacket;
        //   105: dup            
        //   106: iconst_0       
        //   107: invokespecial   gg/essential/lib/kdiscordipc/core/packet/outbound/impl/GetRelationshipsPacket.<init>:(B)V
        //   110: checkcast       Lgg/essential/lib/kdiscordipc/core/packet/outbound/OutboundPacket;
        //   113: astore          packet$iv
        //   115: invokestatic    java/util/UUID.randomUUID:()Ljava/util/UUID;
        //   118: invokevirtual   java/util/UUID.toString:()Ljava/lang/String;
        //   121: astore          5
        //   123: aload           5
        //   125: ldc             "randomUUID().toString()"
        //   127: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   130: aload           5
        //   132: astore          nonce$iv
        //   134: aload_3         /* this_$iv */
        //   135: aload           packet$iv
        //   137: aload           nonce$iv
        //   139: aload           $continuation
        //   141: aload           $continuation
        //   143: aload_3         /* this_$iv */
        //   144: putfield        gg/essential/lib/kdiscordipc/manager/impl/RelationshipManager$getRelationships$1.L$0:Ljava/lang/Object;
        //   147: aload           $continuation
        //   149: aload           nonce$iv
        //   151: putfield        gg/essential/lib/kdiscordipc/manager/impl/RelationshipManager$getRelationships$1.L$1:Ljava/lang/Object;
        //   154: aload           $continuation
        //   156: iconst_1       
        //   157: putfield        gg/essential/lib/kdiscordipc/manager/impl/RelationshipManager$getRelationships$1.label:I
        //   160: invokestatic    gg/essential/lib/kdiscordipc/KDiscordIPC.access$writePacket:(Lgg/essential/lib/kdiscordipc/KDiscordIPC;Lgg/essential/lib/kdiscordipc/core/packet/outbound/OutboundPacket;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        //   163: aload           11
        //   165: if_acmpne       195
        //   168: aload           11
        //   170: areturn        
        //   171: aload           $continuation
        //   173: getfield        gg/essential/lib/kdiscordipc/manager/impl/RelationshipManager$getRelationships$1.L$1:Ljava/lang/Object;
        //   176: checkcast       Ljava/lang/String;
        //   179: astore          nonce$iv
        //   181: aload           $continuation
        //   183: getfield        gg/essential/lib/kdiscordipc/manager/impl/RelationshipManager$getRelationships$1.L$0:Ljava/lang/Object;
        //   186: checkcast       Lgg/essential/lib/kdiscordipc/KDiscordIPC;
        //   189: astore_3        /* this_$iv */
        //   190: aload           $result
        //   192: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        //   195: aload_3         /* this_$iv */
        //   196: invokevirtual   gg/essential/lib/kdiscordipc/KDiscordIPC.getPackets:()Lkotlinx/coroutines/flow/SharedFlow;
        //   199: checkcast       Lkotlinx/coroutines/flow/Flow;
        //   202: astore          $this$filterIsInstance$iv$iv
        //   204: aload           $this$filterIsInstance$iv$iv
        //   206: astore          $this$filter$iv$iv$iv
        //   208: aload           $this$filter$iv$iv$iv
        //   210: astore          $this$unsafeTransform$iv$iv$iv$iv
        //   212: new             Lgg/essential/lib/kdiscordipc/manager/impl/RelationshipManager$getRelationships$$inlined$sendPacket$KDiscordIPC$1;
        //   215: dup            
        //   216: aload           $this$unsafeTransform$iv$iv$iv$iv
        //   218: invokespecial   gg/essential/lib/kdiscordipc/manager/impl/RelationshipManager$getRelationships$$inlined$sendPacket$KDiscordIPC$1.<init>:(Lkotlinx/coroutines/flow/Flow;)V
        //   221: checkcast       Lkotlinx/coroutines/flow/Flow;
        //   224: new             Lgg/essential/lib/kdiscordipc/manager/impl/RelationshipManager$getRelationships$$inlined$sendPacket$KDiscordIPC$2;
        //   227: dup            
        //   228: aload           nonce$iv
        //   230: aconst_null    
        //   231: invokespecial   gg/essential/lib/kdiscordipc/manager/impl/RelationshipManager$getRelationships$$inlined$sendPacket$KDiscordIPC$2.<init>:(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V
        //   234: checkcast       Lkotlin/jvm/functions/Function2;
        //   237: aload           $continuation
        //   239: aload           $continuation
        //   241: aconst_null    
        //   242: putfield        gg/essential/lib/kdiscordipc/manager/impl/RelationshipManager$getRelationships$1.L$0:Ljava/lang/Object;
        //   245: aload           $continuation
        //   247: aconst_null    
        //   248: putfield        gg/essential/lib/kdiscordipc/manager/impl/RelationshipManager$getRelationships$1.L$1:Ljava/lang/Object;
        //   251: aload           $continuation
        //   253: iconst_2       
        //   254: putfield        gg/essential/lib/kdiscordipc/manager/impl/RelationshipManager$getRelationships$1.label:I
        //   257: invokestatic    kotlinx/coroutines/flow/FlowKt.first:(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
        //   260: dup            
        //   261: aload           11
        //   263: if_acmpne       276
        //   266: aload           11
        //   268: areturn        
        //   269: aload           $result
        //   271: invokestatic    kotlin/ResultKt.throwOnFailure:(Ljava/lang/Object;)V
        //   274: aload           $result
        //   276: checkcast       Lgg/essential/lib/kdiscordipc/core/packet/inbound/impl/GetRelationshipsPacket;
        //   279: astore_2        /* response */
        //   280: aload_2         /* response */
        //   281: invokevirtual   gg/essential/lib/kdiscordipc/core/packet/inbound/impl/GetRelationshipsPacket.getData:()Lgg/essential/lib/kdiscordipc/core/packet/inbound/impl/GetRelationshipsPacket$Data;
        //   284: invokevirtual   gg/essential/lib/kdiscordipc/core/packet/inbound/impl/GetRelationshipsPacket$Data.getRelationships:()Ljava/util/List;
        //   287: areturn        
        //   288: new             Ljava/lang/IllegalStateException;
        //   291: dup            
        //   292: ldc             "call to 'resume' before 'invoke' with coroutine"
        //   294: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //   297: athrow         
        //    Signature:
        //  (Lkotlin/coroutines/Continuation<-Ljava/util/List<Lgg/essential/lib/kdiscordipc/data/relationship/Relationship;>;>;)Ljava/lang/Object;
        //    StackMapTable: 00 08 27 FF 00 0A 00 0B 07 00 02 00 00 00 00 00 00 00 00 00 07 00 1E 00 00 FF 00 29 00 0C 07 00 02 00 00 00 00 00 00 00 00 07 00 45 07 00 1E 07 00 45 00 00 FF 00 4E 00 0C 00 00 00 00 00 00 00 00 00 07 00 45 07 00 1E 07 00 45 00 00 FF 00 17 00 0C 00 00 00 07 00 6B 00 00 07 00 71 00 00 00 07 00 1E 07 00 45 00 00 FF 00 49 00 0A 00 00 00 00 00 00 00 00 00 07 00 45 00 00 FF 00 06 00 00 00 01 07 00 45 0B
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
