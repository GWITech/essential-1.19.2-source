package gg.essential.cosmetics.boxmask;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.*;
import gg.essential.model.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¨\u0006\b" }, d2 = { "Lgg/essential/cosmetics/boxmask/ModelClipper;", "", "compute", "Lgg/essential/model/Bone;", "bone", "masks", "", "Lgg/essential/model/Box3;", "cosmetics" })
public interface ModelClipper
{
    @NotNull
    Bone compute(@NotNull final Bone p0, @NotNull final List<Box3> p1);
}
