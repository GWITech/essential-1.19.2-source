package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u0001"\b\b\u0000\u0010\u0002*\u00020\u0003"\u0004\b\u0001\u0010\u0004H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "T", "Lgg/essential/elementa/UIComponent;", "E", "invoke" })
static final class StateExtensionsKt$bindChildren$handleNewItem$addAndSort$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ T $this_bindChildren;
    final /* synthetic */ UIComponent $element;
    final /* synthetic */ Comparator<UIComponent> $comparator;
    
    StateExtensionsKt$bindChildren$handleNewItem$addAndSort$1(final T $receiver, final UIComponent $element, final Comparator<UIComponent> $comparator) {
        this.$this_bindChildren = $receiver;
        this.$element = $element;
        this.$comparator = $comparator;
        super(0);
    }
    
    public final void invoke() {
        this.$this_bindChildren.addChild(this.$element);
        StateExtensionsKt.access$bindChildren$sort(this.$comparator, this.$this_bindChildren);
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}