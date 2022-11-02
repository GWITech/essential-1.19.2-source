package gg.essential.gui.common;

import kotlin.*;
import gg.essential.model.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000.
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u000b
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J	\u0010\r\u001a\u00020\u0003H\u00c6\u0003J	\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J	\u0010\u000f\u001a\u00020\u0006H\u00c6\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001J	\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\b\u0010	R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b
                                                   \u0000\u001a\u0004\b
                                                   \u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\f\u0010	¨\u0006\u0018""" }, d2 = { "Lgg/essential/gui/common/UI3DPlayer$PerspectiveCamera;", "", "camera", "Lgg/essential/model/Vector3;", "target", "fov", "", "(Lgg/essential/model/Vector3;Lgg/essential/model/Vector3;F)V", "getCamera", "()Lgg/essential/model/Vector3;", "getFov", "()F", "getTarget", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "essential" })
public static final class PerspectiveCamera
{
    @NotNull
    private final Vector3 camera;
    @NotNull
    private final Vector3 target;
    
    public PerspectiveCamera(@NotNull final Vector3 camera, @NotNull final Vector3 target) {
        Intrinsics.checkNotNullParameter((Object)camera, "camera");
        Intrinsics.checkNotNullParameter((Object)target, "target");
        super();
        this.camera = camera;
        this.target = target;
    }
    
    @NotNull
    public final Vector3 getCamera() {
        return this.camera;
    }
    
    @NotNull
    public final Vector3 getTarget() {
        return this.target;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "PerspectiveCamera(camera=" + this.camera + ", target=" + this.target + ", fov=" + 22.0f;
    }
    
    @Override
    public int hashCode() {
        int result = this.camera.hashCode();
        result = result * 31 + this.target.hashCode();
        result = result * 31 + Float.hashCode(22.0f);
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PerspectiveCamera)) {
            return false;
        }
        final PerspectiveCamera perspectiveCamera = (PerspectiveCamera)other;
        return Intrinsics.areEqual((Object)this.camera, (Object)perspectiveCamera.camera) && Intrinsics.areEqual((Object)this.target, (Object)perspectiveCamera.target) && Intrinsics.areEqual((Object)22.0f, (Object)22.0f);
    }
}
