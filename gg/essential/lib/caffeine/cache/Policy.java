package gg.essential.lib.caffeine.cache;

import com.google.errorprone.annotations.*;
import java.util.*;

public interface Policy<K, V>
{
    boolean isRecordingStats();
    
    default V getIfPresentQuietly(@CompatibleWith("K") final Object key) {
        throw new UnsupportedOperationException();
    }
    
    Optional<Policy.Eviction<K, V>> eviction();
    
    Optional<Policy.Expiration<K, V>> expireAfterAccess();
    
    Optional<Policy.Expiration<K, V>> expireAfterWrite();
    
    default Optional<Policy.VarExpiration<K, V>> expireVariably() {
        return Optional.empty();
    }
    
    Optional<Policy.Expiration<K, V>> refreshAfterWrite();
}
