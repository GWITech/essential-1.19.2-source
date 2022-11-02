package gg.essential.lib.gson;

import java.io.*;
import gg.essential.lib.gson.stream.*;

static class FutureTypeAdapter<T> extends TypeAdapter<T>
{
    private TypeAdapter<T> delegate;
    
    FutureTypeAdapter() {
        super();
    }
    
    public void setDelegate(final TypeAdapter<T> typeAdapter) {
        if (this.delegate != null) {
            throw new AssertionError();
        }
        this.delegate = typeAdapter;
    }
    
    @Override
    public T read(final JsonReader in) throws IOException {
        if (this.delegate == null) {
            throw new IllegalStateException();
        }
        return this.delegate.read(in);
    }
    
    @Override
    public void write(final JsonWriter out, final T value) throws IOException {
        if (this.delegate == null) {
            throw new IllegalStateException();
        }
        this.delegate.write(out, value);
    }
}
