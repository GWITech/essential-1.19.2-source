package gg.essential.model;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.*;
import java.util.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u0000 >2\u00020\u0001:\u0002>?B\u001b\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u001a\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003H\u0007J\u0006\u0010\u0015\u001a\u00020\u0000J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0000J\u000e\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0003J\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000J\u001d\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u0003J\u0013\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\u000e\u0010!\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0003J\u000e\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u001eJ\u000e\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0003J\u0012\u0010&\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003H\u0007J\u001a\u0010'\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003H\u0007J\u0012\u0010(\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003H\u0007J\t\u0010)\u001a\u00020*H\u00d6\u0001J\u000e\u0010+\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000J\u000e\u0010,\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0000J\u0006\u0010-\u001a\u00020\u0019J\u0006\u0010.\u001a\u00020\u0000J\u0016\u0010/\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u000202J\u0016\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u00020\u00032\u0006\u00105\u001a\u00020\u0003J\u0014\u00106\u001a\u00020\u00002\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000308J\t\u00109\u001a\u00020:H\u00d6\u0001J\u000e\u0010;\u001a\u00020\u00002\u0006\u0010<\u001a\u00020\u0003J\u000e\u0010=\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u0000R\u001f\u0010\u0006\u001a\u00060\u0007R\u00020\u00008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f¨\u0006@" }, d2 = { "Lgg/essential/model/Box3;", "", "min", "Lgg/essential/model/Vector3;", "max", "(Lgg/essential/model/Vector3;Lgg/essential/model/Vector3;)V", "intersectsTriangleHelper", "Lgg/essential/model/Box3$IntersectsTriangleHelper;", "getIntersectsTriangleHelper", "()Lgg/essential/model/Box3$IntersectsTriangleHelper;", "intersectsTriangleHelper$delegate", "Lkotlin/Lazy;", "getMax", "()Lgg/essential/model/Vector3;", "setMax", "(Lgg/essential/model/Vector3;)V", "getMin", "setMin", "clampPoint", "point", "target", "clone", "component1", "component2", "containsBox", "", "box", "containsPoint", "copy", "distanceToPoint", "", "equals", "other", "expandByPoint", "expandByScalar", "scalar", "expandByVector", "vector", "getCenter", "getParameter", "getSize", "hashCode", "", "intersect", "intersectsBox", "isEmpty", "makeEmpty", "set", "setFromArray", "array", "", "setFromCenterAndSize", "center", "size", "setFromPoints", "points", "", "toString", "", "translate", "offset", "union", "Companion", "IntersectsTriangleHelper", "cosmetics" })
public final class Box3
{
    @NotNull
    private Vector3 min;
    @NotNull
    private Vector3 max;
    
    @JvmOverloads
    public Box3(@NotNull final Vector3 min, @NotNull final Vector3 max) {
        Intrinsics.checkNotNullParameter((Object)min, "min");
        Intrinsics.checkNotNullParameter((Object)max, "max");
        super();
        this.min = min;
        this.max = max;
        LazyKt.lazy((Function0)new Box3$intersectsTriangleHelper.Box3$intersectsTriangleHelper$2(this));
    }
    
    public Box3(final byte b) {
        this(new Vector3(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), new Vector3(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY));
    }
    
    @NotNull
    public final Vector3 getMin() {
        return this.min;
    }
    
    @NotNull
    public final Vector3 getMax() {
        return this.max;
    }
    
    @NotNull
    public final Box3 setFromPoints(@NotNull final List<Vector3> points) {
        Intrinsics.checkNotNullParameter((Object)points, "points");
        this.makeEmpty();
        final Iterable $this$forEach$iv = points;
        for (final Object element$iv : $this$forEach$iv) {
            final Vector3 it = (Vector3)element$iv;
            this.expandByPoint(it);
        }
        return this;
    }
    
    @NotNull
    public final Box3 makeEmpty() {
        this.min.x = Float.POSITIVE_INFINITY;
        this.min.y = Float.POSITIVE_INFINITY;
        this.min.z = Float.POSITIVE_INFINITY;
        this.max.x = Float.NEGATIVE_INFINITY;
        this.max.y = Float.NEGATIVE_INFINITY;
        this.max.z = Float.NEGATIVE_INFINITY;
        return this;
    }
    
    public final boolean isEmpty() {
        return this.max.x < this.min.x || this.max.y < this.min.y || this.max.z < this.min.z;
    }
    
    @NotNull
    public final Box3 expandByPoint(@NotNull final Vector3 point) {
        Intrinsics.checkNotNullParameter((Object)point, "point");
        this.min.min(point);
        this.max.max(point);
        return this;
    }
    
    @NotNull
    public final Box3 expandByScalar(final float scalar) {
        this.min.addScalar(-scalar);
        this.max.addScalar(scalar);
        return this;
    }
    
    @NotNull
    public final Box3 intersect(@NotNull final Box3 box) {
        Intrinsics.checkNotNullParameter((Object)box, "box");
        this.min.max(box.min);
        this.max.min(box.max);
        if (this.isEmpty()) {
            this.makeEmpty();
        }
        return this;
    }
    
    @NotNull
    public final Box3 clone() {
        return new Box3((byte)0).copy(this);
    }
    
    @NotNull
    public final Box3 copy(@NotNull final Box3 box) {
        Intrinsics.checkNotNullParameter((Object)box, "box");
        this.min.copy(box.min);
        this.max.copy(box.max);
        return this;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Box3(min=" + this.min + ", max=" + this.max + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.min.hashCode();
        result = result * 31 + this.max.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Box3)) {
            return false;
        }
        final Box3 box3 = (Box3)other;
        return Intrinsics.areEqual((Object)this.min, (Object)box3.min) && Intrinsics.areEqual((Object)this.max, (Object)box3.max);
    }
    
    @JvmOverloads
    public Box3() {
        this((byte)0);
    }
    
    static {
        new Companion((byte)0);
        LazyKt.lazy((Function0)Box3$Companion$points.Box3$Companion$points$2.INSTANCE);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n" }, d2 = { "Lgg/essential/model/Box3$Companion;", "", "()V", "points", "", "Lgg/essential/model/Vector3;", "getPoints", "()Ljava/util/List;", "points$delegate", "Lkotlin/Lazy;", "cosmetics" })
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
