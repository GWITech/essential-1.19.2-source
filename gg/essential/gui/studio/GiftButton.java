package gg.essential.gui.studio;

import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import java.util.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.common.shadow.*;
import java.awt.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;
import gg.essential.gui.common.*;
import kotlin.*;
import gg.essential.elementa.events.*;
import kotlin.jvm.functions.*;
import gg.essential.util.*;
import gg.essential.gui.common.modal.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000>
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010"
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020	0\u0005\u0012\u0012\u0010
                                                   \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\u0010\rR \u0010\u000e\u001a\u0014\u0012
                                                   \u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020	0\u000fX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010
                                                   \u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018""" }, d2 = { "Lgg/essential/gui/studio/GiftButton;", "Lgg/essential/elementa/components/UIBlock;", "window", "Lgg/essential/elementa/components/Window;", "cartItems", "Lgg/essential/elementa/state/State;", "", "", "inCart", "", "handlePurchaseCallback", "Lkotlin/Function1;", "", "(Lgg/essential/elementa/components/Window;Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function1;)V", "enabled", "Lgg/essential/elementa/state/MappedState;", "text", "Lgg/essential/gui/common/shadow/EssentialUIText;", "getText", "()Lgg/essential/gui/common/shadow/EssentialUIText;", "text$delegate", "Lkotlin/properties/ReadWriteProperty;", "getWindow", "()Lgg/essential/elementa/components/Window;", "essential" })
public final class GiftButton extends UIBlock
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final Function1<String, Unit> handlePurchaseCallback;
    @NotNull
    private final ReadWriteProperty text$delegate;
    @NotNull
    private final MappedState<Set<String>, Boolean> enabled;
    
    public GiftButton(@NotNull final Window window, @NotNull final State<Set<String>> cartItems, @NotNull final State<Boolean> inCart, @NotNull final Function1<? super String, Unit> handlePurchaseCallback) {
        Intrinsics.checkNotNullParameter((Object)window, "window");
        Intrinsics.checkNotNullParameter((Object)cartItems, "cartItems");
        Intrinsics.checkNotNullParameter((Object)inCart, "inCart");
        Intrinsics.checkNotNullParameter((Object)handlePurchaseCallback, "handlePurchaseCallback");
        super(null, 1, null);
        this.handlePurchaseCallback = (Function1<String, Unit>)handlePurchaseCallback;
        this.text$delegate = ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf((T)ExtensionsKt.centered((T)new EssentialUIText("Gift", false, null, false, false, false, 62)), this), this, GiftButton.$$delegatedProperties[0]);
        this.enabled = cartItems.map((kotlin.jvm.functions.Function1<? super Set<String>, ? extends Boolean>)GiftButton$enabled.GiftButton$enabled$1.INSTANCE);
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = this;
        final UIConstraints $this$_init__u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d0.setWidth(ConstraintsKt.plus(new ChildBasedSizeConstraint(0.0f, 1, null), UtilitiesKt.getPixels(26)));
        $this$_init__u24lambda_u2d0.setHeight(ConstraintsKt.plus(new ChildBasedSizeConstraint(0.0f, 1, null), UtilitiesKt.getPixels(8)));
        this.getText().setColor(gg.essential.elementa.state.ExtensionsKt.toConstraint((State<Color>)StateExtensionsKt.and(ExtensionsKt.hoveredState$default$56721d26(this, false, false, 3), (State<Boolean>)this.enabled).map((kotlin.jvm.functions.Function1<? super Object, ?>)GiftButton$2.INSTANCE)));
        this.setColor(gg.essential.elementa.state.ExtensionsKt.toConstraint((State<Color>)this.enabled.zip((State<Object>)inCart).map((kotlin.jvm.functions.Function1<? super kotlin.Pair<Object, Object>, ?>)GiftButton$3.INSTANCE)));
        final UIComponent $this$onLeftClick$iv = this;
        $this$onLeftClick$iv.onMouseClick((Function2<? super UIComponent, ? super UIClickEvent, Unit>)new Function2<UIComponent, UIClickEvent, Unit>(this) {
            final /* synthetic */ GiftButton this$0;
            
            public GiftButton$special$$inlined$onLeftClick$1(final GiftButton this$0) {
                this.this$0 = this$0;
                super(2);
            }
            
            public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
                Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
                Intrinsics.checkNotNullParameter((Object)it, "it");
                if (it.getMouseButton() == 0) {
                    if (GiftButton.access$getEnabled$p(this.this$0).get()) {
                        final UsernameInputModal modal = new UsernameInputModal("Username");
                        final EssentialModal $this$configure_u24lambda_u2d0$iv;
                        final EssentialModal $this$configure$iv = $this$configure_u24lambda_u2d0$iv = modal;
                        final UsernameInputModal $this$lambda_u2d2_u24lambda_u2d1 = (UsernameInputModal)$this$configure_u24lambda_u2d0$iv;
                        $this$lambda_u2d2_u24lambda_u2d1.setTitleText("Gift Cosmetics to Player");
                        $this$lambda_u2d2_u24lambda_u2d1.setPrimaryButtonText("Gift");
                        ((UsernameInputModal)$this$configure_u24lambda_u2d0$iv).onPrimaryAction((Function0<Unit>)new GiftButton$4$2(this.this$0, modal));
                        GuiUtil.INSTANCE.pushModal(modal);
                    }
                }
            }
            
            public /* bridge */ Object invoke(final Object p1, final Object p2) {
                this.invoke((UIComponent)p1, (UIClickEvent)p2);
                return Unit.INSTANCE;
            }
        });
    }
    
    private final EssentialUIText getText() {
        return (EssentialUIText)this.text$delegate.getValue((Object)this, (KProperty)GiftButton.$$delegatedProperties[0]);
    }
    
    public static final /* synthetic */ MappedState access$getEnabled$p(final GiftButton $this) {
        return $this.enabled;
    }
    
    public static final /* synthetic */ Function1 access$getHandlePurchaseCallback$p(final GiftButton $this) {
        return $this.handlePurchaseCallback;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)GiftButton.class, "text", "getText()Lgg/essential/gui/common/shadow/EssentialUIText;", 0)) };
    }
}
