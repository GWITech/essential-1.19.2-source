package gg.essential.elementa.markdown;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "invoke" })
static final class MarkdownComponent$3 extends Lambda implements Function1<UIComponent, Unit> {
    final /* synthetic */ MarkdownComponent this$0;
    
    MarkdownComponent$3(final MarkdownComponent $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseRelease) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseRelease, "$this$onMouseRelease");
        MarkdownComponent.access$setCanDrag$p(this.this$0, false);
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((UIComponent)p1);
        return Unit.INSTANCE;
    }
}