package gg.essential.model.util;

import kotlin.*;
import gg.essential.lib.kotgl.matrix.matrices.mutables.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0006\u0010\u000e\u001a\u00020\u0000J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016" }, d2 = { "Lgg/essential/model/util/UMatrixStack$Entry;", "", "model", "Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat4;", "normal", "Lgg/essential/lib/kotgl/matrix/matrices/mutables/MutableMat3;", "(Ldev/folomeev/kotgl/matrix/matrices/mutables/MutableMat4;Ldev/folomeev/kotgl/matrix/matrices/mutables/MutableMat3;)V", "getModel", "()Ldev/folomeev/kotgl/matrix/matrices/mutables/MutableMat4;", "getNormal", "()Ldev/folomeev/kotgl/matrix/matrices/mutables/MutableMat3;", "component1", "component2", "copy", "deepCopy", "equals", "", "other", "hashCode", "", "toString", "", "cosmetics" })
public static final class Entry
{
    @NotNull
    private final MutableMat4 model;
    @NotNull
    private final MutableMat3 normal;
    
    public Entry(@NotNull final MutableMat4 model, @NotNull final MutableMat3 normal) {
        Intrinsics.checkNotNullParameter((Object)model, "model");
        Intrinsics.checkNotNullParameter((Object)normal, "normal");
        super();
        this.model = model;
        this.normal = normal;
    }
    
    @NotNull
    public final MutableMat4 getModel() {
        return this.model;
    }
    
    @NotNull
    public final MutableMat3 getNormal() {
        return this.normal;
    }
    
    @NotNull
    public final Entry deepCopy() {
        return new Entry(this.model.copyOf(), this.normal.copyOf());
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Entry(model=" + this.model + ", normal=" + this.normal + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.model.hashCode();
        result = result * 31 + this.normal.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Entry)) {
            return false;
        }
        final Entry entry = (Entry)other;
        return Intrinsics.areEqual((Object)this.model, (Object)entry.model) && Intrinsics.areEqual((Object)this.normal, (Object)entry.normal);
    }
}
