package gg.essential.lib.okhttp3;

import java.io.*;

public interface Interceptor
{
    Response intercept(final Chain p0) throws IOException;
    
    public interface Chain
    {
        Request request();
        
        Response proceed(final Request p0) throws IOException;
        
        int connectTimeoutMillis();
        
        int readTimeoutMillis();
        
        int writeTimeoutMillis();
    }
}
