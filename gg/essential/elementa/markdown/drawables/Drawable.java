package gg.essential.elementa.markdown.drawables;

import org.jetbrains.annotations.*;
import kotlin.collections.*;
import gg.essential.elementa.markdown.*;
import gg.essential.universal.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.markdown.selection.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u0000 U2\u00020\u0001:\u0003UVWB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J,\u0010?\u001a\u0006\u0012\u0002\b\u00030@2\u0006\u0010A\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\u000e2\u0006\u0010C\u001a\u00020\u00152\u0006\u0010D\u001a\u00020EH&J\f\u0010F\u001a\u0006\u0012\u0002\b\u00030@H&J\f\u0010G\u001a\u0006\u0012\u0002\b\u00030@H&J\u0010\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u0017J\u0018\u0010H\u001a\u00020I2\u0006\u0010L\u001a\u00020M2\u0006\u0010J\u001a\u00020KH\u0016J\u0016\u0010N\u001a\u00020I2\u0006\u0010L\u001a\u00020M2\u0006\u0010J\u001a\u00020KJ\b\u0010O\u001a\u00020\u0015H\u0016J\u0016\u0010P\u001a\u00020\u00152\u0006\u0010A\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\u000eJ\u001e\u0010\u001d\u001a\u00020\u001e2\u0006\u00109\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u000eJ \u0010Q\u001a\u00020\u001e2\u0006\u00109\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u000eH$J\u0010\u0010R\u001a\u00020S2\u0006\u0010T\u001a\u00020\u0015H&R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR$\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010$\u001a\u00020#2\u0006\u0010\r\u001a\u00020#8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u001c\u0010+\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010-\"\u0004\b2\u0010/R\u001c\u00103\u001a\u0004\u0018\u00010\u0000X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010-\"\u0004\b5\u0010/R$\u00106\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b7\u0010\u0011\"\u0004\b8\u0010\u0013R$\u00109\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b:\u0010\u0011\"\u0004\b;\u0010\u0013R$\u0010<\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b=\u0010\u0011\"\u0004\b>\u0010\u0013¨\u0006X" }, d2 = { "Lgg/essential/elementa/markdown/drawables/Drawable;", "", "md", "Lgg/essential/elementa/markdown/MarkdownComponent;", "(Lgg/essential/elementa/markdown/MarkdownComponent;)V", "children", "", "getChildren", "()Ljava/util/List;", "config", "Lgg/essential/elementa/markdown/MarkdownConfig;", "getConfig", "()Lgg/essential/elementa/markdown/MarkdownConfig;", "value", "", "height", "getHeight", "()F", "setHeight", "(F)V", "insertSpaceAfter", "", "getInsertSpaceAfter", "()Z", "setInsertSpaceAfter", "(Z)V", "insertSpaceBefore", "getInsertSpaceBefore", "setInsertSpaceBefore", "layout", "Lgg/essential/elementa/markdown/drawables/Drawable$Layout;", "getLayout", "()Lgg/essential/elementa/markdown/drawables/Drawable$Layout;", "setLayout", "(Lgg/essential/elementa/markdown/drawables/Drawable$Layout;)V", "Lgg/essential/elementa/markdown/drawables/Drawable$Margin;", "margin", "getMargin", "()Lgg/essential/elementa/markdown/drawables/Drawable$Margin;", "setMargin", "(Lgg/essential/elementa/markdown/drawables/Drawable$Margin;)V", "getMd", "()Lgg/essential/elementa/markdown/MarkdownComponent;", "next", "getNext", "()Lgg/essential/elementa/markdown/drawables/Drawable;", "setNext", "(Lgg/essential/elementa/markdown/drawables/Drawable;)V", "parent", "getParent", "setParent", "previous", "getPrevious", "setPrevious", "width", "getWidth", "setWidth", "x", "getX", "setX", "y", "getY", "setY", "cursorAt", "Lgg/essential/elementa/markdown/selection/Cursor;", "mouseX", "mouseY", "dragged", "mouseButton", "", "cursorAtEnd", "cursorAtStart", "draw", "", "state", "Lgg/essential/elementa/markdown/DrawState;", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "drawCompat", "hasSelectedText", "isHovered", "layoutImpl", "selectedText", "", "asMarkdown", "Companion", "Layout", "Margin", "Elementa" })
public abstract class Drawable
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final MarkdownComponent md;
    public Layout layout;
    private boolean insertSpaceBefore;
    private boolean insertSpaceAfter;
    @Nullable
    private Drawable previous;
    @Nullable
    private Drawable next;
    @Nullable
    private Drawable parent;
    @NotNull
    private final List<Drawable> children;
    
    public Drawable(@NotNull final MarkdownComponent md) {
        Intrinsics.checkNotNullParameter((Object)md, "md");
        super();
        this.md = md;
        this.insertSpaceBefore = true;
        this.insertSpaceAfter = true;
        this.children = CollectionsKt.emptyList();
    }
    
    @NotNull
    public final MarkdownComponent getMd() {
        return this.md;
    }
    
    @NotNull
    public final MarkdownConfig getConfig() {
        return this.md.getConfig();
    }
    
    @NotNull
    public final Layout getLayout() {
        final Layout layout = this.layout;
        if (layout != null) {
            return layout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("layout");
        return null;
    }
    
    public final void setLayout(@NotNull final Layout <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.layout = <set-?>;
    }
    
    public final float getX() {
        return this.getLayout().getX();
    }
    
    public final void setX(final float value) {
        this.getLayout().setX(value);
    }
    
    public final float getY() {
        return this.getLayout().getY();
    }
    
    public final void setY(final float value) {
        this.getLayout().setY(value);
    }
    
    public final float getWidth() {
        return this.getLayout().getWidth();
    }
    
    public final void setWidth(final float value) {
        this.getLayout().setWidth(value);
    }
    
    public final float getHeight() {
        return this.getLayout().getHeight();
    }
    
    public final void setHeight(final float value) {
        this.getLayout().setHeight(value);
    }
    
    @NotNull
    public final Margin getMargin() {
        return this.getLayout().getMargin();
    }
    
    public final void setMargin(@NotNull final Margin value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        this.getLayout().setMargin(value);
    }
    
    public final boolean getInsertSpaceBefore() {
        return this.insertSpaceBefore;
    }
    
    public final void setInsertSpaceBefore(final boolean <set-?>) {
        this.insertSpaceBefore = <set-?>;
    }
    
    public final boolean getInsertSpaceAfter() {
        return this.insertSpaceAfter;
    }
    
    public final void setInsertSpaceAfter(final boolean <set-?>) {
        this.insertSpaceAfter = <set-?>;
    }
    
    @Nullable
    public final Drawable getPrevious() {
        return this.previous;
    }
    
    public final void setPrevious(@Nullable final Drawable <set-?>) {
        this.previous = <set-?>;
    }
    
    @Nullable
    public final Drawable getNext() {
        return this.next;
    }
    
    public final void setNext(@Nullable final Drawable <set-?>) {
        this.next = <set-?>;
    }
    
    @Nullable
    public final Drawable getParent() {
        return this.parent;
    }
    
    public final void setParent(@Nullable final Drawable <set-?>) {
        this.parent = <set-?>;
    }
    
    @NotNull
    public List<Drawable> getChildren() {
        return this.children;
    }
    
    @NotNull
    public final Layout layout(final float x, final float y, final float width) {
        final Layout it = this.layoutImpl(x, y, width);
        final int n = 0;
        this.setLayout(it);
        return it;
    }
    
    @NotNull
    protected abstract Layout layoutImpl(final float p0, final float p1, final float p2);
    
    @Deprecated(message = "For 1.17 this method requires you pass a UMatrixStack as the first argument.\n\nIf you are currently extending this method, you should instead extend the method with the added argument.\nNote however for this to be non-breaking, your parent class needs to transition before you do.\n\nIf you are calling this method and you cannot guarantee that your target class has been fully updated (such as when\ncalling an open method on an open class), you should instead call the method with the \"Compat\" suffix, which will\ncall both methods, the new and the deprecated one.\nIf you are sure that your target class has been updated (such as when calling the super method), you should\n(for super calls you must!) instead just call the method with the original name and added argument.", replaceWith = @ReplaceWith(expression = "draw(matrixStack, state)", imports = {}))
    @java.lang.Deprecated
    public void draw(@NotNull final DrawState state) {
        Intrinsics.checkNotNullParameter((Object)state, "state");
        this.draw(UMatrixStack.Compat.INSTANCE.get(), state);
    }
    
    public final void drawCompat(@NotNull final UMatrixStack matrixStack, @NotNull final DrawState state) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)state, "state");
        UMatrixStack.Compat.INSTANCE.runLegacyMethod(matrixStack, (kotlin.jvm.functions.Function0<?>)new Drawable$drawCompat.Drawable$drawCompat$1(this, state));
    }
    
    public void draw(@NotNull final UMatrixStack matrixStack, @NotNull final DrawState state) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)state, "state");
    }
    
    public final boolean isHovered(final float mouseX, final float mouseY) {
        final float left = this.getLayout().getLeft();
        if (mouseX <= this.getLayout().getRight() && left <= mouseX) {
            final float top = this.getLayout().getTop();
            if (mouseY <= this.getLayout().getBottom() && top <= mouseY) {
                return true;
            }
        }
        return false;
    }
    
    @NotNull
    public abstract Cursor<?> cursorAt(final float p0, final float p1, final boolean p2, final int p3);
    
    @NotNull
    public abstract Cursor<?> cursorAtStart();
    
    @NotNull
    public abstract Cursor<?> cursorAtEnd();
    
    public boolean hasSelectedText() {
        final Iterable $this$any$iv = this.getChildren();
        final int $i$f$any = 0;
        boolean b;
        if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
            b = false;
        }
        else {
            for (final Object element$iv : $this$any$iv) {
                final Drawable it = (Drawable)element$iv;
                final int n = 0;
                if ((it instanceof TextDrawable && ((TextDrawable)it).getSelectionStart() != -1) || it.hasSelectedText()) {
                    b = true;
                    return b;
                }
            }
            b = false;
        }
        return b;
    }
    
    @NotNull
    public abstract String selectedText(final boolean p0);
    
    static {
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\bH\u00c6\u0003J;\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00105\u001a\u000206H\u00d6\u0001J\t\u00107\u001a\u000208H\u00d6\u0001R\u0011\u0010\n\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u000f\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\fR\u0011\u0010\u0015\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\u0017\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b#\u0010\fR\u0011\u0010$\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b%\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\f\"\u0004\b'\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\f\"\u0004\b+\u0010\u001b¨\u00069" }, d2 = { "Lgg/essential/elementa/markdown/drawables/Drawable$Layout;", "", "x", "", "y", "width", "height", "margin", "Lgg/essential/elementa/markdown/drawables/Drawable$Margin;", "(FFFFLgg/essential/elementa/markdown/drawables/Drawable$Margin;)V", "bottom", "getBottom", "()F", "elementBottom", "getElementBottom", "elementHeight", "getElementHeight", "elementLeft", "getElementLeft", "elementRight", "getElementRight", "elementTop", "getElementTop", "elementWidth", "getElementWidth", "getHeight", "setHeight", "(F)V", "left", "getLeft", "getMargin", "()Lgg/essential/elementa/markdown/drawables/Drawable$Margin;", "setMargin", "(Lgg/essential/elementa/markdown/drawables/Drawable$Margin;)V", "right", "getRight", "top", "getTop", "getWidth", "setWidth", "getX", "setX", "getY", "setY", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Elementa" })
    public static final class Layout
    {
        private float x;
        private float y;
        private float width;
        private float height;
        @NotNull
        private Margin margin;
        
        public Layout(final float x, final float y, final float width, final float height, @NotNull final Margin margin) {
            Intrinsics.checkNotNullParameter((Object)margin, "margin");
            super();
            this.x = x;
            this.y = y;
            this.width = width;
            this.height = height;
            this.margin = margin;
        }
        
        public Layout(final float x, final float y, final float width, final float height, Margin margin, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
            if ((n & 0x10) != 0x0) {
                margin = new Margin(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
            }
            this(x, y, width, height, margin);
        }
        
        public final float getX() {
            return this.x;
        }
        
        public final void setX(final float <set-?>) {
            this.x = <set-?>;
        }
        
        public final float getY() {
            return this.y;
        }
        
        public final void setY(final float <set-?>) {
            this.y = <set-?>;
        }
        
        public final float getWidth() {
            return this.width;
        }
        
        public final void setWidth(final float <set-?>) {
            this.width = <set-?>;
        }
        
        public final float getHeight() {
            return this.height;
        }
        
        public final void setHeight(final float <set-?>) {
            this.height = <set-?>;
        }
        
        @NotNull
        public final Margin getMargin() {
            return this.margin;
        }
        
        public final void setMargin(@NotNull final Margin <set-?>) {
            Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
            this.margin = <set-?>;
        }
        
        public final float getElementWidth() {
            return this.width - this.margin.getLeft() - this.margin.getRight();
        }
        
        public final float getElementHeight() {
            return this.height - this.margin.getTop() - this.margin.getBottom();
        }
        
        public final float getTop() {
            return this.y;
        }
        
        public final float getBottom() {
            return this.y + this.height;
        }
        
        public final float getElementTop() {
            return this.y + this.margin.getTop();
        }
        
        public final float getElementBottom() {
            return this.y + this.margin.getTop() + this.height;
        }
        
        public final float getLeft() {
            return this.x;
        }
        
        public final float getRight() {
            return this.x + this.width;
        }
        
        public final float getElementLeft() {
            return this.x + this.margin.getLeft();
        }
        
        public final float getElementRight() {
            return this.x + this.margin.getLeft() + this.width;
        }
        
        public final float component1() {
            return this.x;
        }
        
        public final float component2() {
            return this.y;
        }
        
        public final float component3() {
            return this.width;
        }
        
        public final float component4() {
            return this.height;
        }
        
        @NotNull
        public final Margin component5() {
            return this.margin;
        }
        
        @NotNull
        public final Layout copy(final float x, final float y, final float width, final float height, @NotNull final Margin margin) {
            Intrinsics.checkNotNullParameter((Object)margin, "margin");
            return new Layout(x, y, width, height, margin);
        }
        
        public static /* synthetic */ Layout copy$default(final Layout layout, float x, float y, float width, float height, Margin margin, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                x = layout.x;
            }
            if ((n & 0x2) != 0x0) {
                y = layout.y;
            }
            if ((n & 0x4) != 0x0) {
                width = layout.width;
            }
            if ((n & 0x8) != 0x0) {
                height = layout.height;
            }
            if ((n & 0x10) != 0x0) {
                margin = layout.margin;
            }
            return layout.copy(x, y, width, height, margin);
        }
        
        @NotNull
        @Override
        public String toString() {
            return "Layout(x=" + this.x + ", y=" + this.y + ", width=" + this.width + ", height=" + this.height + ", margin=" + this.margin + ')';
        }
        
        @Override
        public int hashCode() {
            int result = Float.hashCode(this.x);
            result = result * 31 + Float.hashCode(this.y);
            result = result * 31 + Float.hashCode(this.width);
            result = result * 31 + Float.hashCode(this.height);
            result = result * 31 + this.margin.hashCode();
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Layout)) {
                return false;
            }
            final Layout layout = (Layout)other;
            return Intrinsics.areEqual((Object)this.x, (Object)layout.x) && Intrinsics.areEqual((Object)this.y, (Object)layout.y) && Intrinsics.areEqual((Object)this.width, (Object)layout.width) && Intrinsics.areEqual((Object)this.height, (Object)layout.height) && Intrinsics.areEqual((Object)this.margin, (Object)layout.margin);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b¨\u0006\u001e" }, d2 = { "Lgg/essential/elementa/markdown/drawables/Drawable$Margin;", "", "left", "", "top", "right", "bottom", "(FFFF)V", "getBottom", "()F", "setBottom", "(F)V", "getLeft", "setLeft", "getRight", "setRight", "getTop", "setTop", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Elementa" })
    public static final class Margin
    {
        private float left;
        private float top;
        private float right;
        private float bottom;
        
        public Margin(final float left, final float top, final float right, final float bottom) {
            super();
            this.left = left;
            this.top = top;
            this.right = right;
            this.bottom = bottom;
        }
        
        public Margin(float left, float top, float right, float bottom, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
            if ((n & 0x1) != 0x0) {
                left = 0.0f;
            }
            if ((n & 0x2) != 0x0) {
                top = 0.0f;
            }
            if ((n & 0x4) != 0x0) {
                right = 0.0f;
            }
            if ((n & 0x8) != 0x0) {
                bottom = 0.0f;
            }
            this(left, top, right, bottom);
        }
        
        public final float getLeft() {
            return this.left;
        }
        
        public final void setLeft(final float <set-?>) {
            this.left = <set-?>;
        }
        
        public final float getTop() {
            return this.top;
        }
        
        public final void setTop(final float <set-?>) {
            this.top = <set-?>;
        }
        
        public final float getRight() {
            return this.right;
        }
        
        public final void setRight(final float <set-?>) {
            this.right = <set-?>;
        }
        
        public final float getBottom() {
            return this.bottom;
        }
        
        public final void setBottom(final float <set-?>) {
            this.bottom = <set-?>;
        }
        
        public final float component1() {
            return this.left;
        }
        
        public final float component2() {
            return this.top;
        }
        
        public final float component3() {
            return this.right;
        }
        
        public final float component4() {
            return this.bottom;
        }
        
        @NotNull
        public final Margin copy(final float left, final float top, final float right, final float bottom) {
            return new Margin(left, top, right, bottom);
        }
        
        public static /* synthetic */ Margin copy$default(final Margin margin, float left, float top, float right, float bottom, final int n, final Object o) {
            if ((n & 0x1) != 0x0) {
                left = margin.left;
            }
            if ((n & 0x2) != 0x0) {
                top = margin.top;
            }
            if ((n & 0x4) != 0x0) {
                right = margin.right;
            }
            if ((n & 0x8) != 0x0) {
                bottom = margin.bottom;
            }
            return margin.copy(left, top, right, bottom);
        }
        
        @NotNull
        @Override
        public String toString() {
            return "Margin(left=" + this.left + ", top=" + this.top + ", right=" + this.right + ", bottom=" + this.bottom + ')';
        }
        
        @Override
        public int hashCode() {
            int result = Float.hashCode(this.left);
            result = result * 31 + Float.hashCode(this.top);
            result = result * 31 + Float.hashCode(this.right);
            result = result * 31 + Float.hashCode(this.bottom);
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Margin)) {
                return false;
            }
            final Margin margin = (Margin)other;
            return Intrinsics.areEqual((Object)this.left, (Object)margin.left) && Intrinsics.areEqual((Object)this.top, (Object)margin.top) && Intrinsics.areEqual((Object)this.right, (Object)margin.right) && Intrinsics.areEqual((Object)this.bottom, (Object)margin.bottom);
        }
        
        public Margin() {
            this(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\n¨\u0006\u000b" }, d2 = { "Lgg/essential/elementa/markdown/drawables/Drawable$Companion;", "", "()V", "trim", "", "drawable", "Lgg/essential/elementa/markdown/drawables/Drawable;", "drawableList", "Lgg/essential/elementa/markdown/drawables/DrawableList;", "drawables", "", "Elementa" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public final void trim(@NotNull final DrawableList drawableList) {
            Intrinsics.checkNotNullParameter((Object)drawableList, "drawableList");
            this.trim((List<? extends Drawable>)drawableList);
        }
        
        public final void trim(@NotNull final List<? extends Drawable> drawables) {
            Intrinsics.checkNotNullParameter((Object)drawables, "drawables");
            final Drawable drawable = (Drawable)CollectionsKt.firstOrNull((List)drawables);
            if (drawable != null) {
                final Drawable it = drawable;
                final int n = 0;
                it.setInsertSpaceBefore(false);
            }
            final Drawable drawable2 = (Drawable)CollectionsKt.lastOrNull((List)drawables);
            if (drawable2 != null) {
                final Drawable it = drawable2;
                final int n2 = 0;
                it.setInsertSpaceAfter(false);
            }
        }
        
        public final void trim(@NotNull final Drawable drawable) {
            Intrinsics.checkNotNullParameter((Object)drawable, "drawable");
            if (drawable instanceof DrawableList) {
                ((Drawable)CollectionsKt.first((List)drawable)).setInsertSpaceBefore(false);
                ((Drawable)CollectionsKt.last((List)drawable)).setInsertSpaceAfter(false);
            }
            else {
                drawable.setInsertSpaceBefore(false);
                drawable.setInsertSpaceAfter(false);
            }
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
