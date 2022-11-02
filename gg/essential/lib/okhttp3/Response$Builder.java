package gg.essential.lib.okhttp3;

import javax.annotation.*;

public static class Builder
{
    Request request;
    Protocol protocol;
    int code;
    String message;
    @Nullable
    Handshake handshake;
    Headers.Builder headers;
    ResponseBody body;
    Response networkResponse;
    Response cacheResponse;
    Response priorResponse;
    long sentRequestAtMillis;
    long receivedResponseAtMillis;
    
    public Builder() {
        super();
        this.code = -1;
        this.headers = new Headers.Builder();
    }
    
    Builder(final Response response) {
        super();
        this.code = -1;
        this.request = response.request;
        this.protocol = response.protocol;
        this.code = response.code;
        this.message = response.message;
        this.handshake = response.handshake;
        this.headers = response.headers.newBuilder();
        this.body = response.body;
        this.networkResponse = response.networkResponse;
        this.cacheResponse = response.cacheResponse;
        this.priorResponse = response.priorResponse;
        this.sentRequestAtMillis = response.sentRequestAtMillis;
        this.receivedResponseAtMillis = response.receivedResponseAtMillis;
    }
    
    public Builder request(final Request request) {
        this.request = request;
        return this;
    }
    
    public Builder protocol(final Protocol protocol) {
        this.protocol = protocol;
        return this;
    }
    
    public Builder code(final int code) {
        this.code = code;
        return this;
    }
    
    public Builder message(final String message) {
        this.message = message;
        return this;
    }
    
    public Builder handshake(@Nullable final Handshake handshake) {
        this.handshake = handshake;
        return this;
    }
    
    public Builder addHeader(final String name, final String value) {
        this.headers.add(name, value);
        return this;
    }
    
    public Builder headers(final Headers headers) {
        this.headers = headers.newBuilder();
        return this;
    }
    
    public Builder body(@Nullable final ResponseBody body) {
        this.body = body;
        return this;
    }
    
    public Builder networkResponse(@Nullable final Response networkResponse) {
        if (networkResponse != null) {
            this.checkSupportResponse("networkResponse", networkResponse);
        }
        this.networkResponse = networkResponse;
        return this;
    }
    
    public Builder cacheResponse(@Nullable final Response cacheResponse) {
        if (cacheResponse != null) {
            this.checkSupportResponse("cacheResponse", cacheResponse);
        }
        this.cacheResponse = cacheResponse;
        return this;
    }
    
    private void checkSupportResponse(final String name, final Response response) {
        if (response.body != null) {
            throw new IllegalArgumentException(name + ".body != null");
        }
        if (response.networkResponse != null) {
            throw new IllegalArgumentException(name + ".networkResponse != null");
        }
        if (response.cacheResponse != null) {
            throw new IllegalArgumentException(name + ".cacheResponse != null");
        }
        if (response.priorResponse != null) {
            throw new IllegalArgumentException(name + ".priorResponse != null");
        }
    }
    
    public Builder priorResponse(@Nullable final Response priorResponse) {
        if (priorResponse != null) {
            this.checkPriorResponse(priorResponse);
        }
        this.priorResponse = priorResponse;
        return this;
    }
    
    private void checkPriorResponse(final Response response) {
        if (response.body != null) {
            throw new IllegalArgumentException("priorResponse.body != null");
        }
    }
    
    public Builder sentRequestAtMillis(final long sentRequestAtMillis) {
        this.sentRequestAtMillis = sentRequestAtMillis;
        return this;
    }
    
    public Builder receivedResponseAtMillis(final long receivedResponseAtMillis) {
        this.receivedResponseAtMillis = receivedResponseAtMillis;
        return this;
    }
    
    public Response build() {
        if (this.request == null) {
            throw new IllegalStateException("request == null");
        }
        if (this.protocol == null) {
            throw new IllegalStateException("protocol == null");
        }
        if (this.code < 0) {
            throw new IllegalStateException("code < 0: " + this.code);
        }
        if (this.message == null) {
            throw new IllegalStateException("message == null");
        }
        return new Response(this);
    }
}
