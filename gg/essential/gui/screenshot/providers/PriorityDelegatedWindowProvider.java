package gg.essential.gui.screenshot.providers;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.nio.file.*;
import kotlin.collections.*;
import io.netty.util.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0011
                                                   \u0002\b\u0002
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0002\b	
                                                   \u0002\u0010$
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0004¢\u0006\u0002\u0010\u0005J0\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00028\u00000\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0016H\u0016R0\u0010	\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b
                                                   \u0010\u000b"\u0004\b\f\u0010\rR\u001f\u0010\u0003\u001a\u000e\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0004¢\u0006
                                                   
                                                   \u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017""" }, d2 = { "Lgg/essential/gui/screenshot/providers/PriorityDelegatedWindowProvider;", "T", "Lgg/essential/gui/screenshot/providers/WindowedProvider;", "providers", "", "([Lgg/essential/gui/screenshot/providers/WindowedProvider;)V", "value", "", "Ljava/nio/file/Path;", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getProviders", "()[Lgg/essential/gui/screenshot/providers/WindowedProvider;", "[Lgg/essential/gui/screenshot/providers/WindowedProvider;", "provide", "", "windows", "Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;", "optional", "", "essential" })
public final class PriorityDelegatedWindowProvider<T> implements WindowedProvider<T>
{
    @NotNull
    private final WindowedProvider<T>[] providers;
    
    public PriorityDelegatedWindowProvider(@NotNull final WindowedProvider<T>[] providers) {
        Intrinsics.checkNotNullParameter((Object)providers, "providers");
        super();
        this.providers = providers;
    }
    
    @NotNull
    @Override
    public List<Path> getItems() {
        return this.providers[0].getItems();
    }
    
    @Override
    public void setItems(@NotNull final List<? extends Path> value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        final WindowedProvider<T>[] providers = this.providers;
        for (int i = 0; i < providers.length; ++i) {
            final WindowedProvider provider = providers[i];
            provider.setItems(value);
        }
    }
    
    @NotNull
    @Override
    public Map<Path, T> provide(@NotNull final List<WindowedProvider$Window> windows, @NotNull final Set<? extends Path> optional) {
        Intrinsics.checkNotNullParameter((Object)windows, "windows");
        Intrinsics.checkNotNullParameter((Object)optional, "optional");
        final Map output = new LinkedHashMap();
        final WindowedProvider<T>[] providers = this.providers;
        for (int i = 0; i < providers.length; ++i) {
            final WindowedProvider provider = providers[i];
            for (final Map.Entry<Path, V> entry : provider.provide(windows, SetsKt.plus((Set)optional, (Iterable)output.keySet())).entrySet()) {
                final Path key = entry.getKey();
                final Object value = entry.getValue();
                if (!output.containsKey(key)) {
                    output.put(key, value);
                }
                else {
                    ReferenceCountUtil.release(value);
                }
            }
        }
        return output;
    }
}
