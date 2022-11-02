package gg.essential.lib.okhttp3.internal.connection;

import gg.essential.lib.okhttp3.*;
import gg.essential.lib.okhttp3.internal.http.*;
import java.io.*;

public final class ConnectInterceptor implements Interceptor
{
    public final OkHttpClient client;
    
    public ConnectInterceptor(final OkHttpClient client) {
        super();
        this.client = client;
    }
    
    @Override
    public Response intercept(final Chain chain) throws IOException {
        final RealInterceptorChain realChain = (RealInterceptorChain)chain;
        final Request request = realChain.request();
        final StreamAllocation streamAllocation = realChain.streamAllocation();
        final boolean doExtensiveHealthChecks = !request.method().equals("GET");
        final HttpCodec httpCodec = streamAllocation.newStream(this.client, chain, doExtensiveHealthChecks);
        final RealConnection connection = streamAllocation.connection();
        return realChain.proceed(request, streamAllocation, httpCodec, connection);
    }
}
