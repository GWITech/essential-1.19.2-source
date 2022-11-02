package gg.essential.model;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import java.util.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "", "Lgg/essential/model/Vector3;", "invoke" })
static final class Box3$Companion$points$2 extends Lambda implements Function0<List<? extends Vector3>> {
    public static final Box3$Companion$points$2 INSTANCE;
    
    Box3$Companion$points$2() {
        super(0);
    }
    
    @NotNull
    public final List<Vector3> invoke() {
        final ArrayList list = new ArrayList(8);
        for (int i = 0; i < 8; ++i) {
            list.add(new Vector3());
        }
        return list;
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    static {
        Box3$Companion$points$2.INSTANCE = new Box3$Companion$points$2();
    }
}