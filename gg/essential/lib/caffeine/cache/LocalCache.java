package gg.essential.lib.caffeine.cache;

import gg.essential.lib.caffeine.cache.stats.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.*;

interface LocalCache<K, V> extends ConcurrentMap<K, V>
{
    boolean isRecordingStats();
    
    StatsCounter statsCounter();
    
    boolean hasRemovalListener();
    
    RemovalListener<K, V> removalListener();
    
    void notifyRemoval(final K p0, final V p1, final RemovalCause p2);
    
    Executor executor();
    
    boolean hasWriteTime();
    
    Ticker expirationTicker();
    
    Ticker statsTicker();
    
    long estimatedSize();
    
    V getIfPresent(final Object p0, final boolean p1);
    
    V getIfPresentQuietly(final Object p0, final long[] p1);
    
    Map<K, V> getAllPresent(final Iterable<?> p0);
    
    V put(final K p0, final V p1, final boolean p2);
    
    default V compute(final K key, final BiFunction<? super K, ? super V, ? extends V> remappingFunction) {
        return this.compute(key, remappingFunction, false, true, true);
    }
    
    V compute(final K p0, final BiFunction<? super K, ? super V, ? extends V> p1, final boolean p2, final boolean p3, final boolean p4);
    
    default V computeIfAbsent(final K key, final Function<? super K, ? extends V> mappingFunction) {
        return this.computeIfAbsent(key, mappingFunction, true, true);
    }
    
    V computeIfAbsent(final K p0, final Function<? super K, ? extends V> p1, final boolean p2, final boolean p3);
    
    default void invalidateAll(final Iterable<?> keys) {
        for (final Object key : keys) {
            this.remove(key);
        }
    }
    
    void cleanUp();
    
    default <T, R> Function<? super T, ? extends R> statsAware(final Function<? super T, ? extends R> mappingFunction, final boolean recordLoad) {
        if (!this.isRecordingStats()) {
            return mappingFunction;
        }
        return (Function<? super T, ? extends R>)(key -> {
            this.statsCounter().recordMisses(1);
            final long startTime = this.statsTicker().read();
            Object value;
            try {
                value = mappingFunction.apply(key);
            }
            catch (final RuntimeException | Error e) {
                this.statsCounter().recordLoadFailure(this.statsTicker().read() - startTime);
                throw e;
            }
            final long loadTime = this.statsTicker().read() - startTime;
            if (recordLoad) {
                if (value == null) {
                    this.statsCounter().recordLoadFailure(loadTime);
                }
                else {
                    this.statsCounter().recordLoadSuccess(loadTime);
                }
            }
            return value;
        });
    }
    
    default <T, U, R> BiFunction<? super T, ? super U, ? extends R> statsAware(final BiFunction<? super T, ? super U, ? extends R> remappingFunction) {
        return (BiFunction<? super T, ? super U, ? extends R>)this.statsAware((BiFunction<? super Object, ? super Object, ?>)remappingFunction, true, true, true);
    }
    
    default <T, U, R> BiFunction<? super T, ? super U, ? extends R> statsAware(final BiFunction<? super T, ? super U, ? extends R> remappingFunction, final boolean recordMiss, final boolean recordLoad, final boolean recordLoadFailure) {
        if (!this.isRecordingStats()) {
            return remappingFunction;
        }
        return (BiFunction<? super T, ? super U, ? extends R>)((t, u) -> {
            if (u == null && recordMiss) {
                this.statsCounter().recordMisses(1);
            }
            final long startTime = this.statsTicker().read();
            Object result;
            try {
                result = remappingFunction.apply(t, u);
            }
            catch (final RuntimeException | Error e) {
                if (recordLoadFailure) {
                    this.statsCounter().recordLoadFailure(this.statsTicker().read() - startTime);
                }
                throw e;
            }
            final long loadTime = this.statsTicker().read() - startTime;
            if (recordLoad) {
                if (result == null) {
                    this.statsCounter().recordLoadFailure(loadTime);
                }
                else {
                    this.statsCounter().recordLoadSuccess(loadTime);
                }
            }
            return result;
        });
    }
    
    default /* synthetic */ Object lambda$statsAware$1(final boolean recordMiss, final BiFunction remappingFunction, final boolean recordLoadFailure, final boolean recordLoad, final Object t, final Object u) {
        if (u == null && recordMiss) {
            this.statsCounter().recordMisses(1);
        }
        final long startTime = this.statsTicker().read();
        Object result;
        try {
            result = remappingFunction.apply(t, u);
        }
        catch (final RuntimeException | Error e) {
            if (recordLoadFailure) {
                this.statsCounter().recordLoadFailure(this.statsTicker().read() - startTime);
            }
            throw e;
        }
        final long loadTime = this.statsTicker().read() - startTime;
        if (recordLoad) {
            if (result == null) {
                this.statsCounter().recordLoadFailure(loadTime);
            }
            else {
                this.statsCounter().recordLoadSuccess(loadTime);
            }
        }
        return result;
    }
    
    default /* synthetic */ Object lambda$statsAware$0(final Function mappingFunction, final boolean recordLoad, final Object key) {
        this.statsCounter().recordMisses(1);
        final long startTime = this.statsTicker().read();
        Object value;
        try {
            value = mappingFunction.apply(key);
        }
        catch (final RuntimeException | Error e) {
            this.statsCounter().recordLoadFailure(this.statsTicker().read() - startTime);
            throw e;
        }
        final long loadTime = this.statsTicker().read() - startTime;
        if (recordLoad) {
            if (value == null) {
                this.statsCounter().recordLoadFailure(loadTime);
            }
            else {
                this.statsCounter().recordLoadSuccess(loadTime);
            }
        }
        return value;
    }
}
