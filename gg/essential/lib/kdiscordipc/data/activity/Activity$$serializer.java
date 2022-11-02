package gg.essential.lib.kdiscordipc.data.activity;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlinx.serialization.descriptors.*;
import kotlinx.serialization.builtins.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.*;
import java.util.*;
import kotlinx.serialization.encoding.*;
import kotlinx.serialization.internal.*;

@Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014" }, d2 = { "gg/essential/lib/kdiscordipc/data/activity/Activity.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/lib/kdiscordipc/data/activity/Activity;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "KDiscordIPC" })
public static final class serializer implements GeneratedSerializer<Activity>
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
        return (KSerializer<?>[])new KSerializer[] { (KSerializer)StringSerializer.INSTANCE, (KSerializer)StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable((KSerializer)Activity.Timestamps.serializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer)Assets.serializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer)Activity.Party.serializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer)Activity.Secrets.serializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer)new ArrayListSerializer((KSerializer)Activity.Button.serializer.INSTANCE)), BuiltinSerializersKt.getNullable((KSerializer)BooleanSerializer.INSTANCE) };
    }
    
    @NotNull
    public Activity deserialize(@NotNull final Decoder decoder) {
        Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
        final SerialDescriptor descriptor = this.getDescriptor();
        int i = 1;
        int seen1 = 0;
        String details = null;
        String state = null;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Object o4 = null;
        Object o5 = null;
        Object o6 = null;
        final CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        if (beginStructure.decodeSequentially()) {
            details = beginStructure.decodeStringElement(descriptor, 0);
            state = beginStructure.decodeStringElement(descriptor, 1);
            o = beginStructure.decodeNullableSerializableElement(descriptor, 2, (DeserializationStrategy)Activity.Timestamps.serializer.INSTANCE, o);
            o2 = beginStructure.decodeNullableSerializableElement(descriptor, 3, (DeserializationStrategy)Assets.serializer.INSTANCE, o2);
            o3 = beginStructure.decodeNullableSerializableElement(descriptor, 4, (DeserializationStrategy)Activity.Party.serializer.INSTANCE, o3);
            o4 = beginStructure.decodeNullableSerializableElement(descriptor, 5, (DeserializationStrategy)Activity.Secrets.serializer.INSTANCE, o4);
            o5 = beginStructure.decodeNullableSerializableElement(descriptor, 6, (DeserializationStrategy)new ArrayListSerializer((KSerializer)Activity.Button.serializer.INSTANCE), o5);
            o6 = beginStructure.decodeNullableSerializableElement(descriptor, 7, (DeserializationStrategy)BooleanSerializer.INSTANCE, o6);
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
                        details = beginStructure.decodeStringElement(descriptor, 0);
                        seen1 |= 0x1;
                        continue;
                    }
                    case 1: {
                        state = beginStructure.decodeStringElement(descriptor, 1);
                        seen1 |= 0x2;
                        continue;
                    }
                    case 2: {
                        o = beginStructure.decodeNullableSerializableElement(descriptor, 2, (DeserializationStrategy)Activity.Timestamps.serializer.INSTANCE, o);
                        seen1 |= 0x4;
                        continue;
                    }
                    case 3: {
                        o2 = beginStructure.decodeNullableSerializableElement(descriptor, 3, (DeserializationStrategy)Assets.serializer.INSTANCE, o2);
                        seen1 |= 0x8;
                        continue;
                    }
                    case 4: {
                        o3 = beginStructure.decodeNullableSerializableElement(descriptor, 4, (DeserializationStrategy)Activity.Party.serializer.INSTANCE, o3);
                        seen1 |= 0x10;
                        continue;
                    }
                    case 5: {
                        o4 = beginStructure.decodeNullableSerializableElement(descriptor, 5, (DeserializationStrategy)Activity.Secrets.serializer.INSTANCE, o4);
                        seen1 |= 0x20;
                        continue;
                    }
                    case 6: {
                        o5 = beginStructure.decodeNullableSerializableElement(descriptor, 6, (DeserializationStrategy)new ArrayListSerializer((KSerializer)Activity.Button.serializer.INSTANCE), o5);
                        seen1 |= 0x40;
                        continue;
                    }
                    case 7: {
                        o6 = beginStructure.decodeNullableSerializableElement(descriptor, 7, (DeserializationStrategy)BooleanSerializer.INSTANCE, o6);
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
        return new Activity(seen1, details, state, (Activity$Timestamps)o, (Assets)o2, (Activity$Party)o3, (Activity$Secrets)o4, (List)o5, (Boolean)o6);
    }
    
    public void serialize(@NotNull final Encoder encoder, @NotNull final Activity value) {
        Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
        Intrinsics.checkNotNullParameter((Object)value, "value");
        final SerialDescriptor descriptor = this.getDescriptor();
        final CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        Activity.write$Self(value, beginStructure, descriptor);
        beginStructure.endStructure(descriptor);
    }
    
    public /* bridge */ Object deserialize(final Decoder decoder) {
        return this.deserialize(decoder);
    }
    
    public /* bridge */ void serialize(final Encoder encoder, final Object value) {
        this.serialize(encoder, (Activity)value);
    }
    
    static {
        INSTANCE = new serializer();
        final PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("gg.essential.lib.kdiscordipc.data.activity.Activity", (GeneratedSerializer)serializer.INSTANCE, 8);
        pluginGeneratedSerialDescriptor.addElement("details", false);
        pluginGeneratedSerialDescriptor.addElement("state", false);
        pluginGeneratedSerialDescriptor.addElement("timestamps", true);
        pluginGeneratedSerialDescriptor.addElement("assets", true);
        pluginGeneratedSerialDescriptor.addElement("party", true);
        pluginGeneratedSerialDescriptor.addElement("secrets", true);
        pluginGeneratedSerialDescriptor.addElement("buttons", true);
        pluginGeneratedSerialDescriptor.addElement("instance", true);
        descriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor;
    }
}
