package gg.essential.lib.okhttp3;

import javax.annotation.*;
import gg.essential.lib.okhttp3.internal.*;
import gg.essential.lib.okhttp3.internal.http.*;

public static class Builder
{
    HttpUrl url;
    String method;
    Headers.Builder headers;
    RequestBody body;
    Object tag;
    
    public Builder() {
        super();
        this.method = "GET";
        this.headers = new Headers.Builder();
    }
    
    Builder(final Request request) {
        super();
        this.url = request.url;
        this.method = request.method;
        this.body = request.body;
        this.tag = request.tag;
        this.headers = request.headers.newBuilder();
    }
    
    public Builder url(final HttpUrl url) {
        if (url == null) {
            throw new NullPointerException("url == null");
        }
        this.url = url;
        return this;
    }
    
    public Builder url(String url) {
        if (url == null) {
            throw new NullPointerException("url == null");
        }
        if (url.regionMatches(true, 0, "ws:", 0, 3)) {
            url = "http:" + url.substring(3);
        }
        else if (url.regionMatches(true, 0, "wss:", 0, 4)) {
            url = "https:" + url.substring(4);
        }
        final HttpUrl parsed = HttpUrl.parse(url);
        if (parsed == null) {
            throw new IllegalArgumentException("unexpected url: " + url);
        }
        return this.url(parsed);
    }
    
    public Builder header(final String name, final String value) {
        this.headers.set(name, value);
        return this;
    }
    
    public Builder removeHeader(final String name) {
        this.headers.removeAll(name);
        return this;
    }
    
    public Builder headers(final Headers headers) {
        this.headers = headers.newBuilder();
        return this;
    }
    
    public Builder post(final RequestBody body) {
        return this.method("POST", body);
    }
    
    public Builder delete(@Nullable final RequestBody body) {
        return this.method("DELETE", body);
    }
    
    public Builder delete() {
        return this.delete(Util.EMPTY_REQUEST);
    }
    
    public Builder put(final RequestBody body) {
        return this.method("PUT", body);
    }
    
    public Builder method(final String method, @Nullable final RequestBody body) {
        if (method == null) {
            throw new NullPointerException("method == null");
        }
        if (method.length() == 0) {
            throw new IllegalArgumentException("method.length() == 0");
        }
        if (body != null && !HttpMethod.permitsRequestBody(method)) {
            throw new IllegalArgumentException("method " + method + " must not have a request body.");
        }
        if (body == null && HttpMethod.requiresRequestBody(method)) {
            throw new IllegalArgumentException("method " + method + " must have a request body.");
        }
        this.method = method;
        this.body = body;
        return this;
    }
    
    public Request build() {
        if (this.url == null) {
            throw new IllegalStateException("url == null");
        }
        return new Request(this);
    }
}
