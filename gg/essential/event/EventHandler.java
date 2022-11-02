package gg.essential.event;

import gg.essential.api.*;
import gg.essential.*;
import gg.essential.event.client.*;

public class EventHandler
{
    public static void init() {
        EssentialAPI.getShutdownHookUtil().register(() -> Essential.EVENT_BUS.post(new GameShutDownEvent()));
    }
    
    private static /* synthetic */ void lambda$init$0() {
        Essential.EVENT_BUS.post(new GameShutDownEvent());
    }
}
