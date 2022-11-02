package gg.essential.gui.friends.message;

import kotlin.jvm.functions.*;
import java.util.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.state.*;
import gg.essential.util.*;
import gg.essential.gui.common.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "Lgg/essential/elementa/UIComponent;", "uuid", "Ljava/util/UUID;", "invoke" })
static final class MessageTitleBar$3 extends Lambda implements Function1<UUID, UIComponent> {
    final /* synthetic */ MessageTitleBar this$0;
    
    MessageTitleBar$3(final MessageTitleBar $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final UIComponent invoke(@NotNull final UUID uuid) {
        Intrinsics.checkNotNullParameter((Object)uuid, "uuid");
        final Member member = this.this$0.new Member(uuid);
        final UIComponent uiComponent = member;
        final ReadOnlyState<String> nameAsState = UUIDUtil.getNameAsState(uuid, "Loading...");
        Intrinsics.checkNotNullExpressionValue((Object)nameAsState, "getNameAsState(uuid, \"Loading...\")");
        ExtensionsKt.bindHoverEssentialTooltip$default$3fdaea44(uiComponent, nameAsState, null, 0.0f, null, null, 30);
        return member;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((UUID)p1);
    }
}