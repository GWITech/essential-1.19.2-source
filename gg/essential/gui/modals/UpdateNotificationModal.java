package gg.essential.gui.modals;

import kotlin.reflect.*;
import gg.essential.gui.common.modal.*;
import gg.essential.gui.*;
import gg.essential.elementa.events.*;
import org.jetbrains.annotations.*;
import gg.essential.gui.common.*;
import gg.essential.util.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.state.*;
import kotlin.properties.*;
import java.awt.*;
import gg.essential.elementa.constraints.*;
import kotlin.jvm.functions.*;
import kotlin.collections.*;
import gg.essential.data.*;
import gg.essential.elementa.*;
import java.util.*;
import gg.essential.elementa.components.*;
import kotlin.*;
import gg.essential.gui.about.components.*;
import gg.essential.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u001c
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003²\u0006
                                                   \u0010\u0004\u001a\u00020\u0005X\u008a\u0084\u0002²\u0006
                                                   \u0010\u0006\u001a\u00020\u0007X\u008a\u0084\u0002²\u0006
                                                   \u0010\b\u001a\u00020	X\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/modals/UpdateNotificationModal;", "Lgg/essential/gui/common/modal/VerticalConfirmDenyModal;", "()V", "essential", "notifyContainer", "Lgg/essential/elementa/UIComponent;", "notifyToggle", "Lgg/essential/gui/common/Checkbox;", "changelog", "Lgg/essential/elementa/components/UIWrappedText;" })
public final class UpdateNotificationModal extends VerticalConfirmDenyModal
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    
    public UpdateNotificationModal() {
        super();
        final EssentialModal $this$configure_u24lambda_u2d0$iv;
        final EssentialModal $this$configure$iv = $this$configure_u24lambda_u2d0$iv = this;
        final UpdateNotificationModal $this$_init__u24lambda_u2d0 = (UpdateNotificationModal)$this$configure_u24lambda_u2d0$iv;
        $this$_init__u24lambda_u2d0.setTitleText("Essential has been updated!");
        $this$_init__u24lambda_u2d0.setTitleTextColor(EssentialPalette.ACCENT_BLUE);
        $this$_init__u24lambda_u2d0.setCancelButtonText("See Changelog");
        this.getSpacer().setHeight(UtilitiesKt.getPixels(11));
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new UIContainer();
        final UIConstraints $this$_init__u24lambda_u2d2 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d2.setX(new CenterConstraint());
        $this$_init__u24lambda_u2d2.setY(new SiblingConstraint(14.0f, false, 2, null));
        $this$_init__u24lambda_u2d2.setWidth(new ChildBasedSizeConstraint(0.0f, 1, null));
        $this$_init__u24lambda_u2d2.setHeight(new ChildBasedMaxSizeConstraint());
        final UIComponent $this$onLeftClick$iv = $this$constrain_u24lambda_u2d0$iv;
        final ReadWriteProperty notifyContainer$delegate = ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf($this$onLeftClick$iv.onMouseClick((Function2<? super UIComponent, ? super UIClickEvent, Unit>)new Function2<UIComponent, UIClickEvent, Unit>() {
            public UpdateNotificationModal$special$$inlined$onLeftClick$1() {
                super(2);
            }
            
            public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
                Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
                Intrinsics.checkNotNullParameter((Object)it, "it");
                if (it.getMouseButton() == 0) {
                    final UIComponent $this$findChildOfTypeOrNull_u24default$iv;
                    final UIComponent $this$_init__u24lambda_u2d2 = $this$findChildOfTypeOrNull_u24default$iv = $this$onMouseClick;
                    final Checkbox checkbox = ExtensionsKt.findChildOfTypeOrNull($this$findChildOfTypeOrNull_u24default$iv, Checkbox.class, false);
                    if (checkbox != null) {
                        checkbox.toggle();
                    }
                }
            }
            
            public /* bridge */ Object invoke(final Object p1, final Object p2) {
                this.invoke((UIComponent)p1, (UIClickEvent)p2);
                return Unit.INSTANCE;
            }
        }), this.getCustomContent()), null, UpdateNotificationModal.$$delegatedProperties[0]);
        UIComponent $this$constrain_u24lambda_u2d0$iv2;
        UIComponent $this$constrain$iv2 = $this$constrain_u24lambda_u2d0$iv2 = new Checkbox(false, null, new BasicState(EssentialPalette.TEXT), 0.0f, false, null, 59);
        final UIConstraints $this$_init__u24lambda_u2d3 = $this$constrain_u24lambda_u2d0$iv2.getConstraints();
        $this$_init__u24lambda_u2d3.setWidth(UtilitiesKt.getPixels(9));
        $this$_init__u24lambda_u2d3.setHeight(new AspectConstraint(0.0f, 1, null));
        $this$_init__u24lambda_u2d3.setY(new CenterConstraint());
        final ReadWriteProperty notifyToggle$delegate = ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv2, _init_$lambda-3((ReadWriteProperty<Object, UIComponent>)notifyContainer$delegate)), null, UpdateNotificationModal.$$delegatedProperties[1]);
        $this$constrain$iv2 = ($this$constrain_u24lambda_u2d0$iv2 = new UIText("Do not notify me about updates", false, null, 4, null));
        final UIConstraints $this$_init__u24lambda_u2d4 = $this$constrain_u24lambda_u2d0$iv2.getConstraints();
        $this$_init__u24lambda_u2d4.setX(new SiblingConstraint(5.0f, false, 2, null));
        $this$_init__u24lambda_u2d4.setY(new CenterConstraint());
        $this$_init__u24lambda_u2d4.setColor(UtilitiesKt.toConstraint(EssentialPalette.TEXT_DISABLED));
        ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv2, _init_$lambda-3((ReadWriteProperty<Object, UIComponent>)notifyContainer$delegate));
        this.onCancel((Function1<? super Boolean, Unit>)UpdateNotificationModal$3.INSTANCE);
        this.onPrimaryAction((Function0<Unit>)UpdateNotificationModal$4.INSTANCE);
        _init_$lambda-5((ReadWriteProperty<Object, Checkbox>)notifyToggle$delegate).isChecked().onSetValue((kotlin.jvm.functions.Function1<? super Object, Unit>)UpdateNotificationModal$5.INSTANCE);
        final List current = VersionData.INSTANCE.getMajorComponents(VersionData.INSTANCE.getEssentialVersion());
        final List saved = VersionData.INSTANCE.getMajorComponents(VersionData.INSTANCE.getLastSeenModal());
        final List versionComponents = CollectionsKt.mutableListOf((Object[])new String[] { "0", "0", "0" });
        final Iterator iterator = current.iterator();
        int n = 0;
        while (iterator.hasNext()) {
            final int index = n;
            ++n;
            final String component = (String)iterator.next();
            versionComponents.set(index, component);
            if (index >= saved.size() || !Intrinsics.areEqual(saved.get(index), (Object)component)) {
                break;
            }
        }
        final String displayVersion = CollectionsKt.joinToString$default((Iterable)versionComponents, (CharSequence)".", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (Function1)null, 62, (Object)null);
        MenuData.INSTANCE.getCHANGELOGS().get(displayVersion).whenCompleteAsync(UpdateNotificationModal::_init_$lambda-9, Window.Companion::enqueueRenderOperation);
    }
    
    private static final UIComponent _init_$lambda-3(final ReadWriteProperty<Object, UIComponent> $notifyContainer$delegate) {
        return (UIComponent)$notifyContainer$delegate.getValue((Object)null, (KProperty)UpdateNotificationModal.$$delegatedProperties[0]);
    }
    
    private static final Checkbox _init_$lambda-5(final ReadWriteProperty<Object, Checkbox> $notifyToggle$delegate) {
        return (Checkbox)$notifyToggle$delegate.getValue((Object)null, (KProperty)UpdateNotificationModal.$$delegatedProperties[1]);
    }
    
    private static final UIWrappedText lambda-9$lambda-8(final ReadWriteProperty<Object, UIWrappedText> $changelog$delegate) {
        return (UIWrappedText)$changelog$delegate.getValue((Object)null, (KProperty)UpdateNotificationModal.$$delegatedProperties[2]);
    }
    
    private static final void _init_$lambda-9(final String $displayVersion, final UpdateNotificationModal this$0, final ReadWriteProperty $notifyContainer$delegate, final Pair pair, final Throwable exception) {
        Intrinsics.checkNotNullParameter((Object)$displayVersion, "$displayVersion");
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)$notifyContainer$delegate, "$notifyContainer$delegate");
        final ChangelogComponent.Changelog log = (ChangelogComponent.Changelog)pair.component2();
        if (exception != null) {
            Essential.logger.error("An error occurred fetching the changelog for version " + $displayVersion, exception);
        }
        else {
            final UIComponent $this$constrain_u24lambda_u2d0$iv;
            final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new UIWrappedText(log.getSummary(), false, Color.BLACK, true, true, 12.0f, null, 66, null);
            final UIConstraints $this$lambda_u2d9_u24lambda_u2d7 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
            $this$lambda_u2d9_u24lambda_u2d7.setX(new CenterConstraint());
            $this$lambda_u2d9_u24lambda_u2d7.setY(new SiblingConstraint(0.0f, false, 3, null));
            $this$lambda_u2d9_u24lambda_u2d7.setWidth(UtilitiesKt.getPercent(100));
            $this$lambda_u2d9_u24lambda_u2d7.setColor(UtilitiesKt.toConstraint(EssentialPalette.TEXT));
            final ReadWriteProperty changelog$delegate = ComponentsKt.provideDelegate($this$constrain_u24lambda_u2d0$iv, null, UpdateNotificationModal.$$delegatedProperties[2]);
            this$0.getCustomContent().insertChildBefore(lambda-9$lambda-8((ReadWriteProperty<Object, UIWrappedText>)changelog$delegate), _init_$lambda-3((ReadWriteProperty<Object, UIComponent>)$notifyContainer$delegate));
        }
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)UpdateNotificationModal.class, "notifyContainer", "<v#0>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)UpdateNotificationModal.class, "notifyToggle", "<v#1>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)UpdateNotificationModal.class, "changelog", "<v#2>", 0)) };
    }
}
