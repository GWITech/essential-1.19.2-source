package gg.essential.gui.common;

import gg.essential.elementa.components.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.concurrent.*;
import gg.essential.elementa.state.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000,
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0010	
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\r\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020	¢\u0006\u0002\u0010
                                                   R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002
                                                   \u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r¢\u0006\b
                                                   \u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\r¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020	¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a""" }, d2 = { "Lgg/essential/gui/common/SequenceAnimatedUIImage;", "Lgg/essential/elementa/components/UIContainer;", "location", "", "frameCount", "", "delay", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(Ljava/lang/String;IJLjava/util/concurrent/TimeUnit;)V", "activeTimer", "currentFrame", "Lgg/essential/elementa/state/BasicState;", "getCurrentFrame", "()Lgg/essential/elementa/state/BasicState;", "getDelay", "()J", "getFrameCount", "()I", "frameDelay", "getFrameDelay", "getLocation", "()Ljava/lang/String;", "getTimeUnit", "()Ljava/util/concurrent/TimeUnit;", "essential" })
public final class SequenceAnimatedUIImage extends UIContainer
{
    @NotNull
    private final String location;
    @NotNull
    private final TimeUnit timeUnit;
    @NotNull
    private final BasicState<Integer> currentFrame;
    @NotNull
    private final BasicState<Long> frameDelay;
    private int activeTimer;
    
    public SequenceAnimatedUIImage(@NotNull final String location, @NotNull final TimeUnit timeUnit) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "location"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* timeUnit */
        //     7: ldc             "timeUnit"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    16: aload_0         /* this */
        //    17: aload_1         /* location */
        //    18: putfield        gg/essential/gui/common/SequenceAnimatedUIImage.location:Ljava/lang/String;
        //    21: aload_0         /* this */
        //    22: aload_2         /* timeUnit */
        //    23: putfield        gg/essential/gui/common/SequenceAnimatedUIImage.timeUnit:Ljava/util/concurrent/TimeUnit;
        //    26: aload_0         /* this */
        //    27: new             Lgg/essential/elementa/state/BasicState;
        //    30: dup            
        //    31: iconst_0       
        //    32: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    35: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    38: putfield        gg/essential/gui/common/SequenceAnimatedUIImage.currentFrame:Lgg/essential/elementa/state/BasicState;
        //    41: aload_0         /* this */
        //    42: new             Lgg/essential/elementa/state/BasicState;
        //    45: dup            
        //    46: lconst_1       
        //    47: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    50: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    53: putfield        gg/essential/gui/common/SequenceAnimatedUIImage.frameDelay:Lgg/essential/elementa/state/BasicState;
        //    56: aload_0         /* this */
        //    57: iconst_m1      
        //    58: putfield        gg/essential/gui/common/SequenceAnimatedUIImage.activeTimer:I
        //    61: iconst_0       
        //    62: istore          4
        //    64: iconst_4       
        //    65: anewarray       Lgg/essential/elementa/components/UIImage;
        //    68: astore          5
        //    70: iload           4
        //    72: iconst_4       
        //    73: if_icmpge       257
        //    76: iload           4
        //    78: istore          6
        //    80: aload           5
        //    82: iload           6
        //    84: getstatic       gg/essential/elementa/components/UIImage.Companion:Lgg/essential/elementa/components/UIImage$Companion;
        //    87: aload_0         /* this */
        //    88: getfield        gg/essential/gui/common/SequenceAnimatedUIImage.location:Ljava/lang/String;
        //    91: astore          7
        //    93: iconst_1       
        //    94: anewarray       Ljava/lang/Object;
        //    97: astore          8
        //    99: aload           8
        //   101: iconst_0       
        //   102: iload           6
        //   104: iconst_1       
        //   105: iadd           
        //   106: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   109: aastore        
        //   110: aload           8
        //   112: astore          8
        //   114: aload           7
        //   116: aload           8
        //   118: iconst_1       
        //   119: invokestatic    java/util/Arrays.copyOf:([Ljava/lang/Object;I)[Ljava/lang/Object;
        //   122: invokestatic    java/lang/String.format:(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
        //   125: dup            
        //   126: ldc             "format(this, *args)"
        //   128: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   131: invokevirtual   gg/essential/elementa/components/UIImage$Companion.ofResourceCached:(Ljava/lang/String;)Lgg/essential/elementa/components/UIImage;
        //   134: checkcast       Lgg/essential/elementa/UIComponent;
        //   137: astore          $this$constrain$iv
        //   139: aload           $this$constrain$iv
        //   141: astore          9
        //   143: aload           9
        //   145: astore          $this$constrain_u24lambda_u2d0$iv
        //   147: aload           $this$constrain_u24lambda_u2d0$iv
        //   149: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   152: astore          11
        //   154: istore          13
        //   156: astore          12
        //   158: aload           $this$_init__u24lambda_u2d0
        //   160: bipush          100
        //   162: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   165: checkcast       Ljava/lang/Number;
        //   168: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   171: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   174: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   177: aload           $this$_init__u24lambda_u2d0
        //   179: bipush          100
        //   181: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   184: checkcast       Ljava/lang/Number;
        //   187: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   190: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   193: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   196: aload           12
        //   198: iload           13
        //   200: aload           9
        //   202: astore          null
        //   204: aload           7
        //   206: checkcast       Lgg/essential/elementa/components/UIImage;
        //   209: astore          8
        //   211: istore          13
        //   213: astore          12
        //   215: aload           $this$_init__u24lambda_u2d1
        //   217: new             Lgg/essential/gui/common/AutoImageSize;
        //   220: dup            
        //   221: aload_0         /* this */
        //   222: checkcast       Lgg/essential/elementa/UIComponent;
        //   225: invokespecial   gg/essential/gui/common/AutoImageSize.<init>:(Lgg/essential/elementa/UIComponent;)V
        //   228: checkcast       Lgg/essential/elementa/components/image/CacheableImage;
        //   231: invokevirtual   gg/essential/elementa/components/UIImage.supply:(Lgg/essential/elementa/components/image/CacheableImage;)V
        //   234: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //   237: pop            
        //   238: aload           12
        //   240: iload           13
        //   242: aload           7
        //   244: checkcast       Lgg/essential/elementa/components/UIImage;
        //   247: aastore        
        //   248: iload           4
        //   250: iconst_1       
        //   251: iadd           
        //   252: istore          4
        //   254: goto            70
        //   257: aload           5
        //   259: astore_3        /* frames */
        //   260: aload_0         /* this */
        //   261: getfield        gg/essential/gui/common/SequenceAnimatedUIImage.currentFrame:Lgg/essential/elementa/state/BasicState;
        //   264: checkcast       Lgg/essential/elementa/state/State;
        //   267: new             Lgg/essential/gui/common/SequenceAnimatedUIImage$1;
        //   270: dup            
        //   271: aload_0         /* this */
        //   272: aload_3         /* frames */
        //   273: invokespecial   gg/essential/gui/common/SequenceAnimatedUIImage$1.<init>:(Lgg/essential/gui/common/SequenceAnimatedUIImage;[Lgg/essential/elementa/components/UIImage;)V
        //   276: checkcast       Lkotlin/jvm/functions/Function1;
        //   279: invokestatic    gg/essential/gui/common/StateExtensionsKt.onSetValueAndNow:(Lgg/essential/elementa/state/State;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //   282: pop            
        //   283: aload_0         /* this */
        //   284: getfield        gg/essential/gui/common/SequenceAnimatedUIImage.frameDelay:Lgg/essential/elementa/state/BasicState;
        //   287: new             Lgg/essential/gui/common/SequenceAnimatedUIImage$2;
        //   290: dup            
        //   291: aload_0         /* this */
        //   292: invokespecial   gg/essential/gui/common/SequenceAnimatedUIImage$2.<init>:(Lgg/essential/gui/common/SequenceAnimatedUIImage;)V
        //   295: checkcast       Lkotlin/jvm/functions/Function1;
        //   298: invokevirtual   gg/essential/elementa/state/BasicState.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //   301: pop            
        //   302: aload_0         /* this */
        //   303: getfield        gg/essential/gui/common/SequenceAnimatedUIImage.frameDelay:Lgg/essential/elementa/state/BasicState;
        //   306: aload_0         /* this */
        //   307: getfield        gg/essential/gui/common/SequenceAnimatedUIImage.timeUnit:Ljava/util/concurrent/TimeUnit;
        //   310: ldc2_w          1000
        //   313: invokevirtual   java/util/concurrent/TimeUnit.toMillis:(J)J
        //   316: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   319: invokevirtual   gg/essential/elementa/state/BasicState.set:(Ljava/lang/Object;)V
        //   322: return         
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  location  
        //  timeUnit  
        //    StackMapTable: 00 02 FF 00 46 00 06 07 00 02 00 00 00 01 07 00 5D 00 00 FF 00 BA 00 06 07 00 02 00 00 00 00 07 00 5D 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final BasicState<Integer> getCurrentFrame() {
        return this.currentFrame;
    }
    
    public static final /* synthetic */ int access$getActiveTimer$p(final SequenceAnimatedUIImage $this) {
        return $this.activeTimer;
    }
    
    public static final /* synthetic */ void access$setActiveTimer$p(final SequenceAnimatedUIImage $this, final int <set-?>) {
        $this.activeTimer = <set-?>;
    }
}
