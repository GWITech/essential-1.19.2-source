package gg.essential.elementa.constraints;

import kotlin.*;
import gg.essential.elementa.*;
import kotlin.jvm.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.constraints.resolution.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\fH\u0016J\u0010\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\fH\u0016J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\fH\u0016J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0004R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f" }, d2 = { "Lgg/essential/elementa/constraints/FillConstraint;", "Lgg/essential/elementa/constraints/SizeConstraint;", "useSiblings", "", "(Z)V", "cachedValue", "", "getCachedValue", "()Ljava/lang/Float;", "setCachedValue", "(F)V", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "recalculate", "getRecalculate", "()Z", "setRecalculate", "getHeightImpl", "component", "getRadiusImpl", "getWidthImpl", "visitImpl", "", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "Elementa" })
public final class FillConstraint implements SizeConstraint
{
    private final boolean useSiblings;
    private float cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    
    @JvmOverloads
    public FillConstraint(final boolean useSiblings) {
        super();
        this.useSiblings = useSiblings;
        this.recalculate = true;
    }
    
    public FillConstraint(boolean useSiblings, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            useSiblings = true;
        }
        this(useSiblings);
    }
    
    @NotNull
    @Override
    public Float getCachedValue() {
        return this.cachedValue;
    }
    
    public void setCachedValue(final float <set-?>) {
        this.cachedValue = <set-?>;
    }
    
    @Override
    public boolean getRecalculate() {
        return this.recalculate;
    }
    
    @Override
    public void setRecalculate(final boolean <set-?>) {
        this.recalculate = <set-?>;
    }
    
    @Nullable
    @Override
    public UIComponent getConstrainTo() {
        return this.constrainTo;
    }
    
    @Override
    public void setConstrainTo(@Nullable final UIComponent <set-?>) {
        this.constrainTo = <set-?>;
    }
    
    @Override
    public float getWidthImpl(@NotNull final UIComponent component) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "component"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: invokevirtual   gg/essential/elementa/constraints/FillConstraint.getConstrainTo:()Lgg/essential/elementa/UIComponent;
        //    10: dup            
        //    11: ifnonnull       19
        //    14: pop            
        //    15: aload_1         /* component */
        //    16: invokevirtual   gg/essential/elementa/UIComponent.getParent:()Lgg/essential/elementa/UIComponent;
        //    19: astore_2        /* target */
        //    20: aload_0         /* this */
        //    21: getfield        gg/essential/elementa/constraints/FillConstraint.useSiblings:Z
        //    24: ifeq            224
        //    27: aload_2         /* target */
        //    28: invokevirtual   gg/essential/elementa/UIComponent.getWidth:()F
        //    31: aload_2         /* target */
        //    32: invokevirtual   gg/essential/elementa/UIComponent.getChildren:()Lgg/essential/elementa/utils/ObservableList;
        //    35: checkcast       Ljava/lang/Iterable;
        //    38: astore_3       
        //    39: fstore          12
        //    41: iconst_0       
        //    42: istore          $i$f$filter
        //    44: aload_3         /* $this$filter$iv */
        //    45: astore          5
        //    47: new             Ljava/util/ArrayList;
        //    50: dup            
        //    51: invokespecial   java/util/ArrayList.<init>:()V
        //    54: checkcast       Ljava/util/Collection;
        //    57: astore          destination$iv$iv
        //    59: iconst_0       
        //    60: istore          $i$f$filterTo
        //    62: aload           $this$filterTo$iv$iv
        //    64: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    69: astore          8
        //    71: aload           8
        //    73: invokeinterface java/util/Iterator.hasNext:()Z
        //    78: ifeq            130
        //    81: aload           8
        //    83: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    88: astore          element$iv$iv
        //    90: aload           element$iv$iv
        //    92: checkcast       Lgg/essential/elementa/UIComponent;
        //    95: astore          it
        //    97: iconst_0       
        //    98: istore          $i$a$-filter-FillConstraint$getWidthImpl$1
        //   100: aload           it
        //   102: aload_1         /* component */
        //   103: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   106: ifne            113
        //   109: iconst_1       
        //   110: goto            114
        //   113: iconst_0       
        //   114: ifeq            71
        //   117: aload           destination$iv$iv
        //   119: aload           element$iv$iv
        //   121: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   126: pop            
        //   127: goto            71
        //   130: aload           destination$iv$iv
        //   132: checkcast       Ljava/util/List;
        //   135: nop            
        //   136: astore          13
        //   138: fload           12
        //   140: aload           13
        //   142: checkcast       Ljava/lang/Iterable;
        //   145: astore_3       
        //   146: fstore          12
        //   148: iconst_0       
        //   149: i2d            
        //   150: dstore          4
        //   152: aload_3        
        //   153: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   158: astore          6
        //   160: aload           6
        //   162: invokeinterface java/util/Iterator.hasNext:()Z
        //   167: ifeq            211
        //   170: aload           6
        //   172: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   177: astore          7
        //   179: dload           4
        //   181: aload           7
        //   183: checkcast       Lgg/essential/elementa/UIComponent;
        //   186: astore          8
        //   188: dstore          13
        //   190: iconst_0       
        //   191: istore          $i$a$-sumOfDouble-FillConstraint$getWidthImpl$2
        //   193: aload           it
        //   195: invokevirtual   gg/essential/elementa/UIComponent.getWidth:()F
        //   198: f2d            
        //   199: dstore          15
        //   201: dload           13
        //   203: dload           15
        //   205: dadd           
        //   206: dstore          4
        //   208: goto            160
        //   211: dload           4
        //   213: dstore          13
        //   215: fload           12
        //   217: dload           13
        //   219: d2f            
        //   220: fsub           
        //   221: goto            233
        //   224: aload_2         /* target */
        //   225: invokevirtual   gg/essential/elementa/UIComponent.getRight:()F
        //   228: aload_1         /* component */
        //   229: invokevirtual   gg/essential/elementa/UIComponent.getLeft:()F
        //   232: fsub           
        //   233: freturn        
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  component  
        //    StackMapTable: 00 09 53 07 00 5B FF 00 33 00 0D 07 00 02 07 00 5B 07 00 5B 07 00 68 01 07 00 68 07 00 6D 01 07 00 73 00 00 00 02 00 00 FF 00 29 00 0D 07 00 02 07 00 5B 07 00 5B 07 00 68 01 07 00 68 07 00 6D 01 07 00 73 07 00 04 07 00 5B 01 02 00 00 40 01 FF 00 0F 00 0D 07 00 02 07 00 5B 07 00 5B 07 00 68 01 07 00 68 07 00 6D 01 07 00 73 00 00 00 02 00 00 FF 00 1D 00 0C 07 00 02 07 00 5B 07 00 5B 07 00 68 03 07 00 73 00 07 00 04 00 00 00 02 00 00 32 FF 00 0C 00 03 07 00 02 07 00 5B 07 00 5B 00 00 48 02
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public float getHeightImpl(@NotNull final UIComponent component) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "component"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: invokevirtual   gg/essential/elementa/constraints/FillConstraint.getConstrainTo:()Lgg/essential/elementa/UIComponent;
        //    10: dup            
        //    11: ifnonnull       19
        //    14: pop            
        //    15: aload_1         /* component */
        //    16: invokevirtual   gg/essential/elementa/UIComponent.getParent:()Lgg/essential/elementa/UIComponent;
        //    19: astore_2        /* target */
        //    20: aload_0         /* this */
        //    21: getfield        gg/essential/elementa/constraints/FillConstraint.useSiblings:Z
        //    24: ifeq            224
        //    27: aload_2         /* target */
        //    28: invokevirtual   gg/essential/elementa/UIComponent.getHeight:()F
        //    31: aload_2         /* target */
        //    32: invokevirtual   gg/essential/elementa/UIComponent.getChildren:()Lgg/essential/elementa/utils/ObservableList;
        //    35: checkcast       Ljava/lang/Iterable;
        //    38: astore_3       
        //    39: fstore          12
        //    41: iconst_0       
        //    42: istore          $i$f$filter
        //    44: aload_3         /* $this$filter$iv */
        //    45: astore          5
        //    47: new             Ljava/util/ArrayList;
        //    50: dup            
        //    51: invokespecial   java/util/ArrayList.<init>:()V
        //    54: checkcast       Ljava/util/Collection;
        //    57: astore          destination$iv$iv
        //    59: iconst_0       
        //    60: istore          $i$f$filterTo
        //    62: aload           $this$filterTo$iv$iv
        //    64: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    69: astore          8
        //    71: aload           8
        //    73: invokeinterface java/util/Iterator.hasNext:()Z
        //    78: ifeq            130
        //    81: aload           8
        //    83: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    88: astore          element$iv$iv
        //    90: aload           element$iv$iv
        //    92: checkcast       Lgg/essential/elementa/UIComponent;
        //    95: astore          it
        //    97: iconst_0       
        //    98: istore          $i$a$-filter-FillConstraint$getHeightImpl$1
        //   100: aload           it
        //   102: aload_1         /* component */
        //   103: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   106: ifne            113
        //   109: iconst_1       
        //   110: goto            114
        //   113: iconst_0       
        //   114: ifeq            71
        //   117: aload           destination$iv$iv
        //   119: aload           element$iv$iv
        //   121: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   126: pop            
        //   127: goto            71
        //   130: aload           destination$iv$iv
        //   132: checkcast       Ljava/util/List;
        //   135: nop            
        //   136: astore          13
        //   138: fload           12
        //   140: aload           13
        //   142: checkcast       Ljava/lang/Iterable;
        //   145: astore_3       
        //   146: fstore          12
        //   148: iconst_0       
        //   149: i2d            
        //   150: dstore          4
        //   152: aload_3        
        //   153: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   158: astore          6
        //   160: aload           6
        //   162: invokeinterface java/util/Iterator.hasNext:()Z
        //   167: ifeq            211
        //   170: aload           6
        //   172: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   177: astore          7
        //   179: dload           4
        //   181: aload           7
        //   183: checkcast       Lgg/essential/elementa/UIComponent;
        //   186: astore          8
        //   188: dstore          13
        //   190: iconst_0       
        //   191: istore          $i$a$-sumOfDouble-FillConstraint$getHeightImpl$2
        //   193: aload           it
        //   195: invokevirtual   gg/essential/elementa/UIComponent.getHeight:()F
        //   198: f2d            
        //   199: dstore          15
        //   201: dload           13
        //   203: dload           15
        //   205: dadd           
        //   206: dstore          4
        //   208: goto            160
        //   211: dload           4
        //   213: dstore          13
        //   215: fload           12
        //   217: dload           13
        //   219: d2f            
        //   220: fsub           
        //   221: goto            233
        //   224: aload_2         /* target */
        //   225: invokevirtual   gg/essential/elementa/UIComponent.getBottom:()F
        //   228: aload_1         /* component */
        //   229: invokevirtual   gg/essential/elementa/UIComponent.getTop:()F
        //   232: fsub           
        //   233: freturn        
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  component  
        //    StackMapTable: 00 09 53 07 00 5B FF 00 33 00 0D 07 00 02 07 00 5B 07 00 5B 07 00 68 01 07 00 68 07 00 6D 01 07 00 73 00 00 00 02 00 00 FF 00 29 00 0D 07 00 02 07 00 5B 07 00 5B 07 00 68 01 07 00 68 07 00 6D 01 07 00 73 07 00 04 07 00 5B 01 02 00 00 40 01 FF 00 0F 00 0D 07 00 02 07 00 5B 07 00 5B 07 00 68 01 07 00 68 07 00 6D 01 07 00 73 00 00 00 02 00 00 FF 00 1D 00 0C 07 00 02 07 00 5B 07 00 5B 07 00 68 03 07 00 73 00 07 00 04 00 00 00 02 00 00 32 FF 00 0C 00 03 07 00 02 07 00 5B 07 00 5B 00 00 48 02
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public float getRadiusImpl(@NotNull final UIComponent component) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "component"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: invokevirtual   gg/essential/elementa/constraints/FillConstraint.getConstrainTo:()Lgg/essential/elementa/UIComponent;
        //    10: dup            
        //    11: ifnonnull       19
        //    14: pop            
        //    15: aload_1         /* component */
        //    16: invokevirtual   gg/essential/elementa/UIComponent.getParent:()Lgg/essential/elementa/UIComponent;
        //    19: astore_2        /* target */
        //    20: aload_0         /* this */
        //    21: getfield        gg/essential/elementa/constraints/FillConstraint.useSiblings:Z
        //    24: ifeq            224
        //    27: aload_2         /* target */
        //    28: invokevirtual   gg/essential/elementa/UIComponent.getRadius:()F
        //    31: aload_2         /* target */
        //    32: invokevirtual   gg/essential/elementa/UIComponent.getChildren:()Lgg/essential/elementa/utils/ObservableList;
        //    35: checkcast       Ljava/lang/Iterable;
        //    38: astore_3       
        //    39: fstore          12
        //    41: iconst_0       
        //    42: istore          $i$f$filter
        //    44: aload_3         /* $this$filter$iv */
        //    45: astore          5
        //    47: new             Ljava/util/ArrayList;
        //    50: dup            
        //    51: invokespecial   java/util/ArrayList.<init>:()V
        //    54: checkcast       Ljava/util/Collection;
        //    57: astore          destination$iv$iv
        //    59: iconst_0       
        //    60: istore          $i$f$filterTo
        //    62: aload           $this$filterTo$iv$iv
        //    64: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    69: astore          8
        //    71: aload           8
        //    73: invokeinterface java/util/Iterator.hasNext:()Z
        //    78: ifeq            130
        //    81: aload           8
        //    83: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    88: astore          element$iv$iv
        //    90: aload           element$iv$iv
        //    92: checkcast       Lgg/essential/elementa/UIComponent;
        //    95: astore          it
        //    97: iconst_0       
        //    98: istore          $i$a$-filter-FillConstraint$getRadiusImpl$1
        //   100: aload           it
        //   102: aload_1         /* component */
        //   103: invokestatic    kotlin/jvm/internal/Intrinsics.areEqual:(Ljava/lang/Object;Ljava/lang/Object;)Z
        //   106: ifne            113
        //   109: iconst_1       
        //   110: goto            114
        //   113: iconst_0       
        //   114: ifeq            71
        //   117: aload           destination$iv$iv
        //   119: aload           element$iv$iv
        //   121: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   126: pop            
        //   127: goto            71
        //   130: aload           destination$iv$iv
        //   132: checkcast       Ljava/util/List;
        //   135: nop            
        //   136: astore          13
        //   138: fload           12
        //   140: aload           13
        //   142: checkcast       Ljava/lang/Iterable;
        //   145: astore_3       
        //   146: fstore          12
        //   148: iconst_0       
        //   149: i2d            
        //   150: dstore          4
        //   152: aload_3        
        //   153: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   158: astore          6
        //   160: aload           6
        //   162: invokeinterface java/util/Iterator.hasNext:()Z
        //   167: ifeq            211
        //   170: aload           6
        //   172: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   177: astore          7
        //   179: dload           4
        //   181: aload           7
        //   183: checkcast       Lgg/essential/elementa/UIComponent;
        //   186: astore          8
        //   188: dstore          13
        //   190: iconst_0       
        //   191: istore          $i$a$-sumOfDouble-FillConstraint$getRadiusImpl$2
        //   193: aload           it
        //   195: invokevirtual   gg/essential/elementa/UIComponent.getRadius:()F
        //   198: f2d            
        //   199: dstore          15
        //   201: dload           13
        //   203: dload           15
        //   205: dadd           
        //   206: dstore          4
        //   208: goto            160
        //   211: dload           4
        //   213: dstore          13
        //   215: fload           12
        //   217: dload           13
        //   219: d2f            
        //   220: fsub           
        //   221: goto            235
        //   224: aload_2         /* target */
        //   225: invokevirtual   gg/essential/elementa/UIComponent.getRadius:()F
        //   228: aload_1         /* component */
        //   229: invokevirtual   gg/essential/elementa/UIComponent.getLeft:()F
        //   232: fsub           
        //   233: fconst_2       
        //   234: fdiv           
        //   235: freturn        
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  component  
        //    StackMapTable: 00 09 53 07 00 5B FF 00 33 00 0D 07 00 02 07 00 5B 07 00 5B 07 00 68 01 07 00 68 07 00 6D 01 07 00 73 00 00 00 02 00 00 FF 00 29 00 0D 07 00 02 07 00 5B 07 00 5B 07 00 68 01 07 00 68 07 00 6D 01 07 00 73 07 00 04 07 00 5B 01 02 00 00 40 01 FF 00 0F 00 0D 07 00 02 07 00 5B 07 00 5B 07 00 68 01 07 00 68 07 00 6D 01 07 00 73 00 00 00 02 00 00 FF 00 1D 00 0C 07 00 02 07 00 5B 07 00 5B 07 00 68 03 07 00 73 00 07 00 04 00 00 00 02 00 00 32 FF 00 0C 00 03 07 00 02 07 00 5B 07 00 5B 00 00 4A 02
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
        switch (FillConstraint.WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1: {
                visitor.visitParent(ConstraintType.WIDTH);
                if (this.useSiblings) {
                    final UIComponent it = visitor.getComponent();
                    final int n = 0;
                    final int indexInParent = it.getParent().getChildren().indexOf(it);
                    final int numParentChildren = visitor.getComponent().getParent().getChildren().size();
                    int j = 0;
                    while (j < numParentChildren) {
                        final int i = j;
                        ++j;
                        if (indexInParent != i) {
                            visitor.visitSibling(ConstraintType.WIDTH, i);
                        }
                    }
                    break;
                }
                visitor.visitParent(ConstraintType.X);
                visitor.visitSelf(ConstraintType.X);
                break;
            }
            case 2: {
                visitor.visitParent(ConstraintType.HEIGHT);
                if (this.useSiblings) {
                    final UIComponent it = visitor.getComponent();
                    final int n2 = 0;
                    final int indexInParent = it.getParent().getChildren().indexOf(it);
                    final int numParentChildren = visitor.getComponent().getParent().getChildren().size();
                    int k = 0;
                    while (k < numParentChildren) {
                        final int i = k;
                        ++k;
                        if (indexInParent != i) {
                            visitor.visitSibling(ConstraintType.HEIGHT, i);
                        }
                    }
                    break;
                }
                visitor.visitParent(ConstraintType.Y);
                visitor.visitSelf(ConstraintType.Y);
                break;
            }
            case 3: {
                visitor.visitParent(ConstraintType.RADIUS);
                if (this.useSiblings) {
                    final UIComponent it = visitor.getComponent();
                    final int n3 = 0;
                    final int indexInParent = it.getParent().getChildren().indexOf(it);
                    final int numParentChildren = visitor.getComponent().getParent().getChildren().size();
                    int l = 0;
                    while (l < numParentChildren) {
                        final int i = l;
                        ++l;
                        if (indexInParent != i) {
                            visitor.visitSibling(ConstraintType.RADIUS, i);
                        }
                    }
                    break;
                }
                visitor.visitSelf(ConstraintType.X);
                break;
            }
            default: {
                throw new IllegalArgumentException(type.getPrettyName());
            }
        }
    }
    
    @JvmOverloads
    public FillConstraint() {
        this(false, 1, null);
    }
    
    @Override
    public /* bridge */ Object getCachedValue() {
        return this.getCachedValue();
    }
    
    @Override
    public /* bridge */ void setCachedValue(final Object <set-?>) {
        this.setCachedValue(((Number)<set-?>).floatValue());
    }
}
