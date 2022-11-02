package gg.essential.gui.about.components;

import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.reflect.*;
import java.util.*;
import gg.essential.elementa.constraints.*;
import kotlin.properties.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class InfoPage$1$1 extends Lambda implements Function0<Unit> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    final /* synthetic */ List<String> $splitStrings;
    final /* synthetic */ String $linkURI;
    final /* synthetic */ String $linkText;
    final /* synthetic */ InfoPage this$0;
    final /* synthetic */ RelativeConstraint $componentWidth;
    
    InfoPage$1$1(final List<String> $splitStrings, final String $linkURI, final String $linkText, final InfoPage $receiver, final RelativeConstraint $componentWidth) {
        this.$splitStrings = $splitStrings;
        this.$linkURI = $linkURI;
        this.$linkText = $linkText;
        this.this$0 = $receiver;
        this.$componentWidth = $componentWidth;
        super(0);
    }
    
    public final void invoke() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/gui/about/components/InfoPage$1$1.$splitStrings:Ljava/util/List;
        //     4: checkcast       Ljava/lang/Iterable;
        //     7: astore_1       
        //     8: aload_0         /* this */
        //     9: getfield        gg/essential/gui/about/components/InfoPage$1$1.this$0:Lgg/essential/gui/about/components/InfoPage;
        //    12: astore_2       
        //    13: aload_0         /* this */
        //    14: getfield        gg/essential/gui/about/components/InfoPage$1$1.$componentWidth:Lgg/essential/elementa/constraints/RelativeConstraint;
        //    17: astore_3       
        //    18: aload_1         /* $this$forEach$iv */
        //    19: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    24: astore          5
        //    26: aload           5
        //    28: invokeinterface java/util/Iterator.hasNext:()Z
        //    33: ifeq            153
        //    36: aload           5
        //    38: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    43: astore          element$iv
        //    45: aload           element$iv
        //    47: checkcast       Ljava/lang/String;
        //    50: astore          string
        //    52: new             Lgg/essential/elementa/markdown/MarkdownComponent;
        //    55: dup            
        //    56: aload           string
        //    58: getstatic       gg/essential/gui/about/AboutMenu.Companion:Lgg/essential/gui/about/AboutMenu$Companion;
        //    61: invokevirtual   gg/essential/gui/about/AboutMenu$Companion.getMarkdownConfig:()Lgg/essential/elementa/markdown/MarkdownConfig;
        //    64: fconst_0       
        //    65: aconst_null    
        //    66: iconst_1       
        //    67: bipush          12
        //    69: aconst_null    
        //    70: invokespecial   gg/essential/elementa/markdown/MarkdownComponent.<init>:(Ljava/lang/String;Lgg/essential/elementa/markdown/MarkdownConfig;FLgg/essential/elementa/font/FontProvider;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    73: checkcast       Lgg/essential/elementa/UIComponent;
        //    76: astore          $this$constrain$iv
        //    78: aload           $this$constrain$iv
        //    80: astore          9
        //    82: aload           9
        //    84: astore          $this$constrain_u24lambda_u2d0$iv
        //    86: aload           $this$constrain_u24lambda_u2d0$iv
        //    88: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    91: astore          $this$invoke_u24lambda_u2d1_u24lambda_u2d0
        //    93: aload           $this$invoke_u24lambda_u2d1_u24lambda_u2d0
        //    95: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //    98: dup            
        //    99: ldc             4.0
        //   101: iconst_0       
        //   102: iconst_2       
        //   103: aconst_null    
        //   104: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   107: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   110: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   113: aload           $this$invoke_u24lambda_u2d1_u24lambda_u2d0
        //   115: aload_3        
        //   116: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   119: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   122: aload           $this$invoke_u24lambda_u2d1_u24lambda_u2d0
        //   124: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   127: dup            
        //   128: fconst_0       
        //   129: iconst_1       
        //   130: aconst_null    
        //   131: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   134: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   137: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   140: aload           9
        //   142: aload_2        
        //   143: checkcast       Lgg/essential/elementa/UIComponent;
        //   146: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   149: pop            
        //   150: goto            26
        //   153: aload_0         /* this */
        //   154: getfield        gg/essential/gui/about/components/InfoPage$1$1.$linkURI:Ljava/lang/String;
        //   157: checkcast       Ljava/lang/CharSequence;
        //   160: invokeinterface java/lang/CharSequence.length:()I
        //   165: ifle            172
        //   168: iconst_1       
        //   169: goto            173
        //   172: iconst_0       
        //   173: ifeq            381
        //   176: aload_0         /* this */
        //   177: getfield        gg/essential/gui/about/components/InfoPage$1$1.$linkText:Ljava/lang/String;
        //   180: checkcast       Ljava/lang/CharSequence;
        //   183: astore_2       
        //   184: aload_0         /* this */
        //   185: getfield        gg/essential/gui/about/components/InfoPage$1$1.$linkURI:Ljava/lang/String;
        //   188: astore_3       
        //   189: aload_2        
        //   190: invokeinterface java/lang/CharSequence.length:()I
        //   195: ifne            202
        //   198: iconst_1       
        //   199: goto            203
        //   202: iconst_0       
        //   203: ifeq            210
        //   206: aload_3        
        //   207: goto            211
        //   210: aload_2        
        //   211: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/Object;)Ljava/lang/String;
        //   216: aconst_null    
        //   217: aconst_null    
        //   218: aconst_null    
        //   219: astore          12
        //   221: astore          13
        //   223: astore          14
        //   225: astore          15
        //   227: new             Lgg/essential/elementa/components/UIWrappedText;
        //   230: dup            
        //   231: aload           15
        //   233: iconst_0       
        //   234: aload           14
        //   236: iconst_1       
        //   237: iconst_0       
        //   238: ldc             12.0
        //   240: aload           13
        //   242: bipush          86
        //   244: aload           12
        //   246: invokespecial   gg/essential/elementa/components/UIWrappedText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZFLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   249: checkcast       Lgg/essential/elementa/UIComponent;
        //   252: astore_2        /* $this$constrain$iv */
        //   253: aload_2         /* $this$constrain$iv */
        //   254: astore          4
        //   256: aload           4
        //   258: astore          $this$constrain_u24lambda_u2d0$iv
        //   260: aload           $this$constrain_u24lambda_u2d0$iv
        //   262: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   265: astore          $this$invoke_u24lambda_u2d3
        //   267: aload           $this$invoke_u24lambda_u2d3
        //   269: iconst_0       
        //   270: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   273: checkcast       Ljava/lang/Number;
        //   276: iconst_1       
        //   277: iconst_0       
        //   278: iconst_2       
        //   279: aconst_null    
        //   280: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   283: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   286: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   289: aload           $this$invoke_u24lambda_u2d3
        //   291: bipush          60
        //   293: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   296: checkcast       Ljava/lang/Number;
        //   299: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   302: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   305: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   308: aload           4
        //   310: astore_2        /* $this$constrain$iv */
        //   311: aload_0         /* this */
        //   312: getfield        gg/essential/gui/about/components/InfoPage$1$1.$linkURI:Ljava/lang/String;
        //   315: astore_3       
        //   316: aload_2         /* $this$onLeftClick$iv */
        //   317: new             Lgg/essential/gui/about/components/InfoPage$1$1$invoke$$inlined$onLeftClick$1;
        //   320: dup            
        //   321: aload_3        
        //   322: invokespecial   gg/essential/gui/about/components/InfoPage$1$1$invoke$$inlined$onLeftClick$1.<init>:(Ljava/lang/String;)V
        //   325: checkcast       Lkotlin/jvm/functions/Function2;
        //   328: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   331: aload_0         /* this */
        //   332: getfield        gg/essential/gui/about/components/InfoPage$1$1.this$0:Lgg/essential/gui/about/components/InfoPage;
        //   335: checkcast       Lgg/essential/elementa/UIComponent;
        //   338: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   341: aconst_null    
        //   342: getstatic       gg/essential/gui/about/components/InfoPage$1$1.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   345: iconst_0       
        //   346: aaload         
        //   347: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   350: astore_1        /* link$delegate */
        //   351: aload_1         /* link$delegate */
        //   352: invokestatic    gg/essential/gui/about/components/InfoPage$1$1.invoke$lambda-5:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/UIComponent;
        //   355: getstatic       gg/essential/gui/EssentialPalette.INSTANCE:Lgg/essential/gui/EssentialPalette;
        //   358: aload_1         /* link$delegate */
        //   359: invokestatic    gg/essential/gui/about/components/InfoPage$1$1.invoke$lambda-5:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/elementa/UIComponent;
        //   362: iconst_0       
        //   363: iconst_0       
        //   364: iconst_3       
        //   365: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //   368: invokevirtual   gg/essential/gui/EssentialPalette.getLinkColor:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   371: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   374: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   377: invokevirtual   gg/essential/elementa/UIComponent.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //   380: pop            
        //   381: return         
        //    StackMapTable: 00 09 FF 00 1A 00 06 07 00 02 00 07 00 0A 07 00 45 00 07 00 47 00 00 FF 00 7E 00 01 07 00 02 00 00 12 40 01 FE 00 1C 00 07 00 8F 07 00 51 40 01 FA 00 06 FF 00 00 00 01 07 00 02 00 01 07 00 8F FA 00 A9
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static final UIComponent invoke$lambda-5(final ReadWriteProperty<Object, UIComponent> $link$delegate) {
        return (UIComponent)$link$delegate.getValue((Object)null, InfoPage$1$1.$$delegatedProperties[0]);
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
    
    static {
        InfoPage$1$1.$$delegatedProperties = new KProperty[] { (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)InfoPage.class, "link", "<v#0>", 0)) };
    }
}