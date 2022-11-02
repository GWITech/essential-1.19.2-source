package gg.essential.gui.common;

import kotlin.reflect.*;
import gg.essential.elementa.state.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import java.awt.*;
import gg.essential.gui.*;
import gg.essential.gui.common.input.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000H
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010	\u001a\u00020\b¢\u0006\u0002\u0010
                                                   J\u0006\u0010\u001f\u001a\u00020 J\b\u0010!\u001a\u00020 H\u0016J\u0006\u0010"\u001a\u00020 J\u0006\u0010#\u001a\u00020\u0003J\u000e\u0010$\u001a\u00020 2\u0006\u0010%\u001a\u00020\u0003R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010	\u001a\u00020\bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u000b\u001a\u00020\f8DX\u0084\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u00020\u00178DX\u0084\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001a\u0010\u0010\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001c¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006&""" }, d2 = { "Lgg/essential/gui/common/EssentialSearchbar;", "Lgg/essential/elementa/components/UIContainer;", "placeholder", "", "placeholderColor", "Ljava/awt/Color;", "initialValue", "activateOnSearchHokey", "", "activateOnType", "(Ljava/lang/String;Ljava/awt/Color;Ljava/lang/String;ZZ)V", "searchContainer", "Lgg/essential/elementa/components/UIBlock;", "getSearchContainer", "()Lgg/essential/elementa/components/UIBlock;", "searchContainer$delegate", "Lkotlin/properties/ReadWriteProperty;", "searchIcon", "Lgg/essential/gui/common/shadow/ShadowIcon;", "getSearchIcon", "()Lgg/essential/gui/common/shadow/ShadowIcon;", "searchIcon$delegate", "searchInput", "Lgg/essential/gui/common/input/UITextInput;", "getSearchInput", "()Lgg/essential/gui/common/input/UITextInput;", "searchInput$delegate", "textContent", "Lgg/essential/elementa/state/BasicState;", "getTextContent", "()Lgg/essential/elementa/state/BasicState;", "activateSearch", "", "afterInitialization", "deactivateSearch", "getText", "setText", "text", "essential" })
public class EssentialSearchbar extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    private final boolean activateOnSearchHokey;
    private final boolean activateOnType;
    @NotNull
    private final BasicState<String> textContent;
    @NotNull
    private final ReadWriteProperty searchContainer$delegate;
    @NotNull
    private final ReadWriteProperty searchInput$delegate;
    
    public EssentialSearchbar(@NotNull final String placeholder, @NotNull final Color placeholderColor, @NotNull final String initialValue, final boolean activateOnSearchHokey, final boolean activateOnType) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "placeholder"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* placeholderColor */
        //     7: ldc             "placeholderColor"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_3         /* initialValue */
        //    13: ldc             "initialValue"
        //    15: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    18: aload_0         /* this */
        //    19: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    22: aload_0         /* this */
        //    23: iload           activateOnSearchHokey
        //    25: putfield        gg/essential/gui/common/EssentialSearchbar.activateOnSearchHokey:Z
        //    28: aload_0         /* this */
        //    29: iload           activateOnType
        //    31: putfield        gg/essential/gui/common/EssentialSearchbar.activateOnType:Z
        //    34: aload_0         /* this */
        //    35: new             Lgg/essential/elementa/state/BasicState;
        //    38: dup            
        //    39: aload_3         /* initialValue */
        //    40: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    43: putfield        gg/essential/gui/common/EssentialSearchbar.textContent:Lgg/essential/elementa/state/BasicState;
        //    46: aload_0         /* this */
        //    47: new             Lgg/essential/elementa/components/UIBlock;
        //    50: dup            
        //    51: getstatic       gg/essential/gui/EssentialPalette.BUTTON:Ljava/awt/Color;
        //    54: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //    57: checkcast       Lgg/essential/elementa/UIComponent;
        //    60: astore          $this$constrain$iv
        //    62: aload           $this$constrain$iv
        //    64: astore          7
        //    66: aload           7
        //    68: astore          $this$constrain_u24lambda_u2d0$iv
        //    70: aload           $this$constrain_u24lambda_u2d0$iv
        //    72: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    75: astore          9
        //    77: astore          10
        //    79: aload           $this$searchContainer_delegate_u24lambda_u2d0
        //    81: bipush          100
        //    83: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    86: checkcast       Ljava/lang/Number;
        //    89: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //    92: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //    95: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //    98: aload           $this$searchContainer_delegate_u24lambda_u2d0
        //   100: bipush          100
        //   102: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   105: checkcast       Ljava/lang/Number;
        //   108: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   111: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   114: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   117: aload           10
        //   119: aload           7
        //   121: aload_0         /* this */
        //   122: checkcast       Lgg/essential/elementa/UIComponent;
        //   125: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   128: aload_0         /* this */
        //   129: getstatic       gg/essential/gui/common/EssentialSearchbar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   132: iconst_0       
        //   133: aaload         
        //   134: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   137: putfield        gg/essential/gui/common/EssentialSearchbar.searchContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   140: new             Lgg/essential/gui/common/shadow/ShadowIcon;
        //   143: dup            
        //   144: getstatic       gg/essential/gui/EssentialPalette.SEARCH_7X:Lgg/essential/gui/image/ImageFactory;
        //   147: invokespecial   gg/essential/gui/common/shadow/ShadowIcon.<init>:(Lgg/essential/gui/image/ImageFactory;)V
        //   150: checkcast       Lgg/essential/elementa/UIComponent;
        //   153: astore          $this$constrain$iv
        //   155: aload           $this$constrain$iv
        //   157: astore          7
        //   159: aload           7
        //   161: astore          $this$constrain_u24lambda_u2d0$iv
        //   163: aload           $this$constrain_u24lambda_u2d0$iv
        //   165: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   168: astore          $this$searchIcon_delegate_u24lambda_u2d1
        //   170: aload           $this$searchIcon_delegate_u24lambda_u2d1
        //   172: iconst_5       
        //   173: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   176: checkcast       Ljava/lang/Number;
        //   179: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   182: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   185: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   188: aload           $this$searchIcon_delegate_u24lambda_u2d1
        //   190: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   193: dup            
        //   194: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   197: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   200: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   203: aload           7
        //   205: checkcast       Lgg/essential/gui/common/shadow/ShadowIcon;
        //   208: aload_2         /* placeholderColor */
        //   209: invokestatic    gg/essential/gui/common/StateExtensionsKt.state:(Ljava/lang/Object;)Lgg/essential/elementa/state/BasicState;
        //   212: checkcast       Lgg/essential/elementa/state/State;
        //   215: invokevirtual   gg/essential/gui/common/shadow/ShadowIcon.rebindPrimaryColor:(Lgg/essential/elementa/state/State;)Lgg/essential/gui/common/shadow/ShadowIcon;
        //   218: checkcast       Lgg/essential/elementa/UIComponent;
        //   221: aload_0         /* this */
        //   222: invokevirtual   gg/essential/gui/common/EssentialSearchbar.getSearchContainer:()Lgg/essential/elementa/components/UIBlock;
        //   225: checkcast       Lgg/essential/elementa/UIComponent;
        //   228: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   231: aload_0         /* this */
        //   232: getstatic       gg/essential/gui/common/EssentialSearchbar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   235: iconst_1       
        //   236: aaload         
        //   237: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   240: pop            
        //   241: aload_0         /* this */
        //   242: new             Lgg/essential/gui/common/input/UITextInput;
        //   245: dup            
        //   246: aload_1         /* placeholder */
        //   247: iconst_0       
        //   248: getstatic       gg/essential/gui/EssentialPalette.BLACK:Ljava/awt/Color;
        //   251: aconst_null    
        //   252: aconst_null    
        //   253: aconst_null    
        //   254: aconst_null    
        //   255: aconst_null    
        //   256: sipush          506
        //   259: invokespecial   gg/essential/gui/common/input/UITextInput.<init>:(Ljava/lang/String;ZLjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;I)V
        //   262: checkcast       Lgg/essential/elementa/UIComponent;
        //   265: astore          $this$constrain$iv
        //   267: aload           $this$constrain$iv
        //   269: astore          7
        //   271: aload           7
        //   273: astore          $this$constrain_u24lambda_u2d0$iv
        //   275: aload           $this$constrain_u24lambda_u2d0$iv
        //   277: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   280: astore          9
        //   282: astore          10
        //   284: aload           $this$searchInput_delegate_u24lambda_u2d2
        //   286: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   289: dup            
        //   290: ldc             5.0
        //   292: iconst_0       
        //   293: iconst_2       
        //   294: aconst_null    
        //   295: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   298: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   301: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   304: aload           $this$searchInput_delegate_u24lambda_u2d2
        //   306: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   309: dup            
        //   310: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   313: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   316: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   319: aload           $this$searchInput_delegate_u24lambda_u2d2
        //   321: new             Lgg/essential/elementa/constraints/FillConstraint;
        //   324: dup            
        //   325: iconst_0       
        //   326: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(Z)V
        //   329: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   332: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   335: aload           10
        //   337: aload           7
        //   339: aload_0         /* this */
        //   340: invokevirtual   gg/essential/gui/common/EssentialSearchbar.getSearchContainer:()Lgg/essential/elementa/components/UIBlock;
        //   343: checkcast       Lgg/essential/elementa/UIComponent;
        //   346: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   349: aload_0         /* this */
        //   350: getstatic       gg/essential/gui/common/EssentialSearchbar.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   353: iconst_2       
        //   354: aaload         
        //   355: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   358: putfield        gg/essential/gui/common/EssentialSearchbar.searchInput$delegate:Lkotlin/properties/ReadWriteProperty;
        //   361: aload_0         /* this */
        //   362: checkcast       Lgg/essential/elementa/UIComponent;
        //   365: astore          $this$constrain$iv
        //   367: aload           $this$constrain$iv
        //   369: astore          7
        //   371: aload           7
        //   373: astore          $this$constrain_u24lambda_u2d0$iv
        //   375: aload           $this$constrain_u24lambda_u2d0$iv
        //   377: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   380: astore          $this$_init__u24lambda_u2d3
        //   382: aload           $this$_init__u24lambda_u2d3
        //   384: bipush          100
        //   386: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   389: checkcast       Ljava/lang/Number;
        //   392: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   395: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   398: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   401: aload           $this$_init__u24lambda_u2d3
        //   403: bipush          17
        //   405: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   408: checkcast       Ljava/lang/Number;
        //   411: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   414: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   417: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   420: aload_0         /* this */
        //   421: invokevirtual   gg/essential/gui/common/EssentialSearchbar.getSearchContainer:()Lgg/essential/elementa/components/UIBlock;
        //   424: checkcast       Lgg/essential/elementa/UIComponent;
        //   427: astore          $this$onLeftClick$iv
        //   429: aload           $this$onLeftClick$iv
        //   431: new             Lgg/essential/gui/common/EssentialSearchbar$special$$inlined$onLeftClick$1;
        //   434: dup            
        //   435: aload_0         /* this */
        //   436: invokespecial   gg/essential/gui/common/EssentialSearchbar$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/common/EssentialSearchbar;)V
        //   439: checkcast       Lkotlin/jvm/functions/Function2;
        //   442: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   445: pop            
        //   446: aload_0         /* this */
        //   447: invokevirtual   gg/essential/gui/common/EssentialSearchbar.getSearchInput:()Lgg/essential/gui/common/input/UITextInput;
        //   450: invokevirtual   gg/essential/gui/common/input/UITextInput.getPlaceholderColor:()Lgg/essential/elementa/state/BasicState;
        //   453: aload_2         /* placeholderColor */
        //   454: invokevirtual   gg/essential/elementa/state/BasicState.set:(Ljava/lang/Object;)V
        //   457: aload_0         /* this */
        //   458: invokevirtual   gg/essential/gui/common/EssentialSearchbar.getSearchInput:()Lgg/essential/gui/common/input/UITextInput;
        //   461: new             Lgg/essential/gui/common/EssentialSearchbar$3;
        //   464: dup            
        //   465: aload_0         /* this */
        //   466: invokespecial   gg/essential/gui/common/EssentialSearchbar$3.<init>:(Lgg/essential/gui/common/EssentialSearchbar;)V
        //   469: checkcast       Lkotlin/jvm/functions/Function1;
        //   472: invokevirtual   gg/essential/gui/common/input/UITextInput.onUpdate:(Lkotlin/jvm/functions/Function1;)Lgg/essential/gui/common/input/AbstractTextInput;
        //   475: pop            
        //   476: aload_0         /* this */
        //   477: getfield        gg/essential/gui/common/EssentialSearchbar.textContent:Lgg/essential/elementa/state/BasicState;
        //   480: new             Lgg/essential/gui/common/EssentialSearchbar$4;
        //   483: dup            
        //   484: aload_0         /* this */
        //   485: invokespecial   gg/essential/gui/common/EssentialSearchbar$4.<init>:(Lgg/essential/gui/common/EssentialSearchbar;)V
        //   488: checkcast       Lkotlin/jvm/functions/Function1;
        //   491: invokevirtual   gg/essential/elementa/state/BasicState.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //   494: pop            
        //   495: return         
        //    MethodParameters:
        //  Name                   Flags  
        //  ---------------------  -----
        //  placeholder            
        //  placeholderColor       
        //  initialValue           
        //  activateOnSearchHokey  
        //  activateOnType         
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public EssentialSearchbar(final byte b) {
        this("Search...", EssentialPalette.TEXT, "", true, true);
    }
    
    @NotNull
    public final BasicState<String> getTextContent() {
        return this.textContent;
    }
    
    @NotNull
    protected final UIBlock getSearchContainer() {
        return (UIBlock)this.searchContainer$delegate.getValue((Object)this, (KProperty)EssentialSearchbar.$$delegatedProperties[0]);
    }
    
    @NotNull
    protected final UITextInput getSearchInput() {
        return (UITextInput)this.searchInput$delegate.getValue((Object)this, (KProperty)EssentialSearchbar.$$delegatedProperties[2]);
    }
    
    @Override
    public void afterInitialization() {
        super.afterInitialization();
        Window.Companion.of(this).onKeyType((Function3<? super UIComponent, ? super Character, ? super Integer, Unit>)new EssentialSearchbar$afterInitialization.EssentialSearchbar$afterInitialization$1(this));
    }
    
    @NotNull
    public final String getText() {
        return this.textContent.get();
    }
    
    public final void activateSearch() {
        this.getSearchInput().grabWindowFocus();
    }
    
    public EssentialSearchbar() {
        this((byte)0);
    }
    
    public static final /* synthetic */ boolean access$getActivateOnSearchHokey$p(final EssentialSearchbar $this) {
        return $this.activateOnSearchHokey;
    }
    
    public static final /* synthetic */ boolean access$getActivateOnType$p(final EssentialSearchbar $this) {
        return $this.activateOnType;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialSearchbar.class, "searchContainer", "getSearchContainer()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialSearchbar.class, "searchIcon", "getSearchIcon()Lgg/essential/gui/common/shadow/ShadowIcon;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialSearchbar.class, "searchInput", "getSearchInput()Lgg/essential/gui/common/input/UITextInput;", 0)) };
    }
}
