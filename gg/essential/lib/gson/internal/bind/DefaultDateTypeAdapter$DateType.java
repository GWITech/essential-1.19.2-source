package gg.essential.lib.gson.internal.bind;

import java.util.*;
import gg.essential.lib.gson.*;

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
