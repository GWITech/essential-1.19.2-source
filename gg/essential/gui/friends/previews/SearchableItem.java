package gg.essential.gui.friends.previews;

import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00f8\u0001\u0000\u0082\u0002\u0006
                                                   \u0004\b!0\u0001¨\u0006\u0004\u00c0\u0006\u0001""" }, d2 = { "Lgg/essential/gui/friends/previews/SearchableItem;", "", "getSearchTag", "", "essential" })
public interface SearchableItem
{
    @NotNull
    String getSearchTag();
}
