package gg.essential.elementa.utils;

import kotlin.*;
import java.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0007\b\u0016¢\u0006\u0002\u0010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t" }, d2 = { "Lgg/essential/elementa/utils/ObservableClearEvent;", "T", "Lgg/essential/elementa/utils/ObservableListEvent;", "()V", "oldChildren", "", "(Ljava/util/List;)V", "getOldChildren", "()Ljava/util/List;", "Elementa" })
public final class ObservableClearEvent<T> extends ObservableListEvent<T>
{
    @NotNull
    private final List<T> oldChildren;
    
    public ObservableClearEvent(@NotNull final List<? extends T> oldChildren) {
        Intrinsics.checkNotNullParameter((Object)oldChildren, "oldChildren");
        super(null);
        this.oldChildren = (List<T>)oldChildren;
    }
    
    @NotNull
    public final List<T> getOldChildren() {
        return this.oldChildren;
    }
    
    public ObservableClearEvent() {
        this(CollectionsKt.emptyList());
    }
}
