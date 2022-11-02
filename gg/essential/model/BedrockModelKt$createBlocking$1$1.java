package gg.essential.model;

import kotlin.jvm.functions.*;
import gg.essential.mod.*;
import kotlin.coroutines.*;
import kotlin.coroutines.jvm.internal.*;
import gg.essential.network.connectionmanager.cosmetics.*;
import kotlin.coroutines.intrinsics.*;
import kotlin.jvm.internal.*;
import kotlinx.coroutines.future.*;
import java.util.concurrent.*;
import org.jetbrains.annotations.*;
import kotlin.*;

@DebugMetadata(f = "bedrockModel.kt", l = { 12 }, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "gg.essential.model.BedrockModelKt$createBlocking$1$1")
@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\f
                                                   \u0000
                                                   \u0002\u0010\u0012
                                                   \u0000
                                                   \u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@""" }, d2 = { "<anonymous>", "", "asset", "Lgg/essential/mod/EssentialAsset;" })
static final class BedrockModelKt$createBlocking$1$1 extends SuspendLambda implements Function2<EssentialAsset, Continuation<? super byte[]>, Object> {
    int label;
    /* synthetic */ Object L$0;
    final /* synthetic */ CosmeticsManager $cosmeticsManager;
    
    BedrockModelKt$createBlocking$1$1(final CosmeticsManager $cosmeticsManager, final Continuation<? super BedrockModelKt$createBlocking$1$1> $completion) {
        this.$cosmeticsManager = $cosmeticsManager;
        super(2, (Continuation)$completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull final Object $result) {
        final Object coroutine_SUSPENDED = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Object await = null;
        Object o = null;
        switch (this.label) {
            case 0: {
                ResultKt.throwOnFailure($result);
                final EssentialAsset asset = (EssentialAsset)this.L$0;
                final CompletableFuture<byte[]> assetBytes = this.$cosmeticsManager.getAssetBytes(asset);
                Intrinsics.checkNotNullExpressionValue((Object)assetBytes, "cosmeticsManager.getAssetBytes(asset)");
                final CompletionStage completionStage = assetBytes;
                final Continuation continuation = (Continuation)this;
                this.label = 1;
                if ((o = (await = FutureKt.await(completionStage, continuation))) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure($result);
                await = $result;
                o = $result;
                break;
            }
            default: {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        Intrinsics.checkNotNullExpressionValue(o, "cosmeticsManager.getAssetBytes(asset).await()");
        return await;
    }
    
    @NotNull
    public final Continuation<Unit> create(@Nullable final Object value, @NotNull final Continuation<?> $completion) {
        final BedrockModelKt$createBlocking$1$1 bedrockModelKt$createBlocking$1$1 = new BedrockModelKt$createBlocking$1$1(this.$cosmeticsManager, (Continuation)$completion);
        bedrockModelKt$createBlocking$1$1.L$0 = value;
        return (Continuation<Unit>)bedrockModelKt$createBlocking$1$1;
    }
    
    @Nullable
    public final Object invoke(@NotNull final EssentialAsset p1, @Nullable final Continuation<? super byte[]> p2) {
        return ((BedrockModelKt$createBlocking$1$1)this.create((Object)p1, (Continuation)p2)).invokeSuspend((Object)Unit.INSTANCE);
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        return this.invoke((EssentialAsset)p1, (Continuation)p2);
    }
}