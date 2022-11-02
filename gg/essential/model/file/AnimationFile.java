package gg.essential.model.file;

import java.util.*;
import gg.essential.cosmetics.events.*;
import kotlin.collections.*;
import org.jetbrains.annotations.*;
import kotlinx.serialization.descriptors.*;
import kotlin.jvm.*;
import kotlin.*;
import kotlin.jvm.functions.*;
import kotlinx.serialization.json.*;
import kotlinx.serialization.encoding.*;
import gg.essential.model.*;
import kotlinx.serialization.internal.*;
import kotlinx.serialization.builtins.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.*;
import kotlinx.serialization.modules.*;

@Serializable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0004\"#$%B?\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB+\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u00c6\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0003J/\u0010\u0015\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0006H\u00d6\u0001J!\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u00c7\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006&" }, d2 = { "Lgg/essential/model/file/AnimationFile;", "", "seen1", "", "animations", "", "", "Lgg/essential/model/file/AnimationFile$Animation;", "triggers", "", "Lgg/essential/cosmetics/events/AnimationEvent;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/Map;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/util/Map;Ljava/util/List;)V", "getAnimations", "()Ljava/util/Map;", "getTriggers", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Animation", "Companion", "Loop", "cosmetics" })
public final class AnimationFile
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final Map<String, Animation> animations;
    @NotNull
    private final List<AnimationEvent> triggers;
    @NotNull
    private static final Json json;
    
    public AnimationFile(@NotNull final Map<String, Animation> animations, @NotNull final List<AnimationEvent> triggers) {
        Intrinsics.checkNotNullParameter((Object)animations, "animations");
        Intrinsics.checkNotNullParameter((Object)triggers, "triggers");
        super();
        this.animations = animations;
        this.triggers = triggers;
    }
    
    public AnimationFile(final byte b) {
        this(MapsKt.emptyMap(), CollectionsKt.emptyList());
    }
    
    @NotNull
    public final Map<String, Animation> getAnimations() {
        return this.animations;
    }
    
    @NotNull
    public final List<AnimationEvent> getTriggers() {
        return this.triggers;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "AnimationFile(animations=" + this.animations + ", triggers=" + this.triggers + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.animations.hashCode();
        result = result * 31 + this.triggers.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimationFile)) {
            return false;
        }
        final AnimationFile animationFile = (AnimationFile)other;
        return Intrinsics.areEqual((Object)this.animations, (Object)animationFile.animations) && Intrinsics.areEqual((Object)this.triggers, (Object)animationFile.triggers);
    }
    
    @JvmStatic
    public static final void write$Self(@NotNull final AnimationFile self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter((Object)self, "self");
        Intrinsics.checkNotNullParameter((Object)output, "output");
        Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual((Object)self.animations, (Object)MapsKt.emptyMap())) {
            output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy)new LinkedHashMapSerializer((KSerializer)StringSerializer.INSTANCE, (KSerializer)Animation.serializer.INSTANCE), (Object)self.animations);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !Intrinsics.areEqual((Object)self.triggers, (Object)CollectionsKt.emptyList())) {
            output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy)new ArrayListSerializer((KSerializer)AnimationEvent.serializer.INSTANCE), (Object)self.triggers);
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @java.lang.Deprecated
    public AnimationFile(final int seen1, final Map animations, final List triggers) {
        if ((0x0 & seen1) != 0x0) {
            PluginExceptionsKt.throwMissingFieldException(seen1, 0, serializer.INSTANCE.getDescriptor());
        }
        super();
        if ((seen1 & 0x1) == 0x0) {
            this.animations = MapsKt.emptyMap();
        }
        else {
            this.animations = animations;
        }
        if ((seen1 & 0x2) == 0x0) {
            this.triggers = CollectionsKt.emptyList();
        }
        else {
            this.triggers = triggers;
        }
    }
    
    public AnimationFile() {
        this((byte)0);
    }
    
    public static final /* synthetic */ Json access$getJson$cp() {
        return AnimationFile.json;
    }
    
    static {
        Companion = new Companion((byte)0);
        json = JsonKt.Json$default((Json)null, (Function1)AnimationFile$Companion$json.AnimationFile$Companion$json$1.INSTANCE, 1, (Object)null);
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014" }, d2 = { "gg/essential/model/file/AnimationFile.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/model/file/AnimationFile;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "cosmetics" })
    public static final class serializer implements GeneratedSerializer<AnimationFile>
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
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)new LinkedHashMapSerializer((KSerializer)StringSerializer.INSTANCE, (KSerializer)Animation.serializer.INSTANCE), (KSerializer)new ArrayListSerializer((KSerializer)AnimationEvent.serializer.INSTANCE) };
        }
        
        @NotNull
        public AnimationFile deserialize(@NotNull final Decoder decoder) {
            Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            int i = 1;
            int seen1 = 0;
            Object o = null;
            Object o2 = null;
            final CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
            if (beginStructure.decodeSequentially()) {
                o = beginStructure.decodeSerializableElement(descriptor, 0, (DeserializationStrategy)new LinkedHashMapSerializer((KSerializer)StringSerializer.INSTANCE, (KSerializer)Animation.serializer.INSTANCE), o);
                o2 = beginStructure.decodeSerializableElement(descriptor, 1, (DeserializationStrategy)new ArrayListSerializer((KSerializer)AnimationEvent.serializer.INSTANCE), o2);
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
                            o = beginStructure.decodeSerializableElement(descriptor, 0, (DeserializationStrategy)new LinkedHashMapSerializer((KSerializer)StringSerializer.INSTANCE, (KSerializer)Animation.serializer.INSTANCE), o);
                            seen1 |= 0x1;
                            continue;
                        }
                        case 1: {
                            o2 = beginStructure.decodeSerializableElement(descriptor, 1, (DeserializationStrategy)new ArrayListSerializer((KSerializer)AnimationEvent.serializer.INSTANCE), o2);
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
            return new AnimationFile(seen1, (Map)o, (List)o2);
        }
        
        public void serialize(@NotNull final Encoder encoder, @NotNull final AnimationFile value) {
            Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
            Intrinsics.checkNotNullParameter((Object)value, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
            AnimationFile.write$Self(value, beginStructure, descriptor);
            beginStructure.endStructure(descriptor);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object value) {
            this.serialize(encoder, (AnimationFile)value);
        }
        
        static {
            INSTANCE = new serializer();
            final PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("gg.essential.model.file.AnimationFile", (GeneratedSerializer)serializer.INSTANCE, 2);
            pluginGeneratedSerialDescriptor.addElement("animations", true);
            pluginGeneratedSerialDescriptor.addElement("triggers", true);
            descriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor;
        }
    }
    
    @Serializable
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 +2\u00020\u0001:\u0002*+BE\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eB1\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\u0010\u000fJ\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003¢\u0006\u0002\u0010\u0013J\u0015\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u00c6\u0003J:\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u00c6\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\"\u001a\u00020\nH\u00d6\u0001J!\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u00c7\u0001R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0014\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018¨\u0006," }, d2 = { "Lgg/essential/model/file/AnimationFile$Animation;", "", "seen1", "", "loop", "Lgg/essential/model/file/AnimationFile$Loop;", "animationLength", "", "bones", "", "", "Lgg/essential/model/Channels;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILgg/essential/model/file/AnimationFile$Loop;Ljava/lang/Float;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lgg/essential/model/file/AnimationFile$Loop;Ljava/lang/Float;Ljava/util/Map;)V", "getAnimationLength$annotations", "()V", "getAnimationLength", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getBones", "()Ljava/util/Map;", "getLoop", "()Lgg/essential/model/file/AnimationFile$Loop;", "component1", "component2", "component3", "copy", "(Lgg/essential/model/file/AnimationFile$Loop;Ljava/lang/Float;Ljava/util/Map;)Lgg/essential/model/file/AnimationFile$Animation;", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "cosmetics" })
    public static final class Animation
    {
        @NotNull
        public static final Companion Companion;
        @NotNull
        private final Loop loop;
        @Nullable
        private final Float animationLength;
        @NotNull
        private final Map<String, Channels> bones;
        
        public Animation(@NotNull final Loop loop, @Nullable final Float animationLength, @NotNull final Map<String, Channels> bones) {
            Intrinsics.checkNotNullParameter((Object)loop, "loop");
            Intrinsics.checkNotNullParameter((Object)bones, "bones");
            super();
            this.loop = loop;
            this.animationLength = animationLength;
            this.bones = bones;
        }
        
        public Animation(final byte b) {
            this(Loop.False, null, MapsKt.emptyMap());
        }
        
        @NotNull
        public final Loop getLoop() {
            return this.loop;
        }
        
        @Nullable
        public final Float getAnimationLength() {
            return this.animationLength;
        }
        
        @NotNull
        public final Map<String, Channels> getBones() {
            return this.bones;
        }
        
        @NotNull
        @Override
        public String toString() {
            return "Animation(loop=" + this.loop + ", animationLength=" + this.animationLength + ", bones=" + this.bones + ')';
        }
        
        @Override
        public int hashCode() {
            int result = this.loop.hashCode();
            result = result * 31 + ((this.animationLength == null) ? 0 : this.animationLength.hashCode());
            result = result * 31 + this.bones.hashCode();
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Animation)) {
                return false;
            }
            final Animation animation = (Animation)other;
            return this.loop == animation.loop && Intrinsics.areEqual((Object)this.animationLength, (Object)animation.animationLength) && Intrinsics.areEqual((Object)this.bones, (Object)animation.bones);
        }
        
        @JvmStatic
        public static final void write$Self(@NotNull final Animation self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter((Object)self, "self");
            Intrinsics.checkNotNullParameter((Object)output, "output");
            Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.loop != Loop.False) {
                output.encodeSerializableElement(serialDesc, 0, (SerializationStrategy)Loop.Companion.serializer(), (Object)self.loop);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.animationLength != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, (SerializationStrategy)FloatSerializer.INSTANCE, (Object)self.animationLength);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || !Intrinsics.areEqual((Object)self.bones, (Object)MapsKt.emptyMap())) {
                output.encodeSerializableElement(serialDesc, 2, (SerializationStrategy)new LinkedHashMapSerializer((KSerializer)StringSerializer.INSTANCE, (KSerializer)Channels.serializer.INSTANCE), (Object)self.bones);
            }
        }
        
        @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
        @java.lang.Deprecated
        public Animation(final int seen1, final Loop loop, @SerialName("animation_length") final Float animationLength, final Map bones) {
            if ((0x0 & seen1) != 0x0) {
                PluginExceptionsKt.throwMissingFieldException(seen1, 0, serializer.INSTANCE.getDescriptor());
            }
            super();
            if ((seen1 & 0x1) == 0x0) {
                this.loop = Loop.False;
            }
            else {
                this.loop = loop;
            }
            if ((seen1 & 0x2) == 0x0) {
                this.animationLength = null;
            }
            else {
                this.animationLength = animationLength;
            }
            if ((seen1 & 0x4) == 0x0) {
                this.bones = MapsKt.emptyMap();
            }
            else {
                this.bones = bones;
            }
        }
        
        public Animation() {
            this((byte)0);
        }
        
        static {
            Companion = new Companion((byte)0);
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/model/file/AnimationFile$Animation$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/model/file/AnimationFile$Animation;", "cosmetics" })
        public static final class Companion
        {
            private Companion() {
                super();
            }
            
            @NotNull
            public final KSerializer<Animation> serializer() {
                return (KSerializer<Animation>)serializer.INSTANCE;
            }
            
            public Companion(final byte b) {
                this();
            }
        }
        
        @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014" }, d2 = { "gg/essential/model/file/AnimationFile.Animation.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/model/file/AnimationFile$Animation;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "cosmetics" })
        public static final class serializer implements GeneratedSerializer<Animation>
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
                return (KSerializer<?>[])new KSerializer[] { Loop.Companion.serializer(), BuiltinSerializersKt.getNullable((KSerializer)FloatSerializer.INSTANCE), (KSerializer)new LinkedHashMapSerializer((KSerializer)StringSerializer.INSTANCE, (KSerializer)Channels.serializer.INSTANCE) };
            }
            
            @NotNull
            public Animation deserialize(@NotNull final Decoder decoder) {
                Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
                final SerialDescriptor descriptor = this.getDescriptor();
                int i = 1;
                int seen1 = 0;
                Object o = null;
                Object o2 = null;
                Object o3 = null;
                final CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
                if (beginStructure.decodeSequentially()) {
                    o = beginStructure.decodeSerializableElement(descriptor, 0, (DeserializationStrategy)Loop.Companion.serializer(), o);
                    o2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, (DeserializationStrategy)FloatSerializer.INSTANCE, o2);
                    o3 = beginStructure.decodeSerializableElement(descriptor, 2, (DeserializationStrategy)new LinkedHashMapSerializer((KSerializer)StringSerializer.INSTANCE, (KSerializer)Channels.serializer.INSTANCE), o3);
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
                                o = beginStructure.decodeSerializableElement(descriptor, 0, (DeserializationStrategy)Loop.Companion.serializer(), o);
                                seen1 |= 0x1;
                                continue;
                            }
                            case 1: {
                                o2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, (DeserializationStrategy)FloatSerializer.INSTANCE, o2);
                                seen1 |= 0x2;
                                continue;
                            }
                            case 2: {
                                o3 = beginStructure.decodeSerializableElement(descriptor, 2, (DeserializationStrategy)new LinkedHashMapSerializer((KSerializer)StringSerializer.INSTANCE, (KSerializer)Channels.serializer.INSTANCE), o3);
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
                return new Animation(seen1, (Loop)o, (Float)o2, (Map)o3);
            }
            
            public void serialize(@NotNull final Encoder encoder, @NotNull final Animation value) {
                Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
                Intrinsics.checkNotNullParameter((Object)value, "value");
                final SerialDescriptor descriptor = this.getDescriptor();
                final CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
                Animation.write$Self(value, beginStructure, descriptor);
                beginStructure.endStructure(descriptor);
            }
            
            public /* bridge */ Object deserialize(final Decoder decoder) {
                return this.deserialize(decoder);
            }
            
            public /* bridge */ void serialize(final Encoder encoder, final Object value) {
                this.serialize(encoder, (Animation)value);
            }
            
            static {
                INSTANCE = new serializer();
                final PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("gg.essential.model.file.AnimationFile.Animation", (GeneratedSerializer)serializer.INSTANCE, 3);
                pluginGeneratedSerialDescriptor.addElement("loop", true);
                pluginGeneratedSerialDescriptor.addElement("animation_length", true);
                pluginGeneratedSerialDescriptor.addElement("bones", true);
                descriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor;
            }
        }
    }
    
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
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u00c6\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b" }, d2 = { "Lgg/essential/model/file/AnimationFile$Companion;", "", "()V", "json", "Lkotlinx/serialization/json/Json;", "parse", "Lgg/essential/model/file/AnimationFile;", "str", "", "serializer", "Lkotlinx/serialization/KSerializer;", "cosmetics" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @JvmStatic
        @NotNull
        public final AnimationFile parse(@NotNull final String str) {
            Intrinsics.checkNotNullParameter((Object)str, "str");
            final StringFormat stringFormat;
            final StringFormat $this$decodeFromString$iv = stringFormat = (StringFormat)AnimationFile.access$getJson$cp();
            final SerializersModule $this$serializer$iv$iv = $this$decodeFromString$iv.getSerializersModule();
            final KSerializer $this$cast$iv$iv$iv = SerializersKt.serializer($this$serializer$iv$iv, Reflection.typeOf((Class)AnimationFile.class));
            return (AnimationFile)stringFormat.decodeFromString((DeserializationStrategy)$this$cast$iv$iv$iv, str);
        }
        
        @NotNull
        public final KSerializer<AnimationFile> serializer() {
            return (KSerializer<AnimationFile>)serializer.INSTANCE;
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
