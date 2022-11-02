package gg.essential.gui.studio;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.model.*;
import kotlin.*;
import gg.essential.elementa.state.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a
                                                    \u0004*\u0004\u0018\u00010\u00030\u0003H
                                                   ¢\u0006\u0002\b\u0005""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/model/BedrockModel;", "kotlin.jvm.PlatformType", "invoke" })
static final class CosmeticOption$hasSideOption$1$1 extends Lambda implements Function1<BedrockModel, Unit> {
    final /* synthetic */ BasicState<Boolean> $this_apply;
    
    CosmeticOption$hasSideOption$1$1(final BasicState<Boolean> $receiver) {
        this.$this_apply = $receiver;
        super(1);
    }
    
    public final void invoke(final BedrockModel it) {
        this.$this_apply.set(it.isContainsSideOption());
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        this.invoke((BedrockModel)p1);
        return Unit.INSTANCE;
    }
}