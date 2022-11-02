package gg.essential.lib.okhttp3;

import java.net.*;
import java.util.*;

final class Dns$1 implements Dns {
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
}