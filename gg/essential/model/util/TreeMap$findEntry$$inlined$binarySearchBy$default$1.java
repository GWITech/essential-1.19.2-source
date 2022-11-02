package gg.essential.model.util;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import java.util.*;
import kotlin.*;
import kotlin.comparisons.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u000e\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u00042\u0006\u0010\u0005\u001a\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "<anonymous>", "", "T", "K", "", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Integer;", "kotlin/collections/CollectionsKt__CollectionsKt$binarySearchBy$1" })
public static final class TreeMap$findEntry$$inlined$binarySearchBy$default$1 extends Lambda implements Function1<Entry<? extends K, ? extends V>, Integer> {
    final /* synthetic */ Comparable $key;
    
    public TreeMap$findEntry$$inlined$binarySearchBy$default$1(final Comparable $key) {
        this.$key = $key;
        super(1);
    }
    
    @NotNull
    public final Integer invoke(final Entry<? extends K, ? extends V> it) {
        final Entry it2 = it;
        return ComparisonsKt.compareValues((Comparable)it2.getKey(), this.$key);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke(p1);
    }
}