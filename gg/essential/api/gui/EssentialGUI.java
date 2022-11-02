package gg.essential.api.gui;

import kotlin.*;
import kotlin.reflect.*;
import kotlin.properties.*;
import java.awt.*;
import gg.essential.api.*;
import kotlin.jvm.*;
import gg.essential.elementa.*;
import org.jetbrains.annotations.*;
import gg.essential.elementa.components.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000T
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010\b
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u000b
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0007
                                                   \u0002\u0018\u0002
                                                   \u0002\b\f
                                                   \u0002\u0010\u0007
                                                   \u0002\b\f
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0003\b\u0016\u0018\u0000 D2\u00020\u0001:\u0001DB-\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020	¢\u0006\u0002\u0010
                                                   B%\b\u0017\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020	¢\u0006\u0002\u0010\u000bB7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020	\u0012
                                                   \b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\u000e\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020\u0005R$\u0010\u000f\u001a\u00020	2\u0006\u0010\u000e\u001a\u00020	@FX\u0086\u000e¢\u0006\u000e
                                                   \u0000\u001a\u0004\b\u0010\u0010\u0011"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0014\u001a\u00020\u00158BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b!\u0010\u0019\u001a\u0004\b \u0010\u001dR\u001b\u0010"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b&\u0010\u0019\u001a\u0004\b$\u0010%R\u001b\u0010'\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b)\u0010\u0019\u001a\u0004\b(\u0010%R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b
                                                   \u0000\u001a\u0004\b*\u0010+R\u001b\u0010,\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b.\u0010\u0019\u001a\u0004\b-\u0010\u001dR\u0016\u0010/\u001a\u0002008EX\u0084D¢\u0006\b
                                                   \u0000\u001a\u0004\b1\u00102R\u001b\u00103\u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b5\u0010\u0019\u001a\u0004\b4\u0010\u001dR\u001b\u00106\u001a\u00020#8FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b8\u0010\u0019\u001a\u0004\b7\u0010%R\u001b\u00109\u001a\u00020\u001b8FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b;\u0010\u0019\u001a\u0004\b:\u0010\u001dR\u001b\u0010<\u001a\u00020=8FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b@\u0010\u0019\u001a\u0004\b>\u0010?¨\u0006E""" }, d2 = { "Lgg/essential/api/gui/EssentialGUI;", "Lgg/essential/elementa/WindowScreen;", "version", "Lgg/essential/elementa/ElementaVersion;", "guiTitle", "", "newGuiScale", "", "restorePreviousGuiOnClose", "", "(Lgg/essential/elementa/ElementaVersion;Ljava/lang/String;IZ)V", "(Ljava/lang/String;IZ)V", "discordActivityDescription", "(Lgg/essential/elementa/ElementaVersion;Ljava/lang/String;IZLjava/lang/String;)V", "value", "backButtonVisible", "getBackButtonVisible", "()Z", "setBackButtonVisible", "(Z)V", "backContainer", "Lgg/essential/elementa/UIComponent;", "getBackContainer", "()Lgg/essential/elementa/UIComponent;", "backContainer$delegate", "Lkotlin/properties/ReadWriteProperty;", "background", "Lgg/essential/elementa/components/UIBlock;", "getBackground", "()Lgg/essential/elementa/components/UIBlock;", "background$delegate", "bottomDivider", "getBottomDivider", "bottomDivider$delegate", "container", "Lgg/essential/elementa/components/UIContainer;", "getContainer", "()Lgg/essential/elementa/components/UIContainer;", "container$delegate", "content", "getContent", "content$delegate", "getDiscordActivityDescription", "()Ljava/lang/String;", "leftDivider", "getLeftDivider", "leftDivider$delegate", "outlineThickness", "", "getOutlineThickness", "()F", "rightDivider", "getRightDivider", "rightDivider$delegate", "scissorBox", "getScissorBox", "scissorBox$delegate", "titleBar", "getTitleBar", "titleBar$delegate", "titleText", "Lgg/essential/elementa/components/UIWrappedText;", "getTitleText", "()Lgg/essential/elementa/components/UIWrappedText;", "titleText$delegate", "setTitle", "", "newTitle", "EssentialGuiPalette", "essential-api" })
public class EssentialGUI extends WindowScreen
{
    @NotNull
    private static final EssentialGuiPalette EssentialGuiPalette;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @Nullable
    private final String discordActivityDescription;
    private boolean backButtonVisible;
    private final float outlineThickness;
    @NotNull
    private final ReadWriteProperty background$delegate;
    @NotNull
    private final ReadWriteProperty scissorBox$delegate;
    @NotNull
    private final ReadWriteProperty container$delegate;
    @NotNull
    private final ReadWriteProperty leftDivider$delegate;
    @NotNull
    private final ReadWriteProperty rightDivider$delegate;
    @NotNull
    private final ReadWriteProperty bottomDivider$delegate;
    @NotNull
    private final ReadWriteProperty titleBar$delegate;
    @NotNull
    private final ReadWriteProperty titleText$delegate;
    @NotNull
    private final ReadWriteProperty content$delegate;
    @NotNull
    private final ReadWriteProperty backContainer$delegate;
    @Deprecated
    @NotNull
    private static final Color BACKGROUND;
    @Deprecated
    @NotNull
    private static final Color DARK_GRAY;
    @Deprecated
    @NotNull
    private static final Color BUTTON;
    @Deprecated
    @NotNull
    private static final Color BUTTON_HIGHLIGHT;
    @Deprecated
    @NotNull
    private static final Color TEXT;
    @Deprecated
    @NotNull
    private static final Color TEXT_HIGHLIGHT;
    @Deprecated
    @NotNull
    private static final Color COMPONENT_HIGHLIGHT;
    
    public EssentialGUI(@NotNull final ElementaVersion version, @NotNull final String guiTitle, final int newGuiScale, final boolean restorePreviousGuiOnClose, @Nullable final String discordActivityDescription) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "version"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_2         /* guiTitle */
        //     7: ldc             "guiTitle"
        //     9: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //    12: aload_0         /* this */
        //    13: aload_1         /* version */
        //    14: iconst_0       
        //    15: iconst_0       
        //    16: iload           restorePreviousGuiOnClose
        //    18: iload_3         /* newGuiScale */
        //    19: bipush          6
        //    21: aconst_null    
        //    22: invokespecial   gg/essential/elementa/WindowScreen.<init>:(Lgg/essential/elementa/ElementaVersion;ZZZIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    25: aload_0         /* this */
        //    26: aload           discordActivityDescription
        //    28: putfield        gg/essential/api/gui/EssentialGUI.discordActivityDescription:Ljava/lang/String;
        //    31: aload_0         /* this */
        //    32: iconst_1       
        //    33: putfield        gg/essential/api/gui/EssentialGUI.backButtonVisible:Z
        //    36: aload_0         /* this */
        //    37: ldc             3.0
        //    39: putfield        gg/essential/api/gui/EssentialGUI.outlineThickness:F
        //    42: aload_0         /* this */
        //    43: new             Lgg/essential/elementa/components/UIBlock;
        //    46: dup            
        //    47: getstatic       gg/essential/api/gui/EssentialGUI.BACKGROUND:Ljava/awt/Color;
        //    50: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //    53: checkcast       Lgg/essential/elementa/UIComponent;
        //    56: astore          $this$constrain$iv
        //    58: aload           $this$constrain$iv
        //    60: astore          7
        //    62: aload           7
        //    64: astore          $this$constrain_u24lambda_u2d0$iv
        //    66: aload           $this$constrain_u24lambda_u2d0$iv
        //    68: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    71: astore          9
        //    73: astore          10
        //    75: aload           $this$background_delegate_u24lambda_u2d0
        //    77: bipush          100
        //    79: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    82: checkcast       Ljava/lang/Number;
        //    85: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //    88: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //    91: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //    94: aload           $this$background_delegate_u24lambda_u2d0
        //    96: bipush          100
        //    98: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   101: checkcast       Ljava/lang/Number;
        //   104: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   107: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   110: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   113: aload           10
        //   115: aload           7
        //   117: aload_0         /* this */
        //   118: invokevirtual   gg/essential/api/gui/EssentialGUI.getWindow:()Lgg/essential/elementa/components/Window;
        //   121: checkcast       Lgg/essential/elementa/UIComponent;
        //   124: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   127: aload_0         /* this */
        //   128: getstatic       gg/essential/api/gui/EssentialGUI.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   131: iconst_0       
        //   132: aaload         
        //   133: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   136: putfield        gg/essential/api/gui/EssentialGUI.background$delegate:Lkotlin/properties/ReadWriteProperty;
        //   139: aload_0         /* this */
        //   140: new             Lgg/essential/elementa/components/UIContainer;
        //   143: dup            
        //   144: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   147: checkcast       Lgg/essential/elementa/UIComponent;
        //   150: astore          $this$constrain$iv
        //   152: aload           $this$constrain$iv
        //   154: astore          7
        //   156: aload           7
        //   158: astore          $this$constrain_u24lambda_u2d0$iv
        //   160: aload           $this$constrain_u24lambda_u2d0$iv
        //   162: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   165: astore          9
        //   167: astore          10
        //   169: aload           $this$scissorBox_delegate_u24lambda_u2d1
        //   171: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   174: dup            
        //   175: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   178: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   181: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   184: aload           $this$scissorBox_delegate_u24lambda_u2d1
        //   186: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   189: dup            
        //   190: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   193: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   196: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   199: aload           $this$scissorBox_delegate_u24lambda_u2d1
        //   201: bipush          85
        //   203: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   206: checkcast       Ljava/lang/Number;
        //   209: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   212: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   215: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   218: aload           $this$scissorBox_delegate_u24lambda_u2d1
        //   220: bipush          75
        //   222: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   225: checkcast       Ljava/lang/Number;
        //   228: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   231: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   234: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   237: aload           10
        //   239: aload           7
        //   241: aload_0         /* this */
        //   242: invokevirtual   gg/essential/api/gui/EssentialGUI.getWindow:()Lgg/essential/elementa/components/Window;
        //   245: checkcast       Lgg/essential/elementa/UIComponent;
        //   248: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   251: aload_0         /* this */
        //   252: getstatic       gg/essential/api/gui/EssentialGUI.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   255: iconst_1       
        //   256: aaload         
        //   257: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   260: putfield        gg/essential/api/gui/EssentialGUI.scissorBox$delegate:Lkotlin/properties/ReadWriteProperty;
        //   263: aload_0         /* this */
        //   264: new             Lgg/essential/elementa/components/UIContainer;
        //   267: dup            
        //   268: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   271: checkcast       Lgg/essential/elementa/UIComponent;
        //   274: astore          $this$constrain$iv
        //   276: aload           $this$constrain$iv
        //   278: astore          7
        //   280: aload           7
        //   282: astore          $this$constrain_u24lambda_u2d0$iv
        //   284: aload           $this$constrain_u24lambda_u2d0$iv
        //   286: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   289: astore          9
        //   291: astore          10
        //   293: aload           $this$container_delegate_u24lambda_u2d2
        //   295: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   298: dup            
        //   299: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   302: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   305: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   308: aload           $this$container_delegate_u24lambda_u2d2
        //   310: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   313: dup            
        //   314: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   317: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   320: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   323: aload           $this$container_delegate_u24lambda_u2d2
        //   325: bipush          85
        //   327: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   330: checkcast       Ljava/lang/Number;
        //   333: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   336: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   339: bipush          100
        //   341: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   344: checkcast       Ljava/lang/Number;
        //   347: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   350: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   353: new             Lgg/essential/api/gui/EssentialGUI$container$2$1;
        //   356: dup            
        //   357: aload_0         /* this */
        //   358: invokespecial   gg/essential/api/gui/EssentialGUI$container$2$1.<init>:(Lgg/essential/api/gui/EssentialGUI;)V
        //   361: checkcast       Lkotlin/jvm/functions/Function1;
        //   364: invokestatic    gg/essential/elementa/dsl/BasicConstraintsKt.basicWidthConstraint:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/constraints/WidthConstraint;
        //   367: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   370: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   373: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   376: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.coerceAtMost:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/CoerceAtMostConstraint;
        //   379: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   382: iconst_0       
        //   383: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   386: checkcast       Ljava/lang/Number;
        //   389: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   392: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   395: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.coerceAtLeast:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/CoerceAtLeastConstraint;
        //   398: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   401: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   404: aload           $this$container_delegate_u24lambda_u2d2
        //   406: bipush          75
        //   408: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   411: checkcast       Ljava/lang/Number;
        //   414: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   417: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   420: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   423: aload           10
        //   425: aload           7
        //   427: aload_0         /* this */
        //   428: invokevirtual   gg/essential/api/gui/EssentialGUI.getWindow:()Lgg/essential/elementa/components/Window;
        //   431: checkcast       Lgg/essential/elementa/UIComponent;
        //   434: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   437: aload_0         /* this */
        //   438: getstatic       gg/essential/api/gui/EssentialGUI.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   441: iconst_2       
        //   442: aaload         
        //   443: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   446: putfield        gg/essential/api/gui/EssentialGUI.container$delegate:Lkotlin/properties/ReadWriteProperty;
        //   449: aload_0         /* this */
        //   450: new             Lgg/essential/elementa/components/UIBlock;
        //   453: dup            
        //   454: getstatic       gg/essential/api/gui/EssentialGUI.DARK_GRAY:Ljava/awt/Color;
        //   457: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   460: checkcast       Lgg/essential/elementa/UIComponent;
        //   463: astore          $this$constrain$iv
        //   465: aload           $this$constrain$iv
        //   467: astore          7
        //   469: aload           7
        //   471: astore          $this$constrain_u24lambda_u2d0$iv
        //   473: aload           $this$constrain_u24lambda_u2d0$iv
        //   475: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   478: astore          9
        //   480: astore          10
        //   482: aload           $this$leftDivider_delegate_u24lambda_u2d3
        //   484: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   487: dup            
        //   488: fconst_0       
        //   489: iconst_1       
        //   490: iconst_1       
        //   491: aconst_null    
        //   492: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   495: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   498: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   501: aload           $this$leftDivider_delegate_u24lambda_u2d3
        //   503: aload_0         /* this */
        //   504: invokespecial   gg/essential/api/gui/EssentialGUI.getContainer:()Lgg/essential/elementa/components/UIContainer;
        //   507: checkcast       Lgg/essential/elementa/UIComponent;
        //   510: invokestatic    gg/essential/elementa/dsl/ComponentConstraintsKt.componentYConstraint:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/YConstraint;
        //   513: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   516: aload           $this$leftDivider_delegate_u24lambda_u2d3
        //   518: aload_0         /* this */
        //   519: getfield        gg/essential/api/gui/EssentialGUI.outlineThickness:F
        //   522: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   525: checkcast       Ljava/lang/Number;
        //   528: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   531: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   534: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   537: aload           $this$leftDivider_delegate_u24lambda_u2d3
        //   539: aload_0         /* this */
        //   540: invokespecial   gg/essential/api/gui/EssentialGUI.getContainer:()Lgg/essential/elementa/components/UIContainer;
        //   543: checkcast       Lgg/essential/elementa/UIComponent;
        //   546: invokestatic    gg/essential/elementa/dsl/ComponentConstraintsKt.componentHeightConstraint:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/HeightConstraint;
        //   549: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   552: aload           10
        //   554: aload           7
        //   556: aload_0         /* this */
        //   557: invokevirtual   gg/essential/api/gui/EssentialGUI.getWindow:()Lgg/essential/elementa/components/Window;
        //   560: checkcast       Lgg/essential/elementa/UIComponent;
        //   563: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   566: aload_0         /* this */
        //   567: getstatic       gg/essential/api/gui/EssentialGUI.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   570: iconst_3       
        //   571: aaload         
        //   572: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   575: putfield        gg/essential/api/gui/EssentialGUI.leftDivider$delegate:Lkotlin/properties/ReadWriteProperty;
        //   578: aload_0         /* this */
        //   579: new             Lgg/essential/elementa/components/UIBlock;
        //   582: dup            
        //   583: getstatic       gg/essential/api/gui/EssentialGUI.DARK_GRAY:Ljava/awt/Color;
        //   586: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   589: checkcast       Lgg/essential/elementa/UIComponent;
        //   592: astore          $this$constrain$iv
        //   594: aload           $this$constrain$iv
        //   596: astore          7
        //   598: aload           7
        //   600: astore          $this$constrain_u24lambda_u2d0$iv
        //   602: aload           $this$constrain_u24lambda_u2d0$iv
        //   604: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   607: astore          9
        //   609: astore          10
        //   611: aload           $this$rightDivider_delegate_u24lambda_u2d4
        //   613: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   616: dup            
        //   617: fconst_0       
        //   618: iconst_0       
        //   619: iconst_3       
        //   620: aconst_null    
        //   621: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   624: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   627: aload_0         /* this */
        //   628: invokespecial   gg/essential/api/gui/EssentialGUI.getContainer:()Lgg/essential/elementa/components/UIContainer;
        //   631: checkcast       Lgg/essential/elementa/UIComponent;
        //   634: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   637: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   640: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   643: aload           $this$rightDivider_delegate_u24lambda_u2d4
        //   645: aload_0         /* this */
        //   646: invokespecial   gg/essential/api/gui/EssentialGUI.getContainer:()Lgg/essential/elementa/components/UIContainer;
        //   649: checkcast       Lgg/essential/elementa/UIComponent;
        //   652: invokestatic    gg/essential/elementa/dsl/ComponentConstraintsKt.componentYConstraint:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/YConstraint;
        //   655: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   658: aload           $this$rightDivider_delegate_u24lambda_u2d4
        //   660: aload_0         /* this */
        //   661: getfield        gg/essential/api/gui/EssentialGUI.outlineThickness:F
        //   664: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   667: checkcast       Ljava/lang/Number;
        //   670: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   673: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   676: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   679: aload           $this$rightDivider_delegate_u24lambda_u2d4
        //   681: aload_0         /* this */
        //   682: invokespecial   gg/essential/api/gui/EssentialGUI.getContainer:()Lgg/essential/elementa/components/UIContainer;
        //   685: checkcast       Lgg/essential/elementa/UIComponent;
        //   688: invokestatic    gg/essential/elementa/dsl/ComponentConstraintsKt.componentHeightConstraint:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/HeightConstraint;
        //   691: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   694: aload           10
        //   696: aload           7
        //   698: aload_0         /* this */
        //   699: invokevirtual   gg/essential/api/gui/EssentialGUI.getWindow:()Lgg/essential/elementa/components/Window;
        //   702: checkcast       Lgg/essential/elementa/UIComponent;
        //   705: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   708: aload_0         /* this */
        //   709: getstatic       gg/essential/api/gui/EssentialGUI.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   712: iconst_4       
        //   713: aaload         
        //   714: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   717: putfield        gg/essential/api/gui/EssentialGUI.rightDivider$delegate:Lkotlin/properties/ReadWriteProperty;
        //   720: aload_0         /* this */
        //   721: new             Lgg/essential/elementa/components/UIBlock;
        //   724: dup            
        //   725: getstatic       gg/essential/api/gui/EssentialGUI.DARK_GRAY:Ljava/awt/Color;
        //   728: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   731: checkcast       Lgg/essential/elementa/UIComponent;
        //   734: astore          $this$constrain$iv
        //   736: aload           $this$constrain$iv
        //   738: astore          7
        //   740: aload           7
        //   742: astore          $this$constrain_u24lambda_u2d0$iv
        //   744: aload           $this$constrain_u24lambda_u2d0$iv
        //   746: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   749: astore          9
        //   751: astore          10
        //   753: aload           $this$bottomDivider_delegate_u24lambda_u2d5
        //   755: aload_0         /* this */
        //   756: invokespecial   gg/essential/api/gui/EssentialGUI.getLeftDivider:()Lgg/essential/elementa/components/UIBlock;
        //   759: checkcast       Lgg/essential/elementa/UIComponent;
        //   762: invokestatic    gg/essential/elementa/dsl/ComponentConstraintsKt.componentXConstraint:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/XConstraint;
        //   765: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   768: aload           $this$bottomDivider_delegate_u24lambda_u2d5
        //   770: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   773: dup            
        //   774: fconst_0       
        //   775: iconst_0       
        //   776: iconst_3       
        //   777: aconst_null    
        //   778: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   781: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   784: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   787: aload           $this$bottomDivider_delegate_u24lambda_u2d5
        //   789: aload_0         /* this */
        //   790: invokespecial   gg/essential/api/gui/EssentialGUI.getContainer:()Lgg/essential/elementa/components/UIContainer;
        //   793: checkcast       Lgg/essential/elementa/UIComponent;
        //   796: invokestatic    gg/essential/elementa/dsl/ComponentConstraintsKt.componentWidthConstraint:(Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/WidthConstraint;
        //   799: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   802: aload_0         /* this */
        //   803: getfield        gg/essential/api/gui/EssentialGUI.outlineThickness:F
        //   806: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   809: checkcast       Ljava/lang/Number;
        //   812: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   815: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   818: iconst_2       
        //   819: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   822: checkcast       Ljava/lang/Number;
        //   825: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.times:(Lgg/essential/elementa/constraints/SuperConstraint;Ljava/lang/Number;)Lgg/essential/elementa/constraints/ScaleConstraint;
        //   828: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   831: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //   834: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   837: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   840: aload           $this$bottomDivider_delegate_u24lambda_u2d5
        //   842: aload_0         /* this */
        //   843: getfield        gg/essential/api/gui/EssentialGUI.outlineThickness:F
        //   846: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   849: checkcast       Ljava/lang/Number;
        //   852: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   855: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   858: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   861: aload           10
        //   863: aload           7
        //   865: aload_0         /* this */
        //   866: invokevirtual   gg/essential/api/gui/EssentialGUI.getWindow:()Lgg/essential/elementa/components/Window;
        //   869: checkcast       Lgg/essential/elementa/UIComponent;
        //   872: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   875: aload_0         /* this */
        //   876: getstatic       gg/essential/api/gui/EssentialGUI.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   879: iconst_5       
        //   880: aaload         
        //   881: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   884: putfield        gg/essential/api/gui/EssentialGUI.bottomDivider$delegate:Lkotlin/properties/ReadWriteProperty;
        //   887: aload_0         /* this */
        //   888: new             Lgg/essential/elementa/components/UIBlock;
        //   891: dup            
        //   892: getstatic       gg/essential/api/gui/EssentialGUI.DARK_GRAY:Ljava/awt/Color;
        //   895: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //   898: checkcast       Lgg/essential/elementa/UIComponent;
        //   901: astore          $this$constrain$iv
        //   903: aload           $this$constrain$iv
        //   905: astore          7
        //   907: aload           7
        //   909: astore          $this$constrain_u24lambda_u2d0$iv
        //   911: aload           $this$constrain_u24lambda_u2d0$iv
        //   913: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   916: astore          9
        //   918: astore          10
        //   920: aload           $this$titleBar_delegate_u24lambda_u2d6
        //   922: bipush          100
        //   924: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   927: checkcast       Ljava/lang/Number;
        //   930: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   933: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   936: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   939: aload           $this$titleBar_delegate_u24lambda_u2d6
        //   941: bipush          30
        //   943: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   946: checkcast       Ljava/lang/Number;
        //   949: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   952: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   955: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   958: aload           10
        //   960: aload           7
        //   962: aload_0         /* this */
        //   963: invokespecial   gg/essential/api/gui/EssentialGUI.getContainer:()Lgg/essential/elementa/components/UIContainer;
        //   966: checkcast       Lgg/essential/elementa/UIComponent;
        //   969: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   972: aload_0         /* this */
        //   973: getstatic       gg/essential/api/gui/EssentialGUI.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   976: bipush          6
        //   978: aaload         
        //   979: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   982: putfield        gg/essential/api/gui/EssentialGUI.titleBar$delegate:Lkotlin/properties/ReadWriteProperty;
        //   985: aload_0         /* this */
        //   986: new             Lgg/essential/elementa/components/UIWrappedText;
        //   989: dup            
        //   990: aload_2         /* guiTitle */
        //   991: iconst_0       
        //   992: aconst_null    
        //   993: iconst_0       
        //   994: iconst_0       
        //   995: fconst_0       
        //   996: aconst_null    
        //   997: bipush          126
        //   999: aconst_null    
        //  1000: invokespecial   gg/essential/elementa/components/UIWrappedText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZFLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1003: checkcast       Lgg/essential/elementa/UIComponent;
        //  1006: astore          $this$constrain$iv
        //  1008: aload           $this$constrain$iv
        //  1010: astore          7
        //  1012: aload           7
        //  1014: astore          $this$constrain_u24lambda_u2d0$iv
        //  1016: aload           $this$constrain_u24lambda_u2d0$iv
        //  1018: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1021: astore          9
        //  1023: astore          10
        //  1025: aload           $this$titleText_delegate_u24lambda_u2d7
        //  1027: bipush          10
        //  1029: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1032: checkcast       Ljava/lang/Number;
        //  1035: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1038: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1041: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1044: aload           $this$titleText_delegate_u24lambda_u2d7
        //  1046: bipush          11
        //  1048: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1051: checkcast       Ljava/lang/Number;
        //  1054: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1057: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1060: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1063: aload           10
        //  1065: aload           7
        //  1067: aload_0         /* this */
        //  1068: invokevirtual   gg/essential/api/gui/EssentialGUI.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //  1071: checkcast       Lgg/essential/elementa/UIComponent;
        //  1074: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1077: aload_0         /* this */
        //  1078: getstatic       gg/essential/api/gui/EssentialGUI.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1081: bipush          7
        //  1083: aaload         
        //  1084: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1087: putfield        gg/essential/api/gui/EssentialGUI.titleText$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1090: aload_0         /* this */
        //  1091: new             Lgg/essential/elementa/components/UIContainer;
        //  1094: dup            
        //  1095: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //  1098: checkcast       Lgg/essential/elementa/UIComponent;
        //  1101: astore          $this$constrain$iv
        //  1103: aload           $this$constrain$iv
        //  1105: astore          7
        //  1107: aload           7
        //  1109: astore          $this$constrain_u24lambda_u2d0$iv
        //  1111: aload           $this$constrain_u24lambda_u2d0$iv
        //  1113: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1116: astore          9
        //  1118: astore          10
        //  1120: aload           $this$content_delegate_u24lambda_u2d8
        //  1122: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1125: dup            
        //  1126: fconst_0       
        //  1127: iconst_0       
        //  1128: iconst_3       
        //  1129: aconst_null    
        //  1130: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1133: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1136: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1139: aload           $this$content_delegate_u24lambda_u2d8
        //  1141: new             Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1144: dup            
        //  1145: fconst_0       
        //  1146: iconst_1       
        //  1147: aconst_null    
        //  1148: invokespecial   gg/essential/elementa/constraints/RelativeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1151: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1154: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1157: aload           $this$content_delegate_u24lambda_u2d8
        //  1159: new             Lgg/essential/elementa/constraints/FillConstraint;
        //  1162: dup            
        //  1163: iconst_0       
        //  1164: iconst_1       
        //  1165: aconst_null    
        //  1166: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1169: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1172: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1175: aload           10
        //  1177: aload           7
        //  1179: aload_0         /* this */
        //  1180: invokespecial   gg/essential/api/gui/EssentialGUI.getContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1183: checkcast       Lgg/essential/elementa/UIComponent;
        //  1186: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1189: aload_0         /* this */
        //  1190: getstatic       gg/essential/api/gui/EssentialGUI.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1193: bipush          8
        //  1195: aaload         
        //  1196: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1199: putfield        gg/essential/api/gui/EssentialGUI.content$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1202: aload_0         /* this */
        //  1203: getstatic       gg/essential/api/EssentialAPI.Companion:Lgg/essential/api/EssentialAPI$Companion;
        //  1206: invokevirtual   gg/essential/api/EssentialAPI$Companion.getEssentialComponentFactory:()Lgg/essential/api/gui/EssentialComponentFactory;
        //  1209: astore          $this$buildIconButton$iv
        //  1211: new             Lgg/essential/api/gui/IconButtonBuilder;
        //  1214: dup            
        //  1215: invokespecial   gg/essential/api/gui/IconButtonBuilder.<init>:()V
        //  1218: astore          7
        //  1220: aload           7
        //  1222: astore          8
        //  1224: astore          10
        //  1226: aload           $this$backContainer_delegate_u24lambda_u2d9
        //  1228: ldc_w           "/assets/essential/textures/arrow-left_5x7.png"
        //  1231: invokevirtual   gg/essential/api/gui/IconButtonBuilder.setIconResource:(Ljava/lang/String;)V
        //  1234: aload           10
        //  1236: aload           7
        //  1238: aload           $this$buildIconButton$iv
        //  1240: invokevirtual   gg/essential/api/gui/IconButtonBuilder.build:(Lgg/essential/api/gui/EssentialComponentFactory;)Lgg/essential/elementa/UIComponent;
        //  1243: astore          $this$constrain$iv
        //  1245: aload           $this$constrain$iv
        //  1247: astore          7
        //  1249: aload           7
        //  1251: astore          $this$constrain_u24lambda_u2d0$iv
        //  1253: aload           $this$constrain_u24lambda_u2d0$iv
        //  1255: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1258: astore          9
        //  1260: astore          10
        //  1262: aload           $this$backContainer_delegate_u24lambda_u2d10
        //  1264: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1267: dup            
        //  1268: ldc_w           18.0
        //  1271: iconst_1       
        //  1272: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZ)V
        //  1275: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1278: aload_0         /* this */
        //  1279: invokespecial   gg/essential/api/gui/EssentialGUI.getLeftDivider:()Lgg/essential/elementa/components/UIBlock;
        //  1282: checkcast       Lgg/essential/elementa/UIComponent;
        //  1285: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1288: iconst_0       
        //  1289: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1292: checkcast       Ljava/lang/Number;
        //  1295: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1298: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1301: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.coerceAtLeast:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/CoerceAtLeastConstraint;
        //  1304: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1307: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1310: aload           $this$backContainer_delegate_u24lambda_u2d10
        //  1312: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1315: dup            
        //  1316: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1319: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1322: aload_0         /* this */
        //  1323: invokevirtual   gg/essential/api/gui/EssentialGUI.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //  1326: checkcast       Lgg/essential/elementa/UIComponent;
        //  1329: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1332: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1335: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1338: aload           $this$backContainer_delegate_u24lambda_u2d10
        //  1340: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  1343: dup            
        //  1344: fconst_0       
        //  1345: iconst_1       
        //  1346: aconst_null    
        //  1347: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1350: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1353: bipush          12
        //  1355: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1358: checkcast       Ljava/lang/Number;
        //  1361: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1364: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1367: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //  1370: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1373: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1376: aload           $this$backContainer_delegate_u24lambda_u2d10
        //  1378: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //  1381: dup            
        //  1382: fconst_0       
        //  1383: iconst_1       
        //  1384: aconst_null    
        //  1385: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1388: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1391: bipush          10
        //  1393: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1396: checkcast       Ljava/lang/Number;
        //  1399: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1402: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1405: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //  1408: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1411: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1414: aload           10
        //  1416: aload           7
        //  1418: aload_0         /* this */
        //  1419: invokevirtual   gg/essential/api/gui/EssentialGUI.getWindow:()Lgg/essential/elementa/components/Window;
        //  1422: checkcast       Lgg/essential/elementa/UIComponent;
        //  1425: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1428: aload_0         /* this */
        //  1429: getstatic       gg/essential/api/gui/EssentialGUI.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1432: bipush          9
        //  1434: aaload         
        //  1435: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1438: putfield        gg/essential/api/gui/EssentialGUI.backContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1441: new             Lgg/essential/elementa/components/UIBlock;
        //  1444: dup            
        //  1445: getstatic       gg/essential/api/gui/EssentialGUI.COMPONENT_HIGHLIGHT:Ljava/awt/Color;
        //  1448: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //  1451: checkcast       Lgg/essential/elementa/UIComponent;
        //  1454: astore          $this$constrain$iv
        //  1456: aload           $this$constrain$iv
        //  1458: astore          7
        //  1460: aload           7
        //  1462: astore          $this$constrain_u24lambda_u2d0$iv
        //  1464: aload           $this$constrain_u24lambda_u2d0$iv
        //  1466: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1469: astore          $this$_init__u24lambda_u2d11
        //  1471: aload           $this$_init__u24lambda_u2d11
        //  1473: iconst_0       
        //  1474: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1477: checkcast       Ljava/lang/Number;
        //  1480: iconst_0       
        //  1481: iconst_1       
        //  1482: iconst_1       
        //  1483: aconst_null    
        //  1484: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1487: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1490: aload_0         /* this */
        //  1491: invokevirtual   gg/essential/api/gui/EssentialGUI.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //  1494: checkcast       Lgg/essential/elementa/UIComponent;
        //  1497: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1500: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1503: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1506: aload           $this$_init__u24lambda_u2d11
        //  1508: iconst_0       
        //  1509: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1512: checkcast       Ljava/lang/Number;
        //  1515: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1518: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1521: aload_0         /* this */
        //  1522: invokevirtual   gg/essential/api/gui/EssentialGUI.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //  1525: checkcast       Lgg/essential/elementa/UIComponent;
        //  1528: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1531: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1534: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1537: aload           $this$_init__u24lambda_u2d11
        //  1539: bipush          100
        //  1541: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1544: checkcast       Ljava/lang/Number;
        //  1547: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1550: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1553: aload_0         /* this */
        //  1554: invokevirtual   gg/essential/api/gui/EssentialGUI.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //  1557: checkcast       Lgg/essential/elementa/UIComponent;
        //  1560: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1563: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1566: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1569: aload           $this$_init__u24lambda_u2d11
        //  1571: aload_0         /* this */
        //  1572: getfield        gg/essential/api/gui/EssentialGUI.outlineThickness:F
        //  1575: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1578: checkcast       Ljava/lang/Number;
        //  1581: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1584: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1587: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1590: aload           7
        //  1592: aload_0         /* this */
        //  1593: invokevirtual   gg/essential/api/gui/EssentialGUI.getWindow:()Lgg/essential/elementa/components/Window;
        //  1596: checkcast       Lgg/essential/elementa/UIComponent;
        //  1599: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1602: pop            
        //  1603: new             Lgg/essential/elementa/components/UIBlock;
        //  1606: dup            
        //  1607: getstatic       gg/essential/api/gui/EssentialGUI.COMPONENT_HIGHLIGHT:Ljava/awt/Color;
        //  1610: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Ljava/awt/Color;)V
        //  1613: checkcast       Lgg/essential/elementa/UIComponent;
        //  1616: astore          $this$constrain$iv
        //  1618: aload           $this$constrain$iv
        //  1620: astore          7
        //  1622: aload           7
        //  1624: astore          $this$constrain_u24lambda_u2d0$iv
        //  1626: aload           $this$constrain_u24lambda_u2d0$iv
        //  1628: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1631: astore          $this$_init__u24lambda_u2d12
        //  1633: aload           $this$_init__u24lambda_u2d12
        //  1635: iconst_0       
        //  1636: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1639: checkcast       Ljava/lang/Number;
        //  1642: iconst_1       
        //  1643: iconst_1       
        //  1644: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels:(Ljava/lang/Number;ZZ)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1647: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1650: aload_0         /* this */
        //  1651: invokevirtual   gg/essential/api/gui/EssentialGUI.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //  1654: checkcast       Lgg/essential/elementa/UIComponent;
        //  1657: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1660: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1663: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1666: aload           $this$_init__u24lambda_u2d12
        //  1668: iconst_0       
        //  1669: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1672: checkcast       Ljava/lang/Number;
        //  1675: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1678: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1681: aload_0         /* this */
        //  1682: invokevirtual   gg/essential/api/gui/EssentialGUI.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //  1685: checkcast       Lgg/essential/elementa/UIComponent;
        //  1688: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1691: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1694: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1697: aload           $this$_init__u24lambda_u2d12
        //  1699: bipush          100
        //  1701: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1704: checkcast       Ljava/lang/Number;
        //  1707: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1710: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1713: aload_0         /* this */
        //  1714: invokevirtual   gg/essential/api/gui/EssentialGUI.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //  1717: checkcast       Lgg/essential/elementa/UIComponent;
        //  1720: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1723: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1726: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1729: aload           $this$_init__u24lambda_u2d12
        //  1731: aload_0         /* this */
        //  1732: getfield        gg/essential/api/gui/EssentialGUI.outlineThickness:F
        //  1735: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1738: checkcast       Ljava/lang/Number;
        //  1741: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1744: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1747: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1750: aload           7
        //  1752: aload_0         /* this */
        //  1753: invokevirtual   gg/essential/api/gui/EssentialGUI.getWindow:()Lgg/essential/elementa/components/Window;
        //  1756: checkcast       Lgg/essential/elementa/UIComponent;
        //  1759: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1762: pop            
        //  1763: aload_0         /* this */
        //  1764: invokespecial   gg/essential/api/gui/EssentialGUI.getBackContainer:()Lgg/essential/elementa/UIComponent;
        //  1767: astore          $this$onLeftClick$iv
        //  1769: aload           $this$onLeftClick$iv
        //  1771: new             Lgg/essential/api/gui/EssentialGUI$special$$inlined$onLeftClick$1;
        //  1774: dup            
        //  1775: aload_0         /* this */
        //  1776: invokespecial   gg/essential/api/gui/EssentialGUI$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/api/gui/EssentialGUI;)V
        //  1779: checkcast       Lkotlin/jvm/functions/Function2;
        //  1782: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  1785: pop            
        //  1786: return         
        //    MethodParameters:
        //  Name                        Flags  
        //  --------------------------  -----
        //  version                     
        //  guiTitle                    
        //  newGuiScale                 
        //  restorePreviousGuiOnClose   
        //  discordActivityDescription  
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public EssentialGUI(final ElementaVersion version, String guiTitle, int guiScale, boolean restorePreviousGuiOnClose, String discordActivityDescription, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            guiTitle = "";
        }
        if ((n & 0x4) != 0x0) {
            guiScale = EssentialAPI.Companion.getGuiUtil().getGuiScale();
        }
        if ((n & 0x8) != 0x0) {
            restorePreviousGuiOnClose = true;
        }
        if ((n & 0x10) != 0x0) {
            discordActivityDescription = null;
        }
        this(version, guiTitle, guiScale, restorePreviousGuiOnClose, discordActivityDescription);
    }
    
    @Nullable
    public final String getDiscordActivityDescription() {
        return this.discordActivityDescription;
    }
    
    @JvmOverloads
    public EssentialGUI(@NotNull final ElementaVersion version, @NotNull final String guiTitle, final int newGuiScale, final boolean restorePreviousGuiOnClose) {
        Intrinsics.checkNotNullParameter((Object)version, "version");
        Intrinsics.checkNotNullParameter((Object)guiTitle, "guiTitle");
        this(version, guiTitle, newGuiScale, restorePreviousGuiOnClose, null);
    }
    
    public EssentialGUI(final ElementaVersion version, String guiTitle, int guiScale, boolean restorePreviousGuiOnClose, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x2) != 0x0) {
            guiTitle = "";
        }
        if ((n & 0x4) != 0x0) {
            guiScale = EssentialAPI.Companion.getGuiUtil().getGuiScale();
        }
        if ((n & 0x8) != 0x0) {
            restorePreviousGuiOnClose = true;
        }
        this(version, guiTitle, guiScale, restorePreviousGuiOnClose);
    }
    
    @kotlin.Deprecated(message = "Add ElementaVersion as the first argument to opt-in to improved behavior.")
    @JvmOverloads
    @Deprecated
    public EssentialGUI(@NotNull final String guiTitle, final int newGuiScale, final boolean restorePreviousGuiOnClose) {
        Intrinsics.checkNotNullParameter((Object)guiTitle, "guiTitle");
        this(ElementaVersion.V0, guiTitle, newGuiScale, restorePreviousGuiOnClose);
    }
    
    @Deprecated
    public EssentialGUI(String guiTitle, int guiScale, boolean restorePreviousGuiOnClose, final int n, final DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x1) != 0x0) {
            guiTitle = "";
        }
        if ((n & 0x2) != 0x0) {
            guiScale = EssentialAPI.Companion.getGuiUtil().getGuiScale();
        }
        if ((n & 0x4) != 0x0) {
            restorePreviousGuiOnClose = true;
        }
        this(guiTitle, guiScale, restorePreviousGuiOnClose);
    }
    
    public final boolean getBackButtonVisible() {
        return this.backButtonVisible;
    }
    
    public final void setBackButtonVisible(final boolean value) {
        if (this.backButtonVisible != value) {
            if (!(this.backButtonVisible = value)) {
                this.getBackContainer().hide(true);
            }
            else {
                UIComponent.unhide$default(this.getBackContainer(), false, 1, null);
            }
        }
    }
    
    @ApiStatus.Internal
    protected final float getOutlineThickness() {
        return this.outlineThickness;
    }
    
    private final UIBlock getBackground() {
        return (UIBlock)this.background$delegate.getValue((Object)this, (KProperty)EssentialGUI.$$delegatedProperties[0]);
    }
    
    @NotNull
    public final UIContainer getScissorBox() {
        return (UIContainer)this.scissorBox$delegate.getValue((Object)this, (KProperty)EssentialGUI.$$delegatedProperties[1]);
    }
    
    private final UIContainer getContainer() {
        return (UIContainer)this.container$delegate.getValue((Object)this, (KProperty)EssentialGUI.$$delegatedProperties[2]);
    }
    
    private final UIBlock getLeftDivider() {
        return (UIBlock)this.leftDivider$delegate.getValue((Object)this, (KProperty)EssentialGUI.$$delegatedProperties[3]);
    }
    
    @NotNull
    public final UIBlock getRightDivider() {
        return (UIBlock)this.rightDivider$delegate.getValue((Object)this, (KProperty)EssentialGUI.$$delegatedProperties[4]);
    }
    
    private final UIBlock getBottomDivider() {
        return (UIBlock)this.bottomDivider$delegate.getValue((Object)this, (KProperty)EssentialGUI.$$delegatedProperties[5]);
    }
    
    @NotNull
    public final UIBlock getTitleBar() {
        return (UIBlock)this.titleBar$delegate.getValue((Object)this, (KProperty)EssentialGUI.$$delegatedProperties[6]);
    }
    
    @NotNull
    public final UIWrappedText getTitleText() {
        return (UIWrappedText)this.titleText$delegate.getValue((Object)this, (KProperty)EssentialGUI.$$delegatedProperties[7]);
    }
    
    @NotNull
    public final UIContainer getContent() {
        return (UIContainer)this.content$delegate.getValue((Object)this, (KProperty)EssentialGUI.$$delegatedProperties[8]);
    }
    
    private final UIComponent getBackContainer() {
        return (UIComponent)this.backContainer$delegate.getValue((Object)this, (KProperty)EssentialGUI.$$delegatedProperties[9]);
    }
    
    public final void setTitle(@NotNull final String newTitle) {
        Intrinsics.checkNotNullParameter((Object)newTitle, "newTitle");
        this.getTitleText().setText(newTitle);
    }
    
    @JvmOverloads
    public EssentialGUI(@NotNull final ElementaVersion version, @NotNull final String guiTitle, final int newGuiScale) {
        Intrinsics.checkNotNullParameter((Object)version, "version");
        Intrinsics.checkNotNullParameter((Object)guiTitle, "guiTitle");
        this(version, guiTitle, newGuiScale, false, 8, null);
    }
    
    @JvmOverloads
    public EssentialGUI(@NotNull final ElementaVersion version, @NotNull final String guiTitle) {
        Intrinsics.checkNotNullParameter((Object)version, "version");
        Intrinsics.checkNotNullParameter((Object)guiTitle, "guiTitle");
        this(version, guiTitle, 0, false, 12, null);
    }
    
    @JvmOverloads
    public EssentialGUI(@NotNull final ElementaVersion version) {
        Intrinsics.checkNotNullParameter((Object)version, "version");
        this(version, null, 0, false, 14, null);
    }
    
    @kotlin.Deprecated(message = "Add ElementaVersion as the first argument to opt-in to improved behavior.")
    @JvmOverloads
    @Deprecated
    public EssentialGUI(@NotNull final String guiTitle, final int newGuiScale) {
        Intrinsics.checkNotNullParameter((Object)guiTitle, "guiTitle");
        this(guiTitle, newGuiScale, false, 4, null);
    }
    
    @kotlin.Deprecated(message = "Add ElementaVersion as the first argument to opt-in to improved behavior.")
    @JvmOverloads
    @Deprecated
    public EssentialGUI(@NotNull final String guiTitle) {
        Intrinsics.checkNotNullParameter((Object)guiTitle, "guiTitle");
        this(guiTitle, 0, false, 6, null);
    }
    
    @kotlin.Deprecated(message = "Add ElementaVersion as the first argument to opt-in to improved behavior.")
    @JvmOverloads
    @Deprecated
    public EssentialGUI() {
        this(null, 0, false, 7, null);
    }
    
    public static final /* synthetic */ UIComponent access$getBackContainer(final EssentialGUI $this) {
        return $this.getBackContainer();
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialGUI.class, "background", "getBackground()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialGUI.class, "scissorBox", "getScissorBox()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialGUI.class, "container", "getContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialGUI.class, "leftDivider", "getLeftDivider()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialGUI.class, "rightDivider", "getRightDivider()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialGUI.class, "bottomDivider", "getBottomDivider()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialGUI.class, "titleBar", "getTitleBar()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialGUI.class, "titleText", "getTitleText()Lgg/essential/elementa/components/UIWrappedText;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialGUI.class, "content", "getContent()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)EssentialGUI.class, "backContainer", "getBackContainer()Lgg/essential/elementa/UIComponent;", 0)) };
        EssentialGuiPalette = new EssentialGuiPalette(null);
        BACKGROUND = new Color(1579032);
        DARK_GRAY = new Color(2302755);
        BUTTON = new Color(3289650);
        BUTTON_HIGHLIGHT = new Color(4671303);
        TEXT = new Color(12303291);
        TEXT_HIGHLIGHT = new Color(16777215);
        COMPONENT_HIGHLIGHT = new Color(3158064);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0014
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0000
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                       \u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                       \u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                       \u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                       \u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                       \u0000R\u000e\u0010	\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                       \u0000R\u000e\u0010
                                                       \u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002
                                                       \u0000¨\u0006\u000b""" }, d2 = { "Lgg/essential/api/gui/EssentialGUI$EssentialGuiPalette;", "", "()V", "BACKGROUND", "Ljava/awt/Color;", "BUTTON", "BUTTON_HIGHLIGHT", "COMPONENT_HIGHLIGHT", "DARK_GRAY", "TEXT", "TEXT_HIGHLIGHT", "essential-api" })
    private static final class EssentialGuiPalette
    {
        private EssentialGuiPalette() {
            super();
        }
        
        public EssentialGuiPalette(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
