package gg.essential.model.file;

import java.util.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.descriptors.*;
import kotlin.collections.*;
import kotlin.jvm.*;
import kotlin.*;
import kotlinx.serialization.*;
import kotlinx.serialization.encoding.*;
import kotlinx.serialization.internal.*;

@Serializable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B3\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\fJ\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J#\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J!\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u00c7\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#" }, d2 = { "Lgg/essential/model/file/ModelFile$Geometry;", "", "seen1", "", "description", "Lgg/essential/model/file/ModelFile$Description;", "bones", "", "Lgg/essential/model/file/ModelFile$Bone;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILgg/essential/model/file/ModelFile$Description;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lgg/essential/model/file/ModelFile$Description;Ljava/util/List;)V", "getBones", "()Ljava/util/List;", "getDescription", "()Lgg/essential/model/file/ModelFile$Description;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "cosmetics" })
public static final class Geometry
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final Description description = description;
    @NotNull
    private final List<Bone> bones;
    
    @NotNull
    public final Description getDescription() {
        return this.description;
    }
    
    @NotNull
    public final List<Bone> getBones() {
        return this.bones;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Geometry(description=" + this.description + ", bones=" + this.bones + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.description.hashCode();
        result = result * 31 + this.bones.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Geometry)) {
            return false;
        }
        final Geometry geometry = (Geometry)other;
        return Intrinsics.areEqual((Object)this.description, (Object)geometry.description) && Intrinsics.areEqual((Object)this.bones, (Object)geometry.bones);
    }
    
    @JvmStatic
    public static final void write$Self(@NotNull final Geometry self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter((Object)self, "self");
        Intrinsics.checkNotNullParameter((Object)output, "output");
        Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
        output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy)Description.serializer.INSTANCE, (Object)self.description);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual((Object)self.bones, (Object)CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy)new ArrayListSerializer((KSerializer)Bone.serializer.INSTANCE), (Object)self.bones);
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @java.lang.Deprecated
    public Geometry(final int seen1, final Description description, final List bones) {
        if (0x1 != (0x1 & seen1)) {
            PluginExceptionsKt.throwMissingFieldException(seen1, 1, serializer.INSTANCE.getDescriptor());
        }
        super();
        if ((seen1 & 0x2) == 0x0) {
            this.bones = CollectionsKt.emptyList();
        }
        else {
            this.bones = bones;
        }
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/model/file/ModelFile$Geometry$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/model/file/ModelFile$Geometry;", "cosmetics" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final KSerializer<Geometry> serializer() {
            return (KSerializer<Geometry>)serializer.INSTANCE;
        }
        
        public Companion(final byte b) {
            this();
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014" }, d2 = { "gg/essential/model/file/ModelFile.Geometry.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/model/file/ModelFile$Geometry;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "cosmetics" })
    public static final class serializer implements GeneratedSerializer<Geometry>
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
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)Description.serializer.INSTANCE, (KSerializer)new ArrayListSerializer((KSerializer)Bone.serializer.INSTANCE) };
        }
        
        @NotNull
        public Geometry deserialize(@NotNull final Decoder decoder) {
            Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            int i = 1;
            int seen1 = 0;
            Object o = null;
            Object o2 = null;
            final CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
            if (beginStructure.decodeSequentially()) {
                o = beginStructure.decodeSerializableElement(descriptor, 0, (DeserializationStrategy)Description.serializer.INSTANCE, o);
                o2 = beginStructure.decodeSerializableElement(descriptor, 1, (DeserializationStrategy)new ArrayListSerializer((KSerializer)Bone.serializer.INSTANCE), o2);
                seen1 = 3;
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
                            o = beginStructure.decodeSerializableElement(descriptor, 0, (DeserializationStrategy)Description.serializer.INSTANCE, o);
                            seen1 |= 0x1;
                            continue;
                        }
                        case 1: {
                            o2 = beginStructure.decodeSerializableElement(descriptor, 1, (DeserializationStrategy)new ArrayListSerializer((KSerializer)Bone.serializer.INSTANCE), o2);
                            seen1 |= 0x2;
                            continue;
                        }
                        default: {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                    }
                }
            }
            beginStructure.endStructure(descriptor);
            return new Geometry(seen1, (Description)o, (List)o2);
        }
        
        public void serialize(@NotNull final Encoder encoder, @NotNull final Geometry value) {
            Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
            Intrinsics.checkNotNullParameter((Object)value, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
            Geometry.write$Self(value, beginStructure, descriptor);
            beginStructure.endStructure(descriptor);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object value) {
            this.serialize(encoder, (Geometry)value);
        }
        
        static {
            INSTANCE = new serializer();
            final PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("gg.essential.model.file.ModelFile.Geometry", (GeneratedSerializer)serializer.INSTANCE, 2);
            pluginGeneratedSerialDescriptor.addElement("description", false);
            pluginGeneratedSerialDescriptor.addElement("bones", true);
            descriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor;
        }
    }
}
