package gg.essential.lib.gson.internal;

import gg.essential.lib.gson.reflect.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;
import gg.essential.lib.gson.*;

class Excluder$1 extends TypeAdapter<T> {
    private TypeAdapter<T> delegate;
    final /* synthetic */ boolean val$skipDeserialize;
    final /* synthetic */ boolean val$skipSerialize;
    final /* synthetic */ Gson val$gson;
    final /* synthetic */ TypeToken val$type;
    final /* synthetic */ Excluder this$0;
    
    Excluder$1(final Excluder this$0, final boolean val$skipDeserialize, final boolean val$skipSerialize, final Gson val$gson, final TypeToken val$type) {
        this.this$0 = this$0;
        this.val$skipDeserialize = val$skipDeserialize;
        this.val$skipSerialize = val$skipSerialize;
        this.val$gson = val$gson;
        this.val$type = val$type;
        super();
    }
    
    @Override
    public T read(final JsonReader in) throws IOException {
        if (this.val$skipDeserialize) {
            in.skipValue();
            return null;
        }
        return this.delegate().read(in);
    }
    
    @Override
    public void write(final JsonWriter out, final T value) throws IOException {
        if (this.val$skipSerialize) {
            out.nullValue();
            return;
        }
        this.delegate().write(out, value);
    }
    
    private TypeAdapter<T> delegate() {
        final TypeAdapter<T> d = this.delegate;
        return (d != null) ? d : (this.delegate = this.val$gson.getDelegateAdapter(this.this$0, (TypeToken<T>)this.val$type));
    }
}