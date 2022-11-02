package gg.essential.model.file;

import org.jetbrains.annotations.*;
import kotlinx.serialization.descriptors.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.*;
import kotlin.*;
import kotlinx.serialization.builtins.*;
import kotlinx.serialization.*;
import kotlinx.serialization.encoding.*;
import kotlinx.serialization.internal.*;

@Serializable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001d\u001eBU\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rBM\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000eJ!\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u00c7\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006\u001f" }, d2 = { "Lgg/essential/model/file/ModelFile$Uvs$PerFace;", "Lgg/essential/model/file/ModelFile$Uvs;", "seen1", "", "north", "Lgg/essential/model/file/ModelFile$UvFace;", "east", "south", "west", "up", "down", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILgg/essential/model/file/ModelFile$UvFace;Lgg/essential/model/file/ModelFile$UvFace;Lgg/essential/model/file/ModelFile$UvFace;Lgg/essential/model/file/ModelFile$UvFace;Lgg/essential/model/file/ModelFile$UvFace;Lgg/essential/model/file/ModelFile$UvFace;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lgg/essential/model/file/ModelFile$UvFace;Lgg/essential/model/file/ModelFile$UvFace;Lgg/essential/model/file/ModelFile$UvFace;Lgg/essential/model/file/ModelFile$UvFace;Lgg/essential/model/file/ModelFile$UvFace;Lgg/essential/model/file/ModelFile$UvFace;)V", "getDown", "()Lgg/essential/model/file/ModelFile$UvFace;", "getEast", "getNorth", "getSouth", "getUp", "getWest", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "cosmetics" })
public static final class PerFace extends Uvs
{
    @NotNull
    public static final Companion Companion;
    @Nullable
    private final UvFace north;
    @Nullable
    private final UvFace east;
    @Nullable
    private final UvFace south;
    @Nullable
    private final UvFace west;
    @Nullable
    private final UvFace up;
    @Nullable
    private final UvFace down;
    
    public PerFace(@Nullable final UvFace north, @Nullable final UvFace east, @Nullable final UvFace south, @Nullable final UvFace west, @Nullable final UvFace up, @Nullable final UvFace down) {
        super((byte)0);
        this.north = north;
        this.east = east;
        this.south = south;
        this.west = west;
        this.up = up;
        this.down = down;
    }
    
    public PerFace(final byte b) {
        this(null, null, null, null, null, null);
    }
    
    @Nullable
    public final UvFace getNorth() {
        return this.north;
    }
    
    @Nullable
    public final UvFace getEast() {
        return this.east;
    }
    
    @Nullable
    public final UvFace getSouth() {
        return this.south;
    }
    
    @Nullable
    public final UvFace getWest() {
        return this.west;
    }
    
    @Nullable
    public final UvFace getUp() {
        return this.up;
    }
    
    @Nullable
    public final UvFace getDown() {
        return this.down;
    }
    
    @JvmStatic
    public static final void write$Self(@NotNull final PerFace self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter((Object)self, "self");
        Intrinsics.checkNotNullParameter((Object)output, "output");
        Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.north != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, (SerializationStrategy)UvFace.serializer.INSTANCE, (Object)self.north);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.east != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, (SerializationStrategy)UvFace.serializer.INSTANCE, (Object)self.east);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.south != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (SerializationStrategy)UvFace.serializer.INSTANCE, (Object)self.south);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.west != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (SerializationStrategy)UvFace.serializer.INSTANCE, (Object)self.west);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.up != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (SerializationStrategy)UvFace.serializer.INSTANCE, (Object)self.up);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.down != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (SerializationStrategy)UvFace.serializer.INSTANCE, (Object)self.down);
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @java.lang.Deprecated
    public PerFace(final int seen1, final UvFace north, final UvFace east, final UvFace south, final UvFace west, final UvFace up, final UvFace down) {
        if ((0x0 & seen1) != 0x0) {
            PluginExceptionsKt.throwMissingFieldException(seen1, 0, serializer.INSTANCE.getDescriptor());
        }
        super((byte)0);
        if ((seen1 & 0x1) == 0x0) {
            this.north = null;
        }
        else {
            this.north = north;
        }
        if ((seen1 & 0x2) == 0x0) {
            this.east = null;
        }
        else {
            this.east = east;
        }
        if ((seen1 & 0x4) == 0x0) {
            this.south = null;
        }
        else {
            this.south = south;
        }
        if ((seen1 & 0x8) == 0x0) {
            this.west = null;
        }
        else {
            this.west = west;
        }
        if ((seen1 & 0x10) == 0x0) {
            this.up = null;
        }
        else {
            this.up = up;
        }
        if ((seen1 & 0x20) == 0x0) {
            this.down = null;
        }
        else {
            this.down = down;
        }
    }
    
    public PerFace() {
        this((byte)0);
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/model/file/ModelFile$Uvs$PerFace$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/model/file/ModelFile$Uvs$PerFace;", "cosmetics" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final KSerializer<PerFace> serializer() {
            return (KSerializer<PerFace>)serializer.INSTANCE;
        }
        
        public Companion(final byte b) {
            this();
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014" }, d2 = { "gg/essential/model/file/ModelFile.Uvs.PerFace.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/model/file/ModelFile$Uvs$PerFace;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "cosmetics" })
    public static final class serializer implements GeneratedSerializer<PerFace>
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
            return (KSerializer<?>[])new KSerializer[] { BuiltinSerializersKt.getNullable((KSerializer)UvFace.serializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer)UvFace.serializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer)UvFace.serializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer)UvFace.serializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer)UvFace.serializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer)UvFace.serializer.INSTANCE) };
        }
        
        @NotNull
        public PerFace deserialize(@NotNull final Decoder decoder) {
            Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            int i = 1;
            int seen1 = 0;
            Object o = null;
            Object o2 = null;
            Object o3 = null;
            Object o4 = null;
            Object o5 = null;
            Object o6 = null;
            final CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
            if (beginStructure.decodeSequentially()) {
                o = beginStructure.decodeNullableSerializableElement(descriptor, 0, (DeserializationStrategy)UvFace.serializer.INSTANCE, o);
                o2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, (DeserializationStrategy)UvFace.serializer.INSTANCE, o2);
                o3 = beginStructure.decodeNullableSerializableElement(descriptor, 2, (DeserializationStrategy)UvFace.serializer.INSTANCE, o3);
                o4 = beginStructure.decodeNullableSerializableElement(descriptor, 3, (DeserializationStrategy)UvFace.serializer.INSTANCE, o4);
                o5 = beginStructure.decodeNullableSerializableElement(descriptor, 4, (DeserializationStrategy)UvFace.serializer.INSTANCE, o5);
                o6 = beginStructure.decodeNullableSerializableElement(descriptor, 5, (DeserializationStrategy)UvFace.serializer.INSTANCE, o6);
                seen1 = 63;
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
                            o = beginStructure.decodeNullableSerializableElement(descriptor, 0, (DeserializationStrategy)UvFace.serializer.INSTANCE, o);
                            seen1 |= 0x1;
                            continue;
                        }
                        case 1: {
                            o2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, (DeserializationStrategy)UvFace.serializer.INSTANCE, o2);
                            seen1 |= 0x2;
                            continue;
                        }
                        case 2: {
                            o3 = beginStructure.decodeNullableSerializableElement(descriptor, 2, (DeserializationStrategy)UvFace.serializer.INSTANCE, o3);
                            seen1 |= 0x4;
                            continue;
                        }
                        case 3: {
                            o4 = beginStructure.decodeNullableSerializableElement(descriptor, 3, (DeserializationStrategy)UvFace.serializer.INSTANCE, o4);
                            seen1 |= 0x8;
                            continue;
                        }
                        case 4: {
                            o5 = beginStructure.decodeNullableSerializableElement(descriptor, 4, (DeserializationStrategy)UvFace.serializer.INSTANCE, o5);
                            seen1 |= 0x10;
                            continue;
                        }
                        case 5: {
                            o6 = beginStructure.decodeNullableSerializableElement(descriptor, 5, (DeserializationStrategy)UvFace.serializer.INSTANCE, o6);
                            seen1 |= 0x20;
                            continue;
                        }
                        default: {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                    }
                }
            }
            beginStructure.endStructure(descriptor);
            return new PerFace(seen1, (UvFace)o, (UvFace)o2, (UvFace)o3, (UvFace)o4, (UvFace)o5, (UvFace)o6);
        }
        
        public void serialize(@NotNull final Encoder encoder, @NotNull final PerFace value) {
            Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
            Intrinsics.checkNotNullParameter((Object)value, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
            PerFace.write$Self(value, beginStructure, descriptor);
            beginStructure.endStructure(descriptor);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object value) {
            this.serialize(encoder, (PerFace)value);
        }
        
        static {
            INSTANCE = new serializer();
            final PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("gg.essential.model.file.ModelFile.Uvs.PerFace", (GeneratedSerializer)serializer.INSTANCE, 6);
            pluginGeneratedSerialDescriptor.addElement("north", true);
            pluginGeneratedSerialDescriptor.addElement("east", true);
            pluginGeneratedSerialDescriptor.addElement("south", true);
            pluginGeneratedSerialDescriptor.addElement("west", true);
            pluginGeneratedSerialDescriptor.addElement("up", true);
            pluginGeneratedSerialDescriptor.addElement("down", true);
            descriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor;
        }
    }
}
