package gg.essential.gui.friends.previews;

import gg.essential.elementa.components.*;
import kotlin.reflect.*;
import java.util.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.effects.*;
import gg.essential.elementa.dsl.*;
import kotlin.jvm.functions.*;
import java.awt.*;
import gg.essential.gui.*;
import gg.essential.gui.friends.state.*;
import gg.essential.gui.common.*;
import kotlin.*;
import gg.essential.util.*;
import gg.essential.elementa.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.common.shadow.*;
import kotlin.properties.*;
import gg.essential.elementa.constraints.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012
                                                   \b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0016\u0010	\u001a\u00020
                                                   2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¨\u0006\u000e²\u0006
                                                   \u0010\u000f\u001a\u00020\u0001X\u008a\u0084\u0002""" }, d2 = { "Lgg/essential/gui/friends/previews/FriendStatus;", "Lgg/essential/elementa/components/UIContainer;", "uuid", "Ljava/util/UUID;", "statusStates", "Lgg/essential/gui/friends/state/IStatusStates;", "sortListener", "Lgg/essential/gui/friends/previews/SortListener;", "(Ljava/util/UUID;Lgg/essential/gui/friends/state/IStatusStates;Lgg/essential/gui/friends/previews/SortListener;)V", "createJoinableEntry", "Lgg/essential/elementa/UIComponent;", "display", "Lgg/essential/elementa/state/State;", "", "essential", "container" })
public final class FriendStatus extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    
    public FriendStatus(@NotNull final UUID uuid, @NotNull final IStatusStates statusStates, @Nullable final SortListener sortListener) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        Intrinsics.checkNotNullParameter((Object)statusStates, "statusStates");
        super();
        final UIComponent $this$constrain_u24lambda_u2d0$iv;
        final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = this;
        final UIConstraints $this$_init__u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d0.setWidth(UtilitiesKt.getPercent(100));
        $this$_init__u24lambda_u2d0.setHeight(new ChildBasedMaxSizeConstraint());
        ComponentsKt.effect($this$constrain_u24lambda_u2d0$iv, new ScissorEffect(null, false, 3, null));
        StateExtensionsKt.onSetValueAndNow((State<Object>)statusStates.getActivityState(uuid), (kotlin.jvm.functions.Function1<? super Object, Unit>)new Function1<PlayerActivity, Unit>() {
            final /* synthetic */ FriendStatus this$0;
            final /* synthetic */ SortListener $sortListener;
            
            FriendStatus$2() {
                this.this$0 = $receiver;
                super(1);
            }
            
            public final void invoke(@NotNull final PlayerActivity it) {
                Intrinsics.checkNotNullParameter((Object)it, "it");
                this.this$0.clearChildren();
                UIComponent $this$childOf;
                if (it instanceof PlayerActivity.Offline) {
                    final UIComponent $this$constrain_u24lambda_u2d0$iv;
                    final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new EssentialUIText("Offline", false, null, false, false, false, 62);
                    final UIConstraints $this$invoke_u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
                    $this$invoke_u24lambda_u2d0.setColor(UtilitiesKt.toConstraint(EssentialPalette.TEXT_DISABLED));
                    $this$childOf = $this$constrain_u24lambda_u2d0$iv;
                }
                else if (it instanceof PlayerActivity.Online) {
                    final UIComponent $this$constrain_u24lambda_u2d0$iv;
                    final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new EssentialUIText("Online", false, null, false, false, false, 62);
                    final UIConstraints $this$invoke_u24lambda_u2d2 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
                    $this$invoke_u24lambda_u2d2.setColor(UtilitiesKt.toConstraint(EssentialPalette.GREEN));
                    $this$childOf = $this$constrain_u24lambda_u2d0$iv;
                }
                else if (it instanceof PlayerActivity$OnlineWithDescription) {
                    final UIComponent $this$constrain_u24lambda_u2d0$iv;
                    final UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new EssentialUIText(((PlayerActivity$OnlineWithDescription)it).getDescription(), false, null, false, false, false, 62);
                    final UIConstraints $this$invoke_u24lambda_u2d3 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
                    $this$invoke_u24lambda_u2d3.setColor(UtilitiesKt.toConstraint(EssentialPalette.GREEN));
                    $this$childOf = $this$constrain_u24lambda_u2d0$iv;
                }
                else if (it instanceof final PlayerActivity.Multiplayer multiplayer) {
                    $this$childOf = FriendStatus.this.createJoinableEntry(StateExtensionsKt.state(multiplayer.getServerAddress()));
                }
                else {
                    if (!(it instanceof PlayerActivity.SPSSession)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    final MappedState name = UUIDUtil.getNameAsState(((PlayerActivity.SPSSession)it).getHost()).map((kotlin.jvm.functions.Function1<? super Object, ?>)FriendStatus$2$name.FriendStatus$2$name$1.INSTANCE);
                    if (((PlayerActivity.SPSSession)it).getInvited()) {
                        $this$childOf = FriendStatus.this.createJoinableEntry(name);
                    }
                    else {
                        final UIComponent $this$constrain_u24lambda_u2d0$iv2;
                        final UIComponent $this$constrain$iv2 = $this$constrain_u24lambda_u2d0$iv2 = new EssentialUIText(null, false, null, false, false, false, 63).bindText(name);
                        final UIConstraints $this$invoke_u24lambda_u2d4 = $this$constrain_u24lambda_u2d0$iv2.getConstraints();
                        $this$invoke_u24lambda_u2d4.setColor(UtilitiesKt.toConstraint(EssentialPalette.GREEN));
                        $this$childOf = $this$constrain_u24lambda_u2d0$iv2;
                    }
                }
                ComponentsKt.childOf($this$childOf, this.this$0);
                final SortListener $sortListener = sortListener;
                if ($sortListener != null) {
                    $sortListener.sort();
                }
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                this.invoke((PlayerActivity)p1);
                return Unit.INSTANCE;
            }
        });
    }
    
    public FriendStatus(final UUID uuid, final IStatusStates statusStates) {
        this(uuid, statusStates, null);
    }
    
    private final UIComponent createJoinableEntry(final State<String> display) {
        UIComponent $this$constrain_u24lambda_u2d0$iv;
        UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new UIContainer();
        final UIConstraints $this$createJoinableEntry_u24lambda_u2d1 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$createJoinableEntry_u24lambda_u2d1.setHeight(new ChildBasedMaxSizeConstraint());
        $this$createJoinableEntry_u24lambda_u2d1.setWidth(new ChildBasedSizeConstraint(0.0f, 1, null));
        final ReadWriteProperty container$delegate = ComponentsKt.provideDelegate($this$constrain_u24lambda_u2d0$iv, null, FriendStatus.$$delegatedProperties[0]);
        $this$constrain$iv = ($this$constrain_u24lambda_u2d0$iv = new ShadowIcon(EssentialPalette.JOIN_ARROW_5X));
        final UIConstraints $this$createJoinableEntry_u24lambda_u2d2 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$createJoinableEntry_u24lambda_u2d2.setY(UtilitiesKt.getPixels(2));
        ComponentsKt.childOf((UIComponent)((ShadowIcon)$this$constrain_u24lambda_u2d0$iv).rebindPrimaryColor(StateExtensionsKt.state(EssentialPalette.MESSAGE_SENT)).rebindShadowColor(StateExtensionsKt.state(EssentialPalette.BLUE_SHADOW)), createJoinableEntry$lambda-2((ReadWriteProperty<Object, UIContainer>)container$delegate));
        $this$constrain$iv = ($this$constrain_u24lambda_u2d0$iv = new EssentialUIText(null, false, EssentialPalette.BLUE_SHADOW, false, false, false, 59).bindText(display));
        final UIConstraints $this$createJoinableEntry_u24lambda_u2d3 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$createJoinableEntry_u24lambda_u2d3.setX(new SiblingConstraint(3.0f, false, 2, null));
        $this$createJoinableEntry_u24lambda_u2d3.setColor(UtilitiesKt.toConstraint(EssentialPalette.MESSAGE_SENT));
        ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, createJoinableEntry$lambda-2((ReadWriteProperty<Object, UIContainer>)container$delegate));
        return createJoinableEntry$lambda-2((ReadWriteProperty<Object, UIContainer>)container$delegate);
    }
    
    private static final UIContainer createJoinableEntry$lambda-2(final ReadWriteProperty<Object, UIContainer> $container$delegate) {
        return (UIContainer)$container$delegate.getValue((Object)null, (KProperty)FriendStatus.$$delegatedProperties[0]);
    }
    
    public static final /* synthetic */ UIComponent access$createJoinableEntry(final FriendStatus $this, final State display) {
        return $this.createJoinableEntry(display);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property0((PropertyReference0)new PropertyReference0Impl((Class)FriendStatus.class, "container", "<v#0>", 0)) };
    }
}
