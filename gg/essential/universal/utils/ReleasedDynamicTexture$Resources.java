package gg.essential.universal.utils;

import java.io.*;
import kotlin.*;
import net.minecraft.client.texture.*;
import org.jetbrains.annotations.*;
import gg.essential.universal.*;
import kotlin.jvm.internal.*;
import java.util.concurrent.*;
import java.util.*;
import java.lang.ref.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000,
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0010\b
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0006
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0002\b\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0015B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\b\u0010	"\u0004\b
                                                   \u0010\u000bR(\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\f\u001a\u0004\u0018\u00010\r@FX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u000f\u0010\u0010"\u0004\b\u0011\u0010\u0012¨\u0006\u0016""" }, d2 = { "Lgg/essential/universal/utils/ReleasedDynamicTexture$Resources;", "Ljava/lang/ref/PhantomReference;", "Lgg/essential/universal/utils/ReleasedDynamicTexture;", "Ljava/io/Closeable;", "referent", "(Lgg/essential/universal/utils/ReleasedDynamicTexture;)V", "glId", "", "getGlId", "()I", "setGlId", "(I)V", "value", "Lnet/minecraft/client/texture/NativeImage;", "textureData", "getTextureData", "()Lnet/minecraft/client/texture/NativeImage;", "setTextureData", "(Lnet/minecraft/client/texture/NativeImage;)V", "close", "", "Companion", "universalcraft" })
private static final class Resources extends PhantomReference<ReleasedDynamicTexture> implements Closeable
{
    @NotNull
    public static final Companion Companion;
    private int glId;
    @Nullable
    private NativeImage textureData;
    @NotNull
    private static final ReferenceQueue<ReleasedDynamicTexture> referenceQueue;
    @NotNull
    private static final Set<Resources> toBeCleanedUp;
    
    public Resources(@NotNull final ReleasedDynamicTexture referent) {
        Intrinsics.checkNotNullParameter((Object)referent, "referent");
        super(referent, Resources.referenceQueue);
        this.glId = -1;
        Resources.toBeCleanedUp.add(this);
    }
    
    public final int getGlId() {
        return this.glId;
    }
    
    public final void setGlId(final int <set-?>) {
        this.glId = <set-?>;
    }
    
    @Nullable
    public final NativeImage getTextureData() {
        return this.textureData;
    }
    
    public final void setTextureData(@Nullable final NativeImage value) {
        try (final NativeImage textureData = this.textureData) {}
        this.textureData = value;
    }
    
    @Override
    public void close() {
        Resources.toBeCleanedUp.remove(this);
        if (this.glId != -1) {
            UGraphics.deleteTexture(this.glId);
            this.glId = -1;
        }
        this.setTextureData(null);
    }
    
    public static final /* synthetic */ ReferenceQueue access$getReferenceQueue$cp() {
        return Resources.referenceQueue;
    }
    
    public static final /* synthetic */ Set access$getToBeCleanedUp$cp() {
        return Resources.toBeCleanedUp;
    }
    
    static {
        Companion = new Companion(null);
        referenceQueue = new ReferenceQueue<ReleasedDynamicTexture>();
        final Set<Object> setFromMap = Collections.newSetFromMap(new ConcurrentHashMap<Object, Boolean>());
        Intrinsics.checkNotNullExpressionValue((Object)setFromMap, "newSetFromMap(ConcurrentHashMap())");
        toBeCleanedUp = setFromMap;
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000*
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0003
                                                       \u0002\u0010#
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0003
                                                       \u0002\u0010\u0002
                                                       \u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\r\u001a\u00020\u000eR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020
                                                       0	¢\u0006\b
                                                       \u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f""" }, d2 = { "Lgg/essential/universal/utils/ReleasedDynamicTexture$Resources$Companion;", "", "()V", "referenceQueue", "Ljava/lang/ref/ReferenceQueue;", "Lgg/essential/universal/utils/ReleasedDynamicTexture;", "getReferenceQueue", "()Ljava/lang/ref/ReferenceQueue;", "toBeCleanedUp", "", "Lgg/essential/universal/utils/ReleasedDynamicTexture$Resources;", "getToBeCleanedUp", "()Ljava/util/Set;", "drainCleanupQueue", "", "universalcraft" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final ReferenceQueue<ReleasedDynamicTexture> getReferenceQueue() {
            return Resources.access$getReferenceQueue$cp();
        }
        
        @NotNull
        public final Set<Resources> getToBeCleanedUp() {
            return Resources.access$getToBeCleanedUp$cp();
        }
        
        public final void drainCleanupQueue() {
            while (true) {
                final Reference<? extends ReleasedDynamicTexture> poll = this.getReferenceQueue().poll();
                if (poll == null) {
                    break;
                }
                ((Resources)poll).close();
            }
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
