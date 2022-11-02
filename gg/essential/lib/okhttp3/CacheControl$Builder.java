package gg.essential.lib.okhttp3;

import java.util.concurrent.*;

public static final class Builder
{
    boolean noCache;
    int maxAgeSeconds;
    int maxStaleSeconds;
    int minFreshSeconds;
    boolean onlyIfCached;
    
    public Builder() {
        super();
        this.maxAgeSeconds = -1;
        this.maxStaleSeconds = -1;
        this.minFreshSeconds = -1;
    }
    
    public Builder noCache() {
        this.noCache = true;
        return this;
    }
    
    public Builder maxStale$34ddbef7(final TimeUnit timeUnit) {
        final long maxStaleSecondsLong = timeUnit.toSeconds(2147483647L);
        this.maxStaleSeconds = ((maxStaleSecondsLong > 2147483647L) ? Integer.MAX_VALUE : ((int)maxStaleSecondsLong));
        return this;
    }
    
    public Builder onlyIfCached() {
        this.onlyIfCached = true;
        return this;
    }
    
    public CacheControl build() {
        return new CacheControl(this);
    }
}
