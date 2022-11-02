package gg.essential.lib.gson.internal.sql;

import gg.essential.lib.gson.internal.bind.*;
import java.sql.*;
import java.util.*;

class SqlTypesSupport$2 extends DefaultDateTypeAdapter.DateType<Timestamp> {
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
}