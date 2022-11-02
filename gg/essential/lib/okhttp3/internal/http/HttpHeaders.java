package gg.essential.lib.okhttp3.internal.http;

import gg.essential.lib.okhttp3.*;
import java.util.*;
import java.util.regex.*;

public final class HttpHeaders
{
    public static long contentLength(final Response response) {
        return contentLength(response.headers());
    }
    
    public static long contentLength(final Headers headers) {
        return stringToLong(headers.get("Content-Length"));
    }
    
    private static long stringToLong(final String s) {
        if (s == null) {
            return -1L;
        }
        try {
            return Long.parseLong(s);
        }
        catch (final NumberFormatException ex) {
            return -1L;
        }
    }
    
    public static void receiveHeaders(final CookieJar cookieJar, final HttpUrl url, final Headers headers) {
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        final List<Cookie> cookies = Cookie.parseAll(url, headers);
        if (cookies.isEmpty()) {
            return;
        }
    }
    
    public static boolean hasBody(final Response response) {
        if (response.request().method().equals("HEAD")) {
            return false;
        }
        final int responseCode = response.code();
        return ((responseCode < 100 || responseCode >= 200) && responseCode != 204 && responseCode != 304) || (contentLength(response) != -1L || "chunked".equalsIgnoreCase(response.header("Transfer-Encoding")));
    }
    
    public static int skipUntil(final String input, int pos, final String characters) {
        while (pos < input.length() && characters.indexOf(input.charAt(pos)) == -1) {
            ++pos;
        }
        return pos;
    }
    
    public static int skipWhitespace(final String input, int pos) {
        while (pos < input.length()) {
            final char c = input.charAt(pos);
            if (c != ' ' && c != '\t') {
                break;
            }
            ++pos;
        }
        return pos;
    }
    
    public static int parseSeconds(final String value, final int defaultValue) {
        try {
            final long seconds = Long.parseLong(value);
            if (seconds > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (seconds < 0L) {
                return 0;
            }
            return (int)seconds;
        }
        catch (final NumberFormatException ex) {
            return defaultValue;
        }
    }
    
    static {
        Pattern.compile(" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");
    }
}
