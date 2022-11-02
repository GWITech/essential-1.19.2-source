package gg.essential.lib.kdiscordipc.manager.impl;

import gg.essential.lib.kdiscordipc.manager.*;
import kotlin.*;
import gg.essential.lib.kdiscordipc.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0019\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0086@\u00f8\u0001\u0000¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0011H\u0090@\u00f8\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0014\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000¢\u0006\u0002\u0010\u0013R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015" }, d2 = { "Lgg/essential/lib/kdiscordipc/manager/impl/UserManager;", "Lgg/essential/lib/kdiscordipc/manager/Manager;", "ipc", "Lgg/essential/lib/kdiscordipc/KDiscordIPC;", "(Ldev/cbyrne/kdiscordipc/KDiscordIPC;)V", "<set-?>", "Lgg/essential/lib/kdiscordipc/data/user/User;", "currentUser", "getCurrentUser", "()Ldev/cbyrne/kdiscordipc/data/user/User;", "getIpc", "()Ldev/cbyrne/kdiscordipc/KDiscordIPC;", "getUser", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "init", "", "init$KDiscordIPC", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscribeToUserUpdates", "KDiscordIPC" })
public final class UserManager extends Manager
{
    @NotNull
    private final KDiscordIPC ipc;
    
    public UserManager(@NotNull final KDiscordIPC ipc) {
        Intrinsics.checkNotNullParameter((Object)ipc, "ipc");
        super();
        this.ipc = ipc;
    }
    
    @NotNull
    public KDiscordIPC getIpc() {
        return this.ipc;
    }
    
    @Nullable
    @Override
    public Object init$KDiscordIPC$72b156b5() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   gg/essential/lib/kdiscordipc/manager/impl/UserManager.getIpc:()Lgg/essential/lib/kdiscordipc/KDiscordIPC;
        //     4: astore_1       
        //     5: new             Lgg/essential/lib/kdiscordipc/manager/impl/UserManager$init$2;
        //     8: dup            
        //     9: aload_0         /* this */
        //    10: aconst_null    
        //    11: invokespecial   gg/essential/lib/kdiscordipc/manager/impl/UserManager$init$2.<init>:(Lgg/essential/lib/kdiscordipc/manager/impl/UserManager;Lkotlin/coroutines/Continuation;)V
        //    14: checkcast       Lkotlin/jvm/functions/Function2;
        //    17: astore_2        /* consumer$iv */
        //    18: aload_1         /* this_$iv */
        //    19: invokevirtual   gg/essential/lib/kdiscordipc/KDiscordIPC.getEvents:()Lkotlinx/coroutines/flow/SharedFlow;
        //    22: checkcast       Lkotlinx/coroutines/flow/Flow;
        //    25: astore_3        /* $this$filterIsInstance$iv$iv */
        //    26: aload_3         /* $this$filterIsInstance$iv$iv */
        //    27: astore          $this$filter$iv$iv$iv
        //    29: aload           $this$filter$iv$iv$iv
        //    31: astore          $this$unsafeTransform$iv$iv$iv$iv
        //    33: new             Lgg/essential/lib/kdiscordipc/manager/impl/UserManager$init$$inlined$onEvent$1;
        //    36: dup            
        //    37: aload           $this$unsafeTransform$iv$iv$iv$iv
        //    39: invokespecial   gg/essential/lib/kdiscordipc/manager/impl/UserManager$init$$inlined$onEvent$1.<init>:(Lkotlinx/coroutines/flow/Flow;)V
        //    42: checkcast       Lkotlinx/coroutines/flow/Flow;
        //    45: new             Lgg/essential/lib/kdiscordipc/manager/impl/UserManager$init$$inlined$onEvent$2;
        //    48: dup            
        //    49: aload_1         /* this_$iv */
        //    50: aload_2         /* consumer$iv */
        //    51: aconst_null    
        //    52: invokespecial   gg/essential/lib/kdiscordipc/manager/impl/UserManager$init$$inlined$onEvent$2.<init>:(Lgg/essential/lib/kdiscordipc/KDiscordIPC;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V
        //    55: checkcast       Lkotlin/jvm/functions/Function2;
        //    58: invokestatic    kotlinx/coroutines/flow/FlowKt.onEach:(Lkotlinx/coroutines/flow/Flow;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/flow/Flow;
        //    61: aload_1         /* this_$iv */
        //    62: invokevirtual   gg/essential/lib/kdiscordipc/KDiscordIPC.getScope:()Lkotlinx/coroutines/CoroutineScope;
        //    65: invokestatic    kotlinx/coroutines/flow/FlowKt.launchIn:(Lkotlinx/coroutines/flow/Flow;Lkotlinx/coroutines/CoroutineScope;)Lkotlinx/coroutines/Job;
        //    68: dup            
        //    69: invokestatic    kotlin/coroutines/intrinsics/IntrinsicsKt.getCOROUTINE_SUSPENDED:()Ljava/lang/Object;
        //    72: if_acmpne       76
        //    75: areturn        
        //    76: pop            
        //    77: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //    80: areturn        
        //    Signature:
        //  ()Ljava/lang/Object;
        //    StackMapTable: 00 01 FF 00 4C 00 00 00 01 07 00 69
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
}
