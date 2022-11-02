package gg.essential.lib.websocket.framing;

import gg.essential.lib.websocket.enums.*;

public class ContinuousFrame extends DataFrame
{
    public ContinuousFrame() {
        super(Opcode.CONTINUOUS);
    }
}
