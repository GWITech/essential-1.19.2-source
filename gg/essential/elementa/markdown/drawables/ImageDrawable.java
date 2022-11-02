package gg.essential.elementa.markdown.drawables;

import kotlin.*;
import java.net.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.*;
import java.awt.*;
import gg.essential.elementa.dsl.*;
import kotlin.ranges.*;
import gg.essential.elementa.constraints.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;
import gg.essential.elementa.markdown.*;
import gg.essential.elementa.markdown.selection.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u00011B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0002\u0010\u0007J(\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J\b\u0010(\u001a\u00020\tH\u0016J \u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\u001aH\u0014J\u0010\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\tH\u0016R\u000e\u0010\u0006\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00060\rR\u00020\u0000X\u0082.¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00060\rR\u00020\u0000X\u0082.¢\u0006\u0002\n\u0000R$\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u00062" }, d2 = { "Lgg/essential/elementa/markdown/drawables/ImageDrawable;", "Lgg/essential/elementa/markdown/drawables/Drawable;", "md", "Lgg/essential/elementa/markdown/MarkdownComponent;", "url", "Ljava/net/URL;", "fallback", "(Lgg/essential/elementa/markdown/MarkdownComponent;Ljava/net/URL;Lgg/essential/elementa/markdown/drawables/Drawable;)V", "hasLoaded", "", "image", "Lgg/essential/elementa/components/UIImage;", "imageX", "Lgg/essential/elementa/markdown/drawables/ImageDrawable$ShiftableMDPixelConstraint;", "imageY", "value", "selected", "getSelected", "()Z", "setSelected", "(Z)V", "getUrl", "()Ljava/net/URL;", "cursorAt", "", "mouseX", "", "mouseY", "dragged", "mouseButton", "", "cursorAtEnd", "Lgg/essential/elementa/markdown/selection/ImageCursor;", "cursorAtStart", "draw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "state", "Lgg/essential/elementa/markdown/DrawState;", "hasSelectedText", "layoutImpl", "Lgg/essential/elementa/markdown/drawables/Drawable$Layout;", "x", "y", "width", "selectedText", "", "asMarkdown", "ShiftableMDPixelConstraint", "Elementa" })
public final class ImageDrawable extends Drawable
{
    @NotNull
    private final URL url;
    @NotNull
    private final Drawable fallback;
    private boolean selected;
    private ImageDrawable.ShiftableMDPixelConstraint imageX;
    private ImageDrawable.ShiftableMDPixelConstraint imageY;
    @NotNull
    private final UIImage image;
    private boolean hasLoaded;
    
    public ImageDrawable(@NotNull final MarkdownComponent md, @NotNull final URL url, @NotNull final Drawable fallback) {
        Intrinsics.checkNotNullParameter((Object)md, "md");
        Intrinsics.checkNotNullParameter((Object)url, "url");
        Intrinsics.checkNotNullParameter((Object)fallback, "fallback");
        super(md);
        this.url = url;
        this.fallback = fallback;
        this.image = ComponentsKt.childOf(UIImage.Companion.ofURL(this.url), md);
    }
    
    @NotNull
    public final URL getUrl() {
        return this.url;
    }
    
    public final boolean getSelected() {
        return this.selected;
    }
    
    public final void setSelected(final boolean value) {
        this.selected = value;
        if (value) {
            this.image.setColor(UtilitiesKt.toConstraint(new Color(200, 200, 255, 255)));
        }
        else {
            final UIImage image = this.image;
            final Color white = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue((Object)white, "WHITE");
            image.setColor(UtilitiesKt.toConstraint(white));
        }
    }
    
    @NotNull
    @Override
    protected Layout layoutImpl(final float x, final float y, final float width) {
        Object layout;
        if (this.image.isLoaded()) {
            this.imageX = new ImageDrawable.ShiftableMDPixelConstraint(this, x, 0.0f);
            this.imageY = new ImageDrawable.ShiftableMDPixelConstraint(this, y, 0.0f);
            final UIImage image = this.image;
            ImageDrawable.ShiftableMDPixelConstraint imageX;
            if ((imageX = this.imageX) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageX");
                imageX = null;
            }
            image.setX((XConstraint)imageX);
            final UIImage image2 = this.image;
            ImageDrawable.ShiftableMDPixelConstraint imageY;
            if ((imageY = this.imageY) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageY");
                imageY = null;
            }
            image2.setY((YConstraint)imageY);
            final float aspectRatio = this.image.getImageWidth() / this.image.getImageHeight();
            final float imageWidth = RangesKt.coerceAtMost(this.image.getImageWidth(), width);
            final float imageHeight = imageWidth / aspectRatio;
            this.image.setWidth(UtilitiesKt.pixels$default(imageWidth, false, false, 3, null));
            this.image.setHeight(UtilitiesKt.pixels$default(imageHeight, false, false, 3, null));
            layout = new Layout(x, y, imageWidth, imageHeight, null, 16, null);
        }
        else {
            layout = this.fallback.layout(x, y, width);
        }
        return (Layout)layout;
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack, @NotNull final DrawState state) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)state, "state");
        if (!this.image.isLoaded()) {
            this.fallback.drawCompat(matrixStack, state);
        }
        else {
            if (!this.hasLoaded) {
                this.hasLoaded = true;
                this.getMd().layout();
            }
            ImageDrawable.ShiftableMDPixelConstraint imageX;
            if ((imageX = this.imageX) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageX");
                imageX = null;
            }
            imageX.setShift(state.getXShift());
            ImageDrawable.ShiftableMDPixelConstraint imageY;
            if ((imageY = this.imageY) == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageY");
                imageY = null;
            }
            imageY.setShift(state.getYShift());
            this.image.drawCompat(matrixStack);
        }
    }
    
    @NotNull
    public Void cursorAt(final float mouseX, final float mouseY, final boolean dragged, final int mouseButton) {
        throw new IllegalStateException("never called");
    }
    
    @NotNull
    public ImageCursor cursorAtStart() {
        return new ImageCursor(this);
    }
    
    @NotNull
    public ImageCursor cursorAtEnd() {
        return new ImageCursor(this);
    }
    
    @NotNull
    @Override
    public String selectedText(final boolean asMarkdown) {
        if (asMarkdown) {
            return " ![" + this.fallback.selectedText(true) + "](" + this.url + ") ";
        }
        return new StringBuilder().append(' ').append(this.url).append(' ').toString();
    }
    
    @Override
    public boolean hasSelectedText() {
        return this.selected;
    }
    
    @Override
    public /* bridge */ Cursor cursorAt(final float mouseX, final float mouseY, final boolean dragged, final int mouseButton) {
        return (Cursor)this.cursorAt(mouseX, mouseY, dragged, mouseButton);
    }
    
    @Override
    public /* bridge */ Cursor cursorAtStart() {
        return (Cursor)this.cursorAtStart();
    }
    
    @Override
    public /* bridge */ Cursor cursorAtEnd() {
        return (Cursor)this.cursorAtEnd();
    }
}
