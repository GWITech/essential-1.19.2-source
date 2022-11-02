package gg.essential.lib.gson.internal.sql;

import gg.essential.lib.gson.reflect.*;
import gg.essential.lib.gson.*;
import java.sql.*;
import java.util.*;

class SqlTimestampTypeAdapter$1 implements TypeAdapterFactory {
    SqlTimestampTypeAdapter$1() {
        super();
    }
    
    @Override
    public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
        if (typeToken.getRawType() == Timestamp.class) {
            final TypeAdapter<Date> dateTypeAdapter = gson.getAdapter(Date.class);
            return (TypeAdapter<T>)new SqlTimestampTypeAdapter(dateTypeAdapter, (byte)0);
        }
        return null;
    }
}