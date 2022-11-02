package gg.essential.lib.okhttp3.internal.http2;

import gg.essential.lib.okhttp3.internal.connection.*;
import java.util.concurrent.*;
import java.io.*;
import java.util.*;
import java.net.*;
import gg.essential.lib.okhttp3.*;
import gg.essential.lib.okhttp3.internal.http.*;
import gg.essential.lib.okhttp3.internal.*;
import gg.essential.lib.okio.*;

public final class Http2Codec implements HttpCodec
{
    private static final ByteString CONNECTION;
    private static final ByteString HOST;
    private static final ByteString KEEP_ALIVE;
    private static final ByteString PROXY_CONNECTION;
    private static final ByteString TRANSFER_ENCODING;
    private static final ByteString TE;
    private static final ByteString ENCODING;
    private static final ByteString UPGRADE;
    private static final List<ByteString> HTTP_2_SKIPPED_REQUEST_HEADERS;
    private static final List<ByteString> HTTP_2_SKIPPED_RESPONSE_HEADERS;
    private final Interceptor.Chain chain;
    final StreamAllocation streamAllocation;
    private final Http2Connection connection;
    private Http2Stream stream;
    
    public Http2Codec(final Interceptor.Chain chain, final StreamAllocation streamAllocation, final Http2Connection connection) {
        super();
        this.chain = chain;
        this.streamAllocation = streamAllocation;
        this.connection = connection;
    }
    
    @Override
    public Sink createRequestBody(final Request request, final long contentLength) {
        return this.stream.getSink();
    }
    
    @Override
    public void writeRequestHeaders(final Request request) throws IOException {
        if (this.stream != null) {
            return;
        }
        final boolean hasRequestBody = request.body() != null;
        final List<Header> requestHeaders = http2HeadersList(request);
        this.stream = this.connection.newStream(requestHeaders, hasRequestBody);
        this.stream.readTimeout().timeout(this.chain.readTimeoutMillis(), TimeUnit.MILLISECONDS);
        this.stream.writeTimeout().timeout(this.chain.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
    }
    
    @Override
    public void flushRequest() throws IOException {
        this.connection.flush();
    }
    
    @Override
    public void finishRequest() throws IOException {
        this.stream.getSink().close();
    }
    
    @Override
    public Response.Builder readResponseHeaders(final boolean expectContinue) throws IOException {
        final List<Header> headers = this.stream.takeResponseHeaders();
        final Response.Builder responseBuilder = readHttp2HeadersList(headers);
        if (expectContinue && Internal.instance.code(responseBuilder) == 100) {
            return null;
        }
        return responseBuilder;
    }
    
    public static List<Header> http2HeadersList(final Request request) {
        final Headers headers = request.headers();
        final List<Header> result = new ArrayList<Header>(headers.size() + 4);
        result.add(new Header(Header.TARGET_METHOD, request.method()));
        result.add(new Header(Header.TARGET_PATH, RequestLine.requestPath(request.url())));
        final String host = request.header("Host");
        if (host != null) {
            result.add(new Header(Header.TARGET_AUTHORITY, host));
        }
        result.add(new Header(Header.TARGET_SCHEME, request.url().scheme()));
        for (int i = 0, size = headers.size(); i < size; ++i) {
            final ByteString name = ByteString.encodeUtf8(headers.name(i).toLowerCase(Locale.US));
            if (!Http2Codec.HTTP_2_SKIPPED_REQUEST_HEADERS.contains(name)) {
                result.add(new Header(name, headers.value(i)));
            }
        }
        return result;
    }
    
    public static Response.Builder readHttp2HeadersList(final List<Header> headerBlock) throws IOException {
        StatusLine statusLine = null;
        Headers.Builder headersBuilder = new Headers.Builder();
        for (int i = 0, size = headerBlock.size(); i < size; ++i) {
            final Header header = headerBlock.get(i);
            if (header == null) {
                if (statusLine != null && statusLine.code == 100) {
                    statusLine = null;
                    headersBuilder = new Headers.Builder();
                }
            }
            else {
                final ByteString name = header.name;
                final String value = header.value.utf8();
                if (name.equals(Header.RESPONSE_STATUS)) {
                    statusLine = StatusLine.parse("HTTP/1.1 " + value);
                }
                else if (!Http2Codec.HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(name)) {
                    Internal.instance.addLenient(headersBuilder, name.utf8(), value);
                }
            }
        }
        if (statusLine == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        return new Response.Builder().protocol(Protocol.HTTP_2).code(statusLine.code).message(statusLine.message).headers(headersBuilder.build());
    }
    
    @Override
    public ResponseBody openResponseBody(final Response response) throws IOException {
        final String contentType = response.header("Content-Type");
        final long contentLength = HttpHeaders.contentLength(response);
        final Source source = new StreamFinishingSource(this.stream.getSource());
        return new RealResponseBody(contentType, contentLength, Okio.buffer(source));
    }
    
    static {
        CONNECTION = ByteString.encodeUtf8("connection");
        HOST = ByteString.encodeUtf8("host");
        KEEP_ALIVE = ByteString.encodeUtf8("keep-alive");
        PROXY_CONNECTION = ByteString.encodeUtf8("proxy-connection");
        TRANSFER_ENCODING = ByteString.encodeUtf8("transfer-encoding");
        TE = ByteString.encodeUtf8("te");
        ENCODING = ByteString.encodeUtf8("encoding");
        UPGRADE = ByteString.encodeUtf8("upgrade");
        HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableList(Http2Codec.CONNECTION, Http2Codec.HOST, Http2Codec.KEEP_ALIVE, Http2Codec.PROXY_CONNECTION, Http2Codec.TE, Http2Codec.TRANSFER_ENCODING, Http2Codec.ENCODING, Http2Codec.UPGRADE, Header.TARGET_METHOD, Header.TARGET_PATH, Header.TARGET_SCHEME, Header.TARGET_AUTHORITY);
        HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableList(Http2Codec.CONNECTION, Http2Codec.HOST, Http2Codec.KEEP_ALIVE, Http2Codec.PROXY_CONNECTION, Http2Codec.TE, Http2Codec.TRANSFER_ENCODING, Http2Codec.ENCODING, Http2Codec.UPGRADE);
    }
    
    class StreamFinishingSource extends ForwardingSource
    {
        boolean completed;
        long bytesRead;
        final /* synthetic */ Http2Codec this$0;
        
        StreamFinishingSource(final Http2Codec this$0, final Source delegate) {
            this.this$0 = this$0;
            super(delegate);
            this.completed = false;
            this.bytesRead = 0L;
        }
        
        @Override
        public long read(final Buffer sink, final long byteCount) throws IOException {
            try {
                final long read = this.delegate().read(sink, byteCount);
                if (read > 0L) {
                    this.bytesRead += read;
                }
                return read;
            }
            catch (final IOException e) {
                this.endOfInput$8ec0fdf();
                throw e;
            }
        }
        
        @Override
        public void close() throws IOException {
            super.close();
            this.endOfInput$8ec0fdf();
        }
        
        private void endOfInput$8ec0fdf() {
            if (this.completed) {
                return;
            }
            this.completed = true;
            this.this$0.streamAllocation.streamFinished$50294127(false, this.this$0);
        }
    }
}
