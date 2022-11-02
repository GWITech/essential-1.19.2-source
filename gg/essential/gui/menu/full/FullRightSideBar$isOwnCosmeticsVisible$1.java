package gg.essential.gui.menu.full;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0004\b\u0002\u0010\u0003""" }, d2 = { "<anonymous>", "", "invoke", "()Ljava/lang/Boolean;" })
static final class FullRightSideBar$isOwnCosmeticsVisible$1 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ FullRightSideBar this$0;
    
    FullRightSideBar$isOwnCosmeticsVisible$1(final FullRightSideBar $receiver) {
        this.this$0 = $receiver;
        super(0);
    }
    
    @NotNull
    public final Boolean invoke() {
        return this.this$0.getConnectionManager().getCosmeticsManager().getOwnCosmeticsVisible();
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
}