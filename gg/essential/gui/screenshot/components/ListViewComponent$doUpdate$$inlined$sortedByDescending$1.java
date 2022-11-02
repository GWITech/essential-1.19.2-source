package gg.essential.gui.screenshot.components;

import java.util.*;
import com.sparkuniverse.toolbox.util.*;
import kotlin.*;
import kotlin.comparisons.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0007\u0010\u0000\u001a\u00020\u0001"\u0004\b\u0000\u0010\u00022\u000e\u0010\u0003\u001a
                                                    \u0004*\u0004\u0018\u0001H\u0002H\u00022\u000e\u0010\u0005\u001a
                                                    \u0004*\u0004\u0018\u0001H\u0002H\u0002H
                                                   ¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b""" }, d2 = { "<anonymous>", "", "T", "a", "kotlin.jvm.PlatformType", "b", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "kotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1" })
public static final class ListViewComponent$doUpdate$$inlined$sortedByDescending$1<T> implements Comparator {
    public ListViewComponent$doUpdate$$inlined$sortedByDescending$1() {
        super();
    }
    
    @Override
    public final int compare(final T a, final T b) {
        DateTime time = (DateTime)((Pair)b).component2();
        final Comparable comparable = (Comparable)time;
        final Pair pair = (Pair)a;
        final Comparable comparable2 = comparable;
        time = (DateTime)pair.component2();
        return ComparisonsKt.compareValues(comparable2, (Comparable)time);
    }
}