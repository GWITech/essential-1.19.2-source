package gg.essential.model.file;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlinx.serialization.descriptors.*;
import kotlinx.serialization.builtins.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.*;
import gg.essential.model.*;
import java.util.*;
import kotlinx.serialization.encoding.*;
import kotlinx.serialization.internal.*;

@Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002�\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001�\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005�\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007�\u0006\u0014" }, d2 = { "gg/essential/model/file/ModelFile.Bone.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/model/file/ModelFile$Bone;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "cosmetics" })
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
