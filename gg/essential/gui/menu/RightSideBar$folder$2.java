package gg.essential.gui.menu;

import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;
import java.io.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class RightSideBar$folder$2 extends Lambda implements Function0<Unit> {
    public static final RightSideBar$folder$2 INSTANCE;
    
    RightSideBar$folder$2() {
        super(0);
    }
    
    public final void invoke() {
        final File runDirectory = UMinecraft.getMinecraft().runDirectory;
        Intrinsics.checkNotNullExpressionValue((Object)runDirectory, "getMinecraft().runDirectory");
        UDesktop.open(runDirectory);
    }
    
    public /* bridge */ Object invoke() {
        this.invoke();
        return Unit.INSTANCE;
    }
    
    static {
        RightSideBar$folder$2.INSTANCE = new RightSideBar$folder$2();
    }
}