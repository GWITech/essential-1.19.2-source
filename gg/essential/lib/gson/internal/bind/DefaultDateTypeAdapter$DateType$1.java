package gg.essential.lib.gson.internal.bind;

import java.util.*;

class DefaultDateTypeAdapter$DateType$1 extends DateType<Date> {
    DefaultDateTypeAdapter$DateType$1(final Class dateClass) {
        super(dateClass);
    }
    
    @Override
    protected Date deserialize(final Date date) {
        return date;
    }
}