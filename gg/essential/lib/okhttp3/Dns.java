package gg.essential.lib.okhttp3;

import java.net.*;
import java.util.*;

public interface Dns
{
    public static final Dns SYSTEM = new Dns() {
        Dns$1() {
            super();
        }
        
        @Override
        public List<InetAddress> lookup(final String hostname) throws UnknownHostException {
            if (hostname == null) {
                throw new UnknownHostException("hostname == null");
            }
            return Arrays.asList(InetAddress.getAllByName(hostname));
        }
    };
    
    List<InetAddress> lookup(final String p0) throws UnknownHostException;
}
