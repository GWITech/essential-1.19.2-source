package gg.essential.gui.screenshot.providers;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.nio.file.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00004
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010$
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0007J0\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0015H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0082\u0004¢\u0006\u0002
                                                   \u0000R0\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006@VX\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b	\u0010
                                                   "\u0004\b\u000b\u0010\f¨\u0006\u0016""" }, d2 = { "Lgg/essential/gui/screenshot/providers/ScopePreservingWindowedProvider;", "T", "Lgg/essential/gui/screenshot/providers/WindowedProvider;", "innerProvider", "(Lgg/essential/gui/screenshot/providers/WindowedProvider;)V", "value", "", "Ljava/nio/file/Path;", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "handleDelete", "", "path", "provide", "", "windows", "Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;", "optional", "", "essential" })
public final class ScopePreservingWindowedProvider<T> implements WindowedProvider<T>
{
    @NotNull
    private final WindowedProvider<T> innerProvider;
    @NotNull
    private List<? extends Path> items;
    
    public ScopePreservingWindowedProvider(@NotNull final WindowedProvider<? extends T> innerProvider) {
        Intrinsics.checkNotNullParameter((Object)innerProvider, "innerProvider");
        super();
        this.innerProvider = (WindowedProvider<T>)innerProvider;
        this.items = CollectionsKt.emptyList();
    }
    
    @NotNull
    @Override
    public List<Path> getItems() {
        return (List<Path>)this.items;
    }
    
    @Override
    public void setItems(@NotNull final List<? extends Path> value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        this.items = value;
        this.innerProvider.setItems(CollectionsKt.plus((Collection)value, (Iterable)CollectionsKt.minus((Iterable)this.innerProvider.getItems(), (Iterable)CollectionsKt.toSet((Iterable)value))));
    }
    
    public final void handleDelete(@NotNull final Path path) {
        Intrinsics.checkNotNullParameter((Object)path, "path");
        this.innerProvider.setItems(CollectionsKt.minus((Iterable)this.innerProvider.getItems(), (Iterable)SetsKt.setOf((Object)path)));
    }
    
    @NotNull
    @Override
    public Map<Path, T> provide(@NotNull final List<WindowedProvider$Window> windows, @NotNull final Set<? extends Path> optional) {
        Intrinsics.checkNotNullParameter((Object)windows, "windows");
        Intrinsics.checkNotNullParameter((Object)optional, "optional");
        return this.innerProvider.provide(windows, optional);
    }
}
