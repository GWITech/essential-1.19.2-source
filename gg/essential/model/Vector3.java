package gg.essential.model;

import kotlin.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b(\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u0000 V2\u00020\u0001:\u0001VB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\b\u0012\u0006\u0010\u0005\u001a\u00020\b\u0012\u0006\u0010\u0006\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ\u0016\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000J\u0006\u0010\u0012\u001a\u00020\u0000J\u0016\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0000J\u0016\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bJ\u0016\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bJ\u0006\u0010\u0018\u001a\u00020\u0000J\t\u0010\u0019\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001a\u001a\u00020\bH\u00c6\u0003J\t\u0010\u001b\u001a\u00020\bH\u00c6\u0003J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000J'\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\b2\b\b\u0002\u0010\u0005\u001a\u00020\b2\b\b\u0002\u0010\u0006\u001a\u00020\bH\u00c6\u0001J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000J\u0016\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000J\u000e\u0010\u001f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010 \u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ\u000e\u0010#\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0000J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u0006\u0010'\u001a\u00020\u0000J\u0018\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\b\b\u0002\u0010+\u001a\u00020,J\u0011\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020,H\u0086\u0002J\t\u0010/\u001a\u00020,H\u00d6\u0001J\u0006\u00100\u001a\u00020\bJ\u0006\u00101\u001a\u00020\bJ\u0016\u00102\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u00103\u001a\u00020\bJ\u001e\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u00002\u0006\u00103\u001a\u00020\bJ\u000e\u00107\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u0000J\u0006\u00108\u001a\u00020\bJ\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000J\u0011\u00109\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0086\u0002J\u000e\u0010:\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010;\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ\u0016\u0010<\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000J\u0006\u0010=\u001a\u00020\u0000J\u0006\u0010>\u001a\u00020\u0000J\u0006\u0010?\u001a\u00020\u0000J\u0011\u0010@\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000H\u0086\u0002J\u000e\u0010A\u001a\u00020\u00002\u0006\u0010B\u001a\u00020\u0000J\u000e\u0010C\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010D\u001a\u00020\u00002\u0006\u0010E\u001a\u00020\u0000J\u0006\u0010F\u001a\u00020\u0000J\u0006\u0010G\u001a\u00020\u0000J\u0019\u0010H\u001a\u00020\u00002\u0006\u0010.\u001a\u00020,2\u0006\u0010I\u001a\u00020\bH\u0086\u0002J\u001e\u0010H\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004J\u001e\u0010J\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\b2\u0006\u0010L\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bJ\u001e\u0010M\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\b2\u0006\u0010N\u001a\u00020\b2\u0006\u0010L\u001a\u00020\bJ\u000e\u0010O\u001a\u00020\u00002\u0006\u00100\u001a\u00020\bJ\u000e\u0010P\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0004J\u000e\u0010Q\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000J\u000e\u0010R\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\bJ\u0016\u0010S\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000J\t\u0010T\u001a\u00020UH\u00d6\u0001R\u0012\u0010\u0003\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006W" }, d2 = { "Lgg/essential/model/Vector3;", "", "()V", "x", "", "y", "z", "(Ljava/lang/Number;Ljava/lang/Number;Ljava/lang/Number;)V", "", "(FFF)V", "add", "v", "addScalar", "s", "addScaledVector", "addVectors", "a", "b", "ceil", "clamp", "min", "max", "clampLength", "clampScalar", "clone", "component1", "component2", "component3", "copy", "cross", "crossVectors", "distanceTo", "distanceToSquared", "divide", "divideScalar", "dot", "equals", "", "other", "floor", "fromArray", "array", "", "offset", "", "get", "index", "hashCode", "length", "lengthSq", "lerp", "alpha", "lerpVectors", "v1", "v2", "manhattanDistanceTo", "manhattanLength", "minus", "multiply", "multiplyScalar", "multiplyVectors", "negate", "negateY", "normalize", "plus", "projectOnPlane", "planeNormal", "projectOnVector", "reflect", "normal", "round", "roundToZero", "set", "value", "setFromCylindricalCoords", "radius", "theta", "setFromSphericalCoords", "phi", "setLength", "setScalar", "sub", "subScalar", "subVectors", "toString", "", "Companion", "cosmetics" })
public final class Vector3
{
    @JvmField
    public float x;
    @JvmField
    public float y;
    @JvmField
    public float z;
    
    public Vector3(final float x, final float y, final float z) {
        super();
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public Vector3() {
        this(0.0f, 0.0f, 0.0f);
    }
    
    public Vector3(@NotNull final Number x, @NotNull final Number y, @NotNull final Number z) {
        Intrinsics.checkNotNullParameter((Object)x, "x");
        Intrinsics.checkNotNullParameter((Object)y, "y");
        Intrinsics.checkNotNullParameter((Object)z, "z");
        this(x.floatValue(), y.floatValue(), z.floatValue());
    }
    
    @NotNull
    public final Vector3 set(@NotNull final Number x, @NotNull final Number y, @NotNull final Number z) {
        Intrinsics.checkNotNullParameter((Object)x, "x");
        Intrinsics.checkNotNullParameter((Object)y, "y");
        Intrinsics.checkNotNullParameter((Object)z, "z");
        this.x = x.floatValue();
        this.y = y.floatValue();
        this.z = z.floatValue();
        return this;
    }
    
    @NotNull
    public final Vector3 clone() {
        return copy$default$43f21962$6d547e82(this);
    }
    
    @NotNull
    public final Vector3 copy(@NotNull final Vector3 v) {
        Intrinsics.checkNotNullParameter((Object)v, "v");
        return this.set(v.x, v.y, v.z);
    }
    
    @NotNull
    public final Vector3 add(@NotNull final Vector3 v) {
        Intrinsics.checkNotNullParameter((Object)v, "v");
        this.x += v.x;
        this.y += v.y;
        this.z += v.z;
        return this;
    }
    
    @NotNull
    public final Vector3 addScalar(final float s) {
        this.x += s;
        this.y += s;
        this.z += s;
        return this;
    }
    
    @NotNull
    public final Vector3 sub(@NotNull final Vector3 v) {
        Intrinsics.checkNotNullParameter((Object)v, "v");
        this.x -= v.x;
        this.y -= v.y;
        this.z -= v.z;
        return this;
    }
    
    @NotNull
    public final Vector3 multiplyScalar(final float s) {
        this.x *= s;
        this.y *= s;
        this.z *= s;
        return this;
    }
    
    @NotNull
    public final Vector3 divideScalar(final float s) {
        return this.multiplyScalar(1.0f / s);
    }
    
    @NotNull
    public final Vector3 min(@NotNull final Vector3 v) {
        Intrinsics.checkNotNullParameter((Object)v, "v");
        this.x = Math.min(this.x, v.x);
        this.y = Math.min(this.y, v.y);
        this.z = Math.min(this.z, v.z);
        return this;
    }
    
    @NotNull
    public final Vector3 max(@NotNull final Vector3 v) {
        Intrinsics.checkNotNullParameter((Object)v, "v");
        this.x = Math.max(this.x, v.x);
        this.y = Math.max(this.y, v.y);
        this.z = Math.max(this.z, v.z);
        return this;
    }
    
    @NotNull
    public final Vector3 negateY() {
        this.y = -this.y;
        return this;
    }
    
    public final float length() {
        return (float)Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }
    
    @NotNull
    public final Vector3 normalize() {
        float length = this.length();
        if (Float.isNaN(length)) {
            length = 1.0f;
        }
        return this.divideScalar(length);
    }
    
    @NotNull
    public final Vector3 cross(@NotNull final Vector3 v) {
        Intrinsics.checkNotNullParameter((Object)v, "v");
        return this.crossVectors(this, v);
    }
    
    @NotNull
    public final Vector3 crossVectors(@NotNull final Vector3 a, @NotNull final Vector3 b) {
        Intrinsics.checkNotNullParameter((Object)a, "a");
        Intrinsics.checkNotNullParameter((Object)b, "b");
        final float ax = a.x;
        final float ay = a.y;
        final float az = a.z;
        final float bx = b.x;
        final float by = b.y;
        final float bz = b.z;
        this.x = ay * bz - az * by;
        this.y = az * bx - ax * bz;
        this.z = ax * by - ay * bx;
        return this;
    }
    
    @NotNull
    public final Vector3 plus(@NotNull final Vector3 b) {
        Intrinsics.checkNotNullParameter((Object)b, "b");
        return copy$default$43f21962$6d547e82(this).add(b);
    }
    
    @NotNull
    public final Vector3 minus(@NotNull final Vector3 b) {
        Intrinsics.checkNotNullParameter((Object)b, "b");
        return copy$default$43f21962$6d547e82(this).sub(b);
    }
    
    public final float component1() {
        return this.x;
    }
    
    public final float component2() {
        return this.y;
    }
    
    public final float component3() {
        return this.z;
    }
    
    @NotNull
    public final Vector3 copy(final float x, final float y, final float z) {
        return new Vector3(x, y, z);
    }
    
    public static /* synthetic */ Vector3 copy$default$43f21962$6d547e82(final Vector3 vector3) {
        return vector3.copy(vector3.x, vector3.y, vector3.z);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Vector3(x=" + this.x + ", y=" + this.y + ", z=" + this.z + ')';
    }
    
    @Override
    public int hashCode() {
        int result = Float.hashCode(this.x);
        result = result * 31 + Float.hashCode(this.y);
        result = result * 31 + Float.hashCode(this.z);
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vector3)) {
            return false;
        }
        final Vector3 vector3 = (Vector3)other;
        return Intrinsics.areEqual((Object)this.x, (Object)vector3.x) && Intrinsics.areEqual((Object)this.y, (Object)vector3.y) && Intrinsics.areEqual((Object)this.z, (Object)vector3.z);
    }
    
    static {
        new Companion((byte)0);
        new Vector3(1.0f, 0.0f, 0.0f);
        new Vector3(0.0f, 1.0f, 0.0f);
        new Vector3(0.0f, 0.0f, 1.0f);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007" }, d2 = { "Lgg/essential/model/Vector3$Companion;", "", "()V", "X", "Lgg/essential/model/Vector3;", "Y", "Z", "cosmetics" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
