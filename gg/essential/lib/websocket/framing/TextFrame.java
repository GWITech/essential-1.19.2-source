package gg.essential.lib.websocket.framing;

import gg.essential.lib.websocket.enums.*;
import gg.essential.lib.websocket.util.*;
import gg.essential.lib.websocket.exceptions.*;

public class TextFrame extends DataFrame
{
    public TextFrame() {
        super(Opcode.TEXT);
    }
    
    @Override
    public void isValid() throws InvalidDataException {
        super.isValid();
        if (!Charsetfunctions.isValidUTF8(this.getPayloadData())) {
            throw new InvalidDataException(1007, "Received text is no valid utf8 string!");
        }
    }
}
