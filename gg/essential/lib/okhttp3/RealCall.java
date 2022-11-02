package gg.essential.lib.okhttp3;

import java.io.*;
import gg.essential.lib.okhttp3.internal.platform.*;
import gg.essential.lib.okhttp3.internal.cache.*;
import gg.essential.lib.okhttp3.internal.http.*;
import gg.essential.lib.okhttp3.internal.connection.*;
import java.util.*;

final class RealCall implements Call
{
    final OkHttpClient client;
    final RetryAndFollowUpInterceptor retryAndFollowUpInterceptor;
    private EventListener eventListener;
    final Request originalRequest;
    final boolean forWebSocket;
    private boolean executed;
    
    private RealCall(final OkHttpClient client, final Request originalRequest, final boolean forWebSocket) {
        super();
        this.client = client;
        this.originalRequest = originalRequest;
        this.forWebSocket = forWebSocket;
        this.retryAndFollowUpInterceptor = new RetryAndFollowUpInterceptor(client, forWebSocket);
    }
    
    static RealCall newRealCall(final OkHttpClient client, final Request originalRequest, final boolean forWebSocket) {
        final RealCall call = new RealCall(client, originalRequest, forWebSocket);
        call.eventListener = client.eventListenerFactory().create$a995d89();
        return call;
    }
    
    @Override
    public Response execute() throws IOException {
        synchronized (this) {
            if (this.executed) {
                throw new IllegalStateException("Already Executed");
            }
            this.executed = true;
        }
        this.captureCallStackTrace();
        try {
            this.client.dispatcher().executed(this);
            final Response result = this.getResponseWithInterceptorChain();
            if (result == null) {
                throw new IOException("Canceled");
            }
            return result;
        }
        catch (final IOException e) {
            throw e;
        }
        finally {
            this.client.dispatcher().finished(this);
        }
    }
    
    private void captureCallStackTrace() {
        final Object callStackTrace = Platform.get().getStackTraceForCloseable("response.body().close()");
        this.retryAndFollowUpInterceptor.setCallStackTrace(callStackTrace);
    }
    
    public boolean isCanceled() {
        return this.retryAndFollowUpInterceptor.isCanceled();
    }
    
    public RealCall clone() {
        return newRealCall(this.client, this.originalRequest, this.forWebSocket);
    }
    
    String toLoggableString() {
        return (this.isCanceled() ? "canceled " : "") + (this.forWebSocket ? "web socket" : "call") + " to " + this.redactedUrl();
    }
    
    String redactedUrl() {
        return this.originalRequest.url().redact();
    }
    
    Response getResponseWithInterceptorChain() throws IOException {
        final List<Interceptor> interceptors = new ArrayList<Interceptor>();
        interceptors.addAll(this.client.interceptors());
        interceptors.add(this.retryAndFollowUpInterceptor);
        interceptors.add(new BridgeInterceptor(this.client.cookieJar()));
        interceptors.add(new CacheInterceptor(this.client.internalCache()));
        interceptors.add(new ConnectInterceptor(this.client));
        if (!this.forWebSocket) {
            interceptors.addAll(this.client.networkInterceptors());
        }
        interceptors.add(new CallServerInterceptor(this.forWebSocket));
        final Interceptor.Chain chain = new RealInterceptorChain(interceptors, null, null, null, 0, this.originalRequest, this, this.eventListener, this.client.connectTimeoutMillis(), this.client.readTimeoutMillis(), this.client.writeTimeoutMillis());
        return chain.proceed(this.originalRequest);
    }
    
    public /* bridge */ Object clone() throws CloneNotSupportedException {
        return this.clone();
    }
    
    static /* synthetic */ EventListener access$000(final RealCall x0) {
        return x0.eventListener;
    }
}
