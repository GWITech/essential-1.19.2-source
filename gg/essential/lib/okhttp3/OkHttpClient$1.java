package gg.essential.lib.okhttp3;

import gg.essential.lib.okhttp3.internal.*;
import java.net.*;
import gg.essential.lib.okhttp3.internal.connection.*;
import javax.net.ssl.*;

final class OkHttpClient$1 extends Internal {
    OkHttpClient$1() {
        super();
    }
    
    @Override
    public void addLenient(final Headers.Builder builder, final String line) {
        builder.addLenient(line);
    }
    
    @Override
    public void addLenient(final Headers.Builder builder, final String name, final String value) {
        builder.addLenient(name, value);
    }
    
    @Override
    public boolean connectionBecameIdle(final ConnectionPool pool, final RealConnection connection) {
        return pool.connectionBecameIdle(connection);
    }
    
    @Override
    public RealConnection get(final ConnectionPool pool, final Address address, final StreamAllocation streamAllocation, final Route route) {
        return pool.get(address, streamAllocation, route);
    }
    
    @Override
    public boolean equalsNonHost(final Address a, final Address b) {
        return a.equalsNonHost(b);
    }
    
    @Override
    public Socket deduplicate(final ConnectionPool pool, final Address address, final StreamAllocation streamAllocation) {
        return pool.deduplicate(address, streamAllocation);
    }
    
    @Override
    public void put(final ConnectionPool pool, final RealConnection connection) {
        pool.put(connection);
    }
    
    @Override
    public RouteDatabase routeDatabase(final ConnectionPool connectionPool) {
        return connectionPool.routeDatabase;
    }
    
    @Override
    public int code(final Response.Builder responseBuilder) {
        return responseBuilder.code;
    }
    
    @Override
    public void apply(final ConnectionSpec tlsConfiguration, final SSLSocket sslSocket, final boolean isFallback) {
        tlsConfiguration.apply(sslSocket, isFallback);
    }
}