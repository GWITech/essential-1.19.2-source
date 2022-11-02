package gg.essential.lib.gson;

import java.util.concurrent.atomic.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

class Gson$4 extends TypeAdapter<AtomicLong> {
    final /* synthetic */ TypeAdapter val$longAdapter;
    
    Gson$4(final TypeAdapter val$longAdapter) {
        this.val$longAdapter = val$longAdapter;
        super();
    }
    
    @Override
    public void write(final JsonWriter out, final AtomicLong value) throws IOException {
        this.val$longAdapter.write(out, value.get());
    }
    
    @Override
    public AtomicLong read(final JsonReader in) throws IOException {
        final Number value = this.val$longAdapter.read(in);
        return new AtomicLong(value.longValue());
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (AtomicLong)o);
    }
}