package gg.essential.gui.friends.message;

import org.jetbrains.annotations.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import java.util.*;
import gg.essential.elementa.*;
import gg.essential.elementa.dsl.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00008
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0011
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J7\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a
                                                   \u0012\u0006\b\u0001\u0012\u00020	0\b"\u00020	2\u000e\b\u0002\u0010
                                                   \u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\u0010\fJ?\u0010\u0003\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0012\u0010\u0007\u001a
                                                   \u0012\u0006\b\u0001\u0012\u00020	0\b"\u00020	2\u000e\b\u0002\u0010
                                                   \u001a\b\u0012\u0004\u0012\u00020\u00040\u000b¢\u0006\u0002\u0010\u0011¨\u0006\u0012""" }, d2 = { "Lgg/essential/gui/friends/message/OptionMenu$Companion;", "", "()V", "create", "", "boundTo", "Lgg/essential/elementa/UIComponent;", "option", "", "Lgg/essential/gui/friends/message/OptionMenu$Option;", "onClose", "Lkotlin/Function0;", "(Lgg/essential/elementa/UIComponent;[Lgg/essential/gui/friends/message/OptionMenu$Option;Lkotlin/jvm/functions/Function0;)V", "position", "Lgg/essential/gui/friends/message/OptionMenu$Position;", "window", "Lgg/essential/elementa/components/Window;", "(Lgg/essential/gui/friends/message/OptionMenu$Position;Lgg/essential/elementa/components/Window;[Lgg/essential/gui/friends/message/OptionMenu$Option;Lkotlin/jvm/functions/Function0;)V", "essential" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    public final void create(@NotNull final Position position, @NotNull final Window window, @NotNull final Option[] option, @NotNull final Function0<Unit> onClose) {
        Intrinsics.checkNotNullParameter((Object)position, "position");
        Intrinsics.checkNotNullParameter((Object)window, "window");
        Intrinsics.checkNotNullParameter((Object)option, "option");
        Intrinsics.checkNotNullParameter((Object)onClose, "onClose");
        final OptionMenu menu = ComponentsKt.childOf(new OptionMenu(0.0f, 0.0f, (Option[])Arrays.copyOf(option, option.length)), window);
        menu.reposition(position.getXConstraint(), position.getYConstraint());
        menu.init();
        menu.onClose(onClose);
    }
    
    public static /* synthetic */ void create$default$458aa9e1$630f7efd(final Companion companion, final Position position, final Window window, final Option[] option) {
        companion.create(position, window, option, (Function0<Unit>)OptionMenu$Companion$create.OptionMenu$Companion$create$2.INSTANCE);
    }
    
    public Companion(final byte b) {
        this();
    }
}
