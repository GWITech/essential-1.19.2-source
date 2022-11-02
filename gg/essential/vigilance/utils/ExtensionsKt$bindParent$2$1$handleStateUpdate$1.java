package gg.essential.vigilance.utils;

import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004" }, d2 = { "<anonymous>", "", "T", "Lgg/essential/elementa/UIComponent;", "invoke" })
static final class ExtensionsKt$bindParent$2$1$handleStateUpdate$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */  $this_apply;
    final /* synthetic */ UIComponent $parent;
    final /* synthetic */ Integer $index;
    
    ExtensionsKt$bindParent$2$1$handleStateUpdate$1(final UIComponent $receiver, final UIComponent $parent, final Integer $index) {
        this.$this_apply = $receiver;
        this.$parent = $parent;
        this.$index = $index;
        super(0);
    }
    
    public final void invoke() {
        if (this.$this_apply.getHasParent() && !Intrinsics.areEqual((Object)this.$this_apply.getParent(), (Object)this.$parent)) {
            this.$this_apply.getParent().removeChild(this.$this_apply);
        }
        if (this.$parent != null && !this.$parent.getChildren().contains(this.$this_apply)) {
            if (this.$index != null) {
                this.$parent.insertChildAt(this.$this_apply, this.$index);
            }
            else {
                this.$parent.addChild(this.$this_apply);
            }
        }
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}