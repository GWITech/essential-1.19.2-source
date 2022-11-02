package gg.essential.gui.menu;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.common.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H
                                                   ¢\u0006\u0002\b\u0004""" }, d2 = { "<anonymous>", "Lgg/essential/gui/common/MenuButton$Alignment;", "compact", "", "invoke" })
static final class LeftSideBar$4 extends Lambda implements Function1<Boolean, MenuButton.Alignment> {
    public static final LeftSideBar$4 INSTANCE;
    
    LeftSideBar$4() {
        super(1);
    }
    
    @NotNull
    public final MenuButton.Alignment invoke(final boolean compact) {
        return compact ? MenuButton.Alignment.CENTER : MenuButton.Alignment.LEFT_SMALL_PADDING;
    }
    
    public /* bridge */ Object invoke(final Object p1) {
        return this.invoke((boolean)p1);
    }
    
    static {
        INSTANCE = new Function1<Boolean, MenuButton.Alignment>() {
            public static final LeftSideBar$4 INSTANCE;
            
            LeftSideBar$4() {
                super(1);
            }
            
            @NotNull
            public final MenuButton.Alignment invoke(final boolean compact) {
                return compact ? MenuButton.Alignment.CENTER : MenuButton.Alignment.LEFT_SMALL_PADDING;
            }
            
            public /* bridge */ Object invoke(final Object p1) {
                return this.invoke((boolean)p1);
            }
        };
    }
}