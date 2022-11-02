package gg.essential.gui.screenshot.components;

import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/gui/screenshot/components/FocusType;", "invoke", "(Lgg/essential/gui/screenshot/components/FocusType;)Ljava/lang/Boolean;" })
static final class FocusComponent$active$1 extends Lambda implements Function1<FocusType, Boolean> {
    final /* synthetic */ FocusComponent this$0;
    
    FocusComponent$active$1(final FocusComponent $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final Boolean invoke(@NotNull final FocusType it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return it == FocusComponent.access$getFocusType$p(this.this$0);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((FocusType)p1);
    }
}