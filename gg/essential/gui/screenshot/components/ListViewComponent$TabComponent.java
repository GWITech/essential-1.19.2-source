package gg.essential.gui.screenshot.components;

import gg.essential.elementa.components.*;
import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.state.*;
import kotlin.*;
import java.awt.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\b\u0010	R&\u0010
                                                   \u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014""" }, d2 = { "Lgg/essential/gui/screenshot/components/ListViewComponent$TabComponent;", "Lgg/essential/elementa/components/UIContainer;", "tab", "Lgg/essential/gui/screenshot/components/ListViewComponent$Tab;", "(Lgg/essential/gui/screenshot/components/ListViewComponent;Lgg/essential/gui/screenshot/components/ListViewComponent$Tab;)V", "hovered", "Lgg/essential/elementa/state/State;", "", "getTab", "()Lgg/essential/gui/screenshot/components/ListViewComponent$Tab;", "textColorState", "Lgg/essential/elementa/state/MappedState;", "Lkotlin/Pair;", "Ljava/awt/Color;", "title", "Lgg/essential/elementa/UIComponent;", "getTitle", "()Lgg/essential/elementa/UIComponent;", "title$delegate", "Lkotlin/properties/ReadWriteProperty;", "essential" })
private final class TabComponent extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final Tab tab;
    @NotNull
    private final State<Boolean> hovered;
    @NotNull
    private final MappedState<Pair<Tab, Boolean>, Color> textColorState;
    final /* synthetic */ ListViewComponent this$0;
    
    public TabComponent(@NotNull final ListViewComponent this$0, final Tab tab) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "tab"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: aload_1         /* this$0 */
        //     8: putfield        gg/essential/gui/screenshot/components/ListViewComponent$TabComponent.this$0:Lgg/essential/gui/screenshot/components/ListViewComponent;
        //    11: aload_0         /* this */
        //    12: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    15: aload_0         /* this */
        //    16: aload_2         /* tab */
        //    17: putfield        gg/essential/gui/screenshot/components/ListViewComponent$TabComponent.tab:Lgg/essential/gui/screenshot/components/ListViewComponent$Tab;
        //    20: aload_0         /* this */
        //    21: aload_0         /* this */
        //    22: checkcast       Lgg/essential/elementa/UIComponent;
        //    25: iconst_0       
        //    26: iconst_0       
        //    27: iconst_3       
        //    28: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //    31: putfield        gg/essential/gui/screenshot/components/ListViewComponent$TabComponent.hovered:Lgg/essential/elementa/state/State;
        //    34: aload_0         /* this */
        //    35: aload_0         /* this */
        //    36: getfield        gg/essential/gui/screenshot/components/ListViewComponent$TabComponent.this$0:Lgg/essential/gui/screenshot/components/ListViewComponent;
        //    39: invokestatic    gg/essential/gui/screenshot/components/ListViewComponent.access$getSelectedTab$p:(Lgg/essential/gui/screenshot/components/ListViewComponent;)Lgg/essential/elementa/state/BasicState;
        //    42: aload_0         /* this */
        //    43: getfield        gg/essential/gui/screenshot/components/ListViewComponent$TabComponent.hovered:Lgg/essential/elementa/state/State;
        //    46: invokevirtual   gg/essential/elementa/state/BasicState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //    49: new             Lgg/essential/gui/screenshot/components/ListViewComponent$TabComponent$textColorState$1;
        //    52: dup            
        //    53: aload_0         /* this */
        //    54: invokespecial   gg/essential/gui/screenshot/components/ListViewComponent$TabComponent$textColorState$1.<init>:(Lgg/essential/gui/screenshot/components/ListViewComponent$TabComponent;)V
        //    57: checkcast       Lkotlin/jvm/functions/Function1;
        //    60: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    63: putfield        gg/essential/gui/screenshot/components/ListViewComponent$TabComponent.textColorState:Lgg/essential/elementa/state/MappedState;
        //    66: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //    69: dup            
        //    70: aload_0         /* this */
        //    71: getfield        gg/essential/gui/screenshot/components/ListViewComponent$TabComponent.tab:Lgg/essential/gui/screenshot/components/ListViewComponent$Tab;
        //    74: invokevirtual   gg/essential/gui/screenshot/components/ListViewComponent$Tab.getNiceName:()Ljava/lang/String;
        //    77: iconst_0       
        //    78: aconst_null    
        //    79: iconst_0       
        //    80: iconst_0       
        //    81: iconst_0       
        //    82: bipush          62
        //    84: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //    87: aload_0         /* this */
        //    88: getfield        gg/essential/gui/screenshot/components/ListViewComponent$TabComponent.textColorState:Lgg/essential/elementa/state/MappedState;
        //    91: checkcast       Lgg/essential/elementa/state/State;
        //    94: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //    97: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   100: invokevirtual   gg/essential/gui/common/shadow/EssentialUIText.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
        //   103: aload_0         /* this */
        //   104: checkcast       Lgg/essential/elementa/UIComponent;
        //   107: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   110: aload_0         /* this */
        //   111: getstatic       gg/essential/gui/screenshot/components/ListViewComponent$TabComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   114: iconst_0       
        //   115: aaload         
        //   116: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   119: pop            
        //   120: aload_0         /* this */
        //   121: checkcast       Lgg/essential/elementa/UIComponent;
        //   124: astore_3        /* $this$constrain$iv */
        //   125: aload_3         /* $this$constrain$iv */
        //   126: astore          5
        //   128: aload           5
        //   130: astore          $this$constrain_u24lambda_u2d0$iv
        //   132: aload           $this$constrain_u24lambda_u2d0$iv
        //   134: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   137: astore          $this$_init__u24lambda_u2d0
        //   139: aload           $this$_init__u24lambda_u2d0
        //   141: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   144: dup            
        //   145: ldc             12.0
        //   147: iconst_0       
        //   148: iconst_2       
        //   149: aconst_null    
        //   150: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   153: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   156: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   159: aload           $this$_init__u24lambda_u2d0
        //   161: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   164: dup            
        //   165: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   168: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   171: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   174: aload           $this$_init__u24lambda_u2d0
        //   176: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   179: dup            
        //   180: fconst_0       
        //   181: iconst_1       
        //   182: aconst_null    
        //   183: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   186: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   189: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   192: aload           $this$_init__u24lambda_u2d0
        //   194: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   197: dup            
        //   198: fconst_0       
        //   199: iconst_1       
        //   200: aconst_null    
        //   201: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   204: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   207: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   210: aload_0         /* this */
        //   211: checkcast       Lgg/essential/elementa/UIComponent;
        //   214: astore_3       
        //   215: aload_0         /* this */
        //   216: getfield        gg/essential/gui/screenshot/components/ListViewComponent$TabComponent.this$0:Lgg/essential/gui/screenshot/components/ListViewComponent;
        //   219: astore          4
        //   221: aload_3         /* $this$onLeftClick$iv */
        //   222: new             Lgg/essential/gui/screenshot/components/ListViewComponent$TabComponent$special$$inlined$onLeftClick$1;
        //   225: dup            
        //   226: aload           4
        //   228: aload_0         /* this */
        //   229: invokespecial   gg/essential/gui/screenshot/components/ListViewComponent$TabComponent$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/screenshot/components/ListViewComponent;Lgg/essential/gui/screenshot/components/ListViewComponent$TabComponent;)V
        //   232: checkcast       Lkotlin/jvm/functions/Function2;
        //   235: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   238: pop            
        //   239: return         
        //    Signature:
        //  (Lgg/essential/gui/screenshot/components/ListViewComponent;Lgg/essential/gui/screenshot/components/ListViewComponent$Tab;)V [from metadata: (Lgg/essential/gui/screenshot/components/ListViewComponent$Tab;)V]
        //  
        //    MethodParameters:
        //  Name    Flags  
        //  ------  -----
        //  this$0  
        //  tab     
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final Tab getTab() {
        return this.tab;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)TabComponent.class, "title", "getTitle()Lgg/essential/elementa/UIComponent;", 0)) };
    }
}
