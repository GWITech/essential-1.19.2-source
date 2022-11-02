package gg.essential.network.connectionmanager;

import java.util.*;
import gg.essential.config.*;

class ConnectionManager$1 extends HashMap<String, Object> {
    ConnectionManager$1() {
        super();
    }
    
    {
        ((HashMap<String, Boolean>)this).put("mini", !EssentialConfig.INSTANCE.getEssentialFull());
    }
}