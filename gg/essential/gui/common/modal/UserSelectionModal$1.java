package gg.essential.gui.common.modal;

import kotlin.jvm.functions.*;
import gg.essential.elementa.components.*;
import kotlin.*;
import kotlin.reflect.*;
import java.util.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "customContent", "Lgg/essential/elementa/components/UIContainer;", "invoke" })
static final class UserSelectionModal$1 extends Lambda implements Function1<UIContainer, Unit> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    final /* synthetic */ UserSelectionModal this$0;
    final /* synthetic */ Set<UUID> $allUsers;
    
    UserSelectionModal$1(final UserSelectionModal $receiver, final Set<UUID> $allUsers) {
        this.this$0 = $receiver;
        this.$allUsers = $allUsers;
        super(1);
    }
    
    public final void invoke(@NotNull final UIContainer customContent) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "customContent"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: getfield        gg/essential/gui/common/modal/UserSelectionModal$1.this$0:Lgg/essential/gui/common/modal/UserSelectionModal;
        //    10: invokevirtual   gg/essential/gui/common/modal/UserSelectionModal.getSpacer:()Lgg/essential/gui/common/Spacer;
        //    13: bipush          10
        //    15: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    18: checkcast       Ljava/lang/Number;
        //    21: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //    24: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //    27: invokevirtual   gg/essential/gui/common/Spacer.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)Lgg/essential/elementa/UIComponent;
        //    30: pop            
        //    31: new             Lgg/essential/gui/common/modal/UserSelectionModal$Searchbar;
        //    34: dup            
        //    35: invokespecial   gg/essential/gui/common/modal/UserSelectionModal$Searchbar.<init>:()V
        //    38: checkcast       Lgg/essential/elementa/UIComponent;
        //    41: astore_3        /* $this$constrain$iv */
        //    42: aload_3         /* $this$constrain$iv */
        //    43: astore          5
        //    45: aload           5
        //    47: astore          $this$constrain_u24lambda_u2d0$iv
        //    49: aload           $this$constrain_u24lambda_u2d0$iv
        //    51: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    54: astore          $this$invoke_u24lambda_u2d0
        //    56: aload           $this$invoke_u24lambda_u2d0
        //    58: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //    61: dup            
        //    62: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //    65: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //    68: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //    71: aload           $this$invoke_u24lambda_u2d0
        //    73: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //    76: dup            
        //    77: fconst_0       
        //    78: iconst_0       
        //    79: iconst_3       
        //    80: aconst_null    
        //    81: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    84: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //    87: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //    90: aload           $this$invoke_u24lambda_u2d0
        //    92: sipush          176
        //    95: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    98: checkcast       Ljava/lang/Number;
        //   101: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   104: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   107: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   110: aload           5
        //   112: aload_1         /* customContent */
        //   113: checkcast       Lgg/essential/elementa/UIComponent;
        //   116: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   119: aconst_null    
        //   120: getstatic       gg/essential/gui/common/modal/UserSelectionModal$1.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   123: iconst_0       
        //   124: aaload         
        //   125: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   128: astore_2        /* search$delegate */
        //   129: aload_0         /* this */
        //   130: getfield        gg/essential/gui/common/modal/UserSelectionModal$1.this$0:Lgg/essential/gui/common/modal/UserSelectionModal;
        //   133: invokestatic    gg/essential/gui/common/modal/UserSelectionModal.access$getScrollContainer:(Lgg/essential/gui/common/modal/UserSelectionModal;)Lgg/essential/elementa/components/UIContainer;
        //   136: checkcast       Lgg/essential/elementa/UIComponent;
        //   139: aload_1         /* customContent */
        //   140: checkcast       Lgg/essential/elementa/UIComponent;
        //   143: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   146: pop            
        //   147: aload_2         /* search$delegate */
        //   148: invokestatic    gg/essential/gui/common/modal/UserSelectionModal$1.invoke$lambda-1:(Lkotlin/properties/ReadWriteProperty;)Lgg/essential/gui/common/modal/UserSelectionModal$Searchbar;
        //   151: invokevirtual   gg/essential/gui/common/modal/UserSelectionModal$Searchbar.getTextState:()Lgg/essential/elementa/state/BasicState;
        //   154: new             Lgg/essential/gui/common/modal/UserSelectionModal$1$1;
        //   157: dup            
        //   158: aload_0         /* this */
        //   159: getfield        gg/essential/gui/common/modal/UserSelectionModal$1.this$0:Lgg/essential/gui/common/modal/UserSelectionModal;
        //   162: invokespecial   gg/essential/gui/common/modal/UserSelectionModal$1$1.<init>:(Lgg/essential/gui/common/modal/UserSelectionModal;)V
        //   165: checkcast       Lkotlin/jvm/functions/Function1;
        //   168: invokevirtual   gg/essential/elementa/state/BasicState.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //   171: pop            
        //   172: aload_0         /* this */
        //   173: getfield        gg/essential/gui/common/modal/UserSelectionModal$1.$allUsers:Ljava/util/Set;
        //   176: checkcast       Ljava/lang/Iterable;
        //   179: astore_3       
        //   180: aload_0         /* this */
        //   181: getfield        gg/essential/gui/common/modal/UserSelectionModal$1.this$0:Lgg/essential/gui/common/modal/UserSelectionModal;
        //   184: astore          4
        //   186: aload_3         /* $this$forEach$iv */
        //   187: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   192: astore          6
        //   194: aload           6
        //   196: invokeinterface java/util/Iterator.hasNext:()Z
        //   201: ifeq            249
        //   204: aload           6
        //   206: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   211: astore          element$iv
        //   213: aload           element$iv
        //   215: checkcast       Ljava/util/UUID;
        //   218: astore          it
        //   220: new             Lgg/essential/gui/common/modal/UserSelectionModal$Friend;
        //   223: dup            
        //   224: aload           4
        //   226: aload           it
        //   228: invokespecial   gg/essential/gui/common/modal/UserSelectionModal$Friend.<init>:(Lgg/essential/gui/common/modal/UserSelectionModal;Ljava/util/UUID;)V
        //   231: checkcast       Lgg/essential/elementa/UIComponent;
        //   234: aload           4
        //   236: invokestatic    gg/essential/gui/common/modal/UserSelectionModal.access$getScroller:(Lgg/essential/gui/common/modal/UserSelectionModal;)Lgg/essential/elementa/components/ScrollComponent;
        //   239: checkcast       Lgg/essential/elementa/UIComponent;
        //   242: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   245: pop            
        //   246: goto            194
        //   249: new             Lgg/essential/gui/common/Spacer;
        //   252: dup            
        //   253: ldc             9.0
        //   255: invokespecial   gg/essential/gui/common/Spacer.<init>:(F)V
        //   258: checkcast       Lgg/essential/elementa/UIComponent;
        //   261: aload_1         /* customContent */
        //   262: checkcast       Lgg/essential/elementa/UIComponent;
        //   265: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   268: pop            
        //   269: return         
        //    MethodParameters:
        //  Name           Flags  
        //  -------------  -----
        //  customContent  
        //    StackMapTable: 00 02 FF 00 C2 00 07 00 07 00 A7 00 00 07 00 0A 00 07 00 A9 00 00 FF 00 36 00 02 00 07 00 A7 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static final Searchbar invoke$lambda-1(final ReadWriteProperty<Object, Searchbar> $search$delegate) {
        return (Searchbar)$search$delegate.getValue((Object)null, (KProperty)UserSelectionModal$1.$$delegatedProperties[0]);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((UIContainer)p1);
        return Unit.INSTANCE;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)UserSelectionModal.class, "search", "<v#0>", 0)) };
    }
}