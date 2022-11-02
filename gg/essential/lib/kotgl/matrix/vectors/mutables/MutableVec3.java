package gg.essential.lib.kotgl.matrix.vectors.mutables;

import gg.essential.lib.kotgl.matrix.vectors.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\f\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0010B\u0005¢\u0006\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0018\u0010\n\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0018\u0010\r\u001a\u00020\u0005X¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0011" }, d2 = { "Lgg/essential/lib/kotgl/matrix/vectors/mutables/MutableVec3;", "Lgg/essential/lib/kotgl/matrix/vectors/Vec3;", "Lgg/essential/lib/kotgl/matrix/vectors/mutables/MutableVec;", "()V", "x", "", "getX", "()F", "setX", "(F)V", "y", "getY", "setY", "z", "getZ", "setZ", "Implementation", "kotgl-matrix" })
public abstract class MutableVec3 extends Vec3 implements MutableVec
{
    public MutableVec3() {
        super();
    }
    
    @Override
    public abstract float getX();
    
    public abstract void setX(final float p0);
    
    @Override
    public abstract float getY();
    
    public abstract void setY(final float p0);
    
    @Override
    public abstract float getZ();
    
    public abstract void setZ(final float p0);
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0002\u0010\u0006J\b\u0010\u000f\u001a\u00020\u0001H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\u0005\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0010" }, d2 = { "Lgg/essential/lib/kotgl/matrix/vectors/mutables/MutableVec3$Implementation;", "Lgg/essential/lib/kotgl/matrix/vectors/mutables/MutableVec3;", "x", "", "y", "z", "(FFF)V", "getX", "()F", "setX", "(F)V", "getY", "setY", "getZ", "setZ", "copyOf", "kotgl-matrix" })
    public static final class Implementation extends MutableVec3
    {
        private float x;
        private float y;
        private float z;
        
        public Implementation(final float x, final float y, final float z) {
            super();
            this.x = x;
            this.y = y;
            this.z = z;
        }
        
        @Override
        public float getX() {
            return this.x;
        }
        
        @Override
        public void setX(final float <set-?>) {
            this.x = <set-?>;
        }
        
        @Override
        public float getY() {
            return this.y;
        }
        
        @Override
        public void setY(final float <set-?>) {
            this.y = <set-?>;
        }
        
        @Override
        public float getZ() {
            return this.z;
        }
        
        @Override
        public void setZ(final float <set-?>) {
            this.z = <set-?>;
        }
    }
}
