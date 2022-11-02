package gg.essential.elementa.markdown.drawables;

import org.jetbrains.annotations.*;
import kotlin.text.*;
import kotlin.collections.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.font.*;
import gg.essential.universal.*;
import gg.essential.elementa.markdown.selection.*;
import kotlin.jvm.internal.*;
import java.util.*;
import gg.essential.elementa.markdown.*;
import kotlin.*;
import gg.essential.elementa.components.*;
import java.awt.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 N2\u00020\u0001:\u0004NOPQB\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000e\u00100\u001a\u0002012\u0006\u00102\u001a\u000203J(\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u001d2\u0006\u00107\u001a\u00020\u001d2\u0006\u00108\u001a\u00020\u00152\u0006\u00109\u001a\u00020#H\u0016J\b\u0010:\u001a\u00020;H\u0016J\b\u0010<\u001a\u00020;H\u0016J\u0018\u0010=\u001a\u0002012\u0006\u0010>\u001a\u00020?2\u0006\u00102\u001a\u000203H\u0016J\u0006\u0010@\u001a\u000201J \u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u001d2\u0006\u0010D\u001a\u00020\u001d2\u0006\u0010E\u001a\u00020\u001dH\u0014J\u0006\u0010F\u001a\u00020\u0005J\u0010\u0010G\u001a\u00020\u00052\u0006\u0010H\u001a\u00020\u0015H\u0016J&\u0010I\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0000\u0018\u00010J2\u0006\u0010K\u001a\u00020\u001d2\b\b\u0002\u0010L\u001a\u00020\u0015J\b\u0010M\u001a\u00020\u0005H\u0016J\u0006\u0010E\u001a\u00020\u001dR\u001e\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR(\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u000e@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020/0.X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006R" }, d2 = { "Lgg/essential/elementa/markdown/drawables/TextDrawable;", "Lgg/essential/elementa/markdown/drawables/Drawable;", "md", "Lgg/essential/elementa/markdown/MarkdownComponent;", "text", "", "style", "Lgg/essential/elementa/markdown/drawables/TextDrawable$Style;", "(Lgg/essential/elementa/markdown/MarkdownComponent;Ljava/lang/String;Lgg/essential/elementa/markdown/drawables/TextDrawable$Style;)V", "<set-?>", "formattedText", "getFormattedText", "()Ljava/lang/String;", "value", "Lgg/essential/elementa/markdown/HeaderLevelConfig;", "headerConfig", "getHeaderConfig$Elementa", "()Lgg/essential/elementa/markdown/HeaderLevelConfig;", "setHeaderConfig$Elementa", "(Lgg/essential/elementa/markdown/HeaderLevelConfig;)V", "isHovered", "", "linkedTexts", "Lgg/essential/elementa/markdown/drawables/TextDrawable$LinkedTexts;", "getLinkedTexts", "()Lgg/essential/elementa/markdown/drawables/TextDrawable$LinkedTexts;", "setLinkedTexts", "(Lgg/essential/elementa/markdown/drawables/TextDrawable$LinkedTexts;)V", "scaleModifier", "", "getScaleModifier", "()F", "setScaleModifier", "(F)V", "selectionEnd", "", "getSelectionEnd", "()I", "setSelectionEnd", "(I)V", "selectionStart", "getSelectionStart", "setSelectionStart", "getStyle", "()Lgg/essential/elementa/markdown/drawables/TextDrawable$Style;", "texts", "", "Lgg/essential/elementa/markdown/drawables/TextDrawable$Text;", "beforeDraw", "", "state", "Lgg/essential/elementa/markdown/DrawState;", "cursorAt", "", "mouseX", "mouseY", "dragged", "mouseButton", "cursorAtEnd", "Lgg/essential/elementa/markdown/selection/TextCursor;", "cursorAtStart", "draw", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "ensureTrimmed", "layoutImpl", "Lgg/essential/elementa/markdown/drawables/Drawable$Layout;", "x", "y", "width", "plainText", "selectedText", "asMarkdown", "split", "Lkotlin/Pair;", "maxWidth", "breakWords", "toString", "Companion", "LinkedTexts", "Style", "Text", "Elementa" })
public final class TextDrawable extends Drawable
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final Style style;
    private float scaleModifier;
    @Nullable
    private HeaderLevelConfig headerConfig;
    @NotNull
    private String formattedText;
    private int selectionStart;
    private int selectionEnd;
    @NotNull
    private List<Text> texts;
    private boolean isHovered;
    @Nullable
    private LinkedTexts linkedTexts;
    
    public TextDrawable(@NotNull final MarkdownComponent md, @NotNull final String text, @NotNull final Style style) {
        Intrinsics.checkNotNullParameter((Object)md, "md");
        Intrinsics.checkNotNullParameter((Object)text, "text");
        Intrinsics.checkNotNullParameter((Object)style, "style");
        super(md);
        this.style = style;
        this.scaleModifier = 1.0f;
        this.formattedText = Intrinsics.stringPlus(this.style.getFormattingSymbols(), (Object)text);
        this.selectionStart = -1;
        this.selectionEnd = -1;
        this.texts = new ArrayList<Text>();
    }
    
    @NotNull
    public final Style getStyle() {
        return this.style;
    }
    
    public final float getScaleModifier() {
        return this.scaleModifier;
    }
    
    public final void setScaleModifier(final float <set-?>) {
        this.scaleModifier = <set-?>;
    }
    
    @Nullable
    public final HeaderLevelConfig getHeaderConfig$Elementa() {
        return this.headerConfig;
    }
    
    public final void setHeaderConfig$Elementa(@Nullable final HeaderLevelConfig value) {
        this.headerConfig = value;
        final Float n = (value == null) ? null : Float.valueOf(value.getTextScale());
        this.scaleModifier = ((n == null) ? this.scaleModifier : n);
    }
    
    @NotNull
    public final String getFormattedText() {
        return this.formattedText;
    }
    
    public final int getSelectionStart() {
        return this.selectionStart;
    }
    
    public final void setSelectionStart(final int <set-?>) {
        this.selectionStart = <set-?>;
    }
    
    public final int getSelectionEnd() {
        return this.selectionEnd;
    }
    
    public final void setSelectionEnd(final int <set-?>) {
        this.selectionEnd = <set-?>;
    }
    
    @Nullable
    public final LinkedTexts getLinkedTexts() {
        return this.linkedTexts;
    }
    
    public final void setLinkedTexts(@Nullable final LinkedTexts <set-?>) {
        this.linkedTexts = <set-?>;
    }
    
    @NotNull
    public final String plainText() {
        return StringsKt.drop(this.formattedText, this.style.getNumFormattingChars());
    }
    
    public final void ensureTrimmed() {
        final int styleChars = this.style.getNumFormattingChars();
        final String formattedText = this.formattedText;
        final int beginIndex = 0;
        final String s = formattedText;
        if (s == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        final String substring = s.substring(beginIndex, styleChars);
        Intrinsics.checkNotNullExpressionValue((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        final String formattedText2 = this.formattedText;
        final int length = this.formattedText.length();
        final String s2 = formattedText2;
        if (s2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        final String substring2 = s2.substring(styleChars, length);
        Intrinsics.checkNotNullExpressionValue((Object)substring2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        if (substring2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
        }
        this.formattedText = Intrinsics.stringPlus(substring, (Object)StringsKt.trimStart((CharSequence)substring2).toString());
    }
    
    public final float width() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/elementa/markdown/drawables/TextDrawable.formattedText:Ljava/lang/String;
        //     4: aload_0         /* this */
        //     5: getfield        gg/essential/elementa/markdown/drawables/TextDrawable.scaleModifier:F
        //     8: aconst_null    
        //     9: iconst_2       
        //    10: aconst_null    
        //    11: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.width$default:(Ljava/lang/String;FLgg/essential/elementa/font/FontProvider;ILjava/lang/Object;)F
        //    14: aload_0         /* this */
        //    15: getfield        gg/essential/elementa/markdown/drawables/TextDrawable.style:Lgg/essential/elementa/markdown/drawables/TextDrawable$Style;
        //    18: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable$Style.isCode:()Z
        //    21: ifeq            54
        //    24: aload_0         /* this */
        //    25: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable.getConfig:()Lgg/essential/elementa/markdown/MarkdownConfig;
        //    28: invokevirtual   gg/essential/elementa/markdown/MarkdownConfig.getInlineCodeConfig:()Lgg/essential/elementa/markdown/InlineCodeConfig;
        //    31: astore_1       
        //    32: fstore_3       
        //    33: iconst_0       
        //    34: istore_2        /* $i$a$-let-TextDrawable$width$1 */
        //    35: aload_1         /* it */
        //    36: invokevirtual   gg/essential/elementa/markdown/InlineCodeConfig.getOutlineWidth:()F
        //    39: aload_1         /* it */
        //    40: invokevirtual   gg/essential/elementa/markdown/InlineCodeConfig.getHorizontalPadding:()F
        //    43: fadd           
        //    44: fconst_2       
        //    45: fmul           
        //    46: fstore          4
        //    48: fload_3        
        //    49: fload           4
        //    51: goto            55
        //    54: fconst_0       
        //    55: fadd           
        //    56: freturn        
        //    StackMapTable: 00 02 76 02 FF 00 00 00 01 07 00 02 00 02 02 02
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Nullable
    public final Pair<TextDrawable, TextDrawable> split(final float maxWidth, final boolean breakWords) {
        final int styleChars = this.style.getNumFormattingChars();
        final String plainText = this.plainText();
        if (plainText.length() <= 1) {
            return null;
        }
        final Iterable $this$firstOrNull$iv = CollectionsKt.drop((Iterable)StringsKt.getIndices((CharSequence)this.formattedText), styleChars);
        final int $i$f$firstOrNull = 0;
        while (true) {
            for (final Object element$iv : $this$firstOrNull$iv) {
                final int it = ((Number)element$iv).intValue();
                final int n = 0;
                final String formattedText = this.getFormattedText();
                final int beginIndex = 0;
                final int endIndex = it + 1;
                final String s = formattedText;
                if (s == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                final String substring = s.substring(beginIndex, endIndex);
                Intrinsics.checkNotNullExpressionValue((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                if (UtilitiesKt.width$default(substring, this.getScaleModifier(), null, 2, null) <= maxWidth) {
                    continue;
                }
                final Object o = element$iv;
                final Integer n2 = (Integer)o;
                if (n2 == null) {
                    throw new IllegalStateException("TextDrawable#split called when it should not have been called");
                }
                int splitPoint = n2;
                splitPoint -= styleChars;
                if (!breakWords) {
                    while (splitPoint > styleChars && this.formattedText.charAt(splitPoint) != ' ') {
                        --splitPoint;
                    }
                    if (splitPoint == styleChars) {
                        return null;
                    }
                }
                if (splitPoint <= 0) {
                    splitPoint = 1;
                }
                final MarkdownComponent md = this.getMd();
                final String s2 = plainText;
                final int beginIndex2 = 0;
                final String s3 = s2;
                if (s3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                final String substring2 = s3.substring(beginIndex2, splitPoint);
                Intrinsics.checkNotNullExpressionValue((Object)substring2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                if (substring2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                }
                final TextDrawable first = new TextDrawable(md, StringsKt.trimEnd((CharSequence)substring2).toString(), this.style);
                final MarkdownComponent md2 = this.getMd();
                final String s4 = plainText;
                final int length = plainText.length();
                final String s5 = s4;
                if (s5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                final String substring3 = s5.substring(splitPoint, length);
                Intrinsics.checkNotNullExpressionValue((Object)substring3, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                final TextDrawable second = new TextDrawable(md2, substring3, this.style);
                final LinkedTexts linkedTexts2 = this.linkedTexts;
                LinkedTexts linkedTexts3;
                if (linkedTexts2 == null) {
                    linkedTexts3 = null;
                }
                else {
                    final LinkedTexts it2 = linkedTexts2;
                    final int n3 = 0;
                    it2.unlinkText(this);
                    linkedTexts3 = it2;
                }
                final LinkedTexts linkedTexts4 = linkedTexts3;
                final LinkedTexts linkedTexts = (linkedTexts4 == null) ? new LinkedTexts() : linkedTexts4;
                linkedTexts.linkText(first);
                linkedTexts.linkText(second);
                first.linkedTexts = linkedTexts;
                second.linkedTexts = linkedTexts;
                first.scaleModifier = this.scaleModifier;
                second.scaleModifier = this.scaleModifier;
                return (Pair<TextDrawable, TextDrawable>)TuplesKt.to((Object)first, (Object)second);
            }
            final Object o = null;
            continue;
        }
    }
    
    public static /* synthetic */ Pair split$default(final TextDrawable textDrawable, final float maxWidth, boolean breakWords, final int n, final Object o) {
        if ((n & 0x2) != 0x0) {
            breakWords = false;
        }
        return textDrawable.split(maxWidth, breakWords);
    }
    
    @NotNull
    @Override
    protected Layout layoutImpl(final float x, final float y, final float width) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: fload_2         /* y */
        //     2: fload_3         /* width */
        //     3: ldc_w           9.0
        //     6: aload_0         /* this */
        //     7: getfield        gg/essential/elementa/markdown/drawables/TextDrawable.scaleModifier:F
        //    10: fmul           
        //    11: aload_0         /* this */
        //    12: getfield        gg/essential/elementa/markdown/drawables/TextDrawable.style:Lgg/essential/elementa/markdown/drawables/TextDrawable$Style;
        //    15: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable$Style.isCode:()Z
        //    18: ifeq            70
        //    21: aload_0         /* this */
        //    22: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable.getConfig:()Lgg/essential/elementa/markdown/MarkdownConfig;
        //    25: invokevirtual   gg/essential/elementa/markdown/MarkdownConfig.getInlineCodeConfig:()Lgg/essential/elementa/markdown/InlineCodeConfig;
        //    28: astore          4
        //    30: fstore          9
        //    32: fstore          8
        //    34: fstore          7
        //    36: fstore          6
        //    38: iconst_0       
        //    39: istore          $i$a$-let-TextDrawable$layoutImpl$1
        //    41: aload           it
        //    43: invokevirtual   gg/essential/elementa/markdown/InlineCodeConfig.getVerticalPadding:()F
        //    46: aload           it
        //    48: invokevirtual   gg/essential/elementa/markdown/InlineCodeConfig.getOutlineWidth:()F
        //    51: fadd           
        //    52: fstore          10
        //    54: fload           6
        //    56: fload           7
        //    58: fload           8
        //    60: fload           9
        //    62: fload           10
        //    64: nop            
        //    65: fconst_2       
        //    66: fmul           
        //    67: goto            71
        //    70: fconst_0       
        //    71: fadd           
        //    72: aconst_null    
        //    73: bipush          16
        //    75: aconst_null    
        //    76: astore          11
        //    78: istore          12
        //    80: astore          13
        //    82: fstore          14
        //    84: fstore          15
        //    86: fstore          16
        //    88: fstore          17
        //    90: new             Lgg/essential/elementa/markdown/drawables/Drawable$Layout;
        //    93: dup            
        //    94: fload           17
        //    96: fload           16
        //    98: fload           15
        //   100: fload           14
        //   102: aload           13
        //   104: iload           12
        //   106: aload           11
        //   108: invokespecial   gg/essential/elementa/markdown/drawables/Drawable$Layout.<init>:(FFFFLgg/essential/elementa/markdown/drawables/Drawable$Margin;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   111: areturn        
        //    MethodParameters:
        //  Name   Flags  
        //  -----  -----
        //  x      
        //  y      
        //  width  
        //    StackMapTable: 00 02 FF 00 46 00 04 07 00 02 02 02 02 00 04 02 02 02 02 FF 00 00 00 04 07 00 02 02 02 02 00 05 02 02 02 02 02
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final void beforeDraw(@NotNull final DrawState state) {
        Intrinsics.checkNotNullParameter((Object)state, "state");
        this.texts.clear();
        if (this.selectionStart == -1 && this.selectionEnd == -1) {
            this.texts.add(new Text(this.formattedText, this.getX(), this.getY(), false));
        }
        else {
            if (this.selectionStart == -1 || this.selectionEnd == -1) {
                throw new IllegalStateException();
            }
            final int start = this.selectionStart + this.style.getNumFormattingChars();
            final int end = this.selectionEnd + this.style.getNumFormattingChars();
            final String formattedText = this.formattedText;
            final int beginIndex = 0;
            final int numFormattingChars = this.style.getNumFormattingChars();
            final String s = formattedText;
            if (s == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            final String substring = s.substring(beginIndex, numFormattingChars);
            Intrinsics.checkNotNullExpressionValue((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            final String formatChars = substring;
            float x2;
            if (this.selectionStart > 0) {
                final List<Text> texts = this.texts;
                final String formattedText2 = this.formattedText;
                final int beginIndex2 = 0;
                final String s2 = formattedText2;
                if (s2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                final String substring2 = s2.substring(beginIndex2, start);
                Intrinsics.checkNotNullExpressionValue((Object)substring2, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                texts.add(new Text(substring2, this.getX(), this.getY(), false));
                final float x = this.getX();
                final String formattedText3 = this.formattedText;
                final int beginIndex3 = 0;
                final String s3 = formattedText3;
                if (s3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                final String substring3 = s3.substring(beginIndex3, start);
                Intrinsics.checkNotNullExpressionValue((Object)substring3, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
                x2 = x + UtilitiesKt.width$default(substring3, this.scaleModifier, null, 2, null);
            }
            else {
                x2 = this.getX();
            }
            final float nextX = x2;
            final String s4 = formatChars;
            final String formattedText4 = this.formattedText;
            if (formattedText4 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            final String substring4 = formattedText4.substring(start, end);
            Intrinsics.checkNotNullExpressionValue((Object)substring4, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
            final String selectedString = Intrinsics.stringPlus(s4, (Object)substring4);
            this.texts.add(new Text(selectedString, nextX, this.getY(), true));
            if (end < this.formattedText.length()) {
                final List<Text> texts2 = this.texts;
                final String s5 = formatChars;
                final String formattedText5 = this.formattedText;
                if (formattedText5 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                final String substring5 = formattedText5.substring(end);
                Intrinsics.checkNotNullExpressionValue((Object)substring5, "(this as java.lang.String).substring(startIndex)");
                texts2.add(new Text(Intrinsics.stringPlus(s5, (Object)substring5), nextX + UtilitiesKt.width$default(selectedString, this.scaleModifier, null, 2, null), this.getY(), false));
            }
        }
        final double mouseX = UMouse.Scaled.getX() - state.getXShift();
        final double mouseY = UMouse.Scaled.getY() - state.getYShift();
        this.isHovered = (this.style.getLinkLocation() != null && this.isHovered((float)mouseX, (float)mouseY));
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack, @NotNull final DrawState state) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)state, "state");
        boolean b = false;
        Label_0049: {
            if (!this.isHovered) {
                final LinkedTexts linkedTexts = this.linkedTexts;
                if (linkedTexts == null || !linkedTexts.isHovered()) {
                    b = false;
                    break Label_0049;
                }
            }
            b = true;
        }
        final boolean hovered = b;
        if (this.style.isCode()) {
            final float x1 = this.getX() + state.getXShift();
            final float y1 = this.getY() + state.getYShift() - 1.0f;
            final float x2 = x1 + this.getWidth();
            final float y2 = y1 + this.getHeight() + this.getConfig().getInlineCodeConfig().getVerticalPadding() * 2 - 1.0f;
            final float outlineWidth = this.getConfig().getInlineCodeConfig().getOutlineWidth();
            UIRoundedRectangle.Companion.drawRoundedRectangle(matrixStack, x1, y1, x2, y2, this.getConfig().getInlineCodeConfig().getCornerRadius(), this.getConfig().getInlineCodeConfig().getOutlineColor());
            UIRoundedRectangle.Companion.drawRoundedRectangle(matrixStack, x1 + outlineWidth, y1 + outlineWidth, x2 - outlineWidth, y2 - outlineWidth, this.getConfig().getInlineCodeConfig().getCornerRadius(), this.getConfig().getInlineCodeConfig().getBackgroundColor());
        }
        final float xShift = state.getXShift() + (this.style.isCode() ? this.getConfig().getInlineCodeConfig().getHorizontalPadding() : 0.0f);
        final float yShift = state.getYShift() + (this.style.isCode() ? this.getConfig().getInlineCodeConfig().getVerticalPadding() : 0.0f);
        final Iterable $this$forEach$iv = this.texts;
        final int $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final Text it = (Text)element$iv;
            final int n = 0;
            matrixStack.scale(this.getScaleModifier(), this.getScaleModifier(), 1.0f);
            TextDrawable.Companion.drawString(matrixStack, this.getConfig(), this.getMd().getFontProvider(), it.getString(), (it.getX() + xShift) / this.getScaleModifier(), (it.getY() + yShift) / this.getScaleModifier(), it.getSelected(), this.getStyle().getLinkLocation() != null, hovered, this.getHeaderConfig$Elementa());
            matrixStack.scale(1.0f / this.getScaleModifier(), 1.0f / this.getScaleModifier(), 1.0f);
        }
    }
    
    @NotNull
    public Void cursorAt(final float mouseX, final float mouseY, final boolean dragged, final int mouseButton) {
        throw new IllegalStateException("never called");
    }
    
    @NotNull
    public TextCursor cursorAtStart() {
        return new TextCursor(this, 0);
    }
    
    @NotNull
    public TextCursor cursorAtEnd() {
        return new TextCursor(this, this.plainText().length());
    }
    
    @NotNull
    @Override
    public String selectedText(final boolean asMarkdown) {
        if (this.selectionStart == -1 || this.selectionEnd == -1) {
            return "";
        }
        final String plainText = this.plainText();
        final int selectionStart = this.selectionStart;
        final int selectionEnd = this.selectionEnd;
        final String s = plainText;
        if (s == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        final String substring = s.substring(selectionStart, selectionEnd);
        Intrinsics.checkNotNullExpressionValue((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        final String selectedText = substring;
        if (!asMarkdown) {
            return selectedText;
        }
        return this.style.getMarkdownSymbols() + selectedText + this.style.getMarkdownSymbols();
    }
    
    @NotNull
    @Override
    public String toString() {
        return this.formattedText;
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
    
    public static final /* synthetic */ boolean access$isHovered$p(final TextDrawable $this) {
        return $this.isHovered;
    }
    
    static {
        Companion = new Companion(null);
    }
    
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
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r" }, d2 = { "Lgg/essential/elementa/markdown/drawables/TextDrawable$LinkedTexts;", "", "()V", "texts", "", "Lgg/essential/elementa/markdown/drawables/TextDrawable;", "isHovered", "", "linkText", "", "text", "unlinkText", "Companion", "Elementa" })
    public static final class LinkedTexts
    {
        @NotNull
        public static final Companion Companion;
        @NotNull
        private final Set<TextDrawable> texts;
        
        public LinkedTexts() {
            super();
            this.texts = new LinkedHashSet<TextDrawable>();
        }
        
        public final boolean isHovered() {
            final Iterable $this$any$iv = this.texts;
            final int $i$f$any = 0;
            boolean b;
            if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
                b = false;
            }
            else {
                for (final Object element$iv : $this$any$iv) {
                    final TextDrawable it = (TextDrawable)element$iv;
                    final int n = 0;
                    if (TextDrawable.access$isHovered$p(it)) {
                        b = true;
                        return b;
                    }
                }
                b = false;
            }
            return b;
        }
        
        public final void linkText(@NotNull final TextDrawable text) {
            Intrinsics.checkNotNullParameter((Object)text, "text");
            this.texts.add(text);
        }
        
        public final void unlinkText(@NotNull final TextDrawable text) {
            Intrinsics.checkNotNullParameter((Object)text, "text");
            this.texts.remove(text);
        }
        
        public static final /* synthetic */ Set access$getTexts$p(final LinkedTexts $this) {
            return $this.texts;
        }
        
        static {
            Companion = new Companion(null);
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¨\u0006\u0007" }, d2 = { "Lgg/essential/elementa/markdown/drawables/TextDrawable$LinkedTexts$Companion;", "", "()V", "merge", "Lgg/essential/elementa/markdown/drawables/TextDrawable$LinkedTexts;", "linked1", "linked2", "Elementa" })
        public static final class Companion
        {
            private Companion() {
                super();
            }
            
            @NotNull
            public final LinkedTexts merge(@Nullable final LinkedTexts linked1, @Nullable final LinkedTexts linked2) {
                LinkedTexts linkedTexts;
                if (linked1 == null && linked2 == null) {
                    linkedTexts = new LinkedTexts();
                }
                else if (linked1 == null) {
                    linkedTexts = linked2;
                    Intrinsics.checkNotNull((Object)linked2);
                }
                else if (linked2 == null) {
                    linkedTexts = linked1;
                }
                else {
                    final Iterable $this$forEach$iv = LinkedTexts.access$getTexts$p(linked2);
                    final int $i$f$forEach = 0;
                    for (final Object element$iv : $this$forEach$iv) {
                        final TextDrawable it = (TextDrawable)element$iv;
                        final int n = 0;
                        linked1.linkText(it);
                    }
                    linkedTexts = linked1;
                }
                return linkedTexts;
            }
            
            public Companion(final DefaultConstructorMarker $constructor_marker) {
                this();
            }
        }
    }
    
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
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JN\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000fH\u0007J`\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015¨\u0006\u0016" }, d2 = { "Lgg/essential/elementa/markdown/drawables/TextDrawable$Companion;", "", "()V", "drawString", "", "config", "Lgg/essential/elementa/markdown/MarkdownConfig;", "fontProvider", "Lgg/essential/elementa/font/FontProvider;", "string", "", "x", "", "y", "selected", "", "isLink", "isHovered", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "headerConfig", "Lgg/essential/elementa/markdown/HeaderLevelConfig;", "Elementa" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @Deprecated(message = "For 1.17 this method requires you pass a UMatrixStack as the first argument.\n\nIf you are currently extending this method, you should instead extend the method with the added argument.\nNote however for this to be non-breaking, your parent class needs to transition before you do.\n\nIf you are calling this method and you cannot guarantee that your target class has been fully updated (such as when\ncalling an open method on an open class), you should instead call the method with the \"Compat\" suffix, which will\ncall both methods, the new and the deprecated one.\nIf you are sure that your target class has been updated (such as when calling the super method), you should\n(for super calls you must!) instead just call the method with the original name and added argument.", replaceWith = @ReplaceWith(expression = "drawString(matrixStack, config, fontProvider, string, x, y, selected, isLink, isHovered)", imports = {}))
        @java.lang.Deprecated
        public final void drawString(@NotNull final MarkdownConfig config, @NotNull final FontProvider fontProvider, @NotNull final String string, final float x, final float y, final boolean selected, final boolean isLink, final boolean isHovered) {
            Intrinsics.checkNotNullParameter((Object)config, "config");
            Intrinsics.checkNotNullParameter((Object)fontProvider, "fontProvider");
            Intrinsics.checkNotNullParameter((Object)string, "string");
            drawString$default(this, new UMatrixStack(), config, fontProvider, string, x, y, selected, isLink, isHovered, null, 512, null);
        }
        
        @java.lang.Deprecated
        public static /* synthetic */ void drawString$default(final Companion companion, final MarkdownConfig config, final FontProvider fontProvider, final String string, final float x, final float y, boolean selected, boolean isLink, boolean isHovered, final int n, final Object o) {
            if ((n & 0x20) != 0x0) {
                selected = false;
            }
            if ((n & 0x40) != 0x0) {
                isLink = false;
            }
            if ((n & 0x80) != 0x0) {
                isHovered = false;
            }
            companion.drawString(config, fontProvider, string, x, y, selected, isLink, isHovered);
        }
        
        public final void drawString(@NotNull final UMatrixStack matrixStack, @NotNull final MarkdownConfig config, @NotNull final FontProvider fontProvider, @NotNull final String string, final float x, final float y, final boolean selected, final boolean isLink, final boolean isHovered, @Nullable final HeaderLevelConfig headerConfig) {
            Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
            Intrinsics.checkNotNullParameter((Object)config, "config");
            Intrinsics.checkNotNullParameter((Object)fontProvider, "fontProvider");
            Intrinsics.checkNotNullParameter((Object)string, "string");
            if (selected) {
                UIBlock.Companion.drawBlockSized(matrixStack, config.getTextConfig().getSelectionBackgroundColor(), x, y, UtilitiesKt.width(string, 1.0f, fontProvider), 9.0);
            }
            final int foregroundColor = isLink ? config.getTextConfig().getLinkColor().getRGB() : (selected ? config.getTextConfig().getSelectionForegroundColor().getRGB() : ((headerConfig != null) ? headerConfig.getFontColor().getRGB() : config.getTextConfig().getColor().getRGB()));
            if (config.getTextConfig().getHasShadow()) {
                fontProvider.drawString(matrixStack, string, new Color(foregroundColor), x, y, 10.0f, 1.0f, true, new Color(config.getTextConfig().getShadowColor().getRGB()));
            }
            else {
                FontProvider.drawString$default(fontProvider, matrixStack, string, new Color(foregroundColor), x, y, 10.0f, 1.0f, false, null, 256, null);
            }
            if (isLink && isHovered) {
                UIBlock.Companion.drawBlockSized(matrixStack, config.getTextConfig().getLinkColor(), x, y + (double)8, UtilitiesKt.width$default(string, 0.0f, null, 3, null), 1.0);
            }
        }
        
        public static /* synthetic */ void drawString$default(final Companion companion, final UMatrixStack matrixStack, final MarkdownConfig config, final FontProvider fontProvider, final String string, final float x, final float y, boolean selected, boolean isLink, boolean isHovered, HeaderLevelConfig headerConfig, final int n, final Object o) {
            if ((n & 0x40) != 0x0) {
                selected = false;
            }
            if ((n & 0x80) != 0x0) {
                isLink = false;
            }
            if ((n & 0x100) != 0x0) {
                isHovered = false;
            }
            if ((n & 0x200) != 0x0) {
                headerConfig = null;
            }
            companion.drawString(matrixStack, config, fontProvider, string, x, y, selected, isLink, isHovered, headerConfig);
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
