package gg.essential.network.connectionmanager;

public interface NetworkedManager
{
    default void onConnected() {
        this.resetState();
    }
    
    default void resetState() {
    }
}
