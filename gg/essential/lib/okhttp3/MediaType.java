package gg.essential.lib.okhttp3;

import javax.annotation.*;
import java.util.*;
import java.util.regex.*;
import java.nio.charset.*;

public final class MediaType
{
    private static final Pattern TYPE_SUBTYPE;
    private static final Pattern PARAMETER;
    private final String mediaType;
    private final String type;
    @Nullable
    private final String charset;
    
    private MediaType(final String mediaType, final String type, @Nullable final String charset) {
        super();
        this.mediaType = mediaType;
        this.type = type;
        this.charset = charset;
    }
    
    @Nullable
    public static MediaType parse(final String string) {
        final Matcher typeSubtype = MediaType.TYPE_SUBTYPE.matcher(string);
        if (!typeSubtype.lookingAt()) {
            return null;
        }
        final String type = typeSubtype.group(1).toLowerCase(Locale.US);
        typeSubtype.group(2).toLowerCase(Locale.US);
        String charset = null;
        final Matcher parameter = MediaType.PARAMETER.matcher(string);
        for (int s = typeSubtype.end(); s < string.length(); s = parameter.end()) {
            parameter.region(s, string.length());
            if (!parameter.lookingAt()) {
                return null;
            }
            final String name = parameter.group(1);
            if (name != null) {
                if (name.equalsIgnoreCase("charset")) {
                    final String token = parameter.group(2);
                    String charsetParameter;
                    if (token != null) {
                        charsetParameter = ((token.startsWith("'") && token.endsWith("'") && token.length() > 2) ? token.substring(1, token.length() - 1) : token);
                    }
                    else {
                        charsetParameter = parameter.group(3);
                    }
                    if (charset != null && !charsetParameter.equalsIgnoreCase(charset)) {
                        return null;
                    }
                    charset = charsetParameter;
                }
            }
        }
        return new MediaType(string, type, charset);
    }
    
    public String type() {
        return this.type;
    }
    
    @Nullable
    public Charset charset() {
        return this.charset(null);
    }
    
    @Nullable
    public Charset charset(@Nullable final Charset defaultValue) {
        try {
            return (this.charset != null) ? Charset.forName(this.charset) : defaultValue;
        }
        catch (final IllegalArgumentException ex) {
            return defaultValue;
        }
    }
    
    @Override
    public String toString() {
        return this.mediaType;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return other instanceof MediaType && ((MediaType)other).mediaType.equals(this.mediaType);
    }
    
    @Override
    public int hashCode() {
        return this.mediaType.hashCode();
    }
    
    static {
        TYPE_SUBTYPE = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
        PARAMETER = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    }
}
