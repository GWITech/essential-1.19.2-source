package gg.essential.lib.gson;

import java.io.*;
import gg.essential.lib.gson.stream.*;

class Gson$1 extends TypeAdapter<Number> {
    Gson$1() {
        super();
    }
    
    @Override
    public Double read(final JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        return in.nextDouble();
    }
    
    @Override
    public void write(final JsonWriter out, final Number value) throws IOException {
        if (value == null) {
            out.nullValue();
            return;
        }
        final double doubleValue = value.doubleValue();
        Gson.checkValidFloatingPoint(doubleValue);
        out.value(value);
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (Number)o);
    }
}