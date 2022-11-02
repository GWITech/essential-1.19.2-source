package gg.essential.gui.image;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.awt.*;
import gg.essential.elementa.components.*;
import gg.essential.elementa.components.image.*;
import gg.essential.elementa.*;
import gg.essential.gui.common.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u00002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0006
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\rH$J\u0006\u0010\u000f\u001a\u00020\u0000J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0002\u001a\u00020\u0003X\u0084\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0007\u0010\bR\u0012\u0010	\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b
                                                   \u0010\u000b¨\u0006\u0018""" }, d2 = { "Lgg/essential/gui/image/ImageFactory;", "", "settings", "Lgg/essential/gui/image/ImageGeneratorSettings;", "(Lgg/essential/gui/image/ImageGeneratorSettings;)V", "loadedOnce", "", "getSettings", "()Lgg/essential/gui/image/ImageGeneratorSettings;", "supportsCaching", "getSupportsCaching", "()Z", "create", "Lgg/essential/elementa/components/UIImage;", "generate", "preload", "withColor", "color", "Ljava/awt/Color;", "withSettings", "withTextureScaling", "minFilter", "Lgg/essential/elementa/components/UIImage$TextureScalingMode;", "magFilter", "essential" })
public abstract class ImageFactory
{
    @NotNull
    private final ImageGeneratorSettings settings;
    private boolean loadedOnce;
    
    public ImageFactory(@NotNull final ImageGeneratorSettings settings) {
        Intrinsics.checkNotNullParameter((Object)settings, "settings");
        super();
        this.settings = settings;
    }
    
    public ImageFactory(final byte b) {
        this(new ImageGeneratorSettings(false, null, null, null, 15));
    }
    
    public abstract boolean getSupportsCaching();
    
    @NotNull
    public final UIImage create() {
        final UIImage $this$create_u24lambda_u2d0;
        final UIImage uiImage = $this$create_u24lambda_u2d0 = this.generate();
        this.loadedOnce = true;
        if (this.settings.getAutoSize()) {
            $this$create_u24lambda_u2d0.supply(new AutoImageSize($this$create_u24lambda_u2d0));
        }
        $this$create_u24lambda_u2d0.setTextureMinFilter(this.settings.getMinFilter());
        $this$create_u24lambda_u2d0.setTextureMagFilter(this.settings.getMagFilter());
        $this$create_u24lambda_u2d0.setColor(this.settings.getColor());
        return uiImage;
    }
    
    @NotNull
    protected abstract UIImage generate();
    
    @NotNull
    public final ImageFactory preload() {
        if (!this.loadedOnce && this.getSupportsCaching()) {
            this.create();
        }
        return this;
    }
    
    @NotNull
    public final ImageFactory withColor(@NotNull final Color color) {
        Intrinsics.checkNotNullParameter((Object)color, "color");
        return new DelegatedImageImageFactory(this, ImageGeneratorSettings.copy$default$5855f0c8$4e015424(this.settings, color));
    }
    
    @NotNull
    public ImageFactory withSettings(@NotNull final ImageGeneratorSettings settings) {
        Intrinsics.checkNotNullParameter((Object)settings, "settings");
        return new DelegatedImageImageFactory(this, settings);
    }
    
    public ImageFactory() {
        this((byte)0);
    }
}
