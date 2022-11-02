package gg.essential.lib.gson;

import java.io.*;
import gg.essential.lib.gson.stream.*;

class TypeAdapter$1 extends TypeAdapter<T> {
    final /* synthetic */ TypeAdapter this$0;
    
    TypeAdapter$1(final TypeAdapter this$0) {
        this.this$0 = this$0;
        super();
    }
    
    @Override
    public void write(final JsonWriter out, final T value) throws IOException {
        if (value == null) {
            out.nullValue();
        }
        else {
            this.this$0.write(out, value);
        }
    }
    
    @Override
    public T read(final JsonReader reader) throws IOException {
        if (reader.peek() == JsonToken.NULL) {
            reader.nextNull();
            return null;
        }
        return this.this$0.read(reader);
    }
}