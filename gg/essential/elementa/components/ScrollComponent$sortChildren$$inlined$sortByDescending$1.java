package gg.essential.elementa.components;

import java.util.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import kotlin.comparisons.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, d1 = { "\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1" })
public static final class ScrollComponent$sortChildren$$inlined$sortByDescending$1<T> implements Comparator<T> {
    final /* synthetic */ Function1 $selector;
    
    public ScrollComponent$sortChildren$$inlined$sortByDescending$1(final Function1 $selector) {
        this.$selector = $selector;
        super();
    }
    
    @Override
    public final int compare(final T a, final T b) {
        return ComparisonsKt.compareValues((Comparable)this.$selector.invoke((Object)b), (Comparable)this.$selector.invoke((Object)a));
    }
}