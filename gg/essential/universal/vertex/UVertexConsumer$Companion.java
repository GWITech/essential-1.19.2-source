package gg.essential.universal.vertex;

import kotlin.*;
import net.minecraft.client.render.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0018
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007""" }, d2 = { "Lgg/essential/universal/vertex/UVertexConsumer$Companion;", "", "()V", "of", "Lgg/essential/universal/vertex/UVertexConsumer;", "wrapped", "Lnet/minecraft/client/render/VertexConsumer;", "universalcraft" })
public static final class Companion
{
    static final /* synthetic */ Companion $$INSTANCE;
    
    private Companion() {
        super();
    }
    
    @JvmStatic
    @NotNull
    public final UVertexConsumer of(@NotNull final VertexConsumer wrapped) {
        Intrinsics.checkNotNullParameter((Object)wrapped, "wrapped");
        return new VanillaVertexConsumer(wrapped);
    }
    
    static {
        $$INSTANCE = new Companion();
    }
}
