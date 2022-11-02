package gg.essential.elementa.markdown.drawables;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u0000 !2\u00020\u0001:\u0001!B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tH\u00c6\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0013H\u00d6\u0001J\t\u0010 \u001a\u00020\tH\u00d6\u0001R\u0011\u0010\u000b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\"" }, d2 = { "Lgg/essential/elementa/markdown/drawables/TextDrawable$Style;", "", "isBold", "", "isItalic", "isStrikethrough", "isUnderline", "isCode", "linkLocation", "", "(ZZZZZLjava/lang/String;)V", "formattingSymbols", "getFormattingSymbols", "()Ljava/lang/String;", "()Z", "getLinkLocation", "markdownSymbols", "getMarkdownSymbols", "numFormattingChars", "", "getNumFormattingChars", "()I", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "Companion", "Elementa" })
public static final class Style
{
    @NotNull
    public static final Companion Companion;
    private final boolean isBold;
    private final boolean isItalic;
    private final boolean isStrikethrough;
    private final boolean isUnderline;
    private final boolean isCode;
    @Nullable
    private final String linkLocation;
    @NotNull
    private final String formattingSymbols;
    @NotNull
    private final String markdownSymbols;
    @NotNull
    private static final Style EMPTY;
    
    public Style(final boolean isBold, final boolean isItalic, final boolean isStrikethrough, final boolean isUnderline, final boolean isCode, @Nullable final String linkLocation) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokespecial   java/lang/Object.<init>:()V
        //     4: aload_0         /* this */
        //     5: iload_1         /* isBold */
        //     6: putfield        gg/essential/elementa/markdown/drawables/TextDrawable$Style.isBold:Z
        //     9: aload_0         /* this */
        //    10: iload_2         /* isItalic */
        //    11: putfield        gg/essential/elementa/markdown/drawables/TextDrawable$Style.isItalic:Z
        //    14: aload_0         /* this */
        //    15: iload_3         /* isStrikethrough */
        //    16: putfield        gg/essential/elementa/markdown/drawables/TextDrawable$Style.isStrikethrough:Z
        //    19: aload_0         /* this */
        //    20: iload           isUnderline
        //    22: putfield        gg/essential/elementa/markdown/drawables/TextDrawable$Style.isUnderline:Z
        //    25: aload_0         /* this */
        //    26: iload           isCode
        //    28: putfield        gg/essential/elementa/markdown/drawables/TextDrawable$Style.isCode:Z
        //    31: aload_0         /* this */
        //    32: aload           linkLocation
        //    34: putfield        gg/essential/elementa/markdown/drawables/TextDrawable$Style.linkLocation:Ljava/lang/String;
        //    37: aload_0         /* this */
        //    38: new             Ljava/lang/StringBuilder;
        //    41: dup            
        //    42: invokespecial   java/lang/StringBuilder.<init>:()V
        //    45: astore          7
        //    47: aload           7
        //    49: astore          8
        //    51: astore          10
        //    53: iconst_0       
        //    54: istore          $i$a$-buildString-TextDrawable$Style$formattingSymbols$1
        //    56: aload_0         /* this */
        //    57: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable$Style.isCode:()Z
        //    60: ifeq            66
        //    63: goto            127
        //    66: aload_0         /* this */
        //    67: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable$Style.isBold:()Z
        //    70: ifeq            81
        //    73: aload           $this$formattingSymbols_u24lambda_u2d0
        //    75: ldc             "§l"
        //    77: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    80: pop            
        //    81: aload_0         /* this */
        //    82: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable$Style.isItalic:()Z
        //    85: ifeq            96
        //    88: aload           $this$formattingSymbols_u24lambda_u2d0
        //    90: ldc             "§o"
        //    92: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    95: pop            
        //    96: aload_0         /* this */
        //    97: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable$Style.isStrikethrough:()Z
        //   100: ifeq            111
        //   103: aload           $this$formattingSymbols_u24lambda_u2d0
        //   105: ldc             "§m"
        //   107: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   110: pop            
        //   111: aload_0         /* this */
        //   112: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable$Style.isUnderline:()Z
        //   115: ifeq            126
        //   118: aload           $this$formattingSymbols_u24lambda_u2d0
        //   120: ldc             "§n"
        //   122: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   125: pop            
        //   126: nop            
        //   127: aload           10
        //   129: aload           7
        //   131: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   134: dup            
        //   135: ldc             "StringBuilder().apply(builderAction).toString()"
        //   137: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   140: putfield        gg/essential/elementa/markdown/drawables/TextDrawable$Style.formattingSymbols:Ljava/lang/String;
        //   143: aload_0         /* this */
        //   144: new             Ljava/lang/StringBuilder;
        //   147: dup            
        //   148: invokespecial   java/lang/StringBuilder.<init>:()V
        //   151: astore          7
        //   153: aload           7
        //   155: astore          8
        //   157: astore          10
        //   159: iconst_0       
        //   160: istore          $i$a$-buildString-TextDrawable$Style$markdownSymbols$1
        //   162: aload_0         /* this */
        //   163: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable$Style.isCode:()Z
        //   166: ifeq            177
        //   169: aload           $this$markdownSymbols_u24lambda_u2d1
        //   171: ldc             "`"
        //   173: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   176: pop            
        //   177: aload_0         /* this */
        //   178: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable$Style.isBold:()Z
        //   181: ifeq            192
        //   184: aload           $this$markdownSymbols_u24lambda_u2d1
        //   186: ldc             "**"
        //   188: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   191: pop            
        //   192: aload_0         /* this */
        //   193: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable$Style.isItalic:()Z
        //   196: ifeq            207
        //   199: aload           $this$markdownSymbols_u24lambda_u2d1
        //   201: ldc             "*"
        //   203: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   206: pop            
        //   207: aload_0         /* this */
        //   208: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable$Style.isStrikethrough:()Z
        //   211: ifeq            222
        //   214: aload           $this$markdownSymbols_u24lambda_u2d1
        //   216: ldc             "~~"
        //   218: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   221: pop            
        //   222: aload_0         /* this */
        //   223: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable$Style.isUnderline:()Z
        //   226: ifeq            237
        //   229: aload           $this$markdownSymbols_u24lambda_u2d1
        //   231: ldc             "++"
        //   233: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   236: pop            
        //   237: nop            
        //   238: aload           10
        //   240: aload           7
        //   242: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   245: dup            
        //   246: ldc             "StringBuilder().apply(builderAction).toString()"
        //   248: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   251: putfield        gg/essential/elementa/markdown/drawables/TextDrawable$Style.markdownSymbols:Ljava/lang/String;
        //   254: return         
        //    MethodParameters:
        //  Name             Flags  
        //  ---------------  -----
        //  isBold           
        //  isItalic         
        //  isStrikethrough  
        //  isUnderline      
        //  isCode           
        //  linkLocation     
        //    StackMapTable: 00 0B FF 00 42 00 0B 07 00 02 01 01 01 01 01 07 00 52 07 00 4D 07 00 4D 01 07 00 02 00 00 0E 0E 0E 0E 00 31 0E 0E 0E 0E
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final boolean isBold() {
        return this.isBold;
    }
    
    public final boolean isItalic() {
        return this.isItalic;
    }
    
    public final boolean isStrikethrough() {
        return this.isStrikethrough;
    }
    
    public final boolean isUnderline() {
        return this.isUnderline;
    }
    
    public final boolean isCode() {
        return this.isCode;
    }
    
    @Nullable
    public final String getLinkLocation() {
        return this.linkLocation;
    }
    
    @NotNull
    public final String getFormattingSymbols() {
        return this.formattingSymbols;
    }
    
    @NotNull
    public final String getMarkdownSymbols() {
        return this.markdownSymbols;
    }
    
    public final int getNumFormattingChars() {
        return this.formattingSymbols.length();
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
    public final Style copy(final boolean isBold, final boolean isItalic, final boolean isStrikethrough, final boolean isUnderline, final boolean isCode, @Nullable final String linkLocation) {
        return new Style(isBold, isItalic, isStrikethrough, isUnderline, isCode, linkLocation);
    }
    
    public static /* synthetic */ Style copy$default(final Style style, boolean isBold, boolean isItalic, boolean isStrikethrough, boolean isUnderline, boolean isCode, String linkLocation, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            isBold = style.isBold;
        }
        if ((n & 0x2) != 0x0) {
            isItalic = style.isItalic;
        }
        if ((n & 0x4) != 0x0) {
            isStrikethrough = style.isStrikethrough;
        }
        if ((n & 0x8) != 0x0) {
            isUnderline = style.isUnderline;
        }
        if ((n & 0x10) != 0x0) {
            isCode = style.isCode;
        }
        if ((n & 0x20) != 0x0) {
            linkLocation = style.linkLocation;
        }
        return style.copy(isBold, isItalic, isStrikethrough, isUnderline, isCode, linkLocation);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Style(isBold=" + this.isBold + ", isItalic=" + this.isItalic + ", isStrikethrough=" + this.isStrikethrough + ", isUnderline=" + this.isUnderline + ", isCode=" + this.isCode + ", linkLocation=" + (Object)this.linkLocation + ')';
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
        if (!(other instanceof Style)) {
            return false;
        }
        final Style style = (Style)other;
        return this.isBold == style.isBold && this.isItalic == style.isItalic && this.isStrikethrough == style.isStrikethrough && this.isUnderline == style.isUnderline && this.isCode == style.isCode && Intrinsics.areEqual((Object)this.linkLocation, (Object)style.linkLocation);
    }
    
    public static final /* synthetic */ Style access$getEMPTY$cp() {
        return Style.EMPTY;
    }
    
    static {
        Companion = new Companion(null);
        EMPTY = new Style(false, false, false, false, false, null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007" }, d2 = { "Lgg/essential/elementa/markdown/drawables/TextDrawable$Style$Companion;", "", "()V", "EMPTY", "Lgg/essential/elementa/markdown/drawables/TextDrawable$Style;", "getEMPTY", "()Lgg/essential/elementa/markdown/drawables/TextDrawable$Style;", "Elementa" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final Style getEMPTY() {
            return Style.access$getEMPTY$cp();
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
