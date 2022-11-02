package gg.essential.elementa.components.inspector;

import org.jetbrains.annotations.*;
import java.text.*;
import java.awt.*;
import kotlin.jvm.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.dsl.*;
import kotlin.sequences.*;
import gg.essential.universal.*;
import gg.essential.elementa.effects.*;
import gg.essential.elementa.*;
import gg.essential.elementa.utils.*;
import kotlin.ranges.*;
import java.util.*;
import gg.essential.elementa.components.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 32\u00020\u0001:\u00013B9\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\b\u0010#\u001a\u00020$H\u0016J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u0003H\u0002J\u0010\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020)H\u0016J\u0015\u0010*\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0003H\u0000¢\u0006\u0002\b+J\u001a\u0010,\u001a\u0004\u0018\u00010\u00032\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\bH\u0002J\u0017\u0010/\u001a\u00020$2\b\u00100\u001a\u0004\u0018\u00010\u001aH\u0000¢\u0006\u0002\b1J\f\u00102\u001a\u00020\u0016*\u00020\u0003H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u001c\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020 X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00064" }, d2 = { "Lgg/essential/elementa/components/inspector/Inspector;", "Lgg/essential/elementa/components/UIContainer;", "rootComponent", "Lgg/essential/elementa/UIComponent;", "backgroundColor", "Ljava/awt/Color;", "outlineColor", "outlineWidth", "", "maxSectionHeight", "Lgg/essential/elementa/constraints/HeightConstraint;", "(Lgg/essential/elementa/UIComponent;Ljava/awt/Color;Ljava/awt/Color;FLgg/essential/elementa/constraints/HeightConstraint;)V", "TreeListComponent", "Lgg/essential/elementa/components/TreeListComponent;", "clickPos", "Lkotlin/Pair;", "container", "getContainer$Elementa", "()Lgg/essential/elementa/UIComponent;", "infoBlockScroller", "Lgg/essential/elementa/components/ScrollComponent;", "isClickSelecting", "", "outlineEffect", "Lgg/essential/elementa/effects/OutlineEffect;", "rootNode", "Lgg/essential/elementa/components/inspector/InspectorNode;", "<set-?>", "selectedNode", "getSelectedNode$Elementa", "()Lgg/essential/elementa/components/inspector/InspectorNode;", "separator1", "Lgg/essential/elementa/components/UIBlock;", "separator2", "treeBlock", "animationFrame", "", "componentToNode", "component", "draw", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "findAndSelect", "findAndSelect$Elementa", "getClickSelectTarget", "mouseX", "mouseY", "setSelectedNode", "node", "setSelectedNode$Elementa", "isMounted", "Companion", "Elementa" })
public final class Inspector extends UIContainer
{
    @NotNull
    public static final Inspector.Companion Companion;
    @NotNull
    private final InspectorNode rootNode;
    @NotNull
    private final UIContainer treeBlock;
    @NotNull
    private TreeListComponent TreeListComponent;
    @NotNull
    private final UIComponent container;
    @Nullable
    private InspectorNode selectedNode;
    @NotNull
    private final ScrollComponent infoBlockScroller;
    @NotNull
    private final UIBlock separator1;
    @NotNull
    private final UIBlock separator2;
    @Nullable
    private Pair<Float, Float> clickPos;
    @NotNull
    private final OutlineEffect outlineEffect;
    private boolean isClickSelecting;
    @NotNull
    private static final NumberFormat percentFormat;
    
    @JvmOverloads
    public Inspector(@NotNull final UIComponent rootComponent, @NotNull final Color backgroundColor, @NotNull final Color outlineColor, final float outlineWidth, @Nullable final HeightConstraint maxSectionHeight) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "rootComponent"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* backgroundColor */
        //     7: ldc             "backgroundColor"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3         /* outlineColor */
        //    13: ldc             "outlineColor"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: aload_0         /* this */
        //    19: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    22: aload_0         /* this */
        //    23: aload_0         /* this */
        //    24: aload_1         /* rootComponent */
        //    25: invokespecial   gg/essential/elementa/components/inspector/Inspector.componentToNode:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/components/inspector/InspectorNode;
        //    28: putfield        gg/essential/elementa/components/inspector/Inspector.rootNode:Lgg/essential/elementa/components/inspector/InspectorNode;
        //    31: aload_0         /* this */
        //    32: new             Lgg/essential/elementa/effects/OutlineEffect;
        //    35: dup            
        //    36: aload_3         /* outlineColor */
        //    37: fload           outlineWidth
        //    39: iconst_1       
        //    40: iconst_0       
        //    41: aconst_null    
        //    42: bipush          24
        //    44: aconst_null    
        //    45: invokespecial   gg/essential/elementa/effects/OutlineEffect.<init>:(Ljava/awt/Color;FZZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    48: putfield        gg/essential/elementa/components/inspector/Inspector.outlineEffect:Lgg/essential/elementa/effects/OutlineEffect;
        //    51: nop            
        //    52: aload_0         /* this */
        //    53: checkcast       Lgg/essential/elementa/UIComponent;
        //    56: astore          $this$constrain$iv
        //    58: iconst_0       
        //    59: istore          $i$f$constrain
        //    61: aload           $this$constrain$iv
        //    63: astore          8
        //    65: aload           8
        //    67: astore          $this$constrain_u24lambda_u2d0$iv
        //    69: iconst_0       
        //    70: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //    72: aload           $this$constrain_u24lambda_u2d0$iv
        //    74: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    77: astore          $this$_init__u24lambda_u2d0
        //    79: iconst_0       
        //    80: istore          $i$a$-constrain-Inspector$1
        //    82: aload           $this$_init__u24lambda_u2d0
        //    84: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //    87: dup            
        //    88: fconst_0       
        //    89: iconst_1       
        //    90: aconst_null    
        //    91: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    94: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //    97: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   100: aload           $this$_init__u24lambda_u2d0
        //   102: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   105: dup            
        //   106: fconst_0       
        //   107: iconst_1       
        //   108: aconst_null    
        //   109: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   112: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   115: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   118: nop            
        //   119: nop            
        //   120: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   123: pop            
        //   124: aload           8
        //   126: nop            
        //   127: pop            
        //   128: aload_0         /* this */
        //   129: new             Lgg/essential/elementa/components/UIBlock;
        //   132: dup            
        //   133: aload_2         /* backgroundColor */
        //   134: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   137: checkcast       Lgg/essential/elementa/UIComponent;
        //   140: astore          $this$constrain$iv
        //   142: iconst_0       
        //   143: istore          $i$f$constrain
        //   145: aload           $this$constrain$iv
        //   147: astore          8
        //   149: aload           8
        //   151: astore          $this$constrain_u24lambda_u2d0$iv
        //   153: iconst_0       
        //   154: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   156: aload           $this$constrain_u24lambda_u2d0$iv
        //   158: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   161: astore          11
        //   163: astore          17
        //   165: iconst_0       
        //   166: istore          $i$a$-constrain-Inspector$2
        //   168: aload           $this$_init__u24lambda_u2d1
        //   170: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   173: dup            
        //   174: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   177: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   180: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   183: aload           $this$_init__u24lambda_u2d1
        //   185: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   188: dup            
        //   189: fconst_0       
        //   190: iconst_1       
        //   191: aconst_null    
        //   192: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   195: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   198: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   201: nop            
        //   202: aload           17
        //   204: nop            
        //   205: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   208: pop            
        //   209: aload           8
        //   211: nop            
        //   212: aload_0         /* this */
        //   213: getfield        gg/essential/elementa/components/inspector/Inspector.outlineEffect:Lgg/essential/elementa/effects/OutlineEffect;
        //   216: checkcast       Lgg/essential/elementa/effects/Effect;
        //   219: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   222: aload_0         /* this */
        //   223: checkcast       Lgg/essential/elementa/UIComponent;
        //   226: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   229: putfield        gg/essential/elementa/components/inspector/Inspector.container:Lgg/essential/elementa/UIComponent;
        //   232: new             Lgg/essential/elementa/components/UIContainer;
        //   235: dup            
        //   236: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   239: checkcast       Lgg/essential/elementa/UIComponent;
        //   242: astore          $this$constrain$iv
        //   244: iconst_0       
        //   245: istore          $i$f$constrain
        //   247: aload           $this$constrain$iv
        //   249: astore          9
        //   251: aload           9
        //   253: astore          $this$constrain_u24lambda_u2d0$iv
        //   255: iconst_0       
        //   256: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   258: aload           $this$constrain_u24lambda_u2d0$iv
        //   260: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   263: astore          $this$_init__u24lambda_u2d2
        //   265: iconst_0       
        //   266: istore          $i$a$-constrain-Inspector$titleBlock$1
        //   268: aload           $this$_init__u24lambda_u2d2
        //   270: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   273: dup            
        //   274: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   277: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   280: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   283: aload           $this$_init__u24lambda_u2d2
        //   285: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   288: dup            
        //   289: fconst_0       
        //   290: iconst_1       
        //   291: aconst_null    
        //   292: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   295: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   298: bipush          30
        //   300: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   303: checkcast       Ljava/lang/Number;
        //   306: iconst_0       
        //   307: iconst_0       
        //   308: iconst_3       
        //   309: aconst_null    
        //   310: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   313: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   316: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   319: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   322: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   325: aload           $this$_init__u24lambda_u2d2
        //   327: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   330: dup            
        //   331: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   334: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   337: bipush          20
        //   339: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   342: checkcast       Ljava/lang/Number;
        //   345: iconst_0       
        //   346: iconst_0       
        //   347: iconst_3       
        //   348: aconst_null    
        //   349: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   352: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   355: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   358: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   361: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   364: nop            
        //   365: nop            
        //   366: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   369: pop            
        //   370: aload           9
        //   372: nop            
        //   373: checkcast       Lgg/essential/elementa/components/UIContainer;
        //   376: new             Lgg/essential/elementa/components/inspector/Inspector$titleBlock$2;
        //   379: dup            
        //   380: aload_0         /* this */
        //   381: invokespecial   gg/essential/elementa/components/inspector/Inspector$titleBlock$2.<init>:(Lgg/essential/elementa/components/inspector/Inspector;)V
        //   384: checkcast       Lkotlin/jvm/functions/Function2;
        //   387: invokevirtual   gg/essential/elementa/components/UIContainer.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   390: new             Lgg/essential/elementa/components/inspector/Inspector$titleBlock$3;
        //   393: dup            
        //   394: aload_0         /* this */
        //   395: invokespecial   gg/essential/elementa/components/inspector/Inspector$titleBlock$3.<init>:(Lgg/essential/elementa/components/inspector/Inspector;)V
        //   398: checkcast       Lkotlin/jvm/functions/Function1;
        //   401: invokevirtual   gg/essential/elementa/UIComponent.onMouseRelease:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //   404: new             Lgg/essential/elementa/components/inspector/Inspector$titleBlock$4;
        //   407: dup            
        //   408: aload_0         /* this */
        //   409: invokespecial   gg/essential/elementa/components/inspector/Inspector$titleBlock$4.<init>:(Lgg/essential/elementa/components/inspector/Inspector;)V
        //   412: checkcast       Lkotlin/jvm/functions/Function4;
        //   415: invokevirtual   gg/essential/elementa/UIComponent.onMouseDrag:(Lkotlin/jvm/functions/Function4;)Lgg/essential/elementa/UIComponent;
        //   418: aload_0         /* this */
        //   419: getfield        gg/essential/elementa/components/inspector/Inspector.container:Lgg/essential/elementa/UIComponent;
        //   422: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   425: astore          titleBlock
        //   427: new             Lgg/essential/elementa/components/UIText;
        //   430: dup            
        //   431: ldc             "Inspector"
        //   433: iconst_0       
        //   434: aconst_null    
        //   435: bipush          6
        //   437: aconst_null    
        //   438: invokespecial   gg/essential/elementa/components/UIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   441: checkcast       Lgg/essential/elementa/UIComponent;
        //   444: astore          $this$constrain$iv
        //   446: iconst_0       
        //   447: istore          $i$f$constrain
        //   449: aload           $this$constrain$iv
        //   451: astore          10
        //   453: aload           10
        //   455: astore          $this$constrain_u24lambda_u2d0$iv
        //   457: iconst_0       
        //   458: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   460: aload           $this$constrain_u24lambda_u2d0$iv
        //   462: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   465: astore          $this$_init__u24lambda_u2d3
        //   467: iconst_0       
        //   468: istore          $i$a$-constrain-Inspector$title$1
        //   470: aload           $this$_init__u24lambda_u2d3
        //   472: bipush          10
        //   474: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   477: checkcast       Ljava/lang/Number;
        //   480: iconst_0       
        //   481: iconst_0       
        //   482: iconst_3       
        //   483: aconst_null    
        //   484: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   487: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   490: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   493: aload           $this$_init__u24lambda_u2d3
        //   495: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   498: dup            
        //   499: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   502: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   505: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   508: aload           $this$_init__u24lambda_u2d3
        //   510: new             Lgg/essential/elementa/constraints/TextAspectConstraint;
        //   513: dup            
        //   514: invokespecial   gg/essential/elementa/constraints/TextAspectConstraint.<init>:()V
        //   517: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   520: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   523: aload           $this$_init__u24lambda_u2d3
        //   525: bipush          14
        //   527: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   530: checkcast       Ljava/lang/Number;
        //   533: iconst_0       
        //   534: iconst_0       
        //   535: iconst_3       
        //   536: aconst_null    
        //   537: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   540: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   543: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   546: nop            
        //   547: nop            
        //   548: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   551: pop            
        //   552: aload           10
        //   554: nop            
        //   555: aload           titleBlock
        //   557: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   560: checkcast       Lgg/essential/elementa/components/UIText;
        //   563: astore          title
        //   565: getstatic       gg/essential/elementa/components/SVGComponent.Companion:Lgg/essential/elementa/components/SVGComponent$Companion;
        //   568: ldc             "/svg/click.svg"
        //   570: invokevirtual   gg/essential/elementa/components/SVGComponent$Companion.ofResource:(Ljava/lang/String;)Lgg/essential/elementa/components/SVGComponent;
        //   573: checkcast       Lgg/essential/elementa/UIComponent;
        //   576: astore          $this$constrain$iv
        //   578: iconst_0       
        //   579: istore          $i$f$constrain
        //   581: aload           $this$constrain$iv
        //   583: astore          10
        //   585: aload           10
        //   587: astore          $this$constrain_u24lambda_u2d0$iv
        //   589: iconst_0       
        //   590: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   592: aload           $this$constrain_u24lambda_u2d0$iv
        //   594: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   597: astore          $this$_init__u24lambda_u2d4
        //   599: iconst_0       
        //   600: istore          $i$a$-constrain-Inspector$3
        //   602: aload           $this$_init__u24lambda_u2d4
        //   604: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   607: dup            
        //   608: ldc_w           10.0
        //   611: iconst_0       
        //   612: iconst_2       
        //   613: aconst_null    
        //   614: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   617: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   620: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   623: aload           $this$_init__u24lambda_u2d4
        //   625: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   628: dup            
        //   629: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   632: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   635: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   638: aload           $this$_init__u24lambda_u2d4
        //   640: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   643: dup            
        //   644: fconst_1       
        //   645: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(F)V
        //   648: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   651: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   654: aload           $this$_init__u24lambda_u2d4
        //   656: new             Lgg/essential/elementa/constraints/RelativeConstraint;
        //   659: dup            
        //   660: fconst_1       
        //   661: invokespecial   gg/essential/elementa/constraints/RelativeConstraint.<init>:(F)V
        //   664: aload           title
        //   666: checkcast       Lgg/essential/elementa/UIComponent;
        //   669: invokevirtual   gg/essential/elementa/constraints/RelativeConstraint.to:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   672: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   675: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   678: nop            
        //   679: nop            
        //   680: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   683: pop            
        //   684: aload           10
        //   686: nop            
        //   687: checkcast       Lgg/essential/elementa/components/SVGComponent;
        //   690: new             Lgg/essential/elementa/components/inspector/Inspector$4;
        //   693: dup            
        //   694: aload_0         /* this */
        //   695: invokespecial   gg/essential/elementa/components/inspector/Inspector$4.<init>:(Lgg/essential/elementa/components/inspector/Inspector;)V
        //   698: checkcast       Lkotlin/jvm/functions/Function2;
        //   701: invokevirtual   gg/essential/elementa/components/SVGComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   704: aload           titleBlock
        //   706: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   709: pop            
        //   710: aload_0         /* this */
        //   711: new             Lgg/essential/elementa/components/UIBlock;
        //   714: dup            
        //   715: aload_3         /* outlineColor */
        //   716: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   719: checkcast       Lgg/essential/elementa/UIComponent;
        //   722: astore          $this$constrain$iv
        //   724: iconst_0       
        //   725: istore          $i$f$constrain
        //   727: aload           $this$constrain$iv
        //   729: astore          10
        //   731: aload           10
        //   733: astore          $this$constrain_u24lambda_u2d0$iv
        //   735: iconst_0       
        //   736: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   738: aload           $this$constrain_u24lambda_u2d0$iv
        //   740: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   743: astore          13
        //   745: astore          17
        //   747: iconst_0       
        //   748: istore          $i$a$-constrain-Inspector$5
        //   750: aload           $this$_init__u24lambda_u2d5
        //   752: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   755: dup            
        //   756: fconst_0       
        //   757: iconst_0       
        //   758: iconst_3       
        //   759: aconst_null    
        //   760: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   763: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   766: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   769: aload           $this$_init__u24lambda_u2d5
        //   771: iconst_2       
        //   772: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   775: checkcast       Ljava/lang/Number;
        //   778: iconst_0       
        //   779: iconst_0       
        //   780: iconst_3       
        //   781: aconst_null    
        //   782: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   785: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   788: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   791: nop            
        //   792: aload           17
        //   794: nop            
        //   795: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   798: pop            
        //   799: aload           10
        //   801: nop            
        //   802: aload_0         /* this */
        //   803: getfield        gg/essential/elementa/components/inspector/Inspector.container:Lgg/essential/elementa/UIComponent;
        //   806: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   809: checkcast       Lgg/essential/elementa/components/UIBlock;
        //   812: putfield        gg/essential/elementa/components/inspector/Inspector.separator1:Lgg/essential/elementa/components/UIBlock;
        //   815: aload_0         /* this */
        //   816: new             Lgg/essential/elementa/components/UIContainer;
        //   819: dup            
        //   820: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   823: checkcast       Lgg/essential/elementa/UIComponent;
        //   826: astore          $this$constrain$iv
        //   828: iconst_0       
        //   829: istore          $i$f$constrain
        //   831: aload           $this$constrain$iv
        //   833: astore          10
        //   835: aload           10
        //   837: astore          $this$constrain_u24lambda_u2d0$iv
        //   839: iconst_0       
        //   840: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   842: aload           $this$constrain_u24lambda_u2d0$iv
        //   844: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   847: astore          13
        //   849: astore          17
        //   851: iconst_0       
        //   852: istore          $i$a$-constrain-Inspector$6
        //   854: aload           $this$_init__u24lambda_u2d6
        //   856: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   859: dup            
        //   860: fconst_0       
        //   861: iconst_1       
        //   862: aconst_null    
        //   863: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   866: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   869: bipush          10
        //   871: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   874: checkcast       Ljava/lang/Number;
        //   877: iconst_0       
        //   878: iconst_0       
        //   879: iconst_3       
        //   880: aconst_null    
        //   881: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   884: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   887: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   890: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   893: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   896: aload           $this$_init__u24lambda_u2d6
        //   898: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   901: dup            
        //   902: fconst_0       
        //   903: iconst_1       
        //   904: aconst_null    
        //   905: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   908: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   911: bipush          10
        //   913: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   916: checkcast       Ljava/lang/Number;
        //   919: iconst_0       
        //   920: iconst_0       
        //   921: iconst_3       
        //   922: aconst_null    
        //   923: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   926: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   929: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   932: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   935: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   938: nop            
        //   939: aload           17
        //   941: nop            
        //   942: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   945: pop            
        //   946: aload           10
        //   948: nop            
        //   949: checkcast       Lgg/essential/elementa/components/UIContainer;
        //   952: putfield        gg/essential/elementa/components/inspector/Inspector.treeBlock:Lgg/essential/elementa/components/UIContainer;
        //   955: new             Lgg/essential/elementa/components/ScrollComponent;
        //   958: dup            
        //   959: aconst_null    
        //   960: fconst_0       
        //   961: aconst_null    
        //   962: iconst_0       
        //   963: iconst_0       
        //   964: iconst_0       
        //   965: iconst_0       
        //   966: fconst_0       
        //   967: fconst_0       
        //   968: aconst_null    
        //   969: sipush          1023
        //   972: aconst_null    
        //   973: invokespecial   gg/essential/elementa/components/ScrollComponent.<init>:(Ljava/lang/String;FLjava/awt/Color;ZZZZFFLgg/essential/elementa/UIComponent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   976: checkcast       Lgg/essential/elementa/UIComponent;
        //   979: astore          $this$constrain$iv
        //   981: iconst_0       
        //   982: istore          $i$f$constrain
        //   984: aload           $this$constrain$iv
        //   986: astore          11
        //   988: aload           11
        //   990: astore          $this$constrain_u24lambda_u2d0$iv
        //   992: iconst_0       
        //   993: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   995: aload           $this$constrain_u24lambda_u2d0$iv
        //   997: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1000: astore          $this$_init__u24lambda_u2d7
        //  1002: iconst_0       
        //  1003: istore          $i$a$-constrain-Inspector$treeBlockScroller$1
        //  1005: aload           $this$_init__u24lambda_u2d7
        //  1007: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1010: dup            
        //  1011: fconst_0       
        //  1012: iconst_0       
        //  1013: iconst_3       
        //  1014: aconst_null    
        //  1015: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1018: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1021: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1024: aload           $this$_init__u24lambda_u2d7
        //  1026: new             Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1029: dup            
        //  1030: fconst_1       
        //  1031: invokespecial   gg/essential/elementa/constraints/RelativeConstraint.<init>:(F)V
        //  1034: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1037: aload_0         /* this */
        //  1038: getfield        gg/essential/elementa/components/inspector/Inspector.treeBlock:Lgg/essential/elementa/components/UIContainer;
        //  1041: checkcast       Lgg/essential/elementa/UIComponent;
        //  1044: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1047: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1050: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1053: aload           $this$_init__u24lambda_u2d7
        //  1055: new             Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1058: dup            
        //  1059: fconst_1       
        //  1060: invokespecial   gg/essential/elementa/constraints/RelativeConstraint.<init>:(F)V
        //  1063: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1066: aload_0         /* this */
        //  1067: getfield        gg/essential/elementa/components/inspector/Inspector.treeBlock:Lgg/essential/elementa/components/UIContainer;
        //  1070: checkcast       Lgg/essential/elementa/UIComponent;
        //  1073: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1076: aload           maxSectionHeight
        //  1078: ifnonnull       1097
        //  1081: new             Lgg/essential/elementa/constraints/RelativeWindowConstraint;
        //  1084: dup            
        //  1085: ldc_w           0.33333334
        //  1088: invokespecial   gg/essential/elementa/constraints/RelativeWindowConstraint.<init>:(F)V
        //  1091: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1094: goto            1099
        //  1097: aload           maxSectionHeight
        //  1099: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1102: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.coerceAtMost:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/CoerceAtMostConstraint;
        //  1105: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1108: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1111: nop            
        //  1112: nop            
        //  1113: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  1116: pop            
        //  1117: aload           11
        //  1119: nop            
        //  1120: aload_0         /* this */
        //  1121: getfield        gg/essential/elementa/components/inspector/Inspector.container:Lgg/essential/elementa/UIComponent;
        //  1124: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1127: checkcast       Lgg/essential/elementa/components/ScrollComponent;
        //  1130: astore          treeBlockScroller
        //  1132: aload_0         /* this */
        //  1133: getfield        gg/essential/elementa/components/inspector/Inspector.treeBlock:Lgg/essential/elementa/components/UIContainer;
        //  1136: checkcast       Lgg/essential/elementa/UIComponent;
        //  1139: aload           treeBlockScroller
        //  1141: checkcast       Lgg/essential/elementa/UIComponent;
        //  1144: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1147: pop            
        //  1148: aload_0         /* this */
        //  1149: new             Lgg/essential/elementa/components/TreeListComponent;
        //  1152: dup            
        //  1153: aload_0         /* this */
        //  1154: getfield        gg/essential/elementa/components/inspector/Inspector.rootNode:Lgg/essential/elementa/components/inspector/InspectorNode;
        //  1157: checkcast       Lgg/essential/elementa/components/TreeNode;
        //  1160: invokespecial   gg/essential/elementa/components/TreeListComponent.<init>:(Lgg/essential/elementa/components/TreeNode;)V
        //  1163: checkcast       Lgg/essential/elementa/UIComponent;
        //  1166: astore          $this$constrain$iv
        //  1168: iconst_0       
        //  1169: istore          $i$f$constrain
        //  1171: aload           $this$constrain$iv
        //  1173: astore          11
        //  1175: aload           11
        //  1177: astore          $this$constrain_u24lambda_u2d0$iv
        //  1179: iconst_0       
        //  1180: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //  1182: aload           $this$constrain_u24lambda_u2d0$iv
        //  1184: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1187: astore          14
        //  1189: astore          17
        //  1191: iconst_0       
        //  1192: istore          $i$a$-constrain-Inspector$7
        //  1194: aload           $this$_init__u24lambda_u2d8
        //  1196: iconst_5       
        //  1197: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1200: checkcast       Ljava/lang/Number;
        //  1203: iconst_0       
        //  1204: iconst_0       
        //  1205: iconst_3       
        //  1206: aconst_null    
        //  1207: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1210: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1213: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1216: aload           $this$_init__u24lambda_u2d8
        //  1218: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1221: dup            
        //  1222: fconst_0       
        //  1223: iconst_0       
        //  1224: iconst_3       
        //  1225: aconst_null    
        //  1226: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1229: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1232: iconst_5       
        //  1233: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1236: checkcast       Ljava/lang/Number;
        //  1239: iconst_0       
        //  1240: iconst_0       
        //  1241: iconst_3       
        //  1242: aconst_null    
        //  1243: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1246: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1249: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //  1252: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1255: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1258: nop            
        //  1259: aload           17
        //  1261: nop            
        //  1262: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  1265: pop            
        //  1266: aload           11
        //  1268: nop            
        //  1269: aload_0         /* this */
        //  1270: getfield        gg/essential/elementa/components/inspector/Inspector.treeBlock:Lgg/essential/elementa/components/UIContainer;
        //  1273: checkcast       Lgg/essential/elementa/UIComponent;
        //  1276: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1279: checkcast       Lgg/essential/elementa/components/TreeListComponent;
        //  1282: putfield        gg/essential/elementa/components/inspector/Inspector.TreeListComponent:Lgg/essential/elementa/components/TreeListComponent;
        //  1285: aload_0         /* this */
        //  1286: new             Lgg/essential/elementa/components/UIBlock;
        //  1289: dup            
        //  1290: aload_3         /* outlineColor */
        //  1291: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //  1294: checkcast       Lgg/essential/elementa/UIComponent;
        //  1297: astore          $this$constrain$iv
        //  1299: iconst_0       
        //  1300: istore          $i$f$constrain
        //  1302: aload           $this$constrain$iv
        //  1304: astore          11
        //  1306: aload           11
        //  1308: astore          $this$constrain_u24lambda_u2d0$iv
        //  1310: iconst_0       
        //  1311: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //  1313: aload           $this$constrain_u24lambda_u2d0$iv
        //  1315: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1318: astore          14
        //  1320: astore          17
        //  1322: iconst_0       
        //  1323: istore          $i$a$-constrain-Inspector$8
        //  1325: aload           $this$_init__u24lambda_u2d9
        //  1327: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1330: dup            
        //  1331: fconst_0       
        //  1332: iconst_0       
        //  1333: iconst_3       
        //  1334: aconst_null    
        //  1335: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1338: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1341: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1344: aload           $this$_init__u24lambda_u2d9
        //  1346: iconst_2       
        //  1347: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1350: checkcast       Ljava/lang/Number;
        //  1353: iconst_0       
        //  1354: iconst_0       
        //  1355: iconst_3       
        //  1356: aconst_null    
        //  1357: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1360: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1363: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1366: nop            
        //  1367: aload           17
        //  1369: nop            
        //  1370: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  1373: pop            
        //  1374: aload           11
        //  1376: nop            
        //  1377: checkcast       Lgg/essential/elementa/components/UIBlock;
        //  1380: putfield        gg/essential/elementa/components/inspector/Inspector.separator2:Lgg/essential/elementa/components/UIBlock;
        //  1383: new             Lgg/essential/elementa/components/inspector/InfoBlock;
        //  1386: dup            
        //  1387: aload_0         /* this */
        //  1388: invokespecial   gg/essential/elementa/components/inspector/InfoBlock.<init>:(Lgg/essential/elementa/components/inspector/Inspector;)V
        //  1391: checkcast       Lgg/essential/elementa/UIComponent;
        //  1394: astore          $this$constrain$iv
        //  1396: iconst_0       
        //  1397: istore          $i$f$constrain
        //  1399: aload           $this$constrain$iv
        //  1401: astore          12
        //  1403: aload           12
        //  1405: astore          $this$constrain_u24lambda_u2d0$iv
        //  1407: iconst_0       
        //  1408: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //  1410: aload           $this$constrain_u24lambda_u2d0$iv
        //  1412: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1415: astore          $this$_init__u24lambda_u2d10
        //  1417: iconst_0       
        //  1418: istore          $i$a$-constrain-Inspector$infoBlock$1
        //  1420: aload           $this$_init__u24lambda_u2d10
        //  1422: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1425: dup            
        //  1426: fconst_0       
        //  1427: iconst_0       
        //  1428: iconst_3       
        //  1429: aconst_null    
        //  1430: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1433: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1436: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1439: aload           $this$_init__u24lambda_u2d10
        //  1441: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //  1444: dup            
        //  1445: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //  1448: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1451: bipush          10
        //  1453: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1456: checkcast       Ljava/lang/Number;
        //  1459: iconst_0       
        //  1460: iconst_0       
        //  1461: iconst_3       
        //  1462: aconst_null    
        //  1463: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1466: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1469: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //  1472: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1475: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1478: aload           $this$_init__u24lambda_u2d10
        //  1480: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  1483: dup            
        //  1484: fconst_0       
        //  1485: iconst_1       
        //  1486: aconst_null    
        //  1487: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1490: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1493: bipush          10
        //  1495: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1498: checkcast       Ljava/lang/Number;
        //  1501: iconst_0       
        //  1502: iconst_0       
        //  1503: iconst_3       
        //  1504: aconst_null    
        //  1505: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1508: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1511: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //  1514: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1517: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1520: nop            
        //  1521: nop            
        //  1522: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  1525: pop            
        //  1526: aload           12
        //  1528: nop            
        //  1529: checkcast       Lgg/essential/elementa/components/inspector/InfoBlock;
        //  1532: astore          infoBlock
        //  1534: aload_0         /* this */
        //  1535: new             Lgg/essential/elementa/components/ScrollComponent;
        //  1538: dup            
        //  1539: aconst_null    
        //  1540: fconst_0       
        //  1541: aconst_null    
        //  1542: iconst_0       
        //  1543: iconst_0       
        //  1544: iconst_0       
        //  1545: iconst_0       
        //  1546: fconst_0       
        //  1547: fconst_0       
        //  1548: aconst_null    
        //  1549: sipush          1023
        //  1552: aconst_null    
        //  1553: invokespecial   gg/essential/elementa/components/ScrollComponent.<init>:(Ljava/lang/String;FLjava/awt/Color;ZZZZFFLgg/essential/elementa/UIComponent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1556: checkcast       Lgg/essential/elementa/UIComponent;
        //  1559: astore          $this$constrain$iv
        //  1561: iconst_0       
        //  1562: istore          $i$f$constrain
        //  1564: aload           $this$constrain$iv
        //  1566: astore          12
        //  1568: aload           12
        //  1570: astore          $this$constrain_u24lambda_u2d0$iv
        //  1572: iconst_0       
        //  1573: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //  1575: aload           $this$constrain_u24lambda_u2d0$iv
        //  1577: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1580: astore          15
        //  1582: astore          17
        //  1584: iconst_0       
        //  1585: istore          $i$a$-constrain-Inspector$9
        //  1587: aload           $this$_init__u24lambda_u2d11
        //  1589: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1592: dup            
        //  1593: fconst_0       
        //  1594: iconst_0       
        //  1595: iconst_3       
        //  1596: aconst_null    
        //  1597: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1600: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1603: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1606: aload           $this$_init__u24lambda_u2d11
        //  1608: new             Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1611: dup            
        //  1612: fconst_1       
        //  1613: invokespecial   gg/essential/elementa/constraints/RelativeConstraint.<init>:(F)V
        //  1616: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1619: aload           infoBlock
        //  1621: checkcast       Lgg/essential/elementa/UIComponent;
        //  1624: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1627: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1630: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1633: aload           $this$_init__u24lambda_u2d11
        //  1635: new             Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1638: dup            
        //  1639: fconst_1       
        //  1640: invokespecial   gg/essential/elementa/constraints/RelativeConstraint.<init>:(F)V
        //  1643: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1646: aload           infoBlock
        //  1648: checkcast       Lgg/essential/elementa/UIComponent;
        //  1651: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1654: aload           maxSectionHeight
        //  1656: ifnonnull       1675
        //  1659: new             Lgg/essential/elementa/constraints/RelativeWindowConstraint;
        //  1662: dup            
        //  1663: ldc_w           0.33333334
        //  1666: invokespecial   gg/essential/elementa/constraints/RelativeWindowConstraint.<init>:(F)V
        //  1669: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1672: goto            1677
        //  1675: aload           maxSectionHeight
        //  1677: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1680: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.coerceAtMost:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/CoerceAtMostConstraint;
        //  1683: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1686: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1689: nop            
        //  1690: aload           17
        //  1692: nop            
        //  1693: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  1696: pop            
        //  1697: aload           12
        //  1699: nop            
        //  1700: checkcast       Lgg/essential/elementa/components/ScrollComponent;
        //  1703: putfield        gg/essential/elementa/components/inspector/Inspector.infoBlockScroller:Lgg/essential/elementa/components/ScrollComponent;
        //  1706: aload           infoBlock
        //  1708: checkcast       Lgg/essential/elementa/UIComponent;
        //  1711: aload_0         /* this */
        //  1712: getfield        gg/essential/elementa/components/inspector/Inspector.infoBlockScroller:Lgg/essential/elementa/components/ScrollComponent;
        //  1715: checkcast       Lgg/essential/elementa/UIComponent;
        //  1718: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1721: pop            
        //  1722: nop            
        //  1723: return         
        //    MethodParameters:
        //  Name              Flags  
        //  ----------------  -----
        //  rootComponent     
        //  backgroundColor   
        //  outlineColor      
        //  outlineWidth      
        //  maxSectionHeight  
        //    StackMapTable: 00 04 FF 04 49 00 12 07 00 02 07 00 7A 07 01 27 07 01 27 02 07 00 8D 07 00 7A 07 00 E5 07 00 7A 07 00 7A 01 07 00 7A 07 00 7A 01 07 00 87 01 00 07 00 02 00 02 07 00 87 07 00 B8 FF 00 01 00 12 07 00 02 07 00 7A 07 01 27 07 01 27 02 07 00 8D 07 00 7A 07 00 E5 07 00 7A 07 00 7A 01 07 00 7A 07 00 7A 01 07 00 87 01 00 07 00 02 00 03 07 00 87 07 00 B8 07 00 8D FF 02 3F 00 12 07 00 02 07 00 7A 07 01 27 07 01 27 02 07 00 8D 07 00 7A 07 00 E5 07 01 1A 07 01 38 07 00 7A 01 07 00 7A 07 00 7A 01 07 00 87 01 07 00 02 00 02 07 00 87 07 00 B8 FF 00 01 00 12 07 00 02 07 00 7A 07 01 27 07 01 27 02 07 00 8D 07 00 7A 07 00 E5 07 01 1A 07 01 38 07 00 7A 01 07 00 7A 07 00 7A 01 07 00 87 01 07 00 02 00 03 07 00 87 07 00 B8 07 00 8D
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public Inspector(final UIComponent rootComponent, Color backgroundColor, Color outlineColor, float outlineWidth, HeightConstraint maxSectionHeight, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            backgroundColor = new Color(40, 40, 40);
        }
        if ((n & 0x4) != 0x0) {
            outlineColor = new Color(20, 20, 20);
        }
        if ((n & 0x8) != 0x0) {
            outlineWidth = 2.0f;
        }
        if ((n & 0x10) != 0x0) {
            maxSectionHeight = null;
        }
        this(rootComponent, backgroundColor, outlineColor, outlineWidth, maxSectionHeight);
    }
    
    @NotNull
    public final UIComponent getContainer$Elementa() {
        return this.container;
    }
    
    @Nullable
    public final InspectorNode getSelectedNode$Elementa() {
        return this.selectedNode;
    }
    
    private final InspectorNode componentToNode(final UIComponent component) {
        final InspectorNode node = (InspectorNode)new InspectorNode(this, component).withChildren((Function1)new Inspector$componentToNode$node.Inspector$componentToNode$node$1(component, this));
        component.getChildren().addObserver(Inspector::componentToNode$lambda-13);
        return node;
    }
    
    public final void setSelectedNode$Elementa(@Nullable final InspectorNode node) {
        if (node == null) {
            this.container.removeChild(this.separator2);
            this.container.removeChild(this.infoBlockScroller);
        }
        else if (this.selectedNode == null) {
            ComponentsKt.childOf((UIComponent)this.separator2, this.container);
            ComponentsKt.childOf((UIComponent)this.infoBlockScroller, this.container);
        }
        this.selectedNode = node;
    }
    
    private final UIComponent getClickSelectTarget(final float mouseX, final float mouseY) {
        final UIComponent rootComponent = this.rootNode.getTargetComponent();
        final Window window = (rootComponent instanceof Window) ? ((Window)rootComponent) : null;
        UIComponent uiComponent;
        if (window == null) {
            uiComponent = null;
        }
        else {
            final UIComponent hoveredFloatingComponent = window.getHoveredFloatingComponent();
            uiComponent = ((hoveredFloatingComponent == null) ? null : hoveredFloatingComponent.hitTest(mouseX, mouseY));
        }
        final UIComponent uiComponent2 = uiComponent;
        final UIComponent hitComponent = (uiComponent2 == null) ? rootComponent.hitTest(mouseX, mouseY) : uiComponent2;
        return (Intrinsics.areEqual((Object)hitComponent, (Object)this) || hitComponent.isChildOf(this)) ? null : hitComponent;
    }
    
    public final void findAndSelect$Elementa(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final InspectorNode andSelect$findNodeAndExpandParents = findAndSelect$findNodeAndExpandParents(this, component);
        if (andSelect$findNodeAndExpandParents == null) {
            return;
        }
        final InspectorNode node = andSelect$findNodeAndExpandParents;
        if (!Intrinsics.areEqual((Object)this.selectedNode, (Object)node)) {
            node.toggleSelection$Elementa();
        }
    }
    
    private final boolean isMounted(final UIComponent $this$isMounted) {
        return Intrinsics.areEqual((Object)$this$isMounted.getParent(), (Object)$this$isMounted) || ($this$isMounted.getParent().getChildren().contains($this$isMounted) && this.isMounted($this$isMounted.getParent()));
    }
    
    @Override
    public void animationFrame() {
        super.animationFrame();
        Window.Companion.enqueueRenderOperation((Function0<Unit>)new Inspector$animationFrame.Inspector$animationFrame$1(this));
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        if (!this.isMounted(this)) {
            Window.Companion.enqueueRenderOperation((Function0<Unit>)new Inspector$draw.Inspector$draw$1(this));
            return;
        }
        this.separator1.setWidth(UtilitiesKt.pixels$default(this.container.getWidth(), false, false, 3, null));
        this.separator2.setWidth(UtilitiesKt.pixels$default(this.container.getWidth(), false, false, 3, null));
        UIComponent clickSelectTarget;
        if (this.isClickSelecting) {
            final Pair<Float, Float> mousePosition = this.getMousePosition();
            final float mouseX = ((Number)mousePosition.component1()).floatValue();
            final float mouseY = ((Number)mousePosition.component2()).floatValue();
            clickSelectTarget = this.getClickSelectTarget(mouseX, mouseY);
        }
        else {
            final InspectorNode selectedNode = this.selectedNode;
            clickSelectTarget = ((selectedNode == null) ? null : selectedNode.getTargetComponent());
        }
        final UIComponent uiComponent = clickSelectTarget;
        if (uiComponent != null) {
            final UIComponent component = uiComponent;
            final int n = 0;
            final List scissors = CollectionsKt.reversed((Iterable)SequencesKt.toList(SequencesKt.flatMapIterable(SequencesKt.generateSequence((Object)component, (Function1)Inspector$draw$2$scissors.Inspector$draw$2$scissors$1.INSTANCE), (Function1)Inspector$draw$2$scissors.Inspector$draw$2$scissors$2.INSTANCE)));
            final double x1 = component.getLeft();
            final double y1 = component.getTop();
            final double x2 = component.getRight();
            final double y2 = component.getBottom();
            UGraphics.glClear(256);
            Iterable $this$forEach$iv = scissors;
            int $i$f$forEach = 0;
            for (final Object element$iv : $this$forEach$iv) {
                final ScissorEffect it = (ScissorEffect)element$iv;
                final int n2 = 0;
                it.beforeDraw(matrixStack);
            }
            UIBlock.Companion.drawBlock(matrixStack, new Color(129, 212, 250, 100), x1, y1, x2, y2);
            $this$forEach$iv = CollectionsKt.asReversed(scissors);
            $i$f$forEach = 0;
            for (final Object element$iv : $this$forEach$iv) {
                final ScissorEffect it = (ScissorEffect)element$iv;
                final int n3 = 0;
                it.afterDraw(matrixStack);
            }
            UGraphics.enableDepth();
            UGraphics.depthFunc(513);
            final ElementaVersion this_$iv = ElementaVersion.Companion.getV0$Elementa();
            final int $i$f$enableFor = 0;
            final ElementaVersion prevVersion$iv = ElementaVersion.Companion.getActive();
            ElementaVersion.Companion.setActive(this_$iv);
            try {
                final int n4 = 0;
                UIBlock.Companion.drawBlock(matrixStack, new Color(255, 100, 100, 100), x1, y1, x2, y2);
                final Unit instance = Unit.INSTANCE;
            }
            finally {
                ElementaVersion.Companion.setActive(prevVersion$iv);
            }
            UGraphics.depthFunc(515);
            UGraphics.disableDepth();
        }
        final boolean debugState = OptionsKt.getElementaDebug();
        OptionsKt.setElementaDebug(false);
        try {
            super.draw(matrixStack);
        }
        finally {
            OptionsKt.setElementaDebug(debugState);
        }
    }
    
    @JvmOverloads
    public Inspector(@NotNull final UIComponent rootComponent, @NotNull final Color backgroundColor, @NotNull final Color outlineColor, final float outlineWidth) {
        Intrinsics.checkNotNullParameter((Object)rootComponent, "rootComponent");
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
        this(rootComponent, backgroundColor, outlineColor, outlineWidth, null, 16, null);
    }
    
    @JvmOverloads
    public Inspector(@NotNull final UIComponent rootComponent, @NotNull final Color backgroundColor, @NotNull final Color outlineColor) {
        Intrinsics.checkNotNullParameter((Object)rootComponent, "rootComponent");
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter((Object)outlineColor, "outlineColor");
        this(rootComponent, backgroundColor, outlineColor, 0.0f, null, 24, null);
    }
    
    @JvmOverloads
    public Inspector(@NotNull final UIComponent rootComponent, @NotNull final Color backgroundColor) {
        Intrinsics.checkNotNullParameter((Object)rootComponent, "rootComponent");
        Intrinsics.checkNotNullParameter((Object)backgroundColor, "backgroundColor");
        this(rootComponent, backgroundColor, null, 0.0f, null, 28, null);
    }
    
    @JvmOverloads
    public Inspector(@NotNull final UIComponent rootComponent) {
        Intrinsics.checkNotNullParameter((Object)rootComponent, "rootComponent");
        this(rootComponent, null, null, 0.0f, null, 30, null);
    }
    
    private static final void componentToNode$lambda-13(final InspectorNode $node, final Inspector this$0, final UIComponent $component, final Observable $noName_0, final Object event) {
        Intrinsics.checkNotNullParameter((Object)$node, "$node");
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)$component, "$component");
        IndexedValue indexedValue;
        if (event instanceof ObservableAddEvent) {
            indexedValue = ((ObservableAddEvent)event).getElement();
        }
        else if (event instanceof ObservableRemoveEvent) {
            indexedValue = ((ObservableRemoveEvent)event).getElement();
        }
        else {
            if (event instanceof ObservableClearEvent) {
                $node.clearChildren();
            }
            return;
        }
        final IndexedValue indexedValue2 = indexedValue;
        final int index = indexedValue2.component1();
        final Object childComponent = indexedValue2.component2();
        if (Intrinsics.areEqual(childComponent, (Object)this$0)) {
            return;
        }
        final Iterable $this$count$iv = (Iterable)RangesKt.until(0, index);
        final int $i$f$count = 0;
        int n;
        if ($this$count$iv instanceof Collection && ((Collection)$this$count$iv).isEmpty()) {
            n = 0;
        }
        else {
            int count$iv = 0;
            final Iterator iterator = $this$count$iv.iterator();
            while (iterator.hasNext()) {
                final int it;
                final int element$iv = it = ((IntIterator)iterator).nextInt();
                final int n2 = 0;
                if (Intrinsics.areEqual((Object)$component.getChildren().get(it), (Object)this$0) && ++count$iv < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
            n = count$iv;
        }
        final int offset = -n;
        Intrinsics.checkNotNullExpressionValue(event, "event");
        if (event instanceof ObservableAddEvent) {
            final Object o = childComponent;
            if (o == null) {
                throw new NullPointerException("null cannot be cast to non-null type gg.essential.elementa.UIComponent");
            }
            final InspectorNode childNode = this$0.componentToNode((UIComponent)o);
            $node.addChildAt(index + offset, (TreeNode)childNode);
        }
        else if (event instanceof ObservableRemoveEvent) {
            $node.removeChildAt(index + offset);
        }
    }
    
    private static final InspectorNode findAndSelect$findNodeAndExpandParents(final Inspector this$0, final UIComponent component) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: aload_0         /* this$0 */
        //     2: getfield        gg/essential/elementa/components/inspector/Inspector.rootNode:Lgg/essential/elementa/components/inspector/InspectorNode;
        //     5: invokevirtual   gg/essential/elementa/components/inspector/InspectorNode.getTargetComponent:()Lgg/essential/elementa/UIComponent;
        //     8: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    11: ifeq            19
        //    14: aload_0         /* this$0 */
        //    15: getfield        gg/essential/elementa/components/inspector/Inspector.rootNode:Lgg/essential/elementa/components/inspector/InspectorNode;
        //    18: areturn        
        //    19: aload_1         /* component */
        //    20: invokevirtual   gg/essential/elementa/UIComponent.getParent:()Lgg/essential/elementa/UIComponent;
        //    23: aload_1         /* component */
        //    24: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //    27: ifeq            32
        //    30: aconst_null    
        //    31: areturn        
        //    32: aload_0         /* this$0 */
        //    33: aload_1         /* component */
        //    34: invokevirtual   gg/essential/elementa/UIComponent.getParent:()Lgg/essential/elementa/UIComponent;
        //    37: invokestatic    gg/essential/elementa/components/inspector/Inspector.findAndSelect$findNodeAndExpandParents:(Lgg/essential/elementa/components/inspector/Inspector;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/components/inspector/InspectorNode;
        //    40: dup            
        //    41: ifnonnull       47
        //    44: pop            
        //    45: aconst_null    
        //    46: areturn        
        //    47: astore_2        /* parentNode */
        //    48: aload_2         /* parentNode */
        //    49: invokevirtual   gg/essential/elementa/components/inspector/InspectorNode.getDisplayComponent:()Lgg/essential/elementa/components/TreeNode$TreeNodeComponent;
        //    52: astore_3        /* parentDisplay */
        //    53: aload_3         /* parentDisplay */
        //    54: iconst_1       
        //    55: invokevirtual   gg/essential/elementa/components/TreeNode$TreeNodeComponent.setOpened$Elementa:(Z)V
        //    58: aload_3         /* parentDisplay */
        //    59: invokevirtual   gg/essential/elementa/components/TreeNode$TreeNodeComponent.getChildNodes$Elementa:()Ljava/util/List;
        //    62: checkcast       Ljava/lang/Iterable;
        //    65: astore          $this$filterIsInstance$iv
        //    67: iconst_0       
        //    68: istore          $i$f$filterIsInstance
        //    70: aload           $this$filterIsInstance$iv
        //    72: astore          6
        //    74: new             Ljava/util/ArrayList;
        //    77: dup            
        //    78: invokespecial   java/util/ArrayList.<init>:()V
        //    81: checkcast       Ljava/util/Collection;
        //    84: astore          destination$iv$iv
        //    86: iconst_0       
        //    87: istore          $i$f$filterIsInstanceTo
        //    89: aload           $this$filterIsInstanceTo$iv$iv
        //    91: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    96: astore          9
        //    98: aload           9
        //   100: invokeinterface java/util/Iterator.hasNext:()Z
        //   105: ifeq            138
        //   108: aload           9
        //   110: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   115: astore          element$iv$iv
        //   117: aload           element$iv$iv
        //   119: instanceof      Lgg/essential/elementa/components/inspector/InspectorNode;
        //   122: ifeq            98
        //   125: aload           destination$iv$iv
        //   127: aload           element$iv$iv
        //   129: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   134: pop            
        //   135: goto            98
        //   138: aload           destination$iv$iv
        //   140: checkcast       Ljava/util/List;
        //   143: nop            
        //   144: checkcast       Ljava/lang/Iterable;
        //   147: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   152: astore          6
        //   154: aload           6
        //   156: invokeinterface java/util/Iterator.hasNext:()Z
        //   161: ifeq            200
        //   164: aload           6
        //   166: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   171: astore          7
        //   173: aload           7
        //   175: checkcast       Lgg/essential/elementa/components/inspector/InspectorNode;
        //   178: astore          it
        //   180: iconst_0       
        //   181: istore          $i$a$-find-Inspector$findAndSelect$findNodeAndExpandParents$1
        //   183: aload           it
        //   185: invokevirtual   gg/essential/elementa/components/inspector/InspectorNode.getTargetComponent:()Lgg/essential/elementa/UIComponent;
        //   188: aload_1         /* component */
        //   189: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   192: ifeq            154
        //   195: aload           7
        //   197: goto            201
        //   200: aconst_null    
        //   201: checkcast       Lgg/essential/elementa/components/inspector/InspectorNode;
        //   204: areturn        
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  this$0     
        //  component  
        //    StackMapTable: 00 08 13 0C 4E 07 01 6B FF 00 32 00 0A 07 00 02 07 00 7A 07 01 6B 07 02 E4 07 02 05 01 07 02 05 07 02 B3 01 07 02 27 00 00 27 FF 00 0F 00 08 07 00 02 07 00 7A 07 01 6B 07 02 E4 07 02 05 01 07 02 27 07 02 9A 00 00 2D 40 07 02 9A
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static final /* synthetic */ InspectorNode access$componentToNode(final Inspector $this, final UIComponent component) {
        return $this.componentToNode(component);
    }
    
    public static final /* synthetic */ boolean access$isMounted(final Inspector $this, final UIComponent $receiver) {
        return $this.isMounted($receiver);
    }
    
    public static final /* synthetic */ NumberFormat access$getPercentFormat$cp() {
        return Inspector.percentFormat;
    }
    
    public static final /* synthetic */ void access$setClickPos$p(final Inspector $this, final Pair <set-?>) {
        $this.clickPos = (Pair<Float, Float>)<set-?>;
    }
    
    public static final /* synthetic */ Pair access$getClickPos$p(final Inspector $this) {
        return $this.clickPos;
    }
    
    public static final /* synthetic */ void access$setClickSelecting$p(final Inspector $this, final boolean <set-?>) {
        $this.isClickSelecting = <set-?>;
    }
    
    public static final /* synthetic */ UIComponent access$getClickSelectTarget(final Inspector $this, final float mouseX, final float mouseY) {
        return $this.getClickSelectTarget(mouseX, mouseY);
    }
    
    static {
        Companion = new Inspector.Companion((DefaultConstructorMarker)null);
        final NumberFormat percentInstance = NumberFormat.getPercentInstance();
        Intrinsics.checkNotNullExpressionValue((Object)percentInstance, "getPercentInstance()");
        percentFormat = percentInstance;
    }
}
