package gg.essential.gui.screenshot.components;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0018
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\f
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H
                                                   ¢\u0006\u0002\b\u0007""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "<anonymous parameter 0>", "", "keyCode", "", "invoke" })
static final class EditorToolbar$3 extends Lambda implements Function3<UIComponent, Character, Integer, Unit> {
    final /* synthetic */ EditorToolbar this$0;
    
    EditorToolbar$3(final EditorToolbar $receiver) {
        this.this$0 = $receiver;
        super(3);
    }
    
    public final void invoke$69f0f35d(@NotNull final UIComponent $this$onKeyType, final int keyCode) {
        Intrinsics.checkNotNullParameter((Object)$this$onKeyType, "$this$onKeyType");
        if (EditorToolbar.access$getActive$p(this.this$0).get()) {
            if (UKeyboard.isKeyComboCtrlZ(keyCode)) {
                EditorToolbar.access$undo(this.this$0);
            }
            else if (UKeyboard.isKeyComboCtrlY(keyCode)) {
                EditorToolbar.access$redo(this.this$0);
            }
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3) {
        final UIComponent $this$onKeyType = (UIComponent)p1;
        ((Character)p2).charValue();
        this.invoke$69f0f35d($this$onKeyType, ((Number)p3).intValue());
        return Unit.INSTANCE;
    }
}