package gg.essential.model;

import kotlin.jvm.functions.*;
import kotlinx.coroutines.*;
import kotlin.coroutines.*;
import kotlin.coroutines.jvm.internal.*;
import gg.essential.network.cosmetics.*;
import kotlin.coroutines.intrinsics.*;
import gg.essential.*;
import kotlin.jvm.internal.*;
import gg.essential.model.backend.*;
import gg.essential.model.backend.minecraft.*;
import gg.essential.mod.*;
import gg.essential.network.connectionmanager.cosmetics.*;
import org.jetbrains.annotations.*;
import kotlin.*;

@DebugMetadata(f = "bedrockModel.kt", l = { 11 }, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "gg.essential.model.BedrockModelKt$createBlocking$1")
@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@""" }, d2 = { "<anonymous>", "Lgg/essential/model/BedrockModel;", "Lkotlinx/coroutines/CoroutineScope;" })
static final class BedrockModelKt$createBlocking$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super BedrockModel>, Object> {
    int label;
    final /* synthetic */ Cosmetic $cosmetic;
    final /* synthetic */ String $skinType;
    
    BedrockModelKt$createBlocking$1(final Cosmetic $cosmetic, final String $skinType, final Continuation<? super BedrockModelKt$createBlocking$1> $completion) {
        this.$cosmetic = $cosmetic;
        this.$skinType = $skinType;
        super(2, (Continuation)$completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull final Object $result) {
        final Object coroutine_SUSPENDED = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        Object create = null;
        switch (this.label) {
            case 0: {
                ResultKt.throwOnFailure($result);
                final CosmeticsManager cosmeticsManager2 = Essential.getInstance().getConnectionManager().getCosmeticsManager();
                Intrinsics.checkNotNullExpressionValue((Object)cosmeticsManager2, "getInstance().connectionManager.cosmeticsManager");
                final CosmeticsManager cosmeticsManager = cosmeticsManager2;
                final BedrockModel.Companion companion = BedrockModel.Companion;
                final RenderBackend renderBackend = MinecraftRenderBackend.INSTANCE;
                final Cosmetic $cosmetic = this.$cosmetic;
                final String $skinType = this.$skinType;
                final Function2 getAssetBytes = (Function2)new BedrockModelKt$createBlocking$1.BedrockModelKt$createBlocking$1$1(cosmeticsManager, (Continuation)null);
                final Continuation continuation = (Continuation)this;
                this.label = 1;
                if ((create = companion.create(renderBackend, $cosmetic, $skinType, (Function2<? super EssentialAsset, ? super Continuation<? super byte[]>, ?>)getAssetBytes, (Continuation<? super BedrockModel>)continuation)) == coroutine_SUSPENDED) {
                    return coroutine_SUSPENDED;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure($result);
                create = $result;
                break;
            }
            default: {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
        return create;
    }
    
    @NotNull
    public final Continuation<Unit> create(@Nullable final Object value, @NotNull final Continuation<?> $completion) {
        return (Continuation<Unit>)new BedrockModelKt$createBlocking$1(this.$cosmetic, this.$skinType, (Continuation)$completion);
    }
    
    @Nullable
    public final Object invoke(@NotNull final CoroutineScope p1, @Nullable final Continuation<? super BedrockModel> p2) {
        return ((BedrockModelKt$createBlocking$1)this.create((Object)p1, (Continuation)p2)).invokeSuspend((Object)Unit.INSTANCE);
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2) {
        return this.invoke((CoroutineScope)p1, (Continuation)p2);
    }
}