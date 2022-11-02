package gg.essential.elementa.impl.commonmark.node;

public abstract class ListBlock extends Block
{
    private boolean tight;
    
    public ListBlock() {
        super();
    }
    
    public boolean isTight() {
        return this.tight;
    }
    
    public void setTight(final boolean tight) {
        this.tight = tight;
    }
}
