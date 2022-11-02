package gg.essential.universal.shader;

import kotlin.*;
import net.minecraft.client.gl.*;
import kotlin.jvm.internal.*;
import gg.essential.universal.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.*;
import org.lwjgl.opengl.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000>
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u0000
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u000b
                                                   \u0002\b	
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u000b
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0002\b\u0005\b\u0086\b\u0018\u0000 +2\u00020\u0001:\u0004+,-.B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010	\u001a\u00020
                                                   ¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u001cH\u0002J	\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J	\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J	\u0010 \u001a\u00020\u0005H\u00c6\u0003J	\u0010!\u001a\u00020\u0005H\u00c6\u0003J	\u0010"\u001a\u00020\u0005H\u00c6\u0003J	\u0010#\u001a\u00020
                                                   H\u00c6\u0003JE\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010	\u001a\u00020
                                                   H\u00c6\u0001J\u0013\u0010%\u001a\u00020
                                                   2\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J	\u0010'\u001a\u00020(H\u00d6\u0001J	\u0010)\u001a\u00020*H\u00d6\u0001R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010	\u001a\u00020
                                                   ¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020
                                                   ¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0019\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\u001a\u0010¨\u0006/""" }, d2 = { "Lgg/essential/universal/shader/BlendState;", "", "equation", "Lgg/essential/universal/shader/BlendState$Equation;", "srcRgb", "Lgg/essential/universal/shader/BlendState$Param;", "dstRgb", "srcAlpha", "dstAlpha", "enabled", "", "(Lgg/essential/universal/shader/BlendState$Equation;Lgg/essential/universal/shader/BlendState$Param;Lgg/essential/universal/shader/BlendState$Param;Lgg/essential/universal/shader/BlendState$Param;Lgg/essential/universal/shader/BlendState$Param;Z)V", "getDstAlpha", "()Lgg/essential/universal/shader/BlendState$Param;", "getDstRgb", "getEnabled", "()Z", "getEquation", "()Lgg/essential/universal/shader/BlendState$Equation;", "mc", "Lnet/minecraft/client/gl/GlBlendState;", "getMc", "()Lnet/minecraft/client/gl/GlBlendState;", "separate", "getSeparate", "getSrcAlpha", "getSrcRgb", "activate", "", "applyState", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "Equation", "McBlendState", "Param", "universalcraft" })
public final class BlendState
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final Equation equation;
    @NotNull
    private final Param srcRgb;
    @NotNull
    private final Param dstRgb;
    @NotNull
    private final Param srcAlpha;
    @NotNull
    private final Param dstAlpha;
    private final boolean enabled;
    private final boolean separate;
    @NotNull
    private final GlBlendState mc;
    @JvmField
    @NotNull
    public static final BlendState DISABLED;
    @JvmField
    @NotNull
    public static final BlendState NORMAL;
    
    public BlendState(@NotNull final Equation equation, @NotNull final Param srcRgb, @NotNull final Param dstRgb, @NotNull final Param srcAlpha, @NotNull final Param dstAlpha, final boolean enabled) {
        Intrinsics.checkNotNullParameter((Object)equation, "equation");
        Intrinsics.checkNotNullParameter((Object)srcRgb, "srcRgb");
        Intrinsics.checkNotNullParameter((Object)dstRgb, "dstRgb");
        Intrinsics.checkNotNullParameter((Object)srcAlpha, "srcAlpha");
        Intrinsics.checkNotNullParameter((Object)dstAlpha, "dstAlpha");
        super();
        this.equation = equation;
        this.srcRgb = srcRgb;
        this.dstRgb = dstRgb;
        this.srcAlpha = srcAlpha;
        this.dstAlpha = dstAlpha;
        this.enabled = enabled;
        this.separate = (this.srcRgb != this.srcAlpha || this.dstRgb != this.dstAlpha);
        this.mc = (this.enabled ? (this.separate ? new McBlendState(this.srcRgb.getGlId$universalcraft(), this.dstRgb.getGlId$universalcraft(), this.srcAlpha.getGlId$universalcraft(), this.dstAlpha.getGlId$universalcraft(), this.equation.getGlId$universalcraft()) : new McBlendState(this.srcRgb.getGlId$universalcraft(), this.dstRgb.getGlId$universalcraft(), this.equation.getGlId$universalcraft())) : ((GlBlendState)new McBlendState()));
    }
    
    public BlendState(final Equation equation, final Param srcRgb, final Param dstRgb, Param srcAlpha, Param dstAlpha, boolean enabled, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x8) != 0x0) {
            srcAlpha = srcRgb;
        }
        if ((n & 0x10) != 0x0) {
            dstAlpha = dstRgb;
        }
        if ((n & 0x20) != 0x0) {
            enabled = true;
        }
        this(equation, srcRgb, dstRgb, srcAlpha, dstAlpha, enabled);
    }
    
    @NotNull
    public final Equation getEquation() {
        return this.equation;
    }
    
    @NotNull
    public final Param getSrcRgb() {
        return this.srcRgb;
    }
    
    @NotNull
    public final Param getDstRgb() {
        return this.dstRgb;
    }
    
    @NotNull
    public final Param getSrcAlpha() {
        return this.srcAlpha;
    }
    
    @NotNull
    public final Param getDstAlpha() {
        return this.dstAlpha;
    }
    
    public final boolean getEnabled() {
        return this.enabled;
    }
    
    public final boolean getSeparate() {
        return this.separate;
    }
    
    @NotNull
    public final GlBlendState getMc() {
        return this.mc;
    }
    
    public final void activate() {
        this.mc.enable();
    }
    
    private final void applyState() {
        if (this.enabled) {
            UGraphics.enableBlend();
        }
        else {
            UGraphics.disableBlend();
        }
        UGraphics.blendEquation(this.equation.getGlId$universalcraft());
        UGraphics.tryBlendFuncSeparate(this.srcRgb.getGlId$universalcraft(), this.dstRgb.getGlId$universalcraft(), this.srcAlpha.getGlId$universalcraft(), this.dstAlpha.getGlId$universalcraft());
    }
    
    @NotNull
    public final Equation component1() {
        return this.equation;
    }
    
    @NotNull
    public final Param component2() {
        return this.srcRgb;
    }
    
    @NotNull
    public final Param component3() {
        return this.dstRgb;
    }
    
    @NotNull
    public final Param component4() {
        return this.srcAlpha;
    }
    
    @NotNull
    public final Param component5() {
        return this.dstAlpha;
    }
    
    public final boolean component6() {
        return this.enabled;
    }
    
    @NotNull
    public final BlendState copy(@NotNull final Equation equation, @NotNull final Param srcRgb, @NotNull final Param dstRgb, @NotNull final Param srcAlpha, @NotNull final Param dstAlpha, final boolean enabled) {
        Intrinsics.checkNotNullParameter((Object)equation, "equation");
        Intrinsics.checkNotNullParameter((Object)srcRgb, "srcRgb");
        Intrinsics.checkNotNullParameter((Object)dstRgb, "dstRgb");
        Intrinsics.checkNotNullParameter((Object)srcAlpha, "srcAlpha");
        Intrinsics.checkNotNullParameter((Object)dstAlpha, "dstAlpha");
        return new BlendState(equation, srcRgb, dstRgb, srcAlpha, dstAlpha, enabled);
    }
    
    public static /* synthetic */ BlendState copy$default(final BlendState blendState, Equation equation, Param srcRgb, Param dstRgb, Param srcAlpha, Param dstAlpha, boolean enabled, final int n, final Object o) {
        if ((n & 0x1) != 0x0) {
            equation = blendState.equation;
        }
        if ((n & 0x2) != 0x0) {
            srcRgb = blendState.srcRgb;
        }
        if ((n & 0x4) != 0x0) {
            dstRgb = blendState.dstRgb;
        }
        if ((n & 0x8) != 0x0) {
            srcAlpha = blendState.srcAlpha;
        }
        if ((n & 0x10) != 0x0) {
            dstAlpha = blendState.dstAlpha;
        }
        if ((n & 0x20) != 0x0) {
            enabled = blendState.enabled;
        }
        return blendState.copy(equation, srcRgb, dstRgb, srcAlpha, dstAlpha, enabled);
    }
    
    @NotNull
    @Override
    public String toString() {
        return "BlendState(equation=" + this.equation + ", srcRgb=" + this.srcRgb + ", dstRgb=" + this.dstRgb + ", srcAlpha=" + this.srcAlpha + ", dstAlpha=" + this.dstAlpha + ", enabled=" + this.enabled;
    }
    
    @Override
    public int hashCode() {
        int result = this.equation.hashCode();
        result = result * 31 + this.srcRgb.hashCode();
        result = result * 31 + this.dstRgb.hashCode();
        result = result * 31 + this.srcAlpha.hashCode();
        result = result * 31 + this.dstAlpha.hashCode();
        final int n = result * 31;
        int enabled;
        if ((enabled = (this.enabled ? 1 : 0)) != 0) {
            enabled = 1;
        }
        result = n + enabled;
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlendState)) {
            return false;
        }
        final BlendState blendState = (BlendState)other;
        return this.equation == blendState.equation && this.srcRgb == blendState.srcRgb && this.dstRgb == blendState.dstRgb && this.srcAlpha == blendState.srcAlpha && this.dstAlpha == blendState.dstAlpha && this.enabled == blendState.enabled;
    }
    
    @JvmStatic
    @NotNull
    public static final BlendState active() {
        return BlendState.Companion.active();
    }
    
    public static final /* synthetic */ void access$applyState(final BlendState $this) {
        $this.applyState();
    }
    
    static {
        Companion = new Companion(null);
        DISABLED = new BlendState(Equation.ADD, Param.ONE, Param.ZERO, null, null, false, 24, null);
        NORMAL = new BlendState(Equation.ADD, Param.SRC_ALPHA, Param.ONE_MINUS_SRC_ALPHA, null, null, false, 56, null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u001a
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0010\b
                                                       \u0002\b\u0007
                                                       \u0002\u0010\u0002
                                                       \u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010\u0007B/\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010	\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0002\u0010
                                                       J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006""" }, d2 = { "Lgg/essential/universal/shader/BlendState$McBlendState;", "Lnet/minecraft/client/gl/GlBlendState;", "(Lgg/essential/universal/shader/BlendState;)V", "srcRgb", "", "dstRgb", "func", "(Lgg/essential/universal/shader/BlendState;III)V", "srcAlpha", "dstAlpha", "(Lgg/essential/universal/shader/BlendState;IIIII)V", "enable", "", "universalcraft" })
    private final class McBlendState extends GlBlendState
    {
        final /* synthetic */ BlendState this$0;
        
        public McBlendState(final BlendState this$0) {
            Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
            this.this$0 = this$0;
            super();
        }
        
        public McBlendState(final BlendState this$0, final int srcRgb, final int dstRgb, final int func) {
            Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
            this.this$0 = this$0;
            super(srcRgb, dstRgb, func);
        }
        
        public McBlendState(final BlendState this$0, final int srcRgb, final int dstRgb, final int srcAlpha, final int dstAlpha, final int func) {
            Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
            this.this$0 = this$0;
            super(srcRgb, dstRgb, srcAlpha, dstAlpha, func);
        }
        
        public void enable() {
            super.enable();
            BlendState.this.applyState();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0014
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                       \u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002
                                                       \u0000¨\u0006\u0007""" }, d2 = { "Lgg/essential/universal/shader/BlendState$Companion;", "", "()V", "DISABLED", "Lgg/essential/universal/shader/BlendState;", "NORMAL", "active", "universalcraft" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @JvmStatic
        @NotNull
        public final BlendState active() {
            Equation equation;
            if ((equation = Equation.Companion.fromGl(GL11.glGetInteger(32777))) == null) {
                equation = Equation.ADD;
            }
            Param srcRgb;
            if ((srcRgb = Param.Companion.fromGl(GL11.glGetInteger(32969))) == null) {
                srcRgb = Param.ONE;
            }
            Param dstRgb;
            if ((dstRgb = Param.Companion.fromGl(GL11.glGetInteger(32968))) == null) {
                dstRgb = Param.ZERO;
            }
            Param srcAlpha;
            if ((srcAlpha = Param.Companion.fromGl(GL11.glGetInteger(32971))) == null) {
                srcAlpha = Param.ONE;
            }
            Param dstAlpha;
            if ((dstAlpha = Param.Companion.fromGl(GL11.glGetInteger(32970))) == null) {
                dstAlpha = Param.ZERO;
            }
            return new BlendState(equation, srcRgb, dstRgb, srcAlpha, dstAlpha, GL11.glGetBoolean(3042));
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
    
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
}
