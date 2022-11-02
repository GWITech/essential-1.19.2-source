package gg.essential.gui.common;

import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import gg.essential.gui.image.*;
import java.awt.*;
import gg.essential.elementa.state.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.*;
import gg.essential.gui.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000@
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010	\u001a\u00020\b\u0012\b\b\u0002\u0010
                                                   \u001a\u00020\u000b¢\u0006\u0002\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0018""" }, d2 = { "Lgg/essential/gui/common/EssentialCollapsibleSearchbar;", "Lgg/essential/gui/common/EssentialSearchbar;", "placeholder", "", "placeholderColor", "Ljava/awt/Color;", "initialValue", "activateOnSearchHokey", "", "activateOnType", "expandedWidth", "", "(Ljava/lang/String;Ljava/awt/Color;Ljava/lang/String;ZZI)V", "collapsed", "Lgg/essential/elementa/state/BasicState;", "toggleButton", "Lgg/essential/elementa/UIComponent;", "getToggleButton", "()Lgg/essential/elementa/UIComponent;", "toggleButton$delegate", "Lkotlin/properties/ReadWriteProperty;", "toggleIcon", "Lgg/essential/elementa/state/MappedState;", "Lgg/essential/gui/image/ImageFactory;", "essential" })
public final class EssentialCollapsibleSearchbar extends EssentialSearchbar
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final BasicState<Boolean> collapsed;
    @NotNull
    private final MappedState<Boolean, ImageFactory> toggleIcon;
    
    public EssentialCollapsibleSearchbar(@NotNull final String placeholder, @NotNull final Color placeholderColor, @NotNull final String initialValue, final boolean activateOnSearchHokey, final boolean activateOnType, final int expandedWidth) {
        Intrinsics.checkNotNullParameter((Object)placeholder, "placeholder");
        Intrinsics.checkNotNullParameter((Object)placeholderColor, "placeholderColor");
        Intrinsics.checkNotNullParameter((Object)initialValue, "initialValue");
        super(placeholder, placeholderColor, initialValue, activateOnSearchHokey, activateOnType);
        this.collapsed = new BasicState<Boolean>(true);
        this.toggleIcon = this.collapsed.map((kotlin.jvm.functions.Function1<? super Boolean, ? extends ImageFactory>)EssentialCollapsibleSearchbar$toggleIcon.EssentialCollapsibleSearchbar$toggleIcon$1.INSTANCE);
        UIComponent $this$constrain_u24lambda_u2d0$iv;
        UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new IconButton((State<ImageFactory>)this.toggleIcon, StateExtensionsKt.state(""), StateExtensionsKt.state(true), StateExtensionsKt.state(""), StateExtensionsKt.state(true), StateExtensionsKt.state(true), true);
        final UIConstraints $this$toggleButton_delegate_u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$toggleButton_delegate_u24lambda_u2d0.setX(UtilitiesKt.pixels$default(0, true, false, 2, null));
        $this$toggleButton_delegate_u24lambda_u2d0.setWidth(new AspectConstraint(0.0f, 1, null));
        $this$toggleButton_delegate_u24lambda_u2d0.setHeight(UtilitiesKt.getPercent(100));
        final UIComponent $this$onLeftClick$iv = $this$constrain_u24lambda_u2d0$iv;
        ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf($this$onLeftClick$iv.onMouseClick((Function2<? super UIComponent, ? super UIClickEvent, Unit>)new Function2<UIComponent, UIClickEvent, Unit>(this) {
            final /* synthetic */ EssentialCollapsibleSearchbar this$0;
            
            public EssentialCollapsibleSearchbar$special$$inlined$onLeftClick$1(final EssentialCollapsibleSearchbar this$0) {
                this.this$0 = this$0;
                super(2);
            }
            
            public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
                Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
                Intrinsics.checkNotNullParameter((Object)it, "it");
                if (it.getMouseButton() == 0) {
                    EssentialCollapsibleSearchbar.access$getCollapsed$p(this.this$0).set((Function1)EssentialCollapsibleSearchbar$toggleButton$3$1.INSTANCE);
                    if (EssentialCollapsibleSearchbar.access$getCollapsed$p(this.this$0).get()) {
                        this.this$0.getTextContent().set("");
                    }
                    else {
                        this.this$0.activateSearch();
                    }
                }
            }
            
            public /* bridge */ Object invoke(final Object p1, final Object p2) {
                this.invoke((UIComponent)p1, (UIClickEvent)p2);
                return Unit.INSTANCE;
            }
        }), this), this, EssentialCollapsibleSearchbar.$$delegatedProperties[0]);
        $this$constrain$iv = ($this$constrain_u24lambda_u2d0$iv = this);
        final UIConstraints $this$_init__u24lambda_u2d2 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d2.setWidth(new ChildBasedSizeConstraint(0.0f, 1, null));
        StateExtensionsKt.bindParent$default$6fcd5b6b(this.getSearchContainer().setWidth(UtilitiesKt.getPixels(expandedWidth)), this, StateExtensionsKt.not(this.collapsed), false, null, 12);
        this.getSearchInput().onFocus((Function1<? super UIComponent, Unit>)new Function1<UIComponent, Unit>() {
            final /* synthetic */ EssentialCollapsibleSearchbar this$0;
            
            EssentialCollapsibleSearchbar$2() {
                this.this$0 = $receiver;
                super(1);
            }
            
            public final void invoke(@NotNull final UIComponent $this$onFocus) {
                Intrinsics.checkNotNullParameter((Object)$this$onFocus, "$this$onFocus");
                EssentialCollapsibleSearchbar.access$getCollapsed$p(this.this$0).set(false);
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                this.invoke((UIComponent)p1);
                return Unit.INSTANCE;
            }
        });
    }
    
    public EssentialCollapsibleSearchbar(String placeholder, Color text, String initialValue, boolean activateOnSearchHokey, boolean activateOnType, int expandedWidth, final int n) {
        if ((n & 0x1) != 0x0) {
            placeholder = "Search...";
        }
        if ((n & 0x2) != 0x0) {
            text = EssentialPalette.TEXT;
        }
        if ((n & 0x4) != 0x0) {
            initialValue = "";
        }
        if ((n & 0x8) != 0x0) {
            activateOnSearchHokey = true;
        }
        if ((n & 0x10) != 0x0) {
            activateOnType = true;
        }
        if ((n & 0x20) != 0x0) {
            expandedWidth = 95;
        }
        this(placeholder, text, initialValue, activateOnSearchHokey, activateOnType, expandedWidth);
    }
    
    public EssentialCollapsibleSearchbar() {
        this(null, null, null, false, false, 0, 63);
    }
    
    public static final /* synthetic */ BasicState access$getCollapsed$p(final EssentialCollapsibleSearchbar $this) {
        return $this.collapsed;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialCollapsibleSearchbar.class, "toggleButton", "getToggleButton()Lgg/essential/elementa/UIComponent;", 0)) };
    }
}
