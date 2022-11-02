package gg.essential.network.connectionmanager;

import java.lang.ref.*;
import java.util.*;

public abstract class StateCallbackManager<E>
{
    private final List<WeakReference<E>> stateCallbacks;
    
    public StateCallbackManager() {
        super();
        this.stateCallbacks = new ArrayList<WeakReference<E>>();
    }
    
    protected List<E> getCallbacks() {
        final List<E> retainedManagers = new ArrayList<E>();
        this.stateCallbacks.removeIf(ref -> {
            final E manager = (E)ref.get();
            if (manager != null) {
                retainedManagers.add(manager);
                return false;
            }
            else {
                return true;
            }
        });
        return retainedManagers;
    }
    
    public void registerStateManager(final E manager) {
        this.stateCallbacks.add(new WeakReference<E>(manager));
    }
    
    private static /* synthetic */ boolean lambda$getCallbacks$0(final List retainedManagers, final WeakReference ref) {
        final E manager = (E)ref.get();
        if (manager != null) {
            retainedManagers.add(manager);
            return false;
        }
        return true;
    }
}
