package gg.essential.model.util;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0000H&J(\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&J(\u0010\n\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH&¨\u0006\u000f" }, d2 = { "Lgg/essential/model/util/UVertexConsumer;", "", "endVertex", "norm", "stack", "Lgg/essential/model/util/UMatrixStack;", "x", "", "y", "z", "pos", "", "tex", "u", "v", "cosmetics" })
public interface UVertexConsumer
{
    @NotNull
    UVertexConsumer pos(@NotNull final UMatrixStack p0, final double p1, final double p2, final double p3);
    
    @NotNull
    UVertexConsumer tex(final double p0, final double p1);
    
    @NotNull
    UVertexConsumer norm(@NotNull final UMatrixStack p0, final float p1, final float p2, final float p3);
    
    @NotNull
    UVertexConsumer endVertex();
}
