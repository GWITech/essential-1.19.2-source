package gg.essential.lib.gson.internal.sql;

import java.sql.*;
import java.util.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;
import gg.essential.lib.gson.*;
import gg.essential.lib.gson.reflect.*;

class SqlTimestampTypeAdapter extends TypeAdapter<Timestamp>
{
    static final TypeAdapterFactory FACTORY;
    private final TypeAdapter<Date> dateTypeAdapter;
    
    private SqlTimestampTypeAdapter(final TypeAdapter<Date> dateTypeAdapter) {
        super();
        this.dateTypeAdapter = dateTypeAdapter;
    }
    
    @Override
    public Timestamp read(final JsonReader in) throws IOException {
        final Date date = this.dateTypeAdapter.read(in);
        return (date != null) ? new Timestamp(date.getTime()) : null;
    }
    
    @Override
    public void write(final JsonWriter out, final Timestamp value) throws IOException {
        this.dateTypeAdapter.write(out, value);
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (Timestamp)o);
    }
    
    SqlTimestampTypeAdapter(final TypeAdapter x0, final byte b) {
        this(x0);
    }
    
    static {
        FACTORY = new TypeAdapterFactory() {
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
        };
    }
}
