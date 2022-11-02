package gg.essential.lib.gson;

import java.io.*;
import gg.essential.lib.gson.internal.*;
import gg.essential.lib.gson.stream.*;
import java.math.*;

public enum ToNumberPolicy implements ToNumberStrategy
{
    DOUBLE {
        ToNumberPolicy$1(final String x0) {
        }
        
        @Override
        public Double readNumber(final JsonReader in) throws IOException {
            return in.nextDouble();
        }
        
        @Override
        public /* bridge */ Number readNumber(final JsonReader in) throws IOException {
            return this.readNumber(in);
        }
    }, 
    LAZILY_PARSED_NUMBER {
        ToNumberPolicy$2(final String x0) {
        }
        
        @Override
        public Number readNumber(final JsonReader in) throws IOException {
            return new LazilyParsedNumber(in.nextString());
        }
    }, 
    LONG_OR_DOUBLE {
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
    }, 
    BIG_DECIMAL {
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
    };
    
    private static final /* synthetic */ ToNumberPolicy[] $VALUES;
    
    public static ToNumberPolicy[] values() {
        return ToNumberPolicy.$VALUES.clone();
    }
    
    public static ToNumberPolicy valueOf(final String name) {
        return Enum.valueOf(ToNumberPolicy.class, name);
    }
    
    ToNumberPolicy(final String x0, final int x1, final byte b) {
        this();
    }
    
    static {
        $VALUES = new ToNumberPolicy[] { ToNumberPolicy.DOUBLE, ToNumberPolicy.LAZILY_PARSED_NUMBER, ToNumberPolicy.LONG_OR_DOUBLE, ToNumberPolicy.BIG_DECIMAL };
    }
}
