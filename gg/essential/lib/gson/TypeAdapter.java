package gg.essential.lib.gson;

import java.io.*;
import gg.essential.lib.gson.stream.*;
import gg.essential.lib.gson.internal.bind.*;

public abstract class TypeAdapter<T>
{
    public TypeAdapter() {
        super();
    }
    
    public abstract void write(final JsonWriter p0, final T p1) throws IOException;
    
    public final TypeAdapter<T> nullSafe() {
        return new TypeAdapter<T>() {
            final /* synthetic */ TypeAdapter this$0;
            
            TypeAdapter$1() {
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
        };
    }
    
    public final JsonElement toJsonTree(final T value) {
        try {
            final JsonTreeWriter jsonWriter = new JsonTreeWriter();
            this.write(jsonWriter, value);
            return jsonWriter.get();
        }
        catch (final IOException e) {
            throw new JsonIOException(e);
        }
    }
    
    public abstract T read(final JsonReader p0) throws IOException;
}
