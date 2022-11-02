package gg.essential.elementa.utils;

import kotlin.*;
import kotlin.collections.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b" }, d2 = { "Lgg/essential/elementa/utils/ObservableRemoveEvent;", "T", "Lgg/essential/elementa/utils/ObservableListEvent;", "element", "Lkotlin/collections/IndexedValue;", "(Lkotlin/collections/IndexedValue;)V", "getElement", "()Lkotlin/collections/IndexedValue;", "Elementa" })
public final class ObservableRemoveEvent<T> extends ObservableListEvent<T>
{
    @NotNull
    private final IndexedValue<T> element;
    
    public ObservableRemoveEvent(@NotNull final IndexedValue<? extends T> element) {
        Intrinsics.checkNotNullParameter((Object)element, "element");
        super(null);
        this.element = (IndexedValue<T>)element;
    }
    
    @NotNull
    public final IndexedValue<T> getElement() {
        return this.element;
    }
}
