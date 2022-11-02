package gg.essential.elementa.markdown.drawables;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.universal.*;
import java.util.*;
import gg.essential.elementa.markdown.selection.*;
import kotlin.jvm.functions.*;
import kotlin.collections.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.font.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.markdown.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u00010B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tJ,\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001b2\u0006\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0013H\u0016J\f\u0010 \u001a\u0006\u0012\u0002\b\u00030\u001bH\u0016J\f\u0010!\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0016J\u0018\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0016J \u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u000f2\u0006\u0010+\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\u000fH\u0014J\u0010\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u0007H\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0016R\u00020\u00000\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011¨\u00061" }, d2 = { "Lgg/essential/elementa/markdown/drawables/ListDrawable;", "Lgg/essential/elementa/markdown/drawables/Drawable;", "md", "Lgg/essential/elementa/markdown/MarkdownComponent;", "drawables", "Lgg/essential/elementa/markdown/drawables/DrawableList;", "isOrdered", "", "isLoose", "(Lgg/essential/elementa/markdown/MarkdownComponent;Lgg/essential/elementa/markdown/drawables/DrawableList;ZZ)V", "children", "", "getChildren", "()Ljava/util/List;", "elementSpacing", "", "getElementSpacing", "()F", "indentLevel", "", "listItems", "", "Lgg/essential/elementa/markdown/drawables/ListDrawable$ListEntry;", "<set-?>", "maxTextLineWidth", "getMaxTextLineWidth", "cursorAt", "Lgg/essential/elementa/markdown/selection/Cursor;", "mouseX", "mouseY", "dragged", "mouseButton", "cursorAtEnd", "cursorAtStart", "draw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "state", "Lgg/essential/elementa/markdown/DrawState;", "layoutImpl", "Lgg/essential/elementa/markdown/drawables/Drawable$Layout;", "x", "y", "width", "selectedText", "", "asMarkdown", "ListEntry", "Elementa" })
public final class ListDrawable extends Drawable
{
    @NotNull
    private final DrawableList drawables;
    private final boolean isOrdered;
    private boolean isLoose;
    @NotNull
    private final List<ListEntry> listItems;
    private int indentLevel;
    private float maxTextLineWidth;
    
    public ListDrawable(@NotNull final MarkdownComponent md, @NotNull final DrawableList drawables, final boolean isOrdered, final boolean isLoose) {
        Intrinsics.checkNotNullParameter((Object)md, "md");
        Intrinsics.checkNotNullParameter((Object)drawables, "drawables");
        super(md);
        this.drawables = drawables;
        this.isOrdered = isOrdered;
        this.isLoose = isLoose;
        this.listItems = new ArrayList<ListEntry>();
        Drawable.Companion.trim(this.drawables);
        this.drawables.setParent(this);
    }
    
    @NotNull
    @Override
    public List<Drawable> getChildren() {
        return (List<Drawable>)this.listItems;
    }
    
    private final float getElementSpacing() {
        return this.isLoose ? this.getConfig().getListConfig().getElementSpacingLoose() : this.getConfig().getListConfig().getElementSpacingTight();
    }
    
    public final float getMaxTextLineWidth() {
        return this.maxTextLineWidth;
    }
    
    @NotNull
    @Override
    protected Layout layoutImpl(final float x, final float y, final float width) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/elementa/markdown/drawables/ListDrawable.listItems:Ljava/util/List;
        //     4: invokeinterface java/util/List.clear:()V
        //     9: aload_0         /* this */
        //    10: invokevirtual   gg/essential/elementa/markdown/drawables/ListDrawable.getInsertSpaceBefore:()Z
        //    13: ifeq            29
        //    16: aload_0         /* this */
        //    17: invokevirtual   gg/essential/elementa/markdown/drawables/ListDrawable.getConfig:()Lgg/essential/elementa/markdown/MarkdownConfig;
        //    20: invokevirtual   gg/essential/elementa/markdown/MarkdownConfig.getListConfig:()Lgg/essential/elementa/markdown/ListConfig;
        //    23: invokevirtual   gg/essential/elementa/markdown/ListConfig.getSpaceBeforeList:()F
        //    26: goto            30
        //    29: fconst_0       
        //    30: fstore          marginTop
        //    32: aload_0         /* this */
        //    33: invokevirtual   gg/essential/elementa/markdown/drawables/ListDrawable.getInsertSpaceAfter:()Z
        //    36: ifeq            52
        //    39: aload_0         /* this */
        //    40: invokevirtual   gg/essential/elementa/markdown/drawables/ListDrawable.getConfig:()Lgg/essential/elementa/markdown/MarkdownConfig;
        //    43: invokevirtual   gg/essential/elementa/markdown/MarkdownConfig.getListConfig:()Lgg/essential/elementa/markdown/ListConfig;
        //    46: invokevirtual   gg/essential/elementa/markdown/ListConfig.getSpaceAfterList:()F
        //    49: goto            53
        //    52: fconst_0       
        //    53: fstore          marginBottom
        //    55: new             Lkotlin/jvm/internal/Ref$FloatRef;
        //    58: dup            
        //    59: invokespecial   kotlin/jvm/internal/Ref$FloatRef.<init>:()V
        //    62: astore          currY
        //    64: aload           currY
        //    66: fload_2         /* y */
        //    67: fload           marginTop
        //    69: fadd           
        //    70: putfield        kotlin/jvm/internal/Ref$FloatRef.element:F
        //    73: aload_0         /* this */
        //    74: invokevirtual   gg/essential/elementa/markdown/drawables/ListDrawable.getConfig:()Lgg/essential/elementa/markdown/MarkdownConfig;
        //    77: invokevirtual   gg/essential/elementa/markdown/MarkdownConfig.getListConfig:()Lgg/essential/elementa/markdown/ListConfig;
        //    80: invokevirtual   gg/essential/elementa/markdown/ListConfig.getSpaceBeforeText:()F
        //    83: fstore          spaceAfterSymbol
        //    85: aload_0         /* this */
        //    86: invokevirtual   gg/essential/elementa/markdown/drawables/ListDrawable.getConfig:()Lgg/essential/elementa/markdown/MarkdownConfig;
        //    89: invokevirtual   gg/essential/elementa/markdown/MarkdownConfig.getListConfig:()Lgg/essential/elementa/markdown/ListConfig;
        //    92: invokevirtual   gg/essential/elementa/markdown/ListConfig.getIndentation:()F
        //    95: fstore          indentation
        //    97: new             Lkotlin/jvm/internal/Ref$IntRef;
        //   100: dup            
        //   101: invokespecial   kotlin/jvm/internal/Ref$IntRef.<init>:()V
        //   104: astore          orderedListShift
        //   106: aload_0         /* this */
        //   107: getfield        gg/essential/elementa/markdown/drawables/ListDrawable.isOrdered:Z
        //   110: ifeq            371
        //   113: bipush          46
        //   115: fconst_0       
        //   116: iconst_1       
        //   117: aconst_null    
        //   118: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.width$default:(CFILjava/lang/Object;)F
        //   121: fstore          dotWidth
        //   123: aload_0         /* this */
        //   124: getfield        gg/essential/elementa/markdown/drawables/ListDrawable.drawables:Lgg/essential/elementa/markdown/drawables/DrawableList;
        //   127: checkcast       Ljava/util/Collection;
        //   130: invokestatic    kotlin/collections/CollectionsKt.getIndices:(Ljava/util/Collection;)Lkotlin/ranges/IntRange;
        //   133: checkcast       Ljava/lang/Iterable;
        //   136: astore          $this$filter$iv
        //   138: iconst_0       
        //   139: istore          $i$f$filter
        //   141: aload           $this$filter$iv
        //   143: astore          14
        //   145: new             Ljava/util/ArrayList;
        //   148: dup            
        //   149: invokespecial   java/util/ArrayList.<init>:()V
        //   152: checkcast       Ljava/util/Collection;
        //   155: astore          destination$iv$iv
        //   157: iconst_0       
        //   158: istore          $i$f$filterTo
        //   160: aload           $this$filterTo$iv$iv
        //   162: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   167: astore          17
        //   169: aload           17
        //   171: invokeinterface java/util/Iterator.hasNext:()Z
        //   176: ifeq            237
        //   179: aload           17
        //   181: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   186: astore          element$iv$iv
        //   188: aload           element$iv$iv
        //   190: checkcast       Ljava/lang/Number;
        //   193: invokevirtual   java/lang/Number.intValue:()I
        //   196: istore          it
        //   198: iconst_0       
        //   199: istore          $i$a$-filter-ListDrawable$layoutImpl$symbolWidth$1
        //   201: aload_0         /* this */
        //   202: getfield        gg/essential/elementa/markdown/drawables/ListDrawable.drawables:Lgg/essential/elementa/markdown/drawables/DrawableList;
        //   205: iload           it
        //   207: invokevirtual   gg/essential/elementa/markdown/drawables/DrawableList.get:(I)Lgg/essential/elementa/markdown/drawables/Drawable;
        //   210: instanceof      Lgg/essential/elementa/markdown/drawables/ListDrawable;
        //   213: ifne            220
        //   216: iconst_1       
        //   217: goto            221
        //   220: iconst_0       
        //   221: ifeq            169
        //   224: aload           destination$iv$iv
        //   226: aload           element$iv$iv
        //   228: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   233: pop            
        //   234: goto            169
        //   237: aload           destination$iv$iv
        //   239: checkcast       Ljava/util/List;
        //   242: nop            
        //   243: checkcast       Ljava/lang/Iterable;
        //   246: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   251: astore          13
        //   253: aload           13
        //   255: invokeinterface java/util/Iterator.hasNext:()Z
        //   260: ifne            274
        //   263: new             Ljava/util/NoSuchElementException;
        //   266: dup            
        //   267: invokespecial   java/util/NoSuchElementException.<init>:()V
        //   270: checkcast       Ljava/lang/Throwable;
        //   273: athrow         
        //   274: aload           13
        //   276: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   281: checkcast       Ljava/lang/Number;
        //   284: invokevirtual   java/lang/Number.intValue:()I
        //   287: istore          it
        //   289: iconst_0       
        //   290: istore          $i$a$-maxOf-ListDrawable$layoutImpl$symbolWidth$2
        //   292: iload           it
        //   294: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   297: fconst_0       
        //   298: aconst_null    
        //   299: iconst_3       
        //   300: aconst_null    
        //   301: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.width$default:(Ljava/lang/String;FLgg/essential/elementa/font/FontProvider;ILjava/lang/Object;)F
        //   304: fload           dotWidth
        //   306: fadd           
        //   307: fstore          null
        //   309: aload           13
        //   311: invokeinterface java/util/Iterator.hasNext:()Z
        //   316: ifeq            366
        //   319: aload           13
        //   321: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   326: checkcast       Ljava/lang/Number;
        //   329: invokevirtual   java/lang/Number.intValue:()I
        //   332: istore          it
        //   334: iconst_0       
        //   335: istore          $i$a$-maxOf-ListDrawable$layoutImpl$symbolWidth$2
        //   337: iload           it
        //   339: invokestatic    java/lang/String.valueOf:(I)Ljava/lang/String;
        //   342: fconst_0       
        //   343: aconst_null    
        //   344: iconst_3       
        //   345: aconst_null    
        //   346: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.width$default:(Ljava/lang/String;FLgg/essential/elementa/font/FontProvider;ILjava/lang/Object;)F
        //   349: fload           dotWidth
        //   351: fadd           
        //   352: fstore          null
        //   354: fload           14
        //   356: fload           15
        //   358: invokestatic    java/lang/Math.max:(FF)F
        //   361: fstore          14
        //   363: goto            309
        //   366: fload           14
        //   368: goto            404
        //   371: aload_0         /* this */
        //   372: invokevirtual   gg/essential/elementa/markdown/drawables/ListDrawable.getConfig:()Lgg/essential/elementa/markdown/MarkdownConfig;
        //   375: invokevirtual   gg/essential/elementa/markdown/MarkdownConfig.getListConfig:()Lgg/essential/elementa/markdown/ListConfig;
        //   378: invokevirtual   gg/essential/elementa/markdown/ListConfig.getUnorderedSymbols:()Ljava/lang/String;
        //   381: astore          symbols
        //   383: aload           symbols
        //   385: aload_0         /* this */
        //   386: getfield        gg/essential/elementa/markdown/drawables/ListDrawable.indentLevel:I
        //   389: aload           symbols
        //   391: invokevirtual   java/lang/String.length:()I
        //   394: irem           
        //   395: invokevirtual   java/lang/String.charAt:(I)C
        //   398: fconst_0       
        //   399: iconst_1       
        //   400: aconst_null    
        //   401: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.width$default:(CFILjava/lang/Object;)F
        //   404: fstore          symbolWidth
        //   406: new             Lkotlin/jvm/internal/Ref$IntRef;
        //   409: dup            
        //   410: invokespecial   kotlin/jvm/internal/Ref$IntRef.<init>:()V
        //   413: astore          index
        //   415: aload_0         /* this */
        //   416: getfield        gg/essential/elementa/markdown/drawables/ListDrawable.drawables:Lgg/essential/elementa/markdown/drawables/DrawableList;
        //   419: invokevirtual   gg/essential/elementa/markdown/drawables/DrawableList.iterator:()Ljava/util/Iterator;
        //   422: astore          12
        //   424: aload           12
        //   426: invokeinterface java/util/Iterator.hasNext:()Z
        //   431: ifeq            507
        //   434: aload           12
        //   436: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   441: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //   444: astore          drawable
        //   446: aload           drawable
        //   448: instanceof      Lgg/essential/elementa/markdown/drawables/ListDrawable;
        //   451: ifeq            468
        //   454: aload           drawable
        //   456: checkcast       Lgg/essential/elementa/markdown/drawables/ListDrawable;
        //   459: aload_0         /* this */
        //   460: getfield        gg/essential/elementa/markdown/drawables/ListDrawable.indentLevel:I
        //   463: iconst_1       
        //   464: iadd           
        //   465: putfield        gg/essential/elementa/markdown/drawables/ListDrawable.indentLevel:I
        //   468: aload_0         /* this */
        //   469: aload           index
        //   471: fload           symbolWidth
        //   473: fload           spaceAfterSymbol
        //   475: aload           currY
        //   477: fload_1         /* x */
        //   478: fload           indentation
        //   480: fload_3         /* width */
        //   481: aload           orderedListShift
        //   483: aload           drawable
        //   485: invokestatic    gg/essential/elementa/markdown/drawables/ListDrawable.layoutImpl$addItem:(Lgg/essential/elementa/markdown/drawables/ListDrawable;Lkotlin/jvm/internal/Ref$IntRef;FFLkotlin/jvm/internal/Ref$FloatRef;FFFLkotlin/jvm/internal/Ref$IntRef;Lgg/essential/elementa/markdown/drawables/Drawable;)V
        //   488: aload           index
        //   490: getfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //   493: istore          14
        //   495: aload           index
        //   497: iload           14
        //   499: iconst_1       
        //   500: iadd           
        //   501: putfield        kotlin/jvm/internal/Ref$IntRef.element:I
        //   504: goto            424
        //   507: aload_0         /* this */
        //   508: aload_0         /* this */
        //   509: getfield        gg/essential/elementa/markdown/drawables/ListDrawable.drawables:Lgg/essential/elementa/markdown/drawables/DrawableList;
        //   512: checkcast       Ljava/lang/Iterable;
        //   515: astore          13
        //   517: astore          26
        //   519: aload           13
        //   521: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   526: astore          14
        //   528: aload           14
        //   530: invokeinterface java/util/Iterator.hasNext:()Z
        //   535: ifne            542
        //   538: aconst_null    
        //   539: goto            1035
        //   542: aload           14
        //   544: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   549: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //   552: astore          drawable
        //   554: iconst_0       
        //   555: istore          $i$a$-maxOfOrNull-ListDrawable$layoutImpl$1
        //   557: aload           drawable
        //   559: invokevirtual   gg/essential/elementa/markdown/drawables/Drawable.getChildren:()Ljava/util/List;
        //   562: checkcast       Ljava/lang/Iterable;
        //   565: astore          $this$filterIsInstance$iv
        //   567: iconst_0       
        //   568: istore          $i$f$filterIsInstance
        //   570: aload           $this$filterIsInstance$iv
        //   572: astore          19
        //   574: new             Ljava/util/ArrayList;
        //   577: dup            
        //   578: invokespecial   java/util/ArrayList.<init>:()V
        //   581: checkcast       Ljava/util/Collection;
        //   584: astore          destination$iv$iv
        //   586: iconst_0       
        //   587: istore          $i$f$filterIsInstanceTo
        //   589: aload           $this$filterIsInstanceTo$iv$iv
        //   591: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   596: astore          22
        //   598: aload           22
        //   600: invokeinterface java/util/Iterator.hasNext:()Z
        //   605: ifeq            638
        //   608: aload           22
        //   610: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   615: astore          element$iv$iv
        //   617: aload           element$iv$iv
        //   619: instanceof      Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;
        //   622: ifeq            598
        //   625: aload           destination$iv$iv
        //   627: aload           element$iv$iv
        //   629: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   634: pop            
        //   635: goto            598
        //   638: aload           destination$iv$iv
        //   640: checkcast       Ljava/util/List;
        //   643: nop            
        //   644: checkcast       Ljava/lang/Iterable;
        //   647: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   652: astore          18
        //   654: aload           18
        //   656: invokeinterface java/util/Iterator.hasNext:()Z
        //   661: ifne            668
        //   664: aconst_null    
        //   665: goto            757
        //   668: aload           18
        //   670: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   675: checkcast       Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;
        //   678: astore          it
        //   680: iconst_0       
        //   681: istore          $i$a$-maxOfOrNull-ListDrawable$layoutImpl$1$1
        //   683: fload           indentation
        //   685: fload           symbolWidth
        //   687: fadd           
        //   688: fload           spaceAfterSymbol
        //   690: fadd           
        //   691: aload           it
        //   693: invokevirtual   gg/essential/elementa/markdown/drawables/ParagraphDrawable.getMaxTextLineWidth:()F
        //   696: fadd           
        //   697: fstore          null
        //   699: aload           18
        //   701: invokeinterface java/util/Iterator.hasNext:()Z
        //   706: ifeq            752
        //   709: aload           18
        //   711: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   716: checkcast       Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;
        //   719: astore          it
        //   721: iconst_0       
        //   722: istore          $i$a$-maxOfOrNull-ListDrawable$layoutImpl$1$1
        //   724: fload           indentation
        //   726: fload           symbolWidth
        //   728: fadd           
        //   729: fload           spaceAfterSymbol
        //   731: fadd           
        //   732: aload           it
        //   734: invokevirtual   gg/essential/elementa/markdown/drawables/ParagraphDrawable.getMaxTextLineWidth:()F
        //   737: fadd           
        //   738: fstore          null
        //   740: fload           19
        //   742: fload           20
        //   744: invokestatic    java/lang/Math.max:(FF)F
        //   747: fstore          19
        //   749: goto            699
        //   752: fload           19
        //   754: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   757: astore          24
        //   759: aload           24
        //   761: ifnonnull       768
        //   764: fconst_0       
        //   765: goto            773
        //   768: aload           24
        //   770: invokevirtual   java/lang/Float.floatValue:()F
        //   773: fstore          null
        //   775: aload           14
        //   777: invokeinterface java/util/Iterator.hasNext:()Z
        //   782: ifeq            1030
        //   785: aload           14
        //   787: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   792: checkcast       Lgg/essential/elementa/markdown/drawables/Drawable;
        //   795: astore          drawable
        //   797: iconst_0       
        //   798: istore          $i$a$-maxOfOrNull-ListDrawable$layoutImpl$1
        //   800: aload           drawable
        //   802: invokevirtual   gg/essential/elementa/markdown/drawables/Drawable.getChildren:()Ljava/util/List;
        //   805: checkcast       Ljava/lang/Iterable;
        //   808: astore          $this$filterIsInstance$iv
        //   810: iconst_0       
        //   811: istore          $i$f$filterIsInstance
        //   813: aload           $this$filterIsInstance$iv
        //   815: astore          20
        //   817: new             Ljava/util/ArrayList;
        //   820: dup            
        //   821: invokespecial   java/util/ArrayList.<init>:()V
        //   824: checkcast       Ljava/util/Collection;
        //   827: astore          destination$iv$iv
        //   829: iconst_0       
        //   830: istore          $i$f$filterIsInstanceTo
        //   832: aload           $this$filterIsInstanceTo$iv$iv
        //   834: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   839: astore          23
        //   841: aload           23
        //   843: invokeinterface java/util/Iterator.hasNext:()Z
        //   848: ifeq            881
        //   851: aload           23
        //   853: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   858: astore          element$iv$iv
        //   860: aload           element$iv$iv
        //   862: instanceof      Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;
        //   865: ifeq            841
        //   868: aload           destination$iv$iv
        //   870: aload           element$iv$iv
        //   872: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   877: pop            
        //   878: goto            841
        //   881: aload           destination$iv$iv
        //   883: checkcast       Ljava/util/List;
        //   886: nop            
        //   887: checkcast       Ljava/lang/Iterable;
        //   890: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   895: astore          19
        //   897: aload           19
        //   899: invokeinterface java/util/Iterator.hasNext:()Z
        //   904: ifne            911
        //   907: aconst_null    
        //   908: goto            1000
        //   911: aload           19
        //   913: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   918: checkcast       Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;
        //   921: astore          it
        //   923: iconst_0       
        //   924: istore          $i$a$-maxOfOrNull-ListDrawable$layoutImpl$1$1
        //   926: fload           indentation
        //   928: fload           symbolWidth
        //   930: fadd           
        //   931: fload           spaceAfterSymbol
        //   933: fadd           
        //   934: aload           it
        //   936: invokevirtual   gg/essential/elementa/markdown/drawables/ParagraphDrawable.getMaxTextLineWidth:()F
        //   939: fadd           
        //   940: fstore          null
        //   942: aload           19
        //   944: invokeinterface java/util/Iterator.hasNext:()Z
        //   949: ifeq            995
        //   952: aload           19
        //   954: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   959: checkcast       Lgg/essential/elementa/markdown/drawables/ParagraphDrawable;
        //   962: astore          it
        //   964: iconst_0       
        //   965: istore          $i$a$-maxOfOrNull-ListDrawable$layoutImpl$1$1
        //   967: fload           indentation
        //   969: fload           symbolWidth
        //   971: fadd           
        //   972: fload           spaceAfterSymbol
        //   974: fadd           
        //   975: aload           it
        //   977: invokevirtual   gg/essential/elementa/markdown/drawables/ParagraphDrawable.getMaxTextLineWidth:()F
        //   980: fadd           
        //   981: fstore          null
        //   983: fload           20
        //   985: fload           21
        //   987: invokestatic    java/lang/Math.max:(FF)F
        //   990: fstore          20
        //   992: goto            942
        //   995: fload           20
        //   997: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1000: astore          25
        //  1002: aload           25
        //  1004: ifnonnull       1011
        //  1007: fconst_0       
        //  1008: goto            1016
        //  1011: aload           25
        //  1013: invokevirtual   java/lang/Float.floatValue:()F
        //  1016: fstore          null
        //  1018: fload           15
        //  1020: fload           16
        //  1022: invokestatic    java/lang/Math.max:(FF)F
        //  1025: fstore          15
        //  1027: goto            775
        //  1030: fload           15
        //  1032: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1035: aload           26
        //  1037: swap           
        //  1038: astore          12
        //  1040: aload           12
        //  1042: ifnonnull       1049
        //  1045: fconst_0       
        //  1046: goto            1054
        //  1049: aload           12
        //  1051: invokevirtual   java/lang/Float.floatValue:()F
        //  1054: putfield        gg/essential/elementa/markdown/drawables/ListDrawable.maxTextLineWidth:F
        //  1057: aload           currY
        //  1059: aload           currY
        //  1061: getfield        kotlin/jvm/internal/Ref$FloatRef.element:F
        //  1064: aload_0         /* this */
        //  1065: invokespecial   gg/essential/elementa/markdown/drawables/ListDrawable.getElementSpacing:()F
        //  1068: fsub           
        //  1069: putfield        kotlin/jvm/internal/Ref$FloatRef.element:F
        //  1072: aload           currY
        //  1074: aload           currY
        //  1076: getfield        kotlin/jvm/internal/Ref$FloatRef.element:F
        //  1079: fload           marginBottom
        //  1081: fadd           
        //  1082: putfield        kotlin/jvm/internal/Ref$FloatRef.element:F
        //  1085: aload           currY
        //  1087: getfield        kotlin/jvm/internal/Ref$FloatRef.element:F
        //  1090: fload_2         /* y */
        //  1091: fsub           
        //  1092: fstore          height
        //  1094: new             Lgg/essential/elementa/markdown/drawables/Drawable$Layout;
        //  1097: dup            
        //  1098: fload_1         /* x */
        //  1099: fload_2         /* y */
        //  1100: fload_3         /* width */
        //  1101: fload           height
        //  1103: new             Lgg/essential/elementa/markdown/drawables/Drawable$Margin;
        //  1106: dup            
        //  1107: fconst_0       
        //  1108: fload           marginTop
        //  1110: fconst_0       
        //  1111: fload           marginBottom
        //  1113: invokespecial   gg/essential/elementa/markdown/drawables/Drawable$Margin.<init>:(FFFF)V
        //  1116: invokespecial   gg/essential/elementa/markdown/drawables/Drawable$Layout.<init>:(FFFFLgg/essential/elementa/markdown/drawables/Drawable$Margin;)V
        //  1119: areturn        
        //    MethodParameters:
        //  Name   Flags  
        //  -----  -----
        //  x      
        //  y      
        //  width  
        //    StackMapTable: 00 26 1D 40 02 FC 00 15 02 40 02 FF 00 73 00 12 07 00 02 02 02 02 02 02 07 00 9A 02 02 07 00 A6 00 02 07 00 B7 01 07 00 B7 07 00 AF 01 07 00 BD 00 00 FE 00 32 07 00 D0 01 01 40 01 F8 00 0F FF 00 24 00 12 07 00 02 02 02 02 02 02 07 00 9A 02 02 07 00 A6 00 02 07 00 B7 07 00 BD 07 00 B7 07 00 AF 01 07 00 BD 00 00 FF 00 22 00 12 07 00 02 02 02 02 02 02 07 00 9A 02 02 07 00 A6 00 02 07 00 B7 07 00 BD 02 00 01 07 00 BD 00 00 38 FF 00 04 00 0A 07 00 02 02 02 02 02 02 07 00 9A 02 02 07 00 A6 00 00 60 02 FE 00 13 02 07 00 A6 07 00 BD FC 00 2B 07 00 04 FA 00 26 FF 00 22 00 1B 07 00 02 02 02 02 02 02 07 00 9A 02 02 07 00 A6 02 07 00 A6 07 00 BD 07 00 B7 07 00 BD 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 00 FF 00 37 00 1B 07 00 02 02 02 02 02 02 07 00 9A 02 02 07 00 A6 02 07 00 A6 07 00 BD 07 00 B7 07 00 BD 07 00 04 01 07 00 B7 01 07 00 B7 07 00 AF 01 07 00 BD 00 00 00 07 00 02 00 00 27 FF 00 1D 00 1B 07 00 02 02 02 02 02 02 07 00 9A 02 02 07 00 A6 02 07 00 A6 07 00 BD 07 00 B7 07 00 BD 07 00 04 01 07 00 B7 07 00 BD 07 00 B7 07 00 AF 01 07 00 BD 00 00 00 07 00 02 00 00 FF 00 1E 00 1B 07 00 02 02 02 02 02 02 07 00 9A 02 02 07 00 A6 02 07 00 A6 07 00 BD 07 00 B7 07 00 BD 07 00 04 01 07 00 B7 07 00 BD 02 00 01 07 00 BD 00 00 00 07 00 02 00 00 34 FF 00 04 00 1B 07 00 02 02 02 02 02 02 07 00 9A 02 02 07 00 A6 02 07 00 A6 07 00 BD 07 00 B7 07 00 BD 07 00 04 01 07 00 B7 07 00 BD 00 00 01 07 00 BD 00 00 00 07 00 02 00 01 07 01 04 FF 00 0A 00 1B 07 00 02 02 02 02 02 02 07 00 9A 02 02 07 00 A6 02 07 00 A6 07 00 BD 07 00 B7 07 00 BD 07 00 04 01 07 00 B7 07 00 BD 00 00 01 07 00 BD 00 07 01 04 00 07 00 02 00 00 44 02 FF 00 01 00 1B 07 00 02 02 02 02 02 02 07 00 9A 02 02 07 00 A6 02 07 00 A6 07 00 BD 07 00 B7 07 00 BD 02 00 00 07 00 D0 00 00 00 00 00 07 00 D0 00 07 00 02 00 00 FF 00 41 00 1B 07 00 02 02 02 02 02 02 07 00 9A 02 02 07 00 A6 02 07 00 A6 07 00 BD 07 00 B7 07 00 BD 02 07 00 04 01 07 00 B7 01 07 00 B7 07 00 AF 01 07 00 BD 07 00 D0 00 07 00 02 00 00 27 FF 00 1D 00 1B 07 00 02 02 02 02 02 02 07 00 9A 02 02 07 00 A6 02 07 00 A6 07 00 BD 07 00 B7 07 00 BD 02 07 00 04 01 07 00 B7 07 00 BD 07 00 B7 07 00 AF 01 07 00 BD 07 00 D0 00 07 00 02 00 00 FF 00 1E 00 1B 07 00 02 02 02 02 02 02 07 00 9A 02 02 07 00 A6 02 07 00 A6 07 00 BD 07 00 B7 07 00 BD 02 07 00 04 01 07 00 B7 07 00 BD 02 00 01 07 00 BD 07 00 D0 00 07 00 02 00 00 34 FF 00 04 00 1B 07 00 02 02 02 02 02 02 07 00 9A 02 02 07 00 A6 02 07 00 A6 07 00 BD 07 00 B7 07 00 BD 02 07 00 04 01 07 00 B7 07 00 BD 00 00 01 07 00 BD 07 00 D0 00 07 00 02 00 01 07 01 04 FF 00 0A 00 1B 07 00 02 02 02 02 02 02 07 00 9A 02 02 07 00 A6 02 07 00 A6 07 00 BD 07 00 B7 07 00 BD 02 07 00 04 01 07 00 B7 07 00 BD 00 00 01 07 00 BD 07 00 D0 07 01 04 07 00 02 00 00 44 02 FF 00 0D 00 1B 07 00 02 02 02 02 02 02 07 00 9A 02 02 07 00 A6 02 07 00 A6 07 00 BD 07 00 B7 07 00 BD 02 00 00 07 00 D0 00 00 00 00 00 07 00 D0 00 07 00 02 00 00 FF 00 04 00 1B 07 00 02 02 02 02 02 02 07 00 9A 02 02 07 00 A6 02 07 00 A6 07 00 BD 07 00 B7 07 00 BD 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 01 07 01 04 FF 00 0D 00 1B 07 00 02 02 02 02 02 02 07 00 9A 02 02 07 00 A6 02 07 00 A6 07 01 04 07 00 B7 07 00 BD 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 01 07 00 02 FF 00 04 00 1B 07 00 02 02 02 02 02 02 07 00 9A 02 02 07 00 A6 02 07 00 A6 07 01 04 07 00 B7 07 00 BD 00 00 00 00 00 00 00 00 00 00 00 07 00 02 00 02 07 00 02 02
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack, @NotNull final DrawState state) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        Intrinsics.checkNotNullParameter((Object)state, "state");
        final Iterable $this$forEach$iv = this.listItems;
        final int $i$f$forEach = 0;
        for (final Object element$iv : $this$forEach$iv) {
            final ListEntry it = (ListEntry)element$iv;
            final int n = 0;
            it.drawCompat(matrixStack, state);
        }
    }
    
    @NotNull
    @Override
    public Cursor<?> cursorAt(final float mouseX, final float mouseY, final boolean dragged, final int mouseButton) {
        return this.drawables.cursorAt(mouseX, mouseY, dragged, mouseButton);
    }
    
    @NotNull
    @Override
    public Cursor<?> cursorAtStart() {
        return this.drawables.cursorAtStart();
    }
    
    @NotNull
    @Override
    public Cursor<?> cursorAtEnd() {
        return this.drawables.cursorAtEnd();
    }
    
    @NotNull
    @Override
    public String selectedText(final boolean asMarkdown) {
        return CollectionsKt.joinToString$default((Iterable)this.listItems, (CharSequence)"\n", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)new ListDrawable$selectedText.ListDrawable$selectedText$1(asMarkdown), 30, (Object)null);
    }
    
    private static final String layoutImpl$symbol(final ListDrawable this$0, final Ref$IntRef orderedListShift, final int index) {
        String s;
        if (this$0.isOrdered) {
            s = new StringBuilder().append(index + 1 - orderedListShift.element).append('.').toString();
        }
        else {
            final String symbols = this$0.getConfig().getListConfig().getUnorderedSymbols();
            s = String.valueOf(symbols.charAt(this$0.indentLevel % symbols.length()));
        }
        return s;
    }
    
    private static final void layoutImpl$addItem(final ListDrawable this$0, final Ref$IntRef index, final float symbolWidth, final float spaceAfterSymbol, final Ref$FloatRef currY, final float $x, final float indentation, final float $width, final Ref$IntRef orderedListShift, final Drawable drawable) {
        final ListEntry item = this$0.new ListEntry(this$0.getMd(), layoutImpl$symbol(this$0, orderedListShift, index.element), symbolWidth, spaceAfterSymbol, drawable);
        this$0.listItems.add(item);
        currY.element += item.layout($x + indentation, currY.element, $width - indentation).getHeight();
        currY.element += this$0.getElementSpacing();
    }
    
    public static final /* synthetic */ int access$getIndentLevel$p(final ListDrawable $this) {
        return $this.indentLevel;
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0004\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0002\u0010\nJ,\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\f\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016J\f\u0010\u001b\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016J\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0016J \u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0014J\u0010\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u0017H\u0016R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006)" }, d2 = { "Lgg/essential/elementa/markdown/drawables/ListDrawable$ListEntry;", "Lgg/essential/elementa/markdown/drawables/Drawable;", "md", "Lgg/essential/elementa/markdown/MarkdownComponent;", "symbol", "", "symbolWidth", "", "symbolPaddingRight", "drawable", "(Lgg/essential/elementa/markdown/drawables/ListDrawable;Lgg/essential/elementa/markdown/MarkdownComponent;Ljava/lang/String;FFLgg/essential/elementa/markdown/drawables/Drawable;)V", "actualSymbolWidth", "children", "", "getChildren", "()Ljava/util/List;", "getDrawable", "()Lgg/essential/elementa/markdown/drawables/Drawable;", "cursorAt", "Lgg/essential/elementa/markdown/selection/Cursor;", "mouseX", "mouseY", "dragged", "", "mouseButton", "", "cursorAtEnd", "cursorAtStart", "draw", "", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "state", "Lgg/essential/elementa/markdown/DrawState;", "layoutImpl", "Lgg/essential/elementa/markdown/drawables/Drawable$Layout;", "x", "y", "width", "selectedText", "asMarkdown", "Elementa" })
    public final class ListEntry extends Drawable
    {
        @NotNull
        private final String symbol;
        private final float symbolWidth;
        private final float symbolPaddingRight;
        @NotNull
        private final Drawable drawable;
        private final float actualSymbolWidth;
        final /* synthetic */ ListDrawable this$0;
        
        public ListEntry(@NotNull final ListDrawable this$0, @NotNull final MarkdownComponent md, final String symbol, final float symbolWidth, @NotNull final float symbolPaddingRight, final Drawable drawable) {
            Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
            Intrinsics.checkNotNullParameter((Object)md, "md");
            Intrinsics.checkNotNullParameter((Object)symbol, "symbol");
            Intrinsics.checkNotNullParameter((Object)drawable, "drawable");
            this.this$0 = this$0;
            super(md);
            this.symbol = symbol;
            this.symbolWidth = symbolWidth;
            this.symbolPaddingRight = symbolPaddingRight;
            this.drawable = drawable;
            this.actualSymbolWidth = UtilitiesKt.width$default(this.symbol, 0.0f, null, 3, null);
            Drawable.Companion.trim(this.drawable);
            if (this.drawable instanceof DrawableList) {
                final Iterator<Drawable> iterator = ((DrawableList)this.drawable).iterator();
                int n = 0;
                while (iterator.hasNext()) {
                    final int index = n;
                    ++n;
                    final Drawable item = iterator.next();
                    if (item instanceof ListDrawable) {
                        if (index != 0) {
                            Drawable.Companion.trim(((DrawableList)this.drawable).get(index - 1));
                        }
                        if (index == CollectionsKt.getLastIndex((List)this.drawable)) {
                            continue;
                        }
                        Drawable.Companion.trim(((DrawableList)this.drawable).get(index + 1));
                    }
                }
            }
        }
        
        @NotNull
        public final Drawable getDrawable() {
            return this.drawable;
        }
        
        @NotNull
        @Override
        public List<Drawable> getChildren() {
            return CollectionsKt.listOf((Object)this.drawable);
        }
        
        @NotNull
        @Override
        protected Layout layoutImpl(final float x, final float y, final float width) {
            final float nonDrawableSpace = this.symbolWidth + this.symbolPaddingRight;
            this.drawable.layout(x + nonDrawableSpace, y, width - nonDrawableSpace);
            return new Layout(x, y, width, this.drawable.getHeight(), null, 16, null);
        }
        
        @Override
        public void draw(@NotNull final UMatrixStack matrixStack, @NotNull final DrawState state) {
            Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
            Intrinsics.checkNotNullParameter((Object)state, "state");
            final float newX = this.getX() + this.symbolWidth - this.actualSymbolWidth;
            if (!(this.drawable instanceof ListDrawable)) {
                TextDrawable.Companion.drawString$default(TextDrawable.Companion, matrixStack, this.getConfig(), this.getMd().getFontProvider(), this.symbol, newX + state.getXShift(), this.getY() + state.getYShift(), false, false, false, null, 960, null);
            }
            this.drawable.drawCompat(matrixStack, state);
        }
        
        @NotNull
        @Override
        public Cursor<?> cursorAt(final float mouseX, final float mouseY, final boolean dragged, final int mouseButton) {
            return this.drawable.cursorAt(mouseX, mouseY, dragged, mouseButton);
        }
        
        @NotNull
        @Override
        public Cursor<?> cursorAtStart() {
            return this.drawable.cursorAtStart();
        }
        
        @NotNull
        @Override
        public Cursor<?> cursorAtEnd() {
            return this.drawable.cursorAtEnd();
        }
        
        @NotNull
        @Override
        public String selectedText(final boolean asMarkdown) {
            if (!this.hasSelectedText()) {
                return "";
            }
            final String text = this.drawable.selectedText(asMarkdown);
            final ListDrawable this$0 = this.this$0;
            final StringBuilder $this$selectedText_u24lambda_u2d1;
            final StringBuilder sb = $this$selectedText_u24lambda_u2d1 = new StringBuilder();
            final int n = 0;
            for (int access$getIndentLevel$p = ListDrawable.access$getIndentLevel$p(this$0), i = 0; i < access$getIndentLevel$p; ++i) {
                final int it = i;
                final int n2 = 0;
                $this$selectedText_u24lambda_u2d1.append("  ");
            }
            if (asMarkdown) {
                $this$selectedText_u24lambda_u2d1.append(this.symbol);
                $this$selectedText_u24lambda_u2d1.append(' ');
            }
            $this$selectedText_u24lambda_u2d1.append(text);
            final String string = sb.toString();
            Intrinsics.checkNotNullExpressionValue((Object)string, "StringBuilder().apply(builderAction).toString()");
            return string;
        }
    }
}
