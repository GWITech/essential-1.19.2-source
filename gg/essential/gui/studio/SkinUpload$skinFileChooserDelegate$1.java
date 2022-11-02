package gg.essential.gui.studio;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "Lgg/essential/gui/studio/ForkedFileChooser;", "invoke" })
static final class SkinUpload$skinFileChooserDelegate$1 extends Lambda implements Function0<ForkedFileChooser> {
    public static final SkinUpload$skinFileChooserDelegate$1 INSTANCE;
    
    SkinUpload$skinFileChooserDelegate$1() {
        super(0);
    }
    
    @NotNull
    public final ForkedFileChooser invoke() {
        return new ForkedFileChooser();
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    static {
        SkinUpload$skinFileChooserDelegate$1.INSTANCE = new SkinUpload$skinFileChooserDelegate$1();
    }
}