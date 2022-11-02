package gg.essential.elementa.impl.commonmark.internal;

import gg.essential.elementa.impl.commonmark.parser.block.*;
import gg.essential.elementa.impl.commonmark.node.*;

public class ListItemParser extends AbstractBlockParser
{
    private final ListItem block;
    private int contentIndent;
    private boolean hadBlankLine;
    
    public ListItemParser(final int contentIndent) {
        super();
        this.block = new ListItem();
        this.contentIndent = contentIndent;
    }
    
    @Override
    public boolean isContainer() {
        return true;
    }
    
    @Override
    public boolean canContain(final Block childBlock) {
        if (this.hadBlankLine) {
            final Block parent = this.block.getParent();
            if (parent instanceof ListBlock) {
                ((ListBlock)parent).setTight(false);
            }
        }
        return true;
    }
    
    @Override
    public Block getBlock() {
        return this.block;
    }
    
    @Override
    public BlockContinue tryContinue(final ParserState state) {
        if (state.isBlank()) {
            if (this.block.getFirstChild() == null) {
                return BlockContinue.none();
            }
            final Block activeBlock = state.getActiveBlockParser().getBlock();
            this.hadBlankLine = (activeBlock instanceof Paragraph || activeBlock instanceof ListItem);
            return BlockContinue.atIndex(state.getNextNonSpaceIndex());
        }
        else {
            if (state.getIndent() >= this.contentIndent) {
                return BlockContinue.atColumn(state.getColumn() + this.contentIndent);
            }
            return BlockContinue.none();
        }
    }
}
