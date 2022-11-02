package gg.essential.gui.image;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.components.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000$
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0016R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u0006\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\b
                                                   \u0010\u000b*\u0004\b\b\u0010	¨\u0006\u000f""" }, d2 = { "Lgg/essential/gui/image/DelegatedImageImageFactory;", "Lgg/essential/gui/image/ImageFactory;", "innerSupplier", "settings", "Lgg/essential/gui/image/ImageGeneratorSettings;", "(Lgg/essential/gui/image/ImageFactory;Lgg/essential/gui/image/ImageGeneratorSettings;)V", "supportsCaching", "", "getSupportsCaching$delegate", "(Lgg/essential/gui/image/DelegatedImageImageFactory;)Ljava/lang/Object;", "getSupportsCaching", "()Z", "generate", "Lgg/essential/elementa/components/UIImage;", "withSettings", "essential" })
final class DelegatedImageImageFactory extends ImageFactory
{
    @NotNull
    private final ImageFactory innerSupplier;
    
    public DelegatedImageImageFactory(@NotNull final ImageFactory innerSupplier, @NotNull final ImageGeneratorSettings settings) {
        Intrinsics.checkNotNullParameter((Object)innerSupplier, "innerSupplier");
        Intrinsics.checkNotNullParameter((Object)settings, "settings");
        super(settings);
        this.innerSupplier = innerSupplier;
    }
    
    @Override
    public boolean getSupportsCaching() {
        return this.innerSupplier.getSupportsCaching();
    }
    
    @NotNull
    @Override
    protected UIImage generate() {
        return this.innerSupplier.create();
    }
    
    @NotNull
    @Override
    public ImageFactory withSettings(@NotNull final ImageGeneratorSettings settings) {
        Intrinsics.checkNotNullParameter((Object)settings, "settings");
        return new DelegatedImageImageFactory(this.innerSupplier, settings);
    }
}
