package gg.essential.vigilance.gui;

import kotlin.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import gg.essential.vigilance.data.*;
import kotlin.properties.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.state.*;
import java.awt.*;
import gg.essential.elementa.constraints.animation.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015" }, d2 = { "Lgg/essential/vigilance/gui/CategoryLabel;", "Lgg/essential/elementa/components/UIContainer;", "gui", "Lgg/essential/vigilance/gui/SettingsGui;", "category", "Lgg/essential/vigilance/data/Category;", "(Lgg/essential/vigilance/gui/SettingsGui;Lgg/essential/vigilance/data/Category;)V", "isSelected", "", "()Z", "setSelected", "(Z)V", "text", "Lgg/essential/elementa/components/UIText;", "getText", "()Lgg/essential/elementa/components/UIText;", "text$delegate", "Lkotlin/properties/ReadWriteProperty;", "deselect", "", "select", "Vigilance" })
public final class CategoryLabel extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final SettingsGui gui;
    @NotNull
    private final Category category;
    @NotNull
    private final ReadWriteProperty text$delegate;
    private boolean isSelected;
    
    public CategoryLabel(@NotNull final SettingsGui gui, @NotNull final Category category) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "gui"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* category */
        //     7: ldc             "category"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    16: aload_0         /* this */
        //    17: aload_1         /* gui */
        //    18: putfield        gg/essential/vigilance/gui/CategoryLabel.gui:Lgg/essential/vigilance/gui/SettingsGui;
        //    21: aload_0         /* this */
        //    22: aload_2         /* category */
        //    23: putfield        gg/essential/vigilance/gui/CategoryLabel.category:Lgg/essential/vigilance/data/Category;
        //    26: aload_0         /* this */
        //    27: new             Lgg/essential/elementa/components/UIText;
        //    30: dup            
        //    31: aload_0         /* this */
        //    32: getfield        gg/essential/vigilance/gui/CategoryLabel.category:Lgg/essential/vigilance/data/Category;
        //    35: invokevirtual   gg/essential/vigilance/data/Category.getName:()Ljava/lang/String;
        //    38: iconst_0       
        //    39: aconst_null    
        //    40: bipush          6
        //    42: aconst_null    
        //    43: invokespecial   gg/essential/elementa/components/UIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    46: checkcast       Lgg/essential/elementa/UIComponent;
        //    49: astore_3        /* $this$constrain$iv */
        //    50: iconst_0       
        //    51: istore          $i$f$constrain
        //    53: aload_3         /* $this$constrain$iv */
        //    54: astore          5
        //    56: aload           5
        //    58: astore          $this$constrain_u24lambda_u2d0$iv
        //    60: iconst_0       
        //    61: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //    63: aload           $this$constrain_u24lambda_u2d0$iv
        //    65: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    68: astore          8
        //    70: astore          10
        //    72: iconst_0       
        //    73: istore          $i$a$-constrain-CategoryLabel$text$2
        //    75: aload           $this$text_delegate_u24lambda_u2d0
        //    77: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //    80: dup            
        //    81: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //    84: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //    87: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //    90: aload           $this$text_delegate_u24lambda_u2d0
        //    92: new             Lgg/essential/vigilance/gui/elementa/GuiScaleOffsetConstraint;
        //    95: dup            
        //    96: fconst_1       
        //    97: invokespecial   gg/essential/vigilance/gui/elementa/GuiScaleOffsetConstraint.<init>:(F)V
        //   100: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   103: invokevirtual   gg/essential/elementa/UIConstraints.setTextScale:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   106: aload           $this$text_delegate_u24lambda_u2d0
        //   108: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   111: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getText$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   114: checkcast       Lgg/essential/elementa/state/State;
        //   117: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   120: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   123: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   126: nop            
        //   127: aload           10
        //   129: nop            
        //   130: aload           5
        //   132: nop            
        //   133: aload_0         /* this */
        //   134: checkcast       Lgg/essential/elementa/UIComponent;
        //   137: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   140: aload_0         /* this */
        //   141: getstatic       gg/essential/vigilance/gui/CategoryLabel.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   144: iconst_0       
        //   145: aaload         
        //   146: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   149: putfield        gg/essential/vigilance/gui/CategoryLabel.text$delegate:Lkotlin/properties/ReadWriteProperty;
        //   152: nop            
        //   153: aload_0         /* this */
        //   154: checkcast       Lgg/essential/elementa/UIComponent;
        //   157: astore_3        /* $this$constrain$iv */
        //   158: iconst_0       
        //   159: istore          $i$f$constrain
        //   161: aload_3         /* $this$constrain$iv */
        //   162: astore          5
        //   164: aload           5
        //   166: astore          $this$constrain_u24lambda_u2d0$iv
        //   168: iconst_0       
        //   169: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   171: aload           $this$constrain_u24lambda_u2d0$iv
        //   173: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   176: astore          $this$_init__u24lambda_u2d1
        //   178: iconst_0       
        //   179: istore          $i$a$-constrain-CategoryLabel$1
        //   181: aload           $this$_init__u24lambda_u2d1
        //   183: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   186: dup            
        //   187: fconst_0       
        //   188: iconst_0       
        //   189: iconst_3       
        //   190: aconst_null    
        //   191: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   194: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   197: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   200: aload           $this$_init__u24lambda_u2d1
        //   202: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   205: dup            
        //   206: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   209: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   212: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   215: aload           $this$_init__u24lambda_u2d1
        //   217: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   220: dup            
        //   221: fconst_0       
        //   222: iconst_1       
        //   223: aconst_null    
        //   224: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   227: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   230: bipush          8
        //   232: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   235: checkcast       Ljava/lang/Number;
        //   238: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   241: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   244: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   247: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   250: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   253: nop            
        //   254: nop            
        //   255: nop            
        //   256: nop            
        //   257: aload_0         /* this */
        //   258: checkcast       Lgg/essential/elementa/UIComponent;
        //   261: astore_3        /* $this$onLeftClick$iv */
        //   262: iconst_0       
        //   263: istore          $i$f$onLeftClick
        //   265: aload_3         /* $this$onLeftClick$iv */
        //   266: new             Lgg/essential/vigilance/gui/CategoryLabel$special$$inlined$onLeftClick$1;
        //   269: dup            
        //   270: aload_0         /* this */
        //   271: invokespecial   gg/essential/vigilance/gui/CategoryLabel$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/vigilance/gui/CategoryLabel;)V
        //   274: checkcast       Lkotlin/jvm/functions/Function2;
        //   277: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   280: nop            
        //   281: pop            
        //   282: aload_0         /* this */
        //   283: new             Lgg/essential/vigilance/gui/CategoryLabel$3;
        //   286: dup            
        //   287: aload_0         /* this */
        //   288: invokespecial   gg/essential/vigilance/gui/CategoryLabel$3.<init>:(Lgg/essential/vigilance/gui/CategoryLabel;)V
        //   291: checkcast       Lkotlin/jvm/functions/Function1;
        //   294: invokevirtual   gg/essential/vigilance/gui/CategoryLabel.onMouseEnter:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //   297: pop            
        //   298: aload_0         /* this */
        //   299: new             Lgg/essential/vigilance/gui/CategoryLabel$4;
        //   302: dup            
        //   303: aload_0         /* this */
        //   304: invokespecial   gg/essential/vigilance/gui/CategoryLabel$4.<init>:(Lgg/essential/vigilance/gui/CategoryLabel;)V
        //   307: checkcast       Lkotlin/jvm/functions/Function1;
        //   310: invokevirtual   gg/essential/vigilance/gui/CategoryLabel.onMouseLeave:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/UIComponent;
        //   313: pop            
        //   314: nop            
        //   315: return         
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  gui       
        //  category  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final UIText getText() {
        return (UIText)this.text$delegate.getValue((Object)this, (KProperty)CategoryLabel.$$delegatedProperties[0]);
    }
    
    public final boolean isSelected() {
        return this.isSelected;
    }
    
    public final void setSelected(final boolean <set-?>) {
        this.isSelected = <set-?>;
    }
    
    public final void select() {
        this.gui.selectCategory(this.category);
        this.isSelected = true;
        final UIComponent $this$animate$iv = this.getText();
        final int $i$f$animate = 0;
        final UIComponent $this$animate_u24lambda_u2d0$iv = $this$animate$iv;
        final int n = 0;
        final AnimatingConstraints $this$select_u24lambda_u2d3;
        final AnimatingConstraints anim$iv = $this$select_u24lambda_u2d3 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
        final int n2 = 0;
        AnimatingConstraints.setColorAnimation$default($this$select_u24lambda_u2d3, Animations.OUT_EXP, 0.5f, ExtensionsKt.toConstraint(VigilancePalette.INSTANCE.getTextActive$Vigilance()), 0.0f, 8, null);
        $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
    }
    
    public final void deselect() {
        this.isSelected = false;
        final UIComponent $this$animate$iv = this.getText();
        final int $i$f$animate = 0;
        final UIComponent $this$animate_u24lambda_u2d0$iv = $this$animate$iv;
        final int n = 0;
        final AnimatingConstraints $this$deselect_u24lambda_u2d4;
        final AnimatingConstraints anim$iv = $this$deselect_u24lambda_u2d4 = $this$animate_u24lambda_u2d0$iv.makeAnimation();
        final int n2 = 0;
        AnimatingConstraints.setColorAnimation$default($this$deselect_u24lambda_u2d4, Animations.OUT_EXP, 0.5f, ExtensionsKt.toConstraint(VigilancePalette.INSTANCE.getText$Vigilance()), 0.0f, 8, null);
        $this$animate_u24lambda_u2d0$iv.animateTo(anim$iv);
    }
    
    public static final /* synthetic */ UIText access$getText(final CategoryLabel $this) {
        return $this.getText();
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CategoryLabel.class, "text", "getText()Lgg/essential/elementa/components/UIText;", 0)) };
    }
}
