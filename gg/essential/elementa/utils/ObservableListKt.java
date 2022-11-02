package gg.essential.elementa.utils;

import kotlin.*;
import kotlin.collections.*;
import org.jetbrains.annotations.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 2, xi = 48, d1 = { "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001c\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003\u001a&\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\u0002H\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0086\u0004¢\u0006\u0002\u0010\b¨\u0006\t" }, d2 = { "observable", "Lgg/essential/elementa/utils/ObservableList;", "T", "", "withIndex", "Lkotlin/collections/IndexedValue;", "index", "", "(Ljava/lang/Object;I)Lkotlin/collections/IndexedValue;", "Elementa" })
public final class ObservableListKt
{
    @NotNull
    public static final <T> IndexedValue<T> withIndex(final T $this$withIndex, final int index) {
        return (IndexedValue<T>)new IndexedValue(index, (Object)$this$withIndex);
    }
    
    @NotNull
    public static final <T> ObservableList<T> observable(@NotNull final List<T> $this$observable) {
        Intrinsics.checkNotNullParameter((Object)$this$observable, "<this>");
        return new ObservableList<T>($this$observable);
    }
}
