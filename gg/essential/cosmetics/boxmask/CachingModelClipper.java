package gg.essential.cosmetics.boxmask;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.*;
import gg.essential.model.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u001e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b" }, d2 = { "Lgg/essential/cosmetics/boxmask/CachingModelClipper;", "Lgg/essential/cosmetics/boxmask/ModelClipper;", "inner", "(Lgg/essential/cosmetics/boxmask/ModelClipper;)V", "bone", "Lgg/essential/model/Bone;", "masks", "", "Lgg/essential/model/Box3;", "result", "compute", "cosmetics" })
public final class CachingModelClipper implements ModelClipper
{
    @NotNull
    private final ModelClipper inner;
    @Nullable
    private Bone bone;
    @Nullable
    private List<Box3> masks;
    @Nullable
    private Bone result;
    
    public CachingModelClipper(@NotNull final ModelClipper inner) {
        Intrinsics.checkNotNullParameter((Object)inner, "inner");
        super();
        this.inner = inner;
    }
    
    @NotNull
    @Override
    public Bone compute(@NotNull final Bone bone, @NotNull final List<Box3> masks) {
        Intrinsics.checkNotNullParameter((Object)bone, "bone");
        Intrinsics.checkNotNullParameter((Object)masks, "masks");
        final Bone cached = this.result;
        if (cached != null && Intrinsics.areEqual((Object)bone, (Object)this.bone) && Intrinsics.areEqual((Object)masks, (Object)this.masks)) {
            return cached;
        }
        final Bone result = this.inner.compute(bone, masks);
        this.bone = bone;
        this.masks = masks;
        return this.result = result;
    }
}
