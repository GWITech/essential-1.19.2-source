package gg.essential.cosmetics.events;

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
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u00029:Bc\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010\u0012BY\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0000\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010&\u001a\u00020\tH\u00c6\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0000H\u00c6\u0003J\t\u0010(\u001a\u00020\fH\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J_\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00100\u001a\u00020\u0003H\u00d6\u0001J\t\u00101\u001a\u00020\tH\u00d6\u0001J!\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u000208H\u00c7\u0001R\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00008\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u0006;" }, d2 = { "Lgg/essential/cosmetics/events/AnimationEvent;", "", "seen1", "", "type", "Lgg/essential/cosmetics/events/AnimationEventType;", "target", "Lgg/essential/cosmetics/events/AnimationTarget;", "name", "", "onComplete", "probability", "", "skips", "loops", "priority", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILgg/essential/cosmetics/events/AnimationEventType;Lgg/essential/cosmetics/events/AnimationTarget;Ljava/lang/String;Lgg/essential/cosmetics/events/AnimationEvent;FIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Lgg/essential/cosmetics/events/AnimationEventType;Lgg/essential/cosmetics/events/AnimationTarget;Ljava/lang/String;Lgg/essential/cosmetics/events/AnimationEvent;FIII)V", "getLoops", "()I", "getName", "()Ljava/lang/String;", "getOnComplete$annotations", "()V", "getOnComplete", "()Lgg/essential/cosmetics/events/AnimationEvent;", "getPriority", "getProbability", "()F", "getSkips", "getTarget", "()Lgg/essential/cosmetics/events/AnimationTarget;", "getType", "()Lgg/essential/cosmetics/events/AnimationEventType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "cosmetics" })
public final class AnimationEvent
{
    @NotNull
    public static final Companion Companion;
    @Nullable
    private final AnimationEventType type;
    @Nullable
    private final AnimationTarget target;
    @NotNull
    private final String name;
    @Nullable
    private final AnimationEvent onComplete;
    private final float probability;
    private final int skips;
    private final int loops;
    private final int priority;
    
    @Nullable
    public final AnimationEventType getType() {
        return this.type;
    }
    
    @Nullable
    public final AnimationTarget getTarget() {
        return this.target;
    }
    
    @NotNull
    public final String getName() {
        return this.name;
    }
    
    @Nullable
    public final AnimationEvent getOnComplete() {
        return this.onComplete;
    }
    
    public final float getProbability() {
        return this.probability;
    }
    
    public final int getSkips() {
        return this.skips;
    }
    
    public final int getLoops() {
        return this.loops;
    }
    
    public final int getPriority() {
        return this.priority;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "AnimationEvent(type=" + this.type + ", target=" + this.target + ", name=" + this.name + ", onComplete=" + this.onComplete + ", probability=" + this.probability + ", skips=" + this.skips + ", loops=" + this.loops + ", priority=" + this.priority + ')';
    }
    
    @Override
    public int hashCode() {
        int result = (this.type == null) ? 0 : this.type.hashCode();
        result = result * 31 + ((this.target == null) ? 0 : this.target.hashCode());
        result = result * 31 + this.name.hashCode();
        result = result * 31 + ((this.onComplete == null) ? 0 : this.onComplete.hashCode());
        result = result * 31 + Float.hashCode(this.probability);
        result = result * 31 + Integer.hashCode(this.skips);
        result = result * 31 + Integer.hashCode(this.loops);
        result = result * 31 + Integer.hashCode(this.priority);
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimationEvent)) {
            return false;
        }
        final AnimationEvent animationEvent = (AnimationEvent)other;
        return this.type == animationEvent.type && this.target == animationEvent.target && Intrinsics.areEqual((Object)this.name, (Object)animationEvent.name) && Intrinsics.areEqual((Object)this.onComplete, (Object)animationEvent.onComplete) && Intrinsics.areEqual((Object)this.probability, (Object)animationEvent.probability) && this.skips == animationEvent.skips && this.loops == animationEvent.loops && this.priority == animationEvent.priority;
    }
    
    @JvmStatic
    public static final void write$Self(@NotNull final AnimationEvent self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter((Object)self, "self");
        Intrinsics.checkNotNullParameter((Object)output, "output");
        Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.type != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, (SerializationStrategy)new EnumSerializer("gg.essential.cosmetics.events.AnimationEventType", (Enum[])AnimationEventType.values()), (Object)self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.target != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, (SerializationStrategy)new EnumSerializer("gg.essential.cosmetics.events.AnimationTarget", (Enum[])AnimationTarget.values()), (Object)self.target);
        }
        output.encodeStringElement(serialDesc, 2, self.name);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.onComplete != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (SerializationStrategy)serializer.INSTANCE, (Object)self.onComplete);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !Intrinsics.areEqual((Object)self.probability, (Object)1.0f)) {
            output.encodeFloatElement(serialDesc, 4, self.probability);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.skips != 0) {
            output.encodeIntElement(serialDesc, 5, self.skips);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.loops != 0) {
            output.encodeIntElement(serialDesc, 6, self.loops);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.priority != 0) {
            output.encodeIntElement(serialDesc, 7, self.priority);
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @java.lang.Deprecated
    public AnimationEvent(final int seen1, final AnimationEventType type, final AnimationTarget target, final String name, @SerialName("on_complete") final AnimationEvent onComplete, final float probability, final int skips, final int loops, final int priority) {
        if (0x4 != (0x4 & seen1)) {
            PluginExceptionsKt.throwMissingFieldException(seen1, 4, serializer.INSTANCE.getDescriptor());
        }
        super();
        if ((seen1 & 0x1) == 0x0) {
            this.type = null;
        }
        else {
            this.type = type;
        }
        if ((seen1 & 0x2) == 0x0) {
            this.target = null;
        }
        else {
            this.target = target;
        }
        this.name = name;
        if ((seen1 & 0x8) == 0x0) {
            this.onComplete = null;
        }
        else {
            this.onComplete = onComplete;
        }
        if ((seen1 & 0x10) == 0x0) {
            this.probability = 1.0f;
        }
        else {
            this.probability = probability;
        }
        if ((seen1 & 0x20) == 0x0) {
            this.skips = 0;
        }
        else {
            this.skips = skips;
        }
        if ((seen1 & 0x40) == 0x0) {
            this.loops = 0;
        }
        else {
            this.loops = loops;
        }
        if ((seen1 & 0x80) == 0x0) {
            this.priority = 0;
        }
        else {
            this.priority = priority;
        }
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/cosmetics/events/AnimationEvent$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/cosmetics/events/AnimationEvent;", "cosmetics" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final KSerializer<AnimationEvent> serializer() {
            return (KSerializer<AnimationEvent>)serializer.INSTANCE;
        }
        
        public Companion(final byte b) {
            this();
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014" }, d2 = { "gg/essential/cosmetics/events/AnimationEvent.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/cosmetics/events/AnimationEvent;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "cosmetics" })
    public static final class serializer implements GeneratedSerializer<AnimationEvent>
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
            return (KSerializer<?>[])new KSerializer[] { BuiltinSerializersKt.getNullable((KSerializer)new EnumSerializer("gg.essential.cosmetics.events.AnimationEventType", (Enum[])AnimationEventType.values())), BuiltinSerializersKt.getNullable((KSerializer)new EnumSerializer("gg.essential.cosmetics.events.AnimationTarget", (Enum[])AnimationTarget.values())), (KSerializer)StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable((KSerializer)serializer.INSTANCE), (KSerializer)FloatSerializer.INSTANCE, (KSerializer)IntSerializer.INSTANCE, (KSerializer)IntSerializer.INSTANCE, (KSerializer)IntSerializer.INSTANCE };
        }
        
        @NotNull
        public AnimationEvent deserialize(@NotNull final Decoder decoder) {
            Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            int i = 1;
            int seen1 = 0;
            Object o = null;
            Object o2 = null;
            String name = null;
            Object o3 = null;
            float probability = 0.0f;
            int skips = 0;
            int loops = 0;
            int priority = 0;
            final CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
            if (beginStructure.decodeSequentially()) {
                o = beginStructure.decodeNullableSerializableElement(descriptor, 0, (DeserializationStrategy)new EnumSerializer("gg.essential.cosmetics.events.AnimationEventType", (Enum[])AnimationEventType.values()), o);
                o2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, (DeserializationStrategy)new EnumSerializer("gg.essential.cosmetics.events.AnimationTarget", (Enum[])AnimationTarget.values()), o2);
                name = beginStructure.decodeStringElement(descriptor, 2);
                o3 = beginStructure.decodeNullableSerializableElement(descriptor, 3, (DeserializationStrategy)serializer.INSTANCE, o3);
                probability = beginStructure.decodeFloatElement(descriptor, 4);
                skips = beginStructure.decodeIntElement(descriptor, 5);
                loops = beginStructure.decodeIntElement(descriptor, 6);
                priority = beginStructure.decodeIntElement(descriptor, 7);
                seen1 = 255;
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
                            o = beginStructure.decodeNullableSerializableElement(descriptor, 0, (DeserializationStrategy)new EnumSerializer("gg.essential.cosmetics.events.AnimationEventType", (Enum[])AnimationEventType.values()), o);
                            seen1 |= 0x1;
                            continue;
                        }
                        case 1: {
                            o2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, (DeserializationStrategy)new EnumSerializer("gg.essential.cosmetics.events.AnimationTarget", (Enum[])AnimationTarget.values()), o2);
                            seen1 |= 0x2;
                            continue;
                        }
                        case 2: {
                            name = beginStructure.decodeStringElement(descriptor, 2);
                            seen1 |= 0x4;
                            continue;
                        }
                        case 3: {
                            o3 = beginStructure.decodeNullableSerializableElement(descriptor, 3, (DeserializationStrategy)serializer.INSTANCE, o3);
                            seen1 |= 0x8;
                            continue;
                        }
                        case 4: {
                            probability = beginStructure.decodeFloatElement(descriptor, 4);
                            seen1 |= 0x10;
                            continue;
                        }
                        case 5: {
                            skips = beginStructure.decodeIntElement(descriptor, 5);
                            seen1 |= 0x20;
                            continue;
                        }
                        case 6: {
                            loops = beginStructure.decodeIntElement(descriptor, 6);
                            seen1 |= 0x40;
                            continue;
                        }
                        case 7: {
                            priority = beginStructure.decodeIntElement(descriptor, 7);
                            seen1 |= 0x80;
                            continue;
                        }
                        default: {
                            throw new UnknownFieldException(decodeElementIndex);
                        }
                    }
                }
            }
            beginStructure.endStructure(descriptor);
            return new AnimationEvent(seen1, (AnimationEventType)o, (AnimationTarget)o2, name, (AnimationEvent)o3, probability, skips, loops, priority);
        }
        
        public void serialize(@NotNull final Encoder encoder, @NotNull final AnimationEvent value) {
            Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
            Intrinsics.checkNotNullParameter((Object)value, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
            AnimationEvent.write$Self(value, beginStructure, descriptor);
            beginStructure.endStructure(descriptor);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object value) {
            this.serialize(encoder, (AnimationEvent)value);
        }
        
        static {
            INSTANCE = new serializer();
            final PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("gg.essential.cosmetics.events.AnimationEvent", (GeneratedSerializer)serializer.INSTANCE, 8);
            pluginGeneratedSerialDescriptor.addElement("type", true);
            pluginGeneratedSerialDescriptor.addElement("target", true);
            pluginGeneratedSerialDescriptor.addElement("name", false);
            pluginGeneratedSerialDescriptor.addElement("on_complete", true);
            pluginGeneratedSerialDescriptor.addElement("probability", true);
            pluginGeneratedSerialDescriptor.addElement("skips", true);
            pluginGeneratedSerialDescriptor.addElement("loops", true);
            pluginGeneratedSerialDescriptor.addElement("priority", true);
            descriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor;
        }
    }
}
