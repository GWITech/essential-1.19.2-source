package gg.essential.gui.screenshot.components;

import gg.essential.elementa.components.*;
import kotlin.reflect.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import gg.essential.gui.common.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000:
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u0004H\u0002R\u001b\u0010\b\u001a\u00020	8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\f\u0010\r\u001a\u0004\b
                                                   \u0010\u000bR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0014\u0010\r\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082D¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u0016\u001a\u00020	8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0018\u0010\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u001c""" }, d2 = { "Lgg/essential/gui/screenshot/components/ScreenshotItemsSlider;", "Lgg/essential/elementa/components/UIContainer;", "itemsPerRow", "Lgg/essential/elementa/state/State;", "", "listViewComponent", "Lgg/essential/gui/screenshot/components/ListViewComponent;", "(Lgg/essential/elementa/state/State;Lgg/essential/gui/screenshot/components/ListViewComponent;)V", "bigItemsIcon", "Lgg/essential/elementa/components/UIImage;", "getBigItemsIcon", "()Lgg/essential/elementa/components/UIImage;", "bigItemsIcon$delegate", "Lkotlin/properties/ReadWriteProperty;", "scrollTo", "Lgg/essential/elementa/UIComponent;", "slider", "Lgg/essential/gui/common/IntEssentialSlider;", "getSlider", "()Lgg/essential/gui/common/IntEssentialSlider;", "slider$delegate", "sliderWidth", "smallItemsIcon", "getSmallItemsIcon", "smallItemsIcon$delegate", "afterInitialization", "", "handleUpdateItems", "essential" })
public final class ScreenshotItemsSlider extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final State<Integer> itemsPerRow;
    @NotNull
    private final ListViewComponent listViewComponent;
    @Nullable
    private UIComponent scrollTo;
    @NotNull
    private final ReadWriteProperty slider$delegate;
    
    public ScreenshotItemsSlider(@NotNull final State<Integer> itemsPerRow, @NotNull final ListViewComponent listViewComponent) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "itemsPerRow"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* listViewComponent */
        //     7: ldc             "listViewComponent"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    16: aload_0         /* this */
        //    17: aload_1         /* itemsPerRow */
        //    18: putfield        gg/essential/gui/screenshot/components/ScreenshotItemsSlider.itemsPerRow:Lgg/essential/elementa/state/State;
        //    21: aload_0         /* this */
        //    22: aload_2         /* listViewComponent */
        //    23: putfield        gg/essential/gui/screenshot/components/ScreenshotItemsSlider.listViewComponent:Lgg/essential/gui/screenshot/components/ListViewComponent;
        //    26: getstatic       gg/essential/gui/EssentialPalette.IMAGE_SIZE_BIG_10X:Lgg/essential/gui/image/ImageFactory;
        //    29: invokevirtual   gg/essential/gui/image/ImageFactory.create:()Lgg/essential/elementa/components/UIImage;
        //    32: checkcast       Lgg/essential/elementa/UIComponent;
        //    35: astore_3        /* $this$constrain$iv */
        //    36: aload_3         /* $this$constrain$iv */
        //    37: astore          4
        //    39: aload           4
        //    41: astore          $this$constrain_u24lambda_u2d0$iv
        //    43: aload           $this$constrain_u24lambda_u2d0$iv
        //    45: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    48: astore          $this$bigItemsIcon_delegate_u24lambda_u2d0
        //    50: aload           $this$bigItemsIcon_delegate_u24lambda_u2d0
        //    52: iconst_1       
        //    53: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    56: checkcast       Ljava/lang/Number;
        //    59: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixel:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //    62: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //    65: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //    68: aload           4
        //    70: aload_0         /* this */
        //    71: checkcast       Lgg/essential/elementa/UIComponent;
        //    74: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //    77: aload_0         /* this */
        //    78: getstatic       gg/essential/gui/screenshot/components/ScreenshotItemsSlider.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //    81: iconst_0       
        //    82: aaload         
        //    83: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //    86: pop            
        //    87: aload_0         /* this */
        //    88: new             Lgg/essential/gui/common/IntEssentialSlider;
        //    91: dup            
        //    92: iconst_2       
        //    93: bipush          7
        //    95: aload_0         /* this */
        //    96: getfield        gg/essential/gui/screenshot/components/ScreenshotItemsSlider.itemsPerRow:Lgg/essential/elementa/state/State;
        //    99: invokevirtual   gg/essential/elementa/state/State.get:()Ljava/lang/Object;
        //   102: checkcast       Ljava/lang/Number;
        //   105: invokevirtual   java/lang/Number.intValue:()I
        //   108: invokespecial   gg/essential/gui/common/IntEssentialSlider.<init>:(III)V
        //   111: checkcast       Lgg/essential/elementa/UIComponent;
        //   114: astore_3        /* $this$constrain$iv */
        //   115: aload_3         /* $this$constrain$iv */
        //   116: astore          4
        //   118: aload           4
        //   120: astore          $this$constrain_u24lambda_u2d0$iv
        //   122: aload           $this$constrain_u24lambda_u2d0$iv
        //   124: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   127: astore          6
        //   129: astore          7
        //   131: aload           $this$slider_delegate_u24lambda_u2d1
        //   133: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   136: dup            
        //   137: ldc             3.0
        //   139: iconst_0       
        //   140: iconst_2       
        //   141: aconst_null    
        //   142: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   145: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   148: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   151: aload           $this$slider_delegate_u24lambda_u2d1
        //   153: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   156: dup            
        //   157: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   160: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   163: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   166: aload           $this$slider_delegate_u24lambda_u2d1
        //   168: bipush          36
        //   170: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   173: checkcast       Ljava/lang/Number;
        //   176: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   179: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   182: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   185: aload           $this$slider_delegate_u24lambda_u2d1
        //   187: bipush          9
        //   189: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   192: checkcast       Ljava/lang/Number;
        //   195: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   198: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   201: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   204: aload           7
        //   206: aload           4
        //   208: aload_0         /* this */
        //   209: checkcast       Lgg/essential/elementa/UIComponent;
        //   212: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   215: aload_0         /* this */
        //   216: getstatic       gg/essential/gui/screenshot/components/ScreenshotItemsSlider.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   219: iconst_1       
        //   220: aaload         
        //   221: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   224: putfield        gg/essential/gui/screenshot/components/ScreenshotItemsSlider.slider$delegate:Lkotlin/properties/ReadWriteProperty;
        //   227: getstatic       gg/essential/gui/EssentialPalette.IMAGE_SIZE_SMALL_9X:Lgg/essential/gui/image/ImageFactory;
        //   230: invokevirtual   gg/essential/gui/image/ImageFactory.create:()Lgg/essential/elementa/components/UIImage;
        //   233: checkcast       Lgg/essential/elementa/UIComponent;
        //   236: astore_3        /* $this$constrain$iv */
        //   237: aload_3         /* $this$constrain$iv */
        //   238: astore          4
        //   240: aload           4
        //   242: astore          $this$constrain_u24lambda_u2d0$iv
        //   244: aload           $this$constrain_u24lambda_u2d0$iv
        //   246: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   249: astore          $this$smallItemsIcon_delegate_u24lambda_u2d2
        //   251: aload           $this$smallItemsIcon_delegate_u24lambda_u2d2
        //   253: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   256: dup            
        //   257: ldc             3.0
        //   259: iconst_0       
        //   260: iconst_2       
        //   261: aconst_null    
        //   262: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   265: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   268: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   271: aload           $this$smallItemsIcon_delegate_u24lambda_u2d2
        //   273: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   276: dup            
        //   277: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   280: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   283: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   286: aload           4
        //   288: aload_0         /* this */
        //   289: checkcast       Lgg/essential/elementa/UIComponent;
        //   292: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   295: aload_0         /* this */
        //   296: getstatic       gg/essential/gui/screenshot/components/ScreenshotItemsSlider.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   299: iconst_2       
        //   300: aaload         
        //   301: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   304: pop            
        //   305: aload_0         /* this */
        //   306: checkcast       Lgg/essential/elementa/UIComponent;
        //   309: astore_3        /* $this$constrain$iv */
        //   310: aload_3         /* $this$constrain$iv */
        //   311: astore          4
        //   313: aload           4
        //   315: astore          $this$constrain_u24lambda_u2d0$iv
        //   317: aload           $this$constrain_u24lambda_u2d0$iv
        //   319: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   322: astore          $this$_init__u24lambda_u2d3
        //   324: aload           $this$_init__u24lambda_u2d3
        //   326: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   329: dup            
        //   330: ldc             3.0
        //   332: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(F)V
        //   335: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   338: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   341: aload           $this$_init__u24lambda_u2d3
        //   343: bipush          11
        //   345: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   348: checkcast       Ljava/lang/Number;
        //   351: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   354: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   357: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   360: aload_0         /* this */
        //   361: invokespecial   gg/essential/gui/screenshot/components/ScreenshotItemsSlider.getSlider:()Lgg/essential/gui/common/IntEssentialSlider;
        //   364: new             Lgg/essential/gui/screenshot/components/ScreenshotItemsSlider$2;
        //   367: dup            
        //   368: aload_0         /* this */
        //   369: invokespecial   gg/essential/gui/screenshot/components/ScreenshotItemsSlider$2.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotItemsSlider;)V
        //   372: checkcast       Lkotlin/jvm/functions/Function1;
        //   375: invokevirtual   gg/essential/gui/common/IntEssentialSlider.onUpdateInt:(Lkotlin/jvm/functions/Function1;)V
        //   378: return         
        //    Signature:
        //  (Lgg/essential/elementa/state/State<Ljava/lang/Integer;>;Lgg/essential/gui/screenshot/components/ListViewComponent;)V
        //    MethodParameters:
        //  Name               Flags  
        //  -----------------  -----
        //  itemsPerRow        
        //  listViewComponent  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final IntEssentialSlider getSlider() {
        return (IntEssentialSlider)this.slider$delegate.getValue((Object)this, (KProperty)ScreenshotItemsSlider.$$delegatedProperties[1]);
    }
    
    @Override
    public void afterInitialization() {
        super.afterInitialization();
        final Ref$FloatRef previousVerticalOffset = new Ref$FloatRef();
        final ScreenshotScrollComponent screenshotScrollComponent = this.listViewComponent.getScreenshotBrowser().getListViewComponent().getScreenshotScrollComponent();
        screenshotScrollComponent.addScrollAdjustEvent(true, (Function2<? super Float, ? super Float, Unit>)new ScreenshotItemsSlider$afterInitialization.ScreenshotItemsSlider$afterInitialization$1(screenshotScrollComponent, previousVerticalOffset, this));
    }
    
    private final void handleUpdateItems(final int itemsPerRow) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/gui/screenshot/components/ScreenshotItemsSlider.scrollTo:Lgg/essential/elementa/UIComponent;
        //     4: astore_2        /* previousScroll */
        //     5: aload_0         /* this */
        //     6: getfield        gg/essential/gui/screenshot/components/ScreenshotItemsSlider.listViewComponent:Lgg/essential/gui/screenshot/components/ListViewComponent;
        //     9: invokevirtual   gg/essential/gui/screenshot/components/ListViewComponent.getScreenshotScrollComponent:()Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;
        //    12: astore_3        /* scroller */
        //    13: aload_3         /* scroller */
        //    14: checkcast       Lgg/essential/elementa/UIComponent;
        //    17: invokestatic    gg/essential/gui/screenshot/components/ScreenshotItemsSlider.handleUpdateItems$center:(Lgg/essential/elementa/UIComponent;)F
        //    20: fstore          scrollerCenter
        //    22: aload_2         /* previousScroll */
        //    23: dup            
        //    24: ifnonnull       267
        //    27: pop            
        //    28: aload_3         /* scroller */
        //    29: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotScrollComponent.getAllChildren:()Ljava/util/concurrent/CopyOnWriteArrayList;
        //    32: checkcast       Ljava/lang/Iterable;
        //    35: astore          $this$flatMap$iv
        //    37: aload           $this$flatMap$iv
        //    39: astore          8
        //    41: new             Ljava/util/ArrayList;
        //    44: dup            
        //    45: invokespecial   java/util/ArrayList.<init>:()V
        //    48: checkcast       Ljava/util/Collection;
        //    51: astore          destination$iv$iv
        //    53: aload           $this$flatMapTo$iv$iv
        //    55: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    60: astore          11
        //    62: aload           11
        //    64: invokeinterface java/util/Iterator.hasNext:()Z
        //    69: ifeq            128
        //    72: aload           11
        //    74: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    79: astore          element$iv$iv
        //    81: aload           element$iv$iv
        //    83: checkcast       Lgg/essential/elementa/UIComponent;
        //    86: astore          it
        //    88: aload           it
        //    90: dup            
        //    91: ifnonnull       106
        //    94: pop            
        //    95: new             Ljava/lang/NullPointerException;
        //    98: dup            
        //    99: ldc_w           "null cannot be cast to non-null type gg.essential.gui.screenshot.components.ScreenshotDateGroup"
        //   102: invokespecial   java/lang/NullPointerException.<init>:(Ljava/lang/String;)V
        //   105: athrow         
        //   106: checkcast       Lgg/essential/gui/screenshot/components/ScreenshotDateGroup;
        //   109: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotDateGroup.getImages:()Ljava/util/List;
        //   112: checkcast       Ljava/lang/Iterable;
        //   115: astore          list$iv$iv
        //   117: aload           destination$iv$iv
        //   119: aload           list$iv$iv
        //   121: invokestatic    kotlin/collections/CollectionsKt.addAll:(Ljava/util/Collection;Ljava/lang/Iterable;)Z
        //   124: pop            
        //   125: goto            62
        //   128: aload           destination$iv$iv
        //   130: checkcast       Ljava/util/List;
        //   133: checkcast       Ljava/lang/Iterable;
        //   136: astore          $this$minByOrNull$iv
        //   138: aload           $this$minByOrNull$iv
        //   140: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   145: astore          iterator$iv
        //   147: aload           iterator$iv
        //   149: invokeinterface java/util/Iterator.hasNext:()Z
        //   154: ifne            161
        //   157: aconst_null    
        //   158: goto            264
        //   161: aload           iterator$iv
        //   163: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   168: astore          minElem$iv
        //   170: aload           iterator$iv
        //   172: invokeinterface java/util/Iterator.hasNext:()Z
        //   177: ifne            185
        //   180: aload           minElem$iv
        //   182: goto            264
        //   185: aload           minElem$iv
        //   187: checkcast       Lgg/essential/elementa/UIComponent;
        //   190: astore          it
        //   192: fload           scrollerCenter
        //   194: aload           it
        //   196: invokestatic    gg/essential/gui/screenshot/components/ScreenshotItemsSlider.handleUpdateItems$center:(Lgg/essential/elementa/UIComponent;)F
        //   199: fsub           
        //   200: invokestatic    java/lang/Math.abs:(F)F
        //   203: fstore          minValue$iv
        //   205: aload           iterator$iv
        //   207: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   212: astore          e$iv
        //   214: aload           e$iv
        //   216: checkcast       Lgg/essential/elementa/UIComponent;
        //   219: astore          it
        //   221: fload           scrollerCenter
        //   223: aload           it
        //   225: invokestatic    gg/essential/gui/screenshot/components/ScreenshotItemsSlider.handleUpdateItems$center:(Lgg/essential/elementa/UIComponent;)F
        //   228: fsub           
        //   229: invokestatic    java/lang/Math.abs:(F)F
        //   232: fstore          v$iv
        //   234: fload           minValue$iv
        //   236: fload           v$iv
        //   238: invokestatic    java/lang/Float.compare:(FF)I
        //   241: ifle            252
        //   244: aload           e$iv
        //   246: astore          minElem$iv
        //   248: fload           v$iv
        //   250: fstore          minValue$iv
        //   252: aload           iterator$iv
        //   254: invokeinterface java/util/Iterator.hasNext:()Z
        //   259: ifne            205
        //   262: aload           minElem$iv
        //   264: checkcast       Lgg/essential/elementa/UIComponent;
        //   267: astore          closest
        //   269: aload           closest
        //   271: ifnull          341
        //   274: aload           closest
        //   276: invokevirtual   gg/essential/elementa/UIComponent.getTop:()F
        //   279: fstore          top
        //   281: aload_3         /* scroller */
        //   282: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotScrollComponent.getVerticalOffset:()F
        //   285: fstore          offset
        //   287: aload_0         /* this */
        //   288: aload           closest
        //   290: putfield        gg/essential/gui/screenshot/components/ScreenshotItemsSlider.scrollTo:Lgg/essential/elementa/UIComponent;
        //   293: aload_0         /* this */
        //   294: getfield        gg/essential/gui/screenshot/components/ScreenshotItemsSlider.itemsPerRow:Lgg/essential/elementa/state/State;
        //   297: iload_1         /* itemsPerRow */
        //   298: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   301: invokevirtual   gg/essential/elementa/state/State.set:(Ljava/lang/Object;)V
        //   304: aload_0         /* this */
        //   305: getfield        gg/essential/gui/screenshot/components/ScreenshotItemsSlider.listViewComponent:Lgg/essential/gui/screenshot/components/ListViewComponent;
        //   308: invokevirtual   gg/essential/gui/screenshot/components/ListViewComponent.getScreenshotBrowser:()Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //   311: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getWindow:()Lgg/essential/elementa/components/Window;
        //   314: invokevirtual   gg/essential/elementa/components/Window.animationFrame:()V
        //   317: aload_3         /* scroller */
        //   318: fload           offset
        //   320: aload           closest
        //   322: invokevirtual   gg/essential/elementa/UIComponent.getTop:()F
        //   325: fload           top
        //   327: fsub           
        //   328: fsub           
        //   329: invokestatic    gg/essential/gui/screenshot/components/ScreenshotScrollComponent.scrollTo$default$30c8be7$658e097d:(Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;F)V
        //   332: aload_0         /* this */
        //   333: aload           closest
        //   335: putfield        gg/essential/gui/screenshot/components/ScreenshotItemsSlider.scrollTo:Lgg/essential/elementa/UIComponent;
        //   338: goto            352
        //   341: aload_0         /* this */
        //   342: getfield        gg/essential/gui/screenshot/components/ScreenshotItemsSlider.itemsPerRow:Lgg/essential/elementa/state/State;
        //   345: iload_1         /* itemsPerRow */
        //   346: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   349: invokevirtual   gg/essential/elementa/state/State.set:(Ljava/lang/Object;)V
        //   352: return         
        //    MethodParameters:
        //  Name         Flags  
        //  -----------  -----
        //  itemsPerRow  
        //    StackMapTable: 00 0B FF 00 3E 00 0C 07 00 02 01 00 07 00 E6 02 00 00 00 00 07 01 00 00 07 01 06 00 00 6B 07 00 54 F9 00 15 FF 00 20 00 09 07 00 02 01 00 07 00 E6 02 00 00 00 07 01 06 00 00 FC 00 17 07 01 24 FC 00 13 02 2E FF 00 0B 00 04 07 00 02 01 00 07 00 E6 00 01 07 01 24 42 07 00 54 F9 00 49 F9 00 0A
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static final float handleUpdateItems$center(final UIComponent $this$handleUpdateItems_u24center) {
        return ($this$handleUpdateItems_u24center.getTop() + $this$handleUpdateItems_u24center.getBottom()) / 2.0f;
    }
    
    public static final /* synthetic */ void access$setScrollTo$p(final ScreenshotItemsSlider $this, final UIComponent <set-?>) {
        $this.scrollTo = <set-?>;
    }
    
    public static final /* synthetic */ void access$handleUpdateItems(final ScreenshotItemsSlider $this, final int itemsPerRow) {
        $this.handleUpdateItems(itemsPerRow);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotItemsSlider.class, "bigItemsIcon", "getBigItemsIcon()Lgg/essential/elementa/components/UIImage;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotItemsSlider.class, "slider", "getSlider()Lgg/essential/gui/common/IntEssentialSlider;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ScreenshotItemsSlider.class, "smallItemsIcon", "getSmallItemsIcon()Lgg/essential/elementa/components/UIImage;", 0)) };
    }
}
