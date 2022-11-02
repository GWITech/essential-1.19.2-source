package gg.essential.vigilance.gui.common.input;

import kotlin.*;
import org.jetbrains.annotations.*;
import java.awt.*;
import gg.essential.elementa.font.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import kotlin.collections.*;
import java.util.*;
import gg.essential.elementa.*;
import kotlin.text.*;
import gg.essential.elementa.constraints.*;
import gg.essential.universal.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.dsl.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001Bc\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0003H\u0016J\b\u0010!\u001a\u00020\u0003H\u0014J\b\u0010\"\u001a\u00020\u001dH\u0014J\b\u0010#\u001a\u00020\u001dH\u0014J\u001c\u0010$\u001a\u00060%R\u00020\u00012\u0006\u0010&\u001a\u00020\u00192\u0006\u0010'\u001a\u00020\u0019H\u0014J\u0014\u0010(\u001a\u00020\u001d2\n\u0010)\u001a\u00060%R\u00020\u0001H\u0014J\b\u0010*\u001a\u00020\u001dH\u0014J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0010J\u000e\u0010\u0017\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\u0010J\u001e\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030-2\u0006\u0010.\u001a\u00020\u00032\u0006\u0010/\u001a\u00020\u0019H\u0014J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020\u00030-2\u0006\u0010.\u001a\u00020\u0003H\u0014R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0010X\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u0019X\u0084\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u00061" }, d2 = { "Lgg/essential/vigilance/gui/common/input/UITextInput;", "Lgg/essential/vigilance/gui/common/input/AbstractTextInput;", "placeholder", "", "shadow", "", "shadowColor", "Ljava/awt/Color;", "selectionBackgroundColor", "selectionForegroundColor", "allowInactiveSelection", "inactiveSelectionBackgroundColor", "inactiveSelectionForegroundColor", "cursorColor", "(Ljava/lang/String;ZLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;ZLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V", "maxWidth", "Lgg/essential/elementa/constraints/WidthConstraint;", "getMaxWidth", "()Lgg/essential/elementa/constraints/WidthConstraint;", "setMaxWidth", "(Lgg/essential/elementa/constraints/WidthConstraint;)V", "minWidth", "getMinWidth", "setMinWidth", "placeholderWidth", "", "getPlaceholderWidth", "()F", "draw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "getText", "getTextForRender", "onEnterPressed", "recalculateDimensions", "screenPosToVisualPos", "Lgg/essential/vigilance/gui/common/input/AbstractTextInput$LinePosition;", "x", "y", "scrollIntoView", "pos", "setCursorPos", "constraint", "splitTextForWrapping", "", "text", "maxLineWidth", "textToLines", "Vigilance" })
public class UITextInput extends AbstractTextInput
{
    @Nullable
    private WidthConstraint minWidth;
    @Nullable
    private WidthConstraint maxWidth;
    private final float placeholderWidth;
    
    @JvmOverloads
    public UITextInput(@NotNull final String placeholder, final boolean shadow, @Nullable final Color shadowColor, @NotNull final Color selectionBackgroundColor, @NotNull final Color selectionForegroundColor, final boolean allowInactiveSelection, @NotNull final Color inactiveSelectionBackgroundColor, @NotNull final Color inactiveSelectionForegroundColor, @NotNull final Color cursorColor) {
        Intrinsics.checkNotNullParameter((Object)placeholder, "placeholder");
        Intrinsics.checkNotNullParameter((Object)selectionBackgroundColor, "selectionBackgroundColor");
        Intrinsics.checkNotNullParameter((Object)selectionForegroundColor, "selectionForegroundColor");
        Intrinsics.checkNotNullParameter((Object)inactiveSelectionBackgroundColor, "inactiveSelectionBackgroundColor");
        Intrinsics.checkNotNullParameter((Object)inactiveSelectionForegroundColor, "inactiveSelectionForegroundColor");
        Intrinsics.checkNotNullParameter((Object)cursorColor, "cursorColor");
        final Color white = Color.WHITE;
        Intrinsics.checkNotNullExpressionValue((Object)white, "WHITE");
        super(placeholder, shadow, shadowColor, selectionBackgroundColor, selectionForegroundColor, allowInactiveSelection, inactiveSelectionBackgroundColor, inactiveSelectionForegroundColor, white);
        this.placeholderWidth = UtilitiesKt.width$default(placeholder, 0.0f, null, 3, null);
    }
    
    public UITextInput(String placeholder, boolean shadow, Color shadowColor, Color selectionBackgroundColor, Color selectionForegroundColor, boolean allowInactiveSelection, Color inactiveSelectionBackgroundColor, Color inactiveSelectionForegroundColor, Color cursorColor, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            placeholder = "";
        }
        if ((n & 0x2) != 0x0) {
            shadow = true;
        }
        if ((n & 0x4) != 0x0) {
            shadowColor = null;
        }
        if ((n & 0x8) != 0x0) {
            final Color white = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue((Object)white, "WHITE");
            selectionBackgroundColor = white;
        }
        if ((n & 0x10) != 0x0) {
            selectionForegroundColor = new Color(64, 139, 229);
        }
        if ((n & 0x20) != 0x0) {
            allowInactiveSelection = false;
        }
        if ((n & 0x40) != 0x0) {
            inactiveSelectionBackgroundColor = new Color(176, 176, 176);
        }
        if ((n & 0x80) != 0x0) {
            final Color white2 = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue((Object)white2, "WHITE");
            inactiveSelectionForegroundColor = white2;
        }
        if ((n & 0x100) != 0x0) {
            final Color white3 = Color.WHITE;
            Intrinsics.checkNotNullExpressionValue((Object)white3, "WHITE");
            cursorColor = white3;
        }
        this(placeholder, shadow, shadowColor, selectionBackgroundColor, selectionForegroundColor, allowInactiveSelection, inactiveSelectionBackgroundColor, inactiveSelectionForegroundColor, cursorColor);
    }
    
    @Nullable
    protected final WidthConstraint getMinWidth() {
        return this.minWidth;
    }
    
    protected final void setMinWidth(@Nullable final WidthConstraint <set-?>) {
        this.minWidth = <set-?>;
    }
    
    @Nullable
    protected final WidthConstraint getMaxWidth() {
        return this.maxWidth;
    }
    
    protected final void setMaxWidth(@Nullable final WidthConstraint <set-?>) {
        this.maxWidth = <set-?>;
    }
    
    protected final float getPlaceholderWidth() {
        return this.placeholderWidth;
    }
    
    @NotNull
    public final UITextInput setMinWidth(@NotNull final WidthConstraint constraint) {
        Intrinsics.checkNotNullParameter((Object)constraint, "constraint");
        final UITextInput $this$setMinWidth_u24lambda_u2d0 = this;
        final int n = 0;
        $this$setMinWidth_u24lambda_u2d0.setMinWidth(constraint);
        return this;
    }
    
    @NotNull
    public final UITextInput setMaxWidth(@NotNull final WidthConstraint constraint) {
        Intrinsics.checkNotNullParameter((Object)constraint, "constraint");
        final UITextInput $this$setMaxWidth_u24lambda_u2d1 = this;
        final int n = 0;
        $this$setMaxWidth_u24lambda_u2d1.setMaxWidth(constraint);
        return this;
    }
    
    @NotNull
    @Override
    public String getText() {
        return ((Line)CollectionsKt.first((List)this.getTextualLines())).getText();
    }
    
    @NotNull
    protected String getTextForRender() {
        return this.getText();
    }
    
    protected void setCursorPos() {
        UIComponent.unhide$default(this.getCursorComponent(), false, 1, null);
        final float cursorPosX = ((Number)this.getCursor().toScreenPos().component1()).floatValue();
        this.getCursorComponent().setX(UtilitiesKt.pixels$default(cursorPosX, false, false, 3, null));
    }
    
    @NotNull
    @Override
    protected List<String> textToLines(@NotNull final String text) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        return CollectionsKt.listOf((Object)StringsKt.replace$default(text, '\n', ' ', false, 4, (Object)null));
    }
    
    @Override
    protected void scrollIntoView(@NotNull final LinePosition pos) {
        Intrinsics.checkNotNullParameter((Object)pos, "pos");
        final int column = pos.getColumn();
        final String lineText = this.getTextForRender();
        if (column < 0 || column > lineText.length()) {
            return;
        }
        final String s = lineText;
        final int beginIndex = 0;
        final String s2 = s;
        if (s2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        final String substring = s2.substring(beginIndex, column);
        Intrinsics.checkNotNullExpressionValue((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        final float widthBeforePosition = UtilitiesKt.width$default(substring, this.getTextScale(), null, 2, null);
        if (UtilitiesKt.width$default(this.getTextForRender(), this.getTextScale(), null, 2, null) < this.getWidth()) {
            this.setHorizontalScrollingOffset(0.0f);
        }
        else if (this.getHorizontalScrollingOffset() > widthBeforePosition) {
            this.setHorizontalScrollingOffset(widthBeforePosition);
        }
        else if (widthBeforePosition - this.getHorizontalScrollingOffset() > this.getWidth()) {
            this.setHorizontalScrollingOffset(widthBeforePosition - this.getWidth());
        }
    }
    
    @NotNull
    @Override
    protected LinePosition screenPosToVisualPos(final float x, final float y) {
        final float targetXPos = x + this.getHorizontalScrollingOffset();
        float currentX = 0.0f;
        final String line = this.getTextForRender();
        int j = 0;
        while (j < line.length()) {
            final int i = j;
            ++j;
            final float charWidth = UtilitiesKt.width(line.charAt(i), this.getTextScale());
            if (currentX + charWidth / 2 >= targetXPos) {
                return new LinePosition(0, i, true);
            }
            currentX += charWidth;
        }
        return new LinePosition(0, line.length(), true);
    }
    
    @Override
    protected void recalculateDimensions() {
        if (this.minWidth != null && this.maxWidth != null) {
            final float width = (!this.hasText() && !this.getActive()) ? this.placeholderWidth : (UtilitiesKt.width$default(this.getTextForRender(), this.getTextScale(), null, 2, null) + 1);
            final SuperConstraint $this$coerceIn = UtilitiesKt.pixels$default(width, false, false, 3, null);
            final WidthConstraint minWidth = this.minWidth;
            Intrinsics.checkNotNull((Object)minWidth);
            final SuperConstraint minConstraint = minWidth;
            final WidthConstraint maxWidth = this.maxWidth;
            Intrinsics.checkNotNull((Object)maxWidth);
            this.setWidth(ConstraintsKt.coerceIn($this$coerceIn, minConstraint, maxWidth));
        }
    }
    
    @NotNull
    @Override
    protected List<String> splitTextForWrapping(@NotNull final String text, final float maxLineWidth) {
        Intrinsics.checkNotNullParameter((Object)text, "text");
        return CollectionsKt.listOf((Object)text);
    }
    
    @Override
    protected void onEnterPressed() {
        this.getActivateAction().invoke((Object)this.getText());
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        this.beforeDrawCompat(matrixStack);
        if (!this.getActive() && !this.hasText()) {
            this.drawPlaceholder(matrixStack);
            super.draw(matrixStack);
            return;
        }
        final String lineText = this.getTextForRender();
        if (this.hasSelection()) {
            float currentX = this.getLeft();
            this.getCursorComponent().hide(true);
            if (!this.selectionStart().isAtLineStart()) {
                final String s = lineText;
                final int beginIndex = 0;
                final int column = this.selectionStart().getColumn();
                final String s2 = s;
                if (s2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                final String substring = s2.substring(beginIndex, column);
                Intrinsics.checkNotNullExpressionValue((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                final String preSelectionText = substring;
                AbstractTextInput.drawUnselectedText$default(this, matrixStack, preSelectionText, currentX, 0, null, false, null, 112, null);
                currentX += UtilitiesKt.width$default(preSelectionText, this.getTextScale(), null, 2, null);
            }
            final String s3 = lineText;
            final int column2 = this.selectionStart().getColumn();
            final int column3 = this.selectionEnd().getColumn();
            final String s4 = s3;
            if (s4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            final String substring2 = s4.substring(column2, column3);
            Intrinsics.checkNotNullExpressionValue((Object)substring2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            final String selectedText = substring2;
            final float selectedTextWidth = UtilitiesKt.width$default(selectedText, this.getTextScale(), null, 2, null);
            this.drawSelectedText(matrixStack, selectedText, currentX, currentX + selectedTextWidth, 0);
            currentX += selectedTextWidth;
            if (!this.selectionEnd().isAtLineEnd()) {
                final AbstractTextInput abstractTextInput = this;
                final String s5 = lineText;
                final int column4 = this.selectionEnd().getColumn();
                final String s6 = s5;
                if (s6 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                final String substring3 = s6.substring(column4);
                Intrinsics.checkNotNullExpressionValue((Object)substring3, "(this as java.lang.String).substring(startIndex)");
                AbstractTextInput.drawUnselectedText$default(abstractTextInput, matrixStack, substring3, currentX, 0, null, false, null, 112, null);
            }
        }
        else {
            if (this.getActive()) {
                this.getCursorComponent().setY(BasicConstraintsKt.basicYConstraint((Function1<? super UIComponent, Float>)new UITextInput$draw.UITextInput$draw$1(this)));
                this.setCursorPos();
            }
            AbstractTextInput.drawUnselectedText$default(this, matrixStack, lineText, this.getLeft(), 0, null, false, null, 112, null);
        }
        super.draw(matrixStack);
    }
    
    @JvmOverloads
    public UITextInput(@NotNull final String placeholder, final boolean shadow, @Nullable final Color shadowColor, @NotNull final Color selectionBackgroundColor, @NotNull final Color selectionForegroundColor, final boolean allowInactiveSelection, @NotNull final Color inactiveSelectionBackgroundColor, @NotNull final Color inactiveSelectionForegroundColor) {
        Intrinsics.checkNotNullParameter((Object)placeholder, "placeholder");
        Intrinsics.checkNotNullParameter((Object)selectionBackgroundColor, "selectionBackgroundColor");
        Intrinsics.checkNotNullParameter((Object)selectionForegroundColor, "selectionForegroundColor");
        Intrinsics.checkNotNullParameter((Object)inactiveSelectionBackgroundColor, "inactiveSelectionBackgroundColor");
        Intrinsics.checkNotNullParameter((Object)inactiveSelectionForegroundColor, "inactiveSelectionForegroundColor");
        this(placeholder, shadow, shadowColor, selectionBackgroundColor, selectionForegroundColor, allowInactiveSelection, inactiveSelectionBackgroundColor, inactiveSelectionForegroundColor, null, 256, null);
    }
    
    @JvmOverloads
    public UITextInput(@NotNull final String placeholder, final boolean shadow, @Nullable final Color shadowColor, @NotNull final Color selectionBackgroundColor, @NotNull final Color selectionForegroundColor, final boolean allowInactiveSelection, @NotNull final Color inactiveSelectionBackgroundColor) {
        Intrinsics.checkNotNullParameter((Object)placeholder, "placeholder");
        Intrinsics.checkNotNullParameter((Object)selectionBackgroundColor, "selectionBackgroundColor");
        Intrinsics.checkNotNullParameter((Object)selectionForegroundColor, "selectionForegroundColor");
        Intrinsics.checkNotNullParameter((Object)inactiveSelectionBackgroundColor, "inactiveSelectionBackgroundColor");
        this(placeholder, shadow, shadowColor, selectionBackgroundColor, selectionForegroundColor, allowInactiveSelection, inactiveSelectionBackgroundColor, null, null, 384, null);
    }
    
    @JvmOverloads
    public UITextInput(@NotNull final String placeholder, final boolean shadow, @Nullable final Color shadowColor, @NotNull final Color selectionBackgroundColor, @NotNull final Color selectionForegroundColor, final boolean allowInactiveSelection) {
        Intrinsics.checkNotNullParameter((Object)placeholder, "placeholder");
        Intrinsics.checkNotNullParameter((Object)selectionBackgroundColor, "selectionBackgroundColor");
        Intrinsics.checkNotNullParameter((Object)selectionForegroundColor, "selectionForegroundColor");
        this(placeholder, shadow, shadowColor, selectionBackgroundColor, selectionForegroundColor, allowInactiveSelection, null, null, null, 448, null);
    }
    
    @JvmOverloads
    public UITextInput(@NotNull final String placeholder, final boolean shadow, @Nullable final Color shadowColor, @NotNull final Color selectionBackgroundColor, @NotNull final Color selectionForegroundColor) {
        Intrinsics.checkNotNullParameter((Object)placeholder, "placeholder");
        Intrinsics.checkNotNullParameter((Object)selectionBackgroundColor, "selectionBackgroundColor");
        Intrinsics.checkNotNullParameter((Object)selectionForegroundColor, "selectionForegroundColor");
        this(placeholder, shadow, shadowColor, selectionBackgroundColor, selectionForegroundColor, false, null, null, null, 480, null);
    }
    
    @JvmOverloads
    public UITextInput(@NotNull final String placeholder, final boolean shadow, @Nullable final Color shadowColor, @NotNull final Color selectionBackgroundColor) {
        Intrinsics.checkNotNullParameter((Object)placeholder, "placeholder");
        Intrinsics.checkNotNullParameter((Object)selectionBackgroundColor, "selectionBackgroundColor");
        this(placeholder, shadow, shadowColor, selectionBackgroundColor, null, false, null, null, null, 496, null);
    }
    
    @JvmOverloads
    public UITextInput(@NotNull final String placeholder, final boolean shadow, @Nullable final Color shadowColor) {
        Intrinsics.checkNotNullParameter((Object)placeholder, "placeholder");
        this(placeholder, shadow, shadowColor, null, null, false, null, null, null, 504, null);
    }
    
    @JvmOverloads
    public UITextInput(@NotNull final String placeholder, final boolean shadow) {
        Intrinsics.checkNotNullParameter((Object)placeholder, "placeholder");
        this(placeholder, shadow, null, null, null, false, null, null, null, 508, null);
    }
    
    @JvmOverloads
    public UITextInput(@NotNull final String placeholder) {
        Intrinsics.checkNotNullParameter((Object)placeholder, "placeholder");
        this(placeholder, false, null, null, null, false, null, null, null, 510, null);
    }
    
    @JvmOverloads
    public UITextInput() {
        this(null, false, null, null, null, false, null, null, null, 511, null);
    }
}
