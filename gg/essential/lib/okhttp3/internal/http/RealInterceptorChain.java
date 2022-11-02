package gg.essential.lib.okhttp3.internal.http;

import java.util.*;
import gg.essential.lib.okhttp3.internal.connection.*;
import gg.essential.lib.okhttp3.*;
import java.io.*;

public final class RealInterceptorChain implements Interceptor.Chain
{
    private final List<Interceptor> interceptors;
    private final StreamAllocation streamAllocation;
    private final HttpCodec httpCodec;
    private final RealConnection connection;
    private final int index;
    private final Request request;
    private final Call call;
    private final EventListener eventListener;
    private final int connectTimeout;
    private final int readTimeout;
    private final int writeTimeout;
    private int calls;
    
    public RealInterceptorChain(final List<Interceptor> interceptors, final StreamAllocation streamAllocation, final HttpCodec httpCodec, final RealConnection connection, final int index, final Request request, final Call call, final EventListener eventListener, final int connectTimeout, final int readTimeout, final int writeTimeout) {
        super();
        this.interceptors = interceptors;
        this.connection = connection;
        this.streamAllocation = streamAllocation;
        this.httpCodec = httpCodec;
        this.index = index;
        this.request = request;
        this.call = call;
        this.eventListener = eventListener;
        this.connectTimeout = connectTimeout;
        this.readTimeout = readTimeout;
        this.writeTimeout = writeTimeout;
    }
    
    public Connection connection() {
        return this.connection;
    }
    
    @Override
    public int connectTimeoutMillis() {
        return this.connectTimeout;
    }
    
    @Override
    public int readTimeoutMillis() {
        return this.readTimeout;
    }
    
    @Override
    public int writeTimeoutMillis() {
        return this.writeTimeout;
    }
    
    public StreamAllocation streamAllocation() {
        return this.streamAllocation;
    }
    
    public HttpCodec httpStream() {
        return this.httpCodec;
    }
    
    public Call call() {
        return this.call;
    }
    
    public EventListener eventListener() {
        return this.eventListener;
    }
    
    @Override
    public Request request() {
        return this.request;
    }
    
    @Override
    public Response proceed(final Request request) throws IOException {
        return this.proceed(request, this.streamAllocation, this.httpCodec, this.connection);
    }
    
    public Response proceed(final Request request, final StreamAllocation streamAllocation, final HttpCodec httpCodec, final RealConnection connection) throws IOException {
        if (this.index >= this.interceptors.size()) {
            throw new AssertionError();
        }
        ++this.calls;
        if (this.httpCodec != null && !this.connection.supportsUrl(request.url())) {
            throw new IllegalStateException("network interceptor " + this.interceptors.get(this.index - 1) + " must retain the same host and port");
        }
        if (this.httpCodec != null && this.calls > 1) {
            throw new IllegalStateException("network interceptor " + this.interceptors.get(this.index - 1) + " must call proceed() exactly once");
        }
        final RealInterceptorChain next = new RealInterceptorChain(this.interceptors, streamAllocation, httpCodec, connection, this.index + 1, request, this.call, this.eventListener, this.connectTimeout, this.readTimeout, this.writeTimeout);
        final Interceptor interceptor = this.interceptors.get(this.index);
        final Response response = interceptor.intercept(next);
        if (httpCodec != null && this.index + 1 < this.interceptors.size() && next.calls != 1) {
            throw new IllegalStateException("network interceptor " + interceptor + " must call proceed() exactly once");
        }
        if (response == null) {
            throw new NullPointerException("interceptor " + interceptor + " returned null");
        }
        if (response.body() == null) {
            throw new IllegalStateException("interceptor " + interceptor + " returned a response with no body");
        }
        return response;
    }
}
