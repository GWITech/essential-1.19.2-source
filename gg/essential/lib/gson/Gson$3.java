package gg.essential.lib.gson;

import java.io.*;
import gg.essential.lib.gson.stream.*;

class Gson$3 extends TypeAdapter<Number> {
    Gson$3() {
        super();
    }
    
    @Override
    public Number read(final JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        return in.nextLong();
    }
    
    @Override
    public void write(final JsonWriter out, final Number value) throws IOException {
        if (value == null) {
            out.nullValue();
            return;
        }
        out.value(value.toString());
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