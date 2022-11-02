package gg.essential.model;

import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.descriptors.*;
import kotlin.jvm.*;
import kotlin.*;
import kotlinx.serialization.builtins.*;
import kotlinx.serialization.*;
import kotlinx.serialization.encoding.*;
import kotlinx.serialization.internal.*;

@Serializable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB)\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J!\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u00c7\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r¨\u0006#" }, d2 = { "Lgg/essential/model/Channels;", "", "seen1", "", "position", "Lgg/essential/model/Keyframes;", "rotation", "scale", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILgg/essential/model/Keyframes;Lgg/essential/model/Keyframes;Lgg/essential/model/Keyframes;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lgg/essential/model/Keyframes;Lgg/essential/model/Keyframes;Lgg/essential/model/Keyframes;)V", "getPosition", "()Lgg/essential/model/Keyframes;", "getRotation", "getScale", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "cosmetics" })
public final class Channels
{
    @NotNull
    public static final Companion Companion;
    @Nullable
    private final Keyframes position;
    @Nullable
    private final Keyframes rotation;
    @Nullable
    private final Keyframes scale;
    
    public Channels(@Nullable final Keyframes position, @Nullable final Keyframes rotation, @Nullable final Keyframes scale) {
        super();
        this.position = position;
        this.rotation = rotation;
        this.scale = scale;
    }
    
    public Channels(final byte b) {
        this(null, null, null);
    }
    
    @Nullable
    public final Keyframes getPosition() {
        return this.position;
    }
    
    @Nullable
    public final Keyframes getRotation() {
        return this.rotation;
    }
    
    @Nullable
    public final Keyframes getScale() {
        return this.scale;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Channels(position=" + this.position + ", rotation=" + this.rotation + ", scale=" + this.scale + ')';
    }
    
    @Override
    public int hashCode() {
        int result = (this.position == null) ? 0 : this.position.hashCode();
        result = result * 31 + ((this.rotation == null) ? 0 : this.rotation.hashCode());
        result = result * 31 + ((this.scale == null) ? 0 : this.scale.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Channels)) {
            return false;
        }
        final Channels channels = (Channels)other;
        return Intrinsics.areEqual((Object)this.position, (Object)channels.position) && Intrinsics.areEqual((Object)this.rotation, (Object)channels.rotation) && Intrinsics.areEqual((Object)this.scale, (Object)channels.scale);
    }
    
    @JvmStatic
    public static final void write$Self(@NotNull final Channels self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter((Object)self, "self");
        Intrinsics.checkNotNullParameter((Object)output, "output");
        Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.position != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, (SerializationStrategy)Keyframes.Companion.serializer(), (Object)self.position);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.rotation != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, (SerializationStrategy)Keyframes.Companion.serializer(), (Object)self.rotation);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.scale != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (SerializationStrategy)Keyframes.Companion.serializer(), (Object)self.scale);
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @java.lang.Deprecated
    public Channels(final int seen1, final Keyframes position, final Keyframes rotation, final Keyframes scale) {
        if ((0x0 & seen1) != 0x0) {
            PluginExceptionsKt.throwMissingFieldException(seen1, 0, serializer.INSTANCE.getDescriptor());
        }
        super();
        if ((seen1 & 0x1) == 0x0) {
            this.position = null;
        }
        else {
            this.position = position;
        }
        if ((seen1 & 0x2) == 0x0) {
            this.rotation = null;
        }
        else {
            this.rotation = rotation;
        }
        if ((seen1 & 0x4) == 0x0) {
            this.scale = null;
        }
        else {
            this.scale = scale;
        }
    }
    
    public Channels() {
        this((byte)0);
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/model/Channels$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/model/Channels;", "cosmetics" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final KSerializer<Channels> serializer() {
            return (KSerializer<Channels>)serializer.INSTANCE;
        }
        
        public Companion(final byte b) {
            this();
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014" }, d2 = { "gg/essential/model/Channels.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/model/Channels;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "cosmetics" })
    public static final class serializer implements GeneratedSerializer<Channels>
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
            return (KSerializer<?>[])new KSerializer[] { BuiltinSerializersKt.getNullable((KSerializer)Keyframes.Companion.serializer()), BuiltinSerializersKt.getNullable((KSerializer)Keyframes.Companion.serializer()), BuiltinSerializersKt.getNullable((KSerializer)Keyframes.Companion.serializer()) };
        }
        
        @NotNull
        public Channels deserialize(@NotNull final Decoder decoder) {
            Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            int i = 1;
            int seen1 = 0;
            Object o = null;
            Object o2 = null;
            Object o3 = null;
            final CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
            if (beginStructure.decodeSequentially()) {
                o = beginStructure.decodeNullableSerializableElement(descriptor, 0, (DeserializationStrategy)Keyframes.Companion.serializer(), o);
                o2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, (DeserializationStrategy)Keyframes.Companion.serializer(), o2);
                o3 = beginStructure.decodeNullableSerializableElement(descriptor, 2, (DeserializationStrategy)Keyframes.Companion.serializer(), o3);
                seen1 = 7;
            }
            else {
                while (i != 0) {
                    final int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
                    switch (decodeElementIndex) {
                        case -1: {
                            i = 0;
                            continue;
                        }
                        case 0: {
                            o = beginStructure.decodeNullableSerializableElement(descriptor, 0, (DeserializationStrategy)Keyframes.Companion.serializer(), o);
                            seen1 |= 0x1;
                            continue;
                        }
                        case 1: {
                            o2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, (DeserializationStrategy)Keyframes.Companion.serializer(), o2);
                            seen1 |= 0x2;
                            continue;
                        }
                        case 2: {
                            o3 = beginStructure.decodeNullableSerializableElement(descriptor, 2, (DeserializationStrategy)Keyframes.Companion.serializer(), o3);
                            seen1 |= 0x4;
                            continue;
                        }
                        default: {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                    }
                }
            }
            beginStructure.endStructure(descriptor);
            return new Channels(seen1, (Keyframes)o, (Keyframes)o2, (Keyframes)o3);
        }
        
        public void serialize(@NotNull final Encoder encoder, @NotNull final Channels value) {
            Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
            Intrinsics.checkNotNullParameter((Object)value, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
            Channels.write$Self(value, beginStructure, descriptor);
            beginStructure.endStructure(descriptor);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object value) {
            this.serialize(encoder, (Channels)value);
        }
        
        static {
            INSTANCE = new serializer();
            final PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("gg.essential.model.Channels", (GeneratedSerializer)serializer.INSTANCE, 3);
            pluginGeneratedSerialDescriptor.addElement("position", true);
            pluginGeneratedSerialDescriptor.addElement("rotation", true);
            pluginGeneratedSerialDescriptor.addElement("scale", true);
            descriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor;
        }
    }
}
