package gg.essential.vigilance.gui;

import kotlin.*;
import kotlin.reflect.*;
import kotlin.properties.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rR\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001a\u0010\f\u001a\u00020\rX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u000b\u001a\u0004\b\u0015\u0010\t¨\u0006\u001a" }, d2 = { "Lgg/essential/vigilance/gui/Divider;", "Lgg/essential/vigilance/gui/Setting;", "name", "", "description", "(Ljava/lang/String;Ljava/lang/String;)V", "dividerContainer", "Lgg/essential/elementa/components/UIContainer;", "getDividerContainer", "()Lgg/essential/elementa/components/UIContainer;", "dividerContainer$delegate", "Lkotlin/properties/ReadWriteProperty;", "hidden", "", "getHidden$Vigilance", "()Z", "setHidden$Vigilance", "(Z)V", "getName", "()Ljava/lang/String;", "textContainer", "getTextContainer", "textContainer$delegate", "hideMaybe", "", "h", "Vigilance" })
public final class Divider extends Setting
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final String name;
    @NotNull
    private final ReadWriteProperty dividerContainer$delegate;
    @NotNull
    private final ReadWriteProperty textContainer$delegate;
    private boolean hidden;
    
    public Divider(@NotNull final String name, @Nullable final String description) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "name"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: invokespecial   gg/essential/vigilance/gui/Setting.<init>:()V
        //    10: aload_0         /* this */
        //    11: aload_1         /* name */
        //    12: putfield        gg/essential/vigilance/gui/Divider.name:Ljava/lang/String;
        //    15: aload_0         /* this */
        //    16: new             Lgg/essential/elementa/components/UIContainer;
        //    19: dup            
        //    20: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    23: checkcast       Lgg/essential/elementa/UIComponent;
        //    26: astore_3        /* $this$constrain$iv */
        //    27: iconst_0       
        //    28: istore          $i$f$constrain
        //    30: aload_3         /* $this$constrain$iv */
        //    31: astore          5
        //    33: aload           5
        //    35: astore          $this$constrain_u24lambda_u2d0$iv
        //    37: iconst_0       
        //    38: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //    40: aload           $this$constrain_u24lambda_u2d0$iv
        //    42: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    45: astore          8
        //    47: astore          10
        //    49: iconst_0       
        //    50: istore          $i$a$-constrain-Divider$dividerContainer$2
        //    52: aload           $this$dividerContainer_delegate_u24lambda_u2d0
        //    54: bipush          100
        //    56: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    59: checkcast       Ljava/lang/Number;
        //    62: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //    65: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //    68: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //    71: aload           $this$dividerContainer_delegate_u24lambda_u2d0
        //    73: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //    76: dup            
        //    77: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //    80: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //    83: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //    86: nop            
        //    87: aload           10
        //    89: nop            
        //    90: aload           5
        //    92: nop            
        //    93: aload_0         /* this */
        //    94: checkcast       Lgg/essential/elementa/UIComponent;
        //    97: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   100: aload_0         /* this */
        //   101: getstatic       gg/essential/vigilance/gui/Divider.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   104: iconst_0       
        //   105: aaload         
        //   106: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   109: putfield        gg/essential/vigilance/gui/Divider.dividerContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   112: aload_0         /* this */
        //   113: new             Lgg/essential/elementa/components/UIContainer;
        //   116: dup            
        //   117: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   120: checkcast       Lgg/essential/elementa/UIComponent;
        //   123: astore_3        /* $this$constrain$iv */
        //   124: iconst_0       
        //   125: istore          $i$f$constrain
        //   127: aload_3         /* $this$constrain$iv */
        //   128: astore          5
        //   130: aload           5
        //   132: astore          $this$constrain_u24lambda_u2d0$iv
        //   134: iconst_0       
        //   135: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   137: aload           $this$constrain_u24lambda_u2d0$iv
        //   139: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   142: astore          8
        //   144: astore          10
        //   146: iconst_0       
        //   147: istore          $i$a$-constrain-Divider$textContainer$2
        //   149: aload           $this$textContainer_delegate_u24lambda_u2d1
        //   151: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   154: dup            
        //   155: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   158: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   161: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   164: aload           $this$textContainer_delegate_u24lambda_u2d1
        //   166: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   169: dup            
        //   170: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   173: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   176: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   179: aload           $this$textContainer_delegate_u24lambda_u2d1
        //   181: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   184: dup            
        //   185: fconst_0       
        //   186: iconst_1       
        //   187: aconst_null    
        //   188: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   191: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   194: bipush          16
        //   196: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   199: checkcast       Ljava/lang/Number;
        //   202: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   205: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   208: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   211: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   214: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   217: aload           $this$textContainer_delegate_u24lambda_u2d1
        //   219: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   222: dup            
        //   223: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   226: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   229: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   232: nop            
        //   233: aload           10
        //   235: nop            
        //   236: aload           5
        //   238: nop            
        //   239: aload_0         /* this */
        //   240: invokespecial   gg/essential/vigilance/gui/Divider.getDividerContainer:()Lgg/essential/elementa/components/UIContainer;
        //   243: checkcast       Lgg/essential/elementa/UIComponent;
        //   246: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   249: aload_0         /* this */
        //   250: getstatic       gg/essential/vigilance/gui/Divider.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   253: iconst_1       
        //   254: aaload         
        //   255: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   258: putfield        gg/essential/vigilance/gui/Divider.textContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   261: nop            
        //   262: new             Lgg/essential/elementa/components/UIText;
        //   265: dup            
        //   266: aload_0         /* this */
        //   267: getfield        gg/essential/vigilance/gui/Divider.name:Ljava/lang/String;
        //   270: iconst_0       
        //   271: aconst_null    
        //   272: bipush          6
        //   274: aconst_null    
        //   275: invokespecial   gg/essential/elementa/components/UIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   278: checkcast       Lgg/essential/elementa/UIComponent;
        //   281: astore_3        /* $this$constrain$iv */
        //   282: iconst_0       
        //   283: istore          $i$f$constrain
        //   285: aload_3         /* $this$constrain$iv */
        //   286: astore          5
        //   288: aload           5
        //   290: astore          $this$constrain_u24lambda_u2d0$iv
        //   292: iconst_0       
        //   293: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   295: aload           $this$constrain_u24lambda_u2d0$iv
        //   297: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   300: astore          $this$_init__u24lambda_u2d2
        //   302: iconst_0       
        //   303: istore          $i$a$-constrain-Divider$1
        //   305: aload           $this$_init__u24lambda_u2d2
        //   307: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   310: dup            
        //   311: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   314: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   317: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   320: aload           $this$_init__u24lambda_u2d2
        //   322: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   325: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getText$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   328: checkcast       Lgg/essential/elementa/state/State;
        //   331: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   334: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   337: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   340: nop            
        //   341: nop            
        //   342: aload           5
        //   344: nop            
        //   345: aload_0         /* this */
        //   346: invokespecial   gg/essential/vigilance/gui/Divider.getTextContainer:()Lgg/essential/elementa/components/UIContainer;
        //   349: checkcast       Lgg/essential/elementa/UIComponent;
        //   352: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   355: pop            
        //   356: new             Lgg/essential/elementa/components/UIBlock;
        //   359: dup            
        //   360: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   363: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getTextDisabled$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   366: checkcast       Lgg/essential/elementa/state/State;
        //   369: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //   372: checkcast       Lgg/essential/elementa/UIComponent;
        //   375: astore_3        /* $this$constrain$iv */
        //   376: iconst_0       
        //   377: istore          $i$f$constrain
        //   379: aload_3         /* $this$constrain$iv */
        //   380: astore          5
        //   382: aload           5
        //   384: astore          $this$constrain_u24lambda_u2d0$iv
        //   386: iconst_0       
        //   387: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   389: aload           $this$constrain_u24lambda_u2d0$iv
        //   391: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   394: astore          $this$_init__u24lambda_u2d3
        //   396: iconst_0       
        //   397: istore          $i$a$-constrain-Divider$2
        //   399: aload           $this$_init__u24lambda_u2d3
        //   401: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   404: dup            
        //   405: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   408: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   411: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   414: aload           $this$_init__u24lambda_u2d3
        //   416: bipush          50
        //   418: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   421: checkcast       Ljava/lang/Number;
        //   424: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   427: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   430: bipush          50
        //   432: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   435: checkcast       Ljava/lang/Number;
        //   438: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   441: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   444: aload_0         /* this */
        //   445: invokespecial   gg/essential/vigilance/gui/Divider.getTextContainer:()Lgg/essential/elementa/components/UIContainer;
        //   448: checkcast       Lgg/essential/elementa/UIComponent;
        //   451: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   454: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   457: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   460: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   463: aload           $this$_init__u24lambda_u2d3
        //   465: iconst_1       
        //   466: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   469: checkcast       Ljava/lang/Number;
        //   472: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   475: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   478: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   481: nop            
        //   482: nop            
        //   483: aload           5
        //   485: nop            
        //   486: aload_0         /* this */
        //   487: invokespecial   gg/essential/vigilance/gui/Divider.getDividerContainer:()Lgg/essential/elementa/components/UIContainer;
        //   490: checkcast       Lgg/essential/elementa/UIComponent;
        //   493: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   496: pop            
        //   497: aload_0         /* this */
        //   498: getfield        gg/essential/vigilance/gui/Divider.name:Ljava/lang/String;
        //   501: checkcast       Ljava/lang/CharSequence;
        //   504: invokeinterface java/lang/CharSequence.length:()I
        //   509: ifne            516
        //   512: iconst_1       
        //   513: goto            517
        //   516: iconst_0       
        //   517: ifeq            675
        //   520: new             Lgg/essential/elementa/components/UIBlock;
        //   523: dup            
        //   524: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   527: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getTextDisabled$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   530: checkcast       Lgg/essential/elementa/state/State;
        //   533: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //   536: checkcast       Lgg/essential/elementa/UIComponent;
        //   539: astore_3        /* $this$constrain$iv */
        //   540: iconst_0       
        //   541: istore          $i$f$constrain
        //   543: aload_3         /* $this$constrain$iv */
        //   544: astore          5
        //   546: aload           5
        //   548: astore          $this$constrain_u24lambda_u2d0$iv
        //   550: iconst_0       
        //   551: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   553: aload           $this$constrain_u24lambda_u2d0$iv
        //   555: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   558: astore          $this$_init__u24lambda_u2d4
        //   560: iconst_0       
        //   561: istore          $i$a$-constrain-Divider$3
        //   563: aload           $this$_init__u24lambda_u2d4
        //   565: iconst_0       
        //   566: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   569: checkcast       Ljava/lang/Number;
        //   572: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   575: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   578: aload_0         /* this */
        //   579: invokespecial   gg/essential/vigilance/gui/Divider.getTextContainer:()Lgg/essential/elementa/components/UIContainer;
        //   582: checkcast       Lgg/essential/elementa/UIComponent;
        //   585: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   588: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   591: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   594: aload           $this$_init__u24lambda_u2d4
        //   596: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   599: dup            
        //   600: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   603: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   606: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   609: aload           $this$_init__u24lambda_u2d4
        //   611: bipush          100
        //   613: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   616: checkcast       Ljava/lang/Number;
        //   619: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   622: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   625: aload_0         /* this */
        //   626: invokespecial   gg/essential/vigilance/gui/Divider.getTextContainer:()Lgg/essential/elementa/components/UIContainer;
        //   629: checkcast       Lgg/essential/elementa/UIComponent;
        //   632: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   635: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   638: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   641: aload           $this$_init__u24lambda_u2d4
        //   643: iconst_1       
        //   644: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   647: checkcast       Ljava/lang/Number;
        //   650: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   653: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   656: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   659: nop            
        //   660: nop            
        //   661: aload           5
        //   663: nop            
        //   664: aload_0         /* this */
        //   665: invokespecial   gg/essential/vigilance/gui/Divider.getDividerContainer:()Lgg/essential/elementa/components/UIContainer;
        //   668: checkcast       Lgg/essential/elementa/UIComponent;
        //   671: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   674: pop            
        //   675: new             Lgg/essential/elementa/components/UIBlock;
        //   678: dup            
        //   679: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   682: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getTextDisabled$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   685: checkcast       Lgg/essential/elementa/state/State;
        //   688: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //   691: checkcast       Lgg/essential/elementa/UIComponent;
        //   694: astore_3        /* $this$constrain$iv */
        //   695: iconst_0       
        //   696: istore          $i$f$constrain
        //   698: aload_3         /* $this$constrain$iv */
        //   699: astore          5
        //   701: aload           5
        //   703: astore          $this$constrain_u24lambda_u2d0$iv
        //   705: iconst_0       
        //   706: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   708: aload           $this$constrain_u24lambda_u2d0$iv
        //   710: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   713: astore          $this$_init__u24lambda_u2d5
        //   715: iconst_0       
        //   716: istore          $i$a$-constrain-Divider$4
        //   718: aload           $this$_init__u24lambda_u2d5
        //   720: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   723: dup            
        //   724: fconst_0       
        //   725: iconst_0       
        //   726: iconst_3       
        //   727: aconst_null    
        //   728: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   731: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   734: aload_0         /* this */
        //   735: invokespecial   gg/essential/vigilance/gui/Divider.getTextContainer:()Lgg/essential/elementa/components/UIContainer;
        //   738: checkcast       Lgg/essential/elementa/UIComponent;
        //   741: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   744: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   747: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   750: aload           $this$_init__u24lambda_u2d5
        //   752: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   755: dup            
        //   756: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   759: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   762: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   765: aload           $this$_init__u24lambda_u2d5
        //   767: new             Lgg/essential/elementa/constraints/FillConstraint;
        //   770: dup            
        //   771: iconst_0       
        //   772: iconst_1       
        //   773: aconst_null    
        //   774: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   777: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   780: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   783: aload           $this$_init__u24lambda_u2d5
        //   785: iconst_1       
        //   786: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   789: checkcast       Ljava/lang/Number;
        //   792: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   795: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   798: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   801: nop            
        //   802: nop            
        //   803: aload           5
        //   805: nop            
        //   806: aload_0         /* this */
        //   807: invokespecial   gg/essential/vigilance/gui/Divider.getDividerContainer:()Lgg/essential/elementa/components/UIContainer;
        //   810: checkcast       Lgg/essential/elementa/UIComponent;
        //   813: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   816: pop            
        //   817: aload_2         /* description */
        //   818: ifnull          1018
        //   821: new             Lgg/essential/elementa/components/UIWrappedText;
        //   824: dup            
        //   825: aload_2         /* description */
        //   826: iconst_0       
        //   827: aconst_null    
        //   828: iconst_1       
        //   829: iconst_0       
        //   830: fconst_0       
        //   831: aconst_null    
        //   832: bipush          118
        //   834: aconst_null    
        //   835: invokespecial   gg/essential/elementa/components/UIWrappedText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZFLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   838: checkcast       Lgg/essential/elementa/UIComponent;
        //   841: astore_3        /* $this$constrain$iv */
        //   842: iconst_0       
        //   843: istore          $i$f$constrain
        //   845: aload_3         /* $this$constrain$iv */
        //   846: astore          5
        //   848: aload           5
        //   850: astore          $this$constrain_u24lambda_u2d0$iv
        //   852: iconst_0       
        //   853: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   855: aload           $this$constrain_u24lambda_u2d0$iv
        //   857: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   860: astore          $this$_init__u24lambda_u2d6
        //   862: iconst_0       
        //   863: istore          $i$a$-constrain-Divider$5
        //   865: aload           $this$_init__u24lambda_u2d6
        //   867: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   870: dup            
        //   871: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   874: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   877: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   880: aload           $this$_init__u24lambda_u2d6
        //   882: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   885: dup            
        //   886: ldc             13.0
        //   888: iconst_0       
        //   889: iconst_2       
        //   890: aconst_null    
        //   891: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   894: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   897: aload_0         /* this */
        //   898: invokespecial   gg/essential/vigilance/gui/Divider.getTextContainer:()Lgg/essential/elementa/components/UIContainer;
        //   901: checkcast       Lgg/essential/elementa/UIComponent;
        //   904: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   907: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   910: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   913: aload           $this$_init__u24lambda_u2d6
        //   915: bipush          100
        //   917: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   920: checkcast       Ljava/lang/Number;
        //   923: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   926: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   929: ldc             26.0
        //   931: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   934: checkcast       Ljava/lang/Number;
        //   937: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   940: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   943: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   946: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   949: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   952: aload           $this$_init__u24lambda_u2d6
        //   954: aload           $this$_init__u24lambda_u2d6
        //   956: invokevirtual   gg/essential/elementa/UIConstraints.getHeight:()Lgg/essential/elementa/constraints/HeightConstraint;
        //   959: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   962: ldc             5.0
        //   964: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   967: checkcast       Ljava/lang/Number;
        //   970: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   973: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   976: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   979: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   982: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   985: aload           $this$_init__u24lambda_u2d6
        //   987: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   990: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getText$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   993: checkcast       Lgg/essential/elementa/state/State;
        //   996: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   999: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //  1002: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //  1005: nop            
        //  1006: nop            
        //  1007: aload           5
        //  1009: nop            
        //  1010: aload_0         /* this */
        //  1011: checkcast       Lgg/essential/elementa/UIComponent;
        //  1014: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1017: pop            
        //  1018: aload_0         /* this */
        //  1019: checkcast       Lgg/essential/elementa/UIComponent;
        //  1022: astore_3        /* $this$constrain$iv */
        //  1023: iconst_0       
        //  1024: istore          $i$f$constrain
        //  1026: aload_3         /* $this$constrain$iv */
        //  1027: astore          5
        //  1029: aload           5
        //  1031: astore          $this$constrain_u24lambda_u2d0$iv
        //  1033: iconst_0       
        //  1034: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //  1036: aload           $this$constrain_u24lambda_u2d0$iv
        //  1038: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1041: astore          $this$_init__u24lambda_u2d7
        //  1043: iconst_0       
        //  1044: istore          $i$a$-constrain-Divider$6
        //  1046: aload           $this$_init__u24lambda_u2d7
        //  1048: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1051: dup            
        //  1052: ldc             16.0
        //  1054: iconst_0       
        //  1055: iconst_2       
        //  1056: aconst_null    
        //  1057: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1060: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1063: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1066: aload           $this$_init__u24lambda_u2d7
        //  1068: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  1071: dup            
        //  1072: fconst_0       
        //  1073: iconst_1       
        //  1074: aconst_null    
        //  1075: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1078: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1081: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1084: nop            
        //  1085: nop            
        //  1086: nop            
        //  1087: nop            
        //  1088: nop            
        //  1089: return         
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  name         
        //  description  
        //    StackMapTable: 00 04 FF 02 04 00 0B 07 00 02 07 00 D1 07 00 D1 07 00 42 01 07 00 42 07 00 42 01 07 00 58 01 07 00 02 00 00 40 01 FB 00 9D FB 01 56
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final String getName() {
        return this.name;
    }
    
    private final UIContainer getDividerContainer() {
        return (UIContainer)this.dividerContainer$delegate.getValue((Object)this, (KProperty)Divider.$$delegatedProperties[0]);
    }
    
    private final UIContainer getTextContainer() {
        return (UIContainer)this.textContainer$delegate.getValue((Object)this, (KProperty)Divider.$$delegatedProperties[1]);
    }
    
    public final boolean getHidden$Vigilance() {
        return this.hidden;
    }
    
    public final void setHidden$Vigilance(final boolean <set-?>) {
        this.hidden = <set-?>;
    }
    
    public final void hideMaybe(final boolean h) {
        if (h != this.hidden) {
            if (h) {
                this.hide(this.hidden = true);
            }
            else {
                this.hidden = false;
                UIComponent.unhide$default(this, false, 1, null);
            }
        }
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Divider.class, "dividerContainer", "getDividerContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Divider.class, "textContainer", "getTextContainer()Lgg/essential/elementa/components/UIContainer;", 0)) };
    }
}
