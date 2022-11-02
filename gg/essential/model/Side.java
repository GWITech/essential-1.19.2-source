package gg.essential.model;

import org.jetbrains.annotations.*;
import kotlin.*;
import kotlinx.serialization.descriptors.*;
import kotlinx.serialization.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.encoding.*;
import kotlinx.serialization.internal.*;

@kotlinx.serialization.Serializable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\t\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u000b" }, d2 = { "Lgg/essential/model/Side;", "", "displayName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "LEFT", "RIGHT", "$serializer", "Companion", "cosmetics" })
public enum Side
{
    @NotNull
    public static final Side.Companion Companion;
    
    @SerialName("left")
    LEFT("LEFT", 0), 
    @SerialName("right")
    RIGHT("RIGHT", 1);
    
    private static final /* synthetic */ Side[] $VALUES;
    
    private Side(final String $enum$name, final int $enum$ordinal) {
    }
    
    public static Side[] values() {
        return Side.$VALUES.clone();
    }
    
    public static Side valueOf(final String value) {
        return Enum.valueOf(Side.class, value);
    }
    
    private static final /* synthetic */ Side[] $values() {
        return new Side[] { Side.LEFT, Side.RIGHT };
    }
    
    static {
        $VALUES = $values();
        Companion = new Side.Companion((byte)0);
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014" }, d2 = { "gg/essential/model/Side.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/model/Side;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "cosmetics" })
    public static final class serializer implements GeneratedSerializer<Side>
    {
        @NotNull
        public static final serializer INSTANCE;
        public static final /* synthetic */ SerialDescriptor descriptor;
        
        private serializer() {
            super();
        }
        
        @NotNull
        public KSerializer<?>[] typeParametersSerializers() {
            return (KSerializer<?>[])GeneratedSerializer$DefaultImpls.typeParametersSerializers((GeneratedSerializer)this);
        }
        
        @NotNull
        public SerialDescriptor getDescriptor() {
            return serializer.descriptor;
        }
        
        @NotNull
        public KSerializer<?>[] childSerializers() {
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)StringSerializer.INSTANCE };
        }
        
        @NotNull
        public Side deserialize(@NotNull final Decoder decoder) {
            Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
            return Side.values()[decoder.decodeEnum(this.getDescriptor())];
        }
        
        public void serialize(@NotNull final Encoder encoder, @NotNull final Side value) {
            Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
            Intrinsics.checkNotNullParameter((Object)value, "value");
            encoder.encodeEnum(this.getDescriptor(), value.ordinal());
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object value) {
            this.serialize(encoder, (Side)value);
        }
        
        static {
            INSTANCE = new serializer();
            final EnumDescriptor enumDescriptor = new EnumDescriptor("gg.essential.model.Side", 2);
            enumDescriptor.addElement("left", false);
            enumDescriptor.addElement("right", false);
            descriptor = (SerialDescriptor)enumDescriptor;
        }
    }
}
