package gg.essential.lib.gson.internal.sql;

import gg.essential.lib.gson.reflect.*;
import gg.essential.lib.gson.*;
import java.sql.*;

class SqlDateTypeAdapter$1 implements TypeAdapterFactory {
    SqlDateTypeAdapter$1() {
        super();
    }
    
    @Override
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
        return (TypeAdapter<T>)((typeToken.getRawType() == Date.class) ? new SqlDateTypeAdapter((byte)0) : null);
    }
}