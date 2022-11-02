package gg.essential.gui.friends.previews;

import kotlin.jvm.functions.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.gui.common.shadow.*;
import java.awt.*;
import gg.essential.elementa.constraints.*;
import gg.essential.gui.*;
import gg.essential.gui.friends.state.*;
import gg.essential.gui.common.*;
import kotlin.*;
import gg.essential.util.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.*;
import gg.essential.elementa.state.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/gui/friends/state/PlayerActivity;", "invoke" })
static final class FriendStatus$2 extends Lambda implements Function1<PlayerActivity, Unit> {
    final /* synthetic */ FriendStatus this$0;
    final /* synthetic */ SortListener $sortListener;
    
    FriendStatus$2(final FriendStatus $receiver, final SortListener $sortListener) {
        this.this$0 = $receiver;
        this.$sortListener = $sortListener;
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
            $this$childOf = FriendStatus.access$createJoinableEntry(this.this$0, StateExtensionsKt.state(multiplayer.getServerAddress()));
        }
        else {
            if (!(it instanceof PlayerActivity.SPSSession)) {
                throw new NoWhenBranchMatchedException();
            }
            final MappedState name = UUIDUtil.getNameAsState(((PlayerActivity.SPSSession)it).getHost()).map((kotlin.jvm.functions.Function1<? super Object, ?>)FriendStatus$2$name.FriendStatus$2$name$1.INSTANCE);
            if (((PlayerActivity.SPSSession)it).getInvited()) {
                $this$childOf = FriendStatus.access$createJoinableEntry(this.this$0, name);
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
        final SortListener $sortListener = this.$sortListener;
        if ($sortListener != null) {
            $sortListener.sort();
        }
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((PlayerActivity)p1);
        return Unit.INSTANCE;
    }
}