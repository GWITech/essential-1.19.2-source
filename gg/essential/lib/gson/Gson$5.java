package gg.essential.lib.gson;

import java.util.concurrent.atomic.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;
import java.util.*;

class Gson$5 extends TypeAdapter<AtomicLongArray> {
    final /* synthetic */ TypeAdapter val$longAdapter;
    
    Gson$5(final TypeAdapter val$longAdapter) {
        this.val$longAdapter = val$longAdapter;
        super();
    }
    
    @Override
    public void write(final JsonWriter out, final AtomicLongArray value) throws IOException {
        out.beginArray();
        for (int i = 0, length = value.length(); i < length; ++i) {
            this.val$longAdapter.write(out, value.get(i));
        }
        out.endArray();
    }
    
    @Override
    public AtomicLongArray read(final JsonReader in) throws IOException {
        final List<Long> list = new ArrayList<Long>();
        in.beginArray();
        while (in.hasNext()) {
            final long value = this.val$longAdapter.read(in).longValue();
            list.add(value);
        }
        in.endArray();
        final int length = list.size();
        final AtomicLongArray array = new AtomicLongArray(length);
        for (int i = 0; i < length; ++i) {
            array.set(i, list.get(i));
        }
        return array;
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (AtomicLongArray)o);
    }
}