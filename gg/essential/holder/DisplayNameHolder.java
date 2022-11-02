package gg.essential.holder;

import java.util.*;
import org.jetbrains.annotations.*;

public interface DisplayNameHolder
{
    Map<String, String> getDisplayNames();
    
    @Nullable
    default String getDisplayName(@NotNull final String key) {
        return this.getDisplayNames().get(key);
    }
}
