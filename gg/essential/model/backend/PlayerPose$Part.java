package gg.essential.model.backend;

import kotlin.*;
import gg.essential.lib.kotgl.matrix.matrices.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u00c6\u0003JQ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020#H\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006$" }, d2 = { "Lgg/essential/model/backend/PlayerPose$Part;", "", "pivotX", "", "pivotY", "pivotZ", "rotateAngleX", "rotateAngleY", "rotateAngleZ", "extra", "Lgg/essential/lib/kotgl/matrix/matrices/Mat4;", "(FFFFFFLdev/folomeev/kotgl/matrix/matrices/Mat4;)V", "getExtra", "()Ldev/folomeev/kotgl/matrix/matrices/Mat4;", "getPivotX", "()F", "getPivotY", "getPivotZ", "getRotateAngleX", "getRotateAngleY", "getRotateAngleZ", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cosmetics" })
public static final class Part
{
    private final float pivotX;
    private final float pivotY;
    private final float pivotZ;
    private final float rotateAngleX;
    private final float rotateAngleY;
    private final float rotateAngleZ;
    @Nullable
    private final Mat4 extra;
    
    public Part(final float pivotX, final float pivotY, final float pivotZ, final float rotateAngleX, final float rotateAngleY, final float rotateAngleZ, @Nullable final Mat4 extra) {
        super();
        this.pivotX = pivotX;
        this.pivotY = pivotY;
        this.pivotZ = pivotZ;
        this.rotateAngleX = rotateAngleX;
        this.rotateAngleY = rotateAngleY;
        this.rotateAngleZ = rotateAngleZ;
        this.extra = extra;
    }
    
    public Part(float pivotX, float pivotY, float pivotZ, Mat4 extra, final int n) {
        if ((n & 0x1) != 0x0) {
            pivotX = 0.0f;
        }
        if ((n & 0x2) != 0x0) {
            pivotY = 0.0f;
        }
        if ((n & 0x4) != 0x0) {
            pivotZ = 0.0f;
        }
        if ((n & 0x40) != 0x0) {
            extra = null;
        }
        this(pivotX, pivotY, pivotZ, 0.0f, 0.0f, 0.0f, extra);
    }
    
    public final float getPivotX() {
        return this.pivotX;
    }
    
    public final float getPivotY() {
        return this.pivotY;
    }
    
    public final float getPivotZ() {
        return this.pivotZ;
    }
    
    public final float getRotateAngleX() {
        return this.rotateAngleX;
    }
    
    public final float getRotateAngleY() {
        return this.rotateAngleY;
    }
    
    public final float getRotateAngleZ() {
        return this.rotateAngleZ;
    }
    
    @Nullable
    public final Mat4 getExtra() {
        return this.extra;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Part(pivotX=" + this.pivotX + ", pivotY=" + this.pivotY + ", pivotZ=" + this.pivotZ + ", rotateAngleX=" + this.rotateAngleX + ", rotateAngleY=" + this.rotateAngleY + ", rotateAngleZ=" + this.rotateAngleZ + ", extra=" + this.extra + ')';
    }
    
    @Override
    public int hashCode() {
        int result = Float.hashCode(this.pivotX);
        result = result * 31 + Float.hashCode(this.pivotY);
        result = result * 31 + Float.hashCode(this.pivotZ);
        result = result * 31 + Float.hashCode(this.rotateAngleX);
        result = result * 31 + Float.hashCode(this.rotateAngleY);
        result = result * 31 + Float.hashCode(this.rotateAngleZ);
        result = result * 31 + ((this.extra == null) ? 0 : this.extra.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Part)) {
            return false;
        }
        final Part part = (Part)other;
        return Intrinsics.areEqual((Object)this.pivotX, (Object)part.pivotX) && Intrinsics.areEqual((Object)this.pivotY, (Object)part.pivotY) && Intrinsics.areEqual((Object)this.pivotZ, (Object)part.pivotZ) && Intrinsics.areEqual((Object)this.rotateAngleX, (Object)part.rotateAngleX) && Intrinsics.areEqual((Object)this.rotateAngleY, (Object)part.rotateAngleY) && Intrinsics.areEqual((Object)this.rotateAngleZ, (Object)part.rotateAngleZ) && Intrinsics.areEqual((Object)this.extra, (Object)part.extra);
    }
    
    public Part() {
        this(0.0f, 0.0f, 0.0f, null, 127);
    }
}
