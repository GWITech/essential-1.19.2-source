package gg.essential.lib.kdiscordipc.core.event.data;

import org.jetbrains.annotations.*;
import gg.essential.lib.kdiscordipc.data.user.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.descriptors.*;
import kotlin.jvm.*;
import kotlin.*;
import kotlinx.serialization.builtins.*;
import kotlinx.serialization.*;
import kotlinx.serialization.encoding.*;
import kotlinx.serialization.internal.*;

@Serializable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0003)*+B9\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB!\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u0017\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\bH\u00c6\u0003J.\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001J!\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00002\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(H\u00c7\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u0015\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006," }, d2 = { "Lgg/essential/lib/kdiscordipc/core/event/data/ReadyEventData;", "Lgg/essential/lib/kdiscordipc/core/event/data/EventData;", "seen1", "", "version", "config", "Lgg/essential/lib/kdiscordipc/core/event/data/ReadyEventData$Configuration;", "user", "Lgg/essential/lib/kdiscordipc/data/user/User;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/Integer;Ldev/cbyrne/kdiscordipc/core/event/data/ReadyEventData$Configuration;Ldev/cbyrne/kdiscordipc/data/user/User;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/Integer;Ldev/cbyrne/kdiscordipc/core/event/data/ReadyEventData$Configuration;Ldev/cbyrne/kdiscordipc/data/user/User;)V", "getConfig", "()Ldev/cbyrne/kdiscordipc/core/event/data/ReadyEventData$Configuration;", "getUser", "()Ldev/cbyrne/kdiscordipc/data/user/User;", "getVersion$annotations", "()V", "getVersion", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ldev/cbyrne/kdiscordipc/core/event/data/ReadyEventData$Configuration;Ldev/cbyrne/kdiscordipc/data/user/User;)Ldev/cbyrne/kdiscordipc/core/event/data/ReadyEventData;", "equals", "", "other", "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Configuration", "KDiscordIPC" })
public final class ReadyEventData extends EventData
{
    @NotNull
    public static final Companion Companion;
    @Nullable
    private final Integer version;
    @NotNull
    private final Configuration config;
    @NotNull
    private final User user;
    
    @NotNull
    public final User getUser() {
        return this.user;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "ReadyEventData(version=" + this.version + ", config=" + this.config + ", user=" + this.user + ')';
    }
    
    @Override
    public int hashCode() {
        int result = (this.version == null) ? 0 : this.version.hashCode();
        result = result * 31 + this.config.hashCode();
        result = result * 31 + this.user.hashCode();
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadyEventData)) {
            return false;
        }
        final ReadyEventData readyEventData = (ReadyEventData)other;
        return Intrinsics.areEqual((Object)this.version, (Object)readyEventData.version) && Intrinsics.areEqual((Object)this.config, (Object)readyEventData.config) && Intrinsics.areEqual((Object)this.user, (Object)readyEventData.user);
    }
    
    @JvmStatic
    public static final void write$Self(@NotNull final ReadyEventData self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter((Object)self, "self");
        Intrinsics.checkNotNullParameter((Object)output, "output");
        Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
        EventData.write$Self(self, output, serialDesc);
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.version != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, (SerializationStrategy)IntSerializer.INSTANCE, (Object)self.version);
        }
        output.encodeSerializableElement(serialDesc, 1, (SerializationStrategy)Configuration.serializer.INSTANCE, (Object)self.config);
        output.encodeSerializableElement(serialDesc, 2, (SerializationStrategy)User.serializer.INSTANCE, (Object)self.user);
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @java.lang.Deprecated
    public ReadyEventData(final int seen1, @SerialName("v") final Integer version, final Configuration config, final User user) {
        if (0x6 != (0x6 & seen1)) {
            PluginExceptionsKt.throwMissingFieldException(seen1, 6, serializer.INSTANCE.getDescriptor());
        }
        super(seen1);
        if ((seen1 & 0x1) == 0x0) {
            this.version = null;
        }
        else {
            this.version = version;
        }
        this.config = config;
        this.user = user;
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/event/data/ReadyEventData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/lib/kdiscordipc/core/event/data/ReadyEventData;", "KDiscordIPC" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final KSerializer<ReadyEventData> serializer() {
            return (KSerializer<ReadyEventData>)serializer.INSTANCE;
        }
        
        public Companion(final byte b) {
            this();
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014" }, d2 = { "gg/essential/lib/kdiscordipc/core/event/data/ReadyEventData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/lib/kdiscordipc/core/event/data/ReadyEventData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "KDiscordIPC" })
    public static final class serializer implements GeneratedSerializer<ReadyEventData>
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
            return (KSerializer<?>[])new KSerializer[] { BuiltinSerializersKt.getNullable((KSerializer)IntSerializer.INSTANCE), (KSerializer)Configuration.serializer.INSTANCE, (KSerializer)User.serializer.INSTANCE };
        }
        
        @NotNull
        public ReadyEventData deserialize(@NotNull final Decoder decoder) {
            Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            int i = 1;
            int seen1 = 0;
            Object o = null;
            Object o2 = null;
            Object o3 = null;
            final CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
            if (beginStructure.decodeSequentially()) {
                o = beginStructure.decodeNullableSerializableElement(descriptor, 0, (DeserializationStrategy)IntSerializer.INSTANCE, o);
                o2 = beginStructure.decodeSerializableElement(descriptor, 1, (DeserializationStrategy)Configuration.serializer.INSTANCE, o2);
                o3 = beginStructure.decodeSerializableElement(descriptor, 2, (DeserializationStrategy)User.serializer.INSTANCE, o3);
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
                            o = beginStructure.decodeNullableSerializableElement(descriptor, 0, (DeserializationStrategy)IntSerializer.INSTANCE, o);
                            seen1 |= 0x1;
                            continue;
                        }
                        case 1: {
                            o2 = beginStructure.decodeSerializableElement(descriptor, 1, (DeserializationStrategy)Configuration.serializer.INSTANCE, o2);
                            seen1 |= 0x2;
                            continue;
                        }
                        case 2: {
                            o3 = beginStructure.decodeSerializableElement(descriptor, 2, (DeserializationStrategy)User.serializer.INSTANCE, o3);
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
            return new ReadyEventData(seen1, (Integer)o, (Configuration)o2, (User)o3);
        }
        
        public void serialize(@NotNull final Encoder encoder, @NotNull final ReadyEventData value) {
            Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
            Intrinsics.checkNotNullParameter((Object)value, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
            ReadyEventData.write$Self(value, beginStructure, descriptor);
            beginStructure.endStructure(descriptor);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object value) {
            this.serialize(encoder, (ReadyEventData)value);
        }
        
        static {
            INSTANCE = new serializer();
            final PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("gg.essential.lib.kdiscordipc.core.event.data.ReadyEventData", (GeneratedSerializer)serializer.INSTANCE, 3);
            pluginGeneratedSerialDescriptor.addElement("v", true);
            pluginGeneratedSerialDescriptor.addElement("config", false);
            pluginGeneratedSerialDescriptor.addElement("user", false);
            descriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor;
        }
    }
    
    @Serializable
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B;\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0005H\u00c6\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u0005H\u00d6\u0001J!\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u00c7\u0001R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006%" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/event/data/ReadyEventData$Configuration;", "", "seen1", "", "cdnHost", "", "apiEndpoint", "environment", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiEndpoint$annotations", "()V", "getApiEndpoint", "()Ljava/lang/String;", "getCdnHost$annotations", "getCdnHost", "getEnvironment", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "KDiscordIPC" })
    public static final class Configuration
    {
        @NotNull
        public static final Companion Companion;
        @NotNull
        private final String cdnHost = cdnHost;
        @NotNull
        private final String apiEndpoint = apiEndpoint;
        @NotNull
        private final String environment = environment;
        
        @NotNull
        @Override
        public String toString() {
            return "Configuration(cdnHost=" + this.cdnHost + ", apiEndpoint=" + this.apiEndpoint + ", environment=" + this.environment + ')';
        }
        
        @Override
        public int hashCode() {
            int result = this.cdnHost.hashCode();
            result = result * 31 + this.apiEndpoint.hashCode();
            result = result * 31 + this.environment.hashCode();
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            final Configuration configuration = (Configuration)other;
            return Intrinsics.areEqual((Object)this.cdnHost, (Object)configuration.cdnHost) && Intrinsics.areEqual((Object)this.apiEndpoint, (Object)configuration.apiEndpoint) && Intrinsics.areEqual((Object)this.environment, (Object)configuration.environment);
        }
        
        @JvmStatic
        public static final void write$Self(@NotNull final Configuration self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter((Object)self, "self");
            Intrinsics.checkNotNullParameter((Object)output, "output");
            Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
            output.encodeStringElement(serialDesc, 0, self.cdnHost);
            output.encodeStringElement(serialDesc, 1, self.apiEndpoint);
            output.encodeStringElement(serialDesc, 2, self.environment);
        }
        
        @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
        @java.lang.Deprecated
        public Configuration(final int seen1, @SerialName("cdn_host") final String cdnHost, @SerialName("api_endpoint") final String apiEndpoint, final String environment) {
            if (0x7 != (0x7 & seen1)) {
                PluginExceptionsKt.throwMissingFieldException(seen1, 7, serializer.INSTANCE.getDescriptor());
            }
            super();
        }
        
        static {
            Companion = new Companion((byte)0);
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/lib/kdiscordipc/core/event/data/ReadyEventData$Configuration$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/lib/kdiscordipc/core/event/data/ReadyEventData$Configuration;", "KDiscordIPC" })
        public static final class Companion
        {
            private Companion() {
                super();
            }
            
            @NotNull
            public final KSerializer<Configuration> serializer() {
                return (KSerializer<Configuration>)serializer.INSTANCE;
            }
            
            public Companion(final byte b) {
                this();
            }
        }
        
        @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014" }, d2 = { "gg/essential/lib/kdiscordipc/core/event/data/ReadyEventData.Configuration.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/lib/kdiscordipc/core/event/data/ReadyEventData$Configuration;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "KDiscordIPC" })
        public static final class serializer implements GeneratedSerializer<Configuration>
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
                return (KSerializer<?>[])new KSerializer[] { (KSerializer)StringSerializer.INSTANCE, (KSerializer)StringSerializer.INSTANCE, (KSerializer)StringSerializer.INSTANCE };
            }
            
            @NotNull
            public Configuration deserialize(@NotNull final Decoder decoder) {
                Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
                final SerialDescriptor descriptor = this.getDescriptor();
                int i = 1;
                int seen1 = 0;
                String cdnHost = null;
                String apiEndpoint = null;
                String environment = null;
                final CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
                if (beginStructure.decodeSequentially()) {
                    cdnHost = beginStructure.decodeStringElement(descriptor, 0);
                    apiEndpoint = beginStructure.decodeStringElement(descriptor, 1);
                    environment = beginStructure.decodeStringElement(descriptor, 2);
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
                                cdnHost = beginStructure.decodeStringElement(descriptor, 0);
                                seen1 |= 0x1;
                                continue;
                            }
                            case 1: {
                                apiEndpoint = beginStructure.decodeStringElement(descriptor, 1);
                                seen1 |= 0x2;
                                continue;
                            }
                            case 2: {
                                environment = beginStructure.decodeStringElement(descriptor, 2);
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
                return new Configuration(seen1, cdnHost, apiEndpoint, environment);
            }
            
            public void serialize(@NotNull final Encoder encoder, @NotNull final Configuration value) {
                Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
                Intrinsics.checkNotNullParameter((Object)value, "value");
                final SerialDescriptor descriptor = this.getDescriptor();
                final CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
                Configuration.write$Self(value, beginStructure, descriptor);
                beginStructure.endStructure(descriptor);
            }
            
            public /* bridge */ Object deserialize(final Decoder decoder) {
                return this.deserialize(decoder);
            }
            
            public /* bridge */ void serialize(final Encoder encoder, final Object value) {
                this.serialize(encoder, (Configuration)value);
            }
            
            static {
                INSTANCE = new serializer();
                final PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("gg.essential.lib.kdiscordipc.core.event.data.ReadyEventData.Configuration", (GeneratedSerializer)serializer.INSTANCE, 3);
                pluginGeneratedSerialDescriptor.addElement("cdn_host", false);
                pluginGeneratedSerialDescriptor.addElement("api_endpoint", false);
                pluginGeneratedSerialDescriptor.addElement("environment", false);
                descriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor;
            }
        }
    }
}
