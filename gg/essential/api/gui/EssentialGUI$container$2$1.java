package gg.essential.api.gui;

import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0010
                                                   \u0000
                                                   \u0002\u0010\u0007
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ?\u0006\u0004\b\u0004\u0010\u0005""" }, d2 = { "<anonymous>", "", "it", "Lgg/essential/elementa/UIComponent;", "invoke", "(Lgg/essential/elementa/UIComponent;)Ljava/lang/Float;" })
static final class EssentialGUI$container$2$1 extends Lambda implements Function1<UIComponent, Float> {
    final /* synthetic */ EssentialGUI this$0;
    
    EssentialGUI$container$2$1(final EssentialGUI $receiver) {
        this.this$0 = $receiver;
        super(1);
    }
    
    @NotNull
    public final Float invoke(@NotNull final UIComponent it) {
        Intrinsics.checkNotNullParameter((Object)it, "it");
        return EssentialGUI.access$getBackContainer(this.this$0).getWidth() * 2.0f;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((UIComponent)p1);
    }
}