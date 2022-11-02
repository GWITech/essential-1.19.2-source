package gg.essential.lib.kdiscordipc.data.activity;

import org.jetbrains.annotations.*;
import java.util.*;
import kotlin.jvm.internal.*;
import kotlinx.serialization.descriptors.*;
import kotlin.jvm.*;
import kotlin.*;
import kotlinx.serialization.builtins.*;
import kotlinx.serialization.encoding.*;
import kotlinx.serialization.internal.*;
import kotlinx.serialization.*;

@Serializable
@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 O2\u00020\u0001:\u0007LMNOPQRBo\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0016Bc\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0002\u0010\u0017J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u0011\u0010=\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u00c6\u0003J\u0010\u0010>\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003¢\u0006\u0002\u0010%Jp\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u00c6\u0001¢\u0006\u0002\u0010@J\u0013\u0010A\u001a\u00020\u00132\b\u0010B\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010C\u001a\u00020\u0003H\u00d6\u0001J\t\u0010D\u001a\u00020\u0005H\u00d6\u0001J!\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u00002\u0006\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020KH\u00c7\u0001R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010!\"\u0004\b2\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106¨\u0006S" }, d2 = { "Lgg/essential/lib/kdiscordipc/data/activity/Activity;", "", "seen1", "", "details", "", "state", "timestamps", "Lgg/essential/lib/kdiscordipc/data/activity/Activity$Timestamps;", "assets", "Lgg/essential/lib/kdiscordipc/data/activity/Activity$Assets;", "party", "Lgg/essential/lib/kdiscordipc/data/activity/Activity$Party;", "secrets", "Lgg/essential/lib/kdiscordipc/data/activity/Activity$Secrets;", "buttons", "", "Lgg/essential/lib/kdiscordipc/data/activity/Activity$Button;", "instance", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ldev/cbyrne/kdiscordipc/data/activity/Activity$Timestamps;Ldev/cbyrne/kdiscordipc/data/activity/Activity$Assets;Ldev/cbyrne/kdiscordipc/data/activity/Activity$Party;Ldev/cbyrne/kdiscordipc/data/activity/Activity$Secrets;Ljava/util/List;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ldev/cbyrne/kdiscordipc/data/activity/Activity$Timestamps;Ldev/cbyrne/kdiscordipc/data/activity/Activity$Assets;Ldev/cbyrne/kdiscordipc/data/activity/Activity$Party;Ldev/cbyrne/kdiscordipc/data/activity/Activity$Secrets;Ljava/util/List;Ljava/lang/Boolean;)V", "getAssets", "()Ldev/cbyrne/kdiscordipc/data/activity/Activity$Assets;", "setAssets", "(Ldev/cbyrne/kdiscordipc/data/activity/Activity$Assets;)V", "getButtons", "()Ljava/util/List;", "setButtons", "(Ljava/util/List;)V", "getDetails", "()Ljava/lang/String;", "setDetails", "(Ljava/lang/String;)V", "getInstance", "()Ljava/lang/Boolean;", "setInstance", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getParty", "()Ldev/cbyrne/kdiscordipc/data/activity/Activity$Party;", "setParty", "(Ldev/cbyrne/kdiscordipc/data/activity/Activity$Party;)V", "getSecrets", "()Ldev/cbyrne/kdiscordipc/data/activity/Activity$Secrets;", "setSecrets", "(Ldev/cbyrne/kdiscordipc/data/activity/Activity$Secrets;)V", "getState", "setState", "getTimestamps", "()Ldev/cbyrne/kdiscordipc/data/activity/Activity$Timestamps;", "setTimestamps", "(Ldev/cbyrne/kdiscordipc/data/activity/Activity$Timestamps;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ldev/cbyrne/kdiscordipc/data/activity/Activity$Timestamps;Ldev/cbyrne/kdiscordipc/data/activity/Activity$Assets;Ldev/cbyrne/kdiscordipc/data/activity/Activity$Party;Ldev/cbyrne/kdiscordipc/data/activity/Activity$Secrets;Ljava/util/List;Ljava/lang/Boolean;)Ldev/cbyrne/kdiscordipc/data/activity/Activity;", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Assets", "Button", "Companion", "Party", "Secrets", "Timestamps", "KDiscordIPC" })
public final class Activity
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private String details = details;
    @NotNull
    private String state = state;
    @Nullable
    private Activity.Timestamps timestamps;
    @Nullable
    private Assets assets;
    @Nullable
    private Activity.Party party;
    @Nullable
    private Activity.Secrets secrets;
    @Nullable
    private List<Activity.Button> buttons;
    @Nullable
    private Boolean instance;
    
    public Activity(@NotNull final String details, @NotNull final String state, @Nullable final Activity.Timestamps timestamps, @Nullable final Assets assets, @Nullable final Activity.Party party, @Nullable final Activity.Secrets secrets, @Nullable final List<Activity.Button> buttons, @Nullable final Boolean instance) {
        Intrinsics.checkNotNullParameter((Object)details, "details");
        Intrinsics.checkNotNullParameter((Object)state, "state");
        super();
        this.details = details;
        this.state = state;
        this.timestamps = timestamps;
        this.assets = assets;
        this.party = party;
        this.secrets = secrets;
        this.buttons = buttons;
        this.instance = instance;
    }
    
    public Activity(final String details, final String state) {
        this(details, state, null, null, null, null, null, false);
    }
    
    @Nullable
    public final Assets getAssets() {
        return this.assets;
    }
    
    public final void setAssets(@Nullable final Assets <set-?>) {
        this.assets = <set-?>;
    }
    
    public final void setParty(@Nullable final Activity.Party <set-?>) {
        this.party = <set-?>;
    }
    
    public final void setSecrets(@Nullable final Activity.Secrets <set-?>) {
        this.secrets = <set-?>;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "Activity(details=" + this.details + ", state=" + this.state + ", timestamps=" + this.timestamps + ", assets=" + this.assets + ", party=" + this.party + ", secrets=" + this.secrets + ", buttons=" + this.buttons + ", instance=" + this.instance + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.details.hashCode();
        result = result * 31 + this.state.hashCode();
        result = result * 31 + ((this.timestamps == null) ? 0 : this.timestamps.hashCode());
        result = result * 31 + ((this.assets == null) ? 0 : this.assets.hashCode());
        result = result * 31 + ((this.party == null) ? 0 : this.party.hashCode());
        result = result * 31 + ((this.secrets == null) ? 0 : this.secrets.hashCode());
        result = result * 31 + ((this.buttons == null) ? 0 : this.buttons.hashCode());
        result = result * 31 + ((this.instance == null) ? 0 : this.instance.hashCode());
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Activity)) {
            return false;
        }
        final Activity activity = (Activity)other;
        return Intrinsics.areEqual((Object)this.details, (Object)activity.details) && Intrinsics.areEqual((Object)this.state, (Object)activity.state) && Intrinsics.areEqual((Object)this.timestamps, (Object)activity.timestamps) && Intrinsics.areEqual((Object)this.assets, (Object)activity.assets) && Intrinsics.areEqual((Object)this.party, (Object)activity.party) && Intrinsics.areEqual((Object)this.secrets, (Object)activity.secrets) && Intrinsics.areEqual((Object)this.buttons, (Object)activity.buttons) && Intrinsics.areEqual((Object)this.instance, (Object)activity.instance);
    }
    
    @JvmStatic
    public static final void write$Self(@NotNull final Activity self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
        Intrinsics.checkNotNullParameter((Object)self, "self");
        Intrinsics.checkNotNullParameter((Object)output, "output");
        Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
        output.encodeStringElement(serialDesc, 0, self.details);
        output.encodeStringElement(serialDesc, 1, self.state);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.timestamps != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (SerializationStrategy)Activity.Timestamps.serializer.INSTANCE, (Object)self.timestamps);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.assets != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (SerializationStrategy)Assets.serializer.INSTANCE, (Object)self.assets);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.party != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (SerializationStrategy)Activity.Party.serializer.INSTANCE, (Object)self.party);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.secrets != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (SerializationStrategy)Activity.Secrets.serializer.INSTANCE, (Object)self.secrets);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.buttons != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (SerializationStrategy)new ArrayListSerializer((KSerializer)Activity.Button.serializer.INSTANCE), (Object)self.buttons);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !Intrinsics.areEqual((Object)self.instance, (Object)false)) {
            output.encodeNullableSerializableElement(serialDesc, 7, (SerializationStrategy)BooleanSerializer.INSTANCE, (Object)self.instance);
        }
    }
    
    @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
    @java.lang.Deprecated
    public Activity(final int seen1, final String details, final String state, final Activity.Timestamps timestamps, final Assets assets, final Activity.Party party, final Activity.Secrets secrets, final List buttons, final Boolean instance) {
        if (0x3 != (0x3 & seen1)) {
            PluginExceptionsKt.throwMissingFieldException(seen1, 3, serializer.INSTANCE.getDescriptor());
        }
        super();
        if ((seen1 & 0x4) == 0x0) {
            this.timestamps = null;
        }
        else {
            this.timestamps = timestamps;
        }
        if ((seen1 & 0x8) == 0x0) {
            this.assets = null;
        }
        else {
            this.assets = assets;
        }
        if ((seen1 & 0x10) == 0x0) {
            this.party = null;
        }
        else {
            this.party = party;
        }
        if ((seen1 & 0x20) == 0x0) {
            this.secrets = null;
        }
        else {
            this.secrets = secrets;
        }
        if ((seen1 & 0x40) == 0x0) {
            this.buttons = null;
        }
        else {
            this.buttons = buttons;
        }
        if ((seen1 & 0x80) == 0x0) {
            this.instance = false;
        }
        else {
            this.instance = instance;
        }
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/lib/kdiscordipc/data/activity/Activity$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/lib/kdiscordipc/data/activity/Activity;", "KDiscordIPC" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final KSerializer<Activity> serializer() {
            return (KSerializer<Activity>)serializer.INSTANCE;
        }
        
        public Companion(final byte b) {
            this();
        }
    }
    
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
    
    @Serializable
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0002-.BI\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB5\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J9\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010$\u001a\u00020\u0003H\u00d6\u0001J\t\u0010%\u001a\u00020\u0005H\u00d6\u0001J!\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,H\u00c7\u0001R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R&\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R&\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0012R&\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u0019\u0010\u000e\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012¨\u0006/" }, d2 = { "Lgg/essential/lib/kdiscordipc/data/activity/Activity$Assets;", "", "seen1", "", "largeImage", "", "largeText", "smallImage", "smallText", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLargeImage$annotations", "()V", "getLargeImage", "()Ljava/lang/String;", "setLargeImage", "(Ljava/lang/String;)V", "getLargeText$annotations", "getLargeText", "setLargeText", "getSmallImage$annotations", "getSmallImage", "setSmallImage", "getSmallText$annotations", "getSmallText", "setSmallText", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "KDiscordIPC" })
    public static final class Assets
    {
        @NotNull
        public static final Companion Companion;
        @Nullable
        private String largeImage;
        @Nullable
        private String largeText;
        @Nullable
        private String smallImage;
        @Nullable
        private String smallText;
        
        public Assets(@Nullable final String largeImage, @Nullable final String largeText, @Nullable final String smallImage, @Nullable final String smallText) {
            super();
            this.largeImage = largeImage;
            this.largeText = largeText;
            this.smallImage = smallImage;
            this.smallText = smallText;
        }
        
        public Assets(final byte b) {
            this(null, null, null, null);
        }
        
        public final void setLargeImage(@Nullable final String <set-?>) {
            this.largeImage = <set-?>;
        }
        
        public final void setLargeText(@Nullable final String <set-?>) {
            this.largeText = <set-?>;
        }
        
        public final void setSmallImage(@Nullable final String <set-?>) {
            this.smallImage = <set-?>;
        }
        
        public final void setSmallText(@Nullable final String <set-?>) {
            this.smallText = <set-?>;
        }
        
        @NotNull
        @Override
        public String toString() {
            return "Assets(largeImage=" + (Object)this.largeImage + ", largeText=" + (Object)this.largeText + ", smallImage=" + (Object)this.smallImage + ", smallText=" + (Object)this.smallText + ')';
        }
        
        @Override
        public int hashCode() {
            int result = (this.largeImage == null) ? 0 : this.largeImage.hashCode();
            result = result * 31 + ((this.largeText == null) ? 0 : this.largeText.hashCode());
            result = result * 31 + ((this.smallImage == null) ? 0 : this.smallImage.hashCode());
            result = result * 31 + ((this.smallText == null) ? 0 : this.smallText.hashCode());
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Assets)) {
                return false;
            }
            final Assets assets = (Assets)other;
            return Intrinsics.areEqual((Object)this.largeImage, (Object)assets.largeImage) && Intrinsics.areEqual((Object)this.largeText, (Object)assets.largeText) && Intrinsics.areEqual((Object)this.smallImage, (Object)assets.smallImage) && Intrinsics.areEqual((Object)this.smallText, (Object)assets.smallText);
        }
        
        @JvmStatic
        public static final void write$Self(@NotNull final Assets self, @NotNull final CompositeEncoder output, @NotNull final SerialDescriptor serialDesc) {
            Intrinsics.checkNotNullParameter((Object)self, "self");
            Intrinsics.checkNotNullParameter((Object)output, "output");
            Intrinsics.checkNotNullParameter((Object)serialDesc, "serialDesc");
            if (output.shouldEncodeElementDefault(serialDesc, 0) || self.largeImage != null) {
                output.encodeNullableSerializableElement(serialDesc, 0, (SerializationStrategy)StringSerializer.INSTANCE, (Object)self.largeImage);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 1) || self.largeText != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, (SerializationStrategy)StringSerializer.INSTANCE, (Object)self.largeText);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.smallImage != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, (SerializationStrategy)StringSerializer.INSTANCE, (Object)self.smallImage);
            }
            if (output.shouldEncodeElementDefault(serialDesc, 3) || self.smallText != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, (SerializationStrategy)StringSerializer.INSTANCE, (Object)self.smallText);
            }
        }
        
        @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
        @java.lang.Deprecated
        public Assets(final int seen1, @SerialName("large_image") final String largeImage, @SerialName("large_text") final String largeText, @SerialName("small_image") final String smallImage, @SerialName("small_text") final String smallText) {
            if ((0x0 & seen1) != 0x0) {
                PluginExceptionsKt.throwMissingFieldException(seen1, 0, serializer.INSTANCE.getDescriptor());
            }
            super();
            if ((seen1 & 0x1) == 0x0) {
                this.largeImage = null;
            }
            else {
                this.largeImage = largeImage;
            }
            if ((seen1 & 0x2) == 0x0) {
                this.largeText = null;
            }
            else {
                this.largeText = largeText;
            }
            if ((seen1 & 0x4) == 0x0) {
                this.smallImage = null;
            }
            else {
                this.smallImage = smallImage;
            }
            if ((seen1 & 0x8) == 0x0) {
                this.smallText = null;
            }
            else {
                this.smallText = smallText;
            }
        }
        
        public Assets() {
            this((byte)0);
        }
        
        static {
            Companion = new Companion((byte)0);
        }
        
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001¨\u0006\u0006" }, d2 = { "Lgg/essential/lib/kdiscordipc/data/activity/Activity$Assets$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lgg/essential/lib/kdiscordipc/data/activity/Activity$Assets;", "KDiscordIPC" })
        public static final class Companion
        {
            private Companion() {
                super();
            }
            
            @NotNull
            public final KSerializer<Assets> serializer() {
                return (KSerializer<Assets>)serializer.INSTANCE;
            }
            
            public Companion(final byte b) {
                this();
            }
        }
        
        @Deprecated(message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}), level = DeprecationLevel.HIDDEN)
        @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014" }, d2 = { "gg/essential/lib/kdiscordipc/data/activity/Activity.Assets.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lgg/essential/lib/kdiscordipc/data/activity/Activity$Assets;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "KDiscordIPC" })
        public static final class serializer implements GeneratedSerializer<Assets>
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
                return (KSerializer<?>[])new KSerializer[] { BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable((KSerializer)StringSerializer.INSTANCE) };
            }
            
            @NotNull
            public Assets deserialize(@NotNull final Decoder decoder) {
                Intrinsics.checkNotNullParameter((Object)decoder, "decoder");
                final SerialDescriptor descriptor = this.getDescriptor();
                int i = 1;
                int seen1 = 0;
                Object o = null;
                Object o2 = null;
                Object o3 = null;
                Object o4 = null;
                final CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
                if (beginStructure.decodeSequentially()) {
                    o = beginStructure.decodeNullableSerializableElement(descriptor, 0, (DeserializationStrategy)StringSerializer.INSTANCE, o);
                    o2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, o2);
                    o3 = beginStructure.decodeNullableSerializableElement(descriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, o3);
                    o4 = beginStructure.decodeNullableSerializableElement(descriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, o4);
                    seen1 = 15;
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
                                o = beginStructure.decodeNullableSerializableElement(descriptor, 0, (DeserializationStrategy)StringSerializer.INSTANCE, o);
                                seen1 |= 0x1;
                                continue;
                            }
                            case 1: {
                                o2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, (DeserializationStrategy)StringSerializer.INSTANCE, o2);
                                seen1 |= 0x2;
                                continue;
                            }
                            case 2: {
                                o3 = beginStructure.decodeNullableSerializableElement(descriptor, 2, (DeserializationStrategy)StringSerializer.INSTANCE, o3);
                                seen1 |= 0x4;
                                continue;
                            }
                            case 3: {
                                o4 = beginStructure.decodeNullableSerializableElement(descriptor, 3, (DeserializationStrategy)StringSerializer.INSTANCE, o4);
                                seen1 |= 0x8;
                                continue;
                            }
                            default: {
                                throw new UnknownFieldException(decodeElementIndex);
                            }
                        }
                    }
                }
                beginStructure.endStructure(descriptor);
                return new Assets(seen1, (String)o, (String)o2, (String)o3, (String)o4);
            }
            
            public void serialize(@NotNull final Encoder encoder, @NotNull final Assets value) {
                Intrinsics.checkNotNullParameter((Object)encoder, "encoder");
                Intrinsics.checkNotNullParameter((Object)value, "value");
                final SerialDescriptor descriptor = this.getDescriptor();
                final CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
                Assets.write$Self(value, beginStructure, descriptor);
                beginStructure.endStructure(descriptor);
            }
            
            public /* bridge */ Object deserialize(final Decoder decoder) {
                return this.deserialize(decoder);
            }
            
            public /* bridge */ void serialize(final Encoder encoder, final Object value) {
                this.serialize(encoder, (Assets)value);
            }
            
            static {
                INSTANCE = new serializer();
                final PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("gg.essential.lib.kdiscordipc.data.activity.Activity.Assets", (GeneratedSerializer)serializer.INSTANCE, 4);
                pluginGeneratedSerialDescriptor.addElement("large_image", true);
                pluginGeneratedSerialDescriptor.addElement("large_text", true);
                pluginGeneratedSerialDescriptor.addElement("small_image", true);
                pluginGeneratedSerialDescriptor.addElement("small_text", true);
                descriptor = (SerialDescriptor)pluginGeneratedSerialDescriptor;
            }
        }
    }
}
