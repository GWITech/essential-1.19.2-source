package gg.essential.lib.gson.internal.sql;

import gg.essential.lib.gson.reflect.*;
import gg.essential.lib.gson.*;
import java.sql.*;

class SqlTimeTypeAdapter$1 implements TypeAdapterFactory {
    SqlTimeTypeAdapter$1() {
        super();
    }
    
    @Override
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
        return (TypeAdapter<T>)((typeToken.getRawType() == Time.class) ? new SqlTimeTypeAdapter((byte)0) : null);
    }
}