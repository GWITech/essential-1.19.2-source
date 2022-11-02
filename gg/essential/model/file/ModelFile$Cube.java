package gg.essential.model.file;

import gg.essential.model.*;
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
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u0002./BI\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0002\u0010\u000fB3\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\bH\u00c6\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\nH\u00c6\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u001f\u001a\u00020\fH\u00c6\u0003JB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020\n2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001J\t\u0010%\u001a\u00020&H\u00d6\u0001J!\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u00002\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u00c7\u0001R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00060" }, d2 = { "Lgg/essential/model/file/ModelFile$Cube;", "", "seen1", "", "origin", "Lgg/essential/model/Vector3;", "size", "uv", "Lgg/essential/model/file/ModelFile$Uvs;", "mirror", "", "inflate", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILgg/essential/model/Vector3;Lgg/essential/model/Vector3;Lgg/essential/model/file/ModelFile$Uvs;Ljava/lang/Boolean;FLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lgg/essential/model/Vector3;Lgg/essential/model/Vector3;Lgg/essential/model/file/ModelFile$Uvs;Ljava/lang/Boolean;F)V", "getInflate", "()F", "getMirror", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getOrigin", "()Lgg/essential/model/Vector3;", "getSize", "getUv", "()Lgg/essential/model/file/ModelFile$Uvs;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lgg/essential/model/Vector3;Lgg/essential/model/Vector3;Lgg/essential/model/file/ModelFile$Uvs;Ljava/lang/Boolean;F)Lgg/essential/model/file/ModelFile$Cube;", "equals", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "cosmetics" })
public static final class Cube
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final Vector3 origin = origin;
    @NotNull
    private final Vector3 size = size;
    @NotNull
    private final Uvs uv = uv;
    @Nullable
    private final Boolean mirror;
    private final float inflate;
    
    @NotNull
    public final Vector3 getOrigin() {
        return this.origin;
    }
    
    @NotNull
    public final Vector3 getSize() {
        return this.size;
    }
    
    @NotNull
    public final Uvs getUv() {
        return this.uv;
    }
    
    @Nullable
    public final Boolean getMirror() {
        return this.mirror;
    }
    
    public final float getInflate() {
        return this.inflate;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Cube(origin=" + this.origin + ", size=" + this.size + ", uv=" + this.uv + ", mirror=" + this.mirror + ", inflate=" + this.inflate + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.origin.hashCode();
        result = result * 31 + this.size.hashCode();
        result = result * 31 + this.uv.hashCode();
        result = result * 31 + ((this.mirror == null) ? 0 : this.mirror.hashCode());
        result = result * 31 + Float.hashCode(this.inflate);
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Cube)) {
            return false;
        }
        final Cube cube = (Cube)other;
        return Intrinsics.areEqual((Object)this.origin, (Object)cube.origin) && Intrinsics.areEqual((Object)this.size, (Object)cube.size) && Intrinsics.areEqual((Object)this.uv, (Object)cube.uv) && Intrinsics.areEqual((Object)this.mirror, (Object)cube.mirror) && Intrinsics.areEqual((Object)this.inflate, (Object)cube.inflate);
    }
    
    @JvmStatic
    public static final void write$Self(@NotNull final Cube self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter((Object)self, "self");
        Intrinsics.checkNotNullParameter((Object)output, "output");
        Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
        output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy)new Vector3AsFloatArraySerializer(), (Object)self.origin);
        output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy)new Vector3AsFloatArraySerializer(), (Object)self.size);
        output.encodeSerializableElement(serialDesc, 2, (SerializationStrategy)Uvs.Companion.serializer(), (Object)self.uv);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.mirror != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (SerializationStrategy)BooleanSerializer.INSTANCE, (Object)self.mirror);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !Intrinsics.areEqual((Object)self.inflate, (Object)0.0f)) {
            output.encodeFloatElement(serialDesc, 4, self.inflate);
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @java.lang.Deprecated
    public Cube(final int seen1, final Vector3 origin, final Vector3 size, final Uvs uv, final Boolean mirror, final float inflate) {
        if (0x7 != (0x7 & seen1)) {
            PluginExceptionsKt.throwMissingFieldException(seen1, 7, serializer.INSTANCE.getDescriptor());
        }
        super();
        if ((seen1 & 0x8) == 0x0) {
            this.mirror = null;
        }
        else {
            this.mirror = mirror;
        }
        if ((seen1 & 0x10) == 0x0) {
            this.inflate = 0.0f;
        }
        else {
            this.inflate = inflate;
        }
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/model/file/ModelFile$Cube$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/model/file/ModelFile$Cube;", "cosmetics" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final KSerializer<Cube> serializer() {
            return (KSerializer<Cube>)serializer.INSTANCE;
        }
        
        public Companion(final byte b) {
            this();
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014" }, d2 = { "gg/essential/model/file/ModelFile.Cube.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/model/file/ModelFile$Cube;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "cosmetics" })
    public static final class serializer implements GeneratedSerializer<Cube>
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
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)new Vector3AsFloatArraySerializer(), (KSerializer)new Vector3AsFloatArraySerializer(), Uvs.Companion.serializer(), BuiltinSerializersKt.getNullable((KSerializer)BooleanSerializer.INSTANCE), (KSerializer)FloatSerializer.INSTANCE };
        }
        
        @NotNull
        public Cube deserialize(@NotNull final Decoder decoder) {
            Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            int i = 1;
            int seen1 = 0;
            Object o = null;
            Object o2 = null;
            Object o3 = null;
            Object o4 = null;
            float inflate = 0.0f;
            final CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
            if (beginStructure.decodeSequentially()) {
                o = beginStructure.decodeSerializableElement(descriptor, 0, (DeserializationStrategy)new Vector3AsFloatArraySerializer(), o);
                o2 = beginStructure.decodeSerializableElement(descriptor, 1, (DeserializationStrategy)new Vector3AsFloatArraySerializer(), o2);
                o3 = beginStructure.decodeSerializableElement(descriptor, 2, (DeserializationStrategy)Uvs.Companion.serializer(), o3);
                o4 = beginStructure.decodeNullableSerializableElement(descriptor, 3, (DeserializationStrategy)BooleanSerializer.INSTANCE, o4);
                inflate = beginStructure.decodeFloatElement(descriptor, 4);
                seen1 = 31;
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
                            o = beginStructure.decodeSerializableElement(descriptor, 0, (DeserializationStrategy)new Vector3AsFloatArraySerializer(), o);
                            seen1 |= 0x1;
                            continue;
                        }
                        case 1: {
                            o2 = beginStructure.decodeSerializableElement(descriptor, 1, (DeserializationStrategy)new Vector3AsFloatArraySerializer(), o2);
                            seen1 |= 0x2;
                            continue;
                        }
                        case 2: {
                            o3 = beginStructure.decodeSerializableElement(descriptor, 2, (DeserializationStrategy)Uvs.Companion.serializer(), o3);
                            seen1 |= 0x4;
                            continue;
                        }
                        case 3: {
                            o4 = beginStructure.decodeNullableSerializableElement(descriptor, 3, (DeserializationStrategy)BooleanSerializer.INSTANCE, o4);
                            seen1 |= 0x8;
                            continue;
                        }
                        case 4: {
                            inflate = beginStructure.decodeFloatElement(descriptor, 4);
                            seen1 |= 0x10;
                            continue;
                        }
                        default: {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                    }
                }
            }
            beginStructure.endStructure(descriptor);
            return new Cube(seen1, (Vector3)o, (Vector3)o2, (Uvs)o3, (Boolean)o4, inflate);
        }
        
        public void serialize(@NotNull final Encoder encoder, @NotNull final Cube value) {
            Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
            Intrinsics.checkNotNullParameter((Object)value, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
            Cube.write$Self(value, beginStructure, descriptor);
            beginStructure.endStructure(descriptor);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object value) {
            this.serialize(encoder, (Cube)value);
        }
        
        static {
            INSTANCE = new serializer();
            final PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("gg.essential.model.file.ModelFile.Cube", (GeneratedSerializer)serializer.INSTANCE, 5);
            pluginGeneratedSerialDescriptor.addElement("origin", false);
            pluginGeneratedSerialDescriptor.addElement("size", false);
            pluginGeneratedSerialDescriptor.addElement("uv", false);
            pluginGeneratedSerialDescriptor.addElement("mirror", true);
            pluginGeneratedSerialDescriptor.addElement("inflate", true);
            descriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor;
        }
    }
}
