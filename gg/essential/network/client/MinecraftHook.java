package gg.essential.network.client;

import java.util.*;

public interface MinecraftHook
{
    String getSession();
    
    UUID getPlayerUUID();
    
    String getPlayerName();
}
