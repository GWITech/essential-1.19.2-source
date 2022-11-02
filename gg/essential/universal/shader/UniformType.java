package gg.essential.universal.shader;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001a
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0010
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0015
                                                   \u0002\b\u0010\b\u0080\u0001\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u001f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b
                                                   \u0000\u001a\u0004\b\b\u0010	R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b
                                                   \u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\f\u0010\u000bj\u0002\bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016""" }, d2 = { "Lgg/essential/universal/shader/UniformType;", "", "typeName", "", "glslName", "default", "", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;[I)V", "getDefault", "()[I", "getGlslName", "()Ljava/lang/String;", "getTypeName", "Int1", "Float1", "Float2", "Float3", "Float4", "Mat2", "Mat3", "Mat4", "Companion", "universalcraft" })
public enum UniformType
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final String typeName;
    @NotNull
    private final String glslName;
    @NotNull
    private final int[] default;
    
    Int1("Int1", 0, "int", "int", new int[] { 0 }), 
    Float1("Float1", 1, "float", "float", new int[] { 0 }), 
    Float2("Float2", 2, "float", "vec2", new int[] { 0, 0 }), 
    Float3("Float3", 3, "float", "vec3", new int[] { 0, 0, 0 }), 
    Float4("Float4", 4, "float", "vec4", new int[] { 0, 0, 0, 0 }), 
    Mat2("Mat2", 5, "matrix2x2", "mat2", new int[] { 1, 0, 0, 1 }), 
    Mat3("Mat3", 6, "matrix3x3", "mat3", new int[] { 1, 0, 0, 0, 1, 0, 0, 0, 1 }), 
    Mat4("Mat4", 7, "matrix4x4", "mat4", new int[] { 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 });
    
    private static final /* synthetic */ UniformType[] $VALUES;
    
    private UniformType(final String $enum$name, final int $enum$ordinal, final String typeName, final String glslName, final int[] default) {
        this.typeName = typeName;
        this.glslName = glslName;
        this.default = default;
    }
    
    @NotNull
    public final String getTypeName() {
        return this.typeName;
    }
    
    @NotNull
    public final String getGlslName() {
        return this.glslName;
    }
    
    @NotNull
    public final int[] getDefault() {
        return this.default;
    }
    
    public static UniformType[] values() {
        return UniformType.$VALUES.clone();
    }
    
    public static UniformType valueOf(final String value) {
        return Enum.valueOf(UniformType.class, value);
    }
    
    private static final /* synthetic */ UniformType[] $values() {
        return new UniformType[] { UniformType.Int1, UniformType.Float1, UniformType.Float2, UniformType.Float3, UniformType.Float4, UniformType.Mat2, UniformType.Mat3, UniformType.Mat4 };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0018
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007""" }, d2 = { "Lgg/essential/universal/shader/UniformType$Companion;", "", "()V", "fromGlsl", "Lgg/essential/universal/shader/UniformType;", "glslName", "", "universalcraft" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final UniformType fromGlsl(@NotNull final String glslName) {
            Intrinsics.checkNotNullParameter((Object)glslName, "glslName");
            final UniformType[] values = UniformType.values();
            final int length = values.length;
            int i = 0;
            while (true) {
                while (i < length) {
                    final UniformType it = values[i];
                    final int n = 0;
                    if (Intrinsics.areEqual((Object)it.getGlslName(), (Object)glslName)) {
                        final UniformType uniformType2;
                        final UniformType uniformType = uniformType2 = it;
                        if (uniformType2 == null) {
                            throw new NoSuchElementException(glslName);
                        }
                        return uniformType;
                    }
                    else {
                        ++i;
                    }
                }
                UniformType uniformType2;
                final UniformType uniformType = uniformType2 = null;
                continue;
            }
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
