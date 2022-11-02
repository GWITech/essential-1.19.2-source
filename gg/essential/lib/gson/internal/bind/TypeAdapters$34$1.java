package gg.essential.lib.gson.internal.bind;

import java.io.*;
import gg.essential.lib.gson.stream.*;
import gg.essential.lib.gson.*;

class TypeAdapters$34$1 extends TypeAdapter<T1> {
    final /* synthetic */ Class val$requestedType;
    final /* synthetic */ TypeAdapters$34 this$0;
    
    TypeAdapters$34$1(final TypeAdapters$34 this$0, final Class val$requestedType) {
        this.this$0 = this$0;
        this.val$requestedType = val$requestedType;
        super();
    }
    
    @Override
    public void write(final JsonWriter out, final T1 value) throws IOException {
        this.this$0.val$typeAdapter.write(out, value);
    }
    
    @Override
    public T1 read(final JsonReader in) throws IOException {
        final T1 result = this.this$0.val$typeAdapter.read(in);
        if (result != null && !this.val$requestedType.isInstance(result)) {
            throw new JsonSyntaxException("Expected a " + this.val$requestedType.getName() + " but was " + result.getClass().getName() + "; at path " + in.getPreviousPath());
        }
        return result;
    }
}