package gg.essential.util;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0018
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0003B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0016\u0010
                                                   \u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0002\u0010\fR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010	X\u0088\u0004¢\u0006\u0002
                                                   \u0000¨\u0006""" }, d2 = { "Lgg/essential/util/Memoize;", "T", "R", "Lkotlin/Function1;", "f", "(Lkotlin/jvm/functions/Function1;)V", "getF", "()Lkotlin/jvm/functions/Function1;", "values", "Ljava/util/HashMap;", "invoke", "x", "(Ljava/lang/Object;)Ljava/lang/Object;", "essential" })
public final class Memoize<T, R> implements Function1<T, R>
{
    @NotNull
    private final Function1<T, R> f;
    @NotNull
    private final HashMap<T, R> values;
    
    public Memoize(@NotNull final Function1<? super T, ? extends R> f) {
        Intrinsics.checkNotNullParameter((Object)f, "f");
        super();
        this.f = (Function1<T, R>)f;
        this.values = new HashMap<T, R>();
    }
    
    public R invoke(final T x) {
        final Map $this$getOrPut$iv = this.values;
        final Object value$iv = $this$getOrPut$iv.get(x);
        Object o;
        if (value$iv == null) {
            final Object answer$iv = this.f.invoke((Object)x);
            $this$getOrPut$iv.put(x, answer$iv);
            o = answer$iv;
        }
        else {
            o = value$iv;
        }
        return (R)o;
    }
}
