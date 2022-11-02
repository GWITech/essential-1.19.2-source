package gg.essential.gui.common.modal;

import gg.essential.elementa.components.*;
import kotlin.*;
import kotlin.reflect.*;
import gg.essential.elementa.state.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import gg.essential.gui.common.input.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000.
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0002
                                                   \u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010	\u001a\u00020
                                                   8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015""" }, d2 = { "Lgg/essential/gui/common/modal/UserSelectionModal$Searchbar;", "Lgg/essential/elementa/components/UIBlock;", "()V", "searchIcon", "Lgg/essential/gui/common/shadow/ShadowIcon;", "getSearchIcon", "()Lgg/essential/gui/common/shadow/ShadowIcon;", "searchIcon$delegate", "Lkotlin/properties/ReadWriteProperty;", "searchInput", "Lgg/essential/gui/common/input/UITextInput;", "getSearchInput", "()Lgg/essential/gui/common/input/UITextInput;", "searchInput$delegate", "textState", "Lgg/essential/elementa/state/BasicState;", "", "getTextState", "()Lgg/essential/elementa/state/BasicState;", "afterInitialization", "", "essential" })
private static final class Searchbar extends UIBlock
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final BasicState<String> textState;
    @NotNull
    private final ReadWriteProperty searchInput$delegate;
    
    public Searchbar() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getstatic       gg/essential/gui/EssentialPalette.BUTTON_HIGHLIGHT:Ljava/awt/Color;
        //     4: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //     7: aload_0         /* this */
        //     8: new             Lgg/essential/elementa/state/BasicState;
        //    11: dup            
        //    12: ldc             ""
        //    14: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    17: putfield        gg/essential/gui/common/modal/UserSelectionModal$Searchbar.textState:Lgg/essential/elementa/state/BasicState;
        //    20: new             Lgg/essential/gui/common/shadow/ShadowIcon;
        //    23: dup            
        //    24: getstatic       gg/essential/gui/EssentialPalette.SEARCH_7X:Lgg/essential/gui/image/ImageFactory;
        //    27: invokespecial   gg/essential/gui/common/shadow/ShadowIcon.<init>:(Lgg/essential/gui/image/ImageFactory;)V
        //    30: checkcast       Lgg/essential/elementa/UIComponent;
        //    33: astore_1        /* $this$constrain$iv */
        //    34: aload_1         /* $this$constrain$iv */
        //    35: astore_2       
        //    36: aload_2        
        //    37: astore_3        /* $this$constrain_u24lambda_u2d0$iv */
        //    38: aload_3         /* $this$constrain_u24lambda_u2d0$iv */
        //    39: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    42: astore          $this$searchIcon_delegate_u24lambda_u2d0
        //    44: aload           $this$searchIcon_delegate_u24lambda_u2d0
        //    46: iconst_5       
        //    47: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    50: checkcast       Ljava/lang/Number;
        //    53: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //    56: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //    59: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //    62: aload           $this$searchIcon_delegate_u24lambda_u2d0
        //    64: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //    67: dup            
        //    68: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //    71: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //    74: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //    77: aload_2        
        //    78: aload_0         /* this */
        //    79: checkcast       Lgg/essential/elementa/UIComponent;
        //    82: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //    85: aload_0         /* this */
        //    86: getstatic       gg/essential/gui/common/modal/UserSelectionModal$Searchbar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //    89: iconst_0       
        //    90: aaload         
        //    91: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //    94: pop            
        //    95: aload_0         /* this */
        //    96: new             Lgg/essential/gui/common/input/UITextInput;
        //    99: dup            
        //   100: ldc             "Search"
        //   102: iconst_0       
        //   103: getstatic       gg/essential/gui/EssentialPalette.BLACK:Ljava/awt/Color;
        //   106: aconst_null    
        //   107: aconst_null    
        //   108: aconst_null    
        //   109: aconst_null    
        //   110: aconst_null    
        //   111: sipush          506
        //   114: invokespecial   gg/essential/gui/common/input/UITextInput.<init>:(Ljava/lang/String;ZLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;I)V
        //   117: checkcast       Lgg/essential/elementa/UIComponent;
        //   120: astore_1        /* $this$constrain$iv */
        //   121: aload_1         /* $this$constrain$iv */
        //   122: astore_2       
        //   123: aload_2        
        //   124: astore_3        /* $this$constrain_u24lambda_u2d0$iv */
        //   125: aload_3         /* $this$constrain_u24lambda_u2d0$iv */
        //   126: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   129: astore          4
        //   131: astore          5
        //   133: aload           $this$searchInput_delegate_u24lambda_u2d1
        //   135: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   138: dup            
        //   139: ldc             5.0
        //   141: iconst_0       
        //   142: iconst_2       
        //   143: aconst_null    
        //   144: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   147: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   150: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   153: aload           $this$searchInput_delegate_u24lambda_u2d1
        //   155: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   158: dup            
        //   159: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   162: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   165: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   168: aload           $this$searchInput_delegate_u24lambda_u2d1
        //   170: new             Lgg/essential/elementa/constraints/FillConstraint;
        //   173: dup            
        //   174: iconst_0       
        //   175: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(Z)V
        //   178: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   181: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   184: aload           $this$searchInput_delegate_u24lambda_u2d1
        //   186: bipush          9
        //   188: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   191: checkcast       Ljava/lang/Number;
        //   194: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   197: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   200: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   203: aload           5
        //   205: aload_2        
        //   206: aload_0         /* this */
        //   207: checkcast       Lgg/essential/elementa/UIComponent;
        //   210: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   213: aload_0         /* this */
        //   214: getstatic       gg/essential/gui/common/modal/UserSelectionModal$Searchbar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   217: iconst_1       
        //   218: aaload         
        //   219: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   222: putfield        gg/essential/gui/common/modal/UserSelectionModal$Searchbar.searchInput$delegate:Lkotlin/properties/ReadWriteProperty;
        //   225: aload_0         /* this */
        //   226: checkcast       Lgg/essential/elementa/UIComponent;
        //   229: astore_1        /* $this$constrain$iv */
        //   230: aload_1         /* $this$constrain$iv */
        //   231: astore_2       
        //   232: aload_2        
        //   233: astore_3        /* $this$constrain_u24lambda_u2d0$iv */
        //   234: aload_3         /* $this$constrain_u24lambda_u2d0$iv */
        //   235: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   238: astore          $this$_init__u24lambda_u2d2
        //   240: aload           $this$_init__u24lambda_u2d2
        //   242: bipush          100
        //   244: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   247: checkcast       Ljava/lang/Number;
        //   250: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   253: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   256: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   259: aload           $this$_init__u24lambda_u2d2
        //   261: bipush          17
        //   263: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   266: checkcast       Ljava/lang/Number;
        //   269: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   272: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   275: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   278: aload_0         /* this */
        //   279: invokespecial   gg/essential/gui/common/modal/UserSelectionModal$Searchbar.getSearchInput:()Lgg/essential/gui/common/input/UITextInput;
        //   282: new             Lgg/essential/gui/common/modal/UserSelectionModal$Searchbar$2;
        //   285: dup            
        //   286: aload_0         /* this */
        //   287: invokespecial   gg/essential/gui/common/modal/UserSelectionModal$Searchbar$2.<init>:(Lgg/essential/gui/common/modal/UserSelectionModal$Searchbar;)V
        //   290: checkcast       Lkotlin/jvm/functions/Function1;
        //   293: invokevirtual   gg/essential/gui/common/input/UITextInput.onUpdate:(Lkotlin/jvm/functions/Function1;)Lgg/essential/gui/common/input/AbstractTextInput;
        //   296: pop            
        //   297: aload_0         /* this */
        //   298: invokespecial   gg/essential/gui/common/modal/UserSelectionModal$Searchbar.getSearchInput:()Lgg/essential/gui/common/input/UITextInput;
        //   301: checkcast       Lgg/essential/elementa/UIComponent;
        //   304: astore_1        /* $this$onLeftClick$iv */
        //   305: aload_1         /* $this$onLeftClick$iv */
        //   306: new             Lgg/essential/gui/common/modal/UserSelectionModal$Searchbar$special$$inlined$onLeftClick$1;
        //   309: dup            
        //   310: aload_0         /* this */
        //   311: invokespecial   gg/essential/gui/common/modal/UserSelectionModal$Searchbar$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/common/modal/UserSelectionModal$Searchbar;)V
        //   314: checkcast       Lkotlin/jvm/functions/Function2;
        //   317: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   320: pop            
        //   321: return         
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final BasicState<String> getTextState() {
        return this.textState;
    }
    
    private final UITextInput getSearchInput() {
        return (UITextInput)this.searchInput$delegate.getValue((Object)this, (KProperty)Searchbar.$$delegatedProperties[1]);
    }
    
    @Override
    public void afterInitialization() {
        super.afterInitialization();
        this.getSearchInput().grabWindowFocus();
    }
    
    public static final /* synthetic */ UITextInput access$getSearchInput(final Searchbar $this) {
        return $this.getSearchInput();
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Searchbar.class, "searchIcon", "getSearchIcon()Lgg/essential/gui/common/shadow/ShadowIcon;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Searchbar.class, "searchInput", "getSearchInput()Lgg/essential/gui/common/input/UITextInput;", 0)) };
    }
}
