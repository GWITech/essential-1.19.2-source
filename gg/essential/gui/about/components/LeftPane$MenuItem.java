package gg.essential.gui.about.components;

import gg.essential.elementa.components.*;
import org.jetbrains.annotations.*;
import java.awt.*;
import gg.essential.elementa.state.*;
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
                if (it.getMouseButton() == 0 && !(boolean)LeftPane.MenuItem.access$getSelected$p(this.this$0).get()) {
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
