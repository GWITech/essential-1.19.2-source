package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.*;
import java.util.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;

class TypeAdapters$26 extends TypeAdapter<Calendar> {
    TypeAdapters$26() {
        super();
    }
    
    @Override
    public Calendar read(final JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        in.beginObject();
        int year = 0;
        int month = 0;
        int dayOfMonth = 0;
        int hourOfDay = 0;
        int minute = 0;
        int second = 0;
        while (in.peek() != JsonToken.END_OBJECT) {
            final String name = in.nextName();
            final int value = in.nextInt();
            if ("year".equals(name)) {
                year = value;
            }
            else if ("month".equals(name)) {
                month = value;
            }
            else if ("dayOfMonth".equals(name)) {
                dayOfMonth = value;
            }
            else if ("hourOfDay".equals(name)) {
                hourOfDay = value;
            }
            else if ("minute".equals(name)) {
                minute = value;
            }
            else {
                if (!"second".equals(name)) {
                    continue;
                }
                second = value;
            }
        }
        in.endObject();
        return new GregorianCalendar(year, month, dayOfMonth, hourOfDay, minute, second);
    }
    
    @Override
    public void write(final JsonWriter out, final Calendar value) throws IOException {
        if (value == null) {
            out.nullValue();
            return;
        }
        out.beginObject();
        out.name("year");
        out.value(value.get(1));
        out.name("month");
        out.value(value.get(2));
        out.name("dayOfMonth");
        out.value(value.get(5));
        out.name("hourOfDay");
        out.value(value.get(11));
        out.name("minute");
        out.value(value.get(12));
        out.name("second");
        out.value(value.get(13));
        out.endObject();
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (Calendar)o);
    }
}