package gg.essential.gui.common;

import gg.essential.elementa.components.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.*;
import gg.essential.elementa.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000\u0012
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b""" }, d2 = { "Lgg/essential/gui/common/ScrollSpacer;", "Lgg/essential/elementa/components/UIContainer;", "top", "", "(Z)V", "getTop", "()Z", "Companion", "essential" })
public final class ScrollSpacer extends UIContainer
{
    @NotNull
    public static final Companion Companion;
    private final boolean top;
    @NotNull
    private static final Comparator<UIComponent> comparator;
    
    public ScrollSpacer(final boolean top) {
        super();
        this.top = top;
    }
    
    public final boolean getTop() {
        return this.top;
    }
    
    public static final /* synthetic */ Comparator access$getComparator$cp() {
        return ScrollSpacer.comparator;
    }
    
    static {
        Companion = new Companion((byte)0);
        comparator = new Comparator<Object>() {
            public ScrollSpacer$special$$inlined$compareBy$1() {
                super();
            }
            
            @Override
            public final int compare(final T a, final T b) {
                // 
                // This method could not be decompiled.
                // 
                // Original Bytecode:
                // 
                //     1: checkcast       Lgg/essential/elementa/UIComponent;
                //     4: astore_3        /* it */
                //     5: aload_3         /* it */
                //     6: instanceof      Lgg/essential/gui/common/ScrollSpacer;
                //     9: ifeq            36
                //    12: aload_3         /* it */
                //    13: checkcast       Lgg/essential/gui/common/ScrollSpacer;
                //    16: invokevirtual   gg/essential/gui/common/ScrollSpacer.getTop:()Z
                //    19: ifeq            26
                //    22: iconst_m1      
                //    23: goto            27
                //    26: iconst_1       
                //    27: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
                //    30: checkcast       Ljava/lang/Comparable;
                //    33: goto            43
                //    36: iconst_0       
                //    37: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
                //    40: checkcast       Ljava/lang/Comparable;
                //    43: aload_2         /* b */
                //    44: checkcast       Lgg/essential/elementa/UIComponent;
                //    47: astore_3       
                //    48: astore          4
                //    50: aload_3         /* it */
                //    51: instanceof      Lgg/essential/gui/common/ScrollSpacer;
                //    54: ifeq            81
                //    57: aload_3         /* it */
                //    58: checkcast       Lgg/essential/gui/common/ScrollSpacer;
                //    61: invokevirtual   gg/essential/gui/common/ScrollSpacer.getTop:()Z
                //    64: ifeq            71
                //    67: iconst_m1      
                //    68: goto            72
                //    71: iconst_1       
                //    72: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
                //    75: checkcast       Ljava/lang/Comparable;
                //    78: goto            88
                //    81: iconst_0       
                //    82: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
                //    85: checkcast       Ljava/lang/Comparable;
                //    88: aload           4
                //    90: swap           
                //    91: invokestatic    kotlin/comparisons/ComparisonsKt.compareValues:(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
                //    94: ireturn        
                //    Signature:
                //  (TT;TT;)I
                //    MethodParameters:
                //  Name  Flags  
                //  ----  -----
                //  a     
                //  b     
                //    StackMapTable: 00 08 FF 00 1A 00 03 00 00 07 00 05 00 00 40 01 08 46 07 00 36 FF 00 1B 00 05 00 00 00 00 07 00 36 00 00 40 01 08 46 07 00 36
                // 
                throw new IllegalStateException("An error occurred while decompiling this method.");
            }
        };
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u001c
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0007\u0010\b¨\u0006	""" }, d2 = { "Lgg/essential/gui/common/ScrollSpacer$Companion;", "", "()V", "comparator", "Ljava/util/Comparator;", "Lgg/essential/elementa/UIComponent;", "Lkotlin/Comparator;", "getComparator", "()Ljava/util/Comparator;", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final Comparator<UIComponent> getComparator() {
            return ScrollSpacer.access$getComparator$cp();
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
