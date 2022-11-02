package gg.essential.gui.screenshot.components;

import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.state.*;
import kotlin.properties.*;
import gg.essential.util.*;
import gg.essential.gui.*;
import gg.essential.gui.common.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import gg.essential.elementa.*;
import gg.essential.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.friends.message.*;
import java.awt.*;
import gg.essential.data.*;
import java.util.*;
import gg.essential.elementa.components.*;
import gg.essential.network.connectionmanager.*;
import gg.essential.network.connectionmanager.media.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00008
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b	\u0010
                                                   \u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0011X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0017""" }, d2 = { "Lgg/essential/gui/screenshot/components/ShareButton;", "Lgg/essential/elementa/components/UIContainer;", "screenshotBrowser", "Lgg/essential/gui/screenshot/components/ScreenshotBrowser;", "(Lgg/essential/gui/screenshot/components/ScreenshotBrowser;)V", "image", "Lgg/essential/elementa/UIComponent;", "getImage", "()Lgg/essential/elementa/UIComponent;", "image$delegate", "Lkotlin/properties/ReadWriteProperty;", "getScreenshotBrowser", "()Lgg/essential/gui/screenshot/components/ScreenshotBrowser;", "shareHovered", "Lgg/essential/elementa/state/State;", "", "shouldMenuExist", "Lgg/essential/elementa/state/BasicState;", "openMenu", "", "setDimension", "dimension", "Lgg/essential/gui/common/IconButton$Dimension;", "essential" })
public final class ShareButton extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final ScreenshotBrowser screenshotBrowser;
    @NotNull
    private final State<Boolean> shareHovered;
    @NotNull
    private final BasicState<Boolean> shouldMenuExist;
    @NotNull
    private final ReadWriteProperty image$delegate;
    
    public ShareButton(@NotNull final ScreenshotBrowser screenshotBrowser) {
        Intrinsics.checkNotNullParameter((Object)screenshotBrowser, "screenshotBrowser");
        super();
        this.screenshotBrowser = screenshotBrowser;
        this.shareHovered = ExtensionsKt.hoveredState$default$56721d26(this, false, false, 3);
        this.shouldMenuExist = new BasicState<Boolean>(false);
        this.image$delegate = ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf(new IconButton(EssentialPalette.UPLOAD_9X, null, "Share", false, false, false, 58).rebindIconColor(EssentialPalette.INSTANCE.getTextColor((State<Boolean>)StateExtensionsKt.or(this.shareHovered, this.shouldMenuExist))).setColor(gg.essential.elementa.state.ExtensionsKt.toConstraint(EssentialPalette.INSTANCE.getButtonColor((State<Boolean>)StateExtensionsKt.or(this.shareHovered, this.shouldMenuExist)))), this), this, ShareButton.$$delegatedProperties[0]);
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = this;
        final UIConstraints $this$_init__u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d0.setWidth(new ChildBasedSizeConstraint(0.0f, 1, null));
        $this$_init__u24lambda_u2d0.setHeight(new ChildBasedSizeConstraint(0.0f, 1, null));
        final UIComponent $this$onLeftClick$iv = this.getImage();
        $this$onLeftClick$iv.onMouseClick((Function2<? super UIComponent, ? super UIClickEvent, Unit>)new Function2<UIComponent, UIClickEvent, Unit>(this) {
            final /* synthetic */ ShareButton this$0;
            
            public ShareButton$special$$inlined$onLeftClick$1(final ShareButton this$0) {
                this.this$0 = this$0;
                super(2);
            }
            
            public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
                Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
                Intrinsics.checkNotNullParameter((Object)it, "it");
                if (it.getMouseButton() == 0) {
                    ShareButton.access$getShouldMenuExist$p(this.this$0).set((Function1)ShareButton$2$1.INSTANCE);
                }
            }
            
            public /* bridge */ Object invoke(final Object p1, final Object p2) {
                this.invoke((UIComponent)p1, (UIClickEvent)p2);
                return Unit.INSTANCE;
            }
        });
        this.shouldMenuExist.onSetValue((kotlin.jvm.functions.Function1<? super Object, Unit>)new Function1<Boolean, Unit>() {
            final /* synthetic */ ShareButton this$0;
            
            ShareButton$3() {
                this.this$0 = $receiver;
                super(1);
            }
            
            public final void invoke(final boolean it) {
                if (it) {
                    ShareButton.this.openMenu();
                }
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                this.invoke((boolean)p1);
                return Unit.INSTANCE;
            }
        });
    }
    
    @NotNull
    public final ScreenshotBrowser getScreenshotBrowser() {
        return this.screenshotBrowser;
    }
    
    private final UIComponent getImage() {
        return (UIComponent)this.image$delegate.getValue((Object)this, (KProperty)ShareButton.$$delegatedProperties[0]);
    }
    
    private final void openMenu() {
        final List options = new ArrayList();
        final ConnectionManager connectionManager2 = Essential.getInstance().getConnectionManager();
        Intrinsics.checkNotNullExpressionValue((Object)connectionManager2, "getInstance().connectionManager");
        final ConnectionManager connectionManager = connectionManager2;
        final ScreenshotManager screenshotManager2 = connectionManager.getScreenshotManager();
        Intrinsics.checkNotNullExpressionValue((Object)screenshotManager2, "connectionManager.screenshotManager");
        final ScreenshotManager screenshotManager = screenshotManager2;
        final FocusEditComponent editComponent = this.screenshotBrowser.getFocusEditComponent();
        options.add(new OptionMenu.Option("Copy Image", null, EssentialPalette.COPY_9X, null, null, null, null, (Function0)new ShareButton$openMenu.ShareButton$openMenu$1(editComponent, this, screenshotManager), 122));
        if (OnboardingData.hasAcceptedTos() && connectionManager.isAuthenticated()) {
            options.add(new OptionMenu.Option("Copy Link", null, EssentialPalette.LINK_8X7, null, null, null, null, (Function0)new ShareButton$openMenu.ShareButton$openMenu$2(this, editComponent, screenshotManager), 122));
        }
        final float posX = 0.0f;
        final float posY = 0.0f;
        final Collection thisCollection$iv;
        final Collection $this$toTypedArray$iv = thisCollection$iv = options;
        final OptionMenu.Option[] array = thisCollection$iv.toArray(new OptionMenu.Option[0]);
        Intrinsics.checkNotNull((Object)array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final OptionMenu.Option[] original = array;
        final OptionMenu menu = new OptionMenu(posX, posY, (OptionMenu.Option[])Arrays.copyOf(original, original.length));
        menu.onClose((Function0<Unit>)new ShareButton$openMenu.ShareButton$openMenu$3(this));
        Window.Companion.enqueueRenderOperation((Function0<Unit>)new ShareButton$openMenu.ShareButton$openMenu$4(menu, this));
    }
    
    @NotNull
    public final ShareButton setDimension(@NotNull final IconButton.Dimension dimension) {
        Intrinsics.checkNotNullParameter((Object)dimension, "dimension");
        ((IconButton)this.getImage()).setDimension(dimension);
        return this;
    }
    
    public static final /* synthetic */ BasicState access$getShouldMenuExist$p(final ShareButton $this) {
        return $this.shouldMenuExist;
    }
    
    public static final /* synthetic */ void access$openMenu(final ShareButton $this) {
        $this.openMenu();
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ShareButton.class, "image", "getImage()Lgg/essential/elementa/UIComponent;", 0)) };
    }
}
