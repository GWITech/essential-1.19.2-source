package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.*;
import java.util.concurrent.atomic.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

class TypeAdapters$9 extends TypeAdapter<AtomicBoolean> {
    TypeAdapters$9() {
        super();
    }
    
    @Override
    public AtomicBoolean read(final JsonReader in) throws IOException {
        return new AtomicBoolean(in.nextBoolean());
    }
    
    @Override
    public void write(final JsonWriter out, final AtomicBoolean value) throws IOException {
        out.value(value.get());
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (AtomicBoolean)o);
    }
}