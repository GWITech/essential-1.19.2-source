package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.reflect.*;
import gg.essential.lib.gson.internal.*;
import gg.essential.lib.gson.*;

private static final class SingleTypeFactory implements TypeAdapterFactory
{
    private final TypeToken<?> exactType;
    private final boolean matchRawType;
    private final Class<?> hierarchyType;
    private final JsonSerializer<?> serializer;
    private final JsonDeserializer<?> deserializer;
    
    SingleTypeFactory(final Object typeAdapter, final TypeToken<?> exactType, final boolean matchRawType, final Class<?> hierarchyType) {
        super();
        this.serializer = ((typeAdapter instanceof JsonSerializer) ? ((JsonSerializer)typeAdapter) : null);
        this.deserializer = ((typeAdapter instanceof JsonDeserializer) ? ((JsonDeserializer)typeAdapter) : null);
        $Gson$Preconditions.checkArgument(this.serializer != null || this.deserializer != null);
        this.exactType = exactType;
        this.matchRawType = matchRawType;
        this.hierarchyType = hierarchyType;
    }
    
    @Override
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> type) {
        final boolean matches = (this.exactType != null) ? (this.exactType.equals(type) || (this.matchRawType && this.exactType.getType() == type.getRawType())) : this.hierarchyType.isAssignableFrom(type.getRawType());
        return matches ? new TreeTypeAdapter<T>((JsonSerializer<T>)this.serializer, (JsonDeserializer<T>)this.deserializer, gson, type, this) : null;
    }
}
