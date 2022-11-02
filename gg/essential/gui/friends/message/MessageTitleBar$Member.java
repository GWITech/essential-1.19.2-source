package gg.essential.gui.friends.message;

import gg.essential.elementa.components.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.dsl.*;
import gg.essential.elementa.constraints.*;
import gg.essential.gui.common.constraints.*;
import gg.essential.elementa.events.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import gg.essential.util.*;
import java.util.*;
import com.sparkuniverse.toolbox.chat.enums.*;
import gg.essential.gui.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.state.*;
import java.awt.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0018
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u0007""" }, d2 = { "Lgg/essential/gui/friends/message/MessageTitleBar$Member;", "Lgg/essential/elementa/components/UIContainer;", "member", "Ljava/util/UUID;", "(Lgg/essential/gui/friends/message/MessageTitleBar;Ljava/util/UUID;)V", "head", "Lgg/essential/elementa/components/UIImage;", "essential" })
public final class Member extends UIContainer
{
    @NotNull
    private final UUID member;
    final /* synthetic */ MessageTitleBar this$0;
    
    public Member(@NotNull final MessageTitleBar this$0, final UUID member) {
        Intrinsics.checkNotNullParameter((Object)member, "member");
        this.this$0 = this$0;
        super();
        this.member = member;
        UIComponent $this$constrain_u24lambda_u2d0$iv;
        UIComponent $this$constrain$iv = $this$constrain_u24lambda_u2d0$iv = CachedAvatarImage.ofUUID(this.member);
        final UIConstraints $this$head_u24lambda_u2d0 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$head_u24lambda_u2d0.setY(new CenterConstraint());
        $this$head_u24lambda_u2d0.setHeight(UtilitiesKt.getPixels(16));
        $this$head_u24lambda_u2d0.setWidth(new AspectConstraint(0.0f, 1, null));
        ComponentsKt.childOf($this$constrain_u24lambda_u2d0$iv, this);
        $this$constrain$iv = ($this$constrain_u24lambda_u2d0$iv = this);
        final UIConstraints $this$_init__u24lambda_u2d1 = $this$constrain_u24lambda_u2d0$iv.getConstraints();
        $this$_init__u24lambda_u2d1.setWidth(new ChildBasedSizeConstraint(0.0f, 1, null));
        $this$_init__u24lambda_u2d1.setHeight(new ChildBasedSizeConstraint(0.0f, 1, null));
        $this$_init__u24lambda_u2d1.setX(new SiblingConstraint(3.0f, false, 2, null));
        $this$_init__u24lambda_u2d1.setY(new CenterPixelConstraint('\0'));
        this.onMouseClick((Function2<? super UIComponent, ? super UIClickEvent, Unit>)new Function2<UIComponent, UIClickEvent, Unit>() {
            final /* synthetic */ Member this$0;
            final /* synthetic */ MessageTitleBar this$1 = Member.this.this$0;
            
            MessageTitleBar$Member$2() {
                this.this$0 = $receiver;
                super(2);
            }
            
            public final void invoke(@NotNull final UIComponent $this$onMouseClick, @NotNull final UIClickEvent it) {
                Intrinsics.checkNotNullParameter((Object)$this$onMouseClick, "$this$onMouseClick");
                Intrinsics.checkNotNullParameter((Object)it, "it");
                if (it.getMouseButton() > 1) {
                    return;
                }
                if (!Intrinsics.areEqual((Object)Member.access$getMember$p(this.this$0), (Object)UUIDUtil.getClientUUID())) {
                    final List options = new ArrayList();
                    if (Intrinsics.areEqual((Object)MessageTitleBar.access$getPreview$p(this.this$1).getChannel().getCreatedInfo().getBy(), (Object)UUIDUtil.getClientUUID()) && MessageTitleBar.access$getPreview$p(this.this$1).getChannel().getType() == ChannelType.GROUP_DIRECT_MESSAGE) {
                        options.add(new OptionMenu.Option("Remove from group", null, EssentialPalette.CANCEL_5X, null, null, null, null, (Function0)new MessageTitleBar$Member$2.MessageTitleBar$Member$2$1(this.this$1, this.this$0), 122));
                    }
                    MessageTitleBar.access$getGui$p(this.this$1).showUserDropdown(Member.access$getMember$p(this.this$0), new OptionMenu.Position($this$onMouseClick, true), options, (Function0<Unit>)MessageTitleBar$Member$2.MessageTitleBar$Member$2$2.INSTANCE);
                }
            }
            
            public /* bridge */ Object invoke(final Object p1, final Object p2) {
                this.invoke((UIComponent)p1, (UIClickEvent)p2);
                return Unit.INSTANCE;
            }
        });
    }
    
    public static final /* synthetic */ UUID access$getMember$p(final Member $this) {
        return $this.member;
    }
}
