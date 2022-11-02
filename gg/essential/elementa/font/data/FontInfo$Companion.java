package gg.essential.elementa.font.data;

import kotlin.*;
import com.google.gson.*;
import org.jetbrains.annotations.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t" }, d2 = { "Lgg/essential/elementa/font/data/FontInfo$Companion;", "", "()V", "gson", "Lcom/google/gson/Gson;", "fromJson", "Lgg/essential/elementa/font/data/FontInfo;", "json", "Lcom/google/gson/JsonObject;", "Elementa" })
public static final class Companion
{
    private Companion() {
        super();
    }
    
    @NotNull
    public final FontInfo fromJson(@NotNull final JsonObject json) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "json"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: invokestatic    gg/essential/elementa/font/data/FontInfo.access$getGson$cp:()Lcom/google/gson/Gson;
        //     9: aload_1         /* json */
        //    10: ldc             "atlas"
        //    12: invokevirtual   com/google/gson/JsonObject.getAsJsonObject:(Ljava/lang/String;)Lcom/google/gson/JsonObject;
        //    15: checkcast       Lcom/google/gson/JsonElement;
        //    18: ldc             Lgg/essential/elementa/font/data/Atlas;.class
        //    20: invokevirtual   com/google/gson/Gson.fromJson:(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;
        //    23: checkcast       Lgg/essential/elementa/font/data/Atlas;
        //    26: astore_2        /* atlas */
        //    27: invokestatic    gg/essential/elementa/font/data/FontInfo.access$getGson$cp:()Lcom/google/gson/Gson;
        //    30: aload_1         /* json */
        //    31: ldc             "metrics"
        //    33: invokevirtual   com/google/gson/JsonObject.getAsJsonObject:(Ljava/lang/String;)Lcom/google/gson/JsonObject;
        //    36: checkcast       Lcom/google/gson/JsonElement;
        //    39: ldc             Lgg/essential/elementa/font/data/Metrics;.class
        //    41: invokevirtual   com/google/gson/Gson.fromJson:(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;
        //    44: checkcast       Lgg/essential/elementa/font/data/Metrics;
        //    47: astore_3        /* metrics */
        //    48: aload_1         /* json */
        //    49: ldc             "glyphs"
        //    51: invokevirtual   com/google/gson/JsonObject.getAsJsonArray:(Ljava/lang/String;)Lcom/google/gson/JsonArray;
        //    54: astore          5
        //    56: aload           5
        //    58: ldc             "json.getAsJsonArray(\"glyphs\")"
        //    60: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //    63: aload           5
        //    65: checkcast       Ljava/lang/Iterable;
        //    68: astore          $this$associate$iv
        //    70: iconst_0       
        //    71: istore          $i$f$associate
        //    73: aload           $this$associate$iv
        //    75: bipush          10
        //    77: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    80: invokestatic    kotlin/collections/MapsKt.mapCapacity:(I)I
        //    83: bipush          16
        //    85: invokestatic    kotlin/ranges/RangesKt.coerceAtLeast:(II)I
        //    88: istore          capacity$iv
        //    90: aload           $this$associate$iv
        //    92: astore          8
        //    94: new             Ljava/util/LinkedHashMap;
        //    97: dup            
        //    98: iload           capacity$iv
        //   100: invokespecial   java/util/LinkedHashMap.<init>:(I)V
        //   103: checkcast       Ljava/util/Map;
        //   106: astore          destination$iv$iv
        //   108: iconst_0       
        //   109: istore          $i$f$associateTo
        //   111: aload           $this$associateTo$iv$iv
        //   113: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   118: astore          11
        //   120: aload           11
        //   122: invokeinterface java/util/Iterator.hasNext:()Z
        //   127: ifeq            204
        //   130: aload           11
        //   132: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   137: astore          element$iv$iv
        //   139: aload           destination$iv$iv
        //   141: astore          13
        //   143: aload           element$iv$iv
        //   145: checkcast       Lcom/google/gson/JsonElement;
        //   148: astore          glyphElement
        //   150: iconst_0       
        //   151: istore          $i$a$-associate-FontInfo$Companion$fromJson$glyphs$1
        //   153: invokestatic    gg/essential/elementa/font/data/FontInfo.access$getGson$cp:()Lcom/google/gson/Gson;
        //   156: aload           glyphElement
        //   158: ldc             Lgg/essential/elementa/font/data/Glyph;.class
        //   160: invokevirtual   com/google/gson/Gson.fromJson:(Lcom/google/gson/JsonElement;Ljava/lang/Class;)Ljava/lang/Object;
        //   163: checkcast       Lgg/essential/elementa/font/data/Glyph;
        //   166: astore          glyph
        //   168: aload           glyph
        //   170: invokevirtual   gg/essential/elementa/font/data/Glyph.getUnicode:()I
        //   173: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   176: aload           glyph
        //   178: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   181: astore          null
        //   183: aload           13
        //   185: aload           14
        //   187: invokevirtual   kotlin/Pair.getFirst:()Ljava/lang/Object;
        //   190: aload           14
        //   192: invokevirtual   kotlin/Pair.getSecond:()Ljava/lang/Object;
        //   195: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   200: pop            
        //   201: goto            120
        //   204: aload           destination$iv$iv
        //   206: nop            
        //   207: astore          glyphs
        //   209: new             Lgg/essential/elementa/font/data/FontInfo;
        //   212: dup            
        //   213: aload_2         /* atlas */
        //   214: ldc             "atlas"
        //   216: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   219: aload_2         /* atlas */
        //   220: aload_3         /* metrics */
        //   221: ldc             "metrics"
        //   223: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   226: aload_3         /* metrics */
        //   227: aload           glyphs
        //   229: invokespecial   gg/essential/elementa/font/data/FontInfo.<init>:(Lgg/essential/elementa/font/data/Atlas;Lgg/essential/elementa/font/data/Metrics;Ljava/util/Map;)V
        //   232: areturn        
        //    MethodParameters:
        //  Name  Flags  
        //  ----  -----
        //  json  
        //    StackMapTable: 00 02 FF 00 78 00 0C 07 00 02 07 00 32 07 00 3A 07 00 43 00 07 00 50 01 01 07 00 50 07 00 69 01 07 00 6F 00 00 FB 00 53
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public Companion(final DefaultConstructorMarker $constructor_marker) {
        this();
    }
}
