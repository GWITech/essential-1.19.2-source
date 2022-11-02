package gg.essential.lib.websocket.extensions;

import gg.essential.lib.websocket.framing.*;
import gg.essential.lib.websocket.exceptions.*;

public class DefaultExtension implements IExtension
{
    public DefaultExtension() {
        super();
    }
    
    @Override
    public void isFrameValid(final Framedata inputFrame) throws InvalidDataException {
        if (inputFrame.isRSV1() || inputFrame.isRSV2() || inputFrame.isRSV3()) {
            throw new InvalidFrameException("bad rsv RSV1: " + inputFrame.isRSV1() + " RSV2: " + inputFrame.isRSV2() + " RSV3: " + inputFrame.isRSV3());
        }
    }
    
    @Override
    public String getProvidedExtensionAsClient() {
        return "";
    }
    
    @Override
    public String getProvidedExtensionAsServer() {
        return "";
    }
    
    @Override
    public IExtension copyInstance() {
        return new DefaultExtension();
    }
    
    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
    
    @Override
    public int hashCode() {
        return this.getClass().hashCode();
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && this.getClass() == o.getClass());
    }
}
