package gg.essential.lib.gson.internal.sql;

import java.sql.*;
import java.text.*;
import java.util.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;
import gg.essential.lib.gson.*;
import gg.essential.lib.gson.reflect.*;

final class SqlTimeTypeAdapter extends TypeAdapter<Time>
{
    static final TypeAdapterFactory FACTORY;
    private final DateFormat format;
    
    private SqlTimeTypeAdapter() {
        super();
        this.format = new SimpleDateFormat("hh:mm:ss a");
    }
    
    @Override
    public Time read(final JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        final String s = in.nextString();
        try {
            synchronized (this) {
                final Date date = this.format.parse(s);
                return new Time(date.getTime());
            }
        }
        catch (final ParseException e) {
            throw new JsonSyntaxException("Failed parsing '" + s + "' as SQL Time; at path " + in.getPreviousPath(), e);
        }
    }
    
    @Override
    public void write(final JsonWriter out, final Time value) throws IOException {
        if (value == null) {
            out.nullValue();
            return;
        }
        final String timeString;
        synchronized (this) {
            timeString = this.format.format(value);
        }
        out.value(timeString);
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (Time)o);
    }
    
    SqlTimeTypeAdapter(final byte b) {
        this();
    }
    
    static {
        FACTORY = new TypeAdapterFactory() {
            SqlTimeTypeAdapter$1() {
                super();
            }
            
            @Override
            public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
                return (TypeAdapter<T>)((typeToken.getRawType() == Time.class) ? new SqlTimeTypeAdapter((byte)0) : null);
            }
        };
    }
}
