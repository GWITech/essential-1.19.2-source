package gg.essential.elementa.impl.commonmark.renderer.text;

import gg.essential.elementa.impl.commonmark.renderer.*;
import java.util.*;
import gg.essential.elementa.impl.commonmark.node.*;
import gg.essential.elementa.impl.commonmark.internal.renderer.text.*;

public class CoreTextContentNodeRenderer extends AbstractVisitor implements NodeRenderer
{
    protected final TextContentNodeRendererContext context;
    private final TextContentWriter textContent;
    private ListHolder listHolder;
    
    public CoreTextContentNodeRenderer(final TextContentNodeRendererContext context) {
        super();
        this.context = context;
        this.textContent = context.getWriter();
    }
    
    @Override
    public Set<Class<? extends Node>> getNodeTypes() {
        return new HashSet<Class<? extends Node>>(Arrays.asList(Document.class, Heading.class, Paragraph.class, BlockQuote.class, BulletList.class, FencedCodeBlock.class, HtmlBlock.class, ThematicBreak.class, IndentedCodeBlock.class, Link.class, ListItem.class, OrderedList.class, Image.class, Emphasis.class, StrongEmphasis.class, Text.class, Code.class, HtmlInline.class, SoftLineBreak.class, HardLineBreak.class));
    }
    
    @Override
    public void render(final Node node) {
        node.accept(this);
    }
    
    @Override
    public void visit(final Document document) {
        this.visitChildren(document);
    }
    
    @Override
    public void visit(final BlockQuote blockQuote) {
        this.textContent.write('«');
        this.visitChildren(blockQuote);
        this.textContent.write('»');
        this.writeEndOfLineIfNeeded(blockQuote, null);
    }
    
    @Override
    public void visit(final BulletList bulletList) {
        if (this.listHolder != null) {
            this.writeEndOfLine();
        }
        this.listHolder = new BulletListHolder(this.listHolder, bulletList);
        this.visitChildren(bulletList);
        this.writeEndOfLineIfNeeded(bulletList, null);
        if (this.listHolder.getParent() != null) {
            this.listHolder = this.listHolder.getParent();
        }
        else {
            this.listHolder = null;
        }
    }
    
    @Override
    public void visit(final Code code) {
        this.textContent.write('\"');
        this.textContent.write(code.getLiteral());
        this.textContent.write('\"');
    }
    
    @Override
    public void visit(final FencedCodeBlock fencedCodeBlock) {
        if (this.context.stripNewlines()) {
            this.textContent.writeStripped(fencedCodeBlock.getLiteral());
            this.writeEndOfLineIfNeeded(fencedCodeBlock, null);
        }
        else {
            this.textContent.write(fencedCodeBlock.getLiteral());
        }
    }
    
    @Override
    public void visit(final HardLineBreak hardLineBreak) {
        this.writeEndOfLineIfNeeded(hardLineBreak, null);
    }
    
    @Override
    public void visit(final Heading heading) {
        this.visitChildren(heading);
        this.writeEndOfLineIfNeeded(heading, ':');
    }
    
    @Override
    public void visit(final ThematicBreak thematicBreak) {
        if (!this.context.stripNewlines()) {
            this.textContent.write("***");
        }
        this.writeEndOfLineIfNeeded(thematicBreak, null);
    }
    
    @Override
    public void visit(final HtmlInline htmlInline) {
        this.writeText(htmlInline.getLiteral());
    }
    
    @Override
    public void visit(final HtmlBlock htmlBlock) {
        this.writeText(htmlBlock.getLiteral());
    }
    
    @Override
    public void visit(final Image image) {
        this.writeLink(image, image.getTitle(), image.getDestination());
    }
    
    @Override
    public void visit(final IndentedCodeBlock indentedCodeBlock) {
        if (this.context.stripNewlines()) {
            this.textContent.writeStripped(indentedCodeBlock.getLiteral());
            this.writeEndOfLineIfNeeded(indentedCodeBlock, null);
        }
        else {
            this.textContent.write(indentedCodeBlock.getLiteral());
        }
    }
    
    @Override
    public void visit(final Link link) {
        this.writeLink(link, link.getTitle(), link.getDestination());
    }
    
    @Override
    public void visit(final ListItem listItem) {
        if (this.listHolder != null && this.listHolder instanceof OrderedListHolder) {
            final OrderedListHolder orderedListHolder = (OrderedListHolder)this.listHolder;
            final String indent = this.context.stripNewlines() ? "" : orderedListHolder.getIndent();
            this.textContent.write(indent + orderedListHolder.getCounter() + orderedListHolder.getDelimiter() + " ");
            this.visitChildren(listItem);
            this.writeEndOfLineIfNeeded(listItem, null);
            orderedListHolder.increaseCounter();
        }
        else if (this.listHolder != null && this.listHolder instanceof BulletListHolder) {
            final BulletListHolder bulletListHolder = (BulletListHolder)this.listHolder;
            if (!this.context.stripNewlines()) {
                this.textContent.write(bulletListHolder.getIndent() + bulletListHolder.getMarker() + " ");
            }
            this.visitChildren(listItem);
            this.writeEndOfLineIfNeeded(listItem, null);
        }
    }
    
    @Override
    public void visit(final OrderedList orderedList) {
        if (this.listHolder != null) {
            this.writeEndOfLine();
        }
        this.listHolder = new OrderedListHolder(this.listHolder, orderedList);
        this.visitChildren(orderedList);
        this.writeEndOfLineIfNeeded(orderedList, null);
        if (this.listHolder.getParent() != null) {
            this.listHolder = this.listHolder.getParent();
        }
        else {
            this.listHolder = null;
        }
    }
    
    @Override
    public void visit(final Paragraph paragraph) {
        this.visitChildren(paragraph);
        if (paragraph.getParent() == null || paragraph.getParent() instanceof Document) {
            this.writeEndOfLineIfNeeded(paragraph, null);
        }
    }
    
    @Override
    public void visit(final SoftLineBreak softLineBreak) {
        this.writeEndOfLineIfNeeded(softLineBreak, null);
    }
    
    @Override
    public void visit(final Text text) {
        this.writeText(text.getLiteral());
    }
    
    @Override
    protected void visitChildren(final Node parent) {
        Node next;
        for (Node node = parent.getFirstChild(); node != null; node = next) {
            next = node.getNext();
            this.context.render(node);
        }
    }
    
    private void writeText(final String text) {
        if (this.context.stripNewlines()) {
            this.textContent.writeStripped(text);
        }
        else {
            this.textContent.write(text);
        }
    }
    
    private void writeLink(final Node node, final String title, final String destination) {
        final boolean hasChild = node.getFirstChild() != null;
        final boolean hasTitle = title != null && !title.equals(destination);
        final boolean hasDestination = destination != null && !destination.equals("");
        if (hasChild) {
            this.textContent.write('\"');
            this.visitChildren(node);
            this.textContent.write('\"');
            if (hasTitle || hasDestination) {
                this.textContent.whitespace();
                this.textContent.write('(');
            }
        }
        if (hasTitle) {
            this.textContent.write(title);
            if (hasDestination) {
                this.textContent.colon();
                this.textContent.whitespace();
            }
        }
        if (hasDestination) {
            this.textContent.write(destination);
        }
        if (hasChild && (hasTitle || hasDestination)) {
            this.textContent.write(')');
        }
    }
    
    private void writeEndOfLineIfNeeded(final Node node, final Character c) {
        if (this.context.stripNewlines()) {
            if (c != null) {
                this.textContent.write(c);
            }
            if (node.getNext() != null) {
                this.textContent.whitespace();
            }
        }
        else if (node.getNext() != null) {
            this.textContent.line();
        }
    }
    
    private void writeEndOfLine() {
        if (this.context.stripNewlines()) {
            this.textContent.whitespace();
        }
        else {
            this.textContent.line();
        }
    }
}
