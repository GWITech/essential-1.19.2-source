package gg.essential.lib.okhttp3.internal;

import java.nio.charset.*;
import java.util.regex.*;
import java.io.*;
import java.util.concurrent.*;
import java.util.*;
import gg.essential.lib.okio.*;
import java.net.*;
import javax.annotation.*;
import gg.essential.lib.okhttp3.*;

public final class Util
{
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final String[] EMPTY_STRING_ARRAY;
    public static final ResponseBody EMPTY_RESPONSE;
    public static final RequestBody EMPTY_REQUEST;
    private static final ByteString UTF_8_BOM;
    private static final ByteString UTF_16_BE_BOM;
    private static final ByteString UTF_16_LE_BOM;
    private static final ByteString UTF_32_BE_BOM;
    private static final ByteString UTF_32_LE_BOM;
    public static final Charset UTF_8;
    private static final Charset UTF_16_BE;
    private static final Charset UTF_16_LE;
    private static final Charset UTF_32_BE;
    private static final Charset UTF_32_LE;
    public static final TimeZone UTC;
    public static final Comparator<String> NATURAL_ORDER;
    private static final Pattern VERIFY_AS_IP_ADDRESS;
    
    public static void checkOffsetAndCount$487762af(final long arrayLength, final long count) {
        if ((0x0L | count) < 0L || 0L > arrayLength || arrayLength - 0L < count) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    
    public static boolean equal(final Object a, final Object b) {
        return a == b || (a != null && a.equals(b));
    }
    
    public static void closeQuietly(final Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            }
            catch (final RuntimeException rethrown) {
                throw rethrown;
            }
            catch (final Exception ex) {}
        }
    }
    
    public static void closeQuietly(final Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            }
            catch (final AssertionError e) {
                if (!isAndroidGetsocknameError(e)) {
                    throw e;
                }
            }
            catch (final RuntimeException rethrown) {
                throw rethrown;
            }
            catch (final Exception ex) {}
        }
    }
    
    public static boolean discard$1a4e8ddd(final Source source, final TimeUnit timeUnit) {
        try {
            return skipAll(source, 100, timeUnit);
        }
        catch (final IOException ex) {
            return false;
        }
    }
    
    public static boolean skipAll(final Source source, final int duration, final TimeUnit timeUnit) throws IOException {
        final long now = System.nanoTime();
        final long originalDuration = source.timeout().hasDeadline() ? (source.timeout().deadlineNanoTime() - now) : Long.MAX_VALUE;
        source.timeout().deadlineNanoTime(now + Math.min(originalDuration, timeUnit.toNanos(duration)));
        try {
            final Buffer skipBuffer = new Buffer();
            while (source.read(skipBuffer, 8192L) != -1L) {
                skipBuffer.clear();
            }
            return true;
        }
        catch (final InterruptedIOException ex) {
            return false;
        }
        finally {
            if (originalDuration == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            }
            else {
                source.timeout().deadlineNanoTime(now + originalDuration);
            }
        }
    }
    
    public static <T> List<T> immutableList(final List<T> list) {
        return Collections.unmodifiableList((List<? extends T>)new ArrayList<T>((Collection<? extends T>)list));
    }
    
    public static <T> List<T> immutableList(final T... elements) {
        return Collections.unmodifiableList((List<? extends T>)Arrays.asList((T[])elements.clone()));
    }
    
    public static ThreadFactory threadFactory(final String name, final boolean daemon) {
        return new ThreadFactory() {
            final /* synthetic */ String val$name;
            final /* synthetic */ boolean val$daemon;
            
            Util$2() {
                super();
            }
            
            @Override
            public Thread newThread(final Runnable runnable) {
                final Thread result = new Thread(runnable, name);
                result.setDaemon(daemon);
                return result;
            }
        };
    }
    
    public static String[] intersect(final Comparator<? super String> comparator, final String[] first, final String[] second) {
        final List<String> result = new ArrayList<String>();
        for (final String a : first) {
            for (final String b : second) {
                if (comparator.compare(a, b) == 0) {
                    result.add(a);
                    break;
                }
            }
        }
        return result.toArray(new String[result.size()]);
    }
    
    public static boolean nonEmptyIntersection(final Comparator<String> comparator, final String[] first, final String[] second) {
        if (first == null || second == null || first.length == 0 || second.length == 0) {
            return false;
        }
        for (final String a : first) {
            for (final String b : second) {
                if (comparator.compare(a, b) == 0) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static String hostHeader(final HttpUrl url, final boolean includeDefaultPort) {
        final String host = url.host().contains(":") ? ("[" + url.host() + "]") : url.host();
        return (includeDefaultPort || url.port() != HttpUrl.defaultPort(url.scheme())) ? (host + ":" + url.port()) : host;
    }
    
    public static boolean isAndroidGetsocknameError(final AssertionError e) {
        return e.getCause() != null && e.getMessage() != null && e.getMessage().contains("getsockname failed");
    }
    
    public static int indexOf(final Comparator<String> comparator, final String[] array, final String value) {
        for (int i = 0, size = array.length; i < size; ++i) {
            if (comparator.compare(array[i], value) == 0) {
                return i;
            }
        }
        return -1;
    }
    
    public static String[] concat(final String[] array, final String value) {
        final String[] result = new String[array.length + 1];
        System.arraycopy(array, 0, result, 0, array.length);
        result[result.length - 1] = value;
        return result;
    }
    
    public static int skipLeadingAsciiWhitespace(final String input, final int pos, final int limit) {
        int i = pos;
        while (i < limit) {
            switch (input.charAt(i)) {
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ': {
                    ++i;
                    continue;
                }
                default: {
                    return i;
                }
            }
        }
        return limit;
    }
    
    public static int skipTrailingAsciiWhitespace(final String input, final int pos, final int limit) {
        int i = limit - 1;
        while (i >= pos) {
            switch (input.charAt(i)) {
                case '\t':
                case '\n':
                case '\f':
                case '\r':
                case ' ': {
                    --i;
                    continue;
                }
                default: {
                    return i + 1;
                }
            }
        }
        return pos;
    }
    
    public static String trimSubstring(final String string, final int pos, final int limit) {
        final int start = skipLeadingAsciiWhitespace(string, pos, limit);
        final int end = skipTrailingAsciiWhitespace(string, start, limit);
        return string.substring(start, end);
    }
    
    public static int delimiterOffset(final String input, final int pos, final int limit, final String delimiters) {
        for (int i = pos; i < limit; ++i) {
            if (delimiters.indexOf(input.charAt(i)) != -1) {
                return i;
            }
        }
        return limit;
    }
    
    public static int delimiterOffset(final String input, final int pos, final int limit, final char delimiter) {
        for (int i = pos; i < limit; ++i) {
            if (input.charAt(i) == delimiter) {
                return i;
            }
        }
        return limit;
    }
    
    public static String canonicalizeHost(final String host) {
        if (host.contains(":")) {
            final InetAddress inetAddress = (host.startsWith("[") && host.endsWith("]")) ? decodeIpv6(host, 1, host.length() - 1) : decodeIpv6(host, 0, host.length());
            if (inetAddress == null) {
                return null;
            }
            final byte[] address = inetAddress.getAddress();
            if (address.length == 16) {
                return inet6AddressToAscii(address);
            }
            throw new AssertionError((Object)("Invalid IPv6 address: '" + host + "'"));
        }
        else {
            try {
                final String result = IDN.toASCII(host).toLowerCase(Locale.US);
                if (result.isEmpty()) {
                    return null;
                }
                if (containsInvalidHostnameAsciiCodes(result)) {
                    return null;
                }
                return result;
            }
            catch (final IllegalArgumentException ex) {
                return null;
            }
        }
    }
    
    private static boolean containsInvalidHostnameAsciiCodes(final String hostnameAscii) {
        for (int i = 0; i < hostnameAscii.length(); ++i) {
            final char c = hostnameAscii.charAt(i);
            if (c <= '\u001f' || c >= '\u007f') {
                return true;
            }
            if (" #%/:?@[\\]".indexOf(c) != -1) {
                return true;
            }
        }
        return false;
    }
    
    public static int indexOfControlOrNonAscii(final String input) {
        for (int i = 0, length = input.length(); i < length; ++i) {
            final char c = input.charAt(i);
            if (c <= '\u001f' || c >= '\u007f') {
                return i;
            }
        }
        return -1;
    }
    
    public static boolean verifyAsIpAddress(final String host) {
        return Util.VERIFY_AS_IP_ADDRESS.matcher(host).matches();
    }
    
    public static String format(final String format, final Object... args) {
        return String.format(Locale.US, format, args);
    }
    
    public static Charset bomAwareCharset(final BufferedSource source, final Charset charset) throws IOException {
        if (source.rangeEquals$45b61a70(Util.UTF_8_BOM)) {
            source.skip(Util.UTF_8_BOM.size());
            return Util.UTF_8;
        }
        if (source.rangeEquals$45b61a70(Util.UTF_16_BE_BOM)) {
            source.skip(Util.UTF_16_BE_BOM.size());
            return Util.UTF_16_BE;
        }
        if (source.rangeEquals$45b61a70(Util.UTF_16_LE_BOM)) {
            source.skip(Util.UTF_16_LE_BOM.size());
            return Util.UTF_16_LE;
        }
        if (source.rangeEquals$45b61a70(Util.UTF_32_BE_BOM)) {
            source.skip(Util.UTF_32_BE_BOM.size());
            return Util.UTF_32_BE;
        }
        if (source.rangeEquals$45b61a70(Util.UTF_32_LE_BOM)) {
            source.skip(Util.UTF_32_LE_BOM.size());
            return Util.UTF_32_LE;
        }
        return charset;
    }
    
    public static AssertionError assertionError(final String message, final Exception e) {
        return (AssertionError)new AssertionError((Object)message).initCause(e);
    }
    
    public static int decodeHexDigit(final char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'a' + 10;
        }
        if (c >= 'A' && c <= 'F') {
            return c - 'A' + 10;
        }
        return -1;
    }
    
    @Nullable
    private static InetAddress decodeIpv6(final String input, final int pos, final int limit) {
        final byte[] address = new byte[16];
        int b = 0;
        int compress = -1;
        int groupOffset = -1;
        int i = pos;
        while (i < limit) {
            if (b == 16) {
                return null;
            }
            if (i + 2 <= limit && input.regionMatches(i, "::", 0, 2)) {
                if (compress != -1) {
                    return null;
                }
                i += 2;
                b += 2;
                compress = b;
                if (i == limit) {
                    break;
                }
            }
            else if (b != 0) {
                if (input.regionMatches(i, ":", 0, 1)) {
                    ++i;
                }
                else {
                    if (!input.regionMatches(i, ".", 0, 1)) {
                        return null;
                    }
                    if (!decodeIpv4Suffix(input, groupOffset, limit, address, b - 2)) {
                        return null;
                    }
                    b += 2;
                    break;
                }
            }
            int value = 0;
            groupOffset = i;
            while (i < limit) {
                final char c = input.charAt(i);
                final int hexDigit = decodeHexDigit(c);
                if (hexDigit == -1) {
                    break;
                }
                value = (value << 4) + hexDigit;
                ++i;
            }
            final int groupLength = i - groupOffset;
            if (groupLength == 0 || groupLength > 4) {
                return null;
            }
            address[b++] = (byte)(value >>> 8 & 0xFF);
            address[b++] = (byte)(value & 0xFF);
        }
        if (b != 16) {
            if (compress == -1) {
                return null;
            }
            System.arraycopy(address, compress, address, 16 - (b - compress), b - compress);
            Arrays.fill(address, compress, compress + (16 - b), (byte)0);
        }
        try {
            return InetAddress.getByAddress(address);
        }
        catch (final UnknownHostException ex) {
            throw new AssertionError();
        }
    }
    
    private static boolean decodeIpv4Suffix(final String input, final int pos, final int limit, final byte[] address, final int addressOffset) {
        int b = addressOffset;
        int i = pos;
        while (i < limit) {
            if (b == 16) {
                return false;
            }
            if (b != addressOffset) {
                if (input.charAt(i) != '.') {
                    return false;
                }
                ++i;
            }
            int value = 0;
            final int groupOffset = i;
            while (i < limit) {
                final char c = input.charAt(i);
                if (c < '0') {
                    break;
                }
                if (c > '9') {
                    break;
                }
                if (value == 0 && groupOffset != i) {
                    return false;
                }
                value = value * 10 + c - 48;
                if (value > 255) {
                    return false;
                }
                ++i;
            }
            final int groupLength = i - groupOffset;
            if (groupLength == 0) {
                return false;
            }
            address[b++] = (byte)value;
        }
        return b == addressOffset + 4;
    }
    
    private static String inet6AddressToAscii(final byte[] address) {
        int longestRunOffset = -1;
        int longestRunLength = 0;
        for (int i = 0; i < address.length; i += 2) {
            final int currentRunOffset = i;
            while (i < 16 && address[i] == 0 && address[i + 1] == 0) {
                i += 2;
            }
            final int currentRunLength = i - currentRunOffset;
            if (currentRunLength > longestRunLength && currentRunLength >= 4) {
                longestRunOffset = currentRunOffset;
                longestRunLength = currentRunLength;
            }
        }
        final Buffer result = new Buffer();
        int j = 0;
        while (j < address.length) {
            if (j == longestRunOffset) {
                result.writeByte(58);
                j += longestRunLength;
                if (j != 16) {
                    continue;
                }
                result.writeByte(58);
            }
            else {
                if (j > 0) {
                    result.writeByte(58);
                }
                final int group = (address[j] & 0xFF) << 8 | (address[j + 1] & 0xFF);
                result.writeHexadecimalUnsignedLong((long)group);
                j += 2;
            }
        }
        return result.readUtf8();
    }
    
    static {
        EMPTY_BYTE_ARRAY = new byte[0];
        EMPTY_STRING_ARRAY = new String[0];
        EMPTY_RESPONSE = ResponseBody.create(null, Util.EMPTY_BYTE_ARRAY);
        EMPTY_REQUEST = RequestBody.create(null, Util.EMPTY_BYTE_ARRAY);
        UTF_8_BOM = ByteString.decodeHex("efbbbf");
        UTF_16_BE_BOM = ByteString.decodeHex("feff");
        UTF_16_LE_BOM = ByteString.decodeHex("fffe");
        UTF_32_BE_BOM = ByteString.decodeHex("0000ffff");
        UTF_32_LE_BOM = ByteString.decodeHex("ffff0000");
        UTF_8 = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        UTF_16_BE = Charset.forName("UTF-16BE");
        UTF_16_LE = Charset.forName("UTF-16LE");
        UTF_32_BE = Charset.forName("UTF-32BE");
        UTF_32_LE = Charset.forName("UTF-32LE");
        UTC = TimeZone.getTimeZone("GMT");
        NATURAL_ORDER = new Comparator<String>() {
            Util$1() {
                super();
            }
            
            @Override
            public int compare(final String a, final String b) {
                return a.compareTo(b);
            }
            
            @Override
            public /* bridge */ int compare(final Object o, final Object o2) {
                return this.compare((String)o, (String)o2);
            }
        };
        VERIFY_AS_IP_ADDRESS = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }
}
