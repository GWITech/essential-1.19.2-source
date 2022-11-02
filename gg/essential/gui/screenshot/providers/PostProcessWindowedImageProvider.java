package gg.essential.gui.screenshot.providers;

import gg.essential.gui.screenshot.downsampling.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.functions.*;
import kotlin.jvm.internal.*;
import java.nio.file.*;
import java.util.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000@
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0010 
                                                   \u0002\u0018\u0002
                                                   \u0002\b
                                                   
                                                   \u0002\u0010$
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010"
                                                   \u0002\b\u0002\u0018\u0000 \u001b2\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003:\u0001\u001bB0\u0012\u0010\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003\u0012\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\b\u0007¢\u0006\u0002\u0010\bJ0\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180
                                                   2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001aH\u0016R7\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0
                                                   2\f\u0010	\u001a\b\u0012\u0004\u0012\u00020\u000b0
                                                   8V@VX\u0096\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u000f\u0010\u0010"\u0004\b\u0011\u0010\u0012*\u0004\b\r\u0010\u000eR"\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006¢\u0006\u0002\b\u0007¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006\u001c""" }, d2 = { "Lgg/essential/gui/screenshot/providers/PostProcessWindowedImageProvider;", "Lgg/essential/gui/screenshot/providers/WindowedProvider;", "Lgg/essential/gui/screenshot/downsampling/PixelBuffer;", "Lgg/essential/gui/screenshot/providers/WindowedImageProvider;", "sourceProvider", "mapper", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "(Lgg/essential/gui/screenshot/providers/WindowedProvider;Lkotlin/jvm/functions/Function1;)V", "<set-?>", "", "Ljava/nio/file/Path;", "items", "getItems$delegate", "(Lgg/essential/gui/screenshot/providers/PostProcessWindowedImageProvider;)Ljava/lang/Object;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getMapper", "()Lkotlin/jvm/functions/Function1;", "provide", "", "windows", "Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;", "optional", "", "Companion", "essential" })
public final class PostProcessWindowedImageProvider implements WindowedProvider<PixelBuffer>
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final WindowedProvider<PixelBuffer> sourceProvider;
    @NotNull
    private final Function1<PixelBuffer, PixelBuffer> mapper;
    
    public PostProcessWindowedImageProvider(@NotNull final WindowedProvider<? extends PixelBuffer> sourceProvider, @NotNull final Function1<? super PixelBuffer, ? extends PixelBuffer> mapper) {
        Intrinsics.checkNotNullParameter((Object)sourceProvider, "sourceProvider");
        Intrinsics.checkNotNullParameter((Object)mapper, "mapper");
        super();
        this.sourceProvider = (WindowedProvider<PixelBuffer>)sourceProvider;
        this.mapper = (Function1<PixelBuffer, PixelBuffer>)mapper;
    }
    
    @NotNull
    @Override
    public List<Path> getItems() {
        return this.sourceProvider.getItems();
    }
    
    @Override
    public void setItems(@NotNull final List<? extends Path> <set-?>) {
        Intrinsics.checkNotNullParameter((Object)<set-?>, "<set-?>");
        this.sourceProvider.setItems(<set-?>);
    }
    
    @NotNull
    @Override
    public Map<Path, PixelBuffer> provide(@NotNull final List<WindowedProvider$Window> windows, @NotNull final Set<? extends Path> optional) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "windows"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* optional */
        //     7: ldc             "optional"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: getfield        gg/essential/gui/screenshot/providers/PostProcessWindowedImageProvider.sourceProvider:Lgg/essential/gui/screenshot/providers/WindowedProvider;
        //    16: aload_1         /* windows */
        //    17: aload_2         /* optional */
        //    18: invokeinterface gg/essential/gui/screenshot/providers/WindowedProvider.provide:(Ljava/util/List;Ljava/util/Set;)Ljava/util/Map;
        //    23: astore_3        /* $this$mapValues$iv */
        //    24: aload_3         /* $this$mapValues$iv */
        //    25: astore          4
        //    27: new             Ljava/util/LinkedHashMap;
        //    30: dup            
        //    31: aload_3         /* $this$mapValues$iv */
        //    32: invokeinterface java/util/Map.size:()I
        //    37: invokestatic    kotlin/collections/MapsKt.mapCapacity:(I)I
        //    40: invokespecial   java/util/LinkedHashMap.<init>:(I)V
        //    43: checkcast       Ljava/util/Map;
        //    46: astore          destination$iv$iv
        //    48: aload           $this$mapValuesTo$iv$iv
        //    50: invokeinterface java/util/Map.entrySet:()Ljava/util/Set;
        //    55: checkcast       Ljava/lang/Iterable;
        //    58: astore          $this$associateByTo$iv$iv$iv
        //    60: aload           $this$associateByTo$iv$iv$iv
        //    62: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    67: astore          7
        //    69: aload           7
        //    71: invokeinterface java/util/Iterator.hasNext:()Z
        //    76: ifeq            191
        //    79: aload           7
        //    81: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    86: astore          element$iv$iv$iv
        //    88: aload           destination$iv$iv
        //    90: aload           element$iv$iv$iv
        //    92: checkcast       Ljava/util/Map$Entry;
        //    95: astore          9
        //    97: astore          10
        //    99: aload           it$iv$iv
        //   101: invokeinterface java/util/Map$Entry.getKey:()Ljava/lang/Object;
        //   106: aload           10
        //   108: swap           
        //   109: aload           element$iv$iv$iv
        //   111: checkcast       Ljava/util/Map$Entry;
        //   114: astore          11
        //   116: astore          16
        //   118: astore          15
        //   120: aload           11
        //   122: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   127: checkcast       Lgg/essential/gui/screenshot/downsampling/PixelBuffer;
        //   130: astore          value
        //   132: aload_0         /* this */
        //   133: getfield        gg/essential/gui/screenshot/providers/PostProcessWindowedImageProvider.mapper:Lkotlin/jvm/functions/Function1;
        //   136: aload           value
        //   138: invokeinterface kotlin/jvm/functions/Function1.invoke:(Ljava/lang/Object;)Ljava/lang/Object;
        //   143: checkcast       Lgg/essential/gui/screenshot/downsampling/PixelBuffer;
        //   146: astore          13
        //   148: aload           value
        //   150: invokeinterface gg/essential/gui/screenshot/downsampling/PixelBuffer.release:()Z
        //   155: pop            
        //   156: goto            172
        //   159: astore          14
        //   161: aload           value
        //   163: invokeinterface gg/essential/gui/screenshot/downsampling/PixelBuffer.release:()Z
        //   168: pop            
        //   169: aload           14
        //   171: athrow         
        //   172: aload           13
        //   174: astore          17
        //   176: aload           15
        //   178: aload           16
        //   180: aload           17
        //   182: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   187: pop            
        //   188: goto            69
        //   191: aload           destination$iv$iv
        //   193: areturn        
        //    Signature:
        //  (Ljava/util/List<Lgg/essential/gui/screenshot/providers/WindowedProvider$Window;>;Ljava/util/Set<+Ljava/nio/file/Path;>;)Ljava/util/Map<Ljava/nio/file/Path;Lgg/essential/gui/screenshot/downsampling/PixelBuffer;>;
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  windows   
        //  optional  
        //    StackMapTable: 00 04 FF 00 45 00 08 07 00 02 00 00 00 00 07 00 59 00 07 00 72 00 00 FF 00 59 00 0D 00 00 00 00 00 00 00 00 00 00 00 00 07 00 84 00 01 07 00 8F FF 00 0C 00 11 07 00 02 00 00 00 00 07 00 59 00 07 00 72 00 00 00 00 00 07 00 84 00 07 00 59 07 00 05 00 00 FF 00 12 00 06 00 00 00 00 00 07 00 59 00 00
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  132    148    159    172    Any
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000"
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0010\b
                                                       \u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J'\u0010\u0003\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010	\u001a\u00020\b¨\u0006
                                                       """ }, d2 = { "Lgg/essential/gui/screenshot/providers/PostProcessWindowedImageProvider$Companion;", "", "()V", "bicubicFilter", "Lkotlin/Function1;", "Lgg/essential/gui/screenshot/downsampling/PixelBuffer;", "Lkotlin/ExtensionFunctionType;", "maxWidth", "", "maxHeight", "essential" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final Function1<PixelBuffer, PixelBuffer> bicubicFilter(final int maxWidth, final int maxHeight) {
            return (Function1<PixelBuffer, PixelBuffer>)new PostProcessWindowedImageProvider$Companion$bicubicFilter.PostProcessWindowedImageProvider$Companion$bicubicFilter$1(maxWidth, maxHeight);
        }
        
        public Companion(final byte b) {
            this();
        }
    }
}
