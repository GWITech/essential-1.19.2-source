package gg.essential.model.backend;

import gg.essential.model.*;
import kotlin.jvm.internal.markers.*;
import kotlin.jvm.internal.*;
import java.util.*;
import kotlin.*;
import org.jetbrains.annotations.*;
import java.util.function.*;
import gg.essential.lib.kotgl.matrix.matrices.*;
import kotlin.collections.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00039:;B=\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0003H\u00c6\u0003J\t\u0010'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u000bH\u00c6\u0003J\u0010\u0010,\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020\u0002H\u0016J\u0010\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u0003H\u0016JO\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u00101\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u000103H\u00d6\u0003J\u0011\u00104\u001a\u00020\u00032\u0006\u0010-\u001a\u00020\u0002H\u0096\u0002J\t\u00105\u001a\u00020\u001eH\u00d6\u0001J\b\u00106\u001a\u00020\u000bH\u0016J\t\u00107\u001a\u000208H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00130\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000eR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u000eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000eR\u0014\u0010\u001d\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\"8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006<" }, d2 = { "Lgg/essential/model/backend/PlayerPose;", "", "Lgg/essential/model/EnumPart;", "Lgg/essential/model/backend/PlayerPose$Part;", "head", "body", "rightArm", "leftArm", "rightLeg", "leftLeg", "child", "", "(Lgg/essential/model/backend/PlayerPose$Part;Lgg/essential/model/backend/PlayerPose$Part;Lgg/essential/model/backend/PlayerPose$Part;Lgg/essential/model/backend/PlayerPose$Part;Lgg/essential/model/backend/PlayerPose$Part;Lgg/essential/model/backend/PlayerPose$Part;Z)V", "getBody", "()Lgg/essential/model/backend/PlayerPose$Part;", "getChild", "()Z", "entries", "", "", "getEntries", "()Ljava/util/Set;", "getHead", "keys", "getKeys", "getLeftArm", "getLeftLeg", "getRightArm", "getRightLeg", "size", "", "getSize", "()I", "values", "", "getValues", "()Ljava/util/Collection;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "containsKey", "key", "containsValue", "value", "copy", "equals", "other", "", "get", "hashCode", "isEmpty", "toString", "", "Companion", "MapEntry", "Part", "cosmetics" })
public final class PlayerPose implements Map<EnumPart, Part>, KMappedMarker
{
    @NotNull
    public static final Companion Companion;
    @NotNull
    private final Part head;
    @NotNull
    private final Part body;
    @NotNull
    private final Part rightArm;
    @NotNull
    private final Part leftArm;
    @NotNull
    private final Part rightLeg;
    @NotNull
    private final Part leftLeg;
    private final boolean child;
    
    public PlayerPose(@NotNull final Part head, @NotNull final Part body, @NotNull final Part rightArm, @NotNull final Part leftArm, @NotNull final Part rightLeg, @NotNull final Part leftLeg, final boolean child) {
        Intrinsics.checkNotNullParameter((Object)head, "head");
        Intrinsics.checkNotNullParameter((Object)body, "body");
        Intrinsics.checkNotNullParameter((Object)rightArm, "rightArm");
        Intrinsics.checkNotNullParameter((Object)leftArm, "leftArm");
        Intrinsics.checkNotNullParameter((Object)rightLeg, "rightLeg");
        Intrinsics.checkNotNullParameter((Object)leftLeg, "leftLeg");
        super();
        this.head = head;
        this.body = body;
        this.rightArm = rightArm;
        this.leftArm = leftArm;
        this.rightLeg = rightLeg;
        this.leftLeg = leftLeg;
        this.child = child;
    }
    
    @NotNull
    public final Part getHead() {
        return this.head;
    }
    
    @NotNull
    public final Part getBody() {
        return this.body;
    }
    
    @NotNull
    public final Part getRightArm() {
        return this.rightArm;
    }
    
    @NotNull
    public final Part getLeftArm() {
        return this.leftArm;
    }
    
    @NotNull
    public final Part getRightLeg() {
        return this.rightLeg;
    }
    
    @NotNull
    public final Part getLeftLeg() {
        return this.leftLeg;
    }
    
    public final boolean getChild() {
        return this.child;
    }
    
    @NotNull
    public Set<Entry<EnumPart, Part>> getEntries() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   gg/essential/model/backend/PlayerPose.keySet:()Ljava/util/Set;
        //     4: checkcast       Ljava/lang/Iterable;
        //     7: astore_1       
        //     8: new             Ljava/util/LinkedHashSet;
        //    11: dup            
        //    12: invokespecial   java/util/LinkedHashSet.<init>:()V
        //    15: checkcast       Ljava/util/Set;
        //    18: checkcast       Ljava/util/Collection;
        //    21: astore_2        /* destination$iv */
        //    22: aload_1         /* $this$mapTo$iv */
        //    23: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    28: astore_3       
        //    29: aload_3        
        //    30: invokeinterface java/util/Iterator.hasNext:()Z
        //    35: ifeq            83
        //    38: aload_3        
        //    39: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    44: astore          item$iv
        //    46: aload_2         /* destination$iv */
        //    47: aload           item$iv
        //    49: checkcast       Lgg/essential/model/EnumPart;
        //    52: astore          5
        //    54: astore          6
        //    56: new             Lgg/essential/model/backend/PlayerPose$MapEntry;
        //    59: dup            
        //    60: aload           it
        //    62: aload_0         /* this */
        //    63: aload           it
        //    65: invokevirtual   gg/essential/model/backend/PlayerPose.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //    68: invokespecial   gg/essential/model/backend/PlayerPose$MapEntry.<init>:(Ljava/lang/Object;Ljava/lang/Object;)V
        //    71: aload           6
        //    73: swap           
        //    74: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    79: pop            
        //    80: goto            29
        //    83: aload_2         /* destination$iv */
        //    84: checkcast       Ljava/util/Set;
        //    87: areturn        
        //    Signature:
        //  ()Ljava/util/Set<Ljava/util/Map$Entry<Lgg/essential/model/EnumPart;Lgg/essential/model/backend/PlayerPose$Part;>;>;
        //    StackMapTable: 00 02 FE 00 1D 00 07 00 83 07 00 89 FF 00 35 00 03 00 00 07 00 83 00 00
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public Set<EnumPart> getKeys() {
        return ArraysKt.toSet((Object[])EnumPart.values());
    }
    
    public int getSize() {
        return EnumPart.values().length;
    }
    
    @NotNull
    public Collection<Part> getValues() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   gg/essential/model/backend/PlayerPose.entrySet:()Ljava/util/Set;
        //     4: checkcast       Ljava/lang/Iterable;
        //     7: astore_1        /* $this$map$iv */
        //     8: aload_1         /* $this$map$iv */
        //     9: astore_2       
        //    10: new             Ljava/util/ArrayList;
        //    13: dup            
        //    14: aload_1         /* $this$map$iv */
        //    15: bipush          10
        //    17: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //    20: invokespecial   java/util/ArrayList.<init>:(I)V
        //    23: checkcast       Ljava/util/Collection;
        //    26: astore_3        /* destination$iv$iv */
        //    27: aload_2         /* $this$mapTo$iv$iv */
        //    28: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    33: astore          4
        //    35: aload           4
        //    37: invokeinterface java/util/Iterator.hasNext:()Z
        //    42: ifeq            86
        //    45: aload           4
        //    47: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    52: astore          item$iv$iv
        //    54: aload_3         /* destination$iv$iv */
        //    55: aload           item$iv$iv
        //    57: checkcast       Ljava/util/Map$Entry;
        //    60: astore          6
        //    62: astore          7
        //    64: aload           it
        //    66: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //    71: checkcast       Lgg/essential/model/backend/PlayerPose$Part;
        //    74: aload           7
        //    76: swap           
        //    77: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    82: pop            
        //    83: goto            35
        //    86: aload_3         /* destination$iv$iv */
        //    87: checkcast       Ljava/util/List;
        //    90: checkcast       Ljava/util/Collection;
        //    93: areturn        
        //    Signature:
        //  ()Ljava/util/Collection<Lgg/essential/model/backend/PlayerPose$Part;>;
        //    StackMapTable: 00 02 FF 00 23 00 05 00 00 00 07 00 83 07 00 89 00 00 FA 00 32
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public boolean containsKey(@NotNull final EnumPart key) {
        Intrinsics.checkNotNullParameter((Object)key, "key");
        return true;
    }
    
    public boolean containsValue(@NotNull final Part value) {
        Intrinsics.checkNotNullParameter((Object)value, "value");
        return this.values().contains(value);
    }
    
    @NotNull
    public Part get(@NotNull final EnumPart key) {
        Intrinsics.checkNotNullParameter((Object)key, "key");
        return switch (WhenMappings.$EnumSwitchMapping$0[key.ordinal()]) {
            case 1 -> this.head;
            case 2 -> this.body;
            case 3 -> this.rightArm;
            case 4 -> this.leftArm;
            case 5 -> this.rightLeg;
            case 6 -> this.leftLeg;
            default -> throw new NoWhenBranchMatchedException();
        };
    }
    
    @Override
    public boolean isEmpty() {
        return false;
    }
    
    @NotNull
    @Override
    public String toString() {
        return "PlayerPose(head=" + this.head + ", body=" + this.body + ", rightArm=" + this.rightArm + ", leftArm=" + this.leftArm + ", rightLeg=" + this.rightLeg + ", leftLeg=" + this.leftLeg + ", child=" + this.child + ')';
    }
    
    @Override
    public int hashCode() {
        int result = this.head.hashCode();
        result = result * 31 + this.body.hashCode();
        result = result * 31 + this.rightArm.hashCode();
        result = result * 31 + this.leftArm.hashCode();
        result = result * 31 + this.rightLeg.hashCode();
        result = result * 31 + this.leftLeg.hashCode();
        final int n = result * 31;
        int child;
        if ((child = (this.child ? 1 : 0)) != 0) {
            child = 1;
        }
        result = n + child;
        return result;
    }
    
    @Override
    public boolean equals(@Nullable final Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlayerPose)) {
            return false;
        }
        final PlayerPose playerPose = (PlayerPose)other;
        return Intrinsics.areEqual((Object)this.head, (Object)playerPose.head) && Intrinsics.areEqual((Object)this.body, (Object)playerPose.body) && Intrinsics.areEqual((Object)this.rightArm, (Object)playerPose.rightArm) && Intrinsics.areEqual((Object)this.leftArm, (Object)playerPose.leftArm) && Intrinsics.areEqual((Object)this.rightLeg, (Object)playerPose.rightLeg) && Intrinsics.areEqual((Object)this.leftLeg, (Object)playerPose.leftLeg) && this.child == playerPose.child;
    }
    
    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public void putAll(final Map<? extends EnumPart, ? extends Part> from) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    public Part remove$30292e60() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public boolean remove(final Object key, final Object value) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public void replaceAll(final BiFunction<? super EnumPart, ? super Part, ? extends Part> p0) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public final /* bridge */ Set<Entry<EnumPart, Part>> entrySet() {
        return this.getEntries();
    }
    
    @Override
    public final /* bridge */ Set<EnumPart> keySet() {
        return this.getKeys();
    }
    
    @Override
    public final /* bridge */ int size() {
        return this.getSize();
    }
    
    @Override
    public final /* bridge */ Collection<Part> values() {
        return this.getValues();
    }
    
    @Override
    public final /* bridge */ boolean containsKey(final Object key) {
        return key instanceof EnumPart && this.containsKey((EnumPart)key);
    }
    
    @Override
    public final /* bridge */ boolean containsValue(final Object value) {
        return value instanceof Part && this.containsValue((Part)value);
    }
    
    @Override
    public final /* bridge */ Object get(final Object key) {
        if (!(key instanceof EnumPart)) {
            return null;
        }
        return this.get((EnumPart)key);
    }
    
    @Override
    public /* bridge */ Object compute(final Object p0, final BiFunction p1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public /* bridge */ Object computeIfAbsent(final Object p0, final Function p1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public /* bridge */ Object computeIfPresent(final Object p0, final BiFunction p1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public /* bridge */ Object merge(final Object p0, final Object p1, final BiFunction p2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public /* bridge */ Object put(final Object key, final Object value) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public /* bridge */ Object putIfAbsent(final Object p0, final Object p1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public /* bridge */ Object remove(final Object key) {
        return this.remove$30292e60();
    }
    
    @Override
    public /* bridge */ boolean replace(final Object p0, final Object p1, final Object p2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    @Override
    public /* bridge */ Object replace(final Object p0, final Object p1) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    
    static {
        Companion = new Companion((byte)0);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u00c6\u0003JQ\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010 \u001a\u00020!H\u00d6\u0001J\t\u0010\"\u001a\u00020#H\u00d6\u0001R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006$" }, d2 = { "Lgg/essential/model/backend/PlayerPose$Part;", "", "pivotX", "", "pivotY", "pivotZ", "rotateAngleX", "rotateAngleY", "rotateAngleZ", "extra", "Lgg/essential/lib/kotgl/matrix/matrices/Mat4;", "(FFFFFFLdev/folomeev/kotgl/matrix/matrices/Mat4;)V", "getExtra", "()Ldev/folomeev/kotgl/matrix/matrices/Mat4;", "getPivotX", "()F", "getPivotY", "getPivotZ", "getRotateAngleX", "getRotateAngleY", "getRotateAngleZ", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "cosmetics" })
    public static final class Part
    {
        private final float pivotX;
        private final float pivotY;
        private final float pivotZ;
        private final float rotateAngleX;
        private final float rotateAngleY;
        private final float rotateAngleZ;
        @Nullable
        private final Mat4 extra;
        
        public Part(final float pivotX, final float pivotY, final float pivotZ, final float rotateAngleX, final float rotateAngleY, final float rotateAngleZ, @Nullable final Mat4 extra) {
            super();
            this.pivotX = pivotX;
            this.pivotY = pivotY;
            this.pivotZ = pivotZ;
            this.rotateAngleX = rotateAngleX;
            this.rotateAngleY = rotateAngleY;
            this.rotateAngleZ = rotateAngleZ;
            this.extra = extra;
        }
        
        public Part(float pivotX, float pivotY, float pivotZ, Mat4 extra, final int n) {
            if ((n & 0x1) != 0x0) {
                pivotX = 0.0f;
            }
            if ((n & 0x2) != 0x0) {
                pivotY = 0.0f;
            }
            if ((n & 0x4) != 0x0) {
                pivotZ = 0.0f;
            }
            if ((n & 0x40) != 0x0) {
                extra = null;
            }
            this(pivotX, pivotY, pivotZ, 0.0f, 0.0f, 0.0f, extra);
        }
        
        public final float getPivotX() {
            return this.pivotX;
        }
        
        public final float getPivotY() {
            return this.pivotY;
        }
        
        public final float getPivotZ() {
            return this.pivotZ;
        }
        
        public final float getRotateAngleX() {
            return this.rotateAngleX;
        }
        
        public final float getRotateAngleY() {
            return this.rotateAngleY;
        }
        
        public final float getRotateAngleZ() {
            return this.rotateAngleZ;
        }
        
        @Nullable
        public final Mat4 getExtra() {
            return this.extra;
        }
        
        @NotNull
        @Override
        public String toString() {
            return "Part(pivotX=" + this.pivotX + ", pivotY=" + this.pivotY + ", pivotZ=" + this.pivotZ + ", rotateAngleX=" + this.rotateAngleX + ", rotateAngleY=" + this.rotateAngleY + ", rotateAngleZ=" + this.rotateAngleZ + ", extra=" + this.extra + ')';
        }
        
        @Override
        public int hashCode() {
            int result = Float.hashCode(this.pivotX);
            result = result * 31 + Float.hashCode(this.pivotY);
            result = result * 31 + Float.hashCode(this.pivotZ);
            result = result * 31 + Float.hashCode(this.rotateAngleX);
            result = result * 31 + Float.hashCode(this.rotateAngleY);
            result = result * 31 + Float.hashCode(this.rotateAngleZ);
            result = result * 31 + ((this.extra == null) ? 0 : this.extra.hashCode());
            return result;
        }
        
        @Override
        public boolean equals(@Nullable final Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Part)) {
                return false;
            }
            final Part part = (Part)other;
            return Intrinsics.areEqual((Object)this.pivotX, (Object)part.pivotX) && Intrinsics.areEqual((Object)this.pivotY, (Object)part.pivotY) && Intrinsics.areEqual((Object)this.pivotZ, (Object)part.pivotZ) && Intrinsics.areEqual((Object)this.rotateAngleX, (Object)part.rotateAngleX) && Intrinsics.areEqual((Object)this.rotateAngleY, (Object)part.rotateAngleY) && Intrinsics.areEqual((Object)this.rotateAngleZ, (Object)part.rotateAngleZ) && Intrinsics.areEqual((Object)this.extra, (Object)part.extra);
        }
        
        public Part() {
            this(0.0f, 0.0f, 0.0f, null, 127);
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\u0004¨\u0006\f" }, d2 = { "Lgg/essential/model/backend/PlayerPose$Companion;", "", "()V", "fromMap", "Lgg/essential/model/backend/PlayerPose;", "map", "", "Lgg/essential/model/EnumPart;", "Lgg/essential/model/backend/PlayerPose$Part;", "child", "", "neutral", "cosmetics" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        @NotNull
        public final PlayerPose fromMap(@NotNull final Map<EnumPart, Part> map, final boolean child) {
            Intrinsics.checkNotNullParameter((Object)map, "map");
            return new PlayerPose((Part)MapsKt.getValue((Map)map, (Object)EnumPart.HEAD), (Part)MapsKt.getValue((Map)map, (Object)EnumPart.BODY), (Part)MapsKt.getValue((Map)map, (Object)EnumPart.RIGHT_ARM), (Part)MapsKt.getValue((Map)map, (Object)EnumPart.LEFT_ARM), (Part)MapsKt.getValue((Map)map, (Object)EnumPart.RIGHT_LEG), (Part)MapsKt.getValue((Map)map, (Object)EnumPart.LEFT_LEG), child);
        }
        
        @NotNull
        public final PlayerPose neutral() {
            return new PlayerPose(new Part(0.0f, 0.0f, 0.0f, null, 127), new Part(0.0f, 0.0f, 0.0f, null, 127), new Part(-5.0f, 2.0f, 0.0f, null, 120), new Part(5.0f, 2.0f, 0.0f, null, 120), new Part(-1.9f, 12.0f, 0.1f, null, 120), new Part(1.9f, 12.0f, 0.1f, null, 120), false);
        }
        
        public Companion(final byte b) {
            this();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public final synthetic class WhenMappings
    {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        
        static {
            final int[] $EnumSwitchMapping$ = new int[EnumPart.values().length];
            $EnumSwitchMapping$[EnumPart.HEAD.ordinal()] = 1;
            $EnumSwitchMapping$[EnumPart.BODY.ordinal()] = 2;
            $EnumSwitchMapping$[EnumPart.RIGHT_ARM.ordinal()] = 3;
            $EnumSwitchMapping$[EnumPart.LEFT_ARM.ordinal()] = 4;
            $EnumSwitchMapping$[EnumPart.RIGHT_LEG.ordinal()] = 5;
            $EnumSwitchMapping$[EnumPart.LEFT_LEG.ordinal()] = 6;
            $EnumSwitchMapping$0 = $EnumSwitchMapping$;
        }
    }
}
