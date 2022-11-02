package gg.essential.elementa.markdown;

import gg.essential.elementa.impl.commonmark.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.impl.commonmark.parser.*;
import kotlin.collections.*;
import kotlin.*;
import java.util.*;
import java.net.*;
import gg.essential.elementa.markdown.drawables.*;
import gg.essential.elementa.impl.commonmark.node.*;
import gg.essential.elementa.impl.commonmark.ext.gfm.strikethrough.*;
import gg.essential.elementa.impl.commonmark.ext.ins.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 ?2\u00020\u0001:\u0002?@B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u0010\u001a\u00020\u0011H\u0002J\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010 \u001a\u00020!H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010$\u001a\u00020%H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010.\u001a\u00020/H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u00100\u001a\u000201H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u00102\u001a\u000203H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u00104\u001a\u000205H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u00106\u001a\u000207H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u00108\u001a\u000209H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010:\u001a\u00020;H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020<H\u0016J\u0010\u0010\u0015\u001a\u00020\u00112\u0006\u0010=\u001a\u00020>H\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006A" }, d2 = { "Lgg/essential/elementa/markdown/MarkdownRendererImpl;", "Lgg/essential/elementa/impl/commonmark/node/AbstractVisitor;", "text", "", "md", "Lgg/essential/elementa/markdown/MarkdownComponent;", "config", "Lgg/essential/elementa/markdown/MarkdownConfig;", "(Ljava/lang/String;Lgg/essential/elementa/markdown/MarkdownComponent;Lgg/essential/elementa/markdown/MarkdownConfig;)V", "drawables", "", "Lgg/essential/elementa/markdown/drawables/Drawable;", "marks", "", "style", "Lgg/essential/elementa/markdown/MarkdownRendererImpl$MutableStyle;", "mark", "", "render", "Lgg/essential/elementa/markdown/drawables/DrawableList;", "unmarkAndCollect", "visit", "blockQuote", "Lgg/essential/elementa/impl/commonmark/node/BlockQuote;", "bulletList", "Lgg/essential/elementa/impl/commonmark/node/BulletList;", "code", "Lgg/essential/elementa/impl/commonmark/node/Code;", "customBlock", "Lgg/essential/elementa/impl/commonmark/node/CustomBlock;", "customNode", "Lgg/essential/elementa/impl/commonmark/node/CustomNode;", "emphasis", "Lgg/essential/elementa/impl/commonmark/node/Emphasis;", "fencedCodeBlock", "Lgg/essential/elementa/impl/commonmark/node/FencedCodeBlock;", "hardLineBreak", "Lgg/essential/elementa/impl/commonmark/node/HardLineBreak;", "heading", "Lgg/essential/elementa/impl/commonmark/node/Heading;", "htmlInline", "Lgg/essential/elementa/impl/commonmark/node/HtmlInline;", "image", "Lgg/essential/elementa/impl/commonmark/node/Image;", "indentedCodeBlock", "Lgg/essential/elementa/impl/commonmark/node/IndentedCodeBlock;", "link", "Lgg/essential/elementa/impl/commonmark/node/Link;", "linkReferenceDefinition", "Lgg/essential/elementa/impl/commonmark/node/LinkReferenceDefinition;", "listItem", "Lgg/essential/elementa/impl/commonmark/node/ListItem;", "orderedList", "Lgg/essential/elementa/impl/commonmark/node/OrderedList;", "paragraph", "Lgg/essential/elementa/impl/commonmark/node/Paragraph;", "softLineBreak", "Lgg/essential/elementa/impl/commonmark/node/SoftLineBreak;", "strongEmphasis", "Lgg/essential/elementa/impl/commonmark/node/StrongEmphasis;", "Lgg/essential/elementa/impl/commonmark/node/Text;", "thematicBreak", "Lgg/essential/elementa/impl/commonmark/node/ThematicBreak;", "Companion", "MutableStyle", "Elementa" })
final class MarkdownRendererImpl extends AbstractVisitor
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final String text;
    @NotNull
    private final MarkdownComponent md;
    @NotNull
    private final MarkdownConfig config;
    @NotNull
    private final List<Drawable> drawables;
    @NotNull
    private final MutableStyle style;
    @NotNull
    private final List<Integer> marks;
    @NotNull
    private static final List<Extension> extensions;
    
    public MarkdownRendererImpl(@NotNull final String text, @NotNull final MarkdownComponent md, @NotNull final MarkdownConfig config) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)md, "md");
        Intrinsics.checkNotNullParameter((Object)config, "config");
        super();
        this.text = text;
        this.md = md;
        this.config = config;
        this.drawables = new ArrayList<Drawable>();
        this.style = new MutableStyle(false, false, false, false, false, null, 63, null);
        this.marks = new ArrayList<Integer>();
    }
    
    private final void mark() {
        this.marks.add(this.drawables.size());
    }
    
    @NotNull
    public final DrawableList render() {
        final Set $this$render_u24lambda_u2d0;
        final Set enabledBlockTypes = $this$render_u24lambda_u2d0 = new LinkedHashSet();
        final int n = 0;
        if (this.config.getHeaderConfig().getEnabled()) {
            $this$render_u24lambda_u2d0.add(Heading.class);
        }
        if (this.config.getCodeBlockConfig().getEnabled()) {
            $this$render_u24lambda_u2d0.add(FencedCodeBlock.class);
            $this$render_u24lambda_u2d0.add(IndentedCodeBlock.class);
        }
        if (this.config.getBlockquoteConfig().getEnabled()) {
            $this$render_u24lambda_u2d0.add(BlockQuote.class);
        }
        if (this.config.getListConfig().getEnabled()) {
            $this$render_u24lambda_u2d0.add(ListBlock.class);
        }
        final Node document = Parser.builder().extensions(MarkdownRendererImpl.extensions).enabledBlockTypes(enabledBlockTypes).build().parse(this.text);
        document.accept(this);
        return new DrawableList(this.md, this.drawables);
    }
    
    private final DrawableList unmarkAndCollect() {
        final int lastMark = this.marks.remove(CollectionsKt.getLastIndex((List)this.marks)).intValue();
        final List slice = CollectionsKt.toList((Iterable)this.drawables.subList(lastMark, this.drawables.size()));
        for (int size = slice.size(), i = 0; i < size; ++i) {
            final int it = i;
            final int n = 0;
            this.drawables.remove(CollectionsKt.getLastIndex((List)this.drawables));
        }
        return new DrawableList(this.md, slice);
    }
    
    @Override
    public void visit(@NotNull final Emphasis emphasis) {
        Intrinsics.checkNotNullParameter((Object)emphasis, "emphasis");
        this.style.setItalic(true);
        super.visit(emphasis);
        this.style.setItalic(false);
    }
    
    @Override
    public void visit(@NotNull final StrongEmphasis strongEmphasis) {
        Intrinsics.checkNotNullParameter((Object)strongEmphasis, "strongEmphasis");
        this.style.setBold(true);
        super.visit(strongEmphasis);
        this.style.setBold(false);
    }
    
    @Override
    public void visit(@NotNull final Text text) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        if (text.getFirstChild() != null) {
            throw (Throwable)new NotImplementedError((String)null, 1, (DefaultConstructorMarker)null);
        }
        final List<Drawable> drawables = this.drawables;
        final MarkdownComponent md = this.md;
        final String literal = text.getLiteral();
        Intrinsics.checkNotNullExpressionValue((Object)literal, "text.literal");
        drawables.add(new TextDrawable(md, literal, this.style.toTextStyle()));
    }
    
    @Override
    public void visit(@NotNull final Paragraph paragraph) {
        Intrinsics.checkNotNullParameter((Object)paragraph, "paragraph");
        this.mark();
        super.visit(paragraph);
        this.drawables.add(new ParagraphDrawable(this.md, this.unmarkAndCollect()));
    }
    
    @Override
    public void visit(@NotNull final BlockQuote blockQuote) {
        Intrinsics.checkNotNullParameter((Object)blockQuote, "blockQuote");
        this.mark();
        super.visit(blockQuote);
        this.drawables.add((Drawable)new BlockquoteDrawable(this.md, this.unmarkAndCollect()));
    }
    
    @Override
    public void visit(@NotNull final BulletList bulletList) {
        Intrinsics.checkNotNullParameter((Object)bulletList, "bulletList");
        this.mark();
        super.visit(bulletList);
        final DrawableList children = this.unmarkAndCollect();
        final Iterable $this$any$iv = children;
        final int $i$f$any = 0;
        boolean b = false;
        Label_0118: {
            if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
                b = false;
            }
            else {
                for (final Object element$iv : $this$any$iv) {
                    final Drawable it = (Drawable)element$iv;
                    final int n = 0;
                    if (!(it instanceof DrawableList) && !(it instanceof ListDrawable)) {
                        b = true;
                        break Label_0118;
                    }
                }
                b = false;
            }
        }
        if (b) {
            throw (Throwable)new NotImplementedError((String)null, 1, (DefaultConstructorMarker)null);
        }
        this.drawables.add(new ListDrawable(this.md, children, false, !bulletList.isTight()));
    }
    
    @Override
    public void visit(@NotNull final ListItem listItem) {
        Intrinsics.checkNotNullParameter((Object)listItem, "listItem");
        this.mark();
        super.visit(listItem);
        this.drawables.add(new DrawableList(this.md, this.unmarkAndCollect()));
    }
    
    @Override
    public void visit(@NotNull final OrderedList orderedList) {
        Intrinsics.checkNotNullParameter((Object)orderedList, "orderedList");
        this.mark();
        super.visit(orderedList);
        final DrawableList children = this.unmarkAndCollect();
        final Iterable $this$any$iv = children;
        final int $i$f$any = 0;
        boolean b = false;
        Label_0118: {
            if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
                b = false;
            }
            else {
                for (final Object element$iv : $this$any$iv) {
                    final Drawable it = (Drawable)element$iv;
                    final int n = 0;
                    if (!(it instanceof DrawableList) && !(it instanceof ListDrawable)) {
                        b = true;
                        break Label_0118;
                    }
                }
                b = false;
            }
        }
        if (b) {
            throw (Throwable)new NotImplementedError((String)null, 1, (DefaultConstructorMarker)null);
        }
        this.drawables.add(new ListDrawable(this.md, children, true, !orderedList.isTight()));
    }
    
    @Override
    public void visit(@NotNull final Code code) {
        Intrinsics.checkNotNullParameter((Object)code, "code");
        this.style.setCode(true);
        final List<Drawable> drawables = this.drawables;
        final MarkdownComponent md = this.md;
        final String literal = code.getLiteral();
        Intrinsics.checkNotNullExpressionValue((Object)literal, "code.literal");
        drawables.add(new TextDrawable(md, literal, this.style.toTextStyle()));
        this.style.setCode(false);
    }
    
    @Override
    public void visit(@NotNull final FencedCodeBlock fencedCodeBlock) {
        Intrinsics.checkNotNullParameter((Object)fencedCodeBlock, "fencedCodeBlock");
    }
    
    @Override
    public void visit(@NotNull final HardLineBreak hardLineBreak) {
        Intrinsics.checkNotNullParameter((Object)hardLineBreak, "hardLineBreak");
        if (hardLineBreak.getFirstChild() != null) {
            throw (Throwable)new NotImplementedError((String)null, 1, (DefaultConstructorMarker)null);
        }
        this.drawables.add(new HardBreakDrawable(this.md));
    }
    
    @Override
    public void visit(@NotNull final Heading heading) {
        Intrinsics.checkNotNullParameter((Object)heading, "heading");
        this.mark();
        super.visit(heading);
        final DrawableList children = this.unmarkAndCollect();
        this.drawables.add(new HeaderDrawable(this.md, heading.getLevel(), new ParagraphDrawable(this.md, children)));
    }
    
    @Override
    public void visit(@NotNull final ThematicBreak thematicBreak) {
        Intrinsics.checkNotNullParameter((Object)thematicBreak, "thematicBreak");
    }
    
    @Override
    public void visit(@NotNull final HtmlInline htmlInline) {
        Intrinsics.checkNotNullParameter((Object)htmlInline, "htmlInline");
        final List<Drawable> drawables = this.drawables;
        final MarkdownComponent md = this.md;
        final String literal = htmlInline.getLiteral();
        Intrinsics.checkNotNullExpressionValue((Object)literal, "htmlInline.literal");
        drawables.add(new TextDrawable(md, literal, this.style.toTextStyle()));
    }
    
    @Override
    public void visit(@NotNull final Image image) {
        Intrinsics.checkNotNullParameter((Object)image, "image");
        this.mark();
        super.visit(image);
        final DrawableList fallback = this.unmarkAndCollect();
        this.drawables.add(new ImageDrawable(this.md, new URL(image.getDestination()), fallback));
    }
    
    @Override
    public void visit(@NotNull final IndentedCodeBlock indentedCodeBlock) {
        Intrinsics.checkNotNullParameter((Object)indentedCodeBlock, "indentedCodeBlock");
    }
    
    @Override
    public void visit(@NotNull final Link link) {
        Intrinsics.checkNotNullParameter((Object)link, "link");
        this.style.setLinkLocation(link.getDestination());
        super.visit(link);
        this.style.setLinkLocation(null);
    }
    
    @Override
    public void visit(@NotNull final SoftLineBreak softLineBreak) {
        Intrinsics.checkNotNullParameter((Object)softLineBreak, "softLineBreak");
        if (softLineBreak.getFirstChild() != null) {
            throw (Throwable)new NotImplementedError((String)null, 1, (DefaultConstructorMarker)null);
        }
        this.drawables.add(new SoftBreakDrawable(this.md));
    }
    
    @Override
    public void visit(@NotNull final LinkReferenceDefinition linkReferenceDefinition) {
        Intrinsics.checkNotNullParameter((Object)linkReferenceDefinition, "linkReferenceDefinition");
    }
    
    @Override
    public void visit(@NotNull final CustomBlock customBlock) {
        Intrinsics.checkNotNullParameter((Object)customBlock, "customBlock");
    }
    
    @Override
    public void visit(@NotNull final CustomNode customNode) {
        Intrinsics.checkNotNullParameter((Object)customNode, "customNode");
        if (customNode instanceof Strikethrough) {
            this.style.setStrikethrough(true);
            super.visit(customNode);
            this.style.setStrikethrough(false);
        }
        else {
            if (!(customNode instanceof Ins)) {
                throw (Throwable)new NotImplementedError((String)null, 1, (DefaultConstructorMarker)null);
            }
            this.style.setUnderline(true);
            super.visit(customNode);
            this.style.setUnderline(false);
        }
    }
    
    static {
        Companion = new Companion(null);
        extensions = CollectionsKt.listOf((Object[])new Extension[] { StrikethroughExtension.create(), InsExtension.create() });
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u00c6\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\tH\u00d6\u0001J\u0006\u0010\"\u001a\u00020#R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\u000b\"\u0004\b\u000e\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u000b\"\u0004\b\u0010\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006$" }, d2 = { "Lgg/essential/elementa/markdown/MarkdownRendererImpl$MutableStyle;", "", "isBold", "", "isItalic", "isStrikethrough", "isUnderline", "isCode", "linkLocation", "", "(ZZZZZLjava/lang/String;)V", "()Z", "setBold", "(Z)V", "setCode", "setItalic", "setStrikethrough", "setUnderline", "getLinkLocation", "()Ljava/lang/String;", "setLinkLocation", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "toTextStyle", "Lgg/essential/elementa/markdown/drawables/TextDrawable$Style;", "Elementa" })
    public static final class MutableStyle
    {
        private boolean isBold;
        private boolean isItalic;
        private boolean isStrikethrough;
        private boolean isUnderline;
        private boolean isCode;
        @Nullable
        private String linkLocation;
        
        public MutableStyle(final boolean isBold, final boolean isItalic, final boolean isStrikethrough, final boolean isUnderline, final boolean isCode, @Nullable final String linkLocation) {
            super();
            this.isBold = isBold;
            this.isItalic = isItalic;
            this.isStrikethrough = isStrikethrough;
            this.isUnderline = isUnderline;
            this.isCode = isCode;
            this.linkLocation = linkLocation;
        }
        
        public MutableStyle(boolean isBold, boolean isItalic, boolean isStrikethrough, boolean isUnderline, boolean isCode, String linkLocation, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
            if ((n & 0x1) != 0x0) {
                isBold = false;
            }
            if ((n & 0x2) != 0x0) {
                isItalic = false;
            }
            if ((n & 0x4) != 0x0) {
                isStrikethrough = false;
            }
            if ((n & 0x8) != 0x0) {
                isUnderline = false;
            }
            if ((n & 0x10) != 0x0) {
                isCode = false;
            }
            if ((n & 0x20) != 0x0) {
                linkLocation = null;
            }
            this(isBold, isItalic, isStrikethrough, isUnderline, isCode, linkLocation);
        }
        
        public final boolean isBold() {
            return this.isBold;
        }
        
        public final void setBold(final boolean <set-?>) {
            this.isBold = <set-?>;
        }
        
        public final boolean isItalic() {
            return this.isItalic;
        }
        
        public final void setItalic(final boolean <set-?>) {
            this.isItalic = <set-?>;
        }
        
        public final boolean isStrikethrough() {
            return this.isStrikethrough;
        }
        
        public final void setStrikethrough(final boolean <set-?>) {
            this.isStrikethrough = <set-?>;
        }
        
        public final boolean isUnderline() {
            return this.isUnderline;
        }
        
        public final void setUnderline(final boolean <set-?>) {
            this.isUnderline = <set-?>;
        }
        
        public final boolean isCode() {
            return this.isCode;
        }
        
        public final void setCode(final boolean <set-?>) {
            this.isCode = <set-?>;
        }
        
        @Nullable
        public final String getLinkLocation() {
            return this.linkLocation;
        }
        
        public final void setLinkLocation(@Nullable final String <set-?>) {
            this.linkLocation = <set-?>;
        }
        
        @NotNull
        public final TextDrawable.Style toTextStyle() {
            return new TextDrawable.Style(this.isBold, this.isItalic, this.isStrikethrough, this.isUnderline, this.isCode, this.linkLocation);
        }
        
        public final boolean component1() {
            return this.isBold;
        }
        
        public final boolean component2() {
            return this.isItalic;
        }
        
        public final boolean component3() {
            return this.isStrikethrough;
        }
        
        public final boolean component4() {
            return this.isUnderline;
        }
        
        public final boolean component5() {
            return this.isCode;
        }
        
        @Nullable
        public final String component6() {
            return this.linkLocation;
        }
        
        @NotNull
        public final MutableStyle copy(final boolean isBold, final boolean isItalic, final boolean isStrikethrough, final boolean isUnderline, final boolean isCode, @Nullable final String linkLocation) {
            return new MutableStyle(isBold, isItalic, isStrikethrough, isUnderline, isCode, linkLocation);
        }
        
        public static /* synthetic */ MutableStyle copy$default(final MutableStyle mutableStyle, boolean isBold, boolean isItalic, boolean isStrikethrough, boolean isUnderline, boolean isCode, String linkLocation, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                isBold = mutableStyle.isBold;
            }
            if ((n & 0x2) != 0x0) {
                isItalic = mutableStyle.isItalic;
            }
            if ((n & 0x4) != 0x0) {
                isStrikethrough = mutableStyle.isStrikethrough;
            }
            if ((n & 0x8) != 0x0) {
                isUnderline = mutableStyle.isUnderline;
            }
            if ((n & 0x10) != 0x0) {
                isCode = mutableStyle.isCode;
            }
            if ((n & 0x20) != 0x0) {
                linkLocation = mutableStyle.linkLocation;
            }
            return mutableStyle.copy(isBold, isItalic, isStrikethrough, isUnderline, isCode, linkLocation);
        }
        
        @NotNull
        @Override
        public String toString() {
            return "MutableStyle(isBold=" + this.isBold + ", isItalic=" + this.isItalic + ", isStrikethrough=" + this.isStrikethrough + ", isUnderline=" + this.isUnderline + ", isCode=" + this.isCode + ", linkLocation=" + (Object)this.linkLocation + ')';
        }
        
        @Override
        public int hashCode() {
            int isBold;
            if ((isBold = (this.isBold ? 1 : 0)) != 0) {
                isBold = 1;
            }
            int result = isBold;
            final int n = result * 31;
            int isItalic;
            if ((isItalic = (this.isItalic ? 1 : 0)) != 0) {
                isItalic = 1;
            }
            result = n + isItalic;
            final int n2 = result * 31;
            int isStrikethrough;
            if ((isStrikethrough = (this.isStrikethrough ? 1 : 0)) != 0) {
                isStrikethrough = 1;
            }
            result = n2 + isStrikethrough;
            final int n3 = result * 31;
            int isUnderline;
            if ((isUnderline = (this.isUnderline ? 1 : 0)) != 0) {
                isUnderline = 1;
            }
            result = n3 + isUnderline;
            final int n4 = result * 31;
            int isCode;
            if ((isCode = (this.isCode ? 1 : 0)) != 0) {
                isCode = 1;
            }
            result = n4 + isCode;
            result = result * 31 + ((this.linkLocation == null) ? 0 : this.linkLocation.hashCode());
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MutableStyle)) {
                return false;
            }
            final MutableStyle mutableStyle = (MutableStyle)other;
            return this.isBold == mutableStyle.isBold && this.isItalic == mutableStyle.isItalic && this.isStrikethrough == mutableStyle.isStrikethrough && this.isUnderline == mutableStyle.isUnderline && this.isCode == mutableStyle.isCode && Intrinsics.areEqual((Object)this.linkLocation, (Object)mutableStyle.linkLocation);
        }
        
        public MutableStyle() {
            this(false, false, false, false, false, null, 63, null);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007" }, d2 = { "Lgg/essential/elementa/markdown/MarkdownRendererImpl$Companion;", "", "()V", "extensions", "", "Lgg/essential/elementa/impl/commonmark/Extension;", "kotlin.jvm.PlatformType", "Elementa" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
