package gg.essential.vigilance.gui;

import kotlin.*;
import org.jetbrains.annotations.*;
import kotlin.reflect.*;
import gg.essential.vigilance.*;
import kotlin.properties.*;
import java.util.*;
import gg.essential.vigilance.data.*;
import gg.essential.elementa.components.*;
import gg.essential.vigilance.gui.common.*;
import gg.essential.universal.*;
import gg.essential.elementa.*;
import kotlin.jvm.internal.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 F2\u00020\u0001:\u0001FB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020\u001aJ\b\u0010E\u001a\u00020CH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\n\u001a\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001b\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001c\u0010\u0013R\u001b\u0010\u001e\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\n\u001a\u0004\b\u001f\u0010\u0013R\u000e\u0010!\u001a\u00020\"X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010#\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b$\u0010\u000eR\u001b\u0010&\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010\n\u001a\u0004\b'\u0010\u000eR\u001b\u0010)\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010\n\u001a\u0004\b*\u0010\u000eR\u001b\u0010,\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\n\u001a\u0004\b-\u0010\u0013R\u001b\u0010/\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\n\u001a\u0004\b0\u0010\u000eR\u001b\u00102\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010\n\u001a\u0004\b3\u0010\u0013R\u001b\u00105\u001a\u0002068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010\n\u001a\u0004\b7\u00108R\u001b\u0010:\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010\n\u001a\u0004\b;\u0010\u000eR\u001b\u0010=\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010\n\u001a\u0004\b?\u0010@¨\u0006G" }, d2 = { "Lgg/essential/vigilance/gui/SettingsGui;", "Lgg/essential/elementa/WindowScreen;", "config", "Lgg/essential/vigilance/Vigilant;", "(Lgg/essential/vigilance/Vigilant;)V", "backButton", "Lgg/essential/vigilance/gui/common/IconButton;", "getBackButton", "()Lgg/essential/vigilance/gui/common/IconButton;", "backButton$delegate", "Lkotlin/properties/ReadWriteProperty;", "background", "Lgg/essential/elementa/components/UIBlock;", "getBackground", "()Lgg/essential/elementa/components/UIBlock;", "background$delegate", "bottomContainer", "Lgg/essential/elementa/components/UIContainer;", "getBottomContainer", "()Lgg/essential/elementa/components/UIContainer;", "bottomContainer$delegate", "bottomDivider", "getBottomDivider", "bottomDivider$delegate", "categories", "", "Lgg/essential/vigilance/data/Category;", "container", "getContainer", "container$delegate", "content", "getContent", "content$delegate", "currentCategory", "Lgg/essential/vigilance/gui/SettingsCategory;", "leftDivider", "getLeftDivider", "leftDivider$delegate", "middleDivider", "getMiddleDivider", "middleDivider$delegate", "rightDivider", "getRightDivider", "rightDivider$delegate", "sidebar", "getSidebar", "sidebar$delegate", "sidebarHorizontalScrollbar", "getSidebarHorizontalScrollbar", "sidebarHorizontalScrollbar$delegate", "sidebarHorizontalScrollbarContainer", "getSidebarHorizontalScrollbarContainer", "sidebarHorizontalScrollbarContainer$delegate", "sidebarScroller", "Lgg/essential/elementa/components/ScrollComponent;", "getSidebarScroller", "()Lgg/essential/elementa/components/ScrollComponent;", "sidebarScroller$delegate", "sidebarVerticalScrollbar", "getSidebarVerticalScrollbar", "sidebarVerticalScrollbar$delegate", "titleBar", "Lgg/essential/vigilance/gui/SettingsTitleBar;", "getTitleBar", "()Lgg/essential/vigilance/gui/SettingsTitleBar;", "titleBar$delegate", "selectCategory", "", "category", "updateGuiScale", "Companion", "Vigilance" })
public final class SettingsGui extends WindowScreen
{
    @NotNull
    public static final Companion Companion;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final Vigilant config;
    @NotNull
    private final ReadWriteProperty background$delegate;
    @NotNull
    private final ReadWriteProperty container$delegate;
    @NotNull
    private final ReadWriteProperty titleBar$delegate;
    @NotNull
    private final ReadWriteProperty bottomContainer$delegate;
    @NotNull
    private final ReadWriteProperty leftDivider$delegate;
    @NotNull
    private final ReadWriteProperty sidebar$delegate;
    @NotNull
    private final ReadWriteProperty middleDivider$delegate;
    @NotNull
    private final ReadWriteProperty sidebarScroller$delegate;
    @NotNull
    private final ReadWriteProperty sidebarVerticalScrollbar$delegate;
    @NotNull
    private final ReadWriteProperty rightDivider$delegate;
    @NotNull
    private final ReadWriteProperty content$delegate;
    @NotNull
    private final ReadWriteProperty bottomDivider$delegate;
    @NotNull
    private final ReadWriteProperty sidebarHorizontalScrollbarContainer$delegate;
    @NotNull
    private final ReadWriteProperty sidebarHorizontalScrollbar$delegate;
    @NotNull
    private final ReadWriteProperty backButton$delegate;
    @NotNull
    private final List<Category> categories;
    @NotNull
    private SettingsCategory currentCategory;
    public static final float animTime = 0.5f;
    public static final float dividerWidth = 3.0f;
    
    public SettingsGui(@NotNull final Vigilant config) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "config"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: getstatic       gg/essential/elementa/ElementaVersion.V2:Lgg/essential/elementa/ElementaVersion;
        //     9: astore_2       
        //    10: getstatic       gg/essential/universal/GuiScale.Companion:Lgg/essential/universal/GuiScale$Companion;
        //    13: iconst_0       
        //    14: iconst_1       
        //    15: aconst_null    
        //    16: invokestatic    gg/essential/universal/GuiScale$Companion.scaleForScreenSize$default:(Lgg/essential/universal/GuiScale$Companion;IILjava/lang/Object;)Lgg/essential/universal/GuiScale;
        //    19: invokevirtual   gg/essential/universal/GuiScale.ordinal:()I
        //    22: istore_3       
        //    23: aload_0         /* this */
        //    24: aload_2        
        //    25: iconst_0       
        //    26: iconst_0       
        //    27: iconst_1       
        //    28: iload_3        
        //    29: bipush          6
        //    31: aconst_null    
        //    32: invokespecial   gg/essential/elementa/WindowScreen.<init>:(Lgg/essential/elementa/ElementaVersion;ZZZIILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //    35: aload_0         /* this */
        //    36: aload_1         /* config */
        //    37: putfield        gg/essential/vigilance/gui/SettingsGui.config:Lgg/essential/vigilance/Vigilant;
        //    40: aload_0         /* this */
        //    41: new             Lgg/essential/elementa/components/UIBlock;
        //    44: dup            
        //    45: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //    48: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getMainBackground$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //    51: checkcast       Lgg/essential/elementa/state/State;
        //    54: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //    57: checkcast       Lgg/essential/elementa/UIComponent;
        //    60: astore_2        /* $this$constrain$iv */
        //    61: iconst_0       
        //    62: istore_3        /* $i$f$constrain */
        //    63: aload_2         /* $this$constrain$iv */
        //    64: astore          4
        //    66: aload           4
        //    68: astore          $this$constrain_u24lambda_u2d0$iv
        //    70: iconst_0       
        //    71: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //    73: aload           $this$constrain_u24lambda_u2d0$iv
        //    75: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //    78: astore          7
        //    80: astore          9
        //    82: iconst_0       
        //    83: istore          $i$a$-constrain-SettingsGui$background$2
        //    85: aload           $this$background_delegate_u24lambda_u2d0
        //    87: bipush          100
        //    89: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    92: checkcast       Ljava/lang/Number;
        //    95: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //    98: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   101: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   104: aload           $this$background_delegate_u24lambda_u2d0
        //   106: bipush          100
        //   108: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   111: checkcast       Ljava/lang/Number;
        //   114: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   117: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   120: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   123: nop            
        //   124: aload           9
        //   126: nop            
        //   127: aload           4
        //   129: nop            
        //   130: aload_0         /* this */
        //   131: invokevirtual   gg/essential/vigilance/gui/SettingsGui.getWindow:()Lgg/essential/elementa/components/Window;
        //   134: checkcast       Lgg/essential/elementa/UIComponent;
        //   137: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   140: aload_0         /* this */
        //   141: getstatic       gg/essential/vigilance/gui/SettingsGui.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   144: iconst_0       
        //   145: aaload         
        //   146: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   149: putfield        gg/essential/vigilance/gui/SettingsGui.background$delegate:Lkotlin/properties/ReadWriteProperty;
        //   152: aload_0         /* this */
        //   153: new             Lgg/essential/elementa/components/UIContainer;
        //   156: dup            
        //   157: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   160: checkcast       Lgg/essential/elementa/UIComponent;
        //   163: astore_2        /* $this$constrain$iv */
        //   164: iconst_0       
        //   165: istore_3        /* $i$f$constrain */
        //   166: aload_2         /* $this$constrain$iv */
        //   167: astore          4
        //   169: aload           4
        //   171: astore          $this$constrain_u24lambda_u2d0$iv
        //   173: iconst_0       
        //   174: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   176: aload           $this$constrain_u24lambda_u2d0$iv
        //   178: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   181: astore          7
        //   183: astore          9
        //   185: iconst_0       
        //   186: istore          $i$a$-constrain-SettingsGui$container$2
        //   188: aload           $this$container_delegate_u24lambda_u2d1
        //   190: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   193: dup            
        //   194: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   197: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   200: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   203: aload           $this$container_delegate_u24lambda_u2d1
        //   205: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   208: dup            
        //   209: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   212: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   215: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   218: aload           $this$container_delegate_u24lambda_u2d1
        //   220: bipush          85
        //   222: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   225: checkcast       Ljava/lang/Number;
        //   228: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   231: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   234: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   237: aload           $this$container_delegate_u24lambda_u2d1
        //   239: bipush          75
        //   241: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   244: checkcast       Ljava/lang/Number;
        //   247: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   250: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   253: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   256: nop            
        //   257: aload           9
        //   259: nop            
        //   260: aload           4
        //   262: nop            
        //   263: aload_0         /* this */
        //   264: invokevirtual   gg/essential/vigilance/gui/SettingsGui.getWindow:()Lgg/essential/elementa/components/Window;
        //   267: checkcast       Lgg/essential/elementa/UIComponent;
        //   270: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   273: aload_0         /* this */
        //   274: getstatic       gg/essential/vigilance/gui/SettingsGui.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   277: iconst_1       
        //   278: aaload         
        //   279: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   282: putfield        gg/essential/vigilance/gui/SettingsGui.container$delegate:Lkotlin/properties/ReadWriteProperty;
        //   285: aload_0         /* this */
        //   286: new             Lgg/essential/vigilance/gui/SettingsTitleBar;
        //   289: dup            
        //   290: aload_0         /* this */
        //   291: aload_0         /* this */
        //   292: getfield        gg/essential/vigilance/gui/SettingsGui.config:Lgg/essential/vigilance/Vigilant;
        //   295: aload_0         /* this */
        //   296: invokevirtual   gg/essential/vigilance/gui/SettingsGui.getWindow:()Lgg/essential/elementa/components/Window;
        //   299: invokespecial   gg/essential/vigilance/gui/SettingsTitleBar.<init>:(Lgg/essential/vigilance/gui/SettingsGui;Lgg/essential/vigilance/Vigilant;Lgg/essential/elementa/components/Window;)V
        //   302: checkcast       Lgg/essential/elementa/UIComponent;
        //   305: aload_0         /* this */
        //   306: invokespecial   gg/essential/vigilance/gui/SettingsGui.getContainer:()Lgg/essential/elementa/components/UIContainer;
        //   309: checkcast       Lgg/essential/elementa/UIComponent;
        //   312: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   315: aload_0         /* this */
        //   316: getstatic       gg/essential/vigilance/gui/SettingsGui.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   319: iconst_2       
        //   320: aaload         
        //   321: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   324: putfield        gg/essential/vigilance/gui/SettingsGui.titleBar$delegate:Lkotlin/properties/ReadWriteProperty;
        //   327: aload_0         /* this */
        //   328: new             Lgg/essential/elementa/components/UIContainer;
        //   331: dup            
        //   332: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   335: checkcast       Lgg/essential/elementa/UIComponent;
        //   338: astore_2        /* $this$constrain$iv */
        //   339: iconst_0       
        //   340: istore_3        /* $i$f$constrain */
        //   341: aload_2         /* $this$constrain$iv */
        //   342: astore          4
        //   344: aload           4
        //   346: astore          $this$constrain_u24lambda_u2d0$iv
        //   348: iconst_0       
        //   349: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   351: aload           $this$constrain_u24lambda_u2d0$iv
        //   353: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   356: astore          7
        //   358: astore          9
        //   360: iconst_0       
        //   361: istore          $i$a$-constrain-SettingsGui$bottomContainer$2
        //   363: aload           $this$bottomContainer_delegate_u24lambda_u2d2
        //   365: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   368: dup            
        //   369: fconst_0       
        //   370: iconst_0       
        //   371: iconst_3       
        //   372: aconst_null    
        //   373: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   376: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   379: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   382: aload           $this$bottomContainer_delegate_u24lambda_u2d2
        //   384: bipush          100
        //   386: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   389: checkcast       Ljava/lang/Number;
        //   392: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   395: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   398: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   401: aload           $this$bottomContainer_delegate_u24lambda_u2d2
        //   403: new             Lgg/essential/elementa/constraints/FillConstraint;
        //   406: dup            
        //   407: iconst_0       
        //   408: iconst_1       
        //   409: aconst_null    
        //   410: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   413: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   416: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   419: nop            
        //   420: aload           9
        //   422: nop            
        //   423: aload           4
        //   425: nop            
        //   426: aload_0         /* this */
        //   427: invokespecial   gg/essential/vigilance/gui/SettingsGui.getContainer:()Lgg/essential/elementa/components/UIContainer;
        //   430: checkcast       Lgg/essential/elementa/UIComponent;
        //   433: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   436: aload_0         /* this */
        //   437: getstatic       gg/essential/vigilance/gui/SettingsGui.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   440: iconst_3       
        //   441: aaload         
        //   442: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   445: putfield        gg/essential/vigilance/gui/SettingsGui.bottomContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //   448: aload_0         /* this */
        //   449: new             Lgg/essential/elementa/components/UIBlock;
        //   452: dup            
        //   453: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   456: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getDividerDark$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   459: checkcast       Lgg/essential/elementa/state/State;
        //   462: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //   465: checkcast       Lgg/essential/elementa/UIComponent;
        //   468: astore_2        /* $this$constrain$iv */
        //   469: iconst_0       
        //   470: istore_3        /* $i$f$constrain */
        //   471: aload_2         /* $this$constrain$iv */
        //   472: astore          4
        //   474: aload           4
        //   476: astore          $this$constrain_u24lambda_u2d0$iv
        //   478: iconst_0       
        //   479: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   481: aload           $this$constrain_u24lambda_u2d0$iv
        //   483: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   486: astore          7
        //   488: astore          9
        //   490: iconst_0       
        //   491: istore          $i$a$-constrain-SettingsGui$leftDivider$2
        //   493: aload           $this$leftDivider_delegate_u24lambda_u2d3
        //   495: ldc             3.0
        //   497: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   500: checkcast       Ljava/lang/Number;
        //   503: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   506: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   509: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   512: aload           $this$leftDivider_delegate_u24lambda_u2d3
        //   514: bipush          100
        //   516: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   519: checkcast       Ljava/lang/Number;
        //   522: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   525: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   528: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   531: nop            
        //   532: aload           9
        //   534: nop            
        //   535: aload           4
        //   537: nop            
        //   538: aload_0         /* this */
        //   539: invokespecial   gg/essential/vigilance/gui/SettingsGui.getBottomContainer:()Lgg/essential/elementa/components/UIContainer;
        //   542: checkcast       Lgg/essential/elementa/UIComponent;
        //   545: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   548: aload_0         /* this */
        //   549: getstatic       gg/essential/vigilance/gui/SettingsGui.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   552: iconst_4       
        //   553: aaload         
        //   554: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   557: putfield        gg/essential/vigilance/gui/SettingsGui.leftDivider$delegate:Lkotlin/properties/ReadWriteProperty;
        //   560: aload_0         /* this */
        //   561: new             Lgg/essential/elementa/components/UIContainer;
        //   564: dup            
        //   565: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   568: checkcast       Lgg/essential/elementa/UIComponent;
        //   571: astore_2        /* $this$constrain$iv */
        //   572: iconst_0       
        //   573: istore_3        /* $i$f$constrain */
        //   574: aload_2         /* $this$constrain$iv */
        //   575: astore          4
        //   577: aload           4
        //   579: astore          $this$constrain_u24lambda_u2d0$iv
        //   581: iconst_0       
        //   582: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   584: aload           $this$constrain_u24lambda_u2d0$iv
        //   586: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   589: astore          7
        //   591: astore          9
        //   593: iconst_0       
        //   594: istore          $i$a$-constrain-SettingsGui$sidebar$2
        //   596: aload           $this$sidebar_delegate_u24lambda_u2d4
        //   598: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   601: dup            
        //   602: fconst_0       
        //   603: iconst_0       
        //   604: iconst_3       
        //   605: aconst_null    
        //   606: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   609: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   612: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   615: aload           $this$sidebar_delegate_u24lambda_u2d4
        //   617: bipush          25
        //   619: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   622: checkcast       Ljava/lang/Number;
        //   625: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   628: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   631: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   634: aload           $this$sidebar_delegate_u24lambda_u2d4
        //   636: bipush          100
        //   638: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   641: checkcast       Ljava/lang/Number;
        //   644: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   647: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   650: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   653: nop            
        //   654: aload           9
        //   656: nop            
        //   657: aload           4
        //   659: nop            
        //   660: new             Lgg/essential/elementa/effects/ScissorEffect;
        //   663: dup            
        //   664: aconst_null    
        //   665: iconst_0       
        //   666: iconst_3       
        //   667: aconst_null    
        //   668: invokespecial   gg/essential/elementa/effects/ScissorEffect.<init>:(Lgg/essential/elementa/UIComponent;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   671: checkcast       Lgg/essential/elementa/effects/Effect;
        //   674: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //   677: aload_0         /* this */
        //   678: invokespecial   gg/essential/vigilance/gui/SettingsGui.getBottomContainer:()Lgg/essential/elementa/components/UIContainer;
        //   681: checkcast       Lgg/essential/elementa/UIComponent;
        //   684: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   687: aload_0         /* this */
        //   688: getstatic       gg/essential/vigilance/gui/SettingsGui.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   691: iconst_5       
        //   692: aaload         
        //   693: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   696: putfield        gg/essential/vigilance/gui/SettingsGui.sidebar$delegate:Lkotlin/properties/ReadWriteProperty;
        //   699: aload_0         /* this */
        //   700: new             Lgg/essential/elementa/components/UIBlock;
        //   703: dup            
        //   704: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //   707: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getDividerDark$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //   710: checkcast       Lgg/essential/elementa/state/State;
        //   713: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //   716: checkcast       Lgg/essential/elementa/UIComponent;
        //   719: astore_2        /* $this$constrain$iv */
        //   720: iconst_0       
        //   721: istore_3        /* $i$f$constrain */
        //   722: aload_2         /* $this$constrain$iv */
        //   723: astore          4
        //   725: aload           4
        //   727: astore          $this$constrain_u24lambda_u2d0$iv
        //   729: iconst_0       
        //   730: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   732: aload           $this$constrain_u24lambda_u2d0$iv
        //   734: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   737: astore          7
        //   739: astore          9
        //   741: iconst_0       
        //   742: istore          $i$a$-constrain-SettingsGui$middleDivider$2
        //   744: aload           $this$middleDivider_delegate_u24lambda_u2d5
        //   746: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   749: dup            
        //   750: fconst_0       
        //   751: iconst_0       
        //   752: iconst_3       
        //   753: aconst_null    
        //   754: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   757: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   760: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   763: aload           $this$middleDivider_delegate_u24lambda_u2d5
        //   765: ldc             3.0
        //   767: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   770: checkcast       Ljava/lang/Number;
        //   773: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   776: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   779: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   782: aload           $this$middleDivider_delegate_u24lambda_u2d5
        //   784: bipush          100
        //   786: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   789: checkcast       Ljava/lang/Number;
        //   792: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   795: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   798: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   801: nop            
        //   802: aload           9
        //   804: nop            
        //   805: aload           4
        //   807: nop            
        //   808: aload_0         /* this */
        //   809: invokespecial   gg/essential/vigilance/gui/SettingsGui.getBottomContainer:()Lgg/essential/elementa/components/UIContainer;
        //   812: checkcast       Lgg/essential/elementa/UIComponent;
        //   815: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   818: aload_0         /* this */
        //   819: getstatic       gg/essential/vigilance/gui/SettingsGui.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   822: bipush          6
        //   824: aaload         
        //   825: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   828: putfield        gg/essential/vigilance/gui/SettingsGui.middleDivider$delegate:Lkotlin/properties/ReadWriteProperty;
        //   831: aload_0         /* this */
        //   832: new             Lgg/essential/elementa/components/ScrollComponent;
        //   835: dup            
        //   836: ldc_w           "No matching settings found :("
        //   839: ldc_w           10.0
        //   842: aconst_null    
        //   843: iconst_0       
        //   844: iconst_0       
        //   845: iconst_0       
        //   846: iconst_0       
        //   847: ldc_w           25.0
        //   850: fconst_0       
        //   851: aconst_null    
        //   852: sipush          892
        //   855: aconst_null    
        //   856: invokespecial   gg/essential/elementa/components/ScrollComponent.<init>:(Ljava/lang/String;FLjava/awt/Color;ZZZZFFLgg/essential/elementa/UIComponent;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   859: checkcast       Lgg/essential/elementa/UIComponent;
        //   862: astore_2       
        //   863: nop            
        //   864: iconst_0       
        //   865: istore_3        /* $i$f$constrain */
        //   866: aload_2         /* $this$constrain$iv */
        //   867: astore          4
        //   869: aload           4
        //   871: astore          $this$constrain_u24lambda_u2d0$iv
        //   873: iconst_0       
        //   874: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //   876: aload           $this$constrain_u24lambda_u2d0$iv
        //   878: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   881: astore          7
        //   883: astore          9
        //   885: iconst_0       
        //   886: istore          $i$a$-constrain-SettingsGui$sidebarScroller$2
        //   888: aload           $this$sidebarScroller_delegate_u24lambda_u2d6
        //   890: bipush          100
        //   892: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   895: checkcast       Ljava/lang/Number;
        //   898: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   901: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   904: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   907: aload           $this$sidebarScroller_delegate_u24lambda_u2d6
        //   909: bipush          100
        //   911: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   914: checkcast       Ljava/lang/Number;
        //   917: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   920: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   923: ldc             3.0
        //   925: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   928: checkcast       Ljava/lang/Number;
        //   931: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   934: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   937: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   940: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   943: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   946: nop            
        //   947: aload           9
        //   949: nop            
        //   950: aload           4
        //   952: nop            
        //   953: aload_0         /* this */
        //   954: invokespecial   gg/essential/vigilance/gui/SettingsGui.getSidebar:()Lgg/essential/elementa/components/UIContainer;
        //   957: checkcast       Lgg/essential/elementa/UIComponent;
        //   960: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   963: checkcast       Lgg/essential/elementa/components/ScrollComponent;
        //   966: bipush          20
        //   968: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   971: checkcast       Ljava/lang/Number;
        //   974: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   977: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   980: invokestatic    gg/essential/vigilance/utils/ExtensionsKt.scrollGradient:(Lgg/essential/elementa/components/ScrollComponent;Lgg/essential/elementa/constraints/HeightConstraint;)Lgg/essential/elementa/components/ScrollComponent;
        //   983: checkcast       Lgg/essential/elementa/UIComponent;
        //   986: aload_0         /* this */
        //   987: getstatic       gg/essential/vigilance/gui/SettingsGui.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   990: bipush          7
        //   992: aaload         
        //   993: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   996: putfield        gg/essential/vigilance/gui/SettingsGui.sidebarScroller$delegate:Lkotlin/properties/ReadWriteProperty;
        //   999: aload_0         /* this */
        //  1000: new             Lgg/essential/elementa/components/UIBlock;
        //  1003: dup            
        //  1004: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //  1007: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getScrollbar$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //  1010: checkcast       Lgg/essential/elementa/state/State;
        //  1013: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //  1016: checkcast       Lgg/essential/elementa/UIComponent;
        //  1019: astore_2        /* $this$constrain$iv */
        //  1020: iconst_0       
        //  1021: istore_3        /* $i$f$constrain */
        //  1022: aload_2         /* $this$constrain$iv */
        //  1023: astore          4
        //  1025: aload           4
        //  1027: astore          $this$constrain_u24lambda_u2d0$iv
        //  1029: iconst_0       
        //  1030: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //  1032: aload           $this$constrain_u24lambda_u2d0$iv
        //  1034: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1037: astore          7
        //  1039: astore          9
        //  1041: iconst_0       
        //  1042: istore          $i$a$-constrain-SettingsGui$sidebarVerticalScrollbar$2
        //  1044: aload           $this$sidebarVerticalScrollbar_delegate_u24lambda_u2d7
        //  1046: bipush          100
        //  1048: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1051: checkcast       Ljava/lang/Number;
        //  1054: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1057: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1060: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1063: nop            
        //  1064: aload           9
        //  1066: nop            
        //  1067: aload           4
        //  1069: nop            
        //  1070: aload_0         /* this */
        //  1071: invokespecial   gg/essential/vigilance/gui/SettingsGui.getMiddleDivider:()Lgg/essential/elementa/components/UIBlock;
        //  1074: checkcast       Lgg/essential/elementa/UIComponent;
        //  1077: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1080: aload_0         /* this */
        //  1081: getstatic       gg/essential/vigilance/gui/SettingsGui.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1084: bipush          8
        //  1086: aaload         
        //  1087: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1090: putfield        gg/essential/vigilance/gui/SettingsGui.sidebarVerticalScrollbar$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1093: aload_0         /* this */
        //  1094: new             Lgg/essential/elementa/components/UIBlock;
        //  1097: dup            
        //  1098: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //  1101: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getDividerDark$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //  1104: checkcast       Lgg/essential/elementa/state/State;
        //  1107: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //  1110: checkcast       Lgg/essential/elementa/UIComponent;
        //  1113: astore_2        /* $this$constrain$iv */
        //  1114: iconst_0       
        //  1115: istore_3        /* $i$f$constrain */
        //  1116: aload_2         /* $this$constrain$iv */
        //  1117: astore          4
        //  1119: aload           4
        //  1121: astore          $this$constrain_u24lambda_u2d0$iv
        //  1123: iconst_0       
        //  1124: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //  1126: aload           $this$constrain_u24lambda_u2d0$iv
        //  1128: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1131: astore          7
        //  1133: astore          9
        //  1135: iconst_0       
        //  1136: istore          $i$a$-constrain-SettingsGui$rightDivider$2
        //  1138: aload           $this$rightDivider_delegate_u24lambda_u2d8
        //  1140: iconst_0       
        //  1141: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1144: checkcast       Ljava/lang/Number;
        //  1147: iconst_1       
        //  1148: iconst_0       
        //  1149: iconst_2       
        //  1150: aconst_null    
        //  1151: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1154: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1157: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1160: aload           $this$rightDivider_delegate_u24lambda_u2d8
        //  1162: ldc             3.0
        //  1164: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1167: checkcast       Ljava/lang/Number;
        //  1170: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1173: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1176: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1179: aload           $this$rightDivider_delegate_u24lambda_u2d8
        //  1181: bipush          100
        //  1183: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1186: checkcast       Ljava/lang/Number;
        //  1189: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1192: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1195: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1198: nop            
        //  1199: aload           9
        //  1201: nop            
        //  1202: aload           4
        //  1204: nop            
        //  1205: aload_0         /* this */
        //  1206: invokespecial   gg/essential/vigilance/gui/SettingsGui.getBottomContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1209: checkcast       Lgg/essential/elementa/UIComponent;
        //  1212: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1215: aload_0         /* this */
        //  1216: getstatic       gg/essential/vigilance/gui/SettingsGui.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1219: bipush          9
        //  1221: aaload         
        //  1222: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1225: putfield        gg/essential/vigilance/gui/SettingsGui.rightDivider$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1228: aload_0         /* this */
        //  1229: new             Lgg/essential/elementa/components/UIContainer;
        //  1232: dup            
        //  1233: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //  1236: checkcast       Lgg/essential/elementa/UIComponent;
        //  1239: astore_2        /* $this$constrain$iv */
        //  1240: iconst_0       
        //  1241: istore_3        /* $i$f$constrain */
        //  1242: aload_2         /* $this$constrain$iv */
        //  1243: astore          4
        //  1245: aload           4
        //  1247: astore          $this$constrain_u24lambda_u2d0$iv
        //  1249: iconst_0       
        //  1250: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //  1252: aload           $this$constrain_u24lambda_u2d0$iv
        //  1254: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1257: astore          7
        //  1259: astore          9
        //  1261: iconst_0       
        //  1262: istore          $i$a$-constrain-SettingsGui$content$2
        //  1264: aload           $this$content_delegate_u24lambda_u2d9
        //  1266: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1269: dup            
        //  1270: fconst_0       
        //  1271: iconst_0       
        //  1272: iconst_3       
        //  1273: aconst_null    
        //  1274: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1277: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1280: aload_0         /* this */
        //  1281: invokespecial   gg/essential/vigilance/gui/SettingsGui.getMiddleDivider:()Lgg/essential/elementa/components/UIBlock;
        //  1284: checkcast       Lgg/essential/elementa/UIComponent;
        //  1287: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1290: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1293: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1296: aload           $this$content_delegate_u24lambda_u2d9
        //  1298: new             Lgg/essential/elementa/constraints/FillConstraint;
        //  1301: dup            
        //  1302: iconst_0       
        //  1303: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(Z)V
        //  1306: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1309: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1312: aload           $this$content_delegate_u24lambda_u2d9
        //  1314: bipush          100
        //  1316: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1319: checkcast       Ljava/lang/Number;
        //  1322: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1325: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1328: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1331: nop            
        //  1332: aload           9
        //  1334: nop            
        //  1335: aload           4
        //  1337: nop            
        //  1338: new             Lgg/essential/elementa/effects/ScissorEffect;
        //  1341: dup            
        //  1342: aconst_null    
        //  1343: iconst_0       
        //  1344: iconst_3       
        //  1345: aconst_null    
        //  1346: invokespecial   gg/essential/elementa/effects/ScissorEffect.<init>:(Lgg/essential/elementa/UIComponent;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1349: checkcast       Lgg/essential/elementa/effects/Effect;
        //  1352: invokestatic    gg/essential/elementa/dsl/ComponentsKt.effect:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/effects/Effect;)Lgg/essential/elementa/UIComponent;
        //  1355: aload_0         /* this */
        //  1356: invokespecial   gg/essential/vigilance/gui/SettingsGui.getBottomContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1359: checkcast       Lgg/essential/elementa/UIComponent;
        //  1362: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1365: aload_0         /* this */
        //  1366: getstatic       gg/essential/vigilance/gui/SettingsGui.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1369: bipush          10
        //  1371: aaload         
        //  1372: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1375: putfield        gg/essential/vigilance/gui/SettingsGui.content$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1378: aload_0         /* this */
        //  1379: new             Lgg/essential/elementa/components/UIBlock;
        //  1382: dup            
        //  1383: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //  1386: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getDividerDark$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //  1389: checkcast       Lgg/essential/elementa/state/State;
        //  1392: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //  1395: checkcast       Lgg/essential/elementa/UIComponent;
        //  1398: astore_2        /* $this$constrain$iv */
        //  1399: iconst_0       
        //  1400: istore_3        /* $i$f$constrain */
        //  1401: aload_2         /* $this$constrain$iv */
        //  1402: astore          4
        //  1404: aload           4
        //  1406: astore          $this$constrain_u24lambda_u2d0$iv
        //  1408: iconst_0       
        //  1409: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //  1411: aload           $this$constrain_u24lambda_u2d0$iv
        //  1413: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1416: astore          7
        //  1418: astore          9
        //  1420: iconst_0       
        //  1421: istore          $i$a$-constrain-SettingsGui$bottomDivider$2
        //  1423: aload           $this$bottomDivider_delegate_u24lambda_u2d10
        //  1425: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1428: dup            
        //  1429: fconst_0       
        //  1430: iconst_0       
        //  1431: iconst_3       
        //  1432: aconst_null    
        //  1433: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1436: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1439: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1442: aload           $this$bottomDivider_delegate_u24lambda_u2d10
        //  1444: bipush          100
        //  1446: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1449: checkcast       Ljava/lang/Number;
        //  1452: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1455: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1458: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1461: aload           $this$bottomDivider_delegate_u24lambda_u2d10
        //  1463: ldc             3.0
        //  1465: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1468: checkcast       Ljava/lang/Number;
        //  1471: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1474: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1477: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1480: nop            
        //  1481: aload           9
        //  1483: nop            
        //  1484: aload           4
        //  1486: nop            
        //  1487: aload_0         /* this */
        //  1488: invokespecial   gg/essential/vigilance/gui/SettingsGui.getContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1491: checkcast       Lgg/essential/elementa/UIComponent;
        //  1494: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1497: aload_0         /* this */
        //  1498: getstatic       gg/essential/vigilance/gui/SettingsGui.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1501: bipush          11
        //  1503: aaload         
        //  1504: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1507: putfield        gg/essential/vigilance/gui/SettingsGui.bottomDivider$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1510: aload_0         /* this */
        //  1511: new             Lgg/essential/elementa/components/UIContainer;
        //  1514: dup            
        //  1515: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //  1518: checkcast       Lgg/essential/elementa/UIComponent;
        //  1521: astore_2        /* $this$constrain$iv */
        //  1522: iconst_0       
        //  1523: istore_3        /* $i$f$constrain */
        //  1524: aload_2         /* $this$constrain$iv */
        //  1525: astore          4
        //  1527: aload           4
        //  1529: astore          $this$constrain_u24lambda_u2d0$iv
        //  1531: iconst_0       
        //  1532: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //  1534: aload           $this$constrain_u24lambda_u2d0$iv
        //  1536: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1539: astore          7
        //  1541: astore          9
        //  1543: iconst_0       
        //  1544: istore          $i$a$-constrain-SettingsGui$sidebarHorizontalScrollbarContainer$2
        //  1546: aload           $this$sidebarHorizontalScrollbarContainer_delegate_u24lambda_u2d11
        //  1548: iconst_0       
        //  1549: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1552: checkcast       Ljava/lang/Number;
        //  1555: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1558: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1561: aload_0         /* this */
        //  1562: invokespecial   gg/essential/vigilance/gui/SettingsGui.getSidebar:()Lgg/essential/elementa/components/UIContainer;
        //  1565: checkcast       Lgg/essential/elementa/UIComponent;
        //  1568: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1571: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1574: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1577: aload           $this$sidebarHorizontalScrollbarContainer_delegate_u24lambda_u2d11
        //  1579: bipush          100
        //  1581: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1584: checkcast       Ljava/lang/Number;
        //  1587: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1590: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1593: aload_0         /* this */
        //  1594: invokespecial   gg/essential/vigilance/gui/SettingsGui.getSidebar:()Lgg/essential/elementa/components/UIContainer;
        //  1597: checkcast       Lgg/essential/elementa/UIComponent;
        //  1600: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1603: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1606: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1609: aload           $this$sidebarHorizontalScrollbarContainer_delegate_u24lambda_u2d11
        //  1611: ldc             3.0
        //  1613: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1616: checkcast       Ljava/lang/Number;
        //  1619: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1622: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1625: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1628: nop            
        //  1629: aload           9
        //  1631: nop            
        //  1632: aload           4
        //  1634: nop            
        //  1635: aload_0         /* this */
        //  1636: invokespecial   gg/essential/vigilance/gui/SettingsGui.getBottomDivider:()Lgg/essential/elementa/components/UIBlock;
        //  1639: checkcast       Lgg/essential/elementa/UIComponent;
        //  1642: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1645: aload_0         /* this */
        //  1646: getstatic       gg/essential/vigilance/gui/SettingsGui.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1649: bipush          12
        //  1651: aaload         
        //  1652: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1655: putfield        gg/essential/vigilance/gui/SettingsGui.sidebarHorizontalScrollbarContainer$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1658: aload_0         /* this */
        //  1659: new             Lgg/essential/elementa/components/UIBlock;
        //  1662: dup            
        //  1663: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //  1666: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getScrollbar$Vigilance:()Lgg/essential/elementa/state/BasicState;
        //  1669: checkcast       Lgg/essential/elementa/state/State;
        //  1672: invokespecial   gg/essential/elementa/components/UIBlock.<init>:(Lgg/essential/elementa/state/State;)V
        //  1675: checkcast       Lgg/essential/elementa/UIComponent;
        //  1678: astore_2        /* $this$constrain$iv */
        //  1679: iconst_0       
        //  1680: istore_3        /* $i$f$constrain */
        //  1681: aload_2         /* $this$constrain$iv */
        //  1682: astore          4
        //  1684: aload           4
        //  1686: astore          $this$constrain_u24lambda_u2d0$iv
        //  1688: iconst_0       
        //  1689: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //  1691: aload           $this$constrain_u24lambda_u2d0$iv
        //  1693: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1696: astore          7
        //  1698: astore          9
        //  1700: iconst_0       
        //  1701: istore          $i$a$-constrain-SettingsGui$sidebarHorizontalScrollbar$2
        //  1703: aload           $this$sidebarHorizontalScrollbar_delegate_u24lambda_u2d12
        //  1705: bipush          100
        //  1707: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1710: checkcast       Ljava/lang/Number;
        //  1713: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //  1716: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1719: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1722: nop            
        //  1723: aload           9
        //  1725: nop            
        //  1726: aload           4
        //  1728: nop            
        //  1729: aload_0         /* this */
        //  1730: invokespecial   gg/essential/vigilance/gui/SettingsGui.getSidebarHorizontalScrollbarContainer:()Lgg/essential/elementa/components/UIContainer;
        //  1733: checkcast       Lgg/essential/elementa/UIComponent;
        //  1736: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1739: aload_0         /* this */
        //  1740: getstatic       gg/essential/vigilance/gui/SettingsGui.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1743: bipush          13
        //  1745: aaload         
        //  1746: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1749: putfield        gg/essential/vigilance/gui/SettingsGui.sidebarHorizontalScrollbar$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1752: aload_0         /* this */
        //  1753: new             Lgg/essential/vigilance/gui/common/IconButton;
        //  1756: dup            
        //  1757: getstatic       gg/essential/vigilance/gui/VigilancePalette.INSTANCE:Lgg/essential/vigilance/gui/VigilancePalette;
        //  1760: invokevirtual   gg/essential/vigilance/gui/VigilancePalette.getARROW_LEFT_4X7$Vigilance:()Lgg/essential/vigilance/utils/ImageFactory;
        //  1763: aconst_null    
        //  1764: aconst_null    
        //  1765: iconst_0       
        //  1766: iconst_0       
        //  1767: bipush          30
        //  1769: aconst_null    
        //  1770: invokespecial   gg/essential/vigilance/gui/common/IconButton.<init>:(Lgg/essential/vigilance/utils/ImageFactory;Ljava/lang/String;Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1773: checkcast       Lgg/essential/elementa/UIComponent;
        //  1776: astore_2        /* $this$constrain$iv */
        //  1777: iconst_0       
        //  1778: istore_3        /* $i$f$constrain */
        //  1779: aload_2         /* $this$constrain$iv */
        //  1780: astore          4
        //  1782: aload           4
        //  1784: astore          $this$constrain_u24lambda_u2d0$iv
        //  1786: iconst_0       
        //  1787: istore          $i$a$-apply-ComponentsKt$constrain$1$iv
        //  1789: aload           $this$constrain_u24lambda_u2d0$iv
        //  1791: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //  1794: astore          7
        //  1796: astore          9
        //  1798: iconst_0       
        //  1799: istore          $i$a$-constrain-SettingsGui$backButton$2
        //  1801: aload           $this$backButton_delegate_u24lambda_u2d13
        //  1803: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //  1806: dup            
        //  1807: ldc_w           18.0
        //  1810: iconst_1       
        //  1811: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZ)V
        //  1814: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1817: aload_0         /* this */
        //  1818: invokespecial   gg/essential/vigilance/gui/SettingsGui.getTitleBar:()Lgg/essential/vigilance/gui/SettingsTitleBar;
        //  1821: checkcast       Lgg/essential/elementa/UIComponent;
        //  1824: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1827: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //  1830: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //  1833: aload           $this$backButton_delegate_u24lambda_u2d13
        //  1835: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //  1838: dup            
        //  1839: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //  1842: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1845: aload_0         /* this */
        //  1846: invokespecial   gg/essential/vigilance/gui/SettingsGui.getTitleBar:()Lgg/essential/vigilance/gui/SettingsTitleBar;
        //  1849: checkcast       Lgg/essential/elementa/UIComponent;
        //  1852: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1855: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //  1858: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //  1861: aload           $this$backButton_delegate_u24lambda_u2d13
        //  1863: bipush          17
        //  1865: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1868: checkcast       Ljava/lang/Number;
        //  1871: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1874: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1877: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1880: aload           $this$backButton_delegate_u24lambda_u2d13
        //  1882: new             Lgg/essential/elementa/constraints/AspectConstraint;
        //  1885: dup            
        //  1886: fconst_0       
        //  1887: iconst_1       
        //  1888: aconst_null    
        //  1889: invokespecial   gg/essential/elementa/constraints/AspectConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1892: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1895: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1898: nop            
        //  1899: aload           9
        //  1901: nop            
        //  1902: aload           4
        //  1904: nop            
        //  1905: aload_0         /* this */
        //  1906: invokevirtual   gg/essential/vigilance/gui/SettingsGui.getWindow:()Lgg/essential/elementa/components/Window;
        //  1909: checkcast       Lgg/essential/elementa/UIComponent;
        //  1912: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1915: aload_0         /* this */
        //  1916: getstatic       gg/essential/vigilance/gui/SettingsGui.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //  1919: bipush          14
        //  1921: aaload         
        //  1922: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //  1925: putfield        gg/essential/vigilance/gui/SettingsGui.backButton$delegate:Lkotlin/properties/ReadWriteProperty;
        //  1928: aload_0         /* this */
        //  1929: aload_0         /* this */
        //  1930: getfield        gg/essential/vigilance/gui/SettingsGui.config:Lgg/essential/vigilance/Vigilant;
        //  1933: invokevirtual   gg/essential/vigilance/Vigilant.getCategories:()Ljava/util/List;
        //  1936: putfield        gg/essential/vigilance/gui/SettingsGui.categories:Ljava/util/List;
        //  1939: aload_0         /* this */
        //  1940: new             Lgg/essential/vigilance/gui/SettingsCategory;
        //  1943: dup            
        //  1944: aload_0         /* this */
        //  1945: getfield        gg/essential/vigilance/gui/SettingsGui.categories:Ljava/util/List;
        //  1948: invokestatic    kotlin/collections/CollectionsKt.first:(Ljava/util/List;)Ljava/lang/Object;
        //  1951: checkcast       Lgg/essential/vigilance/data/Category;
        //  1954: invokespecial   gg/essential/vigilance/gui/SettingsCategory.<init>:(Lgg/essential/vigilance/data/Category;)V
        //  1957: checkcast       Lgg/essential/elementa/UIComponent;
        //  1960: aload_0         /* this */
        //  1961: invokespecial   gg/essential/vigilance/gui/SettingsGui.getContent:()Lgg/essential/elementa/components/UIContainer;
        //  1964: checkcast       Lgg/essential/elementa/UIComponent;
        //  1967: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1970: checkcast       Lgg/essential/vigilance/gui/SettingsCategory;
        //  1973: putfield        gg/essential/vigilance/gui/SettingsGui.currentCategory:Lgg/essential/vigilance/gui/SettingsCategory;
        //  1976: nop            
        //  1977: aload_0         /* this */
        //  1978: invokespecial   gg/essential/vigilance/gui/SettingsGui.getBackButton:()Lgg/essential/vigilance/gui/common/IconButton;
        //  1981: new             Lgg/essential/vigilance/gui/SettingsGui$1;
        //  1984: dup            
        //  1985: aload_0         /* this */
        //  1986: invokespecial   gg/essential/vigilance/gui/SettingsGui$1.<init>:(Lgg/essential/vigilance/gui/SettingsGui;)V
        //  1989: checkcast       Lkotlin/jvm/functions/Function0;
        //  1992: invokevirtual   gg/essential/vigilance/gui/common/IconButton.onActiveClick:(Lkotlin/jvm/functions/Function0;)Lgg/essential/vigilance/gui/common/IconButton;
        //  1995: pop            
        //  1996: aload_0         /* this */
        //  1997: invokevirtual   gg/essential/vigilance/gui/SettingsGui.getWindow:()Lgg/essential/elementa/components/Window;
        //  2000: checkcast       Lgg/essential/elementa/UIComponent;
        //  2003: astore_2        /* $this$onLeftClick$iv */
        //  2004: iconst_0       
        //  2005: istore_3        /* $i$f$onLeftClick */
        //  2006: aload_2         /* $this$onLeftClick$iv */
        //  2007: new             Lgg/essential/vigilance/gui/SettingsGui$special$$inlined$onLeftClick$1;
        //  2010: dup            
        //  2011: aload_0         /* this */
        //  2012: invokespecial   gg/essential/vigilance/gui/SettingsGui$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/vigilance/gui/SettingsGui;)V
        //  2015: checkcast       Lkotlin/jvm/functions/Function2;
        //  2018: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //  2021: nop            
        //  2022: pop            
        //  2023: aload_0         /* this */
        //  2024: invokespecial   gg/essential/vigilance/gui/SettingsGui.getSidebarScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //  2027: aload_0         /* this */
        //  2028: invokespecial   gg/essential/vigilance/gui/SettingsGui.getSidebarVerticalScrollbar:()Lgg/essential/elementa/components/UIBlock;
        //  2031: checkcast       Lgg/essential/elementa/UIComponent;
        //  2034: iconst_1       
        //  2035: invokevirtual   gg/essential/elementa/components/ScrollComponent.setVerticalScrollBarComponent:(Lgg/essential/elementa/UIComponent;Z)V
        //  2038: aload_0         /* this */
        //  2039: invokespecial   gg/essential/vigilance/gui/SettingsGui.getSidebarScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //  2042: aload_0         /* this */
        //  2043: invokespecial   gg/essential/vigilance/gui/SettingsGui.getSidebarHorizontalScrollbar:()Lgg/essential/elementa/components/UIBlock;
        //  2046: checkcast       Lgg/essential/elementa/UIComponent;
        //  2049: iconst_1       
        //  2050: invokevirtual   gg/essential/elementa/components/ScrollComponent.setHorizontalScrollBarComponent:(Lgg/essential/elementa/UIComponent;Z)V
        //  2053: aload_0         /* this */
        //  2054: getfield        gg/essential/vigilance/gui/SettingsGui.categories:Ljava/util/List;
        //  2057: checkcast       Ljava/lang/Iterable;
        //  2060: astore_2        /* $this$forEach$iv */
        //  2061: iconst_0       
        //  2062: istore_3        /* $i$f$forEach */
        //  2063: aload_2         /* $this$forEach$iv */
        //  2064: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  2069: astore          4
        //  2071: aload           4
        //  2073: invokeinterface java/util/Iterator.hasNext:()Z
        //  2078: ifeq            2132
        //  2081: aload           4
        //  2083: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  2088: astore          element$iv
        //  2090: aload           element$iv
        //  2092: checkcast       Lgg/essential/vigilance/data/Category;
        //  2095: astore          category
        //  2097: iconst_0       
        //  2098: istore          $i$a$-forEach-SettingsGui$3
        //  2100: new             Lgg/essential/vigilance/gui/CategoryLabel;
        //  2103: dup            
        //  2104: aload_0         /* this */
        //  2105: aload           category
        //  2107: invokespecial   gg/essential/vigilance/gui/CategoryLabel.<init>:(Lgg/essential/vigilance/gui/SettingsGui;Lgg/essential/vigilance/data/Category;)V
        //  2110: astore          label
        //  2112: aload           label
        //  2114: checkcast       Lgg/essential/elementa/UIComponent;
        //  2117: aload_0         /* this */
        //  2118: invokespecial   gg/essential/vigilance/gui/SettingsGui.getSidebarScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //  2121: checkcast       Lgg/essential/elementa/UIComponent;
        //  2124: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  2127: pop            
        //  2128: nop            
        //  2129: goto            2071
        //  2132: nop            
        //  2133: aload_0         /* this */
        //  2134: invokespecial   gg/essential/vigilance/gui/SettingsGui.getSidebarScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //  2137: checkcast       Lgg/essential/elementa/UIComponent;
        //  2140: astore_3        /* this_$iv */
        //  2141: iconst_0       
        //  2142: istore          $i$f$childrenOfType
        //  2144: aload_3         /* this_$iv */
        //  2145: ldc_w           Lgg/essential/vigilance/gui/CategoryLabel;.class
        //  2148: invokevirtual   gg/essential/elementa/UIComponent.childrenOfType:(Ljava/lang/Class;)Ljava/util/List;
        //  2151: invokestatic    kotlin/collections/CollectionsKt.firstOrNull:(Ljava/util/List;)Ljava/lang/Object;
        //  2154: checkcast       Lgg/essential/vigilance/gui/CategoryLabel;
        //  2157: dup            
        //  2158: ifnonnull       2166
        //  2161: pop            
        //  2162: aconst_null    
        //  2163: goto            2172
        //  2166: invokevirtual   gg/essential/vigilance/gui/CategoryLabel.select:()V
        //  2169: getstatic       kotlin/Unit.INSTANCE:Lkotlin/Unit;
        //  2172: pop            
        //  2173: aload_0         /* this */
        //  2174: invokevirtual   gg/essential/vigilance/gui/SettingsGui.getWindow:()Lgg/essential/elementa/components/Window;
        //  2177: new             Lgg/essential/vigilance/gui/SettingsGui$4;
        //  2180: dup            
        //  2181: aload_0         /* this */
        //  2182: invokespecial   gg/essential/vigilance/gui/SettingsGui$4.<init>:(Lgg/essential/vigilance/gui/SettingsGui;)V
        //  2185: checkcast       Lkotlin/jvm/functions/Function3;
        //  2188: invokevirtual   gg/essential/elementa/components/Window.onKeyType:(Lkotlin/jvm/functions/Function3;)Lgg/essential/elementa/UIComponent;
        //  2191: pop            
        //  2192: nop            
        //  2193: return         
        //    MethodParameters:
        //  Name    Flags  
        //  ------  -----
        //  config  
        //    StackMapTable: 00 04 FF 08 17 00 0A 07 00 02 07 01 6D 07 01 A7 01 07 01 AD 07 01 AF 00 00 00 07 00 02 00 00 3C FF 00 21 00 0A 07 00 02 07 01 6D 07 01 A7 07 00 9E 01 07 01 AF 00 00 00 07 00 02 00 01 07 01 B9 45 07 01 C8
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final UIBlock getBackground() {
        return (UIBlock)this.background$delegate.getValue((Object)this, (KProperty)SettingsGui.$$delegatedProperties[0]);
    }
    
    private final UIContainer getContainer() {
        return (UIContainer)this.container$delegate.getValue((Object)this, (KProperty)SettingsGui.$$delegatedProperties[1]);
    }
    
    private final SettingsTitleBar getTitleBar() {
        return (SettingsTitleBar)this.titleBar$delegate.getValue((Object)this, (KProperty)SettingsGui.$$delegatedProperties[2]);
    }
    
    private final UIContainer getBottomContainer() {
        return (UIContainer)this.bottomContainer$delegate.getValue((Object)this, (KProperty)SettingsGui.$$delegatedProperties[3]);
    }
    
    private final UIBlock getLeftDivider() {
        return (UIBlock)this.leftDivider$delegate.getValue((Object)this, (KProperty)SettingsGui.$$delegatedProperties[4]);
    }
    
    private final UIContainer getSidebar() {
        return (UIContainer)this.sidebar$delegate.getValue((Object)this, (KProperty)SettingsGui.$$delegatedProperties[5]);
    }
    
    private final UIBlock getMiddleDivider() {
        return (UIBlock)this.middleDivider$delegate.getValue((Object)this, (KProperty)SettingsGui.$$delegatedProperties[6]);
    }
    
    private final ScrollComponent getSidebarScroller() {
        return (ScrollComponent)this.sidebarScroller$delegate.getValue((Object)this, (KProperty)SettingsGui.$$delegatedProperties[7]);
    }
    
    private final UIBlock getSidebarVerticalScrollbar() {
        return (UIBlock)this.sidebarVerticalScrollbar$delegate.getValue((Object)this, (KProperty)SettingsGui.$$delegatedProperties[8]);
    }
    
    private final UIBlock getRightDivider() {
        return (UIBlock)this.rightDivider$delegate.getValue((Object)this, (KProperty)SettingsGui.$$delegatedProperties[9]);
    }
    
    private final UIContainer getContent() {
        return (UIContainer)this.content$delegate.getValue((Object)this, (KProperty)SettingsGui.$$delegatedProperties[10]);
    }
    
    private final UIBlock getBottomDivider() {
        return (UIBlock)this.bottomDivider$delegate.getValue((Object)this, (KProperty)SettingsGui.$$delegatedProperties[11]);
    }
    
    private final UIContainer getSidebarHorizontalScrollbarContainer() {
        return (UIContainer)this.sidebarHorizontalScrollbarContainer$delegate.getValue((Object)this, (KProperty)SettingsGui.$$delegatedProperties[12]);
    }
    
    private final UIBlock getSidebarHorizontalScrollbar() {
        return (UIBlock)this.sidebarHorizontalScrollbar$delegate.getValue((Object)this, (KProperty)SettingsGui.$$delegatedProperties[13]);
    }
    
    private final IconButton getBackButton() {
        return (IconButton)this.backButton$delegate.getValue((Object)this, (KProperty)SettingsGui.$$delegatedProperties[14]);
    }
    
    public final void selectCategory(@NotNull final Category category) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc_w           "category"
        //     4: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     7: new             Lgg/essential/vigilance/gui/SettingsCategory;
        //    10: dup            
        //    11: aload_1         /* category */
        //    12: invokespecial   gg/essential/vigilance/gui/SettingsCategory.<init>:(Lgg/essential/vigilance/data/Category;)V
        //    15: checkcast       Lgg/essential/elementa/UIComponent;
        //    18: aload_0         /* this */
        //    19: invokespecial   gg/essential/vigilance/gui/SettingsGui.getContent:()Lgg/essential/elementa/components/UIContainer;
        //    22: checkcast       Lgg/essential/elementa/UIComponent;
        //    25: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //    28: checkcast       Lgg/essential/vigilance/gui/SettingsCategory;
        //    31: astore_2        /* newCategory */
        //    32: aload_0         /* this */
        //    33: getfield        gg/essential/vigilance/gui/SettingsGui.currentCategory:Lgg/essential/vigilance/gui/SettingsCategory;
        //    36: iconst_1       
        //    37: invokevirtual   gg/essential/vigilance/gui/SettingsCategory.closePopups:(Z)V
        //    40: aload_0         /* this */
        //    41: getfield        gg/essential/vigilance/gui/SettingsGui.currentCategory:Lgg/essential/vigilance/gui/SettingsCategory;
        //    44: checkcast       Lgg/essential/elementa/UIComponent;
        //    47: iconst_0       
        //    48: iconst_1       
        //    49: aconst_null    
        //    50: invokestatic    gg/essential/elementa/UIComponent.hide$default:(Lgg/essential/elementa/UIComponent;ZILjava/lang/Object;)V
        //    53: aload_2         /* newCategory */
        //    54: checkcast       Lgg/essential/elementa/UIComponent;
        //    57: iconst_0       
        //    58: iconst_1       
        //    59: aconst_null    
        //    60: invokestatic    gg/essential/elementa/UIComponent.unhide$default:(Lgg/essential/elementa/UIComponent;ZILjava/lang/Object;)V
        //    63: aload_2         /* newCategory */
        //    64: invokevirtual   gg/essential/vigilance/gui/SettingsCategory.scrollToTop:()V
        //    67: aload_0         /* this */
        //    68: aload_2         /* newCategory */
        //    69: putfield        gg/essential/vigilance/gui/SettingsGui.currentCategory:Lgg/essential/vigilance/gui/SettingsCategory;
        //    72: aload_0         /* this */
        //    73: invokespecial   gg/essential/vigilance/gui/SettingsGui.getSidebarScroller:()Lgg/essential/elementa/components/ScrollComponent;
        //    76: checkcast       Lgg/essential/elementa/UIComponent;
        //    79: astore_3        /* this_$iv */
        //    80: iconst_0       
        //    81: istore          $i$f$childrenOfType
        //    83: aload_3         /* this_$iv */
        //    84: ldc_w           Lgg/essential/vigilance/gui/CategoryLabel;.class
        //    87: invokevirtual   gg/essential/elementa/UIComponent.childrenOfType:(Ljava/lang/Class;)Ljava/util/List;
        //    90: checkcast       Ljava/lang/Iterable;
        //    93: astore_3       
        //    94: nop            
        //    95: iconst_0       
        //    96: istore          $i$f$firstOrNull
        //    98: aload_3         /* $this$firstOrNull$iv */
        //    99: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   104: astore          5
        //   106: aload           5
        //   108: invokeinterface java/util/Iterator.hasNext:()Z
        //   113: ifeq            148
        //   116: aload           5
        //   118: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   123: astore          element$iv
        //   125: aload           element$iv
        //   127: checkcast       Lgg/essential/vigilance/gui/CategoryLabel;
        //   130: astore          it
        //   132: iconst_0       
        //   133: istore          $i$a$-firstOrNull-SettingsGui$selectCategory$1
        //   135: aload           it
        //   137: invokevirtual   gg/essential/vigilance/gui/CategoryLabel.isSelected:()Z
        //   140: ifeq            106
        //   143: aload           element$iv
        //   145: goto            149
        //   148: aconst_null    
        //   149: checkcast       Lgg/essential/vigilance/gui/CategoryLabel;
        //   152: dup            
        //   153: ifnonnull       160
        //   156: pop            
        //   157: goto            163
        //   160: invokevirtual   gg/essential/vigilance/gui/CategoryLabel.deselect:()V
        //   163: return         
        //    MethodParameters:
        //  Name      Flags  
        //  --------  -----
        //  category  
        //    StackMapTable: 00 05 FF 00 6A 00 06 07 00 02 07 01 7D 07 01 75 07 01 A7 01 07 01 AD 00 00 29 40 07 01 AF 4A 07 01 B9 02
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @Override
    public void updateGuiScale() {
        this.setNewGuiScale(GuiScale.Companion.scaleForScreenSize$default(GuiScale.Companion, 0, 1, null).ordinal());
        super.updateGuiScale();
    }
    
    private static final void _init_$click(final UIComponent $this$_init__u24click) {
        $this$_init__u24click.mouseClick($this$_init__u24click.getLeft() + ($this$_init__u24click.getRight() - $this$_init__u24click.getLeft()) / 2.0, $this$_init__u24click.getTop() + ($this$_init__u24click.getBottom() - $this$_init__u24click.getTop()) / 2.0, 0);
    }
    
    public static final /* synthetic */ SettingsCategory access$getCurrentCategory$p(final SettingsGui $this) {
        return $this.currentCategory;
    }
    
    public static final /* synthetic */ void access$_init_$click(final UIComponent $receiver) {
        _init_$click($receiver);
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SettingsGui.class, "background", "getBackground()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SettingsGui.class, "container", "getContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SettingsGui.class, "titleBar", "getTitleBar()Lgg/essential/vigilance/gui/SettingsTitleBar;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SettingsGui.class, "bottomContainer", "getBottomContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SettingsGui.class, "leftDivider", "getLeftDivider()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SettingsGui.class, "sidebar", "getSidebar()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SettingsGui.class, "middleDivider", "getMiddleDivider()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SettingsGui.class, "sidebarScroller", "getSidebarScroller()Lgg/essential/elementa/components/ScrollComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SettingsGui.class, "sidebarVerticalScrollbar", "getSidebarVerticalScrollbar()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SettingsGui.class, "rightDivider", "getRightDivider()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SettingsGui.class, "content", "getContent()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SettingsGui.class, "bottomDivider", "getBottomDivider()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SettingsGui.class, "sidebarHorizontalScrollbarContainer", "getSidebarHorizontalScrollbarContainer()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SettingsGui.class, "sidebarHorizontalScrollbar", "getSidebarHorizontalScrollbar()Lgg/essential/elementa/components/UIBlock;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)SettingsGui.class, "backButton", "getBackButton()Lgg/essential/vigilance/gui/common/IconButton;", 0)) };
        Companion = new Companion(null);
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0006" }, d2 = { "Lgg/essential/vigilance/gui/SettingsGui$Companion;", "", "()V", "animTime", "", "dividerWidth", "Vigilance" })
    public static final class Companion
    {
        private Companion() {
            super();
        }
        
        public Companion(final DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}
