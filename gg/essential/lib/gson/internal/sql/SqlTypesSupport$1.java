package gg.essential.lib.gson.internal.sql;

import gg.essential.lib.gson.internal.bind.*;
import java.sql.*;

class SqlTypesSupport$1 extends DefaultDateTypeAdapter.DateType<Date> {
    SqlTypesSupport$1(final Class dateClass) {
        super(dateClass);
    }
    
    @Override
    protected Date deserialize(final java.util.Date date) {
        return new Date(date.getTime());
    }
    
    @Override
    protected /* bridge */ java.util.Date deserialize(final java.util.Date date) {
        return this.deserialize(date);
    }
}