package gg.essential.model.file;

import java.util.*;
import kotlin.collections.*;
import org.jetbrains.annotations.*;
import kotlinx.serialization.descriptors.*;
import kotlin.jvm.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import kotlinx.serialization.json.*;
import kotlinx.serialization.encoding.*;
import gg.essential.model.*;
import kotlinx.serialization.builtins.*;
import kotlinx.serialization.internal.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.*;
import kotlinx.serialization.modules.*;

@Serializable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u0000  2\u00020\u0001:\b\u001e\u001f !\"#$%B+\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\u0019\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J!\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u00c7\u0001R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006&" }, d2 = { "Lgg/essential/model/file/ModelFile;", "", "seen1", "", "geometries", "", "Lgg/essential/model/file/ModelFile$Geometry;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/List;)V", "getGeometries$annotations", "()V", "getGeometries", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Bone", "Companion", "Cube", "Description", "Geometry", "UvFace", "Uvs", "cosmetics" })
public final class ModelFile
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final List<Geometry> geometries;
    @NotNull
    private static final Json json;
    
    public ModelFile(@NotNull final List<Geometry> geometries) {
        Intrinsics.checkNotNullParameter((Object)geometries, "geometries");
        super();
        this.geometries = geometries;
    }
    
    public ModelFile(final byte b) {
        this(CollectionsKt.emptyList());
    }
    
    @NotNull
    public final List<Geometry> getGeometries() {
        return this.geometries;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "ModelFile(geometries=" + this.geometries + ')';
    }
    
    @Override
    public int hashCode() {
        return this.geometries.hashCode();
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        return this == other || (other instanceof ModelFile && Intrinsics.areEqual((Object)this.geometries, (Object)((ModelFile)other).geometries));
    }
    
    @JvmStatic
    public static final void write$Self(@NotNull final ModelFile self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter((Object)self, "self");
        Intrinsics.checkNotNullParameter((Object)output, "output");
        Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual((Object)self.geometries, (Object)CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy)new ArrayListSerializer((KSerializer)Geometry.serializer.INSTANCE), (Object)self.geometries);
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @java.lang.Deprecated
    public ModelFile(final int seen1, @SerialName("minecraft:geometry") final List geometries) {
        if ((0x0 & seen1) != 0x0) {
            PluginExceptionsKt.throwMissingFieldException(seen1, 0, serializer.INSTANCE.getDescriptor());
        }
        super();
        if ((seen1 & 0x1) == 0x0) {
            this.geometries = CollectionsKt.emptyList();
        }
        else {
            this.geometries = geometries;
        }
    }
    
    public ModelFile() {
        this((byte)0);
    }
    
    public static final /* synthetic */ Json access$getJson$cp() {
        return ModelFile.json;
    }
    
    static {
        Companion = new Companion((byte)0);
        json = JsonKt.Json$default((Json)null, (Function1)ModelFile$Companion$json.ModelFile$Companion$json$1.INSTANCE, 1, (Object)null);
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014" }, d2 = { "gg/essential/model/file/ModelFile.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/model/file/ModelFile;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "cosmetics" })
    public static final class serializer implements GeneratedSerializer<ModelFile>
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
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)new ArrayListSerializer((KSerializer)Geometry.serializer.INSTANCE) };
        }
        
        @NotNull
        public ModelFile deserialize(@NotNull final Decoder decoder) {
            Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            int i = 1;
            int seen1 = 0;
            Object o = null;
            final CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
            if (beginStructure.decodeSequentially()) {
                o = beginStructure.decodeSerializableElement(descriptor, 0, (DeserializationStrategy)new ArrayListSerializer((KSerializer)Geometry.serializer.INSTANCE), o);
                seen1 = 1;
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
                            o = beginStructure.decodeSerializableElement(descriptor, 0, (DeserializationStrategy)new ArrayListSerializer((KSerializer)Geometry.serializer.INSTANCE), o);
                            seen1 |= 0x1;
                            continue;
                        }
                        default: {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                    }
                }
            }
            beginStructure.endStructure(descriptor);
            return new ModelFile(seen1, (List)o);
        }
        
        public void serialize(@NotNull final Encoder encoder, @NotNull final ModelFile value) {
            Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
            Intrinsics.checkNotNullParameter((Object)value, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
            ModelFile.write$Self(value, beginStructure, descriptor);
            beginStructure.endStructure(descriptor);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object value) {
            this.serialize(encoder, (ModelFile)value);
        }
        
        static {
            INSTANCE = new serializer();
            final PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("gg.essential.model.file.ModelFile", (GeneratedSerializer)serializer.INSTANCE, 1);
            pluginGeneratedSerialDescriptor.addElement("minecraft:geometry", true);
            descriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor;
        }
    }
    
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
    
    @Serializable
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%B7\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u0005H\u00d6\u0001J!\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u00c7\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006&" }, d2 = { "Lgg/essential/model/file/ModelFile$Description;", "", "seen1", "", "identifier", "", "textureWidth", "textureHeight", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;II)V", "getIdentifier", "()Ljava/lang/String;", "getTextureHeight$annotations", "()V", "getTextureHeight", "()I", "getTextureWidth$annotations", "getTextureWidth", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "cosmetics" })
    public static final class Description
    {
        @NotNull
        public static final Companion Companion;
        @NotNull
        private final String identifier = identifier;
        private final int textureWidth = textureWidth;
        private final int textureHeight = textureHeight;
        
        public final int getTextureHeight() {
            return this.textureHeight;
        }
        
        @NotNull
        @Override
        public String toString() {
            return "Description(identifier=" + this.identifier + ", textureWidth=" + this.textureWidth + ", textureHeight=" + this.textureHeight + ')';
        }
        
        @Override
        public int hashCode() {
            int result = this.identifier.hashCode();
            result = result * 31 + Integer.hashCode(this.textureWidth);
            result = result * 31 + Integer.hashCode(this.textureHeight);
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Description)) {
                return false;
            }
            final Description description = (Description)other;
            return Intrinsics.areEqual((Object)this.identifier, (Object)description.identifier) && this.textureWidth == description.textureWidth && this.textureHeight == description.textureHeight;
        }
        
        @JvmStatic
        public static final void write$Self(@NotNull final Description self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter((Object)self, "self");
            Intrinsics.checkNotNullParameter((Object)output, "output");
            Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
            output.encodeStringElement(serialDesc, 0, self.identifier);
            output.encodeIntElement(serialDesc, 1, self.textureWidth);
            output.encodeIntElement(serialDesc, 2, self.textureHeight);
        }
        
        @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
        @java.lang.Deprecated
        public Description(final int seen1, final String identifier, @SerialName("texture_width") final int textureWidth, @SerialName("texture_height") final int textureHeight) {
            if (0x7 != (0x7 & seen1)) {
                PluginExceptionsKt.throwMissingFieldException(seen1, 7, serializer.INSTANCE.getDescriptor());
            }
            super();
        }
        
        static {
            Companion = new Companion((byte)0);
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/model/file/ModelFile$Description$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/model/file/ModelFile$Description;", "cosmetics" })
        public static final class Companion
        {
            private Companion() {
                super();
            }
            
            @NotNull
            public final KSerializer<Description> serializer() {
                return (KSerializer<Description>)serializer.INSTANCE;
            }
            
            public Companion(final byte b) {
                this();
            }
        }
        
        @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014" }, d2 = { "gg/essential/model/file/ModelFile.Description.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/model/file/ModelFile$Description;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "cosmetics" })
        public static final class serializer implements GeneratedSerializer<Description>
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
                return (KSerializer<?>[])new KSerializer[] { (KSerializer)StringSerializer.INSTANCE, (KSerializer)IntSerializer.INSTANCE, (KSerializer)IntSerializer.INSTANCE };
            }
            
            @NotNull
            public Description deserialize(@NotNull final Decoder decoder) {
                Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
                final SerialDescriptor descriptor = this.getDescriptor();
                int i = 1;
                int seen1 = 0;
                String identifier = null;
                int textureWidth = 0;
                int textureHeight = 0;
                final CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
                if (beginStructure.decodeSequentially()) {
                    identifier = beginStructure.decodeStringElement(descriptor, 0);
                    textureWidth = beginStructure.decodeIntElement(descriptor, 1);
                    textureHeight = beginStructure.decodeIntElement(descriptor, 2);
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
                                identifier = beginStructure.decodeStringElement(descriptor, 0);
                                seen1 |= 0x1;
                                continue;
                            }
                            case 1: {
                                textureWidth = beginStructure.decodeIntElement(descriptor, 1);
                                seen1 |= 0x2;
                                continue;
                            }
                            case 2: {
                                textureHeight = beginStructure.decodeIntElement(descriptor, 2);
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
                return new Description(seen1, identifier, textureWidth, textureHeight);
            }
            
            public void serialize(@NotNull final Encoder encoder, @NotNull final Description value) {
                Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
                Intrinsics.checkNotNullParameter((Object)value, "value");
                final SerialDescriptor descriptor = this.getDescriptor();
                final CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
                Description.write$Self(value, beginStructure, descriptor);
                beginStructure.endStructure(descriptor);
            }
            
            public /* bridge */ Object deserialize(final Decoder decoder) {
                return this.deserialize(decoder);
            }
            
            public /* bridge */ void serialize(final Encoder encoder, final Object value) {
                this.serialize(encoder, (Description)value);
            }
            
            static {
                INSTANCE = new serializer();
                final PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("gg.essential.model.file.ModelFile.Description", (GeneratedSerializer)serializer.INSTANCE, 3);
                pluginGeneratedSerialDescriptor.addElement("identifier", false);
                pluginGeneratedSerialDescriptor.addElement("texture_width", false);
                pluginGeneratedSerialDescriptor.addElement("texture_height", false);
                descriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor;
            }
        }
    }
    
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
    
    @Serializable(with = UvsSerializer.class)
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0003\u0003\u0004\u0005B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0006\u0007¨\u0006\b" }, d2 = { "Lgg/essential/model/file/ModelFile$Uvs;", "", "()V", "Box", "Companion", "PerFace", "Lgg/essential/model/file/ModelFile$Uvs$Box;", "Lgg/essential/model/file/ModelFile$Uvs$PerFace;", "cosmetics" })
    public abstract static class Uvs
    {
        @NotNull
        public static final Companion Companion;
        
        private Uvs() {
            super();
        }
        
        public Uvs(final byte b) {
            this();
        }
        
        static {
            Companion = new Companion((byte)0);
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/model/file/ModelFile$Uvs$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/model/file/ModelFile$Uvs;", "cosmetics" })
        public static final class Companion
        {
            private Companion() {
                super();
            }
            
            @NotNull
            public final KSerializer<Uvs> serializer() {
                return (KSerializer<Uvs>)new UvsSerializer();
            }
            
            public Companion(final byte b) {
                this();
            }
        }
        
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
    }
    
    @Serializable
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0002\u0017\u0018B/\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0015\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ!\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u00c7\u0001R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0019" }, d2 = { "Lgg/essential/model/file/ModelFile$UvFace;", "", "seen1", "", "uv", "", "size", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(I[F[FLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "([F[F)V", "getSize$annotations", "()V", "getSize", "()[F", "getUv", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "cosmetics" })
    public static final class UvFace
    {
        @NotNull
        public static final Companion Companion;
        @NotNull
        private final float[] uv = uv;
        @NotNull
        private final float[] size = size;
        
        @NotNull
        public final float[] getUv() {
            return this.uv;
        }
        
        @NotNull
        public final float[] getSize() {
            return this.size;
        }
        
        @JvmStatic
        public static final void write$Self(@NotNull final UvFace self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter((Object)self, "self");
            Intrinsics.checkNotNullParameter((Object)output, "output");
            Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
            output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy)FloatArraySerializer.INSTANCE, (Object)self.uv);
            output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy)FloatArraySerializer.INSTANCE, (Object)self.size);
        }
        
        @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
        @java.lang.Deprecated
        public UvFace(final int seen1, final float[] uv, @SerialName("uv_size") final float[] size) {
            if (0x3 != (0x3 & seen1)) {
                PluginExceptionsKt.throwMissingFieldException(seen1, 3, serializer.INSTANCE.getDescriptor());
            }
            super();
        }
        
        static {
            Companion = new Companion((byte)0);
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/model/file/ModelFile$UvFace$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/model/file/ModelFile$UvFace;", "cosmetics" })
        public static final class Companion
        {
            private Companion() {
                super();
            }
            
            @NotNull
            public final KSerializer<UvFace> serializer() {
                return (KSerializer<UvFace>)serializer.INSTANCE;
            }
            
            public Companion(final byte b) {
                this();
            }
        }
        
        @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014" }, d2 = { "gg/essential/model/file/ModelFile.UvFace.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/model/file/ModelFile$UvFace;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "cosmetics" })
        public static final class serializer implements GeneratedSerializer<UvFace>
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
                return (KSerializer<?>[])new KSerializer[] { (KSerializer)FloatArraySerializer.INSTANCE, (KSerializer)FloatArraySerializer.INSTANCE };
            }
            
            @NotNull
            public UvFace deserialize(@NotNull final Decoder decoder) {
                Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
                final SerialDescriptor descriptor = this.getDescriptor();
                int i = 1;
                int seen1 = 0;
                Object o = null;
                Object o2 = null;
                final CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
                if (beginStructure.decodeSequentially()) {
                    o = beginStructure.decodeSerializableElement(descriptor, 0, (DeserializationStrategy)FloatArraySerializer.INSTANCE, o);
                    o2 = beginStructure.decodeSerializableElement(descriptor, 1, (DeserializationStrategy)FloatArraySerializer.INSTANCE, o2);
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
                                o = beginStructure.decodeSerializableElement(descriptor, 0, (DeserializationStrategy)FloatArraySerializer.INSTANCE, o);
                                seen1 |= 0x1;
                                continue;
                            }
                            case 1: {
                                o2 = beginStructure.decodeSerializableElement(descriptor, 1, (DeserializationStrategy)FloatArraySerializer.INSTANCE, o2);
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
                return new UvFace(seen1, (float[])o, (float[])o2);
            }
            
            public void serialize(@NotNull final Encoder encoder, @NotNull final UvFace value) {
                Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
                Intrinsics.checkNotNullParameter((Object)value, "value");
                final SerialDescriptor descriptor = this.getDescriptor();
                final CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
                UvFace.write$Self(value, beginStructure, descriptor);
                beginStructure.endStructure(descriptor);
            }
            
            public /* bridge */ Object deserialize(final Decoder decoder) {
                return this.deserialize(decoder);
            }
            
            public /* bridge */ void serialize(final Encoder encoder, final Object value) {
                this.serialize(encoder, (UvFace)value);
            }
            
            static {
                INSTANCE = new serializer();
                final PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("gg.essential.model.file.ModelFile.UvFace", (GeneratedSerializer)serializer.INSTANCE, 2);
                pluginGeneratedSerialDescriptor.addElement("uv", false);
                pluginGeneratedSerialDescriptor.addElement("uv_size", false);
                descriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor;
            }
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u00c6\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b" }, d2 = { "Lgg/essential/model/file/ModelFile$Companion;", "", "()V", "json", "Lkotlinx/serialization/json/Json;", "parse", "Lgg/essential/model/file/ModelFile;", "str", "", "serializer", "Lkotlinx/serialization/KSerializer;", "cosmetics" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @JvmStatic
        @NotNull
        public final ModelFile parse(@NotNull final String str) {
            Intrinsics.checkNotNullParameter((Object)str, "str");
            final StringFormat stringFormat;
            final StringFormat $this$decodeFromString$iv = stringFormat = (StringFormat)ModelFile.access$getJson$cp();
            final SerializersModule $this$serializer$iv$iv = $this$decodeFromString$iv.getSerializersModule();
            final KSerializer $this$cast$iv$iv$iv = SerializersKt.serializer($this$serializer$iv$iv, Reflection.typeOf((Class)ModelFile.class));
            return (ModelFile)stringFormat.decodeFromString((DeserializationStrategy)$this$cast$iv$iv$iv, str);
        }
        
        @NotNull
        public final KSerializer<ModelFile> serializer() {
            return (KSerializer<ModelFile>)serializer.INSTANCE;
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
