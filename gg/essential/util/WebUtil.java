package gg.essential.util;

import java.nio.charset.*;
import org.apache.commons.io.*;
import gg.essential.*;
import java.io.*;
import java.net.*;

public class WebUtil
{
    public static JsonHolder fetchJSON(final String url) {
        return new JsonHolder(fetchString(url));
    }
    
    public static String fetchString(String url) {
        url = url.replace(" ", "%20");
        try (final InputStream setup = setup(url, "Mozilla/4.76 (Essential)")) {
            return IOUtils.toString(setup, Charset.defaultCharset());
        }
        catch (final Exception e) {
            Essential.logger.error("Failed to fetch from {}", (Object)url, (Object)e);
            return "Failed to fetch";
        }
    }
    
    public static byte[] downloadToBytes(final String url, final String userAgent) throws IOException {
        try (final InputStream in = setup(url, userAgent)) {
            return IOUtils.toByteArray(in);
        }
    }
    
    private static InputStream setup(final String url, final String userAgent) throws IOException {
        final URL u = new URL(url);
        final URLConnection connection = u.openConnection();
        connection.setUseCaches(true);
        connection.addRequestProperty("User-Agent", userAgent);
        connection.setReadTimeout(15000);
        connection.setConnectTimeout(15000);
        connection.setDoOutput(true);
        return connection.getInputStream();
    }
}
