package gg.essential.universal.shader;

import kotlin.*;
import net.minecraft.client.gl.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000F
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0005
                                                   \u0002\u0010\u0014
                                                   \u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007B\r\u0012\u0006\u0010\b\u001a\u00020	¢\u0006\u0002\u0010
                                                   J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016J \u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J(\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\fH\u0016R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020	¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b""" }, d2 = { "Lgg/essential/universal/shader/MCShaderUniform;", "Lgg/essential/universal/shader/ShaderUniform;", "Lgg/essential/universal/shader/IntUniform;", "Lgg/essential/universal/shader/FloatUniform;", "Lgg/essential/universal/shader/Float2Uniform;", "Lgg/essential/universal/shader/Float3Uniform;", "Lgg/essential/universal/shader/Float4Uniform;", "Lgg/essential/universal/shader/FloatMatrixUniform;", "mc", "Lnet/minecraft/client/gl/GlUniform;", "(Lnet/minecraft/client/gl/GlUniform;)V", "location", "", "getLocation", "()I", "getMc", "()Lnet/minecraft/client/gl/GlUniform;", "setValue", "", "value", "", "v1", "v2", "v3", "v4", "array", "", "universalcraft" })
public final class MCShaderUniform implements ShaderUniform, IntUniform, FloatUniform, Float2Uniform, Float3Uniform, Float4Uniform, FloatMatrixUniform
{
    @NotNull
    private final GlUniform mc;
    
    public MCShaderUniform(@NotNull final GlUniform mc) {
        Intrinsics.checkNotNullParameter((Object)mc, "mc");
        super();
        this.mc = mc;
    }
    
    @NotNull
    public final GlUniform getMc() {
        return this.mc;
    }
    
    @Override
    public int getLocation() {
        return this.mc.getLocation();
    }
    
    @Override
    public void setValue(final int value) {
        this.mc.method_35649(value);
    }
    
    @Override
    public void setValue(final float value) {
        this.mc.method_1251(value);
    }
    
    @Override
    public void setValue(final float v1, final float v2) {
        this.mc.method_1255(v1, v2);
    }
    
    @Override
    public void setValue(final float v1, final float v2, final float v3) {
        this.mc.method_1249(v1, v2, v3);
    }
    
    @Override
    public void setValue(final float v1, final float v2, final float v3, final float v4) {
        this.mc.method_1254(v1, v2, v3, v4);
    }
    
    @Override
    public void setValue(@NotNull final float[] array) {
        Intrinsics.checkNotNullParameter((Object)array, "array");
        this.mc.method_1253(array);
    }
}
