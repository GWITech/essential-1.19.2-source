package gg.essential.universal.shader;

import kotlin.*;
import net.minecraft.client.render.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000(
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\u0007
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0096D¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010
                                                   R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0010\u000e¨\u0006\u0012""" }, d2 = { "Lgg/essential/universal/shader/MCSamplerUniform;", "Lgg/essential/universal/shader/SamplerUniform;", "mc", "Lnet/minecraft/client/render/Shader;", "name", "", "(Lnet/minecraft/client/render/Shader;Ljava/lang/String;)V", "location", "", "getLocation", "()I", "getMc", "()Lnet/minecraft/client/render/Shader;", "getName", "()Ljava/lang/String;", "setValue", "", "textureId", "universalcraft" })
public final class MCSamplerUniform implements SamplerUniform
{
    @NotNull
    private final Shader mc;
    @NotNull
    private final String name;
    private final int location;
    
    public MCSamplerUniform(@NotNull final Shader mc, @NotNull final String name) {
        Intrinsics.checkNotNullParameter((Object)mc, "mc");
        Intrinsics.checkNotNullParameter((Object)name, "name");
        super();
        this.mc = mc;
        this.name = name;
    }
    
    @NotNull
    public final Shader getMc() {
        return this.mc;
    }
    
    @NotNull
    public final String getName() {
        return this.name;
    }
    
    @Override
    public int getLocation() {
        return this.location;
    }
    
    @Override
    public void setValue(final int textureId) {
        this.mc.addSampler(this.name, (Object)textureId);
    }
}
