package gg.essential.model;

import kotlin.coroutines.jvm.internal.*;
import kotlin.*;
import kotlin.coroutines.*;
import gg.essential.model.backend.*;
import gg.essential.network.cosmetics.*;
import kotlin.jvm.functions.*;
import gg.essential.mod.*;
import org.jetbrains.annotations.*;

@DebugMetadata(f = "BedrockModel.kt", l = { 317, 318, 319, 319 }, i = { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3 }, s = { "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2" }, n = { "renderBackend", "cosmetic", "getAssetBytes", "assets", "renderBackend", "cosmetic", "getAssetBytes", "modelFile", "assets", "cosmetic", "modelFile", "animationFile", "cosmetic", "modelFile", "animationFile" }, m = "create", c = "gg.essential.model.BedrockModel$Companion")
@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
static final class BedrockModel$Companion$create$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    /* synthetic */ Object result;
    final /* synthetic */ BedrockModel.Companion this$0;
    int label;
    
    BedrockModel$Companion$create$1(final BedrockModel.Companion this$0, final Continuation<? super BedrockModel$Companion$create$1> $completion) {
        this.this$0 = this$0;
        super((Continuation)$completion);
    }
    
    @Nullable
    public final Object invokeSuspend(@NotNull final Object $result) {
        this.result = $result;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.create(null, null, null, null, (Continuation<? super BedrockModel>)this);
    }
}