package gg.essential.elementa.markdown;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlin.ranges.*;
import gg.essential.elementa.markdown.selection.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "mouseX", "", "mouseY", "mouseButton", "", "invoke" })
static final class MarkdownComponent$4 extends Lambda implements Function4<UIComponent, Float, Float, Integer, Unit> {
    final /* synthetic */ MarkdownComponent this$0;
    
    MarkdownComponent$4(final MarkdownComponent $receiver) {
        this.this$0 = $receiver;
        super(4);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onMouseDrag, final float mouseX, final float mouseY, final int mouseButton) {
        Intrinsics.checkNotNullParameter((Object)$this$onMouseDrag, "$this$onMouseDrag");
        if (mouseButton != 0 || !MarkdownComponent.access$getCanDrag$p(this.this$0)) {
            return;
        }
        final float x = MarkdownComponent.access$getBaseX$p(this.this$0) + RangesKt.coerceIn(mouseX, 0.0f, $this$onMouseDrag.getWidth());
        final float y = MarkdownComponent.access$getBaseY$p(this.this$0) + RangesKt.coerceIn(mouseY, 0.0f, $this$onMouseDrag.getHeight());
        final Cursor otherEnd = this.this$0.getDrawables().cursorAt(x, y, true, mouseButton);
        if (Intrinsics.areEqual((Object)MarkdownComponent.access$getCursor$p(this.this$0), (Object)otherEnd)) {
            return;
        }
        final Selection access$getSelection$p = MarkdownComponent.access$getSelection$p(this.this$0);
        if (access$getSelection$p != null) {
            access$getSelection$p.remove();
        }
        final MarkdownComponent this$0 = this.this$0;
        final Selection$Companion companion = Selection.Companion;
        final Cursor access$getCursor$p = MarkdownComponent.access$getCursor$p(this.this$0);
        Intrinsics.checkNotNull((Object)access$getCursor$p);
        MarkdownComponent.access$setSelection$p(this$0, companion.fromCursors(access$getCursor$p, otherEnd));
        $this$onMouseDrag.grabWindowFocus();
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3, final Object p4) {
        this.invoke((UIComponent)p1, ((Number)p2).floatValue(), ((Number)p3).floatValue(), ((Number)p4).intValue());
        return Unit.INSTANCE;
    }
}