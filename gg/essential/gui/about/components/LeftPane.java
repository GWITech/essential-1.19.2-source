package gg.essential.gui.about.components;

import gg.essential.elementa.components.*;
import kotlin.reflect.*;
import kotlin.properties.*;
import org.jetbrains.annotations.*;
import java.util.*;
import gg.essential.gui.about.*;
import gg.essential.elementa.state.*;
import java.awt.*;
import gg.essential.util.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.common.modal.*;
import java.net.*;
import gg.essential.universal.*;
import gg.essential.gui.elementa.*;
import gg.essential.elementa.dsl.*;
import gg.essential.gui.*;
import gg.essential.gui.image.*;
import gg.essential.gui.common.shadow.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000 
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u000eB'\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bR\u001b\u0010	\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\f\u0010\r\u001a\u0004\b
                                                   \u0010\u000b¨\u0006\u000f""" }, d2 = { "Lgg/essential/gui/about/components/LeftPane;", "Lgg/essential/elementa/components/UIContainer;", "pages", "", "Lgg/essential/gui/about/Category;", "Lgg/essential/gui/about/components/Page;", "selectedPage", "Lgg/essential/elementa/state/BasicState;", "(Ljava/util/Map;Lgg/essential/elementa/state/BasicState;)V", "sidebarContainer", "getSidebarContainer", "()Lgg/essential/elementa/components/UIContainer;", "sidebarContainer$delegate", "Lkotlin/properties/ReadWriteProperty;", "MenuItem", "essential" })
public final class LeftPane extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final ReadWriteProperty sidebarContainer$delegate;
    
    public LeftPane(@NotNull final Map<Category, ? extends Page> pages, @NotNull final BasicState<Page> selectedPage) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "pages"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* selectedPage */
        //     7: ldc             "selectedPage"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    16: aload_0         /* this */
        //    17: new             Lgg/essential/elementa/components/UIContainer;
        //    20: dup            
        //    21: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    24: checkcast       Lgg/essential/elementa/UIComponent;
        //    27: astore_3        /* $this$constrain$iv */
        //    28: aload_3         /* $this$constrain$iv */
        //    29: astore          4
        //    31: aload           4
        //    33: astore          $this$constrain_u24lambda_u2d0$iv
        //    35: aload           $this$constrain_u24lambda_u2d0$iv
        //    37: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    40: astore          7
        //    42: astore          8
        //    44: aload           $this$sidebarContainer_delegate_u24lambda_u2d0
        //    46: bipush          10
        //    48: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    51: checkcast       Ljava/lang/Number;
        //    54: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //    57: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //    60: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //    63: aload           $this$sidebarContainer_delegate_u24lambda_u2d0
        //    65: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //    68: dup            
        //    69: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //    72: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //    75: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //    78: aload           $this$sidebarContainer_delegate_u24lambda_u2d0
        //    80: new             Lgg/essential/elementa/constraints/FillConstraint;
        //    83: dup            
        //    84: iconst_0       
        //    85: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(Z)V
        //    88: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //    91: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //    94: aload           $this$sidebarContainer_delegate_u24lambda_u2d0
        //    96: bipush          100
        //    98: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   101: checkcast       Ljava/lang/Number;
        //   104: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   107: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   110: bipush          20
        //   112: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   115: checkcast       Ljava/lang/Number;
        //   118: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   121: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   124: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   127: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   130: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   133: aload           8
        //   135: aload           4
        //   137: new             Lgg/essential/elementa/effects/ScissorEffect;
        //   140: dup            
        //   141: aconst_null    
        //   142: iconst_0       
        //   143: iconst_3       
        //   144: aconst_null    
        //   145: invokespecial   gg/essential/elementa/effects/ScissorEffect.<init>:(Lgg/essential/elementa/UIComponent;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   148: checkcast       Lgg/essential/elementa/effects/Effect;
        //   151: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   154: aload_0         /* this */
        //   155: checkcast       Lgg/essential/elementa/UIComponent;
        //   158: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   161: aload_0         /* this */
        //   162: getstatic       gg/essential/gui/about/components/LeftPane.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   165: iconst_0       
        //   166: aaload         
        //   167: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   170: putfield        gg/essential/gui/about/components/LeftPane.sidebarContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   173: aload_1         /* pages */
        //   174: invokeinterface java/util/Map.values:()Ljava/util/Collection;
        //   179: checkcast       Ljava/lang/Iterable;
        //   182: astore_3        /* $this$forEach$iv */
        //   183: aload_3         /* $this$forEach$iv */
        //   184: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   189: astore          4
        //   191: aload           4
        //   193: invokeinterface java/util/Iterator.hasNext:()Z
        //   198: ifeq            244
        //   201: aload           4
        //   203: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   208: astore          element$iv
        //   210: aload           element$iv
        //   212: checkcast       Lgg/essential/gui/about/components/Page;
        //   215: astore          page
        //   217: new             Lgg/essential/gui/about/components/LeftPane$MenuItem;
        //   220: dup            
        //   221: aload           page
        //   223: aload_2         /* selectedPage */
        //   224: invokespecial   gg/essential/gui/about/components/LeftPane$MenuItem.<init>:(Lgg/essential/gui/about/components/Page;Lgg/essential/elementa/state/BasicState;)V
        //   227: checkcast       Lgg/essential/elementa/UIComponent;
        //   230: aload_0         /* this */
        //   231: invokespecial   gg/essential/gui/about/components/LeftPane.getSidebarContainer:()Lgg/essential/elementa/components/UIContainer;
        //   234: checkcast       Lgg/essential/elementa/UIComponent;
        //   237: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   240: pop            
        //   241: goto            191
        //   244: new             Lgg/essential/gui/about/components/VersionInfo;
        //   247: dup            
        //   248: invokespecial   gg/essential/gui/about/components/VersionInfo.<init>:()V
        //   251: checkcast       Lgg/essential/elementa/UIComponent;
        //   254: astore_3        /* $this$constrain$iv */
        //   255: aload_3         /* $this$constrain$iv */
        //   256: astore          4
        //   258: aload           4
        //   260: astore          $this$constrain_u24lambda_u2d0$iv
        //   262: aload           $this$constrain_u24lambda_u2d0$iv
        //   264: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   267: astore          $this$_init__u24lambda_u2d2
        //   269: aload           $this$_init__u24lambda_u2d2
        //   271: iconst_0       
        //   272: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   275: checkcast       Ljava/lang/Number;
        //   278: iconst_1       
        //   279: iconst_0       
        //   280: iconst_2       
        //   281: aconst_null    
        //   282: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   285: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   288: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   291: aload           $this$_init__u24lambda_u2d2
        //   293: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   296: dup            
        //   297: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   300: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   303: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   306: aload           $this$_init__u24lambda_u2d2
        //   308: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   311: dup            
        //   312: fconst_0       
        //   313: iconst_1       
        //   314: aconst_null    
        //   315: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   318: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   321: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   324: aload           4
        //   326: aload_0         /* this */
        //   327: invokespecial   gg/essential/gui/about/components/LeftPane.getSidebarContainer:()Lgg/essential/elementa/components/UIContainer;
        //   330: checkcast       Lgg/essential/elementa/UIComponent;
        //   333: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   336: pop            
        //   337: return         
        //    Signature:
        //  (Ljava/util/Map<Lgg/essential/gui/about/Category;+Lgg/essential/gui/about/components/Page;>;Lgg/essential/elementa/state/BasicState<Lgg/essential/gui/about/components/Page;>;)V
        //    MethodParameters:
        //  Name          Flags  
        //  ------------  -----
        //  pages         
        //  selectedPage  
        //    StackMapTable: 00 02 FF 00 BF 00 05 07 00 02 00 07 00 9C 00 07 00 9E 00 00 FF 00 34 00 01 07 00 02 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final UIContainer getSidebarContainer() {
        return (UIContainer)this.sidebarContainer$delegate.getValue((Object)this, (KProperty)LeftPane.$$delegatedProperties[0]);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)LeftPane.class, "sidebarContainer", "getSidebarContainer()Lgg/essential/elementa/components/UIContainer;", 0)) };
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u00002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u000b
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006R&\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020
                                                       \u0012\u0004\u0012\u00020
                                                       0	\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002
                                                       \u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020
                                                       0\rX\u0082\u0004¢\u0006\u0002
                                                       \u0000R\u000e\u0010\u000e\u001a\u00020
                                                       X\u0082\u0004¢\u0006\u0002
                                                       \u0000R\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020
                                                       0\bX\u0082\u0004¢\u0006\u0002
                                                       \u0000¨\u0006\u0010""" }, d2 = { "Lgg/essential/gui/about/components/LeftPane$MenuItem;", "Lgg/essential/elementa/components/UIContainer;", "page", "Lgg/essential/gui/about/components/Page;", "selectedPage", "Lgg/essential/elementa/state/BasicState;", "(Lgg/essential/gui/about/components/Page;Lgg/essential/elementa/state/BasicState;)V", "color", "Lgg/essential/elementa/state/MappedState;", "Lkotlin/Pair;", "", "Ljava/awt/Color;", "hovered", "Lgg/essential/elementa/state/State;", "isLink", "selected", "essential" })
    private static final class MenuItem extends UIContainer
    {
        @NotNull
        private final MappedState<Page, Boolean> selected;
        @NotNull
        private final State<Boolean> hovered;
        @NotNull
        private final MappedState<Pair<Boolean, Boolean>, Color> color;
        private final boolean isLink;
        
        public MenuItem(@NotNull final Page page, @NotNull final BasicState<Page> selectedPage) {
            Intrinsics.checkNotNullParameter((Object)page, "page");
            Intrinsics.checkNotNullParameter((Object)selectedPage, "selectedPage");
            super();
            this.selected = selectedPage.map((kotlin.jvm.functions.Function1<? super Page, ? extends Boolean>)new LeftPane$MenuItem$selected.LeftPane$MenuItem$selected$1(page));
            this.hovered = ExtensionsKt.hoveredState$default$56721d26(this, false, false, 3);
            this.color = (MappedState<Pair<Boolean, Boolean>, Color>)this.selected.zip(this.hovered).map((kotlin.jvm.functions.Function1<? super kotlin.Pair<Object, Boolean>, ? extends Color>)LeftPane$MenuItem$color.LeftPane$MenuItem$color$1.INSTANCE);
            this.isLink = (page instanceof LinkPage);
            UIComponent $this$constrain_u24lambda_u2d0$iv;
            UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = this;
            final UIConstraints $this$_init__u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
            $this$_init__u24lambda_u2d0.setY(new SiblingConstraint(0.0f, false, 3, null));
            $this$_init__u24lambda_u2d0.setWidth(new ChildBasedSizeConstraint(0.0f, 1, null));
            $this$_init__u24lambda_u2d0.setHeight(ConstraintsKt.plus(new ChildBasedMaxSizeConstraint(), UtilitiesKt.getPixels(8)));
            final UIComponent $this$onLeftClick$iv = this;
            $this$onLeftClick$iv.onMouseClick((Function2<? super UIComponent, ? super UIClickEvent, Unit>)new Function2<UIComponent, UIClickEvent, Unit>(this, page, selectedPage) {
                final /* synthetic */ MenuItem this$0;
                final /* synthetic */ Page $page$inlined;
                final /* synthetic */ BasicState $selectedPage$inlined;
                
                public LeftPane$MenuItem$special$$inlined$onLeftClick$1(final MenuItem this$0, final Page $page$inlined, final BasicState $selectedPage$inlined) {
                    this.this$0 = this$0;
                    this.$page$inlined = $page$inlined;
                    this.$selectedPage$inlined = $selectedPage$inlined;
                    super(2);
                }
                
                public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
                    Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
                    Intrinsics.checkNotNullParameter((Object)it, "it");
                    if (it.getMouseButton() == 0 && !(boolean)MenuItem.access$getSelected$p(this.this$0).get()) {
                        if (this.$page$inlined instanceof final LinkPage linkPage) {
                            OpenLinkModal.Companion.openUrl(new URI(linkPage.getLink()));
                        }
                        else {
                            this.$selectedPage$inlined.set(this.$page$inlined);
                        }
                        USound.playButtonPress$default(USound.INSTANCE, 0.0f, 1, null);
                    }
                }
                
                public /* bridge */ Object invoke(final Object p1, final Object p2) {
                    this.invoke((UIComponent)p1, (UIClickEvent)p2);
                    return Unit.INSTANCE;
                }
            });
            $this$constrain$iv = ($this$constrain_u24lambda_u2d0$iv = new EssentialUIText(null, false, null, false, false, false, 63).bindText(page.getName()).setColor(gg.essential.elementa.state.ExtensionsKt.toConstraint((State<Color>)this.color)));
            final UIConstraints $this$_init__u24lambda_u2d2 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
            $this$_init__u24lambda_u2d2.setY(new CenterConstraint());
            $this$_init__u24lambda_u2d2.setTextScale(new GuiScaleOffsetConstraint(1.0f));
            ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, this);
            if (this.isLink) {
                $this$constrain$iv = ($this$constrain_u24lambda_u2d0$iv = new ShadowIcon(new BasicState<ImageFactory>(EssentialPalette.ARROW_UP_RIGHT_5X5), new BasicState<Boolean>(true), (State<Color>)this.color, new BasicState<Color>(new Color(2236962))));
                final UIConstraints $this$_init__u24lambda_u2d3 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
                $this$_init__u24lambda_u2d3.setX(ConstraintsKt.plus(new SiblingConstraint(0.0f, false, 3, null), ExtensionsKt.times(UtilitiesKt.getPixels(3), new GuiScaleOffsetConstraint(1.0f))));
                $this$_init__u24lambda_u2d3.setY(new CenterConstraint());
                $this$_init__u24lambda_u2d3.setWidth(new AspectConstraint(0.0f, 1, null));
                $this$_init__u24lambda_u2d3.setHeight(ExtensionsKt.times(UtilitiesKt.getPixels(5), new GuiScaleOffsetConstraint(1.0f)));
                $this$_init__u24lambda_u2d3.setColor(gg.essential.elementa.state.ExtensionsKt.toConstraint((State<Color>)this.color));
                ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, this);
            }
        }
        
        public static final /* synthetic */ MappedState access$getSelected$p(final MenuItem $this) {
            return $this.selected;
        }
    }
}
