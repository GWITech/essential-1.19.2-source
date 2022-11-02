package gg.essential.elementa.impl.commonmark.node;

public interface Visitor
{
    void visit(final BlockQuote p0);
    
    void visit(final BulletList p0);
    
    void visit(final Code p0);
    
    void visit(final Document p0);
    
    void visit(final Emphasis p0);
    
    void visit(final FencedCodeBlock p0);
    
    void visit(final HardLineBreak p0);
    
    void visit(final Heading p0);
    
    void visit(final ThematicBreak p0);
    
    void visit(final HtmlInline p0);
    
    void visit(final HtmlBlock p0);
    
    void visit(final Image p0);
    
    void visit(final IndentedCodeBlock p0);
    
    void visit(final Link p0);
    
    void visit(final ListItem p0);
    
    void visit(final OrderedList p0);
    
    void visit(final Paragraph p0);
    
    void visit(final SoftLineBreak p0);
    
    void visit(final StrongEmphasis p0);
    
    void visit(final Text p0);
    
    void visit(final LinkReferenceDefinition p0);
    
    void visit(final CustomBlock p0);
    
    void visit(final CustomNode p0);
}
