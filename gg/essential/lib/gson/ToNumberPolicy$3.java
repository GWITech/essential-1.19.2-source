package gg.essential.lib.gson;

import gg.essential.lib.gson.stream.*;
import java.io.*;

enum ToNumberPolicy$3
{
    ToNumberPolicy$3(final String x0) {
    }
    
    @Override
    public Number readNumber(final JsonReader in) throws IOException, JsonParseException {
        final String value = in.nextString();
        try {
            return Long.parseLong(value);
        }
        catch (final NumberFormatException ex) {
            try {
                final Double d = Double.valueOf(value);
                if ((d.isInfinite() || d.isNaN()) && !in.isLenient()) {
                    throw new MalformedJsonException("JSON forbids NaN and infinities: " + d + "; at path " + in.getPreviousPath());
                }
                return d;
            }
            catch (final NumberFormatException doubleE) {
                throw new JsonParseException("Cannot parse " + value + "; at path " + in.getPreviousPath(), doubleE);
            }
        }
    }
}