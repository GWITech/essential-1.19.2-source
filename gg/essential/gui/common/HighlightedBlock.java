package gg.essential.gui.common;

import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import java.awt.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.constraints.animation.*;
import gg.essential.elementa.components.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000J
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0007
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0016\b\u0016\u0018\u00002\u00020\u0001:\u0001;BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010	\u001a\u00020\b\u0012\b\b\u0002\u0010
                                                   \u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u0010\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u00020&H\u0016J\u0006\u00102\u001a\u00020\u0000J\u0006\u00103\u001a\u00020\u0000J\u0006\u00104\u001a\u00020\u0000J\b\u00105\u001a\u00020\u0018H\u0014J\u0016\u00106\u001a\u00020&2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0002J\u001a\u00108\u001a\u00020\u00002\u0012\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016J\b\u0010:\u001a\u00020\u0018H\u0014R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eX\u0084\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eX\u0084\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\bX\u0084\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0013\u0010\u0014R&\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016X\u0084\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0019\u0010\u001a"\u0004\b\u001b\u0010\u001cR\u0014\u0010
                                                   \u001a\u00020\u000bX\u0084\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0084\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b!\u0010""\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020&¢\u0006\b
                                                   \u0000\u001a\u0004\b'\u0010(R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eX\u0084\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b*\u0010\u0010R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eX\u0084\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b,\u0010\u0010R\u0014\u0010	\u001a\u00020\bX\u0084\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b-\u0010\u0014R\u0011\u0010.\u001a\u00020&¢\u0006\b
                                                   \u0000\u001a\u0004\b/\u0010(¨\u0006<""" }, d2 = { "Lgg/essential/gui/common/HighlightedBlock;", "Lgg/essential/elementa/components/UIContainer;", "backgroundColor", "Ljava/awt/Color;", "highlightColor", "backgroundHoverColor", "highlightHoverColor", "blockRadius", "", "outlineWidth", "clickBehavior", "Lgg/essential/gui/common/HighlightedBlock$ClickBehavior;", "(Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;FFLgg/essential/gui/common/HighlightedBlock$ClickBehavior;)V", "backgroundColorState", "Lgg/essential/elementa/state/BasicState;", "getBackgroundColorState", "()Lgg/essential/elementa/state/BasicState;", "backgroundHoverColorState", "getBackgroundHoverColorState", "getBlockRadius", "()F", "clickAction", "Lkotlin/Function1;", "Lgg/essential/elementa/events/UIClickEvent;", "", "getClickAction", "()Lkotlin/jvm/functions/Function1;", "setClickAction", "(Lkotlin/jvm/functions/Function1;)V", "getClickBehavior", "()Lgg/essential/gui/common/HighlightedBlock$ClickBehavior;", "clicked", "", "getClicked", "()Z", "setClicked", "(Z)V", "contentContainer", "Lgg/essential/elementa/UIComponent;", "getContentContainer", "()Lgg/essential/elementa/UIComponent;", "highlightColorState", "getHighlightColorState", "highlightHoverColorState", "getHighlightHoverColorState", "getOutlineWidth", "parentContainer", "getParentContainer", "addChild", "component", "constrainBasedOnChildren", "constrainXBasedOnChildren", "constrainYBasedOnChildren", "highlight", "makeComponent", "blockColor", "onClick", "action", "unhighlight", "ClickBehavior", "essential" })
public class HighlightedBlock extends UIContainer
{
    private final float blockRadius;
    private final float outlineWidth;
    @NotNull
    private final ClickBehavior clickBehavior;
    private boolean clicked;
    @NotNull
    private Function1<? super UIClickEvent, Unit> clickAction;
    @NotNull
    private final BasicState<Color> backgroundColorState;
    @NotNull
    private final BasicState<Color> highlightColorState;
    @NotNull
    private final BasicState<Color> backgroundHoverColorState;
    @NotNull
    private final BasicState<Color> highlightHoverColorState;
    @NotNull
    private final UIComponent parentContainer;
    @NotNull
    private final UIComponent contentContainer;
    
    public HighlightedBlock(@NotNull final Color backgroundColor, @NotNull final Color highlightColor, @NotNull final Color backgroundHoverColor, @NotNull final Color highlightHoverColor, final float outlineWidth, @NotNull final ClickBehavior clickBehavior) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "backgroundColor"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* highlightColor */
        //     7: ldc             "highlightColor"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3         /* backgroundHoverColor */
        //    13: ldc             "backgroundHoverColor"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: aload           highlightHoverColor
        //    20: ldc             "highlightHoverColor"
        //    22: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    25: aload           clickBehavior
        //    27: ldc             "clickBehavior"
        //    29: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    32: aload_0         /* this */
        //    33: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    36: aload_0         /* this */
        //    37: fconst_0       
        //    38: putfield        gg/essential/gui/common/HighlightedBlock.blockRadius:F
        //    41: aload_0         /* this */
        //    42: fload           outlineWidth
        //    44: putfield        gg/essential/gui/common/HighlightedBlock.outlineWidth:F
        //    47: aload_0         /* this */
        //    48: aload           clickBehavior
        //    50: putfield        gg/essential/gui/common/HighlightedBlock.clickBehavior:Lgg/essential/gui/common/HighlightedBlock$ClickBehavior;
        //    53: aload_0         /* this */
        //    54: getstatic       gg/essential/gui/common/HighlightedBlock$clickAction$1.INSTANCE:Lgg/essential/gui/common/HighlightedBlock$clickAction$1;
        //    57: checkcast       Lkotlin/jvm/functions/Function1;
        //    60: putfield        gg/essential/gui/common/HighlightedBlock.clickAction:Lkotlin/jvm/functions/Function1;
        //    63: aload_0         /* this */
        //    64: new             Lgg/essential/elementa/state/BasicState;
        //    67: dup            
        //    68: aload_1         /* backgroundColor */
        //    69: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    72: putfield        gg/essential/gui/common/HighlightedBlock.backgroundColorState:Lgg/essential/elementa/state/BasicState;
        //    75: aload_0         /* this */
        //    76: new             Lgg/essential/elementa/state/BasicState;
        //    79: dup            
        //    80: aload_2         /* highlightColor */
        //    81: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    84: putfield        gg/essential/gui/common/HighlightedBlock.highlightColorState:Lgg/essential/elementa/state/BasicState;
        //    87: aload_0         /* this */
        //    88: new             Lgg/essential/elementa/state/BasicState;
        //    91: dup            
        //    92: aload_3         /* backgroundHoverColor */
        //    93: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    96: putfield        gg/essential/gui/common/HighlightedBlock.backgroundHoverColorState:Lgg/essential/elementa/state/BasicState;
        //    99: aload_0         /* this */
        //   100: new             Lgg/essential/elementa/state/BasicState;
        //   103: dup            
        //   104: aload           highlightHoverColor
        //   106: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   109: putfield        gg/essential/gui/common/HighlightedBlock.highlightHoverColorState:Lgg/essential/elementa/state/BasicState;
        //   112: aload_0         /* this */
        //   113: aload_0         /* this */
        //   114: aload_0         /* this */
        //   115: getfield        gg/essential/gui/common/HighlightedBlock.highlightColorState:Lgg/essential/elementa/state/BasicState;
        //   118: invokespecial   gg/essential/gui/common/HighlightedBlock.makeComponent:(Lgg/essential/elementa/state/BasicState;)Lgg/essential/elementa/UIComponent;
        //   121: astore          $this$constrain$iv
        //   123: aload           $this$constrain$iv
        //   125: astore          8
        //   127: aload           8
        //   129: astore          $this$constrain_u24lambda_u2d0$iv
        //   131: aload           $this$constrain_u24lambda_u2d0$iv
        //   133: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   136: astore          10
        //   138: astore          11
        //   140: aload           $this$parentContainer_u24lambda_u2d0
        //   142: bipush          100
        //   144: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   147: checkcast       Ljava/lang/Number;
        //   150: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   153: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   156: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   159: aload           $this$parentContainer_u24lambda_u2d0
        //   161: bipush          100
        //   163: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   166: checkcast       Ljava/lang/Number;
        //   169: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   172: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   175: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   178: aload           11
        //   180: aload           8
        //   182: putfield        gg/essential/gui/common/HighlightedBlock.parentContainer:Lgg/essential/elementa/UIComponent;
        //   185: aload_0         /* this */
        //   186: aload_0         /* this */
        //   187: aload_0         /* this */
        //   188: getfield        gg/essential/gui/common/HighlightedBlock.backgroundColorState:Lgg/essential/elementa/state/BasicState;
        //   191: invokespecial   gg/essential/gui/common/HighlightedBlock.makeComponent:(Lgg/essential/elementa/state/BasicState;)Lgg/essential/elementa/UIComponent;
        //   194: astore          $this$constrain$iv
        //   196: aload           $this$constrain$iv
        //   198: astore          8
        //   200: aload           8
        //   202: astore          $this$constrain_u24lambda_u2d0$iv
        //   204: aload           $this$constrain_u24lambda_u2d0$iv
        //   206: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   209: astore          10
        //   211: astore          11
        //   213: aload           $this$contentContainer_u24lambda_u2d1
        //   215: aload_0         /* this */
        //   216: getfield        gg/essential/gui/common/HighlightedBlock.outlineWidth:F
        //   219: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   222: checkcast       Ljava/lang/Number;
        //   225: iconst_0       
        //   226: iconst_0       
        //   227: iconst_3       
        //   228: aconst_null    
        //   229: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   232: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   235: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   238: aload           $this$contentContainer_u24lambda_u2d1
        //   240: aload_0         /* this */
        //   241: getfield        gg/essential/gui/common/HighlightedBlock.outlineWidth:F
        //   244: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   247: checkcast       Ljava/lang/Number;
        //   250: iconst_0       
        //   251: iconst_0       
        //   252: iconst_3       
        //   253: aconst_null    
        //   254: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   257: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   260: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   263: aload           $this$contentContainer_u24lambda_u2d1
        //   265: bipush          100
        //   267: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   270: checkcast       Ljava/lang/Number;
        //   273: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   276: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   279: aload_0         /* this */
        //   280: getfield        gg/essential/gui/common/HighlightedBlock.outlineWidth:F
        //   283: fconst_2       
        //   284: fmul           
        //   285: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   288: checkcast       Ljava/lang/Number;
        //   291: iconst_0       
        //   292: iconst_0       
        //   293: iconst_3       
        //   294: aconst_null    
        //   295: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   298: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   301: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   304: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   307: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   310: aload           $this$contentContainer_u24lambda_u2d1
        //   312: bipush          100
        //   314: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   317: checkcast       Ljava/lang/Number;
        //   320: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   323: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   326: aload_0         /* this */
        //   327: getfield        gg/essential/gui/common/HighlightedBlock.outlineWidth:F
        //   330: fconst_2       
        //   331: fmul           
        //   332: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   335: checkcast       Ljava/lang/Number;
        //   338: iconst_0       
        //   339: iconst_0       
        //   340: iconst_3       
        //   341: aconst_null    
        //   342: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   345: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   348: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   351: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   354: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   357: aload           11
        //   359: aload           8
        //   361: aload_0         /* this */
        //   362: getfield        gg/essential/gui/common/HighlightedBlock.parentContainer:Lgg/essential/elementa/UIComponent;
        //   365: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   368: putfield        gg/essential/gui/common/HighlightedBlock.contentContainer:Lgg/essential/elementa/UIComponent;
        //   371: aload_0         /* this */
        //   372: checkcast       Lgg/essential/elementa/UIComponent;
        //   375: astore          $this$constrain$iv
        //   377: aload           $this$constrain$iv
        //   379: astore          8
        //   381: aload           8
        //   383: astore          $this$constrain_u24lambda_u2d0$iv
        //   385: aload           $this$constrain_u24lambda_u2d0$iv
        //   387: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   390: astore          $this$_init__u24lambda_u2d2
        //   392: aload           $this$_init__u24lambda_u2d2
        //   394: bipush          100
        //   396: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   399: checkcast       Ljava/lang/Number;
        //   402: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   405: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   408: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   411: aload           $this$_init__u24lambda_u2d2
        //   413: bipush          100
        //   415: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   418: checkcast       Ljava/lang/Number;
        //   421: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.percent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   424: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   427: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   430: aload_0         /* this */
        //   431: aload_0         /* this */
        //   432: getfield        gg/essential/gui/common/HighlightedBlock.parentContainer:Lgg/essential/elementa/UIComponent;
        //   435: invokespecial   gg/essential/elementa/components/UIContainer.addChild:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   438: pop            
        //   439: aload_0         /* this */
        //   440: new             Lgg/essential/gui/common/HighlightedBlock$2;
        //   443: dup            
        //   444: aload_0         /* this */
        //   445: invokespecial   gg/essential/gui/common/HighlightedBlock$2.<init>:(Lgg/essential/gui/common/HighlightedBlock;)V
        //   448: checkcast       Lkotlin/jvm/functions/Function1;
        //   451: invokevirtual   gg/essential/gui/common/HighlightedBlock.onMouseEnter:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //   454: pop            
        //   455: aload_0         /* this */
        //   456: new             Lgg/essential/gui/common/HighlightedBlock$3;
        //   459: dup            
        //   460: aload_0         /* this */
        //   461: invokespecial   gg/essential/gui/common/HighlightedBlock$3.<init>:(Lgg/essential/gui/common/HighlightedBlock;)V
        //   464: checkcast       Lkotlin/jvm/functions/Function1;
        //   467: invokevirtual   gg/essential/gui/common/HighlightedBlock.onMouseLeave:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //   470: pop            
        //   471: aload_0         /* this */
        //   472: checkcast       Lgg/essential/elementa/UIComponent;
        //   475: astore          $this$onLeftClick$iv
        //   477: aload           $this$onLeftClick$iv
        //   479: new             Lgg/essential/gui/common/HighlightedBlock$special$$inlined$onLeftClick$1;
        //   482: dup            
        //   483: aload_0         /* this */
        //   484: invokespecial   gg/essential/gui/common/HighlightedBlock$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/common/HighlightedBlock;)V
        //   487: checkcast       Lkotlin/jvm/functions/Function2;
        //   490: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   493: pop            
        //   494: return         
        //    MethodParameters:
        //  Name                  Flags  
        //  --------------------  -----
        //  backgroundColor       
        //  highlightColor        
        //  backgroundHoverColor  
        //  highlightHoverColor   
        //  outlineWidth          
        //  clickBehavior         
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public HighlightedBlock(final Color backgroundColor, Color highlightColor, Color backgroundHoverColor, Color highlightHoverColor, float outlineWidth, ClickBehavior none, final int n) {
        if ((n & 0x2) != 0x0) {
            highlightColor = backgroundColor;
        }
        if ((n & 0x4) != 0x0) {
            backgroundHoverColor = backgroundColor;
        }
        if ((n & 0x8) != 0x0) {
            highlightHoverColor = highlightColor;
        }
        if ((n & 0x20) != 0x0) {
            outlineWidth = 1.0f;
        }
        if ((n & 0x40) != 0x0) {
            none = ClickBehavior.NONE;
        }
        this(backgroundColor, highlightColor, backgroundHoverColor, highlightHoverColor, outlineWidth, none);
    }
    
    @NotNull
    protected final ClickBehavior getClickBehavior() {
        return this.clickBehavior;
    }
    
    protected final boolean getClicked() {
        return this.clicked;
    }
    
    protected final void setClicked(final boolean <set-?>) {
        this.clicked = <set-?>;
    }
    
    @NotNull
    protected final Function1<UIClickEvent, Unit> getClickAction() {
        return (Function1<UIClickEvent, Unit>)this.clickAction;
    }
    
    @NotNull
    public final UIComponent getParentContainer() {
        return this.parentContainer;
    }
    
    @NotNull
    public final UIComponent getContentContainer() {
        return this.contentContainer;
    }
    
    @NotNull
    public final HighlightedBlock constrainXBasedOnChildren() {
        final HighlightedBlock $this$constrainXBasedOnChildren_u24lambda_u2d7 = this;
        UIComponent $this$constrain_u24lambda_u2d0$iv;
        UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = $this$constrainXBasedOnChildren_u24lambda_u2d7;
        final UIConstraints $this$constrainXBasedOnChildren_u24lambda_u2d7_u24lambda_u2d4 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$constrainXBasedOnChildren_u24lambda_u2d7_u24lambda_u2d4.setWidth(new ChildBasedSizeConstraint(0.0f, 1, null));
        $this$constrain$iv = ($this$constrain_u24lambda_u2d0$iv = $this$constrainXBasedOnChildren_u24lambda_u2d7.parentContainer);
        final UIConstraints $this$constrainXBasedOnChildren_u24lambda_u2d7_u24lambda_u2d5 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$constrainXBasedOnChildren_u24lambda_u2d7_u24lambda_u2d5.setWidth(ConstraintsKt.plus(new ChildBasedSizeConstraint(0.0f, 1, null), UtilitiesKt.pixels$default($this$constrainXBasedOnChildren_u24lambda_u2d7.outlineWidth * 2.0f, false, false, 3, null)));
        $this$constrain$iv = ($this$constrain_u24lambda_u2d0$iv = $this$constrainXBasedOnChildren_u24lambda_u2d7.contentContainer);
        final UIConstraints $this$constrainXBasedOnChildren_u24lambda_u2d7_u24lambda_u2d6 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$constrainXBasedOnChildren_u24lambda_u2d7_u24lambda_u2d6.setX(UtilitiesKt.pixels$default($this$constrainXBasedOnChildren_u24lambda_u2d7.outlineWidth, false, false, 3, null));
        $this$constrainXBasedOnChildren_u24lambda_u2d7_u24lambda_u2d6.setWidth(new ChildBasedSizeConstraint(0.0f, 1, null));
        return this;
    }
    
    @NotNull
    public final HighlightedBlock constrainYBasedOnChildren() {
        final HighlightedBlock $this$constrainYBasedOnChildren_u24lambda_u2d11 = this;
        UIComponent $this$constrain_u24lambda_u2d0$iv;
        UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = $this$constrainYBasedOnChildren_u24lambda_u2d11;
        final UIConstraints $this$constrainYBasedOnChildren_u24lambda_u2d11_u24lambda_u2d8 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$constrainYBasedOnChildren_u24lambda_u2d11_u24lambda_u2d8.setHeight(new ChildBasedSizeConstraint(0.0f, 1, null));
        $this$constrain$iv = ($this$constrain_u24lambda_u2d0$iv = $this$constrainYBasedOnChildren_u24lambda_u2d11.parentContainer);
        final UIConstraints $this$constrainYBasedOnChildren_u24lambda_u2d11_u24lambda_u2d9 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$constrainYBasedOnChildren_u24lambda_u2d11_u24lambda_u2d9.setHeight(ConstraintsKt.plus(new ChildBasedSizeConstraint(0.0f, 1, null), UtilitiesKt.pixels$default($this$constrainYBasedOnChildren_u24lambda_u2d11.outlineWidth * 2.0f, false, false, 3, null)));
        $this$constrain$iv = ($this$constrain_u24lambda_u2d0$iv = $this$constrainYBasedOnChildren_u24lambda_u2d11.contentContainer);
        final UIConstraints $this$constrainYBasedOnChildren_u24lambda_u2d11_u24lambda_u2d10 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$constrainYBasedOnChildren_u24lambda_u2d11_u24lambda_u2d10.setY(UtilitiesKt.pixels$default($this$constrainYBasedOnChildren_u24lambda_u2d11.outlineWidth, false, false, 3, null));
        $this$constrainYBasedOnChildren_u24lambda_u2d11_u24lambda_u2d10.setHeight(new ChildBasedSizeConstraint(0.0f, 1, null));
        return this;
    }
    
    @NotNull
    public final HighlightedBlock constrainBasedOnChildren() {
        final HighlightedBlock $this$constrainBasedOnChildren_u24lambda_u2d12 = this;
        $this$constrainBasedOnChildren_u24lambda_u2d12.constrainXBasedOnChildren();
        $this$constrainBasedOnChildren_u24lambda_u2d12.constrainYBasedOnChildren();
        return this;
    }
    
    @NotNull
    @Override
    public HighlightedBlock addChild(@NotNull final UIComponent component) {
        Intrinsics.checkNotNullParameter((Object)component, "component");
        final HighlightedBlock $this$addChild_u24lambda_u2d13 = this;
        ComponentsKt.childOf(component, $this$addChild_u24lambda_u2d13.contentContainer);
        return this;
    }
    
    protected void highlight() {
        UIComponent $this$animate_u24lambda_u2d0$iv;
        UIComponent $this$animate$iv = $this$animate_u24lambda_u2d0$iv = this.parentContainer;
        final AnimatingConstraints $this$highlight_u24lambda_u2d15;
        AnimatingConstraints anim$iv = $this$highlight_u24lambda_u2d15 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
        AnimatingConstraints.setColorAnimation$default($this$highlight_u24lambda_u2d15, Animations.OUT_EXP, 0.5f, ExtensionsKt.toConstraint(this.highlightHoverColorState), 0.0f, 8, null);
        $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
        $this$animate$iv = ($this$animate_u24lambda_u2d0$iv = this.contentContainer);
        final AnimatingConstraints $this$highlight_u24lambda_u2d16;
        anim$iv = ($this$highlight_u24lambda_u2d16 = $this$animate_u24lambda_u2d0$iv.makeAnimation());
        AnimatingConstraints.setColorAnimation$default($this$highlight_u24lambda_u2d16, Animations.OUT_EXP, 0.5f, ExtensionsKt.toConstraint(this.backgroundHoverColorState), 0.0f, 8, null);
        $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
    }
    
    protected void unhighlight() {
        if (this.clicked && this.clickBehavior == ClickBehavior.STAY_HIGHLIGHTED) {
            return;
        }
        UIComponent $this$animate_u24lambda_u2d0$iv;
        UIComponent $this$animate$iv = $this$animate_u24lambda_u2d0$iv = this.parentContainer;
        final AnimatingConstraints $this$unhighlight_u24lambda_u2d17;
        AnimatingConstraints anim$iv = $this$unhighlight_u24lambda_u2d17 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
        AnimatingConstraints.setColorAnimation$default($this$unhighlight_u24lambda_u2d17, Animations.OUT_EXP, 0.5f, ExtensionsKt.toConstraint(this.highlightColorState), 0.0f, 8, null);
        $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
        $this$animate$iv = ($this$animate_u24lambda_u2d0$iv = this.contentContainer);
        final AnimatingConstraints $this$unhighlight_u24lambda_u2d18;
        anim$iv = ($this$unhighlight_u24lambda_u2d18 = $this$animate_u24lambda_u2d0$iv.makeAnimation());
        AnimatingConstraints.setColorAnimation$default($this$unhighlight_u24lambda_u2d18, Animations.OUT_EXP, 0.5f, ExtensionsKt.toConstraint(this.backgroundColorState), 0.0f, 8, null);
        $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
    }
    
    private final UIComponent makeComponent(final BasicState<Color> blockColor) {
        return new UIBlock(blockColor);
    }
    
    @Override
    public /* bridge */ UIComponent addChild(final UIComponent component) {
        return this.addChild(component);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\f
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0010
                                                       \u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006""" }, d2 = { "Lgg/essential/gui/common/HighlightedBlock$ClickBehavior;", "", "(Ljava/lang/String;I)V", "UNHIGHLIGHT", "STAY_HIGHLIGHTED", "NONE", "essential" })
    public enum ClickBehavior
    {
        UNHIGHLIGHT("UNHIGHLIGHT", 0), 
        STAY_HIGHLIGHTED("STAY_HIGHLIGHTED", 1), 
        NONE("NONE", 2);
        
        private static final /* synthetic */ ClickBehavior[] $VALUES;
        
        private ClickBehavior(final String $enum$name, final int $enum$ordinal) {
        }
        
        public static ClickBehavior[] values() {
            return ClickBehavior.$VALUES.clone();
        }
        
        public static ClickBehavior valueOf(final String value) {
            return Enum.valueOf(ClickBehavior.class, value);
        }
        
        private static final /* synthetic */ ClickBehavior[] $values() {
            return new ClickBehavior[] { ClickBehavior.UNHIGHLIGHT, ClickBehavior.STAY_HIGHLIGHTED, ClickBehavior.NONE };
        }
        
        static {
            $VALUES = $values();
        }
    }
}
