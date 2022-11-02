package gg.essential.gui.screenshot.components;

import kotlin.reflect.*;
import org.jetbrains.annotations.*;
import java.nio.file.*;
import kotlin.properties.*;
import gg.essential.elementa.*;
import gg.essential.elementa.components.*;
import gg.essential.gui.screenshot.providers.*;
import net.minecraft.util.*;
import gg.essential.elementa.state.*;
import kotlin.jvm.functions.*;
import gg.essential.gui.common.*;
import gg.essential.api.gui.*;
import kotlin.collections.*;
import gg.essential.util.*;
import gg.essential.*;
import kotlin.text.*;
import gg.essential.network.connectionmanager.sps.*;
import gg.essential.gui.screenshot.*;
import java.util.*;
import gg.essential.elementa.events.*;
import gg.essential.universal.*;
import gg.essential.handlers.screenshot.*;
import kotlin.jvm.internal.*;
import kotlin.*;
import java.awt.*;

@Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                   \u0000®\u0001
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\u000e
                                                   \u0000
                                                   \u0002\u0010%
                                                   \u0002\u0018\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0002\u0010\b
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0005
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010	
                                                   \u0000
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003
                                                   \u0002\u0018\u0002
                                                   \u0000
                                                   \u0002\u0010\u000b
                                                   \u0002\b\u0002
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0004
                                                   \u0002\u0010$
                                                   \u0002\u0018\u0002
                                                   \u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002LMB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010/\u001a\u000200H\u0016J\u0010\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u0007H\u0002J\u0010\u00103\u001a\u0002002\u0006\u00104\u001a\u000205H\u0016J\u000e\u00106\u001a\u0002002\u0006\u00107\u001a\u000208J\u0010\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<H\u0002J\u0016\u0010=\u001a\u0002002\u0006\u0010>\u001a\u00020\f2\u0006\u0010?\u001a\u00020@J\u0010\u0010A\u001a\u00020B2\u0006\u00107\u001a\u000208H\u0002J\u0006\u0010C\u001a\u000200J\u0012\u0010D\u001a\u00020E2\b\b\u0002\u0010F\u001a\u00020:H\u0002J\b\u0010G\u001a\u000200H\u0002J\u001c\u0010H\u001a\u0002002\u0012\u0010I\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020K0JH\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001a\u0010	\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0
                                                   X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                   \u0000\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b\u001c\u0010\u0012\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001d\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f
                                                   \u0004\b!\u0010\u0012\u001a\u0004\b\u001f\u0010 R\u001b\u0010"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b&\u0010\u0012\u001a\u0004\b$\u0010%R\u001b\u0010'\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f
                                                   \u0004\b+\u0010\u0012\u001a\u0004\b)\u0010*R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070\u0014X\u0082\u0004¢\u0006\u0002
                                                   \u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002
                                                   \u0000¨\u0006N""" }, d2 = { "Lgg/essential/gui/screenshot/components/ListViewComponent;", "Lgg/essential/gui/screenshot/components/ScreenshotView;", "screenshotBrowser", "Lgg/essential/gui/screenshot/components/ScreenshotBrowser;", "(Lgg/essential/gui/screenshot/components/ScreenshotBrowser;)V", "emptyScreenshotText", "Lgg/essential/elementa/state/MappedState;", "Lgg/essential/gui/screenshot/components/ListViewComponent$Tab;", "", "imageMap", "", "Ljava/nio/file/Path;", "Lgg/essential/gui/screenshot/components/ScreenshotPreview;", "navigation", "Lgg/essential/elementa/components/UIContainer;", "getNavigation", "()Lgg/essential/elementa/components/UIContainer;", "navigation$delegate", "Lkotlin/properties/ReadWriteProperty;", "numberOfItemsPerRow", "Lgg/essential/elementa/state/BasicState;", "", "getScreenshotBrowser", "()Lgg/essential/gui/screenshot/components/ScreenshotBrowser;", "screenshotScissorBox", "Lgg/essential/gui/common/HollowUIContainer;", "getScreenshotScissorBox", "()Lgg/essential/gui/common/HollowUIContainer;", "screenshotScissorBox$delegate", "screenshotScrollComponent", "Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;", "getScreenshotScrollComponent", "()Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;", "screenshotScrollComponent$delegate", "screenshotsFolder", "Lgg/essential/elementa/UIComponent;", "getScreenshotsFolder", "()Lgg/essential/elementa/UIComponent;", "screenshotsFolder$delegate", "searchBar", "Lgg/essential/gui/common/EssentialCollapsibleSearchbar;", "getSearchBar", "()Lgg/essential/gui/common/EssentialCollapsibleSearchbar;", "searchBar$delegate", "selectedTab", "slider", "Lgg/essential/gui/screenshot/components/ScreenshotItemsSlider;", "afterInitialization", "", "doUpdate", "tab", "draw", "matrixStack", "Lgg/essential/universal/UMatrixStack;", "focus", "properties", "Lgg/essential/gui/screenshot/components/ScreenshotProperties;", "getStartTime", "", "range", "Lgg/essential/gui/screenshot/DateRange;", "handleRightClick", "screenshotPreview", "it", "Lgg/essential/elementa/events/UIClickEvent;", "propertiesMatchSearch", "", "reload", "setCalendar", "Ljava/util/Calendar;", "time", "setupScrollbar", "updateTexturesFromProvider", "providedTextures", "", "Lnet/minecraft/util/Identifier;", "Tab", "TabComponent", "essential" })
public final class ListViewComponent extends ScreenshotView
{
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
    @NotNull
    private final ScreenshotBrowser screenshotBrowser;
    @NotNull
    private final BasicState<Integer> numberOfItemsPerRow;
    @NotNull
    private final Map<Path, ScreenshotPreview> imageMap;
    @NotNull
    private final ReadWriteProperty screenshotsFolder$delegate;
    @NotNull
    private final ReadWriteProperty searchBar$delegate;
    @NotNull
    private final ReadWriteProperty navigation$delegate;
    @NotNull
    private final BasicState<Tab> selectedTab;
    @NotNull
    private final ReadWriteProperty screenshotScissorBox$delegate;
    @NotNull
    private final MappedState<Tab, String> emptyScreenshotText;
    @NotNull
    private final ReadWriteProperty screenshotScrollComponent$delegate;
    
    public ListViewComponent(@NotNull final ScreenshotBrowser screenshotBrowser) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: ldc             "screenshotBrowser"
        //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
        //     6: aload_0         /* this */
        //     7: getstatic       gg/essential/gui/screenshot/components/View.LIST:Lgg/essential/gui/screenshot/components/View;
        //    10: aload_1         /* screenshotBrowser */
        //    11: invokespecial   gg/essential/gui/screenshot/components/ScreenshotView.<init>:(Lgg/essential/gui/screenshot/components/View;Lgg/essential/gui/screenshot/components/ScreenshotBrowser;)V
        //    14: aload_0         /* this */
        //    15: aload_1         /* screenshotBrowser */
        //    16: putfield        gg/essential/gui/screenshot/components/ListViewComponent.screenshotBrowser:Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //    19: aload_0         /* this */
        //    20: new             Lgg/essential/elementa/state/BasicState;
        //    23: dup            
        //    24: getstatic       gg/essential/config/EssentialConfig.INSTANCE:Lgg/essential/config/EssentialConfig;
        //    27: invokevirtual   gg/essential/config/EssentialConfig.getScreenshotBrowserItemsPerRow:()I
        //    30: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //    33: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //    36: astore_2       
        //    37: aload_2        
        //    38: astore_3       
        //    39: astore          7
        //    41: aload_3         /* $this$numberOfItemsPerRow_u24lambda_u2d0 */
        //    42: getstatic       gg/essential/gui/screenshot/components/ListViewComponent$numberOfItemsPerRow$1$1.INSTANCE:Lgg/essential/gui/screenshot/components/ListViewComponent$numberOfItemsPerRow$1$1;
        //    45: checkcast       Lkotlin/jvm/functions/Function1;
        //    48: invokevirtual   gg/essential/elementa/state/BasicState.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //    51: pop            
        //    52: aload           7
        //    54: aload_2        
        //    55: putfield        gg/essential/gui/screenshot/components/ListViewComponent.numberOfItemsPerRow:Lgg/essential/elementa/state/BasicState;
        //    58: aload_0         /* this */
        //    59: new             Ljava/util/LinkedHashMap;
        //    62: dup            
        //    63: invokespecial   java/util/LinkedHashMap.<init>:()V
        //    66: checkcast       Ljava/util/Map;
        //    69: putfield        gg/essential/gui/screenshot/components/ListViewComponent.imageMap:Ljava/util/Map;
        //    72: aload_0         /* this */
        //    73: new             Lgg/essential/gui/common/IconButton;
        //    76: dup            
        //    77: getstatic       gg/essential/gui/EssentialPalette.MC_FOLDER_8X7:Lgg/essential/gui/image/ImageFactory;
        //    80: aconst_null    
        //    81: ldc             "Screenshot Folder"
        //    83: iconst_0       
        //    84: iconst_0       
        //    85: iconst_0       
        //    86: bipush          58
        //    88: invokespecial   gg/essential/gui/common/IconButton.<init>:(Lgg/essential/gui/image/ImageFactory;Ljava/lang/String;Ljava/lang/String;ZZZI)V
        //    91: new             Lgg/essential/gui/common/IconButton$Dimension$Fixed;
        //    94: dup            
        //    95: ldc             17.0
        //    97: ldc             17.0
        //    99: invokespecial   gg/essential/gui/common/IconButton$Dimension$Fixed.<init>:(FF)V
        //   102: checkcast       Lgg/essential/gui/common/IconButton$Dimension;
        //   105: invokevirtual   gg/essential/gui/common/IconButton.setDimension:(Lgg/essential/gui/common/IconButton$Dimension;)Lgg/essential/gui/common/IconButton;
        //   108: checkcast       Lgg/essential/elementa/UIComponent;
        //   111: astore_2        /* $this$constrain$iv */
        //   112: aload_2         /* $this$constrain$iv */
        //   113: astore          4
        //   115: aload           4
        //   117: astore          $this$constrain_u24lambda_u2d0$iv
        //   119: aload           $this$constrain_u24lambda_u2d0$iv
        //   121: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   124: astore          6
        //   126: astore          7
        //   128: aload           $this$screenshotsFolder_delegate_u24lambda_u2d1
        //   130: bipush          10
        //   132: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   135: checkcast       Ljava/lang/Number;
        //   138: iconst_1       
        //   139: iconst_0       
        //   140: iconst_2       
        //   141: aconst_null    
        //   142: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   145: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   148: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   151: aload           $this$screenshotsFolder_delegate_u24lambda_u2d1
        //   153: new             Lgg/essential/gui/common/constraints/CenterPixelConstraint;
        //   156: dup            
        //   157: iconst_0       
        //   158: invokespecial   gg/essential/gui/common/constraints/CenterPixelConstraint.<init>:(C)V
        //   161: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   164: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   167: aload           7
        //   169: aload           4
        //   171: aload_0         /* this */
        //   172: getfield        gg/essential/gui/screenshot/components/ListViewComponent.screenshotBrowser:Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //   175: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //   178: checkcast       Lgg/essential/elementa/UIComponent;
        //   181: aload_0         /* this */
        //   182: invokevirtual   gg/essential/gui/screenshot/components/ListViewComponent.getActive:()Lgg/essential/elementa/state/State;
        //   185: iconst_0       
        //   186: aconst_null    
        //   187: bipush          12
        //   189: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   192: astore_2        /* $this$onLeftClick$iv */
        //   193: aload_2         /* $this$onLeftClick$iv */
        //   194: new             Lgg/essential/gui/screenshot/components/ListViewComponent$special$$inlined$onLeftClick$1;
        //   197: dup            
        //   198: aload_0         /* this */
        //   199: invokespecial   gg/essential/gui/screenshot/components/ListViewComponent$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/screenshot/components/ListViewComponent;)V
        //   202: checkcast       Lkotlin/jvm/functions/Function2;
        //   205: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
        //   208: aload_0         /* this */
        //   209: getstatic       gg/essential/gui/screenshot/components/ListViewComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   212: iconst_0       
        //   213: aaload         
        //   214: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   217: putfield        gg/essential/gui/screenshot/components/ListViewComponent.screenshotsFolder$delegate:Lkotlin/properties/ReadWriteProperty;
        //   220: aload_0         /* this */
        //   221: new             Lgg/essential/gui/common/EssentialCollapsibleSearchbar;
        //   224: dup            
        //   225: aconst_null    
        //   226: aconst_null    
        //   227: aconst_null    
        //   228: iconst_0       
        //   229: iconst_0       
        //   230: iconst_0       
        //   231: bipush          63
        //   233: invokespecial   gg/essential/gui/common/EssentialCollapsibleSearchbar.<init>:(Ljava/lang/String;Ljava/awt/Color;Ljava/lang/String;ZZII)V
        //   236: checkcast       Lgg/essential/elementa/UIComponent;
        //   239: astore_2        /* $this$constrain$iv */
        //   240: aload_2         /* $this$constrain$iv */
        //   241: astore          4
        //   243: aload           4
        //   245: astore          $this$constrain_u24lambda_u2d0$iv
        //   247: aload           $this$constrain_u24lambda_u2d0$iv
        //   249: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   252: astore          6
        //   254: astore          7
        //   256: aload           $this$searchBar_delegate_u24lambda_u2d3
        //   258: new             Lgg/essential/elementa/constraints/SiblingConstraint;
        //   261: dup            
        //   262: ldc_w           3.0
        //   265: iconst_1       
        //   266: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZ)V
        //   269: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   272: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   275: aload           $this$searchBar_delegate_u24lambda_u2d3
        //   277: new             Lgg/essential/gui/common/constraints/CenterPixelConstraint;
        //   280: dup            
        //   281: iconst_0       
        //   282: invokespecial   gg/essential/gui/common/constraints/CenterPixelConstraint.<init>:(C)V
        //   285: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   288: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   291: aload           $this$searchBar_delegate_u24lambda_u2d3
        //   293: bipush          100
        //   295: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   298: checkcast       Ljava/lang/Number;
        //   301: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   304: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   307: aload_0         /* this */
        //   308: invokespecial   gg/essential/gui/screenshot/components/ListViewComponent.getScreenshotsFolder:()Lgg/essential/elementa/UIComponent;
        //   311: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   314: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   317: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   320: aload           7
        //   322: aload           4
        //   324: aload_0         /* this */
        //   325: getfield        gg/essential/gui/screenshot/components/ListViewComponent.screenshotBrowser:Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //   328: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getTitleBar:()Lgg/essential/elementa/components/UIBlock;
        //   331: checkcast       Lgg/essential/elementa/UIComponent;
        //   334: aload_0         /* this */
        //   335: invokevirtual   gg/essential/gui/screenshot/components/ListViewComponent.getActive:()Lgg/essential/elementa/state/State;
        //   338: iconst_0       
        //   339: aconst_null    
        //   340: bipush          12
        //   342: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //   345: aload_0         /* this */
        //   346: getstatic       gg/essential/gui/screenshot/components/ListViewComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   349: iconst_1       
        //   350: aaload         
        //   351: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   354: putfield        gg/essential/gui/screenshot/components/ListViewComponent.searchBar$delegate:Lkotlin/properties/ReadWriteProperty;
        //   357: aload_0         /* this */
        //   358: new             Lgg/essential/elementa/components/UIContainer;
        //   361: dup            
        //   362: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
        //   365: checkcast       Lgg/essential/elementa/UIComponent;
        //   368: astore_2        /* $this$constrain$iv */
        //   369: aload_2         /* $this$constrain$iv */
        //   370: astore          4
        //   372: aload           4
        //   374: astore          $this$constrain_u24lambda_u2d0$iv
        //   376: aload           $this$constrain_u24lambda_u2d0$iv
        //   378: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   381: astore          6
        //   383: astore          7
        //   385: aload           $this$navigation_delegate_u24lambda_u2d4
        //   387: bipush          11
        //   389: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   392: checkcast       Ljava/lang/Number;
        //   395: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   398: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   401: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   404: aload           $this$navigation_delegate_u24lambda_u2d4
        //   406: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
        //   409: dup            
        //   410: ldc_w           12.0
        //   413: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(F)V
        //   416: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   419: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   422: aload           $this$navigation_delegate_u24lambda_u2d4
        //   424: bipush          28
        //   426: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   429: checkcast       Ljava/lang/Number;
        //   432: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   435: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   438: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   441: aload           7
        //   443: aload           4
        //   445: aload_0         /* this */
        //   446: checkcast       Lgg/essential/elementa/UIComponent;
        //   449: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   452: aload_0         /* this */
        //   453: getstatic       gg/essential/gui/screenshot/components/ListViewComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   456: iconst_2       
        //   457: aaload         
        //   458: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   461: putfield        gg/essential/gui/screenshot/components/ListViewComponent.navigation$delegate:Lkotlin/properties/ReadWriteProperty;
        //   464: new             Lgg/essential/gui/screenshot/components/ScreenshotItemsSlider;
        //   467: dup            
        //   468: aload_0         /* this */
        //   469: getfield        gg/essential/gui/screenshot/components/ListViewComponent.numberOfItemsPerRow:Lgg/essential/elementa/state/BasicState;
        //   472: checkcast       Lgg/essential/elementa/state/State;
        //   475: aload_0         /* this */
        //   476: invokespecial   gg/essential/gui/screenshot/components/ScreenshotItemsSlider.<init>:(Lgg/essential/elementa/state/State;Lgg/essential/gui/screenshot/components/ListViewComponent;)V
        //   479: checkcast       Lgg/essential/elementa/UIComponent;
        //   482: astore_2        /* $this$constrain$iv */
        //   483: aload_2         /* $this$constrain$iv */
        //   484: astore          4
        //   486: aload           4
        //   488: astore          $this$constrain_u24lambda_u2d0$iv
        //   490: aload           $this$constrain_u24lambda_u2d0$iv
        //   492: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   495: astore          $this$slider_u24lambda_u2d5
        //   497: aload           $this$slider_u24lambda_u2d5
        //   499: bipush          11
        //   501: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   504: checkcast       Ljava/lang/Number;
        //   507: iconst_1       
        //   508: iconst_0       
        //   509: iconst_2       
        //   510: aconst_null    
        //   511: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.pixels$default:(Ljava/lang/Number;ZZILjava/lang/Object;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   514: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   517: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   520: aload           $this$slider_u24lambda_u2d5
        //   522: new             Lgg/essential/elementa/constraints/CenterConstraint;
        //   525: dup            
        //   526: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
        //   529: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   532: aload_0         /* this */
        //   533: invokespecial   gg/essential/gui/screenshot/components/ListViewComponent.getNavigation:()Lgg/essential/elementa/components/UIContainer;
        //   536: checkcast       Lgg/essential/elementa/UIComponent;
        //   539: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   542: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   545: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   548: aload           4
        //   550: aload_0         /* this */
        //   551: checkcast       Lgg/essential/elementa/UIComponent;
        //   554: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   557: pop            
        //   558: aload_0         /* this */
        //   559: new             Lgg/essential/elementa/state/BasicState;
        //   562: dup            
        //   563: getstatic       gg/essential/gui/screenshot/components/ListViewComponent$Tab.ALL:Lgg/essential/gui/screenshot/components/ListViewComponent$Tab;
        //   566: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //   569: putfield        gg/essential/gui/screenshot/components/ListViewComponent.selectedTab:Lgg/essential/elementa/state/BasicState;
        //   572: aload_0         /* this */
        //   573: new             Lgg/essential/gui/common/HollowUIContainer;
        //   576: dup            
        //   577: invokespecial   gg/essential/gui/common/HollowUIContainer.<init>:()V
        //   580: checkcast       Lgg/essential/elementa/UIComponent;
        //   583: aload_0         /* this */
        //   584: getstatic       gg/essential/gui/screenshot/components/ListViewComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   587: iconst_3       
        //   588: aaload         
        //   589: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   592: putfield        gg/essential/gui/screenshot/components/ListViewComponent.screenshotScissorBox$delegate:Lkotlin/properties/ReadWriteProperty;
        //   595: aload_0         /* this */
        //   596: aload_0         /* this */
        //   597: getfield        gg/essential/gui/screenshot/components/ListViewComponent.selectedTab:Lgg/essential/elementa/state/BasicState;
        //   600: getstatic       gg/essential/gui/screenshot/components/ListViewComponent$emptyScreenshotText$1.INSTANCE:Lgg/essential/gui/screenshot/components/ListViewComponent$emptyScreenshotText$1;
        //   603: checkcast       Lkotlin/jvm/functions/Function1;
        //   606: invokevirtual   gg/essential/elementa/state/BasicState.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
        //   609: putfield        gg/essential/gui/screenshot/components/ListViewComponent.emptyScreenshotText:Lgg/essential/elementa/state/MappedState;
        //   612: aload_0         /* this */
        //   613: new             Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;
        //   616: dup            
        //   617: aconst_null    
        //   618: aconst_null    
        //   619: iconst_0       
        //   620: fconst_0       
        //   621: fconst_0       
        //   622: aload_0         /* this */
        //   623: invokespecial   gg/essential/gui/screenshot/components/ListViewComponent.getScreenshotScissorBox:()Lgg/essential/gui/common/HollowUIContainer;
        //   626: checkcast       Lgg/essential/elementa/UIComponent;
        //   629: sipush          511
        //   632: invokespecial   gg/essential/gui/screenshot/components/ScreenshotScrollComponent.<init>:(Ljava/lang/String;Ljava/awt/Color;ZFFLgg/essential/elementa/UIComponent;I)V
        //   635: checkcast       Lgg/essential/elementa/UIComponent;
        //   638: astore_2        /* $this$constrain$iv */
        //   639: aload_2         /* $this$constrain$iv */
        //   640: astore          4
        //   642: aload           4
        //   644: astore          $this$constrain_u24lambda_u2d0$iv
        //   646: aload           $this$constrain_u24lambda_u2d0$iv
        //   648: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   651: astore          6
        //   653: astore          7
        //   655: aload           $this$screenshotScrollComponent_delegate_u24lambda_u2d6
        //   657: bipush          11
        //   659: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   662: checkcast       Ljava/lang/Number;
        //   665: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   668: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   671: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   674: aload           $this$screenshotScrollComponent_delegate_u24lambda_u2d6
        //   676: bipush          28
        //   678: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   681: checkcast       Ljava/lang/Number;
        //   684: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   687: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   690: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   693: aload           $this$screenshotScrollComponent_delegate_u24lambda_u2d6
        //   695: bipush          100
        //   697: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   700: checkcast       Ljava/lang/Number;
        //   703: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   706: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   709: bipush          22
        //   711: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   714: checkcast       Ljava/lang/Number;
        //   717: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   720: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   723: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   726: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   729: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   732: aload           $this$screenshotScrollComponent_delegate_u24lambda_u2d6
        //   734: new             Lgg/essential/elementa/constraints/FillConstraint;
        //   737: dup            
        //   738: iconst_0       
        //   739: invokespecial   gg/essential/elementa/constraints/FillConstraint.<init>:(Z)V
        //   742: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   745: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   748: aload           7
        //   750: aload           4
        //   752: astore_2        /* $this$constrain$iv */
        //   753: aload_2        
        //   754: checkcast       Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;
        //   757: astore_3       
        //   758: astore          7
        //   760: aload_3         /* $this$screenshotScrollComponent_delegate_u24lambda_u2d7 */
        //   761: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotScrollComponent.getEmptyText:()Lgg/essential/elementa/components/UIWrappedText;
        //   764: aload_0         /* this */
        //   765: getfield        gg/essential/gui/screenshot/components/ListViewComponent.emptyScreenshotText:Lgg/essential/elementa/state/MappedState;
        //   768: checkcast       Lgg/essential/elementa/state/State;
        //   771: invokevirtual   gg/essential/elementa/components/UIWrappedText.bindText:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/components/UIWrappedText;
        //   774: pop            
        //   775: aload           7
        //   777: aload_2        
        //   778: aload_0         /* this */
        //   779: checkcast       Lgg/essential/elementa/UIComponent;
        //   782: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //   785: aload_0         /* this */
        //   786: getstatic       gg/essential/gui/screenshot/components/ListViewComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
        //   789: iconst_4       
        //   790: aaload         
        //   791: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
        //   794: putfield        gg/essential/gui/screenshot/components/ListViewComponent.screenshotScrollComponent$delegate:Lkotlin/properties/ReadWriteProperty;
        //   797: aload_0         /* this */
        //   798: checkcast       Lgg/essential/elementa/UIComponent;
        //   801: astore_2        /* $this$constrain$iv */
        //   802: aload_2         /* $this$constrain$iv */
        //   803: astore          4
        //   805: aload           4
        //   807: astore          $this$constrain_u24lambda_u2d0$iv
        //   809: aload           $this$constrain_u24lambda_u2d0$iv
        //   811: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   814: astore          $this$_init__u24lambda_u2d8
        //   816: aload           $this$_init__u24lambda_u2d8
        //   818: bipush          100
        //   820: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   823: checkcast       Ljava/lang/Number;
        //   826: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   829: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //   832: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //   835: aload           $this$_init__u24lambda_u2d8
        //   837: bipush          100
        //   839: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   842: checkcast       Ljava/lang/Number;
        //   845: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPercent:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/RelativeConstraint;
        //   848: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //   851: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //   854: aload_0         /* this */
        //   855: invokespecial   gg/essential/gui/screenshot/components/ListViewComponent.getScreenshotScissorBox:()Lgg/essential/gui/common/HollowUIContainer;
        //   858: checkcast       Lgg/essential/elementa/UIComponent;
        //   861: astore_2        /* $this$constrain$iv */
        //   862: aload_2         /* $this$constrain$iv */
        //   863: astore          4
        //   865: aload           4
        //   867: astore          $this$constrain_u24lambda_u2d0$iv
        //   869: aload           $this$constrain_u24lambda_u2d0$iv
        //   871: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
        //   874: astore          $this$_init__u24lambda_u2d9
        //   876: aload           $this$_init__u24lambda_u2d9
        //   878: new             Lgg/essential/elementa/constraints/CopyConstraintFloat;
        //   881: dup            
        //   882: iconst_0       
        //   883: iconst_1       
        //   884: aconst_null    
        //   885: invokespecial   gg/essential/elementa/constraints/CopyConstraintFloat.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   888: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   891: aload_0         /* this */
        //   892: invokevirtual   gg/essential/gui/screenshot/components/ListViewComponent.getScreenshotScrollComponent:()Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;
        //   895: checkcast       Lgg/essential/elementa/UIComponent;
        //   898: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   901: fconst_2       
        //   902: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   905: checkcast       Ljava/lang/Number;
        //   908: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   911: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   914: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   917: checkcast       Lgg/essential/elementa/constraints/XConstraint;
        //   920: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
        //   923: aload           $this$_init__u24lambda_u2d9
        //   925: new             Lgg/essential/elementa/constraints/CopyConstraintFloat;
        //   928: dup            
        //   929: iconst_0       
        //   930: iconst_1       
        //   931: aconst_null    
        //   932: invokespecial   gg/essential/elementa/constraints/CopyConstraintFloat.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   935: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   938: aload_0         /* this */
        //   939: invokevirtual   gg/essential/gui/screenshot/components/ListViewComponent.getScreenshotScrollComponent:()Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;
        //   942: checkcast       Lgg/essential/elementa/UIComponent;
        //   945: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   948: fconst_2       
        //   949: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //   952: checkcast       Ljava/lang/Number;
        //   955: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //   958: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   961: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.minus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/SubtractiveConstraint;
        //   964: checkcast       Lgg/essential/elementa/constraints/YConstraint;
        //   967: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
        //   970: aload           $this$_init__u24lambda_u2d9
        //   972: new             Lgg/essential/elementa/constraints/CopyConstraintFloat;
        //   975: dup            
        //   976: iconst_0       
        //   977: iconst_1       
        //   978: aconst_null    
        //   979: invokespecial   gg/essential/elementa/constraints/CopyConstraintFloat.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //   982: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //   985: aload_0         /* this */
        //   986: invokevirtual   gg/essential/gui/screenshot/components/ListViewComponent.getScreenshotScrollComponent:()Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;
        //   989: checkcast       Lgg/essential/elementa/UIComponent;
        //   992: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //   995: ldc_w           4.0
        //   998: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1001: checkcast       Ljava/lang/Number;
        //  1004: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1007: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1010: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //  1013: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
        //  1016: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
        //  1019: aload           $this$_init__u24lambda_u2d9
        //  1021: new             Lgg/essential/elementa/constraints/CopyConstraintFloat;
        //  1024: dup            
        //  1025: iconst_0       
        //  1026: iconst_1       
        //  1027: aconst_null    
        //  1028: invokespecial   gg/essential/elementa/constraints/CopyConstraintFloat.<init>:(ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
        //  1031: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1034: aload_0         /* this */
        //  1035: invokevirtual   gg/essential/gui/screenshot/components/ListViewComponent.getScreenshotScrollComponent:()Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;
        //  1038: checkcast       Lgg/essential/elementa/UIComponent;
        //  1041: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.boundTo:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/constraints/SuperConstraint;
        //  1044: ldc_w           4.0
        //  1047: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1050: checkcast       Ljava/lang/Number;
        //  1053: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1056: checkcast       Lgg/essential/elementa/constraints/SuperConstraint;
        //  1059: invokestatic    gg/essential/elementa/dsl/ConstraintsKt.plus:(Lgg/essential/elementa/constraints/SuperConstraint;Lgg/essential/elementa/constraints/SuperConstraint;)Lgg/essential/elementa/constraints/AdditiveConstraint;
        //  1062: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1065: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
        //  1068: aload           4
        //  1070: aload_0         /* this */
        //  1071: checkcast       Lgg/essential/elementa/UIComponent;
        //  1074: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1077: pop            
        //  1078: invokestatic    gg/essential/gui/screenshot/components/ListViewComponent$Tab.values:()[Lgg/essential/gui/screenshot/components/ListViewComponent$Tab;
        //  1081: astore_2       
        //  1082: iconst_0       
        //  1083: istore_3       
        //  1084: aload_2        
        //  1085: arraylength    
        //  1086: istore          4
        //  1088: iload_3        
        //  1089: iload           4
        //  1091: if_icmpge       1129
        //  1094: aload_2        
        //  1095: iload_3        
        //  1096: aaload         
        //  1097: astore          value
        //  1099: new             Lgg/essential/gui/screenshot/components/ListViewComponent$TabComponent;
        //  1102: dup            
        //  1103: aload_0         /* this */
        //  1104: aload           value
        //  1106: invokespecial   gg/essential/gui/screenshot/components/ListViewComponent$TabComponent.<init>:(Lgg/essential/gui/screenshot/components/ListViewComponent;Lgg/essential/gui/screenshot/components/ListViewComponent$Tab;)V
        //  1109: checkcast       Lgg/essential/elementa/UIComponent;
        //  1112: aload_0         /* this */
        //  1113: invokespecial   gg/essential/gui/screenshot/components/ListViewComponent.getNavigation:()Lgg/essential/elementa/components/UIContainer;
        //  1116: checkcast       Lgg/essential/elementa/UIComponent;
        //  1119: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
        //  1122: pop            
        //  1123: iinc            3, 1
        //  1126: goto            1088
        //  1129: new             Lgg/essential/elementa/state/BasicState;
        //  1132: dup            
        //  1133: fconst_0       
        //  1134: invokestatic    java/lang/Float.valueOf:(F)Ljava/lang/Float;
        //  1137: invokespecial   gg/essential/elementa/state/BasicState.<init>:(Ljava/lang/Object;)V
        //  1140: astore_2        /* percentState */
        //  1141: aload_0         /* this */
        //  1142: invokevirtual   gg/essential/gui/screenshot/components/ListViewComponent.getScreenshotScrollComponent:()Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;
        //  1145: iconst_0       
        //  1146: new             Lgg/essential/gui/screenshot/components/ListViewComponent$3;
        //  1149: dup            
        //  1150: aload_2         /* percentState */
        //  1151: invokespecial   gg/essential/gui/screenshot/components/ListViewComponent$3.<init>:(Lgg/essential/elementa/state/BasicState;)V
        //  1154: checkcast       Lkotlin/jvm/functions/Function2;
        //  1157: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotScrollComponent.addScrollAdjustEvent:(ZLkotlin/jvm/functions/Function2;)V
        //  1160: aload_0         /* this */
        //  1161: invokespecial   gg/essential/gui/screenshot/components/ListViewComponent.getScreenshotScissorBox:()Lgg/essential/gui/common/HollowUIContainer;
        //  1164: checkcast       Lgg/essential/elementa/UIComponent;
        //  1167: iconst_1       
        //  1168: bipush          20
        //  1170: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1173: checkcast       Ljava/lang/Number;
        //  1176: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1179: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1182: aload_2         /* percentState */
        //  1183: checkcast       Lgg/essential/elementa/state/State;
        //  1186: aload_0         /* this */
        //  1187: checkcast       Lgg/essential/elementa/UIComponent;
        //  1190: invokestatic    gg/essential/util/ExtensionsKt.createGradient$default$e735f6c$17d75708:(Lgg/essential/elementa/UIComponent;ZLgg/essential/elementa/constraints/HeightConstraint;Lgg/essential/elementa/state/State;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/components/GradientComponent;
        //  1193: pop            
        //  1194: aload_0         /* this */
        //  1195: invokespecial   gg/essential/gui/screenshot/components/ListViewComponent.getScreenshotScissorBox:()Lgg/essential/gui/common/HollowUIContainer;
        //  1198: checkcast       Lgg/essential/elementa/UIComponent;
        //  1201: iconst_0       
        //  1202: bipush          20
        //  1204: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //  1207: checkcast       Ljava/lang/Number;
        //  1210: invokestatic    gg/essential/elementa/dsl/UtilitiesKt.getPixels:(Ljava/lang/Number;)Lgg/essential/elementa/constraints/PixelConstraint;
        //  1213: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
        //  1216: aload_2         /* percentState */
        //  1217: checkcast       Lgg/essential/elementa/state/State;
        //  1220: aload_0         /* this */
        //  1221: checkcast       Lgg/essential/elementa/UIComponent;
        //  1224: invokestatic    gg/essential/util/ExtensionsKt.createGradient$default$e735f6c$17d75708:(Lgg/essential/elementa/UIComponent;ZLgg/essential/elementa/constraints/HeightConstraint;Lgg/essential/elementa/state/State;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/components/GradientComponent;
        //  1227: pop            
        //  1228: aload_0         /* this */
        //  1229: checkcast       Lgg/essential/elementa/UIComponent;
        //  1232: aload_0         /* this */
        //  1233: getfield        gg/essential/gui/screenshot/components/ListViewComponent.screenshotBrowser:Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //  1236: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getContent:()Lgg/essential/elementa/components/UIContainer;
        //  1239: checkcast       Lgg/essential/elementa/UIComponent;
        //  1242: aload_0         /* this */
        //  1243: invokevirtual   gg/essential/gui/screenshot/components/ListViewComponent.getActive:()Lgg/essential/elementa/state/State;
        //  1246: iconst_0       
        //  1247: aconst_null    
        //  1248: bipush          12
        //  1250: invokestatic    gg/essential/gui/common/StateExtensionsKt.bindParent$default$6fcd5b6b:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/state/State;ZLjava/lang/Integer;I)Lgg/essential/elementa/UIComponent;
        //  1253: pop            
        //  1254: aload_0         /* this */
        //  1255: invokespecial   gg/essential/gui/screenshot/components/ListViewComponent.setupScrollbar:()V
        //  1258: aload_0         /* this */
        //  1259: invokespecial   gg/essential/gui/screenshot/components/ListViewComponent.getSearchBar:()Lgg/essential/gui/common/EssentialCollapsibleSearchbar;
        //  1262: invokevirtual   gg/essential/gui/common/EssentialCollapsibleSearchbar.getTextContent:()Lgg/essential/elementa/state/BasicState;
        //  1265: new             Lgg/essential/gui/screenshot/components/ListViewComponent$4;
        //  1268: dup            
        //  1269: aload_0         /* this */
        //  1270: invokespecial   gg/essential/gui/screenshot/components/ListViewComponent$4.<init>:(Lgg/essential/gui/screenshot/components/ListViewComponent;)V
        //  1273: checkcast       Lkotlin/jvm/functions/Function1;
        //  1276: invokevirtual   gg/essential/elementa/state/BasicState.onSetValue:(Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function0;
        //  1279: pop            
        //  1280: return         
        //    MethodParameters:
        //  Name               Flags  
        //  -----------------  -----
        //  screenshotBrowser  
        //    StackMapTable: 00 02 FF 04 40 00 08 07 00 02 07 00 EF 07 01 9E 01 01 07 01 A0 07 00 DE 07 00 02 00 00 28
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    @NotNull
    public final ScreenshotBrowser getScreenshotBrowser() {
        return this.screenshotBrowser;
    }
    
    private final UIComponent getScreenshotsFolder() {
        return (UIComponent)this.screenshotsFolder$delegate.getValue((Object)this, (KProperty)ListViewComponent.$$delegatedProperties[0]);
    }
    
    private final EssentialCollapsibleSearchbar getSearchBar() {
        return (EssentialCollapsibleSearchbar)this.searchBar$delegate.getValue((Object)this, (KProperty)ListViewComponent.$$delegatedProperties[1]);
    }
    
    private final UIContainer getNavigation() {
        return (UIContainer)this.navigation$delegate.getValue((Object)this, (KProperty)ListViewComponent.$$delegatedProperties[2]);
    }
    
    private final HollowUIContainer getScreenshotScissorBox() {
        return (HollowUIContainer)this.screenshotScissorBox$delegate.getValue((Object)this, (KProperty)ListViewComponent.$$delegatedProperties[3]);
    }
    
    @NotNull
    public final ScreenshotScrollComponent getScreenshotScrollComponent() {
        return (ScreenshotScrollComponent)this.screenshotScrollComponent$delegate.getValue((Object)this, (KProperty)ListViewComponent.$$delegatedProperties[4]);
    }
    
    @Override
    public void draw(@NotNull final UMatrixStack matrixStack) {
        Intrinsics.checkNotNullParameter((Object)matrixStack, "matrixStack");
        final ScreenshotProviderManager providerManager = this.screenshotBrowser.getProviderManager();
        providerManager.setRenderedLastFrame(null);
        super.draw(matrixStack);
        this.updateTexturesFromProvider(providerManager.provide());
    }
    
    @Override
    public void afterInitialization() {
        super.afterInitialization();
        StateExtensionsKt.onSetValueAndNow((State<Object>)this.selectedTab, (kotlin.jvm.functions.Function1<? super Object, Unit>)new ListViewComponent$afterInitialization.ListViewComponent$afterInitialization$1(this));
    }
    
    private final void setupScrollbar() {
        this.getScreenshotScrollComponent().setVerticalScrollBarComponent$46e808b7((UIComponent)ExtensionsKt.createRightDividerScroller$default$6f501d84(this.screenshotBrowser, this.getActive(), null, null, null, false, 30).getFirst());
    }
    
    public final void reload() {
        this.doUpdate(this.selectedTab.get());
    }
    
    private final boolean propertiesMatchSearch(final ScreenshotProperties properties) {
        final String text = this.getSearchBar().getText();
        final List matchAgainst = CollectionsKt.mutableListOf((Object[])new String[] { properties.getPath().getFileName().toString() });
        final ClientScreenshotMetadata metadata = properties.getMetadata();
        if (metadata != null) {
            final List list = matchAgainst;
            String s;
            if ((s = UUIDUtil.getName(metadata.getAuthorId()).getNow(null)) == null) {
                s = "";
            }
            list.add(s);
            final String identifier = metadata.getLocationMetadata().getIdentifier();
            if (identifier != null) {
                final SPSManager spsManager2 = Essential.getInstance().getConnectionManager().getSpsManager();
                Intrinsics.checkNotNullExpressionValue((Object)spsManager2, "getInstance().connectionManager.spsManager");
                final SPSManager spsManager = spsManager2;
                final UUID host = spsManager.getHostFromSpsAddress(identifier);
                if (host != null) {
                    final List list2 = matchAgainst;
                    String s2;
                    if ((s2 = UUIDUtil.getName(host).getNow(null)) == null) {
                        s2 = "";
                    }
                    list2.add(s2);
                }
                matchAgainst.add(identifier);
            }
        }
        final Iterable $this$any$iv = matchAgainst;
        boolean b;
        if ($this$any$iv instanceof Collection && ((Collection)$this$any$iv).isEmpty()) {
            b = false;
        }
        else {
            for (final Object element$iv : $this$any$iv) {
                final String it = (String)element$iv;
                if (StringsKt.contains((CharSequence)it, (CharSequence)text, true)) {
                    b = true;
                    return b;
                }
            }
            b = false;
        }
        return b;
    }
    
    private final void doUpdate(final Tab tab) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   gg/essential/gui/screenshot/components/ListViewComponent.getScreenshotScrollComponent:()Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;
        //     4: checkcast       Lgg/essential/elementa/UIComponent;
        //     7: astore_3        /* this_$iv */
        //     8: aload_3         /* this_$iv */
        //     9: ldc_w           Lgg/essential/gui/screenshot/components/ScreenshotDateGroup;.class
        //    12: invokevirtual   gg/essential/elementa/UIComponent.childrenOfType:(Ljava/lang/Class;)Ljava/util/List;
        //    15: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //    20: astore_2       
        //    21: aload_2        
        //    22: invokeinterface java/util/Iterator.hasNext:()Z
        //    27: ifeq            47
        //    30: aload_2        
        //    31: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    36: checkcast       Lgg/essential/gui/screenshot/components/ScreenshotDateGroup;
        //    39: astore_3        /* screenshotDateGroup */
        //    40: aload_3         /* screenshotDateGroup */
        //    41: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotDateGroup.cleanup:()V
        //    44: goto            21
        //    47: aload_0         /* this */
        //    48: invokevirtual   gg/essential/gui/screenshot/components/ListViewComponent.getScreenshotScrollComponent:()Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;
        //    51: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotScrollComponent.clearChildren:()Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;
        //    54: pop            
        //    55: aload_0         /* this */
        //    56: getfield        gg/essential/gui/screenshot/components/ListViewComponent.imageMap:Ljava/util/Map;
        //    59: invokeinterface java/util/Map.clear:()V
        //    64: new             Ljava/util/TreeMap;
        //    67: dup            
        //    68: invokespecial   java/util/TreeMap.<init>:()V
        //    71: astore_2        /* dateMap */
        //    72: invokestatic    gg/essential/gui/screenshot/DateRange.values:()[Lgg/essential/gui/screenshot/DateRange;
        //    75: astore_3       
        //    76: iconst_0       
        //    77: istore          4
        //    79: aload_3        
        //    80: arraylength    
        //    81: istore          5
        //    83: iload           4
        //    85: iload           5
        //    87: if_icmpge       192
        //    90: aload_3        
        //    91: iload           4
        //    93: aaload         
        //    94: astore          value
        //    96: aload           value
        //    98: getstatic       gg/essential/gui/screenshot/DateRange.MONTH_OTHER:Lgg/essential/gui/screenshot/DateRange;
        //   101: if_acmpne       107
        //   104: goto            186
        //   107: aload_0         /* this */
        //   108: aload           value
        //   110: invokespecial   gg/essential/gui/screenshot/components/ListViewComponent.getStartTime:(Lgg/essential/gui/screenshot/DateRange;)J
        //   113: lstore          startTime
        //   115: aload           value
        //   117: getstatic       gg/essential/gui/screenshot/DateRange.EARLIER_MONTH:Lgg/essential/gui/screenshot/DateRange;
        //   120: if_acmpne       139
        //   123: lload           startTime
        //   125: aload_0         /* this */
        //   126: getstatic       gg/essential/gui/screenshot/DateRange.LAST_WEEK:Lgg/essential/gui/screenshot/DateRange;
        //   129: invokespecial   gg/essential/gui/screenshot/components/ListViewComponent.getStartTime:(Lgg/essential/gui/screenshot/DateRange;)J
        //   132: lcmp           
        //   133: ifle            139
        //   136: goto            186
        //   139: lload           startTime
        //   141: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   144: astore          10
        //   146: aload_2         /* dateMap */
        //   147: checkcast       Ljava/util/Map;
        //   150: aload           10
        //   152: new             Lgg/essential/gui/screenshot/components/ScreenshotDateGroup;
        //   155: dup            
        //   156: aload           value
        //   158: lload           startTime
        //   160: invokespecial   gg/essential/gui/screenshot/components/ScreenshotDateGroup.<init>:(Lgg/essential/gui/screenshot/DateRange;J)V
        //   163: aload_0         /* this */
        //   164: invokevirtual   gg/essential/gui/screenshot/components/ListViewComponent.getScreenshotScrollComponent:()Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;
        //   167: checkcast       Lgg/essential/elementa/UIComponent;
        //   170: aload_0         /* this */
        //   171: invokespecial   gg/essential/gui/screenshot/components/ListViewComponent.getNavigation:()Lgg/essential/elementa/components/UIContainer;
        //   174: checkcast       Lgg/essential/elementa/UIComponent;
        //   177: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotDateGroup.setupParent:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/gui/screenshot/components/ScreenshotDateGroup;
        //   180: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   185: pop            
        //   186: iinc            4, 1
        //   189: goto            83
        //   192: aload_0         /* this */
        //   193: getfield        gg/essential/gui/screenshot/components/ListViewComponent.screenshotBrowser:Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //   196: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getProviderManager:()Lgg/essential/gui/screenshot/components/ScreenshotProviderManager;
        //   199: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotProviderManager.getAllPaths:()Ljava/util/List;
        //   202: checkcast       Ljava/lang/Iterable;
        //   205: astore          $this$mapNotNull$iv
        //   207: aload           $this$mapNotNull$iv
        //   209: astore          6
        //   211: new             Ljava/util/ArrayList;
        //   214: dup            
        //   215: invokespecial   java/util/ArrayList.<init>:()V
        //   218: checkcast       Ljava/util/Collection;
        //   221: astore          destination$iv$iv
        //   223: aload           $this$mapNotNullTo$iv$iv
        //   225: astore          $this$forEach$iv$iv$iv
        //   227: aload           $this$forEach$iv$iv$iv
        //   229: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   234: astore          11
        //   236: aload           11
        //   238: invokeinterface java/util/Iterator.hasNext:()Z
        //   243: ifeq            309
        //   246: aload           11
        //   248: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   253: astore          element$iv$iv$iv
        //   255: aload           element$iv$iv$iv
        //   257: astore          element$iv$iv
        //   259: aload           element$iv$iv
        //   261: checkcast       Ljava/nio/file/Path;
        //   264: astore          it
        //   266: aload_0         /* this */
        //   267: getfield        gg/essential/gui/screenshot/components/ListViewComponent.screenshotBrowser:Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //   270: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getProviderManager:()Lgg/essential/gui/screenshot/components/ScreenshotProviderManager;
        //   273: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotProviderManager.getPropertyMap:()Ljava/util/Map;
        //   276: aload           it
        //   278: invokeinterface java/util/Map.get:(Ljava/lang/Object;)Ljava/lang/Object;
        //   283: checkcast       Lgg/essential/gui/screenshot/components/ScreenshotProperties;
        //   286: dup            
        //   287: ifnull          305
        //   290: astore          it$iv$iv
        //   292: aload           destination$iv$iv
        //   294: aload           it$iv$iv
        //   296: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   301: pop            
        //   302: goto            236
        //   305: pop            
        //   306: goto            236
        //   309: aload           destination$iv$iv
        //   311: checkcast       Ljava/util/List;
        //   314: checkcast       Ljava/lang/Iterable;
        //   317: astore          $this$filter$iv
        //   319: aload           $this$filter$iv
        //   321: astore          6
        //   323: new             Ljava/util/ArrayList;
        //   326: dup            
        //   327: invokespecial   java/util/ArrayList.<init>:()V
        //   330: checkcast       Ljava/util/Collection;
        //   333: astore          destination$iv$iv
        //   335: aload           $this$filterTo$iv$iv
        //   337: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   342: astore          9
        //   344: aload           9
        //   346: invokeinterface java/util/Iterator.hasNext:()Z
        //   351: ifeq            399
        //   354: aload           9
        //   356: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   361: astore          element$iv$iv
        //   363: aload           element$iv$iv
        //   365: checkcast       Lgg/essential/gui/screenshot/components/ScreenshotProperties;
        //   368: astore          11
        //   370: aload           11
        //   372: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotProperties.component2:()Lgg/essential/handlers/screenshot/ClientScreenshotMetadata;
        //   375: astore          metadata
        //   377: aload_1         /* tab */
        //   378: aload           metadata
        //   380: invokestatic    gg/essential/gui/screenshot/components/ListViewComponent.doUpdate$filter:(Lgg/essential/gui/screenshot/components/ListViewComponent$Tab;Lgg/essential/handlers/screenshot/ClientScreenshotMetadata;)Z
        //   383: ifeq            344
        //   386: aload           destination$iv$iv
        //   388: aload           element$iv$iv
        //   390: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   395: pop            
        //   396: goto            344
        //   399: aload           destination$iv$iv
        //   401: checkcast       Ljava/util/List;
        //   404: checkcast       Ljava/lang/Iterable;
        //   407: astore          $this$filter$iv
        //   409: aload           $this$filter$iv
        //   411: astore          6
        //   413: new             Ljava/util/ArrayList;
        //   416: dup            
        //   417: invokespecial   java/util/ArrayList.<init>:()V
        //   420: checkcast       Ljava/util/Collection;
        //   423: astore          destination$iv$iv
        //   425: aload           $this$filterTo$iv$iv
        //   427: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   432: astore          9
        //   434: aload           9
        //   436: invokeinterface java/util/Iterator.hasNext:()Z
        //   441: ifeq            482
        //   444: aload           9
        //   446: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   451: astore          element$iv$iv
        //   453: aload           element$iv$iv
        //   455: checkcast       Lgg/essential/gui/screenshot/components/ScreenshotProperties;
        //   458: astore          it
        //   460: aload_0         /* this */
        //   461: aload           it
        //   463: invokespecial   gg/essential/gui/screenshot/components/ListViewComponent.propertiesMatchSearch:(Lgg/essential/gui/screenshot/components/ScreenshotProperties;)Z
        //   466: ifeq            434
        //   469: aload           destination$iv$iv
        //   471: aload           element$iv$iv
        //   473: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   478: pop            
        //   479: goto            434
        //   482: aload           destination$iv$iv
        //   484: checkcast       Ljava/util/List;
        //   487: checkcast       Ljava/lang/Iterable;
        //   490: astore          $this$map$iv
        //   492: aload           $this$map$iv
        //   494: astore          6
        //   496: new             Ljava/util/ArrayList;
        //   499: dup            
        //   500: aload           $this$map$iv
        //   502: bipush          10
        //   504: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //   507: invokespecial   java/util/ArrayList.<init>:(I)V
        //   510: checkcast       Ljava/util/Collection;
        //   513: astore          destination$iv$iv
        //   515: aload           $this$mapTo$iv$iv
        //   517: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   522: astore          9
        //   524: aload           9
        //   526: invokeinterface java/util/Iterator.hasNext:()Z
        //   531: ifeq            577
        //   534: aload           9
        //   536: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   541: astore          item$iv$iv
        //   543: aload           destination$iv$iv
        //   545: aload           item$iv$iv
        //   547: checkcast       Lgg/essential/gui/screenshot/components/ScreenshotProperties;
        //   550: astore          11
        //   552: astore          17
        //   554: aload           properties
        //   556: aload           properties
        //   558: iconst_1       
        //   559: invokestatic    gg/essential/util/HelpersKt.getImageTime:(Lgg/essential/gui/screenshot/components/ScreenshotProperties;Z)Lcom/sparkuniverse/toolbox/util/DateTime;
        //   562: invokestatic    kotlin/TuplesKt.to:(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;
        //   565: aload           17
        //   567: swap           
        //   568: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   573: pop            
        //   574: goto            524
        //   577: aload           destination$iv$iv
        //   579: checkcast       Ljava/util/List;
        //   582: checkcast       Ljava/lang/Iterable;
        //   585: astore          $this$sortedByDescending$iv
        //   587: aload           $this$sortedByDescending$iv
        //   589: new             Lgg/essential/gui/screenshot/components/ListViewComponent$doUpdate$$inlined$sortedByDescending$1;
        //   592: dup            
        //   593: invokespecial   gg/essential/gui/screenshot/components/ListViewComponent$doUpdate$$inlined$sortedByDescending$1.<init>:()V
        //   596: checkcast       Ljava/util/Comparator;
        //   599: invokestatic    kotlin/collections/CollectionsKt.sortedWith:(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;
        //   602: astore_3        /* items */
        //   603: new             Ljava/util/HashMap;
        //   606: dup            
        //   607: invokespecial   java/util/HashMap.<init>:()V
        //   610: astore          otherMonthMap
        //   612: aload_3         /* items */
        //   613: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   618: astore          5
        //   620: iconst_0       
        //   621: istore          6
        //   623: aload           5
        //   625: invokeinterface java/util/Iterator.hasNext:()Z
        //   630: ifeq            800
        //   633: iload           6
        //   635: istore          index
        //   637: iload           6
        //   639: iconst_1       
        //   640: iadd           
        //   641: istore          6
        //   643: aload           5
        //   645: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   650: checkcast       Lkotlin/Pair;
        //   653: astore          propertyTime
        //   655: aload           propertyTime
        //   657: invokevirtual   kotlin/Pair.component1:()Ljava/lang/Object;
        //   660: checkcast       Lgg/essential/gui/screenshot/components/ScreenshotProperties;
        //   663: astore          property
        //   665: aload           propertyTime
        //   667: invokevirtual   kotlin/Pair.component2:()Ljava/lang/Object;
        //   670: checkcast       Lcom/sparkuniverse/toolbox/util/DateTime;
        //   673: astore          imageTime
        //   675: new             Lgg/essential/gui/screenshot/components/ScreenshotPreview;
        //   678: dup            
        //   679: aload           property
        //   681: aload_0         /* this */
        //   682: iload           index
        //   684: aload_0         /* this */
        //   685: getfield        gg/essential/gui/screenshot/components/ListViewComponent.numberOfItemsPerRow:Lgg/essential/elementa/state/BasicState;
        //   688: checkcast       Lgg/essential/elementa/state/State;
        //   691: invokespecial   gg/essential/gui/screenshot/components/ScreenshotPreview.<init>:(Lgg/essential/gui/screenshot/components/ScreenshotProperties;Lgg/essential/gui/screenshot/components/ListViewComponent;ILgg/essential/elementa/state/State;)V
        //   694: astore          preview
        //   696: aload_0         /* this */
        //   697: getfield        gg/essential/gui/screenshot/components/ListViewComponent.imageMap:Ljava/util/Map;
        //   700: aload           property
        //   702: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotProperties.getPath:()Ljava/nio/file/Path;
        //   705: aload           preview
        //   707: invokeinterface java/util/Map.put:(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
        //   712: pop            
        //   713: aload_2         /* dateMap */
        //   714: aload           imageTime
        //   716: invokevirtual   com/sparkuniverse/toolbox/util/DateTime.getTime:()J
        //   719: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   722: invokevirtual   java/util/TreeMap.floorEntry:(Ljava/lang/Object;)Ljava/util/Map$Entry;
        //   725: astore          entry
        //   727: aload           entry
        //   729: ifnull          745
        //   732: aload           entry
        //   734: invokeinterface java/util/Map$Entry.getValue:()Ljava/lang/Object;
        //   739: checkcast       Lgg/essential/gui/screenshot/components/ScreenshotDateGroup;
        //   742: goto            788
        //   745: aload_0         /* this */
        //   746: aload           imageTime
        //   748: invokevirtual   com/sparkuniverse/toolbox/util/DateTime.getTime:()J
        //   751: invokespecial   gg/essential/gui/screenshot/components/ListViewComponent.setCalendar:(J)Ljava/util/Calendar;
        //   754: astore          date
        //   756: aload           date
        //   758: iconst_5       
        //   759: iconst_1       
        //   760: invokevirtual   java/util/Calendar.set:(II)V
        //   763: aload           otherMonthMap
        //   765: aload           date
        //   767: invokevirtual   java/util/Calendar.getTime:()Ljava/util/Date;
        //   770: invokevirtual   java/util/Date.getTime:()J
        //   773: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   776: aload_0         /* this */
        //   777: invokedynamic   BootstrapMethod #0, apply:(Lgg/essential/gui/screenshot/components/ListViewComponent;)Ljava/util/function/Function;
        //   782: invokevirtual   java/util/HashMap.computeIfAbsent:(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
        //   785: checkcast       Lgg/essential/gui/screenshot/components/ScreenshotDateGroup;
        //   788: astore          group
        //   790: aload           group
        //   792: aload           preview
        //   794: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotDateGroup.addScreenshot:(Lgg/essential/gui/screenshot/components/ScreenshotPreview;)V
        //   797: goto            623
        //   800: aload_0         /* this */
        //   801: invokevirtual   gg/essential/gui/screenshot/components/ListViewComponent.getScreenshotScrollComponent:()Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;
        //   804: checkcast       Lgg/essential/elementa/UIComponent;
        //   807: astore          this_$iv
        //   809: aload           this_$iv
        //   811: ldc_w           Lgg/essential/gui/screenshot/components/ScreenshotDateGroup;.class
        //   814: invokevirtual   gg/essential/elementa/UIComponent.childrenOfType:(Ljava/lang/Class;)Ljava/util/List;
        //   817: checkcast       Ljava/lang/Iterable;
        //   820: astore          $this$filter$iv
        //   822: aload           $this$filter$iv
        //   824: astore          7
        //   826: new             Ljava/util/ArrayList;
        //   829: dup            
        //   830: invokespecial   java/util/ArrayList.<init>:()V
        //   833: checkcast       Ljava/util/Collection;
        //   836: astore          destination$iv$iv
        //   838: aload           $this$filterTo$iv$iv
        //   840: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   845: astore          10
        //   847: aload           10
        //   849: invokeinterface java/util/Iterator.hasNext:()Z
        //   854: ifeq            902
        //   857: aload           10
        //   859: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   864: astore          element$iv$iv
        //   866: aload           element$iv$iv
        //   868: checkcast       Lgg/essential/gui/screenshot/components/ScreenshotDateGroup;
        //   871: astore          it
        //   873: aload           it
        //   875: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotDateGroup.isVisible:()Z
        //   878: ifne            885
        //   881: iconst_1       
        //   882: goto            886
        //   885: iconst_0       
        //   886: ifeq            847
        //   889: aload           destination$iv$iv
        //   891: aload           element$iv$iv
        //   893: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   898: pop            
        //   899: goto            847
        //   902: aload           destination$iv$iv
        //   904: checkcast       Ljava/util/List;
        //   907: checkcast       Ljava/lang/Iterable;
        //   910: astore          $this$forEach$iv
        //   912: aload           $this$forEach$iv
        //   914: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   919: astore          7
        //   921: aload           7
        //   923: invokeinterface java/util/Iterator.hasNext:()Z
        //   928: ifeq            968
        //   931: aload           7
        //   933: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   938: astore          element$iv
        //   940: aload           element$iv
        //   942: checkcast       Lgg/essential/gui/screenshot/components/ScreenshotDateGroup;
        //   945: astore          it
        //   947: aload           it
        //   949: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotDateGroup.cleanup:()V
        //   952: aload_0         /* this */
        //   953: invokevirtual   gg/essential/gui/screenshot/components/ListViewComponent.getScreenshotScrollComponent:()Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;
        //   956: aload           it
        //   958: checkcast       Lgg/essential/elementa/UIComponent;
        //   961: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotScrollComponent.removeChild:(Lgg/essential/elementa/UIComponent;)Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;
        //   964: pop            
        //   965: goto            921
        //   968: aload_0         /* this */
        //   969: invokevirtual   gg/essential/gui/screenshot/components/ListViewComponent.getScreenshotScrollComponent:()Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;
        //   972: iconst_2       
        //   973: anewarray       Lkotlin/jvm/functions/Function1;
        //   976: astore          5
        //   978: aload           5
        //   980: iconst_0       
        //   981: getstatic       gg/essential/gui/screenshot/components/ListViewComponent$doUpdate$3.INSTANCE:Lgg/essential/gui/screenshot/components/ListViewComponent$doUpdate$3;
        //   984: checkcast       Lkotlin/jvm/functions/Function1;
        //   987: aastore        
        //   988: aload           5
        //   990: iconst_1       
        //   991: getstatic       gg/essential/gui/screenshot/components/ListViewComponent$doUpdate$4.INSTANCE:Lgg/essential/gui/screenshot/components/ListViewComponent$doUpdate$4;
        //   994: checkcast       Lkotlin/jvm/functions/Function1;
        //   997: aastore        
        //   998: aload           5
        //  1000: invokestatic    kotlin/comparisons/ComparisonsKt.compareBy:([Lkotlin/jvm/functions/Function1;)Ljava/util/Comparator;
        //  1003: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotScrollComponent.sortChildren:(Ljava/util/Comparator;)V
        //  1006: aload_0         /* this */
        //  1007: aload_0         /* this */
        //  1008: getfield        gg/essential/gui/screenshot/components/ListViewComponent.screenshotBrowser:Lgg/essential/gui/screenshot/components/ScreenshotBrowser;
        //  1011: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotBrowser.getProviderManager:()Lgg/essential/gui/screenshot/components/ScreenshotProviderManager;
        //  1014: aload_3         /* items */
        //  1015: checkcast       Ljava/lang/Iterable;
        //  1018: astore          5
        //  1020: astore          18
        //  1022: astore          17
        //  1024: aload           $this$map$iv
        //  1026: astore          7
        //  1028: new             Ljava/util/ArrayList;
        //  1031: dup            
        //  1032: aload           $this$map$iv
        //  1034: bipush          10
        //  1036: invokestatic    kotlin/collections/CollectionsKt.collectionSizeOrDefault:(Ljava/lang/Iterable;I)I
        //  1039: invokespecial   java/util/ArrayList.<init>:(I)V
        //  1042: checkcast       Ljava/util/Collection;
        //  1045: astore          destination$iv$iv
        //  1047: aload           $this$mapTo$iv$iv
        //  1049: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //  1054: astore          10
        //  1056: aload           10
        //  1058: invokeinterface java/util/Iterator.hasNext:()Z
        //  1063: ifeq            1113
        //  1066: aload           10
        //  1068: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //  1073: astore          item$iv$iv
        //  1075: aload           destination$iv$iv
        //  1077: aload           item$iv$iv
        //  1079: checkcast       Lkotlin/Pair;
        //  1082: astore          12
        //  1084: astore          19
        //  1086: aload           12
        //  1088: invokevirtual   kotlin/Pair.component1:()Ljava/lang/Object;
        //  1091: checkcast       Lgg/essential/gui/screenshot/components/ScreenshotProperties;
        //  1094: astore          properties
        //  1096: aload           properties
        //  1098: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotProperties.getPath:()Ljava/nio/file/Path;
        //  1101: aload           19
        //  1103: swap           
        //  1104: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //  1109: pop            
        //  1110: goto            1056
        //  1113: aload           destination$iv$iv
        //  1115: checkcast       Ljava/util/List;
        //  1118: astore          19
        //  1120: aload           17
        //  1122: aload           18
        //  1124: aload           19
        //  1126: invokevirtual   gg/essential/gui/screenshot/components/ScreenshotProviderManager.updateItems:(Ljava/util/List;)Ljava/util/Map;
        //  1129: invokespecial   gg/essential/gui/screenshot/components/ListViewComponent.updateTexturesFromProvider:(Ljava/util/Map;)V
        //  1132: return         
        //    MethodParameters:
        //  Name  Flags  
        //  ----  -----
        //  tab   
        //    StackMapTable: 00 1C FD 00 15 07 02 77 07 00 CE 19 FF 00 23 00 06 07 00 02 07 00 63 07 02 A7 07 02 AF 01 01 00 00 FC 00 17 07 02 AA FC 00 1F 04 FA 00 2E FA 00 05 FF 00 2B 00 0C 07 00 02 07 00 63 07 02 A7 07 02 AF 07 02 6B 01 07 02 6B 07 02 6D 00 07 02 6B 00 07 02 77 00 00 FF 00 44 00 10 07 00 02 07 00 63 07 02 A7 07 02 AF 07 02 6B 01 07 02 6B 07 02 6D 00 07 02 6B 00 07 02 77 07 01 A0 07 01 A0 00 07 02 1A 00 01 07 02 14 FF 00 03 00 0C 07 00 02 07 00 63 07 02 A7 07 02 AF 07 02 6B 01 07 02 6B 07 02 6D 00 07 02 6B 00 07 02 77 00 00 FF 00 22 00 0C 07 00 02 07 00 63 07 02 A7 07 02 AF 07 02 6B 01 07 02 6B 07 02 6D 00 07 02 77 00 07 01 A0 00 00 36 22 2F 29 34 FF 00 2D 00 0C 07 00 02 07 00 63 07 02 A7 07 02 3F 07 02 FF 07 02 77 01 00 00 07 01 A0 00 07 01 A0 00 00 FF 00 79 00 0D 07 00 02 07 00 63 07 02 A7 07 02 3F 07 02 FF 07 02 77 01 01 07 01 FD 07 02 14 07 03 07 07 03 09 07 03 16 00 00 6A 07 02 97 FF 00 0B 00 0C 07 00 02 07 00 63 07 02 A7 07 02 3F 07 02 FF 07 02 77 01 00 00 07 01 A0 00 07 01 A0 00 00 FF 00 2E 00 0C 07 00 02 07 00 63 07 02 A7 07 02 3F 07 02 FF 07 02 6B 01 07 02 6B 07 02 6D 07 01 A0 07 02 77 07 01 A0 00 00 FC 00 25 07 02 97 40 01 FA 00 0F FF 00 12 00 0C 07 00 02 07 00 63 07 02 A7 07 02 3F 07 02 FF 07 02 6B 01 07 02 77 07 01 A0 07 01 A0 07 02 77 07 01 A0 00 00 2E FF 00 57 00 13 07 00 02 07 00 63 07 02 A7 07 02 3F 07 02 FF 07 02 6B 01 07 02 6B 07 02 6D 07 01 A0 07 02 77 07 01 A0 00 00 00 00 00 07 00 02 07 01 DF 00 00 38
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private final long getStartTime(final DateRange range) {
        final Calendar date = setCalendar$default$23767ce$1f41d816(this);
        switch (WhenMappings.$EnumSwitchMapping$1[range.ordinal()]) {
            case 2: {
                date.roll(5, -1);
                break;
            }
            case 3: {
                date.set(7, 1);
                break;
            }
            case 4: {
                date.set(7, 1);
                date.roll(3, -1);
                break;
            }
            case 5: {
                date.set(5, 1);
                break;
            }
            case 6: {
                date.set(5, 1);
                date.roll(2, -1);
                break;
            }
            case 7: {
                throw new IllegalArgumentException("MONTH_OTHER is not a valid start time");
            }
        }
        return date.getTime().getTime();
    }
    
    private final void updateTexturesFromProvider(final Map<Path, ? extends Identifier> providedTextures) {
        for (final Map.Entry entry : this.imageMap.entrySet()) {
            entry.getValue().updateTexture((Identifier)providedTextures.get(entry.getKey()));
        }
    }
    
    private final Calendar setCalendar(final long time) {
        final Calendar date = new GregorianCalendar();
        date.setTimeInMillis(time);
        date.set(11, 0);
        date.set(12, 0);
        date.set(13, 0);
        date.set(14, 0);
        return date;
    }
    
    static /* synthetic */ Calendar setCalendar$default$23767ce$1f41d816(final ListViewComponent listViewComponent) {
        return listViewComponent.setCalendar(System.currentTimeMillis());
    }
    
    public final void handleRightClick(@NotNull final ScreenshotPreview screenshotPreview, @NotNull final UIClickEvent it) {
        Intrinsics.checkNotNullParameter((Object)screenshotPreview, "screenshotPreview");
        Intrinsics.checkNotNullParameter((Object)it, "it");
        ScreenshotOptionsDropdown.handleRightClick$default$58d8c182$2a411322(this.screenshotBrowser.getOptionsDropdown(), screenshotPreview.getProperties(), it);
    }
    
    public final void focus(@NotNull final ScreenshotProperties properties) {
        Intrinsics.checkNotNullParameter((Object)properties, "properties");
        USound.playButtonPress$default(USound.INSTANCE, 0.0f, 1, null);
        this.screenshotBrowser.openFocusView(properties);
    }
    
    private static final boolean doUpdate$filter(final Tab $tab, final ClientScreenshotMetadata metadata) {
        boolean b = false;
        switch (WhenMappings.$EnumSwitchMapping$0[$tab.ordinal()]) {
            case 1: {
                b = true;
                break;
            }
            case 2: {
                ClientScreenshotMetadata$Location$Type type = null;
                Label_0064: {
                    if (metadata != null) {
                        final ClientScreenshotMetadata.Location locationMetadata = metadata.getLocationMetadata();
                        if (locationMetadata != null) {
                            type = locationMetadata.getType();
                            break Label_0064;
                        }
                    }
                    type = null;
                }
                if (type != ClientScreenshotMetadata$Location$Type.SHARED_WORLD) {
                    ClientScreenshotMetadata$Location$Type type2 = null;
                    Label_0090: {
                        if (metadata != null) {
                            final ClientScreenshotMetadata.Location locationMetadata2 = metadata.getLocationMetadata();
                            if (locationMetadata2 != null) {
                                type2 = locationMetadata2.getType();
                                break Label_0090;
                            }
                        }
                        type2 = null;
                    }
                    if (type2 != ClientScreenshotMetadata$Location$Type.SINGLE_PLAYER) {
                        b = false;
                        break;
                    }
                }
                b = true;
                break;
            }
            case 3: {
                ClientScreenshotMetadata$Location$Type type3 = null;
                Label_0124: {
                    if (metadata != null) {
                        final ClientScreenshotMetadata.Location locationMetadata3 = metadata.getLocationMetadata();
                        if (locationMetadata3 != null) {
                            type3 = locationMetadata3.getType();
                            break Label_0124;
                        }
                    }
                    type3 = null;
                }
                b = (type3 == ClientScreenshotMetadata$Location$Type.MULTIPLAYER);
                break;
            }
            case 4: {
                b = (metadata != null && metadata.getFavorite());
                break;
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return b;
    }
    
    private static final ScreenshotDateGroup doUpdate$lambda-16(final ListViewComponent this$0, final Long time) {
        Intrinsics.checkNotNullParameter((Object)this$0, "this$0");
        Intrinsics.checkNotNullParameter((Object)time, "time");
        return new ScreenshotDateGroup(DateRange.MONTH_OTHER, time).setupParent(this$0.getScreenshotScrollComponent(), this$0.getNavigation());
    }
    
    public static final /* synthetic */ void access$doUpdate(final ListViewComponent $this, final Tab tab) {
        $this.doUpdate(tab);
    }
    
    public static final /* synthetic */ BasicState access$getSelectedTab$p(final ListViewComponent $this) {
        return $this.selectedTab;
    }
    
    static {
        $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ListViewComponent.class, "screenshotsFolder", "getScreenshotsFolder()Lgg/essential/elementa/UIComponent;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ListViewComponent.class, "searchBar", "getSearchBar()Lgg/essential/gui/common/EssentialCollapsibleSearchbar;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ListViewComponent.class, "navigation", "getNavigation()Lgg/essential/elementa/components/UIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ListViewComponent.class, "screenshotScissorBox", "getScreenshotScissorBox()Lgg/essential/gui/common/HollowUIContainer;", 0)), (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)ListViewComponent.class, "screenshotScrollComponent", "getScreenshotScrollComponent()Lgg/essential/gui/screenshot/components/ScreenshotScrollComponent;", 0)) };
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u00004
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u000b
                                                       \u0002\b\u0003
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0002\u0018\u0002
                                                       \u0000
                                                       \u0002\u0018\u0002
                                                       \u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002
                                                       \u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\b\u0010	R&\u0010
                                                       \u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\f\u0012\u0004\u0012\u00020\r0\u000bX\u0082\u0004¢\u0006\u0002
                                                       \u0000R\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002¢\u0006\f
                                                       \u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014""" }, d2 = { "Lgg/essential/gui/screenshot/components/ListViewComponent$TabComponent;", "Lgg/essential/elementa/components/UIContainer;", "tab", "Lgg/essential/gui/screenshot/components/ListViewComponent$Tab;", "(Lgg/essential/gui/screenshot/components/ListViewComponent;Lgg/essential/gui/screenshot/components/ListViewComponent$Tab;)V", "hovered", "Lgg/essential/elementa/state/State;", "", "getTab", "()Lgg/essential/gui/screenshot/components/ListViewComponent$Tab;", "textColorState", "Lgg/essential/elementa/state/MappedState;", "Lkotlin/Pair;", "Ljava/awt/Color;", "title", "Lgg/essential/elementa/UIComponent;", "getTitle", "()Lgg/essential/elementa/UIComponent;", "title$delegate", "Lkotlin/properties/ReadWriteProperty;", "essential" })
    private final class TabComponent extends UIContainer
    {
        static final /* synthetic */ KProperty<Object>[] $$delegatedProperties;
        @NotNull
        private final Tab tab;
        @NotNull
        private final State<Boolean> hovered;
        @NotNull
        private final MappedState<Pair<Tab, Boolean>, Color> textColorState;
        final /* synthetic */ ListViewComponent this$0;
        
        public TabComponent(@NotNull final ListViewComponent this$0, final Tab tab) {
            // 
            // This method could not be decompiled.
            // 
            // Original Bytecode:
            // 
            //     1: ldc             "tab"
            //     3: invokestatic    kotlin/jvm/internal/Intrinsics.checkNotNullParameter:(Ljava/lang/Object;Ljava/lang/String;)V
            //     6: aload_0         /* this */
            //     7: aload_1         /* this$0 */
            //     8: putfield        gg/essential/gui/screenshot/components/ListViewComponent$TabComponent.this$0:Lgg/essential/gui/screenshot/components/ListViewComponent;
            //    11: aload_0         /* this */
            //    12: invokespecial   gg/essential/elementa/components/UIContainer.<init>:()V
            //    15: aload_0         /* this */
            //    16: aload_2         /* tab */
            //    17: putfield        gg/essential/gui/screenshot/components/ListViewComponent$TabComponent.tab:Lgg/essential/gui/screenshot/components/ListViewComponent$Tab;
            //    20: aload_0         /* this */
            //    21: aload_0         /* this */
            //    22: checkcast       Lgg/essential/elementa/UIComponent;
            //    25: iconst_0       
            //    26: iconst_0       
            //    27: iconst_3       
            //    28: invokestatic    gg/essential/util/ExtensionsKt.hoveredState$default$56721d26:(Lgg/essential/elementa/UIComponent;ZZI)Lgg/essential/elementa/state/State;
            //    31: putfield        gg/essential/gui/screenshot/components/ListViewComponent$TabComponent.hovered:Lgg/essential/elementa/state/State;
            //    34: aload_0         /* this */
            //    35: aload_0         /* this */
            //    36: getfield        gg/essential/gui/screenshot/components/ListViewComponent$TabComponent.this$0:Lgg/essential/gui/screenshot/components/ListViewComponent;
            //    39: invokestatic    gg/essential/gui/screenshot/components/ListViewComponent.access$getSelectedTab$p:(Lgg/essential/gui/screenshot/components/ListViewComponent;)Lgg/essential/elementa/state/BasicState;
            //    42: aload_0         /* this */
            //    43: getfield        gg/essential/gui/screenshot/components/ListViewComponent$TabComponent.hovered:Lgg/essential/elementa/state/State;
            //    46: invokevirtual   gg/essential/elementa/state/BasicState.zip:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/state/State;
            //    49: new             Lgg/essential/gui/screenshot/components/ListViewComponent$TabComponent$textColorState$1;
            //    52: dup            
            //    53: aload_0         /* this */
            //    54: invokespecial   gg/essential/gui/screenshot/components/ListViewComponent$TabComponent$textColorState$1.<init>:(Lgg/essential/gui/screenshot/components/ListViewComponent$TabComponent;)V
            //    57: checkcast       Lkotlin/jvm/functions/Function1;
            //    60: invokevirtual   gg/essential/elementa/state/State.map:(Lkotlin/jvm/functions/Function1;)Lgg/essential/elementa/state/MappedState;
            //    63: putfield        gg/essential/gui/screenshot/components/ListViewComponent$TabComponent.textColorState:Lgg/essential/elementa/state/MappedState;
            //    66: new             Lgg/essential/gui/common/shadow/EssentialUIText;
            //    69: dup            
            //    70: aload_0         /* this */
            //    71: getfield        gg/essential/gui/screenshot/components/ListViewComponent$TabComponent.tab:Lgg/essential/gui/screenshot/components/ListViewComponent$Tab;
            //    74: invokevirtual   gg/essential/gui/screenshot/components/ListViewComponent$Tab.getNiceName:()Ljava/lang/String;
            //    77: iconst_0       
            //    78: aconst_null    
            //    79: iconst_0       
            //    80: iconst_0       
            //    81: iconst_0       
            //    82: bipush          62
            //    84: invokespecial   gg/essential/gui/common/shadow/EssentialUIText.<init>:(Ljava/lang/String;ZLjava/awt/Color;ZZZI)V
            //    87: aload_0         /* this */
            //    88: getfield        gg/essential/gui/screenshot/components/ListViewComponent$TabComponent.textColorState:Lgg/essential/elementa/state/MappedState;
            //    91: checkcast       Lgg/essential/elementa/state/State;
            //    94: invokestatic    gg/essential/elementa/state/ExtensionsKt.toConstraint:(Lgg/essential/elementa/state/State;)Lgg/essential/elementa/constraints/ConstantColorConstraint;
            //    97: checkcast       Lgg/essential/elementa/constraints/ColorConstraint;
            //   100: invokevirtual   gg/essential/gui/common/shadow/EssentialUIText.setColor:(Lgg/essential/elementa/constraints/ColorConstraint;)Lgg/essential/elementa/UIComponent;
            //   103: aload_0         /* this */
            //   104: checkcast       Lgg/essential/elementa/UIComponent;
            //   107: invokestatic    gg/essential/elementa/dsl/ComponentsKt.childOf:(Lgg/essential/elementa/UIComponent;Lgg/essential/elementa/UIComponent;)Lgg/essential/elementa/UIComponent;
            //   110: aload_0         /* this */
            //   111: getstatic       gg/essential/gui/screenshot/components/ListViewComponent$TabComponent.$$delegatedProperties:[Lkotlin/reflect/KProperty;
            //   114: iconst_0       
            //   115: aaload         
            //   116: invokestatic    gg/essential/elementa/dsl/ComponentsKt.provideDelegate:(Lgg/essential/elementa/UIComponent;Ljava/lang/Object;Lkotlin/reflect/KProperty;)Lkotlin/properties/ReadWriteProperty;
            //   119: pop            
            //   120: aload_0         /* this */
            //   121: checkcast       Lgg/essential/elementa/UIComponent;
            //   124: astore_3        /* $this$constrain$iv */
            //   125: aload_3         /* $this$constrain$iv */
            //   126: astore          5
            //   128: aload           5
            //   130: astore          $this$constrain_u24lambda_u2d0$iv
            //   132: aload           $this$constrain_u24lambda_u2d0$iv
            //   134: invokevirtual   gg/essential/elementa/UIComponent.getConstraints:()Lgg/essential/elementa/UIConstraints;
            //   137: astore          $this$_init__u24lambda_u2d0
            //   139: aload           $this$_init__u24lambda_u2d0
            //   141: new             Lgg/essential/elementa/constraints/SiblingConstraint;
            //   144: dup            
            //   145: ldc             12.0
            //   147: iconst_0       
            //   148: iconst_2       
            //   149: aconst_null    
            //   150: invokespecial   gg/essential/elementa/constraints/SiblingConstraint.<init>:(FZILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //   153: checkcast       Lgg/essential/elementa/constraints/XConstraint;
            //   156: invokevirtual   gg/essential/elementa/UIConstraints.setX:(Lgg/essential/elementa/constraints/XConstraint;)V
            //   159: aload           $this$_init__u24lambda_u2d0
            //   161: new             Lgg/essential/elementa/constraints/CenterConstraint;
            //   164: dup            
            //   165: invokespecial   gg/essential/elementa/constraints/CenterConstraint.<init>:()V
            //   168: checkcast       Lgg/essential/elementa/constraints/YConstraint;
            //   171: invokevirtual   gg/essential/elementa/UIConstraints.setY:(Lgg/essential/elementa/constraints/YConstraint;)V
            //   174: aload           $this$_init__u24lambda_u2d0
            //   176: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
            //   179: dup            
            //   180: fconst_0       
            //   181: iconst_1       
            //   182: aconst_null    
            //   183: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //   186: checkcast       Lgg/essential/elementa/constraints/WidthConstraint;
            //   189: invokevirtual   gg/essential/elementa/UIConstraints.setWidth:(Lgg/essential/elementa/constraints/WidthConstraint;)V
            //   192: aload           $this$_init__u24lambda_u2d0
            //   194: new             Lgg/essential/elementa/constraints/ChildBasedSizeConstraint;
            //   197: dup            
            //   198: fconst_0       
            //   199: iconst_1       
            //   200: aconst_null    
            //   201: invokespecial   gg/essential/elementa/constraints/ChildBasedSizeConstraint.<init>:(FILkotlin/jvm/internal/DefaultConstructorMarker;)V
            //   204: checkcast       Lgg/essential/elementa/constraints/HeightConstraint;
            //   207: invokevirtual   gg/essential/elementa/UIConstraints.setHeight:(Lgg/essential/elementa/constraints/HeightConstraint;)V
            //   210: aload_0         /* this */
            //   211: checkcast       Lgg/essential/elementa/UIComponent;
            //   214: astore_3       
            //   215: aload_0         /* this */
            //   216: getfield        gg/essential/gui/screenshot/components/ListViewComponent$TabComponent.this$0:Lgg/essential/gui/screenshot/components/ListViewComponent;
            //   219: astore          4
            //   221: aload_3         /* $this$onLeftClick$iv */
            //   222: new             Lgg/essential/gui/screenshot/components/ListViewComponent$TabComponent$special$$inlined$onLeftClick$1;
            //   225: dup            
            //   226: aload           4
            //   228: aload_0         /* this */
            //   229: invokespecial   gg/essential/gui/screenshot/components/ListViewComponent$TabComponent$special$$inlined$onLeftClick$1.<init>:(Lgg/essential/gui/screenshot/components/ListViewComponent;Lgg/essential/gui/screenshot/components/ListViewComponent$TabComponent;)V
            //   232: checkcast       Lkotlin/jvm/functions/Function2;
            //   235: invokevirtual   gg/essential/elementa/UIComponent.onMouseClick:(Lkotlin/jvm/functions/Function2;)Lgg/essential/elementa/UIComponent;
            //   238: pop            
            //   239: return         
            //    Signature:
            //  (Lgg/essential/gui/screenshot/components/ListViewComponent;Lgg/essential/gui/screenshot/components/ListViewComponent$Tab;)V [from metadata: (Lgg/essential/gui/screenshot/components/ListViewComponent$Tab;)V]
            //  
            //    MethodParameters:
            //  Name    Flags  
            //  ------  -----
            //  this$0  
            //  tab     
            // 
            throw new IllegalStateException("An error occurred while decompiling this method.");
        }
        
        @NotNull
        public final Tab getTab() {
            return this.tab;
        }
        
        static {
            $$delegatedProperties = new KProperty[] { (KProperty)Reflection.property1((PropertyReference1)new PropertyReference1Impl((Class)TabComponent.class, "title", "getTitle()Lgg/essential/elementa/UIComponent;", 0)) };
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 1, xi = 48, d1 = { """
                                                       \u0000\u0012
                                                       \u0002\u0018\u0002
                                                       \u0002\u0010\u0010
                                                       \u0000
                                                       \u0002\u0010\u000e
                                                       \u0002\b\b\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b
                                                       \u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b	j\u0002\b
                                                       ¨\u0006\u000b""" }, d2 = { "Lgg/essential/gui/screenshot/components/ListViewComponent$Tab;", "", "niceName", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getNiceName", "()Ljava/lang/String;", "ALL", "WORLDS", "SERVERS", "LIKED", "essential" })
    private enum Tab
    {
        @NotNull
        private final String niceName;
        
        ALL("ALL", 0, "All"), 
        WORLDS("WORLDS", 1, "Singleplayer"), 
        SERVERS("SERVERS", 2, "Multiplayer"), 
        LIKED("LIKED", 3, "Favorites");
        
        private static final /* synthetic */ Tab[] $VALUES;
        
        private Tab(final String $enum$name, final int $enum$ordinal, final String niceName) {
            this.niceName = niceName;
        }
        
        @NotNull
        public final String getNiceName() {
            return this.niceName;
        }
        
        public static Tab[] values() {
            return Tab.$VALUES.clone();
        }
        
        public static Tab valueOf(final String value) {
            return Enum.valueOf(Tab.class, value);
        }
        
        private static final /* synthetic */ Tab[] $values() {
            return new Tab[] { Tab.ALL, Tab.WORLDS, Tab.SERVERS, Tab.LIKED };
        }
        
        static {
            $VALUES = $values();
        }
    }
    
    @Metadata(mv = { 1, 6, 0 }, k = 3, xi = 48)
    public final synthetic class WhenMappings
    {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        
        static {
            final int[] $EnumSwitchMapping$2 = new int[Tab.values().length];
            $EnumSwitchMapping$2[Tab.ALL.ordinal()] = 1;
            $EnumSwitchMapping$2[Tab.WORLDS.ordinal()] = 2;
            $EnumSwitchMapping$2[Tab.SERVERS.ordinal()] = 3;
            $EnumSwitchMapping$2[Tab.LIKED.ordinal()] = 4;
            $EnumSwitchMapping$0 = $EnumSwitchMapping$2;
            final int[] $EnumSwitchMapping$3 = new int[DateRange.values().length];
            $EnumSwitchMapping$3[DateRange.TODAY.ordinal()] = 1;
            $EnumSwitchMapping$3[DateRange.YESTERDAY.ordinal()] = 2;
            $EnumSwitchMapping$3[DateRange.EARLIER_WEEK.ordinal()] = 3;
            $EnumSwitchMapping$3[DateRange.LAST_WEEK.ordinal()] = 4;
            $EnumSwitchMapping$3[DateRange.EARLIER_MONTH.ordinal()] = 5;
            $EnumSwitchMapping$3[DateRange.LAST_MONTH.ordinal()] = 6;
            $EnumSwitchMapping$3[DateRange.MONTH_OTHER.ordinal()] = 7;
            $EnumSwitchMapping$1 = $EnumSwitchMapping$3;
        }
    }
}
