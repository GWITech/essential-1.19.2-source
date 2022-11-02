package gg.essential.lib.kbrewster;

import gg.essential.lib.okhttp3.*;
import java.io.*;
import java.lang.annotation.*;

@Reference(apiName = "API", apiVersion = "1.5")
public abstract class API
{
    private static String apiName;
    private static String apiVersion;
    private static OkHttpClient client;
    
    public API() {
        super();
    }
    
    protected static String sendGet(final String url, final String contentType) throws IOException {
        final Request request = new Request.Builder().url(url).header("User-Agent", contentType).build();
        final Response response = API.client.newCall(request).execute();
        return response.body().string();
    }
    
    protected static String sendGet(final String url) throws IOException {
        return sendGet(url, "application/json");
    }
    
    static {
        API.apiName = API.class.getAnnotation(Reference.class).apiName();
        API.apiVersion = API.class.getAnnotation(Reference.class).apiVersion();
        API.client = new OkHttpClient();
    }
    
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Reference {
        String apiName();
        
        String apiVersion();
    }
}
