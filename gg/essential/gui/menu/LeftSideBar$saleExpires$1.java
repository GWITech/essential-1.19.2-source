package gg.essential.gui.menu;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\b
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000\u0010\u0000\u001a\u00020\u0001H
                                                   ¢\u0006\u0002\b\u0002""" }, d2 = { "<anonymous>", "", "invoke" })
static final class LeftSideBar$saleExpires$1 extends Lambda implements Function0<String> {
    final /* synthetic */ LeftSideBar this$0;
    
    LeftSideBar$saleExpires$1(final LeftSideBar $receiver) {
        this.this$0 = $receiver;
        super(0);
    }
    
    @NotNull
    public final String invoke() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        gg/essential/gui/menu/LeftSideBar$saleExpires$1.this$0:Lgg/essential/gui/menu/LeftSideBar;
        //     4: invokestatic    gg/essential/gui/menu/LeftSideBar.access$getSale$p:(Lgg/essential/gui/menu/LeftSideBar;)Lgg/essential/elementa/state/MappedState;
        //     7: invokevirtual   gg/essential/elementa/state/MappedState.get:()Ljava/lang/Object;
        //    10: checkcast       Lgg/essential/gui/state/Sale;
        //    13: dup            
        //    14: ifnonnull       21
        //    17: pop            
        //    18: ldc             ""
        //    20: areturn        
        //    21: astore_1        /* sale */
        //    22: invokestatic    java/time/Instant.now:()Ljava/time/Instant;
        //    25: checkcast       Ljava/time/temporal/Temporal;
        //    28: aload_1         /* sale */
        //    29: invokevirtual   gg/essential/gui/state/Sale.getExpiration:()Ljava/time/Instant;
        //    32: checkcast       Ljava/time/temporal/Temporal;
        //    35: invokestatic    java/time/Duration.between:(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)Ljava/time/Duration;
        //    38: dup            
        //    39: ldc             "between(Instant.now(), sale.expiration)"
        //    41: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    44: astore_2       
        //    45: aload_2        
        //    46: invokevirtual   java/time/Duration.getSeconds:()J
        //    49: getstatic       kotlin/time/DurationUnit.SECONDS:Lkotlin/time/DurationUnit;
        //    52: invokestatic    kotlin/time/DurationKt.toDuration:(JLkotlin/time/DurationUnit;)J
        //    55: aload_2        
        //    56: invokevirtual   java/time/Duration.getNano:()I
        //    59: getstatic       kotlin/time/DurationUnit.NANOSECONDS:Lkotlin/time/DurationUnit;
        //    62: invokestatic    kotlin/time/DurationKt.toDuration:(ILkotlin/time/DurationUnit;)J
        //    65: invokestatic    kotlin/time/Duration.plus-LRDsOJo:(JJ)J
        //    68: lstore_2        /* arg0$iv */
        //    69: lload_2         /* arg0$iv */
        //    70: invokestatic    kotlin/time/Duration.getInWholeDays-impl:(J)J
        //    73: lload_2         /* arg0$iv */
        //    74: invokestatic    kotlin/time/Duration.getHoursComponent-impl:(J)I
        //    77: lload_2         /* arg0$iv */
        //    78: invokestatic    kotlin/time/Duration.getMinutesComponent-impl:(J)I
        //    81: lload_2         /* arg0$iv */
        //    82: invokestatic    kotlin/time/Duration.getSecondsComponent-impl:(J)I
        //    85: pop            
        //    86: lload_2         /* arg0$iv */
        //    87: invokestatic    kotlin/time/Duration.getNanosecondsComponent-impl:(J)I
        //    90: pop            
        //    91: istore          4
        //    93: istore          5
        //    95: lstore          days
        //    97: new             Ljava/lang/StringBuilder;
        //   100: dup            
        //   101: invokespecial   java/lang/StringBuilder.<init>:()V
        //   104: astore          8
        //   106: aload           8
        //   108: astore          $this$invoke_u24lambda_u2d1_u24lambda_u2d0
        //   110: lload           days
        //   112: lconst_0       
        //   113: lcmp           
        //   114: ifle            130
        //   117: aload           $this$invoke_u24lambda_u2d1_u24lambda_u2d0
        //   119: lload           days
        //   121: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(J)Ljava/lang/String;
        //   126: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   129: pop            
        //   130: lload           days
        //   132: ldc2_w          10
        //   135: lcmp           
        //   136: ifge            157
        //   139: iload           hours
        //   141: ifle            157
        //   144: aload           $this$invoke_u24lambda_u2d1_u24lambda_u2d0
        //   146: iload           hours
        //   148: invokedynamic   BootstrapMethod #1, makeConcatWithConstants:(I)Ljava/lang/String;
        //   153: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   156: pop            
        //   157: lload           days
        //   159: lconst_0       
        //   160: lcmp           
        //   161: ifne            182
        //   164: iload           minutes
        //   166: ifle            182
        //   169: aload           $this$invoke_u24lambda_u2d1_u24lambda_u2d0
        //   171: iload           minutes
        //   173: invokedynamic   BootstrapMethod #2, makeConcatWithConstants:(I)Ljava/lang/String;
        //   178: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   181: pop            
        //   182: aload           $this$invoke_u24lambda_u2d1_u24lambda_u2d0
        //   184: ldc             "left"
        //   186: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   189: pop            
        //   190: aload           8
        //   192: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   195: dup            
        //   196: ldc             "StringBuilder().apply(builderAction).toString()"
        //   198: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   201: areturn        
        //    StackMapTable: 00 04 FF 00 15 00 00 00 01 07 00 35 FF 00 6C 00 09 00 00 00 00 01 01 04 07 00 82 07 00 82 00 00 FF 00 1A 00 09 00 00 00 00 01 00 04 07 00 82 07 00 82 00 00 FF 00 18 00 0A 00 00 00 00 00 00 00 00 07 00 82 07 00 82 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke() {
        return this.invoke();
    }
}