package gg.essential.lib.gson.internal.bind;

import gg.essential.lib.gson.internal.*;
import java.io.*;
import gg.essential.lib.gson.stream.*;
import java.text.*;
import gg.essential.lib.gson.internal.bind.util.*;
import java.util.*;
import gg.essential.lib.gson.*;

public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter<T>
{
    private final DateType<T> dateType;
    private final List<DateFormat> dateFormats;
    
    private DefaultDateTypeAdapter(final DateType<T> dateType, final String datePattern) {
        super();
        this.dateFormats = new ArrayList<DateFormat>();
        this.dateType = $Gson$Preconditions.checkNotNull(dateType);
        this.dateFormats.add(new SimpleDateFormat(datePattern, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.dateFormats.add(new SimpleDateFormat(datePattern));
        }
    }
    
    private DefaultDateTypeAdapter(final DateType<T> dateType, final int dateStyle, final int timeStyle) {
        super();
        this.dateFormats = new ArrayList<DateFormat>();
        this.dateType = $Gson$Preconditions.checkNotNull(dateType);
        this.dateFormats.add(DateFormat.getDateTimeInstance(dateStyle, timeStyle, Locale.US));
        if (!Locale.getDefault().equals(Locale.US)) {
            this.dateFormats.add(DateFormat.getDateTimeInstance(dateStyle, timeStyle));
        }
        if (JavaVersion.isJava9OrLater()) {
            this.dateFormats.add(PreJava9DateFormatProvider.getUSDateTimeFormat(dateStyle, timeStyle));
        }
    }
    
    @Override
    public void write(final JsonWriter out, final Date value) throws IOException {
        if (value == null) {
            out.nullValue();
            return;
        }
        final DateFormat dateFormat = this.dateFormats.get(0);
        final String dateFormatAsString;
        synchronized (this.dateFormats) {
            dateFormatAsString = dateFormat.format(value);
        }
        out.value(dateFormatAsString);
    }
    
    @Override
    public T read(final JsonReader in) throws IOException {
        if (in.peek() == JsonToken.NULL) {
            in.nextNull();
            return null;
        }
        final Date date = this.deserializeToDate(in);
        return this.dateType.deserialize(date);
    }
    
    private Date deserializeToDate(final JsonReader in) throws IOException {
        final String s = in.nextString();
        synchronized (this.dateFormats) {
            for (final DateFormat dateFormat : this.dateFormats) {
                try {
                    return dateFormat.parse(s);
                }
                catch (final ParseException ex) {
                    continue;
                }
                break;
            }
        }
        try {
            return ISO8601Utils.parse(s, new ParsePosition(0));
        }
        catch (final ParseException e) {
            throw new JsonSyntaxException("Failed parsing '" + s + "' as Date; at path " + in.getPreviousPath(), e);
        }
    }
    
    @Override
    public String toString() {
        final DateFormat defaultFormat = this.dateFormats.get(0);
        if (defaultFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat)defaultFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + defaultFormat.getClass().getSimpleName() + ')';
    }
    
    @Override
    public /* bridge */ Object read(final JsonReader in) throws IOException {
        return this.read(in);
    }
    
    @Override
    public /* bridge */ void write(final JsonWriter out, final Object o) throws IOException {
        this.write(out, (Date)o);
    }
    
    DefaultDateTypeAdapter(final DateType x0, final String x1, final byte b) {
        this(x0, x1);
    }
    
    DefaultDateTypeAdapter(final DateType x0, final int x1, final int x2, final byte b) {
        this(x0, x1, x2);
    }
    
    public abstract static class DateType<T extends Date>
    {
        public static final DateType<Date> DATE;
        private final Class<T> dateClass;
        
        protected DateType(final Class<T> dateClass) {
            super();
            this.dateClass = dateClass;
        }
        
        protected abstract T deserialize(final Date p0);
        
        private final TypeAdapterFactory createFactory(final DefaultDateTypeAdapter<T> adapter) {
            return TypeAdapters.newFactory(this.dateClass, adapter);
        }
        
        public final TypeAdapterFactory createAdapterFactory(final String datePattern) {
            return this.createFactory(new DefaultDateTypeAdapter<T>(this, datePattern, (byte)0));
        }
        
        public final TypeAdapterFactory createAdapterFactory(final int dateStyle, final int timeStyle) {
            return this.createFactory(new DefaultDateTypeAdapter<T>(this, dateStyle, timeStyle, (byte)0));
        }
        
        static {
            DATE = new DateType<Date>(Date.class) {
                DefaultDateTypeAdapter$DateType$1(final Class dateClass) {
                    super(dateClass);
                }
                
                @Override
                protected Date deserialize(final Date date) {
                    return date;
                }
            };
        }
    }
}
