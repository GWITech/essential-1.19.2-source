package gg.essential.gui.friends.previews;

import gg.essential.elementa.components.*;
import kotlin.*;
import kotlin.reflect.*;
import java.util.*;
import org.jetbrains.annotations.*;
import com.sparkuniverse.toolbox.chat.model.*;
import gg.essential.util.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.state.*;
import gg.essential.gui.common.*;
import gg.essential.gui.common.shadow.*;
import java.awt.*;
import gg.essential.elementa.dsl.*;
import gg.essential.gui.*;
import gg.essential.elementa.constraints.*;
import gg.essential.gui.friends.state.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000B
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001c\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020	0\u0007X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010
                                                   \u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00160\u0007X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0016\u0010\u0017\u001a
                                                    \u0019*\u0004\u0018\u00010\u00180\u0018X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u001a""" }, d2 = { "Lgg/essential/gui/friends/previews/ChannelPreview$Description;", "Lgg/essential/elementa/components/UIContainer;", "(Lgg/essential/gui/friends/previews/ChannelPreview;)V", "activity", "Lgg/essential/gui/common/ReadOnlyState;", "Lgg/essential/gui/friends/state/PlayerActivity;", "descriptionState", "Lgg/essential/elementa/state/MappedState;", "Lcom/sparkuniverse/toolbox/chat/model/Message;", "", "descriptionText", "Lgg/essential/elementa/components/UIText;", "getDescriptionText", "()Lgg/essential/elementa/components/UIText;", "descriptionText$delegate", "Lkotlin/properties/ReadWriteProperty;", "friendStatus", "Lgg/essential/gui/friends/previews/FriendStatus;", "getFriendStatus", "()Lgg/essential/gui/friends/previews/FriendStatus;", "friendStatus$delegate", "joinable", "", "uuid", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "essential" })
public final class Description extends UIContainer
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    private final UUID uuid;
    @NotNull
    private final ReadOnlyState<PlayerActivity> activity;
    @NotNull
    private final MappedState<PlayerActivity, Boolean> joinable;
    @NotNull
    private final MappedState<Message, String> descriptionState;
    final /* synthetic */ ChannelPreview this$0;
    
    public Description(final ChannelPreview this$0) {
        this.this$0 = this$0;
        super();
        UUID uuid;
        if ((uuid = this.this$0.getOtherUser()) == null) {
            uuid = UUIDUtil.formatWithDashes("00000000000000000000000000000000");
        }
        this.uuid = uuid;
        final IStatusStates statusStates = this.this$0.getGui().getSocialStateManager().getStatusStates();
        final UUID uuid2 = this.uuid;
        Intrinsics.checkNotNullExpressionValue((Object)uuid2, "uuid");
        this.activity = statusStates.getActivityState(uuid2);
        this.joinable = this.activity.map((kotlin.jvm.functions.Function1<? super PlayerActivity, ? extends Boolean>)ChannelPreview$Description$joinable.ChannelPreview$Description$joinable$1.INSTANCE);
        this.descriptionState = ChannelPreview.access$getLatestMessageState$p(this.this$0).map((Function1)new ChannelPreview$Description$descriptionState.ChannelPreview$Description$descriptionState$1(this.this$0));
        final UUID uuid3 = this.uuid;
        Intrinsics.checkNotNullExpressionValue((Object)uuid3, "uuid");
        ComponentsKt.provideDelegate(StateExtensionsKt.bindParent$default$6fcd5b6b(new FriendStatus(uuid3, this.this$0.getGui().getSocialStateManager().getStatusStates()), this, this.joinable, false, null, 12), this, Description.$$delegatedProperties[0]);
        UIComponent $this$constrain_u24lambda_u2d0$iv;
        UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = new EssentialUIText(null, false, null, false, true, false, 15).bindText((State<String>)this.descriptionState);
        final UIConstraints $this$descriptionText_delegate_u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$descriptionText_delegate_u24lambda_u2d0.setWidth(ConstraintsKt.min($this$descriptionText_delegate_u24lambda_u2d0.getWidth(), UtilitiesKt.getPercent(100)));
        $this$descriptionText_delegate_u24lambda_u2d0.setColor(UtilitiesKt.toConstraint(EssentialPalette.TEXT_DISABLED));
        ComponentsKt.provideDelegate(StateExtensionsKt.bindParent$default$6fcd5b6b($this$constrain_u24lambda_u2d0$iv, this, StateExtensionsKt.not((State<Boolean>)this.joinable), false, null, 12), this, Description.$$delegatedProperties[1]);
        $this$constrain$iv = ($this$constrain_u24lambda_u2d0$iv = this);
        final UIConstraints $this$_init__u24lambda_u2d1 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d1.setWidth(new FillConstraint(false));
        $this$_init__u24lambda_u2d1.setHeight(new ChildBasedSizeConstraint(0.0f, 1, null));
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Description.class, "friendStatus", "getFriendStatus()Lgg/essential/gui/friends/previews/FriendStatus;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)Description.class, "descriptionText", "getDescriptionText()Lgg/essential/elementa/components/UIText;", 0)) };
    }
}
