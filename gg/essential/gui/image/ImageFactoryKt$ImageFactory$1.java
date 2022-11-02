package gg.essential.gui.image;

import kotlin.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.components.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0019
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0000*\u0001\u0000\b
                                                   \u0018\u00002\u00020\u0001J\b\u0010\b\u001a\u00020	H\u0014R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0004\u0010\u0005"\u0004\b\u0006\u0010\u0007¨\u0006
                                                   """ }, d2 = { "gg/essential/gui/image/ImageFactoryKt$ImageFactory$1", "Lgg/essential/gui/image/ImageFactory;", "supportsCaching", "", "getSupportsCaching", "()Z", "setSupportsCaching", "(Z)V", "generate", "Lgg/essential/elementa/components/UIImage;", "essential" })
public static final class ImageFactoryKt$ImageFactory$1 extends ImageFactory {
    final /* synthetic */ Function0<UIImage> $generator;
    
    ImageFactoryKt$ImageFactory$1(final Function0<? extends UIImage> $generator) {
        this.$generator = $generator;
        super((byte)0);
    }
    
    @Override
    public boolean getSupportsCaching() {
        return false;
    }
    
    @NotNull
    @Override
    protected UIImage generate() {
        return (UIImage)this.$generator.invoke();
    }
}