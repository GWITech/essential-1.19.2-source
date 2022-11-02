package gg.essential.gui.menu;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import java.time.*;
import java.time.chrono.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000
                                                   
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0004\b\u0002\u0010\u0003""" }, d2 = { "<anonymous>", "", "invoke", "()Ljava/lang/Boolean;" })
static final class LeftSideBar$notExpired$1 extends Lambda implements Function0<Boolean> {
    public static final LeftSideBar$notExpired$1 INSTANCE;
    
    LeftSideBar$notExpired$1() {
        super(0);
    }
    
    @NotNull
    public final Boolean invoke() {
        return LocalDate.now().isBefore(LocalDate.of(2022, 10, 12));
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    static {
        LeftSideBar$notExpired$1.INSTANCE = new LeftSideBar$notExpired$1();
    }
}