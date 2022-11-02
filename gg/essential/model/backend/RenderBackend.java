package gg.essential.model.backend;

import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import gg.essential.model.util.*;
import kotlin.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0002\t\nJ!\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H¦@\u00f8\u0001\u0000¢\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b" }, d2 = { "Lgg/essential/model/backend/RenderBackend;", "", "readTexture", "Lgg/essential/model/backend/RenderBackend$Texture;", "name", "", "bytes", "", "(Ljava/lang/String;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Texture", "VertexConsumerProvider", "cosmetics" })
public interface RenderBackend
{
    @Nullable
    Object readTexture$23cb99da(@NotNull final String p0, @NotNull final byte[] p1);
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005¨\u0006\b" }, d2 = { "Lgg/essential/model/backend/RenderBackend$Texture;", "", "height", "", "getHeight", "()I", "width", "getWidth", "cosmetics" })
    public interface Texture
    {
        int getWidth();
        
        int getHeight();
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H&¨\u0006\t" }, d2 = { "Lgg/essential/model/backend/RenderBackend$VertexConsumerProvider;", "", "provide", "", "texture", "Lgg/essential/model/backend/RenderBackend$Texture;", "block", "Lkotlin/Function1;", "Lgg/essential/model/util/UVertexConsumer;", "cosmetics" })
    public interface VertexConsumerProvider
    {
        void provide(@NotNull final Texture p0, @NotNull final Function1<? super UVertexConsumer, Unit> p1);
    }
}
