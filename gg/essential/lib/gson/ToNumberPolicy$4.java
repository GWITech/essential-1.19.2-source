package gg.essential.lib.gson;

import gg.essential.lib.gson.stream.*;
import java.math.*;
import java.io.*;

enum ToNumberPolicy$4
{
    ToNumberPolicy$4(final String x0) {
    }
    
    @Override
    public BigDecimal readNumber(final JsonReader in) throws IOException {
        final String value = in.nextString();
        try {
            return new BigDecimal(value);
        }
        catch (final NumberFormatException e) {
            throw new JsonParseException("Cannot parse " + value + "; at path " + in.getPreviousPath(), e);
        }
    }
    
    @Override
    public /* bridge */ Number readNumber(final JsonReader in) throws IOException {
        return this.readNumber(in);
    }
}