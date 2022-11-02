package gg.essential.gui.common;

import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0004\b\u0002\u0010\u0003""" }, d2 = { "<anonymous>", "", "invoke", "()Ljava/lang/Boolean;" })
static final class FullEssentialToggle$showToggleIndicators$1 extends Lambda implements Function0<Boolean> {
    public static final FullEssentialToggle$showToggleIndicators$1 INSTANCE;
    
    FullEssentialToggle$showToggleIndicators$1() {
        super(0);
    }
    
    @NotNull
    public final Boolean invoke() {
        return !Intrinsics.areEqual((Object)System.getProperty("essential.hideSwitchIndicators"), (Object)"true");
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    static {
        FullEssentialToggle$showToggleIndicators$1.INSTANCE = new FullEssentialToggle$showToggleIndicators$1();
    }
}