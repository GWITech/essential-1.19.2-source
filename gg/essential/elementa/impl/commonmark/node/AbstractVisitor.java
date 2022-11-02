package gg.essential.elementa.impl.commonmark.node;

public abstract class AbstractVisitor implements Visitor
{
    public AbstractVisitor() {
        super();
    }
    
    @Override
    public void visit(final BlockQuote blockQuote) {
        this.visitChildren(blockQuote);
    }
    
    @Override
    public void visit(final BulletList bulletList) {
        this.visitChildren(bulletList);
    }
    
    @Override
    public void visit(final Code code) {
        this.visitChildren(code);
    }
    
    @Override
    public void visit(final Document document) {
        this.visitChildren(document);
    }
    
    @Override
    public void visit(final Emphasis emphasis) {
        this.visitChildren(emphasis);
    }
    
    @Override
    public void visit(final FencedCodeBlock fencedCodeBlock) {
        this.visitChildren(fencedCodeBlock);
    }
    
    @Override
    public void visit(final HardLineBreak hardLineBreak) {
        this.visitChildren(hardLineBreak);
    }
    
    @Override
    public void visit(final Heading heading) {
        this.visitChildren(heading);
    }
    
    @Override
    public void visit(final ThematicBreak thematicBreak) {
        this.visitChildren(thematicBreak);
    }
    
    @Override
    public void visit(final HtmlInline htmlInline) {
        this.visitChildren(htmlInline);
    }
    
    @Override
    public void visit(final HtmlBlock htmlBlock) {
        this.visitChildren(htmlBlock);
    }
    
    @Override
    public void visit(final Image image) {
        this.visitChildren(image);
    }
    
    @Override
    public void visit(final IndentedCodeBlock indentedCodeBlock) {
        this.visitChildren(indentedCodeBlock);
    }
    
    @Override
    public void visit(final Link link) {
        this.visitChildren(link);
    }
    
    @Override
    public void visit(final ListItem listItem) {
        this.visitChildren(listItem);
    }
    
    @Override
    public void visit(final OrderedList orderedList) {
        this.visitChildren(orderedList);
    }
    
    @Override
    public void visit(final Paragraph paragraph) {
        this.visitChildren(paragraph);
    }
    
    @Override
    public void visit(final SoftLineBreak softLineBreak) {
        this.visitChildren(softLineBreak);
    }
    
    @Override
    public void visit(final StrongEmphasis strongEmphasis) {
        this.visitChildren(strongEmphasis);
    }
    
    @Override
    public void visit(final Text text) {
        this.visitChildren(text);
    }
    
    @Override
    public void visit(final LinkReferenceDefinition linkReferenceDefinition) {
        this.visitChildren(linkReferenceDefinition);
    }
    
    @Override
    public void visit(final CustomBlock customBlock) {
        this.visitChildren(customBlock);
    }
    
    @Override
    public void visit(final CustomNode customNode) {
        this.visitChildren(customNode);
    }
    
    protected void visitChildren(final Node parent) {
        Node next;
        for (Node node = parent.getFirstChild(); node != null; node = next) {
            next = node.getNext();
            node.accept(this);
        }
    }
}
