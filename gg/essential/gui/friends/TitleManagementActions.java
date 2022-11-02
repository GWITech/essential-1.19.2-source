package gg.essential.gui.friends;

import gg.essential.elementa.components.*;
import kotlin.*;
import kotlin.reflect.*;
import gg.essential.elementa.state.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import gg.essential.gui.common.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000,
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b	\u0010
                                                   \u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u000e\u001a\u00020\u000f8FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0012\u0010
                                                   \u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013""" }, d2 = { "Lgg/essential/gui/friends/TitleManagementActions;", "Lgg/essential/elementa/components/UIContainer;", "gui", "Lgg/essential/gui/friends/SocialMenu;", "(Lgg/essential/gui/friends/SocialMenu;)V", "addButton", "Lgg/essential/elementa/UIComponent;", "getAddButton", "()Lgg/essential/elementa/UIComponent;", "addButton$delegate", "Lkotlin/properties/ReadWriteProperty;", "addDropDownOpen", "Lgg/essential/elementa/state/BasicState;", "", "search", "Lgg/essential/gui/common/EssentialCollapsibleSearchbar;", "getSearch", "()Lgg/essential/gui/common/EssentialCollapsibleSearchbar;", "search$delegate", "essential" })
public final class TitleManagementActions extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final BasicState<Boolean> addDropDownOpen;
    @NotNull
    private final ReadWriteProperty search$delegate;
    
    public TitleManagementActions(@NotNull final SocialMenu gui) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "gui"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    10: aload_0         /* this */
        //    11: new             Lgg/essential/elementa/state/BasicState;
        //    14: dup            
        //    15: iconst_0       
        //    16: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //    19: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    22: putfield        gg/essential/gui/friends/TitleManagementActions.addDropDownOpen:Lgg/essential/elementa/state/BasicState;
        //    25: new             Lgg/essential/gui/common/IconButton;
        //    28: dup            
        //    29: getstatic       gg/essential/gui/EssentialPalette.PLUS_5X:Lgg/essential/gui/image/ImageFactory;
        //    32: aconst_null    
        //    33: aconst_null    
        //    34: iconst_0       
        //    35: iconst_0       
        //    36: iconst_0       
        //    37: bipush          62
        //    39: invokespecial   gg/essential/gui/common/IconButton.<init>:(Lgg/essential/gui/image/ImageFactory;Ljava/lang/String;Ljava/lang/String;ZZZI)V
        //    42: checkcast       Lgg/essential/elementa/UIComponent;
        //    45: astore_2        /* $this$constrain$iv */
        //    46: aload_2         /* $this$constrain$iv */
        //    47: astore          4
        //    49: aload           4
        //    51: astore          $this$constrain_u24lambda_u2d0$iv
        //    53: aload           $this$constrain_u24lambda_u2d0$iv
        //    55: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    58: astore          $this$addButton_delegate_u24lambda_u2d0
        //    60: aload           $this$addButton_delegate_u24lambda_u2d0
        //    62: iconst_0       
        //    63: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    66: checkcast       Ljava/lang/Number;
        //    69: iconst_1       
        //    70: iconst_0       
        //    71: iconst_2       
        //    72: aconst_null    
        //    73: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //    76: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //    79: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //    82: aload           $this$addButton_delegate_u24lambda_u2d0
        //    84: bipush          17
        //    86: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    89: checkcast       Ljava/lang/Number;
        //    92: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //    95: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //    98: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   101: aload           $this$addButton_delegate_u24lambda_u2d0
        //   103: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   106: dup            
        //   107: fconst_0       
        //   108: iconst_1       
        //   109: aconst_null    
        //   110: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   113: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   116: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   119: aload           4
        //   121: astore_2        /* $this$constrain$iv */
        //   122: aload_2        
        //   123: checkcast       Lgg/essential/gui/common/IconButton;
        //   126: astore_3        /* $this$addButton_delegate_u24lambda_u2d1 */
        //   127: aload_3         /* $this$addButton_delegate_u24lambda_u2d1 */
        //   128: checkcast       Lgg/essential/elementa/UIComponent;
        //   131: iconst_0       
        //   132: iconst_0       
        //   133: iconst_3       
        //   134: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //   137: aload_0         /* this */
        //   138: getfield        gg/essential/gui/friends/TitleManagementActions.addDropDownOpen:Lgg/essential/elementa/state/BasicState;
        //   141: checkcast       Lgg/essential/elementa/state/State;
        //   144: invokestatic    gg/essential/gui/common/StateExtensionsKt.or:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/MappedState;
        //   147: astore          hoveredOrOpen
        //   149: aload_3         /* $this$addButton_delegate_u24lambda_u2d1 */
        //   150: getstatic       gg/essential/gui/EssentialPalette.INSTANCE:Lgg/essential/gui/EssentialPalette;
        //   153: aload           hoveredOrOpen
        //   155: checkcast       Lgg/essential/elementa/state/State;
        //   158: invokevirtual   gg/essential/gui/EssentialPalette.getButtonColor:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   161: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   164: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   167: invokevirtual   gg/essential/gui/common/IconButton.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //   170: pop            
        //   171: aload_3         /* $this$addButton_delegate_u24lambda_u2d1 */
        //   172: getstatic       gg/essential/gui/EssentialPalette.INSTANCE:Lgg/essential/gui/EssentialPalette;
        //   175: aload           hoveredOrOpen
        //   177: checkcast       Lgg/essential/elementa/state/State;
        //   180: invokevirtual   gg/essential/gui/EssentialPalette.getTextColor:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   183: invokevirtual   gg/essential/gui/common/IconButton.rebindIconColor:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/IconButton;
        //   186: pop            
        //   187: aload_2        
        //   188: astore_2        /* $this$onLeftClick$iv */
        //   189: aload_2         /* $this$onLeftClick$iv */
        //   190: new             Lgg/essential/gui/friends/TitleManagementActions$special$$inlined$onLeftClick$1;
        //   193: dup            
        //   194: aload_0         /* this */
        //   195: aload_1         /* gui */
        //   196: invokespecial   gg/essential/gui/friends/TitleManagementActions$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/friends/TitleManagementActions;Lgg/essential/gui/friends/SocialMenu;)V
        //   199: checkcast       Lkotlin/jvm/functions/Function2;
        //   202: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   205: aload_0         /* this */
        //   206: checkcast       Lgg/essential/elementa/UIComponent;
        //   209: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   212: aload_0         /* this */
        //   213: getstatic       gg/essential/gui/friends/TitleManagementActions.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   216: iconst_0       
        //   217: aaload         
        //   218: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   221: pop            
        //   222: aload_0         /* this */
        //   223: new             Lgg/essential/gui/common/EssentialCollapsibleSearchbar;
        //   226: dup            
        //   227: ldc             "Search..."
        //   229: getstatic       gg/essential/gui/EssentialPalette.TEXT_HIGHLIGHT:Ljava/awt/Color;
        //   232: aconst_null    
        //   233: iconst_0       
        //   234: iconst_0       
        //   235: iconst_0       
        //   236: bipush          44
        //   238: invokespecial   gg/essential/gui/common/EssentialCollapsibleSearchbar.<init>:(Ljava/lang/String;Ljava/awt/Color;Ljava/lang/String;ZZII)V
        //   241: checkcast       Lgg/essential/elementa/UIComponent;
        //   244: astore_2        /* $this$constrain$iv */
        //   245: aload_2         /* $this$constrain$iv */
        //   246: astore          4
        //   248: aload           4
        //   250: astore          $this$constrain_u24lambda_u2d0$iv
        //   252: aload           $this$constrain_u24lambda_u2d0$iv
        //   254: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   257: astore          6
        //   259: astore          7
        //   261: aload           $this$search_delegate_u24lambda_u2d3
        //   263: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   266: dup            
        //   267: ldc             3.0
        //   269: iconst_1       
        //   270: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZ)V
        //   273: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   276: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   279: aload           7
        //   281: aload           4
        //   283: aload_0         /* this */
        //   284: checkcast       Lgg/essential/elementa/UIComponent;
        //   287: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   290: aload_0         /* this */
        //   291: getstatic       gg/essential/gui/friends/TitleManagementActions.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   294: iconst_1       
        //   295: aaload         
        //   296: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   299: putfield        gg/essential/gui/friends/TitleManagementActions.search$delegate:Lkotlin/properties/ReadWriteProperty;
        //   302: aload_0         /* this */
        //   303: checkcast       Lgg/essential/elementa/UIComponent;
        //   306: astore_2        /* $this$constrain$iv */
        //   307: aload_2         /* $this$constrain$iv */
        //   308: astore          4
        //   310: aload           4
        //   312: astore          $this$constrain_u24lambda_u2d0$iv
        //   314: aload           $this$constrain_u24lambda_u2d0$iv
        //   316: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   319: astore          $this$_init__u24lambda_u2d4
        //   321: aload           $this$_init__u24lambda_u2d4
        //   323: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   326: dup            
        //   327: fconst_0       
        //   328: iconst_1       
        //   329: aconst_null    
        //   330: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   333: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   336: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   339: aload           $this$_init__u24lambda_u2d4
        //   341: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   344: dup            
        //   345: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   348: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   351: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   354: return         
        //    MethodParameters:
        //  Name  Flags  
        //  ----  -----
        //  gui   
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final EssentialCollapsibleSearchbar getSearch() {
        return (EssentialCollapsibleSearchbar)this.search$delegate.getValue((Object)this, (KProperty)TitleManagementActions.$$delegatedProperties[1]);
    }
    
    public static final /* synthetic */ BasicState access$getAddDropDownOpen$p(final TitleManagementActions $this) {
        return $this.addDropDownOpen;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)TitleManagementActions.class, "addButton", "getAddButton()Lgg/essential/elementa/UIComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)TitleManagementActions.class, "search", "getSearch()Lgg/essential/gui/common/EssentialCollapsibleSearchbar;", 0)) };
    }
}
