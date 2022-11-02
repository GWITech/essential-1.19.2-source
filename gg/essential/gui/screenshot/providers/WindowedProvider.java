package gg.essential.gui.screenshot.providers;

import kotlin.*;
import java.nio.file.*;
import org.jetbrains.annotations.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000,
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0010$
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0002\b\u0002\bf\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0001\u0010J0\u0010
                                                   \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH&R\u001e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X¦\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007"\u0004\b\b\u0010	\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006\u0011\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/gui/screenshot/providers/WindowedProvider;", "T", "", "items", "", "Ljava/nio/file/Path;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "provide", "", "windows", "Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;", "optional", "", "Window", "essential" })
public interface WindowedProvider<T>
{
    @NotNull
    List<Path> getItems();
    
    void setItems(@NotNull final List<? extends Path> p0);
    
    @NotNull
    Map<Path, T> provide(@NotNull final List<WindowedProvider.Window> p0, @NotNull final Set<? extends Path> p1);
}
