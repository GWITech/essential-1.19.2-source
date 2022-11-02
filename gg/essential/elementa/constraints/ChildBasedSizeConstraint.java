package gg.essential.elementa.constraints;

import kotlin.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.constraints.resolution.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\nH\u0016J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016R\u001a\u0010\u0005\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006!" }, d2 = { "Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;", "Lgg/essential/elementa/constraints/SizeConstraint;", "padding", "", "(F)V", "cachedValue", "getCachedValue", "()Ljava/lang/Float;", "setCachedValue", "constrainTo", "Lgg/essential/elementa/UIComponent;", "getConstrainTo", "()Lgg/essential/elementa/UIComponent;", "setConstrainTo", "(Lgg/essential/elementa/UIComponent;)V", "getPadding", "()F", "recalculate", "", "getRecalculate", "()Z", "setRecalculate", "(Z)V", "getHeightImpl", "component", "getRadiusImpl", "getWidthImpl", "visitImpl", "", "visitor", "Lgg/essential/elementa/constraints/resolution/ConstraintVisitor;", "type", "Lgg/essential/elementa/constraints/ConstraintType;", "Elementa" })
public final class ChildBasedSizeConstraint implements SizeConstraint
{
    private final float padding;
    private float cachedValue;
    private boolean recalculate;
    @Nullable
    private UIComponent constrainTo;
    
    public ChildBasedSizeConstraint(final float padding) {
        super();
        this.padding = padding;
        this.recalculate = true;
    }
    
    public ChildBasedSizeConstraint(float padding, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            padding = 0.0f;
        }
        this(padding);
    }
    
    public final float getPadding() {
        return this.padding;
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
        //     7: invokevirtual   gg/essential/elementa/constraints/ChildBasedSizeConstraint.getConstrainTo:()Lgg/essential/elementa/UIComponent;
        //    10: dup            
        //    11: ifnonnull       16
        //    14: pop            
        //    15: aload_1         /* component */
        //    16: astore_2        /* holder */
        //    17: aload_2         /* holder */
        //    18: invokevirtual   gg/essential/elementa/UIComponent.getChildren:()Lgg/essential/elementa/utils/ObservableList;
        //    21: checkcast       Ljava/lang/Iterable;
        //    24: astore_3       
        //    25: iconst_0       
        //    26: i2d            
        //    27: dstore          4
        //    29: aload_3        
        //    30: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    35: astore          6
        //    37: aload           6
        //    39: invokeinterface java/util/Iterator.hasNext:()Z
        //    44: ifeq            144
        //    47: aload           6
        //    49: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    54: astore          7
        //    56: dload           4
        //    58: aload           7
        //    60: checkcast       Lgg/essential/elementa/UIComponent;
        //    63: astore          8
        //    65: dstore          11
        //    67: iconst_0       
        //    68: istore          $i$a$-sumOfDouble-ChildBasedSizeConstraint$getWidthImpl$1
        //    70: aload           it
        //    72: invokevirtual   gg/essential/elementa/UIComponent.getWidth:()F
        //    75: f2d            
        //    76: aload           it
        //    78: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    81: invokevirtual   gg/essential/elementa/UIConstraints.getX:()Lgg/essential/elementa/constraints/XConstraint;
        //    84: astore          10
        //    86: aload           10
        //    88: instanceof      Lgg/essential/elementa/constraints/PaddingConstraint;
        //    91: ifeq            102
        //    94: aload           10
        //    96: checkcast       Lgg/essential/elementa/constraints/PaddingConstraint;
        //    99: goto            103
        //   102: aconst_null    
        //   103: dup            
        //   104: ifnonnull       112
        //   107: pop            
        //   108: fconst_0       
        //   109: goto            130
        //   112: aload           it
        //   114: ldc             "it"
        //   116: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   119: aload           it
        //   121: invokeinterface gg/essential/elementa/constraints/PaddingConstraint.getHorizontalPadding:(Lgg/essential/elementa/UIComponent;)F
        //   126: fstore          10
        //   128: fload           10
        //   130: f2d            
        //   131: dadd           
        //   132: dstore          13
        //   134: dload           11
        //   136: dload           13
        //   138: dadd           
        //   139: dstore          4
        //   141: goto            37
        //   144: dload           4
        //   146: d2f            
        //   147: aload_2         /* holder */
        //   148: invokevirtual   gg/essential/elementa/UIComponent.getChildren:()Lgg/essential/elementa/utils/ObservableList;
        //   151: invokevirtual   gg/essential/elementa/utils/ObservableList.size:()I
        //   154: iconst_1       
        //   155: isub           
        //   156: i2f            
        //   157: aload_0         /* this */
        //   158: getfield        gg/essential/elementa/constraints/ChildBasedSizeConstraint.padding:F
        //   161: fmul           
        //   162: fadd           
        //   163: freturn        
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  component  
        //    StackMapTable: 00 07 50 07 00 5C FF 00 14 00 06 07 00 02 07 00 5C 07 00 5C 07 00 62 03 07 00 68 00 00 FF 00 40 00 0B 07 00 02 07 00 5C 07 00 5C 07 00 62 03 07 00 68 07 00 04 07 00 5C 01 07 00 80 03 00 01 03 FF 00 00 00 0B 07 00 02 07 00 5C 07 00 5C 07 00 62 03 07 00 68 07 00 04 07 00 5C 01 07 00 80 03 00 02 03 07 00 7E FF 00 08 00 0B 07 00 02 07 00 5C 07 00 5C 07 00 62 03 07 00 68 07 00 04 07 00 5C 01 07 00 80 03 00 02 03 07 00 7E FF 00 11 00 0B 07 00 02 07 00 5C 07 00 5C 07 00 62 03 07 00 68 07 00 04 07 00 5C 01 00 03 00 02 03 02 FF 00 0D 00 06 07 00 02 07 00 5C 07 00 5C 07 00 62 03 07 00 68 00 00
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
        //     7: invokevirtual   gg/essential/elementa/constraints/ChildBasedSizeConstraint.getConstrainTo:()Lgg/essential/elementa/UIComponent;
        //    10: dup            
        //    11: ifnonnull       16
        //    14: pop            
        //    15: aload_1         /* component */
        //    16: astore_2        /* holder */
        //    17: aload_2         /* holder */
        //    18: invokevirtual   gg/essential/elementa/UIComponent.getChildren:()Lgg/essential/elementa/utils/ObservableList;
        //    21: checkcast       Ljava/lang/Iterable;
        //    24: astore_3       
        //    25: iconst_0       
        //    26: i2d            
        //    27: dstore          4
        //    29: aload_3        
        //    30: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    35: astore          6
        //    37: aload           6
        //    39: invokeinterface java/util/Iterator.hasNext:()Z
        //    44: ifeq            144
        //    47: aload           6
        //    49: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    54: astore          7
        //    56: dload           4
        //    58: aload           7
        //    60: checkcast       Lgg/essential/elementa/UIComponent;
        //    63: astore          8
        //    65: dstore          11
        //    67: iconst_0       
        //    68: istore          $i$a$-sumOfDouble-ChildBasedSizeConstraint$getHeightImpl$1
        //    70: aload           it
        //    72: invokevirtual   gg/essential/elementa/UIComponent.getHeight:()F
        //    75: f2d            
        //    76: aload           it
        //    78: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    81: invokevirtual   gg/essential/elementa/UIConstraints.getY:()Lgg/essential/elementa/constraints/YConstraint;
        //    84: astore          10
        //    86: aload           10
        //    88: instanceof      Lgg/essential/elementa/constraints/PaddingConstraint;
        //    91: ifeq            102
        //    94: aload           10
        //    96: checkcast       Lgg/essential/elementa/constraints/PaddingConstraint;
        //    99: goto            103
        //   102: aconst_null    
        //   103: dup            
        //   104: ifnonnull       112
        //   107: pop            
        //   108: fconst_0       
        //   109: goto            130
        //   112: aload           it
        //   114: ldc             "it"
        //   116: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   119: aload           it
        //   121: invokeinterface gg/essential/elementa/constraints/PaddingConstraint.getVerticalPadding:(Lgg/essential/elementa/UIComponent;)F
        //   126: fstore          10
        //   128: fload           10
        //   130: f2d            
        //   131: dadd           
        //   132: dstore          13
        //   134: dload           11
        //   136: dload           13
        //   138: dadd           
        //   139: dstore          4
        //   141: goto            37
        //   144: dload           4
        //   146: d2f            
        //   147: aload_2         /* holder */
        //   148: invokevirtual   gg/essential/elementa/UIComponent.getChildren:()Lgg/essential/elementa/utils/ObservableList;
        //   151: invokevirtual   gg/essential/elementa/utils/ObservableList.size:()I
        //   154: iconst_1       
        //   155: isub           
        //   156: i2f            
        //   157: aload_0         /* this */
        //   158: getfield        gg/essential/elementa/constraints/ChildBasedSizeConstraint.padding:F
        //   161: fmul           
        //   162: fadd           
        //   163: freturn        
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  component  
        //    StackMapTable: 00 07 50 07 00 5C FF 00 14 00 06 07 00 02 07 00 5C 07 00 5C 07 00 62 03 07 00 68 00 00 FF 00 40 00 0B 07 00 02 07 00 5C 07 00 5C 07 00 62 03 07 00 68 07 00 04 07 00 5C 01 07 00 9A 03 00 01 03 FF 00 00 00 0B 07 00 02 07 00 5C 07 00 5C 07 00 62 03 07 00 68 07 00 04 07 00 5C 01 07 00 9A 03 00 02 03 07 00 7E FF 00 08 00 0B 07 00 02 07 00 5C 07 00 5C 07 00 62 03 07 00 68 07 00 04 07 00 5C 01 07 00 9A 03 00 02 03 07 00 7E FF 00 11 00 0B 07 00 02 07 00 5C 07 00 5C 07 00 62 03 07 00 68 07 00 04 07 00 5C 01 00 03 00 02 03 02 FF 00 0D 00 06 07 00 02 07 00 5C 07 00 5C 07 00 62 03 07 00 68 00 00
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
        //     7: invokevirtual   gg/essential/elementa/constraints/ChildBasedSizeConstraint.getConstrainTo:()Lgg/essential/elementa/UIComponent;
        //    10: dup            
        //    11: ifnonnull       16
        //    14: pop            
        //    15: aload_1         /* component */
        //    16: invokevirtual   gg/essential/elementa/UIComponent.getChildren:()Lgg/essential/elementa/utils/ObservableList;
        //    19: checkcast       Ljava/lang/Iterable;
        //    22: astore_2       
        //    23: iconst_0       
        //    24: i2d            
        //    25: dstore_3       
        //    26: aload_2        
        //    27: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    32: astore          5
        //    34: aload           5
        //    36: invokeinterface java/util/Iterator.hasNext:()Z
        //    41: ifeq            83
        //    44: aload           5
        //    46: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    51: astore          6
        //    53: dload_3        
        //    54: aload           6
        //    56: checkcast       Lgg/essential/elementa/UIComponent;
        //    59: astore          7
        //    61: dstore          9
        //    63: iconst_0       
        //    64: istore          $i$a$-sumOfDouble-ChildBasedSizeConstraint$getRadiusImpl$1
        //    66: aload           it
        //    68: invokevirtual   gg/essential/elementa/UIComponent.getHeight:()F
        //    71: f2d            
        //    72: dstore          11
        //    74: dload           9
        //    76: dload           11
        //    78: dadd           
        //    79: dstore_3       
        //    80: goto            34
        //    83: dload_3        
        //    84: d2f            
        //    85: fconst_2       
        //    86: fmul           
        //    87: freturn        
        //    MethodParameters:
        //  Name       Flags  
        //  ---------  -----
        //  component  
        //    StackMapTable: 00 03 50 07 00 5C FE 00 11 07 00 62 03 07 00 68 30
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public void visitImpl(@NotNull final ConstraintVisitor visitor, @NotNull final ConstraintType type) {
        Intrinsics.checkNotNullParameter((Object)visitor, "visitor");
        Intrinsics.checkNotNullParameter((Object)type, "type");
        switch (ChildBasedSizeConstraint.WhenMappings.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1: {
                visitor.visitChildren(ConstraintType.WIDTH);
                break;
            }
            case 2: {
                visitor.visitChildren(ConstraintType.HEIGHT);
                break;
            }
            case 3: {
                visitor.visitChildren(ConstraintType.HEIGHT);
                break;
            }
            default: {
                throw new IllegalArgumentException(type.getPrettyName());
            }
        }
    }
    
    public ChildBasedSizeConstraint() {
        this(0.0f, 1, null);
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
