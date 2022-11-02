package gg.essential.universal.shader;

import net.minecraft.client.gl.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\u0007
                                                   \u0002\u0010\u0002
                                                   \u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007B/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010	\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010
                                                   J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006""" }, d2 = { "Lgg/essential/universal/shader/BlendState$McBlendState;", "Lnet/minecraft/client/gl/GlBlendState;", "(Lgg/essential/universal/shader/BlendState;)V", "srcRgb", "", "dstRgb", "func", "(Lgg/essential/universal/shader/BlendState;III)V", "srcAlpha", "dstAlpha", "(Lgg/essential/universal/shader/BlendState;IIIII)V", "enable", "", "universalcraft" })
private final class McBlendState extends GlBlendState
{
    final /* synthetic */ BlendState this$0;
    
    public McBlendState(final BlendState this$0) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        this.this$0 = this$0;
        super();
    }
    
    public McBlendState(final BlendState this$0, final int srcRgb, final int dstRgb, final int func) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        this.this$0 = this$0;
        super(srcRgb, dstRgb, func);
    }
    
    public McBlendState(final BlendState this$0, final int srcRgb, final int dstRgb, final int srcAlpha, final int dstAlpha, final int func) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        this.this$0 = this$0;
        super(srcRgb, dstRgb, srcAlpha, dstAlpha, func);
    }
    
    public void enable() {
        super.enable();
        BlendState.access$applyState(this.this$0);
    }
}
