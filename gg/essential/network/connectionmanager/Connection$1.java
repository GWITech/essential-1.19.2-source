package gg.essential.network.connectionmanager;

import gg.essential.lib.caffeine.cache.*;
import org.apache.commons.lang3.tuple.*;
import java.util.function.*;
import java.util.*;
import gg.essential.connectionmanager.common.packet.*;
import org.jetbrains.annotations.*;

class Connection$1 implements Expiry<UUID, Pair<Long, Consumer<Optional<Packet>>>> {
    Connection$1() {
        super();
    }
    
    public long expireAfterCreate$3633b9f8(@NotNull final Pair<Long, Consumer<Optional<Packet>>> valueData) {
        return valueData.getKey();
    }
    
    public long expireAfterUpdate$6fbcf324(final long currentDuration) {
        return currentDuration;
    }
    
    public long expireAfterRead$6fbcf324(final long currentDuration) {
        return currentDuration;
    }
    
    @Override
    public /* bridge */ long expireAfterRead(@NotNull final Object o, @NotNull final Object o2, final long n, final long currentDuration) {
        return this.expireAfterRead$6fbcf324(currentDuration);
    }
    
    @Override
    public /* bridge */ long expireAfterUpdate(@NotNull final Object o, @NotNull final Object o2, final long n, final long currentDuration) {
        return this.expireAfterUpdate$6fbcf324(currentDuration);
    }
    
    @Override
    public /* bridge */ long expireAfterCreate(@NotNull final Object o, @NotNull final Object o2, final long n) {
        return this.expireAfterCreate$3633b9f8((Pair<Long, Consumer<Optional<Packet>>>)o2);
    }
}