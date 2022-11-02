package gg.essential.lib.okhttp3.internal.connection;

import gg.essential.lib.okhttp3.*;
import java.util.*;

public static final class Selection
{
    private final List<Route> routes;
    private int nextRouteIndex;
    
    Selection(final List<Route> routes) {
        super();
        this.nextRouteIndex = 0;
        this.routes = routes;
    }
    
    public boolean hasNext() {
        return this.nextRouteIndex < this.routes.size();
    }
    
    public Route next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        return this.routes.get(this.nextRouteIndex++);
    }
    
    public List<Route> getAll() {
        return new ArrayList<Route>(this.routes);
    }
}
