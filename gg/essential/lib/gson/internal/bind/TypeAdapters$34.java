package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.reflect.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;
import gg.essential.lib.gson.*;

class TypeAdapters$34 implements TypeAdapterFactory {
    final /* synthetic */ Class val$clazz;
    final /* synthetic */ TypeAdapter val$typeAdapter;
    
    TypeAdapters$34(final Class val$clazz, final TypeAdapter val$typeAdapter) {
        this.val$clazz = val$clazz;
        this.val$typeAdapter = val$typeAdapter;
        super();
    }
    
    @Override
    public <T2> TypeAdapter<T2> create(final Gson gson, final TypeToken<T2> typeToken) {
        final Class<? super T2> requestedType = typeToken.getRawType();
        if (!this.val$clazz.isAssignableFrom(requestedType)) {
            return null;
        }
        return (TypeAdapter<T2>)new TypeAdapter<T1>() {
            final /* synthetic */ Class val$requestedType;
            final /* synthetic */ TypeAdapters$34 this$0;
            
            TypeAdapters$34$1() {
                this.this$0 = this$0;
                super();
            }
            
            @Override
            public void write(final JsonWriter out, final T1 value) throws IOException {
                this.this$0.val$typeAdapter.write(out, value);
            }
            
            @Override
            public T1 read(final JsonReader in) throws IOException {
                final T1 result = this.this$0.val$typeAdapter.read(in);
                if (result != null && !requestedType.isInstance(result)) {
                    throw new JsonSyntaxException("Expected a " + requestedType.getName() + " but was " + result.getClass().getName() + "; at path " + in.getPreviousPath());
                }
                return result;
            }
        };
    }
    
    @Override
    public String toString() {
        return "Factory[typeHierarchy=" + this.val$clazz.getName() + ",adapter=" + this.val$typeAdapter + "]";
    }
}