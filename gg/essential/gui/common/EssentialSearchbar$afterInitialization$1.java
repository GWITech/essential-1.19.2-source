package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.util.*;
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
                                                   ¢\u0006\u0002\b\u0007""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "typedChar", "", "keyCode", "", "invoke" })
static final class EssentialSearchbar$afterInitialization$1 extends Lambda implements Function3<UIComponent, Character, Integer, Unit> {
    final /* synthetic */ EssentialSearchbar this$0;
    
    EssentialSearchbar$afterInitialization$1(final EssentialSearchbar $receiver) {
        this.this$0 = $receiver;
        super(3);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onKeyType, final char typedChar, final int keyCode) {
        Intrinsics.checkNotNullParameter((Object)$this$onKeyType, "$this$onKeyType");
        if (!ExtensionsKt.isInComponentTree(this.this$0)) {
            return;
        }
        if (EssentialSearchbar.access$getActivateOnSearchHokey$p(this.this$0) && keyCode == UKeyboard.KEY_F && UKeyboard.isCtrlKeyDown() && !UKeyboard.isShiftKeyDown() && !UKeyboard.isAltKeyDown()) {
            this.this$0.activateSearch();
        }
        else if (EssentialSearchbar.access$getActivateOnType$p(this.this$0) && !Character.isISOControl(typedChar)) {
            this.this$0.getSearchInput().setActive(true);
            this.this$0.getSearchInput().keyType(typedChar, keyCode);
            this.this$0.getSearchInput().setActive(false);
            this.this$0.activateSearch();
        }
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3) {
        this.invoke((UIComponent)p1, (char)p2, ((Number)p3).intValue());
        return Unit.INSTANCE;
    }
}