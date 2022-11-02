package gg.essential.lib.websocket.extensions;

import gg.essential.lib.websocket.framing.*;
import gg.essential.lib.websocket.exceptions.*;

public interface IExtension
{
    void isFrameValid(final Framedata p0) throws InvalidDataException;
    
    String getProvidedExtensionAsClient();
    
    String getProvidedExtensionAsServer();
    
    IExtension copyInstance();
    
    String toString();
}
