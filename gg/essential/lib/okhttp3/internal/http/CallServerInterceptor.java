package gg.essential.lib.okhttp3.internal.http;

import gg.essential.lib.okhttp3.internal.*;
import java.net.*;
import gg.essential.lib.okhttp3.internal.connection.*;
import gg.essential.lib.okhttp3.*;
import gg.essential.lib.okio.*;
import java.io.*;

public final class CallServerInterceptor implements Interceptor
{
    private final boolean forWebSocket;
    
    public CallServerInterceptor(final boolean forWebSocket) {
        super();
        this.forWebSocket = forWebSocket;
    }
    
    @Override
    public Response intercept(final Chain chain) throws IOException {
        final RealInterceptorChain realChain = (RealInterceptorChain)chain;
        final HttpCodec httpCodec = realChain.httpStream();
        final StreamAllocation streamAllocation = realChain.streamAllocation();
        final RealConnection connection = (RealConnection)realChain.connection();
        final Request request = realChain.request();
        final long sentRequestMillis = System.currentTimeMillis();
        realChain.eventListener();
        realChain.call();
        httpCodec.writeRequestHeaders(request);
        realChain.eventListener();
        realChain.call();
        Response.Builder responseBuilder = null;
        if (HttpMethod.permitsRequestBody(request.method()) && request.body() != null) {
            if ("100-continue".equalsIgnoreCase(request.header("Expect"))) {
                httpCodec.flushRequest();
                realChain.eventListener();
                realChain.call();
                responseBuilder = httpCodec.readResponseHeaders(true);
            }
            if (responseBuilder == null) {
                realChain.eventListener();
                realChain.call();
                final long contentLength = request.body().contentLength();
                final CallServerInterceptor.CountingSink requestBodyOut = new CallServerInterceptor.CountingSink(httpCodec.createRequestBody(request, contentLength));
                final BufferedSink bufferedRequestBody = Okio.buffer((Sink)requestBodyOut);
                request.body().writeTo(bufferedRequestBody);
                bufferedRequestBody.close();
                realChain.eventListener();
                realChain.call();
            }
            else if (!connection.isMultiplexed()) {
                streamAllocation.noNewStreams();
            }
        }
        httpCodec.finishRequest();
        if (responseBuilder == null) {
            realChain.eventListener();
            realChain.call();
            responseBuilder = httpCodec.readResponseHeaders(false);
        }
        Response response = responseBuilder.request(request).handshake(streamAllocation.connection().handshake()).sentRequestAtMillis(sentRequestMillis).receivedResponseAtMillis(System.currentTimeMillis()).build();
        realChain.eventListener();
        realChain.call();
        final int code = response.code();
        if (this.forWebSocket && code == 101) {
            response = response.newBuilder().body(Util.EMPTY_RESPONSE).build();
        }
        else {
            response = response.newBuilder().body(httpCodec.openResponseBody(response)).build();
        }
        if ("close".equalsIgnoreCase(response.request().header("Connection")) || "close".equalsIgnoreCase(response.header("Connection"))) {
            streamAllocation.noNewStreams();
        }
        if ((code == 204 || code == 205) && response.body().contentLength() > 0L) {
            throw new ProtocolException("HTTP " + code + " had non-zero Content-Length: " + response.body().contentLength());
        }
        return response;
    }
}
