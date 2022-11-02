package gg.essential.lib.websocket.framing;

import gg.essential.lib.websocket.enums.*;
import gg.essential.lib.websocket.exceptions.*;

public abstract class DataFrame extends FramedataImpl1
{
    public DataFrame(final Opcode opcode) {
        super(opcode);
    }
    
    @Override
    public void isValid() throws InvalidDataException {
    }
}
