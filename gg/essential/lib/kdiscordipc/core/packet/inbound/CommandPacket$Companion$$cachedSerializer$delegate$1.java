package gg.essential.lib.kdiscordipc.core.packet.inbound;

import kotlin.jvm.functions.*;
import kotlin.*;
import kotlin.jvm.internal.*;
import java.lang.annotation.*;
import kotlinx.serialization.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
static final class CommandPacket$Companion$$cachedSerializer$delegate$1 extends Lambda implements Function0<KSerializer<Object>> {
    public static final CommandPacket$Companion$$cachedSerializer$delegate$1 INSTANCE;
    
    CommandPacket$Companion$$cachedSerializer$delegate$1() {
        super(0);
    }
    
    @NotNull
    public final KSerializer<Object> invoke() {
        return (KSerializer<Object>)new PolymorphicSerializer(Reflection.getOrCreateKotlinClass((Class)CommandPacket.class), new Annotation[0]);
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
    
    static {
        CommandPacket$Companion$$cachedSerializer$delegate$1.INSTANCE = new CommandPacket$Companion$$cachedSerializer$delegate$1();
    }
}