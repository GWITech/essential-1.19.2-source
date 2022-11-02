package gg.essential.lib.kdiscordipc.data.user;

import gg.essential.lib.kdiscordipc.core.event.data.*;
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
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000234B]\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0010BE\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\nH\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\rH\u00c6\u0003JS\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u00c6\u0001J\u0013\u0010'\u001a\u00020\n2\b\u0010(\u001a\u0004\u0018\u00010)H\u00d6\u0003J\t\u0010*\u001a\u00020\u0003H\u00d6\u0001J\t\u0010+\u001a\u00020\u0005H\u00d6\u0001J!\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\u00002\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H\u00c7\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0013¨\u00065" }, d2 = { "Lgg/essential/lib/kdiscordipc/data/user/User;", "Lgg/essential/lib/kdiscordipc/core/event/data/EventData;", "seen1", "", "id", "", "username", "discriminator", "avatar", "bot", "", "flags", "premiumType", "Lgg/essential/lib/kdiscordipc/data/user/PremiumType;", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILdev/cbyrne/kdiscordipc/data/user/PremiumType;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILdev/cbyrne/kdiscordipc/data/user/PremiumType;)V", "getAvatar", "()Ljava/lang/String;", "getBot", "()Z", "getDiscriminator", "getFlags", "()I", "getId", "getPremiumType$annotations", "()V", "getPremiumType", "()Ldev/cbyrne/kdiscordipc/data/user/PremiumType;", "getUsername", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "KDiscordIPC" })
public final class User extends EventData
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final String id = id;
    @NotNull
    private final String username = username;
    @NotNull
    private final String discriminator = discriminator;
    @Nullable
    private final String avatar;
    private final boolean bot;
    private final int flags;
    @Nullable
    private final PremiumType premiumType;
    
    @NotNull
    public final String getId() {
        return this.id;
    }
    
    @NotNull
    public final String getUsername() {
        return this.username;
    }
    
    @NotNull
    public final String getDiscriminator() {
        return this.discriminator;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "User(id=" + this.id + ", username=" + this.username + ", discriminator=" + this.discriminator + ", avatar=" + (Object)this.avatar + ", bot=" + this.bot + ", flags=" + this.flags + ", premiumType=" + this.premiumType + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.id.hashCode();
        result = result * 31 + this.username.hashCode();
        result = result * 31 + this.discriminator.hashCode();
        result = result * 31 + ((this.avatar == null) ? 0 : this.avatar.hashCode());
        final int n = result * 31;
        int bot;
        if ((bot = (this.bot ? 1 : 0)) != 0) {
            bot = 1;
        }
        result = n + bot;
        result = result * 31 + Integer.hashCode(this.flags);
        result = result * 31 + ((this.premiumType == null) ? 0 : this.premiumType.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        final User user = (User)other;
        return Intrinsics.areEqual((Object)this.id, (Object)user.id) && Intrinsics.areEqual((Object)this.username, (Object)user.username) && Intrinsics.areEqual((Object)this.discriminator, (Object)user.discriminator) && Intrinsics.areEqual((Object)this.avatar, (Object)user.avatar) && this.bot == user.bot && this.flags == user.flags && this.premiumType == user.premiumType;
    }
    
    @JvmStatic
    public static final void write$Self(@NotNull final User self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter((Object)self, "self");
        Intrinsics.checkNotNullParameter((Object)output, "output");
        Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
        EventData.write$Self(self, output, serialDesc);
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.username);
        output.encodeStringElement(serialDesc, 2, self.discriminator);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.avatar != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (SerializationStrategy)StringSerializer.INSTANCE, (Object)self.avatar);
        }
        output.encodeBooleanElement(serialDesc, 4, self.bot);
        output.encodeIntElement(serialDesc, 5, self.flags);
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.premiumType != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (SerializationStrategy)PremiumType.Companion.serializer(), (Object)self.premiumType);
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @java.lang.Deprecated
    public User(final int seen1, final String id, final String username, final String discriminator, final String avatar, final boolean bot, final int flags, @SerialName("premium_type") final PremiumType premiumType) {
        if (0x37 != (0x37 & seen1)) {
            PluginExceptionsKt.throwMissingFieldException(seen1, 55, serializer.INSTANCE.getDescriptor());
        }
        super(seen1);
        if ((seen1 & 0x8) == 0x0) {
            this.avatar = null;
        }
        else {
            this.avatar = avatar;
        }
        this.bot = bot;
        this.flags = flags;
        if ((seen1 & 0x40) == 0x0) {
            this.premiumType = null;
        }
        else {
            this.premiumType = premiumType;
        }
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/lib/kdiscordipc/data/user/User$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/lib/kdiscordipc/data/user/User;", "KDiscordIPC" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final KSerializer<User> serializer() {
            return (KSerializer<User>)serializer.INSTANCE;
        }
        
        public Companion(final byte b) {
            this();
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014" }, d2 = { "gg/essential/lib/kdiscordipc/data/user/User.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/lib/kdiscordipc/data/user/User;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "KDiscordIPC" })
    public static final class serializer implements GeneratedSerializer<User>
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
            return (KSerializer<?>[])new KSerializer[] { (KSerializer)StringSerializer.INSTANCE, (KSerializer)StringSerializer.INSTANCE, (KSerializer)StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE), (KSerializer)BooleanSerializer.INSTANCE, (KSerializer)IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable((KSerializer)PremiumType.Companion.serializer()) };
        }
        
        @NotNull
        public User deserialize(@NotNull final Decoder decoder) {
            Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
            final SerialDescriptor descriptor = this.getDescriptor();
            int i = 1;
            int seen1 = 0;
            String id = null;
            String username = null;
            String discriminator = null;
            Object o = null;
            boolean bot = false;
            int flags = 0;
            Object o2 = null;
            final CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
            if (beginStructure.decodeSequentially()) {
                id = beginStructure.decodeStringElement(descriptor, 0);
                username = beginStructure.decodeStringElement(descriptor, 1);
                discriminator = beginStructure.decodeStringElement(descriptor, 2);
                o = beginStructure.decodeNullableSerializableElement(descriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, o);
                bot = beginStructure.decodeBooleanElement(descriptor, 4);
                flags = beginStructure.decodeIntElement(descriptor, 5);
                o2 = beginStructure.decodeNullableSerializableElement(descriptor, 6, (DeserializationStrategy)PremiumType.Companion.serializer(), o2);
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
                            id = beginStructure.decodeStringElement(descriptor, 0);
                            seen1 |= 0x1;
                            continue;
                        }
                        case 1: {
                            username = beginStructure.decodeStringElement(descriptor, 1);
                            seen1 |= 0x2;
                            continue;
                        }
                        case 2: {
                            discriminator = beginStructure.decodeStringElement(descriptor, 2);
                            seen1 |= 0x4;
                            continue;
                        }
                        case 3: {
                            o = beginStructure.decodeNullableSerializableElement(descriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, o);
                            seen1 |= 0x8;
                            continue;
                        }
                        case 4: {
                            bot = beginStructure.decodeBooleanElement(descriptor, 4);
                            seen1 |= 0x10;
                            continue;
                        }
                        case 5: {
                            flags = beginStructure.decodeIntElement(descriptor, 5);
                            seen1 |= 0x20;
                            continue;
                        }
                        case 6: {
                            o2 = beginStructure.decodeNullableSerializableElement(descriptor, 6, (DeserializationStrategy)PremiumType.Companion.serializer(), o2);
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
            return new User(seen1, id, username, discriminator, (String)o, bot, flags, (PremiumType)o2);
        }
        
        public void serialize(@NotNull final Encoder encoder, @NotNull final User value) {
            Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
            Intrinsics.checkNotNullParameter((Object)value, "value");
            final SerialDescriptor descriptor = this.getDescriptor();
            final CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
            User.write$Self(value, beginStructure, descriptor);
            beginStructure.endStructure(descriptor);
        }
        
        public /* bridge */ Object deserialize(final Decoder decoder) {
            return this.deserialize(decoder);
        }
        
        public /* bridge */ void serialize(final Encoder encoder, final Object value) {
            this.serialize(encoder, (User)value);
        }
        
        static {
            INSTANCE = new serializer();
            final PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("gg.essential.lib.kdiscordipc.data.user.User", (GeneratedSerializer)serializer.INSTANCE, 7);
            pluginGeneratedSerialDescriptor.addElement("id", false);
            pluginGeneratedSerialDescriptor.addElement("username", false);
            pluginGeneratedSerialDescriptor.addElement("discriminator", false);
            pluginGeneratedSerialDescriptor.addElement("avatar", true);
            pluginGeneratedSerialDescriptor.addElement("bot", false);
            pluginGeneratedSerialDescriptor.addElement("flags", false);
            pluginGeneratedSerialDescriptor.addElement("premium_type", true);
            descriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor;
        }
    }
}
