package gg.essential.gui.image;

import kotlin.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.utils.*;
import kotlin.jvm.internal.*;
import gg.essential.elementa.components.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000 
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010
                                                   \u001a\u00020\u000bH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0014\u0010\u0007\u001a\u00020\u0005X\u0096D¢\u0006\b
                                                   \u0000\u001a\u0004\b\b\u0010	¨\u0006""" }, d2 = { "Lgg/essential/gui/image/ResourceImageFactory;", "Lgg/essential/gui/image/ImageFactory;", "resource", "", "preload", "", "(Ljava/lang/String;Z)V", "supportsCaching", "getSupportsCaching", "()Z", "generate", "Lgg/essential/elementa/components/UIImage;", "Companion", "essential" })
public final class ResourceImageFactory extends ImageFactory
{
    @NotNull
    private final String resource;
    @Deprecated
    @NotNull
    private static final ResourceCache cache;
    
    public ResourceImageFactory(@NotNull final String resource, final byte b) {
        Intrinsics.checkNotNullParameter((Object)resource, "resource");
        super((byte)0);
        this.resource = resource;
        this.preload();
    }
    
    public ResourceImageFactory(final String resource) {
        this(resource, (byte)0);
    }
    
    @Override
    public boolean getSupportsCaching() {
        return true;
    }
    
    @NotNull
    @Override
    protected UIImage generate() {
        return UIImage.Companion.ofResourceCached(this.resource, ResourceImageFactory.cache);
    }
    
    static {
        new Companion((byte)0);
        cache = new ResourceCache(Integer.MAX_VALUE);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0014
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007""" }, d2 = { "Lgg/essential/gui/image/ResourceImageFactory$Companion;", "", "()V", "cache", "Lgg/essential/elementa/utils/ResourceCache;", "getCache", "()Lgg/essential/elementa/utils/ResourceCache;", "essential" })
    private static final class Companion
    {
        private Companion() {
            super();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
