package gg.essential.model.file;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlinx.serialization.*;

@kotlinx.serialization.Serializable(with = LoopSerializer.class)
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007" }, d2 = { "Lgg/essential/model/file/AnimationFile$Loop;", "", "(Ljava/lang/String;I)V", "False", "True", "HoldOnLastFrame", "Companion", "cosmetics" })
public enum Loop
{
    @NotNull
    public static final Companion Companion;
    
    False("False", 0), 
    True("True", 1), 
    HoldOnLastFrame("HoldOnLastFrame", 2);
    
    private static final /* synthetic */ Loop[] $VALUES;
    
    private Loop(final String $enum$name, final int $enum$ordinal) {
    }
    
    public static Loop[] values() {
        return Loop.$VALUES.clone();
    }
    
    public static Loop valueOf(final String value) {
        return Enum.valueOf(Loop.class, value);
    }
    
    private static final /* synthetic */ Loop[] $values() {
        return new Loop[] { Loop.False, Loop.True, Loop.HoldOnLastFrame };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/model/file/AnimationFile$Loop$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/model/file/AnimationFile$Loop;", "cosmetics" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final KSerializer<Loop> serializer() {
            return (KSerializer<Loop>)new LoopSerializer();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
