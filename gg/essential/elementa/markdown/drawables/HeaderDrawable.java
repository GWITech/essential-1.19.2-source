package gg.essential.elementa.markdown.drawables;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.collections.*;
import java.util.*;
import gg.essential.universal.*;
import gg.essential.elementa.markdown.*;
import gg.essential.elementa.components.*;
import java.awt.*;
import gg.essential.elementa.markdown.selection.*;
import kotlin.text.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ,\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0005H\u0016J\f\u0010\"\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0016J\f\u0010#\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016J \u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u001d2\u0006\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020\u001dH\u0014J\u0010\u0010/\u001a\u00020\u00172\u0006\u00100\u001a\u00020 H\u0016R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u0017X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061" }, d2 = { "Lgg/essential/elementa/markdown/drawables/HeaderDrawable;", "Lgg/essential/elementa/markdown/drawables/Drawable;", "md", "Lgg/essential/elementa/markdown/MarkdownComponent;", "level", "", "paragraph", "Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;", "(Lgg/essential/elementa/markdown/MarkdownComponent;ILgg/essential/elementa/markdown/drawables/ParagraphDrawable;)V", "children", "", "getChildren", "()Ljava/util/List;", "dividerWidth", "", "getDividerWidth", "()Ljava/lang/Double;", "setDividerWidth", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "headerConfig", "Lgg/essential/elementa/markdown/HeaderLevelConfig;", "id", "", "getId$Elementa", "()Ljava/lang/String;", "cursorAt", "Lgg/essential/elementa/markdown/selection/Cursor;", "mouseX", "", "mouseY", "dragged", "", "mouseButton", "cursorAtEnd", "cursorAtStart", "draw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "state", "Lgg/essential/elementa/markdown/DrawState;", "layoutImpl", "Lgg/essential/elementa/markdown/drawables/Drawable$Layout;", "x", "y", "width", "selectedText", "asMarkdown", "Elementa" })
public final class HeaderDrawable extends Drawable
{
    private final int level;
    @NotNull
    private final ParagraphDrawable paragraph;
    @NotNull
    private final String id;
    @Nullable
    private Double dividerWidth;
    @NotNull
    private final HeaderLevelConfig headerConfig;
    
    public HeaderDrawable(@NotNull final MarkdownComponent md, final int level, @NotNull final ParagraphDrawable paragraph) {
        Intrinsics.checkNotNullParameter((Object)md, "md");
        Intrinsics.checkNotNullParameter((Object)paragraph, "paragraph");
        super(md);
        this.level = level;
        this.paragraph = paragraph;
        this.id = CollectionsKt.joinToString$default((Iterable)this.paragraph.getTextDrawables(), (CharSequence)" ", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)HeaderDrawable$id.HeaderDrawable$id$1.INSTANCE, 30, (Object)null);
        this.paragraph.setParent(this);
        this.headerConfig = switch (this.level) {
            case 1 -> this.getConfig().getHeaderConfig().getLevel1();
            case 2 -> this.getConfig().getHeaderConfig().getLevel2();
            case 3 -> this.getConfig().getHeaderConfig().getLevel3();
            case 4 -> this.getConfig().getHeaderConfig().getLevel4();
            case 5 -> this.getConfig().getHeaderConfig().getLevel5();
            case 6 -> this.getConfig().getHeaderConfig().getLevel6();
            default -> throw new IllegalStateException();
        };
        this.paragraph.setHeaderConfig$Elementa(this.headerConfig);
        Drawable.Companion.trim(this.paragraph);
    }
    
    @NotNull
    @Override
    public List<Drawable> getChildren() {
        return CollectionsKt.listOf((Object)this.paragraph);
    }
    
    @NotNull
    public final String getId$Elementa() {
        return this.id;
    }
    
    @Nullable
    public final Double getDividerWidth() {
        return this.dividerWidth;
    }
    
    public final void setDividerWidth(@Nullable final Double <set-?>) {
        this.dividerWidth = <set-?>;
    }
    
    @NotNull
    @Override
    protected Layout layoutImpl(final float x, final float y, final float width) {
        final float spaceBefore = this.getInsertSpaceBefore() ? this.headerConfig.getVerticalSpaceBefore() : 0.0f;
        final float spaceAfter = this.getInsertSpaceAfter() ? this.headerConfig.getVerticalSpaceAfter() : 0.0f;
        this.paragraph.layout(x, y + spaceBefore, width);
        final float height = spaceBefore + this.paragraph.getHeight() + spaceAfter + (this.headerConfig.getHasDivider() ? (this.headerConfig.getSpaceBeforeDivider() + this.headerConfig.getDividerWidth()) : 0.0f);
        return new Layout(x, y, width, height, new Margin(0.0f, spaceBefore, 0.0f, spaceAfter));
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack, @NotNull final DrawState state) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)state, "state");
        this.paragraph.drawCompat(matrixStack, state);
        if (this.headerConfig.getHasDivider()) {
            final float y = this.getLayout().getBottom() - this.getLayout().getMargin().getBottom() - this.headerConfig.getDividerWidth();
            final UIBlock.Companion companion = UIBlock.Companion;
            final Color dividerColor = this.headerConfig.getDividerColor();
            final double x = this.getX() + state.getXShift();
            final double y2 = y + state.getYShift();
            final Double dividerWidth = this.dividerWidth;
            companion.drawBlockSized(matrixStack, dividerColor, x, y2, (dividerWidth == null) ? ((double)this.getWidth()) : ((double)dividerWidth), this.headerConfig.getDividerWidth());
        }
    }
    
    @NotNull
    @Override
    public Cursor<?> cursorAt(final float mouseX, final float mouseY, final boolean dragged, final int mouseButton) {
        return this.paragraph.cursorAt(mouseX, mouseY, dragged, mouseButton);
    }
    
    @NotNull
    @Override
    public Cursor<?> cursorAtStart() {
        return this.paragraph.cursorAtStart();
    }
    
    @NotNull
    @Override
    public Cursor<?> cursorAtEnd() {
        return this.paragraph.cursorAtEnd();
    }
    
    @NotNull
    @Override
    public String selectedText(final boolean asMarkdown) {
        if (!this.hasSelectedText()) {
            return "";
        }
        final String text = this.paragraph.selectedText(asMarkdown);
        return asMarkdown ? (StringsKt.repeat((CharSequence)"#", this.level) + ' ' + text) : text;
    }
}
