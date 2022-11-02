package gg.essential.model.file;

import org.jetbrains.annotations.*;
import gg.essential.model.*;
import java.util.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.descriptors.*;
import kotlin.collections.*;
import kotlin.jvm.*;
import kotlin.*;
import kotlinx.serialization.builtins.*;
import kotlinx.serialization.*;
import kotlinx.serialization.encoding.*;
import kotlinx.serialization.internal.*;

@Serializable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000245Bc\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0002\u0010\u0013BS\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0002\u0010\u0014J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\bH\u00c6\u0003J\t\u0010$\u001a\u00020\bH\u00c6\u0003J\t\u0010%\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u00c6\u0003JY\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u00c6\u0001J\u0013\u0010)\u001a\u00020\u000b2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020\u0003H\u00d6\u0001J\t\u0010,\u001a\u00020\u0005H\u00d6\u0001J!\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u00c7\u0001R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001dR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u00066" }, d2 = { "Lgg/essential/model/file/ModelFile$Bone;", "", "seen1", "", "name", "", "parent", "pivot", "Lgg/essential/model/Vector3;", "rotation", "mirror", "", "side", "Lgg/essential/model/Side;", "cubes", "", "Lgg/essential/model/file/ModelFile$Cube;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lgg/essential/model/Vector3;Lgg/essential/model/Vector3;ZLgg/essential/model/Side;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Lgg/essential/model/Vector3;Lgg/essential/model/Vector3;ZLgg/essential/model/Side;Ljava/util/List;)V", "getCubes", "()Ljava/util/List;", "getMirror", "()Z", "getName", "()Ljava/lang/String;", "getParent", "getPivot", "()Lgg/essential/model/Vector3;", "getRotation", "getSide", "()Lgg/essential/model/Side;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "cosmetics" })
public static final class Bone
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final String name = name;
    @Nullable
    private final String parent;
    @NotNull
    private final Vector3 pivot;
    @NotNull
    private final Vector3 rotation;
    private final boolean mirror;
    @Nullable
    private final Side side;
    @NotNull
    private final List<Cube> cubes;
    
    @NotNull
    public final String getName() {
        return this.name;
    }
    
    @Nullable
    public final String getParent() {
        return this.parent;
    }
    
    @NotNull
    public final Vector3 getPivot() {
        return this.pivot;
    }
    
    @NotNull
    public final Vector3 getRotation() {
        return this.rotation;
    }
    
    public final boolean getMirror() {
        return this.mirror;
    }
    
    @Nullable
    public final Side getSide() {
        return this.side;
    }
    
    @NotNull
    public final List<Cube> getCubes() {
        return this.cubes;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Bone(name=" + this.name + ", parent=" + this.parent + ", pivot=" + this.pivot + ", rotation=" + this.rotation + ", mirror=" + this.mirror + ", side=" + this.side + ", cubes=" + this.cubes + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.name.hashCode();
        result = result * 31 + ((this.parent == null) ? 0 : this.parent.hashCode());
        result = result * 31 + this.pivot.hashCode();
        result = result * 31 + this.rotation.hashCode();
        final int n = result * 31;
        int mirror;
        if ((mirror = (this.mirror ? 1 : 0)) != 0) {
            mirror = 1;
        }
        result = n + mirror;
        result = result * 31 + ((this.side == null) ? 0 : this.side.hashCode());
        result = result * 31 + this.cubes.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Bone)) {
            return false;
        }
        final Bone bone = (Bone)other;
        return Intrinsics.areEqual((Object)this.name, (Object)bone.name) && Intrinsics.areEqual((Object)this.parent, (Object)bone.parent) && Intrinsics.areEqual((Object)this.pivot, (Object)bone.pivot) && Intrinsics.areEqual((Object)this.rotation, (Object)bone.rotation) && this.mirror == bone.mirror && this.side == bone.side && Intrinsics.areEqual((Object)this.cubes, (Object)bone.cubes);
    }
    
    @JvmStatic
    public static final void write$Self(@NotNull final Bone self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter((Object)self, "self");
        Intrinsics.checkNotNullParameter((Object)output, "output");
        Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.name);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.parent != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, (SerializationStrategy)StringSerializer.INSTANCE, (Object)self.parent);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual((Object)self.pivot, (Object)new Vector3())) {
            output.encodeSerializableElement(serialDesc, 2, (SerializationStrategy)new Vector3AsFloatArraySerializer(), (Object)self.pivot);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !Intrinsics.areEqual((Object)self.rotation, (Object)new Vector3())) {
            output.encodeSerializableElement(serialDesc, 3, (SerializationStrategy)new Vector3AsFloatArraySerializer(), (Object)self.rotation);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.mirror) {
            output.encodeBooleanElement(serialDesc, 4, self.mirror);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.side != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (SerializationStrategy)Side.serializer.INSTANCE, (Object)self.side);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || !Intrinsics.areEqual((Object)self.cubes, (Object)CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 6, (SerializationStrategy)new ArrayListSerializer((KSerializer)Cube.serializer.INSTANCE), (Object)self.cubes);
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @java.lang.Deprecated
    public Bone(final int seen1, final String name, final String parent, final Vector3 pivot, final Vector3 rotation, final boolean mirror, final Side side, final List cubes) {
        if (0x1 != (0x1 & seen1)) {
            PluginExceptionsKt.throwMissingFieldException(seen1, 1, serializer.INSTANCE.getDescriptor());
        }
        super();
        if ((seen1 & 0x2) == 0x0) {
            this.parent = null;
        }
        else {
            this.parent = parent;
        }
        if ((seen1 & 0x4) == 0x0) {
            this.pivot = new Vector3();
        }
        else {
            this.pivot = pivot;
        }
        if ((seen1 & 0x8) == 0x0) {
            this.rotation = new Vector3();
        }
        else {
            this.rotation = rotation;
        }
        if ((seen1 & 0x10) == 0x0) {
            this.mirror = false;
        }
        else {
            this.mirror = mirror;
        }
        if ((seen1 & 0x20) == 0x0) {
            this.side = null;
        }
        else {
            this.side = side;
        }
        if ((seen1 & 0x40) == 0x0) {
            this.cubes = CollectionsKt.emptyList();
        }
        else {
            this.cubes = cubes;
        }
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/model/file/ModelFile$Bone$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/model/file/ModelFile$Bone;", "cosmetics" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final KSerializer<Bone> serializer() {
            return (KSerializer<Bone>)serializer.INSTANCE;
        }
        
        public Companion(final byte b) {
            this();
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014" }, d2 = { "gg/essential/model/file/ModelFile.Bone.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/model/file/ModelFile$Bone;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "cosmetics" })
    public static final class serializer implements GeneratedSerializer<Bone>
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
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE), (KSerializer)new Vector3AsFloatArraySerializer(), (KSerializer)new Vector3AsFloatArraySerializer(), (KSerializer)BooleanSerializer.INSTANCE, BuiltinSerializersKt.getNullable((KSerializer)Side.serializer.INSTANCE), (KSerializer)new ArrayListSerializer((KSerializer)Cube.serializer.INSTANCE) };
        }
        
        @NotNull
        public Bone deserialize(@NotNull final Decoder decoder) {
            Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            int i = 1;
            int seen1 = 0;
            String name = null;
            Object o = null;
            Object o2 = null;
            Object o3 = null;
            boolean mirror = false;
            Object o4 = null;
            Object o5 = null;
            final CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
            if (beginStructure.decodeSequentially()) {
                name = beginStructure.decodeStringElement(descriptor, 0);
                o = beginStructure.decodeNullableSerializableElement(descriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, o);
                o2 = beginStructure.decodeSerializableElement(descriptor, 2, (DeserializationStrategy)new Vector3AsFloatArraySerializer(), o2);
                o3 = beginStructure.decodeSerializableElement(descriptor, 3, (DeserializationStrategy)new Vector3AsFloatArraySerializer(), o3);
                mirror = beginStructure.decodeBooleanElement(descriptor, 4);
                o4 = beginStructure.decodeNullableSerializableElement(descriptor, 5, (DeserializationStrategy)Side.serializer.INSTANCE, o4);
                o5 = beginStructure.decodeSerializableElement(descriptor, 6, (DeserializationStrategy)new ArrayListSerializer((KSerializer)Cube.serializer.INSTANCE), o5);
                seen1 = 127;
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
                            name = beginStructure.decodeStringElement(descriptor, 0);
                            seen1 |= 0x1;
                            continue;
                        }
                        case 1: {
                            o = beginStructure.decodeNullableSerializableElement(descriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, o);
                            seen1 |= 0x2;
                            continue;
                        }
                        case 2: {
                            o2 = beginStructure.decodeSerializableElement(descriptor, 2, (DeserializationStrategy)new Vector3AsFloatArraySerializer(), o2);
                            seen1 |= 0x4;
                            continue;
                        }
                        case 3: {
                            o3 = beginStructure.decodeSerializableElement(descriptor, 3, (DeserializationStrategy)new Vector3AsFloatArraySerializer(), o3);
                            seen1 |= 0x8;
                            continue;
                        }
                        case 4: {
                            mirror = beginStructure.decodeBooleanElement(descriptor, 4);
                            seen1 |= 0x10;
                            continue;
                        }
                        case 5: {
                            o4 = beginStructure.decodeNullableSerializableElement(descriptor, 5, (DeserializationStrategy)Side.serializer.INSTANCE, o4);
                            seen1 |= 0x20;
                            continue;
                        }
                        case 6: {
                            o5 = beginStructure.decodeSerializableElement(descriptor, 6, (DeserializationStrategy)new ArrayListSerializer((KSerializer)Cube.serializer.INSTANCE), o5);
                            seen1 |= 0x40;
                            continue;
                        }
                        default: {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                    }
                }
            }
            beginStructure.endStructure(descriptor);
            return new Bone(seen1, name, (String)o, (Vector3)o2, (Vector3)o3, mirror, (Side)o4, (List)o5);
        }
        
        public void serialize(@NotNull final Encoder encoder, @NotNull final Bone value) {
            Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
            Intrinsics.checkNotNullParameter((Object)value, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
            Bone.write$Self(value, beginStructure, descriptor);
            beginStructure.endStructure(descriptor);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object value) {
            this.serialize(encoder, (Bone)value);
        }
        
        static {
            INSTANCE = new serializer();
            final PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("gg.essential.model.file.ModelFile.Bone", (GeneratedSerializer)serializer.INSTANCE, 7);
            pluginGeneratedSerialDescriptor.addElement("name", false);
            pluginGeneratedSerialDescriptor.addElement("parent", true);
            pluginGeneratedSerialDescriptor.addElement("pivot", true);
            pluginGeneratedSerialDescriptor.addElement("rotation", true);
            pluginGeneratedSerialDescriptor.addElement("mirror", true);
            pluginGeneratedSerialDescriptor.addElement("side", true);
            pluginGeneratedSerialDescriptor.addElement("cubes", true);
            descriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor;
        }
    }
}
