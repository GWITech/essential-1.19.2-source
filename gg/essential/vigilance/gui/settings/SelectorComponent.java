package gg.essential.vigilance.gui.settings;

import kotlin.*;
import kotlin.reflect.*;
import kotlin.properties.*;
import org.jetbrains.annotations.*;
import java.util.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u001b\u0010\b\u001a\u00020\t8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b¨\u0006\u0012" }, d2 = { "Lgg/essential/vigilance/gui/settings/SelectorComponent;", "Lgg/essential/vigilance/gui/settings/SettingComponent;", "initialSelection", "", "options", "", "", "(ILjava/util/List;)V", "dropDown", "Lgg/essential/vigilance/gui/settings/DropDownComponent;", "getDropDown$Vigilance", "()Lgg/essential/vigilance/gui/settings/DropDownComponent;", "dropDown$delegate", "Lkotlin/properties/ReadWriteProperty;", "closePopups", "", "instantly", "", "Vigilance" })
public final class SelectorComponent extends SettingComponent
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final ReadWriteProperty dropDown$delegate;
    
    public SelectorComponent(final int initialSelection, @NotNull final List<String> options) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "options"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: invokespecial   gg/essential/vigilance/gui/settings/SettingComponent.<init>:()V
        //    10: aload_0         /* this */
        //    11: iload_1         /* initialSelection */
        //    12: aload_2         /* options */
        //    13: checkcast       Ljava/lang/Iterable;
        //    16: astore_3       
        //    17: istore          13
        //    19: astore          12
        //    21: iconst_0       
        //    22: istore          $i$f$map
        //    24: aload_3         /* $this$map$iv */
        //    25: astore          5
        //    27: new             Ljava/util/ArrayList;
        //    30: dup            
        //    31: aload_3         /* $this$map$iv */
        //    32: bipush          10
        //    34: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    37: invokespecial   java/util/ArrayList.<init>:(I)V
        //    40: checkcast       Ljava/util/Collection;
        //    43: astore          destination$iv$iv
        //    45: iconst_0       
        //    46: istore          $i$f$mapTo
        //    48: aload           $this$mapTo$iv$iv
        //    50: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    55: astore          8
        //    57: aload           8
        //    59: invokeinterface java/util/Iterator.hasNext:()Z
        //    64: ifeq            110
        //    67: aload           8
        //    69: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    74: astore          item$iv$iv
        //    76: aload           destination$iv$iv
        //    78: aload           item$iv$iv
        //    80: checkcast       Ljava/lang/String;
        //    83: astore          10
        //    85: astore          14
        //    87: iconst_0       
        //    88: istore          $i$a$-map-SelectorComponent$dropDown$2
        //    90: getstatic       gg/essential/vigilance/impl/I18n.INSTANCE:Lgg/essential/vigilance/impl/I18n;
        //    93: aload           it
        //    95: invokevirtual   gg/essential/vigilance/impl/I18n.format:(Ljava/lang/String;)Ljava/lang/String;
        //    98: aload           14
        //   100: swap           
        //   101: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   106: pop            
        //   107: goto            57
        //   110: aload           destination$iv$iv
        //   112: checkcast       Ljava/util/List;
        //   115: nop            
        //   116: astore          14
        //   118: aload           12
        //   120: iload           13
        //   122: aload           14
        //   124: iconst_0       
        //   125: iconst_4       
        //   126: aconst_null    
        //   127: astore          15
        //   129: istore          16
        //   131: istore          17
        //   133: astore          18
        //   135: istore          19
        //   137: new             Lgg/essential/vigilance/gui/settings/DropDownComponent;
        //   140: dup            
        //   141: iload           19
        //   143: aload           18
        //   145: iload           17
        //   147: iload           16
        //   149: aload           15
        //   151: invokespecial   gg/essential/vigilance/gui/settings/DropDownComponent.<init>:(ILjava/util/List;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   154: checkcast       Lgg/essential/elementa/UIComponent;
        //   157: aload_0         /* this */
        //   158: checkcast       Lgg/essential/elementa/UIComponent;
        //   161: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   164: aload_0         /* this */
        //   165: getstatic       gg/essential/vigilance/gui/settings/SelectorComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   168: iconst_0       
        //   169: aaload         
        //   170: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   173: putfield        gg/essential/vigilance/gui/settings/SelectorComponent.dropDown$delegate:Lkotlin/properties/ReadWriteProperty;
        //   176: nop            
        //   177: aload_0         /* this */
        //   178: checkcast       Lgg/essential/elementa/UIComponent;
        //   181: astore_3        /* $this$constrain$iv */
        //   182: iconst_0       
        //   183: istore          $i$f$constrain
        //   185: aload_3         /* $this$constrain$iv */
        //   186: astore          5
        //   188: aload           5
        //   190: astore          $this$constrain_u24lambda_u2d0$iv
        //   192: iconst_0       
        //   193: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   195: aload           $this$constrain_u24lambda_u2d0$iv
        //   197: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   200: astore          $this$_init__u24lambda_u2d1
        //   202: iconst_0       
        //   203: istore          $i$a$-constrain-SelectorComponent$1
        //   205: aload           $this$_init__u24lambda_u2d1
        //   207: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   210: dup            
        //   211: fconst_0       
        //   212: iconst_1       
        //   213: aconst_null    
        //   214: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   217: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   220: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   223: aload           $this$_init__u24lambda_u2d1
        //   225: bipush          17
        //   227: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   230: checkcast       Ljava/lang/Number;
        //   233: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   236: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   239: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   242: nop            
        //   243: nop            
        //   244: nop            
        //   245: nop            
        //   246: aload_0         /* this */
        //   247: invokevirtual   gg/essential/vigilance/gui/settings/SelectorComponent.getDropDown$Vigilance:()Lgg/essential/vigilance/gui/settings/DropDownComponent;
        //   250: invokevirtual   gg/essential/vigilance/gui/settings/DropDownComponent.getSelectedIndex:()Lgg/essential/elementa/state/State;
        //   253: new             Lgg/essential/vigilance/gui/settings/SelectorComponent$2;
        //   256: dup            
        //   257: aload_0         /* this */
        //   258: invokespecial   gg/essential/vigilance/gui/settings/SelectorComponent$2.<init>:(Lgg/essential/vigilance/gui/settings/SelectorComponent;)V
        //   261: checkcast       Lkotlin/jvm/functions/Function1;
        //   264: invokevirtual   gg/essential/elementa/state/State.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //   267: pop            
        //   268: nop            
        //   269: return         
        //    Signature:
        //  (ILjava/util/List<Ljava/lang/String;>;)V
        //    MethodParameters:
        //  Name              Flags  
        //  ----------------  -----
        //  initialSelection  
        //  options           
        //    StackMapTable: 00 02 FF 00 39 00 0E 07 00 02 01 07 00 46 07 00 33 01 07 00 33 07 00 40 01 07 00 48 00 00 00 07 00 02 01 00 00 34
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final DropDownComponent getDropDown$Vigilance() {
        return (DropDownComponent)this.dropDown$delegate.getValue((Object)this, (KProperty)SelectorComponent.$$delegatedProperties[0]);
    }
    
    @Override
    public void closePopups(final boolean instantly) {
        this.getDropDown$Vigilance().collapse(instantly);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SelectorComponent.class, "dropDown", "getDropDown$Vigilance()Lgg/essential/vigilance/gui/settings/DropDownComponent;", 0)) };
    }
}
