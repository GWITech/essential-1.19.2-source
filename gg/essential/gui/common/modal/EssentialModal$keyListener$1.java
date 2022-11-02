package gg.essential.gui.common.modal;

import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.common.*;
import gg.essential.util.*;
import kotlin.collections.*;
import java.util.*;

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
static final class EssentialModal$keyListener$1 extends Lambda implements Function3<UIComponent, Character, Integer, Unit> {
    final /* synthetic */ EssentialModal this$0;
    
    EssentialModal$keyListener$1(final EssentialModal $receiver) {
        this.this$0 = $receiver;
        super(3);
    }
    
    public final void invoke$69f0f35d(@NotNull final UIComponent $this$keyListener, final int keyCode) {
        Intrinsics.checkNotNullParameter((Object)$this$keyListener, "$this$keyListener");
        if (this.this$0.isAnimating()) {
            return;
        }
        if (keyCode == UKeyboard.KEY_ENTER) {
            final MenuButton access$getSelectedButton$p = EssentialModal.access$getSelectedButton$p(this.this$0);
            final EssentialModal this$0 = this.this$0;
            final MenuButton it = access$getSelectedButton$p;
            Window.Companion.enqueueRenderOperation((Function0<Unit>)new EssentialModal$keyListener$1$1.EssentialModal$keyListener$1$1$1(it, this$0));
        }
        else if (keyCode == UKeyboard.KEY_TAB) {
            final int direction = UKeyboard.isShiftKeyDown() ? -1 : 1;
            final UIComponent $this$findChildrenOfType$iv = this.this$0;
            final List allButtons = ExtensionsKt.findChildrenOfType$2f5ee413($this$findChildrenOfType$iv, MenuButton.class);
            MenuButton nextButton = this.this$0.getPrimaryActionButton();
            if (EssentialModal.access$getSelectedButton$p(this.this$0) != null) {
                final List list = allButtons;
                final int n = CollectionsKt.indexOf(allButtons, (Object)EssentialModal.access$getSelectedButton$p(this.this$0)) + direction;
                final int size = allButtons.size();
                final int n2 = n % size;
                nextButton = (MenuButton)list.get(n2 + (size & ((n2 ^ size) & (n2 | -n2)) >> 31));
            }
            List list2;
            int size2;
            int n4;
            for (int checked = 1; !nextButton.getEnabled() && checked != allButtons.size(); nextButton = (MenuButton)list2.get(n4 + (size2 & ((n4 ^ size2) & (n4 | -n4)) >> 31)), ++checked) {
                list2 = allButtons;
                final int n3 = allButtons.indexOf(nextButton) + direction;
                size2 = allButtons.size();
                n4 = n3 % size2;
            }
            EssentialModal.access$setSelectedButton(this.this$0, nextButton.getEnabled() ? nextButton : null);
        }
        else if (!UKeyboard.isShiftKeyDown()) {
            EssentialModal.access$setSelectedButton(this.this$0, null);
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3) {
        final UIComponent uiComponent = (UIComponent)p1;
        ((Character)p2).charValue();
        this.invoke$69f0f35d(uiComponent, ((Number)p3).intValue());
        return Unit.INSTANCE;
    }
}