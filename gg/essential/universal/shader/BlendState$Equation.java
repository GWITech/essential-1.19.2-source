package gg.essential.universal.shader;

import kotlin.*;
import java.util.*;
import kotlin.jvm.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0018
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0010
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0002\b\f\b\u0086\u0001\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010
                                                   j\u0002\b\u000bj\u0002\b\fj\u0002\bj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011""" }, d2 = { "Lgg/essential/universal/shader/BlendState$Equation;", "", "mcStr", "", "glId", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getGlId$universalcraft", "()I", "getMcStr$universalcraft", "()Ljava/lang/String;", "ADD", "SUBTRACT", "REVERSE_SUBTRACT", "MIN", "MAX", "Companion", "universalcraft" })
public enum Equation
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final String mcStr;
    private final int glId;
    @NotNull
    private static final Map<Integer, Equation> byGlId;
    public static final enum Equation ADD;
    public static final enum Equation SUBTRACT;
    public static final enum Equation REVERSE_SUBTRACT;
    public static final enum Equation MIN;
    public static final enum Equation MAX;
    private static final /* synthetic */ Equation[] $VALUES;
    
    private Equation(final String $enum$name, final int $enum$ordinal, final String mcStr, final int glId) {
        this.mcStr = mcStr;
        this.glId = glId;
    }
    
    @NotNull
    public final String getMcStr$universalcraft() {
        return this.mcStr;
    }
    
    public final int getGlId$universalcraft() {
        return this.glId;
    }
    
    public static Equation[] values() {
        return Equation.$VALUES.clone();
    }
    
    public static Equation valueOf(final String value) {
        return Enum.valueOf(Equation.class, value);
    }
    
    private static final /* synthetic */ Equation[] $values() {
        return new Equation[] { Equation.ADD, Equation.SUBTRACT, Equation.REVERSE_SUBTRACT, Equation.MIN, Equation.MAX };
    }
    
    @JvmStatic
    @Nullable
    public static final Equation fromGl(final int glId) {
        return Equation.Companion.fromGl(glId);
    }
    
    public static final /* synthetic */ Map access$getByGlId$cp() {
        return Equation.byGlId;
    }
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ldc             "ADD"
        //     6: iconst_0       
        //     7: ldc             "add"
        //     9: ldc             32774
        //    11: invokespecial   gg/essential/universal/shader/BlendState$Equation.<init>:(Ljava/lang/String;ILjava/lang/String;I)V
        //    14: putstatic       gg/essential/universal/shader/BlendState$Equation.ADD:Lgg/essential/universal/shader/BlendState$Equation;
        //    17: new             Lgg/essential/universal/shader/BlendState$Equation;
        //    20: dup            
        //    21: ldc             "SUBTRACT"
        //    23: iconst_1       
        //    24: ldc             "subtract"
        //    26: ldc             32778
        //    28: invokespecial   gg/essential/universal/shader/BlendState$Equation.<init>:(Ljava/lang/String;ILjava/lang/String;I)V
        //    31: putstatic       gg/essential/universal/shader/BlendState$Equation.SUBTRACT:Lgg/essential/universal/shader/BlendState$Equation;
        //    34: new             Lgg/essential/universal/shader/BlendState$Equation;
        //    37: dup            
        //    38: ldc             "REVERSE_SUBTRACT"
        //    40: iconst_2       
        //    41: ldc             "reverse_subtract"
        //    43: ldc             32779
        //    45: invokespecial   gg/essential/universal/shader/BlendState$Equation.<init>:(Ljava/lang/String;ILjava/lang/String;I)V
        //    48: putstatic       gg/essential/universal/shader/BlendState$Equation.REVERSE_SUBTRACT:Lgg/essential/universal/shader/BlendState$Equation;
        //    51: new             Lgg/essential/universal/shader/BlendState$Equation;
        //    54: dup            
        //    55: ldc             "MIN"
        //    57: iconst_3       
        //    58: ldc             "min"
        //    60: ldc             32775
        //    62: invokespecial   gg/essential/universal/shader/BlendState$Equation.<init>:(Ljava/lang/String;ILjava/lang/String;I)V
        //    65: putstatic       gg/essential/universal/shader/BlendState$Equation.MIN:Lgg/essential/universal/shader/BlendState$Equation;
        //    68: new             Lgg/essential/universal/shader/BlendState$Equation;
        //    71: dup            
        //    72: ldc             "MAX"
        //    74: iconst_4       
        //    75: ldc             "max"
        //    77: ldc             32776
        //    79: invokespecial   gg/essential/universal/shader/BlendState$Equation.<init>:(Ljava/lang/String;ILjava/lang/String;I)V
        //    82: putstatic       gg/essential/universal/shader/BlendState$Equation.MAX:Lgg/essential/universal/shader/BlendState$Equation;
        //    85: invokestatic    gg/essential/universal/shader/BlendState$Equation.$values:()[Lgg/essential/universal/shader/BlendState$Equation;
        //    88: putstatic       gg/essential/universal/shader/BlendState$Equation.$VALUES:[Lgg/essential/universal/shader/BlendState$Equation;
        //    91: new             Lgg/essential/universal/shader/BlendState$Equation$Companion;
        //    94: dup            
        //    95: aconst_null    
        //    96: invokespecial   gg/essential/universal/shader/BlendState$Equation$Companion.<init>:(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    99: putstatic       gg/essential/universal/shader/BlendState$Equation.Companion:Lgg/essential/universal/shader/BlendState$Equation$Companion;
        //   102: invokestatic    gg/essential/universal/shader/BlendState$Equation.values:()[Lgg/essential/universal/shader/BlendState$Equation;
        //   105: astore_0        /* $this$associateBy$iv */
        //   106: iconst_0       
        //   107: istore_1        /* $i$f$associateBy */
        //   108: aload_0         /* $this$associateBy$iv */
        //   109: arraylength    
        //   110: invokestatic    kotlin/collections/MapsKt.mapCapacity:(I)I
        //   113: bipush          16
        //   115: invokestatic    kotlin/ranges/RangesKt.coerceAtLeast:(II)I
        //   118: istore_2        /* capacity$iv */
        //   119: aload_0         /* $this$associateBy$iv */
        //   120: astore_3       
        //   121: new             Ljava/util/LinkedHashMap;
        //   124: dup            
        //   125: iload_2         /* capacity$iv */
        //   126: invokespecial   java/util/LinkedHashMap.<init>:(I)V
        //   129: checkcast       Ljava/util/Map;
        //   132: astore          destination$iv$iv
        //   134: iconst_0       
        //   135: istore          $i$f$associateByTo
        //   137: aload_3         /* $this$associateByTo$iv$iv */
        //   138: astore          6
        //   140: aload           6
        //   142: arraylength    
        //   143: istore          7
        //   145: iconst_0       
        //   146: istore          8
        //   148: iload           8
        //   150: iload           7
        //   152: if_icmpge       198
        //   155: aload           6
        //   157: iload           8
        //   159: aaload         
        //   160: astore          element$iv$iv
        //   162: aload           destination$iv$iv
        //   164: aload           element$iv$iv
        //   166: astore          10
        //   168: astore          12
        //   170: iconst_0       
        //   171: istore          $i$a$-associateBy-BlendState$Equation$Companion$byGlId$1
        //   173: aload           it
        //   175: invokevirtual   gg/essential/universal/shader/BlendState$Equation.getGlId$universalcraft:()I
        //   178: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   181: aload           12
        //   183: swap           
        //   184: aload           element$iv$iv
        //   186: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   191: pop            
        //   192: iinc            8, 1
        //   195: goto            148
        //   198: aload           destination$iv$iv
        //   200: nop            
        //   201: putstatic       gg/essential/universal/shader/BlendState$Equation.byGlId:Ljava/util/Map;
        //   204: return         
        //    StackMapTable: 00 02 FF 00 94 00 09 07 00 45 01 01 07 00 45 07 00 94 01 07 00 45 01 01 00 00 31
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u001c
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0010$
                                                       \u0002\u0010\b
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0005H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002
                                                       \u0000¨\u0006	""" }, d2 = { "Lgg/essential/universal/shader/BlendState$Equation$Companion;", "", "()V", "byGlId", "", "", "Lgg/essential/universal/shader/BlendState$Equation;", "fromGl", "glId", "universalcraft" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @JvmStatic
        @Nullable
        public final Equation fromGl(final int glId) {
            return Equation.access$getByGlId$cp().get(glId);
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
