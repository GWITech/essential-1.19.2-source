package gg.essential.elementa.impl.commonmark.internal.renderer.text;

public abstract class ListHolder
{
    private static final String INDENT_DEFAULT = "   ";
    private static final String INDENT_EMPTY = "";
    private final ListHolder parent;
    private final String indent;
    
    ListHolder(final ListHolder parent) {
        super();
        this.parent = parent;
        if (parent != null) {
            this.indent = parent.indent + "   ";
        }
        else {
            this.indent = "";
        }
    }
    
    public ListHolder getParent() {
        return this.parent;
    }
    
    public String getIndent() {
        return this.indent;
    }
}
