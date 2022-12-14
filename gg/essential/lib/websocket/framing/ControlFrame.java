package gg.essential.lib.websocket.framing;

import gg.essential.lib.websocket.enums.*;
import gg.essential.lib.websocket.exceptions.*;

public abstract class ControlFrame extends FramedataImpl1
{
    public ControlFrame(final Opcode opcode) {
        super(opcode);
    }
    
    @Override
    public void isValid() throws InvalidDataException {
        if (!this.isFin()) {
            throw new InvalidFrameException("Control frame can't have fin==false set");
        }
        if (this.isRSV1()) {
            throw new InvalidFrameException("Control frame can't have rsv1==true set");
        }
        if (this.isRSV2()) {
            throw new InvalidFrameException("Control frame can't have rsv2==true set");
        }
        if (this.isRSV3()) {
            throw new InvalidFrameException("Control frame can't have rsv3==true set");
        }
    }
}
