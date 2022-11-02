package gg.essential.lib.okhttp3;

import java.io.*;

public interface Chain
{
    Request request();
    
    Response proceed(final Request p0) throws IOException;
    
    int connectTimeoutMillis();
    
    int readTimeoutMillis();
    
    int writeTimeoutMillis();
}
