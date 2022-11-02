package gg.essential.elementa.impl.commonmark.ext.ins;

import gg.essential.elementa.impl.commonmark.node.*;

public class Ins extends CustomNode implements Delimited
{
    private static final String DELIMITER = "++";
    
    public Ins() {
        super();
    }
    
    @Override
    public String getOpeningDelimiter() {
        return "++";
    }
    
    @Override
    public String getClosingDelimiter() {
        return "++";
    }
}
