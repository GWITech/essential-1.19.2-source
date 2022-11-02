package gg.essential.lib.gson.internal.sql;

import gg.essential.lib.gson.internal.bind.*;
import java.util.*;
import gg.essential.lib.gson.*;
import java.sql.*;

public final class SqlTypesSupport
{
    public static final boolean SUPPORTS_SQL_TYPES;
    public static final DefaultDateTypeAdapter.DateType<? extends Date> DATE_DATE_TYPE;
    public static final DefaultDateTypeAdapter.DateType<? extends Date> TIMESTAMP_DATE_TYPE;
    public static final TypeAdapterFactory DATE_FACTORY;
    public static final TypeAdapterFactory TIME_FACTORY;
    public static final TypeAdapterFactory TIMESTAMP_FACTORY;
    
    static {
        boolean sqlTypesSupport;
        try {
            Class.forName("java.sql.Date");
            sqlTypesSupport = true;
        }
        catch (final ClassNotFoundException ex) {
            sqlTypesSupport = false;
        }
        SUPPORTS_SQL_TYPES = sqlTypesSupport;
        if (SqlTypesSupport.SUPPORTS_SQL_TYPES) {
            DATE_DATE_TYPE = new DefaultDateTypeAdapter.DateType<java.sql.Date>(java.sql.Date.class) {
                SqlTypesSupport$1(final Class dateClass) {
                    super(dateClass);
                }
                
                @Override
                protected java.sql.Date deserialize(final Date date) {
                    return new java.sql.Date(date.getTime());
                }
                
                @Override
                protected /* bridge */ Date deserialize(final Date date) {
                    return this.deserialize(date);
                }
            };
            TIMESTAMP_DATE_TYPE = new DefaultDateTypeAdapter.DateType<Timestamp>(Timestamp.class) {
                SqlTypesSupport$2(final Class dateClass) {
                    super(dateClass);
                }
                
                @Override
                protected Timestamp deserialize(final Date date) {
                    return new Timestamp(date.getTime());
                }
                
                @Override
                protected /* bridge */ Date deserialize(final Date date) {
                    return this.deserialize(date);
                }
            };
            DATE_FACTORY = SqlDateTypeAdapter.FACTORY;
            TIME_FACTORY = SqlTimeTypeAdapter.FACTORY;
            TIMESTAMP_FACTORY = SqlTimestampTypeAdapter.FACTORY;
        }
        else {
            DATE_DATE_TYPE = null;
            TIMESTAMP_DATE_TYPE = null;
            DATE_FACTORY = null;
            TIME_FACTORY = null;
            TIMESTAMP_FACTORY = null;
        }
    }
}
