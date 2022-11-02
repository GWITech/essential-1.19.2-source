package gg.essential.lib.gson.internal.sql;

import java.sql.*;
import java.text.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;
import gg.essential.lib.gson.*;
import gg.essential.lib.gson.reflect.*;

final class SqlDateTypeAdapter extends TypeAdapter<Date>
{
    static final TypeAdapterFactory FACTORY;
    private final DateFormat format;
    
    private SqlDateTypeAdapter() {
        super();
        this.format = new SimpleDateFormat("MMM d, yyyy");
    }
    
    @Override
    public Date read(final JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        final String s = in.nextString();
        try {
            final java.util.Date utilDate;
            synchronized (this) {
                utilDate = this.format.parse(s);
            }
            return new Date(utilDate.getTime());
        }
        catch (final ParseException e) {
            throw new JsonSyntaxException("Failed parsing '" + s + "' as SQL Date; at path " + in.getPreviousPath(), e);
        }
    }
    
    @Override
    public void write(final JsonWriter out, final Date value) throws IOException {
        if (value == null) {
            out.nullValue();
            return;
        }
        final String dateString;
        synchronized (this) {
            dateString = this.format.format(value);
        }
        out.value(dateString);
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (Date)o);
    }
    
    SqlDateTypeAdapter(final byte b) {
        this();
    }
    
    static {
        FACTORY = new TypeAdapterFactory() {
            SqlDateTypeAdapter$1() {
                super();
            }
            
            @Override
            public <T> TypeAdapter<T> create(final Gson gson, final TypeToken<T> typeToken) {
                return (TypeAdapter<T>)((typeToken.getRawType() == Date.class) ? new SqlDateTypeAdapter((byte)0) : null);
            }
        };
    }
}
