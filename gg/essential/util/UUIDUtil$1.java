package gg.essential.util;

import gg.essential.event.client.*;
import gg.essential.lib.kbrewster.eventbus.*;

class UUIDUtil$1 {
    UUIDUtil$1() {
        super();
    }
    
    @Subscribe
    private void clearUUIDCache(final ReAuthEvent.Pre event) {
        UUIDUtil.cachedUUID = null;
    }
}