package gg.essential.lib.websocket.framing;

import gg.essential.lib.websocket.enums.*;

public class BinaryFrame extends DataFrame
{
    public BinaryFrame() {
        super(Opcode.BINARY);
    }
}
