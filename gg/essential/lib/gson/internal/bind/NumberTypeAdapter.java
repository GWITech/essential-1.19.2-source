package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.reflect.*;
import gg.essential.lib.gson.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

public final class NumberTypeAdapter extends TypeAdapter<Number>
{
    private static final TypeAdapterFactory LAZILY_PARSED_NUMBER_FACTORY;
    private final ToNumberStrategy toNumberStrategy;
    
    private NumberTypeAdapter(final ToNumberStrategy toNumberStrategy) {
        super();
        this.toNumberStrategy = toNumberStrategy;
    }
    
    private static TypeAdapterFactory newFactory(final ToNumberStrategy toNumberStrategy) {
        final NumberTypeAdapter adapter = new NumberTypeAdapter(toNumberStrategy);
        return new TypeAdapterFactory() {
            final /* synthetic */ NumberTypeAdapter val$adapter;
            
            NumberTypeAdapter$1() {
                super();
            }
            
            @Override
            public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> type) {
                return (TypeAdapter<T>)((type.getRawType() == Number.class) ? adapter : null);
            }
        };
    }
    
    public static TypeAdapterFactory getFactory(final ToNumberStrategy toNumberStrategy) {
        if (toNumberStrategy == ToNumberPolicy.LAZILY_PARSED_NUMBER) {
            return NumberTypeAdapter.LAZILY_PARSED_NUMBER_FACTORY;
        }
        return newFactory(toNumberStrategy);
    }
    
    @Override
    public Number read(final JsonReader in) throws IOException {
        final JsonToken jsonToken = in.peek();
        switch (NumberTypeAdapter.NumberTypeAdapter$2.$SwitchMap$com$google$gson$stream$JsonToken[jsonToken.ordinal()]) {
            case 1: {
                in.nextNull();
                return null;
            }
            case 2:
            case 3: {
                return this.toNumberStrategy.readNumber(in);
            }
            default: {
                throw new JsonSyntaxException("Expecting number, got: " + jsonToken + "; at path " + in.getPath());
            }
        }
    }
    
    @Override
    public void write(final JsonWriter out, final Number value) throws IOException {
        out.value(value);
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (Number)o);
    }
    
    static {
        LAZILY_PARSED_NUMBER_FACTORY = newFactory(ToNumberPolicy.LAZILY_PARSED_NUMBER);
    }
}
