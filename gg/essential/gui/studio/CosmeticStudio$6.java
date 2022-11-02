package gg.essential.gui.studio;

import kotlin.jvm.internal.*;
import kotlin.jvm.functions.*;
import gg.essential.elementa.*;
import kotlin.*;
import org.jetbrains.annotations.*;

@Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48, d1 = { """
                                                   \u0000\u0018
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\f
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H
                                                   ¢\u0006\u0002\b\u0007""" }, d2 = { "<anonymous>", "", "Lgg/essential/elementa/UIComponent;", "typedChar", "", "keyCode", "", "invoke" })
static final class CosmeticStudio$6 extends Lambda implements Function3<UIComponent, Character, Integer, Unit> {
    final /* synthetic */ CosmeticStudio this$0;
    final /* synthetic */ Function3<UIComponent, Character, Integer, Unit> $defaultKeyBehavior;
    
    CosmeticStudio$6(final CosmeticStudio $receiver, final Function3<? super UIComponent, ? super Character, ? super Integer, Unit> $defaultKeyBehavior) {
        this.this$0 = $receiver;
        this.$defaultKeyBehavior = (Function3<UIComponent, Character, Integer, Unit>)$defaultKeyBehavior;
        super(3);
    }
    
    public final void invoke(@NotNull final UIComponent $this$onKeyType, final char typedChar, final int keyCode) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "$this$onKeyType"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: getfield        gg/essential/gui/studio/CosmeticStudio$6.this$0:Lgg/essential/gui/studio/CosmeticStudio;
        //    10: invokestatic    gg/essential/gui/studio/CosmeticStudio.access$getOptionsView:(Lgg/essential/gui/studio/CosmeticStudio;)Lgg/essential/elementa/components/ScrollComponent;
        //    13: invokevirtual   gg/essential/elementa/components/ScrollComponent.getAllChildren:()Ljava/util/concurrent/CopyOnWriteArrayList;
        //    16: checkcast       Ljava/lang/Iterable;
        //    19: astore          $this$filterIsInstance$iv
        //    21: aload           $this$filterIsInstance$iv
        //    23: astore          6
        //    25: new             Ljava/util/ArrayList;
        //    28: dup            
        //    29: invokespecial   java/util/ArrayList.<init>:()V
        //    32: checkcast       Ljava/util/Collection;
        //    35: astore          destination$iv$iv
        //    37: aload           $this$filterIsInstanceTo$iv$iv
        //    39: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    44: astore          9
        //    46: aload           9
        //    48: invokeinterface java/util/Iterator.hasNext:()Z
        //    53: ifeq            86
        //    56: aload           9
        //    58: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    63: astore          element$iv$iv
        //    65: aload           element$iv$iv
        //    67: instanceof      Lgg/essential/gui/studio/CosmeticOption;
        //    70: ifeq            46
        //    73: aload           destination$iv$iv
        //    75: aload           element$iv$iv
        //    77: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    82: pop            
        //    83: goto            46
        //    86: aload           destination$iv$iv
        //    88: checkcast       Ljava/util/List;
        //    91: checkcast       Ljava/lang/Iterable;
        //    94: astore          $this$filter$iv
        //    96: aload           $this$filter$iv
        //    98: astore          6
        //   100: new             Ljava/util/ArrayList;
        //   103: dup            
        //   104: invokespecial   java/util/ArrayList.<init>:()V
        //   107: checkcast       Ljava/util/Collection;
        //   110: astore          destination$iv$iv
        //   112: aload           $this$filterTo$iv$iv
        //   114: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   119: astore          9
        //   121: aload           9
        //   123: invokeinterface java/util/Iterator.hasNext:()Z
        //   128: ifeq            177
        //   131: aload           9
        //   133: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   138: astore          element$iv$iv
        //   140: aload           element$iv$iv
        //   142: checkcast       Lgg/essential/gui/studio/CosmeticOption;
        //   145: astore          child
        //   147: aload           child
        //   149: invokevirtual   gg/essential/gui/studio/CosmeticOption.getEditingPlacement:()Lgg/essential/elementa/state/BasicState;
        //   152: invokevirtual   gg/essential/elementa/state/BasicState.get:()Ljava/lang/Object;
        //   155: checkcast       Ljava/lang/Boolean;
        //   158: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   161: ifeq            121
        //   164: aload           destination$iv$iv
        //   166: aload           element$iv$iv
        //   168: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   173: pop            
        //   174: goto            121
        //   177: aload           destination$iv$iv
        //   179: checkcast       Ljava/util/List;
        //   182: astore          openPlacements
        //   184: aload           openPlacements
        //   186: checkcast       Ljava/util/Collection;
        //   189: invokeinterface java/util/Collection.isEmpty:()Z
        //   194: ifne            201
        //   197: iconst_1       
        //   198: goto            202
        //   201: iconst_0       
        //   202: ifeq            270
        //   205: iload_3         /* keyCode */
        //   206: getstatic       gg/essential/universal/UKeyboard.KEY_ESCAPE:I
        //   209: if_icmpne       270
        //   212: aload           openPlacements
        //   214: checkcast       Ljava/lang/Iterable;
        //   217: astore          $this$forEach$iv
        //   219: aload           $this$forEach$iv
        //   221: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   226: astore          6
        //   228: aload           6
        //   230: invokeinterface java/util/Iterator.hasNext:()Z
        //   235: ifeq            269
        //   238: aload           6
        //   240: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   245: astore          element$iv
        //   247: aload           element$iv
        //   249: checkcast       Lgg/essential/gui/studio/CosmeticOption;
        //   252: astore          it
        //   254: aload           it
        //   256: invokevirtual   gg/essential/gui/studio/CosmeticOption.getEditingPlacement:()Lgg/essential/elementa/state/BasicState;
        //   259: iconst_0       
        //   260: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   263: invokevirtual   gg/essential/elementa/state/BasicState.set:(Ljava/lang/Object;)V
        //   266: goto            228
        //   269: return         
        //   270: aload_0         /* this */
        //   271: getfield        gg/essential/gui/studio/CosmeticStudio$6.$defaultKeyBehavior:Lkotlin/jvm/functions/Function3;
        //   274: aload_1         /* $this$onKeyType */
        //   275: iload_2         /* typedChar */
        //   276: invokestatic    java/lang/Character.valueOf:(C)Ljava/lang/Character;
        //   279: iload_3         /* keyCode */
        //   280: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   283: invokeinterface kotlin/jvm/functions/Function3.invoke:(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   288: pop            
        //   289: return         
        //    MethodParameters:
        //  Name             Flags  
        //  ---------------  -----
        //  $this$onKeyType  
        //  typedChar        
        //  keyCode          
        //    StackMapTable: 00 09 FF 00 2E 00 0A 07 00 02 07 00 51 01 01 00 00 00 07 00 4B 00 07 00 53 00 00 F9 00 27 FD 00 22 00 07 00 53 F9 00 37 FF 00 17 00 05 07 00 02 07 00 51 01 01 07 00 63 00 00 40 01 FF 00 19 00 07 00 00 00 00 00 00 07 00 53 00 00 FF 00 28 00 00 00 00 FF 00 00 00 04 07 00 02 07 00 51 01 01 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public /* bridge */ Object invoke(final Object p1, final Object p2, final Object p3) {
        this.invoke((UIComponent)p1, (char)p2, ((Number)p3).intValue());
        return Unit.INSTANCE;
    }
}