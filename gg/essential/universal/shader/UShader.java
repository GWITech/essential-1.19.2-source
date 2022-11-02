package gg.essential.universal.shader;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;
import net.minecraft.client.render.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000V
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004\bf\u0018\u0000  2\u00020\u0001:\u0001 J\b\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020	2\u0006\u0010
                                                   \u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010	2\u0006\u0010
                                                   \u001a\u00020\u000bH&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010
                                                   \u001a\u00020\u000bH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010
                                                   \u001a\u00020\u000bH&J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010
                                                   \u001a\u00020\u000bH\u0016J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010
                                                   \u001a\u00020\u000bH&J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010
                                                   \u001a\u00020\u000bH\u0016J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010
                                                   \u001a\u00020\u000bH&J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010
                                                   \u001a\u00020\u000bH\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010
                                                   \u001a\u00020\u000bH&J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010
                                                   \u001a\u00020\u000bH\u0016J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010
                                                   \u001a\u00020\u000bH&J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010
                                                   \u001a\u00020\u000bH\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010
                                                   \u001a\u00020\u000bH&J\b\u0010\u001f\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006!\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/universal/shader/UShader;", "", "usable", "", "getUsable", "()Z", "bind", "", "getFloat2Uniform", "Lgg/essential/universal/shader/Float2Uniform;", "name", "", "getFloat2UniformOrNull", "getFloat3Uniform", "Lgg/essential/universal/shader/Float3Uniform;", "getFloat3UniformOrNull", "getFloat4Uniform", "Lgg/essential/universal/shader/Float4Uniform;", "getFloat4UniformOrNull", "getFloatMatrixUniform", "Lgg/essential/universal/shader/FloatMatrixUniform;", "getFloatMatrixUniformOrNull", "getFloatUniform", "Lgg/essential/universal/shader/FloatUniform;", "getFloatUniformOrNull", "getIntUniform", "Lgg/essential/universal/shader/IntUniform;", "getIntUniformOrNull", "getSamplerUniform", "Lgg/essential/universal/shader/SamplerUniform;", "getSamplerUniformOrNull", "unbind", "Companion", "universalcraft" })
public interface UShader
{
    @NotNull
    public static final Companion Companion = UShader.Companion.$$INSTANCE;
    
    boolean getUsable();
    
    void bind();
    
    void unbind();
    
    @Nullable
    IntUniform getIntUniformOrNull(@NotNull final String p0);
    
    @Nullable
    FloatUniform getFloatUniformOrNull(@NotNull final String p0);
    
    @Nullable
    Float2Uniform getFloat2UniformOrNull(@NotNull final String p0);
    
    @Nullable
    Float3Uniform getFloat3UniformOrNull(@NotNull final String p0);
    
    @Nullable
    Float4Uniform getFloat4UniformOrNull(@NotNull final String p0);
    
    @Nullable
    FloatMatrixUniform getFloatMatrixUniformOrNull(@NotNull final String p0);
    
    @Nullable
    SamplerUniform getSamplerUniformOrNull(@NotNull final String p0);
    
    @NotNull
    default IntUniform getIntUniform(@NotNull final String name) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        final IntUniform intUniformOrNull = this.getIntUniformOrNull(name);
        if (intUniformOrNull == null) {
            throw new NoSuchElementException(name);
        }
        return intUniformOrNull;
    }
    
    @NotNull
    default FloatUniform getFloatUniform(@NotNull final String name) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        final FloatUniform floatUniformOrNull = this.getFloatUniformOrNull(name);
        if (floatUniformOrNull == null) {
            throw new NoSuchElementException(name);
        }
        return floatUniformOrNull;
    }
    
    @NotNull
    default Float2Uniform getFloat2Uniform(@NotNull final String name) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        final Float2Uniform float2UniformOrNull = this.getFloat2UniformOrNull(name);
        if (float2UniformOrNull == null) {
            throw new NoSuchElementException(name);
        }
        return float2UniformOrNull;
    }
    
    @NotNull
    default Float3Uniform getFloat3Uniform(@NotNull final String name) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        final Float3Uniform float3UniformOrNull = this.getFloat3UniformOrNull(name);
        if (float3UniformOrNull == null) {
            throw new NoSuchElementException(name);
        }
        return float3UniformOrNull;
    }
    
    @NotNull
    default Float4Uniform getFloat4Uniform(@NotNull final String name) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        final Float4Uniform float4UniformOrNull = this.getFloat4UniformOrNull(name);
        if (float4UniformOrNull == null) {
            throw new NoSuchElementException(name);
        }
        return float4UniformOrNull;
    }
    
    @NotNull
    default FloatMatrixUniform getFloatMatrixUniform(@NotNull final String name) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        final FloatMatrixUniform floatMatrixUniformOrNull = this.getFloatMatrixUniformOrNull(name);
        if (floatMatrixUniformOrNull == null) {
            throw new NoSuchElementException(name);
        }
        return floatMatrixUniformOrNull;
    }
    
    @NotNull
    default SamplerUniform getSamplerUniform(@NotNull final String name) {
        Intrinsics.checkNotNullParameter((Object)name, "name");
        final SamplerUniform samplerUniformOrNull = this.getSamplerUniformOrNull(name);
        if (samplerUniformOrNull == null) {
            throw new NoSuchElementException(name);
        }
        return samplerUniformOrNull;
    }
    
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
}
