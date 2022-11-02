package gg.essential.elementa.markdown.drawables;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.font.*;
import kotlin.collections.*;
import java.util.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;
import gg.essential.elementa.markdown.*;
import gg.essential.elementa.markdown.selection.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0002\u0010\nJ,\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\f\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016J\f\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J \u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0014J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0017H\u0016R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)" }, d2 = { "Lgg/essential/elementa/markdown/drawables/ListDrawable$ListEntry;", "Lgg/essential/elementa/markdown/drawables/Drawable;", "md", "Lgg/essential/elementa/markdown/MarkdownComponent;", "symbol", "", "symbolWidth", "", "symbolPaddingRight", "drawable", "(Lgg/essential/elementa/markdown/drawables/ListDrawable;Lgg/essential/elementa/markdown/MarkdownComponent;Ljava/lang/String;FFLgg/essential/elementa/markdown/drawables/Drawable;)V", "actualSymbolWidth", "children", "", "getChildren", "()Ljava/util/List;", "getDrawable", "()Lgg/essential/elementa/markdown/drawables/Drawable;", "cursorAt", "Lgg/essential/elementa/markdown/selection/Cursor;", "mouseX", "mouseY", "dragged", "", "mouseButton", "", "cursorAtEnd", "cursorAtStart", "draw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "state", "Lgg/essential/elementa/markdown/DrawState;", "layoutImpl", "Lgg/essential/elementa/markdown/drawables/Drawable$Layout;", "x", "y", "width", "selectedText", "asMarkdown", "Elementa" })
public final class ListEntry extends Drawable
{
    @NotNull
    private final String symbol;
    private final float symbolWidth;
    private final float symbolPaddingRight;
    @NotNull
    private final Drawable drawable;
    private final float actualSymbolWidth;
    final /* synthetic */ ListDrawable this$0;
    
    public ListEntry(@NotNull final ListDrawable this$0, @NotNull final MarkdownComponent md, final String symbol, final float symbolWidth, @NotNull final float symbolPaddingRight, final Drawable drawable) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)md, "md");
        Intrinsics.checkNotNullParameter((Object)symbol, "symbol");
        Intrinsics.checkNotNullParameter((Object)drawable, "drawable");
        this.this$0 = this$0;
        super(md);
        this.symbol = symbol;
        this.symbolWidth = symbolWidth;
        this.symbolPaddingRight = symbolPaddingRight;
        this.drawable = drawable;
        this.actualSymbolWidth = UtilitiesKt.width$default(this.symbol, 0.0f, null, 3, null);
        Drawable.Companion.trim(this.drawable);
        if (this.drawable instanceof DrawableList) {
            final Iterator<Drawable> iterator = ((DrawableList)this.drawable).iterator();
            int n = 0;
            while (iterator.hasNext()) {
                final int index = n;
                ++n;
                final Drawable item = iterator.next();
                if (item instanceof ListDrawable) {
                    if (index != 0) {
                        Drawable.Companion.trim(((DrawableList)this.drawable).get(index - 1));
                    }
                    if (index == CollectionsKt.getLastIndex((List)this.drawable)) {
                        continue;
                    }
                    Drawable.Companion.trim(((DrawableList)this.drawable).get(index + 1));
                }
            }
        }
    }
    
    @NotNull
    public final Drawable getDrawable() {
        return this.drawable;
    }
    
    @NotNull
    @Override
    public List<Drawable> getChildren() {
        return CollectionsKt.listOf((Object)this.drawable);
    }
    
    @NotNull
    @Override
    protected Layout layoutImpl(final float x, final float y, final float width) {
        final float nonDrawableSpace = this.symbolWidth + this.symbolPaddingRight;
        this.drawable.layout(x + nonDrawableSpace, y, width - nonDrawableSpace);
        return new Layout(x, y, width, this.drawable.getHeight(), null, 16, null);
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack, @NotNull final DrawState state) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)state, "state");
        final float newX = this.getX() + this.symbolWidth - this.actualSymbolWidth;
        if (!(this.drawable instanceof ListDrawable)) {
            TextDrawable.Companion.drawString$default(TextDrawable.Companion, matrixStack, this.getConfig(), this.getMd().getFontProvider(), this.symbol, newX + state.getXShift(), this.getY() + state.getYShift(), false, false, false, null, 960, null);
        }
        this.drawable.drawCompat(matrixStack, state);
    }
    
    @NotNull
    @Override
    public Cursor<?> cursorAt(final float mouseX, final float mouseY, final boolean dragged, final int mouseButton) {
        return this.drawable.cursorAt(mouseX, mouseY, dragged, mouseButton);
    }
    
    @NotNull
    @Override
    public Cursor<?> cursorAtStart() {
        return this.drawable.cursorAtStart();
    }
    
    @NotNull
    @Override
    public Cursor<?> cursorAtEnd() {
        return this.drawable.cursorAtEnd();
    }
    
    @NotNull
    @Override
    public String selectedText(final boolean asMarkdown) {
        if (!this.hasSelectedText()) {
            return "";
        }
        final String text = this.drawable.selectedText(asMarkdown);
        final ListDrawable this$0 = this.this$0;
        final StringBuilder $this$selectedText_u24lambda_u2d1;
        final StringBuilder sb = $this$selectedText_u24lambda_u2d1 = new StringBuilder();
        final int n = 0;
        for (int access$getIndentLevel$p = ListDrawable.access$getIndentLevel$p(this$0), i = 0; i < access$getIndentLevel$p; ++i) {
            final int it = i;
            final int n2 = 0;
            $this$selectedText_u24lambda_u2d1.append("  ");
        }
        if (asMarkdown) {
            $this$selectedText_u24lambda_u2d1.append(this.symbol);
            $this$selectedText_u24lambda_u2d1.append(' ');
        }
        $this$selectedText_u24lambda_u2d1.append(text);
        final String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue((Object)string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
