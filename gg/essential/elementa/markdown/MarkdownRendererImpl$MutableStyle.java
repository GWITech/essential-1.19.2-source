package gg.essential.elementa.markdown;

import kotlin.*;
import gg.essential.elementa.markdown.drawables.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

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
