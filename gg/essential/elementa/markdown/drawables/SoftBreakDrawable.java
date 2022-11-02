package gg.essential.elementa.markdown.drawables;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import gg.essential.universal.*;
import gg.essential.elementa.markdown.*;
import gg.essential.elementa.markdown.selection.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\f\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016J\f\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J \u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bH\u0014J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000bH\u0016¨\u0006\u001e" }, d2 = { "Lgg/essential/elementa/markdown/drawables/SoftBreakDrawable;", "Lgg/essential/elementa/markdown/drawables/Drawable;", "md", "Lgg/essential/elementa/markdown/MarkdownComponent;", "(Lgg/essential/elementa/markdown/MarkdownComponent;)V", "cursorAt", "Lgg/essential/elementa/markdown/selection/Cursor;", "mouseX", "", "mouseY", "dragged", "", "mouseButton", "", "cursorAtEnd", "cursorAtStart", "draw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "state", "Lgg/essential/elementa/markdown/DrawState;", "layoutImpl", "Lgg/essential/elementa/markdown/drawables/Drawable$Layout;", "x", "y", "width", "selectedText", "", "asMarkdown", "Elementa" })
public final class SoftBreakDrawable extends Drawable
{
    public SoftBreakDrawable(@NotNull final MarkdownComponent md) {
        Intrinsics.checkNotNullParameter((Object)md, "md");
        super(md);
    }
    
    @NotNull
    @Override
    protected Layout layoutImpl(final float x, final float y, final float width) {
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack, @NotNull final DrawState state) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)state, "state");
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }
    
    @NotNull
    @Override
    public Cursor<?> cursorAt(final float mouseX, final float mouseY, final boolean dragged, final int mouseButton) {
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }
    
    @NotNull
    @Override
    public Cursor<?> cursorAtStart() {
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }
    
    @NotNull
    @Override
    public Cursor<?> cursorAtEnd() {
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }
    
    @NotNull
    @Override
    public String selectedText(final boolean asMarkdown) {
        throw (Throwable)new NotImplementedError("An operation is not implemented: " + "Not yet implemented");
    }
}
