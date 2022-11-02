package gg.essential.handlers;

import gg.essential.network.client.*;
import gg.essential.universal.*;
import java.util.*;
import gg.essential.util.*;

public class NetworkHook implements MinecraftHook
{
    public NetworkHook() {
        super();
    }
    
    @Override
    public String getSession() {
        return UMinecraft.getMinecraft().getSession().getAccessToken();
    }
    
    @Override
    public UUID getPlayerUUID() {
        return UUIDUtil.getClientUUID();
    }
    
    @Override
    public String getPlayerName() {
        return UMinecraft.getMinecraft().getSession().getProfile().getName();
    }
}
