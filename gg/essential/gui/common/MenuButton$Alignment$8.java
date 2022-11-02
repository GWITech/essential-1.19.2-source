package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.constraints.*;
import kotlin.*;
import gg.essential.elementa.dsl.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "Lgg/essential/elementa/constraints/XConstraint;", "invoke" })
static final class MenuButton$Alignment$8 extends Lambda implements Function0<XConstraint> {
    public static final MenuButton$Alignment$8 INSTANCE;
    
    MenuButton$Alignment$8() {
        super(0);
    }
    
    @NotNull
    public final XConstraint invoke() {
        return UtilitiesKt.pixels$default(0, true, false, 2, null);
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    static {
        INSTANCE = new Function0<XConstraint>() {
            public static final MenuButton$Alignment$8 INSTANCE;
            
            MenuButton$Alignment$8() {
                super(0);
            }
            
            @NotNull
            public final XConstraint invoke() {
                return UtilitiesKt.pixels$default(0, true, false, 2, null);
            }
            
            public /* bridge */ Object invoke() {
                return this.invoke();
            }
        };
    }
}