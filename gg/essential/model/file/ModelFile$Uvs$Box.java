package gg.essential.model.file;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.*;

@Serializable(with = UvBoxSerializer.class)
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b" }, d2 = { "Lgg/essential/model/file/ModelFile$Uvs$Box;", "Lgg/essential/model/file/ModelFile$Uvs;", "uv", "", "([F)V", "getUv", "()[F", "Companion", "cosmetics" })
public static final class Box extends Uvs
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final float[] uv;
    
    public Box(@NotNull final float[] uv) {
        Intrinsics.checkNotNullParameter((Object)uv, "uv");
        super((byte)0);
        this.uv = uv;
    }
    
    @NotNull
    public final float[] getUv() {
        return this.uv;
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/model/file/ModelFile$Uvs$Box$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/model/file/ModelFile$Uvs$Box;", "cosmetics" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final KSerializer<Box> serializer() {
            return (KSerializer<Box>)new UvBoxSerializer();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
