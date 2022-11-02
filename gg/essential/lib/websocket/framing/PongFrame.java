package gg.essential.lib.websocket.framing;

import gg.essential.lib.websocket.enums.*;

public class PongFrame extends ControlFrame
{
    public PongFrame() {
        super(Opcode.PONG);
    }
    
    public PongFrame(final PingFrame pingFrame) {
        super(Opcode.PONG);
        this.setPayload(pingFrame.getPayloadData());
    }
}
