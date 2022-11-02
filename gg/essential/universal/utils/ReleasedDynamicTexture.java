package gg.essential.universal.utils;

import kotlin.*;
import net.minecraft.client.texture.*;
import net.minecraft.resource.*;
import com.mojang.blaze3d.platform.*;
import gg.essential.universal.*;
import java.io.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import java.util.concurrent.*;
import java.util.*;
import java.lang.ref.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000:
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\b
                                                   \u0002\u0018\u0002
                                                   \u0002\b	
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0007
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001*B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u000f\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010	\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010
                                                   J\b\u0010 \u001a\u00020\u0003H\u0002J\b\u0010!\u001a\u00020"H\u0016J\b\u0010#\u001a\u00020"H\u0016J\b\u0010$\u001a\u00020\u0003H\u0016J\u0010\u0010%\u001a\u00020"2\u0006\u0010&\u001a\u00020'H\u0016J\u0006\u0010(\u001a\u00020"J\u0006\u0010)\u001a\u00020"R\u0011\u0010\u000b\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000e\u0010\rR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002
                                                   \u0000R5\u0010	\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00078B@BX\u0082\u008e\u0002¢\u0006\u0018
                                                   \u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015"\u0004\b\u0016\u0010\b*\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u001b\u0010\u001c"\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001f\u0010¨\u0006+""" }, d2 = { "Lgg/essential/universal/utils/ReleasedDynamicTexture;", "Lnet/minecraft/client/texture/AbstractTexture;", "width", "", "height", "(II)V", "nativeImage", "Lnet/minecraft/client/texture/NativeImage;", "(Lnet/minecraft/client/texture/NativeImage;)V", "textureData", "(IILnet/minecraft/client/texture/NativeImage;)V", "dynamicGlId", "getDynamicGlId", "()I", "getHeight", "resources", "Lgg/essential/universal/utils/ReleasedDynamicTexture$Resources;", "<set-?>", "getTextureData$delegate", "(Lgg/essential/universal/utils/ReleasedDynamicTexture;)Ljava/lang/Object;", "getTextureData", "()Lnet/minecraft/client/texture/NativeImage;", "setTextureData", "textureData$receiver", "Lgg/essential/universal/utils/ReleasedDynamicTexture$Resources;", "uploaded", "", "getUploaded", "()Z", "setUploaded", "(Z)V", "getWidth", "allocGlId", "clearGlId", "", "close", "getGlId", "load", "resourceManager", "Lnet/minecraft/resource/ResourceManager;", "updateDynamicTexture", "uploadTexture", "Resources", "universalcraft" })
public final class ReleasedDynamicTexture extends AbstractTexture
{
    private final int width;
    private final int height;
    @NotNull
    private Resources resources;
    @NotNull
    private final Resources textureData$receiver;
    private boolean uploaded;
    
    private ReleasedDynamicTexture(final int width, final int height, final NativeImage textureData) {
        super();
        this.width = width;
        this.height = height;
        this.resources = new Resources(this);
        final Resources resources = this.resources;
        NativeImage textureData2 = textureData;
        if (textureData == null) {
            textureData2 = new NativeImage(this.width, this.height, true);
        }
        resources.setTextureData(textureData2);
        this.textureData$receiver = this.resources;
    }
    
    public final int getWidth() {
        return this.width;
    }
    
    public final int getHeight() {
        return this.height;
    }
    
    private final NativeImage getTextureData() {
        return this.textureData$receiver.getTextureData();
    }
    
    private final void setTextureData(final NativeImage <set-?>) {
        this.textureData$receiver.setTextureData(<set-?>);
    }
    
    private static Object getTextureData$delegate(final ReleasedDynamicTexture <this>) {
        return Reflection.mutableProperty0((MutablePropertyReference0)new MutablePropertyReference0Impl((Object)<this>.textureData$receiver, (Class)Resources.class, "textureData", "getTextureData()Lnet/minecraft/client/texture/NativeImage;", 0));
    }
    
    public final boolean getUploaded() {
        return this.uploaded;
    }
    
    public final void setUploaded(final boolean <set-?>) {
        this.uploaded = <set-?>;
    }
    
    public ReleasedDynamicTexture(final int width, final int height) {
        this(width, height, null);
    }
    
    public ReleasedDynamicTexture(@NotNull final NativeImage nativeImage) {
        Intrinsics.checkNotNullParameter((Object)nativeImage, "nativeImage");
        this(nativeImage.getWidth(), nativeImage.getHeight(), nativeImage);
    }
    
    public void load(@NotNull final ResourceManager resourceManager) throws IOException {
        Intrinsics.checkNotNullParameter((Object)resourceManager, "resourceManager");
    }
    
    public final void updateDynamicTexture() {
        this.uploadTexture();
    }
    
    public final void uploadTexture() {
        if (!this.uploaded) {
            TextureUtil.prepareImage(this.allocGlId(), this.width, this.height);
            UGraphics.configureTexture(this.allocGlId(), ReleasedDynamicTexture::uploadTexture$lambda-0);
            this.setTextureData(null);
            this.uploaded = true;
            this.resources.setGlId(this.allocGlId());
            Resources.Companion.drainCleanupQueue();
        }
    }
    
    private final int allocGlId() {
        return super.getGlId();
    }
    
    public final int getDynamicGlId() {
        return this.getGlId();
    }
    
    public int getGlId() {
        this.uploadTexture();
        return super.getGlId();
    }
    
    public void clearGlId() {
        super.clearGlId();
        this.resources.setGlId(-1);
    }
    
    public void close() {
        this.clearGlId();
        this.resources.close();
    }
    
    private static final void uploadTexture$lambda-0(final ReleasedDynamicTexture this$0) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        final NativeImage textureData = this$0.getTextureData();
        if (textureData != null) {
            textureData.upload(0, 0, 0, false);
        }
    }
    
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
}
