package gg.essential.gui.menu.compact;

import kotlin.reflect.*;
import gg.essential.handlers.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.components.*;
import gg.essential.gui.menu.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.dsl.*;
import gg.essential.gui.common.*;
import gg.essential.util.*;
import kotlin.properties.*;
import gg.essential.elementa.constraints.*;
import gg.essential.data.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010	\u001a\u00020
                                                   ¢\u0006\u0002\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012²\u0006
                                                   \u0010\u0013\u001a\u00020\bX\u008a\u0084\u0002²\u0006
                                                   \u0010\u0014\u001a\u00020\bX\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/menu/compact/CompactRightSideBar;", "Lgg/essential/gui/menu/RightSideBar;", "menuType", "Lgg/essential/handlers/PauseMenuDisplay$MenuType;", "menuVisible", "Lgg/essential/elementa/state/State;", "", "parentContainer", "Lgg/essential/elementa/components/UIContainer;", "accountManager", "Lgg/essential/gui/menu/AccountManager;", "(Lgg/essential/handlers/PauseMenuDisplay$MenuType;Lgg/essential/elementa/state/State;Lgg/essential/elementa/components/UIContainer;Lgg/essential/gui/menu/AccountManager;)V", "accountSwitcher", "Lgg/essential/gui/menu/compact/CompactAccountSwitcher;", "getAccountSwitcher", "()Lgg/essential/gui/menu/compact/CompactAccountSwitcher;", "accountSwitcher$delegate", "Lkotlin/properties/ReadWriteProperty;", "essential", "aboutContainer", "socialContainer" })
public final class CompactRightSideBar extends RightSideBar
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    
    public CompactRightSideBar(@NotNull final PauseMenuDisplay.MenuType menuType, @NotNull final State<Boolean> menuVisible, @NotNull final UIContainer parentContainer, @NotNull final AccountManager accountManager) {
        Intrinsics.checkNotNullParameter((Object)menuType, "menuType");
        Intrinsics.checkNotNullParameter((Object)menuVisible, "menuVisible");
        Intrinsics.checkNotNullParameter((Object)parentContainer, "parentContainer");
        Intrinsics.checkNotNullParameter((Object)accountManager, "accountManager");
        super(menuType, menuVisible);
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = accountManager.getCompactAccountSwitcher(parentContainer);
        final UIConstraints $this$accountSwitcher_delegate_u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$accountSwitcher_delegate_u24lambda_u2d0.setX(UtilitiesKt.pixels$default(0, true, false, 2, null));
        ComponentsKt.provideDelegate(StateExtensionsKt.bindParent$default$6fcd5b6b($this$constrain_u24lambda_u2d0$iv, this, new BasicState(menuType == PauseMenuDisplay.MenuType.MAIN), false, null, 12), this, CompactRightSideBar.$$delegatedProperties[0]);
        this.getCollapsed().rebind(new BasicState<Boolean>(true));
        UIComponent $this$constrain_u24lambda_u2d0$iv2;
        UIComponent $this$constrain$iv2 = $this$constrain_u24lambda_u2d0$iv2 = new UIContainer();
        final UIConstraints $this$_init__u24lambda_u2d1 = $this$constrain_u24lambda_u2d0$iv2.getConstraints();
        $this$_init__u24lambda_u2d1.setX(UtilitiesKt.pixels$default(0, true, false, 2, null));
        $this$_init__u24lambda_u2d1.setY(new SiblingConstraint(4.0f, false, 2, null));
        $this$_init__u24lambda_u2d1.setWidth(new ChildBasedSizeConstraint(0.0f, 1, null));
        $this$_init__u24lambda_u2d1.setHeight(new ChildBasedMaxSizeConstraint());
        final ReadWriteProperty aboutContainer$delegate = ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv2, this), null, CompactRightSideBar.$$delegatedProperties[1]);
        $this$constrain$iv2 = ($this$constrain_u24lambda_u2d0$iv2 = this.getEssentialButton());
        final UIConstraints $this$_init__u24lambda_u2d2 = $this$constrain_u24lambda_u2d0$iv2.getConstraints();
        $this$_init__u24lambda_u2d2.setX(UtilitiesKt.pixels$default(0, true, false, 2, null));
        ComponentsKt.childOf(ExtensionsKt.bindHoverEssentialTooltip$default$3fdaea44($this$constrain_u24lambda_u2d0$iv2, this.getEssentialTooltip(), EssentialTooltip.Position.LEFT, 0.0f, null, null, 28), _init_$lambda-2((ReadWriteProperty<Object, UIContainer>)aboutContainer$delegate));
        $this$constrain$iv2 = ($this$constrain_u24lambda_u2d0$iv2 = this.getBetaFlag());
        final UIConstraints $this$_init__u24lambda_u2d3 = $this$constrain_u24lambda_u2d0$iv2.getConstraints();
        $this$_init__u24lambda_u2d3.setX(new SiblingConstraint(3.0f, true));
        $this$_init__u24lambda_u2d3.setY(new CenterConstraint());
        StateExtensionsKt.bindParent$default$6fcd5b6b($this$constrain_u24lambda_u2d0$iv2, _init_$lambda-2((ReadWriteProperty<Object, UIContainer>)aboutContainer$delegate), new BasicState(!Intrinsics.areEqual((Object)VersionData.INSTANCE.getEssentialBranch(), (Object)"stable")), false, null, 12);
        $this$constrain$iv2 = ($this$constrain_u24lambda_u2d0$iv2 = this.getWorldSettings());
        final UIConstraints $this$_init__u24lambda_u2d4 = $this$constrain_u24lambda_u2d0$iv2.getConstraints();
        $this$_init__u24lambda_u2d4.setX(UtilitiesKt.pixels$default(0, true, false, 2, null));
        $this$_init__u24lambda_u2d4.setY(new SiblingConstraint(4.0f, false, 2, null));
        StateExtensionsKt.bindParent$default$6fcd5b6b(ExtensionsKt.bindHoverEssentialTooltip$default$3fdaea44($this$constrain_u24lambda_u2d0$iv2, this.getWorldSettingsTooltip(), EssentialTooltip.Position.LEFT, 0.0f, null, null, 28), this, this.getWorldSettingsVisible(), false, 0, 4);
        $this$constrain$iv2 = ($this$constrain_u24lambda_u2d0$iv2 = this.getInviteButton());
        final UIConstraints $this$_init__u24lambda_u2d5 = $this$constrain_u24lambda_u2d0$iv2.getConstraints();
        $this$_init__u24lambda_u2d5.setX(UtilitiesKt.pixels$default(0, true, false, 2, null));
        $this$_init__u24lambda_u2d5.setY(new SiblingConstraint(4.0f, false, 2, null));
        ComponentsKt.childOf(ExtensionsKt.bindHoverEssentialTooltip$default$3fdaea44($this$constrain_u24lambda_u2d0$iv2, this.getInviteTooltip(), EssentialTooltip.Position.LEFT, 0.0f, null, null, 28), this);
        UIComponent $this$constrain_u24lambda_u2d0$iv3;
        UIComponent $this$constrain$iv3 = $this$constrain_u24lambda_u2d0$iv3 = new UIContainer();
        final UIConstraints $this$_init__u24lambda_u2d6 = $this$constrain_u24lambda_u2d0$iv3.getConstraints();
        $this$_init__u24lambda_u2d6.setX(UtilitiesKt.pixels$default(0, true, false, 2, null));
        $this$_init__u24lambda_u2d6.setY(new SiblingConstraint(4.0f, false, 2, null));
        $this$_init__u24lambda_u2d6.setWidth(new ChildBasedSizeConstraint(0.0f, 1, null));
        $this$_init__u24lambda_u2d6.setHeight(new ChildBasedMaxSizeConstraint());
        final ReadWriteProperty socialContainer$delegate = ComponentsKt.provideDelegate((UIComponent)ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv3, this), null, CompactRightSideBar.$$delegatedProperties[2]);
        $this$constrain$iv3 = ($this$constrain_u24lambda_u2d0$iv3 = this.getSocial());
        final UIConstraints $this$_init__u24lambda_u2d7 = $this$constrain_u24lambda_u2d0$iv3.getConstraints();
        $this$_init__u24lambda_u2d7.setX(UtilitiesKt.pixels$default(0, true, false, 2, null));
        ComponentsKt.childOf(ExtensionsKt.bindHoverEssentialTooltip$default$3fdaea44($this$constrain_u24lambda_u2d0$iv3, this.getSocialTooltip(), EssentialTooltip.Position.LEFT, 0.0f, null, null, 28), _init_$lambda-8((ReadWriteProperty<Object, UIContainer>)socialContainer$delegate));
        $this$constrain$iv3 = ($this$constrain_u24lambda_u2d0$iv3 = this.getMessageFlag());
        final UIConstraints $this$_init__u24lambda_u2d8 = $this$constrain_u24lambda_u2d0$iv3.getConstraints();
        $this$_init__u24lambda_u2d8.setX(new SiblingConstraint(3.0f, true));
        $this$_init__u24lambda_u2d8.setY(new CenterConstraint());
        final UIComponent $this$onLeftClick$iv = $this$constrain_u24lambda_u2d0$iv3;
        StateExtensionsKt.bindParent$default$6fcd5b6b($this$onLeftClick$iv.onMouseClick((Function2<? super UIComponent, ? super UIClickEvent, Unit>)new Function2<UIComponent, UIClickEvent, Unit>(this) {
            final /* synthetic */ CompactRightSideBar this$0;
            
            public CompactRightSideBar$special$$inlined$onLeftClick$1(final CompactRightSideBar this$0) {
                this.this$0 = this$0;
                super(2);
            }
            
            public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
                Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
                Intrinsics.checkNotNullParameter((Object)it, "it");
                if (it.getMouseButton() == 0) {
                    this.this$0.getSocial().runAction();
                }
            }
            
            public /* bridge */ Object invoke(final Object p1, final Object p2) {
                this.invoke((UIComponent)p1, (UIClickEvent)p2);
                return Unit.INSTANCE;
            }
        }), _init_$lambda-8((ReadWriteProperty<Object, UIContainer>)socialContainer$delegate), this.getHasNotices(), false, null, 12);
        $this$constrain$iv3 = ($this$constrain_u24lambda_u2d0$iv3 = this.getPictures());
        final UIConstraints $this$_init__u24lambda_u2d9 = $this$constrain_u24lambda_u2d0$iv3.getConstraints();
        $this$_init__u24lambda_u2d9.setX(UtilitiesKt.pixels$default(0, true, false, 2, null));
        $this$_init__u24lambda_u2d9.setY(new SiblingConstraint(4.0f, false, 2, null));
        ComponentsKt.childOf(ExtensionsKt.bindHoverEssentialTooltip$default$3fdaea44($this$constrain_u24lambda_u2d0$iv3, this.getPicturesTooltip(), EssentialTooltip.Position.LEFT, 0.0f, null, null, 28), this);
        $this$constrain$iv3 = ($this$constrain_u24lambda_u2d0$iv3 = this.getSettings());
        final UIConstraints $this$_init__u24lambda_u2d10 = $this$constrain_u24lambda_u2d0$iv3.getConstraints();
        $this$_init__u24lambda_u2d10.setX(UtilitiesKt.pixels$default(0, true, false, 2, null));
        $this$_init__u24lambda_u2d10.setY(new SiblingConstraint(4.0f, false, 2, null));
        ComponentsKt.childOf(ExtensionsKt.bindHoverEssentialTooltip$default$3fdaea44($this$constrain_u24lambda_u2d0$iv3, this.getSettingsTooltip(), EssentialTooltip.Position.LEFT, 0.0f, null, null, 28), this);
        $this$constrain$iv3 = ($this$constrain_u24lambda_u2d0$iv3 = this.getFolder());
        final UIConstraints $this$_init__u24lambda_u2d11 = $this$constrain_u24lambda_u2d0$iv3.getConstraints();
        $this$_init__u24lambda_u2d11.setX(UtilitiesKt.pixels$default(0, true, false, 2, null));
        $this$_init__u24lambda_u2d11.setY(new SiblingConstraint(4.0f, false, 2, null));
        ComponentsKt.childOf(ExtensionsKt.bindHoverEssentialTooltip$default$3fdaea44($this$constrain_u24lambda_u2d0$iv3, this.getFolderTooltip(), EssentialTooltip.Position.LEFT, 0.0f, null, null, 28), this);
        $this$constrain$iv3 = ($this$constrain_u24lambda_u2d0$iv3 = this);
        final UIConstraints $this$_init__u24lambda_u2d12 = $this$constrain_u24lambda_u2d0$iv3.getConstraints();
        $this$_init__u24lambda_u2d12.setX(UtilitiesKt.pixels$default(0, true, false, 2, null));
        $this$_init__u24lambda_u2d12.setWidth(new ChildBasedMaxSizeConstraint());
        $this$_init__u24lambda_u2d12.setHeight(new ChildBasedSizeConstraint(0.0f, 1, null));
    }
    
    private static final UIContainer _init_$lambda-2(final ReadWriteProperty<Object, UIContainer> $aboutContainer$delegate) {
        return (UIContainer)$aboutContainer$delegate.getValue((Object)null, (KProperty)CompactRightSideBar.$$delegatedProperties[1]);
    }
    
    private static final UIContainer _init_$lambda-8(final ReadWriteProperty<Object, UIContainer> $socialContainer$delegate) {
        return (UIContainer)$socialContainer$delegate.getValue((Object)null, (KProperty)CompactRightSideBar.$$delegatedProperties[2]);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)CompactRightSideBar.class, "accountSwitcher", "getAccountSwitcher()Lgg/essential/gui/menu/compact/CompactAccountSwitcher;", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)CompactRightSideBar.class, "aboutContainer", "<v#0>", 0)), (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)CompactRightSideBar.class, "socialContainer", "<v#1>", 0)) };
    }
}
