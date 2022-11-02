package gg.essential.gui.studio;

import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.state.*;
import gg.essential.api.utils.mojang.*;
import gg.essential.api.utils.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.components.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class SkinUpload$displayModal$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ SkinUpload this$0;
    final /* synthetic */ BasicState<Model> $modelType;
    final /* synthetic */ BasicState<Boolean> $locked;
    final /* synthetic */ BasicState<Boolean> $applyToAllOutfits;
    
    SkinUpload$displayModal$3(final SkinUpload $receiver, final BasicState<Model> $modelType, final BasicState<Boolean> $locked, final BasicState<Boolean> $applyToAllOutfits) {
        this.this$0 = $receiver;
        this.$modelType = $modelType;
        this.$locked = $locked;
        this.$applyToAllOutfits = $applyToAllOutfits;
        super(0);
    }
    
    public final void invoke() {
        Multithreading.runAsync(SkinUpload$displayModal$3::invoke$lambda-0);
    }
    
    private static final void invoke$lambda-0(final SkinUpload this$0, final BasicState $modelType, final BasicState $locked, final BasicState $applyToAllOutfits) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)$modelType, "$modelType");
        Intrinsics.checkNotNullParameter((Object)$locked, "$locked");
        Intrinsics.checkNotNullParameter((Object)$applyToAllOutfits, "$applyToAllOutfits");
        SkinUpload.access$getSkinFileChooser(this$0).showOpenDialog();
        Window.Companion.enqueueRenderOperation((Function0<Unit>)new SkinUpload$displayModal$3$1.SkinUpload$displayModal$3$1$1(this$0, $modelType, $locked, $applyToAllOutfits));
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
}