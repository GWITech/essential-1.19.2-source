package gg.essential.lib.okhttp3.internal.cache;

import java.io.*;
import gg.essential.lib.okhttp3.internal.http.*;
import gg.essential.lib.okio.*;
import gg.essential.lib.okhttp3.*;
import gg.essential.lib.okhttp3.internal.*;

public final class CacheInterceptor implements Interceptor
{
    final InternalCache cache;
    
    public CacheInterceptor(final InternalCache cache) {
        super();
        this.cache = cache;
    }
    
    @Override
    public Response intercept(final Chain chain) throws IOException {
        Response get$75562139;
        if (this.cache != null) {
            final InternalCache cache = this.cache;
            chain.request();
            get$75562139 = cache.get$75562139();
        }
        else {
            get$75562139 = null;
        }
        final Response cacheCandidate = get$75562139;
        final long now = System.currentTimeMillis();
        final CacheStrategy strategy = new CacheStrategy.Factory(now, chain.request(), cacheCandidate).get();
        final Request networkRequest = strategy.networkRequest;
        final Response cacheResponse = strategy.cacheResponse;
        if (cacheCandidate != null && cacheResponse == null) {
            Util.closeQuietly(cacheCandidate.body());
        }
        if (networkRequest == null && cacheResponse == null) {
            return new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
        }
        if (networkRequest == null) {
            return cacheResponse.newBuilder().cacheResponse(stripBody(cacheResponse)).build();
        }
        Response networkResponse = null;
        try {
            networkResponse = chain.proceed(networkRequest);
        }
        finally {
            if (networkResponse == null && cacheCandidate != null) {
                Util.closeQuietly(cacheCandidate.body());
            }
        }
        if (cacheResponse != null) {
            if (networkResponse.code() == 304) {
                final Response response = cacheResponse.newBuilder().headers(combine(cacheResponse.headers(), networkResponse.headers())).sentRequestAtMillis(networkResponse.sentRequestAtMillis()).receivedResponseAtMillis(networkResponse.receivedResponseAtMillis()).cacheResponse(stripBody(cacheResponse)).networkResponse(stripBody(networkResponse)).build();
                networkResponse.body().close();
                return response;
            }
            Util.closeQuietly(cacheResponse.body());
        }
        final Response response = networkResponse.newBuilder().cacheResponse(stripBody(cacheResponse)).networkResponse(stripBody(networkResponse)).build();
        if (this.cache != null) {
            if (HttpHeaders.hasBody(response) && CacheStrategy.isCacheable(response, networkRequest)) {
                final CacheRequest cacheRequest = this.cache.put$cd4e278();
                return this.cacheWritingResponse(cacheRequest, response);
            }
            HttpMethod.invalidatesCache(networkRequest.method());
        }
        return response;
    }
    
    private static Response stripBody(final Response response) {
        return (response != null && response.body() != null) ? response.newBuilder().body(null).build() : response;
    }
    
    private Response cacheWritingResponse(final CacheRequest cacheRequest, final Response response) throws IOException {
        if (cacheRequest == null) {
            return response;
        }
        final Sink cacheBodyUnbuffered = cacheRequest.body();
        if (cacheBodyUnbuffered == null) {
            return response;
        }
        final BufferedSource source = response.body().source();
        final BufferedSink cacheBody = Okio.buffer(cacheBodyUnbuffered);
        final Source cacheWritingSource = (Source)new CacheInterceptor.CacheInterceptor$1(source, cacheBody);
        final String contentType = response.header("Content-Type");
        final long contentLength = response.body().contentLength();
        return response.newBuilder().body(new RealResponseBody(contentType, contentLength, Okio.buffer(cacheWritingSource))).build();
    }
    
    private static Headers combine(final Headers cachedHeaders, final Headers networkHeaders) {
        final Headers.Builder result = new Headers.Builder();
        for (int i = 0, size = cachedHeaders.size(); i < size; ++i) {
            final String fieldName = cachedHeaders.name(i);
            final String value = cachedHeaders.value(i);
            if (!"Warning".equalsIgnoreCase(fieldName) || !value.startsWith("1")) {
                if (!isEndToEnd(fieldName) || networkHeaders.get(fieldName) == null) {
                    Internal.instance.addLenient(result, fieldName, value);
                }
            }
        }
        for (int i = 0, size = networkHeaders.size(); i < size; ++i) {
            final String fieldName = networkHeaders.name(i);
            if (!"Content-Length".equalsIgnoreCase(fieldName)) {
                if (isEndToEnd(fieldName)) {
                    Internal.instance.addLenient(result, fieldName, networkHeaders.value(i));
                }
            }
        }
        return result.build();
    }
    
    static boolean isEndToEnd(final String fieldName) {
        return !"Connection".equalsIgnoreCase(fieldName) && !"Keep-Alive".equalsIgnoreCase(fieldName) && !"Proxy-Authenticate".equalsIgnoreCase(fieldName) && !"Proxy-Authorization".equalsIgnoreCase(fieldName) && !"TE".equalsIgnoreCase(fieldName) && !"Trailers".equalsIgnoreCase(fieldName) && !"Transfer-Encoding".equalsIgnoreCase(fieldName) && !"Upgrade".equalsIgnoreCase(fieldName);
    }
}
