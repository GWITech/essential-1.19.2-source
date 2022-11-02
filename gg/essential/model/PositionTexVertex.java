package gg.essential.model;

import kotlin.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0000\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fB\u001d\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003¢\u0006\u0002\u0010\u0011J\t\u0010\u0016\u001a\u00020\u000eH\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\u0006\u0010\u0019\u001a\u00020\u0000J'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\u0016\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0012\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\"" }, d2 = { "Lgg/essential/model/PositionTexVertex;", "", "x", "", "y", "z", "u", "v", "(FFFFF)V", "textureVertex", "texturePositionXIn", "texturePositionYIn", "(Lgg/essential/model/PositionTexVertex;FF)V", "vector3", "Lgg/essential/model/Vector3;", "texturePositionX", "texturePositionY", "(Lgg/essential/model/Vector3;FF)V", "getTexturePositionX", "()F", "setTexturePositionX", "(F)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "setTexturePosition", "toString", "", "cosmetics" })
public final class PositionTexVertex
{
    @JvmField
    @NotNull
    public Vector3 vector3;
    private float texturePositionX;
    @JvmField
    public float texturePositionY;
    
    public PositionTexVertex(@NotNull final Vector3 vector3, final float texturePositionX, final float texturePositionY) {
        Intrinsics.checkNotNullParameter((Object)vector3, "vector3");
        super();
        this.vector3 = vector3;
        this.texturePositionX = texturePositionX;
        this.texturePositionY = texturePositionY;
    }
    
    public final float getTexturePositionX() {
        return this.texturePositionX;
    }
    
    public PositionTexVertex(final float x, final float y, final float z, final float u, final float v) {
        this(new Vector3(x, y, z), u, v);
    }
    
    public PositionTexVertex(@NotNull final PositionTexVertex textureVertex, final float texturePositionXIn, final float texturePositionYIn) {
        Intrinsics.checkNotNullParameter((Object)textureVertex, "textureVertex");
        this(textureVertex.vector3, texturePositionXIn, texturePositionYIn);
    }
    
    @NotNull
    public final PositionTexVertex setTexturePosition(final float u, final float v) {
        return new PositionTexVertex(this, u, v);
    }
    
    @NotNull
    public final PositionTexVertex copy() {
        return new PositionTexVertex(this.vector3.clone(), this.texturePositionX, this.texturePositionY);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "PositionTexVertex(vector3=" + this.vector3 + ", texturePositionX=" + this.texturePositionX + ", texturePositionY=" + this.texturePositionY + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.vector3.hashCode();
        result = result * 31 + Float.hashCode(this.texturePositionX);
        result = result * 31 + Float.hashCode(this.texturePositionY);
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionTexVertex)) {
            return false;
        }
        final PositionTexVertex positionTexVertex = (PositionTexVertex)other;
        return Intrinsics.areEqual((Object)this.vector3, (Object)positionTexVertex.vector3) && Intrinsics.areEqual((Object)this.texturePositionX, (Object)positionTexVertex.texturePositionX) && Intrinsics.areEqual((Object)this.texturePositionY, (Object)positionTexVertex.texturePositionY);
    }
}
