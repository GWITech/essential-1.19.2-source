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
                                                   \u0002\b\u0011\b\u0086\u0001\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0015B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b
                                                   \u0000\u001a\u0004\b	\u0010
                                                   j\u0002\b\u000bj\u0002\b\fj\u0002\bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0016""" }, d2 = { "Lgg/essential/universal/shader/BlendState$Param;", "", "mcStr", "", "glId", "", "(Ljava/lang/String;ILjava/lang/String;I)V", "getGlId$universalcraft", "()I", "getMcStr$universalcraft", "()Ljava/lang/String;", "ZERO", "ONE", "SRC_COLOR", "ONE_MINUS_SRC_COLOR", "DST_COLOR", "ONE_MINUS_DST_COLOR", "SRC_ALPHA", "ONE_MINUS_SRC_ALPHA", "DST_ALPHA", "ONE_MINUS_DST_ALPHA", "Companion", "universalcraft" })
public enum Param
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final String mcStr;
    private final int glId;
    @NotNull
    private static final Map<Integer, Param> byGlId;
    public static final enum Param ZERO;
    public static final enum Param ONE;
    public static final enum Param SRC_COLOR;
    public static final enum Param ONE_MINUS_SRC_COLOR;
    public static final enum Param DST_COLOR;
    public static final enum Param ONE_MINUS_DST_COLOR;
    public static final enum Param SRC_ALPHA;
    public static final enum Param ONE_MINUS_SRC_ALPHA;
    public static final enum Param DST_ALPHA;
    public static final enum Param ONE_MINUS_DST_ALPHA;
    private static final /* synthetic */ Param[] $VALUES;
    
    private Param(final String $enum$name, final int $enum$ordinal, final String mcStr, final int glId) {
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
    
    public static Param[] values() {
        return Param.$VALUES.clone();
    }
    
    public static Param valueOf(final String value) {
        return Enum.valueOf(Param.class, value);
    }
    
    private static final /* synthetic */ Param[] $values() {
        return new Param[] { Param.ZERO, Param.ONE, Param.SRC_COLOR, Param.ONE_MINUS_SRC_COLOR, Param.DST_COLOR, Param.ONE_MINUS_DST_COLOR, Param.SRC_ALPHA, Param.ONE_MINUS_SRC_ALPHA, Param.DST_ALPHA, Param.ONE_MINUS_DST_ALPHA };
    }
    
    @JvmStatic
    @Nullable
    public static final Param fromGl(final int glId) {
        return Param.Companion.fromGl(glId);
    }
    
    public static final /* synthetic */ Map access$getByGlId$cp() {
        return Param.byGlId;
    }
    
    static {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: ldc             "ZERO"
        //     6: iconst_0       
        //     7: ldc             "0"
        //     9: iconst_0       
        //    10: invokespecial   gg/essential/universal/shader/BlendState$Param.<init>:(Ljava/lang/String;ILjava/lang/String;I)V
        //    13: putstatic       gg/essential/universal/shader/BlendState$Param.ZERO:Lgg/essential/universal/shader/BlendState$Param;
        //    16: new             Lgg/essential/universal/shader/BlendState$Param;
        //    19: dup            
        //    20: ldc             "ONE"
        //    22: iconst_1       
        //    23: ldc             "1"
        //    25: iconst_1       
        //    26: invokespecial   gg/essential/universal/shader/BlendState$Param.<init>:(Ljava/lang/String;ILjava/lang/String;I)V
        //    29: putstatic       gg/essential/universal/shader/BlendState$Param.ONE:Lgg/essential/universal/shader/BlendState$Param;
        //    32: new             Lgg/essential/universal/shader/BlendState$Param;
        //    35: dup            
        //    36: ldc             "SRC_COLOR"
        //    38: iconst_2       
        //    39: ldc             "srccolor"
        //    41: sipush          768
        //    44: invokespecial   gg/essential/universal/shader/BlendState$Param.<init>:(Ljava/lang/String;ILjava/lang/String;I)V
        //    47: putstatic       gg/essential/universal/shader/BlendState$Param.SRC_COLOR:Lgg/essential/universal/shader/BlendState$Param;
        //    50: new             Lgg/essential/universal/shader/BlendState$Param;
        //    53: dup            
        //    54: ldc             "ONE_MINUS_SRC_COLOR"
        //    56: iconst_3       
        //    57: ldc             "1-srccolor"
        //    59: sipush          769
        //    62: invokespecial   gg/essential/universal/shader/BlendState$Param.<init>:(Ljava/lang/String;ILjava/lang/String;I)V
        //    65: putstatic       gg/essential/universal/shader/BlendState$Param.ONE_MINUS_SRC_COLOR:Lgg/essential/universal/shader/BlendState$Param;
        //    68: new             Lgg/essential/universal/shader/BlendState$Param;
        //    71: dup            
        //    72: ldc             "DST_COLOR"
        //    74: iconst_4       
        //    75: ldc             "dstcolor"
        //    77: sipush          774
        //    80: invokespecial   gg/essential/universal/shader/BlendState$Param.<init>:(Ljava/lang/String;ILjava/lang/String;I)V
        //    83: putstatic       gg/essential/universal/shader/BlendState$Param.DST_COLOR:Lgg/essential/universal/shader/BlendState$Param;
        //    86: new             Lgg/essential/universal/shader/BlendState$Param;
        //    89: dup            
        //    90: ldc             "ONE_MINUS_DST_COLOR"
        //    92: iconst_5       
        //    93: ldc             "1-dstcolor"
        //    95: sipush          775
        //    98: invokespecial   gg/essential/universal/shader/BlendState$Param.<init>:(Ljava/lang/String;ILjava/lang/String;I)V
        //   101: putstatic       gg/essential/universal/shader/BlendState$Param.ONE_MINUS_DST_COLOR:Lgg/essential/universal/shader/BlendState$Param;
        //   104: new             Lgg/essential/universal/shader/BlendState$Param;
        //   107: dup            
        //   108: ldc             "SRC_ALPHA"
        //   110: bipush          6
        //   112: ldc             "srcalpha"
        //   114: sipush          770
        //   117: invokespecial   gg/essential/universal/shader/BlendState$Param.<init>:(Ljava/lang/String;ILjava/lang/String;I)V
        //   120: putstatic       gg/essential/universal/shader/BlendState$Param.SRC_ALPHA:Lgg/essential/universal/shader/BlendState$Param;
        //   123: new             Lgg/essential/universal/shader/BlendState$Param;
        //   126: dup            
        //   127: ldc             "ONE_MINUS_SRC_ALPHA"
        //   129: bipush          7
        //   131: ldc             "1-srcalpha"
        //   133: sipush          771
        //   136: invokespecial   gg/essential/universal/shader/BlendState$Param.<init>:(Ljava/lang/String;ILjava/lang/String;I)V
        //   139: putstatic       gg/essential/universal/shader/BlendState$Param.ONE_MINUS_SRC_ALPHA:Lgg/essential/universal/shader/BlendState$Param;
        //   142: new             Lgg/essential/universal/shader/BlendState$Param;
        //   145: dup            
        //   146: ldc             "DST_ALPHA"
        //   148: bipush          8
        //   150: ldc             "dstalpha"
        //   152: sipush          772
        //   155: invokespecial   gg/essential/universal/shader/BlendState$Param.<init>:(Ljava/lang/String;ILjava/lang/String;I)V
        //   158: putstatic       gg/essential/universal/shader/BlendState$Param.DST_ALPHA:Lgg/essential/universal/shader/BlendState$Param;
        //   161: new             Lgg/essential/universal/shader/BlendState$Param;
        //   164: dup            
        //   165: ldc             "ONE_MINUS_DST_ALPHA"
        //   167: bipush          9
        //   169: ldc             "1-dstalpha"
        //   171: sipush          773
        //   174: invokespecial   gg/essential/universal/shader/BlendState$Param.<init>:(Ljava/lang/String;ILjava/lang/String;I)V
        //   177: putstatic       gg/essential/universal/shader/BlendState$Param.ONE_MINUS_DST_ALPHA:Lgg/essential/universal/shader/BlendState$Param;
        //   180: invokestatic    gg/essential/universal/shader/BlendState$Param.$values:()[Lgg/essential/universal/shader/BlendState$Param;
        //   183: putstatic       gg/essential/universal/shader/BlendState$Param.$VALUES:[Lgg/essential/universal/shader/BlendState$Param;
        //   186: new             Lgg/essential/universal/shader/BlendState$Param$Companion;
        //   189: dup            
        //   190: aconst_null    
        //   191: invokespecial   gg/essential/universal/shader/BlendState$Param$Companion.<init>:(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   194: putstatic       gg/essential/universal/shader/BlendState$Param.Companion:Lgg/essential/universal/shader/BlendState$Param$Companion;
        //   197: invokestatic    gg/essential/universal/shader/BlendState$Param.values:()[Lgg/essential/universal/shader/BlendState$Param;
        //   200: astore_0        /* $this$associateBy$iv */
        //   201: iconst_0       
        //   202: istore_1        /* $i$f$associateBy */
        //   203: aload_0         /* $this$associateBy$iv */
        //   204: arraylength    
        //   205: invokestatic    kotlin/collections/MapsKt.mapCapacity:(I)I
        //   208: bipush          16
        //   210: invokestatic    kotlin/ranges/RangesKt.coerceAtLeast:(II)I
        //   213: istore_2        /* capacity$iv */
        //   214: aload_0         /* $this$associateBy$iv */
        //   215: astore_3       
        //   216: new             Ljava/util/LinkedHashMap;
        //   219: dup            
        //   220: iload_2         /* capacity$iv */
        //   221: invokespecial   java/util/LinkedHashMap.<init>:(I)V
        //   224: checkcast       Ljava/util/Map;
        //   227: astore          destination$iv$iv
        //   229: iconst_0       
        //   230: istore          $i$f$associateByTo
        //   232: aload_3         /* $this$associateByTo$iv$iv */
        //   233: astore          6
        //   235: aload           6
        //   237: arraylength    
        //   238: istore          7
        //   240: iconst_0       
        //   241: istore          8
        //   243: iload           8
        //   245: iload           7
        //   247: if_icmpge       293
        //   250: aload           6
        //   252: iload           8
        //   254: aaload         
        //   255: astore          element$iv$iv
        //   257: aload           destination$iv$iv
        //   259: aload           element$iv$iv
        //   261: astore          10
        //   263: astore          12
        //   265: iconst_0       
        //   266: istore          $i$a$-associateBy-BlendState$Param$Companion$byGlId$1
        //   268: aload           it
        //   270: invokevirtual   gg/essential/universal/shader/BlendState$Param.getGlId$universalcraft:()I
        //   273: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   276: aload           12
        //   278: swap           
        //   279: aload           element$iv$iv
        //   281: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   286: pop            
        //   287: iinc            8, 1
        //   290: goto            243
        //   293: aload           destination$iv$iv
        //   295: nop            
        //   296: putstatic       gg/essential/universal/shader/BlendState$Param.byGlId:Ljava/util/Map;
        //   299: return         
        //    StackMapTable: 00 02 FF 00 F3 00 09 07 00 4A 01 01 07 00 4A 07 00 AD 01 07 00 4A 01 01 00 00 31
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
                                                       \u0000¨\u0006	""" }, d2 = { "Lgg/essential/universal/shader/BlendState$Param$Companion;", "", "()V", "byGlId", "", "", "Lgg/essential/universal/shader/BlendState$Param;", "fromGl", "glId", "universalcraft" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @JvmStatic
        @Nullable
        public final Param fromGl(final int glId) {
            return Param.access$getByGlId$cp().get(glId);
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
