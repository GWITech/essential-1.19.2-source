package gg.essential.lib.okhttp3.internal.http;

import gg.essential.lib.okio.*;
import java.io.*;
import gg.essential.lib.okhttp3.*;

public interface HttpCodec
{
    Sink createRequestBody(final Request p0, final long p1);
    
    void writeRequestHeaders(final Request p0) throws IOException;
    
    void flushRequest() throws IOException;
    
    void finishRequest() throws IOException;
    
    Response.Builder readResponseHeaders(final boolean p0) throws IOException;
    
    ResponseBody openResponseBody(final Response p0) throws IOException;
}
