package gg.essential.elementa.markdown.drawables;

import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\bH\u00c6\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u001b" }, d2 = { "Lgg/essential/elementa/markdown/drawables/TextDrawable$Text;", "", "string", "", "x", "", "y", "selected", "", "(Ljava/lang/String;FFZ)V", "getSelected", "()Z", "getString", "()Ljava/lang/String;", "getX", "()F", "getY", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "Elementa" })
public static final class Text
{
    @NotNull
    private final String string;
    private final float x;
    private final float y;
    private final boolean selected;
    
    public Text(@NotNull final String string, final float x, final float y, final boolean selected) {
        Intrinsics.checkNotNullParameter((Object)string, "string");
        super();
        this.string = string;
        this.x = x;
        this.y = y;
        this.selected = selected;
    }
    
    @NotNull
    public final String getString() {
        return this.string;
    }
    
    public final float getX() {
        return this.x;
    }
    
    public final float getY() {
        return this.y;
    }
    
    public final boolean getSelected() {
        return this.selected;
    }
    
    @NotNull
    public final String component1() {
        return this.string;
    }
    
    public final float component2() {
        return this.x;
    }
    
    public final float component3() {
        return this.y;
    }
    
    public final boolean component4() {
        return this.selected;
    }
    
    @NotNull
    public final Text copy(@NotNull final String string, final float x, final float y, final boolean selected) {
        Intrinsics.checkNotNullParameter((Object)string, "string");
        return new Text(string, x, y, selected);
    }
    
    public static /* synthetic */ Text copy$default(final Text text, String string, float x, float y, boolean selected, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            string = text.string;
        }
        if ((n & 0x2) != 0x0) {
            x = text.x;
        }
        if ((n & 0x4) != 0x0) {
            y = text.y;
        }
        if ((n & 0x8) != 0x0) {
            selected = text.selected;
        }
        return text.copy(string, x, y, selected);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Text(string=" + this.string + ", x=" + this.x + ", y=" + this.y + ", selected=" + this.selected + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.string.hashCode();
        result = result * 31 + Float.hashCode(this.x);
        result = result * 31 + Float.hashCode(this.y);
        final int n = result * 31;
        int selected;
        if ((selected = (this.selected ? 1 : 0)) != 0) {
            selected = 1;
        }
        result = n + selected;
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Text)) {
            return false;
        }
        final Text text = (Text)other;
        return Intrinsics.areEqual((Object)this.string, (Object)text.string) && Intrinsics.areEqual((Object)this.x, (Object)text.x) && Intrinsics.areEqual((Object)this.y, (Object)text.y) && this.selected == text.selected;
    }
}
