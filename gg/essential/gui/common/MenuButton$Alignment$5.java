package gg.essential.gui.common;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import gg.essential.elementa.constraints.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "Lgg/essential/elementa/constraints/XConstraint;", "invoke" })
static final class MenuButton$Alignment$5 extends Lambda implements Function0<XConstraint> {
    public static final MenuButton$Alignment$5 INSTANCE;
    
    MenuButton$Alignment$5() {
        super(0);
    }
    
    @NotNull
    public final XConstraint invoke() {
        return new CenterConstraint();
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    static {
        INSTANCE = new Function0<XConstraint>() {
            public static final MenuButton$Alignment$5 INSTANCE;
            
            MenuButton$Alignment$5() {
                super(0);
            }
            
            @NotNull
            public final XConstraint invoke() {
                return new CenterConstraint();
            }
            
            public /* bridge */ Object invoke() {
                return this.invoke();
            }
        };
    }
}