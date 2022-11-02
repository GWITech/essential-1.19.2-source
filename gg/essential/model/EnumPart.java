package gg.essential.model;

import kotlin.*;
import java.util.*;
import kotlin.collections.*;
import kotlin.jvm.internal.*;
import kotlin.jvm.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0001\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0015\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f" }, d2 = { "Lgg/essential/model/EnumPart;", "", "armorSlotIds", "", "", "(Ljava/lang/String;ILjava/util/Set;)V", "getArmorSlotIds", "()Ljava/util/Set;", "HEAD", "BODY", "RIGHT_ARM", "LEFT_ARM", "LEFT_LEG", "RIGHT_LEG", "Companion", "cosmetics" })
public enum EnumPart
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final Set<Integer> armorSlotIds;
    
    HEAD("HEAD", 0, (Set<Integer>)SetsKt.setOf((Object)3)), 
    BODY("BODY", 1, (Set<Integer>)SetsKt.setOf((Object)2)), 
    RIGHT_ARM("RIGHT_ARM", 2, (Set<Integer>)SetsKt.setOf((Object)2)), 
    LEFT_ARM("LEFT_ARM", 3, (Set<Integer>)SetsKt.setOf((Object)2)), 
    LEFT_LEG("LEFT_LEG", 4, (Set<Integer>)SetsKt.setOf((Object[])new Integer[] { 0, 1 })), 
    RIGHT_LEG("RIGHT_LEG", 5, (Set<Integer>)SetsKt.setOf((Object[])new Integer[] { 0, 1 }));
    
    private static final /* synthetic */ EnumPart[] $VALUES;
    
    private EnumPart(final String $enum$name, final int $enum$ordinal, final Set<Integer> armorSlotIds) {
        this.armorSlotIds = armorSlotIds;
    }
    
    @NotNull
    public final Set<Integer> getArmorSlotIds() {
        return this.armorSlotIds;
    }
    
    public static EnumPart[] values() {
        return EnumPart.$VALUES.clone();
    }
    
    public static EnumPart valueOf(final String value) {
        return Enum.valueOf(EnumPart.class, value);
    }
    
    private static final /* synthetic */ EnumPart[] $values() {
        return new EnumPart[] { EnumPart.HEAD, EnumPart.BODY, EnumPart.RIGHT_ARM, EnumPart.LEFT_ARM, EnumPart.LEFT_LEG, EnumPart.RIGHT_LEG };
    }
    
    static {
        $VALUES = $values();
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007" }, d2 = { "Lgg/essential/model/EnumPart$Companion;", "", "()V", "fromBoneName", "Lgg/essential/model/EnumPart;", "name", "", "cosmetics" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @JvmStatic
        @Nullable
        public final EnumPart fromBoneName(@NotNull final String name) {
            Intrinsics.checkNotNullParameter((Object)name, "name");
            switch (name.hashCode()) {
                case 2045478059: {
                    if (!name.equals("leg_right")) {
                        return null;
                    }
                    return EnumPart.RIGHT_LEG;
                }
                case -1371464000: {
                    if (!name.equals("RightArm")) {
                        return null;
                    }
                    break;
                }
                case 1720078439: {
                    if (!name.equals("LeftLeg")) {
                        return null;
                    }
                    return EnumPart.LEFT_LEG;
                }
                case 2245120: {
                    if (!name.equals("Head")) {
                        return null;
                    }
                    return EnumPart.HEAD;
                }
                case -1568801351: {
                    if (!name.equals("right_arm")) {
                        return null;
                    }
                    break;
                }
                case 1718752726: {
                    if (!name.equals("left_leg")) {
                        return null;
                    }
                    return EnumPart.LEFT_LEG;
                }
                case -1436108128: {
                    if (!name.equals("rightArm")) {
                        return null;
                    }
                    break;
                }
                case 55425159: {
                    if (!name.equals("leftLeg")) {
                        return null;
                    }
                    return EnumPart.LEFT_LEG;
                }
                case 3029410: {
                    if (!name.equals("body")) {
                        return null;
                    }
                    return EnumPart.BODY;
                }
                case -1438255094: {
                    if (!name.equals("arm_left")) {
                        return null;
                    }
                    return EnumPart.LEFT_ARM;
                }
                case 3198432: {
                    if (!name.equals("head")) {
                        return null;
                    }
                    return EnumPart.HEAD;
                }
                case 1720068277: {
                    if (!name.equals("LeftArm")) {
                        return null;
                    }
                    return EnumPart.LEFT_ARM;
                }
                case -1371453838: {
                    if (!name.equals("RightLeg")) {
                        return null;
                    }
                    return EnumPart.RIGHT_LEG;
                }
                case -1436097966: {
                    if (!name.equals("rightLeg")) {
                        return null;
                    }
                    return EnumPart.RIGHT_LEG;
                }
                case 1718742564: {
                    if (!name.equals("left_arm")) {
                        return null;
                    }
                    return EnumPart.LEFT_ARM;
                }
                case -1568791189: {
                    if (!name.equals("right_leg")) {
                        return null;
                    }
                    return EnumPart.RIGHT_LEG;
                }
                case -1630573959: {
                    if (!name.equals("arm_right")) {
                        return null;
                    }
                    break;
                }
                case 55414997: {
                    if (!name.equals("leftArm")) {
                        return null;
                    }
                    return EnumPart.LEFT_ARM;
                }
                case 1728368536: {
                    if (!name.equals("leg_left")) {
                        return null;
                    }
                    return EnumPart.LEFT_LEG;
                }
                case 2076098: {
                    if (!name.equals("Body")) {
                        return null;
                    }
                    return EnumPart.BODY;
                }
            }
            return EnumPart.RIGHT_ARM;
            enumPart = EnumPart.LEFT_ARM;
            return enumPart;
            enumPart = EnumPart.BODY;
            return enumPart;
            enumPart = EnumPart.LEFT_LEG;
            return enumPart;
            enumPart = EnumPart.RIGHT_LEG;
            return enumPart;
            enumPart = EnumPart.HEAD;
            return enumPart;
            enumPart = null;
            return enumPart;
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
