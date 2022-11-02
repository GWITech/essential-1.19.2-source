package gg.essential.elementa.markdown.drawables;

import org.jetbrains.annotations.*;
import java.awt.*;
import gg.essential.elementa.utils.*;
import kotlin.collections.*;
import kotlin.*;
import gg.essential.elementa.markdown.*;
import gg.essential.universal.*;
import java.net.*;
import gg.essential.elementa.markdown.selection.*;
import java.util.*;
import kotlin.jvm.internal.*;
import kotlin.ranges.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.font.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J,\u0010%\u001a\u0006\u0012\u0002\b\u00030&2\u0006\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u00182\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u0016J\f\u0010-\u001a\u0006\u0012\u0002\b\u00030&H\u0016J\f\u0010.\u001a\u0006\u0012\u0002\b\u00030&H\u0016J\u0018\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016J \u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u00182\u0006\u00108\u001a\u00020\u00182\u0006\u00109\u001a\u00020\u0018H\u0014J\b\u0010:\u001a\u00020\u001dH\u0002J\b\u0010;\u001a\u00020,H\u0002J\u0010\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020*H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR(\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011@@X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\u0018@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010!R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\b8F¢\u0006\u0006\u001a\u0004\b$\u0010\n¨\u0006?" }, d2 = { "Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;", "Lgg/essential/elementa/markdown/drawables/Drawable;", "md", "Lgg/essential/elementa/markdown/MarkdownComponent;", "originalDrawables", "Lgg/essential/elementa/markdown/drawables/DrawableList;", "(Lgg/essential/elementa/markdown/MarkdownComponent;Lgg/essential/elementa/markdown/drawables/DrawableList;)V", "children", "", "getChildren", "()Ljava/util/List;", "drawables", "getDrawables$annotations", "()V", "getDrawables", "()Lgg/essential/elementa/markdown/drawables/DrawableList;", "value", "Lgg/essential/elementa/markdown/HeaderLevelConfig;", "headerConfig", "getHeaderConfig$Elementa", "()Lgg/essential/elementa/markdown/HeaderLevelConfig;", "setHeaderConfig$Elementa", "(Lgg/essential/elementa/markdown/HeaderLevelConfig;)V", "<set-?>", "", "maxTextLineWidth", "getMaxTextLineWidth", "()F", "rc", "Ljava/awt/Color;", "scaleModifier", "getScaleModifier", "setScaleModifier", "(F)V", "textDrawables", "Lgg/essential/elementa/markdown/drawables/TextDrawable;", "getTextDrawables", "cursorAt", "Lgg/essential/elementa/markdown/selection/Cursor;", "mouseX", "mouseY", "dragged", "", "mouseButton", "", "cursorAtEnd", "cursorAtStart", "draw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "state", "Lgg/essential/elementa/markdown/DrawState;", "layoutImpl", "Lgg/essential/elementa/markdown/drawables/Drawable$Layout;", "x", "y", "width", "randomColor", "randomComponent", "selectedText", "", "asMarkdown", "Elementa" })
public final class ParagraphDrawable extends Drawable
{
    @NotNull
    private final DrawableList originalDrawables;
    @NotNull
    @java.lang.Deprecated
    private final DrawableList drawables;
    private float maxTextLineWidth;
    @Nullable
    private HeaderLevelConfig headerConfig;
    private float scaleModifier;
    @NotNull
    private final Color rc;
    
    public ParagraphDrawable(@NotNull final MarkdownComponent md, @NotNull final DrawableList originalDrawables) {
        Intrinsics.checkNotNullParameter((Object)md, "md");
        Intrinsics.checkNotNullParameter((Object)originalDrawables, "originalDrawables");
        super(md);
        this.originalDrawables = originalDrawables;
        this.drawables = new DrawableList(md, this.originalDrawables);
        this.scaleModifier = 1.0f;
        this.originalDrawables.setParent(this);
        this.drawables.setParent(this);
        this.rc = ExtensionsKt.withAlpha(this.randomColor(), 100);
    }
    
    @NotNull
    @java.lang.Deprecated
    public final DrawableList getDrawables() {
        return this.drawables;
    }
    
    @Deprecated(message = "Use children instead", replaceWith = @ReplaceWith(expression = "children", imports = {}))
    @java.lang.Deprecated
    public static /* synthetic */ void getDrawables$annotations() {
    }
    
    @NotNull
    @Override
    public List<Drawable> getChildren() {
        return this.drawables;
    }
    
    @NotNull
    public final List<TextDrawable> getTextDrawables() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   gg/essential/elementa/markdown/drawables/ParagraphDrawable.getChildren:()Ljava/util/List;
        //     4: checkcast       Ljava/lang/Iterable;
        //     7: astore_1        /* $this$filterIsInstance$iv */
        //     8: iconst_0       
        //     9: istore_2        /* $i$f$filterIsInstance */
        //    10: aload_1         /* $this$filterIsInstance$iv */
        //    11: astore_3       
        //    12: new             Ljava/util/ArrayList;
        //    15: dup            
        //    16: invokespecial   java/util/ArrayList.<init>:()V
        //    19: checkcast       Ljava/util/Collection;
        //    22: astore          destination$iv$iv
        //    24: iconst_0       
        //    25: istore          $i$f$filterIsInstanceTo
        //    27: aload_3         /* $this$filterIsInstanceTo$iv$iv */
        //    28: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    33: astore          6
        //    35: aload           6
        //    37: invokeinterface java/util/Iterator.hasNext:()Z
        //    42: ifeq            75
        //    45: aload           6
        //    47: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    52: astore          element$iv$iv
        //    54: aload           element$iv$iv
        //    56: instanceof      Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //    59: ifeq            35
        //    62: aload           destination$iv$iv
        //    64: aload           element$iv$iv
        //    66: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    71: pop            
        //    72: goto            35
        //    75: aload           destination$iv$iv
        //    77: checkcast       Ljava/util/List;
        //    80: nop            
        //    81: areturn        
        //    Signature:
        //  ()Ljava/util/List<Lgg/essential/elementa/markdown/drawables/TextDrawable;>;
        //    StackMapTable: 00 02 FF 00 23 00 07 07 00 02 07 00 86 01 07 00 86 07 00 8C 01 07 00 92 00 00 27
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public final float getMaxTextLineWidth() {
        return this.maxTextLineWidth;
    }
    
    @Nullable
    public final HeaderLevelConfig getHeaderConfig$Elementa() {
        return this.headerConfig;
    }
    
    public final void setHeaderConfig$Elementa(@Nullable final HeaderLevelConfig value) {
        this.headerConfig = value;
        final Float n = (value == null) ? null : Float.valueOf(value.getTextScale());
        this.setScaleModifier((n == null) ? this.scaleModifier : ((float)n));
        final Iterable $this$forEach$iv = this.getTextDrawables();
        final int $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final TextDrawable it = (TextDrawable)element$iv;
            final int n2 = 0;
            it.setHeaderConfig$Elementa(value);
        }
    }
    
    public final float getScaleModifier() {
        return this.scaleModifier;
    }
    
    public final void setScaleModifier(final float value) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: fload_1         /* value */
        //     2: putfield        gg/essential/elementa/markdown/drawables/ParagraphDrawable.scaleModifier:F
        //     5: aload_0         /* this */
        //     6: getfield        gg/essential/elementa/markdown/drawables/ParagraphDrawable.drawables:Lgg/essential/elementa/markdown/drawables/DrawableList;
        //     9: checkcast       Ljava/lang/Iterable;
        //    12: astore_2        /* $this$filterIsInstance$iv */
        //    13: iconst_0       
        //    14: istore_3        /* $i$f$filterIsInstance */
        //    15: aload_2         /* $this$filterIsInstance$iv */
        //    16: astore          4
        //    18: new             Ljava/util/ArrayList;
        //    21: dup            
        //    22: invokespecial   java/util/ArrayList.<init>:()V
        //    25: checkcast       Ljava/util/Collection;
        //    28: astore          destination$iv$iv
        //    30: iconst_0       
        //    31: istore          $i$f$filterIsInstanceTo
        //    33: aload           $this$filterIsInstanceTo$iv$iv
        //    35: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    40: astore          7
        //    42: aload           7
        //    44: invokeinterface java/util/Iterator.hasNext:()Z
        //    49: ifeq            82
        //    52: aload           7
        //    54: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    59: astore          element$iv$iv
        //    61: aload           element$iv$iv
        //    63: instanceof      Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //    66: ifeq            42
        //    69: aload           destination$iv$iv
        //    71: aload           element$iv$iv
        //    73: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    78: pop            
        //    79: goto            42
        //    82: aload           destination$iv$iv
        //    84: checkcast       Ljava/util/List;
        //    87: nop            
        //    88: checkcast       Ljava/lang/Iterable;
        //    91: astore_2       
        //    92: nop            
        //    93: iconst_0       
        //    94: istore_3        /* $i$f$forEach */
        //    95: aload_2         /* $this$forEach$iv */
        //    96: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   101: astore          4
        //   103: aload           4
        //   105: invokeinterface java/util/Iterator.hasNext:()Z
        //   110: ifeq            142
        //   113: aload           4
        //   115: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   120: astore          element$iv
        //   122: aload           element$iv
        //   124: checkcast       Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //   127: astore          it
        //   129: iconst_0       
        //   130: istore          $i$a$-forEach-ParagraphDrawable$scaleModifier$1
        //   132: aload           it
        //   134: fload_1         /* value */
        //   135: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable.setScaleModifier:(F)V
        //   138: nop            
        //   139: goto            103
        //   142: nop            
        //   143: return         
        //    MethodParameters:
        //  Name   Flags  
        //  -----  -----
        //  value  
        //    StackMapTable: 00 04 FF 00 2A 00 08 07 00 02 02 07 00 86 01 07 00 86 07 00 8C 01 07 00 92 00 00 27 FF 00 14 00 06 07 00 02 02 07 00 86 01 07 00 92 07 00 C9 00 00 26
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    @Override
    protected Layout layoutImpl(final float x, final float y, final float width) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   gg/essential/elementa/markdown/drawables/ParagraphDrawable.getInsertSpaceBefore:()Z
        //     4: ifeq            20
        //     7: aload_0         /* this */
        //     8: invokevirtual   gg/essential/elementa/markdown/drawables/ParagraphDrawable.getConfig:()Lgg/essential/elementa/markdown/MarkdownConfig;
        //    11: invokevirtual   gg/essential/elementa/markdown/MarkdownConfig.getParagraphConfig:()Lgg/essential/elementa/markdown/ParagraphConfig;
        //    14: invokevirtual   gg/essential/elementa/markdown/ParagraphConfig.getSpaceBefore:()F
        //    17: goto            21
        //    20: fconst_0       
        //    21: fstore          marginTop
        //    23: aload_0         /* this */
        //    24: invokevirtual   gg/essential/elementa/markdown/drawables/ParagraphDrawable.getInsertSpaceAfter:()Z
        //    27: ifeq            43
        //    30: aload_0         /* this */
        //    31: invokevirtual   gg/essential/elementa/markdown/drawables/ParagraphDrawable.getConfig:()Lgg/essential/elementa/markdown/MarkdownConfig;
        //    34: invokevirtual   gg/essential/elementa/markdown/MarkdownConfig.getParagraphConfig:()Lgg/essential/elementa/markdown/ParagraphConfig;
        //    37: invokevirtual   gg/essential/elementa/markdown/ParagraphConfig.getSpaceAfter:()F
        //    40: goto            44
        //    43: fconst_0       
        //    44: fstore          marginBottom
        //    46: new             Ljava/util/ArrayList;
        //    49: dup            
        //    50: invokespecial   java/util/ArrayList.<init>:()V
        //    53: checkcast       Ljava/util/List;
        //    56: astore          newDrawables
        //    58: new             Lkotlin/jvm/internal/Ref$FloatRef;
        //    61: dup            
        //    62: invokespecial   kotlin/jvm/internal/Ref$FloatRef.<init>:()V
        //    65: astore          currX
        //    67: aload           currX
        //    69: fload_1         /* x */
        //    70: putfield        kotlin/jvm/internal/Ref$FloatRef.element:F
        //    73: new             Lkotlin/jvm/internal/Ref$FloatRef;
        //    76: dup            
        //    77: invokespecial   kotlin/jvm/internal/Ref$FloatRef.<init>:()V
        //    80: astore          currY
        //    82: aload           currY
        //    84: fload_2         /* y */
        //    85: fload           marginTop
        //    87: fadd           
        //    88: putfield        kotlin/jvm/internal/Ref$FloatRef.element:F
        //    91: new             Lkotlin/jvm/internal/Ref$FloatRef;
        //    94: dup            
        //    95: invokespecial   kotlin/jvm/internal/Ref$FloatRef.<init>:()V
        //    98: astore          widthRemaining
        //   100: aload           widthRemaining
        //   102: fload_3         /* width */
        //   103: putfield        kotlin/jvm/internal/Ref$FloatRef.element:F
        //   106: aload_0         /* this */
        //   107: invokevirtual   gg/essential/elementa/markdown/drawables/ParagraphDrawable.getConfig:()Lgg/essential/elementa/markdown/MarkdownConfig;
        //   110: invokevirtual   gg/essential/elementa/markdown/MarkdownConfig.getParagraphConfig:()Lgg/essential/elementa/markdown/ParagraphConfig;
        //   113: invokevirtual   gg/essential/elementa/markdown/ParagraphConfig.getCentered:()Z
        //   116: istore          centered
        //   118: new             Lkotlin/jvm/internal/Ref$BooleanRef;
        //   121: dup            
        //   122: invokespecial   kotlin/jvm/internal/Ref$BooleanRef.<init>:()V
        //   125: astore          trimNextText
        //   127: aload           trimNextText
        //   129: iconst_1       
        //   130: putfield        kotlin/jvm/internal/Ref$BooleanRef.element:Z
        //   133: new             Ljava/util/ArrayList;
        //   136: dup            
        //   137: invokespecial   java/util/ArrayList.<init>:()V
        //   140: checkcast       Ljava/util/List;
        //   143: astore          lines
        //   145: new             Ljava/util/ArrayList;
        //   148: dup            
        //   149: invokespecial   java/util/ArrayList.<init>:()V
        //   152: checkcast       Ljava/util/List;
        //   155: astore          currentLine
        //   157: new             Lkotlin/jvm/internal/Ref$FloatRef;
        //   160: dup            
        //   161: invokespecial   kotlin/jvm/internal/Ref$FloatRef.<init>:()V
        //   164: astore          maxLineHeight
        //   166: aload           maxLineHeight
        //   168: ldc             1.4E-45
        //   170: putfield        kotlin/jvm/internal/Ref$FloatRef.element:F
        //   173: new             Lkotlin/jvm/internal/Ref$FloatRef;
        //   176: dup            
        //   177: invokespecial   kotlin/jvm/internal/Ref$FloatRef.<init>:()V
        //   180: astore          prevY
        //   182: aload           prevY
        //   184: fload_2         /* y */
        //   185: putfield        kotlin/jvm/internal/Ref$FloatRef.element:F
        //   188: aload_0         /* this */
        //   189: getfield        gg/essential/elementa/markdown/drawables/ParagraphDrawable.originalDrawables:Lgg/essential/elementa/markdown/drawables/DrawableList;
        //   192: invokevirtual   gg/essential/elementa/markdown/drawables/DrawableList.iterator:()Ljava/util/Iterator;
        //   195: astore          16
        //   197: iconst_0       
        //   198: istore          17
        //   200: aload           16
        //   202: invokeinterface java/util/Iterator.hasNext:()Z
        //   207: ifeq            1249
        //   210: iload           17
        //   212: istore          index
        //   214: iload           17
        //   216: iconst_1       
        //   217: iadd           
        //   218: istore          17
        //   220: aload           16
        //   222: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   227: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //   230: astore          text
        //   232: aload           text
        //   234: instanceof      Lgg/essential/elementa/markdown/drawables/SoftBreakDrawable;
        //   237: ifne            248
        //   240: aload           text
        //   242: instanceof      Lgg/essential/elementa/markdown/drawables/HardBreakDrawable;
        //   245: ifeq            695
        //   248: aload_0         /* this */
        //   249: invokevirtual   gg/essential/elementa/markdown/drawables/ParagraphDrawable.getConfig:()Lgg/essential/elementa/markdown/MarkdownConfig;
        //   252: invokevirtual   gg/essential/elementa/markdown/MarkdownConfig.getParagraphConfig:()Lgg/essential/elementa/markdown/ParagraphConfig;
        //   255: invokevirtual   gg/essential/elementa/markdown/ParagraphConfig.getSoftBreakIsNewline:()Z
        //   258: ifne            269
        //   261: aload           text
        //   263: instanceof      Lgg/essential/elementa/markdown/drawables/HardBreakDrawable;
        //   266: ifeq            294
        //   269: aload           prevY
        //   271: aload           currY
        //   273: aload           currX
        //   275: fload_1         /* x */
        //   276: aload           maxLineHeight
        //   278: aload_0         /* this */
        //   279: aload           currentLine
        //   281: aload           widthRemaining
        //   283: fload_3         /* width */
        //   284: aload           lines
        //   286: aload           trimNextText
        //   288: invokestatic    gg/essential/elementa/markdown/drawables/ParagraphDrawable.layoutImpl$gotoNextLine:(Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;FLkotlin/jvm/internal/Ref$FloatRef;Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;Ljava/util/List;Lkotlin/jvm/internal/Ref$FloatRef;FLjava/util/List;Lkotlin/jvm/internal/Ref$BooleanRef;)V
        //   291: goto            692
        //   294: aload           newDrawables
        //   296: astore          $this$lastOrNull$iv
        //   298: iconst_0       
        //   299: istore          $i$f$lastOrNull
        //   301: aload           $this$lastOrNull$iv
        //   303: aload           $this$lastOrNull$iv
        //   305: invokeinterface java/util/List.size:()I
        //   310: invokeinterface java/util/List.listIterator:(I)Ljava/util/ListIterator;
        //   315: astore          iterator$iv
        //   317: aload           iterator$iv
        //   319: invokeinterface java/util/ListIterator.hasPrevious:()Z
        //   324: ifeq            362
        //   327: aload           iterator$iv
        //   329: invokeinterface java/util/ListIterator.previous:()Ljava/lang/Object;
        //   334: astore          element$iv
        //   336: aload           element$iv
        //   338: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //   341: astore          it
        //   343: iconst_0       
        //   344: istore          $i$a$-lastOrNull-ParagraphDrawable$layoutImpl$previousStyle$1
        //   346: aload           it
        //   348: instanceof      Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //   351: ifeq            359
        //   354: aload           element$iv
        //   356: goto            363
        //   359: goto            317
        //   362: aconst_null    
        //   363: astore          23
        //   365: aload           23
        //   367: instanceof      Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //   370: ifeq            381
        //   373: aload           23
        //   375: checkcast       Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //   378: goto            382
        //   381: aconst_null    
        //   382: dup            
        //   383: ifnonnull       391
        //   386: pop            
        //   387: aconst_null    
        //   388: goto            414
        //   391: astore          it
        //   393: iconst_0       
        //   394: istore          $i$a$-let-ParagraphDrawable$layoutImpl$previousStyle$2
        //   396: aload           it
        //   398: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable.getStyle:()Lgg/essential/elementa/markdown/drawables/TextDrawable$Style;
        //   401: iconst_0       
        //   402: iconst_0       
        //   403: iconst_0       
        //   404: iconst_0       
        //   405: iconst_0       
        //   406: aconst_null    
        //   407: bipush          47
        //   409: aconst_null    
        //   410: invokestatic    gg/essential/elementa/markdown/drawables/TextDrawable$Style.copy$default:(Lgg/essential/elementa/markdown/drawables/TextDrawable$Style;ZZZZZLjava/lang/String;ILjava/lang/Object;)Lgg/essential/elementa/markdown/drawables/TextDrawable$Style;
        //   413: nop            
        //   414: astore          21
        //   416: aload           21
        //   418: ifnonnull       430
        //   421: getstatic       gg/essential/elementa/markdown/drawables/TextDrawable$Style.Companion:Lgg/essential/elementa/markdown/drawables/TextDrawable$Style$Companion;
        //   424: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable$Style$Companion.getEMPTY:()Lgg/essential/elementa/markdown/drawables/TextDrawable$Style;
        //   427: goto            432
        //   430: aload           21
        //   432: astore          previousStyle
        //   434: new             Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //   437: dup            
        //   438: aload_0         /* this */
        //   439: invokevirtual   gg/essential/elementa/markdown/drawables/ParagraphDrawable.getMd:()Lgg/essential/elementa/markdown/MarkdownComponent;
        //   442: ldc_w           " "
        //   445: aload           previousStyle
        //   447: invokespecial   gg/essential/elementa/markdown/drawables/TextDrawable.<init>:(Lgg/essential/elementa/markdown/MarkdownComponent;Ljava/lang/String;Lgg/essential/elementa/markdown/drawables/TextDrawable$Style;)V
        //   450: astore          newText
        //   452: aload           newDrawables
        //   454: checkcast       Ljava/util/Collection;
        //   457: invokeinterface java/util/Collection.isEmpty:()Z
        //   462: ifne            469
        //   465: iconst_1       
        //   466: goto            470
        //   469: iconst_0       
        //   470: ifeq            627
        //   473: iload           index
        //   475: aload_0         /* this */
        //   476: getfield        gg/essential/elementa/markdown/drawables/ParagraphDrawable.originalDrawables:Lgg/essential/elementa/markdown/drawables/DrawableList;
        //   479: checkcast       Ljava/util/List;
        //   482: invokestatic    kotlin/collections/CollectionsKt.getLastIndex:(Ljava/util/List;)I
        //   485: if_icmpeq       627
        //   488: aload           newDrawables
        //   490: invokestatic    kotlin/collections/CollectionsKt.last:(Ljava/util/List;)Ljava/lang/Object;
        //   493: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //   496: astore          previous
        //   498: aload_0         /* this */
        //   499: getfield        gg/essential/elementa/markdown/drawables/ParagraphDrawable.originalDrawables:Lgg/essential/elementa/markdown/drawables/DrawableList;
        //   502: iload           index
        //   504: iconst_1       
        //   505: iadd           
        //   506: invokevirtual   gg/essential/elementa/markdown/drawables/DrawableList.get:(I)Lgg/essential/elementa/markdown/drawables/Drawable;
        //   509: astore          next
        //   511: aload           previous
        //   513: instanceof      Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //   516: ifeq            627
        //   519: aload           next
        //   521: instanceof      Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //   524: ifeq            627
        //   527: aload           previous
        //   529: checkcast       Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //   532: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable.getStyle:()Lgg/essential/elementa/markdown/drawables/TextDrawable$Style;
        //   535: aload           next
        //   537: checkcast       Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //   540: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable.getStyle:()Lgg/essential/elementa/markdown/drawables/TextDrawable$Style;
        //   543: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   546: ifeq            627
        //   549: getstatic       gg/essential/elementa/markdown/drawables/TextDrawable$LinkedTexts.Companion:Lgg/essential/elementa/markdown/drawables/TextDrawable$LinkedTexts$Companion;
        //   552: aload           previous
        //   554: checkcast       Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //   557: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable.getLinkedTexts:()Lgg/essential/elementa/markdown/drawables/TextDrawable$LinkedTexts;
        //   560: aload           next
        //   562: checkcast       Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //   565: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable.getLinkedTexts:()Lgg/essential/elementa/markdown/drawables/TextDrawable$LinkedTexts;
        //   568: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable$LinkedTexts$Companion.merge:(Lgg/essential/elementa/markdown/drawables/TextDrawable$LinkedTexts;Lgg/essential/elementa/markdown/drawables/TextDrawable$LinkedTexts;)Lgg/essential/elementa/markdown/drawables/TextDrawable$LinkedTexts;
        //   571: astore          linkedTexts
        //   573: aload           linkedTexts
        //   575: aload           previous
        //   577: checkcast       Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //   580: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable$LinkedTexts.linkText:(Lgg/essential/elementa/markdown/drawables/TextDrawable;)V
        //   583: aload           linkedTexts
        //   585: aload           newText
        //   587: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable$LinkedTexts.linkText:(Lgg/essential/elementa/markdown/drawables/TextDrawable;)V
        //   590: aload           linkedTexts
        //   592: aload           next
        //   594: checkcast       Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //   597: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable$LinkedTexts.linkText:(Lgg/essential/elementa/markdown/drawables/TextDrawable;)V
        //   600: aload           previous
        //   602: checkcast       Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //   605: aload           linkedTexts
        //   607: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable.setLinkedTexts:(Lgg/essential/elementa/markdown/drawables/TextDrawable$LinkedTexts;)V
        //   610: aload           newText
        //   612: aload           linkedTexts
        //   614: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable.setLinkedTexts:(Lgg/essential/elementa/markdown/drawables/TextDrawable$LinkedTexts;)V
        //   617: aload           next
        //   619: checkcast       Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //   622: aload           linkedTexts
        //   624: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable.setLinkedTexts:(Lgg/essential/elementa/markdown/drawables/TextDrawable$LinkedTexts;)V
        //   627: aload           trimNextText
        //   629: aload           currX
        //   631: aload           currY
        //   633: aload           widthRemaining
        //   635: aload           currentLine
        //   637: aload           newDrawables
        //   639: aload           maxLineHeight
        //   641: aload           newText
        //   643: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //   646: aload           newText
        //   648: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable.width:()F
        //   651: invokestatic    gg/essential/elementa/markdown/drawables/ParagraphDrawable.layoutImpl$layout:(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/Ref$FloatRef;Lgg/essential/elementa/markdown/drawables/Drawable;F)V
        //   654: aload           widthRemaining
        //   656: getfield        kotlin/jvm/internal/Ref$FloatRef.element:F
        //   659: fconst_0       
        //   660: fcmpg          
        //   661: ifgt            686
        //   664: aload           prevY
        //   666: aload           currY
        //   668: aload           currX
        //   670: fload_1         /* x */
        //   671: aload           maxLineHeight
        //   673: aload_0         /* this */
        //   674: aload           currentLine
        //   676: aload           widthRemaining
        //   678: fload_3         /* width */
        //   679: aload           lines
        //   681: aload           trimNextText
        //   683: invokestatic    gg/essential/elementa/markdown/drawables/ParagraphDrawable.layoutImpl$gotoNextLine:(Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;FLkotlin/jvm/internal/Ref$FloatRef;Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;Ljava/util/List;Lkotlin/jvm/internal/Ref$FloatRef;FLjava/util/List;Lkotlin/jvm/internal/Ref$BooleanRef;)V
        //   686: aload           trimNextText
        //   688: iconst_1       
        //   689: putfield        kotlin/jvm/internal/Ref$BooleanRef.element:Z
        //   692: goto            200
        //   695: aload           text
        //   697: instanceof      Lgg/essential/elementa/markdown/drawables/ImageDrawable;
        //   700: ifeq            770
        //   703: aload           prevY
        //   705: aload           currY
        //   707: aload           currX
        //   709: fload_1         /* x */
        //   710: aload           maxLineHeight
        //   712: aload_0         /* this */
        //   713: aload           currentLine
        //   715: aload           widthRemaining
        //   717: fload_3         /* width */
        //   718: aload           lines
        //   720: aload           trimNextText
        //   722: invokestatic    gg/essential/elementa/markdown/drawables/ParagraphDrawable.layoutImpl$gotoNextLine:(Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;FLkotlin/jvm/internal/Ref$FloatRef;Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;Ljava/util/List;Lkotlin/jvm/internal/Ref$FloatRef;FLjava/util/List;Lkotlin/jvm/internal/Ref$BooleanRef;)V
        //   725: aload           trimNextText
        //   727: aload           currX
        //   729: aload           currY
        //   731: aload           widthRemaining
        //   733: aload           currentLine
        //   735: aload           newDrawables
        //   737: aload           maxLineHeight
        //   739: aload           text
        //   741: fload_3         /* width */
        //   742: invokestatic    gg/essential/elementa/markdown/drawables/ParagraphDrawable.layoutImpl$layout:(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/Ref$FloatRef;Lgg/essential/elementa/markdown/drawables/Drawable;F)V
        //   745: aload           prevY
        //   747: aload           currY
        //   749: aload           currX
        //   751: fload_1         /* x */
        //   752: aload           maxLineHeight
        //   754: aload_0         /* this */
        //   755: aload           currentLine
        //   757: aload           widthRemaining
        //   759: fload_3         /* width */
        //   760: aload           lines
        //   762: aload           trimNextText
        //   764: invokestatic    gg/essential/elementa/markdown/drawables/ParagraphDrawable.layoutImpl$gotoNextLine:(Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;FLkotlin/jvm/internal/Ref$FloatRef;Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;Ljava/util/List;Lkotlin/jvm/internal/Ref$FloatRef;FLjava/util/List;Lkotlin/jvm/internal/Ref$BooleanRef;)V
        //   767: goto            200
        //   770: aload           text
        //   772: instanceof      Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //   775: ifne            792
        //   778: new             Lkotlin/NotImplementedError;
        //   781: dup            
        //   782: aconst_null    
        //   783: iconst_1       
        //   784: aconst_null    
        //   785: invokespecial   kotlin/NotImplementedError.<init>:(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   788: checkcast       Ljava/lang/Throwable;
        //   791: athrow         
        //   792: aload           text
        //   794: checkcast       Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //   797: astore          target
        //   799: nop            
        //   800: aload           target
        //   802: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable.width:()F
        //   805: fstore          targetWidth
        //   807: fload           targetWidth
        //   809: aload           widthRemaining
        //   811: getfield        kotlin/jvm/internal/Ref$FloatRef.element:F
        //   814: fcmpg          
        //   815: ifgt            877
        //   818: aload           trimNextText
        //   820: aload           currX
        //   822: aload           currY
        //   824: aload           widthRemaining
        //   826: aload           currentLine
        //   828: aload           newDrawables
        //   830: aload           maxLineHeight
        //   832: aload           target
        //   834: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //   837: fload           targetWidth
        //   839: invokestatic    gg/essential/elementa/markdown/drawables/ParagraphDrawable.layoutImpl$layout:(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/Ref$FloatRef;Lgg/essential/elementa/markdown/drawables/Drawable;F)V
        //   842: aload           widthRemaining
        //   844: getfield        kotlin/jvm/internal/Ref$FloatRef.element:F
        //   847: fconst_0       
        //   848: fcmpg          
        //   849: ifgt            874
        //   852: aload           prevY
        //   854: aload           currY
        //   856: aload           currX
        //   858: fload_1         /* x */
        //   859: aload           maxLineHeight
        //   861: aload_0         /* this */
        //   862: aload           currentLine
        //   864: aload           widthRemaining
        //   866: fload_3         /* width */
        //   867: aload           lines
        //   869: aload           trimNextText
        //   871: invokestatic    gg/essential/elementa/markdown/drawables/ParagraphDrawable.layoutImpl$gotoNextLine:(Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;FLkotlin/jvm/internal/Ref$FloatRef;Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;Ljava/util/List;Lkotlin/jvm/internal/Ref$FloatRef;FLjava/util/List;Lkotlin/jvm/internal/Ref$BooleanRef;)V
        //   874: goto            200
        //   877: aload           target
        //   879: aload           widthRemaining
        //   881: getfield        kotlin/jvm/internal/Ref$FloatRef.element:F
        //   884: iconst_0       
        //   885: iconst_2       
        //   886: aconst_null    
        //   887: invokestatic    gg/essential/elementa/markdown/drawables/TextDrawable.split$default:(Lgg/essential/elementa/markdown/drawables/TextDrawable;FZILjava/lang/Object;)Lkotlin/Pair;
        //   890: astore          splitResult
        //   892: aload           splitResult
        //   894: ifnull          959
        //   897: aload           trimNextText
        //   899: aload           currX
        //   901: aload           currY
        //   903: aload           widthRemaining
        //   905: aload           currentLine
        //   907: aload           newDrawables
        //   909: aload           maxLineHeight
        //   911: aload           splitResult
        //   913: invokevirtual   kotlin/Pair.getFirst:()Ljava/lang/Object;
        //   916: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //   919: fload           targetWidth
        //   921: invokestatic    gg/essential/elementa/markdown/drawables/ParagraphDrawable.layoutImpl$layout:(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/Ref$FloatRef;Lgg/essential/elementa/markdown/drawables/Drawable;F)V
        //   924: aload           prevY
        //   926: aload           currY
        //   928: aload           currX
        //   930: fload_1         /* x */
        //   931: aload           maxLineHeight
        //   933: aload_0         /* this */
        //   934: aload           currentLine
        //   936: aload           widthRemaining
        //   938: fload_3         /* width */
        //   939: aload           lines
        //   941: aload           trimNextText
        //   943: invokestatic    gg/essential/elementa/markdown/drawables/ParagraphDrawable.layoutImpl$gotoNextLine:(Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;FLkotlin/jvm/internal/Ref$FloatRef;Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;Ljava/util/List;Lkotlin/jvm/internal/Ref$FloatRef;FLjava/util/List;Lkotlin/jvm/internal/Ref$BooleanRef;)V
        //   946: aload           splitResult
        //   948: invokevirtual   kotlin/Pair.getSecond:()Ljava/lang/Object;
        //   951: checkcast       Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //   954: astore          target
        //   956: goto            799
        //   959: aload           currentLine
        //   961: checkcast       Ljava/util/Collection;
        //   964: invokeinterface java/util/Collection.isEmpty:()Z
        //   969: ifne            976
        //   972: iconst_1       
        //   973: goto            977
        //   976: iconst_0       
        //   977: ifeq            1002
        //   980: aload           prevY
        //   982: aload           currY
        //   984: aload           currX
        //   986: fload_1         /* x */
        //   987: aload           maxLineHeight
        //   989: aload_0         /* this */
        //   990: aload           currentLine
        //   992: aload           widthRemaining
        //   994: fload_3         /* width */
        //   995: aload           lines
        //   997: aload           trimNextText
        //   999: invokestatic    gg/essential/elementa/markdown/drawables/ParagraphDrawable.layoutImpl$gotoNextLine:(Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;FLkotlin/jvm/internal/Ref$FloatRef;Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;Ljava/util/List;Lkotlin/jvm/internal/Ref$FloatRef;FLjava/util/List;Lkotlin/jvm/internal/Ref$BooleanRef;)V
        //  1002: fload           targetWidth
        //  1004: fload_3         /* width */
        //  1005: fcmpl          
        //  1006: ifle            1221
        //  1009: aload           target
        //  1011: fload_3         /* width */
        //  1012: iconst_0       
        //  1013: iconst_2       
        //  1014: aconst_null    
        //  1015: invokestatic    gg/essential/elementa/markdown/drawables/TextDrawable.split$default:(Lgg/essential/elementa/markdown/drawables/TextDrawable;FZILjava/lang/Object;)Lkotlin/Pair;
        //  1018: astore          splitResult2
        //  1020: aload           splitResult2
        //  1022: ifnonnull       1150
        //  1025: aload           target
        //  1027: fload_3         /* width */
        //  1028: iconst_1       
        //  1029: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable.split:(FZ)Lkotlin/Pair;
        //  1032: dup            
        //  1033: ifnonnull       1077
        //  1036: pop            
        //  1037: new             Ljava/lang/IllegalStateException;
        //  1040: dup            
        //  1041: new             Ljava/lang/StringBuilder;
        //  1044: dup            
        //  1045: invokespecial   java/lang/StringBuilder.<init>:()V
        //  1048: ldc_w           "MarkdownComponent's width ("
        //  1051: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1054: aload_0         /* this */
        //  1055: invokevirtual   gg/essential/elementa/markdown/drawables/ParagraphDrawable.getMd:()Lgg/essential/elementa/markdown/MarkdownComponent;
        //  1058: invokevirtual   gg/essential/elementa/markdown/MarkdownComponent.getWidth:()F
        //  1061: invokevirtual   java/lang/StringBuilder.append:(F)Ljava/lang/StringBuilder;
        //  1064: ldc_w           ") is too small to render its content"
        //  1067: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //  1070: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //  1073: invokespecial   java/lang/IllegalStateException.<init>:(Ljava/lang/String;)V
        //  1076: athrow         
        //  1077: astore          splitResult3
        //  1079: aload           trimNextText
        //  1081: aload           currX
        //  1083: aload           currY
        //  1085: aload           widthRemaining
        //  1087: aload           currentLine
        //  1089: aload           newDrawables
        //  1091: aload           maxLineHeight
        //  1093: aload           splitResult3
        //  1095: invokevirtual   kotlin/Pair.getFirst:()Ljava/lang/Object;
        //  1098: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //  1101: aload           splitResult3
        //  1103: invokevirtual   kotlin/Pair.getFirst:()Ljava/lang/Object;
        //  1106: checkcast       Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //  1109: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable.width:()F
        //  1112: invokestatic    gg/essential/elementa/markdown/drawables/ParagraphDrawable.layoutImpl$layout:(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/Ref$FloatRef;Lgg/essential/elementa/markdown/drawables/Drawable;F)V
        //  1115: aload           prevY
        //  1117: aload           currY
        //  1119: aload           currX
        //  1121: fload_1         /* x */
        //  1122: aload           maxLineHeight
        //  1124: aload_0         /* this */
        //  1125: aload           currentLine
        //  1127: aload           widthRemaining
        //  1129: fload_3         /* width */
        //  1130: aload           lines
        //  1132: aload           trimNextText
        //  1134: invokestatic    gg/essential/elementa/markdown/drawables/ParagraphDrawable.layoutImpl$gotoNextLine:(Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;FLkotlin/jvm/internal/Ref$FloatRef;Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;Ljava/util/List;Lkotlin/jvm/internal/Ref$FloatRef;FLjava/util/List;Lkotlin/jvm/internal/Ref$BooleanRef;)V
        //  1137: aload           splitResult3
        //  1139: invokevirtual   kotlin/Pair.getSecond:()Ljava/lang/Object;
        //  1142: checkcast       Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //  1145: astore          target
        //  1147: goto            799
        //  1150: aload           trimNextText
        //  1152: aload           currX
        //  1154: aload           currY
        //  1156: aload           widthRemaining
        //  1158: aload           currentLine
        //  1160: aload           newDrawables
        //  1162: aload           maxLineHeight
        //  1164: aload           splitResult2
        //  1166: invokevirtual   kotlin/Pair.getFirst:()Ljava/lang/Object;
        //  1169: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //  1172: aload           splitResult2
        //  1174: invokevirtual   kotlin/Pair.getFirst:()Ljava/lang/Object;
        //  1177: checkcast       Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //  1180: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable.width:()F
        //  1183: invokestatic    gg/essential/elementa/markdown/drawables/ParagraphDrawable.layoutImpl$layout:(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/Ref$FloatRef;Lgg/essential/elementa/markdown/drawables/Drawable;F)V
        //  1186: aload           prevY
        //  1188: aload           currY
        //  1190: aload           currX
        //  1192: fload_1         /* x */
        //  1193: aload           maxLineHeight
        //  1195: aload_0         /* this */
        //  1196: aload           currentLine
        //  1198: aload           widthRemaining
        //  1200: fload_3         /* width */
        //  1201: aload           lines
        //  1203: aload           trimNextText
        //  1205: invokestatic    gg/essential/elementa/markdown/drawables/ParagraphDrawable.layoutImpl$gotoNextLine:(Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;FLkotlin/jvm/internal/Ref$FloatRef;Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;Ljava/util/List;Lkotlin/jvm/internal/Ref$FloatRef;FLjava/util/List;Lkotlin/jvm/internal/Ref$BooleanRef;)V
        //  1208: aload           splitResult2
        //  1210: invokevirtual   kotlin/Pair.getSecond:()Ljava/lang/Object;
        //  1213: checkcast       Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //  1216: astore          target
        //  1218: goto            799
        //  1221: aload           trimNextText
        //  1223: aload           currX
        //  1225: aload           currY
        //  1227: aload           widthRemaining
        //  1229: aload           currentLine
        //  1231: aload           newDrawables
        //  1233: aload           maxLineHeight
        //  1235: aload           target
        //  1237: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //  1240: fload           targetWidth
        //  1242: invokestatic    gg/essential/elementa/markdown/drawables/ParagraphDrawable.layoutImpl$layout:(Lkotlin/jvm/internal/Ref$BooleanRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Lkotlin/jvm/internal/Ref$FloatRef;Ljava/util/List;Ljava/util/List;Lkotlin/jvm/internal/Ref$FloatRef;Lgg/essential/elementa/markdown/drawables/Drawable;F)V
        //  1245: nop            
        //  1246: goto            200
        //  1249: aload           currentLine
        //  1251: checkcast       Ljava/util/Collection;
        //  1254: invokeinterface java/util/Collection.isEmpty:()Z
        //  1259: ifne            1266
        //  1262: iconst_1       
        //  1263: goto            1267
        //  1266: iconst_0       
        //  1267: ifeq            1286
        //  1270: aload           lines
        //  1272: aload           currentLine
        //  1274: checkcast       Ljava/lang/Iterable;
        //  1277: invokestatic    kotlin/collections/CollectionsKt.toList:(Ljava/lang/Iterable;)Ljava/util/List;
        //  1280: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //  1285: pop            
        //  1286: iload           centered
        //  1288: ifeq            1501
        //  1291: aload           lines
        //  1293: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1298: astore          16
        //  1300: aload           16
        //  1302: invokeinterface java/util/Iterator.hasNext:()Z
        //  1307: ifeq            1501
        //  1310: aload           16
        //  1312: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1317: checkcast       Ljava/util/List;
        //  1320: astore          line
        //  1322: aload           line
        //  1324: checkcast       Ljava/lang/Iterable;
        //  1327: astore          19
        //  1329: iconst_0       
        //  1330: i2d            
        //  1331: dstore          20
        //  1333: aload           19
        //  1335: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  1340: astore          22
        //  1342: aload           22
        //  1344: invokeinterface java/util/Iterator.hasNext:()Z
        //  1349: ifeq            1441
        //  1352: aload           22
        //  1354: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1359: astore          23
        //  1361: dload           20
        //  1363: aload           23
        //  1365: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //  1368: astore          24
        //  1370: dstore          43
        //  1372: iconst_0       
        //  1373: istore          $i$a$-sumOfDouble-ParagraphDrawable$layoutImpl$totalWidth$1
        //  1375: aload           it
        //  1377: instanceof      Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //  1380: ifeq            1391
        //  1383: aload           it
        //  1385: checkcast       Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //  1388: goto            1392
        //  1391: aconst_null    
        //  1392: dup            
        //  1393: ifnonnull       1401
        //  1396: pop            
        //  1397: aconst_null    
        //  1398: goto            1412
        //  1401: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable.width:()F
        //  1404: fstore          27
        //  1406: fload           27
        //  1408: f2d            
        //  1409: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  1412: dup            
        //  1413: ifnonnull       1426
        //  1416: pop            
        //  1417: aload           it
        //  1419: invokevirtual   gg/essential/elementa/markdown/drawables/Drawable.getWidth:()F
        //  1422: f2d            
        //  1423: goto            1429
        //  1426: invokevirtual   java/lang/Double.doubleValue:()D
        //  1429: dstore          45
        //  1431: dload           43
        //  1433: dload           45
        //  1435: dadd           
        //  1436: dstore          20
        //  1438: goto            1342
        //  1441: dload           20
        //  1443: d2f            
        //  1444: fstore          totalWidth
        //  1446: fload_3         /* width */
        //  1447: fload           totalWidth
        //  1449: fsub           
        //  1450: fconst_2       
        //  1451: fdiv           
        //  1452: fstore          shift
        //  1454: aload           line
        //  1456: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //  1461: astore          20
        //  1463: aload           20
        //  1465: invokeinterface java/util/Iterator.hasNext:()Z
        //  1470: ifeq            1300
        //  1473: aload           20
        //  1475: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1480: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //  1483: astore          text
        //  1485: aload           text
        //  1487: aload           text
        //  1489: invokevirtual   gg/essential/elementa/markdown/drawables/Drawable.getX:()F
        //  1492: fload           shift
        //  1494: fadd           
        //  1495: invokevirtual   gg/essential/elementa/markdown/drawables/Drawable.setX:(F)V
        //  1498: goto            1463
        //  1501: aload_0         /* this */
        //  1502: aload           lines
        //  1504: checkcast       Ljava/lang/Iterable;
        //  1507: astore          17
        //  1509: astore          43
        //  1511: aload           17
        //  1513: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  1518: astore          18
        //  1520: aload           18
        //  1522: invokeinterface java/util/Iterator.hasNext:()Z
        //  1527: ifne            1534
        //  1530: aconst_null    
        //  1531: goto            1839
        //  1534: aload           18
        //  1536: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1541: checkcast       Ljava/util/List;
        //  1544: astore          line
        //  1546: iconst_0       
        //  1547: istore          $i$a$-maxOfOrNull-ParagraphDrawable$layoutImpl$1
        //  1549: aload           line
        //  1551: checkcast       Ljava/lang/Iterable;
        //  1554: astore          21
        //  1556: iconst_0       
        //  1557: i2d            
        //  1558: dstore          22
        //  1560: aload           21
        //  1562: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  1567: astore          24
        //  1569: aload           24
        //  1571: invokeinterface java/util/Iterator.hasNext:()Z
        //  1576: ifeq            1668
        //  1579: aload           24
        //  1581: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1586: astore          25
        //  1588: dload           22
        //  1590: aload           25
        //  1592: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //  1595: astore          26
        //  1597: dstore          27
        //  1599: iconst_0       
        //  1600: istore          $i$a$-sumOfDouble-ParagraphDrawable$layoutImpl$1$1
        //  1602: aload           it
        //  1604: instanceof      Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //  1607: ifeq            1618
        //  1610: aload           it
        //  1612: checkcast       Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //  1615: goto            1619
        //  1618: aconst_null    
        //  1619: dup            
        //  1620: ifnonnull       1628
        //  1623: pop            
        //  1624: aconst_null    
        //  1625: goto            1639
        //  1628: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable.width:()F
        //  1631: fstore          31
        //  1633: fload           31
        //  1635: f2d            
        //  1636: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  1639: dup            
        //  1640: ifnonnull       1653
        //  1643: pop            
        //  1644: aload           it
        //  1646: invokevirtual   gg/essential/elementa/markdown/drawables/Drawable.getWidth:()F
        //  1649: f2d            
        //  1650: goto            1656
        //  1653: invokevirtual   java/lang/Double.doubleValue:()D
        //  1656: dstore          33
        //  1658: dload           27
        //  1660: dload           33
        //  1662: dadd           
        //  1663: dstore          22
        //  1665: goto            1569
        //  1668: dload           22
        //  1670: d2f            
        //  1671: fstore          null
        //  1673: aload           18
        //  1675: invokeinterface java/util/Iterator.hasNext:()Z
        //  1680: ifeq            1834
        //  1683: aload           18
        //  1685: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1690: checkcast       Ljava/util/List;
        //  1693: astore          line
        //  1695: iconst_0       
        //  1696: istore          $i$a$-maxOfOrNull-ParagraphDrawable$layoutImpl$1
        //  1698: aload           line
        //  1700: checkcast       Ljava/lang/Iterable;
        //  1703: astore          35
        //  1705: iconst_0       
        //  1706: i2d            
        //  1707: dstore          36
        //  1709: aload           35
        //  1711: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  1716: astore          25
        //  1718: aload           25
        //  1720: invokeinterface java/util/Iterator.hasNext:()Z
        //  1725: ifeq            1817
        //  1728: aload           25
        //  1730: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1735: astore          26
        //  1737: dload           36
        //  1739: aload           26
        //  1741: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //  1744: astore          38
        //  1746: dstore          39
        //  1748: iconst_0       
        //  1749: istore          $i$a$-sumOfDouble-ParagraphDrawable$layoutImpl$1$1
        //  1751: aload           it
        //  1753: instanceof      Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //  1756: ifeq            1767
        //  1759: aload           it
        //  1761: checkcast       Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //  1764: goto            1768
        //  1767: aconst_null    
        //  1768: dup            
        //  1769: ifnonnull       1777
        //  1772: pop            
        //  1773: aconst_null    
        //  1774: goto            1788
        //  1777: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable.width:()F
        //  1780: fstore          32
        //  1782: fload           32
        //  1784: f2d            
        //  1785: invokestatic    java/lang/Double.valueOf:(D)Ljava/lang/Double;
        //  1788: dup            
        //  1789: ifnonnull       1802
        //  1792: pop            
        //  1793: aload           it
        //  1795: invokevirtual   gg/essential/elementa/markdown/drawables/Drawable.getWidth:()F
        //  1798: f2d            
        //  1799: goto            1805
        //  1802: invokevirtual   java/lang/Double.doubleValue:()D
        //  1805: dstore          41
        //  1807: dload           39
        //  1809: dload           41
        //  1811: dadd           
        //  1812: dstore          36
        //  1814: goto            1718
        //  1817: dload           36
        //  1819: d2f            
        //  1820: fstore          null
        //  1822: fload           19
        //  1824: fload           20
        //  1826: invokestatic    java/lang/Math.max:(FF)F
        //  1829: fstore          19
        //  1831: goto            1673
        //  1834: fload           19
        //  1836: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1839: aload           43
        //  1841: swap           
        //  1842: astore          16
        //  1844: aload           16
        //  1846: ifnonnull       1853
        //  1849: fconst_0       
        //  1850: goto            1858
        //  1853: aload           16
        //  1855: invokevirtual   java/lang/Float.floatValue:()F
        //  1858: putfield        gg/essential/elementa/markdown/drawables/ParagraphDrawable.maxTextLineWidth:F
        //  1861: aload           newDrawables
        //  1863: checkcast       Ljava/lang/Iterable;
        //  1866: astore          $this$forEach$iv
        //  1868: iconst_0       
        //  1869: istore          $i$f$forEach
        //  1871: aload           $this$forEach$iv
        //  1873: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  1878: astore          18
        //  1880: aload           18
        //  1882: invokeinterface java/util/Iterator.hasNext:()Z
        //  1887: ifeq            1933
        //  1890: aload           18
        //  1892: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1897: astore          element$iv
        //  1899: aload           element$iv
        //  1901: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //  1904: astore          it
        //  1906: iconst_0       
        //  1907: istore          $i$a$-forEach-ParagraphDrawable$layoutImpl$2
        //  1909: aload           it
        //  1911: instanceof      Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //  1914: ifeq            1929
        //  1917: aload           it
        //  1919: checkcast       Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //  1922: aload_0         /* this */
        //  1923: invokevirtual   gg/essential/elementa/markdown/drawables/ParagraphDrawable.getScaleModifier:()F
        //  1926: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable.setScaleModifier:(F)V
        //  1929: nop            
        //  1930: goto            1880
        //  1933: nop            
        //  1934: aload_0         /* this */
        //  1935: getfield        gg/essential/elementa/markdown/drawables/ParagraphDrawable.drawables:Lgg/essential/elementa/markdown/drawables/DrawableList;
        //  1938: aload           newDrawables
        //  1940: invokevirtual   gg/essential/elementa/markdown/drawables/DrawableList.setDrawables:(Ljava/util/List;)V
        //  1943: aload           currentLine
        //  1945: checkcast       Ljava/util/Collection;
        //  1948: invokeinterface java/util/Collection.isEmpty:()Z
        //  1953: ifne            1960
        //  1956: iconst_1       
        //  1957: goto            1961
        //  1960: iconst_0       
        //  1961: ifeq            1972
        //  1964: aload           currY
        //  1966: getfield        kotlin/jvm/internal/Ref$FloatRef.element:F
        //  1969: goto            1977
        //  1972: aload           prevY
        //  1974: getfield        kotlin/jvm/internal/Ref$FloatRef.element:F
        //  1977: fload_2         /* y */
        //  1978: fsub           
        //  1979: ldc_w           9.0
        //  1982: aload_0         /* this */
        //  1983: getfield        gg/essential/elementa/markdown/drawables/ParagraphDrawable.scaleModifier:F
        //  1986: fmul           
        //  1987: fadd           
        //  1988: aload_0         /* this */
        //  1989: invokevirtual   gg/essential/elementa/markdown/drawables/ParagraphDrawable.getInsertSpaceAfter:()Z
        //  1992: ifeq            2008
        //  1995: aload_0         /* this */
        //  1996: invokevirtual   gg/essential/elementa/markdown/drawables/ParagraphDrawable.getConfig:()Lgg/essential/elementa/markdown/MarkdownConfig;
        //  1999: invokevirtual   gg/essential/elementa/markdown/MarkdownConfig.getParagraphConfig:()Lgg/essential/elementa/markdown/ParagraphConfig;
        //  2002: invokevirtual   gg/essential/elementa/markdown/ParagraphConfig.getSpaceAfter:()F
        //  2005: goto            2009
        //  2008: fconst_0       
        //  2009: fadd           
        //  2010: fstore          height
        //  2012: new             Lgg/essential/elementa/markdown/drawables/Drawable$Layout;
        //  2015: dup            
        //  2016: fload_1         /* x */
        //  2017: fload_2         /* y */
        //  2018: fload_3         /* width */
        //  2019: fload           height
        //  2021: new             Lgg/essential/elementa/markdown/drawables/Drawable$Margin;
        //  2024: dup            
        //  2025: fconst_0       
        //  2026: fload           marginTop
        //  2028: fconst_0       
        //  2029: fload           marginBottom
        //  2031: invokespecial   gg/essential/elementa/markdown/drawables/Drawable$Margin.<init>:(FFFF)V
        //  2034: invokespecial   gg/essential/elementa/markdown/drawables/Drawable$Layout.<init>:(FFFFLgg/essential/elementa/markdown/drawables/Drawable$Margin;)V
        //  2037: areturn        
        //    MethodParameters:
        //  Name   Flags  
        //  -----  -----
        //  x      
        //  y      
        //  width  
        //    StackMapTable: 00 52 14 40 02 FC 00 15 02 40 02 FF 00 9B 00 12 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 92 01 00 00 FD 00 2F 01 07 00 04 14 18 FF 00 16 00 1B 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 92 01 01 07 00 04 00 00 00 00 07 00 62 01 07 01 0A 00 00 FE 00 29 07 00 C9 07 00 04 01 F8 00 02 40 07 00 C9 FF 00 11 00 1B 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 92 01 01 07 00 04 00 00 00 07 00 C9 07 00 62 01 07 01 0A 00 00 40 07 00 9C 48 07 00 9C FF 00 16 00 1B 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 92 01 01 07 00 04 00 00 00 07 00 C9 07 00 C9 01 07 01 0A 00 01 07 01 16 FF 00 0F 00 1B 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 92 01 01 07 00 04 00 07 01 16 00 07 00 C9 07 00 C9 01 07 01 0A 00 00 41 07 01 16 FF 00 24 00 1B 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 92 01 01 07 00 04 07 01 16 07 00 9C 00 07 00 C9 07 00 C9 01 07 01 0A 00 00 40 01 FB 00 9C 3A FF 00 05 00 14 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 92 01 01 07 00 04 00 00 02 FB 00 4A 15 FC 00 06 07 00 9C FC 00 4A 02 02 FC 00 51 07 01 6D 10 40 01 18 FF 00 4A 00 18 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 92 01 01 07 00 04 07 00 9C 02 07 01 6D 07 01 6D 00 01 07 01 6D FB 00 48 FA 00 46 FF 00 1B 00 12 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 92 01 00 00 10 40 01 12 FA 00 0D FF 00 29 00 16 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 92 07 00 62 00 07 00 86 03 07 00 92 00 00 FF 00 30 00 2B 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 92 07 00 62 00 07 00 86 03 07 00 92 07 00 C9 07 00 04 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 03 00 00 40 07 00 9C 48 07 00 9C 4A 07 01 9B 4D 07 01 9B 42 03 FF 00 0B 00 16 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 92 07 00 62 00 07 00 86 03 07 00 92 00 00 FF 00 15 00 17 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 92 07 00 62 02 02 07 00 92 00 07 00 92 00 00 FF 00 25 00 11 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 92 00 00 FF 00 20 00 2C 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 92 07 00 86 07 00 92 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 22 00 2B 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 92 07 00 86 07 00 92 07 00 62 01 07 00 86 03 07 00 92 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 30 00 2A 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 92 07 00 86 07 00 92 07 00 62 01 07 00 86 03 07 00 92 07 00 C9 07 00 04 03 01 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 40 07 00 9C 48 07 00 9C 4A 07 01 9B 4D 07 01 9B 42 03 FF 00 0B 00 2B 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 92 07 00 86 07 00 92 07 00 62 01 07 00 86 03 07 00 92 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 04 00 2B 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 92 07 00 86 07 00 92 02 00 00 03 07 00 92 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 2C 00 2A 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 92 07 00 86 07 00 92 02 07 00 62 01 03 07 00 92 07 00 92 00 00 00 00 00 00 00 00 00 07 00 86 03 00 00 00 00 00 07 00 02 00 00 FF 00 30 00 29 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 92 07 00 86 07 00 92 02 07 00 62 01 03 07 00 92 07 00 92 07 00 C9 00 00 00 01 00 00 00 00 07 00 86 03 07 00 04 03 00 00 07 00 02 00 00 40 07 00 9C 48 07 00 9C 4A 07 01 9B 4D 07 01 9B 42 03 FF 00 0B 00 2A 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 92 07 00 86 07 00 92 02 07 00 62 01 03 07 00 92 07 00 92 00 00 00 00 00 00 00 00 00 07 00 86 03 00 00 00 00 00 07 00 02 00 00 FF 00 10 00 2B 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 92 07 00 86 07 00 92 02 00 00 03 07 00 92 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 04 00 2C 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 92 07 00 86 07 00 92 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 01 07 00 B5 FF 00 0D 00 2C 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 B5 07 00 86 07 00 92 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 01 07 00 02 FF 00 04 00 2C 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 B5 07 00 86 07 00 92 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 02 07 00 02 02 FF 00 15 00 2C 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 86 01 07 00 92 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 30 00 2C 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 86 01 07 00 92 07 00 C9 07 00 04 01 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 03 00 2C 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 86 01 07 00 92 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 1A 40 01 0A 44 02 5E 02 FF 00 00 00 2C 07 00 02 02 02 02 02 02 07 00 62 07 00 E6 07 00 E6 07 00 E6 01 07 00 EF 07 00 62 07 00 62 07 00 E6 07 00 E6 07 00 86 01 07 00 92 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 02 02 02
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack, @NotNull final DrawState state) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "matrixStack"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: aload_2         /* state */
        //     8: ldc_w           "state"
        //    11: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    14: aload_0         /* this */
        //    15: getfield        gg/essential/elementa/markdown/drawables/ParagraphDrawable.drawables:Lgg/essential/elementa/markdown/drawables/DrawableList;
        //    18: checkcast       Ljava/lang/Iterable;
        //    21: astore_3        /* $this$filterIsInstance$iv */
        //    22: iconst_0       
        //    23: istore          $i$f$filterIsInstance
        //    25: aload_3         /* $this$filterIsInstance$iv */
        //    26: astore          5
        //    28: new             Ljava/util/ArrayList;
        //    31: dup            
        //    32: invokespecial   java/util/ArrayList.<init>:()V
        //    35: checkcast       Ljava/util/Collection;
        //    38: astore          destination$iv$iv
        //    40: iconst_0       
        //    41: istore          $i$f$filterIsInstanceTo
        //    43: aload           $this$filterIsInstanceTo$iv$iv
        //    45: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    50: astore          8
        //    52: aload           8
        //    54: invokeinterface java/util/Iterator.hasNext:()Z
        //    59: ifeq            92
        //    62: aload           8
        //    64: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    69: astore          element$iv$iv
        //    71: aload           element$iv$iv
        //    73: instanceof      Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //    76: ifeq            52
        //    79: aload           destination$iv$iv
        //    81: aload           element$iv$iv
        //    83: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    88: pop            
        //    89: goto            52
        //    92: aload           destination$iv$iv
        //    94: checkcast       Ljava/util/List;
        //    97: nop            
        //    98: checkcast       Ljava/lang/Iterable;
        //   101: astore_3       
        //   102: nop            
        //   103: iconst_0       
        //   104: istore          $i$f$forEach
        //   106: aload_3         /* $this$forEach$iv */
        //   107: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   112: astore          5
        //   114: aload           5
        //   116: invokeinterface java/util/Iterator.hasNext:()Z
        //   121: ifeq            152
        //   124: aload           5
        //   126: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   131: astore          element$iv
        //   133: aload           element$iv
        //   135: checkcast       Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //   138: astore          it
        //   140: iconst_0       
        //   141: istore          $i$a$-forEach-ParagraphDrawable$draw$1
        //   143: aload           it
        //   145: aload_2         /* state */
        //   146: invokevirtual   gg/essential/elementa/markdown/drawables/TextDrawable.beforeDraw:(Lgg/essential/elementa/markdown/DrawState;)V
        //   149: goto            114
        //   152: nop            
        //   153: aload_0         /* this */
        //   154: getfield        gg/essential/elementa/markdown/drawables/ParagraphDrawable.drawables:Lgg/essential/elementa/markdown/drawables/DrawableList;
        //   157: checkcast       Ljava/lang/Iterable;
        //   160: astore_3        /* $this$forEach$iv */
        //   161: iconst_0       
        //   162: istore          $i$f$forEach
        //   164: aload_3         /* $this$forEach$iv */
        //   165: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   170: astore          5
        //   172: aload           5
        //   174: invokeinterface java/util/Iterator.hasNext:()Z
        //   179: ifeq            211
        //   182: aload           5
        //   184: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   189: astore          element$iv
        //   191: aload           element$iv
        //   193: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //   196: astore          it
        //   198: iconst_0       
        //   199: istore          $i$a$-forEach-ParagraphDrawable$draw$2
        //   201: aload           it
        //   203: aload_1         /* matrixStack */
        //   204: aload_2         /* state */
        //   205: invokevirtual   gg/essential/elementa/markdown/drawables/Drawable.drawCompat:(Lgg/essential/universal/UMatrixStack;Lgg/essential/elementa/markdown/DrawState;)V
        //   208: goto            172
        //   211: nop            
        //   212: nop            
        //   213: return         
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  matrixStack  
        //  state        
        //    StackMapTable: 00 06 FF 00 34 00 09 07 00 02 07 01 EF 07 01 F1 07 00 86 01 07 00 86 07 00 8C 01 07 00 92 00 00 27 FF 00 15 00 07 07 00 02 07 01 EF 07 01 F1 07 00 86 01 07 00 92 07 00 C9 00 00 25 13 26
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    @Override
    public Cursor<?> cursorAt(final float mouseX, final float mouseY, final boolean dragged, final int mouseButton) {
        final float linePadding = this.getConfig().getParagraphConfig().getSpaceBetweenLines() / 2.0f;
        final Iterable $this$firstOrNull$iv = this.drawables;
        final int $i$f$firstOrNull = 0;
        while (true) {
            for (final Object element$iv : $this$firstOrNull$iv) {
                final Drawable it = (Drawable)element$iv;
                final int n = 0;
                if (cursorAt$yRange(linePadding, it).contains((Comparable)mouseY)) {
                    final Object o = element$iv;
                    final Drawable firstInRow = (Drawable)o;
                    if (firstInRow == null) {
                        if (mouseY < ((Drawable)CollectionsKt.first((List)this.drawables)).getY() - linePadding) {
                            return this.cursorAtStart();
                        }
                        return this.cursorAtEnd();
                    }
                    else {
                        if (mouseX < firstInRow.getX()) {
                            return firstInRow.cursorAtStart();
                        }
                        final Ref$ObjectRef currentDrawable = new Ref$ObjectRef();
                        currentDrawable.element = firstInRow;
                        while (mouseX > ((Drawable)currentDrawable.element).getX() + ((Drawable)currentDrawable.element).getWidth() && ((Drawable)currentDrawable.element).getNext() != null) {
                            final Drawable next = ((Drawable)currentDrawable.element).getNext();
                            Intrinsics.checkNotNull((Object)next);
                            Drawable nextDrawable;
                            Drawable next2;
                            for (nextDrawable = next; !(nextDrawable instanceof TextDrawable) && !(nextDrawable instanceof ImageDrawable) && nextDrawable.getNext() != null; nextDrawable = next2) {
                                next2 = nextDrawable.getNext();
                                Intrinsics.checkNotNull((Object)next2);
                            }
                            if (!(nextDrawable instanceof TextDrawable) && !(nextDrawable instanceof ImageDrawable)) {
                                return ((Drawable)currentDrawable.element).cursorAtEnd();
                            }
                            if (!cursorAt$yRange(linePadding, nextDrawable).contains((Comparable)mouseY)) {
                                return ((Drawable)currentDrawable.element).cursorAtEnd();
                            }
                            currentDrawable.element = nextDrawable;
                        }
                        if (currentDrawable.element instanceof ImageDrawable) {
                            return (Cursor<?>)new ImageCursor((ImageDrawable)currentDrawable.element);
                        }
                        if (!(currentDrawable.element instanceof TextDrawable)) {
                            throw (Throwable)new NotImplementedError((String)null, 1, (DefaultConstructorMarker)null);
                        }
                        final String linkLocation2 = ((TextDrawable)currentDrawable.element).getStyle().getLinkLocation();
                        if (linkLocation2 != null) {
                            final String it2 = linkLocation2;
                            final int n2 = 0;
                            final String s = (!dragged && mouseButton == 0) ? it2 : null;
                            if (s != null) {
                                final String linkLocation = s;
                                final int n3 = 0;
                                if (this.getMd().fireLinkClickEvent$Elementa(new MarkdownComponent$LinkClickEvent(linkLocation))) {
                                    try {
                                        UDesktop.browse(new URI(linkLocation));
                                    }
                                    catch (final URISyntaxException ex) {}
                                }
                            }
                        }
                        int offset = ((TextDrawable)currentDrawable.element).getStyle().getNumFormattingChars();
                        float cachedWidth = 0.0f;
                        while (offset < ((TextDrawable)currentDrawable.element).getFormattedText().length()) {
                            ++offset;
                            final float newWidth = cursorAt$textWidth((Ref$ObjectRef<Drawable>)currentDrawable, offset);
                            if (((Drawable)currentDrawable.element).getX() + newWidth > mouseX) {
                                final float oldDist = Math.abs(mouseX - ((Drawable)currentDrawable.element).getX() - cachedWidth);
                                final float newDist = Math.abs(newWidth - (mouseX - ((Drawable)currentDrawable.element).getX()));
                                if (oldDist < newDist) {
                                    --offset;
                                }
                                return (Cursor<?>)new TextCursor((TextDrawable)currentDrawable.element, offset - ((TextDrawable)currentDrawable.element).getStyle().getNumFormattingChars());
                            }
                            cachedWidth = newWidth;
                        }
                        return (Cursor<?>)((TextDrawable)currentDrawable.element).cursorAtEnd();
                    }
                }
            }
            final Object o = null;
            continue;
        }
    }
    
    @NotNull
    @Override
    public Cursor<?> cursorAtStart() {
        final Iterable $this$first$iv = this.drawables;
        final int $i$f$first = 0;
        for (final Object element$iv : $this$first$iv) {
            final Drawable it = (Drawable)element$iv;
            final int n = 0;
            if (it instanceof TextDrawable || it instanceof ImageDrawable) {
                return ((Drawable)element$iv).cursorAtStart();
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }
    
    @NotNull
    @Override
    public Cursor<?> cursorAtEnd() {
        final List $this$last$iv = this.drawables;
        final int $i$f$last = 0;
        final ListIterator iterator$iv = $this$last$iv.listIterator($this$last$iv.size());
        while (iterator$iv.hasPrevious()) {
            final Object element$iv = iterator$iv.previous();
            final Drawable it = (Drawable)element$iv;
            final int n = 0;
            if (it instanceof TextDrawable || it instanceof ImageDrawable) {
                return ((Drawable)element$iv).cursorAtEnd();
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }
    
    @NotNull
    @Override
    public String selectedText(final boolean asMarkdown) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/elementa/markdown/drawables/ParagraphDrawable.drawables:Lgg/essential/elementa/markdown/drawables/DrawableList;
        //     4: checkcast       Ljava/lang/Iterable;
        //     7: astore_2        /* $this$filter$iv */
        //     8: iconst_0       
        //     9: istore_3        /* $i$f$filter */
        //    10: aload_2         /* $this$filter$iv */
        //    11: astore          4
        //    13: new             Ljava/util/ArrayList;
        //    16: dup            
        //    17: invokespecial   java/util/ArrayList.<init>:()V
        //    20: checkcast       Ljava/util/Collection;
        //    23: astore          destination$iv$iv
        //    25: iconst_0       
        //    26: istore          $i$f$filterTo
        //    28: aload           $this$filterTo$iv$iv
        //    30: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    35: astore          7
        //    37: aload           7
        //    39: invokeinterface java/util/Iterator.hasNext:()Z
        //    44: ifeq            103
        //    47: aload           7
        //    49: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    54: astore          element$iv$iv
        //    56: aload           element$iv$iv
        //    58: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //    61: astore          it
        //    63: iconst_0       
        //    64: istore          $i$a$-filter-ParagraphDrawable$selectedText$1
        //    66: aload           it
        //    68: instanceof      Lgg/essential/elementa/markdown/drawables/TextDrawable;
        //    71: ifne            82
        //    74: aload           it
        //    76: instanceof      Lgg/essential/elementa/markdown/drawables/ImageDrawable;
        //    79: ifeq            86
        //    82: iconst_1       
        //    83: goto            87
        //    86: iconst_0       
        //    87: ifeq            37
        //    90: aload           destination$iv$iv
        //    92: aload           element$iv$iv
        //    94: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    99: pop            
        //   100: goto            37
        //   103: aload           destination$iv$iv
        //   105: checkcast       Ljava/util/List;
        //   108: nop            
        //   109: checkcast       Ljava/lang/Iterable;
        //   112: ldc_w           ""
        //   115: checkcast       Ljava/lang/CharSequence;
        //   118: aconst_null    
        //   119: aconst_null    
        //   120: iconst_0       
        //   121: aconst_null    
        //   122: new             Lgg/essential/elementa/markdown/drawables/ParagraphDrawable$selectedText$2;
        //   125: dup            
        //   126: iload_1         /* asMarkdown */
        //   127: invokespecial   gg/essential/elementa/markdown/drawables/ParagraphDrawable$selectedText$2.<init>:(Z)V
        //   130: checkcast       Lkotlin/jvm/functions/Function1;
        //   133: bipush          30
        //   135: aconst_null    
        //   136: invokestatic    kotlin/collections/CollectionsKt.joinToString$default:(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
        //   139: areturn        
        //    MethodParameters:
        //  Name        Flags  
        //  ----------  -----
        //  asMarkdown  
        //    StackMapTable: 00 05 FF 00 25 00 08 07 00 02 01 07 00 86 01 07 00 86 07 00 8C 01 07 00 92 00 00 FE 00 2C 07 00 C9 07 00 04 01 03 40 01 F8 00 0F
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final Color randomColor() {
        return new Color(this.randomComponent(), this.randomComponent(), this.randomComponent());
    }
    
    private final int randomComponent() {
        return (int)Math.floor(Math.random() * 256.0f);
    }
    
    private static final void layoutImpl$gotoNextLine(final Ref$FloatRef prevY, final Ref$FloatRef currY, final Ref$FloatRef currX, final float $x, final Ref$FloatRef maxLineHeight, final ParagraphDrawable this$0, final List<Drawable> currentLine, final Ref$FloatRef widthRemaining, final float $width, final List<List<Drawable>> lines, final Ref$BooleanRef trimNextText) {
        prevY.element = currY.element;
        currX.element = $x;
        currY.element += maxLineHeight.element * this$0.scaleModifier + this$0.getConfig().getParagraphConfig().getSpaceBetweenLines();
        if (maxLineHeight.element > 9.0f) {
            for (final Drawable drawable : currentLine) {
                drawable.setY(drawable.getY() + (maxLineHeight.element - drawable.getHeight()) / 2.0f);
            }
        }
        maxLineHeight.element = Float.MIN_VALUE;
        widthRemaining.element = $width;
        lines.add(CollectionsKt.toList((Iterable)currentLine));
        currentLine.clear();
        trimNextText.element = true;
    }
    
    private static final void layoutImpl$layout(final Ref$BooleanRef trimNextText, final Ref$FloatRef currX, final Ref$FloatRef currY, final Ref$FloatRef widthRemaining, final List<Drawable> currentLine, final List<Drawable> newDrawables, final Ref$FloatRef maxLineHeight, final Drawable drawable, final float width) {
        float width2;
        if (trimNextText.element && drawable instanceof TextDrawable) {
            ((TextDrawable)drawable).ensureTrimmed();
            width2 = ((TextDrawable)drawable).width();
        }
        else {
            width2 = width;
        }
        final float newWidth = width2;
        final Layout it = drawable.layout(currX.element, currY.element, newWidth);
        final int n = 0;
        if (it.getHeight() > maxLineHeight.element) {
            maxLineHeight.element = it.getHeight();
        }
        widthRemaining.element -= newWidth;
        currX.element += newWidth;
        trimNextText.element = false;
        currentLine.add(drawable);
        newDrawables.add(drawable);
    }
    
    private static final ClosedFloatingPointRange<Float> cursorAt$yRange(final float linePadding, final Drawable d) {
        return (ClosedFloatingPointRange<Float>)RangesKt.rangeTo(d.getY() - linePadding, d.getY() + d.getHeight() + linePadding);
    }
    
    private static final float cursorAt$textWidth(final Ref$ObjectRef<Drawable> currentDrawable, final int offset) {
        final String formattedText = ((TextDrawable)currentDrawable.element).getFormattedText();
        final int beginIndex = 0;
        final String s = formattedText;
        if (s == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        }
        final String substring = s.substring(beginIndex, offset);
        Intrinsics.checkNotNullExpressionValue((Object)substring, "(this as java.lang.Strin\u2026ing(startIndex, endIndex)");
        return UtilitiesKt.width$default(substring, ((TextDrawable)currentDrawable.element).getScaleModifier(), null, 2, null);
    }
}
