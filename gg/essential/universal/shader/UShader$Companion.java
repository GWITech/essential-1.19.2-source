package gg.essential.universal.shader;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import net.minecraft.client.render.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000(
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020	J\u0016\u0010
                                                   \u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020	¨\u0006""" }, d2 = { "Lgg/essential/universal/shader/UShader$Companion;", "", "()V", "fromLegacyShader", "Lgg/essential/universal/shader/UShader;", "vertSource", "", "fragSource", "blendState", "Lgg/essential/universal/shader/BlendState;", "fromMcShader", "shader", "Lnet/minecraft/client/render/Shader;", "universalcraft" })
public static final class Companion
{
    static final /* synthetic */ Companion $$INSTANCE;
    
    private Companion() {
        super();
    }
    
    @NotNull
    public final UShader fromLegacyShader(@NotNull final String vertSource, @NotNull final String fragSource, @NotNull final BlendState blendState) {
        Intrinsics.checkNotNullParameter((Object)vertSource, "vertSource");
        Intrinsics.checkNotNullParameter((Object)fragSource, "fragSource");
        Intrinsics.checkNotNullParameter((Object)blendState, "blendState");
        return MCShader.Companion.fromLegacyShader(vertSource, fragSource, blendState);
    }
    
    @NotNull
    public final UShader fromMcShader(@NotNull final Shader shader, @NotNull final BlendState blendState) {
        Intrinsics.checkNotNullParameter((Object)shader, "shader");
        Intrinsics.checkNotNullParameter((Object)blendState, "blendState");
        return new MCShader(shader, blendState);
    }
    
    static {
        $$INSTANCE = new Companion();
    }
}
