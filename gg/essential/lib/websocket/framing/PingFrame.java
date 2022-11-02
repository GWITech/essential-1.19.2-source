package gg.essential.lib.websocket.framing;

import gg.essential.lib.websocket.enums.*;

public class PingFrame extends ControlFrame
{
    public PingFrame() {
        super(Opcode.PING);
    }
}
