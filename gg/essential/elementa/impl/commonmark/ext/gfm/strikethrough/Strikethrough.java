package gg.essential.elementa.impl.commonmark.ext.gfm.strikethrough;

import gg.essential.elementa.impl.commonmark.node.*;

public class Strikethrough extends CustomNode implements Delimited
{
    private static final String DELIMITER = "~~";
    
    public Strikethrough() {
        super();
    }
    
    @Override
    public String getOpeningDelimiter() {
        return "~~";
    }
    
    @Override
    public String getClosingDelimiter() {
        return "~~";
    }
}
