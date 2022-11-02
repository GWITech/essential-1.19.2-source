package gg.essential.lib.websocket.framing;

import gg.essential.lib.websocket.enums.*;
import java.nio.*;

public interface Framedata
{
    boolean isFin();
    
    boolean isRSV1();
    
    boolean isRSV2();
    
    boolean isRSV3();
    
    Opcode getOpcode();
    
    ByteBuffer getPayloadData();
}
