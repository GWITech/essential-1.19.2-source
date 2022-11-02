package gg.essential.mixins.ext.client.model.geom;

import kotlin.*;
import gg.essential.lib.kotgl.matrix.matrices.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005"\u0004\b\u0006\u0010\u0007\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006\b\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/mixins/ext/client/model/geom/ExtraTransformHolder;", "", "extra", "Lgg/essential/lib/kotgl/matrix/matrices/Mat4;", "getExtra", "()Ldev/folomeev/kotgl/matrix/matrices/Mat4;", "setExtra", "(Ldev/folomeev/kotgl/matrix/matrices/Mat4;)V", "essential" })
public interface ExtraTransformHolder
{
    @Nullable
    Mat4 getExtra();
    
    void setExtra(@Nullable final Mat4 p0);
}
