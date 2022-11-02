package gg.essential.lib.okhttp3;

import javax.annotation.*;
import gg.essential.lib.okhttp3.internal.http.*;
import java.util.concurrent.*;

public final class CacheControl
{
    private final boolean noCache;
    private final boolean noStore;
    private final int maxAgeSeconds;
    private final int sMaxAgeSeconds;
    private final boolean isPrivate;
    private final boolean isPublic;
    private final boolean mustRevalidate;
    private final int maxStaleSeconds;
    private final int minFreshSeconds;
    private final boolean onlyIfCached;
    private final boolean noTransform;
    private final boolean immutable;
    @Nullable
    String headerValue;
    
    private CacheControl(final boolean noCache, final boolean noStore, final int maxAgeSeconds, final int sMaxAgeSeconds, final boolean isPrivate, final boolean isPublic, final boolean mustRevalidate, final int maxStaleSeconds, final int minFreshSeconds, final boolean onlyIfCached, final boolean noTransform, final boolean immutable, @Nullable final String headerValue) {
        super();
        this.noCache = noCache;
        this.noStore = noStore;
        this.maxAgeSeconds = maxAgeSeconds;
        this.sMaxAgeSeconds = sMaxAgeSeconds;
        this.isPrivate = isPrivate;
        this.isPublic = isPublic;
        this.mustRevalidate = mustRevalidate;
        this.maxStaleSeconds = maxStaleSeconds;
        this.minFreshSeconds = minFreshSeconds;
        this.onlyIfCached = onlyIfCached;
        this.noTransform = noTransform;
        this.immutable = immutable;
        this.headerValue = headerValue;
    }
    
    CacheControl(final Builder builder) {
        super();
        this.noCache = builder.noCache;
        this.noStore = false;
        this.maxAgeSeconds = builder.maxAgeSeconds;
        this.sMaxAgeSeconds = -1;
        this.isPrivate = false;
        this.isPublic = false;
        this.mustRevalidate = false;
        this.maxStaleSeconds = builder.maxStaleSeconds;
        this.minFreshSeconds = builder.minFreshSeconds;
        this.onlyIfCached = builder.onlyIfCached;
        this.noTransform = false;
        this.immutable = false;
    }
    
    public boolean noCache() {
        return this.noCache;
    }
    
    public boolean noStore() {
        return this.noStore;
    }
    
    public int maxAgeSeconds() {
        return this.maxAgeSeconds;
    }
    
    public boolean isPrivate() {
        return this.isPrivate;
    }
    
    public boolean isPublic() {
        return this.isPublic;
    }
    
    public boolean mustRevalidate() {
        return this.mustRevalidate;
    }
    
    public int maxStaleSeconds() {
        return this.maxStaleSeconds;
    }
    
    public int minFreshSeconds() {
        return this.minFreshSeconds;
    }
    
    public boolean onlyIfCached() {
        return this.onlyIfCached;
    }
    
    public boolean immutable() {
        return this.immutable;
    }
    
    public static CacheControl parse(final Headers headers) {
        boolean noCache = false;
        boolean noStore = false;
        int maxAgeSeconds = -1;
        int sMaxAgeSeconds = -1;
        boolean isPrivate = false;
        boolean isPublic = false;
        boolean mustRevalidate = false;
        int maxStaleSeconds = -1;
        int minFreshSeconds = -1;
        boolean onlyIfCached = false;
        boolean noTransform = false;
        boolean immutable = false;
        boolean canUseHeaderValue = true;
        String headerValue = null;
        for (int i = 0, size = headers.size(); i < size; ++i) {
            final String name = headers.name(i);
            final String value = headers.value(i);
            if (name.equalsIgnoreCase("Cache-Control")) {
                if (headerValue != null) {
                    canUseHeaderValue = false;
                }
                else {
                    headerValue = value;
                }
            }
            else {
                if (!name.equalsIgnoreCase("Pragma")) {
                    continue;
                }
                canUseHeaderValue = false;
            }
            int pos = 0;
            while (pos < value.length()) {
                final int tokenStart = pos;
                pos = HttpHeaders.skipUntil(value, pos, "=,;");
                final String directive = value.substring(tokenStart, pos).trim();
                String parameter;
                if (pos == value.length() || value.charAt(pos) == ',' || value.charAt(pos) == ';') {
                    ++pos;
                    parameter = null;
                }
                else {
                    ++pos;
                    pos = HttpHeaders.skipWhitespace(value, pos);
                    if (pos < value.length() && value.charAt(pos) == '\"') {
                        final int parameterStart = ++pos;
                        pos = HttpHeaders.skipUntil(value, pos, "\"");
                        parameter = value.substring(parameterStart, pos);
                        ++pos;
                    }
                    else {
                        final int parameterStart = pos;
                        pos = HttpHeaders.skipUntil(value, pos, ",;");
                        parameter = value.substring(parameterStart, pos).trim();
                    }
                }
                if ("no-cache".equalsIgnoreCase(directive)) {
                    noCache = true;
                }
                else if ("no-store".equalsIgnoreCase(directive)) {
                    noStore = true;
                }
                else if ("max-age".equalsIgnoreCase(directive)) {
                    maxAgeSeconds = HttpHeaders.parseSeconds(parameter, -1);
                }
                else if ("s-maxage".equalsIgnoreCase(directive)) {
                    sMaxAgeSeconds = HttpHeaders.parseSeconds(parameter, -1);
                }
                else if ("private".equalsIgnoreCase(directive)) {
                    isPrivate = true;
                }
                else if ("public".equalsIgnoreCase(directive)) {
                    isPublic = true;
                }
                else if ("must-revalidate".equalsIgnoreCase(directive)) {
                    mustRevalidate = true;
                }
                else if ("max-stale".equalsIgnoreCase(directive)) {
                    maxStaleSeconds = HttpHeaders.parseSeconds(parameter, Integer.MAX_VALUE);
                }
                else if ("min-fresh".equalsIgnoreCase(directive)) {
                    minFreshSeconds = HttpHeaders.parseSeconds(parameter, -1);
                }
                else if ("only-if-cached".equalsIgnoreCase(directive)) {
                    onlyIfCached = true;
                }
                else if ("no-transform".equalsIgnoreCase(directive)) {
                    noTransform = true;
                }
                else {
                    if (!"immutable".equalsIgnoreCase(directive)) {
                        continue;
                    }
                    immutable = true;
                }
            }
        }
        if (!canUseHeaderValue) {
            headerValue = null;
        }
        return new CacheControl(noCache, noStore, maxAgeSeconds, sMaxAgeSeconds, isPrivate, isPublic, mustRevalidate, maxStaleSeconds, minFreshSeconds, onlyIfCached, noTransform, immutable, headerValue);
    }
    
    @Override
    public String toString() {
        final String result = this.headerValue;
        return (result != null) ? result : (this.headerValue = this.headerValue());
    }
    
    private String headerValue() {
        final StringBuilder result = new StringBuilder();
        if (this.noCache) {
            result.append("no-cache, ");
        }
        if (this.noStore) {
            result.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            result.append("max-age=").append(this.maxAgeSeconds).append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            result.append("s-maxage=").append(this.sMaxAgeSeconds).append(", ");
        }
        if (this.isPrivate) {
            result.append("private, ");
        }
        if (this.isPublic) {
            result.append("public, ");
        }
        if (this.mustRevalidate) {
            result.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            result.append("max-stale=").append(this.maxStaleSeconds).append(", ");
        }
        if (this.minFreshSeconds != -1) {
            result.append("min-fresh=").append(this.minFreshSeconds).append(", ");
        }
        if (this.onlyIfCached) {
            result.append("only-if-cached, ");
        }
        if (this.noTransform) {
            result.append("no-transform, ");
        }
        if (this.immutable) {
            result.append("immutable, ");
        }
        if (result.length() == 0) {
            return "";
        }
        result.delete(result.length() - 2, result.length());
        return result.toString();
    }
    
    static {
        new Builder().noCache().build();
        new Builder().onlyIfCached().maxStale$34ddbef7(TimeUnit.SECONDS).build();
    }
    
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
}
