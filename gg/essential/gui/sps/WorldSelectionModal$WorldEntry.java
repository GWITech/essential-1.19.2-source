package gg.essential.gui.sps;

import kotlin.*;
import kotlin.reflect.*;
import net.minecraft.world.level.storage.*;
import org.jetbrains.annotations.*;
import kotlin.properties.*;
import java.io.*;
import java.util.*;
import gg.essential.elementa.state.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000P
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000b
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b
                                                   \u0018\u00002\u00020\u0001B\u001d\u0012\u000e\u0010\u0002\u001a
                                                   \u0012\u0006\u0012\u0004\u0018\u00010\u00000\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u000b\u0010\f\u001a\u0004\b	\u0010
                                                   R\u0016\u0010\r\u001a
                                                    \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0014\u0010\f\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a
                                                    \u000f*\u0004\u0018\u00010\u00160\u0016X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u0017\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0019\u0010\f\u001a\u0004\b\u0018\u0010
                                                   R\u0016\u0010\u001a\u001a
                                                    \u000f*\u0004\u0018\u00010\u001b0\u001bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001c\u0010\u001c\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b#\u0010\f\u001a\u0004\b!\u0010"R\u0016\u0010$\u001a
                                                    \u000f*\u0004\u0018\u00010\u001b0\u001bX\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010%\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b'\u0010\f\u001a\u0004\b&\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b(\u0010)¨\u0006*""" }, d2 = { "Lgg/essential/gui/sps/WorldSelectionModal$WorldEntry;", "Lgg/essential/elementa/components/UIBlock;", "selectedWorld", "Lgg/essential/elementa/state/State;", "worldSummary", "Lnet/minecraft/world/level/storage/LevelSummary;", "(Lgg/essential/elementa/state/State;Lnet/minecraft/world/level/storage/LevelSummary;)V", "content", "Lgg/essential/elementa/components/UIContainer;", "getContent", "()Lgg/essential/elementa/components/UIContainer;", "content$delegate", "Lkotlin/properties/ReadWriteProperty;", "date", "Ljava/util/Date;", "kotlin.jvm.PlatformType", "description", "Lgg/essential/gui/common/shadow/EssentialUIText;", "getDescription", "()Lgg/essential/gui/common/shadow/EssentialUIText;", "description$delegate", "icon", "Ljava/io/File;", "info", "getInfo", "info$delegate", "lastPlayed", "", "selected", "Lgg/essential/elementa/state/MappedState;", "", "thumbnail", "Lgg/essential/elementa/components/UIImage;", "getThumbnail", "()Lgg/essential/elementa/components/UIImage;", "thumbnail$delegate", "versionName", "worldName", "getWorldName", "worldName$delegate", "getWorldSummary", "()Lnet/minecraft/world/level/storage/LevelSummary;", "essential" })
public static final class WorldEntry extends UIBlock
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final LevelSummary worldSummary;
    @NotNull
    private final MappedState<WorldEntry, Boolean> selected;
    @NotNull
    private final ReadWriteProperty content$delegate;
    private final File icon;
    @NotNull
    private final ReadWriteProperty thumbnail$delegate;
    @NotNull
    private final ReadWriteProperty info$delegate;
    private final Date date;
    private final String lastPlayed;
    private final String versionName;
    
    public WorldEntry(@NotNull final State<WorldEntry> selectedWorld, @NotNull final LevelSummary worldSummary) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "selectedWorld"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* worldSummary */
        //     7: ldc             "worldSummary"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: aconst_null    
        //    14: iconst_1       
        //    15: aconst_null    
        //    16: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/constraints/ColorConstraint;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    19: aload_0         /* this */
        //    20: aload_2         /* worldSummary */
        //    21: putfield        gg/essential/gui/sps/WorldSelectionModal$WorldEntry.worldSummary:Lnet/minecraft/world/level/storage/LevelSummary;
        //    24: aload_0         /* this */
        //    25: aload_1         /* selectedWorld */
        //    26: new             Lgg/essential/gui/sps/WorldSelectionModal$WorldEntry$selected$1;
        //    29: dup            
        //    30: aload_0         /* this */
        //    31: invokespecial   gg/essential/gui/sps/WorldSelectionModal$WorldEntry$selected$1.<init>:(Lgg/essential/gui/sps/WorldSelectionModal$WorldEntry;)V
        //    34: checkcast       Lkotlin/jvm/functions/Function1;
        //    37: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //    40: putfield        gg/essential/gui/sps/WorldSelectionModal$WorldEntry.selected:Lgg/essential/elementa/state/MappedState;
        //    43: aload_0         /* this */
        //    44: new             Lgg/essential/elementa/components/UIContainer;
        //    47: dup            
        //    48: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //    51: checkcast       Lgg/essential/elementa/UIComponent;
        //    54: invokestatic    gg/essential/util/ExtensionsKt.centered:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //    57: astore_3        /* $this$constrain$iv */
        //    58: aload_3         /* $this$constrain$iv */
        //    59: astore          4
        //    61: aload           4
        //    63: astore          $this$constrain_u24lambda_u2d0$iv
        //    65: aload           $this$constrain_u24lambda_u2d0$iv
        //    67: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    70: astore          6
        //    72: astore          7
        //    74: aload           $this$content_delegate_u24lambda_u2d0
        //    76: bipush          100
        //    78: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    81: checkcast       Ljava/lang/Number;
        //    84: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //    87: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //    90: bipush          12
        //    92: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    95: checkcast       Ljava/lang/Number;
        //    98: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   101: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   104: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   107: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   110: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   113: aload           $this$content_delegate_u24lambda_u2d0
        //   115: bipush          100
        //   117: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   120: checkcast       Ljava/lang/Number;
        //   123: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   126: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   129: bipush          12
        //   131: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   134: checkcast       Ljava/lang/Number;
        //   137: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   140: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   143: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   146: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   149: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   152: aload           7
        //   154: aload           4
        //   156: aload_0         /* this */
        //   157: checkcast       Lgg/essential/elementa/UIComponent;
        //   160: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   163: aload_0         /* this */
        //   164: getstatic       gg/essential/gui/sps/WorldSelectionModal$WorldEntry.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   167: iconst_0       
        //   168: aaload         
        //   169: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   172: putfield        gg/essential/gui/sps/WorldSelectionModal$WorldEntry.content$delegate:Lkotlin/properties/ReadWriteProperty;
        //   175: aload_0         /* this */
        //   176: aload_0         /* this */
        //   177: getfield        gg/essential/gui/sps/WorldSelectionModal$WorldEntry.worldSummary:Lnet/minecraft/world/level/storage/LevelSummary;
        //   180: invokevirtual   net/minecraft/world/level/storage/LevelSummary.getIconPath:()Ljava/nio/file/Path;
        //   183: invokeinterface java/nio/file/Path.toFile:()Ljava/io/File;
        //   188: putfield        gg/essential/gui/sps/WorldSelectionModal$WorldEntry.icon:Ljava/io/File;
        //   191: aload_0         /* this */
        //   192: aload_0         /* this */
        //   193: getfield        gg/essential/gui/sps/WorldSelectionModal$WorldEntry.icon:Ljava/io/File;
        //   196: invokevirtual   java/io/File.isFile:()Z
        //   199: ifeq            221
        //   202: getstatic       gg/essential/elementa/components/UIImage.Companion:Lgg/essential/elementa/components/UIImage$Companion;
        //   205: aload_0         /* this */
        //   206: getfield        gg/essential/gui/sps/WorldSelectionModal$WorldEntry.icon:Ljava/io/File;
        //   209: dup            
        //   210: ldc             "icon"
        //   212: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   215: invokevirtual   gg/essential/elementa/components/UIImage$Companion.ofFile:(Ljava/io/File;)Lgg/essential/elementa/components/UIImage;
        //   218: goto            227
        //   221: getstatic       gg/essential/gui/EssentialPalette.PACK_128X:Lgg/essential/gui/image/ImageFactory;
        //   224: invokevirtual   gg/essential/gui/image/ImageFactory.create:()Lgg/essential/elementa/components/UIImage;
        //   227: checkcast       Lgg/essential/elementa/UIComponent;
        //   230: astore_3        /* $this$constrain$iv */
        //   231: aload_3         /* $this$constrain$iv */
        //   232: astore          4
        //   234: aload           4
        //   236: astore          $this$constrain_u24lambda_u2d0$iv
        //   238: aload           $this$constrain_u24lambda_u2d0$iv
        //   240: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   243: astore          6
        //   245: astore          7
        //   247: aload           $this$thumbnail_delegate_u24lambda_u2d1
        //   249: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //   252: dup            
        //   253: fconst_0       
        //   254: iconst_1       
        //   255: aconst_null    
        //   256: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   259: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   262: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   265: aload           $this$thumbnail_delegate_u24lambda_u2d1
        //   267: bipush          100
        //   269: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   272: checkcast       Ljava/lang/Number;
        //   275: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   278: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   281: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   284: aload           7
        //   286: aload           4
        //   288: new             Lgg/essential/gui/common/shadow/ShadowEffect;
        //   291: dup            
        //   292: iconst_0       
        //   293: invokespecial   gg/essential/gui/common/shadow/ShadowEffect.<init>:(B)V
        //   296: checkcast       Lgg/essential/elementa/effects/Effect;
        //   299: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   302: aload_0         /* this */
        //   303: invokespecial   gg/essential/gui/sps/WorldSelectionModal$WorldEntry.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   306: checkcast       Lgg/essential/elementa/UIComponent;
        //   309: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   312: aload_0         /* this */
        //   313: getstatic       gg/essential/gui/sps/WorldSelectionModal$WorldEntry.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   316: iconst_1       
        //   317: aaload         
        //   318: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   321: putfield        gg/essential/gui/sps/WorldSelectionModal$WorldEntry.thumbnail$delegate:Lkotlin/properties/ReadWriteProperty;
        //   324: aload_0         /* this */
        //   325: new             Lgg/essential/elementa/components/UIContainer;
        //   328: dup            
        //   329: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   332: checkcast       Lgg/essential/elementa/UIComponent;
        //   335: astore_3        /* $this$constrain$iv */
        //   336: aload_3         /* $this$constrain$iv */
        //   337: astore          4
        //   339: aload           4
        //   341: astore          $this$constrain_u24lambda_u2d0$iv
        //   343: aload           $this$constrain_u24lambda_u2d0$iv
        //   345: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   348: astore          6
        //   350: astore          7
        //   352: aload           $this$info_delegate_u24lambda_u2d2
        //   354: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   357: dup            
        //   358: ldc             7.0
        //   360: iconst_0       
        //   361: iconst_2       
        //   362: aconst_null    
        //   363: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   366: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   369: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   372: aload           $this$info_delegate_u24lambda_u2d2
        //   374: new             Lgg/essential/elementa/constraints/ChildBasedMaxSizeConstraint;
        //   377: dup            
        //   378: invokespecial   gg/essential/elementa/constraints/ChildBasedMaxSizeConstraint.<init>:()V
        //   381: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   384: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   387: aload           $this$info_delegate_u24lambda_u2d2
        //   389: bipush          100
        //   391: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   394: checkcast       Ljava/lang/Number;
        //   397: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   400: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   403: aload_0         /* this */
        //   404: invokespecial   gg/essential/gui/sps/WorldSelectionModal$WorldEntry.getThumbnail:()Lgg/essential/elementa/components/UIImage;
        //   407: checkcast       Lgg/essential/elementa/UIComponent;
        //   410: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   413: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   416: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   419: aload           7
        //   421: aload           4
        //   423: aload_0         /* this */
        //   424: invokespecial   gg/essential/gui/sps/WorldSelectionModal$WorldEntry.getContent:()Lgg/essential/elementa/components/UIContainer;
        //   427: checkcast       Lgg/essential/elementa/UIComponent;
        //   430: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   433: aload_0         /* this */
        //   434: getstatic       gg/essential/gui/sps/WorldSelectionModal$WorldEntry.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   437: iconst_2       
        //   438: aaload         
        //   439: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   442: putfield        gg/essential/gui/sps/WorldSelectionModal$WorldEntry.info$delegate:Lkotlin/properties/ReadWriteProperty;
        //   445: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //   448: dup            
        //   449: aload_0         /* this */
        //   450: getfield        gg/essential/gui/sps/WorldSelectionModal$WorldEntry.worldSummary:Lnet/minecraft/world/level/storage/LevelSummary;
        //   453: invokevirtual   net/minecraft/world/level/storage/LevelSummary.getDisplayName:()Ljava/lang/String;
        //   456: dup            
        //   457: ldc_w           "worldSummary.displayName"
        //   460: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullExpressionValue:(Ljava/lang/Object;Ljava/lang/String;)V
        //   463: iconst_0       
        //   464: getstatic       gg/essential/gui/EssentialPalette.TEXT_SHADOW:Ljava/awt/Color;
        //   467: iconst_0       
        //   468: iconst_0       
        //   469: iconst_0       
        //   470: bipush          58
        //   472: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //   475: checkcast       Lgg/essential/elementa/UIComponent;
        //   478: aload_0         /* this */
        //   479: invokespecial   gg/essential/gui/sps/WorldSelectionModal$WorldEntry.getInfo:()Lgg/essential/elementa/components/UIContainer;
        //   482: checkcast       Lgg/essential/elementa/UIComponent;
        //   485: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   488: aload_0         /* this */
        //   489: getstatic       gg/essential/gui/sps/WorldSelectionModal$WorldEntry.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   492: iconst_3       
        //   493: aaload         
        //   494: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   497: pop            
        //   498: aload_0         /* this */
        //   499: aload_0         /* this */
        //   500: getfield        gg/essential/gui/sps/WorldSelectionModal$WorldEntry.worldSummary:Lnet/minecraft/world/level/storage/LevelSummary;
        //   503: invokevirtual   net/minecraft/world/level/storage/LevelSummary.getLastPlayed:()J
        //   506: invokestatic    java/time/Instant.ofEpochMilli:(J)Ljava/time/Instant;
        //   509: invokestatic    java/util/Date.from:(Ljava/time/Instant;)Ljava/util/Date;
        //   512: putfield        gg/essential/gui/sps/WorldSelectionModal$WorldEntry.date:Ljava/util/Date;
        //   515: aload_0         /* this */
        //   516: iconst_3       
        //   517: iconst_3       
        //   518: invokestatic    java/text/DateFormat.getDateTimeInstance:(II)Ljava/text/DateFormat;
        //   521: aload_0         /* this */
        //   522: getfield        gg/essential/gui/sps/WorldSelectionModal$WorldEntry.date:Ljava/util/Date;
        //   525: invokevirtual   java/text/DateFormat.format:(Ljava/util/Date;)Ljava/lang/String;
        //   528: putfield        gg/essential/gui/sps/WorldSelectionModal$WorldEntry.lastPlayed:Ljava/lang/String;
        //   531: aload_0         /* this */
        //   532: aload_0         /* this */
        //   533: getfield        gg/essential/gui/sps/WorldSelectionModal$WorldEntry.worldSummary:Lnet/minecraft/world/level/storage/LevelSummary;
        //   536: invokevirtual   net/minecraft/world/level/storage/LevelSummary.getVersion:()Lnet/minecraft/text/MutableText;
        //   539: invokevirtual   net/minecraft/text/MutableText.getString:()Ljava/lang/String;
        //   542: putfield        gg/essential/gui/sps/WorldSelectionModal$WorldEntry.versionName:Ljava/lang/String;
        //   545: new             Lgg/essential/gui/common/shadow/EssentialUIText;
        //   548: dup            
        //   549: aload_0         /* this */
        //   550: getfield        gg/essential/gui/sps/WorldSelectionModal$WorldEntry.lastPlayed:Ljava/lang/String;
        //   553: aload_0         /* this */
        //   554: getfield        gg/essential/gui/sps/WorldSelectionModal$WorldEntry.versionName:Ljava/lang/String;
        //   557: invokedynamic   BootstrapMethod #0, makeConcatWithConstants:(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
        //   562: iconst_0       
        //   563: getstatic       gg/essential/gui/EssentialPalette.TEXT_SHADOW:Ljava/awt/Color;
        //   566: iconst_0       
        //   567: iconst_0       
        //   568: iconst_0       
        //   569: bipush          58
        //   571: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
        //   574: checkcast       Lgg/essential/elementa/UIComponent;
        //   577: astore_3        /* $this$constrain$iv */
        //   578: aload_3         /* $this$constrain$iv */
        //   579: astore          4
        //   581: aload           4
        //   583: astore          $this$constrain_u24lambda_u2d0$iv
        //   585: aload           $this$constrain_u24lambda_u2d0$iv
        //   587: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   590: astore          $this$description_delegate_u24lambda_u2d3
        //   592: aload           $this$description_delegate_u24lambda_u2d3
        //   594: iconst_0       
        //   595: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   598: checkcast       Ljava/lang/Number;
        //   601: iconst_1       
        //   602: iconst_0       
        //   603: iconst_2       
        //   604: aconst_null    
        //   605: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   608: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   611: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   614: aload           $this$description_delegate_u24lambda_u2d3
        //   616: getstatic       gg/essential/gui/EssentialPalette.TEXT:Ljava/awt/Color;
        //   619: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.toConstraint:(Ljava/awt/Color;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   622: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   625: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   628: aload           4
        //   630: aload_0         /* this */
        //   631: invokespecial   gg/essential/gui/sps/WorldSelectionModal$WorldEntry.getInfo:()Lgg/essential/elementa/components/UIContainer;
        //   634: checkcast       Lgg/essential/elementa/UIComponent;
        //   637: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   640: aload_0         /* this */
        //   641: getstatic       gg/essential/gui/sps/WorldSelectionModal$WorldEntry.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   644: iconst_4       
        //   645: aaload         
        //   646: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   649: pop            
        //   650: aload_0         /* this */
        //   651: checkcast       Lgg/essential/elementa/UIComponent;
        //   654: astore_3        /* $this$constrain$iv */
        //   655: aload_3         /* $this$constrain$iv */
        //   656: astore          4
        //   658: aload           4
        //   660: astore          $this$constrain_u24lambda_u2d0$iv
        //   662: aload           $this$constrain_u24lambda_u2d0$iv
        //   664: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   667: astore          $this$_init__u24lambda_u2d4
        //   669: aload           $this$_init__u24lambda_u2d4
        //   671: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   674: dup            
        //   675: fconst_2       
        //   676: iconst_0       
        //   677: iconst_2       
        //   678: aconst_null    
        //   679: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   682: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   685: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   688: aload           $this$_init__u24lambda_u2d4
        //   690: sipush          186
        //   693: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   696: checkcast       Ljava/lang/Number;
        //   699: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   702: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   705: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   708: aload           $this$_init__u24lambda_u2d4
        //   710: bipush          31
        //   712: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   715: checkcast       Ljava/lang/Number;
        //   718: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   721: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   724: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   727: aload           $this$_init__u24lambda_u2d4
        //   729: aload_0         /* this */
        //   730: getfield        gg/essential/gui/sps/WorldSelectionModal$WorldEntry.selected:Lgg/essential/elementa/state/MappedState;
        //   733: getstatic       gg/essential/gui/sps/WorldSelectionModal$WorldEntry$1$1.INSTANCE:Lgg/essential/gui/sps/WorldSelectionModal$WorldEntry$1$1;
        //   736: checkcast       Lkotlin/jvm/functions/Function1;
        //   739: invokevirtual   gg/essential/elementa/state/MappedState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   742: checkcast       Lgg/essential/elementa/state/State;
        //   745: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
        //   748: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
        //   751: invokevirtual   gg/essential/elementa/UIConstraints.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)V
        //   754: aload           4
        //   756: new             Lgg/essential/elementa/effects/OutlineEffect;
        //   759: dup            
        //   760: aload_0         /* this */
        //   761: checkcast       Lgg/essential/elementa/UIComponent;
        //   764: iconst_0       
        //   765: iconst_0       
        //   766: iconst_3       
        //   767: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
        //   770: aload_0         /* this */
        //   771: getfield        gg/essential/gui/sps/WorldSelectionModal$WorldEntry.selected:Lgg/essential/elementa/state/MappedState;
        //   774: checkcast       Lgg/essential/elementa/state/State;
        //   777: invokevirtual   gg/essential/elementa/state/State.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
        //   780: getstatic       gg/essential/gui/sps/WorldSelectionModal$WorldEntry$2.INSTANCE:Lgg/essential/gui/sps/WorldSelectionModal$WorldEntry$2;
        //   783: checkcast       Lkotlin/jvm/functions/Function1;
        //   786: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   789: checkcast       Lgg/essential/elementa/state/State;
        //   792: new             Lgg/essential/elementa/state/BasicState;
        //   795: dup            
        //   796: fconst_1       
        //   797: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   800: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   803: checkcast       Lgg/essential/elementa/state/State;
        //   806: iconst_0       
        //   807: iconst_1       
        //   808: aconst_null    
        //   809: bipush          20
        //   811: aconst_null    
        //   812: invokespecial   gg/essential/elementa/effects/OutlineEffect.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/elementa/state/State;ZZLjava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   815: checkcast       Lgg/essential/elementa/effects/Effect;
        //   818: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   821: pop            
        //   822: return         
        //    Signature:
        //  (Lgg/essential/elementa/state/State<Lgg/essential/gui/sps/WorldSelectionModal$WorldEntry;>;Lnet/minecraft/world/level/storage/LevelSummary;)V
        //    MethodParameters:
        //  Name           Flags  
        //  -------------  -----
        //  selectedWorld  
        //  worldSummary   
        //    StackMapTable: 00 02 FF 00 DD 00 08 07 00 02 07 00 5F 07 00 AE 07 00 6C 07 00 6C 07 00 6C 07 00 94 07 00 02 00 01 07 00 02 FF 00 05 00 08 07 00 02 07 00 5F 07 00 AE 07 00 6C 07 00 6C 07 00 6C 07 00 94 07 00 02 00 02 07 00 02 07 00 C2
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final LevelSummary getWorldSummary() {
        return this.worldSummary;
    }
    
    private final UIContainer getContent() {
        return (UIContainer)this.content$delegate.getValue((Object)this, (KProperty)WorldEntry.$$delegatedProperties[0]);
    }
    
    private final UIImage getThumbnail() {
        return (UIImage)this.thumbnail$delegate.getValue((Object)this, (KProperty)WorldEntry.$$delegatedProperties[1]);
    }
    
    private final UIContainer getInfo() {
        return (UIContainer)this.info$delegate.getValue((Object)this, (KProperty)WorldEntry.$$delegatedProperties[2]);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)WorldEntry.class, "content", "getContent()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)WorldEntry.class, "thumbnail", "getThumbnail()Lgg/essential/elementa/components/UIImage;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)WorldEntry.class, "info", "getInfo()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)WorldEntry.class, "worldName", "getWorldName()Lgg/essential/gui/common/shadow/EssentialUIText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)WorldEntry.class, "description", "getDescription()Lgg/essential/gui/common/shadow/EssentialUIText;", 0)) };
    }
}
