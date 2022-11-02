package gg.essential.model;

import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.model.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "vertexConsumer", "Lgg/essential/model/util/UVertexConsumer;", "invoke" })
static final class BedrockModel$render$1 extends Lambda implements Function1<UVertexConsumer, Unit> {
    final /* synthetic */ Bone $rootBone;
    final /* synthetic */ UMatrixStack $matrixStack;
    final /* synthetic */ RenderMetadata $metadata;
    final /* synthetic */ float $offset;
    
    BedrockModel$render$1(final Bone $rootBone, final UMatrixStack $matrixStack, final RenderMetadata $metadata, final float $offset) {
        this.$rootBone = $rootBone;
        this.$matrixStack = $matrixStack;
        this.$metadata = $metadata;
        this.$offset = $offset;
        super(1);
    }
    
    public final void invoke(@NotNull final UVertexConsumer vertexConsumer) {
        Intrinsics.checkNotNullParameter((Object)vertexConsumer, "vertexConsumer");
        this.$rootBone.render(this.$matrixStack, vertexConsumer, this.$metadata.getLight(), this.$metadata.getScale(), this.$offset);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((UVertexConsumer)p1);
        return Unit.INSTANCE;
    }
}